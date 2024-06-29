import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class252 {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    private int field4025 = 0;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lpk;")
    private class100 field4021;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "[I")
    public static int[] field4024 = new int[2000];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Ldh;")
    private class120 field4026;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Ldl;")
    public static class123 field4030;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[S")
    public static short[] field4027;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method1688(byte arg0) {
        if (arg0 != -101) {
            method1691(115, (byte) 87);
        }
        field4024 = null;
        field4030 = null;
        field4027 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Ldh;")
    public final class120 method1689(int arg0) {
        if (arg0 != 1) {
            field4024 = null;
        }
        field4029++;
        this.field4025 = 0;
        return this.method1690(-83);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Ldh;")
    public final class120 method1690(int arg0) {
        field4023++;
        if (this.field4025 > 0 && this.field4021.field1563[this.field4025 - 1] != this.field4026) {
            class120 var2 = this.field4026;
            this.field4026 = var2.field1752;
            return var2;
        }
        int var3 = 63 % ((50 - arg0) / 57);
        while (this.field4021.field1549 > this.field4025) {
            class120 var4 = this.field4021.field1563[this.field4025++].field1752;
            if (this.field4021.field1563[this.field4025 - 1] != var4) {
                this.field4026 = var4.field1752;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Lkg;")
    public static final class136 method1691(int arg0, byte arg1) {
        field4022++;
        class136 var2 = (class136) class23.field290.method1428((long) arg0, (byte) -117);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class189.field2981.method807((byte) 112, class264.method1805(arg0, -99), class173.method1221(-96, arg0));
        class136 var4 = new class136();
        var4.field1975 = arg0;
        int var5 = 14 % ((arg1 - 47) / 53);
        if (var3 != null) {
            var4.method926(-1, new class25(var3));
        }
        var4.method922((byte) -93);
        class23.field290.method1424((long) arg0, var4, -2003648287);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lpk;)V")
    public class252(class100 arg0) {
        this.field4021 = arg0;
    }
}
