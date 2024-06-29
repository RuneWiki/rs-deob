import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class127 {

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "J")
    public long field1760;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "Ljava/lang/String;")
    public String field1763;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "Ljava/lang/String;")
    public String field1764;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "Liea;")
    public static class439 field1765;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(FFIIF)F")
    public static final float method900(float arg0, float arg1, int arg2, int arg3, float arg4) {
        field1762++;
        if (arg2 == 20504) {
            float[] var5 = class222.field3200[arg3];
            return var5[2] * arg4 + var5[1] * arg0 + var5[0] * arg1;
        } else {
            return -0.83597064F;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V")
    public static void method901(boolean arg0) {
        field1765 = null;
        if (arg0) {
            method901(true);
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class127(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field1766 = arg2;
        this.field1760 = arg4;
        this.field1761 = arg0;
        this.field1763 = arg1;
        this.field1764 = arg3;
    }
}
