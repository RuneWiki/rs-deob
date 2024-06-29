import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class661 {

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public int field9206 = 0;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
    public int field9207 = 127;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "Z")
    public boolean field9209 = true;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
    public int field9210 = -1;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public int field9201 = -1;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
    public int field9211 = 8;

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "Z")
    public boolean field9213 = true;

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
    public int field9215 = 1190717;

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "I")
    public int field9214 = 512;

    @OriginalMember(owner = "client!ega", name = "t", descriptor = "I")
    public int field9219 = 64;

    @OriginalMember(owner = "client!ega", name = "r", descriptor = "Z")
    public boolean field9217 = false;

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "Lvg;")
    public static class49 field9216 = new class49(64);

    @OriginalMember(owner = "client!ega", name = "w", descriptor = "F")
    public static float field9222;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public int field9204;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!ega", name = "u", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!ega", name = "v", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!ega", name = "x", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!ega", name = "s", descriptor = "Lkca;")
    public class74 field9218;

    @OriginalMember(owner = "client!ega", name = "y", descriptor = "[Z")
    public static boolean[] field9224;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILie;)V")
    public final void method3792(int arg0, class6 arg1) {
        field9202++;
        if (arg0 != -1) {
            this.method3792(4, null);
        }
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                return;
            }
            this.method3798(65535, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3793(String arg0, byte arg1) {
        field9220++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 <= 6) {
            field9216 = null;
        }
        for (int var2 = 0; var2 < class51.field691; var2++) {
            if (arg0.equalsIgnoreCase(class299.field4671[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class182.field3064[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
    public static final void method3794(int arg0) {
        field9212++;
        if (class24.field402 == -1 || class207.field3456 == -1) {
            return;
        }
        int var1 = ((class166.field2786 - class226.field3634) * class535.field7836 >> 16) + class226.field3634;
        class535.field7836 += var1;
        if (class535.field7836 >= 65535) {
            class535.field7836 = 65535;
            if (class209.field3497) {
                class67.field860 = false;
            } else {
                class67.field860 = true;
            }
            class209.field3497 = true;
        } else {
            class209.field3497 = false;
            class67.field860 = false;
        }
        float var2 = (float) class535.field7836 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class403.field6221 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class356.field5683[class24.field402][var4][var5] * 3;
            int var22 = class356.field5683[class24.field402][var4 + 1][var5] * 3;
            int var23 = (class356.field5683[class24.field402][var4 + 2][var5] - (class356.field5683[class24.field402][var4 + 3][var5] - class356.field5683[class24.field402][var4 + 2][var5])) * 3;
            int var24 = class356.field5683[class24.field402][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class356.field5683[class24.field402][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class607.field8638 = (int) var3[1] * -1;
        class675.field9521 = (int) var3[0] - class612.field8702 * 512;
        class412.field6318 = (int) var3[2] - (class626.field8855 * 512);
        float[] var6 = new float[3];
        int var7 = class219.field3578 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class356.field5683[class207.field3456][var7][var8] * 3;
            int var15 = class356.field5683[class207.field3456][var7 + 1][var8] * 3;
            int var16 = (class356.field5683[class207.field3456][var7 + 2][var8] + class356.field5683[class207.field3456][var7 + 2][var8] - class356.field5683[class207.field3456][var7 + 3][var8]) * 3;
            int var17 = class356.field5683[class207.field3456][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class356.field5683[class207.field3456][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class13.field197 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class523.field7598 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        if (arg0 != -5922) {
            field9222 = -0.31117857F;
        }
        class617.field8744 = ((class356.field5683[class24.field402][var4 + 2][3] - class356.field5683[class24.field402][var4][3]) * class535.field7836 >> 16) + class356.field5683[class24.field402][var4][3];
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)V")
    public static void method3795(int arg0) {
        field9216 = null;
        if (arg0 != 1) {
            field9223 = 77;
        }
        field9224 = null;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
    public final void method3796(byte arg0) {
        this.field9211 = this.field9204 | this.field9211 << 8;
        field9203++;
        if (arg0 > -115) {
            this.method3798(-6, -25, null);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method3797(byte arg0, int arg1, int arg2, String[] arg3) {
        field9208++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg0 != 57) {
                method3797((byte) -116, -2, 5, null);
            }
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IILie;)V")
    private final void method3798(int arg0, int arg1, class6 arg2) {
        field9200++;
        if (arg1 == 1) {
            this.field9206 = class33.method449(arg2.method86(-35), 16711935);
        } else if (arg1 == 2) {
            this.field9201 = arg2.method70(-9059);
        } else if (arg1 == 3) {
            this.field9201 = arg2.method67(arg0 - 53514);
            if (this.field9201 == 65535) {
                this.field9201 = -1;
            }
        } else if (arg1 == 5) {
            this.field9213 = false;
        } else if (arg1 == 7) {
            this.field9210 = class33.method449(arg2.method86(-65), arg0 ^ 0xFFFF00);
        } else if (arg1 == 8) {
            this.field9218.field940 = this.field9204;
        } else if (arg1 == 9) {
            this.field9214 = arg2.method67(12021) << 2;
        } else if (arg1 == 10) {
            this.field9209 = false;
        } else if (arg1 == 11) {
            this.field9211 = arg2.method70(-9059);
        } else if (arg1 == 12) {
            this.field9217 = true;
        } else if (arg1 == 13) {
            this.field9215 = arg2.method86(arg0 - 65626);
        } else if (arg1 == 14) {
            this.field9219 = arg2.method70(-9059) << 2;
        } else if (arg1 == 16) {
            this.field9207 = arg2.method70(-9059);
        }
        if (arg0 != 65535) {
            this.field9209 = true;
        }
    }
}
