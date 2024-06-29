import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class49 {

    @OriginalMember(owner = "client!a", name = "i", descriptor = "[B")
    public static byte[] field790 = new byte[520];

    @OriginalMember(owner = "client!a", name = "e", descriptor = "[Lre;")
    public static class228[] field786 = new class228[29];

    @OriginalMember(owner = "client!a", name = "h", descriptor = "[Z")
    public static boolean[] field789 = new boolean[5];

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field791 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Ljava/lang/String;")
    public String field788;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method326(int arg0) {
        if (arg0 != 17852) {
            field791 = -80;
        }
        field790 = null;
        field786 = null;
        field789 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
    public static final void method327(int arg0, byte arg1) {
        field787++;
        class75 var2 = (class75) class166.field2549.method1666((long) arg0, (byte) 77);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field1214.length; var3++) {
            var2.field1214[var3] = -1;
            var2.field1218[var3] = 0;
        }
        if (arg1 < 43) {
            field782 = 72;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(DI)V")
    public static final void method328(double arg0, int arg1) {
        if (class52.field829 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class151.field2192[var3] = var4 <= 255 ? var4 : 255;
            }
            class52.field829 = arg0;
        }
        field784++;
        if (arg1 < 88) {
            field789 = null;
        }
    }
}
