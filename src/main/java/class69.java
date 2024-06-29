import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class69 {

    @OriginalMember(owner = "client!sja", name = "e", descriptor = "Ljn;")
    public static class134 field764 = new class134(103, -1);

    @OriginalMember(owner = "client!sja", name = "g", descriptor = "D")
    public static double field766;

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!sja", name = "d", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!sja", name = "f", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "J")
    public long field762;

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "Lsja;")
    public class69 field760;

    @OriginalMember(owner = "client!sja", name = "h", descriptor = "Lsja;")
    public class69 field767;

    @OriginalMember(owner = "client!sja", name = "i", descriptor = "[Lho;")
    public static class318[] field768;

    @OriginalMember(owner = "client!sja", name = "d", descriptor = "(I)I")
    public static final int method526(int arg0) {
        if (arg0 == -1) {
            field761++;
            return 16;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!sja", name = "e", descriptor = "(I)V")
    public final void method527(int arg0) {
        field765++;
        if (arg0 == -11229 && this.field760 != null) {
            this.field760.field767 = this.field767;
            this.field767.field760 = this.field760;
            this.field767 = null;
            this.field760 = null;
        }
    }

    @OriginalMember(owner = "client!sja", name = "f", descriptor = "(I)V")
    public static void method528(int arg0) {
        field768 = null;
        field764 = null;
        if (arg0 != 23959) {
            field768 = null;
        }
    }

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "(B)Z")
    public final boolean method529(byte arg0) {
        field763++;
        if (this.field760 == null) {
            return false;
        } else if (arg0 == 46) {
            return true;
        } else {
            return true;
        }
    }
}
