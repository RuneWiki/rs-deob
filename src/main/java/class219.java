import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class219 extends class167 {

    @OriginalMember(owner = "client!u", name = "T", descriptor = "Lkh;")
    private static class117 field3970 = class224.method1450((byte) -96, "No reply from loginserver)3");

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Lkh;")
    public static class117 field3971 = class224.method1450((byte) -114, "0(U");

    @OriginalMember(owner = "client!u", name = "X", descriptor = "Lkh;")
    public static class117 field3974 = field3970;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    public static int field3975 = 0;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "Lkh;")
    public static class117 field3976 = class224.method1450((byte) -113, "Hidden)2use");

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "Lai;")
    public static class10 field3978;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZII)V")
    public static final void method1431(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field3973;
        if (!arg2) {
            method1431(-12, -6, true, -125, 67);
        }
        if (arg1 >= class240.field4355 && class146.field2678 >= arg1) {
            int var5 = class119.method843(class159.field2910, -124, arg3, class224.field4040);
            int var6 = class119.method843(class159.field2910, -121, arg4, class224.field4040);
            class223.method1445((byte) 100, var5, arg0, arg1, var6);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field3972;
        if (arg0 != -96) {
            field3975 = 78;
        }
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            int var4 = class143.field2583[arg1];
            for (int var5 = 0; ~var5 > ~class115.field2146; ++var5) {
                var3[var5] = this.method1433(class70.field1350[var5], var4, (byte) 12) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(B)V")
    public static void method1432(byte arg0) {
        field3970 = null;
        field3974 = null;
        if (arg0 == -126) {
            field3978 = null;
            field3971 = null;
            field3976 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB)I")
    private final int method1433(int arg0, int arg1, byte arg2) {
        ++field3977;
        int var4 = arg1 * 57 + arg0;
        if (arg2 != 12) {
            field3978 = null;
        }
        int var5 = var4 << 1 ^ var4;
        return 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class219() {
        super(0, true);
    }
}
