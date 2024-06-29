import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class6 extends class429 {

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Z")
    private boolean field80 = false;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lsi;")
    public static class769 field76 = new class769(16);

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field82 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Luf;")
    public static class519 field86 = null;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
    public static int[] field87 = new int[4096];

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V")
    public static void method42(int arg0) {
        field86 = null;
        if (arg0 != -26296) {
            method42(84);
        }
        field76 = null;
        field87 = null;
        field82 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
    public final void method43(int arg0, boolean arg1) {
        ++field78;
        super.field5939.method974(class317.field4523, class552.field7657, (byte) -59);
        if (arg0 != 0) {
            field76 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZZ)V")
    public final void method44(boolean arg0, boolean arg1) {
        if (arg1) {
            field86 = null;
        }
        ++field77;
        class540 var3 = super.field5939.method1020(512);
        if (var3 != null && arg0) {
            super.field5939.method959(1, -30);
            super.field5939.method988(1, var3);
            super.field5939.method98(class297.field4312, (byte) -60);
            super.field5939.method959(1, 2);
            super.field5939.method974(class407.field5606, class552.field7657, (byte) -59);
            super.field5939.method139(2, false, true, class317.field4535, 0);
            super.field5939.method973(0, class368.field5193, (byte) 98);
            class742 var4 = super.field5939.method943(-23324);
            var4.method4089(-125, super.field5939.method967(-30860));
            super.field5939.method983(83, class604.field8581);
            super.field5939.method959(0, -125);
            this.field80 = true;
        } else {
            super.field5939.method973(0, class368.field5193, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lmj;)V")
    public class6(class114 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Len;ZI)V")
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        super.field5939.method988(1, arg0);
        if (arg1) {
            field85 = 121;
        }
        ++field79;
        super.field5939.method949(arg2, (byte) 57);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public final void method46(int arg0, int arg1, int arg2) {
        ++field84;
        if (arg0 != 37) {
            this.method46(-37, -106, 121);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public final void method47(byte arg0) {
        int var2 = -1 % ((-56 - arg0) / 48);
        if (!this.field80) {
            super.field5939.method973(0, class264.field3730, (byte) 98);
        } else {
            super.field5939.method959(1, 117);
            super.field5939.method98(class766.field10585, (byte) -60);
            super.field5939.method974(class317.field4523, class317.field4523, (byte) -59);
            super.field5939.method1014(2, 101, class504.field6917);
            super.field5939.method973(0, class264.field3730, (byte) 124);
            super.field5939.method1013(true);
            super.field5939.method988(1, (class408) null);
            super.field5939.method959(0, 110);
            this.field80 = false;
        }
        ++field83;
        super.field5939.method974(class317.field4523, class317.field4523, (byte) -59);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Z")
    public final boolean method48(byte arg0) {
        ++field81;
        if (arg0 != -128) {
            method42(-66);
        }
        return true;
    }
}
