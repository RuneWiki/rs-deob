import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class51 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V", line = 13)
    public static final void method557(int arg0, int arg1, int arg2, int arg3) {
        field843++;
        if (arg3 >= -90) {
            method557(53, 10, -115, -92);
        }
        String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        class634.method3626(true, false, 84, var4);
    }
}
