import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class491 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "J")
    private long field6971;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    private int field6978;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6979 = null;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "F")
    public static float field6974;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Lqda;")
    public static class112 field6977;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lcb;")
    public static class544 field6972;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I", line = 4)
    private final int method2869(int arg0, int arg1) {
        if (arg1 > -68) {
            field6977 = null;
        }
        field6976++;
        return (int) (this.field6971 >> class652.field9197 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLgo;)V", line = 17)
    private final void method2870(byte arg0, class652 arg1) {
        field6975++;
        this.field6971 |= (arg1.field9190 << this.field6978++ * class652.field9197);
        int var3 = -60 % ((arg0 - 76) / 44);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 28)
    public static void method2871(int arg0) {
        if (arg0 != -20962) {
            field6972 = null;
        }
        field6979 = null;
        field6977 = null;
        field6972 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I", line = 44)
    public final int method2872(boolean arg0) {
        field6973++;
        if (arg0) {
            this.field6971 = -28L;
        }
        return this.field6978;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Lgo;", line = 63)
    public final class652 method2873(int arg0, int arg1) {
        field6970++;
        int var3 = -105 % ((30 - arg1) / 43);
        return class652.method3737(this.method2869(arg0, -101), 70);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lgo;)V", line = 73)
    public class491(class652 arg0) {
        this.field6971 = arg0.field9190;
        this.field6978 = 1;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "([Lgo;)V", line = 81)
    public class491(class652[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2870((byte) 120, arg0[var2]);
        }
    }
}
