import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class89 {

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "Lqc;")
    private class325 field1137 = new class325(64);

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "Ldda;")
    private class597 field1131;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "[I")
    public static int[] field1133 = new int[2];

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    public static int field1140 = 0;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "[[I")
    public static int[][] field1141 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "Ldda;")
    public static class597 field1139;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
    public final void method521(int arg0) {
        field1136++;
        class325 var2 = this.field1137;
        synchronized (this.field1137) {
            if (arg0 == 1) {
                this.field1137.method2037(true);
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V")
    public static final void method522(byte arg0) {
        class328.field4849.method2024((byte) -128);
        field1134++;
        class100.field1273.method2024((byte) -86);
        class369.field5335.method2024((byte) -121);
        if (arg0 < -49) {
            class125.field1646.method2024((byte) -118);
            class316.field4733.method2024((byte) -116);
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V")
    public final void method523(int arg0) {
        class325 var2 = this.field1137;
        synchronized (this.field1137) {
            if (arg0 < 113) {
                method525(-107);
            }
            this.field1137.method2024((byte) -87);
        }
        field1132++;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)V")
    public final void method524(int arg0, int arg1) {
        class325 var3 = this.field1137;
        synchronized (this.field1137) {
            this.field1137.method2028(arg1, true);
        }
        field1138++;
        if (arg0 != 64) {
            this.field1137 = null;
        }
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)V")
    public static void method525(int arg0) {
        field1133 = null;
        if (arg0 != 2) {
            field1139 = null;
        }
        field1139 = null;
        field1141 = null;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Loda;ILdda;)V")
    public class89(class559 arg0, int arg1, class597 arg2) {
        this.field1131 = arg2;
        this.field1131.method3462(32, 73);
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)Lbf;")
    public final class229 method526(int arg0, int arg1) {
        field1135++;
        class325 var3 = this.field1137;
        class229 var4;
        synchronized (this.field1137) {
            var4 = (class229) this.field1137.method2025((long) arg1, arg0 + 442);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field1131;
        byte[] var6;
        synchronized (this.field1131) {
            var6 = this.field1131.method3486((byte) -89, arg1, 32);
            if (arg0 != -440) {
                this.method523(-70);
            }
        }
        class229 var7 = new class229();
        if (var6 != null) {
            var7.method1495(new class428(var6), -1);
        }
        class325 var8 = this.field1137;
        synchronized (this.field1137) {
            this.field1137.method2029(false, var7, (long) arg1);
            return var7;
        }
    }
}
