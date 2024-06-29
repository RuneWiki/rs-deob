import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class125 extends class210 {

    @OriginalMember(owner = "client!n", name = "t", descriptor = "[[[I")
    public static int[][][] field2538 = new int[4][105][105];

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Ln;")
    public class125 field2539;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Ln;")
    public class125 field2542;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Lud;")
    public static class192 field2540;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lgb;")
    public static class63 field2534;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static final void method837(boolean arg0) {
        field2535++;
        class208.field4003 = 0;
        class91.field1808 = 0;
        if (arg0) {
            method840(-39, 115, -120, 109, 7, 44, 2, 101, -51, -128, 34, -108, -100, 109, 101, -104, -15, -125, -62, 48);
        }
        class182.method1189(-85);
        class39.method256(-19959);
        class137.method915(-1);
        for (int var1 = 0; var1 < class91.field1808; var1++) {
            int var3 = class146.field2903[var1];
            if (class158.field3150 != class107.field2187[var3].field244) {
                class107.field2187[var3].field2592 = null;
                class107.field2187[var3] = null;
            }
        }
        if (class148.field2930 != class185.field3497.field1472) {
            throw new RuntimeException("gnp1 pos:" + class185.field3497.field1472 + " psize:" + class148.field2930);
        }
        for (int var2 = 0; var2 < class96.field1928; var2++) {
            if (class107.field2187[class39.field893[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class96.field1928);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public final void method838(int arg0) {
        field2541++;
        if (this.field2539 == null) {
            return;
        }
        this.field2539.field2542 = this.field2542;
        this.field2542.field2539 = this.field2539;
        this.field2539 = null;
        this.field2542 = null;
        if (arg0 != 8163) {
            method841(-18);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lnh;Ljava/awt/Component;ILnh;)V")
    public static final void method839(class133 arg0, Component arg1, int arg2, class133 arg3) {
        field2536++;
        if (class137.field2743) {
            return;
        }
        class163.method1047();
        byte[] var4 = arg3.method899((byte) 87, class47.field1026, 0);
        class21.field512 = new class167(var4, arg1);
        class129.field2599 = class21.field512.method1086();
        class94.field1900 = class113.method763((byte) 65, class209.field4017, arg0);
        class90.field1762 = class113.method763((byte) 90, class81.field1633, arg0);
        class27.field610 = class113.method763((byte) 115, class208.field3998, arg0);
        class43.field973 = class177.method1169(class107.field2204, arg0, (byte) 113);
        class69.field1433 = class177.method1169(class80.field1628, arg0, (byte) 76);
        class75.field1571 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class75.field1571[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class75.field1571[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class75.field1571[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class75.field1571[var8 + 192] = 16777215;
        }
        class176.field3389 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class176.field3389[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class176.field3389[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class176.field3389[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class176.field3389[var12 + 192] = 16777215;
        }
        class96.field1933 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class96.field1933[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class96.field1933[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class96.field1933[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class96.field1933[var16 + 192] = 16777215;
        }
        class33.field752 = new int[256];
        class94.field1901 = new int[32768];
        class93.field1888 = new int[32768];
        class168.method1113(null, -124);
        class110.field2240 = 0;
        class59.field1230 = false;
        class3.field181 = class3.field172;
        if (class151.field2996 == 0) {
            class175.field3376 = true;
        } else {
            class175.field3376 = false;
        }
        class3.field169 = class3.field172;
        class138.field2773 = new int[32768];
        class187.field3534 = new int[32768];
        if (class175.field3376) {
            class12.method81(-15844, 2);
        } else {
            class99.method692(false, 0, 2, class81.field1653, arg2 + 27925, class73.field1539, 255);
        }
        class47.method291(false, 128);
        class137.field2743 = true;
        class21.field512.method1092(0, 0);
        class129.field2599.method1092(382, 0);
        class94.field1900.method1145(382 - class94.field1900.field3354 / arg2, 18);
        class152.field3019 = new class167(128, 254);
        class179.field3434 = new class167(128, 254);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method840(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class59 var20 = new class59(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class31.field698[var21][arg1][arg2] == null) {
                    class31.field698[var21][arg1][arg2] = new class43(var21, arg1, arg2);
                }
            }
            class31.field698[arg0][arg1][arg2].field960 = var20;
        } else if (arg3 == 1) {
            class59 var22 = new class59(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class31.field698[var23][arg1][arg2] == null) {
                    class31.field698[var23][arg1][arg2] = new class43(var23, arg1, arg2);
                }
            }
            class31.field698[arg0][arg1][arg2].field960 = var22;
        } else {
            class82 var24 = new class82(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class31.field698[var25][arg1][arg2] == null) {
                    class31.field698[var25][arg1][arg2] = new class43(var25, arg1, arg2);
                }
            }
            class31.field698[arg0][arg1][arg2].field961 = var24;
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
    public static void method841(int arg0) {
        field2538 = null;
        field2534 = null;
        field2540 = null;
        if (arg0 > -107) {
            field2538 = null;
        }
    }
}
