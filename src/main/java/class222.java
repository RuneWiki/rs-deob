import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class222 {

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lpca;")
    private class714 field2894 = new class714(256);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lfp;")
    private class323 field2889;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2895 = new String[200];

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2897 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZZI)I", line = 5)
    public static final int method1353(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field2893++;
        class95 var5 = class71.method589(arg2, arg1 - 7149, arg4);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg1 != -2705) {
            field2895 = null;
        }
        for (int var7 = 0; var7 < var5.field1107.length; var7++) {
            if (var5.field1107[var7] >= 0 && class682.field9361.field8546 > var5.field1107[var7]) {
                class551 var8 = class682.field9361.method3424(var5.field1107[var7], false);
                int var9 = var8.method3198(class605.field8497.method154(arg0, (byte) -116).field1025, arg0, 46);
                if (arg3) {
                    var6 += var5.field1113[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 47)
    public final void method1354(byte arg0) {
        class714 var2 = this.field2894;
        synchronized (this.field2894) {
            this.field2894.method4024(0);
            if (arg0 != -19) {
                this.method1357(true, -36);
            }
        }
        field2892++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 62)
    public final void method1355(int arg0) {
        class714 var2 = this.field2894;
        synchronized (this.field2894) {
            this.field2894.method4023((byte) -126);
            if (arg0 != 200) {
                this.method1357(true, -17);
            }
        }
        field2896++;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 75)
    public static void method1356(int arg0) {
        if (arg0 != 22311) {
            method1356(127);
        }
        field2895 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)Lrha;", line = 88)
    public final class219 method1357(boolean arg0, int arg1) {
        field2891++;
        class714 var3 = this.field2894;
        class219 var4;
        synchronized (this.field2894) {
            var4 = (class219) this.field2894.method4022((long) arg1, (byte) -99);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field2889;
        byte[] var6;
        synchronized (this.field2889) {
            var6 = this.field2889.method2100(arg1, (byte) 112, 26);
        }
        if (arg0) {
            this.method1355(64);
        }
        class219 var7 = new class219();
        if (var6 != null) {
            var7.method1347(19898, new class675(var6));
        }
        class714 var8 = this.field2894;
        synchronized (this.field2894) {
            this.field2894.method4018((byte) 124, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 118)
    public final void method1358(int arg0, int arg1) {
        field2890++;
        class714 var3 = this.field2894;
        synchronized (this.field2894) {
            this.field2894.method4016(arg1, (byte) -73);
        }
        if (arg0 >= -54) {
            this.method1355(-67);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lsaa;ILfp;)V", line = 144)
    public class222(class326 arg0, int arg1, class323 arg2) {
        this.field2889 = arg2;
        this.field2889.method2084(26, 0);
    }
}
