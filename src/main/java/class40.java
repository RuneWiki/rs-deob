import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class40 {

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "Lau;")
    private class692 field597 = new class692(64);

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Lau;")
    public class692 field605 = new class692(64);

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Lmv;")
    private class295 field595;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Lmv;")
    public class295 field591;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Liba;")
    public static class211 field596 = new class211(57, -1);

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "Lpb;")
    public static class2 field599 = new class2(13, 17);

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)V", line = 3)
    public final void method226(int arg0, byte arg1, int arg2) {
        if (arg1 > 60) {
            this.field597 = new class692(arg0);
            field603++;
            this.field605 = new class692(arg2);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Lod;", line = 19)
    public final class673 method227(int arg0, int arg1) {
        field601++;
        if (arg1 >= -53) {
            return null;
        }
        class692 var3 = this.field597;
        class673 var4;
        synchronized (this.field597) {
            var4 = (class673) this.field597.method3901((long) arg0, -47);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field595;
        byte[] var6;
        synchronized (this.field595) {
            var6 = this.field595.method1844(34, 31330, arg0);
        }
        class673 var7 = new class673();
        var7.field9456 = this;
        if (var6 != null) {
            var7.method3780((byte) -116, new class540(var6));
        }
        class692 var8 = this.field597;
        synchronized (this.field597) {
            this.field597.method3894(var7, (byte) 60, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 53)
    public static void method228(byte arg0) {
        field596 = null;
        if (arg0 != -113) {
            method228((byte) -55);
        }
        field599 = null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 66)
    public final void method229(byte arg0) {
        field594++;
        class692 var2 = this.field597;
        synchronized (this.field597) {
            this.field597.method3890(-1);
        }
        class692 var3 = this.field605;
        synchronized (this.field605) {
            this.field605.method3890(-1);
            if (arg0 != 65) {
                this.field605 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lmv;II)Lfo;", line = 82)
    public static final class606 method230(class295 arg0, int arg1, int arg2) {
        int var3 = 127 / ((69 - arg2) / 41);
        field592++;
        byte[] var4 = arg0.method1830(false, arg1);
        return var4 == null ? null : new class606(var4);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 99)
    public final void method231(int arg0) {
        class692 var2 = this.field597;
        synchronized (this.field597) {
            this.field597.method3891(13747);
        }
        field598++;
        if (arg0 != 11702) {
            this.field591 = null;
        }
        class692 var3 = this.field605;
        synchronized (this.field605) {
            this.field605.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)V", line = 118)
    public final void method232(int arg0, byte arg1) {
        field602++;
        class692 var3 = this.field597;
        synchronized (this.field597) {
            if (arg1 < 74) {
                field596 = null;
            }
            this.field597.method3900(arg0, 0);
        }
        class692 var4 = this.field605;
        synchronized (this.field605) {
            this.field605.method3900(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;IZ)I", line = 135)
    public static final int method233(int arg0, String arg1, int arg2, boolean arg3) {
        field600++;
        if (arg0 >= -8) {
            field599 = null;
        }
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Lnb;", line = 214)
    public static final class318 method234(byte arg0, int arg1) {
        field593++;
        class318[] var2 = class697.method3919(false);
        if (arg0 != 67) {
            method230(null, 97, 121);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class318 var4 = var2[var3];
            if (var4.field4627 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lsea;ILmv;Lmv;)V", line = 263)
    public class40(class373 arg0, int arg1, class295 arg2, class295 arg3) {
        this.field595 = arg2;
        this.field591 = arg3;
        this.field595.method1845(34, true);
    }
}
