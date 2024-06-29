import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class203 {

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "[I")
    public static int[] field2894 = new int[8];

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lqaa;")
    public static class27 field2892 = new class27(83, -1);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1416(int arg0, int arg1, int arg2) {
        if (arg1 <= 66) {
            method1416(36, 63, 117);
        }
        field2896++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZIBI)Ljava/lang/String;", line = 19)
    public static final String method1417(boolean arg0, int arg1, byte arg2, int arg3) {
        field2893++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg0 && arg1 >= 0) {
            int var4 = 2;
            int var5 = arg1 / arg3;
            if (arg2 < 43) {
                return null;
            }
            while (var5 != 0) {
                var4++;
                var5 /= arg3;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg3;
                int var9 = var8 - (arg1 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 68)
    public static void method1418(int arg0) {
        if (arg0 < 124) {
            method1416(54, -14, -125);
        }
        field2892 = null;
        field2894 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILrca;)V", line = 82)
    public static final void method1419(int arg0, class452 arg1) {
        field2895++;
        int var2 = 0;
        arg1.method2688((byte) 5);
        for (int var3 = 0; var3 < class206.field2950; var3++) {
            int var15 = class209.field3013[var3];
            if ((class483.field6837[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class483.field6837[var15] = (byte) class164.method1221(class483.field6837[var15], 2);
                } else {
                    int var16 = arg1.method2686(-9380, 1);
                    if (var16 == 0) {
                        var2 = class371.method2330(arg0 - 31225, arg1);
                        class483.field6837[var15] = (byte) class164.method1221(class483.field6837[var15], 2);
                    } else {
                        class541.method3182((byte) -112, var15, arg1);
                    }
                }
            }
        }
        arg1.method2684(true);
        if (~var2 != arg0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2688((byte) 83);
        for (int var4 = 0; var4 < class206.field2950; var4++) {
            int var13 = class209.field3013[var4];
            if ((class483.field6837[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class483.field6837[var13] = (byte) class164.method1221(class483.field6837[var13], 2);
                } else {
                    int var14 = arg1.method2686(-9380, 1);
                    if (var14 == 0) {
                        var2 = class371.method2330(-31226, arg1);
                        class483.field6837[var13] = (byte) class164.method1221(class483.field6837[var13], 2);
                    } else {
                        class541.method3182((byte) -97, var13, arg1);
                    }
                }
            }
        }
        arg1.method2684(true);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2688((byte) 101);
        for (int var5 = 0; var5 < class646.field9152; var5++) {
            int var11 = class251.field3592[var5];
            if ((class483.field6837[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class483.field6837[var11] = (byte) class164.method1221(class483.field6837[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method2686(-9380, 1);
                    if (var12 == 0) {
                        var2 = class371.method2330(-31226, arg1);
                        class483.field6837[var11] = (byte) class164.method1221(class483.field6837[var11], 2);
                    } else if (class359.method2238(var11, -6154, arg1)) {
                        class483.field6837[var11] = (byte) class164.method1221(class483.field6837[var11], 2);
                    }
                }
            }
        }
        arg1.method2684(true);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2688((byte) -121);
        for (int var6 = 0; var6 < class646.field9152; var6++) {
            int var9 = class251.field3592[var6];
            if ((class483.field6837[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class483.field6837[var9] = (byte) class164.method1221(class483.field6837[var9], 2);
                } else {
                    int var10 = arg1.method2686(-9380, 1);
                    if (var10 == 0) {
                        var2 = class371.method2330(-31226, arg1);
                        class483.field6837[var9] = (byte) class164.method1221(class483.field6837[var9], 2);
                    } else if (class359.method2238(var9, -6154, arg1)) {
                        class483.field6837[var9] = (byte) class164.method1221(class483.field6837[var9], 2);
                    }
                }
            }
        }
        arg1.method2684(true);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class646.field9152 = 0;
        class206.field2950 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class483.field6837[var7] = (byte) (class483.field6837[var7] >> 1);
            class349 var8 = class165.field2442[var7];
            if (var8 == null) {
                class251.field3592[class646.field9152++] = var7;
            } else {
                class209.field3013[class206.field2950++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Z", line = 289)
    public static final boolean method1420(byte arg0) {
        field2891++;
        if (class255.field3698) {
            try {
                class101.method889("showVideoAd", class476.field6812, -27420);
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 > -126;
    }
}
