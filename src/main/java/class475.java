import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class475 extends class28 {

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Ljs;")
    public class208 field7249;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field7246 = new String[100];

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "Lrp;")
    public static class288 field7250;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "Lvh;")
    public static class232 field7251;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "[I")
    public static int[] field7253;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "Lbg;")
    private static class310 field7254;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public static int field7252;

    static {
        new class423("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field7250 = new class288(32);
        field7251 = new class232(2);
        field7253 = new int[13];
        new class423("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field7254 = new class310(49, 7);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lha;I)Lpn;", line = 4)
    public static final class504 method2855(class40 arg0, int arg1) {
        field7247++;
        if (arg1 <= 65) {
            method2855(null, 2);
        }
        return new class504(arg0.method249(false), arg0.method249(false), arg0.method249(false), arg0.method249(false), arg0.method224(-2), arg0.method224(-2), arg0.method257((byte) 55));
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 16)
    public static void method2856(int arg0) {
        field7251 = null;
        if (arg0 < 83) {
            method2857(null, 113, -100, -41);
        }
        field7253 = null;
        field7250 = null;
        field7246 = null;
        field7254 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lro;III)V", line = 34)
    public static final void method2857(class2 arg0, int arg1, int arg2, int arg3) {
        field7248++;
        if (arg0 == null || class329.field4932.field45 == arg0) {
            return;
        }
        int var4 = arg0.field10;
        int var5 = arg0.field20;
        int var6 = arg0.field17;
        int var7 = (int) arg0.field12;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg0.field12;
        if (var6 == 6) {
            class47 var10 = class224.field3450[var7];
            if (var10 != null) {
                class35.field492 = 0;
                class62.field1036 = arg1;
                class188.field2981 = arg2;
                class451.field6946 = 2;
                class320.field4810++;
                class400.method2379((byte) -75, class218.field3354);
                class230.field3508.method221(-1, class308.field4662.method1650(82, 27365) ? 1 : 0);
                class230.field3508.method263(var7, (byte) -119);
                class376.method2262(var10.method337(0), true, var10.method337(0), -2, var10.field2232[0], var10.field2239[0], 121, 0, 0);
            }
        }
        if (var6 == 49) {
            class62.field1036 = arg1;
            class188.field2981 = arg2;
            class35.field492 = 0;
            class451.field6946 = 2;
            class157.field2473++;
            class400.method2379((byte) -75, class1.field7);
            class230.field3508.method225(class308.field4662.method1650(82, 27365) ? 1 : 0, -70);
            class230.field3508.method263(class381.field5550 + var4, (byte) -99);
            class230.field3508.method246((byte) -54, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class230.field3508.method252(class320.field4827 + var5, -126);
            class40.method230(var5, var4, 23304, var8);
        }
        if (var6 == 46) {
            class188.field2981 = arg2;
            class62.field1036 = arg1;
            class451.field6946 = 2;
            class35.field492 = 0;
            class252.field3847++;
            class400.method2379((byte) -75, class366.field5374);
            class230.field3508.method221(-1, class308.field4662.method1650(82, 27365) ? 1 : 0);
            class230.field3508.method263(class381.field5550 + var4, (byte) -87);
            class230.field3508.method263((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) -120);
            class230.field3508.method246((byte) -91, class320.field4827 + var5);
            class40.method230(var5, var4, 23304, var8);
        }
        if (var6 == 50) {
            class188.field2981 = arg2;
            class35.field492 = 0;
            class386.field5603++;
            class62.field1036 = arg1;
            class451.field6946 = 2;
            class400.method2379((byte) -75, class488.field7444);
            class230.field3508.method282(Integer.MAX_VALUE & (int) (var8 >>> 32), -61);
            class230.field3508.method225(class308.field4662.method1650(82, 27365) ? 1 : 0, -92);
            class230.field3508.method263(var4 + class381.field5550, (byte) -105);
            class230.field3508.method263(var5 + class320.field4827, (byte) -52);
            class230.field3508.method267(2926, class357.field5298);
            class230.field3508.method246((byte) -99, class262.field3967);
            class230.field3508.method263(class142.field2311, (byte) -89);
            class40.method230(var5, var4, arg3 + 23303, var8);
        }
        if (var6 == 11) {
            if (class193.field3052 > 0 && class308.field4662.method1650(82, 27365) && class308.field4662.method1650(81, arg3 + 27364)) {
                client.method1170(class381.field5550 + var4, arg3 ^ 0xFFFFFFB9, class320.field4827 + var5, class286.field4329.field3217);
            } else {
                class48.field741++;
                class188.field2981 = arg2;
                class35.field492 = 0;
                class451.field6946 = 1;
                class62.field1036 = arg1;
                class400.method2379((byte) -75, class168.field2613);
                class230.field3508.method246((byte) -86, class320.field4827 + var5);
                class230.field3508.method282(class381.field5550 + var4, -115);
            }
        }
        if (var6 == 60) {
            class62.field1036 = arg1;
            class451.field6946 = 2;
            class35.field492 = 0;
            class88.field1547++;
            class188.field2981 = arg2;
            class400.method2379((byte) -75, class135.field2158);
            class230.field3508.method282(class320.field4827 + var5, -80);
            class230.field3508.method225(class308.field4662.method1650(82, 27365) ? 1 : 0, -66);
            class230.field3508.method246((byte) -95, var7);
            class230.field3508.method252(class381.field5550 + var4, arg3 ^ 0xFFFFFF84);
            class441.method2574(var5, arg3 ^ 0xFFFFFFFE, var4);
        }
        if (var6 == 1008) {
            class132.field2098++;
            class451.field6946 = 2;
            class35.field492 = 0;
            class188.field2981 = arg2;
            class62.field1036 = arg1;
            class400.method2379((byte) -75, class109.field1888);
            class230.field3508.method246((byte) -34, var7);
        }
        if (var6 == 23) {
            class62.field1036 = arg1;
            class35.field492 = 0;
            class60.field1011++;
            class451.field6946 = 2;
            class188.field2981 = arg2;
            class400.method2379((byte) -75, class223.field3439);
            class230.field3508.method246((byte) -74, class320.field4827 + var5);
            class230.field3508.method246((byte) -105, class381.field5550 + var4);
            class230.field3508.method252((int) (var8 >>> 32) & Integer.MAX_VALUE, arg3 ^ 0xFFFFFF90);
            class230.field3508.method221(-1, class308.field4662.method1650(82, arg3 + 27364) ? 1 : 0);
            class40.method230(var5, var4, arg3 + 23303, var8);
        }
        if (var6 == 58) {
            class47 var11 = class224.field3450[var7];
            if (var11 != null) {
                class35.field492 = 0;
                class434.field6365++;
                class451.field6946 = 2;
                class188.field2981 = arg2;
                class62.field1036 = arg1;
                class400.method2379((byte) -75, class429.field6297);
                class230.field3508.method268(class308.field4662.method1650(82, 27365) ? 1 : 0, 111);
                class230.field3508.method252(var7, arg3 ^ 0xFFFFFF8C);
                class376.method2262(var11.method337(0), true, var11.method337(0), -2, var11.field2232[0], var11.field2239[0], -6, 0, 0);
            }
        }
        if (var6 == 9) {
            class188.field2981 = arg2;
            class159.field2507++;
            class35.field492 = 0;
            class62.field1036 = arg1;
            class451.field6946 = 2;
            class400.method2379((byte) -75, class256.field3906);
            class230.field3508.method263(var4 + class381.field5550, (byte) -61);
            class230.field3508.method225(class308.field4662.method1650(82, 27365) ? 1 : 0, -108);
            class230.field3508.method263(class320.field4827 + var5, (byte) -101);
            class230.field3508.method246((byte) -29, var7);
            class441.method2574(var5, -1, var4);
        }
        if (var6 == 51) {
            class190.field3032++;
            class451.field6946 = 2;
            class35.field492 = 0;
            class188.field2981 = arg2;
            class62.field1036 = arg1;
            class400.method2379((byte) -75, class387.field5610);
            class230.field3508.method225(class308.field4662.method1650(82, 27365) ? 1 : 0, -87);
            class230.field3508.method263(var5 + class320.field4827, (byte) -67);
            class230.field3508.method246((byte) -114, var4 + class381.field5550);
            class230.field3508.method263(var7, (byte) -116);
            class441.method2574(var5, arg3 ^ 0xFFFFFFFE, var4);
        }
        if (var6 == 1011) {
            class188.field2981 = arg2;
            class451.field6946 = 2;
            class62.field1036 = arg1;
            class35.field492 = 0;
            class249 var12 = class195.field3085[var7];
            if (var12 != null) {
                class245 var13 = var12.field3819;
                if (var13.field3703 != null) {
                    var13 = var13.method1477(class273.field4144, arg3 - 12820);
                }
                if (var13 != null) {
                    class244.field3662++;
                    class400.method2379((byte) -75, class325.field4880);
                    class230.field3508.method246((byte) -93, var13.field3709);
                }
            }
        }
        if (var6 == 17) {
            class451.field6946 = 2;
            class62.field1036 = arg1;
            class331.field4956++;
            class188.field2981 = arg2;
            class35.field492 = 0;
            class400.method2379((byte) -75, class310.field4674);
            class230.field3508.method225(class308.field4662.method1650(82, arg3 + 27364) ? 1 : 0, -101);
            class230.field3508.method246((byte) -70, var4 + class381.field5550);
            class230.field3508.method246((byte) -68, class320.field4827 + var5);
            class230.field3508.method252(var7, -87);
            class441.method2574(var5, -1, var4);
        }
        if (var6 == 18 || var6 == 1007) {
            class377.method2271(var4, var5, -119, arg0.field16, var7);
        }
        if (var6 == 45) {
            class249 var14 = class195.field3085[var7];
            if (var14 != null) {
                class142.field2306++;
                class451.field6946 = 2;
                class188.field2981 = arg2;
                class35.field492 = 0;
                class62.field1036 = arg1;
                class400.method2379((byte) -75, class206.field3229);
                class230.field3508.method225(class308.field4662.method1650(82, 27365) ? 1 : 0, -97);
                class230.field3508.method252(var7, -110);
                class376.method2262(var14.method337(0), true, var14.method337(0), -2, var14.field2232[0], var14.field2239[0], 115, 0, 0);
            }
        }
        if (var6 == 10) {
            class249 var15 = class195.field3085[var7];
            if (var15 != null) {
                class188.field2981 = arg2;
                class451.field6946 = 2;
                class62.field1036 = arg1;
                class35.field492 = 0;
                class339.field5067++;
                class400.method2379((byte) -75, class394.field5746);
                class230.field3508.method282(var7, arg3 ^ 0x70);
                class230.field3508.method225(class308.field4662.method1650(82, arg3 ^ 0x6AE4) ? 1 : 0, -82);
                class376.method2262(var15.method337(arg3 - 1), true, var15.method337(0), -2, var15.field2232[0], var15.field2239[0], -110, 0, 0);
            }
        }
        if (var6 == 19) {
            class62.field1036 = arg1;
            class188.field2981 = arg2;
            class35.field492 = 0;
            class451.field6946 = 2;
            class297.field4504++;
            class400.method2379((byte) -75, class78.field1383);
            class230.field3508.method252(class262.field3967, -105);
            class230.field3508.method268(class308.field4662.method1650(82, 27365) ? 1 : 0, 104);
            class230.field3508.method259((byte) -86, class357.field5298);
            class230.field3508.method263(class286.field4329.field2197, (byte) -118);
            class230.field3508.method252(class142.field2311, -109);
        }
        if (var6 == 30) {
            class249 var16 = class195.field3085[var7];
            if (var16 != null) {
                class62.field1036 = arg1;
                class451.field6946 = 2;
                class35.field492 = 0;
                class188.field2981 = arg2;
                class504.field7615++;
                class400.method2379((byte) -75, class436.field6426);
                class230.field3508.method246((byte) -85, var7);
                class230.field3508.method225(class308.field4662.method1650(82, 27365) ? 1 : 0, arg3 ^ 0xFFFFFF91);
                class376.method2262(var16.method337(0), true, var16.method337(0), -2, var16.field2232[0], var16.field2239[0], -31, 0, 0);
            }
        }
        if (var6 == 59) {
            class47 var17 = class224.field3450[var7];
            if (var17 != null) {
                class270.field4081++;
                class35.field492 = 0;
                class62.field1036 = arg1;
                class188.field2981 = arg2;
                class451.field6946 = 2;
                class400.method2379((byte) -75, class193.field3051);
                class230.field3508.method252(var7, -128);
                class230.field3508.method268(class308.field4662.method1650(82, 27365) ? 1 : 0, 31);
                class376.method2262(var17.method337(0), true, var17.method337(0), -2, var17.field2232[0], var17.field2239[0], 2, 0, 0);
            }
        }
        if (var6 == 21) {
            class47 var18 = class224.field3450[var7];
            if (var18 != null) {
                class214.field3316++;
                class62.field1036 = arg1;
                class35.field492 = 0;
                class451.field6946 = 2;
                class188.field2981 = arg2;
                class400.method2379((byte) -75, class49.field755);
                class230.field3508.method252(var7, -82);
                class230.field3508.method221(-1, class308.field4662.method1650(82, 27365) ? 1 : 0);
                class376.method2262(var18.method337(arg3 - 1), true, var18.method337(0), -2, var18.field2232[0], var18.field2239[0], 122, 0, 0);
            }
        }
        if (var6 == 13) {
            if (class193.field3052 > 0 && class308.field4662.method1650(82, arg3 + 27364) && class308.field4662.method1650(81, arg3 + 27364)) {
                client.method1170(class381.field5550 + var4, arg3 ^ 0xFFFFFF88, class320.field4827 + var5, class286.field4329.field3217);
            } else {
                class215.method1326(var4, arg3, var5, var7);
                if (var7 == 1) {
                    class230.field3508.method221(arg3 ^ 0xFFFFFFFE, -1);
                    class230.field3508.method221(-1, -1);
                    class230.field3508.method246((byte) -63, (int) class23.field289);
                    class230.field3508.method221(-1, 57);
                    class230.field3508.method221(-1, class273.field4145);
                    class230.field3508.method221(-1, class222.field3427);
                    class230.field3508.method221(-1, 89);
                    class230.field3508.method246((byte) -43, class286.field4329.field3218);
                    class230.field3508.method246((byte) -90, class286.field4329.field3222);
                    class230.field3508.method221(-1, 63);
                } else {
                    class35.field492 = 0;
                    class451.field6946 = 1;
                    class62.field1036 = arg1;
                    class188.field2981 = arg2;
                }
                class376.method2262(1, true, 1, -4, var4, var5, arg3 ^ 0xFFFFFFB5, 0, 0);
            }
        }
        if (var6 == 1006) {
            class62.field1036 = arg1;
            class188.field2981 = arg2;
            class35.field492 = 0;
            class451.field6946 = 2;
            class279.field4239++;
            class400.method2379((byte) -75, field7254);
            class230.field3508.method246((byte) -49, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class230.field3508.method268(class308.field4662.method1650(82, 27365) ? 1 : 0, 23);
            class230.field3508.method246((byte) -105, class381.field5550 + var4);
            class230.field3508.method263(class320.field4827 + var5, (byte) -68);
            class40.method230(var5, var4, 23304, var8);
        }
        if (var6 == 1010 || var6 == 1003 || var6 == 1002 || var6 == 1004 || var6 == 1001) {
            class57.method407(var6, var4, (byte) 126, var7);
        }
        if (var6 == 48) {
            class427 var19 = class59.method419(var4, 12782, var5);
            if (var19 != null) {
                class221.method1346(var19, arg3 ^ 0xD);
            }
        }
        if (var6 == 20) {
            class188.field2981 = arg2;
            class287.field4350++;
            class451.field6946 = 1;
            class35.field492 = 0;
            class62.field1036 = arg1;
            class400.method2379((byte) -75, class493.field7516);
            class230.field3508.method282(class381.field5550 + var4, -123);
            class230.field3508.method282(class320.field4827 + var5, -56);
            class230.field3508.method252(class142.field2311, -87);
            class230.field3508.method282(class262.field3967, 116);
            class230.field3508.method266(class357.field5298, false);
            class376.method2262(1, true, 1, -4, var4, var5, -62, 0, 0);
        }
        if (var6 == 1009) {
            class41.field599++;
            class188.field2981 = arg2;
            class451.field6946 = 2;
            class62.field1036 = arg1;
            class35.field492 = 0;
            class400.method2379((byte) -75, class303.field4595);
            class230.field3508.method246((byte) -67, var7);
        }
        if (var6 == 16) {
            class47 var20 = class224.field3450[var7];
            if (var20 != null) {
                class35.field492 = 0;
                class170.field2652++;
                class188.field2981 = arg2;
                class451.field6946 = 2;
                class62.field1036 = arg1;
                class400.method2379((byte) -75, class312.field4700);
                class230.field3508.method221(-1, class308.field4662.method1650(82, 27365) ? 1 : 0);
                class230.field3508.method282(var7, 107);
                class376.method2262(var20.method337(arg3 - 1), true, var20.method337(arg3 ^ 0x1), -2, var20.field2232[0], var20.field2239[0], 125, 0, 0);
            }
        }
        if (var6 == 22) {
            class249 var21 = class195.field3085[var7];
            if (var21 != null) {
                class35.field492 = 0;
                class451.field6946 = 2;
                class62.field1036 = arg1;
                class181.field2825++;
                class188.field2981 = arg2;
                class400.method2379((byte) -75, class303.field4615);
                class230.field3508.method282(var7, 100);
                class230.field3508.method225(class308.field4662.method1650(82, 27365) ? 1 : 0, -96);
                class376.method2262(var21.method337(0), true, var21.method337(arg3 ^ 0x1), -2, var21.field2232[0], var21.field2239[0], 125, 0, 0);
            }
        }
        if (var6 == 8) {
            class47 var22 = class224.field3450[var7];
            if (var22 != null) {
                class188.field2981 = arg2;
                class451.field6946 = 2;
                class62.field1036 = arg1;
                class436.field6390++;
                class35.field492 = 0;
                class400.method2379((byte) -75, class329.field4935);
                class230.field3508.method246((byte) -76, var7);
                class230.field3508.method268(class308.field4662.method1650(82, 27365) ? 1 : 0, 63);
                class376.method2262(var22.method337(0), true, var22.method337(0), -2, var22.field2232[0], var22.field2239[0], -114, 0, 0);
            }
        }
        if (var6 == 15) {
            class427 var23 = class59.method419(var4, 12782, var5);
            if (var23 != null) {
                class62.method432(false);
                class54 var24 = client.method1176(var23);
                class316.method1884((byte) 72, var24.field817, var23, var24.method376(1));
                class28.field357 = class362.method2202(121, var23);
                if (class28.field357 == null) {
                    class28.field357 = "Null";
                }
                class200.field3175 = var23.field6136 + "<col=ffffff>";
            }
            return;
        }
        if (arg3 != 1) {
            field7246 = null;
        }
        if (var6 == 57) {
            class35.field492 = 0;
            class498.field7554++;
            class451.field6946 = 2;
            class62.field1036 = arg1;
            class188.field2981 = arg2;
            class400.method2379((byte) -75, class336.field5028);
            class230.field3508.method221(-1, class308.field4662.method1650(82, arg3 + 27364) ? 1 : 0);
            class230.field3508.method282(class381.field5550 + var4, arg3 + -92);
            class230.field3508.method252(class142.field2311, arg3 - 109);
            class230.field3508.method252(class320.field4827 + var5, -106);
            class230.field3508.method259((byte) -86, class357.field5298);
            class230.field3508.method263(var7, (byte) -101);
            class230.field3508.method282(class262.field3967, -13);
            class441.method2574(var5, -1, var4);
        }
        if (var6 == 2) {
            class47 var25 = class224.field3450[var7];
            if (var25 != null) {
                class188.field2981 = arg2;
                class35.field492 = 0;
                class297.field4504++;
                class451.field6946 = 2;
                class62.field1036 = arg1;
                class400.method2379((byte) -75, class78.field1383);
                class230.field3508.method252(class262.field3967, -126);
                class230.field3508.method268(class308.field4662.method1650(82, 27365) ? 1 : 0, 79);
                class230.field3508.method259((byte) -86, class357.field5298);
                class230.field3508.method263(var7, (byte) -114);
                class230.field3508.method252(class142.field2311, -88);
                class376.method2262(var25.method337(0), true, var25.method337(0), -2, var25.field2232[0], var25.field2239[0], -45, 0, 0);
            }
        }
        if (var6 == 12) {
            class451.field6946 = 2;
            class159.field2503++;
            class188.field2981 = arg2;
            class62.field1036 = arg1;
            class35.field492 = 0;
            class400.method2379((byte) -75, class143.field2317);
            class230.field3508.method263(class320.field4827 + var5, (byte) -100);
            class230.field3508.method263(class381.field5550 + var4, (byte) -71);
            class230.field3508.method221(arg3 - 2, class308.field4662.method1650(82, 27365) ? 1 : 0);
            class230.field3508.method282(Integer.MAX_VALUE & (int) (var8 >>> 32), 84);
            class40.method230(var5, var4, 23304, var8);
        }
        if (var6 == 4) {
            class395.field5761++;
            class188.field2981 = arg2;
            class451.field6946 = 2;
            class35.field492 = 0;
            class62.field1036 = arg1;
            class400.method2379((byte) -75, class238.field3591);
            class230.field3508.method246((byte) -79, class381.field5550 + var4);
            class230.field3508.method246((byte) -87, var7);
            class230.field3508.method252(class320.field4827 + var5, -95);
            class230.field3508.method268(class308.field4662.method1650(82, 27365) ? 1 : 0, 67);
            class441.method2574(var5, -1, var4);
        }
        if (var6 == 3 && class198.field3118 == null) {
            class4.method18(1516, var5, var4);
            class198.field3118 = class59.method419(var4, arg3 ^ 0x31EF, var5);
            class288.method1754(class198.field3118, 0);
        }
        if (var6 == 47) {
            class47 var26 = class224.field3450[var7];
            if (var26 != null) {
                class188.field2981 = arg2;
                class219.field3365++;
                class62.field1036 = arg1;
                class35.field492 = 0;
                class451.field6946 = 2;
                class400.method2379((byte) -75, class375.field5473);
                class230.field3508.method263(var7, (byte) -71);
                class230.field3508.method225(class308.field4662.method1650(82, 27365) ? 1 : 0, -102);
                class376.method2262(var26.method337(0), true, var26.method337(0), -2, var26.field2232[0], var26.field2239[0], 126, 0, 0);
            }
        }
        if (var6 == 25) {
            class47 var27 = class224.field3450[var7];
            if (var27 != null) {
                class451.field6946 = 2;
                class62.field1036 = arg1;
                class441.field6467++;
                class188.field2981 = arg2;
                class35.field492 = 0;
                class400.method2379((byte) -75, class415.field6003);
                class230.field3508.method225(class308.field4662.method1650(82, 27365) ? 1 : 0, -125);
                class230.field3508.method263(var7, (byte) -119);
                class376.method2262(var27.method337(0), true, var27.method337(0), -2, var27.field2232[0], var27.field2239[0], arg3 ^ 0xFFFFFFD0, 0, 0);
            }
        }
        if (var6 == 5) {
            class249 var28 = class195.field3085[var7];
            if (var28 != null) {
                class451.field6946 = 2;
                class62.field1036 = arg1;
                class35.field492 = 0;
                class188.field2981 = arg2;
                class30.field390++;
                class400.method2379((byte) -75, class379.field5538);
                class230.field3508.method282(class262.field3967, 111);
                class230.field3508.method263(class142.field2311, (byte) -111);
                class230.field3508.method246((byte) -87, var7);
                class230.field3508.method266(class357.field5298, false);
                class230.field3508.method268(class308.field4662.method1650(82, arg3 + 27364) ? 1 : 0, 62);
                class376.method2262(var28.method337(0), true, var28.method337(0), -2, var28.field2232[0], var28.field2239[0], 126, 0, 0);
            }
        }
        if (var6 == 44) {
            class249 var29 = class195.field3085[var7];
            if (var29 != null) {
                class35.field492 = 0;
                class451.field6946 = 2;
                class188.field2981 = arg2;
                class491.field7458++;
                class62.field1036 = arg1;
                class400.method2379((byte) -75, class493.field7518);
                class230.field3508.method221(-1, class308.field4662.method1650(82, 27365) ? 1 : 0);
                class230.field3508.method252(var7, -94);
                class376.method2262(var29.method337(0), true, var29.method337(0), -2, var29.field2232[0], var29.field2239[0], 119, 0, 0);
            }
        }
        if (class306.field4636) {
            class62.method432(false);
        }
        if (class65.field1068 != null && class182.field2890 == 0) {
            class288.method1754(class65.field1068, arg3 - 1);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lbl;II[B)V", line = 753)
    public class475(class442 arg0, int arg1, int arg2, byte[] arg3) {
        this.field7249 = class67.method456(arg2, 6406, arg1, 6406, (byte) -113, arg0, false, arg3);
        this.field7249.method1593(false, false, 0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIII[I)V", line = 772)
    public static final void method2858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field7245++;
        if (arg2 > 0 && !class110.method789(arg2, arg3 + 1135345666)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class110.method789(arg6, 1135345664)) {
            throw new IllegalArgumentException("");
        } else if (arg5 == 32993) {
            int var8 = 0;
            int var9 = arg2 < arg6 ? arg2 : arg6;
            if (arg3 == -2) {
                int var10 = arg2 >> 1;
                int var11 = arg6 >> 1;
                int[] var12 = arg7;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg1, var8, arg0, arg2, arg6, 0, arg5, arg4, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg2 + var15;
                    for (int var17 = 0; var17 < var11; var17++) {
                        for (int var19 = 0; var19 < var10; var19++) {
                            int var20 = var12[var15++];
                            int var21 = var12[var16++];
                            int var22 = var12[var15++];
                            int var23 = var20 >> 24 & 0xFF;
                            int var24 = (var20 & 0xFF05) >> 8;
                            int var25 = var20 & 0xFF;
                            int var26 = var12[var16++];
                            int var27 = (var20 & 0xFF8501) >> 16;
                            int var28 = (var22 >> 24 & 0xFF) + var23;
                            int var29 = ((var22 & 0xFFA1) >> 8) + var24;
                            int var30 = (var22 & 0xFF) + var25;
                            int var31 = ((var22 & 0xFFBBB8) >> 16) + var27;
                            int var32 = (var21 >> 24 & 0xFF) + var28;
                            int var33 = (var21 & 0xFF) + var30;
                            int var34 = ((var21 & 0xFF97) >> 8) + var29;
                            int var35 = (var21 >> 16 & 0xFF) + var31;
                            int var36 = (var26 & 0xFF) + var33;
                            int var37 = (var26 >> 8 & 0xFF) + var34;
                            int var38 = ((var26 & 0xFFFAED) >> 16) + var35;
                            int var39 = (var26 >> 24 & 0xFF) + var32;
                            var13[var14++] = class318.method1973(class330.method2050(255, var36 >> 2), class318.method1973(class318.method1973(class330.method2050(var39, 1020) << 22, class330.method2050(var38 << 14, 16711680)), class330.method2050(65280, var37 << 6)));
                        }
                        var15 += arg2;
                        var16 += arg2;
                    }
                    int[] var18 = var13;
                    var13 = var12;
                    arg6 = var11;
                    var12 = var18;
                    arg2 = var10;
                    var8++;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
