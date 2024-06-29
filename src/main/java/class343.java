import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class343 extends class488 {

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field5368 = new Object();

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "[Ldf;")
    private class250[] field5373 = new class250[0];

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    private int field5372 = 0;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    private int field5375 = 0;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field5358 = 0;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Lnk;")
    public static class326 field5364 = new class326(78, 7);

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5377 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Lwr;")
    public static class61 field5367;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLdf;)V")
    public final void method2198(byte arg0, class250 arg1) {
        if (arg0 == -122) {
            ++field5371;
            boolean var3 = false;
            try {
                boolean var4 = false;
                float var5 = 0.0F;
                Object var6 = this.field5368;
                byte var7;
                synchronized (this.field5368) {
                    while (super.field7149 == 0) {
                        ++this.field5375;
                        this.field5368.wait();
                        --this.field5375;
                    }
                    var7 = super.field7148[super.field7143];
                    if (~arg1.field4254 <= -1) {
                        if (~var7 > -1 || var7 > 3) {
                            var3 = true;
                        }
                    } else if (~var7 <= -1 && ~var7 >= -4) {
                        var3 = true;
                    }
                    if (var3) {
                        arg1.field6078 = super.field7144[super.field7143];
                        var5 = super.field7145[super.field7143];
                        super.field7144[super.field7143] = null;
                        ++super.field7143;
                        if (~super.field7143 <= -5001) {
                            super.field7143 = 0;
                        }
                        --super.field7149;
                    }
                }
                if (!var3) {
                    Thread.yield();
                } else if (arg1.field4254 >= 0) {
                    if (var7 != 21) {
                        if (var7 != 20) {
                            if (var7 >= 30 && var7 <= 33) {
                                class81.field1439.method877(3000.0F, var5 * 1.5F);
                                ((class220) arg1.field6078).method1512(class205.field3248, class77.field1351, class31.field502, class141.field2332, var7 + -30 == 0);
                            } else if (var7 >= 40 && var7 <= 43) {
                                class81.field1439.method877(3000.0F, var5 * 1.5F);
                                ((class220) arg1.field6078).method1512(class205.field3248, class77.field1351, class31.field502, class205.field3249, var7 + -40 == 0);
                            } else if (~var7 != -23) {
                                if (var7 == 23) {
                                    class81.field1439.method858();
                                } else if (~var7 == -25) {
                                    class81.field1439.method870(0, (class450[]) null);
                                } else if (var7 >= 10 && var7 <= 13) {
                                    class81.field1439.method889(arg1.field4254);
                                    arg1.field4254 = -1;
                                }
                            } else {
                                class81.field1439.method871(-1, 1583160, 40, 127);
                            }
                        } else {
                            class465 var8 = (class465) arg1.field6078;
                            if (var8.field6907 != null) {
                                var8.field6907.method43((byte) 35, class81.field1439);
                            }
                            if (var8.field6901 != null) {
                                var8.field6901.method43((byte) 35, class81.field1439);
                            }
                            if (var8.field6904 != null) {
                                var8.field6904.method43((byte) 35, class81.field1439);
                            }
                            if (var8.field6908 != null) {
                                var8.field6908.method43((byte) 35, class81.field1439);
                            }
                            if (var8.field6913 != null) {
                                var8.field6913.method43((byte) 35, class81.field1439);
                            }
                            for (class1 var9 = var8.field6898; var9 != null; var9 = var9.field2) {
                                var9.field9.method43((byte) 35, class81.field1439);
                            }
                        }
                    } else {
                        class104.method722(arg1, (class465) arg1.field6078);
                    }
                } else if (~var7 <= -1 && ~var7 >= -4) {
                    arg1.field4254 = var7;
                    class81.field1439.method855(var7);
                }
            } catch (Exception var22) {
            } finally {
                Object var13 = null;
                if (var3) {
                    Object var14 = this.field5368;
                    synchronized (this.field5368) {
                        --super.field7146;
                        if (~super.field7146 == -1) {
                            this.field5368.notifyAll();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method2199(String arg0, boolean arg1) {
        ++field5359;
        if (arg0 == null) {
            return -1;
        } else {
            int var2 = 0;
            if (!arg1) {
                return 21;
            } else {
                while (var2 < class139.field2317) {
                    if (arg0.equalsIgnoreCase(class485.field7122[var2])) {
                        return var2;
                    }
                    ++var2;
                }
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILut;)V")
    public final void method2200(int arg0, class465 arg1) {
        ++field5366;
        Object var3 = this.field5368;
        synchronized (this.field5368) {
            super.field7148[super.field7147] = 21;
            if (arg0 != 0) {
                this.method2205(-72, 78);
            }
            super.field7144[super.field7147] = arg1;
            ++super.field7147;
            ++super.field7146;
            ++super.field7149;
            if (super.field7147 >= 5000) {
                super.field7147 = 0;
            }
            if (~this.field5375 < -1) {
                this.field5368.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(ILut;)V")
    public final void method2201(int arg0, class465 arg1) {
        Object var3 = this.field5368;
        synchronized (this.field5368) {
            super.field7148[super.field7147] = 20;
            super.field7144[super.field7147] = arg1;
            if (arg0 != 0) {
                this.method2198((byte) -58, (class250) null);
            }
            ++super.field7147;
            if (super.field7147 >= 5000) {
                super.field7147 = 0;
            }
            ++super.field7146;
            ++super.field7149;
            if (~this.field5375 < -1) {
                this.field5368.notifyAll();
            }
        }
        ++field5360;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
    private final void method2202(int arg0, int arg1) {
        super.field7148[super.field7147] = (byte) (arg1 - -10);
        ++field5365;
        ++super.field7147;
        if (~super.field7147 <= -5001) {
            super.field7147 = 0;
        }
        ++super.field7149;
        ++super.field7146;
        if (this.field5375 > arg0) {
            Object var3 = this.field5368;
            synchronized (this.field5368) {
                this.field5368.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(IB)V")
    private final void method2203(int arg0, byte arg1) {
        super.field7148[super.field7147] = (byte) arg0;
        ++field5357;
        ++super.field7147;
        if (arg1 != 96) {
            this.field5375 = 125;
        }
        ++super.field7149;
        ++super.field7146;
        if (super.field7147 >= 5000) {
            super.field7147 = 0;
        }
        if (this.field5375 > 0) {
            Object var3 = this.field5368;
            synchronized (this.field5368) {
                this.field5368.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lya;IZFI)V")
    public final void method2204(class220 arg0, int arg1, boolean arg2, float arg3, int arg4) {
        ++field5363;
        Object var6 = this.field5368;
        synchronized (this.field5368) {
            super.field7148[super.field7147] = (byte) (!arg2 ? arg1 + 30 : arg1 + 40);
            super.field7144[super.field7147] = arg0;
            super.field7145[super.field7147] = arg3;
            ++super.field7147;
            ++super.field7146;
            if (arg4 >= -106) {
                this.method2205(-51, -10);
            }
            ++super.field7149;
            if (super.field7147 >= 5000) {
                super.field7147 = 0;
            }
            if (this.field5375 > 0) {
                this.field5368.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public final void method2205(int arg0, int arg1) {
        Object var3 = this.field5368;
        synchronized (this.field5368) {
            super.field7148[super.field7147] = (byte) arg1;
            ++super.field7147;
            if (~super.field7147 <= -5001) {
                super.field7147 = 0;
            }
            ++super.field7146;
            if (arg0 != 5000) {
                this.method2206((class465) null, -110);
            }
            ++super.field7149;
            if (this.field5375 > 0) {
                this.field5368.notifyAll();
            }
        }
        ++field5369;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lut;I)V")
    public final void method2206(class465 arg0, int arg1) {
        ++field5361;
        Object var3 = this.field5368;
        synchronized (this.field5368) {
            --super.field7143;
            if (~super.field7143 > -1) {
                super.field7143 = 4999;
            }
            super.field7148[super.field7143] = 21;
            super.field7144[super.field7143] = arg0;
            ++super.field7146;
            ++super.field7149;
            if (this.field5375 > 0) {
                this.field5368.notifyAll();
            }
            if (arg1 != -6409) {
                field5364 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public final void method2207(byte arg0) {
        try {
            Object var2 = this.field5368;
            synchronized (this.field5368) {
                if (arg0 <= 116) {
                    method2199((String) null, true);
                }
                while (~super.field7146 != -1) {
                    this.field5368.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field5362;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public final void method2208(byte arg0) {
        if (arg0 < 84) {
            field5358 = 28;
        }
        ++field5370;
        Object var2 = this.field5368;
        synchronized (this.field5368) {
            for (int var3 = 0; ~var3 > ~this.field5372; ++var3) {
                if (this.field5373[var3].field4254 >= 0) {
                    this.method2202(0, this.field5373[var3].field4254);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V")
    public final void method2209(int arg0, byte arg1) {
        ++field5374;
        int var3 = 0;
        Object var4 = this.field5368;
        synchronized (this.field5368) {
            if (~this.field5372 == ~arg0) {
                for (int var5 = 0; this.field5372 > var5; ++var5) {
                    this.method2203(var3++, (byte) 96);
                }
            } else {
                for (int var6 = 0; this.field5372 > var6; ++var6) {
                    this.field5373[var6].method1693(arg1 + -15162);
                }
                if (arg1 != -6) {
                    this.field5373 = null;
                }
                this.field5372 = arg0;
                this.field5373 = new class250[this.field5372];
                for (int var7 = 0; ~this.field5372 < ~var7; ++var7) {
                    this.field5373[var7] = new class250(this);
                    this.field5373[var7].method1694((byte) -16);
                    this.method2203(var3++, (byte) 96);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public static void method2210(boolean arg0) {
        field5367 = null;
        field5377 = null;
        if (arg0) {
            method2199((String) null, false);
        }
        field5364 = null;
    }
}
