import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class69 extends class270 {

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "Lmh;")
    public static class62 field1057 = class201.method1405(true, "; Max)2Age=");

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field1059 = 0;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "Lmh;")
    public static class62 field1062 = class201.method1405(true, "::cardmem");

    @OriginalMember(owner = "client!af", name = "U", descriptor = "Lsk;")
    public static class199 field1058 = new class199(100);

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "Lmh;")
    public static class62 field1064 = class201.method1405(true, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "Lmh;")
    public static class62 field1066 = class201.method1405(true, "null");

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "Lmh;")
    public static class62 field1065 = class201.method1405(true, ")4a=");

    @OriginalMember(owner = "client!af", name = "db", descriptor = "Lmh;")
    public static class62 field1067 = class201.method1405(true, "blinken2:");

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "[I")
    public static int[] field1068 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method6(int arg0, int arg1) {
        field1060++;
        int[] var3 = this.field4573.method919(arg1, arg0 + 7379);
        if (this.field4573.field1984) {
            class231.method1632(var3, 0, class109.field1770, this.field1061);
        }
        if (arg0 != 18693) {
            method506(37);
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V", line = 30)
    public static void method506(int arg0) {
        field1057 = null;
        field1068 = null;
        if (arg0 > -31) {
            return;
        }
        field1065 = null;
        field1064 = null;
        field1066 = null;
        field1067 = null;
        field1058 = null;
        field1062 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V", line = 46)
    private class69(int arg0) {
        super(0, true);
        this.field1061 = 4096;
        this.field1061 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)I", line = 65)
    public static final int method507(int arg0, int arg1) {
        field1063++;
        if (arg0 != 12720) {
            field1057 = (class62) null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 79)
    public class69() {
        this(4096);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lmi;II)V", line = 97)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field1056++;
        int var4 = -21 / ((-arg2 - 8) / 53);
        if (arg1 == 0) {
            this.field1061 = (arg0.method702(-1) << 12) / 255;
        }
    }
}
