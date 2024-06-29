import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class10 {

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "B")
    public byte field104 = 0;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "S")
    public short field101;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "B")
    public byte field113;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "B")
    public byte field116;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "S")
    public short field114;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field97 = 0;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "B")
    public byte field107;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "B")
    public byte field110;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "B")
    public byte field112;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "B")
    public byte field119;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lpm;")
    public class10 field103;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "Llc;")
    public class125 field108;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "Lde;")
    public class164 field102;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "Lde;")
    public class164 field123;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lqj;")
    public static class238 field94;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "Lbr;")
    public class349 field117;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "Lbr;")
    public class349 field120;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "Ls;")
    public class381 field124;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Lis;")
    public class39 field109;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "Lhl;")
    public class60 field121;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "S")
    public short field115;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Z")
    public boolean field105;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "Z")
    public boolean field118;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "Z")
    public boolean field122;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 6)
    public final void method74(byte arg0) {
        if (arg0 != 110) {
            method75(-6);
        }
        field95++;
        while (this.field109 != null) {
            class39 var2 = this.field109.field627;
            this.field109.method302(0);
            this.field109 = var2;
        }
        this.field104 = 0;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(III)V", line = 28)
    public class10(int arg0, int arg1, int arg2) {
        this.field101 = (short) arg1;
        this.field116 = this.field113 = (byte) arg0;
        this.field114 = (short) arg2;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 52)
    public static void method75(int arg0) {
        field94 = null;
        if (arg0 != 1) {
            method76(1, 10, 53, (byte) 113, (class6) null);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIBLkr;)V", line = 64)
    public static final void method76(int arg0, int arg1, int arg2, byte arg3, class6 arg4) {
        field99++;
        long var5 = (long) (arg2 | arg0 << 28 | arg1 << 14);
        class281 var7 = (class281) class231.field3261.method954(-60, var5);
        if (var7 == null) {
            class281 var8 = new class281();
            class231.field3261.method956(false, var5, var8);
            var8.field4135.method2660((byte) -121, arg4);
            return;
        }
        class193 var9 = class166.method1031(arg4.field57, false);
        int var10 = var9.field2686;
        if (var9.field2692 == 1) {
            var10 = (arg4.field52 + 1) * var10;
        }
        for (class6 var11 = (class6) var7.field4135.method2649(arg3 + 55); var11 != null; var11 = (class6) var7.field4135.method2656(0)) {
            class193 var12 = class166.method1031(var11.field57, false);
            int var13 = var12.field2686;
            if (var12.field2692 == 1) {
                var13 = (var11.field52 + 1) * var13;
            }
            if (var13 < var10) {
                class369.method2435(var11, arg4, arg3 ^ 0xFFFFF5CD);
                return;
            }
        }
        if (arg3 != -55) {
            method76(83, -18, -27, (byte) -87, (class6) null);
        }
        var7.field4135.method2660((byte) -124, arg4);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILro;)I", line = 140)
    public static final int method77(int arg0, int arg1, class249 arg2) {
        field106++;
        if (arg2.field3494 == null || arg2.field3494.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg2.field3494[arg1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class237.field3328[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class343.field5035[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class215.field3084[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class249 var12 = class107.method746(var11, -39);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class166.method1031(var13, false).field2754 || class17.field208)) {
                        for (int var14 = 0; var14 < var12.field3567.length; var14++) {
                            if ((var13 + 1) == var12.field3567[var14]) {
                                var8 += var12.field3585[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class192.field2668[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class194.field2770[class343.field5035[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class192.field2668[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class100.field1350.field2780;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class174.field2270[var15]) {
                            var8 += class343.field5035[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class249 var18 = class107.method746(var17, -34);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class166.method1031(var19, false).field2754 || class17.field208)) {
                        for (int var20 = 0; var20 < var18.field3567.length; var20++) {
                            if (var19 + 1 == var18.field3567[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class35.field579;
                }
                if (var7 == 12) {
                    var8 = class280.field4126;
                }
                if (var7 == 13) {
                    int var21 = class192.field2668[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class312.method1952(var23, -1);
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 18) {
                    var8 = (class100.field1350.field5284 >> 7) + class184.field2482;
                }
                if (var7 == 19) {
                    var8 = (class100.field1350.field5298 >> 7) + class38.field620;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            if (arg0 <= 37) {
                method75(92);
            }
            return -1;
        }
    }
}
