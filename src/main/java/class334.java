import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class334 extends class47 {

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
    public static int field4641 = 0;

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "Lch;")
    public static class151 field4647 = new class151("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!ct", name = "Q", descriptor = "I")
    public static int field4649 = 0;

    @OriginalMember(owner = "client!ct", name = "R", descriptor = "Lrc;")
    public static class108 field4650 = new class108(79, 1);

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ct", name = "K", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ct", name = "L", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ct", name = "N", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ct", name = "P", descriptor = "I")
    public int field4648;

    @OriginalMember(owner = "client!ct", name = "M", descriptor = "Ljava/lang/String;")
    public String field4645;

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "[I")
    public static int[] field4638;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V")
    public final void method2099(boolean arg0) {
        ++field4643;
        if (arg0) {
            super.field713 = class10.method51(-3183) - -500L | Long.MIN_VALUE & super.field713;
            class270.field3937.method1962((byte) -67, this);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BII)I")
    public static final int method2100(byte arg0, int arg1, int arg2) {
        ++field4639;
        int var3 = (127 & arg1) * arg2 >> 7;
        if (arg0 <= 112) {
            method2103(false);
        }
        if (var3 >= 2) {
            if (~var3 < -127) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (arg1 & 65408) - -var3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)V")
    public static final void method2101(int arg0, byte arg1) {
        if (arg1 != 21) {
            method2101(16, (byte) 21);
        }
        ++field4642;
        class334 var2 = class352.method2172(arg0, 16, 16711935);
        var2.method2099(true);
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)I")
    public final int method2102(int arg0) {
        if (arg0 != 24611) {
            this.method2105(true);
        }
        ++field4640;
        return (int) (super.field6382 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(Z)V")
    public static void method2103(boolean arg0) {
        field4638 = null;
        if (arg0) {
            field4650 = null;
        }
        field4650 = null;
        field4647 = null;
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)V")
    public final void method2104(int arg0) {
        super.field713 |= Long.MIN_VALUE;
        ++field4637;
        if (this.method2106(13) == (long) arg0) {
            class402.field5511.method1962((byte) -67, this);
        }
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(Z)I")
    public final int method2105(boolean arg0) {
        ++field4646;
        return !arg0 ? 8 : (int) super.field6382;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)J")
    public final long method2106(int arg0) {
        ++field4644;
        return arg0 != 13 ? 122L : super.field713 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(II)V")
    public class334(int arg0, int arg1) {
        super.field6382 = (long) arg0 << 32 | (long) arg1;
    }
}
