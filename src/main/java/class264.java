import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class264 extends class423 {

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field4287 = new String[] { method2296(method2295("\u00029P9)")), method2296(method2295("\u00029P:)")), method2296(method2295("\u0012qPV|")), method2296(method2295("\u0007*\u0012\u0014")), method2296(method2295("\u00029P<)")), method2296(method2295("\u00029P;)")) };

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field4283 = 0;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class264(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IB)V")
    public static final void method2293(int arg0, byte arg1) {
        try {
            field4285++;
            int var2 = class431.field6776 - class346.field5619;
            if (arg1 <= -96) {
                if (var2 >= 100) {
                    class401.field6334 = 1;
                    class210.field3323 = -1;
                    class344.field5593 = -1;
                } else {
                    int var3 = (int) class418.field6612;
                    if ((class585.field8485 >> 8) > var3) {
                        var3 = class585.field8485 >> 8;
                    }
                    if (class576.field8309[4] && var3 < (class639.field9141[4] + 128)) {
                        var3 = class639.field9141[4] + 128;
                    }
                    int var4 = (int) class29.field293 + class592.field8574 & 0x3FFF;
                    class128.method1230(false, arg0, var3, class207.method1873(class438.field6846.field9985, -10, class673.field9554, class438.field6846.field9983) - 200, (var3 >> 3) * 3 + 600 << 2, class147.field2059, var4, class524.field7735);
                    float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
                    class791.field11550 = (int) ((float) (class791.field11550 - class741.field10914) * var5 + (float) class741.field10914);
                    class134.field1902 = (int) ((float) (class134.field1902 - class154.field2149) * var5 + (float) class154.field2149);
                    class396.field6285 = (int) ((float) (class396.field6285 - class423.field6670) * var5 + (float) class423.field6670);
                    class133.field1896 = (int) ((float) (class133.field1896 - class571.field8274) * var5 + (float) class571.field8274);
                    int var6 = class728.field10661 - class347.field5634;
                    if (var6 > 8192) {
                        var6 -= 16384;
                    } else if (var6 < -8192) {
                        var6 += 16384;
                    }
                    class728.field10661 = (int) ((float) var6 * var5 + (float) class347.field5634);
                    class728.field10661 &= 0x3FFF;
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4287[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBIIIII)V")
    public static final void method2294(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg1 < 73) {
                field4283 = -87;
            }
            if (arg3 != 8 && arg3 != 16) {
                class290 var7 = class85.field1280[arg5][arg4][arg0];
                if (var7 == null) {
                    var7 = new class290(arg5);
                }
                if (arg3 == 1) {
                    var7.field4676 = (short) arg6;
                    var7.field4671 = (short) arg2;
                } else if (arg3 == 2) {
                    var7.field4675 = (short) arg2;
                    var7.field4683 = (short) arg6;
                }
                if (class423.field6674) {
                    class648.method4727(-85);
                }
            } else if (arg3 == 8) {
                int var14 = arg4 << class165.field2688;
                int var15 = class152.field2131 + var14;
                int var16 = arg0 << class165.field2688;
                int var17 = var16 + class152.field2131;
                int var18 = class493.field7420[arg5].method2495(arg0, 1, arg4);
                int var19 = class493.field7420[arg5].method2495(arg0 + 1, 1, arg4 + 1);
                class134.field1903[class772.field11311++] = new class781(arg3, arg5, var14, var15, var15, var14, var18, var19, var19 - arg6, -arg6 + var18, var16, var17, var17, var16);
            } else {
                int var8 = (arg4 << class165.field2688) + class152.field2131;
                int var9 = var8 - class152.field2131;
                int var10 = arg0 << class165.field2688;
                int var11 = class152.field2131 + var10;
                int var12 = class493.field7420[arg5].method2495(arg0, 1, arg4 + 1);
                int var13 = class493.field7420[arg5].method2495(arg0 + 1, 1, arg4);
                class134.field1903[class772.field11311++] = new class781(arg3, arg5, var8, var9, var9, var8, var12, var13, var13 - arg6, -arg6 + var12, var10, var11, var11, var10);
            }
            field4286++;
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field4287[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public final void method2090(byte arg0) {
        try {
            field4282++;
            if (arg0 != 124) {
                this.method2086((byte) -13, null);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4287[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method2086(byte arg0, OggPacket arg1) {
        try {
            if (arg0 > -125) {
                field4283 = 15;
            }
            field4284++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4287[4] + arg0 + ',' + (arg1 == null ? field4287[3] : field4287[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2295(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2296(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 105;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
