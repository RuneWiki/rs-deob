import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class311 {

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "Lla;")
    private class422 field4691;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "Lla;")
    private class422 field4690;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "[I")
    public static int[] field4689 = new int[2];

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "Z")
    public static boolean field4698 = false;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "Lbga;")
    private class168 field4693;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V")
    public static void method2047(byte arg0) {
        if (arg0 != 68) {
            method2050(null, null, null, -37, null);
        }
        field4689 = null;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILjo;)Lug;")
    public final class58 method2048(int arg0, class20 arg1) {
        field4695++;
        if (arg1 == null) {
            return null;
        }
        class26 var3 = arg1.method117(1);
        if (class567.field8047 == var3) {
            return new class414((class56) arg1);
        } else if (class263.field4077 == var3) {
            return new class219(this.method2052(43), (class45) arg1);
        } else if (class540.field7709 == var3) {
            return new class550(this.field4691, (class268) arg1);
        } else if (class306.field4641 == var3) {
            return new class79(this.field4691, (class80) arg1);
        } else if (class53.field848 == var3) {
            return new class100(this.field4691, this.field4690, (class181) arg1);
        } else {
            if (arg0 != -19803) {
                field4689 = null;
            }
            if (class197.field3392 == var3) {
                return new class590(this.field4691, this.field4690, (class165) arg1);
            } else if (class33.field314 == var3) {
                return new class717(this.field4691, this.field4690, (class325) arg1);
            } else if (class701.field9906 == var3) {
                return new class115(this.field4691, this.field4690, (class232) arg1);
            } else if (class70.field1085 == var3) {
                return new class757(this.field4691, (class130) arg1);
            } else if (class119.field1827 == var3) {
                return new class604(this.field4691, this.field4690, (class405) arg1);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)V")
    public static final void method2049(byte arg0) {
        class357.method2281(4251, class654.field9289.field5422.method1789(3));
        field4692++;
        int var1 = (class497.field7212 >> 12) + (class265.field4123 >> 3);
        int var2 = (class329.field4857 >> 12) + (class723.field10155 >> 3);
        class582.field8234 = class145.field2251.field9470 = 0;
        class145.field2251.method3325(8, 8, 105);
        byte var3 = 18;
        class63.field991 = new byte[var3][];
        class730.field10245 = new byte[var3][];
        class339.field4964 = new byte[var3][];
        class339.field4966 = new int[var3];
        class304.field4635 = new int[var3];
        class184.field3099 = new int[var3][4];
        class205.field3445 = new int[var3];
        class693.field9833 = new byte[var3][];
        class666.field9464 = new int[var3];
        class387.field5799 = new int[var3];
        class298.field4520 = new int[var3];
        class404.field5987 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class191.field3229 >> 4)) / 8; var5 <= (((class191.field3229 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class314.field4720 >> 4)) / 8; var8 <= (((class314.field4720 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class205.field3445[var4] = var9;
                class387.field5799[var4] = class193.field3342.method2629("m" + var5 + "_" + var8, 10912);
                class339.field4966[var4] = class193.field3342.method2629("l" + var5 + "_" + var8, 10912);
                class298.field4520[var4] = class193.field3342.method2629("n" + var5 + "_" + var8, 10912);
                class304.field4635[var4] = class193.field3342.method2629("um" + var5 + "_" + var8, 10912);
                class666.field9464[var4] = class193.field3342.method2629("ul" + var5 + "_" + var8, 10912);
                if (class298.field4520[var4] == -1) {
                    class387.field5799[var4] = -1;
                    class339.field4966[var4] = -1;
                    class304.field4635[var4] = -1;
                    class666.field9464[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class298.field4520.length; var6++) {
            class298.field4520[var6] = -1;
            class387.field5799[var6] = -1;
            class339.field4966[var6] = -1;
            class304.field4635[var6] = -1;
            class666.field9464[var6] = -1;
        }
        if (arg0 > -86) {
            field4698 = false;
        }
        byte var7;
        if (class521.field7529 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class635.method3599(false, var7, var2, var1, -1);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lbfa;[I[II[I)V")
    public static final void method2050(class573 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            int var9 = arg2[var5];
            int var10 = 0;
            while (var8 != 0 && var10 < arg0.field1640.length) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg0.field1640[var10] = null;
                    } else {
                        class82 var11 = class83.field1219.method2358((byte) -75, var7);
                        int var12 = var11.field1195;
                        class253 var13 = arg0.field1640[var10];
                        if (var13 != null) {
                            if (var13.field4013 == var7) {
                                if (var12 == 0) {
                                    var13 = arg0.field1640[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field4019 = 0;
                                    var13.field4016 = 0;
                                    var13.field4017 = 1;
                                    var13.field4011 = var9;
                                    var13.field4018 = 0;
                                    if (!arg0.field1630) {
                                        class262.method1747(arg0, 0, var11, -26868);
                                    }
                                } else if (var12 == 2) {
                                    var13.field4016 = 0;
                                }
                            } else if (var11.field1199 >= class83.field1219.method2358((byte) -57, var13.field4013).field1199) {
                                var13 = arg0.field1640[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class253 var14 = arg0.field1640[var10] = new class253();
                            var14.field4011 = var9;
                            var14.field4013 = var7;
                            var14.field4018 = 0;
                            var14.field4017 = 1;
                            var14.field4019 = 0;
                            var14.field4016 = 0;
                            if (!arg0.field1630) {
                                class262.method1747(arg0, 0, var11, -26868);
                            }
                        }
                    }
                }
                var10++;
                var8 >>>= 0x1;
            }
        }
        int var6 = 14 / ((arg3 - 26) / 60);
        field4697++;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "([BB)Ljava/lang/String;")
    public static final String method2051(byte[] arg0, byte arg1) {
        field4696++;
        return arg1 == 15 ? class33.method168(true, arg0, 0, arg0.length) : null;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lla;Lla;)V")
    public class311(class422 arg0, class422 arg1) {
        this.field4691 = arg0;
        this.field4690 = arg1;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)Lbga;")
    private final class168 method2052(int arg0) {
        if (arg0 < 11) {
            this.method2048(44, null);
        }
        field4694++;
        if (this.field4693 == null) {
            this.field4693 = new class168();
        }
        return this.field4693;
    }
}
