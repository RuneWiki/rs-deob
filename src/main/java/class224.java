import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class224 {

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[Lie;")
    private class86[] field3496;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3489 = 2;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3491 = "Loaded wordpack";

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[I")
    public static int[] field3498 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
    public static int[] field3493 = new int[1000];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZI)I", line = 9)
    public static final int method1596(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = class56.field832[class85.method696(arg1, arg0)];
        if (!arg2) {
            field3498 = (int[]) null;
        }
        field3494++;
        if (arg3 > 0) {
            int var5 = class56.field829.method1740(117, arg3 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg0 < 0) {
                    var6 = 0;
                } else if (arg0 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg0 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class56.field829.method1745(false, arg3 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 << 8 & 0xFF00D3) + (var11 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLjava/lang/String;)J", line = 85)
    public static final long method1597(boolean arg0, String arg1) {
        long var2 = 0L;
        if (!arg0) {
            return -76L;
        }
        field3492++;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Llb;III)[Lom;", line = 135)
    public static final class70[] method1598(class211 arg0, int arg1, int arg2, int arg3) {
        field3495++;
        if (class297.method2093(arg1, arg2, (byte) 112, arg0)) {
            if (arg3 < 10) {
                field3491 = (String) null;
            }
            return class154.method1128((byte) -21);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 161)
    public static final void method1599(int arg0) {
        try {
            if (arg0 >= -90) {
                return;
            }
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class228.field3523 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        field3499++;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V", line = 192)
    public class224(int arg0) {
        this.field3496 = new class86[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class86 var3 = this.field3496[var2] = new class86();
            var3.field1258 = var3;
            var3.field1269 = var3;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 216)
    public static void method1600(byte arg0) {
        field3491 = null;
        field3498 = null;
        field3493 = null;
        if (arg0 != 122) {
            field3493 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIBIII)V", line = 240)
    public static final void method1601(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 > -80) {
            return;
        }
        for (int var9 = 0; var9 < class213.field3390.field112; var9++) {
            if (class213.field3390.method89(var9, 0)) {
                int var10 = class213.field3390.field125[var9] - class69.field1018;
                int var11 = -class213.field3390.field109[var9] - (-class318.field4932 - (class193.field3089 - 1));
                int var12 = (var10 - arg0) * (arg8 - arg3) / (arg2 - arg0) + arg3;
                int var13 = (arg1 - arg6) * (var11 - arg7) / (arg4 - arg7) + arg6;
                int var14 = class213.field3390.method87(var9, false);
                int var15 = 16777215;
                class283 var16 = null;
                if (var14 == 0) {
                    if ((double) class79.field1111 == 3.0D) {
                        var16 = class309.field4828;
                    }
                    if ((double) class79.field1111 == 4.0D) {
                        var16 = class152.field2283;
                    }
                    if ((double) class79.field1111 == 6.0D) {
                        var16 = class276.field4240;
                    }
                    if ((double) class79.field1111 >= 8.0D) {
                        var16 = class200.field3181;
                    }
                }
                if (var14 == 1) {
                    if ((double) class79.field1111 == 3.0D) {
                        var16 = class276.field4240;
                    }
                    if ((double) class79.field1111 == 4.0D) {
                        var16 = class200.field3181;
                    }
                    if ((double) class79.field1111 == 6.0D) {
                        var16 = class92.field1334;
                    }
                    if ((double) class79.field1111 >= 8.0D) {
                        var16 = class43.field682;
                    }
                }
                if (var14 == 2) {
                    var15 = 16755200;
                    if ((double) class79.field1111 == 3.0D) {
                        var16 = class92.field1334;
                    }
                    if ((double) class79.field1111 == 4.0D) {
                        var16 = class43.field682;
                    }
                    if ((double) class79.field1111 == 6.0D) {
                        var16 = class138.field2158;
                    }
                    if ((double) class79.field1111 >= 8.0D) {
                        var16 = class200.field3179;
                    }
                }
                if (class213.field3390.field123[var9] != -1) {
                    var15 = class213.field3390.field123[var9];
                }
                if (var16 != null) {
                    int var17 = class136.field2119.method429(class213.field3390.field119[var9], (int[]) null, class322.field5000);
                    int var18 = var13 - var16.method1995() * (var17 - 1) / 2;
                    int var19 = var18 + var16.method1993() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        String var21 = class322.field5000[var20];
                        if (var20 < (var17 - 1)) {
                            var21 = var21.substring(0, var21.length() - 4);
                        }
                        var16.method1994(var21, var12, var19, var15, true);
                        var19 += var16.method1995();
                    }
                }
            }
        }
        field3497++;
    }
}
