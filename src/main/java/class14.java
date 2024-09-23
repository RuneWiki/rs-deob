import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("FJSXIAWX")
public class class14 extends class9 implements Runnable {

    @OriginalMember(owner = "FJSXIAWX", name = "h", descriptor = "LZWZXPJNQ;")
    private class72 field750 = new class72(708);

    @OriginalMember(owner = "FJSXIAWX", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field752 = new CRC32();

    @OriginalMember(owner = "FJSXIAWX", name = "n", descriptor = "LZLISRGEK;")
    private class71 field756 = new class71(8);

    @OriginalMember(owner = "FJSXIAWX", name = "q", descriptor = "Z")
    private boolean field759 = true;

    @OriginalMember(owner = "FJSXIAWX", name = "s", descriptor = "LZWZXPJNQ;")
    private class72 field761 = new class72(708);

    @OriginalMember(owner = "FJSXIAWX", name = "t", descriptor = "[B")
    private byte[] field762 = new byte[65000];

    @OriginalMember(owner = "FJSXIAWX", name = "u", descriptor = "LZWZXPJNQ;")
    private class72 field763 = new class72(708);

    @OriginalMember(owner = "FJSXIAWX", name = "x", descriptor = "[B")
    private byte[] field766 = new byte[500];

    @OriginalMember(owner = "FJSXIAWX", name = "z", descriptor = "[[B")
    private byte[][] field768 = new byte[4][];

    @OriginalMember(owner = "FJSXIAWX", name = "B", descriptor = "Ljava/lang/String;")
    public String field770 = "";

    @OriginalMember(owner = "FJSXIAWX", name = "C", descriptor = "Z")
    private boolean field771 = false;

    @OriginalMember(owner = "FJSXIAWX", name = "E", descriptor = "I")
    private int field773 = 5;

    @OriginalMember(owner = "FJSXIAWX", name = "F", descriptor = "I")
    private int field774 = 7;

    @OriginalMember(owner = "FJSXIAWX", name = "H", descriptor = "[[I")
    private int[][] field776 = new int[4][];

    @OriginalMember(owner = "FJSXIAWX", name = "J", descriptor = "Z")
    private boolean field778 = false;

    @OriginalMember(owner = "FJSXIAWX", name = "K", descriptor = "[[I")
    private int[][] field779 = new int[4][];

    @OriginalMember(owner = "FJSXIAWX", name = "L", descriptor = "Z")
    private boolean field780 = false;

    @OriginalMember(owner = "FJSXIAWX", name = "R", descriptor = "LZWZXPJNQ;")
    private class72 field786 = new class72(708);

    @OriginalMember(owner = "FJSXIAWX", name = "T", descriptor = "LZWZXPJNQ;")
    private class72 field788 = new class72(708);

    @OriginalMember(owner = "FJSXIAWX", name = "d", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "FJSXIAWX", name = "e", descriptor = "I")
    private int field747;

    @OriginalMember(owner = "FJSXIAWX", name = "f", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "FJSXIAWX", name = "i", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "FJSXIAWX", name = "l", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "FJSXIAWX", name = "m", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "FJSXIAWX", name = "p", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "FJSXIAWX", name = "v", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "FJSXIAWX", name = "w", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "FJSXIAWX", name = "D", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "FJSXIAWX", name = "I", descriptor = "I")
    private int field777;

    @OriginalMember(owner = "FJSXIAWX", name = "P", descriptor = "I")
    private int field784;

    @OriginalMember(owner = "FJSXIAWX", name = "Q", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "FJSXIAWX", name = "S", descriptor = "J")
    private long field787;

    @OriginalMember(owner = "FJSXIAWX", name = "r", descriptor = "LNCRHUMXM;")
    private class31 field760;

    @OriginalMember(owner = "FJSXIAWX", name = "M", descriptor = "Lclient;")
    private client field781;

    @OriginalMember(owner = "FJSXIAWX", name = "G", descriptor = "Ljava/io/InputStream;")
    private InputStream field775;

    @OriginalMember(owner = "FJSXIAWX", name = "A", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field769;

    @OriginalMember(owner = "FJSXIAWX", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field745;

    @OriginalMember(owner = "FJSXIAWX", name = "b", descriptor = "[B")
    private byte[] field744;

    @OriginalMember(owner = "FJSXIAWX", name = "g", descriptor = "[I")
    private int[] field749;

    @OriginalMember(owner = "FJSXIAWX", name = "k", descriptor = "[I")
    private int[] field753;

    @OriginalMember(owner = "FJSXIAWX", name = "o", descriptor = "[I")
    private int[] field757;

    @OriginalMember(owner = "FJSXIAWX", name = "y", descriptor = "[I")
    private int[] field767;

    @OriginalMember(owner = "FJSXIAWX", name = "N", descriptor = "[I")
    private int[] field782;

    @OriginalMember(owner = "FJSXIAWX", name = "O", descriptor = "[I")
    private int[] field783;

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "(II[BI)Z")
    private final boolean method224(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg2 == null || arg2.length < 2) {
            return false;
        }
        int var5 = arg2.length - 2;
        int var6 = ((arg2[var5] & 0xFF) << 8) + (arg2[var5 + 1] & 0xFF);
        this.field752.reset();
        this.field752.update(arg2, 0, var5);
        int var7 = (int) this.field752.getValue();
        int var8 = 11 / arg0;
        if (arg1 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "()I")
    public final int method225() {
        class71 var1 = this.field756;
        synchronized (this.field756) {
            return this.field756.method596();
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "b", descriptor = "(I)V")
    private final void method226(int arg0) {
        if (arg0 != 0) {
            return;
        }
        this.field764 = 0;
        this.field765 = 0;
        for (class31 var2 = (class31) this.field763.method600(); var2 != null; var2 = (class31) this.field763.method602((byte) 3)) {
            if (var2.field1107) {
                this.field764++;
            } else {
                this.field765++;
            }
        }
        while (this.field764 < 10) {
            class31 var3 = (class31) this.field786.method599();
            if (var3 == null) {
                break;
            }
            if (this.field768[var3.field1105][var3.field1106] != 0) {
                this.field746++;
            }
            this.field768[var3.field1105][var3.field1106] = 0;
            this.field763.method597(var3);
            this.field764++;
            this.method241(this.field773, var3);
            this.field778 = true;
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "(IIIB)V")
    public final void method227(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field781.field317[0] == null || this.field776[arg1][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field781.field317[arg1 + 1].method446(arg2, (byte) 2);
        if (this.method224(318, this.field776[arg1][arg2], var5, this.field779[arg1][arg2])) {
            return;
        }
        this.field768[arg1][arg2] = arg3;
        if (arg0 == 0) {
            if (arg3 > this.field758) {
                this.field758 = arg3;
            }
            this.field754++;
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "(BI)Z")
    public final boolean method228(byte arg0, int arg1) {
        for (int var3 = 0; var3 < this.field767.length; var3++) {
            if (this.field753[var3] == arg1) {
                return true;
            }
        }
        if (arg0 == 2) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "FJSXIAWX", name = "c", descriptor = "(I)V")
    private final void method229(int arg0) {
        if (arg0 != 0) {
            this.field780 = !this.field780;
        }
        class72 var2 = this.field761;
        class31 var3;
        synchronized (this.field761) {
            var3 = (class31) this.field761.method599();
        }
        while (var3 != null) {
            this.field778 = true;
            byte[] var4 = null;
            if (this.field781.field317[0] != null) {
                var4 = this.field781.field317[var3.field1105 + 1].method446(var3.field1106, (byte) 2);
            }
            if (!this.method224(318, this.field776[var3.field1105][var3.field1106], var4, this.field779[var3.field1105][var3.field1106])) {
                var4 = null;
            }
            class72 var5 = this.field761;
            synchronized (this.field761) {
                if (var4 == null) {
                    this.field786.method597(var3);
                } else {
                    var3.field1109 = var4;
                    class72 var6 = this.field750;
                    synchronized (this.field750) {
                        this.field750.method597(var3);
                    }
                }
                var3 = (class31) this.field761.method599();
            }
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "(I)V")
    public final void method216(int arg0) {
        this.method237(0, arg0);
    }

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "(IZI)V")
    public final void method230(int arg0, boolean arg1, int arg2) {
        if (this.field781.field317[0] == null || (this.field776[arg0][arg2] == 0 || (this.field768[arg0][arg2] == 0 || this.field758 == 0))) {
            return;
        }
        class31 var4 = new class31();
        var4.field1105 = arg0;
        var4.field1106 = arg2;
        var4.field1107 = false;
        class72 var5 = this.field788;
        synchronized (this.field788) {
            this.field788.method597(var4);
        }
        if (arg1) {
            this.field777 = 213;
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "b", descriptor = "()V")
    public final void method231() {
        this.field759 = false;
    }

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "(ZI)V")
    public final void method232(boolean arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        int var3 = this.field767.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field757[var4] != 0) {
                this.method227(0, 3, this.field753[var4], (byte) 2);
                this.method227(0, 3, this.field782[var4], (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "(LGWOEELWB;Lclient;)V")
    public final void method233(class18 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method249(var3[var4], null);
            int var27 = var26.length / 2;
            class30 var28 = new class30(true, var26);
            this.field776[var4] = new int[var27];
            this.field768[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field776[var4][var29] = var28.method298();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method249(var5[var6], null);
            int var23 = var22.length / 4;
            class30 var24 = new class30(true, var22);
            this.field779[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field779[var6][var25] = var24.method301();
            }
        }
        byte[] var7 = arg0.method249("model_index", null);
        int var8 = this.field776[0].length;
        this.field744 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field744[var9] = var7[var9];
            } else {
                this.field744[var9] = 0;
            }
        }
        byte[] var10 = arg0.method249("map_index", null);
        class30 var11 = new class30(true, var10);
        int var12 = var10.length / 7;
        this.field767 = new int[var12];
        this.field782 = new int[var12];
        this.field753 = new int[var12];
        this.field757 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field767[var13] = var11.method298();
            this.field782[var13] = var11.method298();
            this.field753[var13] = var11.method298();
            this.field757[var13] = var11.method296();
        }
        byte[] var14 = arg0.method249("anim_index", null);
        class30 var15 = new class30(true, var14);
        int var16 = var14.length / 2;
        this.field749 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field749[var17] = var15.method298();
        }
        byte[] var18 = arg0.method249("midi_index", null);
        class30 var19 = new class30(true, var18);
        int var20 = var18.length;
        this.field783 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field783[var21] = var19.method296();
        }
        this.field781 = arg1;
        this.field759 = true;
        this.field781.method131(this, 2);
    }

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "(II)I")
    public final int method234(int arg0, int arg1) {
        if (arg0 >= 0) {
            this.field771 = !this.field771;
        }
        return this.field744[arg1] & 0xFF;
    }

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "(IIII)I")
    public final int method235(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 << 8) + arg0;
        for (int var6 = 0; var6 < this.field767.length; var6++) {
            if (this.field767[var6] == var5) {
                if (arg2 == 0) {
                    return this.field782[var6];
                }
                return this.field753[var6];
            }
        }
        int var7 = 94 / arg3;
        return -1;
    }

