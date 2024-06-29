import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class318 {

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "[[I")
    private static int[][] field4086 = new int[5][5000];

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    private static int field4082 = 0;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "[I")
    private static int[] field4084 = new int[5];

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    private static int field4094 = 0;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    private static int field4097 = 0;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "[Lhv;")
    private static class143[] field4099 = new class143[50];

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "[Ljava/lang/String;")
    private static String[] field4091 = new String[1000];

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "[I")
    private static int[] field4101 = new int[1000];

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Ljava/util/Calendar;")
    private static Calendar field4081 = Calendar.getInstance();

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field4106 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "[I")
    private static int[] field4107 = new int[3];

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "Lbh;")
    public static class538 field4105 = new class538(4);

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    private static int field4108 = 0;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Lwt;")
    private static class449 field4095;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Lpaa;")
    private static class712 field4085;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "Lpaa;")
    private static class712 field4102;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "[I")
    private static int[] field4083;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "[Ljava/lang/String;")
    private static String[] field4100;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1836(int arg0) {
        if (arg0 == -1 || !class393.method2393(arg0, -1)) {
            return;
        }
        class712[] var1 = class491.field6599[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class712 var3 = var1[var2];
            if (var3.field10009 != null) {
                class700 var4 = new class700();
                var4.field9745 = var3;
                var4.field9757 = var3.field10009;
                method1837(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Luca;I)V", line = 34)
    private static final void method1837(class700 arg0, int arg1) {
        Object[] var2 = arg0.field9757;
        int var3 = (Integer) var2[0];
        class228 var4 = class435.method2614(false, var3);
        if (var4 == null) {
            return;
        }
        field4083 = new int[var4.field3177];
        int var5 = 0;
        field4100 = new String[var4.field3174];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field9747;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field9758;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field9745 == null ? -1 : arg0.field9745.field9998;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field9749;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field9745 == null ? -1 : arg0.field9745.field10026;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field9752 == null ? -1 : arg0.field9752.field9998;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field9752 == null ? -1 : arg0.field9752.field10026;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field9753;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field9759;
                }
                field4083[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field9756;
                }
                field4100[var6++] = var9;
            }
        }
        field4108 = arg0.field9751;
        method1839(var4, arg1);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Low;II)V", line = 113)
    public static final void method1838(class747 arg0, int arg1, int arg2) {
        class228 var3 = class731.method4069(arg1, arg0, false, arg2);
        if (var3 == null) {
            return;
        }
        field4083 = new int[var3.field3177];
        field4100 = new String[var3.field3174];
        if (class296.field3854 == var3.field3172 || class408.field5672 == var3.field3172 || class589.field8458 == var3.field3172) {
            int var4 = 0;
            int var5 = 0;
            if (class355.field4559 != null) {
                var4 = class355.field4559.field10048;
                var5 = class355.field4559.field10013;
            }
            field4083[0] = class93.field1263.method805(0) - var4;
            field4083[1] = class93.field1263.method806(0) - var5;
        }
        method1839(var3, 200000);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lnfa;I)V", line = 139)
    private static final void method1839(class228 arg0, int arg1) {
        field4097 = 0;
        field4094 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3176;
        int[] var4 = arg0.field3180;
        byte var5 = -1;
        field4082 = 0;
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
                        method1842(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1844(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field4101[field4097++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field4101[field4097++] = class554.field7826.field10302[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class554.field7826.method4087(var8, (byte) -3, field4101[--field4097]);
                } else if (var43 == 3) {
                    field4091[field4094++] = arg0.field3173[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field4097 -= 2;
                    if (field4101[field4097 + 1] != field4101[field4097]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field4097 -= 2;
                    if (field4101[field4097 + 1] == field4101[field4097]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field4097 -= 2;
                    if (field4101[field4097] < field4101[field4097 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field4097 -= 2;
                    if (field4101[field4097] > field4101[field4097 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field4082 == 0) {
                        return;
                    }
                    class143 var9 = field4099[--field4082];
                    arg0 = var9.field1987;
                    var3 = arg0.field3176;
                    var4 = arg0.field3180;
                    var2 = var9.field1985;
                    field4083 = var9.field1981;
                    field4100 = var9.field1984;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field4101[field4097++] = class554.field7826.method1433((byte) -124, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class554.field7826.method4089(-25, field4101[--field4097], var11);
                } else if (var43 == 31) {
                    field4097 -= 2;
                    if (field4101[field4097] <= field4101[field4097 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field4097 -= 2;
                    if (field4101[field4097] >= field4101[field4097 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field4101[field4097++] = field4083[var4[var2]];
                } else if (var43 == 34) {
                    field4083[var4[var2]] = field4101[--field4097];
                } else if (var43 == 35) {
                    field4091[field4094++] = field4100[var4[var2]];
                } else if (var43 == 36) {
                    field4100[var4[var2]] = field4091[--field4094];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field4094 -= var12;
                    String var13 = class634.method3683(4, field4091, var12, field4094);
                    field4091[field4094++] = var13;
                } else if (var43 == 38) {
                    field4097--;
                } else if (var43 == 39) {
                    field4094--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class228 var15 = class435.method2614(false, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3177];
                    String[] var17 = new String[var15.field3174];
                    for (int var18 = 0; var18 < var15.field3169; var18++) {
                        var16[var18] = field4101[field4097 + var18 - var15.field3169];
                    }
                    for (int var19 = 0; var19 < var15.field3182; var19++) {
                        var17[var19] = field4091[field4094 + var19 - var15.field3182];
                    }
                    field4097 -= var15.field3169;
                    field4094 -= var15.field3182;
                    class143 var20 = new class143();
                    var20.field1987 = arg0;
                    var20.field1985 = var2;
                    var20.field1981 = field4083;
                    var20.field1984 = field4100;
                    if (field4082 >= field4099.length) {
                        throw new RuntimeException();
                    }
                    field4099[field4082++] = var20;
                    arg0 = var15;
                    var3 = var15.field3176;
                    var4 = var15.field3180;
                    var2 = -1;
                    field4083 = var16;
                    field4100 = var17;
                } else if (var43 == 42) {
                    field4101[field4097++] = class594.field8568[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class594.field8568[var21] = field4101[--field4097];
                    class281.method1681(var21, (byte) -13);
                    class97.field1411 |= class504.field7038[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field4101[--field4097];
                    if (var24 >= 0 && var24 <= 5000) {
                        field4084[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field4086[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field4101[--field4097];
                    if (var28 < 0 || var28 >= field4084[var27]) {
                        throw new RuntimeException();
                    }
                    field4101[field4097++] = field4086[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field4097 -= 2;
                    int var30 = field4101[field4097];
                    if (var30 < 0 || var30 >= field4084[var29]) {
                        throw new RuntimeException();
                    }
                    field4086[var29][var30] = field4101[field4097 + 1];
                } else if (var43 == 47) {
                    String var31 = class216.field3066[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field4091[field4094++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class216.field3066[var32] = field4091[--field4094];
                    class311.method1820(24336, var32);
                } else if (var43 == 51) {
                    class209 var33 = arg0.field3178[var4[var2]];
                    class285 var34 = (class285) var33.method1381(true, (long) field4101[--field4097]);
                    if (var34 != null) {
                        var2 += var34.field3770;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field3179 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field7166).append(" ");
                for (int var41 = field4082 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field4099[var41].field1987.field7166).append(" ");
                }
                var40.append("op: ").append(var5);
                class233.method1495((byte) -102, var42, var40.toString());
            } else {
                class216.method1417("Clientscript error in: " + arg0.field3179, (byte) -69, 4);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3179).append("\n");
                for (int var38 = field4082 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field4099[var38].field1987.field3179).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class233.method1495((byte) -77, var42, var37.toString());
                class645.method3738(var37.toString(), (byte) -49);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Luca;)V", line = 568)
    public static final void method1840(class700 arg0) {
        method1837(arg0, 200000);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Ljava/lang/String;", line = 578)
    private static final String method1841(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field4081.setTime(new Date(var1));
        int var3 = field4081.get(5);
        int var4 = field4081.get(2);
        int var5 = field4081.get(1);
        return var3 + "-" + field4106[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)V", line = 591)
    private static final void method1842(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field4097 -= 3;
                int var2 = field4101[field4097];
                int var3 = field4101[field4097 + 1];
                int var4 = field4101[field4097 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class712 var5 = class733.method4073(true, var2);
                if (var5.field9981 == null) {
                    var5.field9981 = new class712[var4 + 1];
                }
                if (var5.field9981.length <= var4) {
                    class712[] var6 = new class712[var4 + 1];
                    for (int var7 = 0; var7 < var5.field9981.length; var7++) {
                        var6[var7] = var5.field9981[var7];
                    }
                    var5.field9981 = var6;
                }
                if (var4 > 0 && var5.field9981[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class712 var8 = new class712();
                var8.field10039 = var3;
                var8.field10030 = var8.field9998 = var5.field9998;
                var8.field10026 = var4;
                var5.field9981[var4] = var8;
                if (arg1) {
                    field4085 = var8;
                } else {
                    field4102 = var8;
                }
                class116.method764(var5, -1176833464);
                return;
            }
            if (arg0 == 101) {
                class712 var9 = arg1 ? field4085 : field4102;
                if (var9.field10026 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class712 var10 = class733.method4073(true, var9.field9998);
                var10.field9981[var9.field10026] = null;
                class116.method764(var10, -1176833464);
                return;
            }
            if (arg0 == 102) {
                class712 var11 = class733.method4073(true, field4101[--field4097]);
                var11.field9981 = null;
                class116.method764(var11, -1176833464);
                return;
            }
            if (arg0 == 200) {
                field4097 -= 2;
                int var12 = field4101[field4097];
                int var13 = field4101[field4097 + 1];
                class712 var14 = class654.method3778((byte) -124, var12, var13);
                if (var14 != null && var13 != -1) {
                    field4101[field4097++] = 1;
                    if (arg1) {
                        field4085 = var14;
                        return;
                    }
                    field4102 = var14;
                    return;
                }
                field4101[field4097++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field4101[--field4097];
                class712 var16 = class733.method4073(true, var15);
                if (var16 != null) {
                    field4101[field4097++] = 1;
                    if (arg1) {
                        field4085 = var16;
                        return;
                    }
                    field4102 = var16;
                    return;
                }
                field4101[field4097++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field4101[--field4097];
                method1847(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field4101[--field4097];
                method1850(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field4097 -= 2;
                int var19 = field4101[field4097];
                int var20 = field4101[field4097 + 1];
                for (int var21 = 0; var21 < class663.field9343.length; var21++) {
                    if (class663.field9343[var21] == var19) {
                        class473.field6483.field9257.method3695(Integer.MIN_VALUE, class486.field6564, var20, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class224.field3148.length; var22++) {
                    if (class224.field3148[var22] == var19) {
                        class473.field6483.field9257.method3695(Integer.MIN_VALUE, class486.field6564, var20, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field4097 -= 2;
                int var23 = field4101[field4097];
                int var24 = field4101[field4097 + 1];
                class473.field6483.field9257.method3690((byte) 4, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field4101[--field4097] != 0;
                class473.field6483.field9257.method3692(false, var25);
                return;
            }
            if (arg0 == 411) {
                field4097 -= 2;
                int var26 = field4101[field4097];
                int var27 = field4101[field4097 + 1];
                class473.field6483.field9257.method3689(var26, false, var27, class487.field6572);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class712 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class733.method4073(true, field4101[--field4097]);
            } else {
                var28 = arg1 ? field4085 : field4102;
            }
            if (arg0 == 1000) {
                field4097 -= 4;
                var28.field10085 = field4101[field4097];
                var28.field10035 = field4101[field4097 + 1];
                int var29 = field4101[field4097 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field4101[field4097 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field10066 = (byte) var29;
                var28.field10072 = (byte) var30;
                class116.method764(var28, -1176833464);
                class449.method2697(var28, (byte) 98);
                if (var28.field10026 == -1) {
                    class230.method1483(var28.field9998, (byte) -116);
                }
                return;
            }
            if (arg0 == 1001) {
                field4097 -= 4;
                var28.field9982 = field4101[field4097];
                var28.field10103 = field4101[field4097 + 1];
                var28.field9992 = 0;
                var28.field9942 = 0;
                int var31 = field4101[field4097 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field4101[field4097 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field10020 = (byte) var31;
                var28.field9993 = (byte) var32;
                class116.method764(var28, -1176833464);
                class449.method2697(var28, (byte) 111);
                if (var28.field10039 == 0) {
                    class645.method3740(false, (byte) 99, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field4101[--field4097] == 1;
                if (var28.field10015 != var33) {
                    var28.field10015 = var33;
                    class116.method764(var28, -1176833464);
                }
                if (var28.field10026 == -1) {
                    class236.method1509(true, var28.field9998);
                }
                return;
            }
            if (arg0 == 1004) {
                field4097 -= 2;
                var28.field9934 = field4101[field4097];
                var28.field10065 = field4101[field4097 + 1];
                class116.method764(var28, -1176833464);
                class449.method2697(var28, (byte) 108);
                if (var28.field10039 == 0) {
                    class645.method3740(false, (byte) -74, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field10081 = field4101[--field4097] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class712 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class733.method4073(true, field4101[--field4097]);
            } else {
                var34 = arg1 ? field4085 : field4102;
            }
            if (arg0 == 1100) {
                field4097 -= 2;
                var34.field9971 = field4101[field4097];
                if (var34.field9971 > var34.field10097 - var34.field9966) {
                    var34.field9971 = var34.field10097 - var34.field9966;
                }
                if (var34.field9971 < 0) {
                    var34.field9971 = 0;
                }
                var34.field10014 = field4101[field4097 + 1];
                if (var34.field10014 > var34.field10002 - var34.field10011) {
                    var34.field10014 = var34.field10002 - var34.field10011;
                }
                if (var34.field10014 < 0) {
                    var34.field10014 = 0;
                }
                class116.method764(var34, -1176833464);
                if (var34.field10026 == -1) {
                    class620.method3633(36864, var34.field9998);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field10069 = field4101[--field4097];
                class116.method764(var34, -1176833464);
                if (var34.field10026 == -1) {
                    class147.method952(var34.field9998, -122);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field9938 = field4101[--field4097] == 1;
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1103) {
                var34.field10024 = field4101[--field4097];
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1104) {
                var34.field9979 = field4101[--field4097];
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field4101[--field4097];
                if (var34.field9973 != var35) {
                    var34.field9973 = var35;
                    class116.method764(var34, -1176833464);
                }
                if (var34.field10026 == -1) {
                    class597.method3531(-126, var34.field9998);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field9951 = field4101[--field4097];
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1107) {
                var34.field9952 = field4101[--field4097] == 1;
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1108) {
                var34.field10038 = 1;
                var34.field9937 = field4101[--field4097];
                class116.method764(var34, -1176833464);
                if (var34.field10026 == -1) {
                    class336.method1954(var34.field9998, -5);
                }
                return;
            }
            if (arg0 == 1109) {
                field4097 -= 6;
                var34.field10067 = field4101[field4097];
                var34.field9978 = field4101[field4097 + 1];
                var34.field10050 = field4101[field4097 + 2];
                var34.field10102 = field4101[field4097 + 3];
                var34.field10064 = field4101[field4097 + 4];
                var34.field9997 = field4101[field4097 + 5];
                class116.method764(var34, -1176833464);
                if (var34.field10026 == -1) {
                    class186.method1246((byte) -14, var34.field9998);
                    class460.method2757(var34.field9998, -11864);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field4101[--field4097];
                if (var34.field9943 != var36) {
                    var34.field9943 = var36;
                    var34.field9947 = 0;
                    var34.field10040 = 1;
                    var34.field9970 = 0;
                    class103 var37 = var34.field9943 == -1 ? null : class274.field3684.method1881((byte) -80, var34.field9943);
                    if (var37 != null) {
                        class670.method3837(false, var34.field9947, var37);
                    }
                    class116.method764(var34, -1176833464);
                }
                if (var34.field10026 == -1) {
                    class452.method2721(var34.field9998, 4);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field10057 = field4101[--field4097] == 1;
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field4091[--field4094];
                if (!var38.equals(var34.field10062)) {
                    var34.field10062 = var38;
                    class116.method764(var34, -1176833464);
                }
                if (var34.field10026 == -1) {
                    class167.method1057((byte) 2, var34.field9998);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field10070 = field4101[--field4097];
                class116.method764(var34, -1176833464);
                if (var34.field10026 == -1) {
                    class223.method1451(var34.field9998, false);
                }
                return;
            }
            if (arg0 == 1114) {
                field4097 -= 3;
                var34.field9945 = field4101[field4097];
                var34.field10096 = field4101[field4097 + 1];
                var34.field9935 = field4101[field4097 + 2];
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1115) {
                var34.field9976 = field4101[--field4097] == 1;
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1116) {
                var34.field10087 = field4101[--field4097];
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1117) {
                var34.field9960 = field4101[--field4097];
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1118) {
                var34.field9940 = field4101[--field4097] == 1;
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1119) {
                var34.field10082 = field4101[--field4097] == 1;
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1120) {
                field4097 -= 2;
                var34.field10097 = field4101[field4097];
                var34.field10002 = field4101[field4097 + 1];
                class116.method764(var34, -1176833464);
                if (var34.field10039 == 0) {
                    class645.method3740(false, (byte) -101, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field10084 = field4101[--field4097] == 1;
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1123) {
                var34.field9997 = field4101[--field4097];
                class116.method764(var34, -1176833464);
                if (var34.field10026 == -1) {
                    class186.method1246((byte) -14, var34.field9998);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field4101[--field4097];
                var34.field10022 = var39 == 1;
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1125) {
                field4097 -= 2;
                var34.field9949 = field4101[field4097];
                var34.field10029 = field4101[field4097 + 1];
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1126) {
                var34.field9990 = field4101[--field4097];
                class116.method764(var34, -1176833464);
                return;
            }
            if (arg0 == 1127) {
                field4097 -= 2;
                int var40 = field4101[field4097];
                int var41 = field4101[field4097 + 1];
                class752 var42 = class223.field3134.method2390(1, var40);
                if (var42.field10448 != var41) {
                    var34.method4003(var41, var40, true);
                    return;
                }
                var34.method4014(6, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field4101[--field4097];
                String var44 = field4091[--field4094];
                class752 var45 = class223.field3134.method2390(1, var43);
                if (!var45.field10449.equals(var44)) {
                    var34.method4002(var44, var43, 1);
                    return;
                }
                var34.method4014(6, var43);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field4101[--field4097];
                if (var34.field10039 != 5 && arg0 == 1129 || var34.field10039 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field9984 != var46) {
                    var34.field9984 = var46;
                    class116.method764(var34, -1176833464);
                }
                if (var34.field10026 == -1) {
                    class557.method3325(-12728, var34.field9998);
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class712 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class733.method4073(true, field4101[--field4097]);
            } else {
                var47 = arg1 ? field4085 : field4102;
            }
            class116.method764(var47, -1176833464);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field4097 -= 2;
                int var48 = field4101[field4097];
                int var49 = field4101[field4097 + 1];
                if (var47.field10026 == -1) {
                    class714.method4029(var47.field9998, -19135);
                    class186.method1246((byte) -14, var47.field9998);
                    class460.method2757(var47.field9998, -11864);
                }
                if (var48 == -1) {
                    var47.field10038 = 1;
                    var47.field9937 = -1;
                    var47.field9953 = -1;
                    return;
                }
                var47.field9953 = var48;
                var47.field10017 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field9964 = true;
                } else {
                    var47.field9964 = false;
                }
                class544 var50 = class487.field6572.method3054(var48, (byte) -99);
                var47.field10050 = var50.field7660;
                var47.field10102 = var50.field7622;
                var47.field10064 = var50.field7671;
                var47.field10067 = var50.field7650;
                var47.field9978 = var50.field7621;
                var47.field9997 = var50.field7673;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field10004 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field10004 = 1;
                } else {
                    var47.field10004 = 2;
                }
                if (var47.field9992 > 0) {
                    var47.field9997 = var47.field9997 * 32 / var47.field9992;
                    return;
                }
                if (var47.field9982 > 0) {
                    var47.field9997 = var47.field9997 * 32 / var47.field9982;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field10038 = 2;
                var47.field9937 = field4101[--field4097];
                if (var47.field10026 == -1) {
                    class336.method1954(var47.field9998, -5);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field10038 = 3;
                var47.field9937 = -1;
                if (var47.field10026 == -1) {
                    class336.method1954(var47.field9998, -5);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field10038 = 6;
                var47.field9937 = field4101[--field4097];
                if (var47.field10026 == -1) {
                    class336.method1954(var47.field9998, -5);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field10038 = 5;
                var47.field9937 = field4101[--field4097];
                if (var47.field10026 == -1) {
                    class336.method1954(var47.field9998, -5);
                }
                return;
            }
            if (arg0 == 1206) {
                field4097 -= 4;
                var47.field10094 = field4101[field4097];
                var47.field9958 = field4101[field4097 + 1];
                var47.field10095 = field4101[field4097 + 2];
                var47.field10001 = field4101[field4097 + 3];
                class116.method764(var47, -1176833464);
                return;
            }
            if (arg0 == 1207) {
                field4097 -= 2;
                var47.field9954 = field4101[field4097];
                var47.field9955 = field4101[field4097 + 1];
                class116.method764(var47, -1176833464);
                return;
            }
            if (arg0 == 1210) {
                field4097 -= 4;
                var47.field9937 = field4101[field4097];
                var47.field9963 = field4101[field4097 + 1];
                if (field4101[field4097 + 2] == 1) {
                    var47.field10038 = 9;
                } else {
                    var47.field10038 = 8;
                }
                if (field4101[field4097 + 3] == 1) {
                    var47.field9964 = true;
                } else {
                    var47.field9964 = false;
                }
                if (var47.field10026 == -1) {
                    class336.method1954(var47.field9998, -5);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field10038 = 5;
                var47.field9937 = class471.field6467;
                var47.field9963 = 0;
                if (var47.field10026 == -1) {
                    class336.method1954(var47.field9998, -5);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class712 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class733.method4073(true, field4101[--field4097]);
                } else {
                    var62 = arg1 ? field4085 : field4102;
                }
                if (arg0 == 1499) {
                    var62.method4015(-107);
                    return;
                }
                String var63 = field4091[--field4094];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field4101[--field4097];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field4101[--field4097];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field4091[--field4094];
                    } else {
                        var66[var67] = Integer.valueOf(field4101[--field4097]);
                    }
                }
                int var68 = field4101[--field4097];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field10044 = var66;
                } else if (arg0 == 1401) {
                    var62.field9986 = var66;
                } else if (arg0 == 1402) {
                    var62.field9972 = var66;
                } else if (arg0 == 1403) {
                    var62.field10006 = var66;
                } else if (arg0 == 1404) {
                    var62.field9936 = var66;
                } else if (arg0 == 1405) {
                    var62.field10025 = var66;
                } else if (arg0 == 1406) {
                    var62.field10042 = var66;
                } else if (arg0 == 1407) {
                    var62.field9933 = var66;
                    var62.field10032 = var64;
                } else if (arg0 == 1408) {
                    var62.field10034 = var66;
                } else if (arg0 == 1409) {
                    var62.field9946 = var66;
                } else if (arg0 == 1410) {
                    var62.field10059 = var66;
                } else if (arg0 == 1411) {
                    var62.field10089 = var66;
                } else if (arg0 == 1412) {
                    var62.field9939 = var66;
                } else if (arg0 == 1414) {
                    var62.field10052 = var66;
                    var62.field9932 = var64;
                } else if (arg0 == 1415) {
                    var62.field9991 = var66;
                    var62.field10033 = var64;
                } else if (arg0 == 1416) {
                    var62.field10028 = var66;
                } else if (arg0 == 1417) {
                    var62.field10023 = var66;
                } else if (arg0 == 1418) {
                    var62.field10031 = var66;
                } else if (arg0 == 1419) {
                    var62.field9969 = var66;
                } else if (arg0 == 1420) {
                    var62.field10010 = var66;
                } else if (arg0 == 1421) {
                    var62.field10018 = var66;
                } else if (arg0 == 1422) {
                    var62.field10051 = var66;
                } else if (arg0 == 1423) {
                    var62.field9950 = var66;
                } else if (arg0 == 1424) {
                    var62.field10000 = var66;
                } else if (arg0 == 1425) {
                    var62.field9968 = var66;
                } else if (arg0 == 1426) {
                    var62.field9962 = var66;
                } else if (arg0 == 1427) {
                    var62.field10061 = var66;
                } else if (arg0 == 1428) {
                    var62.field10056 = var66;
                    var62.field9980 = var64;
                } else if (arg0 == 1429) {
                    var62.field9988 = var66;
                    var62.field10092 = var64;
                } else if (arg0 == 1430) {
                    var62.field10099 = var66;
                }
                var62.field10012 = true;
                return;
            }
            if (arg0 < 1600) {
                class712 var69 = arg1 ? field4085 : field4102;
                if (arg0 == 1500) {
                    field4101[field4097++] = var69.field10048;
                    return;
                }
                if (arg0 == 1501) {
                    field4101[field4097++] = var69.field10013;
                    return;
                }
                if (arg0 == 1502) {
                    field4101[field4097++] = var69.field9966;
                    return;
                }
                if (arg0 == 1503) {
                    field4101[field4097++] = var69.field10011;
                    return;
                }
                if (arg0 == 1504) {
                    field4101[field4097++] = var69.field10015 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field4101[field4097++] = var69.field10030;
                    return;
                }
                if (arg0 == 1506) {
                    class712 var70 = class101.method686(-1, var69);
                    field4101[field4097++] = var70 == null ? -1 : var70.field9998;
                    return;
                }
            } else if (arg0 < 1700) {
                class712 var71 = arg1 ? field4085 : field4102;
                if (arg0 == 1600) {
                    field4101[field4097++] = var71.field9971;
                    return;
                }
                if (arg0 == 1601) {
                    field4101[field4097++] = var71.field10014;
                    return;
                }
                if (arg0 == 1602) {
                    field4091[field4094++] = var71.field10062;
                    return;
                }
                if (arg0 == 1603) {
                    field4101[field4097++] = var71.field10097;
                    return;
                }
                if (arg0 == 1604) {
                    field4101[field4097++] = var71.field10002;
                    return;
                }
                if (arg0 == 1605) {
                    field4101[field4097++] = var71.field9997;
                    return;
                }
                if (arg0 == 1606) {
                    field4101[field4097++] = var71.field10050;
                    return;
                }
                if (arg0 == 1607) {
                    field4101[field4097++] = var71.field10064;
                    return;
                }
                if (arg0 == 1608) {
                    field4101[field4097++] = var71.field10102;
                    return;
                }
                if (arg0 == 1609) {
                    field4101[field4097++] = var71.field10024;
                    return;
                }
                if (arg0 == 1610) {
                    field4101[field4097++] = var71.field10067;
                    return;
                }
                if (arg0 == 1611) {
                    field4101[field4097++] = var71.field9978;
                    return;
                }
                if (arg0 == 1612) {
                    field4101[field4097++] = var71.field9973;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field4101[--field4097];
                    class752 var73 = class223.field3134.method2390(1, var72);
                    if (var73.method4169(97)) {
                        field4091[field4094++] = var71.method4008(var73.field10449, var72, (byte) -84);
                        return;
                    }
                    field4101[field4097++] = var71.method4005(var73.field10448, var72, 30423);
                    return;
                }
                if (arg0 == 1614) {
                    field4101[field4097++] = var71.field9951;
                    return;
                }
                if (arg0 == 2614) {
                    field4101[field4097++] = var71.field10038 == 1 ? var71.field9937 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class712 var74 = arg1 ? field4085 : field4102;
                if (arg0 == 1700) {
                    field4101[field4097++] = var74.field9953;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field9953 != -1) {
                        field4101[field4097++] = var74.field10017;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field4101[field4097++] = var74.field10026;
                    return;
                }
            } else if (arg0 < 1900) {
                class712 var75 = arg1 ? field4085 : field4102;
                if (arg0 == 1800) {
                    field4101[field4097++] = client.method2675(var75).method647((byte) -125);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field4101[--field4097];
                    int var357 = var76 - 1;
                    if (var75.field10086 != null && var357 < var75.field10086.length && var75.field10086[var357] != null) {
                        field4091[field4094++] = var75.field10086[var357];
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field9941 == null) {
                        field4091[field4094++] = "";
                        return;
                    }
                    field4091[field4094++] = var75.field9941;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class712 var355;
                if (arg0 >= 2000) {
                    var355 = class733.method4073(true, field4101[--field4097]);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field4085 : field4102;
                }
                if (field4108 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field10061 == null) {
                        return;
                    }
                    class700 var356 = new class700();
                    var356.field9745 = var355;
                    var356.field9757 = var355.field10061;
                    var356.field9751 = field4108 + 1;
                    class14.field200.method3116(29066, var356);
                    return;
                }
            } else if (arg0 < 2600) {
                class712 var77 = class733.method4073(true, field4101[--field4097]);
                if (arg0 == 2500) {
                    field4101[field4097++] = var77.field10048;
                    return;
                }
                if (arg0 == 2501) {
                    field4101[field4097++] = var77.field10013;
                    return;
                }
                if (arg0 == 2502) {
                    field4101[field4097++] = var77.field9966;
                    return;
                }
                if (arg0 == 2503) {
                    field4101[field4097++] = var77.field10011;
                    return;
                }
                if (arg0 == 2504) {
                    field4101[field4097++] = var77.field10015 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field4101[field4097++] = var77.field10030;
                    return;
                }
                if (arg0 == 1506) {
                    class712 var78 = class101.method686(-1, var77);
                    field4101[field4097++] = var78 == null ? -1 : var78.field9998;
                    return;
                }
            } else if (arg0 < 2700) {
                class712 var79 = class733.method4073(true, field4101[--field4097]);
                if (arg0 == 2600) {
                    field4101[field4097++] = var79.field9971;
                    return;
                }
                if (arg0 == 2601) {
                    field4101[field4097++] = var79.field10014;
                    return;
                }
                if (arg0 == 2602) {
                    field4091[field4094++] = var79.field10062;
                    return;
                }
                if (arg0 == 2603) {
                    field4101[field4097++] = var79.field10097;
                    return;
                }
                if (arg0 == 2604) {
                    field4101[field4097++] = var79.field10002;
                    return;
                }
                if (arg0 == 2605) {
                    field4101[field4097++] = var79.field9997;
                    return;
                }
                if (arg0 == 2606) {
                    field4101[field4097++] = var79.field10050;
                    return;
                }
                if (arg0 == 2607) {
                    field4101[field4097++] = var79.field10064;
                    return;
                }
                if (arg0 == 2608) {
                    field4101[field4097++] = var79.field10102;
                    return;
                }
                if (arg0 == 2609) {
                    field4101[field4097++] = var79.field10024;
                    return;
                }
                if (arg0 == 2610) {
                    field4101[field4097++] = var79.field10067;
                    return;
                }
                if (arg0 == 2611) {
                    field4101[field4097++] = var79.field9978;
                    return;
                }
                if (arg0 == 2612) {
                    field4101[field4097++] = var79.field9973;
                    return;
                }
                if (arg0 == 2613) {
                    field4101[field4097++] = var79.field9951;
                    return;
                }
                if (arg0 == 2614) {
                    field4101[field4097++] = var79.field10038 == 1 ? var79.field9937 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class712 var80 = class733.method4073(true, field4101[--field4097]);
                    field4101[field4097++] = var80.field9953;
                    return;
                }
                if (arg0 == 2701) {
                    class712 var81 = class733.method4073(true, field4101[--field4097]);
                    if (var81.field9953 != -1) {
                        field4101[field4097++] = var81.field10017;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field4101[--field4097];
                    class14 var83 = (class14) class426.field5894.method1381(true, (long) var82);
                    if (var83 != null) {
                        field4101[field4097++] = 1;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class712 var84 = class733.method4073(true, field4101[--field4097]);
                    if (var84.field9981 == null) {
                        field4101[field4097++] = 0;
                        return;
                    }
                    int var85 = var84.field9981.length;
                    for (int var86 = 0; var86 < var84.field9981.length; var86++) {
                        if (var84.field9981[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field4101[field4097++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field4097 -= 2;
                    int var87 = field4101[field4097];
                    int var88 = field4101[field4097 + 1];
                    class14 var89 = (class14) class426.field5894.method1381(true, (long) var87);
                    if (var89 != null && var89.field194 == var88) {
                        field4101[field4097++] = 1;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class712 var90 = class733.method4073(true, field4101[--field4097]);
                if (arg0 == 2800) {
                    field4101[field4097++] = client.method2675(var90).method647((byte) -125);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field4101[--field4097];
                    int var358 = var91 - 1;
                    if (var90.field10086 != null && var358 < var90.field10086.length && var90.field10086[var358] != null) {
                        field4091[field4094++] = var90.field10086[var358];
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field9941 == null) {
                        field4091[field4094++] = "";
                        return;
                    }
                    field4091[field4094++] = var90.field9941;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field4091[--field4094];
                    class594.method3521(var92, true);
                    return;
                }
                if (arg0 == 3101) {
                    field4097 -= 2;
                    class500.method2991(field4101[field4097 + 1], class473.field6483, field4101[field4097], (byte) 4);
                    return;
                }
                if (arg0 == 3103) {
                    class619.method3630(true, (byte) -128);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field4091[--field4094];
                    int var94 = 0;
                    if (class264.method1628(var93, 0)) {
                        var94 = class665.method3815(var93, -128);
                    }
                    field4087++;
                    class120 var95 = class292.method1716(class608.field8668, true, class275.field3700);
                    var95.field1653.method199(true, var94);
                    class471.method2805(107, var95);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field4091[--field4094];
                    field4096++;
                    class120 var97 = class292.method1716(class608.field8668, true, class387.field5403);
                    var97.field1653.method184(var96.length() + 1, -44);
                    var97.field1653.method187(var96, (byte) -98);
                    class471.method2805(110, var97);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field4091[--field4094];
                    field4088++;
                    class120 var99 = class292.method1716(class608.field8668, true, class700.field9760);
                    var99.field1653.method184(var98.length() + 1, -57);
                    var99.field1653.method187(var98, (byte) -124);
                    class471.method2805(127, var99);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field4101[--field4097];
                    String var101 = field4091[--field4094];
                    class467.method2787(true, var100, var101);
                    return;
                }
                if (arg0 == 3108) {
                    field4097 -= 3;
                    int var102 = field4101[field4097];
                    int var103 = field4101[field4097 + 1];
                    int var104 = field4101[field4097 + 2];
                    class712 var105 = class733.method4073(true, var104);
                    class366.method2054(var105, true, var102, var103);
                    return;
                }
                if (arg0 == 3109) {
                    field4097 -= 2;
                    int var106 = field4101[field4097];
                    int var107 = field4101[field4097 + 1];
                    class712 var108 = arg1 ? field4085 : field4102;
                    class366.method2054(var108, true, var106, var107);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field4101[--field4097];
                    field4098++;
                    class120 var110 = class292.method1716(class608.field8668, true, class467.field6376);
                    var110.field1653.method147((byte) 53, var109);
                    class471.method2805(121, var110);
                    return;
                }
                if (arg0 == 3111) {
                    field4097 -= 2;
                    int var111 = field4101[field4097];
                    int var112 = field4101[field4097 + 1];
                    class14 var113 = (class14) class426.field5894.method1381(true, (long) var111);
                    if (var113 != null) {
                        class197.method1325(var113, (byte) 79, true, var113.field194 != var112);
                    }
                    class442.method2641(Integer.MAX_VALUE, var111, true, 3, var112);
                    return;
                }
                if (arg0 == 3112) {
                    field4097--;
                    int var114 = field4101[field4097];
                    class14 var115 = (class14) class426.field5894.method1381(true, (long) var114);
                    if (var115 != null && var115.field195 == 3) {
                        class197.method1325(var115, (byte) 89, true, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class245.method1559(110, field4091[--field4094]);
                    return;
                }
                if (arg0 == 3114) {
                    field4097 -= 2;
                    int var116 = field4101[field4097];
                    int var117 = field4101[field4097 + 1];
                    String var118 = field4091[--field4094];
                    class441.method2638("", var117, (byte) 17, "", var118, "", var116);
                    return;
                }
                if (arg0 == 3115) {
                    field4097 -= 11;
                    class92[] var119 = class327.method1910((byte) -17);
                    class482[] var120 = class488.method2860((byte) 107);
                    class518.method3078(field4101[field4097 + 2], field4101[field4097 + 10], var119[field4101[field4097]], field4101[field4097 + 4], field4101[field4097 + 7], field4101[field4097 + 9], 3408, field4101[field4097 + 8], field4101[field4097 + 3], field4101[field4097 + 5], var120[field4101[field4097 + 1]], field4101[field4097 + 6]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field4097 -= 3;
                    class151.method967(0, 255, field4101[field4097 + 1], field4101[field4097], 256, field4101[field4097 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class692.method3938(50, (byte) -68, field4101[--field4097], 255);
                    return;
                }
                if (arg0 == 3202) {
                    field4097 -= 2;
                    class69.method442(false, field4101[field4097], field4101[field4097 + 1], 255);
                    return;
                }
                if (arg0 == 3203) {
                    field4097 -= 4;
                    class151.method967(0, field4101[field4097 + 3], field4101[field4097 + 1], field4101[field4097], 256, field4101[field4097 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field4097 -= 3;
                    class692.method3938(field4101[field4097 + 2], (byte) -68, field4101[field4097], field4101[field4097 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field4097 -= 3;
                    class69.method442(false, field4101[field4097], field4101[field4097 + 1], field4101[field4097 + 2]);
                    return;
                }
                if (arg0 == 3206) {
                    field4097 -= 4;
                    class167.method1060(field4101[field4097 + 2], (byte) 127, false, field4101[field4097], 256, field4101[field4097 + 1], field4101[field4097 + 3]);
                    return;
                }
                if (arg0 == 3207) {
                    field4097 -= 4;
                    class167.method1060(field4101[field4097 + 2], (byte) 127, true, field4101[field4097], 256, field4101[field4097 + 1], field4101[field4097 + 3]);
                    return;
                }
                if (arg0 == 3208) {
                    field4097 -= 5;
                    class151.method967(0, field4101[field4097 + 3], field4101[field4097 + 1], field4101[field4097], field4101[field4097 + 4], field4101[field4097 + 2]);
                    return;
                }
                if (arg0 == 3209) {
                    field4097 -= 5;
                    class167.method1060(field4101[field4097 + 2], (byte) 122, false, field4101[field4097], field4101[field4097 + 4], field4101[field4097 + 1], field4101[field4097 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field4101[field4097++] = class245.field3409;
                    return;
                }
                if (arg0 == 3301) {
                    field4097 -= 2;
                    int var121 = field4101[field4097];
                    int var122 = field4101[field4097 + 1];
                    field4101[field4097++] = class393.method2391(-1, var122, false, var121);
                    return;
                }
                if (arg0 == 3302) {
                    field4097 -= 2;
                    int var123 = field4101[field4097];
                    int var124 = field4101[field4097 + 1];
                    field4101[field4097++] = class220.method1441(false, var123, var124, 2);
                    return;
                }
                if (arg0 == 3303) {
                    field4097 -= 2;
                    int var125 = field4101[field4097];
                    int var126 = field4101[field4097 + 1];
                    field4101[field4097++] = class63.method402(var126, -121, var125, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field4101[--field4097];
                    field4101[field4097++] = class17.field217.method1374(var127, 75).field6418;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field4101[--field4097];
                    field4101[field4097++] = class149.field2061[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field4101[--field4097];
                    field4101[field4097++] = class260.field3534[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field4101[--field4097];
                    field4101[field4097++] = class253.field3504[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class473.field6483.field9501;
                    int var132 = (class473.field6483.field9490 >> 9) + class179.field2535;
                    int var133 = (class473.field6483.field9489 >> 9) + class510.field7109;
                    field4101[field4097++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field4101[--field4097];
                    field4101[field4097++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field4101[--field4097];
                    field4101[field4097++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field4101[--field4097];
                    field4101[field4097++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field4101[field4097++] = class191.field2769 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field4097 -= 2;
                    int var137 = field4101[field4097];
                    int var138 = field4101[field4097 + 1];
                    field4101[field4097++] = class393.method2391(-1, var138, true, var137);
                    return;
                }
                if (arg0 == 3314) {
                    field4097 -= 2;
                    int var139 = field4101[field4097];
                    int var140 = field4101[field4097 + 1];
                    field4101[field4097++] = class220.method1441(true, var139, var140, 2);
                    return;
                }
                if (arg0 == 3315) {
                    field4097 -= 2;
                    int var141 = field4101[field4097];
                    int var142 = field4101[field4097 + 1];
                    field4101[field4097++] = class63.method402(var142, -99, var141, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class467.field6375 >= 2) {
                        field4101[field4097++] = class467.field6375;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field4101[field4097++] = class658.field9294;
                    return;
                }
                if (arg0 == 3318) {
                    field4101[field4097++] = class396.field5504.field812;
                    return;
                }
                if (arg0 == 3321) {
                    field4101[field4097++] = class432.field5938;
                    return;
                }
                if (arg0 == 3322) {
                    field4101[field4097++] = class157.field2141;
                    return;
                }
                if (arg0 == 3323) {
                    if (class178.field2465 >= 5 && class178.field2465 <= 9) {
                        field4101[field4097++] = 1;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class178.field2465 >= 5 && class178.field2465 <= 9) {
                        field4101[field4097++] = class178.field2465;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field4101[field4097++] = class290.field3796 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field4101[field4097++] = class473.field6483.field9242;
                    return;
                }
                if (arg0 == 3327) {
                    field4101[field4097++] = class473.field6483.field9257.field9038 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field4101[field4097++] = class330.field4240 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field4101[--field4097];
                    field4101[field4097++] = class474.method2814((byte) 68, var143, false);
                    return;
                }
                if (arg0 == 3331) {
                    field4097 -= 2;
                    int var144 = field4101[field4097];
                    int var145 = field4101[field4097 + 1];
                    field4101[field4097++] = class407.method2484(var144, 127, var145, false, false);
                    return;
                }
                if (arg0 == 3332) {
                    field4097 -= 2;
                    int var146 = field4101[field4097];
                    int var147 = field4101[field4097 + 1];
                    field4101[field4097++] = class407.method2484(var146, 118, var147, true, false);
                    return;
                }
                if (arg0 == 3333) {
                    field4101[field4097++] = class33.field488;
                    return;
                }
                if (arg0 == 3335) {
                    field4101[field4097++] = class369.field4721;
                    return;
                }
                if (arg0 == 3336) {
                    field4097 -= 4;
                    int var148 = field4101[field4097];
                    int var149 = field4101[field4097 + 1];
                    int var150 = field4101[field4097 + 2];
                    int var151 = field4101[field4097 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field4101[field4097++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field4101[field4097++] = class711.field9915;
                    return;
                }
                if (arg0 == 3338) {
                    field4101[field4097++] = class139.method901((byte) 50);
                    return;
                }
                if (arg0 == 3339) {
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field4101[field4097++] = class614.field8741 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field4101[field4097++] = class64.field888 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field4101[field4097++] = class93.field1263.method805(0);
                    return;
                }
                if (arg0 == 3343) {
                    field4101[field4097++] = class93.field1263.method806(0);
                    return;
                }
                if (arg0 == 3344) {
                    field4091[field4094++] = class226.method1463((byte) 0);
                    return;
                }
                if (arg0 == 3345) {
                    field4091[field4094++] = class616.method3616(false);
                    return;
                }
                if (arg0 == 3346) {
                    field4101[field4097++] = class486.method2849((byte) -82);
                    return;
                }
                if (arg0 == 3347) {
                    field4101[field4097++] = class538.field7530;
                    return;
                }
                if (arg0 == 3349) {
                    field4101[field4097++] = class473.field6483.field8327.method2661(15) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field4097 -= 2;
                    int var155 = field4101[field4097];
                    int var156 = field4101[field4097 + 1];
                    class507 var157 = class751.field10442.method991(var155, false);
                    field4091[field4094++] = var157.method3023((byte) 125, var156);
                    return;
                }
                if (arg0 == 3408) {
                    field4097 -= 4;
                    int var158 = field4101[field4097];
                    int var159 = field4101[field4097 + 1];
                    int var160 = field4101[field4097 + 2];
                    int var161 = field4101[field4097 + 3];
                    class507 var162 = class751.field10442.method991(var160, false);
                    if (var162.field7087 == var158 && var162.field7088 == var159) {
                        if (var159 == 115) {
                            field4091[field4094++] = var162.method3023((byte) 45, var161);
                            return;
                        }
                        field4101[field4097++] = var162.method3033((byte) -113, var161);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field4097 -= 3;
                    int var163 = field4101[field4097];
                    int var164 = field4101[field4097 + 1];
                    int var165 = field4101[field4097 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class507 var166 = class751.field10442.method991(var164, false);
                    if (var166.field7088 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field4101[field4097++] = var166.method3029(-28, var165) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field4101[--field4097];
                    String var168 = field4091[--field4094];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class507 var169 = class751.field10442.method991(var167, false);
                    if (var169.field7088 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field4101[field4097++] = var169.method3032(var168, 2) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field4101[--field4097];
                    class507 var171 = class751.field10442.method991(var170, false);
                    field4101[field4097++] = var171.field7092.method1388(false);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class693.field9691 == 0) {
                        field4101[field4097++] = -2;
                        return;
                    }
                    if (class693.field9691 == 1) {
                        field4101[field4097++] = -1;
                        return;
                    }
                    field4101[field4097++] = class713.field10110;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field4101[--field4097];
                    if (class693.field9691 == 2 && var172 < class713.field10110) {
                        field4091[field4094++] = class570.field8079[var172];
                        if (class82.field1117[var172] != null) {
                            field4091[field4094++] = class82.field1117[var172];
                            return;
                        }
                        field4091[field4094++] = "";
                        return;
                    }
                    field4091[field4094++] = "";
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field4101[--field4097];
                    if (class693.field9691 == 2 && var173 < class713.field10110) {
                        field4101[field4097++] = class139.field1905[var173];
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field4101[--field4097];
                    if (class693.field9691 == 2 && var174 < class713.field10110) {
                        field4101[field4097++] = class652.field9212[var174];
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field4091[--field4094];
                    int var176 = field4101[--field4097];
                    class252.method1595(var176, var175, 1);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field4091[--field4094];
                    class638.method3710(var177, (byte) 81);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field4091[--field4094];
                    class324.method1892((byte) -125, var178);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field4091[--field4094];
                    class616.method3617((byte) 74, false, var179);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field4091[--field4094];
                    class118.method775(var180, (byte) 43);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field4091[--field4094];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field4101[field4097++] = class161.method1008(var181, -125) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field4101[--field4097];
                    if (class693.field9691 == 2 && var182 < class713.field10110) {
                        field4091[field4094++] = class370.field4735[var182];
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class540.field7552 != null) {
                        field4091[field4094++] = class169.method1067(51, class540.field7552);
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class540.field7552 != null) {
                        field4101[field4097++] = class656.field9289;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field4101[--field4097];
                    if (class540.field7552 != null && var183 < class656.field9289) {
                        field4091[field4094++] = class265.field3618[var183].field2879;
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field4101[--field4097];
                    if (class540.field7552 != null && var184 < class656.field9289) {
                        field4101[field4097++] = class265.field3618[var184].field2880;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field4101[--field4097];
                    if (class540.field7552 != null && var185 < class656.field9289) {
                        field4101[field4097++] = class265.field3618[var185].field2882;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field4101[field4097++] = class5.field37;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field4091[--field4094];
                    class526.method3133(var186, (byte) -49);
                    return;
                }
                if (arg0 == 3618) {
                    field4101[field4097++] = class207.field2950;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field4091[--field4094];
                    class617.method3619(1, var187);
                    return;
                }
                if (arg0 == 3620) {
                    class144.method939(107);
                    return;
                }
                if (arg0 == 3621) {
                    if (class693.field9691 == 0) {
                        field4101[field4097++] = -1;
                        return;
                    }
                    field4101[field4097++] = class458.field6302;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field4101[--field4097];
                    if (class693.field9691 != 0 && var188 < class458.field6302) {
                        field4091[field4094++] = class46.field674[var188];
                        if (class270.field3639[var188] != null) {
                            field4091[field4094++] = class270.field3639[var188];
                            return;
                        }
                        field4091[field4094++] = "";
                        return;
                    }
                    field4091[field4094++] = "";
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field4091[--field4094];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field4101[field4097++] = class640.method3721(var189, (byte) 117) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field4101[--field4097];
                    if (class265.field3618 != null && var190 < class656.field9289 && class265.field3618[var190].field2884.equalsIgnoreCase(class473.field6483.field9272)) {
                        field4101[field4097++] = 1;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class453.field6244 != null) {
                        field4091[field4094++] = class453.field6244;
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field4101[--field4097];
                    if (class540.field7552 != null && var191 < class656.field9289) {
                        field4091[field4094++] = class265.field3618[var191].field2885;
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field4101[--field4097];
                    if (class693.field9691 == 2 && var192 >= 0 && var192 < class713.field10110) {
                        field4101[field4097++] = class669.field9419[var192] ? 1 : 0;
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field4091[--field4094];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field4101[field4097++] = class267.method1640(var193, -11279);
                    return;
                }
                if (arg0 == 3629) {
                    field4101[field4097++] = class382.field5363;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field4091[--field4094];
                    class616.method3617((byte) 114, true, var194);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field4101[--field4097];
                    field4101[field4097++] = class272.field3671[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field4101[--field4097];
                    if (class540.field7552 != null && var196 < class656.field9289) {
                        field4091[field4094++] = class265.field3618[var196].field2884;
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field4101[--field4097];
                    if (class693.field9691 != 0 && var197 < class458.field6302) {
                        field4091[field4094++] = class144.field1996[var197];
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field4101[--field4097];
                    field4101[field4097++] = class293.field3827[var198].method2795((byte) 126);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field4101[--field4097];
                    field4101[field4097++] = class293.field3827[var199].field6407;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field4101[--field4097];
                    field4101[field4097++] = class293.field3827[var200].field6415;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field4101[--field4097];
                    field4101[field4097++] = class293.field3827[var201].field6412;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field4101[--field4097];
                    field4101[field4097++] = class293.field3827[var202].field6411;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field4101[--field4097];
                    field4101[field4097++] = class293.field3827[var203].field6406;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field4101[--field4097];
                    int var205 = class293.field3827[var204].method2792(21);
                    field4101[field4097++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field4101[--field4097];
                    int var207 = class293.field3827[var206].method2792(-114);
                    field4101[field4097++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field4101[--field4097];
                    int var209 = class293.field3827[var208].method2792(-115);
                    field4101[field4097++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field4101[--field4097];
                    int var211 = class293.field3827[var210].method2792(24);
                    field4101[field4097++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field4097 -= 2;
                    int var212 = field4101[field4097];
                    int var213 = field4101[field4097 + 1];
                    field4101[field4097++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field4097 -= 2;
                    int var214 = field4101[field4097];
                    int var215 = field4101[field4097 + 1];
                    field4101[field4097++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field4097 -= 2;
                    int var216 = field4101[field4097];
                    int var217 = field4101[field4097 + 1];
                    field4101[field4097++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field4097 -= 2;
                    int var218 = field4101[field4097];
                    int var219 = field4101[field4097 + 1];
                    field4101[field4097++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field4101[--field4097];
                    field4101[field4097++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field4101[--field4097];
                    field4101[field4097++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field4097 -= 5;
                    int var222 = field4101[field4097];
                    int var223 = field4101[field4097 + 1];
                    int var224 = field4101[field4097 + 2];
                    int var225 = field4101[field4097 + 3];
                    int var226 = field4101[field4097 + 4];
                    field4101[field4097++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field4097 -= 2;
                    long var227 = (long) field4101[field4097];
                    long var229 = (long) field4101[field4097 + 1];
                    field4101[field4097++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field4097 -= 2;
                    int var231 = field4101[field4097];
                    int var232 = field4101[field4097 + 1];
                    field4101[field4097++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field4097 -= 2;
                    int var233 = field4101[field4097];
                    int var234 = field4101[field4097 + 1];
                    field4101[field4097++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field4097 -= 2;
                    int var235 = field4101[field4097];
                    int var236 = field4101[field4097 + 1];
                    field4101[field4097++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field4097 -= 2;
                    int var237 = field4101[field4097];
                    int var238 = field4101[field4097 + 1];
                    field4101[field4097++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field4097 -= 2;
                    int var239 = field4101[field4097];
                    int var240 = field4101[field4097 + 1];
                    if (var239 == 0) {
                        field4101[field4097++] = 0;
                        return;
                    }
                    field4101[field4097++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field4097 -= 2;
                    int var241 = field4101[field4097];
                    int var242 = field4101[field4097 + 1];
                    if (var241 == 0) {
                        field4101[field4097++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field4101[field4097++] = Integer.MAX_VALUE;
                        return;
                    }
                    field4101[field4097++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field4097 -= 2;
                    int var243 = field4101[field4097];
                    int var244 = field4101[field4097 + 1];
                    field4101[field4097++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field4097 -= 2;
                    int var245 = field4101[field4097];
                    int var246 = field4101[field4097 + 1];
                    field4101[field4097++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field4097 -= 2;
                    int var247 = field4101[field4097];
                    int var248 = field4101[field4097 + 1];
                    field4101[field4097++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field4097 -= 2;
                    int var249 = field4101[field4097];
                    int var250 = field4101[field4097 + 1];
                    field4101[field4097++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field4097 -= 3;
                    long var251 = (long) field4101[field4097];
                    long var253 = (long) field4101[field4097 + 1];
                    long var255 = (long) field4101[field4097 + 2];
                    field4101[field4097++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field4097 -= 2;
                    int var257 = field4101[field4097];
                    int var258 = field4101[field4097 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field4101[field4097++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field4101[field4097++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field4091[--field4094];
                    int var262 = field4101[--field4097];
                    field4091[field4094++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field4094 -= 2;
                    String var263 = field4091[field4094];
                    String var264 = field4091[field4094 + 1];
                    field4091[field4094++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field4091[--field4094];
                    int var266 = field4101[--field4097];
                    field4091[field4094++] = var265 + class103.method694(true, var266, (byte) -107);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field4091[--field4094];
                    field4091[field4094++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field4091[field4094++] = method1841(field4101[--field4097]);
                    return;
                }
                if (arg0 == 4105) {
                    field4094 -= 2;
                    String var268 = field4091[field4094];
                    String var269 = field4091[field4094 + 1];
                    if (class473.field6483.field9257 != null && class473.field6483.field9257.field9038) {
                        field4091[field4094++] = var269;
                        return;
                    }
                    field4091[field4094++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field4101[--field4097];
                    field4091[field4094++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field4094 -= 2;
                    field4101[field4097++] = class504.method3019(class369.field4721, 0, field4091[field4094 + 1], field4091[field4094]);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field4091[--field4094];
                    field4097 -= 2;
                    int var272 = field4101[field4097];
                    int var273 = field4101[field4097 + 1];
                    class742 var274 = class378.method2286(class448.field6168, -21, 0, var273);
                    field4101[field4097++] = var274.method4137(class209.field2979, -8629, var271, var272);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field4091[--field4094];
                    field4097 -= 2;
                    int var276 = field4101[field4097];
                    int var277 = field4101[field4097 + 1];
                    class742 var278 = class378.method2286(class448.field6168, -47, 0, var277);
                    field4101[field4097++] = var278.method4133(var276, var275, -100, class209.field2979);
                    return;
                }
                if (arg0 == 4110) {
                    field4094 -= 2;
                    String var279 = field4091[field4094];
                    String var280 = field4091[field4094 + 1];
                    if (field4101[--field4097] == 1) {
                        field4091[field4094++] = var279;
                        return;
                    }
                    field4091[field4094++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field4091[--field4094];
                    field4091[field4094++] = class287.method1705(var281, (byte) 48);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field4091[--field4094];
                    int var283 = field4101[--field4097];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field4091[field4094++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field4101[--field4097];
                    field4101[field4097++] = method1845((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field4101[--field4097];
                    field4101[field4097++] = class235.method1502((char) var285, (byte) -121) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field4101[--field4097];
                    field4101[field4097++] = class86.method523((byte) 114, (char) var286) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field4101[--field4097];
                    field4101[field4097++] = class714.method4027((byte) -120, (char) var287) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field4091[--field4094];
                    if (var288 != null) {
                        field4101[field4097++] = var288.length();
                        return;
                    }
                    field4101[field4097++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field4091[--field4094];
                    field4097 -= 2;
                    int var290 = field4101[field4097];
                    int var291 = field4101[field4097 + 1];
                    field4091[field4094++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field4091[--field4094];
                    StringBuffer var293 = new StringBuffer(var292.length());
                    boolean var294 = false;
                    for (int var295 = 0; var295 < var292.length(); var295++) {
                        char var296 = var292.charAt(var295);
                        if (var296 == '<') {
                            var294 = true;
                        } else if (var296 == '>') {
                            var294 = false;
                        } else if (!var294) {
                            var293.append(var296);
                        }
                    }
                    field4091[field4094++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field4091[--field4094];
                    field4097 -= 2;
                    int var298 = field4101[field4097];
                    int var299 = field4101[field4097 + 1];
                    field4101[field4097++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field4094 -= 2;
                    String var300 = field4091[field4094];
                    String var301 = field4091[field4094 + 1];
                    int var302 = field4101[--field4097];
                    field4101[field4097++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field4101[--field4097];
                    field4101[field4097++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field4101[--field4097];
                    field4101[field4097++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field4101[--field4097] != 0;
                    int var306 = field4101[--field4097];
                    field4091[field4094++] = class670.method3836(-88, 0, var305, (long) var306, class369.field4721);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field4091[--field4094];
                    int var308 = field4101[--field4097];
                    class742 var309 = class378.method2286(class448.field6168, -21, 0, var308);
                    field4101[field4097++] = var309.method4140(1, var307, class209.field2979);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field4101[--field4097];
                    field4091[field4094++] = class487.field6572.method3054(var310, (byte) -99).field7672;
                    return;
                }
                if (arg0 == 4201) {
                    field4097 -= 2;
                    int var311 = field4101[field4097];
                    int var312 = field4101[field4097 + 1];
                    class544 var313 = class487.field6572.method3054(var311, (byte) -99);
                    if (var312 >= 1 && var312 <= 5 && var313.field7623[var312 - 1] != null) {
                        field4091[field4094++] = var313.field7623[var312 - 1];
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field4097 -= 2;
                    int var314 = field4101[field4097];
                    int var315 = field4101[field4097 + 1];
                    class544 var316 = class487.field6572.method3054(var314, (byte) -99);
                    if (var315 >= 1 && var315 <= 5 && var316.field7654[var315 - 1] != null) {
                        field4091[field4094++] = var316.field7654[var315 - 1];
                        return;
                    }
                    field4091[field4094++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field4101[--field4097];
                    field4101[field4097++] = class487.field6572.method3054(var317, (byte) -99).field7638;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field4101[--field4097];
                    field4101[field4097++] = class487.field6572.method3054(var318, (byte) -99).field7626 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field4101[--field4097];
                    class544 var320 = class487.field6572.method3054(var319, (byte) -99);
                    if (var320.field7655 == -1 && var320.field7679 >= 0) {
                        field4101[field4097++] = var320.field7679;
                        return;
                    }
                    field4101[field4097++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field4101[--field4097];
                    class544 var322 = class487.field6572.method3054(var321, (byte) -99);
                    if (var322.field7655 >= 0 && var322.field7679 >= 0) {
                        field4101[field4097++] = var322.field7679;
                        return;
                    }
                    field4101[field4097++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field4101[--field4097];
                    field4101[field4097++] = class487.field6572.method3054(var323, (byte) -99).field7670 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field4097 -= 2;
                    int var324 = field4101[field4097];
                    int var325 = field4101[field4097 + 1];
                    class752 var326 = class223.field3134.method2390(1, var325);
                    if (var326.method4169(117)) {
                        field4091[field4094++] = class487.field6572.method3054(var324, (byte) -99).method3237(64, var326.field10449, var325);
                        return;
                    }
                    field4101[field4097++] = class487.field6572.method3054(var324, (byte) -99).method3238(var326.field10448, 25427, var325);
                    return;
                }
                if (arg0 == 4209) {
                    field4097 -= 2;
                    int var327 = field4101[field4097];
                    int var328 = field4101[field4097 + 1] - 1;
                    class544 var329 = class487.field6572.method3054(var327, (byte) -99);
                    if (var329.field7607 == var328) {
                        field4101[field4097++] = var329.field7637;
                        return;
                    }
                    if (var329.field7615 == var328) {
                        field4101[field4097++] = var329.field7609;
                        return;
                    }
                    field4101[field4097++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field4091[--field4094];
                    int var331 = field4101[--field4097];
                    class169.method1069(var331 == 1, 101, var330);
                    field4101[field4097++] = class165.field2262;
                    return;
                }
                if (arg0 == 4211) {
                    if (class178.field2466 != null && class744.field10375 < class165.field2262) {
                        field4101[field4097++] = class178.field2466[class744.field10375++] & 0xFFFF;
                        return;
                    }
                    field4101[field4097++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class744.field10375 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field4101[--field4097];
                    field4101[field4097++] = class487.field6572.method3054(var332, (byte) -99).field7604;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field4091[--field4094];
                    field4097 -= 3;
                    int var334 = field4101[field4097];
                    int var335 = field4101[field4097 + 1];
                    int var336 = field4101[field4097 + 2];
                    class213.method1406(var333, (byte) 116, var335, var334 == 1, var336);
                    field4101[field4097++] = class165.field2262;
                    return;
                }
                if (arg0 == 4215) {
                    field4094 -= 2;
                    field4097 -= 2;
                    String var337 = field4091[field4094];
                    int var338 = field4101[field4097];
                    int var339 = field4101[field4097 + 1];
                    String var340 = field4091[field4094 + 1];
                    class374.method2255(var340, var338 == 1, var339, (byte) -66, var337);
                    field4101[field4097++] = class165.field2262;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field4097 -= 2;
                    int var341 = field4101[field4097];
                    int var342 = field4101[field4097 + 1];
                    class752 var343 = class223.field3134.method2390(1, var342);
                    if (var343.method4169(125)) {
                        field4091[field4094++] = class643.field9112.method3887(var341, false).method54(var342, true, var343.field10449);
                        return;
                    }
                    field4101[field4097++] = class643.field9112.method3887(var341, false).method51(var343.field10448, -1, var342);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field4097 -= 2;
                    int var344 = field4101[field4097];
                    int var345 = field4101[field4097 + 1];
                    class752 var346 = class223.field3134.method2390(1, var345);
                    if (var346.method4169(68)) {
                        field4091[field4094++] = class264.field3604.method3188(var344, (byte) -57).method224(var346.field10449, -95, var345);
                        return;
                    }
                    field4101[field4097++] = class264.field3604.method3188(var344, (byte) -57).method218(var345, var346.field10448, (byte) -105);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field4097 -= 2;
                    int var347 = field4101[field4097];
                    int var348 = field4101[field4097 + 1];
                    class752 var349 = class223.field3134.method2390(1, var348);
                    if (var349.method4169(81)) {
                        field4091[field4094++] = class98.field1425.method4188(26, var347).method1107(var349.field10449, 41, var348);
                        return;
                    }
                    field4101[field4097++] = class98.field1425.method4188(26, var347).method1109(var349.field10448, -250, var348);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field4101[--field4097];
                class591 var351 = class544.field7653.method1644(var350, (byte) 25);
                if (var351.field8488 != null && var351.field8488.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field8487[0];
                    for (int var354 = 1; var354 < var351.field8488.length; var354++) {
                        if (var351.field8487[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field8487[var354];
                        }
                    }
                    field4101[field4097++] = var351.field8488[var352];
                    return;
                }
                field4101[field4097++] = var351.field8503;
                return;
            }
        } else {
            class712 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class733.method4073(true, field4101[--field4097]);
            } else {
                var51 = arg1 ? field4085 : field4102;
            }
            if (arg0 == 1300) {
                int var52 = field4101[--field4097] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method4016(var52, field4091[--field4094], (byte) -56);
                    return;
                }
                field4094--;
                return;
            }
            if (arg0 == 1301) {
                field4097 -= 2;
                int var53 = field4101[field4097];
                int var54 = field4101[field4097 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field10060 = null;
                    return;
                }
                var51.field10060 = class654.method3778((byte) -116, var53, var54);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field4101[--field4097];
                if (class586.field8429 != var55 && class528.field7378 != var55 && class111.field1593 != var55) {
                    return;
                }
                var51.field10063 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field10046 = field4101[--field4097];
                return;
            }
            if (arg0 == 1304) {
                var51.field9956 = field4101[--field4097];
                return;
            }
            if (arg0 == 1305) {
                var51.field9941 = field4091[--field4094];
                return;
            }
            if (arg0 == 1306) {
                var51.field10074 = field4091[--field4094];
                return;
            }
            if (arg0 == 1307) {
                var51.field10086 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field9957 = field4101[--field4097];
                var51.field10047 = field4101[--field4097];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field4101[--field4097];
                int var57 = field4101[--field4097];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method4000(var56, (byte) -102, var57 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field10055 = field4091[--field4094];
                return;
            }
            if (arg0 == 1311) {
                var51.field10003 = field4101[--field4097];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field4097 -= 3;
                    var58 = field4101[field4097] - 1;
                    var59 = field4101[field4097 + 1];
                    var60 = field4101[field4097 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field4097 -= 2;
                    var58 = 10;
                    var59 = field4101[field4097];
                    var60 = field4101[field4097 + 1];
                }
                if (var51.field10098 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field10098 = new byte[11];
                    var51.field9989 = new byte[11];
                    var51.field10083 = new int[11];
                }
                var51.field10098[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field9975 = false;
                    for (int var61 = 0; var61 < var51.field10098.length; var61++) {
                        if (var51.field10098[var61] != 0) {
                            var51.field9975 = true;
                            break;
                        }
                    }
                } else {
                    var51.field9975 = true;
                }
                var51.field9989[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field9967 = field4101[--field4097];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()V", line = 4395)
    public static void method1843() {
        field4083 = null;
        field4100 = null;
        field4084 = null;
        field4086 = null;
        field4101 = null;
        field4091 = null;
        field4099 = null;
        field4102 = null;
        field4085 = null;
        field4095 = null;
        field4081 = null;
        field4106 = null;
        field4107 = null;
        field4105 = null;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(IZ)V", line = 4422)
    private static final void method1844(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field4101[field4097++] = class431.field5933;
                return;
            }
            if (arg0 == 5001) {
                field4097 -= 3;
                class431.field5933 = field4101[field4097];
                class176.field2397 = class164.method1019(field4101[field4097 + 1], false);
                if (class176.field2397 == null) {
                    class176.field2397 = class167.field2283;
                }
                class721.field10183 = field4101[field4097 + 2];
                field4089++;
                class120 var2 = class292.method1716(class608.field8668, true, class682.field9585);
                var2.field1653.method184(class431.field5933, -121);
                var2.field1653.method184(class176.field2397.field746, -65);
                var2.field1653.method184(class721.field10183, -55);
                class471.method2805(124, var2);
                return;
            }
            if (arg0 == 5002) {
                field4094 -= 2;
                String var3 = field4091[field4094];
                String var4 = field4091[field4094 + 1];
                field4097 -= 2;
                int var5 = field4101[field4097];
                int var6 = field4101[field4097 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field4093++;
                class120 var7 = class292.method1716(class608.field8668, true, class159.field2146);
                var7.field1653.method184(class678.method3882(var3, (byte) 109) + class678.method3882(var4, (byte) 109) + 2, -62);
                var7.field1653.method187(var3, (byte) -72);
                var7.field1653.method184(var5 - 1, -124);
                var7.field1653.method184(var6, -33);
                var7.field1653.method187(var4, (byte) -63);
                class471.method2805(111, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field4101[--field4097];
                class330 var9 = class260.method1615(var8, -1);
                String var10 = "";
                if (var9 != null && var9.field4242 != null) {
                    var10 = var9.field4242;
                }
                field4091[field4094++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field4101[--field4097];
                class330 var12 = class260.method1615(var11, -1);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field4238;
                }
                field4101[field4097++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class176.field2397 == null) {
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = class176.field2397.field746;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field4101[--field4097];
                class120 var15 = class292.method1716(class608.field8668, true, class116.field1627);
                var15.field1653.method184(var14, -56);
                class471.method2805(101, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field4091[--field4094];
                method1848(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field4094 -= 2;
                String var17 = field4091[field4094];
                String var18 = field4091[field4094 + 1];
                if (class467.field6375 != 0 || (!class378.field5266 || class234.field3249) && !class330.field4240) {
                    field4090++;
                    class120 var19 = class292.method1716(class608.field8668, true, class702.field9778);
                    var19.field1653.method184(0, -35);
                    int var20 = var19.field1653.field330;
                    var19.field1653.method187(var17, (byte) -86);
                    class729.method4065(var19.field1653, var18, 11);
                    var19.field1653.method161(var19.field1653.field330 - var20, true);
                    class471.method2805(114, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field4101[--field4097];
                class330 var22 = class260.method1615(var21, -1);
                String var23 = "";
                if (var22 != null && var22.field4230 != null) {
                    var23 = var22.field4230;
                }
                field4091[field4094++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field4101[--field4097];
                class330 var25 = class260.method1615(var24, -1);
                String var26 = "";
                if (var25 != null && var25.field4226 != null) {
                    var26 = var25.field4226;
                }
                field4091[field4094++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field4101[--field4097];
                class330 var28 = class260.method1615(var27, -1);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field4234;
                }
                field4101[field4097++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class473.field6483 == null || class473.field6483.field9250 == null) {
                    var30 = "";
                } else {
                    var30 = class473.field6483.method3790(true, -1);
                }
                field4091[field4094++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field4101[field4097++] = class721.field10183;
                return;
            }
            if (arg0 == 5017) {
                field4101[field4097++] = class522.method3112(false);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field4101[--field4097];
                class330 var32 = class260.method1615(var31, -1);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field4231;
                }
                field4101[field4097++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field4101[--field4097];
                class330 var35 = class260.method1615(var34, -1);
                String var36 = "";
                if (var35 != null && var35.field4229 != null) {
                    var36 = var35.field4229;
                }
                field4091[field4094++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class473.field6483 == null || class473.field6483.field9250 == null) {
                    var37 = "";
                } else {
                    var37 = class473.field6483.method3791(-38, false);
                }
                field4091[field4094++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field4101[--field4097];
                class330 var39 = class260.method1615(var38, -1);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field4236;
                }
                field4101[field4097++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field4101[--field4097];
                class330 var42 = class260.method1615(var41, -1);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field4233;
                }
                field4101[field4097++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field4101[--field4097];
                class330 var45 = class260.method1615(var44, -1);
                String var46 = "";
                if (var45 != null && var45.field4225 != null) {
                    var46 = var45.field4225;
                }
                field4091[field4094++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field4101[--field4097];
                field4091[field4094++] = class139.field1910.method3674(0, var47).field3087;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field4101[--field4097];
                class218 var49 = class139.field1910.method3674(0, var48);
                if (var49.field3082 == null) {
                    field4101[field4097++] = 0;
                    return;
                }
                field4101[field4097++] = var49.field3082.length;
                return;
            }
            if (arg0 == 5052) {
                field4097 -= 2;
                int var50 = field4101[field4097];
                int var51 = field4101[field4097 + 1];
                class218 var52 = class139.field1910.method3674(0, var50);
                int var53 = var52.field3082[var51];
                field4101[field4097++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field4101[--field4097];
                class218 var55 = class139.field1910.method3674(0, var54);
                if (var55.field3080 == null) {
                    field4101[field4097++] = 0;
                    return;
                }
                field4101[field4097++] = var55.field3080.length;
                return;
            }
            if (arg0 == 5054) {
                field4097 -= 2;
                int var56 = field4101[field4097];
                int var57 = field4101[field4097 + 1];
                field4101[field4097++] = class139.field1910.method3674(0, var56).field3080[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field4101[--field4097];
                field4091[field4094++] = class225.field3151.method3658((byte) -45, var58).method2382(100);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field4101[--field4097];
                class391 var60 = class225.field3151.method3658((byte) -45, var59);
                if (var60.field5446 == null) {
                    field4101[field4097++] = 0;
                    return;
                }
                field4101[field4097++] = var60.field5446.length;
                return;
            }
            if (arg0 == 5057) {
                field4097 -= 2;
                int var61 = field4101[field4097];
                int var62 = field4101[field4097 + 1];
                field4101[field4097++] = class225.field3151.method3658((byte) -45, var61).field5446[var62];
                return;
            }
            if (arg0 == 5058) {
                field4095 = new class449();
                field4095.field6173 = field4101[--field4097];
                field4095.field6174 = class225.field3151.method3658((byte) -45, field4095.field6173);
                field4095.field6176 = new int[field4095.field6174.method2377(-122)];
                return;
            }
            if (arg0 == 5059) {
                field4104++;
                class120 var63 = class292.method1716(class608.field8668, true, class325.field4175);
                var63.field1653.method184(0, -88);
                int var64 = var63.field1653.field330;
                var63.field1653.method184(0, -89);
                var63.field1653.method147((byte) 53, field4095.field6173);
                field4095.field6174.method2374(field4095.field6176, 797, var63.field1653);
                var63.field1653.method161(var63.field1653.field330 - var64, true);
                class471.method2805(124, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field4091[--field4094];
                field4080++;
                class120 var66 = class292.method1716(class608.field8668, true, class11.field130);
                var66.field1653.method184(0, -68);
                int var67 = var66.field1653.field330;
                var66.field1653.method187(var65, (byte) -128);
                var66.field1653.method147((byte) 53, field4095.field6173);
                field4095.field6174.method2374(field4095.field6176, 797, var66.field1653);
                var66.field1653.method161(var66.field1653.field330 - var67, true);
                class471.method2805(119, var66);
                return;
            }
            if (arg0 == 5061) {
                field4104++;
                class120 var68 = class292.method1716(class608.field8668, true, class325.field4175);
                var68.field1653.method184(0, -116);
                int var69 = var68.field1653.field330;
                var68.field1653.method184(1, -126);
                var68.field1653.method147((byte) 53, field4095.field6173);
                field4095.field6174.method2374(field4095.field6176, 797, var68.field1653);
                var68.field1653.method161(var68.field1653.field330 - var69, true);
                class471.method2805(96, var68);
                return;
            }
            if (arg0 == 5062) {
                field4097 -= 2;
                int var70 = field4101[field4097];
                int var71 = field4101[field4097 + 1];
                field4101[field4097++] = class139.field1910.method3674(0, var70).field3088[var71];
                return;
            }
            if (arg0 == 5063) {
                field4097 -= 2;
                int var72 = field4101[field4097];
                int var73 = field4101[field4097 + 1];
                field4101[field4097++] = class139.field1910.method3674(0, var72).field3083[var73];
                return;
            }
            if (arg0 == 5064) {
                field4097 -= 2;
                int var74 = field4101[field4097];
                int var75 = field4101[field4097 + 1];
                if (var75 == -1) {
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = class139.field1910.method3674(0, var74).method1430((char) var75, -86);
                return;
            }
            if (arg0 == 5065) {
                field4097 -= 2;
                int var76 = field4101[field4097];
                int var77 = field4101[field4097 + 1];
                if (var77 == -1) {
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = class139.field1910.method3674(0, var76).method1425((char) var77, 0);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field4101[--field4097];
                field4101[field4097++] = class225.field3151.method3658((byte) -45, var78).method2377(-116);
                return;
            }
            if (arg0 == 5067) {
                field4097 -= 2;
                int var79 = field4101[field4097];
                int var80 = field4101[field4097 + 1];
                int var81 = class225.field3151.method3658((byte) -45, var79).method2376((byte) -87, var80).field9765;
                field4101[field4097++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field4097 -= 2;
                int var82 = field4101[field4097];
                int var83 = field4101[field4097 + 1];
                field4095.field6176[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field4097 -= 2;
                int var84 = field4101[field4097];
                int var85 = field4101[field4097 + 1];
                field4095.field6176[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field4097 -= 3;
                int var86 = field4101[field4097];
                int var87 = field4101[field4097 + 1];
                int var88 = field4101[field4097 + 2];
                class391 var89 = class225.field3151.method3658((byte) -45, var86);
                if (var89.method2376((byte) -87, var87).field9765 != 0) {
                    throw new RuntimeException("bad command");
                }
                field4101[field4097++] = var89.method2378(var88, (byte) 76, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field4091[--field4094];
                boolean var91 = field4101[--field4097] == 1;
                class570.method3408(var90, var91, (byte) -109);
                field4101[field4097++] = class165.field2262;
                return;
            }
            if (arg0 == 5072) {
                if (class178.field2466 != null && class744.field10375 < class165.field2262) {
                    field4101[field4097++] = class178.field2466[class744.field10375++] & 0xFFFF;
                    return;
                }
                field4101[field4097++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class744.field10375 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class196.field2837.method315(72, 86)) {
                    field4101[field4097++] = 1;
                    return;
                }
                field4101[field4097++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class196.field2837.method315(-22, 82)) {
                    field4101[field4097++] = 1;
                    return;
                }
                field4101[field4097++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class196.field2837.method315(116, 81)) {
                    field4101[field4097++] = 1;
                    return;
                }
                field4101[field4097++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class282.method1688(9179409, field4101[--field4097]);
                return;
            }
            if (arg0 == 5201) {
                field4101[field4097++] = class53.method359(200);
                return;
            }
            if (arg0 == 5205) {
                class257.method1604(field4101[--field4097], -1, -1, false, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field4101[--field4097];
                class520 var93 = class531.method3156(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = var93.field7274;
                return;
            }
            if (arg0 == 5207) {
                class520 var94 = class531.method3167(field4101[--field4097]);
                if (var94 != null && var94.field7259 != null) {
                    field4091[field4094++] = var94.field7259;
                    return;
                }
                field4091[field4094++] = "";
                return;
            }
            if (arg0 == 5208) {
                field4101[field4097++] = class274.field3685;
                field4101[field4097++] = class14.field196;
                return;
            }
            if (arg0 == 5209) {
                field4101[field4097++] = class538.field7524 + class531.field7447;
                field4101[field4097++] = class531.field7452 + class29.field372;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field4101[--field4097];
                class520 var96 = class531.method3167(var95);
                if (var96 == null) {
                    field4101[field4097++] = 0;
                    field4101[field4097++] = 0;
                    return;
                }
                field4101[field4097++] = var96.field7260 >> 14 & 0x3FFF;
                field4101[field4097++] = var96.field7260 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field4101[--field4097];
                class520 var98 = class531.method3167(var97);
                if (var98 == null) {
                    field4101[field4097++] = 0;
                    field4101[field4097++] = 0;
                    return;
                }
                field4101[field4097++] = var98.field7255 - var98.field7264;
                field4101[field4097++] = var98.field7271 - var98.field7266;
                return;
            }
            if (arg0 == 5212) {
                class753 var99 = class387.method2358((byte) -43);
                if (var99 == null) {
                    field4101[field4097++] = -1;
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = var99.field10459;
                int var100 = var99.field10461 << 28 | class531.field7447 + var99.field10465 << 14 | class531.field7452 + var99.field10456;
                field4101[field4097++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class753 var101 = class35.method246(-8156);
                if (var101 == null) {
                    field4101[field4097++] = -1;
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = var101.field10459;
                int var102 = var101.field10461 << 28 | class531.field7447 + var101.field10465 << 14 | class531.field7452 + var101.field10456;
                field4101[field4097++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field4101[--field4097];
                class520 var104 = class63.method407(2793);
                if (var104 != null) {
                    boolean var105 = var104.method3093(field4107, var103 >> 28 & 0x3, var103 >> 14 & 0x3FFF, true, var103 & 0x3FFF);
                    if (var105) {
                        class699.method3945(128, field4107[2], field4107[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field4097 -= 2;
                int var106 = field4101[field4097];
                int var107 = field4101[field4097 + 1];
                class98 var108 = class531.method3162(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class520 var110 = (class520) var108.method667(true); var110 != null; var110 = (class520) var108.method662((byte) 126)) {
                    if (var110.field7274 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field4101[field4097++] = 1;
                    return;
                }
                field4101[field4097++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field4101[--field4097];
                class520 var112 = class531.method3167(var111);
                if (var112 == null) {
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = var112.field7267;
                return;
            }
            if (arg0 == 5220) {
                field4101[field4097++] = class265.field3619 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field4101[--field4097];
                class699.method3945(128, var113 & 0x3FFF, var113 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class520 var114 = class63.method407(2793);
                if (var114 != null) {
                    boolean var115 = var114.method3090(class531.field7452 + class29.field372, 1062, field4107, class538.field7524 + class531.field7447);
                    if (var115) {
                        field4101[field4097++] = field4107[1];
                        field4101[field4097++] = field4107[2];
                        return;
                    }
                    field4101[field4097++] = -1;
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = -1;
                field4101[field4097++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field4097 -= 2;
                int var116 = field4101[field4097];
                int var117 = field4101[field4097 + 1];
                class257.method1604(var116, var117 >> 14 & 0x3FFF, var117 & 0x3FFF, false, -1);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field4101[--field4097];
                class520 var119 = class63.method407(2793);
                if (var119 != null) {
                    boolean var120 = var119.method3093(field4107, var118 >> 28 & 0x3, var118 >> 14 & 0x3FFF, true, var118 & 0x3FFF);
                    if (var120) {
                        field4101[field4097++] = field4107[1];
                        field4101[field4097++] = field4107[2];
                        return;
                    }
                    field4101[field4097++] = -1;
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = -1;
                field4101[field4097++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field4101[--field4097];
                class520 var122 = class63.method407(2793);
                if (var122 != null) {
                    boolean var123 = var122.method3090(var121 & 0x3FFF, 1062, field4107, var121 >> 14 & 0x3FFF);
                    if (var123) {
                        field4101[field4097++] = field4107[1];
                        field4101[field4097++] = field4107[2];
                        return;
                    }
                    field4101[field4097++] = -1;
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = -1;
                field4101[field4097++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class76.method469(field4101[--field4097], -116);
                return;
            }
            if (arg0 == 5227) {
                field4097 -= 2;
                int var124 = field4101[field4097];
                int var125 = field4101[field4097 + 1];
                class257.method1604(var124, var125 >> 14 & 0x3FFF, var125 & 0x3FFF, true, -1);
                return;
            }
            if (arg0 == 5228) {
                class464.field6348 = field4101[--field4097] == 1;
                return;
            }
            if (arg0 == 5229) {
                field4101[field4097++] = class464.field6348 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field4101[--field4097];
                class504.method3014(21006, var126);
                return;
            }
            if (arg0 == 5231) {
                field4097 -= 2;
                int var127 = field4101[field4097];
                boolean var128 = field4101[field4097 + 1] == 1;
                if (class122.field1670 != null) {
                    class513 var129 = class122.field1670.method1381(true, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method3065(-17363);
                        return;
                    }
                    if (var129 == null && var128) {
                        class513 var130 = new class513();
                        class122.field1670.method1387(var130, (long) var127, (byte) -105);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field4101[--field4097];
                if (class122.field1670 != null) {
                    class513 var132 = class122.field1670.method1381(true, (long) var131);
                    field4101[field4097++] = var132 == null ? 0 : 1;
                    return;
                }
                field4101[field4097++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field4097 -= 2;
                int var133 = field4101[field4097];
                boolean var134 = field4101[field4097 + 1] == 1;
                if (class252.field3488 != null) {
                    class513 var135 = class252.field3488.method1381(true, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method3065(-17363);
                        return;
                    }
                    if (var135 == null && var134) {
                        class513 var136 = new class513();
                        class252.field3488.method1387(var136, (long) var133, (byte) -123);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field4101[--field4097];
                if (class252.field3488 != null) {
                    class513 var138 = class252.field3488.method1381(true, (long) var137);
                    field4101[field4097++] = var138 == null ? 0 : 1;
                    return;
                }
                field4101[field4097++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field4101[field4097++] = class531.field7428 == null ? -1 : class531.field7428.field7274;
                return;
            }
            if (arg0 == 5236) {
                field4097 -= 2;
                int var139 = field4101[field4097];
                int var140 = field4101[field4097 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class237.method1513(var142, 11142, var141, var139);
                if (var143 < 0) {
                    field4101[field4097++] = -1;
                    return;
                }
                field4101[field4097++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class501.method2997((byte) 5);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field4097 -= 2;
                int var144 = field4101[field4097];
                int var145 = field4101[field4097 + 1];
                class518.method3079(false, var144, var145, true, 3);
                field4101[field4097++] = class455.field6257 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class455.field6257 != null) {
                    class518.method3079(false, -1, -1, true, class674.field9500.field5133.method1962(0));
                }
                return;
            }
            if (arg0 == 5302) {
                class473[] var146 = class571.method3413(-22947);
                field4101[field4097++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field4101[--field4097];
                class473[] var148 = class571.method3413(-22947);
                field4101[field4097++] = var148[var147].field6481;
                field4101[field4097++] = var148[var147].field6477;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class576.field8226;
                int var150 = class97.field1414;
                int var151 = -1;
                class473[] var152 = class571.method3413(-22947);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class473 var154 = var152[var153];
                    if (var154.field6481 == var149 && var154.field6477 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field4101[field4097++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field4101[field4097++] = class615.method3609((byte) 98);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field4101[--field4097];
                if (var155 >= 1 && var155 <= 2) {
                    class518.method3079(false, -1, -1, true, var155);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field4101[field4097++] = class674.field9500.field5133.method1962(0);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field4101[--field4097];
                if (var156 >= 1 && var156 <= 2) {
                    class674.field9500.method2250((byte) 108, var156, class674.field9500.field5133);
                    class674.field9500.method2250((byte) 103, var156, class674.field9500.field5150);
                    class199.method1350(-26159);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field4094 -= 2;
                String var157 = field4091[field4094];
                String var158 = field4091[field4094 + 1];
                int var159 = field4101[--field4097];
                field4103++;
                class120 var160 = class292.method1716(class608.field8668, true, class146.field2029);
                var160.field1653.method184(class678.method3882(var157, (byte) 109) + class678.method3882(var158, (byte) 109) + 1, -62);
                var160.field1653.method187(var157, (byte) -83);
                var160.field1653.method187(var158, (byte) -118);
                var160.field1653.method184(var159, -125);
                class471.method2805(111, var160);
                return;
            }
            if (arg0 == 5401) {
                field4097 -= 2;
                class149.field2058[field4101[field4097]] = (short) class612.method3574((byte) -117, field4101[field4097 + 1]);
                class487.field6572.method3051(false);
                class487.field6572.method3048((byte) 99);
                class643.field9112.method3880(true);
                class330.method1918(7);
                return;
            }
            if (arg0 == 5405) {
                field4097 -= 2;
                int var161 = field4101[field4097];
                int var162 = field4101[field4097 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class591.field8479[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field4097 -= 7;
                int var163 = field4101[field4097];
                int var164 = field4101[field4097 + 1] << 1;
                int var165 = field4101[field4097 + 2];
                int var166 = field4101[field4097 + 3];
                int var167 = field4101[field4097 + 4];
                int var168 = field4101[field4097 + 5];
                int var169 = field4101[field4097 + 6];
                if (var163 >= 0 && var163 < 2 && class591.field8479[var163] != null && var164 >= 0 && var164 < class591.field8479[var163].length) {
                    class591.field8479[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class591.field8479[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class591.field8479[field4101[--field4097]].length >> 1;
                field4101[field4097++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class455.field6257 != null) {
                    class518.method3079(false, -1, -1, true, class674.field9500.field5133.method1962(0));
                }
                if (class244.field3384 != null) {
                    class244.method1551(-101);
                    System.exit(0);
                    return;
                }
                String var171 = class638.field9074 == null ? class181.method1207((byte) -17) : class638.field9074;
                class592.method3516(9834, class674.field9500.field5158.method1006(0) == 1, false, var171, class379.field5339);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class156.field2134 != null) {
                    if (class156.field2134.field5973 == null) {
                        var172 = class130.method829(class156.field2134.field5974, false);
                    } else {
                        var172 = (String) class156.field2134.field5973;
                    }
                }
                field4091[field4094++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field4101[field4097++] = class379.field5339.field8732 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class455.field6257 != null) {
                    class518.method3079(false, -1, -1, true, class674.field9500.field5133.method1962(0));
                }
                String var173 = field4091[--field4094];
                boolean var174 = field4101[--field4097] == 1;
                String var175 = class181.method1207((byte) -17) + var173;
                class592.method3516(9834, class674.field9500.field5158.method1006(0) == 1, var174, var175, class379.field5339);
                return;
            }
            if (arg0 == 5422) {
                field4094 -= 2;
                String var176 = field4091[field4094];
                String var177 = field4091[field4094 + 1];
                int var178 = field4101[--field4097];
                if (var176.length() > 0) {
                    if (class457.field6286 == null) {
                        class457.field6286 = new String[class487.field6569[class210.field2984.field1662]];
                    }
                    class457.field6286[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class371.field4896 == null) {
                        class371.field4896 = new String[class487.field6569[class210.field2984.field1662]];
                    }
                    class371.field4896[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field4091[--field4094]);
                return;
            }
            if (arg0 == 5424) {
                field4097 -= 11;
                class324.field4169 = field4101[field4097];
                class146.field2021 = field4101[field4097 + 1];
                class423.field5855 = field4101[field4097 + 2];
                class284.field3762 = field4101[field4097 + 3];
                class15.field201 = field4101[field4097 + 4];
                class20.field249 = field4101[field4097 + 5];
                class57.field787 = field4101[field4097 + 6];
                class702.field9773 = field4101[field4097 + 7];
                class499.field6986 = field4101[field4097 + 8];
                class82.field1118 = field4101[field4097 + 9];
                class742.field10345 = field4101[field4097 + 10];
                class323.field4156.method3340(0, class15.field201);
                class323.field4156.method3340(0, class20.field249);
                class323.field4156.method3340(0, class57.field787);
                class323.field4156.method3340(0, class702.field9773);
                class323.field4156.method3340(0, class499.field6986);
                class677.field9539 = null;
                class625.field8929 = null;
                class652.field9221 = null;
                class718.field10143 = null;
                class589.field8463 = null;
                class367.field4707 = null;
                class672.field9451 = null;
                class639.field9081 = null;
                class33.field496 = true;
                return;
            }
            if (arg0 == 5425) {
                class713.method4017((byte) -104);
                class33.field496 = false;
                return;
            }
            if (arg0 == 5426) {
                field4097 -= 2;
                class623.field8898 = field4101[field4097];
                class448.field6162 = field4101[field4097 + 1];
                return;
            }
            if (arg0 == 5427) {
                field4097 -= 2;
                class686.field9627 = field4101[field4097 + 1];
                return;
            }
            if (arg0 == 5428) {
                field4097 -= 2;
                int var179 = field4101[field4097];
                int var180 = field4101[field4097 + 1];
                field4101[field4097++] = class571.method3412(var180, 10, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class564.method3367(-90, false, field4091[--field4094], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class208.method1378("accountcreated", class622.field8847, -9875);
                    return;
                } catch (Throwable var321) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class208.method1378("accountcreatestarted", class622.field8847, -9875);
                    return;
                } catch (Throwable var322) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class278.field3716 != null) {
                    Transferable var182 = class278.field3716.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var323) {
                        }
                    }
                }
                field4091[field4094++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class292.field3822 = field4101[--field4097];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field4097 -= 4;
                int var183 = field4101[field4097];
                int var184 = field4101[field4097 + 1];
                int var185 = field4101[field4097 + 2];
                int var186 = field4101[field4097 + 3];
                class294.method1724((var183 & 0x3FFF) - class510.field7109, -3582, var184 << 2, var186, false, var185, (var183 >> 14 & 0x3FFF) - class179.field2535);
                return;
            }
            if (arg0 == 5501) {
                field4097 -= 4;
                int var187 = field4101[field4097];
                int var188 = field4101[field4097 + 1];
                int var189 = field4101[field4097 + 2];
                int var190 = field4101[field4097 + 3];
                class652.method3771(var188 << 2, (var187 & 0x3FFF) - class510.field7109, 200, (var187 >> 14 & 0x3FFF) - class179.field2535, var189, var190);
                return;
            }
            if (arg0 == 5502) {
                field4097 -= 6;
                int var191 = field4101[field4097];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class599.field8597 = var191;
                int var192 = field4101[field4097 + 1];
                if (var192 + 1 >= class591.field8479[class599.field8597].length >> 1) {
                    throw new RuntimeException();
                }
                class724.field10199 = var192;
                class704.field9793 = 0;
                class667.field9397 = field4101[field4097 + 2];
                class623.field8894 = field4101[field4097 + 3];
                int var193 = field4101[field4097 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class99.field1429 = var193;
                int var194 = field4101[field4097 + 5];
                if (var194 + 1 >= class591.field8479[class99.field1429].length >> 1) {
                    throw new RuntimeException();
                }
                class48.field710 = var194;
                class665.field9377 = 3;
                class374.field5167 = -1;
                class13.field180 = -1;
                return;
            }
            if (arg0 == 5503) {
                class345.method1981(81);
                return;
            }
            if (arg0 == 5504) {
                field4097 -= 2;
                class747.method4151(0, field4101[field4097], field4101[field4097 + 1], (byte) -99);
                return;
            }
            if (arg0 == 5505) {
                field4101[field4097++] = (int) class223.field3131 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field4101[field4097++] = (int) class403.field5597 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class108.method731((byte) 78);
                return;
            }
            if (arg0 == 5508) {
                class23.method131(false);
                return;
            }
            if (arg0 == 5509) {
                class683.method3901((byte) 30);
                return;
            }
            if (arg0 == 5510) {
                class284.method1700((byte) 11);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field4101[--field4097];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class179.field2535;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class514.field7179) {
                    var198 = class514.field7179;
                }
                int var199 = var197 - class510.field7109;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class456.field6281) {
                    var199 = class456.field6281;
                }
                class264.field3603 = (var198 << 9) + 256;
                class668.field9412 = (var199 << 9) + 256;
                class665.field9377 = 4;
                class374.field5167 = -1;
                class13.field180 = -1;
                return;
            }
            if (arg0 == 5512) {
                class396.method2412(40960);
                return;
            }
            if (arg0 == 5514) {
                class527.field7374 = field4101[--field4097];
                return;
            }
            if (arg0 == 5516) {
                field4101[field4097++] = class527.field7374;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field4101[--field4097];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class179.field2535;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class514.field7179) {
                        var203 = class514.field7179;
                    }
                    int var204 = var202 - class510.field7109;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class456.field6281) {
                        var204 = class456.field6281;
                    }
                    class13.field180 = (var203 << 9) + 256;
                    class374.field5167 = (var204 << 9) + 256;
                    return;
                }
                class13.field180 = -1;
                class374.field5167 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field4094 -= 2;
                String var205 = field4091[field4094];
                String var206 = field4091[field4094 + 1];
                int var207 = field4101[--field4097];
                if (var205.length() > 320) {
                    return;
                }
                if (class213.field3004 != 3) {
                    return;
                }
                if (class213.field3003 == 0 && class95.field1393 == 0) {
                    class552.field7816 = var205;
                    class392.field5460 = var206;
                    class33.field488 = var207;
                    class647.method3754(6, true);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class551.method3291(-7923);
                return;
            }
            if (arg0 == 5602) {
                if (class213.field3003 == 0) {
                    class142.field1978 = -2;
                    class178.field2525 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field4094--;
                if (class213.field3004 != 3) {
                    return;
                }
                if (class213.field3003 == 0 && class95.field1393 == 0) {
                    class296.method1739(field4091[field4094], -24967);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field4094 -= 2;
                field4097 -= 2;
                if (class213.field3004 != 3) {
                    return;
                }
                if (class213.field3003 == 0 && class95.field1393 == 0) {
                    class222.method1446(field4091[field4094], field4101[field4097 + 1] == 1, field4091[field4094 + 1], 99, field4101[field4097]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class95.field1393 == 0) {
                    class530.field7420 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field4101[field4097++] = class178.field2525;
                return;
            }
            if (arg0 == 5608) {
                field4101[field4097++] = class262.field3583;
                return;
            }
            if (arg0 == 5609) {
                field4101[field4097++] = class530.field7420;
                return;
            }
            if (arg0 == 5611) {
                field4101[field4097++] = class260.field3538;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field4101[--field4097];
                if (class213.field3004 != 7) {
                    return;
                }
                if (class213.field3003 == 0 && class95.field1393 == 0) {
                    if (class275.field3699 != null) {
                        class275.field3699.method2461(false);
                        class275.field3699 = null;
                    }
                    class33.field488 = var208;
                    class647.method3754(9, true);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field4101[field4097++] = class178.field2525;
                return;
            }
            if (arg0 == 5615) {
                field4094 -= 2;
                String var209 = field4091[field4094];
                String var210 = field4091[field4094 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class213.field3004 != 3) {
                    return;
                }
                if (class213.field3003 == 0 && class95.field1393 == 0) {
                    if (class275.field3699 != null) {
                        class275.field3699.method2461(false);
                        class275.field3699 = null;
                    }
                    class552.field7816 = var209;
                    class392.field5460 = var210;
                    class647.method3754(5, true);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class529.method3148(0, false);
                return;
            }
            if (arg0 == 5617) {
                field4101[field4097++] = class142.field1978;
                return;
            }
            if (arg0 == 5618) {
                field4097--;
                return;
            }
            if (arg0 == 5619) {
                field4097--;
                return;
            }
            if (arg0 == 5620) {
                field4101[field4097++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field4094 -= 2;
                field4097 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class617.field8784 != null) {
                    field4101[field4097++] = 1;
                    return;
                }
                field4101[field4097++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field4101[field4097++] = (int) (class471.field6468 >> 32);
                field4101[field4097++] = (int) (class471.field6468 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field4101[field4097++] = class624.field8919 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class624.field8919 = true;
                class608.method3557(-8092);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field4101[--field4097];
                class674.field9500.method2250((byte) 113, var211, class674.field9500.field5115);
                class126.method817(-1);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field4101[--field4097] == 1;
                class674.field9500.method2250((byte) 112, var212 ? 1 : 0, class674.field9500.field5159);
                class674.field9500.method2250((byte) 114, var212 ? 1 : 0, class674.field9500.field5113);
                class126.method817(-1);
                class78.method474(-3625);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field4101[--field4097] == 1;
                class674.field9500.method2250((byte) 104, var213 ? 2 : 1, class674.field9500.field5119);
                class674.field9500.method2250((byte) 91, var213 ? 2 : 1, class674.field9500.field5122);
                class78.method474(-3625);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6005) {
                class674.field9500.method2250((byte) 117, field4101[--field4097] == 1 ? 1 : 0, class674.field9500.field5131);
                class126.method817(-1);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6007) {
                class674.field9500.method2250((byte) 84, field4101[--field4097], class674.field9500.field5137);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6008) {
                class674.field9500.method2250((byte) 115, field4101[--field4097] == 1 ? 1 : 0, class674.field9500.field5154);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6010) {
                class674.field9500.method2250((byte) 107, field4101[--field4097] == 1 ? 1 : 0, class674.field9500.field5168);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6011) {
                class674.field9500.method2250((byte) 91, field4101[--field4097], class674.field9500.field5151);
                class126.method817(-1);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6012) {
                class674.field9500.method2250((byte) 121, field4101[--field4097] == 1 ? 1 : 0, class674.field9500.field5162);
                class469.method2794(false);
                class507.method3027(-1);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6014) {
                class674.field9500.method2250((byte) 105, field4101[--field4097] == 1 ? 2 : 0, class674.field9500.field5134);
                class126.method817(-1);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6015) {
                class674.field9500.method2250((byte) 86, field4101[--field4097] == 1 ? 1 : 0, class674.field9500.field5143);
                class126.method817(-1);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6016) {
                class674.field9500.method2250((byte) 110, field4101[--field4097], class674.field9500.field5155);
                class736.method4088((byte) 122, false, class674.field9500.field5158.method1006(0));
                class199.method1350(-26159);
                return;
            }
            if (arg0 == 6017) {
                class674.field9500.method2250((byte) 118, field4101[--field4097] == 1 ? 1 : 0, class674.field9500.field5128);
                class200.method1353(false);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6018) {
                class674.field9500.method2250((byte) 112, field4101[--field4097], class674.field9500.field5142);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field4101[--field4097];
                int var215 = class674.field9500.field5121.method3216(0);
                if (var214 != var215) {
                    if (class439.method2630(class213.field3004, (byte) -78)) {
                        if (var215 == 0 && class555.field7841 != -1) {
                            class82.method489(class555.field7841, class76.field1047, false, 0, (byte) -31, var214);
                            class637.method3701(-4198);
                            class105.field1538 = false;
                        } else if (var214 == 0) {
                            class23.method128(-6);
                            class105.field1538 = false;
                        } else {
                            class150.method966((byte) -128, var214);
                        }
                    }
                    class674.field9500.method2250((byte) 110, var214, class674.field9500.field5121);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class674.field9500.method2250((byte) 113, field4101[--field4097], class674.field9500.field5114);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class674.field9500.field5119.method3071(0);
                class674.field9500.method2250((byte) 115, field4101[--field4097] == 1 ? 0 : var216, class674.field9500.field5122);
                class78.method474(-3625);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field4101[--field4097];
                class674.field9500.method2250((byte) 125, var217, class674.field9500.field5148);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6024) {
                class674.field9500.method2250((byte) 91, field4101[--field4097], class674.field9500.field5135);
                class199.method1350(-26159);
                return;
            }
            if (arg0 == 6025) {
                class674.field9500.method2250((byte) 116, field4101[--field4097], class674.field9500.field5120);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field4101[--field4097];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class191.method1269(-1, var218 == 1);
                return;
            }
            if (arg0 == 6028) {
                class674.field9500.method2250((byte) 112, field4101[--field4097] == 0 ? 0 : 1, class674.field9500.field5144);
                class199.method1350(-26159);
                return;
            }
            if (arg0 == 6029) {
                class674.field9500.method2250((byte) 102, field4101[--field4097], class674.field9500.field5137);
                class199.method1350(-26159);
                return;
            }
            if (arg0 == 6030) {
                class674.field9500.method2250((byte) 116, field4101[--field4097] == 0 ? 0 : 1, class674.field9500.field5163);
                class199.method1350(-26159);
                class126.method817(-1);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field4101[--field4097];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class736.method4088((byte) 122, false, var219);
                return;
            }
            if (arg0 == 6032) {
                class674.field9500.method2250((byte) 108, field4101[--field4097], class674.field9500.field5118);
                class674.field9500.method2250((byte) 109, 0, class674.field9500.field5117);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6033) {
                class674.field9500.method2250((byte) 98, field4101[--field4097], class674.field9500.field5153);
                class199.method1350(-26159);
                return;
            }
            if (arg0 == 6034) {
                class674.field9500.method2250((byte) 92, field4101[--field4097] == 1 ? 1 : 0, class674.field9500.field5130);
                class199.method1350(-26159);
                class469.method2794(false);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6035) {
                int var220 = class674.field9500.field5159.method3798(0);
                class674.field9500.method2250((byte) 89, field4101[--field4097] == 1 ? 1 : var220, class674.field9500.field5113);
                class126.method817(-1);
                class78.method474(-3625);
                return;
            }
            if (arg0 == 6036) {
                class674.field9500.method2250((byte) 109, field4101[--field4097], class674.field9500.field5139);
                class199.method1350(-26159);
                class295.field3852 = true;
                return;
            }
            if (arg0 == 6037) {
                class674.field9500.method2250((byte) 117, field4101[--field4097], class674.field9500.field5141);
                class199.method1350(-26159);
                class83.field1158 = false;
                return;
            }
            if (arg0 == 6038) {
                int var221 = field4101[--field4097];
                int var222 = class674.field9500.field5112.method3216(0);
                if (var221 != var222 && class658.field9295 == class555.field7841) {
                    if (!class439.method2630(class213.field3004, (byte) -78)) {
                        if (var222 == 0) {
                            class82.method489(class555.field7841, class76.field1047, false, 0, (byte) -31, var221);
                            class637.method3701(-4198);
                            class105.field1538 = false;
                        } else if (var221 == 0) {
                            class23.method128(-6);
                            class105.field1538 = false;
                        } else {
                            class150.method966((byte) -125, var221);
                        }
                    }
                    class674.field9500.method2250((byte) 109, var221, class674.field9500.field5112);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var223 = field4101[--field4097];
                if (var223 > 255 || var223 < 0) {
                    var223 = 0;
                }
                if (var223 != class674.field9500.field5140.method72(0)) {
                    class674.field9500.method2250((byte) 115, var223, class674.field9500.field5140);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var224 = field4101[--field4097];
                if (var224 != class674.field9500.field5129.method1636(0)) {
                    class674.field9500.method2250((byte) 85, var224, class674.field9500.field5129);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    class48.method331((byte) 27);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field4101[field4097++] = class674.field9500.field5115.method2769(0);
                return;
            }
            if (arg0 == 6102) {
                field4101[field4097++] = class674.field9500.field5159.method3798(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field4101[field4097++] = class674.field9500.field5119.method3071(0) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field4101[field4097++] = class674.field9500.field5131.method2840(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field4101[field4097++] = class674.field9500.field5137.method231(0);
                return;
            }
            if (arg0 == 6108) {
                field4101[field4097++] = class674.field9500.field5154.method1259(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field4101[field4097++] = class674.field9500.field5168.method2781(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field4101[field4097++] = class674.field9500.field5151.method2364(0);
                return;
            }
            if (arg0 == 6112) {
                field4101[field4097++] = class674.field9500.field5162.method1586(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field4101[field4097++] = class674.field9500.field5134.method2336(0) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field4101[field4097++] = class674.field9500.field5143.method656(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field4101[field4097++] = class674.field9500.field5155.method133(0);
                return;
            }
            if (arg0 == 6117) {
                field4101[field4097++] = class674.field9500.field5128.method2987(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field4101[field4097++] = class674.field9500.field5142.method3216(0);
                return;
            }
            if (arg0 == 6119) {
                field4101[field4097++] = class674.field9500.field5121.method3216(0);
                return;
            }
            if (arg0 == 6120) {
                field4101[field4097++] = class674.field9500.field5114.method3216(0);
                return;
            }
            if (arg0 == 6123) {
                field4101[field4097++] = class33.method238(-1);
                return;
            }
            if (arg0 == 6124) {
                field4101[field4097++] = class674.field9500.field5135.method133(0);
                return;
            }
            if (arg0 == 6125) {
                field4101[field4097++] = class674.field9500.field5120.method3602(0);
                return;
            }
            if (arg0 == 6127) {
                field4101[field4097++] = class674.field9500.field5132.method3744(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field4101[field4097++] = class674.field9500.field5144.method1058(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field4101[field4097++] = class674.field9500.field5137.method231(0);
                return;
            }
            if (arg0 == 6130) {
                field4101[field4097++] = class674.field9500.field5163.method989(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field4101[field4097++] = class674.field9500.field5158.method1006(0);
                return;
            }
            if (arg0 == 6132) {
                field4101[field4097++] = class674.field9500.field5118.method1006(0);
                return;
            }
            if (arg0 == 6133) {
                field4101[field4097++] = class379.field5339.field8732 && !class379.field5339.field8720 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field4101[field4097++] = class674.field9500.field5153.method3270(0);
                return;
            }
            if (arg0 == 6136) {
                field4101[field4097++] = class674.field9500.field5130.method1257(0) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field4101[field4097++] = class477.method2825(200, class674.field9500.field5158.method1006(0), -50);
                return;
            }
            if (arg0 == 6139) {
                field4101[field4097++] = class674.field9500.field5139.method3774(0);
                return;
            }
            if (arg0 == 6142) {
                field4101[field4097++] = class674.field9500.field5141.method3216(0);
                return;
            }
            if (arg0 == 6143) {
                field4101[field4097++] = class674.field9500.field5112.method3216(0);
                return;
            }
            if (arg0 == 6144) {
                field4101[field4097++] = class442.field6070 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field4101[field4097++] = class674.field9500.field5140.method72(0);
                return;
            }
            if (arg0 == 6146) {
                field4101[field4097++] = class674.field9500.field5129.method1636(0);
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field4097 -= 2;
                class160.field2200 = (short) field4101[field4097];
                if (class160.field2200 <= 0) {
                    class160.field2200 = 256;
                }
                class510.field7113 = (short) field4101[field4097 + 1];
                if (class510.field7113 <= 0) {
                    class510.field7113 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field4097 -= 2;
                class13.field179 = (short) field4101[field4097];
                if (class13.field179 <= 0) {
                    class13.field179 = 256;
                }
                class610.field8686 = (short) field4101[field4097 + 1];
                if (class610.field8686 <= 0) {
                    class610.field8686 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field4097 -= 4;
                class125.field1702 = (short) field4101[field4097];
                if (class125.field1702 <= 0) {
                    class125.field1702 = 1;
                }
                class624.field8917 = (short) field4101[field4097 + 1];
                if (class624.field8917 <= 0) {
                    class624.field8917 = 32767;
                } else if (class624.field8917 < class125.field1702) {
                    class624.field8917 = class125.field1702;
                }
                class554.field7823 = (short) field4101[field4097 + 2];
                if (class554.field7823 <= 0) {
                    class554.field7823 = 1;
                }
                class651.field9201 = (short) field4101[field4097 + 3];
                if (class651.field9201 <= 0) {
                    class651.field9201 = 32767;
                    return;
                }
                if (class651.field9201 < class554.field7823) {
                    class651.field9201 = class554.field7823;
                }
                return;
            }
            if (arg0 == 6203) {
                class538.method3214(class713.field10107.field10011, -124, 0, 0, false, class713.field10107.field9966);
                field4101[field4097++] = class729.field10213;
                field4101[field4097++] = class355.field4566;
                return;
            }
            if (arg0 == 6204) {
                field4101[field4097++] = class13.field179;
                field4101[field4097++] = class610.field8686;
                return;
            }
            if (arg0 == 6205) {
                field4101[field4097++] = class160.field2200;
                field4101[field4097++] = class510.field7113;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field4101[field4097++] = (int) (class224.method1457((byte) -62) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field4101[field4097++] = (int) (class224.method1457((byte) -62) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field4097 -= 3;
                int var225 = field4101[field4097];
                int var226 = field4101[field4097 + 1];
                int var227 = field4101[field4097 + 2];
                field4081.clear();
                field4081.set(11, 12);
                field4081.set(var227, var226, var225);
                int var228 = (int) (field4081.getTime().getTime() / 86400000L) - 11745;
                if (var227 < 1970) {
                    var228--;
                }
                field4101[field4097++] = var228;
                return;
            }
            if (arg0 == 6303) {
                field4081.clear();
                field4081.setTime(new Date(class224.method1457((byte) -62)));
                field4101[field4097++] = field4081.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var229 = field4101[--field4097];
                boolean var230 = true;
                if (var229 < 0) {
                    var230 = (var229 + 1) % 4 == 0;
                } else if (var229 < 1582) {
                    var230 = var229 % 4 == 0;
                } else if (var229 % 4 != 0) {
                    var230 = false;
                } else if (var229 % 100 != 0) {
                    var230 = true;
                } else if (var229 % 400 != 0) {
                    var230 = false;
                }
                field4101[field4097++] = var230 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field4101[field4097++] = class686.method3914((byte) 119) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field4101[field4097++] = class99.method674(18289) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class213.field3004 == 7 && class213.field3003 == 0 && class95.field1393 == 0) {
                    if (class539.field7543) {
                        field4101[field4097++] = 0;
                        return;
                    }
                    if (class387.field5414 > class224.method1457((byte) -62) - 1000L) {
                        field4101[field4097++] = 1;
                        return;
                    }
                    class539.field7543 = true;
                    class120 var231 = class292.method1716(class608.field8668, true, class624.field8909);
                    var231.field1653.method199(true, class560.field7964);
                    class471.method2805(97, var231);
                    field4101[field4097++] = 0;
                    return;
                }
                field4101[field4097++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class183 var232 = class364.method2044(true);
                if (var232 != null) {
                    field4101[field4097++] = var232.field2655;
                    field4101[field4097++] = var232.field5394;
                    field4091[field4094++] = var232.field2651;
                    class17 var233 = var232.method1222(-99);
                    field4101[field4097++] = var233.field216;
                    field4091[field4094++] = var233.field213;
                    field4101[field4097++] = var232.field5395;
                    field4101[field4097++] = var232.field2648;
                    field4091[field4094++] = var232.field2659;
                    return;
                }
                field4101[field4097++] = -1;
                field4101[field4097++] = 0;
                field4091[field4094++] = "";
                field4101[field4097++] = 0;
                field4091[field4094++] = "";
                field4101[field4097++] = 0;
                field4101[field4097++] = 0;
                field4091[field4094++] = "";
                return;
            }
            if (arg0 == 6502) {
                class183 var234 = class590.method3503(true);
                if (var234 != null) {
                    field4101[field4097++] = var234.field2655;
                    field4101[field4097++] = var234.field5394;
                    field4091[field4094++] = var234.field2651;
                    class17 var235 = var234.method1222(114);
                    field4101[field4097++] = var235.field216;
                    field4091[field4094++] = var235.field213;
                    field4101[field4097++] = var234.field5395;
                    field4101[field4097++] = var234.field2648;
                    field4091[field4094++] = var234.field2659;
                    return;
                }
                field4101[field4097++] = -1;
                field4101[field4097++] = 0;
                field4091[field4094++] = "";
                field4101[field4097++] = 0;
                field4091[field4094++] = "";
                field4101[field4097++] = 0;
                field4101[field4097++] = 0;
                field4091[field4094++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var236 = field4101[--field4097];
                String var237 = field4091[--field4094];
                if (class213.field3004 == 7 && class213.field3003 == 0 && class95.field1393 == 0) {
                    field4101[field4097++] = class470.method2800(-13796, var236, var237) ? 1 : 0;
                    return;
                }
                field4101[field4097++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var238 = field4101[--field4097];
                class183 var239 = class50.method340(var238, (byte) -98);
                if (var239 != null) {
                    field4101[field4097++] = var239.field5394;
                    field4091[field4094++] = var239.field2651;
                    class17 var240 = var239.method1222(26);
                    field4101[field4097++] = var240.field216;
                    field4091[field4094++] = var240.field213;
                    field4101[field4097++] = var239.field5395;
                    field4101[field4097++] = var239.field2648;
                    field4091[field4094++] = var239.field2659;
                    return;
                }
                field4101[field4097++] = -1;
                field4091[field4094++] = "";
                field4101[field4097++] = 0;
                field4091[field4094++] = "";
                field4101[field4097++] = 0;
                field4101[field4097++] = 0;
                field4091[field4094++] = "";
                return;
            }
            if (arg0 == 6507) {
                field4097 -= 4;
                int var241 = field4101[field4097];
                boolean var242 = field4101[field4097 + 1] == 1;
                int var243 = field4101[field4097 + 2];
                boolean var244 = field4101[field4097 + 3] == 1;
                class757.method4210(var243, var241, (byte) -107, var242, var244);
                return;
            }
            if (arg0 == 6508) {
                class351.method1999(0);
                return;
            }
            if (arg0 == 6509) {
                if (class213.field3004 != 7) {
                    return;
                }
                class699.field9743 = field4101[--field4097] == 1;
                return;
            }
            if (arg0 == 6510) {
                field4101[field4097++] = class59.field814;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class455.field6260 == class183.field2653) {
                if (arg0 == 6700) {
                    int var245 = class426.field5894.method1388(false);
                    if (class312.field4004 != -1) {
                        var245++;
                    }
                    field4101[field4097++] = var245;
                    return;
                }
                if (arg0 == 6701) {
                    int var246 = field4101[--field4097];
                    if (class312.field4004 != -1) {
                        if (var246 == 0) {
                            field4101[field4097++] = class312.field4004;
                            return;
                        }
                        var246--;
                    }
                    class14 var247 = (class14) class426.field5894.method1382(27901);
                    while (var246-- > 0) {
                        var247 = (class14) class426.field5894.method1383(false);
                    }
                    field4101[field4097++] = var247.field194;
                    return;
                }
                if (arg0 == 6702) {
                    int var248 = field4101[--field4097];
                    if (class491.field6599[var248] == null) {
                        field4091[field4094++] = "";
                        return;
                    }
                    String var249 = class491.field6599[var248][0].field10027;
                    if (var249 == null) {
                        field4091[field4094++] = "";
                        return;
                    }
                    field4091[field4094++] = var249.substring(0, var249.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var250 = field4101[--field4097];
                    if (class491.field6599[var250] == null) {
                        field4101[field4097++] = 0;
                        return;
                    }
                    field4101[field4097++] = class491.field6599[var250].length;
                    return;
                }
                if (arg0 == 6704) {
                    field4097 -= 2;
                    int var251 = field4101[field4097];
                    int var252 = field4101[field4097 + 1];
                    if (class491.field6599[var251] == null) {
                        field4091[field4094++] = "";
                        return;
                    }
                    String var253 = class491.field6599[var251][var252].field10027;
                    if (var253 == null) {
                        field4091[field4094++] = "";
                        return;
                    }
                    field4091[field4094++] = var253;
                    return;
                }
                if (arg0 == 6705) {
                    field4097 -= 2;
                    int var254 = field4101[field4097];
                    int var255 = field4101[field4097 + 1];
                    if (class491.field6599[var254] == null) {
                        field4101[field4097++] = 0;
                        return;
                    }
                    field4101[field4097++] = class491.field6599[var254][var255].field10071;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field4097 -= 3;
                    int var256 = field4101[field4097];
                    int var257 = field4101[field4097 + 1];
                    int var258 = field4101[field4097 + 2];
                    class140.method907(var258, "", 1, (byte) -85, var256 << 16 | var257);
                    return;
                }
                if (arg0 == 6708) {
                    field4097 -= 3;
                    int var259 = field4101[field4097];
                    int var260 = field4101[field4097 + 1];
                    int var261 = field4101[field4097 + 2];
                    class140.method907(var261, "", 2, (byte) -89, var259 << 16 | var260);
                    return;
                }
                if (arg0 == 6709) {
                    field4097 -= 3;
                    int var262 = field4101[field4097];
                    int var263 = field4101[field4097 + 1];
                    int var264 = field4101[field4097 + 2];
                    class140.method907(var264, "", 3, (byte) 110, var262 << 16 | var263);
                    return;
                }
                if (arg0 == 6710) {
                    field4097 -= 3;
                    int var265 = field4101[field4097];
                    int var266 = field4101[field4097 + 1];
                    int var267 = field4101[field4097 + 2];
                    class140.method907(var267, "", 4, (byte) 59, var265 << 16 | var266);
                    return;
                }
                if (arg0 == 6711) {
                    field4097 -= 3;
                    int var268 = field4101[field4097];
                    int var269 = field4101[field4097 + 1];
                    int var270 = field4101[field4097 + 2];
                    class140.method907(var270, "", 5, (byte) -116, var268 << 16 | var269);
                    return;
                }
                if (arg0 == 6712) {
                    field4097 -= 3;
                    int var271 = field4101[field4097];
                    int var272 = field4101[field4097 + 1];
                    int var273 = field4101[field4097 + 2];
                    class140.method907(var273, "", 6, (byte) -124, var271 << 16 | var272);
                    return;
                }
                if (arg0 == 6713) {
                    field4097 -= 3;
                    int var274 = field4101[field4097];
                    int var275 = field4101[field4097 + 1];
                    int var276 = field4101[field4097 + 2];
                    class140.method907(var276, "", 7, (byte) 54, var274 << 16 | var275);
                    return;
                }
                if (arg0 == 6714) {
                    field4097 -= 3;
                    int var277 = field4101[field4097];
                    int var278 = field4101[field4097 + 1];
                    int var279 = field4101[field4097 + 2];
                    class140.method907(var279, "", 8, (byte) -97, var277 << 16 | var278);
                    return;
                }
                if (arg0 == 6715) {
                    field4097 -= 3;
                    int var280 = field4101[field4097];
                    int var281 = field4101[field4097 + 1];
                    int var282 = field4101[field4097 + 2];
                    class140.method907(var282, "", 9, (byte) 52, var280 << 16 | var281);
                    return;
                }
                if (arg0 == 6716) {
                    field4097 -= 3;
                    int var283 = field4101[field4097];
                    int var284 = field4101[field4097 + 1];
                    int var285 = field4101[field4097 + 2];
                    class140.method907(var285, "", 10, (byte) -113, var283 << 16 | var284);
                    return;
                }
                if (arg0 == 6717) {
                    field4097 -= 3;
                    int var286 = field4101[field4097];
                    int var287 = field4101[field4097 + 1];
                    int var288 = field4101[field4097 + 2];
                    class712 var289 = class654.method3778((byte) -50, var286 << 16 | var287, var288);
                    class254.method1598((byte) -83);
                    class94 var290 = client.method2675(var289);
                    class445.method2655(var290.method647((byte) -125), true, var289, var290.field1376);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var291 = field4101[--field4097];
                    class185 var292 = class92.field1241.method1971(var291, -23851);
                    if (var292.field2710 == null) {
                        field4091[field4094++] = "";
                        return;
                    }
                    field4091[field4094++] = var292.field2710;
                    return;
                }
                if (arg0 == 6801) {
                    int var293 = field4101[--field4097];
                    class185 var294 = class92.field1241.method1971(var293, -23851);
                    field4101[field4097++] = var294.field2696;
                    return;
                }
                if (arg0 == 6802) {
                    int var295 = field4101[--field4097];
                    class185 var296 = class92.field1241.method1971(var295, -23851);
                    field4101[field4097++] = var296.field2712;
                    return;
                }
                if (arg0 == 6803) {
                    int var297 = field4101[--field4097];
                    class185 var298 = class92.field1241.method1971(var297, -23851);
                    field4101[field4097++] = var298.field2693;
                    return;
                }
                if (arg0 == 6804) {
                    field4097 -= 2;
                    int var299 = field4101[field4097];
                    int var300 = field4101[field4097 + 1];
                    class752 var301 = class223.field3134.method2390(1, var300);
                    if (var301.method4169(95)) {
                        field4091[field4094++] = class92.field1241.method1971(var299, -23851).method1241(115, var300, var301.field10449);
                        return;
                    }
                    field4101[field4097++] = class92.field1241.method1971(var299, -23851).method1244((byte) -126, var300, var301.field10448);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field4101[field4097++] = class378.field5266 && !class234.field3249 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field4101[field4097++] = class403.field5595;
                    return;
                }
                if (arg0 == 6902) {
                    field4101[field4097++] = class499.field6989;
                    return;
                }
                if (arg0 == 6903) {
                    field4101[field4097++] = class5.field42;
                    return;
                }
                if (arg0 == 6904) {
                    field4101[field4097++] = class514.field7182;
                    return;
                }
                if (arg0 == 6905) {
                    String var302 = "";
                    if (class156.field2134 != null) {
                        if (class156.field2134.field5973 == null) {
                            var302 = class130.method829(class156.field2134.field5974, false);
                        } else {
                            var302 = (String) class156.field2134.field5973;
                        }
                    }
                    field4091[field4094++] = var302;
                    return;
                }
                if (arg0 == 6906) {
                    field4101[field4097++] = class68.field954;
                    return;
                }
                if (arg0 == 6907) {
                    field4101[field4097++] = class522.field7340;
                    return;
                }
                if (arg0 == 6908) {
                    field4101[field4097++] = class252.field3484;
                    return;
                }
                if (arg0 == 6909) {
                    field4101[field4097++] = class252.field3475 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field4101[field4097++] = class231.field3219;
                    return;
                }
                if (arg0 == 6911) {
                    field4101[field4097++] = class162.field2245;
                    return;
                }
                if (arg0 == 6912) {
                    field4101[field4097++] = class404.field5609;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var303 = class608.method3552(-1);
                    field4101[field4097++] = class644.field9142 = class674.field9500.field5158.method1006(0);
                    field4101[field4097++] = var303;
                    class126.method817(-1);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class220.method1437(0);
                    class126.method817(-1);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class72.method460(58);
                    class126.method817(-1);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class668.method3825(-7220);
                    class126.method817(-1);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class144.method942(37, true);
                    class126.method817(-1);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class674.field9500.method2250((byte) 87, 0, class674.field9500.field5117);
                    class199.method1350(-26159);
                    class83.field1158 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class644.field9142 == 2) {
                        class620.field8828 = true;
                        return;
                    }
                    if (class644.field9142 == 1) {
                        class202.field2916 = true;
                        return;
                    }
                    if (class644.field9142 == 3) {
                        class235.field3256 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field4101[field4097++] = class674.field9500.field5117.method1979(0);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field4097 -= 2;
                    int var304 = field4101[field4097];
                    int var305 = field4101[field4097 + 1];
                    if (var304 != -1) {
                        if (var305 > 255) {
                            var305 = 255;
                        } else if (var305 < 0) {
                            var305 = 0;
                        }
                        class632.method3675(var304, (byte) 120, var305, false);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var306 = field4101[--field4097];
                    if (var306 != -1) {
                        class49.method334((byte) -96, var306);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var307 = field4101[--field4097];
                    if (var307 != -1) {
                        class12.method65(471, var307);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field4101[field4097++] = class202.method1356((byte) 18, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field4101[field4097++] = class674.field9500.field5131.method2841(true) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field4101[field4097++] = class674.field9500.field5168.method2778(true) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field4101[field4097++] = class674.field9500.field5151.method2361(true) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field4101[field4097++] = class674.field9500.field5134.method2335(true) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field4101[field4097++] = class674.field9500.field5135.method134(true) && class96.field1401.method2162() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field4101[field4097++] = class674.field9500.field5148.method2610(true) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field4101[field4097++] = class674.field9500.field5120.method3604(true) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field4101[field4097++] = class674.field9500.field5132.method3745(true) && class96.field1401.method2174() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field4101[field4097++] = class674.field9500.field5163.method988(true) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field4101[field4097++] = class674.field9500.field5130.method1256(true) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field4101[field4097++] = class674.field9500.field5139.method3772(true) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field4101[field4097++] = class674.field9500.field5143.method655(true) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field4101[field4097++] = class674.field9500.field5129.method1635(true) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var308 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5131.method75(var308, 123);
                    return;
                }
                if (arg0 == 7302) {
                    int var309 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5168.method75(var309, 126);
                    return;
                }
                if (arg0 == 7303) {
                    int var310 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5151.method75(var310, 127);
                    return;
                }
                if (arg0 == 7304) {
                    int var311 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5134.method75(var311, -69);
                    return;
                }
                if (arg0 == 7305) {
                    int var312 = field4101[--field4097];
                    if (!class96.field1401.method2162()) {
                        field4101[field4097++] = 3;
                        return;
                    }
                    field4101[field4097++] = class674.field9500.field5135.method75(var312, 124);
                    return;
                }
                if (arg0 == 7306) {
                    int var313 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5148.method75(var313, -104);
                    return;
                }
                if (arg0 == 7307) {
                    int var314 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5120.method75(var314, -30);
                    return;
                }
                if (arg0 == 7308) {
                    int var315 = field4101[--field4097];
                    if (!class96.field1401.method2174()) {
                        field4101[field4097++] = 3;
                        return;
                    }
                    field4101[field4097++] = class674.field9500.field5132.method75(var315, -6);
                    return;
                }
                if (arg0 == 7309) {
                    int var316 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5163.method75(var316, -54);
                    return;
                }
                if (arg0 == 7310) {
                    int var317 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5130.method75(var317, 127);
                    return;
                }
                if (arg0 == 7311) {
                    int var318 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5139.method75(var318, 123);
                    return;
                }
                if (arg0 == 7312) {
                    int var319 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5143.method75(var319, -101);
                    return;
                }
                if (arg0 == 7313) {
                    int var320 = field4101[--field4097];
                    field4101[field4097++] = class674.field9500.field5129.method75(var320, 1);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(C)I", line = 8119)
    private static final int method1845(char arg0) {
        return class238.method1516(4000, arg0) ? 1 : 0;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "()V", line = 8122)
    public static final void method1846() {
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V", line = 8129)
    private static final void method1847(int arg0) {
        class712 var1 = class733.method4073(true, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class712[] var3 = class13.field185[var2];
        if (var3 == null) {
            class712[] var4 = class491.field6599[var2];
            int var5 = var4.length;
            var3 = class13.field185[var2] = new class712[var5];
            class34.method242(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class34.method242(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 8166)
    private static final void method1848(String arg0, int arg1) {
        if (class467.field6375 == 0 && !(!class378.field5266 || class234.field3249) || class330.field4240) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class138.field1883.method891(-2041650704, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class138.field1883.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1884.method891(-2041650704, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class138.field1884.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1885.method891(-2041650704, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class138.field1885.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1886.method891(-2041650704, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class138.field1886.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1887.method891(-2041650704, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class138.field1887.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1888.method891(-2041650704, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class138.field1888.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1889.method891(-2041650704, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class138.field1889.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1890.method891(-2041650704, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class138.field1890.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1891.method891(-2041650704, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class138.field1891.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1892.method891(-2041650704, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class138.field1892.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1893.method891(-2041650704, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class138.field1893.method891(-2041650704, 0).length());
        } else if (var2.startsWith(class138.field1894.method891(-2041650704, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class138.field1894.method891(-2041650704, 0).length());
        } else if (class369.field4721 != 0) {
            if (var2.startsWith(class138.field1883.method891(-2041650704, class369.field4721))) {
                var3 = 0;
                arg0 = arg0.substring(class138.field1883.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1884.method891(-2041650704, class369.field4721))) {
                var3 = 1;
                arg0 = arg0.substring(class138.field1884.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1885.method891(-2041650704, class369.field4721))) {
                var3 = 2;
                arg0 = arg0.substring(class138.field1885.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1886.method891(-2041650704, class369.field4721))) {
                var3 = 3;
                arg0 = arg0.substring(class138.field1886.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1887.method891(-2041650704, class369.field4721))) {
                var3 = 4;
                arg0 = arg0.substring(class138.field1887.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1888.method891(-2041650704, class369.field4721))) {
                var3 = 5;
                arg0 = arg0.substring(class138.field1888.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1889.method891(-2041650704, class369.field4721))) {
                var3 = 6;
                arg0 = arg0.substring(class138.field1889.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1890.method891(-2041650704, class369.field4721))) {
                var3 = 7;
                arg0 = arg0.substring(class138.field1890.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1891.method891(-2041650704, class369.field4721))) {
                var3 = 8;
                arg0 = arg0.substring(class138.field1891.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1892.method891(-2041650704, class369.field4721))) {
                var3 = 9;
                arg0 = arg0.substring(class138.field1892.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1893.method891(-2041650704, class369.field4721))) {
                var3 = 10;
                arg0 = arg0.substring(class138.field1893.method891(-2041650704, class369.field4721).length());
            } else if (var2.startsWith(class138.field1894.method891(-2041650704, class369.field4721))) {
                var3 = 11;
                arg0 = arg0.substring(class138.field1894.method891(-2041650704, class369.field4721).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class138.field1895.method891(-2041650704, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class138.field1895.method891(-2041650704, 0).length());
        } else if (var4.startsWith(class138.field1896.method891(-2041650704, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class138.field1896.method891(-2041650704, 0).length());
        } else if (var4.startsWith(class138.field1897.method891(-2041650704, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class138.field1897.method891(-2041650704, 0).length());
        } else if (var4.startsWith(class138.field1898.method891(-2041650704, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class138.field1898.method891(-2041650704, 0).length());
        } else if (var4.startsWith(class138.field1899.method891(-2041650704, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class138.field1899.method891(-2041650704, 0).length());
        } else if (class369.field4721 != 0) {
            if (var4.startsWith(class138.field1895.method891(-2041650704, class369.field4721))) {
                var5 = 1;
                arg0 = arg0.substring(class138.field1895.method891(-2041650704, class369.field4721).length());
            } else if (var4.startsWith(class138.field1896.method891(-2041650704, class369.field4721))) {
                var5 = 2;
                arg0 = arg0.substring(class138.field1896.method891(-2041650704, class369.field4721).length());
            } else if (var4.startsWith(class138.field1897.method891(-2041650704, class369.field4721))) {
                var5 = 3;
                arg0 = arg0.substring(class138.field1897.method891(-2041650704, class369.field4721).length());
            } else if (var4.startsWith(class138.field1898.method891(-2041650704, class369.field4721))) {
                var5 = 4;
                arg0 = arg0.substring(class138.field1898.method891(-2041650704, class369.field4721).length());
            } else if (var4.startsWith(class138.field1899.method891(-2041650704, class369.field4721))) {
                var5 = 5;
                arg0 = arg0.substring(class138.field1899.method891(-2041650704, class369.field4721).length());
            }
        }
        field4092++;
        class120 var6 = class292.method1716(class608.field8668, true, class660.field9310);
        var6.field1653.method184(0, -83);
        int var7 = var6.field1653.field330;
        var6.field1653.method184(var3, -96);
        var6.field1653.method184(var5, -122);
        class729.method4065(var6.field1653, arg0, -94);
        var6.field1653.method161(var6.field1653.field330 - var7, true);
        class471.method2805(105, var6);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(IZ)V")
    public static final void method1849(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
    private static final void method1850(int arg0) {
        class712 var1 = class733.method4073(true, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class712[] var3 = class13.field185[var2];
        if (var3 == null) {
            class712[] var4 = class491.field6599[var2];
            int var5 = var4.length;
            var3 = class13.field185[var2] = new class712[var5];
            class34.method242(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class34.method242(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }
}
