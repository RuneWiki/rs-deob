import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class304 {

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "Lkc;")
    public static class157 field4128 = new class157("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "[Lqp;")
    public static class486[] field4129 = new class486[6];

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field4130 = 0;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLws;II)V", line = 8)
    public static final void method1755(byte arg0, class440 arg1, int arg2, int arg3) {
        field4127++;
        if (arg1 == null || class391.field5638.field7789 == arg1) {
            return;
        }
        int var4 = arg1.field6343;
        int var5 = arg1.field6344;
        if (arg0 < 52) {
            field4129 = null;
        }
        int var6 = arg1.field6337;
        int var7 = (int) arg1.field6334;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg1.field6334;
        if (var6 == 21) {
            class326 var10 = (class326) class281.field3826.method1592((byte) -25, (long) var7);
            if (var10 != null) {
                client.field7561 = arg2;
                class311.field4222++;
                class273.field3699 = 0;
                class41.field616 = 2;
                class209 var11 = var10.field4455;
                class119.field1861 = arg3;
                class274.method1602(14, class412.field5871);
                class17.field275.method1891(false, class78.field1106.method2585(82, (byte) 125) ? 1 : 0);
                class17.field275.method1857(561746448, var7);
                class398.method2357(0, var11.field257[0], 0, -2, var11.method116(8569), var11.field263[0], 0, var11.method116(8569), true);
            }
        }
        if (var6 == 1007) {
            class41.field616 = 2;
            client.field7561 = arg2;
            class119.field1861 = arg3;
            class273.field3699 = 0;
            class282.field3833++;
            class274.method1602(14, class102.field1607);
            class17.field275.method1891(false, class78.field1106.method2585(82, (byte) 124) ? 1 : 0);
            class17.field275.method1831(55750472, class110.field1775 + var4);
            class17.field275.method1866(class399.field5727 + var5, true);
            class17.field275.method1857(561746448, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class403.method2382(var4, (byte) 119, var8, var5);
        }
        if (var6 == 57) {
            class487 var12 = class45.field642[var7];
            if (var12 != null) {
                class119.field1861 = arg3;
                class41.field616 = 2;
                class273.field3699 = 0;
                class172.field2599++;
                client.field7561 = arg2;
                class274.method1602(14, class375.field5393);
                class17.field275.method1831(55750472, class168.field2567);
                class17.field275.method1872(128, class78.field1106.method2585(82, (byte) 121) ? 1 : 0);
                class17.field275.method1866(var7, true);
                class17.field275.method1850(class478.field6914, -1822326824);
                class17.field275.method1884(class478.field6916, (byte) -116);
                class398.method2357(0, var12.field257[0], 0, -2, var12.method116(8569), var12.field263[0], 0, var12.method116(8569), true);
            }
        }
        if (var6 == 17) {
            class91.field1459++;
            class273.field3699 = 0;
            class119.field1861 = arg3;
            client.field7561 = arg2;
            class41.field616 = 2;
            class274.method1602(14, class434.field6275);
            class17.field275.method1884(var5 + class399.field5727, (byte) -124);
            class17.field275.method1835(120, class78.field1106.method2585(82, (byte) 56) ? 1 : 0);
            class17.field275.method1857(561746448, var4 + class110.field1775);
            class17.field275.method1884(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -113);
            class403.method2382(var4, (byte) 118, var8, var5);
        }
        if (var6 == 15) {
            class41.field616 = 2;
            client.field7561 = arg2;
            class119.field1861 = arg3;
            class392.field5663++;
            class273.field3699 = 0;
            class274.method1602(14, class137.field2073);
            class17.field275.method1874(118, class78.field1106.method2585(82, (byte) 63) ? 1 : 0);
            class17.field275.method1884(class399.field5727 + var5, (byte) -122);
            class17.field275.method1884(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -125);
            class17.field275.method1866(class110.field1775 + var4, true);
            class403.method2382(var4, (byte) 82, var8, var5);
        }
        if (var6 == 50) {
            if (class136.field2064 > 0 && class78.field1106.method2585(82, (byte) 114) && class78.field1106.method2585(81, (byte) 101)) {
                class378.method2256(class110.field1775 + var4, 23, class81.field1158.field6279, class399.field5727 + var5);
            } else {
                class140.field2091++;
                class41.field616 = 1;
                client.field7561 = arg2;
                class273.field3699 = 0;
                class119.field1861 = arg3;
                class274.method1602(14, class412.field5870);
                class17.field275.method1884(class399.field5727 + var5, (byte) -124);
                class17.field275.method1831(55750472, class110.field1775 + var4);
            }
        }
        if (var6 == 2) {
            class41.field616 = 2;
            class119.field1861 = arg3;
            class322.field4417++;
            class273.field3699 = 0;
            client.field7561 = arg2;
            class274.method1602(14, class228.field3201);
            class17.field275.method1857(561746448, class478.field6916);
            class17.field275.method1884(class399.field5727 + var5, (byte) -115);
            class17.field275.method1857(561746448, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class17.field275.method1866(class110.field1775 + var4, true);
            class17.field275.method1850(class478.field6914, -1822326824);
            class17.field275.method1874(126, class78.field1106.method2585(82, (byte) 119) ? 1 : 0);
            class17.field275.method1866(class168.field2567, true);
            class403.method2382(var4, (byte) 93, var8, var5);
        }
        if (var6 == 58) {
            class487 var13 = class45.field642[var7];
            if (var13 != null) {
                client.field7561 = arg2;
                class98.field1558++;
                class273.field3699 = 0;
                class119.field1861 = arg3;
                class41.field616 = 2;
                class274.method1602(14, class299.field4101);
                class17.field275.method1866(var7, true);
                class17.field275.method1872(128, class78.field1106.method2585(82, (byte) 56) ? 1 : 0);
                class398.method2357(0, var13.field257[0], 0, -2, var13.method116(8569), var13.field263[0], 0, var13.method116(8569), true);
            }
        }
        if (var6 == 45) {
            class487 var14 = class45.field642[var7];
            if (var14 != null) {
                class273.field3699 = 0;
                class41.field616 = 2;
                class119.field1861 = arg3;
                class96.field1550++;
                client.field7561 = arg2;
                class274.method1602(14, class133.field2026);
                class17.field275.method1857(561746448, var7);
                class17.field275.method1891(false, class78.field1106.method2585(82, (byte) 77) ? 1 : 0);
                class398.method2357(0, var14.field257[0], 0, -2, var14.method116(8569), var14.field263[0], 0, var14.method116(8569), true);
            }
        }
        if (var6 == 13) {
            class487 var15 = class45.field642[var7];
            if (var15 != null) {
                class119.field1861 = arg3;
                client.field7561 = arg2;
                class41.field616 = 2;
                class273.field3699 = 0;
                class465.field6715++;
                class274.method1602(14, class234.field3253);
                class17.field275.method1884(var7, (byte) -122);
                class17.field275.method1835(124, class78.field1106.method2585(82, (byte) 98) ? 1 : 0);
                class398.method2357(0, var15.field257[0], 0, -2, var15.method116(8569), var15.field263[0], 0, var15.method116(8569), true);
            }
        }
        if (var6 == 11) {
            class444 var16 = class222.method1381(var5, var4, -106);
            if (var16 != null) {
                class319.method1893(11);
                class428 var17 = client.method3067(var16);
                class39.method275(true, var17.method2554(124), var16, var17.field6211);
                class87.field1409 = class295.method1705(true, var16);
                class476.field6886 = var16.field6409 + "<col=ffffff>";
                if (class87.field1409 == null) {
                    class87.field1409 = "Null";
                }
            }
            return;
        }
        if (var6 == 1012 || var6 == 1003 || var6 == 1004 || var6 == 1010 || var6 == 1008) {
            class343.method2074(var7, var6, var4, true);
        }
        if (var6 == 47) {
            class41.field616 = 2;
            class94.field1531++;
            class273.field3699 = 0;
            client.field7561 = arg2;
            class119.field1861 = arg3;
            class274.method1602(14, class161.field2435);
            class17.field275.method1884(class399.field5727 + var5, (byte) -119);
            class17.field275.method1831(55750472, var7);
            class17.field275.method1866(var4 + class110.field1775, true);
            class17.field275.method1874(125, class78.field1106.method2585(82, (byte) 119) ? 1 : 0);
            class373.method2238(var5, 0, var4);
        }
        if (var6 == 48) {
            client.field7561 = arg2;
            class41.field616 = 2;
            class119.field1861 = arg3;
            class273.field3699 = 0;
            class237.field3285++;
            class274.method1602(14, class86.field1408);
            class17.field275.method1891(false, class78.field1106.method2585(82, (byte) 97) ? 1 : 0);
            class17.field275.method1884(var5 + class399.field5727, (byte) -122);
            class17.field275.method1857(561746448, var7);
            class17.field275.method1866(class110.field1775 + var4, true);
            class373.method2238(var5, 0, var4);
        }
        if (var6 == 18) {
            class326 var18 = (class326) class281.field3826.method1592((byte) -25, (long) var7);
            if (var18 != null) {
                client.field7561 = arg2;
                class273.field3699 = 0;
                class209 var19 = var18.field4455;
                class346.field4980++;
                class41.field616 = 2;
                class119.field1861 = arg3;
                class274.method1602(14, class288.field3902);
                class17.field275.method1891(false, class78.field1106.method2585(82, (byte) 67) ? 1 : 0);
                class17.field275.method1831(55750472, var7);
                class398.method2357(0, var19.field257[0], 0, -2, var19.method116(8569), var19.field263[0], 0, var19.method116(8569), true);
            }
        }
        if (var6 == 6) {
            class487 var20 = class45.field642[var7];
            if (var20 != null) {
                client.field7561 = arg2;
                class134.field2040++;
                class119.field1861 = arg3;
                class41.field616 = 2;
                class273.field3699 = 0;
                class274.method1602(14, class400.field5736);
                class17.field275.method1835(117, class78.field1106.method2585(82, (byte) 82) ? 1 : 0);
                class17.field275.method1831(55750472, var7);
                class398.method2357(0, var20.field257[0], 0, -2, var20.method116(8569), var20.field263[0], 0, var20.method116(8569), true);
            }
        }
        if (var6 == 25) {
            class444 var21 = class222.method1381(var5, var4, -91);
            if (var21 != null) {
                class119.method876(var21, (byte) 125);
            }
        }
        if (var6 == 1006) {
            class148.field2268++;
            class273.field3699 = 0;
            class119.field1861 = arg3;
            client.field7561 = arg2;
            class41.field616 = 2;
            class274.method1602(14, class443.field6376);
            class17.field275.method1857(561746448, var7);
        }
        if (var6 == 22) {
            class326 var22 = (class326) class281.field3826.method1592((byte) -25, (long) var7);
            if (var22 != null) {
                class209 var23 = var22.field4455;
                class273.field3699 = 0;
                class119.field1861 = arg3;
                class41.field616 = 2;
                client.field7561 = arg2;
                class125.field1955++;
                class274.method1602(14, class206.field2961);
                class17.field275.method1874(123, class78.field1106.method2585(82, (byte) 72) ? 1 : 0);
                class17.field275.method1866(var7, true);
                class398.method2357(0, var23.field257[0], 0, -2, var23.method116(8569), var23.field263[0], 0, var23.method116(8569), true);
            }
        }
        if (var6 == 19) {
            class326 var24 = (class326) class281.field3826.method1592((byte) -25, (long) var7);
            if (var24 != null) {
                class41.field616 = 2;
                client.field7561 = arg2;
                class209 var25 = var24.field4455;
                class332.field4522++;
                class273.field3699 = 0;
                class119.field1861 = arg3;
                class274.method1602(14, class40.field590);
                class17.field275.method1884(var7, (byte) -120);
                class17.field275.method1874(118, class78.field1106.method2585(82, (byte) 112) ? 1 : 0);
                class398.method2357(0, var25.field257[0], 0, -2, var25.method116(8569), var25.field263[0], 0, var25.method116(8569), true);
            }
        }
        if (var6 == 59) {
            class119.field1861 = arg3;
            class267.field3591++;
            class41.field616 = 1;
            client.field7561 = arg2;
            class273.field3699 = 0;
            class274.method1602(14, class183.field2722);
            class17.field275.method1884(class110.field1775 + var4, (byte) -122);
            class17.field275.method1831(55750472, class168.field2567);
            class17.field275.method1832(32767, class478.field6914);
            class17.field275.method1831(55750472, class478.field6916);
            class17.field275.method1831(55750472, class399.field5727 + var5);
            class398.method2357(0, var5, 0, -4, 1, var4, 0, 1, true);
        }
        if (var6 == 46) {
            class119.field1861 = arg3;
            client.field7561 = arg2;
            class400.field5734++;
            class273.field3699 = 0;
            class41.field616 = 2;
            class274.method1602(14, class387.field5534);
            class17.field275.method1872(128, class78.field1106.method2585(82, (byte) 103) ? 1 : 0);
            class17.field275.method1884(class110.field1775 + var4, (byte) -128);
            class17.field275.method1857(561746448, class399.field5727 + var5);
            class17.field275.method1831(55750472, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class403.method2382(var4, (byte) 65, var8, var5);
        }
        if (var6 == 30) {
            client.field7561 = arg2;
            class400.field5731++;
            class273.field3699 = 0;
            class119.field1861 = arg3;
            class41.field616 = 2;
            class274.method1602(14, class512.field7504);
            class17.field275.method1874(124, class78.field1106.method2585(82, (byte) 120) ? 1 : 0);
            class17.field275.method1857(561746448, var4 + class110.field1775);
            class17.field275.method1831(55750472, var7);
            class17.field275.method1831(55750472, class399.field5727 + var5);
            class373.method2238(var5, 0, var4);
        }
        if (var6 == 5) {
            client.field7561 = arg2;
            class140.field2095++;
            class273.field3699 = 0;
            class119.field1861 = arg3;
            class41.field616 = 2;
            class274.method1602(14, class486.field6988);
            class17.field275.method1891(false, class78.field1106.method2585(82, (byte) 98) ? 1 : 0);
            class17.field275.method1831(55750472, class399.field5727 + var5);
            class17.field275.method1884(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -119);
            class17.field275.method1884(class110.field1775 + var4, (byte) -120);
            class403.method2382(var4, (byte) 31, var8, var5);
        }
        if (var6 == 49) {
            class487 var26 = class45.field642[var7];
            if (var26 != null) {
                client.field7561 = arg2;
                class83.field1240++;
                class119.field1861 = arg3;
                class273.field3699 = 0;
                class41.field616 = 2;
                class274.method1602(14, class34.field522);
                class17.field275.method1891(false, class78.field1106.method2585(82, (byte) 96) ? 1 : 0);
                class17.field275.method1857(561746448, var7);
                class398.method2357(0, var26.field257[0], 0, -2, var26.method116(8569), var26.field263[0], 0, var26.method116(8569), true);
            }
        }
        if (var6 == 1009) {
            class119.field1861 = arg3;
            class333.field4610++;
            class273.field3699 = 0;
            class41.field616 = 2;
            client.field7561 = arg2;
            class274.method1602(14, class4.field66);
            class17.field275.method1857(561746448, var7);
        }
        if (var6 == 51) {
            class119.field1861 = arg3;
            client.field7561 = arg2;
            class273.field3699 = 0;
            class41.field616 = 2;
            class479.field6918++;
            class274.method1602(14, class535.field7880);
            class17.field275.method1850(class478.field6914, -1822326824);
            class17.field275.method1866(class168.field2567, true);
            class17.field275.method1884(var7, (byte) -117);
            class17.field275.method1884(class110.field1775 + var4, (byte) -122);
            class17.field275.method1866(class478.field6916, true);
            class17.field275.method1857(561746448, class399.field5727 + var5);
            class17.field275.method1874(-109, class78.field1106.method2585(82, (byte) 68) ? 1 : 0);
            class373.method2238(var5, 0, var4);
        }
        if (var6 == 12) {
            class487 var27 = class45.field642[var7];
            if (var27 != null) {
                class41.field616 = 2;
                class375.field5386++;
                class273.field3699 = 0;
                client.field7561 = arg2;
                class119.field1861 = arg3;
                class274.method1602(14, class299.field4100);
                class17.field275.method1831(55750472, var7);
                class17.field275.method1872(128, class78.field1106.method2585(82, (byte) 65) ? 1 : 0);
                class398.method2357(0, var27.field257[0], 0, -2, var27.method116(8569), var27.field263[0], 0, var27.method116(8569), true);
            }
        }
        if (var6 == 16) {
            class119.field1861 = arg3;
            class41.field616 = 2;
            class273.field3699 = 0;
            class172.field2599++;
            client.field7561 = arg2;
            class274.method1602(14, class375.field5393);
            class17.field275.method1831(55750472, class168.field2567);
            class17.field275.method1872(128, class78.field1106.method2585(82, (byte) 93) ? 1 : 0);
            class17.field275.method1866(class81.field1158.field179, true);
            class17.field275.method1850(class478.field6914, -1822326824);
            class17.field275.method1884(class478.field6916, (byte) -115);
        }
        if (var6 == 23 || var6 == 1002) {
            class237.method1449(var4, arg1.field6338, var5, var7, true);
        }
        if (var6 == 8 && class389.field5616 == null) {
            class149.method1078(var5, false, var4);
            class389.field5616 = class222.method1381(var5, var4, -114);
            class151.method1093(class389.field5616, 126);
        }
        if (var6 == 20) {
            class273.field3699 = 0;
            class41.field616 = 2;
            class119.field1861 = arg3;
            class306.field4140++;
            client.field7561 = arg2;
            class274.method1602(14, class44.field636);
            class17.field275.method1891(false, class78.field1106.method2585(82, (byte) 123) ? 1 : 0);
            class17.field275.method1857(561746448, class110.field1775 + var4);
            class17.field275.method1857(561746448, var5 + class399.field5727);
            class17.field275.method1857(561746448, var7);
            class373.method2238(var5, 0, var4);
        }
        if (var6 == 9) {
            class326 var28 = (class326) class281.field3826.method1592((byte) -25, (long) var7);
            if (var28 != null) {
                class417.field6046++;
                class41.field616 = 2;
                class209 var29 = var28.field4455;
                client.field7561 = arg2;
                class273.field3699 = 0;
                class119.field1861 = arg3;
                class274.method1602(14, class316.field4303);
                class17.field275.method1872(128, class78.field1106.method2585(82, (byte) 66) ? 1 : 0);
                class17.field275.method1866(class478.field6916, true);
                class17.field275.method1850(class478.field6914, -1822326824);
                class17.field275.method1857(561746448, var7);
                class17.field275.method1857(561746448, class168.field2567);
                class398.method2357(0, var29.field257[0], 0, -2, var29.method116(8569), var29.field263[0], 0, var29.method116(8569), true);
            }
        }
        if (var6 == 44) {
            class244.field3351++;
            class119.field1861 = arg3;
            class41.field616 = 2;
            client.field7561 = arg2;
            class273.field3699 = 0;
            class274.method1602(14, class418.field6056);
            class17.field275.method1857(561746448, var4 + class110.field1775);
            class17.field275.method1866(var7, true);
            class17.field275.method1891(false, class78.field1106.method2585(82, (byte) 74) ? 1 : 0);
            class17.field275.method1831(55750472, class399.field5727 + var5);
            class373.method2238(var5, 0, var4);
        }
        if (var6 == 10) {
            if (class136.field2064 > 0 && class78.field1106.method2585(82, (byte) 124) && class78.field1106.method2585(81, (byte) 88)) {
                class378.method2256(class110.field1775 + var4, -15, class81.field1158.field6279, class399.field5727 + var5);
            } else {
                class495.method2930(var5, var4, (byte) 27, var7);
                if (var7 == 1) {
                    class17.field275.method1891(false, -1);
                    class17.field275.method1891(false, -1);
                    class17.field275.method1857(561746448, (int) class191.field2797);
                    class17.field275.method1891(false, 57);
                    class17.field275.method1891(false, class457.field6666);
                    class17.field275.method1891(false, class532.field7816);
                    class17.field275.method1891(false, 89);
                    class17.field275.method1857(561746448, class81.field1158.field6284);
                    class17.field275.method1857(561746448, class81.field1158.field6287);
                    class17.field275.method1891(false, 63);
                } else {
                    class273.field3699 = 0;
                    class41.field616 = 1;
                    client.field7561 = arg2;
                    class119.field1861 = arg3;
                }
                class398.method2357(0, var5, 0, -4, 1, var4, 0, 1, true);
            }
        }
        if (var6 == 3) {
            class487 var30 = class45.field642[var7];
            if (var30 != null) {
                class41.field616 = 2;
                class343.field4955++;
                client.field7561 = arg2;
                class273.field3699 = 0;
                class119.field1861 = arg3;
                class274.method1602(14, class87.field1417);
                class17.field275.method1831(55750472, var7);
                class17.field275.method1872(128, class78.field1106.method2585(82, (byte) 53) ? 1 : 0);
                class398.method2357(0, var30.field257[0], 0, -2, var30.method116(8569), var30.field263[0], 0, var30.method116(8569), true);
            }
        }
        if (var6 == 1001) {
            class41.field616 = 2;
            client.field7561 = arg2;
            class273.field3699 = 0;
            class119.field1861 = arg3;
            class326 var31 = (class326) class281.field3826.method1592((byte) -25, (long) var7);
            if (var31 != null) {
                class209 var32 = var31.field4455;
                class83 var33 = var32.field2976;
                if (var33.field1272 != null) {
                    var33 = var33.method655(class309.field4200, (byte) 125);
                }
                if (var33 != null) {
                    class274.method1602(14, class176.field2650);
                    class247.field3362++;
                    class17.field275.method1857(561746448, var33.field1258);
                }
            }
        }
        if (var6 == 4) {
            class326 var34 = (class326) class281.field3826.method1592((byte) -25, (long) var7);
            if (var34 != null) {
                class119.field1861 = arg3;
                class476.field6882++;
                client.field7561 = arg2;
                class209 var35 = var34.field4455;
                class41.field616 = 2;
                class273.field3699 = 0;
                class274.method1602(14, class235.field3256);
                class17.field275.method1835(116, class78.field1106.method2585(82, (byte) 80) ? 1 : 0);
                class17.field275.method1857(561746448, var7);
                class398.method2357(0, var35.field257[0], 0, -2, var35.method116(8569), var35.field263[0], 0, var35.method116(8569), true);
            }
        }
        if (var6 == 60) {
            class487 var36 = class45.field642[var7];
            if (var36 != null) {
                class92.field1476++;
                class119.field1861 = arg3;
                class41.field616 = 2;
                client.field7561 = arg2;
                class273.field3699 = 0;
                class274.method1602(14, class351.field5101);
                class17.field275.method1831(55750472, var7);
                class17.field275.method1891(false, class78.field1106.method2585(82, (byte) 62) ? 1 : 0);
                class398.method2357(0, var36.field257[0], 0, -2, var36.method116(8569), var36.field263[0], 0, var36.method116(8569), true);
            }
        }
        if (class375.field5390) {
            class319.method1893(-92);
        }
        if (class23.field321 != null && class341.field4938 == 0) {
            class151.method1093(class23.field321, 126);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 739)
    public static void method1756(byte arg0) {
        field4128 = null;
        if (arg0 >= -11) {
            field4128 = null;
        }
        field4129 = null;
    }
}
