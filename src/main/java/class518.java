import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class518 extends class171 {

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "Ljava/lang/Object;")
    private Object field7703 = new Object();

    @OriginalMember(owner = "client!iu", name = "x", descriptor = "[Lof;")
    private class495[] field7705 = new class495[0];

    @OriginalMember(owner = "client!iu", name = "y", descriptor = "I")
    private int field7706 = 0;

    @OriginalMember(owner = "client!iu", name = "C", descriptor = "I")
    private int field7710 = 0;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "S")
    public static short field7698 = 1;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "Lqp;")
    public static class586 field7694 = new class586(9, 12);

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "Lqp;")
    public static class586 field7707 = new class586(88, 6);

    @OriginalMember(owner = "client!iu", name = "B", descriptor = "I")
    public static int field7709 = 0;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!iu", name = "A", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V", line = 6)
    public final void method935(int arg0) {
        try {
            Object var2 = this.field7703;
            synchronized (this.field7703) {
                if (arg0 != 5000) {
                    return;
                }
                while (~super.field2325 != -1) {
                    this.field7703.wait();
                }
            }
        } catch (Exception var6) {
        }
        ++field7702;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZ)V", line = 29)
    public final void method937(int arg0, boolean arg1) {
        ++field7708;
        Object var3 = this.field7703;
        synchronized (this.field7703) {
            super.field2323[super.field2324] = (byte) arg0;
            ++super.field2324;
            ++super.field2322;
            if (super.field2324 >= 5000) {
                super.field2324 = 0;
            }
            ++super.field2325;
            if (this.field7710 > 0) {
                this.field7703.notifyAll();
            }
            if (!arg1) {
                field7709 = -63;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLsk;)V", line = 53)
    public final void method942(byte arg0, class415 arg1) {
        Object var3 = this.field7703;
        synchronized (this.field7703) {
            if (arg0 <= 126) {
                this.method3075(-57, false);
            }
            --super.field2318;
            if (~super.field2318 > -1) {
                super.field2318 = 4999;
            }
            super.field2323[super.field2318] = 21;
            super.field2326[super.field2318] = arg1;
            ++super.field2322;
            ++super.field2325;
            if (this.field7710 > 0) {
                this.field7703.notifyAll();
            }
        }
        ++field7692;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(IZ)V", line = 76)
    private final void method3075(int arg0, boolean arg1) {
        ++field7701;
        super.field2323[super.field2324] = (byte) arg0;
        ++super.field2324;
        if (super.field2324 >= 5000) {
            super.field2324 = 0;
        }
        ++super.field2325;
        if (arg1) {
            field7694 = null;
        }
        ++super.field2322;
        if (this.field7710 > 0) {
            Object var3 = this.field7703;
            synchronized (this.field7703) {
                this.field7703.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lof;I)V", line = 100)
    public final void method3076(class495 arg0, int arg1) {
        ++field7697;
        int var3 = 85 % ((arg1 - -5) / 57);
        boolean var4 = false;
        try {
            boolean var5 = false;
            float var6 = 0.0F;
            Object var7 = this.field7703;
            byte var8;
            synchronized (this.field7703) {
                while (super.field2322 == 0) {
                    ++this.field7710;
                    this.field7703.wait();
                    --this.field7710;
                }
                var8 = super.field2323[super.field2318];
                if (arg0.field7457 < 0) {
                    if (~var8 <= -1 && ~var8 >= -4) {
                        var4 = true;
                    }
                } else if (var8 < 0 || ~var8 < -4) {
                    var4 = true;
                }
                if (var4) {
                    arg0.field891 = super.field2326[super.field2318];
                    var6 = super.field2319[super.field2318];
                    super.field2326[super.field2318] = null;
                    ++super.field2318;
                    --super.field2322;
                    if (~super.field2318 <= -5001) {
                        super.field2318 = 0;
                    }
                }
            }
            if (!var4) {
                Thread.yield();
            } else if (arg0.field7457 >= 0) {
                if (~var8 == -22) {
                    class152.method890(arg0, (class415) arg0.field891);
                } else if (var8 != 20) {
                    if (var8 >= 30 && ~var8 >= -34) {
                        class139.field1827.method1009(3000.0F, var6 * 1.5F);
                        ((class543) arg0.field891).method1318(class365.field5254, class613.field8993, class67.field763, class181.field2786, var8 - 30 == 0);
                    } else if (var8 >= 40 && ~var8 >= -44) {
                        class139.field1827.method1009(3000.0F, var6 * 1.5F);
                        ((class543) arg0.field891).method1318(class365.field5254, class613.field8993, class67.field763, class268.field3982, var8 - 40 == 0);
                    } else if (var8 == 22) {
                        class139.field1827.method1019(-1, 1583160, 40, 127);
                    } else if (var8 == 23) {
                        class139.field1827.method1034();
                    } else if (~var8 == -25) {
                        class139.field1827.method1045(0, (class535[]) null);
                    } else if (~var8 <= -11 && ~var8 >= -14) {
                        class139.field1827.method970(arg0.field7457);
                        arg0.field7457 = -1;
                    }
                } else {
                    class415 var9 = (class415) arg0.field891;
                    if (var9.field5987 != null) {
                        var9.field5987.method166(class139.field1827, true);
                    }
                    if (var9.field5978 != null) {
                        var9.field5978.method166(class139.field1827, true);
                    }
                    if (var9.field5985 != null) {
                        var9.field5985.method166(class139.field1827, true);
                    }
                    if (var9.field5989 != null) {
                        var9.field5989.method166(class139.field1827, true);
                    }
                    if (var9.field5976 != null) {
                        var9.field5976.method166(class139.field1827, true);
                    }
                    for (class639 var10 = var9.field5981; var10 != null; var10 = var10.field9291) {
                        var10.field9288.method166(class139.field1827, true);
                    }
                }
            } else if (var8 >= 0 && ~var8 >= -4) {
                arg0.field7457 = var8;
                class139.field1827.method981(var8);
            }
        } catch (Exception var23) {
        } finally {
            Object var14 = null;
            if (var4) {
                Object var15 = this.field7703;
                synchronized (this.field7703) {
                    --super.field2325;
                    if (~super.field2325 == -1) {
                        this.field7703.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V", line = 263)
    public final void method943(int arg0, int arg1) {
        ++field7704;
        int var3 = 0;
        Object var4 = this.field7703;
        synchronized (this.field7703) {
            if (this.field7706 == arg1) {
                for (int var5 = 0; ~this.field7706 < ~var5; ++var5) {
                    this.method3075(var3++, false);
                }
            } else {
                for (int var6 = 0; this.field7706 > var6; ++var6) {
                    this.field7705[var6].method2990(9773);
                }
                if (arg0 != 1300271884) {
                    this.method942((byte) -107, (class415) null);
                }
                this.field7706 = arg1;
                this.field7705 = new class495[this.field7706];
                for (int var7 = 0; ~this.field7706 < ~var7; ++var7) {
                    this.field7705[var7] = new class495(this);
                    this.field7705[var7].method2992(-1);
                    this.method3075(var3++, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(BLsk;)V", line = 312)
    public final void method941(byte arg0, class415 arg1) {
        Object var3 = this.field7703;
        synchronized (this.field7703) {
            super.field2323[super.field2324] = 21;
            super.field2326[super.field2324] = arg1;
            ++super.field2324;
            ++super.field2325;
            if (~super.field2324 <= -5001) {
                super.field2324 = 0;
            }
            ++super.field2322;
            if (this.field7710 > 0) {
                this.field7703.notifyAll();
            }
            if (arg0 > -122) {
                this.field7706 = 121;
            }
        }
        ++field7699;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lsk;B)V", line = 337)
    public final void method940(class415 arg0, byte arg1) {
        Object var3 = this.field7703;
        synchronized (this.field7703) {
            super.field2323[super.field2324] = 20;
            super.field2326[super.field2324] = arg0;
            ++super.field2324;
            if (~super.field2324 <= -5001) {
                super.field2324 = 0;
            }
            ++super.field2322;
            ++super.field2325;
            if (~this.field7710 < -1) {
                this.field7703.notifyAll();
            }
        }
        ++field7700;
        int var4 = 6 % ((57 - arg1) / 47);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)V", line = 364)
    private final void method3077(int arg0, byte arg1) {
        ++field7696;
        super.field2323[super.field2324] = (byte) (arg0 + 10);
        ++super.field2324;
        if (arg1 > -114) {
            this.method943(93, 65);
        }
        ++super.field2325;
        if (super.field2324 >= 5000) {
            super.field2324 = 0;
        }
        ++super.field2322;
        if (~this.field7710 < -1) {
            Object var3 = this.field7703;
            synchronized (this.field7703) {
                this.field7703.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V", line = 401)
    public final void method936(byte arg0) {
        ++field7693;
        if (arg0 >= 93) {
            Object var2 = this.field7703;
            synchronized (this.field7703) {
                for (int var3 = 0; var3 < this.field7706; ++var3) {
                    if (this.field7705[var3].field7457 >= 0) {
                        this.method3077(this.field7705[var3].field7457, (byte) -127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(FIIZLsa;)V", line = 427)
    public final void method938(float arg0, int arg1, int arg2, boolean arg3, class543 arg4) {
        ++field7695;
        Object var6 = this.field7703;
        synchronized (this.field7703) {
            super.field2323[super.field2324] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
            super.field2326[super.field2324] = arg4;
            super.field2319[super.field2324] = arg0;
            ++super.field2324;
            if (~super.field2324 <= -5001) {
                super.field2324 = 0;
            }
            ++super.field2325;
            ++super.field2322;
            if (~this.field7710 < -1) {
                this.field7703.notifyAll();
            }
            if (arg2 != -499625812) {
                this.method936((byte) 1);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V", line = 467)
    public static void method3078(int arg0) {
        field7707 = null;
        field7694 = null;
        if (arg0 > -9) {
            field7709 = -15;
        }
    }
}
