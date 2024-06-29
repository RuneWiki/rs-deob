import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class538 {

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    private int field7883;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lhe;")
    public static class310 field7884;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lpv;")
    public static class61 field7881;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 3)
    public final void method3139(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field7883 = -78;
        }
        field7882++;
        OpenGL.glNewList(this.field7883 + arg0, 4864);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V", line = 15)
    public static final void method3140(int arg0, int arg1) {
        class6.field48 = 1000000000L / (long) arg1;
        if (arg0 != 9) {
            field7884 = null;
        }
        field7885++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IC)V", line = 26)
    public final void method3141(int arg0, char arg1) {
        OpenGL.glCallList(this.field7883 + arg1);
        if (arg0 <= 11) {
            method3140(-43, 25);
        }
        field7880++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 40)
    public static void method3142(byte arg0) {
        field7881 = null;
        field7884 = null;
        if (arg0 != -31) {
            field7881 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V", line = 52)
    public static final void method3143(byte arg0) {
        field7886++;
        class638.method3656(22050, 2, true, class565.field8299.field2171);
        class306.field3892 = new class274();
        class306.field3892.method1559(128, 9, -128);
        class382.field5052 = class346.method1934(class41.field331, 22050, 1, 0, class74.field873);
        class382.field5052.method1255(false, class306.field3892);
        class532.method3042(class92.field1132, class479.field6729, (byte) 12, class306.field3892, class173.field2110);
        class441.field6089 = class346.method1934(class41.field331, 2048, 1, 1, class74.field873);
        class534.field7500 = new class146();
        if (arg0 > 99) {
            class441.field6089.method1255(false, class534.field7500);
            class80.field957 = new class93(22050, class90.field1101);
            class204.field2440 = class282.field3709.method2579(-1, "scape main");
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 75)
    public final void method3144(int arg0) {
        if (arg0 < -62) {
            field7887++;
            OpenGL.glEndList();
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lmh;I)V", line = 94)
    public class538(class537 arg0, int arg1) {
        this.field7883 = OpenGL.glGenLists(arg1);
    }
}
