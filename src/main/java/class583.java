import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class583 extends class207 {

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "Lqj;")
    public static class535 field7920 = new class535(64);

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "Lqw;")
    public static class84 field7921 = new class84();

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "Lmw;")
    public static class517 field7923 = new class517(11, 0);

    @OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
    public static int field7925 = 0;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!nda", name = "s", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "[Lhh;")
    public static class140[] field7917;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V", line = 4)
    public static void method3281(boolean arg0) {
        if (!arg0) {
            field7917 = null;
            field7923 = null;
            field7921 = null;
            field7920 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(ILrd;)V", line = 17)
    public class583(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V", line = 21)
    public final void method37(int arg0) {
        if (super.field2669 != 1 && super.field2669 != 0) {
            super.field2669 = this.method36(-75);
        }
        ++field7914;
        int var2 = 127 % ((arg0 - -58) / 48);
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(I)I", line = 33)
    public final int method3282(int arg0) {
        if (arg0 != 43) {
            field7921 = null;
        }
        ++field7919;
        return super.field2669;
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lrd;)V", line = 46)
    public class583(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Ldt;I)Ldk;", line = 50)
    public static final class536 method3283(class254 arg0, int arg1) {
        ++field7918;
        int var2 = arg0.method1731((byte) 64);
        class673 var3 = class746.method4088((byte) 112)[arg0.method1731((byte) 64)];
        class705 var4 = class717.method3966((byte) 27)[arg0.method1731((byte) 64)];
        int var5 = arg0.method1695(423951304);
        if (arg1 >= -48) {
            field7917 = null;
        }
        int var6 = arg0.method1695(423951304);
        int var7 = arg0.method1728((byte) 118);
        int var8 = arg0.method1728((byte) 55);
        int var9 = arg0.method1672(-16516);
        int var10 = arg0.method1672(-16516);
        int var11 = arg0.method1672(-16516);
        boolean var12 = arg0.method1731((byte) 64) == 1;
        return new class536(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(IB)I", line = 85)
    public final int method39(int arg0, byte arg1) {
        ++field7915;
        if (arg1 != 69) {
            field7920 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)I", line = 97)
    public final int method36(int arg0) {
        ++field7924;
        if (arg0 > -14) {
            this.method39(16, (byte) 81);
        }
        return 1;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IB)V", line = 108)
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        ++field7916;
        if (arg1 >= -7) {
            this.method36(-74);
        }
    }
}
