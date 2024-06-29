import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class576 {

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public int field7322;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "[Z")
    public static boolean[] field7318 = new boolean[100];

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Z")
    public static boolean field7321 = false;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "[I")
    public static int[] field7317 = new int[500];

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "[[I")
    public static int[][] field7315 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "Lha;")
    public static class570 field7320;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBILvba;)V")
    public static final void method3097(int arg0, byte arg1, int arg2, class765 arg3) {
        field7323++;
        if (arg3 == null || class595.field7563.field8613 == arg3) {
            return;
        }
        int var4 = arg3.field10413;
        int var5 = arg3.field10402;
        int var6 = arg3.field10412;
        int var7 = (int) arg3.field10404;
        long var8 = arg3.field10404;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 44) {
            class232 var10 = (class232) class444.field5811.method2616((long) var7, (byte) -106);
            if (var10 != null) {
                class727 var11 = var10.field3125;
                class214.field2926++;
                class357.field4365 = arg2;
                class244.field3357 = 0;
                class793.field10872 = 2;
                class332.field4066 = arg0;
                class13 var12 = class659.method3587(class68.field909, 98, class316.field3938);
                var12.field130.method1521(class358.field4377, true);
                var12.field130.method1521(class777.field10600, true);
                var12.field130.method1502(var7, 65280);
                var12.field130.method1515(false, class170.field2260);
                var12.field130.method1493(class679.field8781.method271((byte) 116, 82) ? 1 : 0, (byte) 14);
                class116.method679(var12, 0);
                class11.method48(-68, var11.field4758[0], 0, var11.field4767[0], var11.method190((byte) 117), -2, 0, var11.method190((byte) 100), true);
            }
        }
        if (var6 == 8) {
            class793.field10872 = 2;
            class357.field4365 = arg2;
            class332.field4066 = arg0;
            class244.field3357 = 0;
            class345.field4222++;
            class13 var13 = class659.method3587(class68.field909, 98, class443.field5808);
            var13.field130.method1543(class679.field8781.method271((byte) 126, 82) ? 1 : 0, 79);
            var13.field130.method1521(var7, true);
            var13.field130.method1507(-531697592, class714.field9407 + var4);
            var13.field130.method1502(class240.field3293 + var5, 65280);
            class116.method679(var13, 0);
            class506.method2802(var4, var5, (byte) 101);
        }
        if (var6 == 12) {
            class33 var14 = class263.field3508[var7];
            if (var14 != null) {
                class332.field4066 = arg0;
                class244.field3357 = 0;
                class793.field10872 = 2;
                class148.field1886++;
                class357.field4365 = arg2;
                class13 var15 = class659.method3587(class68.field909, 98, class491.field6311);
                var15.field130.method1521(var7, true);
                var15.field130.method1502(class777.field10600, 65280);
                var15.field130.method1496(class170.field2260, (byte) 74);
                var15.field130.method1543(class679.field8781.method271((byte) 91, 82) ? 1 : 0, 94);
                var15.field130.method1502(class358.field4377, 65280);
                class116.method679(var15, 0);
                class11.method48(-104, var14.field4758[0], 0, var14.field4767[0], var14.method190((byte) -30), -2, 0, var14.method190((byte) -41), true);
            }
        }
        if (var6 == 23) {
            class332.field4066 = arg0;
            class359.field4379++;
            class793.field10872 = 2;
            class244.field3357 = 0;
            class357.field4365 = arg2;
            class13 var16 = class659.method3587(class68.field909, 98, class507.field6483);
            var16.field130.method1521(class714.field9407 + var4, true);
            var16.field130.method1543(class679.field8781.method271((byte) 123, 82) ? 1 : 0, 61);
            var16.field130.method1502(var5 + class240.field3293, 65280);
            var16.field130.method1541(374, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class116.method679(var16, 0);
            client.method2629(var8, var4, true, var5);
        }
        if (var6 == 9) {
            class391 var17 = class752.method4075(var5, (byte) -81, var4);
            if (var17 != null) {
                class152.method868((byte) 127, var17);
            }
        }
        if (var6 == 13) {
            class332.field4066 = arg0;
            class793.field10872 = 2;
            class357.field4365 = arg2;
            class244.field3357 = 0;
            class103.field1385++;
            class13 var18 = class659.method3587(class68.field909, 98, class302.field3807);
            var18.field130.method1507(-531697592, class240.field3293 + var5);
            var18.field130.method1521(class714.field9407 + var4, true);
            var18.field130.method1521((int) (var8 >>> 32) & Integer.MAX_VALUE, true);
            var18.field130.method1533(class679.field8781.method271((byte) 121, 82) ? 1 : 0, (byte) 120);
            class116.method679(var18, 0);
            client.method2629(var8, var4, true, var5);
        }
        if (var6 == 1002) {
            class793.field10872 = 2;
            class357.field4365 = arg2;
            class454.field5920++;
            class244.field3357 = 0;
            class332.field4066 = arg0;
            class13 var19 = class659.method3587(class68.field909, arg1 ^ 0xFFFFFFCD, class67.field876);
            var19.field130.method1521(Integer.MAX_VALUE & (int) (var8 >>> 32), true);
            var19.field130.method1521(class714.field9407 + var4, true);
            var19.field130.method1533(class679.field8781.method271((byte) 90, 82) ? 1 : 0, (byte) 26);
            var19.field130.method1502(class240.field3293 + var5, 65280);
            class116.method679(var19, 0);
            client.method2629(var8, var4, true, var5);
        }
        if (var6 == 57) {
            class33 var20 = class263.field3508[var7];
            if (var20 != null) {
                class793.field10872 = 2;
                class686.field8836++;
                class357.field4365 = arg2;
                class332.field4066 = arg0;
                class244.field3357 = 0;
                class13 var21 = class659.method3587(class68.field909, 98, class201.field2798);
                var21.field130.method1521(var7, true);
                var21.field130.method1491(-129, class679.field8781.method271((byte) 127, 82) ? 1 : 0);
                class116.method679(var21, arg1 ^ 0xFFFFFFAF);
                class11.method48(-104, var20.field4758[0], 0, var20.field4767[0], var20.method190((byte) -86), -2, 0, var20.method190((byte) 104), true);
            }
        }
        if (var6 == 1009) {
            class332.field4066 = arg0;
            class793.field10872 = 2;
            class244.field3357 = 0;
            class644.field8236++;
            class357.field4365 = arg2;
            class13 var22 = class659.method3587(class68.field909, 98, class679.field8786);
            var22.field130.method1541(374, var7);
            class116.method679(var22, 0);
        }
        if (var6 == 22) {
            class33 var23 = class263.field3508[var7];
            if (var23 != null) {
                class332.field4066 = arg0;
                class244.field3357 = 0;
                class793.field10872 = 2;
                class357.field4365 = arg2;
                class781.field10658++;
                class13 var24 = class659.method3587(class68.field909, arg1 + 179, class92.field1253);
                var24.field130.method1533(class679.field8781.method271((byte) 115, 82) ? 1 : 0, (byte) 67);
                var24.field130.method1502(var7, arg1 ^ 0xFFFF00AF);
                class116.method679(var24, 0);
                class11.method48(-47, var23.field4758[0], 0, var23.field4767[0], var23.method190((byte) 101), -2, 0, var23.method190((byte) 79), true);
            }
        }
        if (var6 == 48) {
            class601.field7650++;
            class793.field10872 = 2;
            class357.field4365 = arg2;
            class244.field3357 = 0;
            class332.field4066 = arg0;
            class13 var25 = class659.method3587(class68.field909, 98, class659.field8612);
            var25.field130.method1502(var7, 65280);
            var25.field130.method1521(class240.field3293 + var5, true);
            var25.field130.method1491(-129, class679.field8781.method271((byte) 110, 82) ? 1 : 0);
            var25.field130.method1541(374, var4 + class714.field9407);
            class116.method679(var25, arg1 ^ 0xFFFFFFAF);
            class506.method2802(var4, var5, (byte) -4);
        }
        if (var6 == 49) {
            class357.field4365 = arg2;
            class793.field10872 = 2;
            class148.field1886++;
            class244.field3357 = 0;
            class332.field4066 = arg0;
            class13 var26 = class659.method3587(class68.field909, arg1 ^ 0xFFFFFFCD, class491.field6311);
            var26.field130.method1521(class422.field5564.field4737, true);
            var26.field130.method1502(class777.field10600, 65280);
            var26.field130.method1496(class170.field2260, (byte) 81);
            var26.field130.method1543(class679.field8781.method271((byte) 108, 82) ? 1 : 0, 53);
            var26.field130.method1502(class358.field4377, 65280);
            class116.method679(var26, 0);
        }
        if (var6 == 5) {
            class244.field3357 = 0;
            class357.field4365 = arg2;
            class332.field4066 = arg0;
            class380.field4643++;
            class793.field10872 = 1;
            class13 var27 = class659.method3587(class68.field909, arg1 + 179, class595.field7557);
            var27.field130.method1502(class714.field9407 + var4, 65280);
            var27.field130.method1541(arg1 + 455, class777.field10600);
            var27.field130.method1521(class358.field4377, true);
            var27.field130.method1521(class240.field3293 + var5, true);
            var27.field130.method1496(class170.field2260, (byte) 75);
            class116.method679(var27, 0);
            class11.method48(arg1 ^ 0x65, var5, 0, var4, 1, -4, 0, 1, true);
        }
        if (var6 == 25) {
            class232 var28 = (class232) class444.field5811.method2616((long) var7, (byte) 70);
            if (var28 != null) {
                class357.field4365 = arg2;
                class244.field3357 = 0;
                class332.field4066 = arg0;
                class727 var29 = var28.field3125;
                class793.field10872 = 2;
                class389.field4968++;
                class13 var30 = class659.method3587(class68.field909, 98, class578.field7326);
                var30.field130.method1543(class679.field8781.method271((byte) 114, 82) ? 1 : 0, 117);
                var30.field130.method1507(arg1 - 531697511, var7);
                class116.method679(var30, arg1 + 81);
                class11.method48(84, var29.field4758[0], 0, var29.field4767[0], var29.method190((byte) -86), -2, 0, var29.method190((byte) 67), true);
            }
        }
        if (var6 == 21) {
            class244.field3357 = 0;
            class432.field5664++;
            class793.field10872 = 2;
            class332.field4066 = arg0;
            class357.field4365 = arg2;
            class13 var31 = class659.method3587(class68.field909, 98, class85.field1198);
            var31.field130.method1502(class358.field4377, 65280);
            var31.field130.method1502(var7, arg1 ^ 0xFFFF00AF);
            var31.field130.method1541(374, class777.field10600);
            var31.field130.method1499((byte) -4, class170.field2260);
            var31.field130.method1533(class679.field8781.method271((byte) 97, 82) ? 1 : 0, (byte) 27);
            var31.field130.method1521(class240.field3293 + var5, true);
            var31.field130.method1521(class714.field9407 + var4, true);
            class116.method679(var31, arg1 ^ 0xFFFFFFAF);
            class506.method2802(var4, var5, (byte) -24);
        }
        if (var6 == 17) {
            class33 var32 = class263.field3508[var7];
            if (var32 != null) {
                class332.field4066 = arg0;
                class381.field4725++;
                class793.field10872 = 2;
                class244.field3357 = 0;
                class357.field4365 = arg2;
                class13 var33 = class659.method3587(class68.field909, 98, class540.field6798);
                var33.field130.method1502(var7, 65280);
                var33.field130.method1491(-129, class679.field8781.method271((byte) 124, 82) ? 1 : 0);
                class116.method679(var33, 0);
                class11.method48(102, var32.field4758[0], 0, var32.field4767[0], var32.method190((byte) -67), -2, 0, var32.method190((byte) -119), true);
            }
        }
        if (var6 == 20) {
            class305.field3840++;
            class332.field4066 = arg0;
            class244.field3357 = 0;
            class793.field10872 = 2;
            class357.field4365 = arg2;
            class13 var34 = class659.method3587(class68.field909, 98, class305.field3842);
            var34.field130.method1502(var4 + class714.field9407, 65280);
            var34.field130.method1493(class679.field8781.method271((byte) 105, 82) ? 1 : 0, (byte) 122);
            var34.field130.method1502(var7, 65280);
            var34.field130.method1541(374, var5 + class240.field3293);
            class116.method679(var34, 0);
            class506.method2802(var4, var5, (byte) 117);
        }
        if (var6 == 2) {
            class33 var35 = class263.field3508[var7];
            if (var35 != null) {
                class332.field4066 = arg0;
                class244.field3357 = 0;
                class793.field10872 = 2;
                class495.field6334++;
                class357.field4365 = arg2;
                class13 var36 = class659.method3587(class68.field909, arg1 + 179, class379.field4629);
                var36.field130.method1493(class679.field8781.method271((byte) 95, 82) ? 1 : 0, (byte) 126);
                var36.field130.method1541(374, var7);
                class116.method679(var36, 0);
                class11.method48(79, var35.field4758[0], 0, var35.field4767[0], var35.method190((byte) -100), -2, 0, var35.method190((byte) -56), true);
            }
        }
        if (var6 == 1003) {
            class244.field3357 = 0;
            class793.field10872 = 2;
            class332.field4066 = arg0;
            class357.field4365 = arg2;
            class579.field7332++;
            class13 var37 = class659.method3587(class68.field909, 98, class585.field7407);
            var37.field130.method1541(374, var7);
            class116.method679(var37, 0);
        }
        if (var6 == 1001) {
            class793.field10872 = 2;
            class357.field4365 = arg2;
            class332.field4066 = arg0;
            class244.field3357 = 0;
            class232 var38 = (class232) class444.field5811.method2616((long) var7, (byte) 66);
            if (var38 != null) {
                class727 var39 = var38.field3125;
                class240 var40 = var39.field9545;
                if (var40.field3289 != null) {
                    var40 = var40.method1585((byte) -100, class381.field4705);
                }
                if (var40 != null) {
                    class493.field6319++;
                    class13 var41 = class659.method3587(class68.field909, 98, class181.field2470);
                    var41.field130.method1541(374, var40.field3256);
                    class116.method679(var41, 0);
                }
            }
        }
        if (var6 == 58) {
            class33 var42 = class263.field3508[var7];
            if (var42 != null) {
                class793.field10872 = 2;
                class332.field4066 = arg0;
                class244.field3357 = 0;
                class357.field4365 = arg2;
                class552.field6972++;
                class13 var43 = class659.method3587(class68.field909, 98, class83.field1189);
                var43.field130.method1493(class679.field8781.method271((byte) 98, 82) ? 1 : 0, (byte) 123);
                var43.field130.method1541(374, var7);
                class116.method679(var43, 0);
                class11.method48(110, var42.field4758[0], 0, var42.field4767[0], var42.method190((byte) -21), -2, 0, var42.method190((byte) 59), true);
            }
        }
        if (var6 == 10) {
            class33 var44 = class263.field3508[var7];
            if (var44 != null) {
                class793.field10872 = 2;
                class244.field3357 = 0;
                class528.field6705++;
                class332.field4066 = arg0;
                class357.field4365 = arg2;
                class13 var45 = class659.method3587(class68.field909, 98, class4.field54);
                var45.field130.method1493(class679.field8781.method271((byte) 101, 82) ? 1 : 0, (byte) 121);
                var45.field130.method1541(arg1 ^ 0xFFFFFED9, var7);
                class116.method679(var45, 0);
                class11.method48(-46, var44.field4758[0], 0, var44.field4767[0], var44.method190((byte) -81), -2, 0, var44.method190((byte) 57), true);
            }
        }
        if (var6 == 46) {
            class357.field4365 = arg2;
            class149.field1896++;
            class793.field10872 = 2;
            class332.field4066 = arg0;
            class244.field3357 = 0;
            class13 var46 = class659.method3587(class68.field909, 98, class519.field6600);
            var46.field130.method1502(Integer.MAX_VALUE & (int) (var8 >>> 32), arg1 ^ 0xFFFF00AF);
            var46.field130.method1493(class679.field8781.method271((byte) 122, 82) ? 1 : 0, (byte) -126);
            var46.field130.method1521(class240.field3293 + var5, true);
            var46.field130.method1507(-531697592, var4 + class714.field9407);
            class116.method679(var46, 0);
            client.method2629(var8, var4, true, var5);
        }
        if (var6 == 19) {
            class232 var47 = (class232) class444.field5811.method2616((long) var7, (byte) 62);
            if (var47 != null) {
                class727 var48 = var47.field3125;
                class336.field4102++;
                class332.field4066 = arg0;
                class244.field3357 = 0;
                class357.field4365 = arg2;
                class793.field10872 = 2;
                class13 var49 = class659.method3587(class68.field909, 98, class329.field4029);
                var49.field130.method1493(class679.field8781.method271((byte) 96, 82) ? 1 : 0, (byte) -65);
                var49.field130.method1502(var7, 65280);
                class116.method679(var49, arg1 + 81);
                class11.method48(arg1 ^ 0x61, var48.field4758[0], 0, var48.field4767[0], var48.method190((byte) -29), -2, 0, var48.method190((byte) -116), true);
            }
        }
        if (var6 == 6) {
            class232 var50 = (class232) class444.field5811.method2616((long) var7, (byte) 35);
            if (var50 != null) {
                class727 var51 = var50.field3125;
                class793.field10872 = 2;
                class357.field4365 = arg2;
                class332.field4066 = arg0;
                class216.field2941++;
                class244.field3357 = 0;
                class13 var52 = class659.method3587(class68.field909, 98, class651.field8296);
                var52.field130.method1543(class679.field8781.method271((byte) 98, 82) ? 1 : 0, 119);
                var52.field130.method1541(arg1 + 455, var7);
                class116.method679(var52, 0);
                class11.method48(-96, var51.field4758[0], 0, var51.field4767[0], var51.method190((byte) 87), -2, 0, var51.method190((byte) -118), true);
            }
        }
        if (var6 == 18 && class165.field2182 == null) {
            class374.method2140(arg1 ^ 0xFFFFFFE6, var4, var5);
            class165.field2182 = class752.method4075(var5, (byte) -80, var4);
            class776.method4255(class165.field2182, -1007);
        }
        if (var6 == 53) {
            class332.field4066 = arg0;
            class417.field5513++;
            class244.field3357 = 0;
            class793.field10872 = 2;
            class357.field4365 = arg2;
            class13 var53 = class659.method3587(class68.field909, 98, class413.field5478);
            var53.field130.method1521(class358.field4377, true);
            var53.field130.method1521(class777.field10600, true);
            var53.field130.method1541(374, var5 + class240.field3293);
            var53.field130.method1499((byte) -4, class170.field2260);
            var53.field130.method1521(class714.field9407 + var4, true);
            var53.field130.method1533(class679.field8781.method271((byte) 102, 82) ? 1 : 0, (byte) 55);
            var53.field130.method1502((int) (var8 >>> 32) & Integer.MAX_VALUE, arg1 + 65361);
            class116.method679(var53, 0);
            client.method2629(var8, var4, true, var5);
        }
        if (var6 == 45) {
            class391 var54 = class752.method4075(var5, (byte) -126, var4);
            if (var54 != null) {
                class38.method230((byte) 93);
                class372 var55 = client.method2637(var54);
                class434.method2493(-84, var54, var55.field4548, var55.method2130((byte) 108));
                class726.field9525 = class581.method3113(1482, var54);
                if (class726.field9525 == null) {
                    class726.field9525 = "Null";
                }
                class130.field1732 = var54.field5008 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 51) {
            class244.field3357 = 0;
            class332.field4066 = arg0;
            class580.field7338++;
            class357.field4365 = arg2;
            class793.field10872 = 2;
            class13 var56 = class659.method3587(class68.field909, 98, class594.field7536);
            var56.field130.method1502(class240.field3293 + var5, 65280);
            var56.field130.method1533(class679.field8781.method271((byte) 127, 82) ? 1 : 0, (byte) 45);
            var56.field130.method1521(class714.field9407 + var4, true);
            var56.field130.method1502(var7, 65280);
            class116.method679(var56, 0);
            class506.method2802(var4, var5, (byte) -110);
        }
        if (var6 == 59) {
            class232 var57 = (class232) class444.field5811.method2616((long) var7, (byte) 59);
            if (var57 != null) {
                class335.field4085++;
                class727 var58 = var57.field3125;
                class357.field4365 = arg2;
                class793.field10872 = 2;
                class332.field4066 = arg0;
                class244.field3357 = 0;
                class13 var59 = class659.method3587(class68.field909, 98, class102.field1355);
                var59.field130.method1543(class679.field8781.method271((byte) 107, 82) ? 1 : 0, arg1 ^ 0xFFFFFFD0);
                var59.field130.method1521(var7, true);
                class116.method679(var59, 0);
                class11.method48(36, var58.field4758[0], 0, var58.field4767[0], var58.method190((byte) 100), -2, 0, var58.method190((byte) 77), true);
            }
        }
        if (var6 == 4) {
            if (class20.field186 > 0 && class679.field8781.method271((byte) 125, 82) && class679.field8781.method271((byte) 120, 81)) {
                class119.method710(class714.field9407 + var4, 0, class240.field3293 + var5, class422.field5564.field2895);
            } else {
                class244.field3357 = 0;
                class357.field4365 = arg2;
                class793.field10872 = 1;
                class332.field4066 = arg0;
                class208.field2869++;
                class13 var60 = class659.method3587(class68.field909, 98, class558.field7099);
                var60.field130.method1521(class714.field9407 + var4, true);
                var60.field130.method1502(class240.field3293 + var5, 65280);
                class116.method679(var60, 0);
            }
        }
        if (var6 == 30) {
            class357.field4365 = arg2;
            class244.field3357 = 0;
            class793.field10872 = 2;
            class650.field8291++;
            class332.field4066 = arg0;
            class13 var61 = class659.method3587(class68.field909, arg1 + 179, class648.field8278);
            var61.field130.method1502(class714.field9407 + var4, 65280);
            var61.field130.method1541(374, class240.field3293 + var5);
            var61.field130.method1543(class679.field8781.method271((byte) 124, 82) ? 1 : 0, 74);
            var61.field130.method1502(var7, 65280);
            class116.method679(var61, 0);
            class506.method2802(var4, var5, (byte) 108);
        }
        if (var6 == 52 || var6 == 1012) {
            class318.method1857(var7, 0, arg3.field10408, var5, var4);
        }
        if (var6 == 11) {
            class33 var62 = class263.field3508[var7];
            if (var62 != null) {
                class332.field4066 = arg0;
                class552.field6972++;
                class244.field3357 = 0;
                class793.field10872 = 2;
                class357.field4365 = arg2;
                class13 var63 = class659.method3587(class68.field909, arg1 + 179, class232.field3127);
                var63.field130.method1541(374, var7);
                var63.field130.method1533(class679.field8781.method271((byte) 115, 82) ? 1 : 0, (byte) 105);
                class116.method679(var63, 0);
                class11.method48(arg1 ^ 0xFFFFFFDF, var62.field4758[0], 0, var62.field4767[0], var62.method190((byte) 73), -2, 0, var62.method190((byte) 70), true);
            }
        }
        if (var6 == 16) {
            if (class20.field186 > 0 && class679.field8781.method271((byte) 118, 82) && class679.field8781.method271((byte) 114, 81)) {
                class119.method710(class714.field9407 + var4, arg1 ^ 0xFFFFFFAF, class240.field3293 + var5, class422.field5564.field2895);
            } else {
                class13 var64 = class673.method3628(0, var7, var5, var4);
                if (var7 == 1) {
                    var64.field130.method1491(-129, -1);
                    var64.field130.method1491(-129, -1);
                    var64.field130.method1541(arg1 ^ 0xFFFFFED9, (int) class698.field9250);
                    var64.field130.method1491(-129, 57);
                    var64.field130.method1491(-129, class757.field10329);
                    var64.field130.method1491(-129, class718.field9432);
                    var64.field130.method1491(-129, 89);
                    var64.field130.method1541(arg1 + 455, class422.field5564.field2896);
                    var64.field130.method1541(arg1 + 455, class422.field5564.field2900);
                    var64.field130.method1491(-129, 63);
                } else {
                    class793.field10872 = 1;
                    class357.field4365 = arg2;
                    class332.field4066 = arg0;
                    class244.field3357 = 0;
                }
                class116.method679(var64, 0);
                class11.method48(-51, var5, 0, var4, 1, -4, 0, 1, true);
            }
        }
        if (var6 == 3) {
            class33 var65 = class263.field3508[var7];
            if (var65 != null) {
                class357.field4365 = arg2;
                class332.field4066 = arg0;
                class793.field10872 = 2;
                class222.field3025++;
                class244.field3357 = 0;
                class13 var66 = class659.method3587(class68.field909, arg1 + 179, class436.field5736);
                var66.field130.method1491(-129, class679.field8781.method271((byte) 91, 82) ? 1 : 0);
                var66.field130.method1521(var7, true);
                class116.method679(var66, 0);
                class11.method48(arg1 + 156, var65.field4758[0], 0, var65.field4767[0], var65.method190((byte) 111), -2, 0, var65.method190((byte) 125), true);
            }
        }
        if (var6 == 1007 || var6 == 1010 || var6 == 1004 || var6 == 1008 || var6 == 1006) {
            class776.method4254(1007, var6, var4, var7);
        }
        if (var6 == 15) {
            class438.field5755++;
            class244.field3357 = 0;
            class357.field4365 = arg2;
            class793.field10872 = 2;
            class332.field4066 = arg0;
            class13 var67 = class659.method3587(class68.field909, 98, class599.field7621);
            var67.field130.method1502(class240.field3293 + var5, 65280);
            var67.field130.method1502(Integer.MAX_VALUE & (int) (var8 >>> 32), arg1 ^ 0xFFFF00AF);
            var67.field130.method1491(arg1 - 48, class679.field8781.method271((byte) 119, 82) ? 1 : 0);
            var67.field130.method1521(var4 + class714.field9407, true);
            class116.method679(var67, 0);
            client.method2629(var8, var4, true, var5);
        }
        if (var6 == 50) {
            class33 var68 = class263.field3508[var7];
            if (var68 != null) {
                class332.field4066 = arg0;
                class530.field6731++;
                class357.field4365 = arg2;
                class793.field10872 = 2;
                class244.field3357 = 0;
                class13 var69 = class659.method3587(class68.field909, 98, class420.field5536);
                var69.field130.method1533(class679.field8781.method271((byte) 117, 82) ? 1 : 0, (byte) 99);
                var69.field130.method1521(var7, true);
                class116.method679(var69, 0);
                class11.method48(-57, var68.field4758[0], 0, var68.field4767[0], var68.method190((byte) -58), -2, 0, var68.method190((byte) 108), true);
            }
        }
        if (var6 == 60) {
            class232 var70 = (class232) class444.field5811.method2616((long) var7, (byte) -103);
            if (var70 != null) {
                class332.field4066 = arg0;
                class727 var71 = var70.field3125;
                class244.field3357 = 0;
                class453.field5905++;
                class357.field4365 = arg2;
                class793.field10872 = 2;
                class13 var72 = class659.method3587(class68.field909, 98, class572.field7250);
                var72.field130.method1493(class679.field8781.method271((byte) 123, 82) ? 1 : 0, (byte) 125);
                var72.field130.method1507(-531697592, var7);
                class116.method679(var72, 0);
                class11.method48(arg1 + 164, var71.field4758[0], 0, var71.field4767[0], var71.method190((byte) 109), -2, 0, var71.method190((byte) -126), true);
            }
        }
        if (arg1 != -81) {
            return;
        }
        if (var6 == 47) {
            class33 var73 = class263.field3508[var7];
            if (var73 != null) {
                class357.field4365 = arg2;
                class332.field4066 = arg0;
                class552.field6972++;
                class244.field3357 = 0;
                class793.field10872 = 2;
                class13 var74 = class659.method3587(class68.field909, 98, class28.field242);
                var74.field130.method1491(arg1 ^ 0xD0, class679.field8781.method271((byte) 121, 82) ? 1 : 0);
                var74.field130.method1502(var7, 65280);
                class116.method679(var74, 0);
                class11.method48(87, var73.field4758[0], 0, var73.field4767[0], var73.method190((byte) 114), -2, 0, var73.method190((byte) 78), true);
            }
        }
        if (class47.field549) {
            class38.method230((byte) 59);
        }
        if (class386.field4934 != null && class376.field4600 == 0) {
            class776.method4255(class386.field4934, -1007);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public static void method3098(int arg0) {
        field7317 = null;
        if (arg0 <= 37) {
            method3097(97, (byte) 23, 74, null);
        }
        field7320 = null;
        field7315 = null;
        field7318 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZIILjava/awt/Canvas;Lwm;Ld;)Lha;")
    public static final class570 method3099(boolean arg0, int arg1, int arg2, Canvas arg3, class30 arg4, class284 arg5) {
        field7316++;
        int var6 = 0;
        int var7 = 0;
        if (!arg0) {
            return null;
        }
        if (arg3 != null) {
            Dimension var8 = arg3.getSize();
            var7 = var8.height;
            var6 = var8.width;
        }
        return class570.method3079(arg2, false, var7, arg5, arg1, var6, arg4, arg3);
    }

    @OriginalMember(owner = "client!gp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7319++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(II)V")
    public class576(int arg0, int arg1) {
        this.field7322 = arg1;
    }
}
