import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class92 extends class228 {

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field1550 = 127;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    public static int field1553 = 0;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "Loa;")
    public static class99 field1552 = class221.method1463(2844, "blanc:");

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "[Lde;")
    public static class109[] field1558;

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class92() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field1551;
        if (arg2 != -7618) {
            field1550 = -92;
        }
        if (~arg0 == -1) {
            super.field3943 = ~arg1.method1693((byte) -88) == -2;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        ++field1547;
        if (super.field3948.field4791) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; class234.field4046 > var7; ++var7) {
                this.method620(arg1, (byte) 19, var7);
                int[][] var8 = this.method1502(255, class222.field3861, 0);
                var4[var7] = var8[0][class181.field3162];
                var6[var7] = var8[1][class181.field3162];
                var5[var7] = var8[2][class181.field3162];
            }
        }
        if (arg0 != -27) {
            field1553 = 106;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILtf;IIZII)V")
    public static final void method617(int arg0, int arg1, class107 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            method617(-30, -123, (class107) null, 75, -64, true, -6, -114);
        }
        if (!class209.field3621) {
            class37.field635 = 0;
        } else {
            class37.field635 = 32;
        }
        class209.field3621 = false;
        ++field1557;
        if (class51.field849 != 0) {
            if (arg7 >= arg4 && ~(arg4 + 16) < ~arg7 && arg3 <= arg1 && arg3 + 16 > arg1) {
                arg2.field1832 -= 4;
                class238.method1555(arg2, 10555);
            } else if (arg4 <= arg7 && arg4 - -16 > arg7 && ~arg1 <= ~(arg0 + -16 + arg3) && ~(arg0 + arg3) < ~arg1) {
                arg2.field1832 += 4;
                class238.method1555(arg2, 10555);
            } else if (~arg7 <= ~(-class37.field635 + arg4) && arg7 < class37.field635 + arg4 - -16 && arg3 + 16 <= arg1 && ~(arg0 + arg3 + -16) < ~arg1) {
                int var8 = (arg0 - 32) * arg0 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = -(var8 / 2) + -16 + -arg3 + arg1;
                int var10 = arg0 + -32 + -var8;
                arg2.field1832 = (-arg0 + arg6) * var9 / var10;
                class238.method1555(arg2, 10555);
                class209.field3621 = true;
            }
        }
        if (~class156.field2801 != -1) {
            int var11 = arg2.field1933;
            if (-var11 + arg4 <= arg7 && arg1 >= arg3 && ~(arg4 + 16) < ~arg7 && ~arg1 >= ~(arg0 + arg3)) {
                arg2.field1832 += class156.field2801 * 45;
                class238.method1555(arg2, 10555);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public static void method618(int arg0) {
        field1552 = null;
        if (arg0 != 2) {
            field1558 = null;
        }
        field1558 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ltg;Ltg;BLec;Ltg;)Z")
    public static final boolean method619(class182 arg0, class182 arg1, byte arg2, class23 arg3, class182 arg4) {
        if (arg2 != -16) {
            field1552 = null;
        }
        class116.field2065 = arg3;
        ++field1549;
        client.field2780 = arg1;
        class280.field4913 = arg4;
        class129.field2250 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)V")
    private final void method620(int arg0, byte arg1, int arg2) {
        ++field1554;
        int var4 = class281.field4923[arg2];
        if (arg1 == 19) {
            int var5 = class54.field879[arg0];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class222.field3861 = arg0;
                class181.field3162 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class222.field3861 = arg2;
                class181.field3162 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class181.field3162 = -arg0 + class234.field4046;
                class222.field3861 = arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class222.field3861 = -arg0 + class179.field3122;
                class181.field3162 = arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class222.field3861 = -arg0 + class179.field3122;
                class181.field3162 = -arg2 + class234.field4046;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class222.field3861 = class179.field3122 - arg2;
                class181.field3162 = class234.field4046 - arg0;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class181.field3162 = arg0;
                class222.field3861 = class179.field3122 - arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class222.field3861 = arg0;
                class181.field3162 = class234.field4046 - arg2;
            }
            class181.field3162 &= class190.field3345;
            class222.field3861 &= class250.field4309;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            method617(60, 114, (class107) null, 61, 119, true, 42, -103);
        }
        int[] var3 = super.field3952.method1262(arg0, 7492);
        ++field1548;
        if (super.field3952.field3276) {
            for (int var4 = 0; var4 < class234.field4046; ++var4) {
                this.method620(arg0, (byte) 19, var4);
                int[] var5 = this.method1500(class222.field3861, 0, (byte) 113);
                var3[var4] = var5[class181.field3162];
            }
        }
        return var3;
    }
}
