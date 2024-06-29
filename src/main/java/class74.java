import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class74 extends class80 {

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public int field1244;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "Lph;")
    public static class229 field1252 = class266.method1858(" )2> <col=ffffff>", 0);

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "[Lck;")
    public static class1[] field1249 = new class1[28];

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "[I")
    public static int[] field1257 = new int[5];

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Lph;")
    public static class229 field1251 = class266.method1858("Titelbild geladen)3", 0);

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Lph;")
    public static class229 field1256 = class266.method1858("Okay", 0);

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Lec;")
    public static class67 field1247;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "[I")
    public static int[] field1245;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "[Lka;")
    public static class293[] field1250;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V", line = 13)
    public static final void method568(int arg0) {
        class235.field3882.method1415(-18218);
        field1246++;
        class119.field1996.method1415(-18218);
        if (arg0 >= 1) {
            class12.field165.method1415(-18218);
        }
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V", line = 27)
    public static void method569(int arg0) {
        field1252 = null;
        field1247 = null;
        field1251 = null;
        field1257 = null;
        if (arg0 == 25400) {
            field1250 = null;
            field1245 = null;
            field1256 = null;
            field1249 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BII)Z", line = 46)
    public final boolean method570(byte arg0, int arg1, int arg2) {
        if (arg0 != 72) {
            method569(42);
        }
        field1254++;
        return arg1 >= this.field1244 && this.field1253 >= arg1 && arg2 >= this.field1255 && this.field1248 >= arg2;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIII)V", line = 88)
    public class74(int arg0, int arg1, int arg2, int arg3) {
        this.field1244 = arg0;
        this.field1255 = arg1;
        this.field1253 = arg2;
        this.field1248 = arg3;
    }
}
