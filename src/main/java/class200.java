import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class200 extends class232 {

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field2715 = new Object();

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    private int field2719 = 0;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "[Lwd;")
    private class164[] field2717 = new class164[0];

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    private int field2720 = 0;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
    public static int[] field2712 = new int[100];

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Z")
    public static boolean field2704 = false;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field2700 = -1;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field2714 = 0;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lti;")
    public static class280 field2698 = new class280();

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Lrq;")
    public static class213 field2713;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Lcc;")
    public static class474 field2718;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILf;)V", line = 3)
    public final void method1103(int arg0, class491 arg1) {
        ++field2705;
        if (arg0 != 6) {
            field2714 = -107;
        }
        Object var3 = this.field2715;
        synchronized (this.field2715) {
            --super.field3076;
            if (~super.field3076 > -1) {
                super.field3076 = 4999;
            }
            super.field3079[super.field3076] = 21;
            super.field3080[super.field3076] = arg1;
            ++super.field3083;
            ++super.field3084;
            if (~this.field2719 < -1) {
                this.field2715.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V", line = 28)
    private final void method1140(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1141((class164) null, -121);
        }
        super.field3079[super.field3078] = (byte) arg1;
        ++field2710;
        ++super.field3078;
        ++super.field3083;
        ++super.field3084;
        if (super.field3078 >= 5000) {
            super.field3078 = 0;
        }
        if (~this.field2719 < -1) {
            Object var3 = this.field2715;
            synchronized (this.field2715) {
                this.field2715.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lwd;I)V", line = 52)
    public final void method1141(class164 arg0, int arg1) {
        ++field2699;
        boolean var3 = false;
        try {
            float var5 = 0.0F;
            Object var6 = this.field2715;
            byte var7;
            synchronized (this.field2715) {
                while (~super.field3083 == -1) {
                    ++this.field2719;
                    this.field2715.wait();
                    --this.field2719;
                }
                var7 = super.field3079[super.field3076];
                if (~arg0.field2271 > -1) {
                    if (~var7 <= -1 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (~var7 > -1 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field1104 = super.field3080[super.field3076];
                    var5 = super.field3077[super.field3076];
                    super.field3080[super.field3076] = null;
                    ++super.field3076;
                    --super.field3083;
                    if (~super.field3076 <= -5001) {
                        super.field3076 = 0;
                    }
                }
            }
            if (var3) {
                if (~arg0.field2271 > -1) {
                    if (var7 >= 0 && ~var7 >= -4) {
                        arg0.field2271 = var7;
                        class95.field1404.method2041(var7);
                    }
                } else if (~var7 == -22) {
                    class308.method1699(arg0, (class491) arg0.field1104);
                } else if (var7 == 20) {
                    class491 var8 = (class491) arg0.field1104;
                    if (var8.field6864 != null) {
                        var8.field6864.method10(class95.field1404, (byte) -50);
                    }
                    if (var8.field6847 != null) {
                        var8.field6847.method10(class95.field1404, (byte) -124);
                    }
                    if (var8.field6840 != null) {
                        var8.field6840.method10(class95.field1404, (byte) -80);
                    }
                    if (var8.field6849 != null) {
                        var8.field6849.method10(class95.field1404, (byte) -92);
                    }
                    if (var8.field6842 != null) {
                        var8.field6842.method10(class95.field1404, (byte) -126);
                    }
                    for (class309 var9 = var8.field6845; var9 != null; var9 = var9.field4084) {
                        var9.field4091.method10(class95.field1404, (byte) -85);
                    }
                } else if (~var7 <= -31 && var7 <= 33) {
                    class95.field1404.method1997(3000.0F, var5 * 1.5F);
                    ((class177) arg0.field1104).method383(class121.field1779, class412.field5643, class314.field4169, class150.field2125, var7 + -30 == 0);
                } else if (var7 >= 40 && ~var7 >= -44) {
                    class95.field1404.method1997(3000.0F, var5 * 1.5F);
                    ((class177) arg0.field1104).method383(class121.field1779, class412.field5643, class314.field4169, class37.field552, var7 + -40 == 0);
                } else if (var7 != 22) {
                    if (~var7 == -24) {
                        class95.field1404.method1965();
                    } else if (var7 != 24) {
                        if (~var7 <= -11 && var7 <= 13) {
                            class95.field1404.method2015(arg0.field2271);
                            arg0.field2271 = -1;
                        }
                    } else {
                        class95.field1404.method1978(0, (class404[]) null);
                    }
                } else {
                    class95.field1404.method1989(-1, 1583160, 40, 127);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field2715;
                synchronized (this.field2715) {
                    --super.field3084;
                    if (super.field3084 == 0) {
                        this.field2715.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 219)
    public final void method1111(int arg0) {
        try {
            Object var2 = this.field2715;
            synchronized (this.field2715) {
                while (true) {
                    if (super.field3084 == 0) {
                        break;
                    }
                    this.field2715.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field2706;
        if (arg0 != 0) {
            field2713 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V", line = 241)
    private final void method1142(int arg0, int arg1) {
        ++field2709;
        super.field3079[super.field3078] = (byte) (arg0 + 10);
        ++super.field3078;
        ++super.field3083;
        ++super.field3084;
        if (arg1 > 119) {
            if (~super.field3078 <= -5001) {
                super.field3078 = 0;
            }
            if (~this.field2719 < -1) {
                Object var3 = this.field2715;
                synchronized (this.field2715) {
                    this.field2715.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V", line = 268)
    public static void method1143(int arg0) {
        field2712 = null;
        field2713 = null;
        field2698 = null;
        field2718 = null;
        int var1 = 55 / ((arg0 - -10) / 53);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V", line = 282)
    public final void method1108(int arg0, int arg1) {
        if (arg1 != 0) {
            field2713 = null;
        }
        ++field2703;
        Object var3 = this.field2715;
        synchronized (this.field2715) {
            super.field3079[super.field3078] = (byte) arg0;
            ++super.field3078;
            if (super.field3078 >= 5000) {
                super.field3078 = 0;
            }
            ++super.field3084;
            ++super.field3083;
            if (~this.field2719 < -1) {
                this.field2715.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lf;B)V", line = 307)
    public final void method1105(class491 arg0, byte arg1) {
        Object var3 = this.field2715;
        synchronized (this.field2715) {
            super.field3079[super.field3078] = 20;
            int var4 = -84 / ((-27 - arg1) / 32);
            super.field3080[super.field3078] = arg0;
            ++super.field3078;
            if (super.field3078 >= 5000) {
                super.field3078 = 0;
            }
            ++super.field3083;
            ++super.field3084;
            if (~this.field2719 < -1) {
                this.field2715.notifyAll();
            }
        }
        ++field2707;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V", line = 329)
    public final void method1106(byte arg0, int arg1) {
        ++field2711;
        int var3 = 0;
        Object var4 = this.field2715;
        synchronized (this.field2715) {
            if (this.field2720 == arg1) {
                for (int var5 = 0; ~this.field2720 < ~var5; ++var5) {
                    this.method1140(true, var3++);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field2720; ++var6) {
                    this.field2717[var6].method957(29457);
                }
                int var7 = 44 % ((arg0 - -9) / 38);
                this.field2720 = arg1;
                this.field2717 = new class164[this.field2720];
                for (int var8 = 0; ~this.field2720 < ~var8; ++var8) {
                    this.field2717[var8] = new class164(this);
                    this.field2717[var8].method956(2);
                    this.method1140(true, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ltf;ZFII)V", line = 378)
    public final void method1109(class177 arg0, boolean arg1, float arg2, int arg3, int arg4) {
        ++field2708;
        Object var6 = this.field2715;
        synchronized (this.field2715) {
            super.field3079[super.field3078] = (byte) (!arg1 ? arg3 + 30 : arg3 + 40);
            super.field3080[super.field3078] = arg0;
            super.field3077[super.field3078] = arg2;
            ++super.field3078;
            ++super.field3084;
            ++super.field3083;
            if (super.field3078 >= 5000) {
                super.field3078 = 0;
            }
            if (arg4 != 4) {
                this.method1103(35, (class491) null);
            }
            if (~this.field2719 < -1) {
                this.field2715.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 405)
    public final void method1112(int arg0) {
        ++field2701;
        Object var2 = this.field2715;
        synchronized (this.field2715) {
            int var3 = 0;
            if (arg0 >= -125) {
                this.field2715 = null;
            }
            while (var3 < this.field2720) {
                if (~this.field2717[var3].field2271 <= -1) {
                    this.method1142(this.field2717[var3].field2271, 121);
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lf;I)V", line = 433)
    public final void method1107(class491 arg0, int arg1) {
        Object var3 = this.field2715;
        synchronized (this.field2715) {
            super.field3079[super.field3078] = 21;
            super.field3080[super.field3078] = arg0;
            ++super.field3078;
            if (~super.field3078 <= -5001) {
                super.field3078 = 0;
            }
            ++super.field3083;
            ++super.field3084;
            if (arg1 != 0) {
                field2700 = -121;
            }
            if (~this.field2719 < -1) {
                this.field2715.notifyAll();
            }
        }
        ++field2716;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/awt/Component;)Lnj;", line = 463)
    public static final class148 method1144(int arg0, Component arg1) {
        if (arg0 != 0) {
            method1144(96, (Component) null);
        }
        ++field2702;
        return new class390(arg1);
    }
}
