import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class157 {

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field2403;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
    public static boolean field2396 = true;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field2399 = 0;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Z")
    public static boolean field2398 = false;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILat;II)V")
    public static final void method1124(int arg0, class444 arg1, int arg2, int arg3) {
        if (~arg1.field6464 == arg3) {
            arg1.field6418 = arg1.field6391;
        } else if (arg1.field6464 == 1) {
            arg1.field6418 = (arg0 - arg1.field6453) / 2 + arg1.field6391;
        } else if (arg1.field6464 == 2) {
            arg1.field6418 = arg0 - arg1.field6453 - arg1.field6391;
        } else if (arg1.field6464 == 3) {
            arg1.field6418 = arg1.field6391 * arg0 >> 14;
        } else if (arg1.field6464 == 4) {
            arg1.field6418 = (arg0 - arg1.field6453) / 2 + (arg1.field6391 * arg0 >> 14);
        } else {
            arg1.field6418 = arg0 - arg1.field6453 - (arg1.field6391 * arg0 >> 14);
        }
        if (arg1.field6518 == 0) {
            arg1.field6500 = arg1.field6548;
        } else if (arg1.field6518 == 1) {
            arg1.field6500 = (arg2 - arg1.field6470) / 2 + arg1.field6548;
        } else if (arg1.field6518 == 2) {
            arg1.field6500 = arg2 - arg1.field6548 - arg1.field6470;
        } else if (arg1.field6518 == 3) {
            arg1.field6500 = arg1.field6548 * arg2 >> 14;
        } else if (arg1.field6518 == 4) {
            arg1.field6500 = (arg1.field6548 * arg2 >> 14) + (arg2 - arg1.field6470) / 2;
        } else {
            arg1.field6500 = arg2 - (arg1.field6548 * arg2 >> 14) - arg1.field6470;
        }
        field2401++;
        if (!class181.field2693) {
            return;
        }
        if (client.method3067(arg1).field6217 == 0 && arg1.field6477 != 0) {
            return;
        }
        if (arg1.field6500 < 0) {
            arg1.field6500 = 0;
        } else if ((arg1.field6500 + arg1.field6470) > arg2) {
            arg1.field6500 = arg2 - arg1.field6470;
        }
        if (arg1.field6418 < 0) {
            arg1.field6418 = 0;
            return;
        }
        if (arg1.field6453 + arg1.field6418 > arg0) {
            arg1.field6418 = arg0 - arg1.field6453;
            return;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLnf;I)V")
    public static final void method1125(byte arg0, class28 arg1, int arg2) {
        class154.field2383 = 0;
        field2405++;
        if (arg0 != 63) {
            return;
        }
        class186.field2746 = false;
        class296.method1717(true, arg1);
        class440.method2605(arg1, (byte) 82);
        if (class186.field2746) {
            System.out.println("---endgpp---");
        }
        if (arg1.field4360 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field4360 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method1126(int arg0, byte arg1) {
        field2400++;
        if (arg1 != -19) {
            method1125((byte) -55, null, -52);
        }
        return this.field2403[arg0];
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static final void method1127(int arg0) {
        field2407++;
        int var1 = 0;
        if (arg0 != 1508614222) {
            method1128((byte) -107, 32, 116, 24, -42);
        }
        while (var1 < 100) {
            class428.field6214[var1] = true;
            var1++;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BIIII)V")
    public static final void method1128(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2404++;
        if (arg1 >= class519.field7633 && class375.field5387 >= arg1) {
            int var5 = class486.method2879((byte) -111, arg3, class233.field3241, class23.field320);
            int var6 = class486.method2879((byte) -88, arg4, class233.field3241, class23.field320);
            class482.method2865(13156520, var6, arg2, var5, arg1);
        }
        if (arg0 != -107) {
            field2396 = true;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)Lvu;")
    public static final class155 method1129(int arg0, boolean arg1) {
        field2406++;
        if (arg0 == 0) {
            if ((double) class472.field6812 == 3.0D) {
                return class414.field5894;
            }
            if ((double) class472.field6812 == 4.0D) {
                return class54.field780;
            }
            if ((double) class472.field6812 == 6.0D) {
                return class28.field405;
            }
            if ((double) class472.field6812 >= 8.0D) {
                return class490.field7080;
            }
        } else if (arg0 == 1) {
            if ((double) class472.field6812 == 3.0D) {
                return class28.field405;
            }
            if ((double) class472.field6812 == 4.0D) {
                return class490.field7080;
            }
            if ((double) class472.field6812 == 6.0D) {
                return class390.field5634;
            }
            if ((double) class472.field6812 >= 8.0D) {
                return class187.field2761;
            }
        } else if (arg0 == 2) {
            if ((double) class472.field6812 == 3.0D) {
                return class390.field5634;
            }
            if ((double) class472.field6812 == 4.0D) {
                return class187.field2761;
            }
            if ((double) class472.field6812 == 6.0D) {
                return class411.field5831;
            }
            if ((double) class472.field6812 >= 8.0D) {
                return class77.field1090;
            }
        }
        return arg1 ? null : null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIB)I")
    public static final int method1130(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -117) {
            return -99;
        }
        field2397++;
        if ((class27.field379[arg1][arg0][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (class27.field379[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2402++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class157(String arg0, String arg1, String arg2, String arg3) {
        this.field2403 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
