import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class657 {

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lffa;")
    public class197 field9490;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9497 = new String[] { method4827(method4826("]?/C\u000f")), method4827(method4826("Ky/ Z")), method4827(method4826("^\"mb")), method4827(method4826("]?/@\u000f")), method4827(method4826("]?/A\u000f")), method4827(method4826("]?/^\u000f")), method4827(method4826("]?/B\u000f")), method4827(method4826("]?/2N^>u0\u000f")) };

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lel;")
    public static class573 field9492 = new class573(82, -2);

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "J")
    public static long field9491;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lla;")
    public static class476 field9488;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Lla;")
    public static class476 field9489;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 4)
    public static void method4821(byte arg0) {
        try {
            field9489 = null;
            field9488 = null;
            field9492 = null;
            if (arg0 <= 79) {
                field9488 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9497[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([Ljava/lang/String;I[III)V", line = 20)
    public static final void method4822(String[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        try {
            if (arg1 > arg4) {
                int var5 = (arg4 + arg1) / 2;
                int var6 = arg4;
                String var7 = arg0[var5];
                arg0[var5] = arg0[arg1];
                arg0[arg1] = var7;
                int var8 = arg2[var5];
                arg2[var5] = arg2[arg1];
                arg2[arg1] = var8;
                for (int var9 = arg4; var9 < arg1; var9++) {
                    if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                        String var10 = arg0[var9];
                        arg0[var9] = arg0[var6];
                        arg0[var6] = var10;
                        int var11 = arg2[var9];
                        arg2[var9] = arg2[var6];
                        arg2[var6++] = var11;
                    }
                }
                arg0[arg1] = arg0[var6];
                arg0[var6] = var7;
                arg2[arg1] = arg2[var6];
                arg2[var6] = var8;
                method4822(arg0, var6 - 1, arg2, -23391, arg4);
                method4822(arg0, arg1, arg2, -23391, var6 + 1);
            }
            if (arg3 == -23391) {
                field9494++;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field9497[6] + (arg0 == null ? field9497[2] : field9497[1]) + ',' + arg1 + ',' + (arg2 == null ? field9497[2] : field9497[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lec;I)V", line = 81)
    public static final void method4823(class247 arg0, int arg1) {
        try {
            if (arg1 != 23401) {
                method4821((byte) 80);
            }
            if ((arg0 instanceof class612)) {
                class612 var3 = (class612) arg0;
                if (var3.field8947 != null) {
                    class661.method4848(-124, class225.field3446.field6200 != var3.field6200, var3);
                }
            } else if (arg0 instanceof class726) {
                class726 var2 = (class726) arg0;
                class408.method3188(18944, var2, class225.field3446.field6200 != var2.field6200);
            }
            field9496++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9497[3] + (arg0 == null ? field9497[2] : field9497[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lffa;)V", line = 111)
    public class657(class197 arg0) {
        try {
            this.field9490 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9497[7] + (arg0 == null ? field9497[2] : field9497[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lcn;IIZI)V", line = 125)
    public static final void method4824(int arg0, class541[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        try {
            for (int var6 = 0; var6 < arg1.length; var6++) {
                class541 var7 = arg1[var6];
                if (var7 != null && var7.field8079 == arg5) {
                    class547.method4123(arg0, var7, arg4, arg3 ^ 0xFFFFA782, arg2);
                    class484.method3688(arg0, 2, arg2, var7);
                    if ((var7.field8103 - var7.field8029) < var7.field8014) {
                        var7.field8014 = var7.field8103 - var7.field8029;
                    }
                    if (var7.field8014 < 0) {
                        var7.field8014 = 0;
                    }
                    if (var7.field7957 > (var7.field8090 - var7.field8045)) {
                        var7.field7957 = var7.field8090 - var7.field8045;
                    }
                    if (var7.field7957 < 0) {
                        var7.field7957 = 0;
                    }
                    if (var7.field8042 == 0) {
                        class656.method4813(var7, -35646576, arg4);
                    }
                }
            }
            if (arg3 != 22652) {
                method4824(-120, null, 67, -108, false, 123);
            }
            field9493++;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9497[0] + arg0 + ',' + (arg1 == null ? field9497[2] : field9497[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIBIZ)V", line = 171)
    public static final void method4825(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        try {
            field9495++;
            if (class2.field14 != null && (arg0 != 3 || class76.field880 != arg4 || class227.field3473 != arg2)) {
                class38.method250(class580.field8601, class2.field14, arg3 - 90);
                class2.field14 = null;
            }
            if (arg0 == 3 && class2.field14 == null) {
                class2.field14 = class545.method4115(arg2, false, 0, 0, class580.field8601, arg4);
                if (class2.field14 != null) {
                    class227.field3473 = arg2;
                    class76.field880 = arg4;
                    class124.method1077(arg3 - 33);
                }
            }
            if (arg0 == 3 && class2.field14 == null) {
                method4825(class289.field4305.field829.method5551(false), arg1, -1, (byte) 30, -1, true);
            } else {
                Container var7;
                if (class2.field14 != null) {
                    var7 = class2.field14;
                    class101.field1118 = arg2;
                    class650.field9404 = arg4;
                } else if (class376.field5730 == null) {
                    if (class629.field9206 == null) {
                        var7 = class277.field4174;
                    } else {
                        var7 = class629.field9206;
                    }
                    class650.field9404 = var7.getSize().width;
                    class101.field1118 = var7.getSize().height;
                } else {
                    Insets var6 = class376.field5730.getInsets();
                    class650.field9404 = class376.field5730.getSize().width - var6.right - var6.left;
                    int var10001 = -var6.top;
                    class101.field1118 = class376.field5730.getSize().height + (var10001 - var6.bottom);
                    var7 = class376.field5730;
                }
                if (arg0 == 1) {
                    class10.field103 = (class650.field9404 - class604.field8861) / 2;
                    class179.field2489 = class604.field8861;
                    class94.field1062 = class524.field7654;
                    class554.field8258 = 0;
                } else {
                    class542.method4104(0);
                }
                if (class64.field667 != class31.field364) {
                    boolean var10000;
                    if (class179.field2489 < 1024 && class94.field1062 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                if (arg5) {
                    class512.method3857((byte) -124);
                } else {
                    class502.field7252.setSize(class179.field2489, class94.field1062);
                    if (class235.field3549) {
                        client.method2678(class502.field7252, -117);
                    } else {
                        class610.field8913.method551(class502.field7252, class179.field2489, class94.field1062);
                    }
                    if (class376.field5730 == var7) {
                        Insets var8 = class376.field5730.getInsets();
                        class502.field7252.setLocation(class10.field103 + var8.left, var8.top - -class554.field8258);
                    } else {
                        class502.field7252.setLocation(class10.field103, class554.field8258);
                    }
                }
                if (arg0 < 2) {
                    class677.field9819 = false;
                } else {
                    class677.field9819 = true;
                }
                if (arg3 != 30) {
                    field9491 = -75L;
                }
                if (class742.field10801 != -1) {
                    class580.method4335((byte) 103, true);
                }
                if (class629.field9198 != null && class179.method1573((byte) 120, class138.field1645)) {
                    class122.method1063(78);
                }
                for (int var9 = 0; var9 < 100; var9++) {
                    class26.field321[var9] = true;
                }
                class106.field1226 = true;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field9497[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZ)V")
    public abstract void method7(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Z")
    public abstract boolean method8(int arg0);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)V")
    public abstract void method3(boolean arg0, int arg1);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBLmw;)V")
    public abstract void method4(int arg0, byte arg1, class517 arg2);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ)V")
    public abstract void method6(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public abstract void method1(int arg0);

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4826(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4827(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
