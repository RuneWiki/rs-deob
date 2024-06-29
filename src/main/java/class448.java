import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class448 {

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public int field6351;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "Ldm;")
    public static class46 field6352 = new class46();

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field6355;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hr", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field6356;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hr", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field6357;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Z")
    public static final boolean method2644(byte arg0, Class arg1, String arg2) {
        field6355++;
        Class var3 = (Class) class91.field1424.get(arg2);
        if (var3 == null) {
            Object var4 = null;
            File var5 = (File) class469.field6604.get(arg2);
            if (arg0 != -69) {
                method2646((byte) 86, -34, null);
            }
            if (var5 != null) {
                try {
                    var5 = new File(var5.getCanonicalPath());
                    Class var6 = Class.forName("java.lang.Runtime");
                    Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var8.invoke(var9, Boolean.TRUE);
                    var9.invoke(Runtime.getRuntime(), arg1, var5.getPath());
                    var8.invoke(var9, Boolean.FALSE);
                    class91.field1424.put(arg2, arg1);
                    return true;
                } catch (NoSuchMethodException var10) {
                    System.load(var5.getPath());
                    class91.field1424.put(arg2, field6356 == null ? (field6356 = method2647("ub")) : field6356);
                    return true;
                } catch (Throwable var11) {
                }
            }
            return false;
        } else if (var3.getClassLoader() == arg1.getClassLoader()) {
            return true;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static void method2645(int arg0) {
        if (arg0 == -10) {
            field6352 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BILqa;)Z")
    public static final boolean method2646(byte arg0, int arg1, class207 arg2) {
        field6353++;
        int var3 = (class32.field513 - 104) / 2;
        int var4 = (class611.field8786 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg1; var58 <= 3; var58++) {
                    if (class454.method2667(var6, true, arg1, var57, var58)) {
                        int var59 = var58;
                        if (class414.method2493(var57, false, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class585.method3429(var6, var59, var57, (byte) 50);
                        }
                    }
                }
            }
        }
        if (arg0 <= 103) {
            field6352 = null;
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class143.field2208 = arg2.method1363(var7, 0, 512, 512, 512);
        class6.method38((byte) 40);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (238 - (-((int) (Math.random() * 20.0D)) - -10)) | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class543.field7554 + 1][class543.field7554 + 1];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class543.field7554) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class543.field7554) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var37 += 4;
                    var39 = var13 - 1;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class543.field7554 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class543.field7554 + var36;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg2.method1308(0, 0, class543.field7554 * 4 + var37, class543.field7554 * 4 + var38);
                arg2.method1274(-16777216);
                for (int var43 = arg1; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class543.field7554; var50++) {
                        for (int var56 = 0; var56 <= class543.field7554; var56++) {
                            var12[var50][var56] = class454.method2667(var39 + var50, true, arg1, var40 + var56, var43);
                        }
                    }
                    class608.field8767[var43].method1100(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class165.field2380) {
                        for (int var51 = -4; var51 < class543.field7554; var51++) {
                            for (int var52 = -4; var52 < class543.field7554; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var3 <= var53 && var4 <= var54 && class454.method2667(var53, true, arg1, var54, var43)) {
                                    int var55 = var43;
                                    if (class414.method2493(var54, false, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class130.method887(var10, var51 * 4 + var37, var55, arg2, (byte) -127, var38 - (4 - ((class543.field7554 - var52) * 4)), var54, var9, var53);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class165.field2380) {
                    class145 var44 = class428.field6075[arg1];
                    for (int var45 = 0; var45 < class543.field7554; var45++) {
                        for (int var46 = 0; var46 < class543.field7554; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field2253[var47 - var44.field2243][var48 - var44.field2244];
                            if ((var49 & 0x40240000) != 0) {
                                arg2.method1368((class543.field7554 - var46) * 4 + var38 - 4, 4, 4, -1713569622, var45 * 4 + var37, (byte) -16);
                            } else if ((var49 & 0x800000) != 0) {
                                arg2.method1316(-1713569622, 4, 0, (class543.field7554 - var46) * 4 + var38 - 4, var45 * 4 + var37);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg2.method1335((class543.field7554 - var46) * 4 + var38 - 4, 4, 0, -1713569622, var37 + (var45 * 4) + 3);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg2.method1316(-1713569622, 4, 0, (class543.field7554 - var46) * 4 + var38 + 3 - 4, var37 - -(var45 * 4));
                            } else if ((var49 & 0x20000000) != 0) {
                                arg2.method1335(var38 + ((-var46 + class543.field7554) * 4) - 4, 4, 0, -1713569622, var37 + (var45 * 4));
                            }
                        }
                    }
                }
                arg2.method1321(var37, var38, class543.field7554 * 4, class543.field7554 * 4, var11, 2);
                class143.field2208.method494((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class543.field7554 * 4), class543.field7554 * 4, class543.field7554 * 4, var37, var38);
            }
        }
        arg2.method1269();
        arg2.method1274(-16777215);
        class40.method413(-101);
        class370.field5018 = 0;
        class257.field3568.method465(true);
        if (!class165.field2380) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; arg1 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class454.method2667(var14, true, arg1, var20, var21)) {
                            class115 var22 = (class115) class404.method2411(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class115) class582.method3324(var21, var14, var20, field6357 == null ? (field6357 = method2647("wf")) : field6357);
                            }
                            if (var22 == null) {
                                var22 = (class115) class265.method1739(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class115) class548.method3127(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class364 var23 = class18.field227.method1201((byte) 81, var22.method748(false));
                                if (!var23.field4887 || class467.field6579) {
                                    int var24 = var23.field4909;
                                    if (var23.field4904 != null) {
                                        for (int var25 = 0; var25 < var23.field4904.length; var25++) {
                                            if (var23.field4904[var25] != -1) {
                                                class364 var26 = class18.field227.method1201((byte) -94, var23.field4904[var25]);
                                                if (var26.field4909 >= 0) {
                                                    var24 = var26.field4909;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class463 var28 = class163.field2366.method2136(-100, var24);
                                            if (var28 != null && var28.field6511) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class428.field6075[var21].field2253;
                                            int var32 = class428.field6075[var21].field2243;
                                            int var33 = class428.field6075[var21].field2244;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 103 && (var14 + 3) > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var30 > var20 - 3 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 104 - 1 && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class534.field7471[class370.field5018] = var23.field4944;
                                        class481.field6788[class370.field5018] = var29;
                                        class393.field5550[class370.field5018] = var30;
                                        class370.field5018++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class246.field3427 != null) {
                class346.field4656.field288 = 1;
                class163.field2366.method2132(1024, -20773, 64);
                for (int var15 = 0; var15 < class246.field3427.field7382; var15++) {
                    int var16 = class246.field3427.field7378[var15];
                    if (var16 >> 28 == class645.field9372.field6035) {
                        int var17 = ((var16 & 0xFFFF885) >> 14) - class519.field7304;
                        int var18 = (var16 & 0x3FFF) - class6.field80;
                        if (var17 >= 0 && var17 < class32.field513 && var18 >= 0 && var18 < class611.field8786) {
                            class257.field3568.method463(new class10(var15), -122);
                        } else {
                            class463 var19 = class163.field2366.method2136(-123, class246.field3427.field7380[var15]);
                            if (var19.field6517 != null && (var17 + var19.field6530) >= 0 && class32.field513 > var19.field6509 + var17 && var19.field6525 + var18 >= 0 && class611.field8786 > var19.field6518 + var18) {
                                class257.field3568.method463(new class10(var15), -97);
                            }
                        }
                    }
                }
                class163.field2366.method2132(128, -20773, 64);
                class346.field4656.field288 = 2;
                class346.field4656.method217(0);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(II)V")
    public class448(int arg0, int arg1) {
        this.field6351 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6354++;
        throw new IllegalStateException();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2647(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
