import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class381 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field5343 = 0;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    public static int[] field5344 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5342 = "Loaded wordpack";

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "J")
    public long field5349;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Ls;")
    public class381 field5346;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Ls;")
    public class381 field5348;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
    public static int[] field5351;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 25)
    public final void method2367(int arg0) {
        field5341++;
        if (this.field5348 == null) {
            return;
        }
        this.field5348.field5346 = this.field5346;
        this.field5346.field5348 = this.field5348;
        this.field5346 = null;
        if (arg0 != 5) {
            this.method2367(-25);
        }
        this.field5348 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 45)
    public static final void method2368(byte arg0) {
        if (arg0 <= 34) {
            return;
        }
        for (class264 var1 = (class264) class287.field3848.method897((byte) -26); var1 != null; var1 = (class264) class287.field3848.method897((byte) -84)) {
            class395.method2429((byte) -26, var1);
        }
        field5347++;
        client.method1652();
        client.method1647();
        client.method1639();
        client.method1638();
        client.method1642();
        client.method1640();
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V", line = 73)
    public static void method2369(byte arg0) {
        field5342 = null;
        field5351 = null;
        field5344 = null;
        if (arg0 != 45) {
            field5345 = 5;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Z", line = 85)
    public final boolean method2370(int arg0) {
        if (arg0 == 0) {
            field5350++;
            return this.field5348 != null;
        } else {
            return false;
        }
    }
}
