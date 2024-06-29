import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class312 {

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Liv;")
    private class565 field4330 = new class565();

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "Ljava/lang/String;")
    public String field4333;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field4321 = 1;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    private volatile int field4334;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "Lkm;")
    private class181 field4335;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Lfh;", line = 5)
    public final class600 method1883(int arg0) {
        field4323++;
        Object var2 = null;
        class565 var3 = this.field4330;
        synchronized (this.field4330) {
            if (arg0 <= 57) {
                method1885(-33, -5, false);
            }
            class600 var4 = this.field4330.method3313((byte) 126);
            var4.method3421(3);
            this.field4334--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lkm;Z)V", line = 25)
    public final void method1884(class181 arg0, boolean arg1) {
        field4322++;
        this.field4335 = arg0;
        if (arg1) {
            this.method1890(-82, null);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZ)Z", line = 36)
    public static final boolean method1885(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field4321 = 87;
        }
        field4329++;
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V", line = 47)
    public static final void method1886(int arg0) {
        for (int var1 = 0; var1 < class222.field3314; var1++) {
            class105 var3 = class428.field6114[var1];
            boolean var4 = false;
            if (var3.field1744 == null) {
                var3.field1742--;
                if (var3.field1742 < (var3.method880(arg0 - 16493) ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field1745 == 1 && var3.field1733 == null) {
                        var3.field1733 = class146.method1121(class233.field3455, var3.field1730, 0);
                        if (var3.field1733 == null) {
                            continue;
                        }
                        var3.field1742 += var3.field1733.method1118();
                    } else if (var3.method880(arg0 - 16415) && (var3.field1731 == null || var3.field1738 == null)) {
                        if (var3.field1731 == null) {
                            var3.field1731 = class459.method2665(class445.field6444, var3.field1730);
                        }
                        if (var3.field1731 == null) {
                            continue;
                        }
                        if (var3.field1738 == null) {
                            var3.field1738 = var3.field1731.method2663(new int[] { 22050 });
                            if (var3.field1738 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field1742 < 0) {
                        int var5 = 8192;
                        int var14;
                        if (var3.field1732 == 0) {
                            var14 = (var3.field1745 == 3 ? class525.field7713.field5997 : class525.field7713.field5973) * var3.field1729 >> 2;
                        } else {
                            int var6 = var3.field1732 >> 24 & 0x3;
                            if (class103.field1708.field3158 == var6) {
                                int var7 = var3.field1732 & 0xFF << 9;
                                int var8 = class103.field1708.method1108(100) << 8;
                                int var9 = (var3.field1732 & 0xFFD109) >> 16;
                                int var10 = (var9 << 9) + var8 + 256 - class103.field1708.field3155;
                                int var11 = (var3.field1732 & 0xFFA2) >> 8;
                                int var12 = (var11 << 9) + var8 + 256 - class103.field1708.field3154;
                                int var13 = Math.abs(var10) - (512 - Math.abs(var12));
                                if (var13 > var7) {
                                    var3.field1742 = -99999;
                                    continue;
                                }
                                if (var13 < 0) {
                                    var13 = 0;
                                }
                                var14 = (var7 - var13) * class525.field7713.field5995 * var3.field1729 / var7 >> 2;
                                if (var3.field1741 != null && var3.field1741 instanceof class144) {
                                    class144 var15 = (class144) var3.field1741;
                                    short var16 = var15.field2484;
                                    short var17 = var15.field2481;
                                }
                                if (var10 != 0 || var12 != 0) {
                                    int var18 = -class432.field6220 - ((int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var13 <= 0) {
                                        var19 = 8192;
                                    } else if (var13 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = (8192 - var13) / 4096 + 8192;
                                    }
                                    var5 = var18 * var19 / 8192 + (16384 - var19 >> 1);
                                }
                            } else {
                                var14 = 0;
                            }
                        }
                        if (var14 > 0) {
                            class95 var20 = null;
                            if (var3.field1745 == 1) {
                                var20 = var3.field1733.method1120().method723(class211.field3228);
                            } else if (var3.method880(-4)) {
                                var20 = var3.field1738;
                            }
                            class652 var21 = var3.field1744 = class652.method3663(var20, var3.field1747, var14, var5);
                            var21.method3644(var3.field1734 - 1);
                            class387.field5675.method3088(var21);
                        }
                    }
                }
            } else if (!var3.field1744.method2555(19742)) {
                var4 = true;
            }
            if (var4) {
                class222.field3314--;
                for (int var22 = var1; var22 < class222.field3314; var22++) {
                    class428.field6114[var22] = class428.field6114[var22 + 1];
                }
                var1--;
            }
        }
        field4326++;
        if (class369.field5120 && !class154.method1162((byte) 47)) {
            if (class525.field7713.field5991 != 0 && class283.field3963 != -1) {
                if (class453.field6518 == null) {
                    class513.method3050(class283.field3963, class97.field1451, class525.field7713.field5991, 0, 0, false);
                } else {
                    class165.method1254(class283.field3963, false, class525.field7713.field5991, class453.field6518, class97.field1451, true, 0);
                }
            }
            class453.field6518 = null;
            class369.field5120 = false;
        } else if (class525.field7713.field5991 != 0 && class283.field3963 != -1 && !class154.method1162((byte) 47)) {
            class554.field8101++;
            class699 var2 = class452.method2630(class699.field9897, class482.field6893, (byte) 127);
            var2.field9908.method2733(false, class283.field3963);
            class149.method1134(var2, true);
            class283.field3963 = -1;
        }
        if (arg0 != 16383) {
            field4321 = -3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)Z", line = 269)
    public static final boolean method1887(int arg0, byte arg1) {
        if (arg1 < 31) {
            method1886(-120);
        }
        field4328++;
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lvj;I)V", line = 280)
    public final void method1888(class204 arg0, int arg1) {
        field4332++;
        arg0.field3159 = false;
        class565 var3 = this.field4330;
        synchronized (this.field4330) {
            this.field4330.method3307(0, arg0);
            this.field4334++;
        }
        if (this.field4335 != null) {
            class181 var4 = this.field4335;
            synchronized (this.field4335) {
                this.field4335.notify();
            }
        }
        if (arg1 != 4) {
            this.method1883(106);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Z", line = 307)
    public final boolean method1889(byte arg0) {
        if (arg0 > -64) {
            return false;
        } else {
            field4331++;
            return this.field4334 == 0;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILvj;)V", line = 319)
    public final void method1890(int arg0, class204 arg1) {
        field4325++;
        arg1.field3159 = true;
        class565 var3 = this.field4330;
        synchronized (this.field4330) {
            if (arg0 != 1) {
                this.field4335 = null;
            }
            this.field4330.method3307(0, arg1);
            this.field4334++;
        }
        if (this.field4335 != null) {
            class181 var4 = this.field4335;
            synchronized (this.field4335) {
                this.field4335.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)I", line = 346)
    public static final int method1891(int arg0, int arg1) {
        if (arg0 > -41) {
            return -121;
        }
        field4327++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ldda;Z)V", line = 387)
    public final void method1892(class367 arg0, boolean arg1) {
        field4324++;
        if (arg1) {
            this.method1888(null, -118);
        }
        class565 var3 = this.field4330;
        synchronized (this.field4330) {
            this.field4330.method3307(0, arg0);
            this.field4334++;
        }
        if (this.field4335 != null) {
            class181 var4 = this.field4335;
            synchronized (this.field4335) {
                this.field4335.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 413)
    public class312(String arg0) {
        this.field4333 = arg0;
    }
}
