import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class71 extends class409 {

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "Lhj;")
    public static class596 field988 = new class596(15, 6);

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Ltf;")
    private class312 field990;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZII)V")
    public final void method680(int arg0, boolean arg1, int arg2, int arg3) {
        ++field986;
        int var5 = this.method2450((byte) 58) * super.field5359.field7694 / 10000;
        int[] var6 = new int[4];
        class363.field4526.method566(var6);
        if (arg2 != -30315) {
            method683(-48);
        }
        class363.field4526.method556(arg0, arg3 + 2, arg0 + var5, super.field5359.field7703 + arg3);
        this.field990.method1844(arg0, arg3 - -2, super.field5359.field7694, super.field5359.field7703);
        class363.field4526.method556(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZIB)V")
    public final void method681(int arg0, boolean arg1, int arg2, byte arg3) {
        ++field983;
        class363.field4526.method633(arg0 + -2, arg2, super.field5359.field7694 + 4, super.field5359.field7703 + 2, ((class226) super.field5359).field2633, 0);
        if (arg3 > -52) {
            this.method681(-3, false, -111, (byte) 9);
        }
        class363.field4526.method633(arg0 + -1, arg2 - -1, super.field5359.field7694 + 2, super.field5359.field7703, 0, 0);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLtba;III)V")
    public static final void method682(byte arg0, class174 arg1, int arg2, int arg3, int arg4) {
        ++field989;
        class96 var5 = (class96) class477.field6625.method2725(37);
        int var6 = -107 / ((-57 - arg0) / 57);
        while (var5 != null) {
            if (~var5.field1255 == ~arg2 && arg3 << 9 == var5.field1258 && ~(arg4 << 9) == ~var5.field1267 && var5.field1268.field2166 == arg1.field2166) {
                if (var5.field1260 != null) {
                    class783.field10811.method3257(var5.field1260);
                    var5.field1260 = null;
                }
                if (var5.field1272 != null) {
                    class783.field10811.method3257(var5.field1272);
                    var5.field1272 = null;
                }
                var5.method2219(13630);
                return;
            }
            var5 = (class96) class477.field6625.method2726(-121);
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
    public static void method683(int arg0) {
        if (arg0 == 15) {
            field988 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
    public final void method684(int arg0) {
        super.method684(arg0);
        ++field987;
        this.field990 = class481.method2858(((class226) super.field5359).field2636, -1, super.field5362);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Z")
    public final boolean method685(int arg0) {
        ++field985;
        return !super.method685(arg0) ? false : super.field5362.method433((byte) -124, ((class226) super.field5359).field2636);
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lbt;Lbt;Lta;)V")
    public class71(class48 arg0, class48 arg1, class226 arg2) {
        super(arg0, arg1, arg2);
    }
}
