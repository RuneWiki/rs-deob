import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class206 extends class117 {

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lkr;")
    public class486 field3143 = new class486();

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Lfj;")
    public class432 field3158 = new class432();

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lhi;")
    private class125 field3145;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lus;")
    public static class1 field3150 = new class1(63, 2);

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Lbg;")
    public static class298 field3159;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "Lus;")
    public static class1 field3160;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Z")
    public static boolean field3156;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILep;)V")
    private final void method1348(int arg0, int arg1, class265 arg2) {
        field3152++;
        if ((this.field3145.field1606[arg2.field3876] & 0x4) != 0 && arg2.field3860 < 0) {
            int var4 = this.field3145.field1600[arg2.field3876] / class31.field409;
            int var5 = (var4 + 1048575 - arg2.field3875) / var4;
            arg2.field3875 = arg0 * var4 + arg2.field3875 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field3145.field1592[arg2.field3876] == 0) {
                    arg2.field3872 = class12.method68(arg2.field3863, arg2.field3872.method55(), arg2.field3872.method75(), arg2.field3872.method87());
                } else {
                    arg2.field3872 = class12.method68(arg2.field3863, arg2.field3872.method55(), 0, arg2.field3872.method87());
                    this.field3145.method757(arg2.field3857.field3794[arg2.field3858] < 0, arg2, 121);
                }
                if (arg2.field3857.field3794[arg2.field3858] < 0) {
                    arg2.field3872.method57(-1);
                }
                arg0 = arg2.field3875 / var4;
            }
        }
        arg2.field3872.method67(arg0);
        int var6 = -50 % ((-arg1 - 30) / 52);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public final void method67(int arg0) {
        field3146++;
        this.field3158.method67(arg0);
        for (class265 var2 = (class265) this.field3143.method2843(1123227612); var2 != null; var2 = (class265) this.field3143.method2842(1673506446)) {
            if (!this.field3145.method787(-222632121, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field3865 >= var3) {
                        this.method1348(var3, -117, var2);
                        var2.field3865 -= var3;
                        break;
                    }
                    this.method1348(var2.field3865, 73, var2);
                    var3 -= var2.field3865;
                } while (!this.field3145.method774((byte) -128, var3, var2, (int[]) null, 0));
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V")
    public static final void method1349(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << arg1;
        int var5 = arg0 << 3;
        field3147++;
        int var6 = arg2 << 3;
        class157.field2346 = (float) var6;
        if (class136.field1807 == 2) {
            class214.field3219 = var4;
            class140.field1861 = var5;
            class30.field407 = var6;
        }
        class483.field6806 = (float) var4;
        class153.method963((byte) 91);
        class132.field1732 = true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method1350(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class258.field3772++;
        class187.field2778 = 0;
        for (int var6 = class346.field5020; var6 < class314.field4441; var6++) {
            class88[][] var17 = class330.field4786[var6];
            for (int var18 = class398.field5653; var18 < class3.field32; var18++) {
                for (int var19 = class120.field1505; var19 < class466.field6557; var19++) {
                    class88 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class386.field5483[var18 + class36.field463 - class58.field770][var19 + class36.field463 - class214.field3218] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field1084 = true;
                            var20.field1089 = true;
                            if (var20.field1068 == null) {
                                var20.field1072 = false;
                            } else {
                                var20.field1072 = true;
                            }
                            class187.field2778++;
                        } else {
                            var20.field1084 = false;
                            var20.field1089 = false;
                            var20.field1083 = 0;
                            if (var18 >= class58.field770 - 16 && var18 <= class58.field770 + 16 && var19 >= class214.field3218 - 16 && var19 <= class214.field3218 + 16 && (var20.field1078 != null || var20.field1082 != null || var20.field1087 != null || var20.field1066 != null || var20.field1070 != null || var20.field1068 != null)) {
                                class405.field5702.method1049((byte) 121, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class53.field725 == class28.field388;
        for (int var8 = class346.field5020; var8 < class314.field4441; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class456.field6417.method655() && var8 >= arg2 && arg1 != null) {
                int var10 = class386.field5483.length;
                if (class386.field5483.length + class398.field5653 > class287.field4186) {
                    var10 -= class386.field5483.length + class398.field5653 - class287.field4186;
                }
                int var11 = class386.field5483[0].length;
                if (class386.field5483[0].length + class120.field1505 > class360.field5188) {
                    var11 -= class386.field5483[0].length + class120.field1505 - class360.field5188;
                }
                int var12 = class195.field2860;
                while (true) {
                    if (var12 >= var10) {
                        class405.field5702.method1043(var8, var9, class53.field725[var8], true, 1);
                        break;
                    }
                    int var13 = class398.field5653 + var12 - class195.field2860;
                    for (int var14 = class120.field1511; var14 < var11; var14++) {
                        class271.field3950[var12][var14] = false;
                        if (class386.field5483[var12][var14]) {
                            int var15 = class120.field1505 + var14 - class120.field1511;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class330.field4786[var16][var13][var15] != null && class330.field4786[var16][var13][var15].field1080 == var8) {
                                    class271.field3950[var12][var14] = class330.field4786[var16][var13][var15].field1084;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class405.field5702.method1043(var8, var9, class53.field725[var8], false, 1);
            }
            class405.field5702.method1047(99);
        }
        if (!class446.method2607(true)) {
            class446.method2607(false);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[IIIILep;)V")
    private final void method1351(int arg0, int[] arg1, int arg2, int arg3, int arg4, class265 arg5) {
        if ((this.field3145.field1606[arg5.field3876] & 0x4) != 0 && arg5.field3860 < 0) {
            int var7 = this.field3145.field1600[arg5.field3876] / class31.field409;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field3875) / var7;
                if (arg3 < var8) {
                    arg5.field3875 += arg3 * var7;
                    break;
                }
                arg5.field3872.method52(arg1, arg4, var8);
                arg3 -= var8;
                arg5.field3875 += var7 * var8 - 1048576;
                arg4 += var8;
                int var9 = class31.field409 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class12 var11 = arg5.field3872;
                if (this.field3145.field1592[arg5.field3876] == 0) {
                    arg5.field3872 = class12.method68(arg5.field3863, var11.method55(), var11.method75(), var11.method87());
                } else {
                    arg5.field3872 = class12.method68(arg5.field3863, var11.method55(), 0, var11.method87());
                    this.field3145.method757(arg5.field3857.field3794[arg5.field3858] < 0, arg5, arg2 ^ 0xFFFF9145);
                    arg5.field3872.method79(var9, var11.method75());
                }
                if (arg5.field3857.field3794[arg5.field3858] < 0) {
                    arg5.field3872.method57(-1);
                }
                var11.method62(var9);
                var11.method52(arg1, arg4, arg0 - arg4);
                if (var11.method76()) {
                    this.field3158.method2559(var11);
                }
            }
        }
        if (arg2 != -28373) {
            field3150 = null;
        }
        field3153++;
        arg5.field3872.method52(arg1, arg4, arg3);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static void method1352(int arg0) {
        field3159 = null;
        field3160 = null;
        field3150 = null;
        if (arg0 != -6417) {
            method1353(-59, (byte) 42);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
    public static final void method1353(int arg0, byte arg1) {
        class460.field6441 = arg0;
        if (arg1 != -80) {
            field3156 = false;
        }
        field3151++;
        class232 var2 = class458.field6420;
        synchronized (class458.field6420) {
            class458.field6420.method1478((byte) -83);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()I")
    public final int method73() {
        field3144++;
        return 0;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "([III)V")
    public final void method52(int[] arg0, int arg1, int arg2) {
        field3149++;
        this.field3158.method52(arg0, arg1, arg2);
        for (class265 var4 = (class265) this.field3143.method2843(1123227612); var4 != null; var4 = (class265) this.field3143.method2842(1673506446)) {
            if (!this.field3145.method787(-222632121, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3865) {
                        this.method1351(var5 + var6, arg0, -28373, var5, var6, var4);
                        var4.field3865 -= var5;
                        break;
                    }
                    this.method1351(var5 + var6, arg0, -28373, var4.field3865, var6, var4);
                    var5 -= var4.field3865;
                    var6 += var4.field3865;
                } while (!this.field3145.method774((byte) -94, var5, var4, arg0, var6));
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()Lme;")
    public final class117 method48() {
        field3154++;
        class265 var1;
        do {
            var1 = (class265) this.field3143.method2842(1673506446);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3872 == null);
        return var1.field3872;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()Lme;")
    public final class117 method72() {
        field3148++;
        class265 var1 = (class265) this.field3143.method2843(1123227612);
        if (var1 == null) {
            return null;
        } else if (var1.field3872 == null) {
            return this.method48();
        } else {
            return var1.field3872;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lhi;)V")
    public class206(class125 arg0) {
        this.field3145 = arg0;
    }

    static {
        new class326("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field3159 = null;
        field3160 = new class1(33, 6);
    }
}
