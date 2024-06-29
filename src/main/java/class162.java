import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class162 {

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lil;")
    public static class4 field2579 = new class4(16);

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field2580 = 2;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lkm;IIIZ)V", line = 11)
    public void method185(class162 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2577++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)Lkm;", line = 19)
    public class162 method156(int arg0, int arg1, int arg2) {
        field2578++;
        return this;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 28)
    public static void method1143(int arg0) {
        field2579 = null;
        if (arg0 >= -17) {
            method1143(48);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "()Z", line = 40)
    public boolean method175() {
        field2581++;
        return false;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()I")
    public abstract int method192();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIIIJILdh;)V")
    public abstract void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class145 arg10);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIII)V")
    public abstract void method313(int arg0, int arg1, int arg2, int arg3, int arg4);
}
