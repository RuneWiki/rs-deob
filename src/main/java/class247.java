import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class247 extends class187 {

    @OriginalMember(owner = "client!gj", name = "Zb", descriptor = "[[B")
    public static byte[][] field4438 = new byte[1000][];

    @OriginalMember(owner = "client!gj", name = "bc", descriptor = "Leg;")
    public static class37 field4440 = class174.method1167("Schlie-8en", -114);

    @OriginalMember(owner = "client!gj", name = "ac", descriptor = "I")
    public static int field4439 = 0;

    @OriginalMember(owner = "client!gj", name = "Tb", descriptor = "Lpe;")
    public static class237 field4432 = null;

    @OriginalMember(owner = "client!gj", name = "ic", descriptor = "Leg;")
    private static class37 field4447 = class174.method1167("cyan:", 82);

    @OriginalMember(owner = "client!gj", name = "dc", descriptor = "Leg;")
    public static class37 field4442 = field4447;

    @OriginalMember(owner = "client!gj", name = "kc", descriptor = "Leg;")
    public static class37 field4449 = field4447;

    @OriginalMember(owner = "client!gj", name = "Ob", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!gj", name = "Pb", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!gj", name = "Qb", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!gj", name = "Rb", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!gj", name = "Sb", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!gj", name = "Vb", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!gj", name = "Wb", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!gj", name = "Yb", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!gj", name = "fc", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!gj", name = "gc", descriptor = "I")
    private int field4445;

    @OriginalMember(owner = "client!gj", name = "hc", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!gj", name = "lc", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!gj", name = "Ub", descriptor = "Ljl;")
    public static class101 field4433;

    @OriginalMember(owner = "client!gj", name = "cc", descriptor = "Lfe;")
    public static class222 field4441;

    @OriginalMember(owner = "client!gj", name = "ec", descriptor = "Lpe;")
    public static class237 field4443;

    @OriginalMember(owner = "client!gj", name = "jc", descriptor = "Lhh;")
    private class44 field4448;

    @OriginalMember(owner = "client!gj", name = "Xb", descriptor = "[Lni;")
    public static class195[] field4436;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "(II)V")
    public final void method1697(int arg0, int arg1) {
        super.field3175[super.field3169++] = (byte) (arg0 + this.field4448.method287(-1375));
        if (arg1 <= 92) {
            method1699((class187) null, false, -106);
        }
        ++field4428;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[I)V")
    public final void method1698(int arg0, int[] arg1) {
        if (arg0 == -9) {
            this.field4448 = new class44(arg1);
            ++field4446;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lva;ZI)Leg;")
    public static final class37 method1699(class187 arg0, boolean arg1, int arg2) {
        ++field4444;
        try {
            class37 var3 = new class37();
            if (arg1) {
                method1699((class187) null, false, 122);
            }
            var3.field576 = arg0.method1246(!arg1);
            if (~var3.field576 < ~arg2) {
                var3.field576 = arg2;
            }
            var3.field599 = new byte[var3.field576];
            arg0.field3169 += class68.field1074.method1878(0, 27493, arg0.field3175, arg0.field3169, var3.field599, var3.field576);
            return var3;
        } catch (Exception var4) {
            return class78.field1208;
        }
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(B)I")
    public final int method1700(byte arg0) {
        ++field4427;
        if (arg0 != -97) {
            method1704(12, -98);
        }
        return super.field3175[super.field3169++] + -this.field4448.method287(-1375) & 255;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(I)V")
    public class247(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(BI)I")
    public final int method1701(byte arg0, int arg1) {
        if (arg0 >= -79) {
            this.field4448 = null;
        }
        ++field4430;
        return arg1 * 8 + -this.field4445;
    }

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "(I)V")
    public final void method1702(int arg0) {
        if (arg0 > 40) {
            this.field4445 = super.field3169 * 8;
            ++field4450;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "([BIII)V")
    public final void method1703(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var5 = arg3; ~arg2 < ~var5; ++var5) {
            arg0[var5 - -arg1] = (byte) (super.field3175[super.field3169++] + -this.field4448.method287(-1375));
        }
        ++field4429;
    }

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "(II)Lka;")
    public static final class180 method1704(int arg0, int arg1) {
        ++field4431;
        class180 var2 = (class180) class77.field1198.method1411(arg1 + 5060, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class88.field1384.method666(arg0, 1, (byte) -51);
            class180 var4 = new class180();
            if (arg1 != -5072) {
                method1704(120, -74);
            }
            var4.field3001 = arg0;
            if (var3 != null) {
                var4.method1193(false, new class187(var3));
            }
            var4.method1191(false);
            class77.field1198.method1404((long) arg0, false, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(BI)I")
    public final int method1705(byte arg0, int arg1) {
        ++field4434;
        if (arg0 <= 97) {
            field4438 = null;
        }
        int var3 = this.field4445 >> 3;
        int var4 = 8 - (7 & this.field4445);
        this.field4445 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (super.field3175[var3++] & class153.field2570[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field3175[var3] >> -arg1 + var4 & class153.field2570[arg1]) + var5;
        } else {
            var6 = (super.field3175[var3] & class153.field2570[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(B)V")
    public final void method1706(byte arg0) {
        if (arg0 == 0) {
            ++field4435;
            super.field3169 = (this.field4445 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(Z)V")
    public static void method1707(boolean arg0) {
        field4449 = null;
        if (arg0) {
            method1699((class187) null, true, -37);
        }
        field4443 = null;
        field4436 = null;
        field4442 = null;
        field4433 = null;
        field4432 = null;
        field4440 = null;
        field4441 = null;
        field4447 = null;
        field4438 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILq;)I")
    public static final int method1708(int arg0, class163 arg1) {
        ++field4437;
        class275 var2 = arg1.field2691;
        if (var2.field4888 != null) {
            var2 = var2.method1854((byte) 68);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4861;
        if (arg0 != 26421) {
            method1704(63, 34);
        }
        if (~arg1.field1789 == ~arg1.field1767) {
            var3 = var2.field4841;
        } else if (~arg1.field1789 == ~arg1.field1764) {
            var3 = var2.field4886;
        }
        return var3;
    }
}
