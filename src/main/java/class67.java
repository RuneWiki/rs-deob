import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class67 {

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public int field880 = 128;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public int field885 = 128;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lrn;")
    public static class633 field876 = new class633(48, 7);

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field882 = -1;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lwm;")
    public static class30 field884;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method388(int arg0) {
        if (arg0 < 28) {
            field882 = -102;
        }
        field876 = null;
        field884 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZII)I")
    public static final int method389(boolean arg0, int arg1, int arg2) {
        field877++;
        if (arg0) {
            method389(true, 43, 121);
        }
        return arg2 == 1 || arg2 == 3 ? class789.field10804[arg1 & 0x3] : class280.field3633[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method390(int arg0) {
        field874++;
        if (class775.field10583.toLowerCase().indexOf("microsoft") == -1) {
            class774.field10550[59] = 57;
            class774.field10550[47] = 73;
            class774.field10550[91] = 42;
            class774.field10550[44] = 71;
            class774.field10550[45] = 26;
            class774.field10550[46] = 72;
            class774.field10550[61] = 27;
            if (class775.field10563 == null) {
                class774.field10550[222] = 59;
                class774.field10550[192] = 58;
            } else {
                class774.field10550[520] = 59;
                class774.field10550[222] = 58;
                class774.field10550[192] = 28;
            }
            class774.field10550[92] = 74;
            class774.field10550[93] = 43;
        } else {
            class774.field10550[223] = 28;
            class774.field10550[220] = 74;
            class774.field10550[190] = 72;
            class774.field10550[222] = 59;
            class774.field10550[191] = 73;
            class774.field10550[192] = 58;
            class774.field10550[219] = 42;
            class774.field10550[221] = 43;
            class774.field10550[186] = 57;
            class774.field10550[187] = 27;
            class774.field10550[188] = 71;
            class774.field10550[189] = 26;
        }
        if (arg0 != -21079) {
            field884 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Ldc;")
    public final class67 method391(int arg0) {
        field875++;
        if (arg0 != -300) {
            this.field881 = -117;
        }
        return new class67(this.field881, this.field880, this.field885, this.field878, this.field883, this.field879);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldc;I)V")
    public final void method392(class67 arg0, int arg1) {
        this.field885 = arg0.field885;
        this.field881 = arg0.field881;
        this.field883 = arg0.field883;
        this.field879 = arg0.field879;
        this.field878 = arg0.field878;
        this.field880 = arg0.field880;
        field873++;
        if (arg1 != 520) {
            method389(false, 1, 104);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
    public class67(int arg0) {
        this.field881 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIII)V")
    private class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field880 = arg1;
        this.field879 = arg5;
        this.field885 = arg2;
        this.field883 = arg4;
        this.field881 = arg0;
        this.field878 = arg3;
    }
}
