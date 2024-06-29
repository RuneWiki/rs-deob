import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class280 extends class539 {

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public int field3918;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public int field3922;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "[I")
    public static int[] field3919 = new int[8];

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static final void method1698(int arg0) {
        if (class391.field5476 == null || class388.field5445 == null) {
            class388.field5445 = new int[256];
            class391.field5476 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class391.field5476[var1] = (int) (Math.sin(var2) * 4096.0D);
                class388.field5445[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field3920++;
        if (arg0 < 121) {
            field3919 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
    public static void method1699(int arg0) {
        if (arg0 != 641) {
            method1698(-117);
        }
        field3919 = null;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(III)Z")
    public static final boolean method1700(int arg0, int arg1, int arg2) {
        field3921++;
        if (arg0 > -57) {
            method1700(55, -116, -108);
        }
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(II)V")
    public class280(int arg0, int arg1) {
        this.field3918 = arg1;
        this.field3922 = arg0;
    }
}