    @OriginalMember(owner = "FJSXIAWX", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field759) {
                this.field772++;
                byte var1 = 20;
                if (this.field758 == 0 && this.field781.field317[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field778 = true;
                for (int var2 = 0; var2 < 100 && this.field778; var2++) {
                    this.field778 = false;
                    this.method229(this.field784);
                    this.method226(0);
                    if (this.field764 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method244(27);
                    if (this.field775 != null) {
                        this.method242(this.field774);
                    }
                }
                boolean var3 = false;
                for (class31 var4 = (class31) this.field763.method600(); var4 != null; var4 = (class31) this.field763.method602((byte) 3)) {
                    if (var4.field1107) {
                        var3 = true;
                        var4.field1108++;
                        if (var4.field1108 > 50) {
                            var4.field1108 = 0;
                            this.method241(this.field773, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class31 var5 = (class31) this.field763.method600(); var5 != null; var5 = (class31) this.field763.method602((byte) 3)) {
                        var3 = true;
                        var5.field1108++;
                        if (var5.field1108 > 50) {
                            var5.field1108 = 0;
                            this.method241(this.field773, var5);
                        }
                    }
                }
                if (var3) {
                    this.field785++;
                    if (this.field785 > 750) {
                        try {
                            this.field745.close();
                        } catch (Exception var8) {
                        }
                        this.field745 = null;
                        this.field775 = null;
                        this.field769 = null;
                        this.field748 = 0;
                    }
                } else {
                    this.field785 = 0;
                    this.field770 = "";
                }
                if (this.field781.field320 && this.field745 != null && this.field769 != null && (this.field758 > 0 || this.field781.field317[0] == null)) {
                    this.field755++;
                    if (this.field755 > 500) {
                        this.field755 = 0;
                        this.field766[0] = 0;
                        this.field766[1] = 0;
                        this.field766[2] = 0;
                        this.field766[3] = 10;
                        try {
                            this.field769.write(this.field766, 0, 4);
                        } catch (IOException var7) {
                            this.field785 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "d", descriptor = "(I)I")
    public final int method236(int arg0) {
        while (arg0 >= 0) {
            this.field780 = !this.field780;
        }
        return this.field749.length;
    }

    @OriginalMember(owner = "FJSXIAWX", name = "b", descriptor = "(II)V")
    public final void method237(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field776.length || arg1 < 0 || arg1 > this.field776[arg0].length || this.field776[arg0][arg1] == 0) {
            return;
        }
        class71 var3 = this.field756;
        synchronized (this.field756) {
            for (class31 var4 = (class31) this.field756.method594(); var4 != null; var4 = (class31) this.field756.method595((byte) 3)) {
                if (var4.field1105 == arg0 && var4.field1106 == arg1) {
                    return;
                }
            }
            class31 var5 = new class31();
            var5.field1105 = arg0;
            var5.field1106 = arg1;
            var5.field1107 = true;
            class72 var6 = this.field761;
            synchronized (this.field761) {
                this.field761.method597(var5);
            }
            this.field756.method592(var5);
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "e", descriptor = "(I)V")
    public final void method238(int arg0) {
        class72 var2 = this.field788;
        synchronized (this.field788) {
            this.field788.method604();
        }
        int var3 = 24 / arg0;
    }

    @OriginalMember(owner = "FJSXIAWX", name = "c", descriptor = "(II)I")
    public final int method239(int arg0, int arg1) {
        int var3 = 17 / arg0;
        return this.field776[arg1].length;
    }

    @OriginalMember(owner = "FJSXIAWX", name = "d", descriptor = "(II)Z")
    public final boolean method240(int arg0, int arg1) {
        if (arg0 != -25506) {
            throw new NullPointerException();
        }
        return this.field783[arg1] == 1;
    }

    @OriginalMember(owner = "FJSXIAWX", name = "a", descriptor = "(ILNCRHUMXM;)V")
    private final void method241(int arg0, class31 arg1) {
        if (arg0 < 5 || arg0 > 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            if (this.field745 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field787 < 4000L) {
                    return;
                }
                this.field787 = var4;
                this.field745 = this.field781.method175(client.field351 + 43594);
                this.field775 = this.field745.getInputStream();
                this.field769 = this.field745.getOutputStream();
                this.field769.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field775.read();
                }
                this.field785 = 0;
            }
            this.field766[0] = (byte) arg1.field1105;
            this.field766[1] = (byte) (arg1.field1106 >> 8);
            this.field766[2] = (byte) arg1.field1106;
            if (arg1.field1107) {
                this.field766[3] = 2;
            } else if (this.field781.field320) {
                this.field766[3] = 0;
            } else {
                this.field766[3] = 1;
            }
            this.field769.write(this.field766, 0, 4);
            this.field755 = 0;
            this.field751 = -10000;
        } catch (IOException var9) {
            try {
                this.field745.close();
            } catch (Exception var8) {
            }
            this.field745 = null;
            this.field775 = null;
            this.field769 = null;
            this.field748 = 0;
            this.field751++;
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "f", descriptor = "(I)V")
    private final void method242(int arg0) {
        if (arg0 != 7) {
            this.field771 = !this.field771;
        }
        try {
            int var2 = this.field775.available();
            if (this.field748 == 0 && var2 >= 6) {
                this.field778 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field775.read(this.field766, var3, 6 - var3)) {
                }
                int var4 = this.field766[0] & 0xFF;
                int var5 = ((this.field766[1] & 0xFF) << 8) + (this.field766[2] & 0xFF);
                int var6 = ((this.field766[3] & 0xFF) << 8) + (this.field766[4] & 0xFF);
                int var7 = this.field766[5] & 0xFF;
                this.field760 = null;
                for (class31 var8 = (class31) this.field763.method600(); var8 != null; var8 = (class31) this.field763.method602((byte) 3)) {
                    if (var8.field1105 == var4 && var8.field1106 == var5) {
                        this.field760 = var8;
                    }
                    if (this.field760 != null) {
                        var8.field1108 = 0;
                    }
                }
                if (this.field760 != null) {
                    this.field785 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field760.field1109 = null;
                        if (this.field760.field1107) {
                            class72 var9 = this.field750;
                            synchronized (this.field750) {
                                this.field750.method597(this.field760);
                            }
                        } else {
                            this.field760.method367();
                        }
                        this.field760 = null;
                    } else {
                        if (this.field760.field1109 == null && var7 == 0) {
                            this.field760.field1109 = new byte[var6];
                        }
                        if (this.field760.field1109 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field747 = var7 * 500;
                this.field748 = 500;
                if (this.field748 > var6 - var7 * 500) {
                    this.field748 = var6 - var7 * 500;
                }
            }
            if (this.field748 > 0 && var2 >= this.field748) {
                this.field778 = true;
                byte[] var10 = this.field766;
                int var11 = 0;
                if (this.field760 != null) {
                    var10 = this.field760.field1109;
                    var11 = this.field747;
                }
                for (int var12 = 0; var12 < this.field748; var12 += this.field775.read(var10, var11 + var12, this.field748 - var12)) {
                }
                if (this.field748 + this.field747 >= var10.length && this.field760 != null) {
                    if (this.field781.field317[0] != null) {
                        this.field781.field317[this.field760.field1105 + 1].method447(this.field760.field1106, (byte) 0, var10, var10.length);
                    }
                    if (!this.field760.field1107 && this.field760.field1105 == 3) {
                        this.field760.field1107 = true;
                        this.field760.field1105 = 93;
                    }
                    if (this.field760.field1107) {
                        class72 var13 = this.field750;
                        synchronized (this.field750) {
                            this.field750.method597(this.field760);
                        }
                    } else {
                        this.field760.method367();
                    }
                }
                this.field748 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field745.close();
            } catch (Exception var15) {
            }
            this.field745 = null;
            this.field775 = null;
            this.field769 = null;
            this.field748 = 0;
        }
    }

    @OriginalMember(owner = "FJSXIAWX", name = "c", descriptor = "()LNCRHUMXM;")
    public final class31 method243() {
        class72 var1 = this.field750;
        class31 var2;
        synchronized (this.field750) {
            var2 = (class31) this.field750.method599();
        }
        if (var2 == null) {
            return null;
        }
        class71 var3 = this.field756;
        synchronized (this.field756) {
            var2.method217();
        }
        if (var2.field1109 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1109));
            while (true) {
                if (this.field762.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field762, var4, this.field762.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1109 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1109[var7] = this.field762[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "FJSXIAWX", name = "g", descriptor = "(I)V")
    private final void method244(int arg0) {
        if (arg0 <= 0) {
            return;
        }
        while (this.field764 == 0) {
            if (this.field765 >= 10 || this.field758 == 0) {
                return;
            }
            class72 var2 = this.field788;
            class31 var3;
            synchronized (this.field788) {
                var3 = (class31) this.field788.method599();
            }
            while (var3 != null) {
                if (this.field768[var3.field1105][var3.field1106] != 0) {
                    this.field768[var3.field1105][var3.field1106] = 0;
                    this.field763.method597(var3);
                    this.method241(this.field773, var3);
                    this.field778 = true;
                    if (this.field746 < this.field754) {
                        this.field746++;
                    }
                    this.field770 = "Loading extra files - " + this.field746 * 100 / this.field754 + "%";
                    this.field765++;
                    if (this.field765 == 10) {
                        return;
                    }
                }
                class72 var4 = this.field788;
                synchronized (this.field788) {
                    var3 = (class31) this.field788.method599();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field768[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field758) {
                        var6[var8] = 0;
                        class31 var9 = new class31();
                        var9.field1105 = var5;
                        var9.field1106 = var8;
                        var9.field1107 = false;
                        this.field763.method597(var9);
                        this.method241(this.field773, var9);
                        this.field778 = true;
                        if (this.field746 < this.field754) {
                            this.field746++;
                        }
                        this.field770 = "Loading extra files - " + this.field746 * 100 / this.field754 + "%";
                        this.field765++;
                        if (this.field765 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field758--;
        }
    }
}
