import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class233 extends class755 {

    @OriginalMember(owner = "client!rha", name = "o", descriptor = "I")
    private int field3520 = -1;

    @OriginalMember(owner = "client!rha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3521 = new String[] { method1995(method1994("xBA{")), method1995(method1994("d_L9\b>")), method1995(method1994("m\u0019\u000394")), method1995(method1994("d_L9\r>")), method1995(method1994("d_L9\n>")), method1995(method1994("d_L9\f>")), method1995(method1994("d_L9\u000b>")) };

    @OriginalMember(owner = "client!rha", name = "m", descriptor = "J")
    public static long field3514 = 20000000L;

    @OriginalMember(owner = "client!rha", name = "q", descriptor = "Z")
    public static boolean field3519 = false;

    @OriginalMember(owner = "client!rha", name = "n", descriptor = "[I")
    public static int[] field3515 = new int[1];

    @OriginalMember(owner = "client!rha", name = "p", descriptor = "B")
    private byte field3517;

    @OriginalMember(owner = "client!rha", name = "w", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!rha", name = "l", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!rha", name = "s", descriptor = "I")
    private int field3513;

    @OriginalMember(owner = "client!rha", name = "t", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!rha", name = "r", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!rha", name = "v", descriptor = "Ljava/lang/String;")
    private String field3510;

    @OriginalMember(owner = "client!rha", name = "u", descriptor = "[I")
    public static int[] field3509;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "([Lcn;IB)V")
    public static final void method1989(class541[] arg0, int arg1, byte arg2) {
        try {
            if (arg2 <= -53) {
                field3512++;
                for (int var3 = 0; var3 < arg0.length; var3++) {
                    class541 var4 = arg0[var3];
                    if (var4 != null && var4.field8079 == arg1 && !client.method2679(var4)) {
                        if (var4.field8042 == 0) {
                            method1989(arg0, var4.field8034, (byte) -76);
                            if (var4.field7945 != null) {
                                method1989(var4.field7945, var4.field8034, (byte) -66);
                            }
                            class454 var5 = (class454) class661.field9563.method977((long) var4.field8034, 1);
                            if (var5 != null) {
                                class594.method4421((byte) 117, var5.field6640);
                            }
                        }
                        if (var4.field8042 == 6 && var4.field8057 != -1) {
                            class344 var6 = class272.field4122.method2242(var4.field8057, 100);
                            if (var6 != null) {
                                var4.field7951 += class327.field5158;
                                int var7 = var4.field7944;
                                while (var6.field5361[var4.field7944] < var4.field7951) {
                                    var4.field7951 -= var6.field5361[var4.field7944];
                                    var4.field7944++;
                                    if (var6.field5366.length <= var4.field7944) {
                                        var4.field7944 -= var6.field5345;
                                        if (var4.field7944 < 0 || var4.field7944 >= var6.field5366.length) {
                                            var4.field7944 = 0;
                                        }
                                    }
                                    var4.field8010 = var4.field7944 + 1;
                                    if (var6.field5366.length <= var4.field8010) {
                                        var4.field8010 -= var6.field5345;
                                        if (var4.field8010 < 0 || var4.field8010 >= var6.field5366.length) {
                                            var4.field8010 = -1;
                                        }
                                    }
                                    class115.method1013(true, var4);
                                }
                                if (var7 != var4.field7944) {
                                    class570.method4261(var4.field7944, (byte) 121, var6);
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3521[4] + (arg0 == null ? field3521[0] : field3521[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILwca;)V")
    public final void method1990(int arg0, class705 arg1) {
        try {
            field3511++;
            class662 var3 = arg1.field10240[this.field3520];
            if (arg0 != -1) {
                this.method1992((byte) -6, null);
            }
            var3.field9569 = this.field3513;
            var3.field9568 = this.field3517;
            var3.field9571 = this.field3510;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3521[6] + arg0 + ',' + (arg1 == null ? field3521[0] : field3521[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
    public static void method1991(int arg0) {
        try {
            field3509 = null;
            field3515 = null;
            if (arg0 != -1) {
                method1993((byte) -31);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3521[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(BLib;)V")
    public final void method1992(byte arg0, class163 arg1) {
        try {
            field3516++;
            this.field3520 = arg1.method1445((byte) 114);
            this.field3517 = arg1.method1414(1);
            int var3 = -96 / ((3 - arg0) / 51);
            this.field3513 = arg1.method1445((byte) 124);
            arg1.method1435(-127);
            this.field3510 = arg1.method1423(-37);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3521[1] + arg0 + ',' + (arg1 == null ? field3521[0] : field3521[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)V")
    public static final void method1993(byte arg0) {
        try {
            field3518++;
            class338.field5274 = null;
            if (arg0 < -20) {
                class12.field142 = -1;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3521[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1994(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1995(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 45;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
