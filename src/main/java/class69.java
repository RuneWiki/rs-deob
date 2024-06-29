import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class69 {

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    private int field987 = 0;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "[Ltf;")
    public class165[] field985;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field983 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "F")
    public static float field970;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "J")
    private long field980;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Ltf;")
    private class165 field976;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Ltf;")
    private class165 field986;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JB)Ltf;", line = 6)
    public final class165 method451(long arg0, byte arg1) {
        field978++;
        this.field980 = arg0;
        class165 var4 = this.field985[(int) ((long) (this.field972 - 1) & arg0)];
        for (this.field976 = var4.field2747; this.field976 != var4; this.field976 = this.field976.field2747) {
            if (this.field976.field2744 == arg0) {
                class165 var5 = this.field976;
                this.field976 = this.field976.field2747;
                return var5;
            }
        }
        this.field976 = null;
        if (arg1 != 100) {
            this.field985 = (class165[]) null;
        }
        return null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)I", line = 46)
    public final int method452(byte arg0) {
        field974++;
        if (arg0 >= -18) {
            method454(false, -36);
        }
        return this.field972;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V", line = 60)
    public final void method453(byte arg0) {
        field971++;
        for (int var2 = 0; var2 < this.field972; var2++) {
            class165 var3 = this.field985[var2];
            while (true) {
                class165 var4 = var3.field2747;
                if (var3 == var4) {
                    break;
                }
                var4.method1212((byte) 66);
            }
        }
        this.field986 = null;
        this.field976 = null;
        if (arg0 != 100) {
            this.field985 = (class165[]) null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)Lle;", line = 94)
    public static final class97 method454(boolean arg0, int arg1) {
        field981++;
        class97 var2 = (class97) class303.field4754.method704((byte) 53, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class256.field4068.method1287(class282.method2036(255, arg1), class109.method749(arg1, true), -1);
        class97 var4 = new class97();
        var4.field1345 = arg1;
        if (var3 != null) {
            var4.method655((byte) 46, new class44(var3));
        }
        var4.method653((byte) -74);
        if (var4.field1349) {
            var4.field1338 = false;
            var4.field1333 = 0;
        }
        if (!class285.field4581 && var4.field1374) {
            var4.field1373 = null;
        }
        if (arg0) {
            return (class97) null;
        } else {
            class303.field4754.method703(var4, (long) arg1, (byte) -64);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Ltf;", line = 129)
    public final class165 method455(byte arg0) {
        field975++;
        int var2 = 101 % ((-arg0 - 15) / 62);
        if (this.field987 > 0 && this.field985[this.field987 - 1] != this.field986) {
            class165 var3 = this.field986;
            this.field986 = var3.field2747;
            return var3;
        }
        class165 var4;
        do {
            if (this.field972 <= this.field987) {
                return null;
            }
            var4 = this.field985[this.field987++].field2747;
        } while (this.field985[this.field987 - 1] == var4);
        this.field986 = var4.field2747;
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 164)
    public static final void method456(boolean arg0) {
        int var1 = 0;
        field984++;
        if (!arg0) {
            field983 = 95;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class189.method1399(var2, (byte) -113, true, var3, class324.field5032, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z[Ltf;)I", line = 201)
    public final int method457(boolean arg0, class165[] arg1) {
        field977++;
        if (arg0) {
            this.method458((byte) -88);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field972; var4++) {
            class165 var5 = this.field985[var4];
            for (class165 var6 = var5.field2747; var6 != var5; var6 = var6.field2747) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)Ltf;", line = 232)
    public final class165 method458(byte arg0) {
        field973++;
        this.field987 = 0;
        return arg0 == -16 ? this.method455((byte) 101) : (class165) null;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)Ltf;", line = 247)
    public final class165 method459(byte arg0) {
        field979++;
        if (this.field976 == null) {
            return null;
        } else if (arg0 == 96) {
            class165 var2 = this.field985[(int) ((long) (this.field972 - 1) & this.field980)];
            while (this.field976 != var2) {
                if (this.field976.field2744 == this.field980) {
                    class165 var3 = this.field976;
                    this.field976 = this.field976.field2747;
                    return var3;
                }
                this.field976 = this.field976.field2747;
            }
            this.field976 = null;
            return null;
        } else {
            return (class165) null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I", line = 289)
    public final int method460(int arg0) {
        field982++;
        int var2 = 0;
        if (arg0 != 25595) {
            this.field976 = (class165) null;
        }
        for (int var3 = 0; var3 < this.field972; var3++) {
            class165 var4 = this.field985[var3];
            for (class165 var5 = var4.field2747; var5 != var4; var5 = var5.field2747) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IJLtf;)V", line = 321)
    public final void method461(int arg0, long arg1, class165 arg2) {
        field968++;
        if (arg2.field2749 != null) {
            arg2.method1212((byte) 116);
        }
        class165 var5 = this.field985[(int) (arg1 & (long) (this.field972 - 1))];
        arg2.field2749 = var5.field2749;
        int var6 = -30 / ((-arg0 - 70) / 32);
        arg2.field2747 = var5;
        arg2.field2744 = arg1;
        arg2.field2749.field2747 = arg2;
        arg2.field2747.field2749 = arg2;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V", line = 339)
    public class69(int arg0) {
        this.field972 = arg0;
        this.field985 = new class165[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class165 var3 = this.field985[var2] = new class165();
            var3.field2747 = var3;
            var3.field2749 = var3;
        }
    }
}
