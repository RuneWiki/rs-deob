import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class455 extends class391 {

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field6655 = new Object();

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    private int field6657 = 0;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "[Lge;")
    private class500[] field6656 = new class500[0];

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    private int field6658 = 0;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Z")
    public static boolean field6645 = false;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field6651 = -1;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lat;")
    public static class255 field6640;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "[I")
    public static int[] field6653;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILsd;)V", line = 4)
    public final void method1956(int arg0, class61 arg1) {
        Object var3 = this.field6655;
        synchronized (this.field6655) {
            super.field5470[super.field5468] = 21;
            super.field5473[super.field5468] = arg1;
            if (arg0 > -118) {
                return;
            }
            ++super.field5468;
            ++super.field5464;
            if (super.field5468 >= 5000) {
                super.field5468 = 0;
            }
            ++super.field5474;
            if (this.field6658 > 0) {
                this.field6655.notifyAll();
            }
        }
        ++field6654;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V", line = 27)
    public final void method1958(int arg0, boolean arg1) {
        ++field6643;
        Object var3 = this.field6655;
        synchronized (this.field6655) {
            super.field5470[super.field5468] = (byte) arg0;
            ++super.field5468;
            if (!arg1) {
                if (~super.field5468 <= -5001) {
                    super.field5468 = 0;
                }
                ++super.field5464;
                ++super.field5474;
                if (this.field6658 > 0) {
                    this.field6655.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)V", line = 51)
    private final void method2681(int arg0, int arg1) {
        super.field5470[super.field5468] = (byte) arg1;
        ++field6644;
        ++super.field5468;
        ++super.field5474;
        ++super.field5464;
        if (super.field5468 >= 5000) {
            super.field5468 = 0;
        }
        if (this.field6658 > 0) {
            Object var3 = this.field6655;
            synchronized (this.field6655) {
                this.field6655.notifyAll();
            }
        }
        if (arg0 != 5) {
            field6653 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLge;)V", line = 76)
    public final void method2682(byte arg0, class500 arg1) {
        ++field6646;
        boolean var3 = false;
        try {
            boolean var4 = false;
            if (arg0 <= 0) {
                this.method1959(true, (class35) null, 1.633646F, 16, 3);
            }
            float var5 = 0.0F;
            Object var6 = this.field6655;
            byte var7;
            synchronized (this.field6655) {
                while (super.field5474 == 0) {
                    ++this.field6658;
                    this.field6655.wait();
                    --this.field6658;
                }
                var7 = super.field5470[super.field5472];
                if (arg1.field7357 >= 0) {
                    if (var7 < 0 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (~var7 <= -1 && ~var7 >= -4) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field3658 = super.field5473[super.field5472];
                    var5 = super.field5466[super.field5472];
                    super.field5473[super.field5472] = null;
                    ++super.field5472;
                    if (~super.field5472 <= -5001) {
                        super.field5472 = 0;
                    }
                    --super.field5474;
                }
            }
            if (var3) {
                if (arg1.field7357 < 0) {
                    if (~var7 <= -1 && var7 <= 3) {
                        arg1.field7357 = var7;
                        class344.field4741.method534(var7);
                    }
                } else if (~var7 == -22) {
                    class263.method1519(arg1, (class61) arg1.field3658);
                } else if (var7 == 20) {
                    class61 var8 = (class61) arg1.field3658;
                    if (var8.field814 != null) {
                        var8.field814.method400(84, class344.field4741);
                    }
                    if (var8.field832 != null) {
                        var8.field832.method400(-67, class344.field4741);
                    }
                    if (var8.field825 != null) {
                        var8.field825.method400(127, class344.field4741);
                    }
                    if (var8.field816 != null) {
                        var8.field816.method400(-117, class344.field4741);
                    }
                    if (var8.field824 != null) {
                        var8.field824.method400(123, class344.field4741);
                    }
                    for (class302 var9 = var8.field819; var9 != null; var9 = var9.field4140) {
                        var9.field4136.method400(-119, class344.field4741);
                    }
                } else if (var7 >= 30 && var7 <= 33) {
                    class344.field4741.method440(3000.0F, var5 * 1.5F);
                    ((class35) arg1.field3658).method229(class192.field2742, class141.field2010, class231.field3212, class39.field529, var7 + -30 == 0);
                } else if (var7 >= 40 && ~var7 >= -44) {
                    class344.field4741.method440(3000.0F, var5 * 1.5F);
                    ((class35) arg1.field3658).method229(class192.field2742, class141.field2010, class231.field3212, class103.field1410, ~(var7 + -40) == -1);
                } else if (~var7 == -23) {
                    class344.field4741.method502(-1, 1583160, 40, 127);
                } else if (~var7 == -24) {
                    class344.field4741.method510();
                } else if (~var7 == -25) {
                    class344.field4741.method490(0, (class432[]) null);
                } else if (var7 >= 10 && var7 <= 13) {
                    class344.field4741.method486(arg1.field7357);
                    arg1.field7357 = -1;
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field6655;
                synchronized (this.field6655) {
                    --super.field5464;
                    if (super.field5464 == 0) {
                        this.field6655.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 246)
    public final void method1955(int arg0) {
        Object var2 = this.field6655;
        synchronized (this.field6655) {
            int var3 = 0;
            if (arg0 != 255) {
                return;
            }
            while (true) {
                if (var3 >= this.field6657) {
                    break;
                }
                if (~this.field6656[var3].field7357 <= -1) {
                    this.method2684(this.field6656[var3].field7357, (byte) 120);
                }
                ++var3;
            }
        }
        ++field6648;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLsd;)V", line = 274)
    public final void method1957(boolean arg0, class61 arg1) {
        if (!arg0) {
            this.field6657 = 10;
        }
        Object var3 = this.field6655;
        synchronized (this.field6655) {
            --super.field5472;
            if (~super.field5472 > -1) {
                super.field5472 = 4999;
            }
            super.field5470[super.field5472] = 21;
            super.field5473[super.field5472] = arg1;
            ++super.field5474;
            ++super.field5464;
            if (this.field6658 > 0) {
                this.field6655.notifyAll();
            }
        }
        ++field6638;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 302)
    public static void method2683(byte arg0) {
        field6653 = null;
        field6640 = null;
        if (arg0 >= 0) {
            field6645 = true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V", line = 313)
    private final void method2684(int arg0, byte arg1) {
        super.field5470[super.field5468] = (byte) (arg0 + 10);
        ++field6647;
        ++super.field5468;
        ++super.field5474;
        if (arg1 <= 9) {
            this.method1952((class61) null, (byte) -85);
        }
        ++super.field5464;
        if (~super.field5468 <= -5001) {
            super.field5468 = 0;
        }
        if (~this.field6658 < -1) {
            Object var3 = this.field6655;
            synchronized (this.field6655) {
                this.field6655.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLna;FII)V", line = 337)
    public final void method1959(boolean arg0, class35 arg1, float arg2, int arg3, int arg4) {
        if (arg3 <= 56) {
            this.method1952((class61) null, (byte) -17);
        }
        Object var6 = this.field6655;
        synchronized (this.field6655) {
            super.field5470[super.field5468] = (byte) (arg0 ? arg4 + 40 : arg4 + 30);
            super.field5473[super.field5468] = arg1;
            super.field5466[super.field5468] = arg2;
            ++super.field5468;
            ++super.field5474;
            ++super.field5464;
            if (~super.field5468 <= -5001) {
                super.field5468 = 0;
            }
            if (this.field6658 > 0) {
                this.field6655.notifyAll();
            }
        }
        ++field6650;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(II)Z", line = 368)
    public static final boolean method2685(int arg0, int arg1) {
        if (arg1 != 20721) {
            field6645 = false;
        }
        ++field6639;
        return ~(-arg0 & arg0) == ~arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V", line = 379)
    public final void method1953(int arg0, int arg1) {
        ++field6659;
        int var3 = 0;
        Object var4 = this.field6655;
        synchronized (this.field6655) {
            if (this.field6657 == arg0) {
                for (int var5 = 0; ~this.field6657 < ~var5; ++var5) {
                    this.method2681(5, var3++);
                }
            } else {
                if (arg1 != 255) {
                    this.field6657 = 119;
                }
                for (int var6 = 0; ~this.field6657 < ~var6; ++var6) {
                    this.field6656[var6].method2950(arg1 ^ -256);
                }
                this.field6657 = arg0;
                this.field6656 = new class500[this.field6657];
                for (int var7 = 0; ~this.field6657 < ~var7; ++var7) {
                    this.field6656[var7] = new class500(this);
                    this.field6656[var7].method2948(arg1 + -249);
                    this.method2681(5, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lsd;B)V", line = 433)
    public final void method1952(class61 arg0, byte arg1) {
        ++field6641;
        Object var3 = this.field6655;
        synchronized (this.field6655) {
            super.field5470[super.field5468] = 20;
            super.field5473[super.field5468] = arg0;
            ++super.field5468;
            ++super.field5474;
            ++super.field5464;
            if (arg1 <= 116) {
                this.method1956(84, (class61) null);
            }
            if (super.field5468 >= 5000) {
                super.field5468 = 0;
            }
            if (this.field6658 > 0) {
                this.field6655.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 466)
    public final void method1951(byte arg0) {
        ++field6642;
        try {
            Object var2 = this.field6655;
            synchronized (this.field6655) {
                if (arg0 < -114) {
                    while (super.field5464 != 0) {
                        this.field6655.wait();
                    }
                }
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIZ)V", line = 491)
    public static final void method2686(boolean arg0, int arg1, boolean arg2) {
        if (arg2) {
            --class67.field924;
            if (class67.field924 == 0) {
                field6653 = null;
            }
        }
        ++field6652;
        if (arg1 != 22485) {
            method2686(false, 62, true);
        }
        if (arg0) {
            --class214.field3045;
            if (~class214.field3045 == -1) {
                class437.field6373 = null;
                return;
            }
        }
    }
}
