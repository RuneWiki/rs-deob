import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class145 extends class108 {

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2631 = " more options";

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[S")
    public static short[] field2634;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V", line = 4)
    public static void method1162(int arg0) {
        field2634 = null;
        if (arg0 == 0) {
            field2631 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)I", line = 27)
    public static final int method1163(int arg0) {
        field2633++;
        class98.field1590 = arg0;
        return class322.method2214((byte) 45);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 41)
    public static final void method1164(byte arg0) {
        if (class135.field2362 != null) {
            class135.field2362.method1280((byte) 76);
        }
        if (arg0 >= -41) {
            method1162(-8);
        }
        if (class320.field5064 != null) {
            class320.field5064.method1280((byte) 76);
        }
        class247.method1733(22050, 2, class57.field875, (byte) 48);
        class135.field2362 = class17.method174(0, -95, class42.field616, 22050, class85.field1369);
        field2629++;
        class135.field2362.method1274(class188.field3160, -50);
        class320.field5064 = class17.method174(1, -67, class42.field616, 2048, class85.field1369);
        class320.field5064.method1274(class1.field9, -105);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILcg;)V", line = 66)
    public static final void method1165(int arg0, class49 arg1) {
        if (arg0 == 0) {
            field2632++;
            class97.field1529 = arg1;
        }
    }
}
