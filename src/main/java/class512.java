import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class512 {

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7364 = new String[] { method3861(method3860("m\u001f\u0015\u0007Z")), method3861(method3860("m\u001f\u0015\u0004Z")), method3861(method3860("wP\u0015l\u000f")), method3861(method3860("b\u000bW.")), method3861(method3860("m\u001f\u0015\u0005Z")) };

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lel;")
    public static class573 field7363 = new class573(81, -2);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static final void method3857(byte arg0) {
        try {
            if (class610.field8913.method588()) {
                class610.field8913.method557(class502.field7252);
                class454.method3476(-76);
                if (class235.field3549) {
                    class40.method271((byte) -53, class502.field7252);
                } else {
                    Dimension var1 = class502.field7252.getSize();
                    class610.field8913.method589(class502.field7252, var1.width, var1.height);
                }
                class610.field8913.method508(class502.field7252);
            } else {
                class640.method4693(class289.field4305.field812.method1610(false), -13558, false);
            }
            int var2 = 93 % ((arg0 + 40) / 63);
            field7361++;
            class649.method4771((byte) 117);
            class222.field3412 = true;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7364[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLnw;[I[I[I)V")
    public static final void method3858(byte arg0, class612 arg1, int[] arg2, int[] arg3, int[] arg4) {
        try {
            field7362++;
            for (int var5 = 0; var5 < arg4.length; var5++) {
                int var6 = arg4[var5];
                int var7 = arg2[var5];
                int var8 = arg3[var5];
                for (int var9 = 0; var7 != 0 && arg1.field3813.length > var9; var9++) {
                    if ((var7 & 0x1) != 0) {
                        if (var6 == -1) {
                            arg1.field3813[var9] = null;
                        } else {
                            class344 var10 = class272.field4122.method2242(var6, 100);
                            int var11 = var10.field5364;
                            class694 var12 = arg1.field3813[var9];
                            if (var12 != null) {
                                if (var12.field10138 == var6) {
                                    if (var11 == 0) {
                                        var12 = arg1.field3813[var9] = null;
                                    } else if (var11 == 1) {
                                        var12.field10130 = 0;
                                        var12.field10134 = 1;
                                        var12.field10136 = 0;
                                        var12.field10132 = 0;
                                        var12.field10137 = var8;
                                        if (!arg1.field3800) {
                                            class418.method3242(-256, var10, arg1, 0);
                                        }
                                    } else if (var11 == 2) {
                                        var12.field10132 = 0;
                                    }
                                } else if (var10.field5348 >= class272.field4122.method2242(var12.field10138, 100).field5348) {
                                    var12 = arg1.field3813[var9] = null;
                                }
                            }
                            if (var12 == null) {
                                class694 var13 = arg1.field3813[var9] = new class694();
                                var13.field10132 = 0;
                                var13.field10138 = var6;
                                var13.field10130 = 0;
                                var13.field10136 = 0;
                                var13.field10134 = 1;
                                var13.field10137 = var8;
                                if (!arg1.field3800) {
                                    class418.method3242(-256, var10, arg1, 0);
                                }
                            }
                        }
                    }
                    var7 >>>= 0x1;
                }
            }
            if (arg0 < 87) {
                method3859(54);
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field7364[4] + arg0 + ',' + (arg1 == null ? field7364[3] : field7364[2]) + ',' + (arg2 == null ? field7364[3] : field7364[2]) + ',' + (arg3 == null ? field7364[3] : field7364[2]) + ',' + (arg4 == null ? field7364[3] : field7364[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method3859(int arg0) {
        try {
            field7363 = null;
            int var1 = -121 / ((arg0 - 39) / 55);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7364[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3860(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3861(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 114;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
