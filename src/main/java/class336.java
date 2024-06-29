import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class336 {

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Lsq;")
    private class454 field4608 = new class454(256);

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Lsq;")
    private class454 field4616 = new class454(256);

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lfc;")
    private class343 field4607;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Lfc;")
    private class343 field4613;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lcs;")
    public static class351 field4606 = new class351(29, -1);

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Lcs;")
    public static class351 field4617 = new class351(40, 2);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Lfc;")
    public static class343 field4611;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III[I)Lcu;", line = 5)
    private final class144 method1998(int arg0, int arg1, int arg2, int[] arg3) {
        field4610++;
        int var5 = arg2 ^ (arg1 << 4 & 0xFFF7 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class144 var9 = (class144) this.field4616.method2614(var7, arg0 ^ 0xFFFFFFB4);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            if (arg0 != 29) {
                field4612 = 63;
            }
            class89 var10 = class89.method607(this.field4613, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class144 var11 = var10.method609();
            this.field4616.method2620(var7, var11, false);
            if (arg3 != null) {
                arg3[0] -= var11.field2013.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)I", line = 41)
    public static final int method1999(int arg0, byte arg1) {
        if (arg1 > -6) {
            field4617 = null;
        }
        field4602++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lq;", line = 56)
    public static final class152 method2000(int arg0, int arg1) {
        field4614++;
        class152 var2 = (class152) class101.field1411.method659((long) arg1, (byte) -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class465.field6535.method2029(arg0, arg1, 0);
        class152 var4 = new class152();
        if (var3 != null) {
            var4.method917(new class425(var3), 255);
        }
        var4.method921(false);
        class101.field1411.method653(86, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB[II)Lcu;", line = 87)
    private final class144 method2001(int arg0, byte arg1, int[] arg2, int arg3) {
        if (arg1 >= -56) {
            this.field4616 = null;
        }
        field4609++;
        int var5 = arg0 ^ ((arg3 & 0x30000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class144 var9 = (class144) this.field4616.method2614(var7, -82);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class360 var10 = (class360) this.field4608.method2614(var7, 104);
            if (var10 == null) {
                var10 = class360.method2163(this.field4607, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field4608.method2620(var7, var10, false);
            }
            class144 var11 = var10.method2164(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1182(28818);
                this.field4616.method2620(var7, var11, false);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I", line = 133)
    public static final int method2002(int arg0) {
        field4605++;
        if (arg0 != 7353) {
            method2002(98);
        }
        if (class146.field2070 == null) {
            if (!class351.field4800 && class161.field2310 > 0) {
                if (class228.field3215 && class194.field2757.method531(81, 111) && class161.field2310 > 2) {
                    return ((class106) class250.field3514.field3504.field2609.field2609).field1520;
                }
                return ((class106) class250.field3514.field3504.field2609).field1520;
            }
            int var1 = class56.field902.method1301(arg0 ^ 0x2945);
            int var2 = class56.field902.method1305(arg0 ^ 0x1C46);
            int var3 = class393.field5531;
            int var4 = class214.field3036;
            int var5 = class23.field405;
            if (var1 > var3 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class161.field2310; var7++) {
                    if (class490.field6921) {
                        int var11 = (class161.field2310 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > var11 - 13 && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class161.field2310 - var7 - 1) * 16 + var4 + 31;
                        if (var12 - 13 < var2 && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class443 var9 = new class443(class250.field3514);
                    for (class106 var10 = (class106) var9.method2581(true); var10 != null; var10 = (class106) var9.method2579(-112)) {
                        if (var6 == (var8++)) {
                            return var10.field1520;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)V", line = 224)
    public static final void method2003(int arg0, int arg1) {
        class242.method1512(arg0 - 5);
        field4603++;
        class110.method681((byte) -126);
        class50.method395(0, true, arg1);
        class225.method1418(class338.field4636, arg0 ^ arg0, class441.field6048, class120.field1685);
        class375.method2241(class338.field4636, -8292, class120.field1685);
        class321.method1939(-1778512387, class145.field2027);
        class137.method840((byte) 118);
        class480.method2825(arg0 ^ 0x260B);
        if (class478.field6764 == 10) {
            class35.method295((byte) -120, false);
        } else if (class478.field6764 == 30) {
            class8.method94(25, arg0 + 98);
        } else if (class478.field6764 == 5) {
            class154.method939((byte) -75, class120.field1685, class338.field4636);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II[I)Lcu;", line = 251)
    public final class144 method2004(int arg0, int arg1, int[] arg2) {
        field4604++;
        if (this.field4607.method2027(arg0 ^ 0x45B8) == 1) {
            return this.method2001(arg1, (byte) -102, arg2, 0);
        } else if (this.field4607.method2054(0, arg1) == 1) {
            return this.method2001(0, (byte) -120, arg2, arg1);
        } else {
            if (arg0 != 17898) {
                field4617 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[II)Lcu;", line = 273)
    public final class144 method2005(int arg0, int[] arg1, int arg2) {
        field4615++;
        if (this.field4613.method2027(arg0 ^ 0x2E) == 1) {
            return this.method1998(29, 0, arg2, arg1);
        } else if (this.field4613.method2054(arg0, arg2) == 1) {
            return this.method1998(29, arg2, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 292)
    public static void method2006(int arg0) {
        field4611 = null;
        if (arg0 != 13) {
            field4612 = 110;
        }
        field4617 = null;
        field4606 = null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lfc;Lfc;)V", line = 321)
    public class336(class343 arg0, class343 arg1) {
        this.field4607 = arg1;
        this.field4613 = arg0;
    }
}
