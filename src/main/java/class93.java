import java.util.Calendar;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class93 extends class783 {

    @OriginalMember(owner = "client!fca", name = "x", descriptor = "I")
    private int field1230 = 0;

    @OriginalMember(owner = "client!fca", name = "w", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "Z")
    public static boolean field1232 = false;

    @OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!fca", name = "v", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!fca", name = "y", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!fca", name = "A", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!fca", name = "C", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!fca", name = "D", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!fca", name = "B", descriptor = "Lnh;")
    public static class778 field1234;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZ)V", line = 6)
    public final void method821(int arg0, boolean arg1) {
        ++field1227;
        int var3 = -20 / ((53 - arg0) / 52);
        int var4 = super.field10799.field4105.method860((byte) -62, class243.field2870, super.field10798.method1634()) - -super.field10799.field4109;
        int var5 = super.field10799.field4107.method102(super.field10798.method1636(), (byte) 79, class412.field5381) + super.field10799.field4106;
        super.field10798.method1841((float) (var4 - -(super.field10798.method1634() / 2)), (float) (super.field10798.method1636() / 2 + var5), 4096, this.field1230);
        this.field1230 += ((class424) super.field10799).field5628;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 25)
    public static final int method822(Random arg0, int arg1, int arg2) {
        ++field1233;
        if (arg1 <= ~arg2) {
            throw new IllegalArgumentException();
        } else if (class152.method1091(arg2, -56)) {
            return (int) ((4294967295L & (long) arg0.nextInt()) * (long) arg2 >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class764.method4235(var4, -43, arg2);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BLqh;)V", line = 51)
    public static final void method823(byte arg0, class75 arg1) {
        ++field1231;
        if (!class672.field9218) {
            arg1.method2219(13630);
            --class245.field2894;
            if (arg0 == 104) {
                if (arg1.field1031) {
                    for (class581 var2 = (class581) class365.field4542.method1003((byte) 53); var2 != null; var2 = (class581) class365.field4542.method1004(true)) {
                        if (var2.field7922.equals(arg1.field1028)) {
                            boolean var3 = false;
                            for (class75 var4 = (class75) var2.field7925.method1003((byte) 53); var4 != null; var4 = (class75) var2.field7925.method1004(true)) {
                                if (arg1 == var4) {
                                    if (var2.method3346(19143, arg1)) {
                                        class119.method934(var2, (byte) 56);
                                    }
                                    var3 = true;
                                    break;
                                }
                            }
                            if (var3) {
                                return;
                            }
                        }
                    }
                } else {
                    long var5 = arg1.field1024;
                    class581 var7;
                    for (var7 = (class581) class90.field1207.method2121(60, var5); var7 != null && !var7.field7922.equals(arg1.field1028); var7 = (class581) class90.field1207.method2118(0)) {
                    }
                    if (var7 != null && var7.method3346(arg0 + 19039, arg1)) {
                        class119.method934(var7, (byte) 97);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(JIBZ)Ljava/lang/String;", line = 125)
    public static final String method824(long arg0, int arg1, byte arg2, boolean arg3) {
        ++field1235;
        Calendar var5;
        if (arg3) {
            class570.method3293(true, arg0);
            var5 = class532.field7497;
        } else {
            class200.method1297(-30414, arg0);
            var5 = class532.field7493;
        }
        int var6 = var5.get(5);
        int var7 = 1 + var5.get(2);
        int var8 = var5.get(1);
        if (arg2 <= 69) {
            method824(13L, 10, (byte) -106, false);
        }
        int var9 = var5.get(11);
        int var10 = var5.get(12);
        return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lbt;Lns;)V", line = 162)
    public class93(class48 arg0, class424 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)V", line = 169)
    public static void method825(int arg0) {
        field1234 = null;
        if (arg0 != 10) {
            method827(-2);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIB)Z", line = 180)
    public static final boolean method826(int arg0, int arg1, byte arg2) {
        ++field1228;
        if (arg2 <= 109) {
            method822((Random) null, -90, -77);
        }
        return (arg1 & 32768) != 0;
    }

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "(I)V", line = 193)
    public static final void method827(int arg0) {
        class235.field2787 = 0;
        ++field1236;
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class323.field4015[var1] = null;
            class63.field866[var1] = 1;
            class320.field3971[var1] = null;
        }
        if (arg0 != 5) {
            method823((byte) 111, (class75) null);
        }
    }
}
