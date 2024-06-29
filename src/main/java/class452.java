import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class452 {

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "Lok;")
    private class228 field6506;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "J")
    public long field6505;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "Lwv;")
    public static class32 field6508;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V", line = 6)
    public static void method2673(int arg0) {
        field6508 = null;
        if (arg0 <= 82) {
            method2676(111, -62, null, 102);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IBIIZI)V", line = 18)
    public static final void method2674(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field6509++;
        if (arg1 != 108) {
            method2675((byte) 89, -115, 96);
        }
        long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg2);
        class138 var8 = (class138) class555.field7856.method1405(var6, (byte) -24);
        if (var8 == null) {
            var8 = new class138();
            class555.field7856.method1403((byte) -18, var8, var6);
        }
        if (arg3 >= var8.field2009.length) {
            int[] var9 = new int[arg3 + 1];
            int[] var10 = new int[arg3 + 1];
            for (int var11 = 0; var11 < var8.field2009.length; var11++) {
                var9[var11] = var8.field2009[var11];
                var10[var11] = var8.field2008[var11];
            }
            for (int var12 = var8.field2009.length; var12 < arg3; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field2008 = var10;
            var8.field2009 = var9;
        }
        var8.field2009[arg3] = arg0;
        var8.field2008[arg3] = arg5;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BII)Z", line = 72)
    public static final boolean method2675(byte arg0, int arg1, int arg2) {
        field6504++;
        if (arg0 > -57) {
            return true;
        } else {
            return (arg2 & 0x40000) != 0 | class23.method279(false, arg2, arg1) || class328.method2064(arg1, arg2, 128);
        }
    }

    @OriginalMember(owner = "client!hca", name = "finalize", descriptor = "()V", line = 84)
    protected final void finalize() throws Throwable {
        field6507++;
        this.field6506.method1551(true, this.field6505);
        super.finalize();
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILvg;I)V", line = 94)
    public static final void method2676(int arg0, int arg1, class49 arg2, int arg3) {
        field6510++;
        if (arg3 != -22348) {
            method2673(103);
        }
        class617 var4 = arg2.method553(arg3 + 22472, class282.field4228);
        if (var4 == null) {
            return;
        }
        class282.field4228.method168(arg0, arg1, arg0 + arg2.field967, arg2.field877 + arg1);
        if (class581.field8187 >= 3) {
            class282.field4228.method169(-16777216, var4, arg0, arg1);
        } else {
            class135.field1981.method3917((float) arg2.field967 / 2.0F + (float) arg0, (float) arg2.field877 / 2.0F + (float) arg1, 4096, (int) (-class630.field8811) & 0x3FFF << 2, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lok;J[Lkfa;)V", line = 118)
    public class452(class228 arg0, long arg1, class558[] arg2) {
        this.field6506 = arg0;
        this.field6505 = arg1;
    }
}
