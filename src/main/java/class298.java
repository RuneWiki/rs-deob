import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class298 extends class477 {

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Lmo;")
    public static class531 field4517;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "C")
    public char field4515;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "J")
    public long field4504;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Lli;")
    public class298 field4513;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Z")
    public boolean field4505;

    static {
        new class309("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field4516 = 0;
        field4517 = new class531(7, 2);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)J", line = 8)
    public final long method1919(int arg0) {
        field4507++;
        if (arg0 != 0) {
            field4516 = -7;
        }
        return this.field4504;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Z", line = 20)
    public final boolean method1920(int arg0) {
        if (arg0 != 4096) {
            this.field4504 = -12L;
        }
        field4514++;
        return this.field4505;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)I", line = 31)
    public final int method1921(boolean arg0) {
        if (arg0) {
            this.method1921(false);
        }
        field4506++;
        return this.field4508;
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V", line = 46)
    public static final void method1922(int arg0) {
        field4511++;
        class454.field6756 = 0;
        class250.field3864 = 0;
        class70.field1408 = 0;
        class135.field2275 = 0;
        if (arg0 != -21237) {
            field4517 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)I", line = 59)
    public final int method1923(boolean arg0) {
        if (arg0) {
            method1925(-5);
        }
        field4510++;
        return this.field4509;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)C", line = 70)
    public final char method1924(int arg0) {
        field4512++;
        if (arg0 != -8478) {
            this.field4505 = false;
        }
        return this.field4515;
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(I)V", line = 81)
    public static void method1925(int arg0) {
        if (arg0 != 7) {
            method1925(66);
        }
        field4517 = null;
    }
}
