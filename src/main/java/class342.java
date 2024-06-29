import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class342 {

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "[I")
    public static int[] field4579 = new int[14];

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "Leba;")
    public static class550 field4580 = new class550(107, 8);

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "I")
    public static int field4582 = 0;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "Lwv;")
    public static class423 field4584 = null;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "Lvh;")
    public class265 field4583;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "Laga;")
    public static class658 field4578;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V", line = 10)
    public static void method1987(int arg0) {
        field4578 = null;
        field4579 = null;
        if (arg0 == -8784) {
            field4580 = null;
            field4584 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILkr;II)V", line = 26)
    public static final void method1988(int arg0, class354 arg1, int arg2, int arg3) {
        field4581++;
        if (arg1 == null || class101.field1211.field5887 == arg1 || arg3 >= -122) {
            return;
        }
        int var4 = arg1.field4722;
        int var5 = arg1.field4725;
        int var6 = arg1.field4729;
        int var7 = (int) arg1.field4723;
        long var8 = arg1.field4723;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 20) {
            class328.field4411 = 0;
            class242.field3184 = arg0;
            class646.field8933 = 1;
            class323.field4359 = arg2;
            class189.field2623++;
            class229 var10 = class97.method550(class71.field841, false, class100.field1204);
            var10.field2971.method946((byte) -77, class369.field4847);
            var10.field2971.method921(class4.field23 + var5, 112);
            var10.field2971.method918(24551, class390.field5225);
            var10.field2971.method939(class125.field1745 + var4, (byte) 58);
            var10.field2971.method958(0, class351.field4679);
            class307.method1805(var10, -14704);
            class134.method776(1, 0, var4, -111, true, 0, -4, var5, 1);
        }
        if (var6 == 44) {
            class573 var11 = class513.field7145[var7];
            if (var11 != null) {
                class323.field4359 = arg2;
                class35.field490++;
                class328.field4411 = 0;
                class242.field3184 = arg0;
                class646.field8933 = 2;
                class229 var12 = class97.method550(class71.field841, false, class398.field5283);
                var12.field2971.method939(var7, (byte) 114);
                var12.field2971.method959((byte) -32, class643.field8914.method2106((byte) -118, 82) ? 1 : 0);
                class307.method1805(var12, -14704);
                class134.method776(var11.method1435((byte) 80), 0, var11.field3088[0], -101, true, 0, -2, var11.field3086[0], var11.method1435((byte) 124));
            }
        }
        if (var6 == 15) {
            class242.field3184 = arg0;
            class646.field8933 = 2;
            class589.field8129++;
            class323.field4359 = arg2;
            class328.field4411 = 0;
            class229 var13 = class97.method550(class71.field841, false, class663.field9445);
            var13.field2971.method959((byte) -32, class643.field8914.method2106((byte) -119, 82) ? 1 : 0);
            var13.field2971.method946((byte) -77, var5 + class4.field23);
            var13.field2971.method939((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 33);
            var13.field2971.method946((byte) -77, class125.field1745 + var4);
            class307.method1805(var13, -14704);
            class688.method3891(var8, -481834194, var5, var4);
        }
        if (var6 == 4) {
            class328.field4411 = 0;
            class323.field4359 = arg2;
            class242.field3184 = arg0;
            class399.field5288++;
            class646.field8933 = 2;
            class229 var14 = class97.method550(class71.field841, false, class326.field4392);
            var14.field2971.method959((byte) -32, class643.field8914.method2106((byte) -128, 82) ? 1 : 0);
            var14.field2971.method918(24551, class4.field23 + var5);
            var14.field2971.method921((int) (var8 >>> 32) & Integer.MAX_VALUE, 60);
            var14.field2971.method921(class125.field1745 + var4, 111);
            class307.method1805(var14, -14704);
            class688.method3891(var8, -481834194, var5, var4);
        }
        if (var6 == 11) {
            class323.field4359 = arg2;
            class328.field4411 = 0;
            class110.field1290++;
            class242.field3184 = arg0;
            class646.field8933 = 2;
            class229 var15 = class97.method550(class71.field841, false, class252.field3306);
            var15.field2971.method921(var7, 66);
            var15.field2971.method914(5, class643.field8914.method2106((byte) -107, 82) ? 1 : 0);
            var15.field2971.method921(class4.field23 + var5, 125);
            var15.field2971.method921(class125.field1745 + var4, -119);
            class307.method1805(var15, -14704);
            class441.method2491(var4, 0, var5);
        }
        if (var6 == 22) {
            class573 var16 = class513.field7145[var7];
            if (var16 != null) {
                class226.field2938++;
                class328.field4411 = 0;
                class646.field8933 = 2;
                class323.field4359 = arg2;
                class242.field3184 = arg0;
                class229 var17 = class97.method550(class71.field841, false, class19.field243);
                var17.field2971.method946((byte) -77, class390.field5225);
                var17.field2971.method914(5, class643.field8914.method2106((byte) -123, 82) ? 1 : 0);
                var17.field2971.method939(class369.field4847, (byte) 101);
                var17.field2971.method946((byte) -77, var7);
                var17.field2971.method957(-18807, class351.field4679);
                class307.method1805(var17, -14704);
                class134.method776(var16.method1435((byte) 95), 0, var16.field3088[0], -23, true, 0, -2, var16.field3086[0], var16.method1435((byte) 99));
            }
        }
        if (var6 == 1004 || var6 == 1012 || var6 == 1002 || var6 == 1009 || var6 == 1008) {
            class311.method1829(var4, var6, (byte) 49, var7);
        }
        if (var6 == 19) {
            class407 var18 = (class407) class296.field3921.method3057(1, (long) var7);
            if (var18 != null) {
                class242.field3184 = arg0;
                class323.field4359 = arg2;
                class328.field4411 = 0;
                class347.field4630++;
                class646.field8933 = 2;
                class351 var19 = var18.field5354;
                class229 var20 = class97.method550(class71.field841, false, class121.field1579);
                var20.field2971.method950((byte) 126, class643.field8914.method2106((byte) -128, 82) ? 1 : 0);
                var20.field2971.method916(124, class351.field4679);
                var20.field2971.method918(24551, class369.field4847);
                var20.field2971.method946((byte) -77, var7);
                var20.field2971.method921(class390.field5225, -102);
                class307.method1805(var20, -14704);
                class134.method776(var19.method1435((byte) 105), 0, var19.field3088[0], -52, true, 0, -2, var19.field3086[0], var19.method1435((byte) 70));
            }
        }
        if (var6 == 2) {
            class423 var21 = class546.method3064(-28, var5, var4);
            if (var21 != null) {
                class9.method51(var21, -120);
            }
        }
        if (var6 == 50 || var6 == 1001) {
            class495.method2822(var5, var4, arg1.field4724, var7, 31868);
        }
        if (var6 == 10) {
            class573 var22 = class513.field7145[var7];
            if (var22 != null) {
                class323.field4359 = arg2;
                class680.field9649++;
                class646.field8933 = 2;
                class328.field4411 = 0;
                class242.field3184 = arg0;
                class229 var23 = class97.method550(class71.field841, false, class199.field2700);
                var23.field2971.method959((byte) -32, class643.field8914.method2106((byte) -115, 82) ? 1 : 0);
                var23.field2971.method946((byte) -77, var7);
                class307.method1805(var23, -14704);
                class134.method776(var22.method1435((byte) 97), 0, var22.field3088[0], -60, true, 0, -2, var22.field3086[0], var22.method1435((byte) 66));
            }
        }
        if (var6 == 25) {
            if (class121.field1585 > 0 && class643.field8914.method2106((byte) -121, 82) && class643.field8914.method2106((byte) -128, 81)) {
                class242.method1491(class408.field5369.field385, class125.field1745 + var4, (byte) -109, class4.field23 + var5);
            } else {
                class323.field4359 = arg2;
                class242.field3184 = arg0;
                class493.field6797++;
                class328.field4411 = 0;
                class646.field8933 = 1;
                class229 var24 = class97.method550(class71.field841, false, class681.field9677);
                var24.field2971.method946((byte) -77, class125.field1745 + var4);
                var24.field2971.method918(24551, class4.field23 + var5);
                class307.method1805(var24, -14704);
            }
        }
        if (var6 == 23) {
            class323.field4359 = arg2;
            class34.field469++;
            class328.field4411 = 0;
            class646.field8933 = 2;
            class242.field3184 = arg0;
            class229 var25 = class97.method550(class71.field841, false, class674.field9591);
            var25.field2971.method918(24551, var4 + class125.field1745);
            var25.field2971.method918(24551, class4.field23 + var5);
            var25.field2971.method959((byte) -32, class643.field8914.method2106((byte) -121, 82) ? 1 : 0);
            var25.field2971.method918(24551, var7);
            class307.method1805(var25, -14704);
            class441.method2491(var4, 0, var5);
        }
        if (var6 == 45) {
            class548.field7496++;
            class323.field4359 = arg2;
            class242.field3184 = arg0;
            class646.field8933 = 2;
            class328.field4411 = 0;
            class229 var26 = class97.method550(class71.field841, false, class6.field64);
            var26.field2971.method939(class125.field1745 + var4, (byte) 46);
            var26.field2971.method946((byte) -77, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var26.field2971.method959((byte) -32, class643.field8914.method2106((byte) -117, 82) ? 1 : 0);
            var26.field2971.method939(class4.field23 + var5, (byte) 50);
            class307.method1805(var26, -14704);
            class688.method3891(var8, -481834194, var5, var4);
        }
        if (var6 == 6) {
            class328.field4411 = 0;
            class646.field8933 = 2;
            class242.field3184 = arg0;
            class323.field4359 = arg2;
            class550.field7517++;
            class229 var27 = class97.method550(class71.field841, false, class626.field8671);
            var27.field2971.method939(var5 + class4.field23, (byte) 126);
            var27.field2971.method914(5, class643.field8914.method2106((byte) -110, 82) ? 1 : 0);
            var27.field2971.method946((byte) -77, var7);
            var27.field2971.method939(class125.field1745 + var4, (byte) 75);
            class307.method1805(var27, -14704);
            class441.method2491(var4, 0, var5);
        }
        if (var6 == 3) {
            class573 var28 = class513.field7145[var7];
            if (var28 != null) {
                class328.field4411 = 0;
                class657.field9357++;
                class323.field4359 = arg2;
                class242.field3184 = arg0;
                class646.field8933 = 2;
                class229 var29 = class97.method550(class71.field841, false, class413.field5416);
                var29.field2971.method918(24551, var7);
                var29.field2971.method950((byte) -87, class643.field8914.method2106((byte) -119, 82) ? 1 : 0);
                class307.method1805(var29, -14704);
                class134.method776(var28.method1435((byte) 120), 0, var28.field3088[0], -112, true, 0, -2, var28.field3086[0], var28.method1435((byte) 116));
            }
        }
        if (var6 == 57) {
            class323.field4359 = arg2;
            class328.field4411 = 0;
            class226.field2938++;
            class646.field8933 = 2;
            class242.field3184 = arg0;
            class229 var30 = class97.method550(class71.field841, false, class19.field243);
            var30.field2971.method946((byte) -77, class390.field5225);
            var30.field2971.method914(5, class643.field8914.method2106((byte) -108, 82) ? 1 : 0);
            var30.field2971.method939(class369.field4847, (byte) 100);
            var30.field2971.method946((byte) -77, class408.field5369.field3010);
            var30.field2971.method957(-18807, class351.field4679);
            class307.method1805(var30, -14704);
        }
        if (var6 == 1010) {
            class646.field8933 = 2;
            class323.field4359 = arg2;
            class242.field3184 = arg0;
            class328.field4411 = 0;
            class407 var31 = (class407) class296.field3921.method3057(1, (long) var7);
            if (var31 != null) {
                class351 var32 = var31.field5354;
                class384 var33 = var32.field4671;
                if (var33.field5121 != null) {
                    var33 = var33.method2203(3, class564.field7696);
                }
                if (var33 != null) {
                    class218.field2860++;
                    class229 var34 = class97.method550(class71.field841, false, class410.field5395);
                    var34.field2971.method918(24551, var33.field5115);
                    class307.method1805(var34, -14704);
                }
            }
        }
        if (var6 == 16) {
            class573 var35 = class513.field7145[var7];
            if (var35 != null) {
                class328.field4411 = 0;
                class242.field3184 = arg0;
                class323.field4359 = arg2;
                class131.field1825++;
                class646.field8933 = 2;
                class229 var36 = class97.method550(class71.field841, false, class24.field289);
                var36.field2971.method959((byte) -32, class643.field8914.method2106((byte) -116, 82) ? 1 : 0);
                var36.field2971.method918(24551, var7);
                class307.method1805(var36, -14704);
                class134.method776(var35.method1435((byte) 112), 0, var35.field3088[0], -101, true, 0, -2, var35.field3086[0], var35.method1435((byte) 118));
            }
        }
        if (var6 == 21) {
            class646.field8933 = 2;
            class242.field3184 = arg0;
            class323.field4359 = arg2;
            class121.field1586++;
            class328.field4411 = 0;
            class229 var37 = class97.method550(class71.field841, false, class326.field4391);
            var37.field2971.method946((byte) -77, class4.field23 + var5);
            var37.field2971.method946((byte) -77, class125.field1745 + var4);
            var37.field2971.method939((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 118);
            var37.field2971.method915(-31914, class643.field8914.method2106((byte) -127, 82) ? 1 : 0);
            class307.method1805(var37, -14704);
            class688.method3891(var8, -481834194, var5, var4);
        }
        if (var6 == 30) {
            class573 var38 = class513.field7145[var7];
            if (var38 != null) {
                class646.field8933 = 2;
                class242.field3184 = arg0;
                class323.field4359 = arg2;
                class328.field4411 = 0;
                class206.field2754++;
                class229 var39 = class97.method550(class71.field841, false, class375.field4973);
                var39.field2971.method918(24551, var7);
                var39.field2971.method950((byte) -67, class643.field8914.method2106((byte) -128, 82) ? 1 : 0);
                class307.method1805(var39, -14704);
                class134.method776(var38.method1435((byte) 85), 0, var38.field3088[0], -107, true, 0, -2, var38.field3086[0], var38.method1435((byte) 118));
            }
        }
        if (var6 == 1011) {
            class646.field8933 = 2;
            class242.field3184 = arg0;
            class323.field4359 = arg2;
            class80.field936++;
            class328.field4411 = 0;
            class229 var40 = class97.method550(class71.field841, false, class258.field3372);
            var40.field2971.method918(24551, var7);
            class307.method1805(var40, -14704);
        }
        if (var6 == 18) {
            class551.field7519++;
            class242.field3184 = arg0;
            class323.field4359 = arg2;
            class646.field8933 = 2;
            class328.field4411 = 0;
            class229 var41 = class97.method550(class71.field841, false, class294.field3903);
            var41.field2971.method939(var5 + class4.field23, (byte) 40);
            var41.field2971.method946((byte) -77, class369.field4847);
            var41.field2971.method914(5, class643.field8914.method2106((byte) -105, 82) ? 1 : 0);
            var41.field2971.method937(class351.field4679, -1972311984);
            var41.field2971.method946((byte) -77, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            var41.field2971.method918(24551, class125.field1745 + var4);
            var41.field2971.method921(class390.field5225, 98);
            class307.method1805(var41, -14704);
            class688.method3891(var8, -481834194, var5, var4);
        }
        if (var6 == 17) {
            class407 var42 = (class407) class296.field3921.method3057(1, (long) var7);
            if (var42 != null) {
                class351 var43 = var42.field5354;
                class513.field7142++;
                class323.field4359 = arg2;
                class242.field3184 = arg0;
                class646.field8933 = 2;
                class328.field4411 = 0;
                class229 var44 = class97.method550(class71.field841, false, class493.field6805);
                var44.field2971.method950((byte) -107, class643.field8914.method2106((byte) -107, 82) ? 1 : 0);
                var44.field2971.method939(var7, (byte) 98);
                class307.method1805(var44, -14704);
                class134.method776(var43.method1435((byte) 106), 0, var43.field3088[0], -126, true, 0, -2, var43.field3086[0], var43.method1435((byte) 124));
            }
        }
        if (var6 == 46) {
            class323.field4359 = arg2;
            class242.field3184 = arg0;
            class425.field5726++;
            class328.field4411 = 0;
            class646.field8933 = 2;
            class229 var45 = class97.method550(class71.field841, false, class692.field9754);
            var45.field2971.method959((byte) -32, class643.field8914.method2106((byte) -115, 82) ? 1 : 0);
            var45.field2971.method918(24551, class4.field23 + var5);
            var45.field2971.method946((byte) -77, var4 + class125.field1745);
            var45.field2971.method946((byte) -77, var7);
            class307.method1805(var45, -14704);
            class441.method2491(var4, 0, var5);
        }
        if (var6 == 49) {
            class407 var46 = (class407) class296.field3921.method3057(1, (long) var7);
            if (var46 != null) {
                class328.field4411 = 0;
                class242.field3184 = arg0;
                class538.field7379++;
                class351 var47 = var46.field5354;
                class646.field8933 = 2;
                class323.field4359 = arg2;
                class229 var48 = class97.method550(class71.field841, false, class83.field1000);
                var48.field2971.method939(var7, (byte) 125);
                var48.field2971.method959((byte) -32, class643.field8914.method2106((byte) -119, 82) ? 1 : 0);
                class307.method1805(var48, -14704);
                class134.method776(var47.method1435((byte) 103), 0, var47.field3088[0], -63, true, 0, -2, var47.field3086[0], var47.method1435((byte) 72));
            }
        }
        if (var6 == 60) {
            class423 var49 = class546.method3064(-99, var5, var4);
            if (var49 != null) {
                class364.method2122((byte) 3);
                class5 var50 = client.method3858(var49);
                class315.method1840(var50.method37((byte) 96), 0, var49, var50.field52);
                class418.field5499 = class159.method986(6874, var49);
                class209.field2788 = var49.field5653 + "<col=ffffff>";
                if (class418.field5499 == null) {
                    class418.field5499 = "Null";
                }
            }
            return;
        }
        if (var6 == 13) {
            class573 var51 = class513.field7145[var7];
            if (var51 != null) {
                class646.field8933 = 2;
                class323.field4359 = arg2;
                class242.field3184 = arg0;
                class89.field1073++;
                class328.field4411 = 0;
                class229 var52 = class97.method550(class71.field841, false, class634.field8769);
                var52.field2971.method939(var7, (byte) 56);
                var52.field2971.method959((byte) -32, class643.field8914.method2106((byte) -109, 82) ? 1 : 0);
                class307.method1805(var52, -14704);
                class134.method776(var51.method1435((byte) 105), 0, var51.field3088[0], -85, true, 0, -2, var51.field3086[0], var51.method1435((byte) 107));
            }
        }
        if (var6 == 1006) {
            class681.field9664++;
            class328.field4411 = 0;
            class323.field4359 = arg2;
            class646.field8933 = 2;
            class242.field3184 = arg0;
            class229 var53 = class97.method550(class71.field841, false, class445.field5886);
            var53.field2971.method918(24551, var7);
            class307.method1805(var53, -14704);
        }
        if (var6 == 59) {
            class323.field4359 = arg2;
            class596.field8214++;
            class242.field3184 = arg0;
            class328.field4411 = 0;
            class646.field8933 = 2;
            class229 var54 = class97.method550(class71.field841, false, class354.field4717);
            var54.field2971.method939(class390.field5225, (byte) 105);
            var54.field2971.method946((byte) -77, class125.field1745 + var4);
            var54.field2971.method915(-31914, class643.field8914.method2106((byte) -105, 82) ? 1 : 0);
            var54.field2971.method916(-100, class351.field4679);
            var54.field2971.method921(var7, 57);
            var54.field2971.method921(var5 + class4.field23, 64);
            var54.field2971.method918(24551, class369.field4847);
            class307.method1805(var54, -14704);
            class441.method2491(var4, 0, var5);
        }
        if (var6 == 1003) {
            class242.field3184 = arg0;
            class593.field8188++;
            class646.field8933 = 2;
            class328.field4411 = 0;
            class323.field4359 = arg2;
            class229 var55 = class97.method550(class71.field841, false, class545.field7449);
            var55.field2971.method914(5, class643.field8914.method2106((byte) -127, 82) ? 1 : 0);
            var55.field2971.method921(class4.field23 + var5, -65);
            var55.field2971.method921(class125.field1745 + var4, 91);
            var55.field2971.method921((int) (var8 >>> 32) & Integer.MAX_VALUE, 71);
            class307.method1805(var55, -14704);
            class688.method3891(var8, -481834194, var5, var4);
        }
        if (var6 == 9) {
            class573 var56 = class513.field7145[var7];
            if (var56 != null) {
                class242.field3184 = arg0;
                class646.field8933 = 2;
                class323.field4359 = arg2;
                class221.field2875++;
                class328.field4411 = 0;
                class229 var57 = class97.method550(class71.field841, false, class273.field3636);
                var57.field2971.method921(var7, -122);
                var57.field2971.method950((byte) 74, class643.field8914.method2106((byte) -122, 82) ? 1 : 0);
                class307.method1805(var57, -14704);
                class134.method776(var56.method1435((byte) 68), 0, var56.field3088[0], -65, true, 0, -2, var56.field3086[0], var56.method1435((byte) 84));
            }
        }
        if (var6 == 58) {
            class407 var58 = (class407) class296.field3921.method3057(1, (long) var7);
            if (var58 != null) {
                class351 var59 = var58.field5354;
                class328.field4411 = 0;
                class323.field4359 = arg2;
                class465.field6089++;
                class242.field3184 = arg0;
                class646.field8933 = 2;
                class229 var60 = class97.method550(class71.field841, false, class133.field1845);
                var60.field2971.method914(5, class643.field8914.method2106((byte) -127, 82) ? 1 : 0);
                var60.field2971.method918(24551, var7);
                class307.method1805(var60, -14704);
                class134.method776(var59.method1435((byte) 85), 0, var59.field3088[0], -106, true, 0, -2, var59.field3086[0], var59.method1435((byte) 109));
            }
        }
        if (var6 == 48 && class495.field6823 == null) {
            class615.method3400((byte) -116, var5, var4);
            class495.field6823 = class546.method3064(2, var5, var4);
            class552.method3091(class495.field6823, 12618);
        }
        if (var6 == 5) {
            class573 var61 = class513.field7145[var7];
            if (var61 != null) {
                class646.field8933 = 2;
                class242.field3184 = arg0;
                class328.field4411 = 0;
                class333.field4484++;
                class323.field4359 = arg2;
                class229 var62 = class97.method550(class71.field841, false, class154.field2170);
                var62.field2971.method915(-31914, class643.field8914.method2106((byte) -115, 82) ? 1 : 0);
                var62.field2971.method918(24551, var7);
                class307.method1805(var62, -14704);
                class134.method776(var61.method1435((byte) 76), 0, var61.field3088[0], -120, true, 0, -2, var61.field3086[0], var61.method1435((byte) 86));
            }
        }
        if (var6 == 8) {
            class646.field8933 = 2;
            class328.field4411 = 0;
            class242.field3184 = arg0;
            class551.field7522++;
            class323.field4359 = arg2;
            class229 var63 = class97.method550(class71.field841, false, class628.field8686);
            var63.field2971.method914(5, class643.field8914.method2106((byte) -125, 82) ? 1 : 0);
            var63.field2971.method946((byte) -77, class4.field23 + var5);
            var63.field2971.method918(24551, var7);
            var63.field2971.method918(24551, class125.field1745 + var4);
            class307.method1805(var63, -14704);
            class441.method2491(var4, 0, var5);
        }
        if (var6 == 47) {
            class407 var64 = (class407) class296.field3921.method3057(1, (long) var7);
            if (var64 != null) {
                class344.field4615++;
                class351 var65 = var64.field5354;
                class242.field3184 = arg0;
                class646.field8933 = 2;
                class323.field4359 = arg2;
                class328.field4411 = 0;
                class229 var66 = class97.method550(class71.field841, false, class645.field8925);
                var66.field2971.method921(var7, -85);
                var66.field2971.method950((byte) -73, class643.field8914.method2106((byte) -119, 82) ? 1 : 0);
                class307.method1805(var66, -14704);
                class134.method776(var65.method1435((byte) 102), 0, var65.field3088[0], -71, true, 0, -2, var65.field3086[0], var65.method1435((byte) 114));
            }
        }
        if (var6 == 51) {
            class407 var67 = (class407) class296.field3921.method3057(1, (long) var7);
            if (var67 != null) {
                class565.field7705++;
                class328.field4411 = 0;
                class351 var68 = var67.field5354;
                class242.field3184 = arg0;
                class646.field8933 = 2;
                class323.field4359 = arg2;
                class229 var69 = class97.method550(class71.field841, false, class30.field428);
                var69.field2971.method915(-31914, class643.field8914.method2106((byte) -117, 82) ? 1 : 0);
                var69.field2971.method946((byte) -77, var7);
                class307.method1805(var69, -14704);
                class134.method776(var68.method1435((byte) 80), 0, var68.field3088[0], -25, true, 0, -2, var68.field3086[0], var68.method1435((byte) 71));
            }
        }
        if (var6 == 12) {
            if (class121.field1585 > 0 && class643.field8914.method2106((byte) -105, 82) && class643.field8914.method2106((byte) -122, 81)) {
                class242.method1491(class408.field5369.field385, class125.field1745 + var4, (byte) -69, class4.field23 + var5);
            } else {
                class229 var70 = class675.method3842((byte) -103, var7, var4, var5);
                if (var7 == 1) {
                    var70.field2971.method915(-31914, -1);
                    var70.field2971.method915(-31914, -1);
                    var70.field2971.method918(24551, (int) class565.field7707);
                    var70.field2971.method915(-31914, 57);
                    var70.field2971.method915(-31914, class478.field6651);
                    var70.field2971.method915(-31914, class424.field5716);
                    var70.field2971.method915(-31914, 89);
                    var70.field2971.method918(24551, class408.field5369.field398);
                    var70.field2971.method918(24551, class408.field5369.field397);
                    var70.field2971.method915(-31914, 63);
                } else {
                    class242.field3184 = arg0;
                    class323.field4359 = arg2;
                    class646.field8933 = 1;
                    class328.field4411 = 0;
                }
                class307.method1805(var70, -14704);
                class134.method776(1, 0, var4, -53, true, 0, -4, var5, 1);
            }
        }
        if (class38.field507) {
            class364.method2122((byte) 3);
        }
        if (class455.field5989 != null && class34.field488 == 0) {
            class552.method3091(class455.field5989, 12618);
        }
    }
}
