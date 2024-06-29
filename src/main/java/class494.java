import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class494 extends class48 implements class373 {

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "I")
    private int field6530;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II[BI)V")
    public final void method2141(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method438(arg0, (byte) -15, arg2);
        int var5 = -68 % ((2 - arg1) / 61);
        ++field6527;
        this.field6530 = arg3;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "([[[Lgn;I)V")
    public static final void method2694(class530[][][] arg0, int arg1) {
        if (arg1 < 24) {
            method2694((class530[][][]) null, -71);
        }
        for (int var2 = 0; var2 < arg0.length; ++var2) {
            class530[][] var3 = arg0[var2];
            for (int var4 = 0; var3.length > var4; ++var4) {
                for (int var5 = 0; ~var5 > ~var3[var4].length; ++var5) {
                    class530 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6878 instanceof class620) {
                            ((class620) var6.field6878).method64((byte) -20);
                        }
                        if (var6.field6895 instanceof class620) {
                            ((class620) var6.field6895).method64((byte) -126);
                        }
                        if (var6.field6893 instanceof class620) {
                            ((class620) var6.field6893).method64((byte) 28);
                        }
                        if (var6.field6879 instanceof class620) {
                            ((class620) var6.field6879).method64((byte) 47);
                        }
                        if (var6.field6886 instanceof class620) {
                            ((class620) var6.field6886).method64((byte) 99);
                        }
                        for (class571 var7 = var6.field6887; var7 != null; var7 = var7.field7445) {
                            class34 var8 = var7.field7444;
                            if (var8 instanceof class620) {
                                ((class620) var8).method64((byte) 66);
                            }
                        }
                    }
                }
            }
        }
        ++field6529;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)I")
    public final int method2142(byte arg0) {
        if (arg0 != 17) {
            this.method2143(-31);
        }
        ++field6526;
        return super.field681;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)I")
    public final int method2140(int arg0) {
        if (arg0 != 9126) {
            this.field6530 = -27;
        }
        ++field6532;
        return this.field6530;
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lji;ILjaclib/memory/Buffer;IZ)V")
    public class494(class622 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6530 = arg1;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)J")
    public final long method2143(int arg0) {
        if (arg0 != 20812) {
            this.method2142((byte) 100);
        }
        ++field6531;
        return 0L;
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lji;I[BIZ)V")
    public class494(class622 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6530 = arg1;
    }

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)V")
    public final void method440(int arg0) {
        super.field682.method3463(this, (byte) -84);
        if (arg0 > -1) {
            this.method2143(31);
        }
        ++field6528;
    }
}
