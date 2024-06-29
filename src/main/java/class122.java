import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class122 {

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Z")
    public boolean field1679 = false;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lfaa;")
    public static class139 field1683 = new class139(16);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lbt;")
    public class40 field1682;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lac;B)V", line = 4)
    public final void method874(class501 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2874((byte) -75);
            if (var3 == 0) {
                if (arg1 != -21) {
                    this.field1679 = true;
                }
                field1680++;
                return;
            }
            this.method879(-82, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Z", line = 28)
    public final boolean method875(byte arg0) {
        if (arg0 != -68) {
            this.field1679 = false;
        }
        field1678++;
        return this.field1682.field468.method3623(-109, this.field1676);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ltg;Z)V", line = 43)
    public static final void method876(class210 arg0, boolean arg1) {
        for (int var2 = arg0.field2972; var2 <= arg0.field2973; var2++) {
            for (int var3 = arg0.field2963; var3 <= arg0.field2969; var3++) {
                class390 var4 = class295.field4051[arg0.field4053][var2][var3];
                if (var4 != null) {
                    class467 var5 = var4.field5536;
                    class467 var6 = null;
                    while (var5 != null) {
                        if (var5.field6419 == arg0) {
                            if (var6 == null) {
                                var4.field5536 = var5.field6421;
                            } else {
                                var6.field6421 = var5.field6421;
                            }
                            var5.method2638((byte) 116);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field6421;
                    }
                }
            }
        }
        if (!arg1) {
            class706.method3954(arg0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 89)
    public static void method877(int arg0) {
        field1683 = null;
        if (arg0 != 10039) {
            method876(null, true);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILr;BZ)Lf;", line = 101)
    public final class702 method878(int arg0, class166 arg1, byte arg2, boolean arg3) {
        field1681++;
        long var5 = (long) (arg1.field2427 << 19 | (arg3 ? 262144 : 0) | this.field1676 | arg0 << 16);
        class702 var7 = (class702) this.field1682.field473.method3747((byte) -66, var5);
        if (var7 != null) {
            return var7;
        } else if (!this.field1682.field468.method3623(arg2 ^ 0x28, this.field1676)) {
            return null;
        } else if (arg2 == -105) {
            class168 var8 = class168.method1193(this.field1682.field468, this.field1676, 0);
            if (var8 != null) {
                var8.field2444 = var8.field2446 = var8.field2443 = var8.field2448 = 0;
                if (arg3) {
                    var8.method1195();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method1183();
                }
            }
            class702 var10 = arg1.method146(var8, true);
            if (var10 != null) {
                this.field1682.field473.method3748(var5, var10, 12537);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILac;)V", line = 154)
    private final void method879(int arg0, int arg1, class501 arg2) {
        if (arg0 > -38) {
            return;
        }
        if (arg1 == 1) {
            this.field1676 = arg2.method2845(-1);
        } else if (arg1 == 2) {
            this.field1677 = arg2.method2819((byte) 72);
        } else if (arg1 == 3) {
            this.field1679 = true;
        } else if (arg1 == 4) {
            this.field1676 = -1;
        }
        field1675++;
    }
}
