import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class434 extends class449 {

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "S")
    public short field6139;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "[I")
    public static int[] field6140 = new int[5];

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lch;")
    public static class151 field6136 = new class151("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BIILld;)V", line = 5)
    public static final void method2622(byte arg0, int arg1, int arg2, class73 arg3) {
        field6137++;
        if (arg3 == null || class6.field38.field1299 == arg3) {
            return;
        }
        int var4 = arg3.field1057;
        int var5 = arg3.field1050;
        int var6 = arg3.field1048;
        int var7 = (int) arg3.field1055;
        long var8 = arg3.field1055;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 1001) {
            class323.field4515 = 0;
            class363.field4994++;
            class127.field1735 = arg2;
            class483.field6826 = 2;
            class39.field528 = arg1;
            class336.method2111(class125.field1692, arg0 ^ 0x8);
            class311.field4403.method1173(var7, (byte) 117);
        }
        if (var6 == 1007) {
            class483.field6826 = 2;
            class323.field4515 = 0;
            class297.field4201++;
            class127.field1735 = arg2;
            class39.field528 = arg1;
            class336.method2111(class39.field529, 91);
            class311.field4403.method1173(var7, (byte) 120);
        }
        if (var6 == 1008) {
            class39.field528 = arg1;
            class483.field6826 = 2;
            class127.field1735 = arg2;
            class323.field4515 = 0;
            class320.field4510++;
            class336.method2111(class284.field4072, arg0 - 20);
            class311.field4403.method1173(class189.field2810 + var5, (byte) 125);
            class311.field4403.method1140(Integer.MAX_VALUE & (int) (var8 >>> 32), 6293);
            class311.field4403.method1135(4, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class311.field4403.method1150(-125, class279.field4012 + var4);
            class185.method1316((byte) 127, var4, var8, var5);
        }
        if (var6 == 47) {
            class172 var10 = class77.method678(var4, -20, var5);
            if (var10 != null) {
                class301.method1937(-11, var10);
            }
        }
        if (var6 == 30) {
            class361 var11 = class163.field2377[var7];
            if (var11 != null) {
                class483.field6826 = 2;
                class127.field1735 = arg2;
                class39.field528 = arg1;
                class388.field5321++;
                class323.field4515 = 0;
                class336.method2111(class428.field5974, 95);
                class311.field4403.method1180((byte) -110, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class311.field4403.method1173(var7, (byte) 126);
                class282.method1880(117, class262.field3781.field5807[0], var11.method245(4452), 0, var11.field5811[0], class262.field3781.field5811[0], true, -2, 0, var11.method245(4452), var11.field5807[0]);
            }
        }
        if (var6 == 12) {
            class39 var12 = class112.field1570[var7];
            if (var12 != null) {
                class238.field3474++;
                class483.field6826 = 2;
                class323.field4515 = 0;
                class39.field528 = arg1;
                class127.field1735 = arg2;
                class336.method2111(class108.field1509, 120);
                class311.field4403.method1150(39, var7);
                class311.field4403.method1135(4, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class282.method1880(arg0 + 9, class262.field3781.field5807[0], var12.method245(4452), 0, var12.field5811[0], class262.field3781.field5811[0], true, -2, 0, var12.method245(4452), var12.field5807[0]);
            }
        }
        if (var6 == 11) {
            class39 var13 = class112.field1570[var7];
            if (var13 != null) {
                class257.field3677++;
                class39.field528 = arg1;
                class323.field4515 = 0;
                class483.field6826 = 2;
                class127.field1735 = arg2;
                class336.method2111(class137.field1904, 90);
                class311.field4403.method1187(var7, (byte) -18);
                class311.field4403.method1155(-3355, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class282.method1880(arg0 - 1, class262.field3781.field5807[0], var13.method245(arg0 + 4334), 0, var13.field5811[0], class262.field3781.field5811[0], true, -2, 0, var13.method245(arg0 ^ 0x1112), var13.field5807[0]);
            }
        }
        if (var6 == 48) {
            class39 var14 = class112.field1570[var7];
            if (var14 != null) {
                class323.field4515 = 0;
                class490.field6919++;
                class483.field6826 = 2;
                class39.field528 = arg1;
                class127.field1735 = arg2;
                class336.method2111(class137.field1911, 105);
                class311.field4403.method1140(var7, arg0 + 6175);
                class311.field4403.method1135(4, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class282.method1880(arg0 - 6, class262.field3781.field5807[0], var14.method245(4452), 0, var14.field5811[0], class262.field3781.field5811[0], true, -2, 0, var14.method245(4452), var14.field5807[0]);
            }
        }
        if (var6 == 1011) {
            class39.field528 = arg1;
            class323.field4515 = 0;
            class483.field6826 = 2;
            class127.field1735 = arg2;
            class361 var15 = class163.field2377[var7];
            if (var15 != null) {
                class37 var16 = var15.field4952;
                if (var16.field434 != null) {
                    var16 = var16.method232(class416.field5691, -1);
                }
                if (var16 != null) {
                    class336.method2111(class117.field1624, arg0 - 17);
                    class279.field4005++;
                    class311.field4403.method1173(var16.field398, (byte) 116);
                }
            }
        }
        if (var6 == 45) {
            class483.field6826 = 2;
            class192.field2864++;
            class323.field4515 = 0;
            class127.field1735 = arg2;
            class39.field528 = arg1;
            class336.method2111(class255.field3670, 100);
            class311.field4403.method1150(60, var7);
            class311.field4403.method1180((byte) -110, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class311.field4403.method1173(class279.field4012 + var4, (byte) 114);
            class311.field4403.method1140(class189.field2810 + var5, 6293);
            class136.method1004(var5, 123, var4);
        }
        if (var6 == 18) {
            class361 var17 = class163.field2377[var7];
            if (var17 != null) {
                class323.field4515 = 0;
                class448.field6377++;
                class39.field528 = arg1;
                class127.field1735 = arg2;
                class483.field6826 = 2;
                class336.method2111(class164.field2388, 113);
                class311.field4403.method1140(class4.field29, 6293);
                class311.field4403.method1150(48, class128.field1750);
                class311.field4403.method1140(var7, 6293);
                class311.field4403.method1155(-3355, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class311.field4403.method1194(-13965, class124.field1679);
                class282.method1880(124, class262.field3781.field5807[0], var17.method245(4452), 0, var17.field5811[0], class262.field3781.field5811[0], true, -2, 0, var17.method245(4452), var17.field5807[0]);
            }
        }
        if (arg0 != 118) {
            return;
        }
        if (var6 == 4) {
            class483.field6826 = 2;
            class323.field4515 = 0;
            class278.field3998++;
            class39.field528 = arg1;
            class127.field1735 = arg2;
            class336.method2111(class205.field3003, arg0 ^ 0x2E);
            class311.field4403.method1150(43, class189.field2810 + var5);
            class311.field4403.method1173(var7, (byte) 126);
            class311.field4403.method1155(-3355, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class311.field4403.method1140(var4 + class279.field4012, 6293);
            class136.method1004(var5, 117, var4);
        }
        if (var6 == 10) {
            class39 var18 = class112.field1570[var7];
            if (var18 != null) {
                class177.field2682++;
                class39.field528 = arg1;
                class127.field1735 = arg2;
                class483.field6826 = 2;
                class323.field4515 = 0;
                class336.method2111(class432.field6107, arg0 + 5);
                class311.field4403.method1187(var7, (byte) -18);
                class311.field4403.method1155(-3355, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class282.method1880(126, class262.field3781.field5807[0], var18.method245(4452), 0, var18.field5811[0], class262.field3781.field5811[0], true, -2, 0, var18.method245(4452), var18.field5807[0]);
            }
        }
        if (var6 == 5) {
            class39 var19 = class112.field1570[var7];
            if (var19 != null) {
                class323.field4515 = 0;
                class39.field528 = arg1;
                class435.field6157++;
                class127.field1735 = arg2;
                class483.field6826 = 2;
                class336.method2111(class150.field2074, 98);
                class311.field4403.method1135(4, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class311.field4403.method1150(-124, var7);
                class282.method1880(arg0 ^ 0x4, class262.field3781.field5807[0], var19.method245(4452), 0, var19.field5811[0], class262.field3781.field5811[0], true, -2, 0, var19.method245(4452), var19.field5807[0]);
            }
        }
        if (var6 == 17) {
            class39 var20 = class112.field1570[var7];
            if (var20 != null) {
                class39.field528 = arg1;
                class162.field2348++;
                class127.field1735 = arg2;
                class323.field4515 = 0;
                class483.field6826 = 2;
                class336.method2111(class169.field2450, 91);
                class311.field4403.method1135(arg0 ^ 0x72, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class311.field4403.method1187(var7, (byte) -18);
                class282.method1880(118, class262.field3781.field5807[0], var20.method245(4452), 0, var20.field5811[0], class262.field3781.field5811[0], true, -2, 0, var20.method245(4452), var20.field5807[0]);
            }
        }
        if (var6 == 59 && class315.field4453 == null) {
            class279.method1865(var5, (byte) 70, var4);
            class315.field4453 = class77.method678(var4, arg0 - 131, var5);
            class184.method1314(class315.field4453, 93);
        }
        if (var6 == 46) {
            class361 var21 = class163.field2377[var7];
            if (var21 != null) {
                class483.field6826 = 2;
                class39.field528 = arg1;
                class127.field1735 = arg2;
                class323.field4515 = 0;
                class384.field5264++;
                class336.method2111(class414.field5684, 114);
                class311.field4403.method1140(var7, 6293);
                class311.field4403.method1180((byte) -110, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class282.method1880(119, class262.field3781.field5807[0], var21.method245(arg0 + 4334), 0, var21.field5811[0], class262.field3781.field5811[0], true, -2, 0, var21.method245(4452), var21.field5807[0]);
            }
        }
        if (var6 == 8) {
            class361 var22 = class163.field2377[var7];
            if (var22 != null) {
                class483.field6826 = 2;
                class323.field4515 = 0;
                class127.field1735 = arg2;
                class39.field528 = arg1;
                class200.field2967++;
                class336.method2111(class265.field3819, arg0 - 2);
                class311.field4403.method1187(var7, (byte) -18);
                class311.field4403.method1183(arg0 - 27283, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class282.method1880(116, class262.field3781.field5807[0], var22.method245(4452), 0, var22.field5811[0], class262.field3781.field5811[0], true, -2, 0, var22.method245(4452), var22.field5807[0]);
            }
        }
        if (var6 == 23) {
            class39.field528 = arg1;
            class127.field1735 = arg2;
            class323.field4515 = 0;
            class483.field6826 = 2;
            class150.field2072++;
            class336.method2111(class280.field4028, arg0 - 30);
            class311.field4403.method1140(class189.field2810 + var5, 6293);
            class311.field4403.method1140(class279.field4012 + var4, arg0 ^ 0x18E3);
            class311.field4403.method1173(var7, (byte) 122);
            class311.field4403.method1135(4, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class136.method1004(var5, 103, var4);
        }
        if (var6 == 13 || var6 == 1002) {
            class198.method1370(var5, arg3.field1045, var7, -31859, var4);
        }
        if (var6 == 22) {
            class448.field6374++;
            class483.field6826 = 2;
            class323.field4515 = 0;
            class127.field1735 = arg2;
            class39.field528 = arg1;
            class336.method2111(class289.field4098, 100);
            class311.field4403.method1158(class124.field1679, -125);
            class311.field4403.method1140(class189.field2810 + var5, 6293);
            class311.field4403.method1187(class279.field4012 + var4, (byte) -18);
            class311.field4403.method1173(class4.field29, (byte) 125);
            class311.field4403.method1150(-126, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class311.field4403.method1150(-121, class128.field1750);
            class311.field4403.method1155(-3355, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class185.method1316((byte) 125, var4, var8, var5);
        }
        if (var6 == 1009 || var6 == 1012 || var6 == 1006 || var6 == 1004 || var6 == 1010) {
            class227.method1545(false, var6, var7, var4);
        }
        if (var6 == 60) {
            if (class255.field3661 > 0 && class162.field2363.method1820((byte) -96, 82) && class162.field2363.method1820((byte) -96, 81)) {
                class449.method2716(class279.field4012 + var4, class262.field3781.field4531, class189.field2810 + var5, (byte) -89);
            } else {
                class161.method1156(var5, var7, var4, (byte) 121);
                if (var7 == 1) {
                    class311.field4403.method1180((byte) -110, -1);
                    class311.field4403.method1180((byte) -110, -1);
                    class311.field4403.method1173((int) class91.field1281, (byte) 127);
                    class311.field4403.method1180((byte) -110, 57);
                    class311.field4403.method1180((byte) -110, class462.field6529);
                    class311.field4403.method1180((byte) -110, class20.field216);
                    class311.field4403.method1180((byte) -110, 89);
                    class311.field4403.method1173(class262.field3781.field4537, (byte) 118);
                    class311.field4403.method1173(class262.field3781.field4530, (byte) 122);
                    class311.field4403.method1180((byte) -110, 63);
                } else {
                    class39.field528 = arg1;
                    class323.field4515 = 0;
                    class127.field1735 = arg2;
                    class483.field6826 = 1;
                }
                class282.method1880(119, class262.field3781.field5807[0], 1, 0, var4, class262.field3781.field5811[0], true, -4, 0, 1, var5);
            }
        }
        if (var6 == 2) {
            class172 var23 = class77.method678(var4, -18, var5);
            if (var23 != null) {
                class2.method9(149799361);
                class110 var24 = client.method547(var23);
                class476.method2815((byte) -98, var4, var24.field1542, var5, var23.field2481, var23.field2501, var24.method879(24468));
                class347.field4784 = class260.method1746(-1, var23);
                class352.field4842 = var23.field2505 + "<col=ffffff>";
                if (class347.field4784 == null) {
                    class347.field4784 = "Null";
                }
            }
            return;
        }
        if (var6 == 50) {
            class361 var25 = class163.field2377[var7];
            if (var25 != null) {
                class127.field1735 = arg2;
                class323.field4515 = 0;
                class39.field528 = arg1;
                class483.field6826 = 2;
                class153.field2118++;
                class336.method2111(class89.field1263, 104);
                class311.field4403.method1173(var7, (byte) 121);
                class311.field4403.method1180((byte) -110, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class282.method1880(119, class262.field3781.field5807[0], var25.method245(4452), 0, var25.field5811[0], class262.field3781.field5811[0], true, -2, 0, var25.method245(arg0 ^ 0x1112), var25.field5807[0]);
            }
        }
        if (var6 == 57) {
            class108.field1510++;
            class127.field1735 = arg2;
            class323.field4515 = 0;
            class39.field528 = arg1;
            class483.field6826 = 2;
            class336.method2111(class444.field6327, 99);
            class311.field4403.method1150(96, var7);
            class311.field4403.method1183(-27165, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class311.field4403.method1140(class279.field4012 + var4, arg0 + 6175);
            class311.field4403.method1187(var5 + class189.field2810, (byte) -18);
            class136.method1004(var5, 62, var4);
        }
        if (var6 == 9) {
            class361 var26 = class163.field2377[var7];
            if (var26 != null) {
                class127.field1735 = arg2;
                class39.field528 = arg1;
                class323.field4515 = 0;
                class490.field6922++;
                class483.field6826 = 2;
                class336.method2111(class111.field1567, 110);
                class311.field4403.method1135(4, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class311.field4403.method1150(3, var7);
                class282.method1880(109, class262.field3781.field5807[0], var26.method245(4452), 0, var26.field5811[0], class262.field3781.field5811[0], true, -2, 0, var26.method245(4452), var26.field5807[0]);
            }
        }
        if (var6 == 51) {
            if (class255.field3661 > 0 && class162.field2363.method1820((byte) -96, 82) && class162.field2363.method1820((byte) -96, 81)) {
                class449.method2716(class279.field4012 + var4, class262.field3781.field4531, class189.field2810 + var5, (byte) -102);
            } else {
                class486.field6869++;
                class127.field1735 = arg2;
                class483.field6826 = 1;
                class39.field528 = arg1;
                class323.field4515 = 0;
                class336.method2111(class22.field241, 117);
                class311.field4403.method1150(123, class279.field4012 + var4);
                class311.field4403.method1150(-121, class189.field2810 + var5);
            }
        }
        if (var6 == 19) {
            class39.field528 = arg1;
            class369.field5076++;
            class483.field6826 = 2;
            class127.field1735 = arg2;
            class323.field4515 = 0;
            class336.method2111(class153.field2121, arg0 - 10);
            class311.field4403.method1140(class279.field4012 + var4, 6293);
            class311.field4403.method1173(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 127);
            class311.field4403.method1140(class189.field2810 + var5, arg0 ^ 0x18E3);
            class311.field4403.method1135(4, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class185.method1316((byte) 123, var4, var8, var5);
        }
        if (var6 == 44) {
            class39 var27 = class112.field1570[var7];
            if (var27 != null) {
                class483.field6826 = 2;
                class323.field4515 = 0;
                class341.field4709++;
                class127.field1735 = arg2;
                class39.field528 = arg1;
                class336.method2111(class138.field1919, arg0 - 27);
                class311.field4403.method1150(arg0 - 245, var7);
                class311.field4403.method1180((byte) -110, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class311.field4403.method1187(class128.field1750, (byte) -18);
                class311.field4403.method1194(-13965, class124.field1679);
                class311.field4403.method1150(-126, class4.field29);
                class282.method1880(126, class262.field3781.field5807[0], var27.method245(arg0 + 4334), 0, var27.field5811[0], class262.field3781.field5811[0], true, -2, 0, var27.method245(4452), var27.field5807[0]);
            }
        }
        if (var6 == 6) {
            class39 var28 = class112.field1570[var7];
            if (var28 != null) {
                class223.field3220++;
                class323.field4515 = 0;
                class483.field6826 = 2;
                class39.field528 = arg1;
                class127.field1735 = arg2;
                class336.method2111(class370.field5098, 102);
                class311.field4403.method1187(var7, (byte) -18);
                class311.field4403.method1180((byte) -110, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class282.method1880(116, class262.field3781.field5807[0], var28.method245(4452), 0, var28.field5811[0], class262.field3781.field5811[0], true, -2, 0, var28.method245(4452), var28.field5807[0]);
            }
        }
        if (var6 == 49) {
            class305.field4329++;
            class127.field1735 = arg2;
            class39.field528 = arg1;
            class483.field6826 = 2;
            class323.field4515 = 0;
            class336.method2111(class280.field4025, arg0 - 30);
            class311.field4403.method1180((byte) -110, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class311.field4403.method1140(var5 + class189.field2810, 6293);
            class311.field4403.method1173(class279.field4012 + var4, (byte) 125);
            class311.field4403.method1140(Integer.MAX_VALUE & (int) (var8 >>> 32), 6293);
            class185.method1316((byte) 117, var4, var8, var5);
        }
        if (var6 == 15) {
            class483.field6826 = 2;
            class103.field1440++;
            class127.field1735 = arg2;
            class323.field4515 = 0;
            class39.field528 = arg1;
            class336.method2111(class467.field6581, 90);
            class311.field4403.method1140(class189.field2810 + var5, 6293);
            class311.field4403.method1155(-3355, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class311.field4403.method1187(class279.field4012 + var4, (byte) -18);
            class311.field4403.method1173(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 117);
            class185.method1316((byte) 118, var4, var8, var5);
        }
        if (var6 == 21) {
            class39.field528 = arg1;
            class323.field4515 = 0;
            class127.field1735 = arg2;
            class483.field6826 = 1;
            class233.field3402++;
            class336.method2111(class173.field2640, 116);
            class311.field4403.method1194(-13965, class124.field1679);
            class311.field4403.method1150(arg0 ^ 0xFFFFFFF5, class189.field2810 + var5);
            class311.field4403.method1187(class4.field29, (byte) -18);
            class311.field4403.method1140(class279.field4012 + var4, arg0 ^ 0x18E3);
            class311.field4403.method1140(class128.field1750, 6293);
            class282.method1880(110, class262.field3781.field5807[0], 1, 0, var4, class262.field3781.field5811[0], true, -4, 0, 1, var5);
        }
        if (var6 == 58) {
            class127.field1735 = arg2;
            class483.field6826 = 2;
            class39.field528 = arg1;
            class323.field4515 = 0;
            class421.field5829++;
            class336.method2111(class233.field3405, 126);
            class311.field4403.method1150(8, var7);
            class311.field4403.method1140(class189.field2810 + var5, 6293);
            class311.field4403.method1180((byte) -110, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class311.field4403.method1140(var4 + class279.field4012, 6293);
            class136.method1004(var5, 100, var4);
        }
        if (var6 == 3) {
            class39 var29 = class112.field1570[var7];
            if (var29 != null) {
                class483.field6826 = 2;
                class127.field1735 = arg2;
                class323.field4515 = 0;
                class39.field528 = arg1;
                class117.field1626++;
                class336.method2111(class304.field4322, 88);
                class311.field4403.method1180((byte) -110, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
                class311.field4403.method1173(var7, (byte) 118);
                class282.method1880(arg0 - 6, class262.field3781.field5807[0], var29.method245(4452), 0, var29.field5811[0], class262.field3781.field5811[0], true, -2, 0, var29.method245(4452), var29.field5807[0]);
            }
        }
        if (var6 == 25) {
            class323.field4515 = 0;
            class483.field6826 = 2;
            class127.field1735 = arg2;
            class51.field741++;
            class39.field528 = arg1;
            class336.method2111(class473.field6659, 122);
            class311.field4403.method1150(arg0 ^ 0xFFFFFFF1, var7);
            class311.field4403.method1140(class128.field1750, 6293);
            class311.field4403.method1150(-123, class4.field29);
            class311.field4403.method1173(class189.field2810 + var5, (byte) 114);
            class311.field4403.method1140(var4 + class279.field4012, arg0 ^ 0x18E3);
            class311.field4403.method1158(class124.field1679, -125);
            class311.field4403.method1183(-27165, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class136.method1004(var5, 127, var4);
        }
        if (var6 == 20) {
            class323.field4515 = 0;
            class39.field528 = arg1;
            class483.field6826 = 2;
            class127.field1735 = arg2;
            class325.field4540++;
            class336.method2111(class39.field531, 98);
            class311.field4403.method1173(var5 + class189.field2810, (byte) 126);
            class311.field4403.method1155(arg0 - 3473, class162.field2363.method1820((byte) -96, 82) ? 1 : 0);
            class311.field4403.method1150(90, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class311.field4403.method1140(var4 + class279.field4012, 6293);
            class185.method1316((byte) 120, var4, var8, var5);
        }
        if (class450.field6405) {
            class2.method9(149799361);
        }
        if (class67.field970 != null && class56.field825 == 0) {
            class184.method1314(class67.field970, 63);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 712)
    public class434() {
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBZI)V", line = 715)
    public static final void method2623(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        if (class377.field5192 == 0) {
            class89.method745(65, false);
        } else {
            class55.field815 = class377.field5192;
            class136.method1006(0, arg2 + 24);
        }
        if (arg2 != -126) {
            field6136 = null;
        }
        field6138++;
        class342.field4722 = arg0;
        class257.field3681 = arg4;
        class477.field6786 = arg3;
        class330.method2080(arg1);
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 737)
    public static void method2624(int arg0) {
        if (arg0 == -13364) {
            field6136 = null;
            field6140 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(S)V", line = 747)
    public class434(short arg0) {
        this.field6139 = arg0;
    }
}
