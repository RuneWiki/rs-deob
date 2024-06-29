import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class674 {

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9469 = new String[] { method4841(method4840("-]\u001d~F")), method4841(method4840("-]\u001d{F")), method4841(method4840("-]\u001d|F")), method4841(method4840("7N\tS\u001c")), method4841(method4840("$\u0012\u001d\u0011\u0013")), method4841(method4840("-]\u001d}F")), method4841(method4840("1I_S")) };

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Z")
    public static boolean field9466 = false;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field9464;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field9465;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field9467;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[[I")
    public static int[][] field9463;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 4)
    public static void method4836(int arg0) {
        try {
            if (arg0 != 0) {
                method4839(false, -80, -59);
            }
            field9463 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9469[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Leea;II)Z", line = 28)
    public static final boolean method4837(class476 arg0, int arg1, int arg2) {
        try {
            field9468++;
            int var3 = arg0.method3677(-54, 2);
            if (var3 == 0) {
                if (arg0.method3677(-54, 1) != 0) {
                    method4837(arg0, arg1, 5);
                }
                int var4 = arg0.method3677(-106, 6);
                int var5 = arg0.method3677(-68, 6);
                boolean var6 = arg0.method3677(-119, 1) == 1;
                if (var6) {
                    class570.field8265[class176.field2305++] = arg1;
                }
                if (class748.field10666[arg1] != null) {
                    throw new RuntimeException(field9469[3]);
                }
                class570 var7 = class429.field6194[arg1];
                class339 var8 = class748.field10666[arg1] = new class339();
                var8.field2200 = arg1;
                if (class320.field4366[arg1] != null) {
                    var8.method2722(class320.field4366[arg1], 5100);
                }
                var8.method1436(2, true, var7.field8274);
                var8.field2219 = var7.field8271;
                int var9 = var7.field8269;
                int var10 = var9 >> 28;
                int var11 = var9 >> 14 & 0xFF;
                int var12 = var9 & 0xFF;
                int var13 = (var11 << 6) + var4 - class537.field7895;
                var8.field4909 = var7.field8268;
                int var14 = (var12 << 6) + var5 - class655.field9286;
                var8.field4910 = var7.field8273;
                var8.field2254[0] = class176.field2308[arg1];
                var8.field2981 = var8.field2971 = (byte) var10;
                if (class23.method275(1, var13, var14)) {
                    var8.field2971++;
                }
                var8.method2723(var13, var14, 3556);
                var8.field4916 = false;
                class429.field6194[arg1] = null;
                return true;
            } else if (var3 == 1) {
                int var15 = arg0.method3677(-38, 2);
                int var16 = class429.field6194[arg1].field8269;
                class429.field6194[arg1].field8269 = ((var16 >> 28) + var15 & 0x3 << 28) + (var16 & 0xFFFFFFF);
                return false;
            } else if (var3 == 2) {
                int var17 = arg0.method3677(-50, 5);
                int var18 = var17 >> 3;
                int var19 = var17 & 0x7;
                int var20 = class429.field6194[arg1].field8269;
                int var21 = (var20 >> 28) + var18 & 0x3;
                int var22 = var20 >> 14 & 0xFF;
                int var23 = var20 & 0xFF;
                if (var19 == 0) {
                    var22--;
                    var23--;
                }
                if (var19 == 1) {
                    var23--;
                }
                if (var19 == 2) {
                    var23--;
                    var22++;
                }
                if (var19 == 3) {
                    var22--;
                }
                if (var19 == 4) {
                    var22++;
                }
                if (var19 == 5) {
                    var23++;
                    var22--;
                }
                if (var19 == 6) {
                    var23++;
                }
                if (var19 == 7) {
                    var23++;
                    var22++;
                }
                class429.field6194[arg1].field8269 = (var22 << 14) + (var21 << 28) + var23;
                return false;
            } else {
                int var24 = arg0.method3677(-86, 18);
                int var25 = var24 >> 16;
                if (arg2 != 5) {
                    method4839(true, -51, -78);
                }
                int var26 = var24 >> 8 & 0xFF;
                int var27 = var24 & 0xFF;
                int var28 = class429.field6194[arg1].field8269;
                int var29 = (var28 >> 28) + var25 & 0x3;
                int var30 = (var28 >> 14) + var26 & 0xFF;
                int var31 = var28 + var27 & 0xFF;
                class429.field6194[arg1].field8269 = (var29 << 28) - (-(var30 << 14) - var31);
                return false;
            }
        } catch (RuntimeException var33) {
            throw class665.method4799(var33, field9469[5] + (arg0 == null ? field9469[6] : field9469[4]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 196)
    public static final void method4838(int arg0) {
        try {
            if (arg0 != -5482) {
                field9463 = null;
            }
            field9465++;
            if (class7.field88 == null) {
                class445 var1 = new class445();
                byte[] var2 = var1.method3460(128, (byte) 88, 16, 128);
                class7.field88 = class663.method4794(var2, (byte) -57, false);
            }
            if (class23.field271 == null) {
                class144 var3 = new class144();
                byte[] var4 = var3.method1244(128, 126, 128, 16);
                class23.field271 = class663.method4794(var4, (byte) -57, false);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9469[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZII)Lrs;", line = 225)
    public static final class297 method4839(boolean arg0, int arg1, int arg2) {
        try {
            field9467++;
            class470[] var3 = class236.field3400;
            synchronized (class236.field3400) {
                if (arg2 != 12853) {
                    method4837(null, 32, -126);
                }
                class297 var4;
                if (arg1 >= class236.field3400.length || class236.field3400[arg1].method3614(true)) {
                    var4 = new class297();
                    var4.field4153 = new class535[arg1];
                    for (int var5 = 0; var5 < arg1; var5++) {
                        var4.field4153[var5] = new class535();
                    }
                } else {
                    var4 = (class297) class236.field3400[arg1].method3616(1);
                    var4.method4736(0);
                    int var10002 = class124.field1565[arg1]--;
                }
                var4.field4146 = arg0;
                return var4;
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field9469[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4840(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4841(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 95;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
