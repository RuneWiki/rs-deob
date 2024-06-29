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

@OriginalClass("client!IHBKBLZU")
public class class16 extends class5 implements Runnable {

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "LETMNPRAF;")
    private class11 field735 = new class11(0);

    @OriginalMember(owner = "client!IHBKBLZU", name = "b", descriptor = "[[I")
    private int[][] field736 = new int[4][];

    @OriginalMember(owner = "client!IHBKBLZU", name = "c", descriptor = "Z")
    private boolean field737 = false;

    @OriginalMember(owner = "client!IHBKBLZU", name = "g", descriptor = "Z")
    private boolean field741 = true;

    @OriginalMember(owner = "client!IHBKBLZU", name = "h", descriptor = "Z")
    private boolean field742 = false;

    @OriginalMember(owner = "client!IHBKBLZU", name = "i", descriptor = "[[B")
    private byte[][] field743 = new byte[4][];

    @OriginalMember(owner = "client!IHBKBLZU", name = "k", descriptor = "LETMNPRAF;")
    private class11 field745 = new class11(0);

    @OriginalMember(owner = "client!IHBKBLZU", name = "n", descriptor = "LETMNPRAF;")
    private class11 field748 = new class11(0);

    @OriginalMember(owner = "client!IHBKBLZU", name = "v", descriptor = "Z")
    private boolean field756 = false;

    @OriginalMember(owner = "client!IHBKBLZU", name = "w", descriptor = "[B")
    private byte[] field757 = new byte[500];

    @OriginalMember(owner = "client!IHBKBLZU", name = "z", descriptor = "LLKYWDMZN;")
    private class29 field760 = new class29(0);

    @OriginalMember(owner = "client!IHBKBLZU", name = "C", descriptor = "LETMNPRAF;")
    private class11 field763 = new class11(0);

    @OriginalMember(owner = "client!IHBKBLZU", name = "F", descriptor = "LETMNPRAF;")
    private class11 field766 = new class11(0);

    @OriginalMember(owner = "client!IHBKBLZU", name = "H", descriptor = "I")
    private int field768 = -43582;

    @OriginalMember(owner = "client!IHBKBLZU", name = "I", descriptor = "[[I")
    private int[][] field769 = new int[4][];

    @OriginalMember(owner = "client!IHBKBLZU", name = "J", descriptor = "[B")
    private byte[] field770 = new byte[65000];

    @OriginalMember(owner = "client!IHBKBLZU", name = "K", descriptor = "Ljava/lang/String;")
    public String field771 = "";

    @OriginalMember(owner = "client!IHBKBLZU", name = "M", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field773 = new CRC32();

    @OriginalMember(owner = "client!IHBKBLZU", name = "d", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!IHBKBLZU", name = "l", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!IHBKBLZU", name = "m", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!IHBKBLZU", name = "o", descriptor = "I")
    private int field749;

    @OriginalMember(owner = "client!IHBKBLZU", name = "p", descriptor = "I")
    private int field750;

    @OriginalMember(owner = "client!IHBKBLZU", name = "x", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!IHBKBLZU", name = "D", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "client!IHBKBLZU", name = "E", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "client!IHBKBLZU", name = "L", descriptor = "I")
    private int field772;

    @OriginalMember(owner = "client!IHBKBLZU", name = "N", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!IHBKBLZU", name = "O", descriptor = "I")
    private int field775;

    @OriginalMember(owner = "client!IHBKBLZU", name = "s", descriptor = "J")
    private long field753;

    @OriginalMember(owner = "client!IHBKBLZU", name = "u", descriptor = "LNFBFXKHQ;")
    private class33 field755;

    @OriginalMember(owner = "client!IHBKBLZU", name = "G", descriptor = "Lclient;")
    private client field767;

    @OriginalMember(owner = "client!IHBKBLZU", name = "A", descriptor = "Ljava/io/InputStream;")
    private InputStream field761;

    @OriginalMember(owner = "client!IHBKBLZU", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field751;

    @OriginalMember(owner = "client!IHBKBLZU", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field740;

    @OriginalMember(owner = "client!IHBKBLZU", name = "P", descriptor = "[B")
    private byte[] field776;

    @OriginalMember(owner = "client!IHBKBLZU", name = "e", descriptor = "[I")
    private int[] field739;

    @OriginalMember(owner = "client!IHBKBLZU", name = "j", descriptor = "[I")
    private int[] field744;

    @OriginalMember(owner = "client!IHBKBLZU", name = "r", descriptor = "[I")
    private int[] field752;

    @OriginalMember(owner = "client!IHBKBLZU", name = "t", descriptor = "[I")
    private int[] field754;

    @OriginalMember(owner = "client!IHBKBLZU", name = "y", descriptor = "[I")
    private int[] field759;

    @OriginalMember(owner = "client!IHBKBLZU", name = "B", descriptor = "[I")
    private int[] field762;

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(II)I")
    public final int method244(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field768 = 125;
        }
        return this.field769[arg0].length;
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "b", descriptor = "(II)V")
    public final void method245(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field769.length || arg1 < 0 || arg1 > this.field769[arg0].length || this.field769[arg0][arg1] == 0) {
            return;
        }
        class29 var3 = this.field760;
        synchronized (this.field760) {
            for (class33 var4 = (class33) this.field760.method328(); var4 != null; var4 = (class33) this.field760.method329((byte) 6)) {
                if (var4.field991 == arg0 && var4.field989 == arg1) {
                    return;
                }
            }
            class33 var5 = new class33();
            var5.field991 = arg0;
            var5.field989 = arg1;
            var5.field992 = true;
            class11 var6 = this.field735;
            synchronized (this.field735) {
                this.field735.method178(var5);
            }
            this.field760.method326(var5);
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(B)V")
    private final void method246(byte arg0) {
        if (arg0 != -59) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class11 var3 = this.field735;
        class33 var4;
        synchronized (this.field735) {
            var4 = (class33) this.field735.method180();
        }
        while (var4 != null) {
            this.field742 = true;
            byte[] var5 = null;
            if (this.field767.field328[0] != null) {
                var5 = this.field767.field328[var4.field991 + 1].method582(-13096, var4.field989);
            }
            if (!this.method257(true, var5, this.field769[var4.field991][var4.field989], this.field736[var4.field991][var4.field989])) {
                var5 = null;
            }
            class11 var6 = this.field735;
            synchronized (this.field735) {
                if (var5 == null) {
                    this.field766.method178(var4);
                } else {
                    var4.field988 = var5;
                    class11 var7 = this.field748;
                    synchronized (this.field748) {
                        this.field748.method178(var4);
                    }
                }
                var4 = (class33) this.field735.method180();
            }
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(LNFBFXKHQ;B)V")
    private final void method247(class33 arg0, byte arg1) {
        if (arg1 != 9) {
            return;
        }
        try {
            if (this.field740 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field753 < 4000L) {
                    return;
                }
                this.field753 = var3;
                this.field740 = this.field767.method154(client.field503 + 43594);
                this.field761 = this.field740.getInputStream();
                this.field751 = this.field740.getOutputStream();
                this.field751.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field761.read();
                }
                this.field774 = 0;
            }
            this.field757[0] = (byte) arg0.field991;
            this.field757[1] = (byte) (arg0.field989 >> 8);
            this.field757[2] = (byte) arg0.field989;
            if (arg0.field992) {
                this.field757[3] = 2;
            } else if (this.field767.field355) {
                this.field757[3] = 0;
            } else {
                this.field757[3] = 1;
            }
            this.field751.write(this.field757, 0, 4);
            this.field775 = 0;
            this.field747 = -10000;
        } catch (IOException var8) {
            try {
                this.field740.close();
            } catch (Exception var7) {
            }
            this.field740 = null;
            this.field761 = null;
            this.field751 = null;
            this.field765 = 0;
            this.field747++;
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(ZI)I")
    public final int method248(boolean arg0, int arg1) {
        return arg0 ? this.field776[arg1] & 0xFF : 2;
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field741) {
                this.field758++;
                byte var1 = 20;
                if (this.field772 == 0 && this.field767.field328[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field742 = true;
                for (int var2 = 0; var2 < 100 && this.field742; var2++) {
                    this.field742 = false;
                    this.method246((byte) -59);
                    this.method250(46379);
                    if (this.field749 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method264((byte) 1);
                    if (this.field761 != null) {
                        this.method254((byte) 22);
                    }
                }
                boolean var3 = false;
                for (class33 var4 = (class33) this.field763.method181(); var4 != null; var4 = (class33) this.field763.method183((byte) 6)) {
                    if (var4.field992) {
                        var3 = true;
                        var4.field990++;
                        if (var4.field990 > 50) {
                            var4.field990 = 0;
                            this.method247(var4, (byte) 9);
                        }
                    }
                }
                if (!var3) {
                    for (class33 var5 = (class33) this.field763.method181(); var5 != null; var5 = (class33) this.field763.method183((byte) 6)) {
                        var3 = true;
                        var5.field990++;
                        if (var5.field990 > 50) {
                            var5.field990 = 0;
                            this.method247(var5, (byte) 9);
                        }
                    }
                }
                if (var3) {
                    this.field774++;
                    if (this.field774 > 750) {
                        try {
                            this.field740.close();
                        } catch (Exception var8) {
                        }
                        this.field740 = null;
                        this.field761 = null;
                        this.field751 = null;
                        this.field765 = 0;
                    }
                } else {
                    this.field774 = 0;
                    this.field771 = "";
                }
                if (this.field767.field355 && this.field740 != null && this.field751 != null && (this.field772 > 0 || this.field767.field328[0] == null)) {
                    this.field775++;
                    if (this.field775 > 500) {
                        this.field775 = 0;
                        this.field757[0] = 0;
                        this.field757[1] = 0;
                        this.field757[2] = 0;
                        this.field757[3] = 10;
                        try {
                            this.field751.write(this.field757, 0, 4);
                        } catch (IOException var7) {
                            this.field774 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "()I")
    public final int method249() {
        class29 var1 = this.field760;
        synchronized (this.field760) {
            return this.field760.method330();
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "b", descriptor = "(I)V")
    private final void method250(int arg0) {
        this.field749 = 0;
        if (arg0 != 46379) {
            this.field737 = !this.field737;
        }
        this.field750 = 0;
        for (class33 var2 = (class33) this.field763.method181(); var2 != null; var2 = (class33) this.field763.method183((byte) 6)) {
            if (var2.field992) {
                this.field749++;
            } else {
                this.field750++;
            }
        }
        while (this.field749 < 10) {
            class33 var3 = (class33) this.field766.method180();
            if (var3 == null) {
                break;
            }
            if (this.field743[var3.field991][var3.field989] != 0) {
                this.field746++;
            }
            this.field743[var3.field991][var3.field989] = 0;
            this.field763.method178(var3);
            this.field749++;
            this.method247(var3, (byte) 9);
            this.field742 = true;
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(I)V")
    public final void method11(int arg0) {
        this.method245(0, arg0);
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(LWEMOPWVJ;Lclient;)V")
    public final void method251(class62 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method559(var3[var4], null);
            int var27 = var26.length / 2;
            class52 var28 = new class52(var26, true);
            this.field769[var4] = new int[var27];
            this.field743[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field769[var4][var29] = var28.method463();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method559(var5[var6], null);
            int var23 = var22.length / 4;
            class52 var24 = new class52(var22, true);
            this.field736[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field736[var6][var25] = var24.method466();
            }
        }
        byte[] var7 = arg0.method559("model_index", null);
        int var8 = this.field769[0].length;
        this.field776 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field776[var9] = var7[var9];
            } else {
                this.field776[var9] = 0;
            }
        }
        byte[] var10 = arg0.method559("map_index", null);
        class52 var11 = new class52(var10, true);
        int var12 = var10.length / 7;
        this.field759 = new int[var12];
        this.field762 = new int[var12];
        this.field739 = new int[var12];
        this.field754 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field759[var13] = var11.method463();
            this.field762[var13] = var11.method463();
            this.field739[var13] = var11.method463();
            this.field754[var13] = var11.method461();
        }
        byte[] var14 = arg0.method559("anim_index", null);
        class52 var15 = new class52(var14, true);
        int var16 = var14.length / 2;
        this.field744 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field744[var17] = var15.method463();
        }
        byte[] var18 = arg0.method559("midi_index", null);
        class52 var19 = new class52(var18, true);
        int var20 = var18.length;
        this.field752 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field752[var21] = var19.method461();
        }
        this.field767 = arg1;
        this.field741 = true;
        this.field767.method87(this, 2);
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "b", descriptor = "()V")
    public final void method252() {
        this.field741 = false;
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(BBII)V")
    public final void method253(byte arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -5 || (this.field767.field328[0] == null || this.field769[arg2][arg3] == 0)) {
            return;
        }
        byte[] var5 = this.field767.field328[arg2 + 1].method582(-13096, arg3);
        if (this.method257(true, var5, this.field769[arg2][arg3], this.field736[arg2][arg3])) {
            return;
        }
        this.field743[arg2][arg3] = arg0;
        if (arg0 > this.field772) {
            this.field772 = arg0;
        }
        this.field738++;
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "b", descriptor = "(B)V")
    private final void method254(byte arg0) {
        if (arg0 != 22) {
            return;
        }
        try {
            int var2 = this.field761.available();
            if (this.field765 == 0 && var2 >= 6) {
                this.field742 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field761.read(this.field757, var3, 6 - var3)) {
                }
                int var4 = this.field757[0] & 0xFF;
                int var5 = ((this.field757[1] & 0xFF) << 8) + (this.field757[2] & 0xFF);
                int var6 = ((this.field757[3] & 0xFF) << 8) + (this.field757[4] & 0xFF);
                int var7 = this.field757[5] & 0xFF;
                this.field755 = null;
                for (class33 var8 = (class33) this.field763.method181(); var8 != null; var8 = (class33) this.field763.method183((byte) 6)) {
                    if (var8.field991 == var4 && var8.field989 == var5) {
                        this.field755 = var8;
                    }
                    if (this.field755 != null) {
                        var8.field990 = 0;
                    }
                }
                if (this.field755 != null) {
                    this.field774 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field755.field988 = null;
                        if (this.field755.field992) {
                            class11 var9 = this.field748;
                            synchronized (this.field748) {
                                this.field748.method178(this.field755);
                            }
                        } else {
                            this.field755.method331();
                        }
                        this.field755 = null;
                    } else {
                        if (this.field755.field988 == null && var7 == 0) {
                            this.field755.field988 = new byte[var6];
                        }
                        if (this.field755.field988 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field764 = var7 * 500;
                this.field765 = 500;
                if (this.field765 > var6 - var7 * 500) {
                    this.field765 = var6 - var7 * 500;
                }
            }
            if (this.field765 > 0 && var2 >= this.field765) {
                this.field742 = true;
                byte[] var10 = this.field757;
                int var11 = 0;
                if (this.field755 != null) {
                    var10 = this.field755.field988;
                    var11 = this.field764;
                }
                for (int var12 = 0; var12 < this.field765; var12 += this.field761.read(var10, var11 + var12, this.field765 - var12)) {
                }
                if (this.field765 + this.field764 >= var10.length && this.field755 != null) {
                    if (this.field767.field328[0] != null) {
                        this.field767.field328[this.field755.field991 + 1].method583(this.field755.field989, var10.length, 72, var10);
                    }
                    if (!this.field755.field992 && this.field755.field991 == 3) {
                        this.field755.field992 = true;
                        this.field755.field991 = 93;
                    }
                    if (this.field755.field992) {
                        class11 var13 = this.field748;
                        synchronized (this.field748) {
                            this.field748.method178(this.field755);
                        }
                    } else {
                        this.field755.method331();
                    }
                }
                this.field765 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field740.close();
            } catch (Exception var15) {
            }
            this.field740 = null;
            this.field761 = null;
            this.field751 = null;
            this.field765 = 0;
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "c", descriptor = "(II)Z")
    public final boolean method255(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field756 = !this.field756;
        }
        if (this.field752[arg0] == 1) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(Z)I")
    public final int method256(boolean arg0) {
        return arg0 ? 0 : this.field744.length;
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(Z[BII)Z")
    private final boolean method257(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        if (!arg0) {
            throw new NullPointerException();
        }
        this.field773.reset();
        this.field773.update(arg1, 0, var5);
        int var7 = (int) this.field773.getValue();
        if (arg2 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(ZZ)V")
    public final void method258(boolean arg0, boolean arg1) {
        int var3 = this.field759.length;
        if (!arg0) {
            this.field737 = !this.field737;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field754[var4] != 0) {
                this.method253((byte) 2, (byte) -5, 3, this.field739[var4]);
                this.method253((byte) 2, (byte) -5, 3, this.field762[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(IIZI)I")
    public final int method259(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = (arg1 << 8) + arg3;
        for (int var6 = 0; var6 < this.field759.length; var6++) {
            if (this.field759[var6] == var5) {
                if (arg0 == 0) {
                    return this.field762[var6];
                }
                return this.field739[var6];
            }
        }
        return arg2 ? this.field768 : -1;
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "c", descriptor = "(I)V")
    public final void method260(int arg0) {
        int var2 = 59 / arg0;
        class11 var3 = this.field745;
        synchronized (this.field745) {
            this.field745.method185();
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "c", descriptor = "()LNFBFXKHQ;")
    public final class33 method261() {
        class11 var1 = this.field748;
        class33 var2;
        synchronized (this.field748) {
            var2 = (class33) this.field748.method180();
        }
        if (var2 == null) {
            return null;
        }
        class29 var3 = this.field760;
        synchronized (this.field760) {
            var2.method4();
        }
        if (var2.field988 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field988));
            while (true) {
                if (this.field770.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field770, var4, this.field770.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field988 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field988[var7] = this.field770[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(III)V")
    public final void method262(int arg0, int arg1, int arg2) {
        if (this.field767.field328[0] == null || (this.field769[arg1][arg0] == 0 || (this.field743[arg1][arg0] == 0 || this.field772 == 0))) {
            return;
        }
        class33 var4 = new class33();
        var4.field991 = arg1;
        var4.field989 = arg0;
        var4.field992 = false;
        if (arg2 < 0) {
            class11 var5 = this.field745;
            synchronized (this.field745) {
                this.field745.method178(var4);
            }
        }
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "a", descriptor = "(IB)Z")
    public final boolean method263(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field759.length; var3++) {
            if (this.field739[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 8) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "client!IHBKBLZU", name = "c", descriptor = "(B)V")
    private final void method264(byte arg0) {
        if (arg0 != 1) {
            return;
        }
        while (this.field749 == 0) {
            if (this.field750 >= 10 || this.field772 == 0) {
                return;
            }
            class11 var2 = this.field745;
            class33 var3;
            synchronized (this.field745) {
                var3 = (class33) this.field745.method180();
            }
            while (var3 != null) {
                if (this.field743[var3.field991][var3.field989] != 0) {
                    this.field743[var3.field991][var3.field989] = 0;
                    this.field763.method178(var3);
                    this.method247(var3, (byte) 9);
                    this.field742 = true;
                    if (this.field746 < this.field738) {
                        this.field746++;
                    }
                    this.field771 = "Loading extra files - " + this.field746 * 100 / this.field738 + "%";
                    this.field750++;
                    if (this.field750 == 10) {
                        return;
                    }
                }
                class11 var4 = this.field745;
                synchronized (this.field745) {
                    var3 = (class33) this.field745.method180();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field743[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field772) {
                        var6[var8] = 0;
                        class33 var9 = new class33();
                        var9.field991 = var5;
                        var9.field989 = var8;
                        var9.field992 = false;
                        this.field763.method178(var9);
                        this.method247(var9, (byte) 9);
                        this.field742 = true;
                        if (this.field746 < this.field738) {
                            this.field746++;
                        }
                        this.field771 = "Loading extra files - " + this.field746 * 100 / this.field738 + "%";
                        this.field750++;
                        if (this.field750 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field772--;
        }
    }
}
