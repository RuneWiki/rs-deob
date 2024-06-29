import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class331 {

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "Ljava/lang/String;")
    private String field4594 = "null";

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public static int field4599 = 0;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "C")
    public char field4606;

    @OriginalMember(owner = "client!pba", name = "r", descriptor = "C")
    public char field4610;

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "F")
    public static float field4608;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!pba", name = "s", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "Lkk;")
    private class188 field4603;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "Lkk;")
    public class188 field4604;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IB)Z", line = 3)
    public final boolean method2158(int arg0, byte arg1) {
        int var3 = 2 % ((arg1 - 61) / 33);
        field4611++;
        if (this.field4604 == null) {
            return false;
        }
        if (this.field4603 == null) {
            this.method2168(-21411);
        }
        class756 var4 = (class756) this.field4603.method1180((byte) 26, (long) arg0);
        return var4 != null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lee;I)V", line = 28)
    public final void method2159(class675 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                if (arg1 != -1) {
                    return;
                }
                field4596++;
                return;
            }
            this.method2165(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(IB)I", line = 52)
    public static final int method2160(int arg0, byte arg1) {
        field4605++;
        if (arg1 != 11) {
            method2161(-16, null);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I[B)Z", line = 69)
    public static final boolean method2161(int arg0, byte[] arg1) {
        field4593++;
        class675 var2 = new class675(arg1);
        if (arg0 >= -53) {
            field4599 = -84;
        }
        int var3 = var2.method3750((byte) 35);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method3750((byte) 35) == 1;
        if (var4) {
            class703.method3953(var2, (byte) -108);
        }
        class500.method2972(32768, var2);
        return true;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V", line = 95)
    private final void method2162(int arg0) {
        field4598++;
        this.field4603 = new class188(this.field4604.method1183(0));
        class427 var2 = (class427) this.field4604.method1176(24490);
        int var3 = -124 % ((arg0 - 15) / 49);
        while (var2 != null) {
            class456 var4 = new class456(var2.field5991, (int) var2.field2546);
            this.field4603.method1179(class291.method1899(0, var2.field5991), var4, (byte) -26);
            var2 = (class427) this.field4604.method1178((byte) 71);
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)Ljava/lang/String;", line = 116)
    public final String method2163(int arg0, int arg1) {
        field4609++;
        if (this.field4604 == null) {
            return this.field4594;
        }
        class427 var3 = (class427) this.field4604.method1180((byte) 26, (long) arg1);
        if (var3 == null) {
            return this.field4594;
        } else {
            if (arg0 != -27058) {
                this.method2164(null, -7);
            }
            return var3.field5991;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 136)
    public final boolean method2164(String arg0, int arg1) {
        int var3 = -121 % ((-arg1 - 19) / 54);
        field4607++;
        if (this.field4604 == null) {
            return false;
        }
        if (this.field4603 == null) {
            this.method2162(70);
        }
        for (class456 var4 = (class456) this.field4603.method1180((byte) 26, class291.method1899(0, arg0)); var4 != null; var4 = (class456) this.field4603.method1174(0)) {
            if (var4.field6436.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZILee;)V", line = 165)
    private final void method2165(boolean arg0, int arg1, class675 arg2) {
        if (arg1 == 1) {
            this.field4610 = class174.method1114(arg2.method3719(1854307120), 0);
        } else if (arg1 == 2) {
            this.field4606 = class174.method1114(arg2.method3719(1854307120), 0);
        } else if (arg1 == 3) {
            this.field4594 = arg2.method3697(-1);
        } else if (arg1 == 4) {
            this.field4602 = arg2.method3703(104);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method3757((byte) -65);
            this.field4604 = new class188(class123.method837(122, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method3703(94);
                class189 var7;
                if (arg1 == 5) {
                    var7 = new class427(arg2.method3697(-1));
                } else {
                    var7 = new class756(arg2.method3703(100));
                }
                this.field4604.method1179((long) var6, var7, (byte) -26);
            }
        }
        if (arg0) {
            this.field4594 = null;
        }
        field4601++;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(II)I", line = 224)
    public final int method2166(int arg0, int arg1) {
        field4595++;
        if (this.field4604 == null) {
            return this.field4602;
        } else {
            int var3 = -11 / ((arg0 + 18) / 44);
            class756 var4 = (class756) this.field4604.method1180((byte) 26, (long) arg1);
            return var4 == null ? this.field4602 : var4.field10518;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLff;)V", line = 245)
    public static final void method2167(byte arg0, class9 arg1) {
        field4597++;
        arg1.field129 = null;
        if (arg0 != -98) {
            field4608 = 0.35850775F;
        }
        if (class511.field7305 < 20) {
            class103.field1230.method2307(0, arg1);
            class511.field7305++;
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V", line = 266)
    private final void method2168(int arg0) {
        field4600++;
        this.field4603 = new class188(this.field4604.method1183(0));
        for (class756 var2 = (class756) this.field4604.method1176(arg0 + 45901); var2 != null; var2 = (class756) this.field4604.method1178((byte) 71)) {
            class756 var3 = new class756((int) var2.field2546);
            this.field4603.method1179((long) var2.field10518, var3, (byte) -26);
        }
        if (arg0 != -21411) {
            field4599 = -72;
        }
    }
}
