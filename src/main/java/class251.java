import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class251 extends class573 {

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "Lwda;")
    private class639 field3455;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Llaa;")
    private class122 field3454;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "Low;")
    private class351 field3465;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3450 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Lhda;")
    public static class752 field3464 = new class752(33, -1);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V", line = 6)
    public static void method1531(byte arg0) {
        field3450 = null;
        field3464 = null;
        if (arg0 != 16) {
            method1531((byte) -58);
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Llaa;Lwu;Lwda;)V", line = 17)
    public class251(class122 arg0, class376 arg1, class639 arg2) {
        super(arg0);
        this.field3455 = arg2;
        this.field3454 = arg0;
        if (arg1 != null && this.field3455.method3498((byte) -42) && this.field3454.field2049) {
            this.field3465 = class187.method1287(34336, arg1.method2204("transparent_water", "gl", (byte) 78), this.field3454, (byte) -118);
        } else {
            this.field3465 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/lang/String;[SI)V", line = 34)
    public static final void method1532(String[] arg0, short[] arg1, int arg2) {
        ++field3461;
        if (arg2 >= -79) {
            field3464 = null;
        }
        class194.method1329(arg0, arg0.length + -1, -40, 0, arg1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lwc;IB)V", line = 45)
    public final void method607(class67 arg0, int arg1, byte arg2) {
        ++field3449;
        if (arg2 <= 68) {
            this.field3454 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Z", line = 55)
    public final boolean method605(int arg0) {
        ++field3453;
        if (arg0 != 4095) {
            return false;
        } else {
            return this.field3465 != null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V", line = 66)
    public final void method603(boolean arg0) {
        ++field3458;
        if (!arg0) {
            this.field3455 = null;
        }
        super.field7517.method840(0, 60, class454.field6199);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I", line = 81)
    public static final int method1533(int arg0, int arg1) {
        ++field3459;
        if (arg0 > -61) {
            method1531((byte) 66);
        }
        return 127 & arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)I", line = 93)
    public static final int method1534(int arg0, byte arg1) {
        if (arg1 != 99) {
            method1534(-29, (byte) 67);
        }
        ++field3451;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 + -61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIB)V", line = 111)
    public static final void method1535(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > 93) {
            ++field3466;
            int var5 = class224.field3180;
            if (~var5 != -1) {
                if (~var5 != -2) {
                    if (var5 == 2) {
                        if (~arg0 > ~class567.field7458) {
                            class567.field7458 = arg0;
                        }
                        if (arg3 < class421.field5800) {
                            class421.field5800 = arg3;
                        }
                        if (~arg1 < ~class128.field2109) {
                            class128.field2109 = arg1;
                        }
                        if (~arg2 < ~class564.field7404) {
                            class564.field7404 = arg2;
                        }
                    }
                } else {
                    class564.field7404 = arg2;
                    class224.field3180 = 2;
                    class128.field2109 = arg1;
                    class567.field7458 = arg0;
                    class421.field5800 = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IB)V", line = 170)
    public static final void method1536(int arg0, byte arg1) {
        ++field3457;
        class127 var2 = class760.method4231(arg0, arg1 ^ -874792619, 4);
        var2.method1002(arg1 + -182);
        if (arg1 != 117) {
            field3450 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)V", line = 187)
    public final void method610(boolean arg0, int arg1) {
        if (arg1 > 109) {
            ++field3460;
            super.field7517.method849((byte) 77, class759.field10559, class99.field1265);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZZ)V", line = 201)
    public final void method611(boolean arg0, boolean arg1) {
        OpenGL.glBindProgramARB(34336, this.field3465.field4931);
        ++field3463;
        OpenGL.glEnable(34336);
        if (!arg0) {
            this.method605(-118);
        }
        super.field7517.method840(0, -97, class227.field3230);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V", line = 217)
    public final void method602(int arg0, int arg1, int arg2) {
        ++field3452;
        if (arg0 == -26427) {
            if (!this.field3455.field8467) {
                int var4 = super.field7517.field1759 % 4000 * 16 / 4000;
                super.field7517.method823(this.field3455.field8468[var4], -8423);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                float var5 = (float) (super.field7517.field1759 % 4000) / 4000.0F;
                super.field7517.method823(this.field3455.field8477, -8423);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)I", line = 244)
    public static final int method1537(int arg0) {
        if (arg0 != -16632) {
            return -72;
        } else {
            ++field3456;
            return class549.field7251.method1273(0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIIII)V", line = 257)
    public static final void method1538(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3462;
        if (arg1 < 73) {
            method1536(109, (byte) 45);
        }
        if (arg3 == arg5) {
            class686.method3863(arg4, arg2, arg3, 25187, arg0);
        } else if (~class261.field3632 >= ~(-arg3 + arg2) && arg2 + arg3 <= class209.field3090 && -arg5 + arg0 >= class380.field5289 && arg0 + arg5 <= class431.field5944) {
            class389.method2304(arg5, arg0, arg4, -124, arg2, arg3);
        } else {
            class42.method310(arg4, (byte) 0, arg0, arg2, arg3, arg5);
        }
    }
}
