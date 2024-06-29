import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class683 extends class428 {

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field9606 = new Object();

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "[Lhg;")
    private class635[] field9611 = new class635[0];

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    private int field9610 = 0;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
    private int field9617 = 0;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "[I")
    public static int[] field9616 = new int[8];

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "Ljava/lang/String;")
    public static String field9609 = "";

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "I")
    public static int field9619 = 0;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "Lpj;")
    public static class132 field9603;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(ZLhl;)V")
    public final void method2429(boolean arg0, class486 arg1) {
        ++field9601;
        Object var3 = this.field9606;
        synchronized (this.field9606) {
            --super.field6018;
            if (arg0) {
                if (~super.field6018 > -1) {
                    super.field6018 = 4999;
                }
                super.field6012[super.field6018] = 21;
                super.field6016[super.field6018] = arg1;
                ++super.field6010;
                ++super.field6013;
                if (~this.field9617 < -1) {
                    this.field9606.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(II)V")
    private final void method3764(int arg0, int arg1) {
        ++field9607;
        super.field6012[super.field6011] = (byte) (arg0 + 10);
        ++super.field6011;
        ++super.field6013;
        ++super.field6010;
        if (super.field6011 >= arg1) {
            super.field6011 = 0;
        }
        if (~this.field9617 < -1) {
            Object var3 = this.field9606;
            synchronized (this.field9606) {
                this.field9606.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILhg;)V")
    public final void method3765(int arg0, class635 arg1) {
        ++field9599;
        boolean var3 = false;
        try {
            Object var5 = this.field9606;
            byte var6;
            synchronized (this.field9606) {
                while (super.field6013 == 0) {
                    ++this.field9617;
                    this.field9606.wait();
                    --this.field9617;
                }
                var6 = super.field6012[super.field6018];
                if (~arg1.field8933 > -1) {
                    if (~var6 <= -1 && ~var6 >= -4) {
                        var3 = true;
                    }
                } else if (var6 < 0 || var6 > 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field7750 = super.field6016[super.field6018];
                    super.field6016[super.field6018] = null;
                    ++super.field6018;
                    --super.field6013;
                    if (super.field6018 >= 5000) {
                        super.field6018 = 0;
                    }
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (arg1.field8933 >= 0) {
                if (var6 == 21) {
                    class165.method1144(arg1, (class486) arg1.field7750);
                } else if (~var6 == -21) {
                    class486 var7 = (class486) arg1.field7750;
                    if (var7.field6750 != null) {
                        var7.field6750.method552(true, class449.field6276);
                    }
                    if (var7.field6741 != null) {
                        var7.field6741.method552(true, class449.field6276);
                    }
                    if (var7.field6729 != null) {
                        var7.field6729.method552(true, class449.field6276);
                    }
                    if (var7.field6728 != null) {
                        var7.field6728.method552(true, class449.field6276);
                    }
                    if (var7.field6748 != null) {
                        var7.field6748.method552(true, class449.field6276);
                    }
                    for (class20 var8 = var7.field6751; var8 != null; var8 = var8.field284) {
                        var8.field281.method552(true, class449.field6276);
                    }
                } else if (~var6 <= -31 && var6 <= 33) {
                    ((class136) arg1.field7750).method271(class532.field7247, class159.field2386, class614.field8507, class525.field7157, var6 + -30 == 0);
                } else if (var6 >= 40 && ~var6 >= -44) {
                    ((class136) arg1.field7750).method271(class532.field7247, class159.field2386, class614.field8507, class81.field1138, ~(var6 + -40) == -1);
                } else if (var6 == 22) {
                    class449.field6276.method468(-1, 1583160, 40, 127);
                } else if (~var6 == -24) {
                    class449.field6276.method406();
                } else if (~var6 == -25) {
                    class449.field6276.method398(0, (class154[]) null);
                } else if (var6 >= 10 && var6 <= 13) {
                    class449.field6276.method394(arg1.field8933);
                    arg1.field8933 = -1;
                }
            } else if (var6 >= 0 && var6 <= 3) {
                arg1.field8933 = var6;
                class449.field6276.method382(var6);
            }
        } catch (Exception var21) {
        } finally {
            Object var12 = null;
            if (var3) {
                Object var13 = this.field9606;
                synchronized (this.field9606) {
                    --super.field6010;
                    if (~super.field6010 == -1) {
                        this.field9606.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIB)I")
    public static final int method3766(int arg0, int arg1, byte arg2) {
        ++field9612;
        if (arg2 > -96) {
            return 47;
        } else {
            int var3 = arg0 >>> 24;
            int var4 = ((16711935 & arg0) * var3 & -16711936 | (65280 & arg0) * var3 & 16711680) >>> 8;
            int var5 = -var3 + 255;
            return ((-16711936 & (16711935 & arg1) * var5 | (arg1 & 65280) * var5 & 16711680) >>> 8) + var4;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(IIB)Z")
    public static final boolean method3767(int arg0, int arg1, byte arg2) {
        ++field9615;
        if (arg2 <= 64) {
            return true;
        } else {
            return (arg0 & 16) != 0;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljr;B)V")
    public static final void method3768(class96 arg0, byte arg1) {
        for (int var2 = 0; ~var2 > ~class455.field6351; ++var2) {
            int var3 = arg0.method733((byte) 96);
            int var4 = arg0.method743((byte) -109);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class558.field7545[var3] != null) {
                class558.field7545[var3].field1947 = var4;
            }
        }
        if (arg1 != 0) {
            field9609 = null;
        }
        ++field9604;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)V")
    public final void method2430(int arg0, int arg1) {
        ++field9618;
        int var3 = 0;
        Object var4 = this.field9606;
        synchronized (this.field9606) {
            if (this.field9610 == arg1) {
                for (int var5 = 0; this.field9610 > var5; ++var5) {
                    this.method3770((byte) 98, var3++);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field9610; ++var6) {
                    this.field9611[var6].method3532(-9817);
                }
                int var7 = 50 % ((arg0 - -46) / 36);
                this.field9610 = arg1;
                this.field9611 = new class635[this.field9610];
                for (int var8 = 0; ~var8 > ~this.field9610; ++var8) {
                    this.field9611[var8] = new class635(this);
                    this.field9611[var8].method3533(false);
                    this.method3770((byte) 98, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIZLd;)V")
    public final void method2422(int arg0, int arg1, boolean arg2, class136 arg3) {
        Object var5 = this.field9606;
        synchronized (this.field9606) {
            super.field6012[super.field6011] = (byte) (!arg2 ? arg1 + 30 : arg1 + 40);
            super.field6016[super.field6011] = arg3;
            ++super.field6011;
            ++super.field6010;
            ++super.field6013;
            if (super.field6011 >= 5000) {
                super.field6011 = 0;
            }
            if (this.field9617 > 0) {
                this.field9606.notifyAll();
            }
        }
        if (arg0 == -15856) {
            ++field9605;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lhl;B)V")
    public final void method2420(class486 arg0, byte arg1) {
        ++field9613;
        Object var3 = this.field9606;
        synchronized (this.field9606) {
            super.field6012[super.field6011] = 21;
            super.field6016[super.field6011] = arg0;
            ++super.field6011;
            ++super.field6010;
            ++super.field6013;
            if (super.field6011 >= 5000) {
                super.field6011 = 0;
            }
            if (~this.field9617 < -1) {
                this.field9606.notifyAll();
            }
        }
        if (arg1 != 118) {
            field9603 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLhl;)V")
    public final void method2424(boolean arg0, class486 arg1) {
        Object var3 = this.field9606;
        synchronized (this.field9606) {
            super.field6012[super.field6011] = 20;
            super.field6016[super.field6011] = arg1;
            ++super.field6011;
            ++super.field6010;
            if (arg0) {
                this.field9610 = 2;
            }
            ++super.field6013;
            if (~super.field6011 <= -5001) {
                super.field6011 = 0;
            }
            if (~this.field9617 < -1) {
                this.field9606.notifyAll();
            }
        }
        ++field9608;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
    public static void method3769(int arg0) {
        field9609 = null;
        if (arg0 >= -121) {
            method3767(34, -14, (byte) -99);
        }
        field9603 = null;
        field9616 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public final void method2421(byte arg0) {
        try {
            Object var2 = this.field9606;
            synchronized (this.field9606) {
                while (true) {
                    if (super.field6010 == 0) {
                        break;
                    }
                    this.field9606.wait();
                }
            }
        } catch (Exception var4) {
        }
        if (arg0 >= 35) {
            ++field9598;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)V")
    private final void method3770(byte arg0, int arg1) {
        ++field9600;
        super.field6012[super.field6011] = (byte) arg1;
        if (arg0 != 98) {
            this.field9610 = 104;
        }
        ++super.field6011;
        if (~super.field6011 <= -5001) {
            super.field6011 = 0;
        }
        ++super.field6010;
        ++super.field6013;
        if (~this.field9617 < -1) {
            Object var3 = this.field9606;
            synchronized (this.field9606) {
                this.field9606.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public final void method2427(int arg0) {
        Object var2 = this.field9606;
        synchronized (this.field9606) {
            if (arg0 != -30496) {
                this.method2421((byte) 1);
            }
            int var3 = 0;
            while (true) {
                if (~var3 <= ~this.field9610) {
                    break;
                }
                if (~this.field9611[var3].field8933 <= -1) {
                    this.method3764(this.field9611[var3].field8933, 5000);
                }
                ++var3;
            }
        }
        ++field9614;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
    public final void method2426(int arg0, int arg1) {
        if (arg1 != -4136) {
            this.field9606 = null;
        }
        ++field9602;
        Object var3 = this.field9606;
        synchronized (this.field9606) {
            super.field6012[super.field6011] = (byte) arg0;
            ++super.field6011;
            ++super.field6013;
            if (~super.field6011 <= -5001) {
                super.field6011 = 0;
            }
            ++super.field6010;
            if (this.field9617 > 0) {
                this.field9606.notifyAll();
            }
        }
    }
}
