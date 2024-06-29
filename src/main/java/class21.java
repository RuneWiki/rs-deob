import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class21 {

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public int field269 = 128;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public int field271 = 128;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)[Ltca;")
    public static final class141[] method130(int arg0) {
        field262++;
        return arg0 == 128 ? new class141[] { class165.field2368, class98.field1188, class692.field9759, class315.field4228, class484.field6729, class545.field7457, class104.field1230, class632.field8743, class300.field3976, class360.field4775 } : null;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
    public static final void method131(int arg0) {
        if (class546.field7467 != null) {
            class546.field7467.method3087(113);
        }
        field263++;
        if (arg0 != 128) {
            method131(61);
        }
        if (class62.field781 != null) {
            class62.field781.method3087(106);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lcn;B)V")
    public final void method132(class21 arg0, byte arg1) {
        this.field267 = arg0.field267;
        this.field261 = arg0.field261;
        this.field265 = arg0.field265;
        this.field266 = arg0.field266;
        if (arg1 < 24) {
            method131(80);
        }
        this.field269 = arg0.field269;
        field264++;
        this.field271 = arg0.field271;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)Lcn;")
    public final class21 method133(byte arg0) {
        int var2 = 27 / ((arg0 - 32) / 39);
        field268++;
        return new class21(this.field267, this.field269, this.field271, this.field266, this.field261, this.field265);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(I)V")
    public class21(int arg0) {
        this.field267 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIIIII)V")
    private class21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field265 = arg5;
        this.field271 = arg2;
        this.field261 = arg4;
        this.field269 = arg1;
        this.field266 = arg3;
        this.field267 = arg0;
    }
}
