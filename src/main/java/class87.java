import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class class87 extends class656 {

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "F")
    public float field1063;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Lwu;")
    public static class376 field1062;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static final void method664(int arg0) {
        field1064++;
        class416.field5750.method2138(-1);
        class597.field7800.method4055((byte) -74);
        class384.field5376.method4055((byte) -74);
        int var1 = -43 / ((arg0 - 4) / 53);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)I")
    public final int method665(int arg0) {
        if (arg0 < 95) {
            this.method673(79);
        }
        field1057++;
        return this.field1059;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)F")
    public final float method666(byte arg0) {
        field1066++;
        if (arg0 != 110) {
            this.method667(-55, 36, -64, 86);
        }
        return this.field1063;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)V")
    public abstract void method667(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)V")
    public static void method668(int arg0) {
        field1062 = null;
        if (arg0 != 26829) {
            field1062 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)I")
    public final int method669(int arg0) {
        if (arg0 != -22096) {
            method668(30);
        }
        field1058++;
        return this.field1061;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)I")
    public final int method670(byte arg0) {
        field1056++;
        return arg0 >= -68 ? 35 : this.field1054;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(Z)I")
    public final int method671(boolean arg0) {
        if (arg0) {
            return -67;
        } else {
            field1065++;
            return this.field1067;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(FI)V")
    public abstract void method672(float arg0, int arg1);

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)I")
    public final int method673(int arg0) {
        if (arg0 > -2) {
            this.method669(121);
        }
        field1060++;
        return this.field1053;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIF)V")
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field1053 = arg3;
        this.field1059 = arg0;
        this.field1061 = arg1;
        this.field1054 = arg2;
        this.field1063 = arg5;
        this.field1067 = arg4;
    }
}
