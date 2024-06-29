import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class210 {

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "Ljr;")
    private class112 field2995 = new class112(64);

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "Lin;")
    private class91 field2993;

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "Lbf;")
    public static class536 field2988 = new class536();

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V")
    public static void method1440(int arg0) {
        if (arg0 > 92) {
            field2988 = null;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ljava/lang/String;BCLjava/lang/String;)Ljava/lang/String;")
    public static final String method1441(String arg0, byte arg1, char arg2, String arg3) {
        field2996++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg0.indexOf(arg2, var8);
                if (var8 < 0) {
                    break;
                }
                var8++;
                var6 += var7;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        if (arg1 > -77) {
            return null;
        }
        while (true) {
            int var11 = arg0.indexOf(arg2, var10);
            if (var11 < 0) {
                var9.append(arg0.substring(var10));
                return var9.toString();
            }
            var9.append(arg0.substring(var10, var11));
            var9.append(arg3);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1442(int arg0, int arg1, String arg2) {
        class324.field4491++;
        field2992++;
        class564 var3 = class227.method1594(class544.field7496, class72.field1320, arg0 - 107);
        var3.field7778.method1526(false, class621.method3541(arg2, -65) + 1);
        if (arg0 == 16) {
            var3.field7778.method1518((byte) -70, arg1);
            var3.field7778.method1481((byte) -5, arg2);
            class167.method1260(117, var3);
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)Lsg;")
    public final class399 method1443(int arg0, int arg1) {
        field2994++;
        class112 var3 = this.field2995;
        class399 var4;
        synchronized (this.field2995) {
            var4 = (class399) this.field2995.method992((long) arg0, 69);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field2993;
        byte[] var6;
        synchronized (this.field2993) {
            var6 = this.field2993.method863(-1860, arg1, arg0);
        }
        class399 var7 = new class399();
        if (var6 != null) {
            var7.method2497(new class215(var6), -108);
        }
        class112 var8 = this.field2995;
        synchronized (this.field2995) {
            this.field2995.method991(var7, (long) arg0, (byte) -109);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BI)V")
    public final void method1444(byte arg0, int arg1) {
        class112 var3 = this.field2995;
        synchronized (this.field2995) {
            this.field2995.method987(2, arg1);
        }
        field2989++;
        if (arg0 < 36) {
            method1440(-32);
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)V")
    public final void method1445(int arg0) {
        field2991++;
        class112 var2 = this.field2995;
        synchronized (this.field2995) {
            this.field2995.method999(arg0);
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)V")
    public final void method1446(byte arg0) {
        class112 var2 = this.field2995;
        synchronized (this.field2995) {
            this.field2995.method996(-112);
        }
        int var3 = 119 / ((arg0 - 47) / 55);
        field2990++;
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(I)V")
    public static final void method1447(int arg0) {
        int var1 = 81 % ((arg0 + 70) / 35);
        field2987++;
        if (!class311.field4321) {
            class715.field9742 = class344.field4823 != -1 && class192.field2844 >= class344.field4823 || class582.field7968 < class192.field2844 * 16 + (class545.field7514 ? 26 : 22);
        }
        class730.field9879.method1270(103);
        class556.field7683.method1270(104);
        for (class324 var2 = (class324) class528.field7301.method1269(4); var2 != null; var2 = (class324) class528.field7301.method1264((byte) 83)) {
            int var39 = var2.field4505;
            if (var39 < 1000) {
                var2.method2314((byte) 97);
                if (var39 == 15 || var39 == 2 || var39 == 30 || var39 == 49 || var39 == 51 || var39 == 50 || var39 == 6) {
                    class556.field7683.method1273(var2, -20180);
                } else {
                    class730.field9879.method1273(var2, -20180);
                }
            }
        }
        class730.field9879.method1262(class528.field7301, (byte) -115);
        class556.field7683.method1262(class528.field7301, (byte) -115);
        if (class192.field2844 > 1) {
            if (class304.field4240 && class117.field1992.method1346(81, -122) && class192.field2844 > 2) {
                class693.field9372 = (class324) class528.field7301.field2642.field5208.field5208;
            } else {
                class693.field9372 = (class324) class528.field7301.field2642.field5208;
            }
            class47.field999 = (class324) class528.field7301.field2642.field5208;
        } else {
            class693.field9372 = null;
            class47.field999 = null;
        }
        int var3 = -1;
        class19 var4 = (class19) class494.field6832.method1269(4);
        if (var4 != null) {
            var3 = var4.method145(58);
        }
        if (!class311.field4321) {
            if (var3 == 0 && (class424.field6109 == 1 && class192.field2844 > 2 || class424.method2599(-100))) {
                var3 = 2;
            }
            if (var3 == 2 && class192.field2844 > 0 && var4 != null) {
                if (class591.field8071 == null && class13.field237 == 0) {
                    class169.method1280((byte) -124, var4.method143((byte) -127), var4.method146(-104));
                } else {
                    class86.field1547 = 2;
                }
            }
            if (var3 == 0) {
                if (class693.field9372 != null) {
                    class615.method3488(1);
                } else if (class184.field2785) {
                    class236.method1643(-2049);
                }
            }
            if (class591.field8071 != null || class13.field237 != 0) {
                return;
            }
            class290.field4063 = null;
            class86.field1547 = 0;
            return;
        }
        if (var3 == -1) {
            int var5 = class284.field3963.method574(true);
            int var6 = class284.field3963.method571((byte) 116);
            boolean var7 = false;
            if (class164.field2589 != null) {
                if (class142.field2352 - 10 <= var5 && var5 <= (class142.field2352 + class465.field6522 + 10) && class157.field2522 - 10 <= var6 && var6 <= (class562.field7760 + class157.field2522 + 10)) {
                    var7 = true;
                } else {
                    class634.method3616((byte) -48);
                }
            }
            if (!var7) {
                if (class106.field1869 - 10 > var5 || var5 > class106.field1869 + class565.field7788 + 10 || var6 < class749.field10379 - 10 || (class749.field10379 + class469.field6575 + 10) < var6) {
                    class128.method1066((byte) 70);
                } else if (class715.field9742) {
                    int var8 = -1;
                    int var9 = -1;
                    for (int var10 = 0; var10 < class436.field6235; var10++) {
                        if (class545.field7514) {
                            int var12 = var10 * 16 + class749.field10379 + 33;
                            if ((var12 - 13) < var6 && var12 + 4 > var6) {
                                var9 = var12 - 13;
                                var8 = var10;
                                break;
                            }
                        } else {
                            int var11 = var10 * 16 + class749.field10379 + 31;
                            if (var6 > (var11 - 13) && var6 < (var11 + 3)) {
                                var9 = var11 - 13;
                                var8 = var10;
                                break;
                            }
                        }
                    }
                    if (var8 != -1) {
                        int var13 = 0;
                        class444 var14 = new class444(class631.field8684);
                        for (class462 var15 = (class462) var14.method2670(75); var15 != null; var15 = (class462) var14.method2673((byte) 74)) {
                            if (var8 == var13) {
                                if (var15.field6497 > 1) {
                                    class196.method1400(var15, var6, true, var9);
                                }
                                break;
                            }
                            var13++;
                        }
                    }
                }
            }
        }
        if (var3 != 0) {
            return;
        }
        int var16 = var4.method143((byte) -128);
        int var17 = var4.method146(33);
        if (class164.field2589 != null && var16 >= class142.field2352 && class465.field6522 + class142.field2352 >= var16 && var17 >= class157.field2522 && class562.field7760 + class157.field2522 >= var17) {
            int var18 = -1;
            for (int var19 = 0; var19 < class164.field2589.field6497; var19++) {
                if (class545.field7514) {
                    int var23 = var19 * 16 + class157.field2522 + 33;
                    if (var17 > var23 - 13 && (var23 + 4) > var17) {
                        var18 = var19;
                    }
                } else {
                    int var24 = var19 * 16 + class157.field2522 + 31;
                    if (var24 - 13 < var17 && (var24 + 3) > var17) {
                        var18 = var19;
                    }
                }
            }
            if (var18 != -1) {
                int var20 = 0;
                class444 var21 = new class444(class164.field2589.field6503);
                for (class324 var22 = (class324) var21.method2670(98); var22 != null; var22 = (class324) var21.method2673((byte) 122)) {
                    if (var18 == var20) {
                        class11.method67((byte) 126, var22, var17, var16);
                        break;
                    }
                    var20++;
                }
            }
            class128.method1066((byte) 78);
            return;
        }
        if (var16 < class106.field1869 || var16 > class106.field1869 + class565.field7788 || var17 < class749.field10379 || var17 > (class749.field10379 + class469.field6575)) {
            return;
        }
        if (class715.field9742) {
            int var25 = -1;
            for (int var26 = 0; var26 < class436.field6235; var26++) {
                if (class545.field7514) {
                    int var28 = class749.field10379 + (var26 * 16) + 33;
                    if ((var28 - 13) < var17 && var17 < (var28 + 4)) {
                        var25 = var26;
                        break;
                    }
                } else {
                    int var27 = var26 * 16 + class749.field10379 + 31;
                    if ((var27 - 13) < var17 && var27 + 3 > var17) {
                        var25 = var26;
                        break;
                    }
                }
            }
            if (var25 != -1) {
                int var29 = 0;
                class444 var30 = new class444(class631.field8684);
                for (class462 var31 = (class462) var30.method2670(18); var31 != null; var31 = (class462) var30.method2673((byte) 55)) {
                    if (var25 == var29) {
                        class11.method67((byte) 122, (class324) var31.field6503.field5243.field241, var17, var16);
                        class128.method1066((byte) 118);
                        return;
                    }
                    var29++;
                }
                return;
            }
        } else {
            int var32 = -1;
            for (int var33 = 0; var33 < class192.field2844; var33++) {
                if (class545.field7514) {
                    int var37 = (class192.field2844 - (var33 + 1)) * 16 + class749.field10379 + 33;
                    if (var17 > (var37 - 13) && var17 < (var37 + 4)) {
                        var32 = var33;
                    }
                } else {
                    int var38 = ((class192.field2844 - var33 - 1) * 16) + class749.field10379 + 31;
                    if (var17 > (var38 - 13) && (var38 + 3) > var17) {
                        var32 = var33;
                    }
                }
            }
            if (var32 != -1) {
                int var34 = 0;
                class482 var35 = new class482(class528.field7301);
                for (class324 var36 = (class324) var35.method2824((byte) -53); var36 != null; var36 = (class324) var35.method2826(10)) {
                    if (var32 == var34) {
                        class11.method67((byte) 107, var36, var17, var16);
                        break;
                    }
                    var34++;
                }
            }
            class128.method1066((byte) -46);
        }
        return;
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lsj;ILin;)V")
    public class210(class460 arg0, int arg1, class91 arg2) {
        this.field2993 = arg2;
        this.field2993.method860(0, 32);
    }
}
