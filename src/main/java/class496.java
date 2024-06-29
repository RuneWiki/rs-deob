import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class496 extends class68 {

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public int field7200;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public int field7202;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public int field7204;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public int field7207;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public int field7208;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public int field7212;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "Ljava/lang/String;")
    public String field7205;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLfh;)V", line = 9)
    public static final void method2997(byte arg0, class463 arg1) {
        field7210++;
        int var2 = arg1.method2763(-514944944);
        class72.field933 = new class20[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class72.field933[var3] = new class20();
            class72.field933[var3].field289 = arg1.method2763(-514944944);
            class72.field933[var3].field286 = arg1.method2745(true);
        }
        class357.field4597 = arg1.method2763(-514944944);
        class64.field832 = arg1.method2763(-514944944);
        class289.field3685 = arg1.method2763(-514944944);
        class66.field850 = new class254[class64.field832 + 1 - class357.field4597];
        int var4 = 21 % ((arg0 - 5) / 33);
        for (int var5 = 0; var5 < class289.field3685; var5++) {
            int var6 = arg1.method2763(-514944944);
            class254 var7 = class66.field850[var6] = new class254();
            var7.field2701 = arg1.method2737(false);
            var7.field2702 = arg1.method2727(-94);
            var7.field3236 = class357.field4597 + var6;
            var7.field3238 = arg1.method2745(true);
            var7.field3237 = arg1.method2745(true);
        }
        field7201 = arg1.method2727(-124);
        class354.field4556 = true;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)Z", line = 58)
    public static final boolean method2998(int arg0, int arg1, int arg2, int arg3) {
        if (!class452.method2698(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class94.field1144;
        int var5 = arg2 << class94.field1144;
        int var6 = class520.field7520[arg0].method399(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class94.field1144 - 7);
        int var8 = var6 - (0xE6 << class94.field1144 - 7);
        int var9 = var6 - (0xEE << class94.field1144 - 7);
        if (arg3 == 1) {
            if (var4 > class309.field3954) {
                if (!class145.method973(var4, var6, var5)) {
                    return false;
                }
                if (!class145.method973(var4, var6, class59.field772 + var5)) {
                    return false;
                }
                if (!class145.method973(var4, var6, class376.field4951 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class145.method973(var4, var7, var5)) {
                    return false;
                }
                if (!class145.method973(var4, var7, class59.field772 + var5)) {
                    return false;
                }
                if (!class145.method973(var4, var7, class376.field4951 + var5)) {
                    return false;
                }
            }
            if (!class145.method973(var4, var8, var5)) {
                return false;
            } else if (class145.method973(var4, var8, class59.field772 + var5)) {
                return class145.method973(var4, var8, class376.field4951 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class211.field2718) {
                if (!class145.method973(var4, var6, class376.field4951 + var5)) {
                    return false;
                }
                if (!class145.method973(class59.field772 + var4, var6, class376.field4951 + var5)) {
                    return false;
                }
                if (!class145.method973(class376.field4951 + var4, var6, class376.field4951 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class145.method973(var4, var7, class376.field4951 + var5)) {
                    return false;
                }
                if (!class145.method973(class59.field772 + var4, var7, class376.field4951 + var5)) {
                    return false;
                }
                if (!class145.method973(class376.field4951 + var4, var7, class376.field4951 + var5)) {
                    return false;
                }
            }
            if (!class145.method973(var4, var8, class376.field4951 + var5)) {
                return false;
            } else if (class145.method973(class59.field772 + var4, var8, class376.field4951 + var5)) {
                return class145.method973(class376.field4951 + var4, var8, class376.field4951 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class309.field3954) {
                if (!class145.method973(class376.field4951 + var4, var6, var5)) {
                    return false;
                }
                if (!class145.method973(class376.field4951 + var4, var6, class59.field772 + var5)) {
                    return false;
                }
                if (!class145.method973(class376.field4951 + var4, var6, class376.field4951 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class145.method973(class376.field4951 + var4, var7, var5)) {
                    return false;
                }
                if (!class145.method973(class376.field4951 + var4, var7, class59.field772 + var5)) {
                    return false;
                }
                if (!class145.method973(class376.field4951 + var4, var7, class376.field4951 + var5)) {
                    return false;
                }
            }
            if (!class145.method973(class376.field4951 + var4, var8, var5)) {
                return false;
            } else if (class145.method973(class376.field4951 + var4, var8, class59.field772 + var5)) {
                return class145.method973(class376.field4951 + var4, var8, class376.field4951 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class211.field2718) {
                if (!class145.method973(var4, var6, var5)) {
                    return false;
                }
                if (!class145.method973(class59.field772 + var4, var6, var5)) {
                    return false;
                }
                if (!class145.method973(class376.field4951 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class145.method973(var4, var7, var5)) {
                    return false;
                }
                if (!class145.method973(class59.field772 + var4, var7, var5)) {
                    return false;
                }
                if (!class145.method973(class376.field4951 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class145.method973(var4, var8, var5)) {
                return false;
            } else if (class145.method973(class59.field772 + var4, var8, var5)) {
                return class145.method973(class376.field4951 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class145.method973(class59.field772 + var4, var9, class59.field772 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class145.method973(var4, var8, class376.field4951 + var5);
        } else if (arg3 == 32) {
            return class145.method973(class376.field4951 + var4, var8, class376.field4951 + var5);
        } else if (arg3 == 64) {
            return class145.method973(class376.field4951 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class145.method973(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)I", line = 283)
    public static final int method2999(boolean arg0, int arg1) {
        field7209++;
        if (arg1 < 96) {
            return 0;
        } else if (arg0) {
            return arg1 < 128 ? 2 : 3;
        } else {
            return 95;
        }
    }
}
