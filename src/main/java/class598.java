import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class598 extends class427 {

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
    public int field8590;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field8594 = new String[] { method4415(method4414("{\u001c\u0011i'")), method4415(method4414("{\u001c\u0011h'")), method4415(method4414("{\u001c\u0011b'")), method4415(method4414("{\u001c\u0011j'")), method4415(method4414("f\u0004SM")), method4415(method4414("s_\u0011\u000fr")), method4415(method4414("{\u001c\u0011\u001dff\u0018K\u001f'")) };

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static final void method4410(byte arg0) {
        try {
            field8592++;
            if (class351.field5091) {
                class782 var1 = class372.method2952(class121.field1535, class671.field9452, 0);
                if (var1 != null && var1.field11161 != null) {
                    class618 var2 = new class618();
                    var2.field8805 = var1;
                    var2.field8812 = var1.field11161;
                    class158.method1334(var2);
                }
                class108.field1420 = -1;
                if (arg0 > 49) {
                    class351.field5091 = false;
                    class670.field9445 = -1;
                    if (var1 != null) {
                        class97.method959(var1, -1);
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8594[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Luu;")
    public final class240 method482(int arg0) {
        try {
            field8589++;
            return arg0 == 0 ? class324.field4416 : null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8594[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ)I")
    public static final int method4411(int arg0, int arg1, int arg2, boolean arg3) {
        try {
            field8593++;
            int var6 = arg2 & 0x3;
            if (var6 == 0) {
                return arg0;
            } else if (var6 == 1) {
                return 4095 - arg1;
            } else if (var6 == 2) {
                return 4095 - arg0;
            } else if (arg3) {
                return arg1;
            } else {
                return 118;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8594[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Lnaa;")
    public static final class621 method4412(int arg0, int arg1, int arg2) {
        if (class608.field8715[arg0][arg1][arg2] == null) {
            boolean var3 = class608.field8715[0][arg1][arg2] != null && class608.field8715[0][arg1][arg2].field8849 != null;
            if (var3 && arg0 >= class293.field4121 - 1) {
                return null;
            }
            class608.method4488(arg0, arg1, arg2);
        }
        return class608.field8715[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBI)I")
    public static final int method4413(int arg0, byte arg1, int arg2) {
        try {
            field8591++;
            if (class606.field8688 == -1) {
                return 1;
            }
            if (arg0 != class451.field6612.field9134.method4717(3)) {
                class625.method4585(10, class537.field7843.method4068((byte) -74, class405.field5883), arg0, true);
                if (class451.field6612.field9134.method4717(3) != arg0) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class560.field8153.getSize();
                class649.method4730(2, class84.field1185, class537.field7843.method4068((byte) -127, class405.field5883), class23.field279, class236.field3418, true);
                class60 var4 = class372.method2951(class606.field8688, 0, (byte) -3, class378.field5529);
                long var5 = class614.method4531(-127);
                class236.field3418.method240();
                class151.field1925.method739(0, class157.field2000, 0);
                class236.field3418.method204(class151.field1925);
                class236.field3418.method233(var3.width / 2, var3.height / 2, 512, 512);
                if (arg1 != -77) {
                    return 56;
                }
                class236.field3418.method127(1.0F);
                class236.field3418.method235(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class761 var7 = class236.field3418.method197(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label54: for (int var9 = 0; var9 < 500; var9++) {
                    class236.field3418.method243(0);
                    class236.field3418.method225();
                    for (int var10 = 15; var10 >= 0; var10--) {
                        for (int var11 = 0; var11 <= var10; var11++) {
                            class572.field8293.method739((int) (((float) var11 - (float) var10 / 2.0F) * (float) class768.field10975), 0, (var10 + 1) * class768.field10975);
                            var8++;
                            var7.method415(class572.field8293, null, 0);
                            if ((long) arg2 <= class614.method4531(-92) - var5) {
                                break label54;
                            }
                        }
                    }
                }
                class236.field3418.method138();
                long var12 = (long) (var8 * 1000) / (class614.method4531(-21) - var5);
                class236.field3418.method243(0);
                class236.field3418.method225();
                return (int) var12;
            } catch (Throwable var16) {
                var16.printStackTrace();
                return -1;
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field8594[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lrj;Lmq;IIIIIIIIIIIIII)V")
    public class598(class252 arg0, class657 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        try {
            this.field8590 = arg15;
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field8594[6] + (arg0 == null ? field8594[4] : field8594[5]) + ',' + (arg1 == null ? field8594[4] : field8594[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4414(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4415(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
