import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class189 {

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "B")
    public byte field2918;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "B")
    public byte field2914;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Lgda;")
    public class61 field2912;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "S")
    public short field2909;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lne;")
    public static class336 field2913 = new class336("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "J")
    public static long field2920 = 0L;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Lfba;")
    public static class27 field2921 = new class27(66, -1);

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "F")
    public static float field2911;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "[I")
    public static int[] field2915;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)V")
    public static final void method1320(int arg0, byte arg1) {
        field2910++;
        class699.field9728.method3741(arg0, 0);
        if (arg1 > -111) {
            method1324(-52, (byte) 76);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lgda;III)V")
    public class189(class61 arg0, int arg1, int arg2, int arg3) {
        this.field2918 = (byte) arg3;
        this.field2914 = (byte) arg2;
        this.field2912 = arg0;
        this.field2909 = (short) arg1;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
    public static final void method1321(int arg0, int arg1, int arg2) {
        field2916++;
        class114 var3 = class601.field8423[arg2][arg0];
        if (var3 != null) {
            class494.field7033 = var3.field1733;
            class139.field2075 = var3.field1736;
            class710.field9869 = var3.field1744;
        }
        class515.method3106(arg1 - 59643);
        if (arg1 != 27944) {
            field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static final void method1322(int arg0) {
        field2917++;
        if (arg0 > -12) {
            method1322(80);
        }
        class691.method3902((byte) 64);
        class720.field9970 = null;
        class528.field7541 = null;
        class630.field8830 = null;
        class274.field3951 = null;
        class601.field8423 = null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static void method1323(int arg0) {
        field2915 = null;
        if (arg0 == -32289784) {
            field2921 = null;
            field2913 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IB)I")
    public static final int method1324(int arg0, byte arg1) {
        field2919++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = -52 % ((-arg1 - 51) / 43);
        int var8 = var6 | var6 >>> 16;
        return ~var8 & arg0;
    }
}
