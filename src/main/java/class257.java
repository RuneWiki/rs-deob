import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class257 {

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
    public static int field3477 = 0;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "Lpm;")
    public class250 field3478;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1651(int arg0) {
        field3476++;
        if (arg0 != 0) {
            field3477 = 80;
        }
        if (class438.field5764 != null && class558.field7100 != null) {
            return;
        }
        class558.field7100 = new int[256];
        class438.field5764 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class438.field5764[var1] = (int) (Math.sin(var2) * 4096.0D);
            class558.field7100[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }
}
