import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class70 extends class363 implements class529 {

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "Lhr;")
    public class363 field895;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "[I")
    public static int[] field904 = new int[1000];

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public final void method39(int arg0) {
        if (arg0 > -18) {
            this.method31(null, 35);
        }
        field907++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLya;)V")
    public final void method26(boolean arg0, class38 arg1) {
        field892++;
        if (!arg0) {
            this.method24(null, -24, -15);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)I")
    public final int method27(int arg0) {
        int var2 = 59 % ((arg0 - 39) / 41);
        field906++;
        return 0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)I")
    public final int method22(byte arg0) {
        if (arg0 != -70) {
            this.method29(-118);
        }
        field899++;
        return 0;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
    public static void method665(int arg0) {
        if (arg0 < 89) {
            method665(-57);
        }
        field904 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Lya;I)V")
    public final void method35(class38 arg0, int arg1) {
        if (arg1 >= 53) {
            field902++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIILhr;)V")
    public class70(int arg0, int arg1, int arg2, class363 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field895 = arg3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lya;I)V")
    public final void method31(class38 arg0, int arg1) {
        field893++;
        if (arg1 != -12694) {
            method665(-72);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)Z")
    public final boolean method30(int arg0) {
        if (arg0 == 10869) {
            field894++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)I")
    public final int method28(boolean arg0) {
        field905++;
        return arg0 ? 0 : -110;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)Z")
    public final boolean method32(byte arg0) {
        field903++;
        if (arg0 < 104) {
            this.method29(74);
        }
        return false;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public final void method29(int arg0) {
        field900++;
        int var2 = 23 % ((arg0 - 57) / 44);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(Lya;I)Lfk;")
    public final class462 method38(class38 arg0, int arg1) {
        field908++;
        return arg1 > -87 ? null : null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lah;")
    public static final class261 method666(int arg0, int arg1) {
        if (arg0 != 0) {
            method666(24, 64);
        }
        field898++;
        class261 var2 = (class261) class97.field1301.method1115((long) arg1, (byte) 58);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class224.field3286.method2363(arg1, 1, 117);
        class261 var4 = new class261();
        var4.field3846 = arg1;
        if (var3 != null) {
            var4.method1673((byte) 93, new class65(var3));
        }
        var4.method1675(true);
        if (var4.field3836 == 2 && class111.field1572.method875((long) arg1, 124) == null) {
            class111.field1572.method878((long) arg1, -2301, new class389(class353.field4935));
            class371.field5521[class353.field4935++] = var4;
        }
        class97.field1301.method1107(1, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILfi;BZLya;I)V")
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        if (arg3 != -99) {
            this.method32((byte) 29);
        }
        field901++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lya;II)Lt;")
    public final class471 method24(class38 arg0, int arg1, int arg2) {
        int var4 = 32 % ((54 - arg2) / 56);
        field897++;
        return null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILya;I)Z")
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        if (arg1 != 0) {
            this.field895 = null;
        }
        field896++;
        return false;
    }
}
