import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class36 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "[[[I")
    public static int[][][] field516 = new int[2][][];

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static final void method271(int arg0) {
        for (int var1 = arg0; var1 < class70.field1119; var1++) {
            int var2 = class284.field4506[var1];
            class45 var3 = class255.field4082[var2];
            if (var3 != null) {
                class6.method63(arg0 + 92, var3.field645.field977, var3);
            }
        }
        field517++;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public static void method272(int arg0) {
        field516 = null;
        if (arg0 != 27472) {
            method271(94);
        }
    }
}
