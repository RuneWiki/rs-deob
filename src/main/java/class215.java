import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class215 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lhu;")
    private class76 field2890 = new class76(64);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lr;")
    private class110 field2889;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lhu;")
    public static class76 field2896 = new class76(8);

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "[I")
    public static int[] field2900 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lh;")
    public static class434 field2899 = new class434(66, 10);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)Lrc;")
    public static final class346 method1214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2887++;
        long var7 = (long) arg4 * 97549L ^ (long) arg5 * 67481L ^ (long) arg0 * 475427L ^ (long) arg6 * 986053L ^ (long) arg1 * 32147369L ^ (long) arg3 * 76724863L;
        if (arg2 != 64) {
            return null;
        }
        class346 var9 = (class346) class153.field2152.method493((byte) 19, var7);
        if (var9 == null) {
            class346 var10 = class453.field6147.method2039(arg5, arg4, arg0, arg6, arg1, arg3);
            class153.field2152.method505(var7, var10, 34);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public final void method1215(int arg0) {
        class76 var2 = this.field2890;
        synchronized (this.field2890) {
            this.field2890.method495(-86);
        }
        field2893++;
        if (arg0 != 2) {
            field2896 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
    public final void method1216(byte arg0, int arg1) {
        if (arg0 != -38) {
            method1214(43, -80, 4, -83, 34, -106, -23);
        }
        class76 var3 = this.field2890;
        synchronized (this.field2890) {
            this.field2890.method496(arg1, -113);
        }
        field2894++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method1217(boolean arg0) {
        field2899 = null;
        if (!arg0) {
            field2896 = null;
        }
        field2900 = null;
        field2896 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Z")
    public static final boolean method1218(int arg0, int arg1) {
        field2898++;
        if (~arg0 == arg1 || arg0 == 25 || arg0 == 4 || arg0 == 3 || arg0 == 8) {
            return true;
        } else {
            return arg0 == 10 || arg0 == 1006;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public final void method1219(int arg0) {
        field2895++;
        int var2 = -17 / ((arg0 + 78) / 34);
        class76 var3 = this.field2890;
        synchronized (this.field2890) {
            this.field2890.method502(0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLmr;)V")
    public static final void method1220(byte arg0, class86 arg1) {
        if (arg0 > -92) {
            method1218(22, -73);
        }
        field2888++;
        int var2 = arg1.field1167 - class70.field968;
        int var3 = arg1.field1158 * 128 + arg1.method545(false) * 64;
        int var4 = arg1.field1126 * 128 + (arg1.method545(false) * 64);
        arg1.field6501 += (var3 - arg1.field6501) / var2;
        arg1.field6507 += (var4 - arg1.field6507) / var2;
        arg1.field1196 = 0;
        if (arg1.field1157 == 0) {
            arg1.method542(8192, -112);
        }
        if (arg1.field1157 == 1) {
            arg1.method542(12288, -114);
        }
        if (arg1.field1157 == 2) {
            arg1.method542(0, 114);
        }
        if (arg1.field1157 == 3) {
            arg1.method542(4096, 116);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Lok;")
    public final class153 method1221(int arg0, byte arg1) {
        field2897++;
        class76 var3 = this.field2890;
        class153 var4;
        synchronized (this.field2890) {
            var4 = (class153) this.field2890.method493((byte) 19, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2889.method702((byte) 89, arg0, 16);
        class153 var6 = new class153();
        if (var5 != null) {
            var6.method900(0, new class32(var5));
        }
        class76 var7 = this.field2890;
        synchronized (this.field2890) {
            this.field2890.method505((long) arg0, var6, arg1 - 57);
            if (arg1 != 99) {
                this.field2891 = -56;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ldn;ILr;)V")
    public class215(class329 arg0, int arg1, class110 arg2) {
        this.field2889 = arg2;
        if (this.field2889 == null) {
            this.field2891 = 0;
        } else {
            this.field2891 = this.field2889.method694(16, (byte) 119);
        }
    }
}
