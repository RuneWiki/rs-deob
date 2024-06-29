import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class107 extends class12 {

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public int field1886;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field1891 = 2;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field1895 = 2;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field1890 = 0;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Lfl;")
    public static class192 field1885;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(IIB)Z")
    public final boolean method713(int arg0, int arg1, byte arg2) {
        field1894++;
        int var4 = -12 / ((46 - arg2) / 52);
        return this.field1887 <= arg0 && arg0 <= this.field1886 && arg1 >= this.field1892 && this.field1888 >= arg1;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIII)V")
    public class107(int arg0, int arg1, int arg2, int arg3) {
        this.field1886 = arg2;
        this.field1892 = arg1;
        this.field1888 = arg3;
        this.field1887 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
    public static void method714(int arg0) {
        field1885 = null;
        int var1 = -7 / ((45 - arg0) / 62);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIBI)V")
    public static final void method715(int arg0, int arg1, byte arg2, int arg3) {
        field1893++;
        if (arg2 >= -93) {
            field1885 = null;
        }
        class265 var4 = class148.method1022(10, new class265[] { class89.field1604, class241.method1609(true, arg3), class282.field4973, class241.method1609(true, arg0 >> 6), class282.field4973, class241.method1609(true, arg1 >> 6), class282.field4973, class241.method1609(true, arg0 & 0x3F), class282.field4973, class241.method1609(true, arg1 & 0x3F) });
        var4.method1770((byte) -96);
        class80.method554((byte) 102, var4);
    }
}
