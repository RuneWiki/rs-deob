import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class306 {

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    private int field4483;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "[Llh;")
    private class213[] field4486;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field4475 = 0;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field4473 = 0;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field4476 = -1;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "[Z")
    public static boolean[] field4485 = new boolean[100];

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field4488 = -1;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "J")
    private long field4478;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "Llh;")
    private class213 field4487;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "[[[B")
    public static byte[][][] field4480;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Llh;", line = 12)
    public final class213 method2139(int arg0) {
        if (arg0 != -5463) {
            this.field4478 = 122L;
        }
        field4484++;
        if (this.field4487 == null) {
            return null;
        }
        class213 var2 = this.field4486[(int) ((long) (this.field4483 - 1) & this.field4478)];
        while (this.field4487 != var2) {
            if (this.field4487.field3011 == this.field4478) {
                class213 var3 = this.field4487;
                this.field4487 = this.field4487.field3012;
                return var3;
            }
            this.field4487 = this.field4487.field3012;
        }
        this.field4487 = null;
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BJ)Llh;", line = 65)
    public final class213 method2140(byte arg0, long arg1) {
        if (arg0 > -62) {
            return (class213) null;
        }
        this.field4478 = arg1;
        field4477++;
        class213 var4 = this.field4486[(int) (arg1 & (long) (this.field4483 - 1))];
        for (this.field4487 = var4.field3012; this.field4487 != var4; this.field4487 = this.field4487.field3012) {
            if (this.field4487.field3011 == arg1) {
                class213 var5 = this.field4487;
                this.field4487 = this.field4487.field3012;
                return var5;
            }
        }
        this.field4487 = null;
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(JLlh;I)V", line = 98)
    public final void method2141(long arg0, class213 arg1, int arg2) {
        field4479++;
        if (arg2 != 0) {
            this.method2141(38L, (class213) null, -96);
        }
        if (arg1.field3007 != null) {
            arg1.method1556(arg2 + 255);
        }
        class213 var5 = this.field4486[(int) (arg0 & (long) (this.field4483 - 1))];
        arg1.field3007 = var5.field3007;
        arg1.field3011 = arg0;
        arg1.field3012 = var5;
        arg1.field3007.field3012 = arg1;
        arg1.field3012.field3007 = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lho;I)Z", line = 123)
    public static final boolean method2142(class287 arg0, int arg1) {
        field4472++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field4112) {
            return false;
        } else if (!arg0.method1968(arg1)) {
            return false;
        } else if (class217.field3072.method2279((long) arg0.field4148, 77) == null) {
            return class319.field4693.method2279((long) arg0.field4139, arg1 ^ 0x7A) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lfh;Lfh;III)Lgl;", line = 149)
    public static final class281 method2143(class140 arg0, class140 arg1, int arg2, int arg3, int arg4) {
        if (arg2 == 18265) {
            field4474++;
            return class134.method1020(arg2 ^ 0x4758, arg0, arg3, arg4) ? class32.method203(-11537, arg1.method1089(arg3, (byte) 110, arg4)) : null;
        } else {
            return (class281) null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 169)
    public static void method2144(int arg0) {
        int var1 = -20 % ((arg0 - 71) / 33);
        field4485 = null;
        field4480 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V", line = 189)
    public class306(int arg0) {
        this.field4483 = arg0;
        this.field4486 = new class213[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class213 var3 = this.field4486[var2] = new class213();
            var3.field3012 = var3;
            var3.field3007 = var3;
        }
    }
}
