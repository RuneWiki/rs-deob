import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class330 implements class16 {

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Ldc;")
    private class5 field5003 = new class5(256);

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Lph;")
    private class459 field5005;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Lph;")
    private class459 field5006;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[Lvm;")
    private class486[] field5007;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field5008 = new String[200];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZIFII)[I", line = 4)
    public final int[] method106(byte arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5) {
        field5010++;
        int var7 = 37 / ((27 - arg0) / 47);
        return this.method2083(arg4, true).method1420(104, arg5, arg1, this, (double) arg3, arg2, this.field5005, this.field5007[arg4].field7159);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)Laj;", line = 15)
    private final class207 method2083(int arg0, boolean arg1) {
        field5001++;
        class189 var3 = this.field5003.method38((long) arg0, (byte) 41);
        if (!arg1) {
            return null;
        } else if (var3 == null) {
            byte[] var4 = this.field5006.method2760((byte) -67, arg0);
            if (var4 == null) {
                return null;
            } else {
                class207 var5 = new class207(new class289(var4));
                this.field5003.method35((long) arg0, -1, var5);
                return var5;
            }
        } else {
            return (class207) var3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 42)
    public static void method2084(int arg0) {
        field5008 = null;
        if (arg0 != 0) {
            method2084(123);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)Z", line = 60)
    public final boolean method108(boolean arg0, int arg1) {
        field4998++;
        if (arg0) {
            return true;
        } else {
            class207 var3 = this.method2083(arg1, true);
            return var3 != null && var3.method1422(this.field5005, this, (byte) -61);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZZFI)[I", line = 74)
    public final int[] method109(int arg0, int arg1, boolean arg2, boolean arg3, float arg4, int arg5) {
        if (arg2) {
            return null;
        } else {
            field4999++;
            return this.method2083(arg1, true).method1424(this.field5007[arg1].field7159, arg0, (double) arg4, this, this.field5005, arg5, -2444);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 85)
    public static final void method2085(byte arg0) {
        if (arg0 < -31) {
            class200.method1384(-1);
            field5002++;
            class42.method255(116);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I", line = 104)
    public static final int method2086(boolean arg0) {
        if (!arg0) {
            field5008 = null;
        }
        field5009++;
        class399 var1 = class182.field2940;
        synchronized (class182.field2940) {
            return class182.field2940.method2468((byte) -45);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lph;Lph;Lph;)V", line = 142)
    public class330(class459 arg0, class459 arg1, class459 arg2) {
        this.field5005 = arg2;
        this.field5006 = arg1;
        class289 var4 = new class289(arg0.method2757(0, 0, (byte) -123));
        int var5 = var4.method1841((byte) 61);
        this.field5007 = new class486[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1858(-3256) == 1) {
                this.field5007[var6] = new class486();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field5007[var7] != null) {
                this.field5007[var7].field7149 = var4.method1858(-3256) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field5007[var8] != null) {
                this.field5007[var8].field7148 = var4.method1858(-3256) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field5007[var9] != null) {
                this.field5007[var9].field7145 = var4.method1858(-3256) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field5007[var10] != null) {
                this.field5007[var10].field7161 = var4.method1858(-3256) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field5007[var11] != null) {
                this.field5007[var11].field7146 = var4.method1816(true);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field5007[var12] != null) {
                this.field5007[var12].field7139 = var4.method1816(true);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field5007[var13] != null) {
                this.field5007[var13].field7141 = var4.method1816(true);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field5007[var14] != null) {
                this.field5007[var14].field7163 = var4.method1816(true);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field5007[var15] != null) {
                this.field5007[var15].field7152 = (short) var4.method1841((byte) 100);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field5007[var16] != null) {
                this.field5007[var16].field7144 = var4.method1816(true);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field5007[var17] != null) {
                this.field5007[var17].field7150 = var4.method1816(true);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field5007[var18] != null) {
                this.field5007[var18].field7143 = var4.method1858(-3256) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field5007[var19] != null) {
                this.field5007[var19].field7159 = var4.method1858(-3256) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field5007[var20] != null) {
                this.field5007[var20].field7147 = var4.method1816(true);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field5007[var21] != null) {
                this.field5007[var21].field7157 = var4.method1858(-3256) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field5007[var22] != null) {
                this.field5007[var22].field7164 = var4.method1858(-3256) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field5007[var23] != null) {
                this.field5007[var23].field7142 = var4.method1858(-3256) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field5007[var24] != null) {
                this.field5007[var24].field7151 = var4.method1858(-3256);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field5007[var25] != null) {
                this.field5007[var25].field7160 = var4.method1815((byte) -99);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(FBIIZI)[F", line = 121)
    public final float[] method107(float arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg1 != 61) {
            this.field5006 = null;
        }
        field5004++;
        return this.method2083(arg2, true).method1425(arg3, arg5, this.field5005, this, 125, this.field5007[arg2].field7159);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lvm;", line = 132)
    public final class486 method105(int arg0, int arg1) {
        if (arg0 > -122) {
            method2084(113);
        }
        field5000++;
        return this.field5007[arg1];
    }
}
