import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class331 extends class400 {

    @OriginalMember(owner = "client!hfa", name = "F", descriptor = "I")
    private int field4099 = -1;

    @OriginalMember(owner = "client!hfa", name = "G", descriptor = "I")
    private int field4100 = -1;

    @OriginalMember(owner = "client!hfa", name = "H", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!hfa", name = "E", descriptor = "I")
    public static int field4098 = 0;

    @OriginalMember(owner = "client!hfa", name = "x", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!hfa", name = "y", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!hfa", name = "C", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!hfa", name = "D", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!hfa", name = "I", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!hfa", name = "B", descriptor = "Ltf;")
    public static class312 field4095;

    @OriginalMember(owner = "client!hfa", name = "A", descriptor = "[Leda;")
    public static class110[] field4094;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "()V")
    public static final void method1965() {
        byte var0 = 10;
        byte var1 = 30;
        if (class78.field1055 != 0 && class301.field3607 != null) {
            class6.field80.method566(class3.field44);
            for (int var2 = 0; var2 < class688.field9379.length; ++var2) {
                class6.field80.method594(-256, class688.field9379[var2] + class548.field7643[var2], class3.field44[1], class3.field44[3] - class3.field44[1], 0);
            }
            for (int var3 = 0; var3 < class222.field2583; ++var3) {
                class557 var11 = class379.field4807[var3];
                class6.field80.method570(var11.field7744[0], var11.field7746[0], var11.field7741[0], class639.field8749);
                class6.field80.method570(var11.field7744[1], var11.field7746[1], var11.field7741[1], class174.field2091);
                class6.field80.method570(var11.field7744[2], var11.field7746[2], var11.field7741[2], class502.field7099);
                class6.field80.method570(var11.field7744[3], var11.field7746[3], var11.field7741[3], class192.field2296);
                if (class639.field8749[2] != -1 && class174.field2091[2] != -1 && class502.field7099[2] != -1 && class192.field2296[2] != -1) {
                    int var12 = -65536;
                    if (var11.field7742 == 4) {
                        var12 = -16776961;
                    }
                    class6.field80.method631(class639.field8749[1], class174.field2091[0], -9665, class174.field2091[1], class639.field8749[0], var12);
                    class6.field80.method631(class174.field2091[1], class502.field7099[0], -9665, class502.field7099[1], class174.field2091[0], var12);
                    class6.field80.method631(class502.field7099[1], class192.field2296[0], -9665, class192.field2296[1], class502.field7099[0], var12);
                    class6.field80.method631(class192.field2296[1], class639.field8749[0], -9665, class639.field8749[1], class192.field2296[0], var12);
                    class6.field80.method631(class639.field8749[1], class502.field7099[0], -9665, class502.field7099[1], class639.field8749[0], var12);
                }
            }
            class301.field3607.method655(var0, "Dynamic: " + class521.field7397 + "/" + 5000, var1 + 45, -256, -16777216, 62);
            class301.field3607.method655(var0, "Total Opaque Onscreen: " + class446.field6000 + "/" + 10000, var1 + 60, -256, -16777216, 62);
            class301.field3607.method655(var0, "Total Trans Onscreen: " + class116.field1480 + "/" + 5000, var1 + 75, -256, -16777216, 62);
            class301.field3607.method655(var0, "Occluders: " + (class680.field9312 + class168.field2027) + " Active: " + class222.field2583, var1 + 90, -256, -16777216, 62);
            class301.field3607.method655(var0, "Occluded: Ground:" + class727.field10185 + " Walls: " + class454.field6398 + " CPs: " + class435.field5744 + " Pixels: " + class107.field1353, var1 + 105, -256, -16777216, 62);
            class301.field3607.method655(var0, "Occlude Calc Took: " + class786.field10855 / 1000L + "us", var1 + 120, -256, -16777216, 62);
            if (class78.field1055 == 2 && class288.field3474 != null) {
                for (int var4 = 0; var4 < class288.field3474.length; ++var4) {
                    float var6 = (float) class288.field3474[var4];
                    float var7 = var6 / 4194304.0F;
                    if (var7 > 1.0F) {
                        var7 = 1.0F;
                    }
                    float var8 = var7 * 255.0F;
                    float var9 = 255.0F - var8;
                    int var10 = (int) var9;
                    class288.field3474[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
                }
                class312 var5 = class6.field80.method623(class288.field3474, class274.field3211, 1, class594.field8079, class594.field8079, 0);
                var5.method240(var0, 170, 1, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
    public final void method1219(int arg0) {
        ++field4093;
        OpenGL.glFramebufferTexture2DEXT(this.field4100, this.field4099, 3553, 0, 0);
        this.field4100 = -1;
        this.field4099 = -1;
        if (arg0 > -96) {
            method1965();
        }
    }

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "(I)V")
    public static final void method1966(int arg0) {
        ++field4102;
        class616.field8285 = 0L;
        class513.field7244 = "";
        class48.field648 = -1;
        if (arg0 != -8324) {
            field4094 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "(I)V")
    public static void method1967(int arg0) {
        int var1 = 127 % ((arg0 - 65) / 35);
        field4094 = null;
        field4095 = null;
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lpc;II)V")
    public class331(class700 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field4101 = arg2;
        super.field5229.method3936(false, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field5236, arg2, arg2, 0, class17.method215((byte) -97, super.field5236), 5121, (byte[]) null, 0);
        }
        this.method2347(true, 76);
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lpc;IIZ[[I)V")
    public class331(class700 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field4101 = arg2;
        super.field5229.method3936(false, this);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class313.method1849(arg4[var6], true, super.field5229.field9778, arg2, 32993, arg2, super.field5236, var6 + 34069);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field5236, arg2, arg2, 0, 32993, super.field5229.field9778, arg4[var7], 0);
            }
        }
        this.method2347(true, -122);
    }

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "(I)I")
    public static final int method1968(int arg0) {
        if (arg0 != -1) {
            method1968(120);
        }
        ++field4096;
        return class544.field7626++;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIII)V")
    public final void method1969(int arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg4, arg3, super.field5223, arg0);
        ++field4097;
        this.field4100 = arg2;
        this.field4099 = arg4;
        int var6 = -58 % ((-38 - arg1) / 33);
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lpc;IIZ[[BI)V")
    public class331(class700 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field4101 = arg2;
        super.field5229.method3936(false, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field5236, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2347(true, 87);
    }

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "(I)V")
    public static final void method1970(int arg0) {
        class581 var1 = (class581) class365.field4542.method1003((byte) 53);
        if (arg0 > 87) {
            while (var1 != null) {
                if (var1.field7927 > 1) {
                    var1.field7927 = 0;
                    class488.field6822.method1686(-25638, ((class75) var1.field7925.field1703.field1903).field1024, var1);
                    var1.field7925.method1000(31335);
                }
                var1 = (class581) class365.field4542.method1004(true);
            }
            ++field4091;
            class282.field3279 = 0;
            class245.field2894 = 0;
            class5.field52.method2729(-48);
            class90.field1207.method2115(0);
            class365.field4542.method1000(31335);
            class582.method3357(class786.field10838, (byte) -34);
        }
    }
}
