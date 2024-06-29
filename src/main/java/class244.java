import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class244 extends class166 {

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Ljava/lang/String;")
    public String field3970;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Loh;")
    public static class281 field3966 = new class281(16);

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Loh;")
    public static class281 field3971 = new class281(32);

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[I")
    public static int[] field3972 = new int[2048];

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Z")
    public static boolean field3975 = false;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Luc;")
    public static class39 field3974 = new class39(16);

    @OriginalMember(owner = "client!d", name = "C", descriptor = "F")
    public static float field3977;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "[I")
    public static int[] field3973;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "[Led;")
    public static class186[] field3967;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
    public static void method1684(byte arg0) {
        if (arg0 < 30) {
            return;
        }
        field3973 = null;
        field3974 = null;
        field3967 = null;
        field3966 = null;
        field3972 = null;
        field3971 = null;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public static final void method1685(int arg0) {
        field3968++;
        int var1 = 82 % ((-arg0 - 48) / 35);
        int var2 = class271.method1830(10272);
        if (var2 == 0) {
            class30.field441 = null;
            class86.method614(-120, 0);
        } else if (var2 == 1) {
            class8.method71((byte) 0, (byte) -79);
            class86.method614(-84, 512);
            class75.method543(-6);
        } else {
            class8.method71((byte) (class121.field1938 - 4 & 0xFF), (byte) -105);
            class86.method614(-95, 2);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class244() {
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class244(String arg0) {
        this.field3970 = arg0;
    }
}
