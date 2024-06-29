import java.awt.Component;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[B")
    private byte[] field71 = new byte[4];

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lle;")
    private class81 field79;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "J")
    private long field94;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lfc;")
    private static class39 field76 = class90.method774("Please close the interface you have open before using (Wreport abuse(W", -92);

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lfc;")
    public static class39 field85 = class90.method774("Lade Titelbild )2 ", -84);

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field81 = 0;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field92 = 20;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field78 = 0;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lfc;")
    public static class39 field87 = class90.method774("Gegenstand f-Ur Mitglieder", -127);

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
    public static int[] field70 = new int[200];

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "Lfc;")
    private static class39 field93 = class90.method774("Report abuse", -93);

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "Lfc;")
    public static class39 field95 = class90.method774("sl_flags", -80);

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lfc;")
    public static class39 field86 = class90.method774("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3", -88);

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "Lfc;")
    private static class39 field96 = class90.method774("Loaded input handler", -127);

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Lfc;")
    public static class39 field89 = field93;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "Lfc;")
    public static class39 field100 = field76;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lfc;")
    public static class39 field77 = field96;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "J")
    public static long field73;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lue;")
    public static class141 field88;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field74;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[B")
    private byte[] field69;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ltc;Ljava/net/URL;)V", line = 403)
    public class3(class133 arg0, URL arg1) {
        this.field79 = arg0.method1085(2699, arg1);
        this.field75 = 0;
        this.field94 = class29.method361(-5321) + 30000L;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILjava/awt/Component;)Llf;", line = 32)
    public static final class82 method23(int arg0, int arg1, int arg2, Component arg3) {
        field101++;
        try {
            Class var4 = Class.forName("kd");
            class82 var5 = (class82) var4.getDeclaredConstructor().newInstance();
            var5.method130(arg0, arg2, arg3, arg1);
            return var5;
        } catch (Throwable var7) {
            class9 var6 = new class9();
            var6.method130(arg0, arg2, arg3, 0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 55)
    public static final void method24(int arg0) {
        field97++;
        int var1 = 88 % ((arg0 + 16) / 37);
        for (class14 var2 = (class14) class115.field3022.method8(-1); var2 != null; var2 = (class14) class115.field3022.method9(1)) {
            if (class24.field661 != var2.field356 || var2.field359) {
                var2.method1170(111);
            } else if (var2.field353 <= class70.field1654) {
                var2.method156(client.field547, (byte) 19);
                if (var2.field359) {
                    var2.method1170(11);
                } else {
                    class139.field3503.method52(var2.field356, var2.field358, var2.field360, var2.field351, 60, var2, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 109)
    public static final void method25(int arg0) {
        field68++;
        short var1 = 256;
        if (field98 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field98 > 768) {
                    class92.field2161[var2] = class65.method628((byte) 109, class151.field3737[var2], class147.field3675[var2], 1024 - field98);
                } else if (field98 <= 256) {
                    class92.field2161[var2] = class65.method628((byte) 118, class147.field3675[var2], class151.field3737[var2], 256 - field98);
                } else {
                    class92.field2161[var2] = class147.field3675[var2];
                }
            }
        } else if (class131.field3319 <= 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                class92.field2161[var3] = class151.field3737[var3];
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class131.field3319 > 768) {
                    class92.field2161[var4] = class65.method628((byte) 49, class151.field3737[var4], class116.field3062[var4], 1024 - class131.field3319);
                } else if (class131.field3319 <= 256) {
                    class92.field2161[var4] = class65.method628((byte) 114, class116.field3062[var4], class151.field3737[var4], 256 - class131.field3319);
                } else {
                    class92.field2161[var4] = class116.field3062[var4];
                }
            }
        }
        int var5 = 0;
        class152.method1216(0, 9, 128, var1 + 7);
        class66.field1573.method119(0, 0);
        class152.method1220();
        int var6 = 6885;
        for (int var7 = 1; var7 < var1 - 1; var7++) {
            int var20 = (var1 - var7) * class39.field1091[var7] / var1;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class61.field1504[var5++];
                if (var23 == 0) {
                    var6++;
                } else {
                    int var25 = 256 - var23;
                    int var26 = class92.field2161[var23];
                    int var27 = class101.field2530.field1829[var6];
                    class101.field2530.field1829[var6++] = class87.method747(-16711936, class87.method747(16711935, var27) * var25 + var23 * class87.method747(var26, 16711935)) + class87.method747(class87.method747(65280, var27) * var25 + class87.method747(65280, var26) * var23, 16711680) >> 8;
                }
            }
            var6 += var21 + 637;
        }
        int var8 = 7546;
        if (arg0 <= 9) {
            return;
        }
        class152.method1216(637, 9, 765, var1 + 7);
        int var9 = 0;
        class113.field2960.method119(382, 0);
        class152.method1220();
        for (int var10 = 1; var10 < var1 - 1; var10++) {
            int var11 = (var1 - var10) * class39.field1091[var10] / var1;
            int var12 = var8 + var11;
            int var13 = 103 - var11;
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = class61.field1504[var9++];
                if (var15 == 0) {
                    var12++;
                } else {
                    int var16 = 256 - var15;
                    int var18 = class92.field2161[var15];
                    int var19 = class101.field2530.field1829[var12];
                    class101.field2530.field1829[var12++] = class87.method747(var16 * class87.method747(var19, 65280) + class87.method747(var18, 65280) * var15, 16711680) + class87.method747(-16711936, var15 * class87.method747(16711935, var18) + var16 * class87.method747(16711935, var19)) >> 8;
                }
            }
            var9 += 128 - var13;
            var8 = var12 + 765 - var11 - var13;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)[B", line = 286)
    public final byte[] method26(boolean arg0) throws IOException {
        field102++;
        if (class29.method361(-5321) > this.field94) {
            throw new IOException("fdt");
        }
        if (this.field75 == 0) {
            if (this.field79.field1816 == 2) {
                throw new IOException("fds");
            }
            if (this.field79.field1816 == 1) {
                this.field75 = 1;
                this.field74 = (DataInputStream) this.field79.field1820;
            }
        }
        if (this.field75 == 1) {
            int var2 = this.field74.available();
            if (var2 > 0) {
                if (this.field83 + var2 > 4) {
                    var2 = 4 - this.field83;
                }
                this.field83 += this.field74.read(this.field71, this.field83, var2);
                if (this.field83 == 4) {
                    int var3 = (new class25(this.field71)).method313((byte) -88);
                    this.field75 = 2;
                    this.field69 = new byte[var3];
                }
            }
        }
        if (arg0) {
            return null;
        }
        if (this.field75 == 2) {
            int var4 = this.field74.available();
            if (var4 > 0) {
                if (this.field69.length < this.field99 + var4) {
                    var4 = this.field69.length - this.field99;
                }
                this.field99 += this.field74.read(this.field69, this.field99, var4);
                if (this.field69.length == this.field99) {
                    return this.field69;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)Z", line = 355)
    public static final boolean method27(byte arg0, int arg1) {
        if (arg0 != -72) {
            method23(-38, 83, -3, null);
        }
        field80++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V", line = 375)
    public static void method28(int arg0) {
        field96 = null;
        field76 = null;
        field89 = null;
        field85 = null;
        field86 = null;
        field95 = null;
        field77 = null;
        field70 = null;
        if (arg0 >= 83) {
            field93 = null;
            field100 = null;
            field87 = null;
            field88 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIB)V", line = 429)
    public static final void method29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field90++;
        int var7 = 2048 - arg0 & 0x7FF;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 0;
        int var10 = arg3;
        int var11 = 0;
        if (var7 != 0) {
            int var12 = class40.field1114[var7];
            int var13 = class40.field1124[var7];
            int var14 = var11 * var12 - arg3 * var13 >> 16;
            var10 = arg3 * var12 + var11 * var13 >> 16;
            var11 = var14;
        }
        if (var8 != 0) {
            int var15 = class40.field1124[var8];
            int var16 = class40.field1114[var8];
            int var17 = var9 * var16 + var10 * var15 >> 16;
            var10 = var10 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class121.field3160 = arg4;
        class104.field2631 = arg1 - var11;
        class78.field1778 = arg2 - var10;
        class87.field2022 = arg5 - var9;
        class39.field1104 = arg0;
        int var18 = -96 % ((arg6 + 54) / 46);
    }
}
