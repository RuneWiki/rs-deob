import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class407 {

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    public int field5597 = 43594;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    public int field5599 = 443;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "Z")
    private boolean field5600 = true;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "Z")
    private boolean field5603 = false;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "Lin;")
    public static class380 field5604 = new class380(20, 2);

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "[I")
    public static int[] field5605 = new int[6];

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "Lvt;")
    public static class768 field5606 = new class768();

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    public int field5598;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "Ljava/lang/String;")
    public String field5595;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "[Lnfa;")
    public static class745[] field5602;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 5)
    public final void method2406(int arg0) {
        if (arg0 != 20) {
            this.method2408(null, 121);
        }
        if (!this.field5600) {
            this.field5600 = true;
            this.field5603 = true;
        } else if (this.field5603) {
            this.field5603 = false;
        } else {
            this.field5600 = false;
        }
        field5594++;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V", line = 40)
    public static void method2407(byte arg0) {
        field5606 = null;
        if (arg0 >= -76) {
            field5604 = null;
        }
        field5605 = null;
        field5602 = null;
        field5604 = null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ldda;I)Z", line = 53)
    public final boolean method2408(class407 arg0, int arg1) {
        field5596++;
        if (arg1 != 6) {
            return true;
        } else if (arg0 == null) {
            return false;
        } else {
            return this.field5598 == arg0.field5598 && this.field5595.equals(arg0.field5595);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lcea;B)Lot;", line = 79)
    public final class746 method2409(class111 arg0, byte arg1) {
        int var3 = 100 % ((-arg1 - 15) / 35);
        field5601++;
        return arg0.method917(this.field5595, (byte) -49, this.field5600 ? this.field5599 : this.field5597, this.field5603);
    }
}
