import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class447 extends class32 {

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "Ljava/lang/Object;")
    private Object field6418 = new Object();

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    private int field6419 = 0;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
    private int field6423 = 0;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "[Lt;")
    private class400[] field6424 = new class400[0];

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "J")
    public static long field6411 = -1L;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "[Z")
    public static boolean[] field6410;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(II)V", line = 7)
    public final void method208(int arg0, int arg1) {
        ++field6421;
        Object var3 = this.field6418;
        synchronized (this.field6418) {
            if (arg1 >= 0) {
                field6411 = -118L;
            }
            super.field362[super.field372] = (byte) arg0;
            ++super.field372;
            if (~super.field372 <= -5001) {
                super.field372 = 0;
            }
            ++super.field363;
            ++super.field369;
            if (this.field6419 > 0) {
                this.field6418.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lak;Z)V", line = 30)
    public final void method203(class193 arg0, boolean arg1) {
        ++field6425;
        if (!arg1) {
            Object var3 = this.field6418;
            synchronized (this.field6418) {
                super.field362[super.field372] = 21;
                super.field365[super.field372] = arg0;
                ++super.field372;
                if (~super.field372 <= -5001) {
                    super.field372 = 0;
                }
                ++super.field369;
                ++super.field363;
                if (~this.field6419 < -1) {
                    this.field6418.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILt;)V", line = 53)
    public final void method2773(int arg0, class400 arg1) {
        ++field6415;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field6418;
            byte var7;
            synchronized (this.field6418) {
                while (~super.field363 == -1) {
                    ++this.field6419;
                    this.field6418.wait();
                    --this.field6419;
                }
                var7 = super.field362[super.field364];
                if (arg1.field5722 >= 0) {
                    if (~var7 > -1 || var7 > 3) {
                        var3 = true;
                    }
                } else if (var7 >= 0 && var7 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field1914 = super.field365[super.field364];
                    var5 = super.field373[super.field364];
                    super.field365[super.field364] = null;
                    ++super.field364;
                    --super.field363;
                    if (super.field364 >= 5000) {
                        super.field364 = 0;
                    }
                }
                if (arg0 != -6334) {
                    field6410 = null;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (arg1.field5722 < 0) {
                if (var7 >= 0 && ~var7 >= -4) {
                    arg1.field5722 = var7;
                    class36.field422.method618(var7);
                }
            } else if (~var7 != -22) {
                if (~var7 == -21) {
                    class193 var8 = (class193) arg1.field1914;
                    if (var8.field2784 != null) {
                        var8.field2784.method64(class36.field422, (byte) -107);
                    }
                    if (var8.field2771 != null) {
                        var8.field2771.method64(class36.field422, (byte) -89);
                    }
                    if (var8.field2788 != null) {
                        var8.field2788.method64(class36.field422, (byte) -101);
                    }
                    if (var8.field2786 != null) {
                        var8.field2786.method64(class36.field422, (byte) -88);
                    }
                    if (var8.field2790 != null) {
                        var8.field2790.method64(class36.field422, (byte) -98);
                    }
                    for (class250 var9 = var8.field2779; var9 != null; var9 = var9.field3568) {
                        var9.field3571.method64(class36.field422, (byte) -60);
                    }
                } else if (var7 >= 30 && ~var7 >= -34) {
                    class36.field422.method691(3000.0F, var5 * 1.5F);
                    ((class327) arg1.field1914).method335(class444.field6379, class137.field1706, class76.field898, class29.field357, ~(var7 + -30) == -1);
                } else if (~var7 <= -41 && ~var7 >= -44) {
                    class36.field422.method691(3000.0F, var5 * 1.5F);
                    ((class327) arg1.field1914).method335(class444.field6379, class137.field1706, class76.field898, class337.field4793, var7 - 40 == 0);
                } else if (~var7 != -23) {
                    if (var7 != 23) {
                        if (var7 == 24) {
                            class36.field422.method677(0, (class397[]) null);
                        } else if (~var7 <= -11 && ~var7 >= -14) {
                            class36.field422.method684(arg1.field5722);
                            arg1.field5722 = -1;
                        }
                    } else {
                        class36.field422.method680();
                    }
                } else {
                    class36.field422.method690(-1, 1583160, 40);
                }
            } else {
                class452.method2799(arg1, (class193) arg1.field1914);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field6418;
                synchronized (this.field6418) {
                    --super.field369;
                    if (super.field369 == 0) {
                        this.field6418.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)V", line = 226)
    public final void method206(int arg0, int arg1) {
        ++field6417;
        int var3 = 0;
        Object var4 = this.field6418;
        synchronized (this.field6418) {
            if (this.field6423 == arg0) {
                for (int var5 = 0; ~this.field6423 < ~var5; ++var5) {
                    this.method2776(var3++, (byte) 17);
                }
            } else {
                for (int var6 = 0; ~this.field6423 < ~var6; ++var6) {
                    this.field6424[var6].method2548(61);
                }
                this.field6423 = arg0;
                this.field6424 = new class400[this.field6423];
                for (int var7 = arg1; this.field6423 > var7; ++var7) {
                    this.field6424[var7] = new class400(this);
                    this.field6424[var7].method2552(arg1 + -23491);
                    this.method2776(var3++, (byte) 17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(II)V", line = 272)
    private final void method2774(int arg0, int arg1) {
        ++field6416;
        super.field362[super.field372] = (byte) (arg1 + 10);
        if (arg0 <= -4) {
            ++super.field372;
            ++super.field363;
            ++super.field369;
            if (~super.field372 <= -5001) {
                super.field372 = 0;
            }
            if (this.field6419 > 0) {
                Object var3 = this.field6418;
                synchronized (this.field6418) {
                    this.field6418.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 302)
    public final void method207(int arg0) {
        if (arg0 != 3575) {
            this.method204(53, true, 0.020105906F, (byte) 28, (class327) null);
        }
        Object var2 = this.field6418;
        synchronized (this.field6418) {
            int var3 = 0;
            while (true) {
                if (var3 >= this.field6423) {
                    break;
                }
                if (~this.field6424[var3].field5722 <= -1) {
                    this.method2774(-21, this.field6424[var3].field5722);
                }
                ++var3;
            }
        }
        ++field6422;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V", line = 327)
    public static void method2775(boolean arg0) {
        if (!arg0) {
            field6410 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILak;)V", line = 338)
    public final void method200(int arg0, class193 arg1) {
        ++field6413;
        Object var3 = this.field6418;
        synchronized (this.field6418) {
            super.field362[super.field372] = 20;
            super.field365[super.field372] = arg1;
            ++super.field372;
            ++super.field363;
            ++super.field369;
            if (arg0 != -17986) {
                this.field6424 = null;
            }
            if (super.field372 >= 5000) {
                super.field372 = 0;
            }
            if (this.field6419 > 0) {
                this.field6418.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 362)
    public final void method201(int arg0) {
        if (arg0 != 0) {
            field6411 = 21L;
        }
        ++field6414;
        try {
            Object var2 = this.field6418;
            synchronized (this.field6418) {
                while (~super.field369 != -1) {
                    this.field6418.wait();
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(ILak;)V", line = 384)
    public final void method205(int arg0, class193 arg1) {
        Object var3 = this.field6418;
        synchronized (this.field6418) {
            --super.field364;
            if (~super.field364 > -1) {
                super.field364 = 4999;
            }
            super.field362[super.field364] = 21;
            super.field365[super.field364] = arg1;
            ++super.field363;
            ++super.field369;
            if (~this.field6419 < -1) {
                this.field6418.notifyAll();
            }
        }
        if (arg0 != 11610) {
            this.method2776(-36, (byte) -9);
        }
        ++field6409;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZFBLgh;)V", line = 431)
    public final void method204(int arg0, boolean arg1, float arg2, byte arg3, class327 arg4) {
        Object var6 = this.field6418;
        synchronized (this.field6418) {
            super.field362[super.field372] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
            super.field365[super.field372] = arg4;
            super.field373[super.field372] = arg2;
            ++super.field372;
            if (~super.field372 <= -5001) {
                super.field372 = 0;
            }
            int var7 = 20 / ((-5 - arg3) / 33);
            ++super.field369;
            ++super.field363;
            if (this.field6419 > 0) {
                this.field6418.notifyAll();
            }
        }
        ++field6420;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)V", line = 455)
    private final void method2776(int arg0, byte arg1) {
        ++field6408;
        super.field362[super.field372] = (byte) arg0;
        ++super.field372;
        if (~super.field372 <= -5001) {
            super.field372 = 0;
        }
        if (arg1 != 17) {
            this.method203((class193) null, false);
        }
        ++super.field369;
        ++super.field363;
        if (this.field6419 > 0) {
            Object var3 = this.field6418;
            synchronized (this.field6418) {
                this.field6418.notifyAll();
            }
        }
    }
}
