import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class489 extends class295 {

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    private int field7238 = 0;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "Lkw;")
    private class166 field7231 = new class166();

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "[I")
    public static int[] field7224 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public static int field7230 = -1;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)V", line = 6)
    private final void method2921(byte arg0) {
        ++field7235;
        int var2 = super.field4304++;
        if (super.field4304 >= 5000) {
            super.field4304 = 0;
        }
        this.field7238 = super.field4298[var2];
        Object var3 = super.field4303[var2];
        super.field4303[var2] = null;
        if (this.field7238 != 21) {
            if (this.field7238 != 20) {
                if (~this.field7238 <= -31 && ~this.field7238 >= -34) {
                    class516.field7574.method748(3000.0F, super.field4299[var2] * 1.5F);
                    ((class23) var3).method213(class187.field2514, class25.field358, class28.field408, class203.field2720, this.field7238 + -30 == 0);
                } else if (this.field7238 >= 40 && this.field7238 <= 43) {
                    class516.field7574.method748(3000.0F, super.field4299[var2] * 1.5F);
                    ((class23) var3).method213(class187.field2514, class25.field358, class28.field408, class474.field7039, this.field7238 + -40 == 0);
                } else if (this.field7238 == 22) {
                    class516.field7574.method830(-1, 1583160, 40, 127);
                } else if (~this.field7238 == -24) {
                    class516.field7574.method788();
                } else if (~this.field7238 == -25) {
                    class516.field7574.method849(0, (class28[]) null);
                }
            } else {
                class452 var4 = (class452) var3;
                if (var4.field6812 != null) {
                    var4.field6812.method135(false, class516.field7574);
                }
                if (var4.field6797 != null) {
                    var4.field6797.method135(false, class516.field7574);
                }
                if (var4.field6809 != null) {
                    var4.field6809.method135(false, class516.field7574);
                }
                if (var4.field6815 != null) {
                    var4.field6815.method135(false, class516.field7574);
                }
                if (var4.field6801 != null) {
                    var4.field6801.method135(false, class516.field7574);
                }
                for (class384 var5 = var4.field6814; var5 != null; var5 = var5.field5834) {
                    var5.field5832.method135(false, class516.field7574);
                }
            }
        } else {
            class91.method609(this.field7231, (class452) var3);
        }
        if (arg0 != 20) {
            this.method422(false, 1.2898648F, 81, -89, (class23) null);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(Lsn;I)V", line = 99)
    public final void method424(class452 arg0, int arg1) {
        super.field4298[super.field4301] = 20;
        ++field7233;
        super.field4303[super.field4301] = arg0;
        if (arg1 <= -20) {
            ++super.field4301;
            if (super.field4301 >= 5000) {
                super.field4301 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZLsn;)V", line = 117)
    public final void method420(boolean arg0, class452 arg1) {
        ++field7236;
        --super.field4304;
        if (super.field4304 < 0) {
            super.field4304 = 4999;
        }
        super.field4298[super.field4304] = 21;
        super.field4303[super.field4304] = arg1;
        if (!arg0) {
            this.method413(11, -66);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V", line = 135)
    public static final void method2922(boolean arg0) {
        if (arg0) {
            for (class179 var1 = (class179) class86.field1251.method445(33); var1 != null; var1 = (class179) class86.field1251.method451(false)) {
                if (var1.field2399) {
                    var1.method1201(-1);
                }
            }
            ++field7223;
            for (class179 var2 = (class179) class86.field1254.method445(33); var2 != null; var2 = (class179) class86.field1254.method451(false)) {
                if (var2.field2399) {
                    var2.method1201(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILwq;)V", line = 169)
    public static final void method2923(int arg0, class115 arg1) {
        arg1.field1592 = false;
        if (arg1.field1591 != null) {
            arg1.field1591.field1659 = 0;
        }
        ++field7226;
        for (class115 var2 = arg1.method714(); var2 != null; var2 = arg1.method710()) {
            method2923(arg0, var2);
        }
        if (arg0 != 0) {
            method2922(true);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([BI)[B", line = 192)
    public static final byte[] method2924(byte[] arg0, int arg1) {
        ++field7225;
        if (arg0 == null) {
            return null;
        } else {
            if (arg1 != 30) {
                field7230 = 87;
            }
            byte[] var2 = new byte[arg0.length];
            class192.method1299(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V", line = 212)
    public final void method413(int arg0, int arg1) {
        super.field4298[super.field4301] = (byte) arg1;
        if (arg0 > 115) {
            ++field7227;
            ++super.field4301;
            if (~super.field4301 <= -5001) {
                super.field4301 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lsn;I)V", line = 230)
    public final void method414(class452 arg0, int arg1) {
        super.field4298[super.field4301] = 21;
        ++field7229;
        super.field4303[super.field4301] = arg0;
        if (arg1 == -1) {
            ++super.field4301;
            if (~super.field4301 <= -5001) {
                super.field4301 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V", line = 246)
    public final void method417(byte arg0) {
        ++field7234;
        int var2 = -62 / ((arg0 - 51) / 47);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZFIILo;)V", line = 256)
    public final void method422(boolean arg0, float arg1, int arg2, int arg3, class23 arg4) {
        super.field4298[super.field4301] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
        ++field7232;
        if (arg2 == 30) {
            super.field4303[super.field4301] = arg4;
            super.field4299[super.field4301] = arg1;
            ++super.field4301;
            if (super.field4301 >= 5000) {
                super.field4301 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V", line = 273)
    public final void method416(int arg0, int arg1) {
        ++field7228;
        if (arg1 != 0) {
            this.field7238 = -11;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V", line = 291)
    public final void method419(byte arg0) {
        ++field7237;
        if (arg0 > 100) {
            while (super.field4304 != super.field4301) {
                this.method2921((byte) 20);
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V", line = 304)
    public static void method2925(int arg0) {
        field7224 = null;
        if (arg0 != -10314) {
            method2922(false);
        }
    }
}
