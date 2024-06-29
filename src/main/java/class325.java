import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class325 extends class308 {

    @OriginalMember(owner = "client!cq", name = "Q", descriptor = "I")
    public int field4461;

    @OriginalMember(owner = "client!cq", name = "V", descriptor = "F")
    public float field4466;

    @OriginalMember(owner = "client!cq", name = "Y", descriptor = "Z")
    public boolean field4469;

    @OriginalMember(owner = "client!cq", name = "W", descriptor = "F")
    public float field4467;

    @OriginalMember(owner = "client!cq", name = "Z", descriptor = "I")
    public int field4470;

    @OriginalMember(owner = "client!cq", name = "O", descriptor = "I")
    public static int field4459 = 1;

    @OriginalMember(owner = "client!cq", name = "T", descriptor = "[I")
    public static int[] field4464 = new int[5];

    @OriginalMember(owner = "client!cq", name = "U", descriptor = "[I")
    public static int[] field4465 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!cq", name = "S", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!cq", name = "X", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!cq", name = "R", descriptor = "Lmd;")
    public static class380 field4462;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)V", line = 4)
    public static final void method1821(int arg0, int arg1, int arg2) {
        ++field4468;
        if (class481.field7041 > class481.field7044) {
            class481.field7044 = (float) ((double) class481.field7044 / 30.0D + (double) class481.field7044);
            if (class481.field7044 > class481.field7041) {
                class481.field7044 = class481.field7041;
            }
            class510.method2997((byte) 85);
            class481.field7038 = (int) class481.field7044 >> 1;
            class481.field7039 = class341.method1902(class481.field7038, (byte) 5);
        } else if (class481.field7041 < class481.field7044) {
            class481.field7044 = (float) ((double) class481.field7044 - (double) class481.field7044 / 30.0D);
            if (class481.field7044 < class481.field7041) {
                class481.field7044 = class481.field7041;
            }
            class510.method2997((byte) 113);
            class481.field7038 = (int) class481.field7044 >> 1;
            class481.field7039 = class341.method1902(class481.field7038, (byte) 5);
        }
        if (class356.field4865 != -1 && class517.field7596 != -1) {
            int var3 = -class201.field2872 + class356.field4865;
            if (~var3 > -3 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class137.field1956 + class517.field7596;
            if (var4 < 2 || ~var4 < -3) {
                var4 /= 8;
            }
            class201.field2872 -= -var3;
            class137.field1956 -= -var4;
            if (~var3 == -1 && ~var4 == -1) {
                class517.field7596 = -1;
                class356.field4865 = -1;
            }
            class510.method2997((byte) 70);
        }
        if (arg2 != 12368) {
            method1822((Object) null, (class397) null, -9);
        }
        if (class319.field4418 <= 0) {
            class210.field2971 = -1;
            class279.field3768 = -1;
        } else {
            --class52.field706;
            if (~class52.field706 == -1) {
                class52.field706 = 100;
                --class319.field4418;
            }
        }
        if (class483.field7087 && class496.field7297 != null) {
            for (class208 var5 = (class208) class496.field7297.method3072((byte) 92); var5 != null; var5 = (class208) class496.field7297.method3066(2)) {
                class191 var6 = class481.field7031.method850((byte) 78, var5.field2950.field1236);
                if (var5.method1263(arg0, arg1, (byte) 94)) {
                    if (var6.field2689 != null) {
                        if (var6.field2689[4] != null) {
                            class376.method2167(var6.field2682, 0, (long) var5.field2950.field1236, 1002, -1, (byte) -90, -1, false, var6.field2646, var6.field2689[4], true);
                        }
                        if (var6.field2689[3] != null) {
                            class376.method2167(var6.field2682, 0, (long) var5.field2950.field1236, 1006, -1, (byte) -90, -1, false, var6.field2646, var6.field2689[3], true);
                        }
                        if (var6.field2689[2] != null) {
                            class376.method2167(var6.field2682, 0, (long) var5.field2950.field1236, 1007, -1, (byte) -90, -1, false, var6.field2646, var6.field2689[2], true);
                        }
                        if (var6.field2689[1] != null) {
                            class376.method2167(var6.field2682, 0, (long) var5.field2950.field1236, 1001, -1, (byte) -90, -1, false, var6.field2646, var6.field2689[1], true);
                        }
                        if (var6.field2689[0] != null) {
                            class376.method2167(var6.field2682, 0, (long) var5.field2950.field1236, 1004, -1, (byte) -90, -1, false, var6.field2646, var6.field2689[0], true);
                        }
                    }
                    if (!var5.field2950.field1239) {
                        var5.field2950.field1239 = true;
                        class475.method2790(class411.field6021, var5.field2950.field1236, var6.field2682);
                    }
                    if (var5.field2950.field1239) {
                        class475.method2790(class243.field3391, var5.field2950.field1236, var6.field2682);
                    }
                } else if (var5.field2950.field1239) {
                    var5.field2950.field1239 = false;
                    class475.method2790(class3.field42, var5.field2950.field1236, var6.field2682);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/Object;Lkj;I)V", line = 144)
    public static final void method1822(Object arg0, class397 arg1, int arg2) {
        ++field4458;
        if (arg1.field5526 != null) {
            if (arg2 == 50) {
                for (int var3 = 0; var3 < 50 && arg1.field5526.peekEvent() != null; ++var3) {
                    class496.method2931((byte) 126, 1L);
                }
                if (arg0 != null) {
                    arg1.field5526.postEvent(new ActionEvent(arg0, 1001, "dummy"));
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lht;IIIIIZ)V", line = 167)
    public class325(class410 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field4461 = arg4;
        if (super.field2613 == 34037) {
            this.field4466 = (float) arg5;
            this.field4469 = false;
            this.field4467 = (float) arg4;
        } else {
            this.field4469 = true;
            this.field4467 = this.field4466 = 1.0F;
        }
        this.field4470 = arg5;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lht;IIIZ[I)V", line = 190)
    public class325(class410 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field4470 = arg3;
        if (~super.field2613 != -34038) {
            this.field4467 = this.field4466 = 1.0F;
            this.field4469 = true;
        } else {
            this.field4469 = false;
            this.field4467 = (float) arg2;
            this.field4466 = (float) arg3;
        }
        this.field4461 = arg2;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lht;IIIII[BI)V", line = 211)
    public class325(class410 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4470 = arg3;
        this.field4461 = arg2;
        this.method1746(arg6, false, arg7, 0, arg3, 0, true, 0, arg2, 0);
        this.field4469 = false;
        this.field4466 = (float) arg3 / (float) arg5;
        this.field4467 = (float) arg2 / (float) arg4;
        this.method1751(false, false, (byte) 117);
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lht;IIII[I)V", line = 229)
    public class325(class410 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4470 = arg2;
        this.field4461 = arg1;
        this.method1747(true, 0, 0, arg2, (byte) -114, arg1, 0, 0, arg5);
        this.field4469 = false;
        this.field4467 = (float) arg1 / (float) arg3;
        this.field4466 = (float) arg2 / (float) arg4;
        this.method1751(false, false, (byte) 74);
    }

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "(I)V", line = 245)
    public static void method1823(int arg0) {
        field4462 = null;
        field4465 = null;
        if (arg0 <= 101) {
            method1822((Object) null, (class397) null, 87);
        }
        field4464 = null;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lht;IIIIIIZ)V", line = 269)
    public class325(class410 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4469 = false;
        this.field4467 = (float) arg3 / (float) arg5;
        this.field4466 = (float) arg4 / (float) arg6;
        this.field4461 = arg3;
        this.field4470 = arg4;
        this.method1751(false, false, (byte) 82);
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lht;IIIIZ[BI)V", line = 287)
    public class325(class410 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field2613 != -34038) {
            this.field4469 = true;
            this.field4467 = this.field4466 = 1.0F;
        } else {
            this.field4467 = (float) arg3;
            this.field4469 = false;
            this.field4466 = (float) arg4;
        }
        this.field4461 = arg3;
        this.field4470 = arg4;
    }
}
