import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class162 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Z")
    public static boolean field2059 = false;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Ldq;")
    public static class493 field2061 = new class493(11, 14);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lit;")
    public class458 field2060;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lya;IBI)V", line = 4)
    public static final void method1041(class38 arg0, int arg1, byte arg2, int arg3) {
        field2057++;
        class303.field3890 = arg0;
        class371.field4797 = new class524[arg3][arg1];
        if (class405.field5796 != null) {
            class377.field4960 = class350.method2010(class405.field5796[3], class405.field5796[1], class405.field5796[5], class405.field5796[0], class405.field5796[2], -8076, class405.field5796[4]);
        }
        class105.field1334 = new class524();
        if (arg2 != 2) {
            method1043(111);
        }
        class492.method2986(arg2 ^ 0xFFFFFF87);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V", line = 26)
    public static final void method1042(int arg0, int arg1) {
        field2058++;
        if (arg0 >= 37) {
            class153 var2 = class75.method656(7, 255, arg1);
            var2.method997((byte) 93);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 39)
    public static void method1043(int arg0) {
        field2061 = null;
        if (arg0 != 2) {
            field2059 = true;
        }
    }
}
