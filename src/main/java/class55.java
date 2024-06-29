import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class55 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Lnj;")
    public static class487 field680 = new class487("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lqu;")
    public static class364 field682 = new class364(44, 3);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)Z", line = 8)
    public static final boolean method360(int arg0, byte arg1) {
        if (arg1 < 79) {
            return true;
        } else {
            field683++;
            return arg0 >= 12 && arg0 <= 17;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 33)
    public static void method361(int arg0) {
        field680 = null;
        if (arg0 != 95) {
            method360(-56, (byte) 111);
        }
        field682 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILno;)V", line = 47)
    public static final void method362(int arg0, int arg1, class483 arg2) {
        class169.field2291 = false;
        field681++;
        class202.field3016 = 0;
        class535.method3142(arg2, arg0);
        class121.method735(arg0 - 1662988464, arg2);
        if (class169.field2291) {
            System.out.println("---endgpp---");
        }
        if (arg2.field6221 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field6221 + " psize:" + arg1);
        }
    }
}
