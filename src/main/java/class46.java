import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class46 extends class239 {

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    private final int field1053;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    private final int field1049;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    private final int field1059;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    private final int field1048;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field1051 = 1;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field1052 = (int) (17.0D * Math.random()) + -8;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "Lgd;")
    public static class57 field1058 = new class57(0, 0);

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "F")
    public static float field1061;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "Lvb;")
    public static class226 field1060;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lkj;")
    public static final class78 method357(int arg0, int arg1) {
        ++field1055;
        class78 var2 = (class78) class205.field3523.method615(false, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class17.field373.method1197(arg0, 26, -2);
            if (arg1 != 1557) {
                field1051 = -92;
            }
            class78 var4 = new class78();
            if (var3 != null) {
                var4.method573((byte) -35, new class152(var3));
            }
            class205.field3523.method619((byte) -99, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
    public static final void method358(byte arg0, int arg1) {
        ++field1047;
        if (arg0 == 109) {
            class15.field341 = 1000 / arg1;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method359(int arg0) {
        field1058 = null;
        field1060 = null;
        int var1 = 21 / ((arg0 - -23) / 46);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public final void method241(int arg0, int arg1, int arg2) {
        int var4 = this.field1053 * arg2 >> 12;
        int var5 = this.field1049 * arg2 >> 12;
        int var6 = 16 % ((arg1 - 62) / 40);
        ++field1057;
        int var7 = this.field1059 * arg0 >> 12;
        int var8 = this.field1048 * arg0 >> 12;
        class111.method809(super.field4111, var8, var5, (byte) -121, var4, var7);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI)V")
    public final void method242(int arg0, byte arg1, int arg2) {
        ++field1050;
        int var4 = this.field1053 * arg2 >> 12;
        int var5 = this.field1049 * arg2 >> 12;
        int var6 = this.field1059 * arg0 >> 12;
        int var7 = this.field1048 * arg0 >> 12;
        class20.method177(127, var4, super.field4111, var5, super.field4115, var7, var6, super.field4102);
        if (arg1 >= -10) {
            field1051 = 100;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)J")
    public static final long method360(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        return var3 != null && var3.field3022 != null ? var3.field3022.field154 : 0L;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IZ)Lia;")
    public static final class257 method361(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field1054;
            return class233.method1528(new class257[] { class111.method808(10, arg0 >> 24 & 255), class57.field1219, class111.method808(10, 255 & arg0 >> 16), class57.field1219, class111.method808(10, arg0 >> 8 & 255), class57.field1219, class111.method808(10, arg0 & 255) }, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIII)V")
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1053 = arg0;
        this.field1049 = arg2;
        this.field1059 = arg1;
        this.field1048 = arg3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)V")
    public final void method240(byte arg0, int arg1, int arg2) {
        ++field1056;
        int var4 = this.field1049 * arg2 >> 12;
        if (arg0 == -15) {
            int var5 = this.field1053 * arg2 >> 12;
            int var6 = this.field1059 * arg1 >> 12;
            int var7 = this.field1048 * arg1 >> 12;
            class79.method595(var4, var7, var5, super.field4115, arg0 + 15, var6, super.field4102);
        }
    }
}
