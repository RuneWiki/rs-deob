import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class286 {

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljw;B)V")
    public static final void method1687(class426 arg0, byte arg1) {
        field3812++;
        int var2 = -45 % ((arg1 + 24) / 62);
        if (!class683.field9638) {
            arg0.method2360((byte) 66);
            class373.field5520--;
        }
    }
}
