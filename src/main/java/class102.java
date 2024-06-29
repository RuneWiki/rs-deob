import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class102 extends class38 {

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field1735 = 0;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "[Lvd;")
    public static class4[] field1737;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ltg;Ltg;ILqj;)V")
    public static final void method714(class182 arg0, class182 arg1, int arg2, class147 arg3) {
        class90.field1540 = arg3;
        class39.field670 = arg0;
        field1733++;
        class76.field1342 = arg1;
        if (class39.field670 != null) {
            class269.field4733 = class39.field670.method1233(1, false);
        }
        if (class76.field1342 != null) {
            class208.field3606 = class76.field1342.method1233(1, false);
        }
        if (arg2 > -39) {
            field1735 = -23;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)I")
    public static final int method715(byte arg0, int arg1) {
        field1734++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 <= 74) {
                field1735 = 39;
            }
            return class79.method551((byte) -48, arg1);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static void method716(int arg0) {
        if (arg0 == 0) {
            field1737 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(II)V")
    public static final void method717(int arg0, int arg1) {
        field1736++;
        if (!class22.method134(arg1, (byte) 111)) {
            return;
        }
        class107[] var2 = class125.field2188[arg1];
        int var3 = 0;
        if (arg0 != 13654) {
            field1737 = null;
        }
        while (var2.length > var3) {
            class107 var4 = var2[var3];
            if (var4 != null) {
                var4.field1911 = 0;
                var4.field1929 = 0;
            }
            var3++;
        }
    }
}
