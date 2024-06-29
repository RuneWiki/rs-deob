import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class330 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "[I")
    private static int[] field4875 = new int[5];

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    private static int field4891 = 0;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "[Ljava/lang/String;")
    private static String[] field4884 = new String[1000];

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "[I")
    private static int[] field4883 = new int[1000];

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "[Lwb;")
    private static class172[] field4897 = new class172[50];

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    private static int field4898 = 0;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    private static int field4893 = 0;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "[[I")
    private static int[][] field4899 = new int[5][5000];

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "Ljava/util/Calendar;")
    private static Calendar field4879 = Calendar.getInstance();

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field4900 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "[I")
    private static int[] field4902 = new int[3];

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "Lqc;")
    public static class325 field4901 = new class325(4);

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "I")
    private static int field4903 = 0;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "Lki;")
    private static class295 field4889;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "Lwca;")
    private static class311 field4887;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "Lwca;")
    private static class311 field4896;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "[I")
    private static int[] field4881;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "[Ljava/lang/String;")
    private static String[] field4895;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "()V", line = 4)
    public static final void method2066() {
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 9)
    private static final void method2067(String arg0, int arg1) {
        if (class370.field5351 == 0 && !(!class506.field7545 || class80.field916) || class163.field2181) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class489.field7402.method2953(3181, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class489.field7402.method2953(3181, 0).length());
        } else if (var2.startsWith(class496.field7471.method2953(3181, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class496.field7471.method2953(3181, 0).length());
        } else if (var2.startsWith(class464.field6705.method2953(3181, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class464.field6705.method2953(3181, 0).length());
        } else if (var2.startsWith(class205.field3049.method2953(3181, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class205.field3049.method2953(3181, 0).length());
        } else if (var2.startsWith(class17.field148.method2953(3181, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class17.field148.method2953(3181, 0).length());
        } else if (var2.startsWith(class568.field8417.method2953(3181, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class568.field8417.method2953(3181, 0).length());
        } else if (var2.startsWith(class215.field3159.method2953(3181, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class215.field3159.method2953(3181, 0).length());
        } else if (var2.startsWith(class609.field8966.method2953(3181, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class609.field8966.method2953(3181, 0).length());
        } else if (var2.startsWith(class628.field9195.method2953(3181, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class628.field9195.method2953(3181, 0).length());
        } else if (var2.startsWith(class226.field3333.method2953(3181, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class226.field3333.method2953(3181, 0).length());
        } else if (var2.startsWith(class388.field5670.method2953(3181, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class388.field5670.method2953(3181, 0).length());
        } else if (var2.startsWith(class183.field2793.method2953(3181, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class183.field2793.method2953(3181, 0).length());
        } else if (class77.field889 != 0) {
            if (var2.startsWith(class489.field7402.method2953(3181, class77.field889))) {
                var3 = 0;
                arg0 = arg0.substring(class489.field7402.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class496.field7471.method2953(3181, class77.field889))) {
                var3 = 1;
                arg0 = arg0.substring(class496.field7471.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class464.field6705.method2953(3181, class77.field889))) {
                var3 = 2;
                arg0 = arg0.substring(class464.field6705.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class205.field3049.method2953(3181, class77.field889))) {
                var3 = 3;
                arg0 = arg0.substring(class205.field3049.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class17.field148.method2953(3181, class77.field889))) {
                var3 = 4;
                arg0 = arg0.substring(class17.field148.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class568.field8417.method2953(3181, class77.field889))) {
                var3 = 5;
                arg0 = arg0.substring(class568.field8417.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class215.field3159.method2953(3181, class77.field889))) {
                var3 = 6;
                arg0 = arg0.substring(class215.field3159.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class609.field8966.method2953(3181, class77.field889))) {
                var3 = 7;
                arg0 = arg0.substring(class609.field8966.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class628.field9195.method2953(3181, class77.field889))) {
                var3 = 8;
                arg0 = arg0.substring(class628.field9195.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class226.field3333.method2953(3181, class77.field889))) {
                var3 = 9;
                arg0 = arg0.substring(class226.field3333.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class388.field5670.method2953(3181, class77.field889))) {
                var3 = 10;
                arg0 = arg0.substring(class388.field5670.method2953(3181, class77.field889).length());
            } else if (var2.startsWith(class183.field2793.method2953(3181, class77.field889))) {
                var3 = 11;
                arg0 = arg0.substring(class183.field2793.method2953(3181, class77.field889).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class283.field4186.method2953(3181, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class283.field4186.method2953(3181, 0).length());
        } else if (var4.startsWith(class158.field2101.method2953(3181, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class158.field2101.method2953(3181, 0).length());
        } else if (var4.startsWith(class168.field2274.method2953(3181, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class168.field2274.method2953(3181, 0).length());
        } else if (var4.startsWith(class194.field2922.method2953(3181, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class194.field2922.method2953(3181, 0).length());
        } else if (var4.startsWith(class495.field7462.method2953(3181, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class495.field7462.method2953(3181, 0).length());
        } else if (class77.field889 != 0) {
            if (var4.startsWith(class283.field4186.method2953(3181, class77.field889))) {
                var5 = 1;
                arg0 = arg0.substring(class283.field4186.method2953(3181, class77.field889).length());
            } else if (var4.startsWith(class158.field2101.method2953(3181, class77.field889))) {
                var5 = 2;
                arg0 = arg0.substring(class158.field2101.method2953(3181, class77.field889).length());
            } else if (var4.startsWith(class168.field2274.method2953(3181, class77.field889))) {
                var5 = 3;
                arg0 = arg0.substring(class168.field2274.method2953(3181, class77.field889).length());
            } else if (var4.startsWith(class194.field2922.method2953(3181, class77.field889))) {
                var5 = 4;
                arg0 = arg0.substring(class194.field2922.method2953(3181, class77.field889).length());
            } else if (var4.startsWith(class495.field7462.method2953(3181, class77.field889))) {
                var5 = 5;
                arg0 = arg0.substring(class495.field7462.method2953(3181, class77.field889).length());
            }
        }
        field4892++;
        class165.method1046(-3466, class186.field2816);
        class221.field3268.method2563(-13021, 0);
        int var6 = class221.field3268.field6221;
        if (arg1 == 5021) {
            class221.field3268.method2563(-13021, 1);
        } else {
            class221.field3268.method2563(-13021, 0);
        }
        class221.field3268.method2563(-13021, var3);
        class221.field3268.method2563(-13021, var5);
        class502.method3017(0, class221.field3268, arg0);
        class221.field3268.method2572(-19419, class221.field3268.field6221 - var6);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZ)V", line = 278)
    public static final void method2068(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 284)
    private static final void method2069(int arg0) {
        class311 var1 = class436.method2659(true, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class311[] var3 = class14.field123[var2];
        if (var3 == null) {
            class311[] var4 = class251.field3650[var2];
            int var5 = var4.length;
            var3 = class14.field123[var2] = new class311[var5];
            class473.method2882(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class473.method2882(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Ljava/lang/String;", line = 323)
    private static final String method2070(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field4879.setTime(new Date(var1));
        int var3 = field4879.get(5);
        int var4 = field4879.get(2);
        int var5 = field4879.get(1);
        return var3 + "-" + field4900[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V", line = 344)
    private static final void method2071(int arg0) {
        class311 var1 = class436.method2659(true, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class311[] var3 = class14.field123[var2];
        if (var3 == null) {
            class311[] var4 = class251.field3650[var2];
            int var5 = var4.length;
            var3 = class14.field123[var2] = new class311[var5];
            class473.method2882(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class473.method2882(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lim;)V", line = 386)
    public static final void method2072(class355 arg0) {
        method2073(arg0, 200000);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lim;I)V", line = 392)
    private static final void method2073(class355 arg0, int arg1) {
        Object[] var2 = arg0.field5160;
        int var3 = (Integer) var2[0];
        class94 var4 = class128.method797((byte) 30, var3);
        if (var4 == null) {
            return;
        }
        field4881 = new int[var4.field1166];
        int var5 = 0;
        field4895 = new String[var4.field1157];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5158;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5161;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5150 == null ? -1 : arg0.field5150.field4667;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5153;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5150 == null ? -1 : arg0.field5150.field4558;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5159 == null ? -1 : arg0.field5159.field4667;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5159 == null ? -1 : arg0.field5159.field4558;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5151;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5154;
                }
                field4881[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5156;
                }
                field4895[var6++] = var9;
            }
        }
        field4903 = arg0.field5162;
        method2076(var4, arg1);
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V", line = 473)
    public static final void method2074(int arg0) {
        if (arg0 == -1 || !class159.method929(0, arg0)) {
            return;
        }
        class311[] var1 = class251.field3650[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class311 var3 = var1[var2];
            if (var3.field4658 != null) {
                class355 var4 = new class355();
                var4.field5150 = var3;
                var4.field5160 = var3.field4658;
                method2073(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(IZ)V", line = 502)
    private static final void method2075(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field4883[field4893++] = class546.field8158;
                return;
            }
            if (arg0 == 5001) {
                field4893 -= 3;
                class546.field8158 = field4883[field4893];
                class630.field9215 = class463.method2750(field4883[field4893 + 1], -120);
                if (class630.field9215 == null) {
                    class630.field9215 = class434.field6355;
                }
                class523.field7748 = field4883[field4893 + 2];
                field4894++;
                class165.method1046(-3466, class402.field5756);
                class221.field3268.method2563(-13021, class546.field8158);
                class221.field3268.method2563(-13021, class630.field9215.field445);
                class221.field3268.method2563(-13021, class523.field7748);
                return;
            }
            if (arg0 == 5002) {
                field4891 -= 2;
                String var2 = field4884[field4891];
                String var3 = field4884[field4891 + 1];
                field4893 -= 2;
                int var4 = field4883[field4893];
                int var5 = field4883[field4893 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field4886++;
                class165.method1046(-3466, class595.field8771);
                class221.field3268.method2563(-13021, class83.method488(-126, var2) + class83.method488(-126, var3) + 2);
                class221.field3268.method2580(var2, 30127);
                class221.field3268.method2563(-13021, var4 - 1);
                class221.field3268.method2563(-13021, var5);
                class221.field3268.method2580(var3, 30127);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field4883[--field4893];
                class258 var7 = class528.method3120(0, var6);
                String var8 = "";
                if (var7 != null && var7.field3766 != null) {
                    var8 = var7.field3766;
                }
                field4884[field4891++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field4883[--field4893];
                class258 var10 = class528.method3120(0, var9);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field3774;
                }
                field4883[field4893++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class630.field9215 == null) {
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = class630.field9215.field445;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021) {
                String var12 = field4884[--field4891];
                method2067(var12, arg0);
                return;
            }
            if (arg0 == 5009) {
                field4891 -= 2;
                String var13 = field4884[field4891];
                String var14 = field4884[field4891 + 1];
                if (class370.field5351 != 0 || (!class506.field7545 || class80.field916) && !class163.field2181) {
                    field4880++;
                    class165.method1046(-3466, class43.field526);
                    class221.field3268.method2563(-13021, 0);
                    int var15 = class221.field3268.field6221;
                    class221.field3268.method2580(var13, 30127);
                    class502.method3017(0, class221.field3268, var14);
                    class221.field3268.method2572(-19419, class221.field3268.field6221 - var15);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var16 = field4883[--field4893];
                class258 var17 = class528.method3120(0, var16);
                String var18 = "";
                if (var17 != null && var17.field3773 != null) {
                    var18 = var17.field3773;
                }
                field4884[field4891++] = var18;
                return;
            }
            if (arg0 == 5011) {
                int var19 = field4883[--field4893];
                class258 var20 = class528.method3120(0, var19);
                String var21 = "";
                if (var20 != null && var20.field3763 != null) {
                    var21 = var20.field3763;
                }
                field4884[field4891++] = var21;
                return;
            }
            if (arg0 == 5012) {
                int var22 = field4883[--field4893];
                class258 var23 = class528.method3120(0, var22);
                int var24 = -1;
                if (var23 != null) {
                    var24 = var23.field3776;
                }
                field4883[field4893++] = var24;
                return;
            }
            if (arg0 == 5015) {
                String var25;
                if (class239.field3493 == null || class239.field3493.field2714 == null) {
                    var25 = class227.field3343;
                } else {
                    var25 = class239.field3493.method1196(true, true);
                }
                field4884[field4891++] = var25;
                return;
            }
            if (arg0 == 5016) {
                field4883[field4893++] = class523.field7748;
                return;
            }
            if (arg0 == 5017) {
                field4883[field4893++] = class608.method3539((byte) -104);
                return;
            }
            if (arg0 == 5018) {
                int var26 = field4883[--field4893];
                class258 var27 = class528.method3120(0, var26);
                int var28 = 0;
                if (var27 != null) {
                    var28 = var27.field3767;
                }
                field4883[field4893++] = var28;
                return;
            }
            if (arg0 == 5019) {
                int var29 = field4883[--field4893];
                class258 var30 = class528.method3120(0, var29);
                String var31 = "";
                if (var30 != null && var30.field3770 != null) {
                    var31 = var30.field3770;
                }
                field4884[field4891++] = var31;
                return;
            }
            if (arg0 == 5020) {
                String var32;
                if (class239.field3493 == null || class239.field3493.field2714 == null) {
                    var32 = class227.field3343;
                } else {
                    var32 = class239.field3493.method1200(false, (byte) 105);
                }
                field4884[field4891++] = var32;
                return;
            }
            if (arg0 == 5023) {
                int var33 = field4883[--field4893];
                class258 var34 = class528.method3120(0, var33);
                int var35 = -1;
                if (var34 != null) {
                    var35 = var34.field3775;
                }
                field4883[field4893++] = var35;
                return;
            }
            if (arg0 == 5024) {
                int var36 = field4883[--field4893];
                class258 var37 = class528.method3120(0, var36);
                int var38 = -1;
                if (var37 != null) {
                    var38 = var37.field3764;
                }
                field4883[field4893++] = var38;
                return;
            }
            if (arg0 == 5050) {
                int var39 = field4883[--field4893];
                field4884[field4891++] = class271.field4009.method1517(true, var39).field5810;
                return;
            }
            if (arg0 == 5051) {
                int var40 = field4883[--field4893];
                class405 var41 = class271.field4009.method1517(true, var40);
                if (var41.field5820 == null) {
                    field4883[field4893++] = 0;
                    return;
                }
                field4883[field4893++] = var41.field5820.length;
                return;
            }
            if (arg0 == 5052) {
                field4893 -= 2;
                int var42 = field4883[field4893];
                int var43 = field4883[field4893 + 1];
                class405 var44 = class271.field4009.method1517(true, var42);
                int var45 = var44.field5820[var43];
                field4883[field4893++] = var45;
                return;
            }
            if (arg0 == 5053) {
                int var46 = field4883[--field4893];
                class405 var47 = class271.field4009.method1517(true, var46);
                if (var47.field5815 == null) {
                    field4883[field4893++] = 0;
                    return;
                }
                field4883[field4893++] = var47.field5815.length;
                return;
            }
            if (arg0 == 5054) {
                field4893 -= 2;
                int var48 = field4883[field4893];
                int var49 = field4883[field4893 + 1];
                field4883[field4893++] = class271.field4009.method1517(true, var48).field5815[var49];
                return;
            }
            if (arg0 == 5055) {
                int var50 = field4883[--field4893];
                field4884[field4891++] = class609.field8967.method741(-3877, var50).method1936(0);
                return;
            }
            if (arg0 == 5056) {
                int var51 = field4883[--field4893];
                class313 var52 = class609.field8967.method741(-3877, var51);
                if (var52.field4710 == null) {
                    field4883[field4893++] = 0;
                    return;
                }
                field4883[field4893++] = var52.field4710.length;
                return;
            }
            if (arg0 == 5057) {
                field4893 -= 2;
                int var53 = field4883[field4893];
                int var54 = field4883[field4893 + 1];
                field4883[field4893++] = class609.field8967.method741(-3877, var53).field4710[var54];
                return;
            }
            if (arg0 == 5058) {
                field4889 = new class295();
                field4889.field4321 = field4883[--field4893];
                field4889.field4323 = class609.field8967.method741(-3877, field4889.field4321);
                field4889.field4324 = new int[field4889.field4323.method1937((byte) -114)];
                return;
            }
            if (arg0 == 5059) {
                field4888++;
                class165.method1046(-3466, class564.field8365);
                class221.field3268.method2563(-13021, 0);
                int var55 = class221.field3268.field6221;
                class221.field3268.method2563(-13021, 0);
                class221.field3268.method2608(field4889.field4321, (byte) 62);
                field4889.field4323.method1930(field4889.field4324, true, class221.field3268);
                class221.field3268.method2572(-19419, class221.field3268.field6221 - var55);
                return;
            }
            if (arg0 == 5060) {
                String var56 = field4884[--field4891];
                field4890++;
                class165.method1046(-3466, class382.field5582);
                class221.field3268.method2563(-13021, 0);
                int var57 = class221.field3268.field6221;
                class221.field3268.method2580(var56, 30127);
                class221.field3268.method2608(field4889.field4321, (byte) 110);
                field4889.field4323.method1930(field4889.field4324, true, class221.field3268);
                class221.field3268.method2572(-19419, class221.field3268.field6221 - var57);
                return;
            }
            if (arg0 == 5061) {
                field4888++;
                class165.method1046(-3466, class564.field8365);
                class221.field3268.method2563(-13021, 0);
                int var58 = class221.field3268.field6221;
                class221.field3268.method2563(-13021, 1);
                class221.field3268.method2608(field4889.field4321, (byte) 44);
                field4889.field4323.method1930(field4889.field4324, true, class221.field3268);
                class221.field3268.method2572(-19419, class221.field3268.field6221 - var58);
                return;
            }
            if (arg0 == 5062) {
                field4893 -= 2;
                int var59 = field4883[field4893];
                int var60 = field4883[field4893 + 1];
                field4883[field4893++] = class271.field4009.method1517(true, var59).field5818[var60];
                return;
            }
            if (arg0 == 5063) {
                field4893 -= 2;
                int var61 = field4883[field4893];
                int var62 = field4883[field4893 + 1];
                field4883[field4893++] = class271.field4009.method1517(true, var61).field5814[var62];
                return;
            }
            if (arg0 == 5064) {
                field4893 -= 2;
                int var63 = field4883[field4893];
                int var64 = field4883[field4893 + 1];
                if (var64 == -1) {
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = class271.field4009.method1517(true, var63).method2425((char) var64, -1);
                return;
            }
            if (arg0 == 5065) {
                field4893 -= 2;
                int var65 = field4883[field4893];
                int var66 = field4883[field4893 + 1];
                if (var66 == -1) {
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = class271.field4009.method1517(true, var65).method2427((byte) -9, (char) var66);
                return;
            }
            if (arg0 == 5066) {
                int var67 = field4883[--field4893];
                field4883[field4893++] = class609.field8967.method741(-3877, var67).method1937((byte) -114);
                return;
            }
            if (arg0 == 5067) {
                field4893 -= 2;
                int var68 = field4883[field4893];
                int var69 = field4883[field4893 + 1];
                int var70 = class609.field8967.method741(-3877, var68).method1929(var69, 111).field5122;
                field4883[field4893++] = var70;
                return;
            }
            if (arg0 == 5068) {
                field4893 -= 2;
                int var71 = field4883[field4893];
                int var72 = field4883[field4893 + 1];
                field4889.field4324[var71] = var72;
                return;
            }
            if (arg0 == 5069) {
                field4893 -= 2;
                int var73 = field4883[field4893];
                int var74 = field4883[field4893 + 1];
                field4889.field4324[var73] = var74;
                return;
            }
            if (arg0 == 5070) {
                field4893 -= 3;
                int var75 = field4883[field4893];
                int var76 = field4883[field4893 + 1];
                int var77 = field4883[field4893 + 2];
                class313 var78 = class609.field8967.method741(-3877, var75);
                if (var78.method1929(var76, -113).field5122 != 0) {
                    throw new RuntimeException("bad command");
                }
                field4883[field4893++] = var78.method1931((byte) 114, var76, var77);
                return;
            }
            if (arg0 == 5071) {
                String var79 = field4884[--field4891];
                boolean var80 = field4883[--field4893] == 1;
                class558.method3268(var80, (byte) -49, var79);
                field4883[field4893++] = class538.field7974;
                return;
            }
            if (arg0 == 5072) {
                if (class642.field9327 != null && class481.field7298 < class538.field7974) {
                    field4883[field4893++] = class642.field9327[class481.field7298++] & 0xFFFF;
                    return;
                }
                field4883[field4893++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class481.field7298 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class542.field8105.method1259(true, 86)) {
                    field4883[field4893++] = 1;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class542.field8105.method1259(true, 82)) {
                    field4883[field4893++] = 1;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class542.field8105.method1259(true, 81)) {
                    field4883[field4893++] = 1;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class360.method2211(field4883[--field4893], (byte) -123);
                return;
            }
            if (arg0 == 5201) {
                field4883[field4893++] = class331.method2080((byte) -116);
                return;
            }
            if (arg0 == 5205) {
                class444.method2699(-1, (byte) -128, -1, false, field4883[--field4893]);
                return;
            }
            if (arg0 == 5206) {
                int var81 = field4883[--field4893];
                class53 var82 = class113.method685(var81 >> 14 & 0x3FFF, var81 & 0x3FFF);
                if (var82 == null) {
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = var82.field651;
                return;
            }
            if (arg0 == 5207) {
                class53 var83 = class113.method683(field4883[--field4893]);
                if (var83 != null && var83.field633 != null) {
                    field4884[field4891++] = var83.field633;
                    return;
                }
                field4884[field4891++] = "";
                return;
            }
            if (arg0 == 5208) {
                field4883[field4893++] = class73.field848;
                field4883[field4893++] = class180.field2770;
                return;
            }
            if (arg0 == 5209) {
                field4883[field4893++] = class296.field4338 + class113.field1445;
                field4883[field4893++] = class527.field7824 + class113.field1434;
                return;
            }
            if (arg0 == 5210) {
                int var84 = field4883[--field4893];
                class53 var85 = class113.method683(var84);
                if (var85 == null) {
                    field4883[field4893++] = 0;
                    field4883[field4893++] = 0;
                    return;
                }
                field4883[field4893++] = var85.field649 >> 14 & 0x3FFF;
                field4883[field4893++] = var85.field649 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var86 = field4883[--field4893];
                class53 var87 = class113.method683(var86);
                if (var87 == null) {
                    field4883[field4893++] = 0;
                    field4883[field4893++] = 0;
                    return;
                }
                field4883[field4893++] = var87.field631 - var87.field638;
                field4883[field4893++] = var87.field640 - var87.field634;
                return;
            }
            if (arg0 == 5212) {
                class385 var88 = class515.method3062(false);
                if (var88 == null) {
                    field4883[field4893++] = -1;
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = var88.field5633;
                int var89 = var88.field5635 << 28 | class113.field1445 + var88.field5630 << 14 | class113.field1434 + var88.field5627;
                field4883[field4893++] = var89;
                return;
            }
            if (arg0 == 5213) {
                class385 var90 = class221.method1453(1);
                if (var90 == null) {
                    field4883[field4893++] = -1;
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = var90.field5633;
                int var91 = var90.field5635 << 28 | class113.field1445 + var90.field5630 << 14 | class113.field1434 + var90.field5627;
                field4883[field4893++] = var91;
                return;
            }
            if (arg0 == 5214) {
                int var92 = field4883[--field4893];
                class53 var93 = class270.method1715((byte) -14);
                if (var93 != null) {
                    boolean var94 = var93.method268(field4902, var92 >> 14 & 0x3FFF, var92 >> 28 & 0x3, -26161, var92 & 0x3FFF);
                    if (var94) {
                        class316.method1990(field4902[1], field4902[2], 98);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field4893 -= 2;
                int var95 = field4883[field4893];
                int var96 = field4883[field4893 + 1];
                class384 var97 = class113.method671(var95 >> 14 & 0x3FFF, var95 & 0x3FFF);
                boolean var98 = false;
                for (class53 var99 = (class53) var97.method2333(-1); var99 != null; var99 = (class53) var97.method2327(10005)) {
                    if (var99.field651 == var96) {
                        var98 = true;
                        break;
                    }
                }
                if (var98) {
                    field4883[field4893++] = 1;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var100 = field4883[--field4893];
                class53 var101 = class113.method683(var100);
                if (var101 == null) {
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = var101.field648;
                return;
            }
            if (arg0 == 5220) {
                field4883[field4893++] = class436.field6426 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var102 = field4883[--field4893];
                class316.method1990(var102 >> 14 & 0x3FFF, var102 & 0x3FFF, -92);
                return;
            }
            if (arg0 == 5222) {
                class53 var103 = class270.method1715((byte) -14);
                if (var103 != null) {
                    boolean var104 = var103.method269(class527.field7824 + class113.field1434, field4902, class296.field4338 + class113.field1445, (byte) -82);
                    if (var104) {
                        field4883[field4893++] = field4902[1];
                        field4883[field4893++] = field4902[2];
                        return;
                    }
                    field4883[field4893++] = -1;
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = -1;
                field4883[field4893++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field4893 -= 2;
                int var105 = field4883[field4893];
                int var106 = field4883[field4893 + 1];
                class444.method2699(var106 >> 14 & 0x3FFF, (byte) -126, var106 & 0x3FFF, false, var105);
                return;
            }
            if (arg0 == 5224) {
                int var107 = field4883[--field4893];
                class53 var108 = class270.method1715((byte) -14);
                if (var108 != null) {
                    boolean var109 = var108.method268(field4902, var107 >> 14 & 0x3FFF, var107 >> 28 & 0x3, -26161, var107 & 0x3FFF);
                    if (var109) {
                        field4883[field4893++] = field4902[1];
                        field4883[field4893++] = field4902[2];
                        return;
                    }
                    field4883[field4893++] = -1;
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = -1;
                field4883[field4893++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var110 = field4883[--field4893];
                class53 var111 = class270.method1715((byte) -14);
                if (var111 != null) {
                    boolean var112 = var111.method269(var110 & 0x3FFF, field4902, var110 >> 14 & 0x3FFF, (byte) -82);
                    if (var112) {
                        field4883[field4893++] = field4902[1];
                        field4883[field4893++] = field4902[2];
                        return;
                    }
                    field4883[field4893++] = -1;
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = -1;
                field4883[field4893++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class144.method858(field4883[--field4893], (byte) -30);
                return;
            }
            if (arg0 == 5227) {
                field4893 -= 2;
                int var113 = field4883[field4893];
                int var114 = field4883[field4893 + 1];
                class444.method2699(var114 >> 14 & 0x3FFF, (byte) -128, var114 & 0x3FFF, true, var113);
                return;
            }
            if (arg0 == 5228) {
                class111.field1411 = field4883[--field4893] == 1;
                return;
            }
            if (arg0 == 5229) {
                field4883[field4893++] = class111.field1411 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var115 = field4883[--field4893];
                class295.method1831(var115, (byte) -127);
                return;
            }
            if (arg0 == 5231) {
                field4893 -= 2;
                int var116 = field4883[field4893];
                boolean var117 = field4883[field4893 + 1] == 1;
                if (class163.field2178 != null) {
                    class496 var118 = class163.field2178.method1333((long) var116, false);
                    if (var118 != null && !var117) {
                        var118.method2997(1);
                        return;
                    }
                    if (var118 == null && var117) {
                        class496 var119 = new class496();
                        class163.field2178.method1341(var119, (byte) -96, (long) var116);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var120 = field4883[--field4893];
                if (class163.field2178 != null) {
                    class496 var121 = class163.field2178.method1333((long) var120, false);
                    field4883[field4893++] = var121 == null ? 0 : 1;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field4893 -= 2;
                int var122 = field4883[field4893];
                boolean var123 = field4883[field4893 + 1] == 1;
                if (class97.field1206 != null) {
                    class496 var124 = class97.field1206.method1333((long) var122, false);
                    if (var124 != null && !var123) {
                        var124.method2997(1);
                        return;
                    }
                    if (var124 == null && var123) {
                        class496 var125 = new class496();
                        class97.field1206.method1341(var125, (byte) -114, (long) var122);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var126 = field4883[--field4893];
                if (class97.field1206 != null) {
                    class496 var127 = class97.field1206.method1333((long) var126, false);
                    field4883[field4893++] = var127 == null ? 0 : 1;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field4883[field4893++] = class113.field1419 == null ? -1 : class113.field1419.field651;
                return;
            }
            if (arg0 == 5236) {
                field4893 -= 2;
                int var128 = field4883[field4893];
                int var129 = field4883[field4893 + 1];
                int var130 = var129 >> 14 & 0x3FFF;
                int var131 = var129 & 0x3FFF;
                int var132 = class273.method1728(var131, var128, -29335, var130);
                if (var132 < 0) {
                    field4883[field4893++] = -1;
                    return;
                }
                field4883[field4893++] = var132;
                return;
            }
            if (arg0 == 5237) {
                class412.method2445(112);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field4893 -= 2;
                int var133 = field4883[field4893];
                int var134 = field4883[field4893 + 1];
                class463.method2748(var134, false, (byte) 126, var133, 3);
                field4883[field4893++] = class644.field9345 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class644.field9345 != null) {
                    class463.method2748(-1, false, (byte) 123, -1, class94.field1158.field293);
                }
                return;
            }
            if (arg0 == 5302) {
                class155[] var135 = class119.method731(-97);
                field4883[field4893++] = var135.length;
                return;
            }
            if (arg0 == 5303) {
                int var136 = field4883[--field4893];
                class155[] var137 = class119.method731(-97);
                field4883[field4893++] = var137[var136].field1981;
                field4883[field4893++] = var137[var136].field1982;
                return;
            }
            if (arg0 == 5305) {
                int var138 = class94.field1158.field269;
                int var139 = class94.field1158.field302;
                int var140 = -1;
                class155[] var141 = class119.method731(-97);
                for (int var142 = 0; var142 < var141.length; var142++) {
                    class155 var143 = var141[var142];
                    if (var143.field1981 == var138 && var143.field1982 == var139) {
                        var140 = var142;
                        break;
                    }
                }
                field4883[field4893++] = var140;
                return;
            }
            if (arg0 == 5306) {
                field4883[field4893++] = class608.method3540(118);
                return;
            }
            if (arg0 == 5307) {
                int var144 = field4883[--field4893];
                if (var144 >= 1 && var144 <= 2) {
                    class463.method2748(-1, false, (byte) 124, -1, var144);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field4883[field4893++] = class94.field1158.field293;
                return;
            }
            if (arg0 == 5309) {
                int var145 = field4883[--field4893];
                if (var145 >= 1 && var145 <= 2) {
                    class94.field1158.field293 = var145;
                    class94.field1158.method2661(class328.field4850, -1);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field4891 -= 2;
                String var146 = field4884[field4891];
                String var147 = field4884[field4891 + 1];
                int var148 = field4883[--field4893];
                field4877++;
                class165.method1046(-3466, class78.field903);
                class221.field3268.method2563(-13021, class83.method488(-126, var146) + class83.method488(-123, var147) + 1);
                class221.field3268.method2580(var146, 30127);
                class221.field3268.method2580(var147, 30127);
                class221.field3268.method2563(-13021, var148);
                return;
            }
            if (arg0 == 5401) {
                field4893 -= 2;
                class335.field4931[field4883[field4893]] = (short) class11.method56(field4883[field4893 + 1], -1630);
                class216.field3204.method3356(1);
                class216.field3204.method3361(0);
                class369.field5329.method1787(-1);
                class539.method3164(-123);
                return;
            }
            if (arg0 == 5405) {
                field4893 -= 2;
                int var149 = field4883[field4893];
                int var150 = field4883[field4893 + 1];
                if (var149 >= 0 && var149 < 2) {
                    class264.field3926[var149] = new int[var150 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field4893 -= 7;
                int var151 = field4883[field4893];
                int var152 = field4883[field4893 + 1] << 1;
                int var153 = field4883[field4893 + 2];
                int var154 = field4883[field4893 + 3];
                int var155 = field4883[field4893 + 4];
                int var156 = field4883[field4893 + 5];
                int var157 = field4883[field4893 + 6];
                if (var151 >= 0 && var151 < 2 && class264.field3926[var151] != null && var152 >= 0 && var152 < class264.field3926[var151].length) {
                    class264.field3926[var151][var152] = new int[] { (var153 >> 14 & 0x3FFF) << 7, var154, (var153 & 0x3FFF) << 7, var157 };
                    class264.field3926[var151][var152 + 1] = new int[] { (var155 >> 14 & 0x3FFF) << 7, var156, (var155 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var158 = class264.field3926[field4883[--field4893]].length >> 1;
                field4883[field4893++] = var158;
                return;
            }
            if (arg0 == 5411) {
                if (class644.field9345 != null) {
                    class463.method2748(-1, false, (byte) 125, -1, class94.field1158.field293);
                }
                if (class248.field3628 != null) {
                    class622.method3622(125);
                    System.exit(0);
                    return;
                }
                String var159 = class501.field7497 == null ? class221.method1459(-79) : class501.field7497;
                class564.method3300(var159, false, class328.field4850, class239.field3499 == 1, (byte) -123);
                return;
            }
            if (arg0 == 5419) {
                String var160 = "";
                if (class50.field597 != null) {
                    if (class50.field597.field4213 == null) {
                        var160 = class68.method416(class50.field597.field4210, 31621);
                    } else {
                        var160 = (String) class50.field597.field4213;
                    }
                }
                field4884[field4891++] = var160;
                return;
            }
            if (arg0 == 5420) {
                field4883[field4893++] = class353.field5140 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class644.field9345 != null) {
                    class463.method2748(-1, false, (byte) 127, -1, class94.field1158.field293);
                }
                String var161 = field4884[--field4891];
                boolean var162 = field4883[--field4893] == 1;
                String var163 = class221.method1459(-68) + var161;
                class564.method3300(var163, var162, class328.field4850, class239.field3499 == 1, (byte) -72);
                return;
            }
            if (arg0 == 5422) {
                field4891 -= 2;
                String var164 = field4884[field4891];
                String var165 = field4884[field4891 + 1];
                int var166 = field4883[--field4893];
                if (var164.length() > 0) {
                    if (class82.field944 == null) {
                        class82.field944 = new String[class258.field3771[class461.field6666.field8301]];
                    }
                    class82.field944[var166] = var164;
                }
                if (var165.length() > 0) {
                    if (class517.field7689 == null) {
                        class517.field7689 = new String[class258.field3771[class461.field6666.field8301]];
                    }
                    class517.field7689[var166] = var165;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field4884[--field4891]);
                return;
            }
            if (arg0 == 5424) {
                field4893 -= 11;
                class379.field5560 = field4883[field4893];
                class281.field4177 = field4883[field4893 + 1];
                class579.field8528 = field4883[field4893 + 2];
                class350.field5087 = field4883[field4893 + 3];
                class268.field3983 = field4883[field4893 + 4];
                class285.field4196 = field4883[field4893 + 5];
                class552.field8212 = field4883[field4893 + 6];
                class626.field9183 = field4883[field4893 + 7];
                class404.field5809 = field4883[field4893 + 8];
                class153.field1956 = field4883[field4893 + 9];
                class620.field9060 = field4883[field4893 + 10];
                class371.field5368.method3491(110, class268.field3983);
                class371.field5368.method3491(114, class285.field4196);
                class371.field5368.method3491(111, class552.field8212);
                class371.field5368.method3491(126, class626.field9183);
                class371.field5368.method3491(122, class404.field5809);
                class145.field1878 = null;
                class125.field1644 = null;
                class94.field1164 = null;
                class532.field7878 = null;
                class455.field6637 = null;
                class597.field8787 = null;
                class32.field329 = null;
                class257.field3761 = null;
                class455.field6636 = true;
                return;
            }
            if (arg0 == 5425) {
                class339.method2109(-30415);
                class455.field6636 = false;
                return;
            }
            if (arg0 == 5426) {
                field4893 -= 2;
                class591.field8746 = field4883[field4893];
                class417.field5998 = field4883[field4893 + 1];
                return;
            }
            if (arg0 == 5427) {
                field4893 -= 2;
                class293.field4305 = field4883[field4893 + 1];
                return;
            }
            if (arg0 == 5428) {
                field4893 -= 2;
                int var167 = field4883[field4893];
                int var168 = field4883[field4893 + 1];
                field4883[field4893++] = class233.method1519(var167, var168, (byte) 71) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class77.method449(false, false, 87, field4884[--field4891]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class222.method1460(false, "accountcreated", class328.field4850.field5129);
                    return;
                } catch (Throwable var291) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class222.method1460(false, "accountcreatestarted", class328.field4850.field5129);
                    return;
                } catch (Throwable var292) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field4893 -= 4;
                int var169 = field4883[field4893];
                int var170 = field4883[field4893 + 1];
                int var171 = field4883[field4893 + 2];
                int var172 = field4883[field4893 + 3];
                class190.method1239(var170, false, -88, (var169 >> 14 & 0x3FFF) - class584.field8677, var171, var172, (var169 & 0x3FFF) - class424.field6061);
                return;
            }
            if (arg0 == 5501) {
                field4893 -= 4;
                int var173 = field4883[field4893];
                int var174 = field4883[field4893 + 1];
                int var175 = field4883[field4893 + 2];
                int var176 = field4883[field4893 + 3];
                class445.method2704(var174, (var173 & 0x3FFF) - class424.field6061, var176, 105, var175, (var173 >> 14 & 0x3FFF) - class584.field8677);
                return;
            }
            if (arg0 == 5502) {
                field4893 -= 6;
                int var177 = field4883[field4893];
                if (var177 >= 2) {
                    throw new RuntimeException();
                }
                class615.field9012 = var177;
                int var178 = field4883[field4893 + 1];
                if (var178 + 1 >= class264.field3926[class615.field9012].length >> 1) {
                    throw new RuntimeException();
                }
                class417.field6001 = var178;
                class566.field8404 = 0;
                class426.field6076 = field4883[field4893 + 2];
                class202.field3014 = field4883[field4893 + 3];
                int var179 = field4883[field4893 + 4];
                if (var179 >= 2) {
                    throw new RuntimeException();
                }
                class586.field8709 = var179;
                int var180 = field4883[field4893 + 5];
                if (var180 + 1 >= class264.field3926[class586.field8709].length >> 1) {
                    throw new RuntimeException();
                }
                class139.field1824 = var180;
                class287.field4232 = 3;
                return;
            }
            if (arg0 == 5503) {
                class196.method1264((byte) 96);
                return;
            }
            if (arg0 == 5504) {
                field4893 -= 2;
                class272.method1724(field4883[field4893], 0, true, field4883[field4893 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field4883[field4893++] = (int) class578.field8523 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field4883[field4893++] = (int) class591.field8752 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class567.method3311(84);
                return;
            }
            if (arg0 == 5508) {
                class51.method260(11263);
                return;
            }
            if (arg0 == 5509) {
                class515.method3063(1);
                return;
            }
            if (arg0 == 5510) {
                class543.method3190(1);
                return;
            }
            if (arg0 == 5511) {
                int var181 = field4883[--field4893];
                int var182 = var181 >> 14 & 0x3FFF;
                int var183 = var181 & 0x3FFF;
                int var184 = var182 - class584.field8677;
                if (var184 < 0) {
                    var184 = 0;
                } else if (var184 >= class35.field399) {
                    var184 = class35.field399;
                }
                int var185 = var183 - class424.field6061;
                if (var185 < 0) {
                    var185 = 0;
                } else if (var185 >= class382.field5586) {
                    var185 = class382.field5586;
                }
                class293.field4306 = (var184 << 7) + 64;
                class392.field5713 = (var185 << 7) + 64;
                class287.field4232 = 4;
                return;
            }
            if (arg0 == 5512) {
                class370.method2257(-93);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field4891 -= 2;
                String var186 = field4884[field4891];
                String var187 = field4884[field4891 + 1];
                int var188 = field4883[--field4893];
                if (class192.field2903 != 2) {
                    return;
                }
                if (class395.field5743 == 0 && class304.field4433 == 0) {
                    class227.field3343 = var186;
                    class451.field6590 = var187;
                    class621.field9066 = var188;
                    class463.method2749(1, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class480.method2910(17082);
                return;
            }
            if (arg0 == 5602) {
                if (class395.field5743 == 0) {
                    class155.field1983 = -2;
                    class308.field4490 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field4893 -= 4;
                if (class192.field2903 != 2) {
                    return;
                }
                if (class395.field5743 == 0 && class304.field4433 == 0) {
                    class366.method2238(field4883[field4893 + 1], field4883[field4893 + 3], field4883[field4893 + 2], 65426, field4883[field4893]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field4891--;
                if (class192.field2903 != 2) {
                    return;
                }
                if (class395.field5743 == 0 && class304.field4433 == 0) {
                    class139.method844(16382, class273.method1727(0, field4884[field4891]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field4891 -= 2;
                if (class192.field2903 != 2) {
                    return;
                }
                if (class395.field5743 == 0 && class304.field4433 == 0) {
                    class50.method252(field4884[field4891 + 1], class273.method1727(0, field4884[field4891]), 99999999, false);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class304.field4433 == 0) {
                    class427.field6090 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field4883[field4893++] = class308.field4490;
                return;
            }
            if (arg0 == 5608) {
                field4883[field4893++] = class619.field9035;
                return;
            }
            if (arg0 == 5609) {
                field4883[field4893++] = class427.field6090;
                return;
            }
            if (arg0 == 5610) {
                for (int var189 = 0; var189 < 5; var189++) {
                    field4884[field4891++] = class52.field629.length > var189 ? class259.method1635(-125, class52.field629[var189]) : "";
                }
                class52.field629 = null;
                return;
            }
            if (arg0 == 5611) {
                field4883[field4893++] = class431.field6313;
                return;
            }
            if (arg0 == 5612) {
                int var190 = field4883[--field4893];
                if (class192.field2903 != 6) {
                    return;
                }
                if (class395.field5743 == 0 && class304.field4433 == 0) {
                    if (class513.field7606 != null) {
                        class513.field7606.method1247((byte) 116);
                        class513.field7606 = null;
                    }
                    class621.field9066 = var190;
                    class463.method2749(1, 8);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field4883[field4893++] = class308.field4490;
                return;
            }
            if (arg0 == 5615) {
                field4891 -= 2;
                String var191 = field4884[field4891];
                String var192 = field4884[field4891 + 1];
                if (class192.field2903 != 2) {
                    return;
                }
                if (class395.field5743 == 0 && class304.field4433 == 0) {
                    if (class513.field7606 != null) {
                        class513.field7606.method1247((byte) 118);
                        class513.field7606 = null;
                    }
                    class227.field3343 = var191;
                    class451.field6590 = var192;
                    class463.method2749(1, 4);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class550.method3221(0, false);
                return;
            }
            if (arg0 == 5617) {
                field4883[field4893++] = class155.field1983;
                return;
            }
            if (arg0 == 5618) {
                int var193 = field4883[--field4893];
                client.method3600((byte) -116, false, var193);
                return;
            }
            if (arg0 == 5619) {
                int var194 = field4883[--field4893];
                client.method3600((byte) -120, true, var194);
                return;
            }
            if (arg0 == 5620) {
                class15.method69((byte) -114);
                if (class201.field3009 != "" && class201.field3009 != "") {
                    field4883[field4893++] = 1;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field4891 -= 2;
                if (class192.field2903 != 2) {
                    return;
                }
                if (class395.field5743 == 0 && class304.field4433 == 0) {
                    class50.method252(field4884[field4891 + 1], class273.method1727(0, field4884[field4891]), 99999999, true);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class286 var195 = class328.field4850.method2175("3", 38, false);
                while (var195.field4208 == 0) {
                    class428.method2624(1, 1L);
                }
                if (var195.field4208 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class211 var196 = (class211) var195.field4213;
                if (var196.method1371((byte) -36).exists()) {
                    class428 var197 = new class428(50);
                    try {
                        var196.method1368((byte) 37, 0, 50, var197.field6162);
                    } catch (IOException var294) {
                    }
                }
                try {
                    var196.method1367(0);
                    return;
                } catch (Exception var293) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class36.field420 != null) {
                    field4883[field4893++] = 1;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var198 = field4883[--field4893];
                if (var198 < 1) {
                    var198 = 1;
                }
                if (var198 > 4) {
                    var198 = 4;
                }
                class94.field1158.field287 = var198;
                class29.method128((byte) 124);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6002) {
                class94.field1158.method2658(field4883[--field4893] == 1, 2);
                class29.method128((byte) 124);
                class552.method3230(-2617);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6003) {
                class94.field1158.field298 = field4883[--field4893] == 1;
                class552.method3230(-2617);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6005) {
                class94.field1158.field268 = field4883[--field4893] == 1;
                class29.method128((byte) 127);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6006) {
                class94.field1158.field266 = field4883[--field4893] == 1;
                class379.field5558.method953(!class94.field1158.field266);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6007) {
                class94.field1158.field283 = field4883[--field4893];
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6008) {
                class94.field1158.field281 = field4883[--field4893] == 1;
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6009) {
                class94.field1158.field290 = field4883[--field4893] == 1;
                class29.method128((byte) 127);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6010) {
                class94.field1158.field284 = field4883[--field4893] == 1;
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6011) {
                int var199 = field4883[--field4893];
                if (var199 < 0 || var199 > 2) {
                    var199 = 0;
                }
                class94.field1158.method134(var199, -1, class239.field3499);
                class29.method128((byte) 124);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6012) {
                class94.field1158.method132(field4883[--field4893] == 1, false, class239.field3499);
                class394.method2372(true);
                class598.method3496(120);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6014) {
                class94.field1158.field299 = field4883[--field4893] == 1;
                class29.method128((byte) 124);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6015) {
                class94.field1158.field265 = field4883[--field4893] == 1;
                class29.method128((byte) 126);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6016) {
                int var200 = field4883[--field4893];
                if (var200 < 0 || var200 > 2) {
                    var200 = 0;
                }
                class94.field1158.field285 = var200;
                class447.method2712(10, class239.field3499);
                class94.field1158.method2661(class328.field4850, -1);
                return;
            }
            if (arg0 == 6017) {
                class94.field1158.field300 = field4883[--field4893] == 1;
                class445.method2703(24236);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6018) {
                int var201 = field4883[--field4893];
                if (var201 < 0) {
                    var201 = 0;
                }
                if (var201 > 127) {
                    var201 = 127;
                }
                class94.field1158.field276 = var201;
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6019) {
                int var202 = field4883[--field4893];
                if (var202 < 0) {
                    var202 = 0;
                }
                if (var202 > 255) {
                    var202 = 255;
                }
                if (class94.field1158.field280 != var202) {
                    if (class94.field1158.field280 == 0 && class17.field155 != -1) {
                        class255.method1610(false, var202, 0, class17.field155, 0, class524.field7765);
                        class579.field8531 = false;
                    } else if (var202 == 0) {
                        class232.method1514(false);
                        class579.field8531 = false;
                    } else {
                        class510.method3045(0, var202);
                    }
                    class94.field1158.field280 = var202;
                }
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6020) {
                int var203 = field4883[--field4893];
                if (var203 < 0) {
                    var203 = 0;
                }
                if (var203 > 127) {
                    var203 = 127;
                }
                class94.field1158.field303 = var203;
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6021) {
                class94.field1158.field6422 = field4883[--field4893] == 1;
                class552.method3230(-2617);
                return;
            }
            if (arg0 == 6023) {
                int var204 = field4883[--field4893];
                boolean var205 = false;
                if (var204 < 0) {
                    var204 = 0;
                }
                if (var204 > 2) {
                    var204 = 2;
                }
                if (class223.field3276 < 96) {
                    var204 = 0;
                    var205 = true;
                }
                class295.method1828((byte) -113, var204);
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                field4883[field4893++] = var205 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var206 = field4883[--field4893];
                if (var206 < 0 || var206 > 2) {
                    var206 = 0;
                }
                class94.field1158.field267 = var206;
                class94.field1158.method2661(class328.field4850, -1);
                return;
            }
            if (arg0 == 6025) {
                int var207 = field4883[--field4893];
                if (var207 < 0 || var207 > class390.method2353(false, class223.field3276)) {
                    var207 = 0;
                }
                class94.field1158.field278 = var207;
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6027) {
                int var208 = field4883[--field4893];
                if (var208 < 0 || var208 > 1) {
                    var208 = 0;
                }
                class99.method579((byte) -85, var208 == 1);
                return;
            }
            if (arg0 == 6028) {
                class94.field1158.field292 = field4883[--field4893] != 0;
                class94.field1158.method2661(class328.field4850, -1);
                return;
            }
            if (arg0 == 6029) {
                class94.field1158.field283 = field4883[--field4893];
                class94.field1158.method2661(class328.field4850, -1);
                return;
            }
            if (arg0 == 6030) {
                class94.field1158.field296 = field4883[--field4893] != 0;
                class94.field1158.method2661(class328.field4850, -1);
                class29.method128((byte) 124);
                return;
            }
            if (arg0 == 6031) {
                int var209 = field4883[--field4893];
                if (var209 < 0 || var209 > 5) {
                    var209 = 2;
                }
                class447.method2712(10, var209);
                return;
            }
            if (arg0 == 6032) {
                int var210 = field4883[--field4893];
                if (var210 < 0 || var210 > 5) {
                    var210 = 2;
                }
                class94.field1158.field264 = var210;
                class94.field1158.method2661(class328.field4850, -1);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6033) {
                int var211 = field4883[--field4893];
                if (var211 < 0 || var211 > 4) {
                    var211 = 2;
                }
                class94.field1158.field270 = var211;
                class94.field1158.method2661(class328.field4850, -1);
                return;
            }
            if (arg0 == 6034) {
                class94.field1158.field262 = field4883[--field4893] == 1;
                class94.field1158.method2661(class328.field4850, -1);
                class394.method2372(true);
                class393.field5714 = false;
                return;
            }
            if (arg0 == 6035) {
                class94.field1158.field6402 = field4883[--field4893] == 1;
                class29.method128((byte) 125);
                class552.method3230(-2617);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field4883[field4893++] = class94.field1158.field287;
                return;
            }
            if (arg0 == 6102) {
                field4883[field4893++] = class94.field1158.method2671(true, class239.field3499) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field4883[field4893++] = class94.field1158.field298 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field4883[field4893++] = class94.field1158.field268 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field4883[field4893++] = class94.field1158.field266 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field4883[field4893++] = class94.field1158.field283;
                return;
            }
            if (arg0 == 6108) {
                field4883[field4893++] = class94.field1158.field281 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field4883[field4893++] = class94.field1158.field290 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field4883[field4893++] = class94.field1158.field284 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field4883[field4893++] = class94.field1158.method131(false, class239.field3499);
                return;
            }
            if (arg0 == 6112) {
                field4883[field4893++] = class94.field1158.method130(-27423, class239.field3499) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field4883[field4893++] = class94.field1158.field299 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field4883[field4893++] = class94.field1158.field265 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field4883[field4893++] = class94.field1158.field285;
                return;
            }
            if (arg0 == 6117) {
                field4883[field4893++] = class94.field1158.field300 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field4883[field4893++] = class94.field1158.field276;
                return;
            }
            if (arg0 == 6119) {
                field4883[field4893++] = class94.field1158.field280;
                return;
            }
            if (arg0 == 6120) {
                field4883[field4893++] = class94.field1158.field303;
                return;
            }
            if (arg0 == 6121) {
                field4883[field4893++] = class379.field5558.method1031() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field4883[field4893++] = class640.method3707((byte) -128);
                return;
            }
            if (arg0 == 6124) {
                field4883[field4893++] = class94.field1158.field267;
                return;
            }
            if (arg0 == 6125) {
                field4883[field4893++] = class94.field1158.field278;
                return;
            }
            if (arg0 == 6126) {
                field4883[field4893++] = class379.field5558.method984() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field4883[field4893++] = class94.field1158.field297 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field4883[field4893++] = class94.field1158.field292 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field4883[field4893++] = class94.field1158.field283;
                return;
            }
            if (arg0 == 6130) {
                field4883[field4893++] = class94.field1158.field296 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field4883[field4893++] = class239.field3499;
                return;
            }
            if (arg0 == 6132) {
                field4883[field4893++] = class94.field1158.field264;
                return;
            }
            if (arg0 == 6133) {
                field4883[field4893++] = class353.field5140 == 1 || class353.field5140 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field4883[field4893++] = class390.method2353(false, class223.field3276);
                return;
            }
            if (arg0 == 6135) {
                field4883[field4893++] = class94.field1158.field270;
                return;
            }
            if (arg0 == 6136) {
                field4883[field4893++] = class94.field1158.field262 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var212 = true;
                try {
                    var212 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var295) {
                }
                field4883[field4893++] = var212 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field4893 -= 2;
                class74.field861 = (short) field4883[field4893];
                if (class74.field861 <= 0) {
                    class74.field861 = 256;
                }
                class224.field3317 = (short) field4883[field4893 + 1];
                if (class224.field3317 <= 0) {
                    class224.field3317 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field4893 -= 2;
                class70.field822 = (short) field4883[field4893];
                if (class70.field822 <= 0) {
                    class70.field822 = 256;
                }
                class290.field4262 = (short) field4883[field4893 + 1];
                if (class290.field4262 <= 0) {
                    class290.field4262 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field4893 -= 4;
                class518.field7698 = (short) field4883[field4893];
                if (class518.field7698 <= 0) {
                    class518.field7698 = 1;
                }
                class371.field5375 = (short) field4883[field4893 + 1];
                if (class371.field5375 <= 0) {
                    class371.field5375 = 32767;
                } else if (class371.field5375 < class518.field7698) {
                    class371.field5375 = class518.field7698;
                }
                class234.field3441 = (short) field4883[field4893 + 2];
                if (class234.field3441 <= 0) {
                    class234.field3441 = 1;
                }
                class162.field2162 = (short) field4883[field4893 + 3];
                if (class162.field2162 <= 0) {
                    class162.field2162 = 32767;
                    return;
                }
                if (class162.field2162 < class234.field3441) {
                    class162.field2162 = class234.field3441;
                }
                return;
            }
            if (arg0 == 6203) {
                class176.method1181(class168.field2273.field4543, true, 0, false, 0, class168.field2273.field4620);
                field4883[field4893++] = class619.field9034;
                field4883[field4893++] = class115.field1522;
                return;
            }
            if (arg0 == 6204) {
                field4883[field4893++] = class70.field822;
                field4883[field4893++] = class290.field4262;
                return;
            }
            if (arg0 == 6205) {
                field4883[field4893++] = class74.field861;
                field4883[field4893++] = class224.field3317;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field4883[field4893++] = (int) (class450.method2719((byte) -64) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field4883[field4893++] = (int) (class450.method2719((byte) -22) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field4893 -= 3;
                int var213 = field4883[field4893];
                int var214 = field4883[field4893 + 1];
                int var215 = field4883[field4893 + 2];
                field4879.clear();
                field4879.set(11, 12);
                field4879.set(var215, var214, var213);
                int var216 = (int) (field4879.getTime().getTime() / 86400000L) - 11745;
                if (var215 < 1970) {
                    var216--;
                }
                field4883[field4893++] = var216;
                return;
            }
            if (arg0 == 6303) {
                field4879.clear();
                field4879.setTime(new Date(class450.method2719((byte) 119)));
                field4883[field4893++] = field4879.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var217 = field4883[--field4893];
                boolean var218 = true;
                if (var217 < 0) {
                    var218 = (var217 + 1) % 4 == 0;
                } else if (var217 < 1582) {
                    var218 = var217 % 4 == 0;
                } else if (var217 % 4 != 0) {
                    var218 = false;
                } else if (var217 % 100 != 0) {
                    var218 = true;
                } else if (var217 % 400 != 0) {
                    var218 = false;
                }
                field4883[field4893++] = var218 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field4883[field4893++] = class170.method1088(-21793) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field4883[field4893++] = class285.method1779(3806) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class192.field2903 == 6 && class395.field5743 == 0 && class304.field4433 == 0) {
                    if (class346.field5041) {
                        field4883[field4893++] = 0;
                        return;
                    }
                    if (class281.field4179 > class450.method2719((byte) -60) - 1000L) {
                        field4883[field4893++] = 1;
                        return;
                    }
                    class346.field5041 = true;
                    class165.method1046(-3466, class403.field5784);
                    class221.field3268.method2576(true, class374.field5505);
                    field4883[field4893++] = 0;
                    return;
                }
                field4883[field4893++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class418 var219 = class177.method1184(1);
                if (var219 != null) {
                    field4883[field4893++] = var219.field6010;
                    field4883[field4893++] = var219.field5316;
                    field4884[field4891++] = var219.field6009;
                    class340 var220 = var219.method2483(15731);
                    field4883[field4893++] = var220.field4983;
                    field4884[field4891++] = var220.field4982;
                    field4883[field4893++] = var219.field5312;
                    field4883[field4893++] = var219.field6004;
                    field4884[field4891++] = var219.field6005;
                    return;
                }
                field4883[field4893++] = -1;
                field4883[field4893++] = 0;
                field4884[field4891++] = "";
                field4883[field4893++] = 0;
                field4884[field4891++] = "";
                field4883[field4893++] = 0;
                field4883[field4893++] = 0;
                field4884[field4891++] = "";
                return;
            }
            if (arg0 == 6502) {
                class418 var221 = class568.method3316(Integer.MAX_VALUE);
                if (var221 != null) {
                    field4883[field4893++] = var221.field6010;
                    field4883[field4893++] = var221.field5316;
                    field4884[field4891++] = var221.field6009;
                    class340 var222 = var221.method2483(15731);
                    field4883[field4893++] = var222.field4983;
                    field4884[field4891++] = var222.field4982;
                    field4883[field4893++] = var221.field5312;
                    field4883[field4893++] = var221.field6004;
                    field4884[field4891++] = var221.field6005;
                    return;
                }
                field4883[field4893++] = -1;
                field4883[field4893++] = 0;
                field4884[field4891++] = "";
                field4883[field4893++] = 0;
                field4884[field4891++] = "";
                field4883[field4893++] = 0;
                field4883[field4893++] = 0;
                field4884[field4891++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var223 = field4883[--field4893];
                String var224 = field4884[--field4891];
                if (class192.field2903 == 6 && class395.field5743 == 0 && class304.field4433 == 0) {
                    field4883[field4893++] = class395.method2377(var223, var224, -2) ? 1 : 0;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class94.field1158.field289 = field4883[--field4893];
                class94.field1158.method2661(class328.field4850, -1);
                return;
            }
            if (arg0 == 6505) {
                field4883[field4893++] = class94.field1158.field289;
                return;
            }
            if (arg0 == 6506) {
                int var225 = field4883[--field4893];
                class418 var226 = class627.method3658(var225, false);
                if (var226 != null) {
                    field4883[field4893++] = var226.field5316;
                    field4884[field4891++] = var226.field6009;
                    class340 var227 = var226.method2483(15731);
                    field4883[field4893++] = var227.field4983;
                    field4884[field4891++] = var227.field4982;
                    field4883[field4893++] = var226.field5312;
                    field4883[field4893++] = var226.field6004;
                    field4884[field4891++] = var226.field6005;
                    return;
                }
                field4883[field4893++] = -1;
                field4884[field4891++] = "";
                field4883[field4893++] = 0;
                field4884[field4891++] = "";
                field4883[field4893++] = 0;
                field4883[field4893++] = 0;
                field4884[field4891++] = "";
                return;
            }
            if (arg0 == 6507) {
                field4893 -= 4;
                int var228 = field4883[field4893];
                boolean var229 = field4883[field4893 + 1] == 1;
                int var230 = field4883[field4893 + 2];
                boolean var231 = field4883[field4893 + 3] == 1;
                class541.method3178(var228, var230, var229, (byte) 14, var231);
                return;
            }
            if (arg0 == 6508) {
                class479.method2907((byte) -29);
                return;
            }
            if (arg0 == 6509) {
                if (class192.field2903 != 6) {
                    return;
                }
                class257.field3756 = field4883[--field4893] == 1;
                return;
            }
            if (arg0 == 6510) {
                field4883[field4893++] = class83.field981;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class94.field1158.field301 = field4883[--field4893] == 1;
                class94.field1158.method2661(class328.field4850, -1);
                return;
            }
            if (arg0 == 6601) {
                field4883[field4893++] = class94.field1158.field301 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class377.field5548 == class338.field4956) {
            if (arg0 == 6700) {
                int var232 = class600.field8865.method1337(0);
                if (class540.field8007 != -1) {
                    var232++;
                }
                field4883[field4893++] = var232;
                return;
            }
            if (arg0 == 6701) {
                int var233 = field4883[--field4893];
                if (class540.field8007 != -1) {
                    if (var233 == 0) {
                        field4883[field4893++] = class540.field8007;
                        return;
                    }
                    var233--;
                }
                class184 var234 = (class184) class600.field8865.method1331(-1925);
                while (var233-- > 0) {
                    var234 = (class184) class600.field8865.method1340((byte) -103);
                }
                field4883[field4893++] = var234.field2796;
                return;
            }
            if (arg0 == 6702) {
                int var235 = field4883[--field4893];
                if (class251.field3650[var235] == null) {
                    field4884[field4891++] = "";
                    return;
                }
                String var236 = class251.field3650[var235][0].field4575;
                if (var236 == null) {
                    field4884[field4891++] = "";
                    return;
                }
                field4884[field4891++] = var236.substring(0, var236.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var237 = field4883[--field4893];
                if (class251.field3650[var237] == null) {
                    field4883[field4893++] = 0;
                    return;
                }
                field4883[field4893++] = class251.field3650[var237].length;
                return;
            }
            if (arg0 == 6704) {
                field4893 -= 2;
                int var238 = field4883[field4893];
                int var239 = field4883[field4893 + 1];
                if (class251.field3650[var238] == null) {
                    field4884[field4891++] = "";
                    return;
                }
                String var240 = class251.field3650[var238][var239].field4575;
                if (var240 == null) {
                    field4884[field4891++] = "";
                    return;
                }
                field4884[field4891++] = var240;
                return;
            }
            if (arg0 == 6705) {
                field4893 -= 2;
                int var241 = field4883[field4893];
                int var242 = field4883[field4893 + 1];
                if (class251.field3650[var241] == null) {
                    field4883[field4893++] = 0;
                    return;
                }
                field4883[field4893++] = class251.field3650[var241][var242].field4637;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field4893 -= 3;
                int var243 = field4883[field4893];
                int var244 = field4883[field4893 + 1];
                int var245 = field4883[field4893 + 2];
                class106.method628((byte) 89, 1, var245, var243 << 16 | var244, "");
                return;
            }
            if (arg0 == 6708) {
                field4893 -= 3;
                int var246 = field4883[field4893];
                int var247 = field4883[field4893 + 1];
                int var248 = field4883[field4893 + 2];
                class106.method628((byte) -118, 2, var248, var246 << 16 | var247, "");
                return;
            }
            if (arg0 == 6709) {
                field4893 -= 3;
                int var249 = field4883[field4893];
                int var250 = field4883[field4893 + 1];
                int var251 = field4883[field4893 + 2];
                class106.method628((byte) 58, 3, var251, var249 << 16 | var250, "");
                return;
            }
            if (arg0 == 6710) {
                field4893 -= 3;
                int var252 = field4883[field4893];
                int var253 = field4883[field4893 + 1];
                int var254 = field4883[field4893 + 2];
                class106.method628((byte) 73, 4, var254, var252 << 16 | var253, "");
                return;
            }
            if (arg0 == 6711) {
                field4893 -= 3;
                int var255 = field4883[field4893];
                int var256 = field4883[field4893 + 1];
                int var257 = field4883[field4893 + 2];
                class106.method628((byte) 112, 5, var257, var255 << 16 | var256, "");
                return;
            }
            if (arg0 == 6712) {
                field4893 -= 3;
                int var258 = field4883[field4893];
                int var259 = field4883[field4893 + 1];
                int var260 = field4883[field4893 + 2];
                class106.method628((byte) 104, 6, var260, var258 << 16 | var259, "");
                return;
            }
            if (arg0 == 6713) {
                field4893 -= 3;
                int var261 = field4883[field4893];
                int var262 = field4883[field4893 + 1];
                int var263 = field4883[field4893 + 2];
                class106.method628((byte) -116, 7, var263, var261 << 16 | var262, "");
                return;
            }
            if (arg0 == 6714) {
                field4893 -= 3;
                int var264 = field4883[field4893];
                int var265 = field4883[field4893 + 1];
                int var266 = field4883[field4893 + 2];
                class106.method628((byte) -94, 8, var266, var264 << 16 | var265, "");
                return;
            }
            if (arg0 == 6715) {
                field4893 -= 3;
                int var267 = field4883[field4893];
                int var268 = field4883[field4893 + 1];
                int var269 = field4883[field4893 + 2];
                class106.method628((byte) 97, 9, var269, var267 << 16 | var268, "");
                return;
            }
            if (arg0 == 6716) {
                field4893 -= 3;
                int var270 = field4883[field4893];
                int var271 = field4883[field4893 + 1];
                int var272 = field4883[field4893 + 2];
                class106.method628((byte) 117, 10, var272, var270 << 16 | var271, "");
                return;
            }
            if (arg0 == 6717) {
                field4893 -= 3;
                int var273 = field4883[field4893];
                int var274 = field4883[field4893 + 1];
                int var275 = field4883[field4893 + 2];
                class311 var276 = class240.method1540(var273 << 16 | var274, var275, true);
                class178.method1188((byte) 125);
                class605 var277 = client.method3619(var276);
                class494.method2988(5, var277.field8910, var276, var277.method3517((byte) 58));
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var278 = field4883[--field4893];
                class42 var279 = class540.field8011.method1213(var278, 6);
                if (var279.field483 == null) {
                    field4884[field4891++] = "";
                    return;
                }
                field4884[field4891++] = var279.field483;
                return;
            }
            if (arg0 == 6801) {
                int var280 = field4883[--field4893];
                class42 var281 = class540.field8011.method1213(var280, 6);
                field4883[field4893++] = var281.field511;
                return;
            }
            if (arg0 == 6802) {
                int var282 = field4883[--field4893];
                class42 var283 = class540.field8011.method1213(var282, 6);
                field4883[field4893++] = var283.field476;
                return;
            }
            if (arg0 == 6803) {
                int var284 = field4883[--field4893];
                class42 var285 = class540.field8011.method1213(var284, 6);
                field4883[field4893++] = var285.field470;
                return;
            }
            if (arg0 == 6804) {
                field4893 -= 2;
                int var286 = field4883[field4893];
                int var287 = field4883[field4893 + 1];
                class173 var288 = class8.field74.method3290(var287, 30883);
                if (var288.method1095((byte) 46)) {
                    field4884[field4891++] = class540.field8011.method1213(var286, 6).method219(var287, 10773, var288.field2338);
                    return;
                }
                field4883[field4893++] = class540.field8011.method1213(var286, 6).method218(-1, var287, var288.field2339);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field4883[field4893++] = class506.field7545 && !class80.field916 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field4883[field4893++] = class25.field232;
                return;
            }
            if (arg0 == 6902) {
                field4883[field4893++] = class543.field8114;
                return;
            }
            if (arg0 == 6903) {
                field4883[field4893++] = class122.field1581;
                return;
            }
            if (arg0 == 6904) {
                field4883[field4893++] = class576.field8498;
                return;
            }
            if (arg0 == 6905) {
                String var289 = "";
                if (class50.field597 != null) {
                    if (class50.field597.field4213 == null) {
                        var289 = class68.method416(class50.field597.field4210, 31621);
                    } else {
                        var289 = (String) class50.field597.field4213;
                    }
                }
                field4884[field4891++] = var289;
                return;
            }
            if (arg0 == 6906) {
                field4883[field4893++] = class178.field2699;
                return;
            }
            if (arg0 == 6907) {
                field4883[field4893++] = class600.field8868;
                return;
            }
            if (arg0 == 6908) {
                field4883[field4893++] = class109.field1383;
                return;
            }
            if (arg0 == 6909) {
                field4883[field4893++] = class30.field306 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field4883[field4893++] = class252.field3689;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var290 = class94.field1158.method2665((byte) -85);
                field4883[field4893++] = class94.field1158.field6427 = class239.field3499;
                field4883[field4893++] = var290;
                class29.method128((byte) 124);
                return;
            }
            if (arg0 == 7001) {
                class94.field1158.method2657(-47);
                class29.method128((byte) 124);
                return;
            }
            if (arg0 == 7002) {
                class94.field1158.method2664(false);
                class29.method128((byte) 126);
                return;
            }
            if (arg0 == 7003) {
                class94.field1158.method2660(true);
                class29.method128((byte) 126);
                return;
            }
            if (arg0 == 7004) {
                class94.field1158.method2666(0);
                class29.method128((byte) 124);
                return;
            }
            if (arg0 == 7005) {
                class94.field1158.field288 = 0;
                return;
            }
            if (arg0 == 7006) {
                if (class94.field1158.field6427 == 2) {
                    class94.field1158.field6420 = true;
                    return;
                }
                if (class94.field1158.field6427 == 1) {
                    class94.field1158.field6411 = true;
                    return;
                }
                if (class94.field1158.field6427 == 3) {
                    class94.field1158.field6419 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field4883[field4893++] = class94.field1158.field288;
                return;
            }
            if (arg0 == 7008) {
                if (class239.field3499 == 0 && class223.field3276 < 96) {
                    field4883[field4893++] = 2;
                    return;
                }
                field4883[field4893++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lln;I)V", line = 3863)
    private static final void method2076(class94 arg0, int arg1) {
        field4893 = 0;
        field4891 = 0;
        int var2 = -1;
        int[] var3 = arg0.field1162;
        int[] var4 = arg0.field1159;
        byte var5 = -1;
        field4898 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method2077(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2075(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field4883[field4893++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field4883[field4893++] = class406.field5823.field1405[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class406.field5823.method656(var8, field4883[--field4893], true);
                } else if (var43 == 3) {
                    field4884[field4891++] = arg0.field1156[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field4893 -= 2;
                    if (field4883[field4893 + 1] != field4883[field4893]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field4893 -= 2;
                    if (field4883[field4893 + 1] == field4883[field4893]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field4893 -= 2;
                    if (field4883[field4893] < field4883[field4893 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field4893 -= 2;
                    if (field4883[field4893] > field4883[field4893 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field4898 == 0) {
                        return;
                    }
                    class172 var9 = field4897[--field4898];
                    arg0 = var9.field2328;
                    var3 = arg0.field1162;
                    var4 = arg0.field1159;
                    var2 = var9.field2327;
                    field4881 = var9.field2330;
                    field4895 = var9.field2332;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field4883[field4893++] = class406.field5823.method653(var10, -11730);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class406.field5823.method652(var11, (byte) -128, field4883[--field4893]);
                } else if (var43 == 31) {
                    field4893 -= 2;
                    if (field4883[field4893] <= field4883[field4893 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field4893 -= 2;
                    if (field4883[field4893] >= field4883[field4893 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field4883[field4893++] = field4881[var4[var2]];
                } else if (var43 == 34) {
                    field4881[var4[var2]] = field4883[--field4893];
                } else if (var43 == 35) {
                    field4884[field4891++] = field4895[var4[var2]];
                } else if (var43 == 36) {
                    field4895[var4[var2]] = field4884[--field4891];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field4891 -= var12;
                    String var13 = class591.method3448(100, field4891, field4884, var12);
                    field4884[field4891++] = var13;
                } else if (var43 == 38) {
                    field4893--;
                } else if (var43 == 39) {
                    field4891--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class94 var15 = class128.method797((byte) 126, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field1166];
                    String[] var17 = new String[var15.field1157];
                    for (int var18 = 0; var18 < var15.field1161; var18++) {
                        var16[var18] = field4883[field4893 + var18 - var15.field1161];
                    }
                    for (int var19 = 0; var19 < var15.field1169; var19++) {
                        var17[var19] = field4884[field4891 + var19 - var15.field1169];
                    }
                    field4893 -= var15.field1161;
                    field4891 -= var15.field1169;
                    class172 var20 = new class172();
                    var20.field2328 = arg0;
                    var20.field2327 = var2;
                    var20.field2330 = field4881;
                    var20.field2332 = field4895;
                    if (field4898 >= field4897.length) {
                        throw new RuntimeException();
                    }
                    field4897[field4898++] = var20;
                    arg0 = var15;
                    var3 = var15.field1162;
                    var4 = var15.field1159;
                    var2 = -1;
                    field4881 = var16;
                    field4895 = var17;
                } else if (var43 == 42) {
                    field4883[field4893++] = class526.field7774[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class526.field7774[var21] = field4883[--field4893];
                    class51.method261(var21, 1000);
                    class528.field7834 |= class595.field8769[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field4883[--field4893];
                    if (var24 >= 0 && var24 <= 5000) {
                        field4875[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field4899[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field4883[--field4893];
                    if (var28 < 0 || var28 >= field4875[var27]) {
                        throw new RuntimeException();
                    }
                    field4883[field4893++] = field4899[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field4893 -= 2;
                    int var30 = field4883[field4893];
                    if (var30 < 0 || var30 >= field4875[var29]) {
                        throw new RuntimeException();
                    }
                    field4899[var29][var30] = field4883[field4893 + 1];
                } else if (var43 == 47) {
                    String var31 = class242.field3547[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field4884[field4891++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class242.field3547[var32] = field4884[--field4891];
                    class524.method3095(-12124, var32);
                } else if (var43 == 51) {
                    class205 var33 = arg0.field1168[var4[var2]];
                    class269 var34 = (class269) var33.method1333((long) field4883[--field4893], false);
                    if (var34 != null) {
                        var2 += var34.field3986;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field1163 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field7465).append(" ");
                for (int var41 = field4898 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field4897[var41].field2328.field7465).append(" ");
                }
                var40.append("op: ").append(var5);
                class31.method140(var40.toString(), -122, var42);
            } else {
                class62.method389("Clientscript error in: " + arg0.field1163, 0);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field1163).append("\n");
                for (int var38 = field4898 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field4897[var38].field2328.field1163).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class31.method140(var37.toString(), -102, var42);
                class492.method2982(var37.toString(), (byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(IZ)V", line = 4308)
    private static final void method2077(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field4893 -= 3;
                int var2 = field4883[field4893];
                int var3 = field4883[field4893 + 1];
                int var4 = field4883[field4893 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class311 var5 = class436.method2659(true, var2);
                if (var5.field4652 == null) {
                    var5.field4652 = new class311[var4 + 1];
                }
                if (var5.field4652.length <= var4) {
                    class311[] var6 = new class311[var4 + 1];
                    for (int var7 = 0; var7 < var5.field4652.length; var7++) {
                        var6[var7] = var5.field4652[var7];
                    }
                    var5.field4652 = var6;
                }
                if (var4 > 0 && var5.field4652[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class311 var8 = new class311();
                var8.field4655 = var3;
                var8.field4551 = var8.field4667 = var5.field4667;
                var8.field4558 = var4;
                var5.field4652[var4] = var8;
                if (arg1) {
                    field4887 = var8;
                } else {
                    field4896 = var8;
                }
                class619.method3586(107, var5);
                return;
            }
            if (arg0 == 101) {
                class311 var9 = arg1 ? field4887 : field4896;
                if (var9.field4558 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class311 var10 = class436.method2659(true, var9.field4667);
                var10.field4652[var9.field4558] = null;
                class619.method3586(53, var10);
                return;
            }
            if (arg0 == 102) {
                class311 var11 = class436.method2659(true, field4883[--field4893]);
                var11.field4652 = null;
                class619.method3586(100, var11);
                return;
            }
            if (arg0 == 200) {
                field4893 -= 2;
                int var12 = field4883[field4893];
                int var13 = field4883[field4893 + 1];
                class311 var14 = class240.method1540(var12, var13, true);
                if (var14 != null && var13 != -1) {
                    field4883[field4893++] = 1;
                    if (arg1) {
                        field4887 = var14;
                        return;
                    }
                    field4896 = var14;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field4883[--field4893];
                class311 var16 = class436.method2659(true, var15);
                if (var16 != null) {
                    field4883[field4893++] = 1;
                    if (arg1) {
                        field4887 = var16;
                        return;
                    }
                    field4896 = var16;
                    return;
                }
                field4883[field4893++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field4883[--field4893];
                method2069(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field4883[--field4893];
                method2071(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field4893 -= 2;
                int var19 = field4883[field4893];
                int var20 = field4883[field4893 + 1];
                for (int var21 = 0; var21 < class297.field4342.length; var21++) {
                    if (class297.field4342[var21] == var19) {
                        class239.field3493.field2711.method1080(class42.field507, (byte) -50, var21, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class206.field3068.length; var22++) {
                    if (class206.field3068[var22] == var19) {
                        class239.field3493.field2711.method1080(class42.field507, (byte) -50, var22, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field4893 -= 2;
                int var23 = field4883[field4893];
                int var24 = field4883[field4893 + 1];
                class239.field3493.field2711.method1085(1, var24, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field4883[--field4893] != 0;
                class239.field3493.field2711.method1083(var25, true);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class311 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class436.method2659(true, field4883[--field4893]);
            } else {
                var26 = arg1 ? field4887 : field4896;
            }
            if (arg0 == 1000) {
                field4893 -= 4;
                var26.field4529 = field4883[field4893];
                var26.field4671 = field4883[field4893 + 1];
                int var27 = field4883[field4893 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field4883[field4893 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field4538 = (byte) var27;
                var26.field4576 = (byte) var28;
                class619.method3586(66, var26);
                class628.method3666(116, var26);
                if (var26.field4558 == -1) {
                    class529.method3123((byte) 11, var26.field4667);
                }
                return;
            }
            if (arg0 == 1001) {
                field4893 -= 4;
                var26.field4546 = field4883[field4893];
                var26.field4536 = field4883[field4893 + 1];
                var26.field4612 = 0;
                var26.field4646 = 0;
                int var29 = field4883[field4893 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field4883[field4893 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field4679 = (byte) var29;
                var26.field4617 = (byte) var30;
                class619.method3586(105, var26);
                class628.method3666(126, var26);
                if (var26.field4655 == 0) {
                    class613.method3570(-26662, var26, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field4883[--field4893] == 1;
                if (var26.field4577 != var31) {
                    var26.field4577 = var31;
                    class619.method3586(72, var26);
                }
                if (var26.field4558 == -1) {
                    class139.method845(var26.field4667, (byte) 98);
                }
                return;
            }
            if (arg0 == 1004) {
                field4893 -= 2;
                var26.field4677 = field4883[field4893];
                var26.field4588 = field4883[field4893 + 1];
                class619.method3586(39, var26);
                class628.method3666(118, var26);
                if (var26.field4655 == 0) {
                    class613.method3570(-26662, var26, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field4574 = field4883[--field4893] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class311 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class436.method2659(true, field4883[--field4893]);
            } else {
                var32 = arg1 ? field4887 : field4896;
            }
            if (arg0 == 1100) {
                field4893 -= 2;
                var32.field4672 = field4883[field4893];
                if (var32.field4672 > var32.field4606 - var32.field4543) {
                    var32.field4672 = var32.field4606 - var32.field4543;
                }
                if (var32.field4672 < 0) {
                    var32.field4672 = 0;
                }
                var32.field4668 = field4883[field4893 + 1];
                if (var32.field4668 > var32.field4581 - var32.field4620) {
                    var32.field4668 = var32.field4581 - var32.field4620;
                }
                if (var32.field4668 < 0) {
                    var32.field4668 = 0;
                }
                class619.method3586(99, var32);
                if (var32.field4558 == -1) {
                    class145.method859(var32.field4667, -9);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field4562 = field4883[--field4893];
                class619.method3586(78, var32);
                if (var32.field4558 == -1) {
                    class227.method1483(var32.field4667, (byte) 125);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field4666 = field4883[--field4893] == 1;
                class619.method3586(66, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field4653 = field4883[--field4893];
                class619.method3586(71, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field4584 = field4883[--field4893];
                class619.method3586(76, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field4883[--field4893];
                if (var32.field4589 != var33) {
                    var32.field4589 = var33;
                    class619.method3586(63, var32);
                }
                if (var32.field4558 == -1) {
                    class584.method3408(var32.field4667, (byte) 68);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field4599 = field4883[--field4893];
                class619.method3586(86, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field4587 = field4883[--field4893] == 1;
                class619.method3586(42, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field4535 = 1;
                var32.field4650 = field4883[--field4893];
                class619.method3586(108, var32);
                if (var32.field4558 == -1) {
                    class424.method2512((byte) 21, var32.field4667);
                }
                return;
            }
            if (arg0 == 1109) {
                field4893 -= 6;
                var32.field4564 = field4883[field4893];
                var32.field4537 = field4883[field4893 + 1];
                var32.field4528 = field4883[field4893 + 2];
                var32.field4594 = field4883[field4893 + 3];
                var32.field4605 = field4883[field4893 + 4];
                var32.field4643 = field4883[field4893 + 5];
                class619.method3586(51, var32);
                if (var32.field4558 == -1) {
                    class261.method1653(var32.field4667, (byte) -94);
                    class562.method3287((byte) 98, var32.field4667);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field4883[--field4893];
                if (var32.field4628 != var34) {
                    var32.field4628 = var34;
                    var32.field4613 = 0;
                    var32.field4516 = 1;
                    var32.field4542 = 0;
                    class619.method3586(12, var32);
                }
                if (var32.field4558 == -1) {
                    class151.method882(var32.field4667, (byte) -77);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field4552 = field4883[--field4893] == 1;
                class619.method3586(67, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field4884[--field4891];
                if (!var35.equals(var32.field4539)) {
                    var32.field4539 = var35;
                    class619.method3586(55, var32);
                }
                if (var32.field4558 == -1) {
                    class266.method1700((byte) 115, var32.field4667);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field4522 = field4883[--field4893];
                class619.method3586(18, var32);
                if (var32.field4558 == -1) {
                    class632.method3676((byte) 84, var32.field4667);
                }
                return;
            }
            if (arg0 == 1114) {
                field4893 -= 3;
                var32.field4619 = field4883[field4893];
                var32.field4556 = field4883[field4893 + 1];
                var32.field4525 = field4883[field4893 + 2];
                class619.method3586(43, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field4521 = field4883[--field4893] == 1;
                class619.method3586(75, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field4597 = field4883[--field4893];
                class619.method3586(46, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field4557 = field4883[--field4893];
                class619.method3586(127, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field4572 = field4883[--field4893] == 1;
                class619.method3586(95, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field4645 = field4883[--field4893] == 1;
                class619.method3586(84, var32);
                return;
            }
            if (arg0 == 1120) {
                field4893 -= 2;
                var32.field4606 = field4883[field4893];
                var32.field4581 = field4883[field4893 + 1];
                class619.method3586(94, var32);
                if (var32.field4655 == 0) {
                    class613.method3570(-26662, var32, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field4893 -= 2;
                var32.field4604 = (short) field4883[field4893];
                var32.field4603 = (short) field4883[field4893 + 1];
                class619.method3586(71, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field4618 = field4883[--field4893] == 1;
                class619.method3586(46, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field4643 = field4883[--field4893];
                class619.method3586(58, var32);
                if (var32.field4558 == -1) {
                    class261.method1653(var32.field4667, (byte) -94);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field4883[--field4893];
                var32.field4519 = var36 == 1;
                class619.method3586(35, var32);
                return;
            }
            if (arg0 == 1125) {
                field4893 -= 2;
                var32.field4640 = field4883[field4893];
                var32.field4664 = field4883[field4893 + 1];
                class619.method3586(107, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field4565 = field4883[--field4893];
                class619.method3586(25, var32);
                return;
            }
            if (arg0 == 1127) {
                field4893 -= 2;
                int var37 = field4883[field4893];
                int var38 = field4883[field4893 + 1];
                class173 var39 = class8.field74.method3290(var37, 30883);
                if (var39.field2339 != var38) {
                    var32.method1909(var37, var38, (byte) -73);
                    return;
                }
                var32.method1907((byte) 10, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field4883[--field4893];
                String var41 = field4884[--field4891];
                class173 var42 = class8.field74.method3290(var40, 30883);
                if (!var42.field2338.equals(var41)) {
                    var32.method1908(var40, var41, false);
                    return;
                }
                var32.method1907((byte) 10, var40);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class311 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class436.method2659(true, field4883[--field4893]);
            } else {
                var43 = arg1 ? field4887 : field4896;
            }
            class619.method3586(32, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field4893 -= 2;
                int var44 = field4883[field4893];
                int var45 = field4883[field4893 + 1];
                if (var43.field4558 == -1) {
                    class632.method3680((byte) -71, var43.field4667);
                    class261.method1653(var43.field4667, (byte) -94);
                    class562.method3287((byte) 103, var43.field4667);
                }
                if (var44 == -1) {
                    var43.field4535 = 1;
                    var43.field4650 = -1;
                    var43.field4661 = -1;
                    return;
                }
                var43.field4661 = var44;
                var43.field4527 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field4615 = true;
                } else {
                    var43.field4615 = false;
                }
                class414 var46 = class216.field3204.method3357(var44, (byte) -68);
                var43.field4528 = var46.field5967;
                var43.field4594 = var46.field5950;
                var43.field4605 = var46.field5912;
                var43.field4564 = var46.field5938;
                var43.field4537 = var46.field5940;
                var43.field4643 = var46.field5943;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field4526 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field4526 = 1;
                } else {
                    var43.field4526 = 2;
                }
                if (var43.field4612 > 0) {
                    var43.field4643 = var43.field4643 * 32 / var43.field4612;
                    return;
                }
                if (var43.field4546 > 0) {
                    var43.field4643 = var43.field4643 * 32 / var43.field4546;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field4535 = 2;
                var43.field4650 = field4883[--field4893];
                if (var43.field4558 == -1) {
                    class424.method2512((byte) 21, var43.field4667);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field4535 = 3;
                var43.field4650 = -1;
                if (var43.field4558 == -1) {
                    class424.method2512((byte) 21, var43.field4667);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field4535 = 6;
                var43.field4650 = field4883[--field4893];
                if (var43.field4558 == -1) {
                    class424.method2512((byte) 21, var43.field4667);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field4535 = 5;
                var43.field4650 = field4883[--field4893];
                if (var43.field4558 == -1) {
                    class424.method2512((byte) 21, var43.field4667);
                }
                return;
            }
            if (arg0 == 1206) {
                field4893 -= 4;
                var43.field4680 = field4883[field4893];
                var43.field4608 = field4883[field4893 + 1];
                var43.field4636 = field4883[field4893 + 2];
                var43.field4657 = field4883[field4893 + 3];
                class619.method3586(11, var43);
                return;
            }
            if (arg0 == 1207) {
                field4893 -= 2;
                var43.field4631 = field4883[field4893];
                var43.field4520 = field4883[field4893 + 1];
                class619.method3586(26, var43);
                return;
            }
            if (arg0 == 1210) {
                field4893 -= 4;
                var43.field4650 = field4883[field4893];
                var43.field4624 = field4883[field4893 + 1];
                if (field4883[field4893 + 2] == 1) {
                    var43.field4535 = 9;
                } else {
                    var43.field4535 = 8;
                }
                if (field4883[field4893 + 3] == 1) {
                    var43.field4615 = true;
                } else {
                    var43.field4615 = false;
                }
                if (var43.field4558 == -1) {
                    class424.method2512((byte) 21, var43.field4667);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field4535 = 5;
                var43.field4650 = class404.field5807;
                var43.field4624 = 0;
                if (var43.field4558 == -1) {
                    class424.method2512((byte) 21, var43.field4667);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class311 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class436.method2659(true, field4883[--field4893]);
                } else {
                    var58 = arg1 ? field4887 : field4896;
                }
                String var59 = field4884[--field4891];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field4883[--field4893];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field4883[--field4893];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field4884[--field4891];
                    } else {
                        var62[var63] = Integer.valueOf(field4883[--field4893]);
                    }
                }
                int var64 = field4883[--field4893];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field4518 = var62;
                } else if (arg0 == 1401) {
                    var58.field4609 = var62;
                } else if (arg0 == 1402) {
                    var58.field4549 = var62;
                } else if (arg0 == 1403) {
                    var58.field4674 = var62;
                } else if (arg0 == 1404) {
                    var58.field4595 = var62;
                } else if (arg0 == 1405) {
                    var58.field4600 = var62;
                } else if (arg0 == 1406) {
                    var58.field4532 = var62;
                } else if (arg0 == 1407) {
                    var58.field4663 = var62;
                    var58.field4573 = var60;
                } else if (arg0 == 1408) {
                    var58.field4684 = var62;
                } else if (arg0 == 1409) {
                    var58.field4651 = var62;
                } else if (arg0 == 1410) {
                    var58.field4586 = var62;
                } else if (arg0 == 1411) {
                    var58.field4579 = var62;
                } else if (arg0 == 1412) {
                    var58.field4622 = var62;
                } else if (arg0 == 1414) {
                    var58.field4550 = var62;
                    var58.field4563 = var60;
                } else if (arg0 == 1415) {
                    var58.field4632 = var62;
                    var58.field4625 = var60;
                } else if (arg0 == 1416) {
                    var58.field4644 = var62;
                } else if (arg0 == 1417) {
                    var58.field4590 = var62;
                } else if (arg0 == 1418) {
                    var58.field4660 = var62;
                } else if (arg0 == 1419) {
                    var58.field4601 = var62;
                } else if (arg0 == 1420) {
                    var58.field4665 = var62;
                } else if (arg0 == 1421) {
                    var58.field4533 = var62;
                } else if (arg0 == 1422) {
                    var58.field4555 = var62;
                } else if (arg0 == 1423) {
                    var58.field4614 = var62;
                } else if (arg0 == 1424) {
                    var58.field4611 = var62;
                } else if (arg0 == 1425) {
                    var58.field4570 = var62;
                } else if (arg0 == 1426) {
                    var58.field4566 = var62;
                } else if (arg0 == 1427) {
                    var58.field4517 = var62;
                } else if (arg0 == 1428) {
                    var58.field4681 = var62;
                    var58.field4591 = var60;
                } else if (arg0 == 1429) {
                    var58.field4616 = var62;
                    var58.field4560 = var60;
                } else if (arg0 == 1430) {
                    var58.field4673 = var62;
                }
                var58.field4662 = true;
                return;
            }
            if (arg0 < 1600) {
                class311 var65 = arg1 ? field4887 : field4896;
                if (arg0 == 1500) {
                    field4883[field4893++] = var65.field4596;
                    return;
                }
                if (arg0 == 1501) {
                    field4883[field4893++] = var65.field4568;
                    return;
                }
                if (arg0 == 1502) {
                    field4883[field4893++] = var65.field4543;
                    return;
                }
                if (arg0 == 1503) {
                    field4883[field4893++] = var65.field4620;
                    return;
                }
                if (arg0 == 1504) {
                    field4883[field4893++] = var65.field4577 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field4883[field4893++] = var65.field4551;
                    return;
                }
                if (arg0 == 1506) {
                    class311 var66 = class272.method1723(-1, var65);
                    field4883[field4893++] = var66 == null ? -1 : var66.field4667;
                    return;
                }
            } else if (arg0 < 1700) {
                class311 var67 = arg1 ? field4887 : field4896;
                if (arg0 == 1600) {
                    field4883[field4893++] = var67.field4672;
                    return;
                }
                if (arg0 == 1601) {
                    field4883[field4893++] = var67.field4668;
                    return;
                }
                if (arg0 == 1602) {
                    field4884[field4891++] = var67.field4539;
                    return;
                }
                if (arg0 == 1603) {
                    field4883[field4893++] = var67.field4606;
                    return;
                }
                if (arg0 == 1604) {
                    field4883[field4893++] = var67.field4581;
                    return;
                }
                if (arg0 == 1605) {
                    field4883[field4893++] = var67.field4643;
                    return;
                }
                if (arg0 == 1606) {
                    field4883[field4893++] = var67.field4528;
                    return;
                }
                if (arg0 == 1607) {
                    field4883[field4893++] = var67.field4605;
                    return;
                }
                if (arg0 == 1608) {
                    field4883[field4893++] = var67.field4594;
                    return;
                }
                if (arg0 == 1609) {
                    field4883[field4893++] = var67.field4653;
                    return;
                }
                if (arg0 == 1610) {
                    field4883[field4893++] = var67.field4564;
                    return;
                }
                if (arg0 == 1611) {
                    field4883[field4893++] = var67.field4537;
                    return;
                }
                if (arg0 == 1612) {
                    field4883[field4893++] = var67.field4589;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field4883[--field4893];
                    class173 var69 = class8.field74.method3290(var68, 30883);
                    if (var69.method1095((byte) 46)) {
                        field4884[field4891++] = var67.method1912(var69.field2338, var68, (byte) 107);
                        return;
                    }
                    field4883[field4893++] = var67.method1913((byte) 13, var69.field2339, var68);
                    return;
                }
            } else if (arg0 < 1800) {
                class311 var70 = arg1 ? field4887 : field4896;
                if (arg0 == 1700) {
                    field4883[field4893++] = var70.field4661;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field4661 != -1) {
                        field4883[field4893++] = var70.field4527;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field4883[field4893++] = var70.field4558;
                    return;
                }
            } else if (arg0 < 1900) {
                class311 var71 = arg1 ? field4887 : field4896;
                if (arg0 == 1800) {
                    field4883[field4893++] = client.method3619(var71).method3517((byte) 56);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field4883[--field4893];
                    int var334 = var72 - 1;
                    if (var71.field4567 != null && var334 < var71.field4567.length && var71.field4567[var334] != null) {
                        field4884[field4891++] = var71.field4567[var334];
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field4531 == null) {
                        field4884[field4891++] = "";
                        return;
                    }
                    field4884[field4891++] = var71.field4531;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class311 var332;
                if (arg0 >= 2000) {
                    var332 = class436.method2659(true, field4883[--field4893]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field4887 : field4896;
                }
                if (field4903 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field4517 == null) {
                        return;
                    }
                    class355 var333 = new class355();
                    var333.field5150 = var332;
                    var333.field5160 = var332.field4517;
                    var333.field5162 = field4903 + 1;
                    class50.field595.method2492(var333, (byte) 41);
                    return;
                }
            } else if (arg0 < 2600) {
                class311 var73 = class436.method2659(true, field4883[--field4893]);
                if (arg0 == 2500) {
                    field4883[field4893++] = var73.field4596;
                    return;
                }
                if (arg0 == 2501) {
                    field4883[field4893++] = var73.field4568;
                    return;
                }
                if (arg0 == 2502) {
                    field4883[field4893++] = var73.field4543;
                    return;
                }
                if (arg0 == 2503) {
                    field4883[field4893++] = var73.field4620;
                    return;
                }
                if (arg0 == 2504) {
                    field4883[field4893++] = var73.field4577 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field4883[field4893++] = var73.field4551;
                    return;
                }
                if (arg0 == 1506) {
                    class311 var74 = class272.method1723(-1, var73);
                    field4883[field4893++] = var74 == null ? -1 : var74.field4667;
                    return;
                }
            } else if (arg0 < 2700) {
                class311 var75 = class436.method2659(true, field4883[--field4893]);
                if (arg0 == 2600) {
                    field4883[field4893++] = var75.field4672;
                    return;
                }
                if (arg0 == 2601) {
                    field4883[field4893++] = var75.field4668;
                    return;
                }
                if (arg0 == 2602) {
                    field4884[field4891++] = var75.field4539;
                    return;
                }
                if (arg0 == 2603) {
                    field4883[field4893++] = var75.field4606;
                    return;
                }
                if (arg0 == 2604) {
                    field4883[field4893++] = var75.field4581;
                    return;
                }
                if (arg0 == 2605) {
                    field4883[field4893++] = var75.field4643;
                    return;
                }
                if (arg0 == 2606) {
                    field4883[field4893++] = var75.field4528;
                    return;
                }
                if (arg0 == 2607) {
                    field4883[field4893++] = var75.field4605;
                    return;
                }
                if (arg0 == 2608) {
                    field4883[field4893++] = var75.field4594;
                    return;
                }
                if (arg0 == 2609) {
                    field4883[field4893++] = var75.field4653;
                    return;
                }
                if (arg0 == 2610) {
                    field4883[field4893++] = var75.field4564;
                    return;
                }
                if (arg0 == 2611) {
                    field4883[field4893++] = var75.field4537;
                    return;
                }
                if (arg0 == 2612) {
                    field4883[field4893++] = var75.field4589;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class311 var76 = class436.method2659(true, field4883[--field4893]);
                    field4883[field4893++] = var76.field4661;
                    return;
                }
                if (arg0 == 2701) {
                    class311 var77 = class436.method2659(true, field4883[--field4893]);
                    if (var77.field4661 != -1) {
                        field4883[field4893++] = var77.field4527;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field4883[--field4893];
                    class184 var79 = (class184) class600.field8865.method1333((long) var78, false);
                    if (var79 != null) {
                        field4883[field4893++] = 1;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class311 var80 = class436.method2659(true, field4883[--field4893]);
                    if (var80.field4652 == null) {
                        field4883[field4893++] = 0;
                        return;
                    }
                    int var81 = var80.field4652.length;
                    for (int var82 = 0; var82 < var80.field4652.length; var82++) {
                        if (var80.field4652[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field4883[field4893++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field4893 -= 2;
                    int var83 = field4883[field4893];
                    int var84 = field4883[field4893 + 1];
                    class184 var85 = (class184) class600.field8865.method1333((long) var83, false);
                    if (var85 != null && var85.field2796 == var84) {
                        field4883[field4893++] = 1;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class311 var86 = class436.method2659(true, field4883[--field4893]);
                if (arg0 == 2800) {
                    field4883[field4893++] = client.method3619(var86).method3517((byte) 113);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field4883[--field4893];
                    int var335 = var87 - 1;
                    if (var86.field4567 != null && var335 < var86.field4567.length && var86.field4567[var335] != null) {
                        field4884[field4891++] = var86.field4567[var335];
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field4531 == null) {
                        field4884[field4891++] = "";
                        return;
                    }
                    field4884[field4891++] = var86.field4531;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field4884[--field4891];
                    class62.method389(var88, 0);
                    return;
                }
                if (arg0 == 3101) {
                    field4893 -= 2;
                    class453.method2728(field4883[field4893 + 1], 85, field4883[field4893], class239.field3493);
                    return;
                }
                if (arg0 == 3103) {
                    class274.method1731(true, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field4884[--field4891];
                    int var90 = 0;
                    if (class258.method1628(true, var89)) {
                        var90 = class233.method1518(var89, (byte) -128);
                    }
                    field4882++;
                    class165.method1046(-3466, class216.field3199);
                    class221.field3268.method2576(true, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field4884[--field4891];
                    field4876++;
                    class165.method1046(-3466, class19.field172);
                    class221.field3268.method2563(-13021, var91.length() + 1);
                    class221.field3268.method2580(var91, 30127);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field4884[--field4891];
                    field4885++;
                    class165.method1046(-3466, class278.field4144);
                    class221.field3268.method2563(-13021, var92.length() + 1);
                    class221.field3268.method2580(var92, 30127);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field4883[--field4893];
                    String var94 = field4884[--field4891];
                    class543.method3192(var93, true, var94);
                    return;
                }
                if (arg0 == 3108) {
                    field4893 -= 3;
                    int var95 = field4883[field4893];
                    int var96 = field4883[field4893 + 1];
                    int var97 = field4883[field4893 + 2];
                    class311 var98 = class436.method2659(true, var97);
                    class3.method16(var95, var98, var96, -2941);
                    return;
                }
                if (arg0 == 3109) {
                    field4893 -= 2;
                    int var99 = field4883[field4893];
                    int var100 = field4883[field4893 + 1];
                    class311 var101 = arg1 ? field4887 : field4896;
                    class3.method16(var99, var101, var100, -2941);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field4883[--field4893];
                    field4878++;
                    class165.method1046(-3466, class69.field782);
                    class221.field3268.method2608(var102, (byte) 56);
                    return;
                }
                if (arg0 == 3111) {
                    field4893 -= 2;
                    int var103 = field4883[field4893];
                    int var104 = field4883[field4893 + 1];
                    class184 var105 = (class184) class600.field8865.method1333((long) var103, false);
                    if (var105 != null) {
                        class587.method3424(544, var105.field2796 != var104, var105, true);
                    }
                    class469.method2858(true, var104, var103, true, 3);
                    return;
                }
                if (arg0 == 3112) {
                    field4893--;
                    int var106 = field4883[field4893];
                    class184 var107 = (class184) class600.field8865.method1333((long) var106, false);
                    if (var107 != null && var107.field2795 == 3) {
                        class587.method3424(544, true, var107, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class152.method891((byte) 124, field4884[--field4891]);
                    return;
                }
                if (arg0 == 3114) {
                    field4893 -= 2;
                    int var108 = field4883[field4893];
                    int var109 = field4883[field4893 + 1];
                    String var110 = field4884[--field4891];
                    class549.method3214(85, var110, "", var109, "", var108);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field4893 -= 3;
                    class486.method2950(field4883[field4893 + 1], -1, 255, field4883[field4893 + 2], field4883[field4893]);
                    return;
                }
                if (arg0 == 3201) {
                    class345.method2124(50, field4883[--field4893], (byte) -30, 255);
                    return;
                }
                if (arg0 == 3202) {
                    field4893 -= 2;
                    class296.method1834(255, field4883[field4893 + 1], field4883[field4893], (byte) -9);
                    return;
                }
                if (arg0 == 3203) {
                    field4893 -= 4;
                    class486.method2950(field4883[field4893 + 1], -1, field4883[field4893 + 3], field4883[field4893 + 2], field4883[field4893]);
                    return;
                }
                if (arg0 == 3204) {
                    field4893 -= 3;
                    class345.method2124(field4883[field4893 + 2], field4883[field4893], (byte) -30, field4883[field4893 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field4893 -= 3;
                    class296.method1834(field4883[field4893 + 2], field4883[field4893 + 1], field4883[field4893], (byte) -9);
                    return;
                }
                if (arg0 == 3206) {
                    field4893 -= 4;
                    class552.method3234(field4883[field4893 + 2], field4883[field4893 + 3], false, field4883[field4893 + 1], field4883[field4893]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field4883[field4893++] = class576.field8505;
                    return;
                }
                if (arg0 == 3301) {
                    field4893 -= 2;
                    int var111 = field4883[field4893];
                    int var112 = field4883[field4893 + 1];
                    field4883[field4893++] = class221.method1457(var112, false, -121, var111);
                    return;
                }
                if (arg0 == 3302) {
                    field4893 -= 2;
                    int var113 = field4883[field4893];
                    int var114 = field4883[field4893 + 1];
                    field4883[field4893++] = class356.method2185(false, 111, var113, var114);
                    return;
                }
                if (arg0 == 3303) {
                    field4893 -= 2;
                    int var115 = field4883[field4893];
                    int var116 = field4883[field4893 + 1];
                    field4883[field4893++] = class494.method2986(var116, false, 0, var115);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field4883[--field4893];
                    field4883[field4893++] = class151.field1933.method1864((byte) 26, var117).field5062;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field4883[--field4893];
                    field4883[field4893++] = class482.field7319[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field4883[--field4893];
                    field4883[field4893++] = class451.field6587[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field4883[--field4893];
                    field4883[field4893++] = class647.field9388[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class239.field3493.field3457;
                    int var122 = (class239.field3493.field3464 >> 7) + class584.field8677;
                    int var123 = (class239.field3493.field3463 >> 7) + class424.field6061;
                    field4883[field4893++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field4883[--field4893];
                    field4883[field4893++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field4883[--field4893];
                    field4883[field4893++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field4883[--field4893];
                    field4883[field4893++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field4883[field4893++] = class306.field4467 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field4893 -= 2;
                    int var127 = field4883[field4893];
                    int var128 = field4883[field4893 + 1];
                    field4883[field4893++] = class221.method1457(var128, true, -120, var127);
                    return;
                }
                if (arg0 == 3314) {
                    field4893 -= 2;
                    int var129 = field4883[field4893];
                    int var130 = field4883[field4893 + 1];
                    field4883[field4893++] = class356.method2185(true, 120, var129, var130);
                    return;
                }
                if (arg0 == 3315) {
                    field4893 -= 2;
                    int var131 = field4883[field4893];
                    int var132 = field4883[field4893 + 1];
                    field4883[field4893++] = class494.method2986(var132, true, 0, var131);
                    return;
                }
                if (arg0 == 3316) {
                    if (class370.field5351 >= 2) {
                        field4883[field4893++] = class370.field5351;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field4883[field4893++] = class223.field3280;
                    return;
                }
                if (arg0 == 3318) {
                    field4883[field4893++] = class536.field7933.field6633;
                    return;
                }
                if (arg0 == 3321) {
                    field4883[field4893++] = class174.field2526;
                    return;
                }
                if (arg0 == 3322) {
                    field4883[field4893++] = class561.field8324;
                    return;
                }
                if (arg0 == 3323) {
                    if (class328.field4848 >= 5 && class328.field4848 <= 9) {
                        field4883[field4893++] = 1;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class328.field4848 >= 5 && class328.field4848 <= 9) {
                        field4883[field4893++] = class328.field4848;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field4883[field4893++] = class109.field1382 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field4883[field4893++] = class239.field3493.field2717;
                    return;
                }
                if (arg0 == 3327) {
                    field4883[field4893++] = class239.field3493.field2711.field2299 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field4883[field4893++] = class163.field2181 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field4883[--field4893];
                    field4883[field4893++] = class264.method1689(var133, false, -13242);
                    return;
                }
                if (arg0 == 3331) {
                    field4893 -= 2;
                    int var134 = field4883[field4893];
                    int var135 = field4883[field4893 + 1];
                    field4883[field4893++] = class538.method3163(false, var134, false, false, var135);
                    return;
                }
                if (arg0 == 3332) {
                    field4893 -= 2;
                    int var136 = field4883[field4893];
                    int var137 = field4883[field4893 + 1];
                    field4883[field4893++] = class538.method3163(true, var136, false, false, var137);
                    return;
                }
                if (arg0 == 3333) {
                    field4883[field4893++] = class621.field9066;
                    return;
                }
                if (arg0 == 3335) {
                    field4883[field4893++] = class77.field889;
                    return;
                }
                if (arg0 == 3336) {
                    field4893 -= 4;
                    int var138 = field4883[field4893];
                    int var139 = field4883[field4893 + 1];
                    int var140 = field4883[field4893 + 2];
                    int var141 = field4883[field4893 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field4883[field4893++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field4883[field4893++] = class555.field8240;
                    return;
                }
                if (arg0 == 3338) {
                    field4883[field4893++] = class28.method125(false);
                    return;
                }
                if (arg0 == 3339) {
                    field4883[field4893++] = class383.field5608 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field4883[field4893++] = class85.field989 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field4883[field4893++] = class144.field1871 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field4883[field4893++] = class350.field5071.method635(-192);
                    return;
                }
                if (arg0 == 3343) {
                    field4883[field4893++] = class350.field5071.method633((byte) 29);
                    return;
                }
                if (arg0 == 3344) {
                    field4884[field4891++] = class628.method3665(-22829);
                    return;
                }
                if (arg0 == 3345) {
                    field4884[field4891++] = class314.method1942(-3615);
                    return;
                }
                if (arg0 == 3346) {
                    field4883[field4893++] = class41.method208(-9235);
                    return;
                }
                if (arg0 == 3347) {
                    field4883[field4893++] = class500.field7491;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field4893 -= 2;
                    int var145 = field4883[field4893];
                    int var146 = field4883[field4893 + 1];
                    class308 var147 = class458.field6651.method3577(var145, -27079);
                    field4884[field4891++] = var147.method1888(var146, -106);
                    return;
                }
                if (arg0 == 3408) {
                    field4893 -= 4;
                    int var148 = field4883[field4893];
                    int var149 = field4883[field4893 + 1];
                    int var150 = field4883[field4893 + 2];
                    int var151 = field4883[field4893 + 3];
                    class308 var152 = class458.field6651.method3577(var150, -27079);
                    if (var152.field4487 == var148 && var152.field4491 == var149) {
                        if (var149 == 115) {
                            field4884[field4891++] = var152.method1888(var151, -99);
                            return;
                        }
                        field4883[field4893++] = var152.method1889(var151, (byte) -121);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field4893 -= 3;
                    int var153 = field4883[field4893];
                    int var154 = field4883[field4893 + 1];
                    int var155 = field4883[field4893 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class308 var156 = class458.field6651.method3577(var154, -27079);
                    if (var156.field4491 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field4883[field4893++] = var156.method1895(var155, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field4883[--field4893];
                    String var158 = field4884[--field4891];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class308 var159 = class458.field6651.method3577(var157, -27079);
                    if (var159.field4491 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field4883[field4893++] = var159.method1890(var158, (byte) -9) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field4883[--field4893];
                    class308 var161 = class458.field6651.method3577(var160, -27079);
                    field4883[field4893++] = var161.field4479.method1337(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class578.field8521 == 0) {
                        field4883[field4893++] = -2;
                        return;
                    }
                    if (class578.field8521 == 1) {
                        field4883[field4893++] = -1;
                        return;
                    }
                    field4883[field4893++] = class156.field1993;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field4883[--field4893];
                    if (class578.field8521 == 2 && var162 < class156.field1993) {
                        field4884[field4891++] = class417.field5994[var162];
                        if (class19.field177[var162] != null) {
                            field4884[field4891++] = class19.field177[var162];
                            return;
                        }
                        field4884[field4891++] = "";
                        return;
                    }
                    field4884[field4891++] = "";
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field4883[--field4893];
                    if (class578.field8521 == 2 && var163 < class156.field1993) {
                        field4883[field4893++] = class526.field7779[var163];
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field4883[--field4893];
                    if (class578.field8521 == 2 && var164 < class156.field1993) {
                        field4883[field4893++] = class183.field2792[var164];
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field4884[--field4891];
                    int var166 = field4883[--field4893];
                    class152.method893(var165, 2635, var166);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field4884[--field4891];
                    class67.method414((byte) -118, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field4884[--field4891];
                    class627.method3662(true, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field4884[--field4891];
                    class481.method2916(var169, 74, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field4884[--field4891];
                    class123.method743(false, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field4884[--field4891];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field4883[field4893++] = class383.method2323(0, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field4883[--field4893];
                    if (class578.field8521 == 2 && var172 < class156.field1993) {
                        field4884[field4891++] = class161.field2158[var172];
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class133.field1767 != null) {
                        field4884[field4891++] = class259.method1635(-111, class133.field1767);
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class133.field1767 != null) {
                        field4883[field4893++] = class127.field1684;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field4883[--field4893];
                    if (class133.field1767 != null && var173 < class127.field1684) {
                        field4884[field4891++] = class625.field9168[var173].field8336;
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field4883[--field4893];
                    if (class133.field1767 != null && var174 < class127.field1684) {
                        field4883[field4893++] = class625.field9168[var174].field8338;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field4883[--field4893];
                    if (class133.field1767 != null && var175 < class127.field1684) {
                        field4883[field4893++] = class625.field9168[var175].field8340;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field4883[field4893++] = class519.field7715;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field4884[--field4891];
                    class593.method3450(var176, (byte) -66);
                    return;
                }
                if (arg0 == 3618) {
                    field4883[field4893++] = class159.field2122;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field4884[--field4891];
                    class263.method1686(var177, -71);
                    return;
                }
                if (arg0 == 3620) {
                    class462.method2743(-715827883);
                    return;
                }
                if (arg0 == 3621) {
                    if (class578.field8521 == 0) {
                        field4883[field4893++] = -1;
                        return;
                    }
                    field4883[field4893++] = class103.field1309;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field4883[--field4893];
                    if (class578.field8521 != 0 && var178 < class103.field1309) {
                        field4884[field4891++] = class446.field6551[var178];
                        if (class461.field6672[var178] != null) {
                            field4884[field4891++] = class461.field6672[var178];
                            return;
                        }
                        field4884[field4891++] = "";
                        return;
                    }
                    field4884[field4891++] = "";
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field4884[--field4891];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field4883[field4893++] = class14.method64(var179, (byte) -30) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field4883[--field4893];
                    if (class625.field9168 != null && var180 < class127.field1684 && class625.field9168[var180].field8333.equalsIgnoreCase(class239.field3493.field2718)) {
                        field4883[field4893++] = 1;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class479.field7268 != null) {
                        field4884[field4891++] = class479.field7268;
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field4883[--field4893];
                    if (class133.field1767 != null && var181 < class127.field1684) {
                        field4884[field4891++] = class625.field9168[var181].field8339;
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field4883[--field4893];
                    if (class578.field8521 == 2 && var182 >= 0 && var182 < class156.field1993) {
                        field4883[field4893++] = class528.field7836[var182] ? 1 : 0;
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field4884[--field4891];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field4883[field4893++] = class553.method3235(true, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field4883[field4893++] = class110.field1402;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field4884[--field4891];
                    class481.method2916(var184, 60, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field4883[--field4893];
                    field4883[field4893++] = class576.field8506[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field4883[--field4893];
                    if (class133.field1767 != null && var186 < class127.field1684) {
                        field4884[field4891++] = class625.field9168[var186].field8333;
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field4883[--field4893];
                    if (class578.field8521 != 0 && var187 < class103.field1309) {
                        field4884[field4891++] = class288.field4250[var187];
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field4883[--field4893];
                    field4883[field4893++] = class425.field6071[var188].method1621(76);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field4883[--field4893];
                    field4883[field4893++] = class425.field6071[var189].field3742;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field4883[--field4893];
                    field4883[field4893++] = class425.field6071[var190].field3739;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field4883[--field4893];
                    field4883[field4893++] = class425.field6071[var191].field3744;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field4883[--field4893];
                    field4883[field4893++] = class425.field6071[var192].field3745;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field4883[--field4893];
                    field4883[field4893++] = class425.field6071[var193].field3738;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field4883[--field4893];
                    int var195 = class425.field6071[var194].method1620(false);
                    field4883[field4893++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field4883[--field4893];
                    int var197 = class425.field6071[var196].method1620(false);
                    field4883[field4893++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field4883[--field4893];
                    int var199 = class425.field6071[var198].method1620(false);
                    field4883[field4893++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field4883[--field4893];
                    int var201 = class425.field6071[var200].method1620(false);
                    field4883[field4893++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field4893 -= 2;
                    int var202 = field4883[field4893];
                    int var203 = field4883[field4893 + 1];
                    field4883[field4893++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field4893 -= 2;
                    int var204 = field4883[field4893];
                    int var205 = field4883[field4893 + 1];
                    field4883[field4893++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field4893 -= 2;
                    int var206 = field4883[field4893];
                    int var207 = field4883[field4893 + 1];
                    field4883[field4893++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field4893 -= 2;
                    int var208 = field4883[field4893];
                    int var209 = field4883[field4893 + 1];
                    field4883[field4893++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field4883[--field4893];
                    field4883[field4893++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field4883[--field4893];
                    field4883[field4893++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field4893 -= 5;
                    int var212 = field4883[field4893];
                    int var213 = field4883[field4893 + 1];
                    int var214 = field4883[field4893 + 2];
                    int var215 = field4883[field4893 + 3];
                    int var216 = field4883[field4893 + 4];
                    field4883[field4893++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field4893 -= 2;
                    long var217 = (long) field4883[field4893];
                    long var219 = (long) field4883[field4893 + 1];
                    field4883[field4893++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field4893 -= 2;
                    int var221 = field4883[field4893];
                    int var222 = field4883[field4893 + 1];
                    field4883[field4893++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field4893 -= 2;
                    int var223 = field4883[field4893];
                    int var224 = field4883[field4893 + 1];
                    field4883[field4893++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field4893 -= 2;
                    int var225 = field4883[field4893];
                    int var226 = field4883[field4893 + 1];
                    field4883[field4893++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field4893 -= 2;
                    int var227 = field4883[field4893];
                    int var228 = field4883[field4893 + 1];
                    field4883[field4893++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field4893 -= 2;
                    int var229 = field4883[field4893];
                    int var230 = field4883[field4893 + 1];
                    if (var229 == 0) {
                        field4883[field4893++] = 0;
                        return;
                    }
                    field4883[field4893++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field4893 -= 2;
                    int var231 = field4883[field4893];
                    int var232 = field4883[field4893 + 1];
                    if (var231 == 0) {
                        field4883[field4893++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field4883[field4893++] = Integer.MAX_VALUE;
                        return;
                    }
                    field4883[field4893++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field4893 -= 2;
                    int var233 = field4883[field4893];
                    int var234 = field4883[field4893 + 1];
                    field4883[field4893++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field4893 -= 2;
                    int var235 = field4883[field4893];
                    int var236 = field4883[field4893 + 1];
                    field4883[field4893++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field4893 -= 2;
                    int var237 = field4883[field4893];
                    int var238 = field4883[field4893 + 1];
                    field4883[field4893++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field4893 -= 2;
                    int var239 = field4883[field4893];
                    int var240 = field4883[field4893 + 1];
                    field4883[field4893++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field4893 -= 3;
                    long var241 = (long) field4883[field4893];
                    long var243 = (long) field4883[field4893 + 1];
                    long var245 = (long) field4883[field4893 + 2];
                    field4883[field4893++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field4884[--field4891];
                    int var248 = field4883[--field4893];
                    field4884[field4891++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field4891 -= 2;
                    String var249 = field4884[field4891];
                    String var250 = field4884[field4891 + 1];
                    field4884[field4891++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field4884[--field4891];
                    int var252 = field4883[--field4893];
                    field4884[field4891++] = var251 + class534.method3139(true, (byte) -40, var252);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field4884[--field4891];
                    field4884[field4891++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field4884[field4891++] = method2070(field4883[--field4893]);
                    return;
                }
                if (arg0 == 4105) {
                    field4891 -= 2;
                    String var254 = field4884[field4891];
                    String var255 = field4884[field4891 + 1];
                    if (class239.field3493.field2711 != null && class239.field3493.field2711.field2299) {
                        field4884[field4891++] = var255;
                        return;
                    }
                    field4884[field4891++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field4883[--field4893];
                    field4884[field4891++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field4891 -= 2;
                    field4883[field4893++] = class642.method3716(124, field4884[field4891], field4884[field4891 + 1], class77.field889);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field4884[--field4891];
                    field4893 -= 2;
                    int var258 = field4883[field4893];
                    int var259 = field4883[field4893 + 1];
                    class166 var260 = class510.method3046(var259, class644.field9347, 0, -6724);
                    field4883[field4893++] = var260.method1058(60, var257, class372.field5384, var258);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field4884[--field4891];
                    field4893 -= 2;
                    int var262 = field4883[field4893];
                    int var263 = field4883[field4893 + 1];
                    class166 var264 = class510.method3046(var263, class644.field9347, 0, -6724);
                    field4883[field4893++] = var264.method1055(class372.field5384, (byte) 98, var261, var262);
                    return;
                }
                if (arg0 == 4110) {
                    field4891 -= 2;
                    String var265 = field4884[field4891];
                    String var266 = field4884[field4891 + 1];
                    if (field4883[--field4893] == 1) {
                        field4884[field4891++] = var265;
                        return;
                    }
                    field4884[field4891++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field4884[--field4891];
                    field4884[field4891++] = class358.method2199(var267, -61);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field4884[--field4891];
                    int var269 = field4883[--field4893];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field4884[field4891++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field4883[--field4893];
                    field4883[field4893++] = class392.method2364((char) var270, 338) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field4883[--field4893];
                    field4883[field4893++] = class243.method1570(0, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field4883[--field4893];
                    field4883[field4893++] = class41.method210(true, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field4883[--field4893];
                    field4883[field4893++] = class78.method455((char) var273, 127) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field4884[--field4891];
                    if (var274 != null) {
                        field4883[field4893++] = var274.length();
                        return;
                    }
                    field4883[field4893++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field4884[--field4891];
                    field4893 -= 2;
                    int var276 = field4883[field4893];
                    int var277 = field4883[field4893 + 1];
                    field4884[field4891++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field4884[--field4891];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field4884[field4891++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field4884[--field4891];
                    field4893 -= 2;
                    int var284 = field4883[field4893];
                    int var285 = field4883[field4893 + 1];
                    field4883[field4893++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field4891 -= 2;
                    String var286 = field4884[field4891];
                    String var287 = field4884[field4891 + 1];
                    int var288 = field4883[--field4893];
                    field4883[field4893++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field4883[--field4893];
                    field4883[field4893++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field4883[--field4893];
                    field4883[field4893++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field4883[--field4893] != 0;
                    int var292 = field4883[--field4893];
                    field4884[field4891++] = class85.method491(var291, (long) var292, class77.field889, (byte) 113, 0);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field4884[--field4891];
                    int var294 = field4883[--field4893];
                    class166 var295 = class510.method3046(var294, class644.field9347, 0, -6724);
                    field4883[field4893++] = var295.method1051(var293, class372.field5384, (byte) 116);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field4883[--field4893];
                    field4884[field4891++] = class216.field3204.method3357(var296, (byte) -79).field5900;
                    return;
                }
                if (arg0 == 4201) {
                    field4893 -= 2;
                    int var297 = field4883[field4893];
                    int var298 = field4883[field4893 + 1];
                    class414 var299 = class216.field3204.method3357(var297, (byte) -118);
                    if (var298 >= 1 && var298 <= 5 && var299.field5889[var298 - 1] != null) {
                        field4884[field4891++] = var299.field5889[var298 - 1];
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field4893 -= 2;
                    int var300 = field4883[field4893];
                    int var301 = field4883[field4893 + 1];
                    class414 var302 = class216.field3204.method3357(var300, (byte) -125);
                    if (var301 >= 1 && var301 <= 5 && var302.field5951[var301 - 1] != null) {
                        field4884[field4891++] = var302.field5951[var301 - 1];
                        return;
                    }
                    field4884[field4891++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field4883[--field4893];
                    field4883[field4893++] = class216.field3204.method3357(var303, (byte) -121).field5952;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field4883[--field4893];
                    field4883[field4893++] = class216.field3204.method3357(var304, (byte) -115).field5939 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field4883[--field4893];
                    class414 var306 = class216.field3204.method3357(var305, (byte) -67);
                    if (var306.field5928 == -1 && var306.field5962 >= 0) {
                        field4883[field4893++] = var306.field5962;
                        return;
                    }
                    field4883[field4893++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field4883[--field4893];
                    class414 var308 = class216.field3204.method3357(var307, (byte) -79);
                    if (var308.field5928 >= 0 && var308.field5962 >= 0) {
                        field4883[field4893++] = var308.field5962;
                        return;
                    }
                    field4883[field4893++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field4883[--field4893];
                    field4883[field4893++] = class216.field3204.method3357(var309, (byte) -126).field5925 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field4893 -= 2;
                    int var310 = field4883[field4893];
                    int var311 = field4883[field4893 + 1];
                    class173 var312 = class8.field74.method3290(var311, 30883);
                    if (var312.method1095((byte) 46)) {
                        field4884[field4891++] = class216.field3204.method3357(var310, (byte) -121).method2472((byte) -14, var312.field2338, var311);
                        return;
                    }
                    field4883[field4893++] = class216.field3204.method3357(var310, (byte) -99).method2459(36, var311, var312.field2339);
                    return;
                }
                if (arg0 == 4209) {
                    field4893 -= 2;
                    int var313 = field4883[field4893];
                    int var314 = field4883[field4893 + 1] - 1;
                    class414 var315 = class216.field3204.method3357(var313, (byte) -116);
                    if (var315.field5891 == var314) {
                        field4883[field4893++] = var315.field5901;
                        return;
                    }
                    if (var315.field5899 == var314) {
                        field4883[field4893++] = var315.field5927;
                        return;
                    }
                    field4883[field4893++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field4884[--field4891];
                    int var317 = field4883[--field4893];
                    class468.method2839(var317 == 1, var316, true);
                    field4883[field4893++] = class538.field7974;
                    return;
                }
                if (arg0 == 4211) {
                    if (class642.field9327 != null && class481.field7298 < class538.field7974) {
                        field4883[field4893++] = class642.field9327[class481.field7298++] & 0xFFFF;
                        return;
                    }
                    field4883[field4893++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class481.field7298 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field4893 -= 2;
                    int var318 = field4883[field4893];
                    int var319 = field4883[field4893 + 1];
                    class173 var320 = class8.field74.method3290(var319, 30883);
                    if (var320.method1095((byte) 46)) {
                        field4884[field4891++] = class369.field5329.method1783(-1, var318).method2627(var320.field2338, var319, (byte) 104);
                        return;
                    }
                    field4883[field4893++] = class369.field5329.method1783(-1, var318).method2635(var320.field2339, var319, (byte) -119);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field4893 -= 2;
                    int var321 = field4883[field4893];
                    int var322 = field4883[field4893 + 1];
                    class173 var323 = class8.field74.method3290(var322, 30883);
                    if (var323.method1095((byte) 46)) {
                        field4884[field4891++] = class312.field4690.method2004(false, var321).method920(var323.field2338, var322, 103);
                        return;
                    }
                    field4883[field4893++] = class312.field4690.method2004(false, var321).method913(var323.field2339, true, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field4893 -= 2;
                    int var324 = field4883[field4893];
                    int var325 = field4883[field4893 + 1];
                    class173 var326 = class8.field74.method3290(var325, 30883);
                    if (var326.method1095((byte) 46)) {
                        field4884[field4891++] = class77.field888.method3195(var324, (byte) -107).method2964(var325, var326.field2338, -28742);
                        return;
                    }
                    field4883[field4893++] = class77.field888.method3195(var324, (byte) -97).method2970(var326.field2339, false, var325);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field4883[--field4893];
                class229 var328 = class345.field5023.method526(-440, var327);
                if (var328.field3365 != null && var328.field3365.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field3376[0];
                    for (int var331 = 1; var331 < var328.field3365.length; var331++) {
                        if (var328.field3376[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field3376[var331];
                        }
                    }
                    field4883[field4893++] = var328.field3365[var329];
                    return;
                }
                field4883[field4893++] = var328.field3388;
                return;
            }
        } else {
            class311 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class436.method2659(true, field4883[--field4893]);
            } else {
                var47 = arg1 ? field4887 : field4896;
            }
            if (arg0 == 1300) {
                int var48 = field4883[--field4893] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method1915(field4884[--field4891], var48, (byte) 116);
                    return;
                }
                field4891--;
                return;
            }
            if (arg0 == 1301) {
                field4893 -= 2;
                int var49 = field4883[field4893];
                int var50 = field4883[field4893 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field4633 = null;
                    return;
                }
                var47.field4633 = class240.method1540(var49, var50, true);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field4883[--field4893];
                if (class216.field3198 != var51 && class309.field4508 != var51 && class42.field490 != var51) {
                    return;
                }
                var47.field4623 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field4685 = field4883[--field4893];
                return;
            }
            if (arg0 == 1304) {
                var47.field4675 = field4883[--field4893];
                return;
            }
            if (arg0 == 1305) {
                var47.field4531 = field4884[--field4891];
                return;
            }
            if (arg0 == 1306) {
                var47.field4683 = field4884[--field4891];
                return;
            }
            if (arg0 == 1307) {
                var47.field4567 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field4627 = field4883[--field4893];
                var47.field4534 = field4883[--field4893];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field4883[--field4893];
                int var53 = field4883[--field4893];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method1918(60, var53 - 1, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field4602 = field4884[--field4891];
                return;
            }
            if (arg0 == 1311) {
                var47.field4585 = field4883[--field4893];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field4893 -= 3;
                    var54 = field4883[field4893] - 1;
                    var55 = field4883[field4893 + 1];
                    var56 = field4883[field4893 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field4893 -= 2;
                    var54 = 10;
                    var55 = field4883[field4893];
                    var56 = field4883[field4893 + 1];
                }
                if (var47.field4540 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field4540 = new byte[11];
                    var47.field4554 = new byte[11];
                    var47.field4654 = new int[11];
                }
                var47.field4540[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field4592 = false;
                    for (int var57 = 0; var57 < var47.field4540.length; var57++) {
                        if (var47.field4540[var57] != 0) {
                            var47.field4592 = true;
                            break;
                        }
                    }
                } else {
                    var47.field4592 = true;
                }
                var47.field4554[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field4630 = field4883[--field4893];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lmh;II)V", line = 7955)
    public static final void method2078(class145 arg0, int arg1, int arg2) {
        class94 var3 = class417.method2478((byte) -116, arg1, arg0, arg2);
        if (var3 == null) {
            return;
        }
        field4881 = new int[var3.field1166];
        field4895 = new String[var3.field1157];
        if (class451.field6588 == var3.field1167 || class404.field5802 == var3.field1167 || class627.field9191 == var3.field1167) {
            int var4 = 0;
            int var5 = 0;
            if (class384.field5622 != null) {
                var4 = class384.field5622.field4596;
                var5 = class384.field5622.field4568;
            }
            field4881[0] = class350.field5071.method635(-192) - var4;
            field4881[1] = class350.field5071.method633((byte) 29) - var5;
        }
        method2076(var3, 200000);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "()V", line = 7980)
    public static void method2079() {
        field4881 = null;
        field4895 = null;
        field4875 = null;
        field4899 = null;
        field4883 = null;
        field4884 = null;
        field4897 = null;
        field4896 = null;
        field4887 = null;
        field4889 = null;
        field4879 = null;
        field4900 = null;
        field4902 = null;
        field4901 = null;
    }
}
