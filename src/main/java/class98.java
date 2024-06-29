import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class98 extends class249 {

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "Lmb;")
    public static class96 field1669 = class243.method1708(" zuerst von Ihrer Freunde)2Liste(Q", (byte) 126);

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "Lmb;")
    public static class96 field1668 = null;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "Lmb;")
    public static class96 field1671 = class243.method1708("Abbrechen", (byte) 116);

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "[I")
    public static int[] field1673 = new int[100];

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "Lmb;")
    public static class96 field1674 = class243.method1708("(Udns", (byte) 106);

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "Lmb;")
    public static class96 field1672 = class243.method1708("(U2", (byte) 112);

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "J")
    public long field1664;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Lcl;")
    public class98 field1666;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "Lcl;")
    public class98 field1667;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public final void method740(int arg0) {
        if (arg0 != -22949) {
            return;
        }
        field1670++;
        if (this.field1667 != null) {
            this.field1667.field1666 = this.field1666;
            this.field1666.field1667 = this.field1667;
            this.field1667 = null;
            this.field1666 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)Lhh;")
    public static final class41 method741(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class41 var4 = var3.field3285;
            var3.field3285 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
    public static void method742(byte arg0) {
        field1669 = null;
        int var1 = -79 % ((-arg0 - 48) / 52);
        field1673 = null;
        field1671 = null;
        field1668 = null;
        field1672 = null;
        field1674 = null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)I")
    public static final int method743(int arg0, int arg1, int arg2) {
        field1665++;
        int var3 = arg1 + arg2 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }
}
