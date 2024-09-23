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

@OriginalClass("FRNMNGGN")
public class class17 extends class20 implements Runnable {

    @OriginalMember(owner = "FRNMNGGN", name = "b", descriptor = "[B")
    private byte[] field693 = new byte[500];

    @OriginalMember(owner = "FRNMNGGN", name = "e", descriptor = "LSWVPDERM;")
    private class56 field696 = new class56(306);

    @OriginalMember(owner = "FRNMNGGN", name = "f", descriptor = "I")
    private int field697 = 2;

    @OriginalMember(owner = "FRNMNGGN", name = "i", descriptor = "Z")
    private boolean field700 = true;

    @OriginalMember(owner = "FRNMNGGN", name = "j", descriptor = "Z")
    private boolean field701 = false;

    @OriginalMember(owner = "FRNMNGGN", name = "k", descriptor = "[B")
    private byte[] field702 = new byte[65000];

    @OriginalMember(owner = "FRNMNGGN", name = "n", descriptor = "[[I")
    private int[][] field705 = new int[4][];

    @OriginalMember(owner = "FRNMNGGN", name = "p", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field707 = new CRC32();

    @OriginalMember(owner = "FRNMNGGN", name = "q", descriptor = "Ljava/lang/String;")
    public String field708 = "";

    @OriginalMember(owner = "FRNMNGGN", name = "s", descriptor = "LSWVPDERM;")
    private class56 field710 = new class56(306);

    @OriginalMember(owner = "FRNMNGGN", name = "t", descriptor = "Z")
    private boolean field711 = true;

    @OriginalMember(owner = "FRNMNGGN", name = "A", descriptor = "Z")
    private boolean field718 = true;

    @OriginalMember(owner = "FRNMNGGN", name = "B", descriptor = "LJCEXAOBP;")
    private class24 field719 = new class24(true);

    @OriginalMember(owner = "FRNMNGGN", name = "E", descriptor = "LSWVPDERM;")
    private class56 field722 = new class56(306);

    @OriginalMember(owner = "FRNMNGGN", name = "F", descriptor = "[[I")
    private int[][] field723 = new int[4][];

    @OriginalMember(owner = "FRNMNGGN", name = "I", descriptor = "I")
    private int field726 = -777;

    @OriginalMember(owner = "FRNMNGGN", name = "N", descriptor = "LSWVPDERM;")
    private class56 field731 = new class56(306);

    @OriginalMember(owner = "FRNMNGGN", name = "O", descriptor = "[[B")
    private byte[][] field732 = new byte[4][];

    @OriginalMember(owner = "FRNMNGGN", name = "R", descriptor = "LSWVPDERM;")
    private class56 field735 = new class56(306);

    @OriginalMember(owner = "FRNMNGGN", name = "T", descriptor = "Z")
    private boolean field737 = true;

    @OriginalMember(owner = "FRNMNGGN", name = "h", descriptor = "I")
    private static int field699 = 8;

    @OriginalMember(owner = "FRNMNGGN", name = "g", descriptor = "I")
    private int field698;

    @OriginalMember(owner = "FRNMNGGN", name = "m", descriptor = "I")
    private int field704;

    @OriginalMember(owner = "FRNMNGGN", name = "u", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "FRNMNGGN", name = "v", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "FRNMNGGN", name = "C", descriptor = "I")
    private int field720;

    @OriginalMember(owner = "FRNMNGGN", name = "G", descriptor = "I")
    private int field724;

    @OriginalMember(owner = "FRNMNGGN", name = "H", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "FRNMNGGN", name = "K", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "FRNMNGGN", name = "L", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "FRNMNGGN", name = "P", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "FRNMNGGN", name = "Q", descriptor = "I")
    private int field734;

    @OriginalMember(owner = "FRNMNGGN", name = "w", descriptor = "J")
    private long field714;

    @OriginalMember(owner = "FRNMNGGN", name = "z", descriptor = "LEGGOGKSD;")
    private class9 field717;

    @OriginalMember(owner = "FRNMNGGN", name = "S", descriptor = "Lclient;")
    private client field736;

    @OriginalMember(owner = "FRNMNGGN", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field709;

    @OriginalMember(owner = "FRNMNGGN", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field716;

    @OriginalMember(owner = "FRNMNGGN", name = "x", descriptor = "Ljava/net/Socket;")
    private Socket field715;

    @OriginalMember(owner = "FRNMNGGN", name = "c", descriptor = "[B")
    private byte[] field694;

    @OriginalMember(owner = "FRNMNGGN", name = "d", descriptor = "[I")
    private int[] field695;

    @OriginalMember(owner = "FRNMNGGN", name = "l", descriptor = "[I")
    private int[] field703;

    @OriginalMember(owner = "FRNMNGGN", name = "o", descriptor = "[I")
    private int[] field706;

    @OriginalMember(owner = "FRNMNGGN", name = "D", descriptor = "[I")
    private int[] field721;

    @OriginalMember(owner = "FRNMNGGN", name = "J", descriptor = "[I")
    private int[] field727;

    @OriginalMember(owner = "FRNMNGGN", name = "M", descriptor = "[I")
    private int[] field730;

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(II)I")
    public final int method216(int arg0, int arg1) {
        int var3 = 97 / arg0;
        return this.field705[arg1].length;
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(IBII)V")
    public final void method217(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field736.field329[0] == null || this.field705[arg0][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field736.field329[arg0 + 1].method184(arg2, false);
        if (this.method224((byte) 62, this.field723[arg0][arg2], var5, this.field705[arg0][arg2])) {
            return;
        }
        this.field732[arg0][arg2] = arg1;
        if (arg1 > this.field698) {
            this.field698 = arg1;
        }
        this.field724++;
        int var6 = 15 / arg3;
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(ZI)Z")
    public final boolean method218(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return this.field730[arg1] == 1;
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "()I")
    public final int method219() {
        class24 var1 = this.field719;
        synchronized (this.field719) {
            return this.field719.method253();
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "b", descriptor = "(II)I")
    public final int method220(int arg0, int arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field694[arg1] & 0xFF;
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(Z)V")
    private final void method221(boolean arg0) {
        if (arg0) {
            return;
        }
        try {
            int var2 = this.field709.available();
            if (this.field713 == 0 && var2 >= 6) {
                this.field701 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field709.read(this.field693, var3, 6 - var3)) {
                }
                int var4 = this.field693[0] & 0xFF;
                int var5 = ((this.field693[1] & 0xFF) << 8) + (this.field693[2] & 0xFF);
                int var6 = ((this.field693[3] & 0xFF) << 8) + (this.field693[4] & 0xFF);
                int var7 = this.field693[5] & 0xFF;
                this.field717 = null;
                for (class9 var8 = (class9) this.field710.method482(); var8 != null; var8 = (class9) this.field710.method484(this.field697)) {
                    if (var8.field607 == var4 && var8.field611 == var5) {
                        this.field717 = var8;
                    }
                    if (this.field717 != null) {
                        var8.field608 = 0;
                    }
                }
                if (this.field717 != null) {
                    this.field729 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field717.field609 = null;
                        if (this.field717.field610) {
                            class56 var9 = this.field735;
                            synchronized (this.field735) {
                                this.field735.method479(this.field717);
                            }
                        } else {
                            this.field717.method397();
                        }
                        this.field717 = null;
                    } else {
                        if (this.field717.field609 == null && var7 == 0) {
                            this.field717.field609 = new byte[var6];
                        }
                        if (this.field717.field609 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field712 = var7 * 500;
                this.field713 = 500;
                if (this.field713 > var6 - var7 * 500) {
                    this.field713 = var6 - var7 * 500;
                }
            }
            if (this.field713 > 0 && var2 >= this.field713) {
                this.field701 = true;
                byte[] var10 = this.field693;
                int var11 = 0;
                if (this.field717 != null) {
                    var10 = this.field717.field609;
                    var11 = this.field712;
                }
                for (int var12 = 0; var12 < this.field713; var12 += this.field709.read(var10, var11 + var12, this.field713 - var12)) {
                }
                if (this.field713 + this.field712 >= var10.length && this.field717 != null) {
                    if (this.field736.field329[0] != null) {
                        this.field736.field329[this.field717.field607 + 1].method185(0, this.field717.field611, var10, var10.length);
                    }
                    if (!this.field717.field610 && this.field717.field607 == 3) {
                        this.field717.field610 = true;
                        this.field717.field607 = 93;
                    }
                    if (this.field717.field610) {
                        class56 var13 = this.field735;
                        synchronized (this.field735) {
                            this.field735.method479(this.field717);
                        }
                    } else {
                        this.field717.method397();
                    }
                }
                this.field713 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field715.close();
            } catch (Exception var15) {
            }
            this.field715 = null;
            this.field709 = null;
            this.field716 = null;
            this.field713 = 0;
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(III)V")
    public final void method222(int arg0, int arg1, int arg2) {
        if (this.field736.field329[0] == null || (this.field705[arg2][arg1] == 0 || (this.field732[arg2][arg1] == 0 || this.field698 == 0))) {
            return;
        }
        class9 var4 = new class9();
        int var5 = 47 / arg0;
        var4.field607 = arg2;
        var4.field611 = arg1;
        var4.field610 = false;
        class56 var6 = this.field722;
        synchronized (this.field722) {
            this.field722.method479(var4);
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(B)V")
    private final void method223(byte arg0) {
        if (arg0 != -12) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field733 == 0) {
            if (this.field734 >= 10 || this.field698 == 0) {
                return;
            }
            class56 var3 = this.field722;
            class9 var4;
            synchronized (this.field722) {
                var4 = (class9) this.field722.method481();
            }
            while (var4 != null) {
                if (this.field732[var4.field607][var4.field611] != 0) {
                    this.field732[var4.field607][var4.field611] = 0;
                    this.field710.method479(var4);
                    this.method230((byte) 123, var4);
                    this.field701 = true;
                    if (this.field704 < this.field724) {
                        this.field704++;
                    }
                    this.field708 = "Loading extra files - " + this.field704 * 100 / this.field724 + "%";
                    this.field734++;
                    if (this.field734 == 10) {
                        return;
                    }
                }
                class56 var5 = this.field722;
                synchronized (this.field722) {
                    var4 = (class9) this.field722.method481();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field732[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field698) {
                        var7[var9] = 0;
                        class9 var10 = new class9();
                        var10.field607 = var6;
                        var10.field611 = var9;
                        var10.field610 = false;
                        this.field710.method479(var10);
                        this.method230((byte) 123, var10);
                        this.field701 = true;
                        if (this.field704 < this.field724) {
                            this.field704++;
                        }
                        this.field708 = "Loading extra files - " + this.field704 * 100 / this.field724 + "%";
                        this.field734++;
                        if (this.field734 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field698--;
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(BI[BI)Z")
    private final boolean method224(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg2 == null || arg2.length < 2) {
            return false;
        }
        int var5 = arg2.length - 2;
        int var6 = ((arg2[var5] & 0xFF) << 8) + (arg2[var5 + 1] & 0xFF);
        this.field707.reset();
        if (arg0 != 62) {
            throw new NullPointerException();
        }
        this.field707.update(arg2, 0, var5);
        int var7 = (int) this.field707.getValue();
        if (arg3 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(LFIGUVTWB;Lclient;)V")
    public final void method225(class15 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method209(var3[var4], null);
            int var27 = var26.length / 2;
            class33 var28 = new class33(field699, var26);
            this.field705[var4] = new int[var27];
            this.field732[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field705[var4][var29] = var28.method294();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method209(var5[var6], null);
            int var23 = var22.length / 4;
            class33 var24 = new class33(field699, var22);
            this.field723[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field723[var6][var25] = var24.method297();
            }
        }
        byte[] var7 = arg0.method209("model_index", null);
        int var8 = this.field705[0].length;
        this.field694 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field694[var9] = var7[var9];
            } else {
                this.field694[var9] = 0;
            }
        }
        byte[] var10 = arg0.method209("map_index", null);
        class33 var11 = new class33(field699, var10);
        int var12 = var10.length / 7;
        this.field721 = new int[var12];
        this.field706 = new int[var12];
        this.field727 = new int[var12];
        this.field703 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field721[var13] = var11.method294();
            this.field706[var13] = var11.method294();
            this.field727[var13] = var11.method294();
            this.field703[var13] = var11.method292();
        }
        byte[] var14 = arg0.method209("anim_index", null);
        class33 var15 = new class33(field699, var14);
        int var16 = var14.length / 2;
        this.field695 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field695[var17] = var15.method294();
        }
        byte[] var18 = arg0.method209("midi_index", null);
        class33 var19 = new class33(field699, var18);
        int var20 = var18.length;
        this.field730 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field730[var21] = var19.method292();
        }
        this.field736 = arg1;
        this.field718 = true;
        this.field736.method101(this, 2);
    }

    @OriginalMember(owner = "FRNMNGGN", name = "b", descriptor = "(Z)I")
    public final int method226(boolean arg0) {
        return arg0 ? field699 : this.field695.length;
    }

    @OriginalMember(owner = "FRNMNGGN", name = "b", descriptor = "()V")
    public final void method227() {
        this.field718 = false;
    }

    @OriginalMember(owner = "FRNMNGGN", name = "c", descriptor = "(II)Z")
    public final boolean method228(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field721.length; var3++) {
            if (this.field727[var3] == arg0) {
                return true;
            }
        }
        int var4 = 43 / arg1;
        return false;
    }

    @OriginalMember(owner = "FRNMNGGN", name = "d", descriptor = "(II)V")
    public final void method229(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field705.length || arg1 < 0 || arg1 > this.field705[arg0].length || this.field705[arg0][arg1] == 0) {
            return;
        }
        class24 var3 = this.field719;
        synchronized (this.field719) {
            for (class9 var4 = (class9) this.field719.method251(); var4 != null; var4 = (class9) this.field719.method252(this.field697)) {
                if (var4.field607 == arg0 && var4.field611 == arg1) {
                    return;
                }
            }
            class9 var5 = new class9();
            var5.field607 = arg0;
            var5.field611 = arg1;
            var5.field610 = true;
            class56 var6 = this.field696;
            synchronized (this.field696) {
                this.field696.method479(var5);
            }
            this.field719.method249(var5);
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(BLEGGOGKSD;)V")
    private final void method230(byte arg0, class9 arg1) {
        if (arg0 != 123) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            if (this.field715 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field714 < 4000L) {
                    return;
                }
                this.field714 = var4;
                this.field715 = this.field736.method167(client.field390 + 43594);
                this.field709 = this.field715.getInputStream();
                this.field716 = this.field715.getOutputStream();
                this.field716.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field709.read();
                }
                this.field729 = 0;
            }
            this.field693[0] = (byte) arg1.field607;
            this.field693[1] = (byte) (arg1.field611 >> 8);
            this.field693[2] = (byte) arg1.field611;
            if (arg1.field610) {
                this.field693[3] = 2;
            } else if (this.field736.field137) {
                this.field693[3] = 0;
            } else {
                this.field693[3] = 1;
            }
            this.field716.write(this.field693, 0, 4);
            this.field720 = 0;
            this.field725 = -10000;
        } catch (IOException var9) {
            try {
                this.field715.close();
            } catch (Exception var8) {
            }
            this.field715 = null;
            this.field709 = null;
            this.field716 = null;
            this.field713 = 0;
            this.field725++;
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "b", descriptor = "(B)V")
    public final void method231(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field711 = !this.field711;
        }
        class56 var3 = this.field722;
        synchronized (this.field722) {
            this.field722.method486();
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "c", descriptor = "()LEGGOGKSD;")
    public final class9 method232() {
        class56 var1 = this.field735;
        class9 var2;
        synchronized (this.field735) {
            var2 = (class9) this.field735.method481();
        }
        if (var2 == null) {
            return null;
        }
        class24 var3 = this.field719;
        synchronized (this.field719) {
            var2.method400();
        }
        if (var2.field609 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field609));
            while (true) {
                if (this.field702.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field702, var4, this.field702.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field609 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field609[var7] = this.field702[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "FRNMNGGN", name = "b", descriptor = "(I)V")
    private final void method233(int arg0) {
        class56 var2 = this.field696;
        class9 var3;
        synchronized (this.field696) {
            var3 = (class9) this.field696.method481();
        }
        if (arg0 != 0) {
            this.field726 = 335;
        }
        while (var3 != null) {
            this.field701 = true;
            byte[] var4 = null;
            if (this.field736.field329[0] != null) {
                var4 = this.field736.field329[var3.field607 + 1].method184(var3.field611, false);
            }
            if (!this.method224((byte) 62, this.field723[var3.field607][var3.field611], var4, this.field705[var3.field607][var3.field611])) {
                var4 = null;
            }
            class56 var5 = this.field696;
            synchronized (this.field696) {
                if (var4 == null) {
                    this.field731.method479(var3);
                } else {
                    var3.field609 = var4;
                    class56 var6 = this.field735;
                    synchronized (this.field735) {
                        this.field735.method479(var3);
                    }
                }
                var3 = (class9) this.field696.method481();
            }
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(ZZ)V")
    public final void method234(boolean arg0, boolean arg1) {
        int var3 = this.field721.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field703[var4] != 0) {
                this.method217(3, (byte) 2, this.field727[var4], 803);
                this.method217(3, (byte) 2, this.field706[var4], 803);
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(I)V")
    public final void method235(int arg0) {
        this.method229(0, arg0);
    }

    @OriginalMember(owner = "FRNMNGGN", name = "a", descriptor = "(IIZI)I")
    public final int method236(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = (arg1 << 8) + arg3;
        if (!arg2) {
            this.field737 = !this.field737;
        }
        for (int var6 = 0; var6 < this.field721.length; var6++) {
            if (this.field721[var6] == var5) {
                if (arg0 == 0) {
                    return this.field706[var6];
                }
                return this.field727[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "FRNMNGGN", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field718) {
                this.field728++;
                byte var1 = 20;
                if (this.field698 == 0 && this.field736.field329[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field701 = true;
                for (int var2 = 0; var2 < 100 && this.field701; var2++) {
                    this.field701 = false;
                    this.method233(0);
                    this.method237(0);
                    if (this.field733 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method223((byte) -12);
                    if (this.field709 != null) {
                        this.method221(false);
                    }
                }
                boolean var3 = false;
                for (class9 var4 = (class9) this.field710.method482(); var4 != null; var4 = (class9) this.field710.method484(this.field697)) {
                    if (var4.field610) {
                        var3 = true;
                        var4.field608++;
                        if (var4.field608 > 50) {
                            var4.field608 = 0;
                            this.method230((byte) 123, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class9 var5 = (class9) this.field710.method482(); var5 != null; var5 = (class9) this.field710.method484(this.field697)) {
                        var3 = true;
                        var5.field608++;
                        if (var5.field608 > 50) {
                            var5.field608 = 0;
                            this.method230((byte) 123, var5);
                        }
                    }
                }
                if (var3) {
                    this.field729++;
                    if (this.field729 > 750) {
                        try {
                            this.field715.close();
                        } catch (Exception var8) {
                        }
                        this.field715 = null;
                        this.field709 = null;
                        this.field716 = null;
                        this.field713 = 0;
                    }
                } else {
                    this.field729 = 0;
                    this.field708 = "";
                }
                if (this.field736.field137 && this.field715 != null && this.field716 != null && (this.field698 > 0 || this.field736.field329[0] == null)) {
                    this.field720++;
                    if (this.field720 > 500) {
                        this.field720 = 0;
                        this.field693[0] = 0;
                        this.field693[1] = 0;
                        this.field693[2] = 0;
                        this.field693[3] = 10;
                        try {
                            this.field716.write(this.field693, 0, 4);
                        } catch (IOException var7) {
                            this.field729 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "FRNMNGGN", name = "c", descriptor = "(I)V")
    private final void method237(int arg0) {
        this.field733 = 0;
        this.field734 = 0;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (class9 var3 = (class9) this.field710.method482(); var3 != null; var3 = (class9) this.field710.method484(this.field697)) {
            if (var3.field610) {
                this.field733++;
            } else {
                this.field734++;
            }
        }
        while (this.field733 < 10) {
            class9 var4 = (class9) this.field731.method481();
            if (var4 == null) {
                break;
            }
            if (this.field732[var4.field607][var4.field611] != 0) {
                this.field704++;
            }
            this.field732[var4.field607][var4.field611] = 0;
            this.field710.method479(var4);
            this.field733++;
            this.method230((byte) 123, var4);
            this.field701 = true;
        }
    }
}
