import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class752 {

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Z")
    public boolean field10433 = false;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field10429 = -1;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field10426;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field10427;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field10428;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public int field10432;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field10435;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public int field10436;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Lgf;")
    public class293 field10425;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Llc;")
    public static class675 field10434;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Les;B)V", line = 6)
    public final void method4199(class403 arg0, byte arg1) {
        field10426++;
        while (true) {
            int var3 = arg0.method2396((byte) 28);
            if (var3 == 0) {
                if (arg1 == 21) {
                    return;
                } else {
                    this.field10432 = -26;
                    return;
                }
            }
            this.method4201(114, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lqh;BII)V", line = 31)
    public static final void method4200(class75 arg0, byte arg1, int arg2, int arg3) {
        field10431++;
        if (arg0 == null || class5.field52.field6367 == arg0) {
            return;
        }
        int var4 = arg0.field1030;
        int var5 = arg0.field1036;
        int var6 = arg0.field1029;
        int var7 = (int) arg0.field1027;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg0.field1027;
        if (var6 == 11) {
            class148.field1853 = 2;
            class595.field8085 = arg3;
            class642.field8760++;
            class164.field1997 = 0;
            class709.field9947 = arg2;
            class336 var10 = class512.method3076(class583.field7966, class591.field8030, (byte) 85);
            var10.field4150.method2422(29933, var7);
            var10.field4150.method2353(67, class348.field4350.method216(-86, 82) ? 1 : 0);
            var10.field4150.method2422(29933, class620.field8435 + var5);
            var10.field4150.method2422(29933, class632.field8626 + var4);
            class578.method3334(4, var10);
            class444.method2617(127, var5, var4);
        }
        if (var6 == 30) {
            class709.field9947 = arg2;
            class164.field1997 = 0;
            class553.field7702++;
            class148.field1853 = 2;
            class595.field8085 = arg3;
            class336 var11 = class512.method3076(class314.field3863, class591.field8030, (byte) 94);
            var11.field4150.method2394(class215.field2531, (byte) -125);
            var11.field4150.method2380((byte) -9, class520.field7344);
            var11.field4150.method2369(-18090, var7);
            var11.field4150.method2420(2760, class348.field4350.method216(-120, 82) ? 1 : 0);
            var11.field4150.method2380((byte) -9, class351.field4370);
            var11.field4150.method2380((byte) -9, class620.field8435 + var5);
            var11.field4150.method2407(var4 + class632.field8626, (byte) 85);
            class578.method3334(4, var11);
            class444.method2617(125, var5, var4);
        }
        if (var6 == 58) {
            class709.field9947 = arg2;
            class595.field8085 = arg3;
            class164.field1997 = 0;
            class345.field4318++;
            class148.field1853 = 2;
            class336 var12 = class512.method3076(class243.field2872, class591.field8030, (byte) 76);
            var12.field4150.method2380((byte) -9, class300.field3596.field3393);
            var12.field4150.method2369(-18090, class520.field7344);
            var12.field4150.method2420(2760, class348.field4350.method216(-99, 82) ? 1 : 0);
            var12.field4150.method2369(-18090, class351.field4370);
            var12.field4150.method2376(class215.field2531, -591802824);
            class578.method3334(4, var12);
        }
        if (var6 == 50) {
            class521 var13 = class61.field825[var7];
            if (var13 != null) {
                class592.field8039++;
                class164.field1997 = 0;
                class709.field9947 = arg2;
                class595.field8085 = arg3;
                class148.field1853 = 2;
                class336 var14 = class512.method3076(class336.field4152, class591.field8030, (byte) 127);
                var14.field4150.method2397(-32403, class348.field4350.method216(-72, 82) ? 1 : 0);
                var14.field4150.method2380((byte) -9, var7);
                class578.method3334(4, var14);
                class96.method834(true, -2, (byte) 120, var13.field3455[0], 0, var13.method1665(1720746760), 0, var13.field3453[0], var13.method1665(1720746760));
            }
        }
        if (var6 == 1011) {
            class148.field1853 = 2;
            class709.field9947 = arg2;
            class164.field1997 = 0;
            class421.field5565++;
            class595.field8085 = arg3;
            class336 var15 = class512.method3076(class37.field554, class591.field8030, (byte) 69);
            var15.field4150.method2369(-18090, var7);
            class578.method3334(4, var15);
        }
        if (var6 == 4) {
            if (class637.field8741 > 0 && class348.field4350.method216(-73, 82) && class348.field4350.method216(-66, 81)) {
                class247.method1487(class632.field8626 + var4, class620.field8435 + var5, -35, class300.field3596.field808);
            } else {
                class148.field1853 = 1;
                class358.field4438++;
                class595.field8085 = arg3;
                class164.field1997 = 0;
                class709.field9947 = arg2;
                class336 var16 = class512.method3076(class419.field5488, class591.field8030, (byte) 73);
                var16.field4150.method2422(29933, class620.field8435 + var5);
                var16.field4150.method2380((byte) -9, class632.field8626 + var4);
                class578.method3334(4, var16);
            }
        }
        if (var6 == 16) {
            class709.field9947 = arg2;
            class164.field1997 = 0;
            class750.field10418++;
            class595.field8085 = arg3;
            class148.field1853 = 2;
            class336 var17 = class512.method3076(class542.field7607, class591.field8030, (byte) 72);
            var17.field4150.method2422(29933, class620.field8435 + var5);
            var17.field4150.method2420(2760, class348.field4350.method216(-25, 82) ? 1 : 0);
            var17.field4150.method2369(-18090, var7);
            var17.field4150.method2380((byte) -9, var4 + class632.field8626);
            class578.method3334(4, var17);
            class444.method2617(-101, var5, var4);
        }
        if (var6 == 44) {
            class521 var18 = class61.field825[var7];
            if (var18 != null) {
                class345.field4318++;
                class164.field1997 = 0;
                class595.field8085 = arg3;
                class709.field9947 = arg2;
                class148.field1853 = 2;
                class336 var19 = class512.method3076(class243.field2872, class591.field8030, (byte) 86);
                var19.field4150.method2380((byte) -9, var7);
                var19.field4150.method2369(-18090, class520.field7344);
                var19.field4150.method2420(2760, class348.field4350.method216(-78, 82) ? 1 : 0);
                var19.field4150.method2369(-18090, class351.field4370);
                var19.field4150.method2376(class215.field2531, -591802824);
                class578.method3334(4, var19);
                class96.method834(true, -2, (byte) -39, var18.field3455[0], 0, var18.method1665(1720746760), 0, var18.field3453[0], var18.method1665(1720746760));
            }
        }
        if (var6 == 6) {
            class521 var20 = class61.field825[var7];
            if (var20 != null) {
                class164.field1997 = 0;
                class595.field8085 = arg3;
                class668.field9174++;
                class148.field1853 = 2;
                class709.field9947 = arg2;
                class336 var21 = class512.method3076(class112.field1413, class591.field8030, (byte) 90);
                var21.field4150.method2408((byte) -45, class348.field4350.method216(-112, 82) ? 1 : 0);
                var21.field4150.method2380((byte) -9, var7);
                class578.method3334(4, var21);
                class96.method834(true, -2, (byte) 113, var20.field3455[0], 0, var20.method1665(1720746760), 0, var20.field3453[0], var20.method1665(1720746760));
            }
        }
        if (var6 == 9) {
            class164.field1997 = 0;
            class148.field1853 = 2;
            class709.field9947 = arg2;
            class196.field2341++;
            class595.field8085 = arg3;
            class336 var22 = class512.method3076(class486.field6783, class591.field8030, (byte) 101);
            var22.field4150.method2380((byte) -9, class620.field8435 + var5);
            var22.field4150.method2397(-32403, class348.field4350.method216(-52, 82) ? 1 : 0);
            var22.field4150.method2369(-18090, var4 + class632.field8626);
            var22.field4150.method2380((byte) -9, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class578.method3334(4, var22);
            class296.method1732(var5, true, var8, var4);
        }
        if (var6 == 57) {
            class521 var23 = class61.field825[var7];
            if (var23 != null) {
                class595.field8085 = arg3;
                class709.field9947 = arg2;
                class148.field1853 = 2;
                class713.field10005++;
                class164.field1997 = 0;
                class336 var24 = class512.method3076(class424.field5634, class591.field8030, (byte) 120);
                var24.field4150.method2380((byte) -9, var7);
                var24.field4150.method2420(2760, class348.field4350.method216(-99, 82) ? 1 : 0);
                class578.method3334(4, var24);
                class96.method834(true, -2, (byte) 103, var23.field3455[0], 0, var23.method1665(1720746760), 0, var23.field3453[0], var23.method1665(1720746760));
            }
        }
        if (var6 == 2) {
            class709.field9947 = arg2;
            class595.field8085 = arg3;
            class148.field1853 = 2;
            class164.field1997 = 0;
            class289.field3488++;
            class336 var25 = class512.method3076(class397.field5137, class591.field8030, (byte) 113);
            var25.field4150.method2353(-88, class348.field4350.method216(-37, 82) ? 1 : 0);
            var25.field4150.method2407(var4 + class632.field8626, (byte) -127);
            var25.field4150.method2422(29933, var5 + class620.field8435);
            var25.field4150.method2407(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 72);
            class578.method3334(4, var25);
            class296.method1732(var5, true, var8, var4);
        }
        if (var6 == 25) {
            class521 var26 = class61.field825[var7];
            if (var26 != null) {
                class148.field1853 = 2;
                class293.field3507++;
                class595.field8085 = arg3;
                class709.field9947 = arg2;
                class164.field1997 = 0;
                class336 var27 = class512.method3076(class580.field7903, class591.field8030, (byte) 66);
                var27.field4150.method2408((byte) -45, class348.field4350.method216(-111, 82) ? 1 : 0);
                var27.field4150.method2422(29933, var7);
                class578.method3334(4, var27);
                class96.method834(true, -2, (byte) -63, var26.field3455[0], 0, var26.method1665(1720746760), 0, var26.field3453[0], var26.method1665(1720746760));
            }
        }
        if (var6 == 1004 || var6 == 1009 || var6 == 1002 || var6 == 1001 || var6 == 1006) {
            class154.method1096(var7, var4, (byte) 96, var6);
        }
        if (var6 == 51) {
            class595.field8085 = arg3;
            class164.field1997 = 0;
            class148.field1853 = 2;
            class603.field8146++;
            class709.field9947 = arg2;
            class336 var28 = class512.method3076(class424.field5630, class591.field8030, (byte) 99);
            var28.field4150.method2369(-18090, class632.field8626 + var4);
            var28.field4150.method2408((byte) -45, class348.field4350.method216(-35, 82) ? 1 : 0);
            var28.field4150.method2376(class215.field2531, -591802824);
            var28.field4150.method2407(class351.field4370, (byte) 112);
            var28.field4150.method2422(29933, class620.field8435 + var5);
            var28.field4150.method2380((byte) -9, class520.field7344);
            var28.field4150.method2369(-18090, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class578.method3334(4, var28);
            class296.method1732(var5, true, var8, var4);
        }
        if (var6 == 18) {
            class273 var29 = (class273) class30.field444.method2121(74, (long) var7);
            if (var29 != null) {
                class164.field1997 = 0;
                class595.field8085 = arg3;
                class709.field9947 = arg2;
                class148.field1853 = 2;
                class388 var30 = var29.field3210;
                class15.field259++;
                class336 var31 = class512.method3076(class722.field10131, class591.field8030, (byte) 71);
                var31.field4150.method2422(29933, var7);
                var31.field4150.method2408((byte) -45, class348.field4350.method216(-70, 82) ? 1 : 0);
                class578.method3334(4, var31);
                class96.method834(true, -2, (byte) 0, var30.field3455[0], 0, var30.method1665(1720746760), 0, var30.field3453[0], var30.method1665(1720746760));
            }
        }
        if (var6 == 53) {
            class273 var32 = (class273) class30.field444.method2121(104, (long) var7);
            if (var32 != null) {
                class709.field9947 = arg2;
                class718.field10085++;
                class595.field8085 = arg3;
                class148.field1853 = 2;
                class164.field1997 = 0;
                class388 var33 = var32.field3210;
                class336 var34 = class512.method3076(class790.field10878, class591.field8030, (byte) 86);
                var34.field4150.method2408((byte) -45, class348.field4350.method216(-119, 82) ? 1 : 0);
                var34.field4150.method2369(-18090, var7);
                class578.method3334(4, var34);
                class96.method834(true, -2, (byte) 121, var33.field3455[0], 0, var33.method1665(1720746760), 0, var33.field3453[0], var33.method1665(1720746760));
            }
        }
        if (var6 == 20) {
            class709.field9947 = arg2;
            class151.field1889++;
            class164.field1997 = 0;
            class595.field8085 = arg3;
            class148.field1853 = 2;
            class336 var35 = class512.method3076(class737.field10287, class591.field8030, (byte) 111);
            var35.field4150.method2407(class620.field8435 + var5, (byte) 85);
            var35.field4150.method2407(var7, (byte) 81);
            var35.field4150.method2353(119, class348.field4350.method216(-71, 82) ? 1 : 0);
            var35.field4150.method2380((byte) -9, var4 + class632.field8626);
            class578.method3334(4, var35);
            class444.method2617(-56, var5, var4);
        }
        if (var6 == 60) {
            if (class637.field8741 > 0 && class348.field4350.method216(-83, 82) && class348.field4350.method216(-106, 81)) {
                class247.method1487(class632.field8626 + var4, class620.field8435 + var5, -128, class300.field3596.field808);
            } else {
                class336 var36 = class573.method3326(true, var4, var7, var5);
                if (var7 == 1) {
                    var36.field4150.method2353(126, -1);
                    var36.field4150.method2353(-73, -1);
                    var36.field4150.method2369(-18090, (int) class47.field626);
                    var36.field4150.method2353(-84, 57);
                    var36.field4150.method2353(85, class579.field7884);
                    var36.field4150.method2353(-105, class251.field2948);
                    var36.field4150.method2353(-125, 89);
                    var36.field4150.method2369(-18090, class300.field3596.field823);
                    var36.field4150.method2369(-18090, class300.field3596.field813);
                    var36.field4150.method2353(-64, 63);
                } else {
                    class709.field9947 = arg2;
                    class164.field1997 = 0;
                    class148.field1853 = 1;
                    class595.field8085 = arg3;
                }
                class578.method3334(4, var36);
                class96.method834(true, -4, (byte) 115, var5, 0, 1, 0, var4, 1);
            }
        }
        if (var6 == 52) {
            class521 var37 = class61.field825[var7];
            if (var37 != null) {
                class709.field9947 = arg2;
                class148.field1853 = 2;
                class164.field1997 = 0;
                class517.field7283++;
                class595.field8085 = arg3;
                class336 var38 = class512.method3076(class348.field4347, class591.field8030, (byte) 73);
                var38.field4150.method2397(-32403, class348.field4350.method216(-34, 82) ? 1 : 0);
                var38.field4150.method2422(29933, var7);
                class578.method3334(4, var38);
                class96.method834(true, -2, (byte) -122, var37.field3455[0], 0, var37.method1665(1720746760), 0, var37.field3453[0], var37.method1665(1720746760));
            }
        }
        if (var6 == 23) {
            class521 var39 = class61.field825[var7];
            if (var39 != null) {
                class713.field10005++;
                class164.field1997 = 0;
                class709.field9947 = arg2;
                class595.field8085 = arg3;
                class148.field1853 = 2;
                class336 var40 = class512.method3076(class222.field2585, class591.field8030, (byte) 76);
                var40.field4150.method2369(-18090, var7);
                var40.field4150.method2420(2760, class348.field4350.method216(-37, 82) ? 1 : 0);
                class578.method3334(4, var40);
                class96.method834(true, -2, (byte) -25, var39.field3455[0], 0, var39.method1665(1720746760), 0, var39.field3453[0], var39.method1665(1720746760));
            }
        }
        if (var6 == 21) {
            class521 var41 = class61.field825[var7];
            if (var41 != null) {
                class709.field9947 = arg2;
                class164.field1997 = 0;
                class713.field10005++;
                class148.field1853 = 2;
                class595.field8085 = arg3;
                class336 var42 = class512.method3076(class270.field3184, class591.field8030, (byte) 89);
                var42.field4150.method2422(29933, var7);
                var42.field4150.method2353(-123, class348.field4350.method216(-18, 82) ? 1 : 0);
                class578.method3334(4, var42);
                class96.method834(true, -2, (byte) -14, var41.field3455[0], 0, var41.method1665(1720746760), 0, var41.field3453[0], var41.method1665(1720746760));
            }
        }
        if (var6 == 47) {
            class273 var43 = (class273) class30.field444.method2121(73, (long) var7);
            if (var43 != null) {
                class439.field5869++;
                class388 var44 = var43.field3210;
                class595.field8085 = arg3;
                class709.field9947 = arg2;
                class148.field1853 = 2;
                class164.field1997 = 0;
                class336 var45 = class512.method3076(class496.field6946, class591.field8030, (byte) 118);
                var45.field4150.method2397(-32403, class348.field4350.method216(-58, 82) ? 1 : 0);
                var45.field4150.method2407(var7, (byte) -118);
                class578.method3334(4, var45);
                class96.method834(true, -2, (byte) 101, var44.field3455[0], 0, var44.method1665(1720746760), 0, var44.field3453[0], var44.method1665(1720746760));
            }
        }
        if (var6 == 19) {
            class486.field6797++;
            class595.field8085 = arg3;
            class164.field1997 = 0;
            class148.field1853 = 2;
            class709.field9947 = arg2;
            class336 var46 = class512.method3076(class159.field1972, class591.field8030, (byte) 112);
            var46.field4150.method2407(class632.field8626 + var4, (byte) -122);
            var46.field4150.method2407((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) -117);
            var46.field4150.method2353(-92, class348.field4350.method216(-118, 82) ? 1 : 0);
            var46.field4150.method2380((byte) -9, class620.field8435 + var5);
            class578.method3334(4, var46);
            class296.method1732(var5, true, var8, var4);
        }
        if (var6 == 48) {
            class273 var47 = (class273) class30.field444.method2121(94, (long) var7);
            if (var47 != null) {
                class595.field8085 = arg3;
                class164.field1997 = 0;
                class476.field6615++;
                class709.field9947 = arg2;
                class148.field1853 = 2;
                class388 var48 = var47.field3210;
                class336 var49 = class512.method3076(class761.field10520, class591.field8030, (byte) 61);
                var49.field4150.method2407(class351.field4370, (byte) 52);
                var49.field4150.method2408((byte) -45, class348.field4350.method216(-29, 82) ? 1 : 0);
                var49.field4150.method2394(class215.field2531, (byte) -125);
                var49.field4150.method2380((byte) -9, class520.field7344);
                var49.field4150.method2380((byte) -9, var7);
                class578.method3334(4, var49);
                class96.method834(true, -2, (byte) 116, var48.field3455[0], 0, var48.method1665(1720746760), 0, var48.field3453[0], var48.method1665(1720746760));
            }
        }
        if (var6 == 10) {
            class273 var50 = (class273) class30.field444.method2121(72, (long) var7);
            if (var50 != null) {
                class333.field4115++;
                class709.field9947 = arg2;
                class595.field8085 = arg3;
                class388 var51 = var50.field3210;
                class148.field1853 = 2;
                class164.field1997 = 0;
                class336 var52 = class512.method3076(class74.field1016, class591.field8030, (byte) 91);
                var52.field4150.method2422(29933, var7);
                var52.field4150.method2397(-32403, class348.field4350.method216(-124, 82) ? 1 : 0);
                class578.method3334(4, var52);
                class96.method834(true, -2, (byte) 113, var51.field3455[0], 0, var51.method1665(1720746760), 0, var51.field3453[0], var51.method1665(1720746760));
            }
        }
        if (var6 == 59) {
            class273 var53 = (class273) class30.field444.method2121(110, (long) var7);
            if (var53 != null) {
                class709.field9947 = arg2;
                class595.field8085 = arg3;
                class164.field1997 = 0;
                class657.field9055++;
                class148.field1853 = 2;
                class388 var54 = var53.field3210;
                class336 var55 = class512.method3076(class434.field5736, class591.field8030, (byte) 97);
                var55.field4150.method2408((byte) -45, class348.field4350.method216(-91, 82) ? 1 : 0);
                var55.field4150.method2369(-18090, var7);
                class578.method3334(4, var55);
                class96.method834(true, -2, (byte) -27, var54.field3455[0], 0, var54.method1665(1720746760), 0, var54.field3453[0], var54.method1665(1720746760));
            }
        }
        if (var6 == 12) {
            class521 var56 = class61.field825[var7];
            if (var56 != null) {
                class259.field3068++;
                class595.field8085 = arg3;
                class164.field1997 = 0;
                class148.field1853 = 2;
                class709.field9947 = arg2;
                class336 var57 = class512.method3076(class435.field5742, class591.field8030, (byte) 113);
                var57.field4150.method2420(2760, class348.field4350.method216(-70, 82) ? 1 : 0);
                var57.field4150.method2369(-18090, var7);
                class578.method3334(4, var57);
                class96.method834(true, -2, (byte) -120, var56.field3455[0], 0, var56.method1665(1720746760), 0, var56.field3453[0], var56.method1665(1720746760));
            }
        }
        if (var6 == 1012) {
            class709.field9947 = arg2;
            class148.field1853 = 2;
            class385.field4918++;
            class595.field8085 = arg3;
            class164.field1997 = 0;
            class336 var58 = class512.method3076(class352.field4377, class591.field8030, (byte) 102);
            var58.field4150.method2369(-18090, var7);
            class578.method3334(4, var58);
        }
        if (var6 == 49 || var6 == 1003) {
            class576.method3331(-8, var4, var5, arg0.field1028, var7);
        }
        if (var6 == 22) {
            class595.field8085 = arg3;
            class148.field1853 = 2;
            class709.field9947 = arg2;
            class388.field4997++;
            class164.field1997 = 0;
            class336 var59 = class512.method3076(class209.field2483, class591.field8030, (byte) 67);
            var59.field4150.method2353(85, class348.field4350.method216(-26, 82) ? 1 : 0);
            var59.field4150.method2422(29933, class632.field8626 + var4);
            var59.field4150.method2407(var7, (byte) -93);
            var59.field4150.method2369(-18090, class620.field8435 + var5);
            class578.method3334(4, var59);
            class444.method2617(125, var5, var4);
        }
        if (var6 == 17 && class683.field9354 == null) {
            class666.method3742(var4, (byte) 125, var5);
            class683.field9354 = class481.method2859(var4, var5, 16383);
            class576.method3330(class683.field9354, -1);
        }
        if (var6 == 15) {
            class164.field1997 = 0;
            class709.field9947 = arg2;
            class148.field1853 = 2;
            class595.field8085 = arg3;
            class580.field7892++;
            class336 var60 = class512.method3076(class338.field4184, class591.field8030, (byte) 123);
            var60.field4150.method2369(-18090, class620.field8435 + var5);
            var60.field4150.method2422(29933, var7);
            var60.field4150.method2420(2760, class348.field4350.method216(-106, 82) ? 1 : 0);
            var60.field4150.method2407(var4 + class632.field8626, (byte) 83);
            class578.method3334(4, var60);
            class444.method2617(-103, var5, var4);
        }
        int var61 = 8 / ((-arg1 - 47) / 45);
        if (var6 == 45) {
            class620 var62 = class481.method2859(var4, var5, 16383);
            if (var62 != null) {
                class118.method926(-109);
                class396 var63 = client.method1882(var62);
                class541.method3204(1, var63.field5125, var63.method2321(-88), var62);
                class535.field7539 = class215.method1343(var62, 0);
                if (class535.field7539 == null) {
                    class535.field7539 = "Null";
                }
                class481.field6718 = var62.field8429 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 1010) {
            class595.field8085 = arg3;
            class164.field1997 = 0;
            class709.field9947 = arg2;
            class148.field1853 = 2;
            class273 var64 = (class273) class30.field444.method2121(79, (long) var7);
            if (var64 != null) {
                class388 var65 = var64.field3210;
                class479 var66 = var65.field5003;
                if (var66.field6636 != null) {
                    var66 = var66.method2843(class2.field30, 228);
                }
                if (var66 != null) {
                    class742.field10337++;
                    class336 var67 = class512.method3076(class749.field10400, class591.field8030, (byte) 84);
                    var67.field4150.method2369(-18090, var66.field6680);
                    class578.method3334(4, var67);
                }
            }
        }
        if (var6 == 1007) {
            class595.field8085 = arg3;
            class164.field1997 = 0;
            class25.field379++;
            class709.field9947 = arg2;
            class148.field1853 = 2;
            class336 var68 = class512.method3076(class266.field3141, class591.field8030, (byte) 104);
            var68.field4150.method2422(29933, class620.field8435 + var5);
            var68.field4150.method2380((byte) -9, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var68.field4150.method2369(-18090, class632.field8626 + var4);
            var68.field4150.method2397(-32403, class348.field4350.method216(-80, 82) ? 1 : 0);
            class578.method3334(4, var68);
            class296.method1732(var5, true, var8, var4);
        }
        if (var6 == 8) {
            class709.field9947 = arg2;
            class148.field1853 = 1;
            class512.field7238++;
            class595.field8085 = arg3;
            class164.field1997 = 0;
            class336 var69 = class512.method3076(class415.field5431, class591.field8030, (byte) 105);
            var69.field4150.method2380((byte) -9, class620.field8435 + var5);
            var69.field4150.method2407(class351.field4370, (byte) -103);
            var69.field4150.method2369(-18090, class632.field8626 + var4);
            var69.field4150.method2369(-18090, class520.field7344);
            var69.field4150.method2376(class215.field2531, -591802824);
            class578.method3334(4, var69);
            class96.method834(true, -4, (byte) 107, var5, 0, 1, 0, var4, 1);
        }
        if (var6 == 46) {
            class521 var70 = class61.field825[var7];
            if (var70 != null) {
                class595.field8085 = arg3;
                class709.field9947 = arg2;
                class148.field1848++;
                class148.field1853 = 2;
                class164.field1997 = 0;
                class336 var71 = class512.method3076(class785.field10835, class591.field8030, (byte) 117);
                var71.field4150.method2353(-122, class348.field4350.method216(-104, 82) ? 1 : 0);
                var71.field4150.method2380((byte) -9, var7);
                class578.method3334(4, var71);
                class96.method834(true, -2, (byte) -3, var70.field3455[0], 0, var70.method1665(1720746760), 0, var70.field3453[0], var70.method1665(1720746760));
            }
        }
        if (var6 == 3) {
            class164.field1997 = 0;
            class595.field8085 = arg3;
            class709.field9947 = arg2;
            class122.field1567++;
            class148.field1853 = 2;
            class336 var72 = class512.method3076(class370.field4602, class591.field8030, (byte) 61);
            var72.field4150.method2407(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -112);
            var72.field4150.method2407(var5 + class620.field8435, (byte) -106);
            var72.field4150.method2369(-18090, class632.field8626 + var4);
            var72.field4150.method2353(107, class348.field4350.method216(-85, 82) ? 1 : 0);
            class578.method3334(4, var72);
            class296.method1732(var5, true, var8, var4);
        }
        if (var6 == 13) {
            class521 var73 = class61.field825[var7];
            if (var73 != null) {
                class148.field1853 = 2;
                class152.field1901++;
                class595.field8085 = arg3;
                class709.field9947 = arg2;
                class164.field1997 = 0;
                class336 var74 = class512.method3076(class23.field361, class591.field8030, (byte) 119);
                var74.field4150.method2422(29933, var7);
                var74.field4150.method2397(-32403, class348.field4350.method216(-89, 82) ? 1 : 0);
                class578.method3334(4, var74);
                class96.method834(true, -2, (byte) 116, var73.field3455[0], 0, var73.method1665(1720746760), 0, var73.field3453[0], var73.method1665(1720746760));
            }
        }
        if (var6 == 5) {
            class620 var75 = class481.method2859(var4, var5, 16383);
            if (var75 != null) {
                class198.method1291(128, var75);
            }
        }
        if (class104.field1336) {
            class118.method926(-69);
        }
        if (class346.field4334 != null && class680.field9316 == 0) {
            class576.method3330(class346.field4334, -1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILes;I)V", line = 879)
    private final void method4201(int arg0, class403 arg1, int arg2) {
        if (arg2 == 1) {
            this.field10432 = arg1.method2390((byte) -117);
        } else if (arg2 == 2) {
            this.field10436 = arg1.method2358(89);
        } else if (arg2 == 3) {
            this.field10433 = true;
        } else if (arg2 == 4) {
            this.field10432 = -1;
        }
        if (arg0 <= 13) {
            method4202(false, (byte) 101);
        }
        field10430++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZB)V", line = 907)
    public static final void method4202(boolean arg0, byte arg1) {
        field10428++;
        if (class569.field7802.length() == 0) {
            return;
        }
        class793.method4374(0, "--> " + class569.field7802);
        class433.method2566(arg0, -87, false, class569.field7802);
        if (arg1 <= 79) {
            field10434 = null;
        }
        class163.field1993 = 0;
        class569.field7802 = "";
        class73.field1012 = 0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 929)
    public static void method4203(boolean arg0) {
        if (arg0) {
            field10434 = null;
        }
        field10434 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lha;ZII)Ltf;", line = 940)
    public final class312 method4204(class66 arg0, boolean arg1, int arg2, int arg3) {
        field10435++;
        long var5 = (long) (this.field10432 | arg2 << 16 | (arg1 ? 262144 : 0) | arg0.field904 << 19);
        class312 var7 = (class312) this.field10425.field3516.method1684(var5, arg3 ^ 0xFFFFFE99);
        if (var7 != null) {
            return var7;
        } else if (this.field10425.field3515.method433((byte) -80, this.field10432)) {
            class600 var8 = class600.method3429(this.field10425.field3515, this.field10432, arg3);
            if (var8 != null) {
                var8.field8117 = var8.field8118 = var8.field8121 = var8.field8124 = 0;
                if (arg1) {
                    var8.method3432();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method3428();
                }
            }
            class312 var10 = arg0.method640(var8, true);
            if (var10 != null) {
                this.field10425.field3516.method1686(arg3 ^ 0xFFFF9BDA, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)Z", line = 987)
    public final boolean method4205(byte arg0) {
        field10427++;
        return arg0 < 39 ? false : this.field10425.field3515.method433((byte) -76, this.field10432);
    }
}
