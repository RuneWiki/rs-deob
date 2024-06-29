import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class174 extends class147 {

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Ljava/lang/Object;")
    private Object field2235 = new Object();

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "[Luf;")
    private class313[] field2240 = new class313[0];

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    private int field2241 = 0;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    private int field2249 = 0;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lsd;")
    public static class63 field2243 = new class63(15, 0, 1, 0);

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "Lao;")
    public static class191 field2247 = new class191(73, -1);

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lo;")
    public static class24 field2239;

    static {
        new class305("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 4)
    public final void method197(int arg0) {
        Object var2 = this.field2235;
        synchronized (this.field2235) {
            int var3 = 0;
            while (true) {
                if (~var3 <= ~this.field2241) {
                    break;
                }
                if (~this.field2240[var3].field4178 <= -1) {
                    this.method1023(this.field2240[var3].field4178, arg0 ^ 5016);
                }
                ++var3;
            }
        }
        if (arg0 != 5000) {
            this.method1021(-78, -92);
        }
        ++field2244;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 28)
    public static final void method1018(byte arg0) {
        class226.field3037.method3045(48);
        int var1 = 14 / ((-49 - arg0) / 54);
        ++field2233;
        class320.field4268.method3045(48);
        class483.field7123.method3045(48);
        class309.field4140.method3045(48);
        class531.field7821.method3045(48);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILuf;)V", line = 42)
    public final void method1019(int arg0, class313 arg1) {
        ++field2234;
        boolean var3 = false;
        try {
            boolean var4 = false;
            if (arg0 != 5002) {
                method1022(47, 111, 5);
            }
            float var5 = 0.0F;
            Object var6 = this.field2235;
            byte var7;
            synchronized (this.field2235) {
                while (~super.field1937 == -1) {
                    ++this.field2249;
                    this.field2235.wait();
                    --this.field2249;
                }
                var7 = super.field1942[super.field1941];
                if (~arg1.field4178 <= -1) {
                    if (var7 < 0 || var7 > 3) {
                        var3 = true;
                    }
                } else if (var7 >= 0 && var7 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field5646 = super.field1939[super.field1941];
                    var5 = super.field1940[super.field1941];
                    super.field1939[super.field1941] = null;
                    ++super.field1941;
                    --super.field1937;
                    if (~super.field1941 <= -5001) {
                        super.field1941 = 0;
                    }
                }
            }
            if (var3) {
                if (arg1.field4178 < 0) {
                    if (~var7 <= -1 && var7 <= 3) {
                        arg1.field4178 = var7;
                        class492.field7216.method1187(var7);
                    }
                } else if (var7 == 21) {
                    class354.method2079(arg1, (class498) arg1.field5646);
                } else if (~var7 != -21) {
                    if (~var7 <= -31 && ~var7 >= -34) {
                        class492.field7216.method1140(3000.0F, var5 * 1.5F);
                        ((class38) arg1.field5646).method208(class151.field1977, class122.field1577, class349.field4645, class487.field7157, ~(var7 - 30) == -1);
                    } else if (var7 >= 40 && ~var7 >= -44) {
                        class492.field7216.method1140(3000.0F, var5 * 1.5F);
                        ((class38) arg1.field5646).method208(class151.field1977, class122.field1577, class349.field4645, class32.field327, ~(var7 - 40) == -1);
                    } else if (~var7 != -23) {
                        if (var7 == 23) {
                            class492.field7216.method1232();
                        } else if (var7 == 24) {
                            class492.field7216.method1146(0, (class309[]) null);
                        } else if (~var7 <= -11 && var7 <= 13) {
                            class492.field7216.method1171(arg1.field4178);
                            arg1.field4178 = -1;
                        }
                    } else {
                        class492.field7216.method1180(-1, 1583160, 40, 127);
                    }
                } else {
                    class498 var8 = (class498) arg1.field5646;
                    if (var8.field7264 != null) {
                        var8.field7264.method36((byte) -122, class492.field7216);
                    }
                    if (var8.field7257 != null) {
                        var8.field7257.method36((byte) -122, class492.field7216);
                    }
                    if (var8.field7259 != null) {
                        var8.field7259.method36((byte) -128, class492.field7216);
                    }
                    if (var8.field7271 != null) {
                        var8.field7271.method36((byte) -121, class492.field7216);
                    }
                    if (var8.field7268 != null) {
                        var8.field7268.method36((byte) -126, class492.field7216);
                    }
                    for (class192 var9 = var8.field7263; var9 != null; var9 = var9.field2469) {
                        var9.field2466.method36((byte) -121, class492.field7216);
                    }
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field2235;
                synchronized (this.field2235) {
                    --super.field1938;
                    if (super.field1938 == 0) {
                        this.field2235.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V", line = 212)
    public static void method1020(int arg0) {
        if (arg0 > 101) {
            field2247 = null;
            field2243 = null;
            field2239 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V", line = 226)
    private final void method1021(int arg0, int arg1) {
        super.field1942[super.field1943] = (byte) arg1;
        ++field2246;
        ++super.field1943;
        if (arg0 == 12453) {
            ++super.field1937;
            if (~super.field1943 <= -5001) {
                super.field1943 = 0;
            }
            ++super.field1938;
            if (this.field2249 > 0) {
                Object var3 = this.field2235;
                synchronized (this.field2235) {
                    this.field2235.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V", line = 250)
    public static final void method1022(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field2247 = null;
        }
        ++field2230;
        class184 var3 = class277.method1682(arg1, 5, -95);
        var3.method1069(true);
        var3.field2393 = arg2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lno;B)V", line = 267)
    public final void method204(class498 arg0, byte arg1) {
        ++field2238;
        Object var3 = this.field2235;
        synchronized (this.field2235) {
            if (arg1 == 30) {
                super.field1942[super.field1943] = 21;
                super.field1939[super.field1943] = arg0;
                ++super.field1943;
                if (~super.field1943 <= -5001) {
                    super.field1943 = 0;
                }
                ++super.field1937;
                ++super.field1938;
                if (~this.field2249 < -1) {
                    this.field2235.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 292)
    public final void method196(int arg0, int arg1) {
        ++field2227;
        int var3 = 0;
        Object var4 = this.field2235;
        synchronized (this.field2235) {
            if (this.field2241 == arg0) {
                for (int var5 = 0; this.field2241 > var5; ++var5) {
                    this.method1021(12453, var3++);
                }
            } else if (arg1 == 48) {
                for (int var6 = 0; this.field2241 > var6; ++var6) {
                    this.field2240[var6].method1860((byte) -118);
                }
                this.field2241 = arg0;
                this.field2240 = new class313[this.field2241];
                for (int var7 = 0; ~this.field2241 < ~var7; ++var7) {
                    this.field2240[var7] = new class313(this);
                    this.field2240[var7].method1862(-116);
                    this.method1021(arg1 + 12405, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 343)
    public final void method205(int arg0) {
        if (arg0 != 0) {
            field2243 = null;
        }
        ++field2242;
        try {
            Object var2 = this.field2235;
            synchronized (this.field2235) {
                while (~super.field1938 != -1) {
                    this.field2235.wait();
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(BLno;)V", line = 373)
    public final void method202(byte arg0, class498 arg1) {
        if (arg0 > 31) {
            Object var3 = this.field2235;
            synchronized (this.field2235) {
                --super.field1941;
                if (super.field1941 < 0) {
                    super.field1941 = 4999;
                }
                super.field1942[super.field1941] = 21;
                super.field1939[super.field1941] = arg1;
                ++super.field1938;
                ++super.field1937;
                if (this.field2249 > 0) {
                    this.field2235.notifyAll();
                }
            }
            ++field2237;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLno;)V", line = 399)
    public final void method200(byte arg0, class498 arg1) {
        ++field2228;
        Object var3 = this.field2235;
        synchronized (this.field2235) {
            if (arg0 <= 114) {
                this.field2241 = 58;
            }
            super.field1942[super.field1943] = 20;
            super.field1939[super.field1943] = arg1;
            ++super.field1943;
            ++super.field1938;
            if (~super.field1943 <= -5001) {
                super.field1943 = 0;
            }
            ++super.field1937;
            if (~this.field2249 < -1) {
                this.field2235.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V", line = 424)
    public final void method201(int arg0, int arg1) {
        ++field2231;
        Object var3 = this.field2235;
        synchronized (this.field2235) {
            super.field1942[super.field1943] = (byte) arg1;
            ++super.field1943;
            ++super.field1937;
            ++super.field1938;
            if (arg0 != 1) {
                field2239 = null;
            }
            if (~super.field1943 <= -5001) {
                super.field1943 = 0;
            }
            if (this.field2249 > 0) {
                this.field2235.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V", line = 448)
    private final void method1023(int arg0, int arg1) {
        super.field1942[super.field1943] = (byte) (arg0 + 10);
        ++field2245;
        ++super.field1943;
        ++super.field1937;
        if (super.field1943 >= 5000) {
            super.field1943 = 0;
        }
        ++super.field1938;
        if (arg1 == 16) {
            if (this.field2249 > 0) {
                Object var3 = this.field2235;
                synchronized (this.field2235) {
                    this.field2235.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lya;FZII)V", line = 474)
    public final void method199(class38 arg0, float arg1, boolean arg2, int arg3, int arg4) {
        Object var6 = this.field2235;
        synchronized (this.field2235) {
            super.field1942[super.field1943] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
            super.field1939[super.field1943] = arg0;
            super.field1940[super.field1943] = arg1;
            ++super.field1943;
            if (~super.field1943 <= -5001) {
                super.field1943 = 0;
            }
            ++super.field1937;
            ++super.field1938;
            if (~this.field2249 < -1) {
                this.field2235.notifyAll();
            }
        }
        if (arg4 == 0) {
            ++field2232;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)V", line = 512)
    public static final void method1024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 > 36) {
            for (class75 var7 = (class75) class292.field3862.method290(-1); var7 != null; var7 = (class75) class292.field3862.method284(10748)) {
                if (~var7.field952 >= ~class532.field7836) {
                    var7.method1239(107);
                } else {
                    class214.method1366((var7.field940 << 7) - -64, arg2 >> 1, arg3, -111, (var7.field939 << 7) + 64, arg4, var7.field949 * 2, arg1 >> 1, var7.field948);
                    class79.field976.method1885(0, 4, -16777216 | var7.field942, class382.field5525[0] + arg6, var7.field946, class382.field5525[1] + arg5);
                }
            }
            ++field2229;
        }
    }
}
