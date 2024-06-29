import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class577 implements class702 {

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Ltea;")
    private class708 field7859 = new class708(256);

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Lpe;")
    private class615 field7857;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lpe;")
    private class615 field7852;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    private int field7861;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "[Lkc;")
    private class59[] field7850;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FIIZII)[F")
    public final float[] method3157(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field7849++;
        if (arg5 > -19) {
            method3161(6, -57, 80, null, null);
        }
        return this.method3163(arg2, (byte) 38).method1968(this, arg1, this.field7850[arg2].field793, this.field7852, (byte) -127, arg4);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZFIIB)[I")
    public final int[] method3158(int arg0, boolean arg1, float arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != -56) {
            this.field7861 = -3;
        }
        field7856++;
        return this.method3163(arg4, (byte) 94).method1971(this, (double) arg2, arg3, this.field7852, arg0, 1279038120, arg1, this.field7850[arg4].field793);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)I")
    public final int method3159(byte arg0) {
        field7854++;
        return arg0 >= -119 ? -88 : this.field7861;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIIIFI)[I")
    public final int[] method3160(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5) {
        field7858++;
        return arg5 < 30 ? null : this.method3163(arg2, (byte) -81).method1972(-122, this.field7850[arg2].field793, this, arg3, arg1, this.field7852, (double) arg4);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIILfi;Lfi;)V")
    public static final void method3161(int arg0, int arg1, int arg2, class237 arg3, class237 arg4) {
        class530 var5 = class331.method1910(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6895 = arg3;
            var5.field6893 = arg4;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)Lkc;")
    public final class59 method3162(byte arg0, int arg1) {
        if (arg0 != -104) {
            this.field7850 = null;
        }
        field7851++;
        return this.field7850[arg1];
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)Lfga;")
    private final class340 method3163(int arg0, byte arg1) {
        int var3 = -55 / ((-arg1 - 11) / 46);
        field7855++;
        class28 var4 = this.field7859.method3880((long) arg0, -77);
        if (var4 != null) {
            return (class340) var4;
        }
        byte[] var5 = this.field7857.method3365(arg0, (byte) 87);
        if (var5 == null) {
            return null;
        } else {
            class340 var6 = new class340(new class418(var5));
            this.field7859.method3881((long) arg0, (byte) 126, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(BI)Z")
    public final boolean method3164(byte arg0, int arg1) {
        if (arg0 == -31) {
            field7860++;
            class340 var3 = this.method3163(arg1, (byte) -98);
            return var3 != null && var3.method1969(22833, this, this.field7852);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLjava/awt/Canvas;)Lfr;")
    public static final class298 method3165(boolean arg0, Canvas arg1) {
        field7853++;
        try {
            if (arg0) {
                method3165(false, null);
            }
            Class var2 = Class.forName("vea");
            class298 var3 = (class298) var2.getDeclaredConstructor().newInstance();
            var3.method1765(arg1, -58);
            return var3;
        } catch (Throwable var5) {
            class544 var4 = new class544();
            var4.method1765(arg1, -113);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lpe;Lpe;Lpe;)V")
    public class577(class615 arg0, class615 arg1, class615 arg2) {
        this.field7857 = arg1;
        this.field7852 = arg2;
        class418 var4 = new class418(arg0.method3346(-1, 0, 0));
        this.field7861 = var4.method2393(-30727);
        this.field7850 = new class59[this.field7861];
        for (int var5 = 0; var5 < this.field7861; var5++) {
            if (var4.method2396(-111) == 1) {
                this.field7850[var5] = new class59();
            }
        }
        for (int var6 = 0; var6 < this.field7861; var6++) {
            if (this.field7850[var6] != null) {
                this.field7850[var6].field799 = var4.method2396(48) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field7861; var7++) {
            if (this.field7850[var7] != null) {
                this.field7850[var7].field800 = var4.method2396(111) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field7861; var8++) {
            if (this.field7850[var8] != null) {
                this.field7850[var8].field794 = var4.method2396(70) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field7861; var9++) {
            if (this.field7850[var9] != null) {
                this.field7850[var9].field810 = var4.method2396(-107) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field7861; var10++) {
            if (this.field7850[var10] != null) {
                this.field7850[var10].field811 = var4.method2387((byte) -12);
            }
        }
        for (int var11 = 0; var11 < this.field7861; var11++) {
            if (this.field7850[var11] != null) {
                this.field7850[var11].field798 = var4.method2387((byte) 117);
            }
        }
        for (int var12 = 0; var12 < this.field7861; var12++) {
            if (this.field7850[var12] != null) {
                this.field7850[var12].field805 = var4.method2387((byte) 114);
            }
        }
        for (int var13 = 0; var13 < this.field7861; var13++) {
            if (this.field7850[var13] != null) {
                this.field7850[var13].field813 = var4.method2387((byte) -15);
            }
        }
        for (int var14 = 0; var14 < this.field7861; var14++) {
            if (this.field7850[var14] != null) {
                this.field7850[var14].field804 = (short) var4.method2393(-30727);
            }
        }
        for (int var15 = 0; var15 < this.field7861; var15++) {
            if (this.field7850[var15] != null) {
                this.field7850[var15].field807 = var4.method2387((byte) -37);
            }
        }
        for (int var16 = 0; var16 < this.field7861; var16++) {
            if (this.field7850[var16] != null) {
                this.field7850[var16].field806 = var4.method2387((byte) 124);
            }
        }
        for (int var17 = 0; var17 < this.field7861; var17++) {
            if (this.field7850[var17] != null) {
                this.field7850[var17].field803 = var4.method2396(-125) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field7861; var18++) {
            if (this.field7850[var18] != null) {
                this.field7850[var18].field793 = var4.method2396(-119) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field7861; var19++) {
            if (this.field7850[var19] != null) {
                this.field7850[var19].field801 = var4.method2387((byte) 112);
            }
        }
        for (int var20 = 0; var20 < this.field7861; var20++) {
            if (this.field7850[var20] != null) {
                this.field7850[var20].field809 = var4.method2396(-104) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field7861; var21++) {
            if (this.field7850[var21] != null) {
                this.field7850[var21].field808 = var4.method2396(-118) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field7861; var22++) {
            if (this.field7850[var22] != null) {
                this.field7850[var22].field795 = var4.method2396(-121) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field7861; var23++) {
            if (this.field7850[var23] != null) {
                this.field7850[var23].field797 = var4.method2396(-123);
            }
        }
        for (int var24 = 0; var24 < this.field7861; var24++) {
            if (this.field7850[var24] != null) {
                this.field7850[var24].field792 = var4.method2355(58);
            }
        }
        for (int var25 = 0; var25 < this.field7861; var25++) {
            if (this.field7850[var25] != null) {
                this.field7850[var25].field812 = var4.method2396(43) == 1;
            }
        }
    }
}
