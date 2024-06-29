import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class289 extends class339 {

    @OriginalMember(owner = "client!sfa", name = "x", descriptor = "I")
    public int field3809 = 12800;

    @OriginalMember(owner = "client!sfa", name = "C", descriptor = "Z")
    public boolean field3813 = true;

    @OriginalMember(owner = "client!sfa", name = "P", descriptor = "I")
    public int field3824 = 0;

    @OriginalMember(owner = "client!sfa", name = "M", descriptor = "I")
    public int field3822 = -1;

    @OriginalMember(owner = "client!sfa", name = "G", descriptor = "I")
    public int field3817 = 0;

    @OriginalMember(owner = "client!sfa", name = "E", descriptor = "I")
    public int field3815 = -1;

    @OriginalMember(owner = "client!sfa", name = "H", descriptor = "I")
    public int field3818 = 12800;

    @OriginalMember(owner = "client!sfa", name = "I", descriptor = "Ljava/lang/String;")
    public String field3819;

    @OriginalMember(owner = "client!sfa", name = "z", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!sfa", name = "A", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!sfa", name = "D", descriptor = "Ljava/lang/String;")
    public String field3814;

    @OriginalMember(owner = "client!sfa", name = "R", descriptor = "Lwo;")
    public class445 field3826;

    @OriginalMember(owner = "client!sfa", name = "v", descriptor = "Ljd;")
    public static class537 field3807 = new class537(7500);

    @OriginalMember(owner = "client!sfa", name = "L", descriptor = "[I")
    public static int[] field3821 = new int[3];

    @OriginalMember(owner = "client!sfa", name = "J", descriptor = "I")
    public static int field3820 = 0;

    @OriginalMember(owner = "client!sfa", name = "U", descriptor = "[Lcca;")
    public static class250[] field3829 = new class250[4];

    @OriginalMember(owner = "client!sfa", name = "u", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!sfa", name = "w", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!sfa", name = "y", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!sfa", name = "F", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!sfa", name = "O", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!sfa", name = "Q", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!sfa", name = "S", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!sfa", name = "T", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1710(int arg0) {
        field3806++;
        int var1 = class426.field5750;
        int[] var2 = class586.field8104;
        for (int var3 = 0; var3 < var1; var3++) {
            class573 var9 = class513.field7145[var2[var3]];
            if (var9 != null && var9.field3077 > 0) {
                var9.field3077--;
                if (var9.field3077 == 0) {
                    var9.field3062 = null;
                }
            }
        }
        for (int var4 = 0; var4 < field3820; var4++) {
            long var5 = (long) class389.field5220[var4];
            class407 var7 = (class407) class296.field3921.method3057(1, var5);
            if (var7 != null) {
                class351 var8 = var7.field5354;
                if (var8.field3077 > 0) {
                    var8.field3077--;
                    if (var8.field3077 == 0) {
                        var8.field3062 = null;
                    }
                }
            }
        }
        if (arg0 != -1) {
            field3820 = 60;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II[II)Z", line = 67)
    public final boolean method1711(int arg0, int arg1, int[] arg2, int arg3) {
        field3827++;
        if (arg1 != -32400) {
            method1719(null, (byte) -2);
        }
        for (class175 var5 = (class175) this.field3826.method2506(arg1 ^ 0xFFFF8134); var5 != null; var5 = (class175) this.field3826.method2505(arg1 ^ 0x7EFD)) {
            if (var5.method1194((byte) -120, arg0, arg3)) {
                var5.method1197(2, arg2, arg0, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "([Lir;II)V", line = 95)
    public static final void method1712(class27[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class27 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field383;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field383 < (var7 & 0x1) + var6) {
                class27 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1712(arg0, arg1, var4 - 1);
        method1712(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I[IIIB)Z", line = 135)
    public final boolean method1713(int arg0, int[] arg1, int arg2, int arg3, byte arg4) {
        field3816++;
        if (arg4 < 4) {
            field3820 = -5;
        }
        for (class175 var6 = (class175) this.field3826.method2506(68); var6 != null; var6 = (class175) this.field3826.method2505(-120)) {
            if (var6.method1196(arg3, arg0, false, arg2)) {
                var6.method1193(arg1, (byte) -64, arg0, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 343)
    public class289(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3819 = arg2;
        this.field3822 = arg4;
        this.field3811 = arg3;
        this.field3812 = arg0;
        this.field3813 = arg5;
        this.field3814 = arg1;
        this.field3815 = arg6;
        if (this.field3815 == 255) {
            this.field3815 = 0;
        }
        this.field3826 = new class445();
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "([IZII)Z", line = 173)
    public final boolean method1714(int[] arg0, boolean arg1, int arg2, int arg3) {
        field3825++;
        if (!arg1) {
            return false;
        }
        for (class175 var5 = (class175) this.field3826.method2506(68); var5 != null; var5 = (class175) this.field3826.method2505(-114)) {
            if (var5.method1195(arg3, arg2, 0)) {
                var5.method1193(arg0, (byte) -64, arg2, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)V", line = 202)
    public final void method1715(int arg0) {
        this.field3824 = 0;
        this.field3809 = arg0;
        this.field3817 = 0;
        field3808++;
        this.field3818 = 12800;
        for (class175 var2 = (class175) this.field3826.method2506(68); var2 != null; var2 = (class175) this.field3826.method2505(-116)) {
            if (this.field3817 < var2.field2480) {
                this.field3817 = var2.field2480;
            }
            if (this.field3809 > var2.field2486) {
                this.field3809 = var2.field2486;
            }
            if (this.field3818 > var2.field2483) {
                this.field3818 = var2.field2483;
            }
            if (var2.field2478 > this.field3824) {
                this.field3824 = var2.field2478;
            }
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIZ)Z", line = 247)
    public final boolean method1716(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3820 = 115;
        }
        field3823++;
        for (class175 var4 = (class175) this.field3826.method2506(68); var4 != null; var4 = (class175) this.field3826.method2505(-125)) {
            if (var4.method1195(arg0, arg1, 0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 281)
    public static final int method1717(String arg0, int arg1) {
        field3810++;
        return arg1 > -76 ? 0 : class110.method598(arg0, 10, -123, true);
    }

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "(I)V", line = 292)
    public static void method1718(int arg0) {
        int var1 = 60 / ((-arg0 - 81) / 36);
        field3829 = null;
        field3821 = null;
        field3807 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lio;B)Ltba;", line = 303)
    public static final class703 method1719(class157 arg0, byte arg1) {
        field3828++;
        int var2 = arg0.method963(-120);
        class566 var3 = class335.method1971(2)[arg0.method930(255)];
        if (arg1 == 81) {
            class286 var4 = class190.method1252((byte) 112)[arg0.method930(255)];
            int var5 = arg0.method928(2016790224);
            int var6 = arg0.method928(2016790224);
            return new class703(var2, var3, var4, var5, var6);
        } else {
            return null;
        }
    }
}
