import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class33 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Ljt;")
    private class106 field335 = new class106(64);

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Ljt;")
    public class106 field345 = new class106(60);

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Lvd;")
    public class39 field342;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Lvd;")
    private class39 field344;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Ljt;")
    public static class106 field341 = new class106(64);

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Lmia;")
    public static class63 field348 = new class63(38, 8);

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Lhe;")
    public static class372 field350 = new class372(16);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lgm;")
    public static class124 field334;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method163(int arg0, int arg1, int arg2) {
        if (arg2 == 544) {
            field347++;
            return class612.method3545((byte) -83, arg1, arg0) & class201.method1381(arg0, arg1, arg2 ^ 0xFFFFFD95);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method164(boolean arg0) {
        field339++;
        int var1 = 0;
        int var2 = 0;
        if (arg0) {
            return;
        }
        while (var2 < class194.field2946) {
            for (int var3 = 0; var3 < class255.field3656; var3++) {
                if (class123.method883(true, class80.field1136, var3, var2, var1, 12434)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V", line = 56)
    public final void method165(int arg0, byte arg1) {
        this.field349 = arg0;
        field340++;
        class106 var3 = this.field345;
        synchronized (this.field345) {
            if (arg1 < -63) {
                this.field345.method809(true);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZB)C", line = 74)
    public static final char method166(boolean arg0, byte arg1) {
        if (arg0) {
            return (char) 65522;
        }
        field338++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class382.field5762[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 106)
    public final void method167(byte arg0) {
        class106 var2 = this.field335;
        synchronized (this.field335) {
            this.field335.method800(88);
        }
        field337++;
        class106 var3 = this.field345;
        synchronized (this.field345) {
            this.field345.method800(96);
            if (arg0 < 5) {
                field350 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V", line = 123)
    public static void method168(byte arg0) {
        field350 = null;
        field348 = null;
        field334 = null;
        field341 = null;
        if (arg0 >= -5) {
            field350 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V", line = 136)
    public final void method169(int arg0, int arg1) {
        field336++;
        class106 var3 = this.field335;
        synchronized (this.field335) {
            this.field335.method807(arg1, -1);
            if (arg0 <= 18) {
                method166(true, (byte) -23);
            }
        }
        class106 var4 = this.field345;
        synchronized (this.field345) {
            this.field345.method807(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)Z", line = 153)
    public static final boolean method170(int arg0, byte arg1, int arg2) {
        field343++;
        if (arg1 != -87) {
            method166(true, (byte) -69);
        }
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lqg;ILvd;Lvd;)V", line = 226)
    public class33(class464 arg0, int arg1, class39 arg2, class39 arg3) {
        this.field342 = arg3;
        this.field344 = arg2;
        int var5 = this.field344.method222((byte) 126) - 1;
        this.field344.method229(var5, 0);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 168)
    public final void method171(int arg0) {
        class106 var2 = this.field335;
        synchronized (this.field335) {
            this.field335.method809(true);
        }
        field333++;
        class106 var3 = this.field345;
        synchronized (this.field345) {
            int var4 = -59 % ((arg0 - 64) / 62);
            this.field345.method809(true);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)Lfda;", line = 183)
    public final class321 method172(int arg0, int arg1) {
        field346++;
        class106 var3 = this.field335;
        class321 var4;
        synchronized (this.field335) {
            var4 = (class321) this.field335.method803(106, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == 3128) {
            class39 var5 = this.field344;
            byte[] var6;
            synchronized (this.field344) {
                var6 = this.field344.method211(true, class439.method2715(arg0, 117717096), class49.method361(-27343, arg0));
            }
            class321 var7 = new class321();
            var7.field4536 = arg0;
            var7.field4532 = this;
            if (var6 != null) {
                var7.method2029(87, new class645(var6));
            }
            class106 var8 = this.field335;
            synchronized (this.field335) {
                this.field335.method801(1, var7, (long) arg0);
                return var7;
            }
        } else {
            return null;
        }
    }
}
