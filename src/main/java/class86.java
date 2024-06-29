import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public abstract class class86 {

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "Lsf;")
    public class551 field1203;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "[[[I")
    public static int[][][] field1201;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V", line = 10)
    public static void method533(int arg0) {
        if (arg0 < 20) {
            field1199 = -42;
        }
        field1201 = null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V", line = 20)
    public final void method534(int arg0, int arg1) {
        if (arg1 < -124) {
            if (this.method72(arg0, -2) != 3) {
                this.method76(arg0, false);
            }
            field1204++;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIILpa;)V", line = 38)
    public static final void method535(int arg0, int arg1, int arg2, class417 arg3) {
        class766 var4 = class196.method1355(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field10426 = arg3;
        int var5 = class735.field9973 == class116.field1542 ? 1 : 0;
        if (arg3.method743((byte) -82)) {
            if (arg3.method738(true)) {
                arg3.field2890 = class336.field4089[var5];
                class336.field4089[var5] = arg3;
                return;
            }
            arg3.field2890 = class177.field2327[var5];
            class177.field2327[var5] = arg3;
            class689.field8852 = true;
            return;
        }
        arg3.field2890 = class640.field8187[var5];
        class640.field8187[var5] = arg3;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIII)Z", line = 71)
    public static final boolean method536(int arg0, int arg1, int arg2, int arg3) {
        field1202++;
        class435.field5711.method446(arg0, arg2, arg1, class120.field1609);
        int var4 = class120.field1609[2];
        if (arg3 < 70) {
            return false;
        } else if (var4 < 50) {
            return false;
        } else {
            class120.field1609[0] = class120.field1609[0] * class350.field4278 / var4 + class365.field4462;
            class120.field1609[1] = class120.field1609[1] * class364.field4458 / var4 + class377.field4621;
            class120.field1609[2] = var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lsf;)V", line = 100)
    public class86(class551 arg0) {
        this.field1203 = arg0;
        this.field1200 = this.method73(0);
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(ILsf;)V", line = 108)
    public class86(int arg0, class551 arg1) {
        this.field1203 = arg1;
        this.field1200 = arg0;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)I")
    public abstract int method73(int arg0);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZ)V")
    public abstract void method76(int arg0, boolean arg1);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
    public abstract void method71(byte arg0);

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(II)I")
    public abstract int method72(int arg0, int arg1);
}
