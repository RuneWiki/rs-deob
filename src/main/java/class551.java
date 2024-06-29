import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class551 implements class617 {

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Lin;")
    private class91 field7600;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lvr;")
    public class138 field7598;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field7595 = 0;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Lmi;")
    public class496 field7594;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "[I")
    public static int[] field7593;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)Z")
    public final boolean method1470(byte arg0) {
        int var2 = -79 / ((arg0 - 25) / 52);
        field7597++;
        return this.field7600.method874(false, this.field7598.field2307);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BZ)V")
    public void method1475(byte arg0, boolean arg1) {
        field7592++;
        if (arg1) {
            int var3 = this.field7598.field2304.method892(class478.field6661, this.field7594.method1618(), (byte) -117) + this.field7598.field2299;
            int var4 = this.field7598.field2301.method1644(class22.field488, this.field7594.method1614(), 1595) + this.field7598.field2300;
            this.field7594.method2925(var3, var4);
        }
        if (arg0 != -49) {
            field7595 = 26;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)I")
    public static final int method3174(int arg0, int arg1, byte arg2) {
        field7591++;
        int var3 = arg0 + (arg1 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = -76 / ((arg2 - 22) / 60);
        int var6 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var6 & 0x7FA112F) >> 19;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIB)V")
    public static final void method3175(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class140.field2314 <= arg2 - arg3 && class536.field7419 >= arg2 + arg3 && class58.field1150 <= arg0 - arg3 && class479.field6682 >= (arg0 + arg3)) {
            class204.method1419(arg0, arg2, -648, arg1, arg3);
        } else {
            class628.method3589(-107, arg2, arg1, arg0, arg3);
        }
        field7601++;
        int var5 = -68 / ((40 - arg4) / 36);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static void method3176(int arg0) {
        field7593 = null;
        int var1 = -13 / ((arg0 - 57) / 47);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public final void method1474(int arg0) {
        if (arg0 != 10286) {
            field7595 = -123;
        }
        this.field7594 = class392.method2467(this.field7598.field2307, (byte) -60, this.field7600);
        field7599++;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lin;Lvr;)V")
    public class551(class91 arg0, class138 arg1) {
        this.field7600 = arg0;
        this.field7598 = arg1;
    }
}
