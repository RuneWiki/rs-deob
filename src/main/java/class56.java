import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class56 extends class295 {

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field802 = new Object();

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
    private int field813 = 0;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "[Lui;")
    private class154[] field812 = new class154[0];

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "I")
    private int field815 = 0;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "Lwi;")
    public static class330 field809 = new class330(64);

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "[I")
    public static int[] field814 = new int[4096];

    @OriginalMember(owner = "client!jv", name = "G", descriptor = "I")
    public static int field822 = 0;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!jv", name = "C", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!jv", name = "D", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!jv", name = "E", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!jv", name = "F", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "Ll;")
    public static class15 field816;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "Lwk;")
    public static class96 field800;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V")
    public final void method413(int arg0, int arg1) {
        ++field810;
        Object var3 = this.field802;
        synchronized (this.field802) {
            super.field4298[super.field4301] = (byte) arg1;
            ++super.field4301;
            ++super.field4296;
            if (~super.field4301 <= -5001) {
                super.field4301 = 0;
            }
            if (arg0 >= 115) {
                ++super.field4302;
                if (~this.field813 < -1) {
                    this.field802.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lsn;I)V")
    public final void method414(class452 arg0, int arg1) {
        Object var3 = this.field802;
        synchronized (this.field802) {
            super.field4298[super.field4301] = 21;
            super.field4303[super.field4301] = arg0;
            ++super.field4301;
            ++super.field4302;
            ++super.field4296;
            if (super.field4301 >= 5000) {
                super.field4301 = 0;
            }
            if (arg1 != -1) {
                method423(-5);
            }
            if (this.field813 > 0) {
                this.field802.notifyAll();
            }
        }
        ++field811;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZILba;ILqa;IB)V")
    public static final void method415(boolean arg0, int arg1, class268 arg2, int arg3, class165 arg4, int arg5, byte arg6) {
        ++field805;
        if (arg0) {
            class451.field6771.method2201((class147.field1961 + -class451.field6771.method302()) / 2, (class107.field1525 + -class451.field6771.method306()) / 2);
            class534.field7851.method2201((class147.field1961 - class534.field7851.method302()) / 2, 18);
        }
        String var7 = "";
        if (class67.field957 != class41.field603) {
            if (class67.field957 == class249.field3474) {
                var7 = class420.field6389.method2705((byte) 69, class257.field3556);
            }
        } else {
            var7 = class10.field180.method2705((byte) 69, class257.field3556);
        }
        arg2.method1714(var7, false, arg5, class107.field1525 / 2 + -26, -1, class147.field1961 / 2);
        int var8 = class107.field1525 / 2 - 18;
        arg4.method810(class147.field1961 / 2 + -152, var8, 304, 34, arg3, 0);
        if (arg6 >= 43) {
            arg4.method810(class147.field1961 / 2 + -151, var8 + 1, 302, 32, 0, 0);
            arg4.method747(class147.field1961 / 2 + -150, var8 + 2, class362.field5561 * 3, 30, arg1, 0);
            arg4.method747(class362.field5561 * 3 + class147.field1961 / 2 + -150, var8 - -2, -(class362.field5561 * 3) + 300, 30, 0, 0);
            arg2.method1714(class528.field7739, false, arg5, class107.field1525 / 2 + 4, -1, class147.field1961 / 2);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(II)V")
    public final void method416(int arg0, int arg1) {
        ++field807;
        int var3 = arg1;
        Object var4 = this.field802;
        synchronized (this.field802) {
            if (~this.field815 == ~arg0) {
                for (int var5 = 0; var5 < this.field815; ++var5) {
                    this.method421(var3++, -29510);
                }
            } else {
                for (int var6 = 0; ~this.field815 < ~var6; ++var6) {
                    this.field812[var6].method999(114);
                }
                this.field815 = arg0;
                this.field812 = new class154[this.field815];
                for (int var7 = 0; ~var7 > ~this.field815; ++var7) {
                    this.field812[var7] = new class154(this);
                    this.field812[var7].method998(66);
                    this.method421(var3++, arg1 + -29510);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    public final void method417(byte arg0) {
        Object var2 = this.field802;
        synchronized (this.field802) {
            int var3 = 0;
            while (true) {
                if (~var3 <= ~this.field815) {
                    int var4 = -81 % ((51 - arg0) / 47);
                    break;
                }
                if (this.field812[var3].field2009 >= 0) {
                    this.method425(this.field812[var3].field2009, 125);
                }
                ++var3;
            }
        }
        ++field821;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BLui;)V")
    public final void method418(byte arg0, class154 arg1) {
        ++field801;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field802;
            byte var7;
            synchronized (this.field802) {
                while (~super.field4296 == -1) {
                    ++this.field813;
                    this.field802.wait();
                    --this.field813;
                }
                var7 = super.field4298[super.field4304];
                if (arg1.field2009 < 0) {
                    if (~var7 <= -1 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (~var7 > -1 || var7 > 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field2248 = super.field4303[super.field4304];
                    var5 = super.field4299[super.field4304];
                    super.field4303[super.field4304] = null;
                    ++super.field4304;
                    if (~super.field4304 <= -5001) {
                        super.field4304 = 0;
                    }
                    --super.field4296;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg1.field2009 > -1) {
                if (~var7 <= -1 && ~var7 >= -4) {
                    arg1.field2009 = var7;
                    class516.field7574.method740(var7);
                }
            } else if (var7 == 21) {
                class91.method609(arg1, (class452) arg1.field2248);
            } else if (~var7 == -21) {
                class452 var8 = (class452) arg1.field2248;
                if (var8.field6812 != null) {
                    var8.field6812.method135(false, class516.field7574);
                }
                if (var8.field6797 != null) {
                    var8.field6797.method135(false, class516.field7574);
                }
                if (var8.field6809 != null) {
                    var8.field6809.method135(false, class516.field7574);
                }
                if (var8.field6815 != null) {
                    var8.field6815.method135(false, class516.field7574);
                }
                if (var8.field6801 != null) {
                    var8.field6801.method135(false, class516.field7574);
                }
                for (class384 var9 = var8.field6814; var9 != null; var9 = var9.field5834) {
                    var9.field5832.method135(false, class516.field7574);
                }
            } else if (var7 >= 30 && ~var7 >= -34) {
                class516.field7574.method748(3000.0F, var5 * 1.5F);
                ((class23) arg1.field2248).method213(class187.field2514, class25.field358, class28.field408, class203.field2720, var7 + -30 == 0);
            } else if (var7 >= 40 && ~var7 >= -44) {
                class516.field7574.method748(3000.0F, var5 * 1.5F);
                ((class23) arg1.field2248).method213(class187.field2514, class25.field358, class28.field408, class474.field7039, var7 + -40 == 0);
            } else if (var7 == 22) {
                class516.field7574.method830(-1, 1583160, 40, 127);
            } else if (~var7 != -24) {
                if (~var7 == -25) {
                    class516.field7574.method849(0, (class28[]) null);
                } else if (~var7 <= -11 && ~var7 >= -14) {
                    class516.field7574.method785(arg1.field2009);
                    arg1.field2009 = -1;
                }
            } else {
                class516.field7574.method788();
            }
            if (arg0 != 30) {
                field809 = null;
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field802;
                synchronized (this.field802) {
                    --super.field4302;
                    if (~super.field4302 == -1) {
                        this.field802.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)V")
    public final void method419(byte arg0) {
        try {
            Object var2 = this.field802;
            synchronized (this.field802) {
                if (arg0 <= 100) {
                    return;
                }
                while (~super.field4302 != -1) {
                    this.field802.wait();
                }
            }
        } catch (Exception var6) {
        }
        ++field806;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZLsn;)V")
    public final void method420(boolean arg0, class452 arg1) {
        ++field820;
        Object var3 = this.field802;
        synchronized (this.field802) {
            --super.field4304;
            if (!arg0) {
                this.method422(false, -0.15631914F, -29, 105, (class23) null);
            }
            if (super.field4304 < 0) {
                super.field4304 = 4999;
            }
            super.field4298[super.field4304] = 21;
            super.field4303[super.field4304] = arg1;
            ++super.field4302;
            ++super.field4296;
            if (~this.field813 < -1) {
                this.field802.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(II)V")
    private final void method421(int arg0, int arg1) {
        super.field4298[super.field4301] = (byte) arg0;
        ++field808;
        ++super.field4301;
        if (super.field4301 >= 5000) {
            super.field4301 = 0;
        }
        ++super.field4296;
        ++super.field4302;
        if (arg1 == -29510) {
            if (this.field813 > 0) {
                Object var3 = this.field802;
                synchronized (this.field802) {
                    this.field802.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZFIILo;)V")
    public final void method422(boolean arg0, float arg1, int arg2, int arg3, class23 arg4) {
        ++field819;
        Object var6 = this.field802;
        synchronized (this.field802) {
            super.field4298[super.field4301] = (byte) (!arg0 ? arg3 + 30 : arg3 + 40);
            super.field4303[super.field4301] = arg4;
            if (arg2 == 30) {
                super.field4299[super.field4301] = arg1;
                ++super.field4301;
                if (super.field4301 >= 5000) {
                    super.field4301 = 0;
                }
                ++super.field4296;
                ++super.field4302;
                if (this.field813 > 0) {
                    this.field802.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V")
    public static void method423(int arg0) {
        field816 = null;
        field814 = null;
        if (arg0 != 0) {
            method415(true, -43, (class268) null, 103, (class165) null, -19, (byte) -112);
        }
        field800 = null;
        field809 = null;
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(Lsn;I)V")
    public final void method424(class452 arg0, int arg1) {
        if (arg1 < -20) {
            Object var3 = this.field802;
            synchronized (this.field802) {
                super.field4298[super.field4301] = 20;
                super.field4303[super.field4301] = arg0;
                ++super.field4301;
                if (super.field4301 >= 5000) {
                    super.field4301 = 0;
                }
                ++super.field4302;
                ++super.field4296;
                if (~this.field813 < -1) {
                    this.field802.notifyAll();
                }
            }
            ++field817;
        }
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(II)V")
    private final void method425(int arg0, int arg1) {
        super.field4298[super.field4301] = (byte) (arg0 + 10);
        ++field803;
        ++super.field4301;
        if (arg1 < 113) {
            this.field812 = null;
        }
        ++super.field4296;
        ++super.field4302;
        if (super.field4301 >= 5000) {
            super.field4301 = 0;
        }
        if (this.field813 > 0) {
            Object var3 = this.field802;
            synchronized (this.field802) {
                this.field802.notifyAll();
            }
        }
    }
}
