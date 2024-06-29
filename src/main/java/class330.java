import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class330 {

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Lsd;")
    public final class174 field5624;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public final int field5626;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Z")
    public static boolean field5621 = true;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Lph;")
    public static class229 field5625 = class266.method1858("zap", 0);

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Lph;")
    public static class229 field5627 = class266.method1858("<col=ffffff>", 0);

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field5623 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)I", line = 7)
    public static final int method2259(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 & 0xF;
        int var6 = var5 >= 8 ? arg3 : arg1;
        int var7 = var5 < 4 ? arg3 : (var5 == 12 || var5 == 14 ? arg1 : arg2);
        field5622++;
        if (arg4 != 63) {
            field5621 = true;
        }
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 27)
    public static final void method2260(String arg0, int arg1) {
        field5619++;
        if (arg1 == 2036340808) {
            for (int var2 = arg0.indexOf("%0a"); var2 != -1; var2 = arg0.indexOf("%0a", var2)) {
                arg0 = arg0.substring(0, var2) + "\n" + arg0.substring(var2 + 3);
            }
            System.out.println("Error: " + arg0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([J[Ljava/lang/Object;I)V", line = 49)
    public static final void method2261(long[] arg0, Object[] arg1, int arg2) {
        class43.method326(arg0.length + arg2, false, arg0, 0, arg1);
        field5617++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lhb;B)V", line = 59)
    public static final void method2262(class164 arg0, byte arg1) {
        label126: while (true) {
            if (arg0.field2668.length > arg0.field2670) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1178(8) == 1) {
                    var3 = arg0.method1178(8);
                    var2 = true;
                    var4 = arg0.method1178(8);
                }
                int var5 = arg0.method1178(8);
                int var6 = arg0.method1178(8);
                int var7 = class214.field3537 - (1 - class266.field4487) - (var6 * 64);
                int var8 = var5 * 64 - class54.field786;
                if (var8 >= 0 && (var7 - 63) >= 0 && class50.field716 > var8 + 63 && var7 < class214.field3537) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label126;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < (var3 * 8 + 8) && (var4 * 8) <= var12 && var12 < (var4 * 8 + 8)) {
                                int var13 = arg0.method1178(8);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1178(8);
                                        if (class68.field1097[var10][var9] == null) {
                                            class68.field1097[var10][var9] = new byte[4096];
                                        }
                                        class68.field1097[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1161(true);
                                        if (class38.field612[var10][var9] == null) {
                                            class38.field612[var10][var9] = new short[4096];
                                        }
                                        class38.field612[var10][var9][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg0.method1178(8) & 0xFF << 16) - (-(arg0.method1178(8) & 0xFF << 8) - (arg0.method1178(8) & 0xFF));
                                        if (class68.field1096[var10][var9] == null) {
                                            class68.field1096[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class83 var17 = class260.method1807(false, var16);
                                        if (var17.field1373 != null) {
                                            var17 = var17.method613((byte) -104);
                                            if (var17 == null || var17.field1392 == -1) {
                                                continue;
                                            }
                                        }
                                        class68.field1096[var10][var9][(63 - var12 << 6) + var11] = var17.field1421 + 1;
                                        class129 var18 = new class129();
                                        var18.field2120 = var7;
                                        var18.field2119 = var17.field1392;
                                        var18.field2126 = var8;
                                        class25.field330.method1582(var18, 4);
                                    }
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var19 = 0;
                while (true) {
                    if (var19 >= (var2 ? 64 : 4096)) {
                        continue label126;
                    }
                    int var20 = arg0.method1178(8);
                    if (var20 != 0) {
                        if ((var20 & 0x1) == 1) {
                            arg0.field2670++;
                        }
                        if ((var20 & 0x2) == 2) {
                            arg0.field2670 += 2;
                        }
                        if ((var20 & 0x4) == 4) {
                            arg0.field2670 += 3;
                        }
                    }
                    var19++;
                }
            }
            field5618++;
            if (arg1 > -106) {
                method2261((long[]) null, (Object[]) null, 25);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 212)
    public static void method2263(byte arg0) {
        if (arg0 <= -24) {
            field5627 = null;
            field5625 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 229)
    public static final void method2264(int arg0) {
        int var1 = class88.field1497.method34(111, 8);
        field5620++;
        if (var1 < class139.field2248) {
            for (int var2 = var1; var2 < class139.field2248; var2++) {
                class57.field809[class63.field950++] = class166.field2708[var2];
            }
        }
        if (var1 > class139.field2248) {
            throw new RuntimeException("gppov1");
        }
        class139.field2248 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class166.field2708[var3];
            class209 var5 = class114.field1931[var4];
            int var6 = class88.field1497.method34(arg0 + 120, 1);
            if (var6 == 0) {
                class166.field2708[class139.field2248++] = var4;
                var5.field5162 = class319.field5393;
            } else {
                int var7 = class88.field1497.method34(arg0 + 122, 2);
                if (var7 == 0) {
                    class166.field2708[class139.field2248++] = var4;
                    var5.field5162 = class319.field5393;
                    class105.field1782[class313.field5278++] = var4;
                } else if (var7 == 1) {
                    class166.field2708[class139.field2248++] = var4;
                    var5.field5162 = class319.field5393;
                    int var8 = class88.field1497.method34(124, 3);
                    var5.method2063(var8, false, arg0 + 19523);
                    int var9 = class88.field1497.method34(arg0 ^ 0xFFFFFF84, 1);
                    if (var9 == 1) {
                        class105.field1782[class313.field5278++] = var4;
                    }
                } else if (var7 == 2) {
                    class166.field2708[class139.field2248++] = var4;
                    var5.field5162 = class319.field5393;
                    int var10 = class88.field1497.method34(arg0 + 123, 3);
                    var5.method2063(var10, true, 19522);
                    int var11 = class88.field1497.method34(arg0 - 61, 3);
                    var5.method2063(var11, true, arg0 + 19523);
                    int var12 = class88.field1497.method34(120, 1);
                    if (var12 == 1) {
                        class105.field1782[class313.field5278++] = var4;
                    }
                } else if (var7 == 3) {
                    class57.field809[class63.field950++] = var4;
                }
            }
        }
        if (arg0 != -1) {
            method2264(37);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(II)V", line = 333)
    public class330(int arg0, int arg1) {
        this.field5624 = class88.method659(arg0, false);
        this.field5626 = arg1;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lsd;I)V", line = 342)
    public class330(class174 arg0, int arg1) {
        this.field5624 = arg0;
        this.field5626 = arg1;
    }
}
