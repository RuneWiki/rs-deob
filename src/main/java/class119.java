import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 extends class328 implements class238 {

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "Z")
    private boolean field1510 = false;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "Lmw;")
    public class518 field1508;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "Z")
    private boolean field1511;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "[Z")
    public static boolean[] field1515 = new boolean[100];

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "Loba;")
    private class276 field1525;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "[Lgda;")
    public static class61[] field1509;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(Z)Z", line = 3)
    public final boolean method531(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field1516;
            return false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I", line = 17)
    public final int method927(int arg0) {
        if (arg0 != -24482) {
            return -93;
        } else {
            ++field1504;
            return this.field1508.field7296;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I", line = 31)
    public final int method928(int arg0) {
        ++field1530;
        if (arg0 != 13272) {
            field1509 = null;
        }
        return this.field1508.field7322;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lha;I)V", line = 42)
    public final void method500(class66 arg0, int arg1) {
        ++field1528;
        if (arg1 != -1) {
            this.field1525 = null;
        }
        class498 var3 = this.field1508.method3102(262144, true, true, -74, arg0);
        if (var3 != null) {
            int var4 = super.field823 >> 9;
            int var5 = super.field813 >> 9;
            class778 var6 = arg0.method576();
            var6.method130(super.field823, super.field809, super.field813);
            this.field1508.method3109(false, var4, var4, var3, arg1 + -17229, var5, var6, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)I", line = 67)
    public final int method508(int arg0) {
        ++field1522;
        if (arg0 != -4798) {
            this.method503(true);
        }
        return this.field1508.method3098((byte) -15);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)I", line = 78)
    public final int method929(byte arg0) {
        ++field1529;
        return arg0 != -45 ? 65 : this.field1508.field7289;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBILha;)Z", line = 90)
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        ++field1519;
        class498 var5 = this.field1508.method3102(131072, false, false, -127, arg3);
        if (var5 == null) {
            return false;
        } else {
            class778 var6 = arg3.method576();
            if (arg1 < 19) {
                return true;
            } else {
                var6.method130(super.field823, super.field809, super.field813);
                return class502.field7084 ? var5.method379(arg0, arg2, var6, false, 0, class621.field8528) : var5.method363(arg0, arg2, var6, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILha;)V", line = 111)
    public final void method930(int arg0, class66 arg1) {
        if (arg0 != 14353) {
            this.method524((class61) null, (class66) null, 39, -24, true, 116, 55);
        }
        this.field1508.method3099(-1, arg1);
        ++field1506;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(Z)V", line = 124)
    public final void method530(boolean arg0) {
        ++field1524;
        if (!arg0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;I)V", line = 136)
    public final void method931(class66 arg0, int arg1) {
        int var3 = 78 % ((28 - arg1) / 63);
        ++field1518;
        this.field1508.method3110(arg0, (byte) 98);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lha;Ltba;IIIIIZII)V", line = 162)
    public class119(class66 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field2124);
        this.field1508 = new class518(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field1511 = arg1.field2171 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)V", line = 150)
    public static void method932(byte arg0) {
        field1515 = null;
        int var1 = 12 / ((53 - arg0) / 45);
        field1509 = null;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)Z", line = 175)
    public final boolean method503(boolean arg0) {
        ++field1507;
        return arg0;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)I", line = 189)
    public final int method509(int arg0) {
        ++field1521;
        int var2 = 83 / ((arg0 - -38) / 56);
        return this.field1508.method3106(false);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(ILha;)Lrk;", line = 199)
    public final class35 method502(int arg0, class66 arg1) {
        ++field1513;
        int var3 = 30 % ((arg0 - 47) / 63);
        class498 var4 = this.field1508.method3102(2048, false, true, -89, arg1);
        if (var4 == null) {
            return null;
        } else {
            class778 var5 = arg1.method576();
            var5.method130(super.field823, super.field809, super.field813);
            class35 var6 = class415.method2476(1, (byte) 101, this.field1511);
            int var7 = super.field823 >> 9;
            int var8 = super.field813 >> 9;
            this.field1508.method3109(true, var7, var7, var4, -17230, var8, var5, var8, arg1);
            if (!class502.field7084) {
                var4.method355(var5, var6.field537[0], 0);
            } else {
                var4.method388(var5, var6.field537[0], class621.field8528, 0);
            }
            if (this.field1508.field7301 != null) {
                class460 var9 = this.field1508.field7301.method4244();
                if (class502.field7084) {
                    arg1.method590(var9, class621.field8528);
                } else {
                    arg1.method582(var9);
                }
            }
            this.field1510 = var4.method380() || this.field1508.field7301 != null;
            if (this.field1525 == null) {
                this.field1525 = class792.method4369(super.field809, super.field823, var4, (byte) -5, super.field813);
            } else {
                class521.method3120(111, super.field809, this.field1525, super.field813, var4, super.field823);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLha;)Loba;", line = 249)
    public final class276 method507(boolean arg0, class66 arg1) {
        ++field1517;
        if (arg0) {
            this.method531(true);
        }
        return this.field1525;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILgt;)V", line = 261)
    public final void method933(int arg0, class481 arg1) {
        if (arg0 != -10283) {
            this.method502(50, (class66) null);
        }
        ++field1514;
        this.field1508.method3101(0, arg1);
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)Z", line = 276)
    public final boolean method504(byte arg0) {
        ++field1527;
        return arg0 != -24 ? true : this.field1510;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljw;B)V", line = 288)
    public static final void method934(class581 arg0, byte arg1) {
        ++field1512;
        boolean var2 = false;
        if (arg1 <= 29) {
            method932((byte) 124);
        }
        arg0.method1088(4);
        for (class581 var3 = (class581) class365.field4542.method1003((byte) 53); var3 != null; var3 = (class581) class365.field4542.method1004(true)) {
            if (class424.method2536((byte) 127, arg0.method3348(26488), var3.method3348(26488))) {
                var2 = true;
                class159.method1117((byte) -36, var3, arg0);
                break;
            }
        }
        if (!var2) {
            class365.field4542.method1005(-61, arg0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)Z", line = 322)
    public final boolean method935(int arg0) {
        if (arg0 != 25271) {
            this.field1511 = true;
        }
        ++field1520;
        return this.field1508.method3108((byte) 119);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lgda;Lha;IIZII)V", line = 333)
    public final void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 >= -6) {
            this.method931((class66) null, -62);
        }
        ++field1523;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 344)
    public final void method936(boolean arg0) {
        ++field1526;
        if (arg0) {
            this.method502(-13, (class66) null);
        }
    }
}
