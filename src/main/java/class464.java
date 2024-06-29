import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class464 extends class694 implements class624 {

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "Z")
    private boolean field6376;

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "B")
    private byte field6378;

    @OriginalMember(owner = "client!nq", name = "cb", descriptor = "S")
    private short field6388;

    @OriginalMember(owner = "client!nq", name = "U", descriptor = "B")
    private byte field6380;

    @OriginalMember(owner = "client!nq", name = "sb", descriptor = "Z")
    private boolean field6404;

    @OriginalMember(owner = "client!nq", name = "gb", descriptor = "Z")
    private boolean field6392;

    @OriginalMember(owner = "client!nq", name = "db", descriptor = "Lr;")
    private class184 field6389;

    @OriginalMember(owner = "client!nq", name = "mb", descriptor = "Lka;")
    private class475 field6398;

    @OriginalMember(owner = "client!nq", name = "V", descriptor = "Z")
    public static boolean field6381 = false;

    @OriginalMember(owner = "client!nq", name = "Y", descriptor = "Luk;")
    public static class263 field6384 = new class263("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!nq", name = "T", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!nq", name = "W", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!nq", name = "ab", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!nq", name = "bb", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!nq", name = "eb", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!nq", name = "fb", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!nq", name = "hb", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!nq", name = "ib", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!nq", name = "jb", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!nq", name = "kb", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!nq", name = "lb", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!nq", name = "nb", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!nq", name = "ob", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!nq", name = "pb", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!nq", name = "qb", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!nq", name = "rb", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!nq", name = "Z", descriptor = "Lck;")
    private class642 field6385;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(B)I", line = 5)
    public final int method1757(byte arg0) {
        ++field6387;
        int var2 = -53 % ((arg0 - -57) / 53);
        return this.field6378;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZLha;)V", line = 15)
    public final void method1756(boolean arg0, class59 arg1) {
        ++field6394;
        Object var3 = null;
        if (arg0) {
            class184 var5;
            if (this.field6389 == null && this.field6392) {
                class407 var4 = this.method2632(arg1, (byte) -107, 262144, true);
                var5 = var4 == null ? null : var4.field5657;
            } else {
                var5 = this.field6389;
                this.field6389 = null;
            }
            if (var5 != null) {
                class265.method1601(var5, super.field3515, super.field3505, super.field3502, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V", line = 42)
    public final void method1754(boolean arg0) {
        ++field6399;
        if (!arg0) {
            field6384 = null;
        }
        if (this.field6398 != null) {
            this.field6398.method181();
        }
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(B)I", line = 55)
    public final int method791(byte arg0) {
        ++field6396;
        if (arg0 < 81) {
            field6384 = null;
        }
        return this.field6398 == null ? 0 : this.field6398.method167();
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(ILha;)Lww;", line = 67)
    public final class733 method800(int arg0, class59 arg1) {
        ++field6377;
        if (this.field6398 == null) {
            return null;
        } else {
            if (arg0 != -1) {
                this.method806((byte) 27);
            }
            class333 var3 = arg1.method451();
            var3.method1727(super.field3505 - -super.field9660, super.field3510, super.field9651 + super.field3502);
            class733 var4 = class397.method2338(this.field6376, (byte) 113, 1);
            if (!class540.field7159) {
                this.field6398.method155(var3, var4.field10150[0], 0);
            } else {
                this.field6398.method160(var3, var4.field10150[0], class100.field1358, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lha;B)V", line = 94)
    public final void method792(class59 arg0, byte arg1) {
        ++field6400;
        if (arg1 <= 121) {
            this.method1761(61);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILha;)V", line = 104)
    public final void method1758(int arg0, class59 arg1) {
        ++field6391;
        if (arg0 == 6120) {
            Object var3 = null;
            class184 var5;
            if (this.field6389 == null && this.field6392) {
                class407 var4 = this.method2632(arg1, (byte) -107, 262144, true);
                var5 = var4 == null ? null : var4.field5657;
            } else {
                var5 = this.field6389;
                this.field6389 = null;
            }
            if (var5 != null) {
                class562.method3115(var5, super.field3515, super.field3505, super.field3502, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "(I)V", line = 131)
    public static final void method2629(int arg0) {
        ++field6401;
        if (!class745.method4176(-6, class15.field215) && !class239.method1501((byte) -14, class15.field215)) {
            int var1 = class472.field6475.field10322[0] >> 3;
            int var2 = class472.field6475.field10321[0] >> 3;
            if (~var1 <= -1 && var1 < class719.field10004 >> 3 && var2 >= 0 && ~var2 > ~(class107.field1453 >> 3)) {
                class545.method3048(var1, var2, 5000, false);
            } else {
                class545.method3048(class719.field10004 >> 4, class107.field1453 >> 4, 0, false);
            }
        } else {
            class545.method3048(class694.field9662 >> 12, class314.field4488 >> 12, 5000, false);
        }
        class265.method1604(true);
        class438.method2524(121);
        class454.method2581(118);
        class1.method8(-1);
        int var3 = 26 / ((26 - arg0) / 32);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLha;)Lck;", line = 160)
    public final class642 method808(byte arg0, class59 arg1) {
        ++field6393;
        if (arg0 >= -86) {
            this.field6404 = true;
        }
        if (this.field6385 == null) {
            this.field6385 = class549.method3072(super.field3502, super.field3505, super.field3510, 544, this.method2630((byte) -89, 0, arg1));
        }
        return this.field6385;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)I", line = 179)
    public final int method1759(byte arg0) {
        if (arg0 <= 63) {
            this.field6380 = -23;
        }
        ++field6395;
        return 65535 & this.field6388;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)I", line = 190)
    public final int method1752(byte arg0) {
        if (arg0 != -111) {
            return 127;
        } else {
            ++field6402;
            return this.field6380;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lha;Lqfa;IIIIIZIIII)V", line = 202)
    public class464(class59 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field6376 = ~arg1.field1363 != -1 && !arg7;
        this.field6378 = (byte) arg10;
        this.field6388 = (short) arg1.field1301;
        super.field3505 = arg4;
        this.field6380 = (byte) arg11;
        super.field3502 = arg6;
        this.field6404 = arg7;
        this.field6392 = arg0.method468() && arg1.field1343 && !this.field6404 && ~class411.field5711.field3897.method1057(true) != -1;
        class407 var13 = this.method2632(arg0, (byte) -107, 2048, this.field6392);
        if (var13 != null) {
            this.field6389 = var13.field5657;
            this.field6398 = var13.field5651;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)Z", line = 225)
    public final boolean method801(boolean arg0) {
        ++field6386;
        if (arg0) {
            return false;
        } else {
            return this.field6398 != null ? this.field6398.method159() : false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BILha;)Lka;", line = 240)
    private final class475 method2630(byte arg0, int arg1, class59 arg2) {
        ++field6403;
        if (arg0 != -89) {
            this.method1754(true);
        }
        if (this.field6398 != null && ~arg2.method405(this.field6398.method214(), arg1) == -1) {
            return this.field6398;
        } else {
            class407 var4 = this.method2632(arg2, (byte) -107, arg1, false);
            return var4 != null ? var4.field5651 : null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 267)
    public static final byte[] method2631(Object arg0, boolean arg1, int arg2) {
        if (arg2 != -30711) {
            field6381 = true;
        }
        ++field6397;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class702.method3953(arg2 ^ 30607, var3) : var3;
        } else if (arg0 instanceof class434) {
            class434 var4 = (class434) arg0;
            return var4.method1470(88);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)I", line = 307)
    public final int method789(int arg0) {
        ++field6390;
        if (arg0 != -32768) {
            this.method1754(true);
        }
        return this.field6398 != null ? this.field6398.method180() : 0;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z", line = 319)
    public final boolean method1761(int arg0) {
        if (arg0 != -28823) {
            this.method808((byte) 113, (class59) null);
        }
        ++field6375;
        return this.field6392;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lha;BIZ)Lga;", line = 330)
    private final class407 method2632(class59 arg0, byte arg1, int arg2, boolean arg3) {
        ++field6379;
        class100 var5 = class462.field6333.method2008((byte) -116, this.field6388 & 65535);
        if (arg1 != -107) {
            return null;
        } else {
            class282 var6;
            class282 var7;
            if (this.field6404) {
                var6 = class113.field1866[0];
                var7 = class588.field7675[super.field3515];
            } else {
                if (~super.field3515 <= -4) {
                    var6 = null;
                } else {
                    var6 = class113.field1866[super.field3515 + 1];
                }
                var7 = class113.field1866[super.field3515];
            }
            return var5.method736(this.field6380, arg3, (class379) null, arg2, super.field3510, arg0, (byte) -36, super.field3502, this.field6378, super.field3505, var7, var6);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lha;I)V", line = 360)
    public static final void method2633(class59 arg0, int arg1) {
        if (!class403.field5625) {
            class612.method3330(81, arg0);
        } else {
            class705.method3966(false, arg0);
        }
        if (arg1 != 5851) {
            method2629(-51);
        }
        ++field6382;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lha;IIB)Z", line = 377)
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field6383;
        if (arg3 != 103) {
            this.method1761(-105);
        }
        class475 var5 = this.method2630((byte) -89, 131072, arg0);
        if (var5 != null) {
            class333 var6 = arg0.method451();
            var6.method1727(super.field3505, super.field3510, super.field3502);
            return class540.field7159 ? var5.method203(arg2, arg1, var6, false, 0, class100.field1358) : var5.method158(arg2, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "(B)V", line = 416)
    public static void method2634(byte arg0) {
        field6384 = null;
        if (arg0 != -4) {
            field6381 = true;
        }
    }

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "(B)Z", line = 426)
    public final boolean method806(byte arg0) {
        ++field6374;
        int var2 = -92 / ((14 - arg0) / 57);
        if (this.field6398 != null) {
            return !this.field6398.method192();
        } else {
            return true;
        }
    }
}
