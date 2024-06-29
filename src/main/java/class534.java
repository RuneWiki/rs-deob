import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class534 {

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "[Lwn;")
    public class617[] field7468 = null;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "Luda;")
    public class383 field7469 = null;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "[Lwn;")
    private class617[] field7473 = null;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "Z")
    public boolean field7467;

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "[I")
    public static int[] field7471 = new int[1000];

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "[F")
    public static float[] field7472 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "Ldea;")
    public static class205 field7466 = new class205(8);

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "Lje;")
    public static class339 field7475;

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "Lin;")
    public static class76 field7474;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
    public static void method3066(int arg0) {
        if (arg0 >= -87) {
            field7472 = null;
        }
        field7466 = null;
        field7471 = null;
        field7472 = null;
        field7475 = null;
        field7474 = null;
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)Z")
    public final boolean method3067(int arg0) {
        field7476++;
        if (arg0 <= 58) {
            field7471 = null;
        }
        if (this.field7467) {
            return this.field7469 != null;
        } else {
            return this.field7468 != null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "([[BBLgn;)V")
    public static final void method3068(byte[][] arg0, byte arg1, class600 arg2) {
        field7464++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field1142; var4++) {
            class184.method1146(-44);
            for (int var5 = 0; var5 < (class32.field513 >> 3); var5++) {
                for (int var6 = 0; var6 < class611.field8786 >> 3; var6++) {
                    int var7 = class104.field1573[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field1124 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFD30B) >> 14;
                            int var11 = (var7 & 0x3FF8) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class183.field2585.length; var13++) {
                                if (class183.field2585[var13] == var12 && arg0[var13] != null) {
                                    class11 var14 = new class11(arg0[var13]);
                                    arg2.method556(var4, var5 * 8, (byte) 101, var11, var8, var14, var9, class428.field6075, var6 * 8, var10);
                                    arg2.method3533(var14, var5 * 8, var4, var10, var6 * 8, -13196, var9, var3[0] == -1 ? var3 : null, var8, class69.field1165, var11);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 == -50 && var3[0] != -1) {
            class538.field7520 = class303.field4141.method2357(class358.field4823, var3[3], var3[1], var3[2], arg1 ^ 0xFFFFFFCA, var3[0]);
            class615.field8827 = var3[4];
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lmc;BII)V")
    public static final void method3069(class114 arg0, byte arg1, int arg2, int arg3) {
        field7470++;
        int var4 = -39 % ((75 - arg1) / 46);
        class310 var5 = arg0.method810(false, class69.field1165);
        if (var5 == null) {
            return;
        }
        class69.field1165.method1308(arg2, arg3, arg0.field1853 + arg2, arg0.field1769 + arg3);
        if (class634.field9270 >= 3) {
            class69.field1165.method1347(-16777216, var5, arg2, arg3);
        } else {
            class22.field324.method501((float) arg0.field1853 / 2.0F + (float) arg2, (float) arg0.field1769 / 2.0F + (float) arg3, 4096, (int) (-class1.field13) & 0x3FFF << 2, var5, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lwr;)V")
    public class534(class388 arg0) {
        this.field7467 = arg0.field5397;
        if (this.field7467 && !arg0.method1636((byte) 125, class75.field1196, class608.field8759)) {
            this.field7467 = false;
        }
        if (this.field7467 || arg0.method1632(0, class75.field1196, class608.field8759)) {
            class508.method2938(-28654);
            if (this.field7467) {
                byte[] var6 = class502.method2908(class512.field7214, 0, false);
                this.field7469 = arg0.method1634(128, 128, 84, class75.field1196, 16, var6);
                byte[] var7 = class502.method2908(class148.field2278, 0, false);
                arg0.method1634(128, 128, -60, class75.field1196, 16, var7);
            } else {
                this.field7468 = new class617[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class169.method1080(32768, var2 * 128 * 128 * 2, 255, class512.field7214);
                    this.field7468[var2] = arg0.method2327(-20920, 128, class75.field1196, true, 128, var5);
                }
                this.field7473 = new class617[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class169.method1080(32768, var3 * 128 * 256, 255, class148.field2278);
                    this.field7473[var3] = arg0.method2327(-20920, 128, class75.field1196, true, 128, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIIZII)I")
    public static final int method3070(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            field7472 = null;
        }
        if ((arg1 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
        }
        field7465++;
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return 1 + 7 - arg5 - arg6;
        } else if (var8 == 2) {
            return 8 - arg3 - arg0;
        } else {
            return arg6;
        }
    }
}
