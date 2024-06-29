import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class class734 extends class362 {

    @OriginalMember(owner = "client!au", name = "u", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field9906;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "[F")
    public static float[] field9902 = new float[16384];

    @OriginalMember(owner = "client!au", name = "s", descriptor = "[F")
    public static float[] field9904 = new float[16384];

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    public int field9905;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)I")
    public static final int method4047(boolean arg0, int arg1) {
        if (arg1 >= -16) {
            field9902 = null;
        }
        field9907++;
        int var2 = class215.field3119;
        if (var2 == 0) {
            return arg0 ? 0 : class512.field7129;
        } else if (var2 == 1) {
            return class512.field7129;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
    public abstract void method689(byte arg0);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public static void method4048(int arg0) {
        field9902 = null;
        field9904 = null;
        if (arg0 != -31055) {
            method4051(-119, -98, true);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method4049(OggPacket arg0, int arg1) {
        this.method695((byte) -120, arg0);
        if (arg1 != 16384) {
            field9904 = null;
        }
        field9900++;
        this.field9905++;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public abstract void method695(byte arg0, OggPacket arg1);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/String;IZI)V")
    public static final void method4050(String arg0, int arg1, boolean arg2, int arg3) {
        field9903++;
        class186.method1352(true);
        if (arg1 == 0) {
            class272.field3822 = class416.method2569(true, 0, class528.field7303, class693.field9368.field4445.method1857(-32350) * 2, class458.field6458, class419.field6065);
            if (arg0 != null) {
                class272.field3822.method220(0);
                class597 var4 = class650.method3679(class691.field9325, 0, -117, class416.field6026);
                class60 var5 = class272.field3822.method216(var4, class267.method1778(class569.field7819, class691.field9325, 0), true);
                class205.method1423((byte) -89);
                class130.method1074(true, var5, var4, arg0, 2, class272.field3822);
            }
        } else {
            class59 var6 = null;
            if (arg0 != null) {
                var6 = class416.method2569(true, 0, class528.field7303, 0, class458.field6458, class419.field6065);
                var6.method220(0);
                class597 var7 = class650.method3679(class691.field9325, 0, -115, class416.field6026);
                class60 var8 = var6.method216(var7, class267.method1778(class569.field7819, class691.field9325, 0), true);
                class205.method1423((byte) -107);
                class130.method1074(true, var8, var7, arg0, arg3 + 2, var6);
            }
            boolean var24 = false;
            label216: {
                try {
                    var24 = true;
                    class272.field3822 = class416.method2569(true, arg1, class528.field7303, class693.field9368.field4445.method1857(arg3 - 32350) * 2, class458.field6458, class419.field6065);
                    if (arg0 != null) {
                        var6.method220(0);
                        class597 var9 = class650.method3679(class691.field9325, 0, -51, class416.field6026);
                        class60 var10 = var6.method216(var9, class267.method1778(class569.field7819, class691.field9325, 0), true);
                        class205.method1423((byte) -26);
                        class130.method1074(true, var10, var9, arg0, arg3 + 2, var6);
                    }
                    if (class272.field3822.method310()) {
                        boolean var11 = true;
                        try {
                            var11 = class270.field3807.field3419 > 256;
                        } catch (Throwable var28) {
                        }
                        class415 var12;
                        if (var11) {
                            var12 = class272.field3822.method261(146800640);
                        } else {
                            var12 = class272.field3822.method261(104857600);
                        }
                        class272.field3822.method270(var12);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label216;
                } catch (Throwable var29) {
                    int var13 = class693.field9368.field4468.method1099(-32350);
                    if (var13 == 2) {
                        class263.field3761 = true;
                    }
                    class693.field9368.method2065((byte) 74, class693.field9368.field4468, 0);
                    method4050(arg0, var13, arg2, arg3);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var6 != null) {
                            try {
                                var6.method614((byte) -111);
                            } catch (Throwable var25) {
                            }
                        }
                    }
                }
                if (var6 != null) {
                    try {
                        var6.method614((byte) -111);
                    } catch (Throwable var26) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var6 != null) {
                try {
                    var6.method614((byte) -111);
                } catch (Throwable var27) {
                }
            }
        }
        class693.field9368.field4468.method1096(!arg2, -142238264);
        class693.field9368.method2065((byte) 74, class693.field9368.field4468, arg1);
        class215.method1502(arg3 - 78);
        class272.field3822.method221(10000);
        class272.field3822.method267(32);
        class244.field3536 = class272.field3822.method290();
        class216.field3122 = class272.field3822.method290();
        class316.method2045((byte) -9);
        class272.field3822.method330(class693.field9368.field4425.method1925(-32350) == 1);
        if (class272.field3822.method204()) {
            class396.method2480(class693.field9368.field4440.method3631(-32350) == 1, (byte) -24);
        }
        class136.method1110(class376.field5325 >> 3, 21719, class272.field3822, class175.field2711 >> 3);
        class440.method2652(true);
        class184.field2782 = false;
        class559.field7738 = null;
        class274.field3858 = true;
        class587.method3355(arg3);
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class734(OggStreamState arg0) {
        this.field9906 = arg0;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIZ)V")
    public static final void method4051(int arg0, int arg1, boolean arg2) {
        field9901++;
        class594 var3 = class692.method3869(arg0, (byte) 105, 14);
        if (arg2) {
            field9902 = null;
        }
        var3.method3378(-25490);
        var3.field8126 = arg1;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field9902[var2] = (float) Math.sin((double) var2 * var0);
            field9904[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
