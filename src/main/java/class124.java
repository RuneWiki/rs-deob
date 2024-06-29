import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class124 extends class60 {

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lub;")
    public static class227 field2221 = class257.method1749("; Max)2Age=", 17263);

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "[I")
    public static int[] field2222 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lub;")
    public static class227 field2226 = class257.method1749("slr2)3ws?order=LPWM", 17263);

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Lub;")
    public static class227 field2230 = class257.method1749("p12_full", 17263);

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "Lo;")
    public static class208 field2229;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static void method766(int arg0) {
        field2229 = null;
        field2222 = null;
        field2230 = null;
        field2221 = null;
        if (arg0 == -1) {
            field2226 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
    public static final void method767(int arg0, int arg1) {
        if (arg1 >= -93) {
            field2226 = null;
        }
        field2225++;
        class218.field3673.method1272(5664, new class216(arg0));
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ln;B)V")
    public static final void method768(class138 arg0, byte arg1) {
        if (arg1 == 63) {
            class173.field2898 = arg0;
            field2223++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V")
    public class124(int arg0, int arg1) {
        this.field2224 = arg1;
        this.field2227 = arg0;
    }
}
