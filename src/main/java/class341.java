import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class341 extends class45 {

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    private int field4912;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    private int field4918;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    private int field4920;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    private int field4911;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "[I")
    public static int[] field4913 = new int[32];

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field4919 = 0;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Lqp;")
    public static class466 field4908 = new class466("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4922 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    private int field4907;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    private int field4914;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    private int field4916;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    private int field4921;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[B")
    private byte[] field4917;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V", line = 4)
    public static final void method2025(int arg0, int arg1, int arg2) {
        field4924++;
        class97 var3 = class348.method2064(arg2, 16, 100);
        if (arg0 == 2064) {
            var3.method712((byte) -119);
            var3.field1468 = arg1;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V", line = 18)
    public static final void method2026(int arg0, int arg1, boolean arg2) {
        field4905++;
        class97 var3 = class348.method2064(arg1, 7, 97);
        if (!arg2) {
            var3.method712((byte) -84);
            var3.field1468 = arg0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 32)
    public final void method422(boolean arg0) {
        if (arg0) {
            this.field4914 = 0;
            field4906++;
            this.field4916 = 0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V", line = 44)
    public static final void method2027(int arg0) {
        field4910++;
        if (class401.field5886 == -1 || class59.field721 == -1) {
            return;
        }
        if (arg0 != -31193) {
            field4919 = 31;
        }
        int var1 = class149.field2155 + ((class440.field6505 - class149.field2155) * class147.field2138 >> 16);
        class147.field2138 += var1;
        if (class147.field2138 < 65535) {
            class506.field7453 = false;
            class486.field7095 = false;
        } else {
            class147.field2138 = 65535;
            if (class506.field7453) {
                class486.field7095 = false;
            } else {
                class486.field7095 = true;
            }
            class506.field7453 = true;
        }
        float var2 = (float) class147.field2138 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class216.field3009 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class270.field3722[class401.field5886][var4][var5] * 3;
            int var22 = class270.field3722[class401.field5886][var4 + 1][var5] * 3;
            int var23 = (class270.field3722[class401.field5886][var4 + 2][var5] + class270.field3722[class401.field5886][var4 + 2][var5] - class270.field3722[class401.field5886][var4 + 3][var5]) * 3;
            int var24 = class270.field3722[class401.field5886][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class270.field3722[class401.field5886][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class329.field4493 = (int) var3[0] - (class510.field7566 * 128);
        class62.field766 = (int) var3[1] * -1;
        class373.field5478 = (int) var3[2] - (class14.field204 * 128);
        float[] var6 = new float[3];
        int var7 = class393.field5745 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class270.field3722[class59.field721][var7][var8] * 3;
            int var15 = class270.field3722[class59.field721][var7 + 1][var8] * 3;
            int var16 = (class270.field3722[class59.field721][var7 + 2][var8] + class270.field3722[class59.field721][var7 + 2][var8] - class270.field3722[class59.field721][var7 + 3][var8]) * 3;
            int var17 = class270.field3722[class59.field721][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = var15 + class270.field3722[class59.field721][var7 + 2][var8] - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class107.field1604 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class94.field1399 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class493.field7186 = ((class270.field3722[class401.field5886][var4 + 2][3] - class270.field3722[class401.field5886][var4][3]) * class147.field2138 >> 16) + class270.field3722[class401.field5886][var4][3];
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 146)
    public final void method419(int arg0) {
        field4923++;
        this.field4911 = this.field4920;
        this.field4916 >>= 0x4;
        if (this.field4916 < 0) {
            this.field4916 = 0;
        } else if (this.field4916 > 255) {
            this.field4916 = 255;
        }
        this.method2029((byte) this.field4916, this.field4914++, false);
        this.field4916 = 0;
        if (arg0 != -24137) {
            this.field4918 = 58;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIFFF)V", line = 169)
    public class341(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4912 = (int) (arg6 * 4096.0F);
        this.field4918 = (int) (arg7 * 4096.0F);
        this.field4911 = this.field4920 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V", line = 187)
    public static void method2028(byte arg0) {
        field4913 = null;
        field4908 = null;
        field4922 = null;
        if (arg0 > -42) {
            method2026(-81, 64, false);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIZ)V", line = 206)
    public void method2029(byte arg0, int arg1, boolean arg2) {
        field4909++;
        if (arg2) {
            this.field4912 = -32;
        }
        this.field4917[arg1] = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V", line = 235)
    public final void method417(int arg0, int arg1, int arg2) {
        if (arg0 == arg1) {
            this.field4907 = this.field4912 - (arg2 >= 0 ? arg2 : -arg2);
            this.field4921 = 4096;
            this.field4907 = this.field4907 * this.field4907 >> 12;
            this.field4916 = this.field4907;
        } else {
            this.field4921 = this.field4918 * this.field4907 >> 12;
            if (this.field4921 < 0) {
                this.field4921 = 0;
            } else if (this.field4921 > 4096) {
                this.field4921 = 4096;
            }
            this.field4907 = this.field4912 - (arg2 >= 0 ? arg2 : -arg2);
            this.field4907 = this.field4907 * this.field4907 >> 12;
            this.field4907 = this.field4921 * this.field4907 >> 12;
            this.field4916 += this.field4911 * this.field4907 >> 12;
            this.field4911 = this.field4920 * this.field4911 >> 12;
        }
        field4915++;
    }
}
