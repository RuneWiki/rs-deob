import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class446 extends class130 implements class214 {

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field6625 = 0;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field6627 = 0;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "C")
    public char field6631;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public int field6624;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public int field6630;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    public int field6632;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "J")
    public long field6636;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)I", line = 4)
    public final int method1468(int arg0) {
        if (arg0 >= -89) {
            field6625 = -111;
        }
        field6634++;
        return this.field6630;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)I", line = 15)
    public final int method1469(byte arg0) {
        field6635++;
        int var2 = 99 % ((-arg0 - 92) / 32);
        return this.field6632;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(Z)I", line = 25)
    public final int method1472(boolean arg0) {
        field6626++;
        if (arg0) {
            this.method1472(false);
        }
        return this.field6624;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)C", line = 42)
    public final char method1470(int arg0) {
        field6628++;
        if (arg0 >= -126) {
            field6625 = -20;
        }
        return this.field6631;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)J", line = 58)
    public final long method1471(boolean arg0) {
        if (arg0) {
            return 24L;
        } else {
            field6633++;
            return this.field6636;
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(Z)V", line = 77)
    public static final void method2748(boolean arg0) {
        if (!arg0) {
            field6627 = -118;
        }
        field6629++;
        for (int var1 = 0; var1 < class510.field7414; var1++) {
            class128 var2 = class258.field4135[var1];
            if (var2.field1904 == 2) {
                if (var2.field1909 == null) {
                    var2.field1906 = Integer.MIN_VALUE;
                } else {
                    class503.field7313.method1802(var2.field1909);
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "()V", line = 107)
    public static final void method2749() {
        class13.method78(1, class183.field2802);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIII)V", line = 111)
    public static final void method2750(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6623++;
        class312.field4752.field2982 = 0;
        class312.field4752.method1381(class491.field7192.field7746, (byte) 90);
        class312.field4752.method1381(arg1, (byte) 117);
        class312.field4752.method1381(arg0, (byte) 82);
        class312.field4752.method1364(arg2, true);
        class312.field4752.method1364(arg3, true);
        class259.field4152 = arg4;
        class336.field5062 = -3;
        class327.field4949 = 0;
        class448.field6648 = 0;
    }
}
