import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class54 extends class578 {

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "[I")
    public static int[] field611 = new int[32];

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field615 = 0;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "F")
    public static float field612;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Ljava/awt/Frame;")
    public static Frame field613;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public static final void method410(int arg0) {
        field614++;
        if (arg0 != -1) {
            field611 = null;
        }
        for (int var1 = 0; var1 < class325.field4430; var1++) {
            class598.field8361[var1] = null;
        }
        class325.field4430 = 0;
        for (int var2 = 0; var2 < class107.field1493; var2++) {
            for (int var42 = 0; var42 < class335.field4511; var42++) {
                for (int var43 = 0; var43 < class643.field8878; var43++) {
                    class390 var44 = class295.field4051[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field5535 > 0) {
                            var44.field5535 = (short) (var44.field5535 * -1);
                        }
                        if (var44.field5527 > 0) {
                            var44.field5527 = (short) (var44.field5527 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class107.field1493; var3++) {
            for (int var4 = 0; var4 < class335.field4511; var4++) {
                for (int var5 = 0; var5 < class643.field8878; var5++) {
                    class390 var6 = class295.field4051[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class295.field4051[0][var5][var4] != null && class295.field4051[0][var5][var4].field5534 != null;
                        if (var6.field5527 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class390 var12 = class295.field4051[var3][var5][var4 - 1];
                            int var13 = class497.field6766[var3].method332(var4, arg0 ^ 0xFFFFFFFE, var5);
                            while (var8 > 0 && var12 != null && var12.field5527 < 0 && var6.field5527 == var12.field5527 && var6.field5528 == var12.field5528 && var13 == class497.field6766[var3].method332(var8 - 1, 1, var5) && ((var8 - 1) <= 0 || var13 == class497.field6766[var3].method332(var8 - 2, 1, var5))) {
                                var8--;
                                var12 = class295.field4051[var3][var5][var8 - 1];
                            }
                            for (class390 var14 = class295.field4051[var3][var5][var4 + 1]; class643.field8878 > var9 && var14 != null && var14.field5527 < 0 && var6.field5527 == var14.field5527 && var6.field5528 == var14.field5528 && class497.field6766[var3].method332(var9 + 1, 1, var5) == var13 && ((var9 + 1) >= class643.field8878 || var13 == class497.field6766[var3].method332(var9 + 2, 1, var5)); var14 = class295.field4051[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class497.field6766[var7 ? var3 + 1 : var3].method332(var8, 1, var5);
                            int var17 = var6.field5527 * var15 + var16;
                            int var18 = class497.field6766[var7 ? var3 + 1 : var3].method332(var9 + 1, 1, var5);
                            int var19 = var18 + (var6.field5527 * var15);
                            int var20 = var5 << class588.field8259;
                            int var21 = var8 << class588.field8259;
                            int var22 = (var9 << class588.field8259) + class631.field8750;
                            class598.field8361[class325.field4430++] = new class209(1, var3, var6.field5528 + var20, var6.field5528 + var20, var6.field5528 + var20, var20 - -var6.field5528, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class295.field4051[var23][var5][var24].field5527 = (short) (class295.field4051[var23][var5][var24].field5527 * -1);
                                }
                            }
                        }
                        if (var6.field5535 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class390 var29 = class295.field4051[var3][var5 - 1][var4];
                            int var30 = class497.field6766[var3].method332(var4, 1, var5);
                            while (var25 > 0 && var29 != null && var29.field5535 < 0 && var6.field5535 == var29.field5535 && var6.field5526 == var29.field5526 && class497.field6766[var3].method332(var4, 1, var25 - 1) == var30 && (var25 - 1 <= 0 || var30 == class497.field6766[var3].method332(var4, arg0 ^ 0xFFFFFFFE, var25 - 2))) {
                                var25--;
                                var29 = class295.field4051[var3][var25 - 1][var4];
                            }
                            for (class390 var31 = class295.field4051[var3][var5 + 1][var4]; var26 < class335.field4511 && var31 != null && var31.field5535 < 0 && var6.field5535 == var31.field5535 && var6.field5526 == var31.field5526 && class497.field6766[var3].method332(var4, 1, var26 + 1) == var30 && (class335.field4511 <= var26 + 1 || var30 == class497.field6766[var3].method332(var4, 1, var26 + 2)); var31 = class295.field4051[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class497.field6766[var7 ? var3 + 1 : var3].method332(var4, 1, var25);
                            int var34 = var6.field5535 * var32 + var33;
                            int var35 = class497.field6766[var7 ? var3 + 1 : var3].method332(var4, 1, var26 + 1);
                            int var36 = var6.field5535 * var32 + var35;
                            int var37 = var25 << class588.field8259;
                            int var38 = (var26 << class588.field8259) + class631.field8750;
                            int var39 = var4 << class588.field8259;
                            class598.field8361[class325.field4430++] = new class209(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var39 + var6.field5526, var6.field5526 + var39, var39 + var6.field5526, var6.field5526 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class295.field4051[var40][var41][var4].field5535 = (short) (class295.field4051[var40][var41][var4].field5535 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class12.field122 = true;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public static void method411(int arg0) {
        field613 = null;
        field611 = null;
        if (arg0 != 1) {
            method410(-83);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method412(String arg0, byte arg1) {
        field616++;
        if (class120.field1657.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class120.field1657.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class120.field1657.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else {
            if (arg1 <= 67) {
                field613 = null;
            }
            return null;
        }
    }
}
