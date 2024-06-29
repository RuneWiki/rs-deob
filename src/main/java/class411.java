import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class411 extends class626 {

    @OriginalMember(owner = "client!za", name = "m", descriptor = "[I")
    public static int[] field5691 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!za", name = "h", descriptor = "F")
    public static float field5686;

    @OriginalMember(owner = "client!za", name = "i", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!za", name = "j", descriptor = "Leq;")
    public static class209 field5688;

    // $FF: synthetic field
    @OriginalMember(owner = "client!za", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field5692;

    // $FF: synthetic method
    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2505(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2502(boolean arg0) {
        if (!arg0) {
            method2503(40, -49, -1, -123, -72, 106, 100, null, -63);
        }
        field5691 = null;
        field5688 = null;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIILha;I)V", line = 21)
    public static final void method2503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class58 arg7, int arg8) {
        field5690++;
        class141 var9 = (class141) class654.method3688(arg3, arg2, arg6);
        if (var9 != null) {
            class414 var10 = class66.field1181.method131(2, var9.method1109((byte) -118));
            int var11 = var9.method1111(false) & 0x3;
            int var12 = var9.method1112((byte) -112);
            if (var10.field5755 == -1) {
                int var13 = arg1;
                if (var10.field5737 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg7.method569(false, arg0, var13, arg5, 4);
                    } else if (var11 == 1) {
                        arg7.method525(arg5, 4, var13, -3482, arg0);
                    } else if (var11 == 2) {
                        arg7.method569(false, arg0 + 3, var13, arg5, 4);
                    } else if (var11 == 3) {
                        arg7.method525(arg5 + 3, 4, var13, -3482, arg0);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg7.method542(1, 1, 3854, var13, arg5, arg0);
                    } else if (var11 == 1) {
                        arg7.method542(1, 1, 3854, var13, arg5, arg0 + 3);
                    } else if (var11 == 2) {
                        arg7.method542(1, 1, 3854, var13, arg5 + 3, arg0 + 3);
                    } else if (var11 == 3) {
                        arg7.method542(1, 1, 3854, var13, arg5 + 3, arg0);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg7.method525(arg5, 4, var13, arg8 - 3485, arg0);
                    } else if (var11 == 1) {
                        arg7.method569(false, arg0 + 3, var13, arg5, 4);
                    } else if (var11 == 2) {
                        arg7.method525(arg5 + 3, 4, var13, -3482, arg0);
                    } else if (var11 == 3) {
                        arg7.method569(false, arg0, var13, arg5, 4);
                    }
                }
            } else {
                class722.method4021(arg0, true, var11, arg5, arg7, var10);
            }
        }
        class141 var14 = (class141) class470.method2853(arg3, arg2, arg6, field5692 == null ? (field5692 = method2505("wk")) : field5692);
        if (var14 != null) {
            class414 var15 = class66.field1181.method131(2, var14.method1109((byte) 114));
            int var16 = var14.method1111(false) & 0x3;
            int var17 = var14.method1112((byte) 99);
            if (var15.field5755 != -1) {
                class722.method4021(arg0, true, var16, arg5, arg7, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field5737 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg7.method629(arg5, false, arg0 + 3, arg0, var18, arg5 + 3);
                } else {
                    arg7.method629(arg5 + 3, false, arg0 + 3, arg0, var18, arg5);
                }
            }
        }
        if (arg8 != 3) {
            return;
        }
        class141 var19 = (class141) class158.method1202(arg3, arg2, arg6);
        if (var19 == null) {
            return;
        }
        class414 var20 = class66.field1181.method131(2, var19.method1109((byte) -104));
        int var21 = var19.method1111(false) & 0x3;
        if (var20.field5755 != -1) {
            class722.method4021(arg0, true, var21, arg5, arg7, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V", line = 165)
    public static final void method2504(int arg0) {
        class414.method2519(class471.field6781.field6677.method2540(27669), 9349);
        field5687++;
        int var1 = (class685.field9660 >> 12) + (class115.field1845 >> 3);
        class312.field4409 = class468.field6748.field649 = 0;
        int var2 = (class260.field3810 >> 12) + (class64.field1160 >> 3);
        class468.field6748.method2195(false, 8, 8);
        byte var3 = 18;
        class190.field2739 = new byte[var3][];
        class109.field1777 = new int[var3];
        class35.field463 = new int[var3][4];
        class430.field6023 = new byte[var3][];
        class412.field5705 = new int[var3];
        class493.field7032 = new int[var3];
        class68.field1233 = new int[var3];
        class630.field9040 = new byte[var3][];
        class390.field5453 = new int[var3];
        class190.field2743 = new byte[var3][];
        class561.field7959 = new int[var3];
        class697.field9800 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class174.field2540 >> 4)) / 8; var5 <= (var1 + (class174.field2540 >> 4)) / 8; var5++) {
            for (int var8 = (var2 - (class716.field9999 >> 4)) / 8; var8 <= (((class716.field9999 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class412.field5705[var4] = var9;
                class561.field7959[var4] = class391.field5460.method1482(-1, "m" + var5 + "_" + var8);
                class68.field1233[var4] = class391.field5460.method1482(-1, "l" + var5 + "_" + var8);
                class493.field7032[var4] = class391.field5460.method1482(-1, "n" + var5 + "_" + var8);
                class390.field5453[var4] = class391.field5460.method1482(-1, "um" + var5 + "_" + var8);
                class109.field1777[var4] = class391.field5460.method1482(-1, "ul" + var5 + "_" + var8);
                if (class493.field7032[var4] == -1) {
                    class561.field7959[var4] = -1;
                    class68.field1233[var4] = -1;
                    class390.field5453[var4] = -1;
                    class109.field1777[var4] = -1;
                }
                var4++;
            }
        }
        if (arg0 < 31) {
            method2504(126);
        }
        for (int var6 = var4; var6 < class493.field7032.length; var6++) {
            class493.field7032[var6] = -1;
            class561.field7959[var6] = -1;
            class68.field1233[var6] = -1;
            class390.field5453[var6] = -1;
            class109.field1777[var6] = -1;
        }
        byte var7;
        if (class611.field8839 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class68.method709(false, var1, -1, var7, var2);
    }
}
