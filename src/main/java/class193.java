import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class193 extends class167 {

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "I")
    private int field3452;

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "Lkh;")
    public static class117 field3454 = class224.method1450((byte) -19, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field3448 = 0;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "[Lqe;")
    public static class180[] field3450 = new class180[50];

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "Lkh;")
    public static class117 field3456 = class224.method1450((byte) 110, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "[S")
    public static short[] field3455 = new short[256];

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "Z")
    public static boolean field3457 = false;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3455 = null;
        }
        if (~arg2 == -1) {
            this.field3452 = (arg0.method998(101) << 12) / 255;
        }
        ++field3451;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method1291(boolean arg0) {
        if (!arg0) {
            field3455 = null;
            field3450 = null;
            field3456 = null;
            field3454 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1292(int arg0, int arg1, byte arg2) {
        if (arg2 >= -104) {
            field3455 = null;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        class211 var3 = class48.method379(53, arg0);
        ++field3453;
        if (~arg1 <= -6 && ~arg1 >= -9) {
            arg1 = 4;
        }
        return var3.method1386(109, arg1);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class193() {
        this(4096);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
    private class193(int arg0) {
        super(0, true);
        this.field3452 = 4096;
        this.field3452 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field3449;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (super.field3013.field4085) {
            class2.method8(var3, 0, class115.field2146, this.field3452);
        }
        if (arg0 != -96) {
            field3456 = null;
        }
        return var3;
    }
}
