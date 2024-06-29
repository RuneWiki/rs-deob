import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class52 extends class55 {

    @OriginalMember(owner = "client!wo", name = "S", descriptor = "I")
    private int field704 = 0;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
    private int field694 = -32768;

    @OriginalMember(owner = "client!wo", name = "Y", descriptor = "I")
    private int field709 = 0;

    @OriginalMember(owner = "client!wo", name = "Z", descriptor = "I")
    private int field710 = -1;

    @OriginalMember(owner = "client!wo", name = "X", descriptor = "Z")
    public boolean field708 = false;

    @OriginalMember(owner = "client!wo", name = "U", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!wo", name = "ab", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "Lrj;")
    private class12 field692;

    @OriginalMember(owner = "client!wo", name = "db", descriptor = "Ljava/lang/String;")
    public static String field714 = "Loading fonts - ";

    @OriginalMember(owner = "client!wo", name = "cb", descriptor = "Lcr;")
    public static class189 field713 = new class189(64);

    @OriginalMember(owner = "client!wo", name = "gb", descriptor = "[Ljava/lang/String;")
    public static String[] field717 = new String[100];

    @OriginalMember(owner = "client!wo", name = "hb", descriptor = "Z")
    public static boolean field718 = false;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!wo", name = "N", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!wo", name = "O", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!wo", name = "P", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!wo", name = "R", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!wo", name = "W", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!wo", name = "bb", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!wo", name = "eb", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!wo", name = "fb", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!wo", name = "V", descriptor = "Lkr;")
    private class6 field706;

    @OriginalMember(owner = "client!wo", name = "Q", descriptor = "[Lcq;")
    public static class67[] field702;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)I", line = 4)
    public final int method174(int arg0) {
        ++field691;
        if (arg0 != 2) {
            this.field694 = 57;
        }
        return this.field694;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 16)
    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field705 = arg0;
        this.field711 = arg1 + arg2;
        int var12 = class426.method2706((byte) 11, this.field705).field4406;
        if (var12 != -1) {
            this.field708 = false;
            this.field692 = class33.method221((byte) 102, var12);
        } else {
            this.field708 = true;
        }
        if (this.field711 == arg2) {
            class298.method2049(super.field734, false, super.field740, 9757, this.field704, this.field692);
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Lii;I)Leb;", line = 39)
    public final class382 method117(class405 arg0, int arg1) {
        if (arg1 != -1) {
            this.field706 = null;
        }
        ++field703;
        class375 var3 = this.method366(arg0, arg1, 1024);
        if (var3 == null) {
            return null;
        } else {
            class177 var4 = arg0.method1735();
            var4.method985(super.field740, super.field729, super.field734);
            if (this.field706 != null) {
                class352 var5 = this.field706.method35();
                arg0.method1653(var3, var5, var4, (class330) null, 0);
            } else {
                var3.method1601(var4, (class330) null, 0);
            }
            this.field694 = var3.method1597();
            this.method360((byte) 77, var3, arg0);
            return null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BIII)I", line = 75)
    public static final int method359(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -116) {
            method359((byte) 49, 90, -111, 58);
        }
        ++field699;
        if (class12.field205 == null) {
            return 0;
        } else {
            int var4 = arg2 >> 7;
            int var5 = arg1 >> 7;
            if (var4 >= 0 && var5 >= 0 && ~(class192.field2574 + -1) <= ~var4 && var5 <= class364.field5262 + -1) {
                int var6 = arg3;
                if (~arg3 > -4 && (class103.field1430[1][var4][var5] & 2) != 0) {
                    var6 = arg3 + 1;
                }
                return class12.field205[var6].method745(arg2, arg1);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLdc;Lii;)V", line = 109)
    private final void method360(byte arg0, class375 arg1, class405 arg2) {
        ++field696;
        class359[] var4 = arg1.method1577();
        if (arg0 < 29) {
            this.method366((class405) null, -117, -42);
        }
        class215[] var5 = arg1.method1616();
        if ((this.field706 == null || this.field706.field73) && (var4 != null || var5 != null)) {
            this.field706 = new class6(class28.field418);
        }
        if (this.field706 != null) {
            this.field706.method36(arg2, (long) class28.field418, var4, var5, false);
            this.field706.method44(super.field727, super.field743, super.field742, super.field726, super.field737);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILwg;)V", line = 136)
    public static final void method361(int arg0, class282 arg1) {
        ++field697;
        if (arg0 != 19569) {
            field714 = null;
        }
        class243.field3242 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 158)
    public static final void method362(byte arg0) {
        class26.field362.method1136((byte) -110);
        ++field689;
        int var1 = -76 % ((3 - arg0) / 58);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILii;)V", line = 169)
    public final void method103(int arg0, class405 arg1) {
        ++field715;
        class375 var3 = this.method366(arg1, -1, 0);
        if (var3 != null) {
            this.method360((byte) 31, var3, arg1);
        }
        if (arg0 <= 102) {
            method359((byte) -101, -2, -60, 75);
        }
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)Z", line = 184)
    public final boolean method166(int arg0) {
        if (arg0 != -17506) {
            return false;
        } else {
            ++field716;
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "finalize", descriptor = "()V", line = 207)
    protected final void finalize() {
        ++field707;
        if (this.field706 != null) {
            this.field706.method40();
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V", line = 219)
    public final void method176(boolean arg0) {
        ++field693;
        if (arg0) {
            method359((byte) -5, 26, -101, 99);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIZLii;)Z", line = 230)
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field695;
        if (arg2) {
            this.field709 = 100;
        }
        return false;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)V", line = 241)
    public final void method363(boolean arg0) {
        ++field701;
        if (arg0) {
            this.method176(false);
        }
        if (this.field706 != null) {
            this.field706.method40();
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lii;IIIILnc;Z)V", line = 254)
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        ++field712;
        if (arg3 > -106) {
            this.method119(84, -41, true, (class405) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(II)V", line = 265)
    public final void method364(int arg0, int arg1) {
        ++field690;
        if (!this.field708) {
            this.field709 += arg0;
            while (~this.field692.field176[this.field704] > ~this.field709) {
                this.field709 -= this.field692.field176[this.field704];
                ++this.field704;
                if (this.field692.field182.length <= this.field704) {
                    this.field708 = true;
                    break;
                }
            }
            if (arg1 == -1) {
                if (!this.field708) {
                    class298.method2049(super.field734, false, super.field740, 9757, this.field704, this.field692);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 297)
    public static void method365(int arg0) {
        if (arg0 > 123) {
            field717 = null;
            field713 = null;
            field702 = null;
            field714 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lii;II)Ldc;", line = 311)
    private final class375 method366(class405 arg0, int arg1, int arg2) {
        ++field698;
        if (arg1 != -1) {
            return null;
        } else {
            class300 var4 = class426.method2706((byte) 11, this.field705);
            return this.field708 ? var4.method2060(arg2, (byte) -101, arg0, -1, 0, -1) : var4.method2060(arg2, (byte) -83, arg0, this.field710, this.field709, this.field704);
        }
    }
}
