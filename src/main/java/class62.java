import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class62 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[I")
    public static int[] field787;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "[I")
    public static int[] field789;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "[Z")
    public static boolean[] field788;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method335(int arg0, int arg1, int arg2, Class arg3) {
        class13 var4 = class277.field4216[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class466 var5 = var4.field151; var5 != null; var5 = var5.field6853) {
            class141 var6 = var5.field6862;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1895 == arg1 && var6.field1901 == arg2) {
                class153.method944(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)I")
    public static final int method336(int arg0, int arg1, int arg2) {
        field785++;
        if (arg1 != -6) {
            method336(31, -55, -70);
        }
        return arg0 == 4 || arg0 == 5 ? class427.field6294[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)I")
    public static final int method337(byte arg0, int arg1) {
        field786++;
        return arg0 < 65 ? 41 : arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method338(int arg0) {
        field787 = null;
        field789 = null;
        field788 = null;
        if (arg0 != -5) {
            field789 = null;
        }
    }

    static {
        new class151(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field787 = new int[] { 1, 2, 4, 8 };
    }
}
