import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class118 {

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Lce;")
    public static class126 field1991 = class206.method1445(-7923, "Chargement des interfaces )2 ");

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Ltc;")
    public static class144 field1993;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Lcm;")
    public static class312 field1987;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BILjava/awt/Component;I)Ldl;", line = 4)
    public static final class29 method772(byte arg0, int arg1, Component arg2, int arg3) {
        field1986++;
        try {
            Class var4 = Class.forName("bk");
            if (arg0 >= -84) {
                field1993 = (class144) null;
            }
            class29 var5 = (class29) var4.getDeclaredConstructor().newInstance();
            var5.method133(128, arg2, arg3, arg1);
            return var5;
        } catch (Throwable var8) {
            class116 var7 = new class116();
            var7.method133(128, arg2, arg3, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)V", line = 27)
    public static final void method773(boolean arg0, int arg1) {
        if (arg1 < 115) {
            field1987 = (class312) null;
        }
        class16.field219 = arg0;
        if (class16.field219) {
            int var15 = class227.field3834.method942(true);
            int var16 = class227.field3834.method971(-107);
            int var17 = class227.field3834.method966(10);
            int var18 = class227.field3834.method982((byte) 74);
            class227.field3834.method1233((byte) -82);
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    for (int var21 = 0; var21 < 13; var21++) {
                        int var22 = class227.field3834.method1241(1, -114);
                        if (var22 == 1) {
                            class12.field162[var19][var20][var21] = class227.field3834.method1241(26, 28);
                        } else {
                            class12.field162[var19][var20][var21] = -1;
                        }
                    }
                }
            }
            class227.field3834.method1243(-29800);
            int var23 = (class315.field5404 - class227.field3834.field2299) / 16;
            class314.field5392 = new int[var23][4];
            for (int var24 = 0; var24 < var23; var24++) {
                for (int var25 = 0; var25 < 4; var25++) {
                    class314.field5392[var24][var25] = class227.field3834.method957(496113200);
                }
            }
            int var26 = class227.field3834.method932(100);
            class128.field2200 = new byte[var23][];
            class45.field697 = new int[var23];
            class322.field5502 = new byte[var23][];
            class140.field2555 = new int[var23];
            class69.field1132 = new byte[var23][];
            class122.field2049 = new int[var23];
            class213.field3622 = new int[var23];
            class148.field2732 = new int[var23];
            class314.field5388 = new byte[var23][];
            class243.field4116 = (byte[][]) null;
            int var27 = 0;
            class68.field1125 = null;
            for (int var28 = 0; var28 < 4; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    for (int var30 = 0; var30 < 13; var30++) {
                        int var31 = class12.field162[var28][var29][var30];
                        if (var31 != -1) {
                            int var32 = var31 >> 14 & 0x3FF;
                            int var33 = (var31 & 0x3FF8) >> 3;
                            int var34 = (var32 / 8 << 8) + (var33 / 8);
                            for (int var35 = 0; var35 < var27; var35++) {
                                if (class148.field2732[var35] == var34) {
                                    var34 = -1;
                                    break;
                                }
                            }
                            if (var34 != -1) {
                                int var36 = var34 & 0xFF;
                                int var37 = var34 >> 8 & 0xFF;
                                class148.field2732[var27] = var34;
                                class213.field3622[var27] = class168.field3000.method2176(class12.method69(new class126[] { class117.field1972, class195.method1386((byte) 20, var37), class105.field1663, class195.method1386((byte) 20, var36) }, (byte) 123), 0);
                                class140.field2555[var27] = class168.field3000.method2176(class12.method69(new class126[] { class26.field373, class195.method1386((byte) 20, var37), class105.field1663, class195.method1386((byte) 20, var36) }, (byte) 115), 0);
                                class45.field697[var27] = class168.field3000.method2176(class12.method69(new class126[] { class151.field2760, class195.method1386((byte) 20, var37), class105.field1663, class195.method1386((byte) 20, var36) }, (byte) 119), 0);
                                class122.field2049[var27] = class168.field3000.method2176(class12.method69(new class126[] { class314.field5381, class195.method1386((byte) 20, var37), class105.field1663, class195.method1386((byte) 20, var36) }, (byte) 123), 0);
                                var27++;
                            }
                        }
                    }
                }
            }
            class47.method296(var18, var26, var16, var15, false, var17, -33);
        } else {
            int var2 = class227.field3834.method971(36);
            int var3 = class227.field3834.method982((byte) 123);
            int var4 = (class315.field5404 - class227.field3834.field2299) / 16;
            class314.field5392 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    class314.field5392[var5][var6] = class227.field3834.method957(496113200);
                }
            }
            int var7 = class227.field3834.method942(true);
            int var8 = class227.field3834.method948(-121);
            int var9 = class227.field3834.method971(54);
            class122.field2049 = new int[var4];
            class148.field2732 = new int[var4];
            class314.field5388 = new byte[var4][];
            class322.field5502 = new byte[var4][];
            class68.field1125 = null;
            class243.field4116 = (byte[][]) null;
            class128.field2200 = new byte[var4][];
            class69.field1132 = new byte[var4][];
            class213.field3622 = new int[var4];
            class140.field2555 = new int[var4];
            boolean var10 = false;
            class45.field697 = new int[var4];
            if ((var9 / 8 == 48 || (var9 / 8) == 49) && var2 / 8 == 48) {
                var10 = true;
            }
            int var11 = 0;
            if (var9 / 8 == 48 && (var2 / 8) == 148) {
                var10 = true;
            }
            for (int var12 = (var9 - 6) / 8; var12 <= (var9 + 6) / 8; var12++) {
                for (int var13 = (var2 - 6) / 8; var13 <= (var2 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var10 && (var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || var12 == 49 && var13 == 47)) {
                        class148.field2732[var11] = var14;
                        class213.field3622[var11] = -1;
                        class140.field2555[var11] = -1;
                        class45.field697[var11] = -1;
                        class122.field2049[var11] = -1;
                    } else {
                        class148.field2732[var11] = var14;
                        class213.field3622[var11] = class168.field3000.method2176(class12.method69(new class126[] { class117.field1972, class195.method1386((byte) 20, var12), class105.field1663, class195.method1386((byte) 20, var13) }, (byte) 116), 0);
                        class140.field2555[var11] = class168.field3000.method2176(class12.method69(new class126[] { class26.field373, class195.method1386((byte) 20, var12), class105.field1663, class195.method1386((byte) 20, var13) }, (byte) 115), 0);
                        class45.field697[var11] = class168.field3000.method2176(class12.method69(new class126[] { class151.field2760, class195.method1386((byte) 20, var12), class105.field1663, class195.method1386((byte) 20, var13) }, (byte) 123), 0);
                        class122.field2049[var11] = class168.field3000.method2176(class12.method69(new class126[] { class314.field5381, class195.method1386((byte) 20, var12), class105.field1663, class195.method1386((byte) 20, var13) }, (byte) 120), 0);
                    }
                    var11++;
                }
            }
            class47.method296(var7, var9, var2, var3, false, var8, -49);
        }
        field1990++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lpc;", line = 274)
    public static final class291 method774(int arg0, int arg1) {
        field1988++;
        class291 var2 = (class291) class193.field3294.method303((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class224.field3769.method2173(5, arg0, (byte) -48);
        class291 var4 = new class291();
        if (arg1 != -23393) {
            return (class291) null;
        }
        if (var3 != null) {
            var4.method1930(false, new class134(var3));
        }
        class193.field3294.method308(var4, (long) arg0, (byte) 121);
        return var4;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 306)
    public static void method775(byte arg0) {
        if (arg0 <= 73) {
            field1993 = (class144) null;
        }
        field1993 = null;
        field1991 = null;
        field1987 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZILem;ZLem;)I", line = 324)
    public static final int method776(int arg0, int arg1, boolean arg2, int arg3, class88 arg4, boolean arg5, class88 arg6) {
        field1992++;
        int var7 = class7.method42(arg6, (byte) -109, arg4, arg2, arg3);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class7.method42(arg6, (byte) 122, arg4, arg5, arg0);
            if (arg1 > -51) {
                field1991 = (class126) null;
            }
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 357)
    public static final void method777(int arg0) {
        class189.field3249 = -1;
        field1984++;
        class51.field783 = false;
        class315.field5404 = 0;
        class122.field2051 = -1;
        class27.field378 = 0;
        class218.field3663 = 0;
        class17.field231 = -1;
        class103.field1645.field2299 = 0;
        class152.field2769 = -1;
        class293.field4869 = 0;
        class182.field3175 = 0;
        class227.field3834.field2299 = arg0;
        class173.field3067 = 0;
        for (int var1 = 0; var1 < class85.field1352.length; var1++) {
            if (class85.field1352[var1] != null) {
                class85.field1352[var1].field2475 = -1;
            }
        }
        for (int var2 = 0; var2 < class199.field3391.length; var2++) {
            if (class199.field3391[var2] != null) {
                class199.field3391[var2].field2475 = -1;
            }
        }
        class197.method1396(31362);
        class254.field4261 = 1;
        class280.method1872(-126, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class220.field3698[var3] = true;
        }
        class5.method30(-81);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Lne;", line = 418)
    public static final class130 method778(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class130 var4 = var3.field46;
            var3.field46 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILcc;IILcc;)Lck;", line = 436)
    public static final class275 method779(int arg0, class313 arg1, int arg2, int arg3, class313 arg4) {
        field1985++;
        int var5 = 50 % ((-arg2 - 6) / 61);
        return class298.method2012(arg3, (byte) -110, arg4, arg0) ? class207.method1451(arg1.method2173(arg3, arg0, (byte) -96), -27293) : null;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V", line = 450)
    public static final void method780(int arg0, int arg1) {
        field1989++;
        if (class33.field477 == 0) {
            class217.field3654.method2078((byte) -126, arg1);
        } else {
            class315.field5413 = arg1;
        }
        int var2 = 27 % ((arg0 - 29) / 45);
    }
}
