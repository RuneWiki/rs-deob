import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class12 extends class183 {

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    private int field138 = 4096;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    private int field139 = 0;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "[I")
    public static int[] field141 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Ljf;")
    public static class229 field143 = class212.method1457((byte) 103, "Cach-B");

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "[I")
    public static int[] field145 = new int[200];

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    public static int field147 = 0;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 9)
    public class12() {
        super(1, true);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)[I", line = 36)
    public final int[] method10(int arg0, int arg1) {
        int[] var3 = this.field3161.method664(arg0, 0);
        field146++;
        if (arg1 != -1) {
            this.method10(65, -64);
        }
        if (this.field3161.field1736) {
            int[] var4 = this.method1253(0, arg0, arg1 + 109);
            for (int var5 = 0; var5 < class22.field393; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field139 <= var6 && var6 <= this.field138 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(II)Lml;", line = 66)
    public static final class134 method75(int arg0, int arg1) {
        field149++;
        class134 var2 = (class134) class64.field1099.method229((long) arg0, arg1 ^ 0xFFFFFFF0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 2) {
            byte[] var3 = class70.field1335.method1275(arg0, 1, -5211);
            class134 var4 = new class134();
            var4.field2351 = arg0;
            if (var3 != null) {
                var4.method921(arg1 ^ 0x21F7, new class14(var3));
            }
            var4.method923(100);
            class64.field1099.method227(-25077, var4, (long) arg0);
            return var4;
        } else {
            return (class134) null;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(B)V", line = 99)
    public static void method76(byte arg0) {
        field141 = null;
        field143 = null;
        if (arg0 == 23) {
            field145 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILkh;I)V", line = 124)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg2 == 0) {
            this.field139 = arg1.method116(-1);
        } else if (arg2 == 1) {
            this.field138 = arg1.method116(-1);
        }
        if (arg0 > -43) {
            this.method10(-18, -3);
        }
        field144++;
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V", line = 167)
    public static final void method77(int arg0) {
        int var1 = 101 % ((-arg0 - 67) / 57);
        field148++;
        class105.field1818 = new class303();
    }
}
