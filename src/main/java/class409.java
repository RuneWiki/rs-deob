import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public abstract class class409 extends class287 {

    @OriginalMember(owner = "client!bia", name = "v", descriptor = "I")
    public int field5688;

    @OriginalMember(owner = "client!bia", name = "t", descriptor = "[I")
    public static int[] field5686 = new int[16];

    @OriginalMember(owner = "client!bia", name = "w", descriptor = "I")
    public static int field5689 = 1401;

    @OriginalMember(owner = "client!bia", name = "u", descriptor = "J")
    public static long field5687 = 0L;

    @OriginalMember(owner = "client!bia", name = "z", descriptor = "F")
    public static float field5692 = 0.25F;

    @OriginalMember(owner = "client!bia", name = "x", descriptor = "Lju;")
    public static class102 field5690 = new class102(59, 8);

    @OriginalMember(owner = "client!bia", name = "y", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(BB)V", line = 13)
    public static final void method2494(byte arg0, byte arg1) {
        field5691++;
        if (class634.field9017 == null) {
            class634.field9017 = new byte[4][class514.field7179][class456.field6281];
        }
        if (arg1 >= -122) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class514.field7179; var3++) {
                for (int var4 = 0; var4 < class456.field6281; var4++) {
                    class634.field9017[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "(B)V", line = 55)
    public static void method2497(byte arg0) {
        field5690 = null;
        if (arg0 > -81) {
            method2497((byte) 81);
        }
        field5686 = null;
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(I)V", line = 65)
    public class409(int arg0) {
        this.field5688 = arg0;
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)Z")
    public abstract boolean method2495(byte arg0);

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method2496(int arg0);
}
