import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class265 extends class8 {

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
    public static int field3636 = 0;

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "I")
    public static int field3638 = -60;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public static int field3631 = 0;

    @OriginalMember(owner = "client!cw", name = "D", descriptor = "[J")
    public static long[] field3645 = new long[32];

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!cw", name = "x", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!cw", name = "y", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!cw", name = "A", descriptor = "I")
    public int field3642;

    @OriginalMember(owner = "client!cw", name = "B", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!cw", name = "C", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!cw", name = "E", descriptor = "J")
    public long field3646;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)J")
    public final long method50(int arg0) {
        if (arg0 <= 99) {
            this.method49((byte) 56);
        }
        field3635++;
        return this.field3646;
    }

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "(B)I")
    public final int method55(byte arg0) {
        field3632++;
        return arg0 == 71 ? 0 : -54;
    }

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "(I)V")
    public static void method1638(int arg0) {
        field3645 = null;
        if (arg0 != 0) {
            method1638(57);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZLdga;)Lvm;")
    public static final class349 method1639(boolean arg0, class138 arg1) {
        arg1.method957((byte) -73);
        field3639++;
        int var2 = arg1.method957((byte) -75);
        class349 var3 = class398.method2355(39, var2);
        var3.field5106 = arg1.method957((byte) -99);
        int var4 = arg1.method957((byte) -120);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method957((byte) -111);
            var3.method5(4095, var6, arg1);
        }
        if (arg0) {
            field3631 = -121;
        }
        var3.method11((byte) -122);
        return var3;
    }

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "(B)I")
    public final int method57(byte arg0) {
        int var2 = 9 % ((75 - arg0) / 32);
        field3640++;
        return this.field3642;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)I")
    public final int method51(int arg0) {
        if (arg0 == 1) {
            field3641++;
            return this.field3633;
        } else {
            return 105;
        }
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(B)I")
    public final int method49(byte arg0) {
        if (arg0 != -31) {
            this.field3642 = -21;
        }
        field3634++;
        return this.field3644;
    }
}
