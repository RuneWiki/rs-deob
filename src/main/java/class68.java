import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class68 {

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    private int field957 = -1;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Z")
    private boolean field949 = true;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    private int field963;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    private int field961;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[Lvp;")
    private class195[] field952;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[Lvp;")
    private class195[] field956;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lvp;")
    private class195 field955;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[I")
    public static int[] field950 = new int[100];

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field946 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Z")
    public static boolean field964 = true;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Lka;")
    public static class408 field965 = new class408(500);

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Lka;")
    public static class408 field967 = new class408(128);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    private int field948;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lwn;")
    private class77 field951;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBIIIIILea;II)V", line = 5)
    public final void method542(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class58 arg7, int arg8, int arg9) {
        int var11 = arg5 + arg4 & 0x3FFF;
        field966++;
        if (arg1 < 59) {
            return;
        }
        if (this.field962 == -1) {
            arg7.method245(arg9, arg3, arg8, arg0, arg6, 0);
        } else {
            class55 var12 = class325.field4404.method1366(this.field962, -11039);
            if (this.field951 == null && class325.field4404.method1360((byte) -106, this.field962)) {
                int[] var13 = var12.field719 ? class325.field4404.method1367(this.field948, this.field948, this.field962, false, 0.7F, -9882) : class325.field4404.method1368(false, 0.7F, this.field948, this.field948, (byte) -74, this.field962);
                this.field951 = arg7.method232(var13, 0, this.field948, this.field948, this.field948);
            }
            if (!var12.field719) {
                arg7.method245(arg9, arg3, arg8, arg0, arg6, 0);
            }
            if (this.field951 != null) {
                int var14 = var12.field719 ? 0 : 1;
                int var15 = arg0 * arg2 / -4096;
                int var16;
                for (var16 = arg0 * var11 / 4096 + (arg8 - arg0) / 2; var16 > arg0; var16 -= arg0) {
                }
                while (var16 < 0) {
                    var16 += arg0;
                }
                while (var15 > arg0) {
                    var15 -= arg0;
                }
                while (var15 < 0) {
                    var15 += arg0;
                }
                for (int var17 = var16 - arg0; var17 < arg8; var17 += arg0) {
                    for (int var18 = var15 - arg0; var18 < arg0; var18 += arg0) {
                        this.field951.method618(arg9 + var17, var18 - -arg3, arg0, arg0, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field958 - 1; var19 >= 0; var19--) {
            this.field956[var19].method1354(arg7, arg9, arg3, arg8, arg0, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 87)
    public final void method543(int arg0) {
        field947++;
        if (this.field952 != null) {
            for (int var2 = 0; var2 < this.field952.length; var2++) {
                this.field952[var2].method1351();
            }
        }
        if (arg0 != -4423) {
            this.field949 = false;
        }
        this.field951 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILea;I)Z", line = 123)
    public final boolean method544(int arg0, class58 arg1, int arg2) {
        field954++;
        if (this.field957 != arg0) {
            this.field957 = arg0;
            int var4 = class177.method1249((byte) -123, arg0);
            if (var4 > arg0) {
                var4 = class268.method1705(arg0, false);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field948 != var4) {
                this.field948 = var4;
                this.field951 = null;
            }
            if (this.field952 != null) {
                this.field958 = 0;
                int[] var5 = new int[this.field952.length];
                for (int var6 = 0; var6 < this.field952.length; var6++) {
                    class195 var7 = this.field952[var6];
                    if (var7.method1356(this.field960, this.field961, this.field963, this.field957)) {
                        var5[this.field958] = var7.field2826;
                        this.field956[this.field958++] = var7;
                    }
                }
                class356.method2138(0, this.field958 - 1, (byte) -108, var5, this.field956);
            }
            this.field949 = true;
        }
        if (arg2 != -10319) {
            method547((byte) 36, (String) null);
        }
        boolean var8 = false;
        if (this.field949) {
            this.field949 = false;
            for (int var9 = this.field958 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field956[var9].method1352(arg1, this.field955);
                var8 |= var10;
                this.field949 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([I[IIII)V", line = 204)
    public static final void method545(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field945++;
        if (arg2 != 2) {
            method548(-67, 123, (String) null);
        }
        if (arg3 >= arg4) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var7;
        int var8 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var8;
        for (int var9 = arg3; var9 < arg4; var9++) {
            if (arg1[var9] < (var7 + (var9 & 0x1))) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                int var11 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6++] = var11;
            }
        }
        arg1[arg4] = arg1[var6];
        arg1[var6] = var7;
        arg0[arg4] = arg0[var6];
        arg0[var6] = var8;
        method545(arg0, arg1, arg2, arg3, var6 - 1);
        method545(arg0, arg1, 2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 258)
    public static void method546(byte arg0) {
        field950 = null;
        field946 = null;
        int var1 = -17 / ((arg0 - 92) / 32);
        field965 = null;
        field967 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 270)
    public static final String method547(byte arg0, String arg1) {
        field959++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class189.method1316(arg1.charAt(var2), -46)) {
            var2++;
        }
        if (arg0 != 46) {
            return null;
        }
        while (var2 < var3 && class189.method1316(arg1.charAt(var3 - 1), -46)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class54.method432(var7, 0)) {
                char var8 = class245.method1594(var7, 6);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/lang/String;)V", line = 325)
    public static final void method548(int arg0, int arg1, String arg2) {
        field953++;
        class26 var3 = class217.method1445(true, arg0, arg1);
        var3.method158(28194);
        var3.field332 = arg2;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I[Lvp;IIII)V", line = 352)
    public class68(int arg0, class195[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field963 = arg5;
        this.field960 = arg3;
        this.field961 = arg4;
        this.field962 = arg0;
        this.field952 = arg1;
        if (arg1 == null) {
            this.field956 = null;
            this.field955 = null;
        } else {
            this.field956 = new class195[arg1.length];
            this.field955 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 384)
    public static final String method549(int arg0, long arg1) {
        field968++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else if (arg0 == -18322) {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class332.field4487[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        } else {
            return null;
        }
    }
}
