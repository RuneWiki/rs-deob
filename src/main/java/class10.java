import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class10 extends class152 {

    @OriginalMember(owner = "client!l", name = "T", descriptor = "[I")
    private int[] field127 = new int[3];

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    private int field125 = 4096;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    private int field132 = 4096;

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "I")
    private int field140 = 409;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "I")
    private int field135 = 4096;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "Lce;")
    public static class126 field133 = class206.method1445(-7923, "(U0a )2 in: ");

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "I")
    public static int field134 = 0;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "Lce;")
    public static class126 field130 = class206.method1445(-7923, "::rect_debug");

    @OriginalMember(owner = "client!l", name = "X", descriptor = "Lce;")
    public static class126 field131 = class206.method1445(-7923, "(U0a )2 via: ");

    @OriginalMember(owner = "client!l", name = "db", descriptor = "I")
    public static int field137 = 0;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!l", name = "ib", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(II)[[I", line = 7)
    public final int[][] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            method57(-21);
        }
        int[][] var3 = this.field2775.method319(-70, arg1);
        if (this.field2775.field775) {
            int[][] var4 = this.method1133(arg1, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class244.field4133; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field127[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field140 < var13) {
                    var7[var11] = var12;
                    var8[var11] = var6[var11];
                    var10[var11] = var9[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field127[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field140) {
                        int var16 = var9[var11];
                        int var17 = var16 - this.field127[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field140) {
                            var7[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field132 * var12 >> 12;
                            var8[var11] = this.field125 * var14 >> 12;
                            var10[var11] = this.field135 * var16 >> 12;
                        }
                    } else {
                        var7[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var9[var11];
                    }
                }
            }
        }
        field136++;
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 256)
    public class10() {
        super(1, false);
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V", line = 106)
    public static final void method57(int arg0) {
        if (arg0 != -15706) {
            method62((byte) 49);
        }
        class81.field1309.method1185(1);
        class160.field2889.method1185(1);
        field142++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILbb;)V", line = 118)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            this.field125 = -112;
        }
        if (arg1 == 0) {
            this.field140 = arg2.method942(true);
        } else if (arg1 == 1) {
            this.field135 = arg2.method942(true);
        } else if (arg1 == 2) {
            this.field125 = arg2.method942(true);
        } else if (arg1 == 3) {
            this.field132 = arg2.method942(true);
        } else if (arg1 == 4) {
            int var5 = arg2.method949(arg0 + 20724);
            this.field127[0] = class47.method289(267386880, var5 << 4);
            this.field127[1] = class47.method289(4080, var5 >> 4);
            this.field127[2] = class47.method289(255, var5) >> 12;
        }
        field141++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZLcc;Lcc;)V", line = 191)
    public static final void method58(int arg0, boolean arg1, class313 arg2, class313 arg3) {
        class306.field5135 = arg3;
        class209.field3566 = arg2;
        field138++;
        if (arg0 != -22413) {
            method58(79, false, (class313) null, (class313) null);
        }
        class286.field4734 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V", line = 207)
    public static final void method59(int arg0) {
        class291.field4825 = new class112[class127.field2196.method2174(arg0 ^ arg0)][];
        class136.field2363 = new boolean[class127.field2196.method2174(0)];
        field129++;
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V", line = 235)
    public static void method60(int arg0) {
        if (arg0 == 364953964) {
            field130 = null;
            field131 = null;
            field133 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILvh;)V", line = 268)
    public static final void method61(int arg0, class147 arg1) {
        field139++;
        class287.field4776 = 3;
        if (arg0 != -12114) {
            field137 = -43;
        }
        class222 var2 = null;
        class182.method1306(true, true);
        class74.field1200 = true;
        class44.field677 = true;
        class205.field3523 = 127;
        class13.field172 = true;
        class226.field3814 = 0;
        class94.field1474 = true;
        class55.field836 = 2;
        class214.field3644 = true;
        class22.field300 = 0;
        class95.field1503 = 0;
        class301.field5016 = true;
        class280.field4660 = true;
        class44.field684 = true;
        class159.field2866 = 255;
        class32.field472 = true;
        class212.field3613 = 0;
        class69.field1144 = 127;
        class249.field4166 = true;
        class40.field640 = true;
        if (class283.field4716 < 96) {
            class211.method1475(0);
        } else {
            class211.method1475(2);
        }
        class68.field1121 = false;
        class267.field4534 = false;
        class297.field4942 = true;
        class228.field3846 = false;
        class189.field3242 = 0;
        class143.field2607 = 0;
        class71.field1163 = 0;
        try {
            class60 var3 = arg1.method1100((byte) 74, "runescape");
            while (var3.field965 == 0) {
                class313.method2158(1L, true);
            }
            if (var3.field965 == 1) {
                var2 = (class222) var3.field967;
                byte[] var4 = new byte[(int) var2.method1528(30736)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1526(var5, var4, var4.length - var5, true);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class286.method1902(arg0 ^ 0x2F51, new class134(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method1525(0);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(B)Ljk;", line = 350)
    public static final class273 method62(byte arg0) {
        field128++;
        if (arg0 != -59) {
            field130 = (class126) null;
        }
        int var1 = class279.field4643[0] * class263.field4389[0];
        int[] var2 = new int[var1];
        byte[] var3 = class190.field3255[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class241.field4062[class47.method289(var3[var4], 255)];
        }
        class273 var5;
        if (class56.field846) {
            var5 = new class198(class307.field5187, class290.field4802, class27.field386[0], class63.field1032[0], class279.field4643[0], class263.field4389[0], var2);
        } else {
            var5 = new class184(class307.field5187, class290.field4802, class27.field386[0], class63.field1032[0], class279.field4643[0], class263.field4389[0], var2);
        }
        class197.method1395((byte) 127);
        return var5;
    }
}
