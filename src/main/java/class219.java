import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class219 extends class186 {

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    private int field4049 = 0;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "Z")
    public boolean field4061 = false;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    private int field4058 = 0;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    private int field4051 = -32768;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    private int field4066;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public int field4068;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Lki;")
    private class117 field4054;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "Lqe;")
    public static class179 field4057 = class206.method1380("", (byte) 23);

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lqe;")
    public static class179 field4048 = class206.method1380("Untersuchen", (byte) 102);

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field4056 = -1;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZB)V")
    public static final void method1426(boolean arg0, byte arg1) {
        for (int var2 = 0; var2 < class186.field3456; var2++) {
            class188 var3 = class53.field1152[class233.field4297[var2]];
            long var4 = (long) class233.field4297[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method742((byte) -66) && var3.field3496.field3322 == arg0 && var3.field3496.method1182(false)) {
                int var6 = var3.field3198 >> 7;
                int var7 = var3.field3159 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field3178 == 1 && (var3.field3159 & 0x7F) == 64 && (var3.field3198 & 0x7F) == 64) {
                        if (class191.field3543[var7][var6] == class239.field4401) {
                            continue;
                        }
                        class191.field3543[var7][var6] = class239.field4401;
                    }
                    if (!var3.field3496.field3347) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field3146 = class202.method1341(112, var3.field3178 * 64 + var3.field3159 - 64, class49.field1038, var3.field3198 + (var3.field3178 - 1) * 64);
                    class113.method728(class49.field1038, var3.field3159, var3.field3198, var3.field3146, (var3.field3178 - 1) * 64 + 60, var3, var3.field3177, var4, var3.field3171);
                }
            }
        }
        if (arg1 != 93) {
            method1433((byte) 33);
        }
        field4059++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Leh;ILeh;)V")
    public static final void method1427(class52 arg0, int arg1, class52 arg2) {
        class216.field4005 = arg0;
        field4050++;
        class151.field2731 = arg2;
        if (arg1 != 0) {
            field4057 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLqe;)V")
    public static final void method1428(byte arg0, class179 arg1) {
        field4045++;
        if (class178.field3233 >= 2) {
            if (arg1.method1138(false, class237.field4368)) {
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class189.method1276(0, (byte) 1, class78.method502((byte) -105, new class179[] { class2.field30, class148.method949((byte) -14, var4), class231.field4260 }), null);
            }
            if (arg1.method1138(false, class61.field1302)) {
                class84.method571((byte) 83);
            }
            if (arg1.method1138(false, class33.field724)) {
                class191.field3568 = true;
            }
            if (arg1.method1138(false, class13.field324)) {
                class191.field3568 = false;
            }
            arg1.method1138(false, class102.field1965);
            arg1.method1138(false, class28.field623);
            if (arg1.method1138(false, class150.field2697)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class135.field2492[var5].field855[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1155(class168.field3034, arg0 - 1759) && class240.field4411 != 0) {
                class120.method770(arg1.method1162((byte) 106, 6).method1139(10), (byte) 104);
            }
            if (arg1.method1138(false, class96.field1819) && class240.field4411 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1155(class23.field572, -1721)) {
                class110.field2056 = arg1.method1162((byte) 112, 12).method1143(111).method1139(10);
                class189.method1276(0, (byte) 1, class78.method502((byte) -85, new class179[] { class124.field2291, class148.method949((byte) -14, class110.field2056) }), null);
            }
            if (arg1.method1138(false, class53.field1174)) {
                class69.field1378 = true;
            }
        }
        if (arg0 != 38) {
            field4057 = null;
        }
        class127.field2322++;
        class81.field1564.method70((byte) -62, 57);
        class81.field1564.method1230((byte) -115, arg1.method1168(true) - 1);
        class81.field1564.method1212((byte) 0, arg1.method1162((byte) 104, 2));
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static final void method1429(int arg0) {
        if (class199.field3714 != null) {
            class199.field3714.method303(1);
            class199.field3714 = null;
        }
        field4044++;
        class148.method948(false);
        class176.method1116();
        for (int var1 = 0; var1 < 4; var1++) {
            class135.field2492[var1].method269(16777215);
        }
        class132.method849((byte) 123);
        if (arg0 >= -52) {
            method1427(null, 11, null);
        }
        System.gc();
        class141.method898(2, (byte) -119);
        class144.field2618 = false;
        class136.field2520 = -1;
        class183.method1189((byte) -104);
        class223.method1449((byte) 106, 10);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()I")
    public final int method295() {
        field4063++;
        return this.field4051;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V")
    public final void method1430(int arg0, byte arg1) {
        field4062++;
        if (this.field4061) {
            return;
        }
        int var3 = -15 / ((-arg1 - 11) / 53);
        this.field4058 += arg0;
        while (this.field4058 > this.field4054.field2199[this.field4049]) {
            this.field4058 -= this.field4054.field2199[this.field4049];
            this.field4049++;
            if (this.field4054.field2217.length <= this.field4049) {
                this.field4061 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4065++;
        class75 var11 = this.method1431(true);
        if (var11 != null) {
            var11.method286(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4051 = var11.method295();
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Lgj;")
    private final class75 method1431(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field4067++;
        class54 var2 = class180.method1180(95, this.field4066);
        class75 var3;
        if (this.field4061) {
            var3 = var2.method375(-1, (byte) -96);
        } else {
            var3 = var2.method375(this.field4049, (byte) 77);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 62) {
            return;
        }
        field4055++;
        if (arg4 >= class235.field4336 && class40.field869 >= arg6 && arg2 >= class168.field3037 && arg0 <= class70.field1403) {
            if (arg5 == 1) {
                class11.method78(-2, arg6, arg0, arg4, arg3, arg2);
            } else {
                class66.method431(arg6, arg3, arg4, arg5, arg2, -65, arg0);
            }
        } else if (arg5 == 1) {
            class109.method711(arg3, arg2, arg4, arg6, arg0, -23480);
        } else {
            class191.method1286(arg3, arg5, arg4, arg2, -72, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1433(byte arg0) {
        if (arg0 != -44) {
            field4048 = null;
        }
        field4048 = null;
        field4057 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIIIII)V")
    public class219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4064 = arg5 + arg6;
        this.field4066 = arg0;
        this.field4060 = arg3;
        this.field4047 = arg4;
        this.field4068 = arg1;
        this.field4046 = arg2;
        int var8 = class180.method1180(94, this.field4066).field1188;
        if (var8 == -1) {
            this.field4061 = true;
        } else {
            this.field4061 = false;
            this.field4054 = class239.method1550(var8, (byte) 107);
        }
    }
}
