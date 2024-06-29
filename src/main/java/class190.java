import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class190 {

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[S")
    public short[] field3459;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "[S")
    public short[] field3465;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "[B")
    public byte[] field3455;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[I")
    public int[] field3462;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[Lsg;")
    public class30[] field3457;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Lsg;")
    public static class30 field3461 = class167.method1221((byte) 33, "gelb:");

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3456 = 0;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field3469 = 0;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lsg;")
    public static class30 field3466 = class167.method1221((byte) 33, " weitere Optionen");

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "[I")
    public static int[] field3470 = new int[256];

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lbi;")
    public static class66 field3452;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method1378(int arg0) {
        field3452 = null;
        field3466 = null;
        field3461 = null;
        int var1 = -51 % ((arg0 + 1) / 40);
        field3470 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
    public static final int method1379(int arg0, int arg1) {
        if (arg1 != -6488) {
            method1382(120, 27, 49);
        }
        field3468++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I")
    public final int method1380(int arg0, int arg1) {
        if (arg1 > -57) {
            return -10;
        } else {
            field3460++;
            return this.field3455[arg0] & 0x3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)Z")
    public final boolean method1381(int arg0, byte arg1) {
        if (arg1 == 47) {
            field3454++;
            return (this.field3455[arg0] & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
    public static final void method1382(int arg0, int arg1, int arg2) {
        field3463++;
        if (arg2 > class52.field1165 && class132.field2607 == 0 && !class175.field3258) {
            return;
        }
        class30 var3;
        if (class132.field2607 == 1 && class52.field1165 < 2) {
            var3 = class160.method1188(new class30[] { class163.field3031, class205.field3672, class173.field3234, class100.field2049 }, 0);
        } else if (class175.field3258 && class52.field1165 < 2) {
            var3 = class160.method1188(new class30[] { class93.field1867, class205.field3672, class246.field4384, class100.field2049 }, 0);
        } else {
            var3 = class109.method864(0, class52.field1165 - 1);
        }
        if (class52.field1165 > 2) {
            var3 = class160.method1188(new class30[] { var3, class48.field1100, class73.method675(arg2 ^ 0x67, class52.field1165 - 2), class1.field12 }, 0);
        }
        int var4 = class223.field4000.method1473(var3, arg1 + 4, arg0 + 15, 16777215, 0, class94.field1909, class126.field2456);
        class201.method1429(arg1 + 4, var4 + class223.field4000.method1456(var3), true, arg0, 15);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(I)V")
    public class190(int arg0) {
        this.field3467 = arg0;
        this.field3459 = new short[this.field3467];
        this.field3465 = new short[this.field3467];
        this.field3455 = new byte[this.field3467];
        this.field3462 = new int[this.field3467];
        this.field3457 = new class30[this.field3467];
    }
}
