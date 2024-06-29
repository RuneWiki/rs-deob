import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[[[Lcb;")
    public static class22[][][] field1112 = new class22[4][104][104];

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field1121 = 0;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lsa;")
    public static class163 field1115 = new class163(4096);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)I")
    public static final int method374(byte arg0, int arg1) {
        class75 var2 = class154.method1008((byte) -107, arg1);
        int var3 = var2.field1414;
        int var4 = var2.field1419;
        int var5 = var2.field1422;
        field1123++;
        if (arg0 <= 3) {
            return 110;
        } else {
            int var6 = class140.field2605[var5 - var4];
            return class6.field119[var3] >> var4 & var6;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(BI)V")
    public static final void method375(byte arg0, int arg1) {
        field1117++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class123.field2271[arg1];
        int var3 = class149.field2746[arg1];
        int var4 = class22.field472[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = class155.field2978[arg1];
        if (var3 == 7) {
            class197 var6 = class54.field992[var4];
            if (var6 != null) {
                class103.field1880++;
                class161.method1037(false, arg0 - 17885, class4.field79.field3734[0], var6.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var6.field3729[0], 1);
                class65.field1205 = class178.field3480;
                class2.field47 = 2;
                class107.field1964 = 0;
                class121.field2229 = class42.field796;
                class141.field2621.method1024(29, (byte) -94);
                class141.field2621.method810((byte) 125, var4);
            }
        }
        if (var3 == 2) {
            class98.field1846++;
            class141.field2621.method1024(32, (byte) -94);
            class141.field2621.method808((byte) 114, class134.field2517);
            class141.field2621.method774(52, var5);
            class141.field2621.method801(class6.field114, (byte) 87);
            class141.field2621.method828((byte) -61, var2);
            class141.field2621.method801(var4, (byte) 87);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 11 && class55.field999 == null) {
            class132.method861(var2, (byte) 78, var5);
            class55.field999 = class121.method755(var5, -5207, var2);
            class64.method404(107, class55.field999);
        }
        if (var3 == 1002) {
            class150 var7 = class62.method385((byte) 41, var5);
            if (var7 == null || var7.field2870[var2] < 100000) {
                class141.field2621.method1024(62, (byte) -94);
                class111.field2029++;
                class141.field2621.method801(var4, (byte) 87);
            } else {
                class199.method1307((byte) 121, class45.field838, class165.method1058(arg0 ^ 0x11, new class169[] { class2.method18((byte) -62, var7.field2870[var2]), class80.field1476, class180.method1196(var4, arg0 - 17).field1383 }), 0);
            }
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 38) {
            class197 var8 = class54.field992[var4];
            if (var8 != null) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var8.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var8.field3729[0], 1);
                class204.field4002++;
                class65.field1205 = class178.field3480;
                class2.field47 = 2;
                class107.field1964 = 0;
                class121.field2229 = class42.field796;
                class141.field2621.method1024(176, (byte) -94);
                class141.field2621.method810((byte) 125, var4);
            }
        }
        if (var3 == 30) {
            class6.field129++;
            class141.field2621.method1024(144, (byte) -94);
            class141.field2621.method810((byte) 107, var4);
            class141.field2621.method789(-373, var5);
            class141.field2621.method797(var2, false);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 26 || var3 == 1004) {
            class87.method518(71, var2, class154.field2967[arg1], var5, var4);
        }
        if (var3 == 10 && class199.method1304(arg0 ^ 0x68, var5, var2, var4)) {
            class187.field3630++;
            class141.field2621.method1024(142, (byte) -94);
            class141.field2621.method801(class6.field114, (byte) 87);
            class141.field2621.method808((byte) 104, class134.field2517);
            class141.field2621.method828((byte) -61, var5 + class191.field3761);
            class141.field2621.method797(var4 >> 14 & 0x7FFF, false);
            class141.field2621.method828((byte) -61, class179.field3489 + var2);
        }
        if (var3 == 33) {
            class197 var9 = class54.field992[var4];
            if (var9 != null) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var9.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var9.field3729[0], 1);
                class2.field47 = 2;
                class107.field1964 = 0;
                class121.field2229 = class42.field796;
                class11.field262++;
                class65.field1205 = class178.field3480;
                class141.field2621.method1024(233, (byte) -94);
                class141.field2621.method810((byte) 126, var4);
            }
        }
        if (var3 == 29) {
            class141.field2621.method1024(94, (byte) -94);
            class31.field658++;
            class141.field2621.method810((byte) 111, var2);
            class141.field2621.method802((byte) 64, var5);
            class141.field2621.method797(var4, false);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 20) {
            class196 var10 = class65.field1213[var4];
            if (var10 != null) {
                class188.field3653++;
                class161.method1037(false, -17868, class4.field79.field3734[0], var10.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var10.field3729[0], 1);
                class121.field2229 = class42.field796;
                class2.field47 = 2;
                class65.field1205 = class178.field3480;
                class107.field1964 = 0;
                class141.field2621.method1024(99, (byte) -94);
                class141.field2621.method789(-373, class134.field2517);
                class141.field2621.method801(var4, (byte) 87);
                class141.field2621.method810((byte) 105, class6.field114);
            }
        }
        if (var3 == 48) {
            class120.field2208++;
            class141.field2621.method1024(184, (byte) -94);
            class141.field2621.method802((byte) 64, var5);
            class141.field2621.method801(var4, (byte) 87);
            class141.field2621.method797(var2, false);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 12) {
            class13.field309++;
            class141.field2621.method1024(234, (byte) -94);
            class141.field2621.method774(66, var5);
            class141.field2621.method797(var2, false);
            class141.field2621.method797(var4, false);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 21) {
            boolean var11 = class161.method1037(false, -17868, class4.field79.field3734[0], var2, 2, 0, class4.field79.field3729[0], 0, 0, 0, var5, 0);
            if (!var11) {
                class161.method1037(false, arg0 - 17885, class4.field79.field3734[0], var2, 2, 1, class4.field79.field3729[0], 0, 0, 0, var5, 1);
            }
            class65.field1205 = class178.field3480;
            class107.field1964 = 0;
            class2.field47 = 2;
            class77.field1449++;
            class121.field2229 = class42.field796;
            class141.field2621.method1024(64, (byte) -94);
            class141.field2621.method828((byte) -61, class179.field3489 + var2);
            class141.field2621.method810((byte) 104, var4);
            class141.field2621.method810((byte) 122, var5 + class191.field3761);
        }
        if (var3 == 3) {
            class156.field2993++;
            boolean var13 = class161.method1037(false, -17868, class4.field79.field3734[0], var2, 2, 0, class4.field79.field3729[0], 0, 0, 0, var5, 0);
            if (!var13) {
                class161.method1037(false, arg0 ^ 0xFFFFBA25, class4.field79.field3734[0], var2, 2, 1, class4.field79.field3729[0], 0, 0, 0, var5, 1);
            }
            class121.field2229 = class42.field796;
            class107.field1964 = 0;
            class2.field47 = 2;
            class65.field1205 = class178.field3480;
            class141.field2621.method1024(127, (byte) -94);
            class141.field2621.method797(class191.field3761 + var5, false);
            class141.field2621.method801(var2 + class179.field3489, (byte) 87);
            class141.field2621.method828((byte) -61, var4);
        }
        if (var3 == 41) {
            class162.field3096++;
            class141.field2621.method1024(60, (byte) -94);
            class141.field2621.method810((byte) 108, var4);
            class141.field2621.method808((byte) 106, var5);
            class141.field2621.method797(var2, false);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 23) {
            class205.field4014++;
            class141.field2621.method1024(151, (byte) -94);
            class141.field2621.method797(var4, false);
            class141.field2621.method801(var2, (byte) 87);
            class141.field2621.method802((byte) 64, var5);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 9) {
            class141.field2621.method1024(26, (byte) -94);
            class195.field3838++;
            class141.field2621.method801(var2, (byte) 87);
            class141.field2621.method801(var4, (byte) 87);
            class141.field2621.method808((byte) 125, var5);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 50) {
            class197 var15 = class54.field992[var4];
            if (var15 != null) {
                class187.field3636++;
                class161.method1037(false, -17868, class4.field79.field3734[0], var15.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var15.field3729[0], 1);
                class2.field47 = 2;
                class107.field1964 = 0;
                class121.field2229 = class42.field796;
                class65.field1205 = class178.field3480;
                class141.field2621.method1024(149, (byte) -94);
                class141.field2621.method801(var4, (byte) 87);
            }
        }
        if (var3 == 43) {
            class43.field813++;
            class141.field2621.method1024(187, (byte) -94);
            class141.field2621.method808((byte) 112, var5);
            class141.field2621.method801(var4, (byte) 87);
            class141.field2621.method801(var2, (byte) 87);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 25) {
            class199.method1304(119, var5, var2, var4);
            class131.field2441++;
            class141.field2621.method1024(50, (byte) -94);
            class141.field2621.method797(var4 >> 14 & 0x7FFF, false);
            class141.field2621.method801(class179.field3489 + var2, (byte) 87);
            class141.field2621.method797(class191.field3761 + var5, false);
        }
        if (var3 == 8) {
            class196 var16 = class65.field1213[var4];
            if (var16 != null) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var16.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var16.field3729[0], 1);
                class65.field1205 = class178.field3480;
                class121.field2229 = class42.field796;
                class193.field3815++;
                class2.field47 = 2;
                class107.field1964 = 0;
                class141.field2621.method1024(89, (byte) -94);
                class141.field2621.method801(class125.field2291, (byte) 87);
                class141.field2621.method802((byte) 64, class176.field3454);
                class141.field2621.method801(var4, (byte) 87);
                class141.field2621.method797(class91.field1679, false);
            }
        }
        if (var3 == 36) {
            class75.field1417++;
            class141.field2621.method1024(221, (byte) -94);
            class141.field2621.method797(var2, false);
            class141.field2621.method801(var4, (byte) 87);
            class141.field2621.method808((byte) 124, var5);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 47) {
            boolean var17 = class161.method1037(false, arg0 - 17885, class4.field79.field3734[0], var2, 2, 0, class4.field79.field3729[0], 0, 0, 0, var5, 0);
            class174.field3357++;
            if (!var17) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var2, 2, 1, class4.field79.field3729[0], 0, 0, 0, var5, 1);
            }
            class2.field47 = 2;
            class65.field1205 = class178.field3480;
            class107.field1964 = 0;
            class121.field2229 = class42.field796;
            class141.field2621.method1024(83, (byte) -94);
            class141.field2621.method801(class191.field3761 + var5, (byte) 87);
            class141.field2621.method801(class179.field3489 + var2, (byte) 87);
            class141.field2621.method797(var4, false);
        }
        if (var3 == 42) {
            class196 var19 = class65.field1213[var4];
            if (var19 != null) {
                class55.field1004++;
                class161.method1037(false, -17868, class4.field79.field3734[0], var19.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var19.field3729[0], 1);
                class121.field2229 = class42.field796;
                class107.field1964 = 0;
                class65.field1205 = class178.field3480;
                class2.field47 = 2;
                class141.field2621.method1024(194, (byte) -94);
                class141.field2621.method801(var4, (byte) 87);
            }
        }
        if (var3 == 37) {
            class28.field567++;
            class141.field2621.method1024(235, (byte) -94);
            class141.field2621.method802((byte) 64, var5);
            class150 var20 = class62.method385((byte) 41, var5);
            if (var20.field2890 != null && var20.field2890[0][0] == 5) {
                int var21 = var20.field2890[0][1];
                if (class6.field119[var21] != var20.field2769[0]) {
                    class6.field119[var21] = var20.field2769[0];
                    class63.method389(23708, var21);
                }
            }
        }
        if (var3 == 19) {
            class188.method1239((byte) 27);
            class150 var22 = class62.method385((byte) 41, var5);
            class141.field2630 = 1;
            class91.field1679 = var2;
            class176.field3454 = var5;
            class125.field2291 = var4;
            class64.method404(arg0 ^ 0x7E, var22);
            class16.field341 = class165.method1058(0, new class169[] { class112.field2047, class180.method1196(var4, 0).field1383, class164.field3147 });
            if (class16.field341 == null) {
                class16.field341 = class63.field1168;
            }
            return;
        }
        if (var3 == 17) {
            class154.method1005((byte) -119);
        }
        if (var3 == 51) {
            class86.field1582++;
            boolean var23 = class161.method1037(false, -17868, class4.field79.field3734[0], var2, 2, 0, class4.field79.field3729[0], 0, 0, 0, var5, 0);
            if (!var23) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var2, 2, 1, class4.field79.field3729[0], 0, 0, 0, var5, 1);
            }
            class121.field2229 = class42.field796;
            class2.field47 = 2;
            class65.field1205 = class178.field3480;
            class107.field1964 = 0;
            class141.field2621.method1024(104, (byte) -94);
            class141.field2621.method802((byte) 64, class176.field3454);
            class141.field2621.method801(var4, (byte) 87);
            class141.field2621.method828((byte) -61, class125.field2291);
            class141.field2621.method797(class91.field1679, false);
            class141.field2621.method810((byte) 121, class191.field3761 + var5);
            class141.field2621.method801(class179.field3489 + var2, (byte) 87);
        }
        if (var3 == 15) {
            class199.method1304(arg0 ^ 0x27, var5, var2, var4);
            class41.field769++;
            class141.field2621.method1024(185, (byte) -94);
            class141.field2621.method828((byte) -61, class191.field3761 + var5);
            class141.field2621.method810((byte) 120, var4 >> 14 & 0x7FFF);
            class141.field2621.method828((byte) -61, var2 + class179.field3489);
        }
        if (var3 == 24) {
            class197 var25 = class54.field992[var4];
            if (var25 != null) {
                class32.field675++;
                class161.method1037(false, -17868, class4.field79.field3734[0], var25.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var25.field3729[0], 1);
                class2.field47 = 2;
                class121.field2229 = class42.field796;
                class65.field1205 = class178.field3480;
                class107.field1964 = 0;
                class141.field2621.method1024(238, (byte) -94);
                class141.field2621.method801(var4, (byte) 87);
                class141.field2621.method797(class91.field1679, false);
                class141.field2621.method810((byte) 120, class125.field2291);
                class141.field2621.method802((byte) 64, class176.field3454);
            }
        }
        if (var3 == 16) {
            boolean var26 = class161.method1037(false, -17868, class4.field79.field3734[0], var2, 2, 0, class4.field79.field3729[0], 0, 0, 0, var5, 0);
            if (!var26) {
                class161.method1037(false, arg0 ^ 0xFFFFBA25, class4.field79.field3734[0], var2, 2, 1, class4.field79.field3729[0], 0, 0, 0, var5, 1);
            }
            class2.field47 = 2;
            class121.field2229 = class42.field796;
            class65.field1205 = class178.field3480;
            class107.field1964 = 0;
            class165.field3167++;
            class141.field2621.method1024(59, (byte) -94);
            class141.field2621.method797(class191.field3761 + var5, false);
            class141.field2621.method801(class179.field3489 + var2, (byte) 87);
            class141.field2621.method797(var4, false);
        }
        if (var3 == 5) {
            class197 var28 = class54.field992[var4];
            if (var28 != null) {
                class143.field2668++;
                class161.method1037(false, -17868, class4.field79.field3734[0], var28.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var28.field3729[0], 1);
                class65.field1205 = class178.field3480;
                class2.field47 = 2;
                class121.field2229 = class42.field796;
                class107.field1964 = 0;
                class141.field2621.method1024(170, (byte) -94);
                class141.field2621.method828((byte) -61, var4);
                class141.field2621.method810((byte) 108, class6.field114);
                class141.field2621.method802((byte) 64, class134.field2517);
            }
        }
        if (var3 == 4) {
            class196 var29 = class65.field1213[var4];
            if (var29 != null) {
                class161.method1037(false, arg0 ^ 0xFFFFBA25, class4.field79.field3734[0], var29.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var29.field3729[0], 1);
                class121.field2229 = class42.field796;
                class2.field47 = 2;
                class142.field2643++;
                class107.field1964 = 0;
                class65.field1205 = class178.field3480;
                class141.field2621.method1024(100, (byte) -94);
                class141.field2621.method801(var4, (byte) 87);
            }
        }
        if (var3 == 49) {
            class196 var30 = class65.field1213[var4];
            if (var30 != null) {
                class120.field2207++;
                class161.method1037(false, arg0 - 17885, class4.field79.field3734[0], var30.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var30.field3729[0], 1);
                class107.field1964 = 0;
                class121.field2229 = class42.field796;
                class65.field1205 = class178.field3480;
                class2.field47 = 2;
                class141.field2621.method1024(119, (byte) -94);
                class141.field2621.method828((byte) -61, var4);
            }
        }
        if (var3 == 46) {
            class196 var31 = class65.field1213[var4];
            if (var31 != null) {
                class161.method1037(false, arg0 ^ 0xFFFFBA25, class4.field79.field3734[0], var31.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var31.field3729[0], 1);
                class80.field1478++;
                class2.field47 = 2;
                class65.field1205 = class178.field3480;
                class107.field1964 = 0;
                class121.field2229 = class42.field796;
                class141.field2621.method1024(246, (byte) -94);
                class141.field2621.method797(var4, false);
            }
        }
        if (var3 == 31) {
            class197 var32 = class54.field992[var4];
            if (var32 != null) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var32.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var32.field3729[0], 1);
                class180.field3495++;
                class65.field1205 = class178.field3480;
                class107.field1964 = 0;
                class121.field2229 = class42.field796;
                class2.field47 = 2;
                class141.field2621.method1024(207, (byte) -94);
                class141.field2621.method801(var4, (byte) 87);
            }
        }
        if (var3 == 14) {
            class199.method1304(71, var5, var2, var4);
            class158.field3024++;
            class141.field2621.method1024(239, (byte) -94);
            class141.field2621.method801(var5 + class191.field3761, (byte) 87);
            class141.field2621.method810((byte) 119, class179.field3489 + var2);
            class141.field2621.method801(var4 >> 14 & 0x7FFF, (byte) 87);
        }
        if (var3 == 39) {
            class141.field2621.method1024(88, (byte) -94);
            class85.field1556++;
            class141.field2621.method802((byte) 64, var5);
            class141.field2621.method797(var2, false);
            class141.field2621.method828((byte) -61, var4);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 44) {
            class150 var33 = class62.method385((byte) 41, var5);
            boolean var34 = true;
            if (var33.field2872 > 0) {
                var34 = class142.method943((byte) 32, var33);
            }
            if (var34) {
                class141.field2621.method1024(235, (byte) -94);
                class141.field2621.method802((byte) 64, var5);
                class28.field567++;
            }
        }
        if (var3 == 34) {
            class196 var35 = class65.field1213[var4];
            if (var35 != null) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var35.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var35.field3729[0], 1);
                class2.field47 = 2;
                class65.field1205 = class178.field3480;
                class185.field3621++;
                class107.field1964 = 0;
                class121.field2229 = class42.field796;
                class141.field2621.method1024(6, (byte) -94);
                class141.field2621.method801(var4, (byte) 87);
            }
        }
        if (var3 == 35 && class199.method1304(123, var5, var2, var4)) {
            class4.field83++;
            class141.field2621.method1024(85, (byte) -94);
            class141.field2621.method797(class91.field1679, false);
            class141.field2621.method810((byte) 118, class125.field2291);
            class141.field2621.method797(var4 >> 14 & 0x7FFF, false);
            class141.field2621.method828((byte) -61, class179.field3489 + var2);
            class141.field2621.method810((byte) 113, var5 + class191.field3761);
            class141.field2621.method774(99, class176.field3454);
        }
        if (var3 == 6) {
            class155.field2985++;
            boolean var36 = class161.method1037(false, arg0 ^ 0xFFFFBA25, class4.field79.field3734[0], var2, 2, 0, class4.field79.field3729[0], 0, 0, 0, var5, 0);
            if (!var36) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var2, 2, 1, class4.field79.field3729[0], 0, 0, 0, var5, 1);
            }
            class107.field1964 = 0;
            class2.field47 = 2;
            class121.field2229 = class42.field796;
            class65.field1205 = class178.field3480;
            class141.field2621.method1024(54, (byte) -94);
            class141.field2621.method801(var4, (byte) 87);
            class141.field2621.method810((byte) 121, class191.field3761 + var5);
            class141.field2621.method801(class179.field3489 + var2, (byte) 87);
        }
        if (var3 == 1003) {
            class37.field722++;
            class199.method1304(arg0 ^ 0x76, var5, var2, var4);
            class141.field2621.method1024(134, (byte) -94);
            class141.field2621.method801(class179.field3489 + var2, (byte) 87);
            class141.field2621.method801(var4 >> 14 & 0x7FFF, (byte) 87);
            class141.field2621.method797(var5 + class191.field3761, false);
        }
        if (var3 == 45) {
            class196 var38 = class65.field1213[var4];
            if (var38 != null) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var38.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var38.field3729[0], 1);
                class121.field2229 = class42.field796;
                class76.field1434++;
                class107.field1964 = 0;
                class2.field47 = 2;
                class65.field1205 = class178.field3480;
                class141.field2621.method1024(203, (byte) -94);
                class141.field2621.method828((byte) -61, var4);
            }
        }
        if (var3 == 22) {
            class28.field567++;
            class141.field2621.method1024(235, (byte) -94);
            class141.field2621.method802((byte) 64, var5);
            class150 var39 = class62.method385((byte) 41, var5);
            if (var39.field2890 != null && var39.field2890[0][0] == 5) {
                int var40 = var39.field2890[0][1];
                class6.field119[var40] = 1 - class6.field119[var40];
                class63.method389(arg0 ^ 0x5C8D, var40);
            }
        }
        if (var3 == 1006) {
            class2.field47 = 2;
            class121.field2229 = class42.field796;
            class65.field1205 = class178.field3480;
            class107.field1964 = 0;
            class197 var41 = class54.field992[var4];
            if (var41 != null) {
                class175 var42 = var41.field3872;
                if (var42.field3430 != null) {
                    var42 = var42.method1173((byte) 108);
                }
                if (var42 != null) {
                    class94.field1758++;
                    class141.field2621.method1024(13, (byte) -94);
                    class141.field2621.method797(var42.field3404, false);
                }
            }
        }
        if (var3 == 32) {
            class9.field241++;
            class199.method1304(64, var5, var2, var4);
            class141.field2621.method1024(200, (byte) -94);
            class141.field2621.method828((byte) -61, var4 >> 14 & 0x7FFF);
            class141.field2621.method797(class191.field3761 + var5, false);
            class141.field2621.method828((byte) -61, class179.field3489 + var2);
        }
        if (var3 == 28) {
            class196 var43 = class65.field1213[var4];
            if (var43 != null) {
                class31.field665++;
                class161.method1037(false, -17868, class4.field79.field3734[0], var43.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var43.field3729[0], 1);
                class2.field47 = 2;
                class121.field2229 = class42.field796;
                class65.field1205 = class178.field3480;
                class107.field1964 = 0;
                class141.field2621.method1024(181, (byte) -94);
                class141.field2621.method828((byte) -61, var4);
            }
        }
        if (var3 == 40) {
            class196.field3840.method879(class61.field1132, var2, var5);
        }
        if (var3 == 1) {
            class196.field3871++;
            boolean var44 = class161.method1037(false, -17868, class4.field79.field3734[0], var2, 2, 0, class4.field79.field3729[0], 0, 0, 0, var5, 0);
            if (!var44) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var2, 2, 1, class4.field79.field3729[0], 0, 0, 0, var5, 1);
            }
            class65.field1205 = class178.field3480;
            class2.field47 = 2;
            class121.field2229 = class42.field796;
            class107.field1964 = 0;
            class141.field2621.method1024(145, (byte) -94);
            class141.field2621.method828((byte) -61, class179.field3489 + var2);
            class141.field2621.method810((byte) 105, class6.field114);
            class141.field2621.method789(-373, class134.field2517);
            class141.field2621.method810((byte) 100, class191.field3761 + var5);
            class141.field2621.method828((byte) -61, var4);
        }
        if (var3 == 1005) {
            class2.field47 = 2;
            class111.field2029++;
            class107.field1964 = 0;
            class65.field1205 = class178.field3480;
            class121.field2229 = class42.field796;
            class141.field2621.method1024(62, (byte) -94);
            class141.field2621.method801(var4, (byte) 87);
        }
        if (var3 == 57) {
            class141.field2621.method1024(167, (byte) -94);
            class141.field2621.method828((byte) -61, class6.field114);
            class141.field2621.method810((byte) 120, var2);
            class141.field2621.method808((byte) 127, class134.field2517);
            class126.field2307++;
            class141.field2621.method789(-373, var5);
        }
        if (arg0 != 17) {
            field1112 = null;
        }
        if (var3 == 13) {
            class88.field1605++;
            class141.field2621.method1024(213, (byte) -94);
            class141.field2621.method802((byte) 64, class176.field3454);
            class141.field2621.method810((byte) 127, class91.field1679);
            class141.field2621.method828((byte) -61, class125.field2291);
            class141.field2621.method801(var4, (byte) 87);
            class141.field2621.method801(var2, (byte) 87);
            class141.field2621.method802((byte) 64, var5);
            class95.field1807 = 0;
            class128.field2398 = class62.method385((byte) 41, var5);
            class73.field1370 = var2;
        }
        if (var3 == 58) {
            class196 var46 = class65.field1213[var4];
            if (var46 != null) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var46.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var46.field3729[0], 1);
                class65.field1205 = class178.field3480;
                class175.field3388++;
                class107.field1964 = 0;
                class2.field47 = 2;
                class121.field2229 = class42.field796;
                class141.field2621.method1024(123, (byte) -94);
                class141.field2621.method810((byte) 116, var4);
            }
        }
        if (var3 == 18) {
            class150 var47 = class121.method755(var5, -5207, var2);
            if (var47 != null) {
                class188.method1239((byte) 27);
                class93.method542(var2, var5, 8249, class44.method278(arg0 ^ 0x1FDE6, class70.method436(var47, arg0 + 49)));
                class141.field2630 = 0;
                class137.field2551 = class148.method963(arg0 ^ 0xEE, var47);
                if (class137.field2551 == null) {
                    class137.field2551 = class35.field706;
                }
                if (var47.field2778) {
                    class21.field455 = class165.method1058(arg0 - 17, new class169[] { var47.field2891, class164.field3147 });
                    return;
                }
                class21.field455 = class165.method1058(arg0 - 17, new class169[] { class115.field2125, var47.field2774, class164.field3147 });
            }
            return;
        }
        if (var3 == 1001) {
            class107.field1964 = 0;
            class2.field47 = 2;
            class6.field123++;
            class121.field2229 = class42.field796;
            class65.field1205 = class178.field3480;
            class141.field2621.method1024(122, (byte) -94);
            class141.field2621.method801(var4 >> 14 & 0x7FFF, (byte) 87);
        }
        if (class141.field2630 != 0) {
            class141.field2630 = 0;
            class64.method404(101, class62.method385((byte) 41, class176.field3454));
        }
        if (class17.field380) {
            class188.method1239((byte) 27);
        }
        if (class128.field2398 != null && class95.field1807 == 0) {
            class64.method404(110, class128.field2398);
        }
    }

    @OriginalMember(owner = "client!ge", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1110++;
        if (class95.field1781 != null) {
            class9.field245 = 0;
            class87.field1593 = arg0.getX();
            class193.field3810 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ge", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class95.field1781 != null) {
            class25.field521 = 0;
        }
        field1114++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method376(int arg0) {
        field1115 = null;
        if (arg0 != 0) {
            field1121 = 44;
        }
        field1112 = null;
    }

    @OriginalMember(owner = "client!ge", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class95.field1781 != null) {
            class9.field245 = 0;
            class25.field521 = 0;
        }
        field1109++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ge", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1113++;
        if (class95.field1781 != null) {
            class9.field245 = 0;
            class87.field1593 = arg0.getX();
            class193.field3810 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ge", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class95.field1781 != null) {
            class9.field245 = 0;
            class87.field1593 = -1;
            class193.field3810 = -1;
        }
        field1111++;
    }

    @OriginalMember(owner = "client!ge", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1116++;
    }

    @OriginalMember(owner = "client!ge", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1122++;
        if (class95.field1781 != null) {
            class9.field245 = 0;
            class87.field1593 = arg0.getX();
            class193.field3810 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JZ)V")
    public static final void method377(long arg0, boolean arg1) {
        field1118++;
        if (arg0 == 0L) {
            return;
        }
        if (class57.field1064 >= 100 && class172.field3336 != 1 || class57.field1064 >= 200) {
            class199.method1307((byte) 118, class45.field838, class86.field1587, 0);
            return;
        }
        class169 var3 = class123.method762(78, arg0).method1127((byte) -124);
        for (int var4 = 0; var4 < class57.field1064; var4++) {
            if (class142.field2640[var4] == arg0) {
                class199.method1307((byte) 125, class45.field838, class165.method1058(0, new class169[] { var3, class121.field2223 }), 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class206.field4052; var5++) {
            if (class82.field1513[var5] == arg0) {
                class199.method1307((byte) 122, class45.field838, class165.method1058(0, new class169[] { class114.field2080, var3, class149.field2752 }), 0);
                return;
            }
        }
        if (var3.method1121(class4.field79.field3856, 82)) {
            class199.method1307((byte) 118, class45.field838, class182.field3556, 0);
        } else if (!arg1) {
            class32.field670++;
            class137.field2553[class57.field1064] = var3;
            class142.field2640[class57.field1064] = arg0;
            class11.field273[class57.field1064] = 0;
            class192.field3801[class57.field1064] = 0;
            class57.field1064++;
            class8.field215 = class58.field1078;
            class141.field2621.method1024(130, (byte) -94);
            class141.field2621.method816(arg0, -16701);
        }
    }

    @OriginalMember(owner = "client!ge", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1120++;
    }

    @OriginalMember(owner = "client!ge", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class95.field1781 != null) {
            class9.field245 = 0;
            class162.field3112 = arg0.getX();
            class16.field342 = arg0.getY();
            class202.field3963 = class116.method712((byte) -52);
            if (arg0.isMetaDown()) {
                class90.field1651 = 2;
                class25.field521 = 2;
            } else {
                class90.field1651 = 1;
                class25.field521 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1108++;
    }
}
