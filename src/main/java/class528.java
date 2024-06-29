import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class528 {

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    public int field7164 = 128;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public int field7163 = 128;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public int field7153;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public int field7157;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public int field7158;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    public int field7166;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field7160 = 0;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "Lgo;")
    public static class581 field7155 = new class581(13, 0, 1, 0);

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public int field7152;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public int field7154;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
    public int field7161;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public int field7162;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
    public int field7165;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public static void method3010(byte arg0) {
        field7155 = null;
        if (arg0 != 120) {
            field7151 = -119;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
    public static final void method3011(int arg0, int arg1) {
        class663 var2 = class120.field1658;
        synchronized (class120.field1658) {
            class120.field1658.method3754(arg1, true);
        }
        field7159++;
        if (arg0 != 22605) {
            field7160 = -11;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)Lcv;")
    public final class528 method3012(byte arg0) {
        field7150++;
        int var2 = 126 % ((65 - arg0) / 44);
        return new class528(this.field7153, this.field7163, this.field7164, this.field7166, this.field7157, this.field7158);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lcv;I)V")
    public final void method3013(class528 arg0, int arg1) {
        field7156++;
        this.field7153 = arg0.field7153;
        this.field7163 = arg0.field7163;
        this.field7157 = arg0.field7157;
        if (arg1 != 29247) {
            this.field7158 = 76;
        }
        this.field7164 = arg0.field7164;
        this.field7166 = arg0.field7166;
        this.field7158 = arg0.field7158;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I)V")
    public class528(int arg0) {
        this.field7153 = arg0;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(IIIIII)V")
    private class528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7164 = arg2;
        this.field7157 = arg4;
        this.field7153 = arg0;
        this.field7163 = arg1;
        this.field7158 = arg5;
        this.field7166 = arg3;
    }
}
