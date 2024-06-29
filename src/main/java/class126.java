import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class126 extends class19 {

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field1700 = new Object();

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    private int field1709 = 0;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    private int field1712 = 0;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "[Llt;")
    private class200[] field1719 = new class200[0];

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lch;")
    public static class151 field1708 = new class151("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "[Lju;")
    public static class242[] field1717 = new class242[50];

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "[C")
    public static char[] field1716 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field1718 = 0;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Lap;")
    public static class310 field1715 = new class310(67, 2);

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public static void method950(int arg0) {
        field1708 = null;
        field1716 = null;
        int var1 = -78 % ((arg0 - 8) / 46);
        field1717 = null;
        field1715 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lwr;B)V")
    public final void method131(class52 arg0, byte arg1) {
        Object var3 = this.field1700;
        synchronized (this.field1700) {
            super.field205[super.field196] = 20;
            if (arg1 < 30) {
                return;
            }
            super.field204[super.field196] = arg0;
            ++super.field196;
            ++super.field199;
            if (super.field196 >= 5000) {
                super.field196 = 0;
            }
            ++super.field198;
            if (this.field1709 > 0) {
                this.field1700.notifyAll();
            }
        }
        ++field1720;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (arg0 != -23413) {
            field1718 = 102;
        }
        try {
            Object var2 = this.field1700;
            synchronized (this.field1700) {
                while (super.field198 != 0) {
                    this.field1700.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field1710;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(BI)V")
    private final void method951(byte arg0, int arg1) {
        super.field205[super.field196] = (byte) arg1;
        ++field1701;
        ++super.field196;
        if (~super.field196 <= -5001) {
            super.field196 = 0;
        }
        ++super.field199;
        int var3 = -92 % ((arg0 - -46) / 59);
        ++super.field198;
        if (~this.field1709 < -1) {
            Object var4 = this.field1700;
            synchronized (this.field1700) {
                this.field1700.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    private final void method952(int arg0, int arg1) {
        super.field205[super.field196] = (byte) (arg0 - -10);
        ++field1706;
        ++super.field196;
        if (~super.field196 <= -5001) {
            super.field196 = 0;
        }
        ++super.field199;
        if (arg1 != -15133) {
            this.method131((class52) null, (byte) -113);
        }
        ++super.field198;
        if (this.field1709 > 0) {
            Object var3 = this.field1700;
            synchronized (this.field1700) {
                this.field1700.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(FIZLij;B)V")
    public final void method141(float arg0, int arg1, boolean arg2, class241 arg3, byte arg4) {
        ++field1711;
        if (arg4 != 63) {
            this.method132(true);
        }
        Object var6 = this.field1700;
        synchronized (this.field1700) {
            super.field205[super.field196] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
            super.field204[super.field196] = arg3;
            super.field201[super.field196] = arg0;
            ++super.field196;
            ++super.field199;
            ++super.field198;
            if (super.field196 >= 5000) {
                super.field196 = 0;
            }
            if (~this.field1709 < -1) {
                this.field1700.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V")
    public final void method142(byte arg0, int arg1) {
        if (arg0 == -83) {
            ++field1704;
            Object var3 = this.field1700;
            synchronized (this.field1700) {
                super.field205[super.field196] = (byte) arg1;
                ++super.field196;
                if (~super.field196 <= -5001) {
                    super.field196 = 0;
                }
                ++super.field198;
                ++super.field199;
                if (this.field1709 > 0) {
                    this.field1700.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Llt;I)V")
    public final void method953(class200 arg0, int arg1) {
        ++field1713;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field1700;
            byte var7;
            synchronized (this.field1700) {
                while (~super.field199 == -1) {
                    ++this.field1709;
                    this.field1700.wait();
                    --this.field1709;
                }
                var7 = super.field205[super.field197];
                if (arg0.field2964 < 0) {
                    if (~var7 <= -1 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (var7 < 0 || var7 > 3) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field4693 = super.field204[super.field197];
                    var5 = super.field201[super.field197];
                    super.field204[super.field197] = null;
                    ++super.field197;
                    --super.field199;
                    if (super.field197 >= 5000) {
                        super.field197 = 0;
                    }
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg0.field2964 > -1) {
                if (var7 >= 0 && var7 <= 3) {
                    arg0.field2964 = var7;
                    class340.field4702.method314(var7);
                }
            } else if (var7 != 21) {
                if (~var7 == -21) {
                    class52 var8 = (class52) arg0.field4693;
                    if (var8.field772 != null) {
                        var8.field772.method86(false, class340.field4702);
                    }
                    if (var8.field752 != null) {
                        var8.field752.method86(false, class340.field4702);
                    }
                    if (var8.field755 != null) {
                        var8.field755.method86(false, class340.field4702);
                    }
                    if (var8.field756 != null) {
                        var8.field756.method86(false, class340.field4702);
                    }
                    if (var8.field758 != null) {
                        var8.field758.method86(false, class340.field4702);
                    }
                    for (class131 var9 = var8.field763; var9 != null; var9 = var9.field1796) {
                        var9.field1803.method86(false, class340.field4702);
                    }
                } else if (var7 >= 30 && ~var7 >= -34) {
                    class340.field4702.method378(3000.0F, var5 * 1.5F);
                    ((class241) arg0.field4693).method587(class409.field5607, class54.field811, class4.field30, class154.field2129, ~(var7 + -30) == -1);
                } else if (var7 >= 40 && ~var7 >= -44) {
                    class340.field4702.method378(3000.0F, var5 * 1.5F);
                    ((class241) arg0.field4693).method587(class409.field5607, class54.field811, class4.field30, class399.field5480, var7 + -40 == 0);
                } else if (var7 == 22) {
                    class340.field4702.method309(-1, 1583160, 40, 127);
                } else if (var7 == 23) {
                    class340.field4702.method345();
                } else if (~var7 != -25) {
                    if (~var7 <= -11 && ~var7 >= -14) {
                        class340.field4702.method391(arg0.field2964);
                        arg0.field2964 = -1;
                    }
                } else {
                    class340.field4702.method439(0, (class104[]) null);
                }
            } else {
                class247.method1705(arg0, (class52) arg0.field4693);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field1700;
                synchronized (this.field1700) {
                    --super.field198;
                    if (super.field198 == 0) {
                        this.field1700.notifyAll();
                    }
                }
            }
        }
        if (arg1 < 5) {
            this.method141(-1.8832814F, 111, false, (class241) null, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLis;Lkk;)V")
    public static final void method954(int arg0, byte arg1, class65 arg2, class161 arg3) {
        ++field1702;
        class116 var4 = new class116();
        var4.field1615 = arg3.method1172((byte) 31);
        var4.field1610 = arg3.method1168(255);
        var4.field1612 = new int[var4.field1615];
        int var5 = -56 % ((arg1 - 10) / 55);
        var4.field1607 = new int[var4.field1615];
        var4.field1608 = new int[var4.field1615];
        var4.field1613 = new class275[var4.field1615];
        var4.field1611 = new byte[var4.field1615][][];
        var4.field1614 = new class275[var4.field1615];
        for (int var6 = 0; ~var4.field1615 < ~var6; ++var6) {
            try {
                int var7 = arg3.method1172((byte) -128);
                if (var7 != 0 && var7 != 1 && var7 != 2) {
                    if (~var7 == -4 || ~var7 == -5) {
                        String var11 = arg3.method1186(-1);
                        String var12 = arg3.method1186(-1);
                        int var13 = arg3.method1172((byte) 62);
                        String[] var14 = new String[var13];
                        for (int var15 = 0; var15 < var13; ++var15) {
                            var14[var15] = arg3.method1186(-1);
                        }
                        byte[][] var16 = new byte[var13][];
                        if (~var7 == -4) {
                            for (int var17 = 0; var17 < var13; ++var17) {
                                int var18 = arg3.method1168(255);
                                var16[var17] = new byte[var18];
                                arg3.method1179(var18, 0, var16[var17], false);
                            }
                        }
                        var4.field1607[var6] = var7;
                        Class[] var19 = new Class[var13];
                        for (int var20 = 0; var20 < var13; ++var20) {
                            var19[var20] = class280.method1870(false, var14[var20]);
                        }
                        var4.field1613[var6] = arg2.method599(class280.method1870(false, var11), var19, var12, (byte) 112);
                        var4.field1611[var6] = var16;
                    }
                } else {
                    String var8 = arg3.method1186(-1);
                    String var9 = arg3.method1186(-1);
                    int var10 = 0;
                    if (~var7 == -2) {
                        var10 = arg3.method1168(255);
                    }
                    var4.field1607[var6] = var7;
                    var4.field1608[var6] = var10;
                    var4.field1614[var6] = arg2.method593(var9, class280.method1870(false, var8), (byte) -97);
                }
            } catch (ClassNotFoundException var21) {
                var4.field1612[var6] = -1;
            } catch (SecurityException var22) {
                var4.field1612[var6] = -2;
            } catch (NullPointerException var23) {
                var4.field1612[var6] = -3;
            } catch (Exception var24) {
                var4.field1612[var6] = -4;
            } catch (Throwable var25) {
                var4.field1612[var6] = -5;
            }
        }
        class349.field4808.method766(var4, -1);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILwr;)V")
    public final void method137(int arg0, class52 arg1) {
        ++field1707;
        if (arg0 < -117) {
            Object var3 = this.field1700;
            synchronized (this.field1700) {
                --super.field197;
                if (~super.field197 > -1) {
                    super.field197 = 4999;
                }
                super.field205[super.field197] = 21;
                super.field204[super.field197] = arg1;
                ++super.field198;
                ++super.field199;
                if (this.field1709 > 0) {
                    this.field1700.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public final void method132(boolean arg0) {
        Object var2 = this.field1700;
        synchronized (this.field1700) {
            int var3 = 0;
            if (!arg0) {
                return;
            }
            while (true) {
                if (~var3 <= ~this.field1712) {
                    break;
                }
                if (this.field1719[var3].field2964 >= 0) {
                    this.method952(this.field1719[var3].field2964, -15133);
                }
                ++var3;
            }
        }
        ++field1703;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lwr;I)V")
    public final void method139(class52 arg0, int arg1) {
        ++field1714;
        Object var3 = this.field1700;
        synchronized (this.field1700) {
            super.field205[super.field196] = 21;
            super.field204[super.field196] = arg0;
            ++super.field196;
            if (~super.field196 <= -5001) {
                super.field196 = 0;
            }
            ++super.field198;
            ++super.field199;
            if (arg1 == 0) {
                if (~this.field1709 < -1) {
                    this.field1700.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)V")
    public final void method138(int arg0, byte arg1) {
        ++field1705;
        int var3 = 0;
        Object var4 = this.field1700;
        synchronized (this.field1700) {
            if (~this.field1712 == ~arg0) {
                for (int var5 = 0; ~this.field1712 < ~var5; ++var5) {
                    this.method951((byte) -116, var3++);
                }
            } else {
                int var6 = 0;
                if (arg1 != -63) {
                    field1716 = null;
                }
                while (~this.field1712 < ~var6) {
                    this.field1719[var6].method1391((byte) -128);
                    ++var6;
                }
                this.field1712 = arg0;
                this.field1719 = new class200[this.field1712];
                for (int var7 = 0; this.field1712 > var7; ++var7) {
                    this.field1719[var7] = new class200(this);
                    this.field1719[var7].method1394(true);
                    this.method951((byte) 67, var3++);
                }
            }
        }
    }
}
