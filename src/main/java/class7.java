import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class7 {

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public static int field79 = 2;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
    public int field80;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "Ljava/awt/Font;")
    public static Font field81;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)V")
    public static void method48(boolean arg0) {
        if (!arg0) {
            field81 = null;
        }
    }
}
