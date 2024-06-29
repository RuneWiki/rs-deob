import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class267 extends class105 {

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    private int field4704;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public static int field4699 = -1;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "[Lvf;")
    public static class265[] field4707 = new class265[100];

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public static int field4700 = 0;

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "Z")
    public static boolean field4710 = false;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLvf;I)V")
    public static final void method1814(byte arg0, class265 arg1, int arg2) {
        if (arg0 != 33) {
            method1819((class122) null, (byte) -70);
        }
        ++field4709;
        boolean var3 = false;
        class265 var4 = arg1.method1771((byte) -108).method1765(true);
        for (int var5 = 0; var5 < class19.field520; ++var5) {
            class122 var6 = class209.field3766[class93.field1652[var5]];
            if (var6 != null && var6.field2163 != null && var6.field2163.method1791(var4, (byte) -98)) {
                var3 = true;
                class217.method1496(0, var6.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var6.field2536[0]);
                if (~arg2 != -2) {
                    if (arg2 == 4) {
                        ++class150.field2776;
                        class55.field1133.method1863(true, 46);
                        class55.field1133.method934(arg0 + -30786, class93.field1652[var5]);
                    } else if (~arg2 == -6) {
                        class55.field1133.method1863(true, 31);
                        ++class252.field4337;
                        class55.field1133.method934(-30753, class93.field1652[var5]);
                    } else if (~arg2 == -7) {
                        class55.field1133.method1863(true, 27);
                        class55.field1133.method934(arg0 + -30786, class93.field1652[var5]);
                        ++class146.field2727;
                    } else if (arg2 == 7) {
                        class55.field1133.method1863(true, 23);
                        ++class253.field4353;
                        class55.field1133.method934(arg0 + -30786, class93.field1652[var5]);
                    }
                } else {
                    class55.field1133.method1863(true, 4);
                    ++class141.field2613;
                    class55.field1133.method921(arg0 ^ 86, class93.field1652[var5]);
                }
                break;
            }
        }
        if (!var3) {
            class259.method1725(-122, class148.method1022(10, new class265[] { class43.field952, var4 }), 0, class4.field66);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lfl;B)V")
    public static final void method1815(class192 arg0, byte arg1) {
        class58.field1184 = arg0;
        if (arg1 != 77) {
            method1816((class6) null, 64, -115, 47, 95, -9, 114, 88);
        }
        ++field4702;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lgk;IIIIIII)V")
    public static final void method1816(class6 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4697;
        if (!class120.field2123) {
            class214.field3844 = 0;
        } else {
            class214.field3844 = 32;
        }
        class120.field2123 = false;
        if (class232.field4102 != 0) {
            if (arg2 <= arg5 && ~(arg2 + 16) < ~arg5 && arg4 <= arg7 && ~(arg4 + 16) < ~arg7) {
                arg0.field193 -= 4;
                class176.method1145((byte) -29, arg0);
            } else if (arg2 <= arg5 && arg5 < arg2 + 16 && arg7 >= arg4 - 16 + arg6 && arg7 < arg4 + arg6) {
                arg0.field193 += 4;
                class176.method1145((byte) 90, arg0);
            } else if (~(arg2 - class214.field3844) >= ~arg5 && ~(class214.field3844 + 16 + arg2) < ~arg5 && arg4 - -16 <= arg7 && ~(arg6 + -16 + arg4) < ~arg7) {
                int var8 = (arg6 + -32) * arg6 / arg1;
                if (~var8 > -9) {
                    var8 = 8;
                }
                int var9 = -arg4 + -16 + arg7 + -(var8 / 2);
                int var10 = arg6 + -32 + -var8;
                arg0.field193 = (-arg6 + arg1) * var9 / var10;
                class176.method1145((byte) 56, arg0);
                class120.field2123 = true;
            }
        }
        if (class16.field463 != 0) {
            int var11 = arg0.field89;
            if (~(arg2 - var11) >= ~arg5 && ~arg4 >= ~arg7 && arg2 + 16 > arg5 && ~arg7 >= ~(arg4 + arg6)) {
                arg0.field193 += class16.field463 * 45;
                class176.method1145((byte) -79, arg0);
            }
        }
        if (arg3 != -31398) {
            method1820(false);
        }
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V")
    public static void method1817(int arg0) {
        if (arg0 == 1) {
            field4707 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
    public static final void method1818(int arg0, int arg1) {
        ++field4696;
        class150.field2775.method1891(-23549, arg0);
        if (arg1 != -2586) {
            field4699 = -25;
        }
        class160.field2927.method1891(-23549, arg0);
        class211.field3787.method1891(-23549, arg0);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I)V")
    private class267(int arg0) {
        super(0, true);
        this.field4704 = 4096;
        this.field4704 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lnc;B)I")
    public static final int method1819(class122 arg0, byte arg1) {
        ++field4706;
        int var2 = arg0.field2196;
        if (arg1 < 126) {
            return 3;
        } else {
            if (~arg0.field2601 == ~arg0.field2582) {
                var2 = arg0.field2187;
            } else if (arg0.field2587 == arg0.field2582) {
                var2 = arg0.field2199;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        ++field4703;
        if (~arg0 == -1) {
            this.field4704 = (arg2.method920((byte) 116) << 12) / 255;
        }
        if (arg1 != 255) {
            this.field4704 = 63;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V")
    public static final void method1820(boolean arg0) {
        if (class183.field3286 != 2) {
            if (class77.field1475 == class122.field2193 && ~class38.field862 == ~class192.field3427) {
                class183.field3286 = 0;
                if (class4.field61 && class69.field1311[81] && class120.field2129 > 2) {
                    class182.method1214(class120.field2129 - 2, (byte) 11);
                } else {
                    class182.method1214(class120.field2129 + -1, (byte) 11);
                }
            } else {
                class97.field1719 = class122.field2193;
                class183.field3286 = 2;
                class135.field2440 = class192.field3427;
            }
        } else if (class97.field1719 == class77.field1475 && class38.field862 == class135.field2440) {
            class183.field3286 = 0;
            if (class4.field61 && class69.field1311[81] && ~class120.field2129 < -3) {
                class182.method1214(class120.field2129 + -2, (byte) 11);
            } else {
                class182.method1214(class120.field2129 + -1, (byte) 11);
            }
        }
        ++field4698;
        if (arg0) {
            field4699 = 111;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class267() {
        this(4096);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        if (arg0 != 8055) {
            method1815((class192) null, (byte) -100);
        }
        ++field4705;
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            class194.method1346(var3, 0, class94.field1668, this.field4704);
        }
        return var3;
    }
}
