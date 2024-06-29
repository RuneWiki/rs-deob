import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class237 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "[I")
    public static int[] field3432 = new int[14];

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Z")
    public static boolean field3431 = false;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field3433 = 0;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Z")
    public static boolean field3434 = false;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field3436 = 104;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "Lm;")
    public static class126 field3440;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Ldu;")
    public class237 field3435;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "Ldu;")
    public class237 field3439;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)Z")
    public static final boolean method1538(boolean arg0) {
        if (!arg0) {
            field3436 = -100;
        }
        field3437++;
        try {
            return class138.method1018(120);
        } catch (IOException var4) {
            class177.method1263((byte) 54);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class18.field281 == null ? -1 : class18.field281.method1301((byte) -100)) + "," + (class438.field6388 == null ? -1 : class438.field6388.method1301((byte) -100)) + "," + (class297.field4247 == null ? -1 : class297.field4247.method1301((byte) -100)) + " - " + class133.field2060 + "," + (class95.field1558.field409[0] + class483.field7082) + "," + (class95.field1558.field416[0] + class465.field6840) + " - ";
            for (int var3 = 0; var3 < class133.field2060 && var3 < 50; var3++) {
                var2 = var2 + class387.field5738.field4326[var3] + ",";
            }
            class169.method1200(var2, var5, (byte) -113);
            class196.method1359(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method1539(int arg0) {
        if (arg0 != 14) {
            method1539(114);
        }
        field3440 = null;
        field3432 = null;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
    public final void method1540(int arg0) {
        field3438++;
        if (this.field3435 == null) {
            return;
        }
        this.field3435.field3439 = this.field3439;
        if (arg0 == -1) {
            this.field3439.field3435 = this.field3435;
            this.field3439 = null;
            this.field3435 = null;
        }
    }
}
