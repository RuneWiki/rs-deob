import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class71 {

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
    public static int[] field8972 = new int[2];

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field8977;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field8976;

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method3568(int arg0) {
        if (!class501.field6954.field7846) {
            for (int var2 = 0; var2 < class176.field2273; var2++) {
                if (class391.field5426[var2].method692(true) == 's' || class391.field5426[var2].method692(true) == 'S') {
                    class501.field6954.field7846 = true;
                    break;
                }
            }
        }
        int var3 = 14 % ((arg0 - 17) / 41);
        field8967++;
        if (class562.field7853 == 0) {
            Runtime var4 = Runtime.getRuntime();
            int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            long var6 = class348.method2175(-122);
            if (class99.field1321 == 0L) {
                class99.field1321 = var6;
            }
            if (var5 > 16384 && (var6 - class99.field1321) < 5000L) {
                if ((var6 - class56.field748) > 1000L) {
                    System.gc();
                    class56.field748 = var6;
                }
                class26.field448 = class164.field2077.method2157(class245.field3103, 4074);
                class555.field7762 = 5;
            } else {
                class26.field448 = class599.field8652.method2157(class245.field3103, 4074);
                class562.field7853 = 10;
                class555.field7762 = 5;
            }
        } else if (class562.field7853 == 10) {
            for (int var8 = 0; var8 < 4; var8++) {
                class15.field154[var8] = class633.method3663(class369.field5135, false, class139.field1760);
            }
            class26.field448 = class350.field4810.method2157(class245.field3103, 4074);
            class555.field7762 = 10;
            class562.field7853 = 20;
        } else if (class562.field7853 == 20) {
            if (class466.field6612 == null) {
                class466.field6612 = new class125(class488.field6797, class244.field3086, class135.field1653, class199.field2601);
            }
            if (class466.field6612.method671(false)) {
                class293.field3813 = class402.method2408(0, 1, false, false, true);
                class260.field3215 = class402.method2408(1, 1, false, false, true);
                class544.field7588 = class402.method2408(2, 1, false, false, true);
                class135.field1650 = class402.method2408(3, 1, false, false, true);
                class35.field547 = class402.method2408(4, 1, false, false, true);
                class277.field3612 = class402.method2408(5, 1, true, false, true);
                class251.field3143 = class402.method2408(6, 1, true, false, false);
                class245.field3104 = class402.method2408(7, 1, false, false, true);
                class24.field433 = class402.method2408(8, 1, false, false, true);
                class426.field5766 = class402.method2408(9, 1, false, false, true);
                class34.field517 = class402.method2408(10, 1, false, false, true);
                class130.field1602 = class402.method2408(11, 1, false, false, true);
                class29.field466 = class402.method2408(12, 1, false, false, true);
                class532.field7434 = class402.method2408(13, 1, false, false, true);
                class592.field8546 = class402.method2408(14, 1, false, false, false);
                class546.field7612 = class402.method2408(15, 1, false, false, true);
                class193.field2508 = class402.method2408(16, 1, false, false, true);
                class136.field1666 = class402.method2408(17, 1, false, false, true);
                class239.field3056 = class402.method2408(18, 1, false, false, true);
                class98.field1317 = class402.method2408(19, 1, false, false, true);
                class558.field7809 = class402.method2408(20, 1, false, false, true);
                class431.field5876 = class402.method2408(21, 1, false, false, true);
                class20.field294 = class402.method2408(22, 1, false, false, true);
                class154.field2007 = class402.method2408(23, 1, true, false, true);
                class540.field7558 = class402.method2408(24, 1, false, false, true);
                class480.field6727 = class402.method2408(25, 1, false, false, true);
                class107.field1383 = class402.method2408(26, 1, true, false, true);
                class580.field8084 = class402.method2408(27, 1, false, false, true);
                class468.field6640 = class402.method2408(28, 1, true, false, true);
                class558.field7807 = class402.method2408(29, 1, false, false, true);
                class628.field9176 = class402.method2408(30, 1, true, false, true);
                class615.field8870 = class402.method2408(31, 1, true, false, true);
                class26.field448 = class429.field5848.method2157(class245.field3103, 4074);
                class555.field7762 = 15;
                class562.field7853 = 30;
            } else {
                class26.field448 = class613.field8820.method2157(class245.field3103, 4074);
                class555.field7762 = 12;
            }
        } else if (class562.field7853 == 30) {
            int var9 = 0;
            for (int var10 = 0; var10 < 32; var10++) {
                var9 += class172.field2232[var10].method1459((byte) -1) * class553.field7741[var10] / 100;
            }
            if (var9 == 100) {
                class26.field448 = class249.field3124.method2157(class245.field3103, 4074);
                class555.field7762 = 20;
                class426.method2500(class24.field433, 73);
                class643.method3711((byte) 70, class24.field433);
                class562.field7853 = 35;
            } else {
                if (var9 != 0) {
                    class26.field448 = class453.field6426.method2157(class245.field3103, 4074) + var9 + "%";
                }
                class555.field7762 = 20;
            }
        } else if (class562.field7853 == 35) {
            class543.method3008(class31.field488, -128, class628.field9176);
            class26.field448 = class255.field3168.method2157(class245.field3103, 4074);
            class562.field7853 = 40;
            class555.field7762 = 20;
        } else if (class562.field7853 == 40) {
            if (class468.field6640.method2059(23233)) {
                this.method3585(-97, class468.field6640.method2076(1, 1));
                this.method3571(-46, class468.field6640.method2076(1, 3));
                if (class491.field6867 == -1 || class245.field3104.method2051(0, class491.field6867, -55)) {
                    class26.field448 = class287.field3755.method2157(class245.field3103, 4074);
                    class562.field7853 = 41;
                    class555.field7762 = 25;
                }
            } else {
                class26.field448 = class101.field1343.method2157(class245.field3103, 4074) + class468.field6640.method2050(true) + "%";
                class555.field7762 = 25;
            }
        } else if (class562.field7853 == 41) {
            int var11 = class102.method564("jaggl", -1);
            if (var11 >= 0 && var11 < 100) {
                class26.field448 = class341.field4739.method2157(class245.field3103, 4074) + var11 + "%";
                class555.field7762 = 25;
            } else {
                class26.field448 = class111.field1438.method2157(class245.field3103, 4074);
                class555.field7762 = 25;
                class562.field7853 = 42;
            }
        } else if (class562.field7853 == 42) {
            int var12 = class102.method564("jagdx", -1);
            if (var12 >= 0 && var12 < 100) {
                class26.field448 = class15.field165.method2157(class245.field3103, 4074) + var12 + "%";
                class555.field7762 = 25;
            } else {
                class26.field448 = class65.field871.method2157(class245.field3103, 4074);
                class562.field7853 = 43;
                class555.field7762 = 25;
            }
        } else if (class562.field7853 == 43) {
            int var13 = class102.method564("jagmisc", -1);
            if (var13 >= 0 && var13 < 100) {
                class26.field448 = class548.field7631.method2157(class245.field3103, 4074) + var13 + "%";
                class555.field7762 = 25;
            } else {
                if (var13 == 100) {
                    this.method409((byte) -121);
                }
                class26.field448 = class450.field6369.method2157(class245.field3103, 4074);
                class562.field7853 = 44;
                class555.field7762 = 25;
            }
        } else if (class562.field7853 == 44) {
            int var14 = class102.method564("sw3d", -1);
            if (var14 >= 0 && var14 < 100) {
                class26.field448 = class92.field1227.method2157(class245.field3103, 4074) + var14 + "%";
                class555.field7762 = 25;
            } else {
                class26.field448 = class410.field5635.method2157(class245.field3103, 4074);
                class562.field7853 = 45;
                class555.field7762 = 25;
            }
        } else if (class562.field7853 == 45) {
            int var15 = class102.method564("jaclib", -1);
            if (var15 >= 0 && var15 < 100) {
                class26.field448 = class365.field5100.method2157(class245.field3103, 4074) + var15 + "%";
                class555.field7762 = 25;
            } else {
                if (var15 == 100) {
                    this.method407((byte) 111);
                }
                class26.field448 = class625.field9041.method2157(class245.field3103, 4074);
                class562.field7853 = 46;
                class555.field7762 = 25;
            }
        } else if (class562.field7853 == 46) {
            int var16 = class102.method564("hw3d", -1);
            if (var16 >= 0 && var16 < 100) {
                class26.field448 = class512.field7130.method2157(class245.field3103, 4074) + var16 + "%";
                class555.field7762 = 25;
            } else {
                class26.field448 = class487.field6794.method2157(class245.field3103, 4074);
                class562.field7853 = 47;
                class555.field7762 = 25;
            }
        } else if (class562.field7853 == 47) {
            if (class615.field8870.method2059(23233)) {
                class26.field448 = class603.field8707.method2157(class245.field3103, 4074);
                class555.field7762 = 25;
                class562.field7853 = 50;
            } else {
                class26.field448 = class85.field1151.method2157(class245.field3103, 4074);
                class555.field7762 = 25;
            }
        } else if (class562.field7853 == 50) {
            class2.method4(false);
            class26.field448 = class315.field4353.method2157(class245.field3103, 4074);
            class555.field7762 = 30;
            class562.field7853 = 60;
        } else if (class562.field7853 == 60) {
            int var17 = class456.method2646(class532.field7434, 0, class24.field433);
            int var18 = class550.method3028(0);
            if (var17 < var18) {
                class26.field448 = class528.field7371.method2157(class245.field3103, 4074) + var17 * 100 / var18 + "%";
                class555.field7762 = 35;
            } else {
                class26.field448 = class32.field490.method2157(class245.field3103, 4074);
                class555.field7762 = 35;
                class562.field7853 = 70;
            }
        } else if (class562.field7853 == 70) {
            int var19 = class110.method596(1, class24.field433);
            int var20 = class637.method3671(true);
            if (var19 < var20) {
                class26.field448 = class131.field1614.method2157(class245.field3103, 4074) + var19 * 100 / var20 + "%";
                class555.field7762 = 40;
            } else {
                class26.field448 = class50.field684.method2157(class245.field3103, 4074);
                class562.field7853 = 80;
                class555.field7762 = 40;
            }
        } else if (class562.field7853 == 80) {
            if (class107.field1383.method2059(23233)) {
                class555.field7756 = new class341(class107.field1383, class426.field5766, class24.field433);
                class26.field448 = class284.field3705.method2157(class245.field3103, 4074);
                class562.field7853 = 90;
                class555.field7762 = 45;
            } else {
                class26.field448 = class35.field525.method2157(class245.field3103, 4074) + class107.field1383.method2050(true) + "%";
                class555.field7762 = 45;
            }
        } else if (class562.field7853 == 90) {
            class26.field448 = class134.field1638.method2157(class245.field3103, 4074);
            class562.field7853 = 95;
            class555.field7762 = 50;
        } else if (class562.field7853 == 95) {
            if (class501.field6954.field7846) {
                class501.field6954.field7849 = 0;
                class501.field6954.field7835 = 1;
                class501.field6954.field7855 = 0;
                class501.field6954.field7865 = 0;
                class501.field6954.field7858 = 0;
            }
            class501.field6954.field7846 = true;
            class501.field6954.method3537(90, class31.field488);
            class190.method1215(class501.field6954.field7849, false, (byte) -63);
            class26.field448 = class516.field7202.method2157(class245.field3103, 4074);
            class555.field7762 = 55;
            class562.field7853 = 100;
        } else if (class562.field7853 == 100) {
            class509.method2845(class301.field3918, 67, class24.field433, class532.field7434);
            class26.field448 = class39.field588.method2157(class245.field3103, 4074);
            class555.field7762 = 60;
            class597.method3438((byte) 124, 1);
            class562.field7853 = 110;
        } else if (class562.field7853 == 110) {
            class544.field7588.method2059(23233);
            byte var21 = 0;
            int var22 = var21 + class544.field7588.method2050(true);
            class193.field2508.method2059(23233);
            int var23 = var22 + class193.field2508.method2050(true);
            class136.field1666.method2059(23233);
            int var24 = var23 + class136.field1666.method2050(true);
            class239.field3056.method2059(23233);
            int var25 = var24 + class239.field3056.method2050(true);
            class98.field1317.method2059(23233);
            int var26 = var25 + class98.field1317.method2050(true);
            class558.field7809.method2059(23233);
            int var27 = var26 + class558.field7809.method2050(true);
            class431.field5876.method2059(23233);
            int var28 = var27 + class431.field5876.method2050(true);
            class20.field294.method2059(23233);
            int var29 = var28 + class20.field294.method2050(true);
            class540.field7558.method2059(23233);
            int var30 = var29 + class540.field7558.method2050(true);
            class480.field6727.method2059(23233);
            int var31 = var30 + class480.field6727.method2050(true);
            class580.field8084.method2059(23233);
            int var32 = var31 + class580.field8084.method2050(true);
            class558.field7807.method2059(23233);
            int var33 = var32 + class558.field7807.method2050(true);
            if (var33 < 1200) {
                class26.field448 = class351.field4939.method2157(class245.field3103, 4074) + var33 / 12 + "%";
                class555.field7762 = 65;
            } else {
                class132.field1621 = new class24(class26.field453, class245.field3103, class544.field7588);
                class217.field2772 = new class233(class26.field453, class245.field3103, class544.field7588);
                class104.field1365 = new class117(class26.field453, class245.field3103, class544.field7588, class24.field433);
                class292.field3790 = new class639(class26.field453, class245.field3103, class136.field1666);
                class552.field7724 = new class552(class26.field453, class245.field3103, class544.field7588);
                class39.field585 = new class166(class26.field453, class245.field3103, class544.field7588);
                class10.field104 = new class478(class26.field453, class245.field3103, class544.field7588, class245.field3104);
                class459.field6559 = new class603(class26.field453, class245.field3103, class544.field7588);
                class192.field2492 = new class207(class26.field453, class245.field3103, class544.field7588);
                class626.field9084 = new class177(class26.field453, class245.field3103, true, class193.field2508, class245.field3104);
                class494.field6893 = new class256(class26.field453, class245.field3103, class544.field7588, class24.field433);
                class376.field5232 = new class419(class26.field453, class245.field3103, class544.field7588, class24.field433);
                class579.field8053 = new class627(class26.field453, class245.field3103, true, class239.field3056, class245.field3104);
                class98.field1307 = new class586(class26.field453, class245.field3103, true, class132.field1621, class98.field1317, class245.field3104);
                class33.field508 = new class98(class26.field453, class245.field3103, class544.field7588);
                class609.field8754 = new class97(class26.field453, class245.field3103, class558.field7809, class293.field3813, class260.field3215);
                class1.field5 = new class234(class26.field453, class245.field3103, class544.field7588);
                class369.field5136 = new class173(class26.field453, class245.field3103, class544.field7588);
                class410.field5636 = new class60(class26.field453, class245.field3103, class431.field5876, class245.field3104);
                class452.field6400 = new class128(class26.field453, class245.field3103, class544.field7588);
                class109.field1409 = new class43(class26.field453, class245.field3103, class544.field7588);
                class550.field7650 = new class354(class26.field453, class245.field3103, class544.field7588);
                class643.field9328 = new class202(class26.field453, class245.field3103, class20.field294);
                class642.field9326 = new class590(class26.field453, class245.field3103, class544.field7588);
                class70.method401(19498, class532.field7434, class245.field3104, class135.field1650, class24.field433);
                class414.method2466(class558.field7807, -23561);
                class181.field2328 = new class389(class245.field3103, class540.field7558, class480.field6727);
                class548.field7632 = new class227(class245.field3103, class540.field7558, class480.field6727, new class418());
                class26.field448 = class331.field4579.method2157(class245.field3103, 4074);
                class555.field7762 = 65;
                class409.method2438((byte) -5);
                class626.field9084.method1090(!class501.field6954.method3539(class428.field5845, 2), 30);
                class257.field3191 = new class391();
                class113.method609(0);
                class464.method2677(class580.field8084, (byte) 67);
                class413.method2464(class555.field7756, class245.field3104, -122);
                class562.field7853 = 120;
            }
        } else if (class562.field7853 == 120) {
            int var34 = class174.method1069(-96, class24.field433);
            int var35 = class497.method2790(16);
            if (var35 > var34) {
                class26.field448 = class385.field5362.method2157(class245.field3103, 4074) + var34 * 100 / var35 + "%";
                class555.field7762 = 70;
            } else {
                class84.method475(class301.field3918, class24.field433, 0);
                class164.method890((byte) -126, class44.field632);
                class26.field448 = class362.field5081.method2157(class245.field3103, 4074);
                class555.field7762 = 70;
                class562.field7853 = 130;
            }
        } else if (class562.field7853 == 130) {
            if (class34.field517.method2060("huffman", -113, "")) {
                class466 var36 = new class466(class34.field517.method2045("", (byte) -22, "huffman"));
                class409.method2441(true, var36);
                class26.field448 = class505.field7019.method2157(class245.field3103, 4074);
                class555.field7762 = 75;
                class562.field7853 = 140;
            } else {
                class26.field448 = class151.field1989.method2157(class245.field3103, 4074) + "0%";
                class555.field7762 = 75;
            }
        } else if (class562.field7853 == 140) {
            if (class135.field1650.method2059(23233)) {
                class26.field448 = class264.field3370.method2157(class245.field3103, 4074);
                class555.field7762 = 80;
                class562.field7853 = 150;
            } else {
                class26.field448 = class263.field3360.method2157(class245.field3103, 4074) + class135.field1650.method2050(true) + "%";
                class555.field7762 = 80;
            }
        } else if (class562.field7853 == 150) {
            if (class29.field466.method2059(23233)) {
                class26.field448 = class140.field1786.method2157(class245.field3103, 4074);
                class562.field7853 = 160;
                class555.field7762 = 82;
            } else {
                class26.field448 = class321.field4436.method2157(class245.field3103, 4074) + class29.field466.method2050(true) + "%";
                class555.field7762 = 82;
            }
        } else if (class562.field7853 == 160) {
            if (class532.field7434.method2059(23233)) {
                class26.field448 = class332.field4583.method2157(class245.field3103, 4074);
                class555.field7762 = 85;
                class562.field7853 = 170;
            } else {
                class26.field448 = class332.field4583.method2157(class245.field3103, 4074) + class532.field7434.method2050(true) + "%";
                class555.field7762 = 85;
            }
        } else if (class562.field7853 == 170) {
            if (class154.field2007.method2072("details", false)) {
                class614.method3510(class154.field2007, class552.field7724, class39.field585, class626.field9084, class494.field6893, class376.field5232, class257.field3191);
                class26.field448 = class197.field2566.method2157(class245.field3103, 4074);
                class555.field7762 = 89;
                class562.field7853 = 190;
            } else {
                class26.field448 = class419.field5720.method2157(class245.field3103, 4074) + class154.field2007.method2044("details", true) + "%";
                class555.field7762 = 87;
            }
        } else if (class562.field7853 == 190) {
            class36.field553 = new boolean[class550.field7650.field4960];
            class45.field644 = new String[class109.field1409.field623];
            class121.field1528 = new int[class550.field7650.field4960];
            for (int var37 = 0; var37 < class550.field7650.field4960; var37++) {
                if (class550.field7650.method2208(var37, (byte) 17).field3714 == 0) {
                    class36.field553[var37] = true;
                    class598.field8636++;
                }
                class121.field1528[var37] = -1;
            }
            class157.method857(4);
            class624.field9036 = class135.field1650.method2053((byte) 40, "loginscreen");
            class120.field1526 = class135.field1650.method2053((byte) 40, "lobbyscreen");
            class277.field3612.method2052(true, false, -128);
            class251.field3143.method2052(true, true, -81);
            class24.field433.method2052(true, true, -53);
            class532.field7434.method2052(true, true, -56);
            class34.field517.method2052(true, true, -48);
            class135.field1650.method2052(true, true, -106);
            class178.field2295 = true;
            class544.field7588.field4528 = 2;
            class136.field1666.field4528 = 2;
            class193.field2508.field4528 = 2;
            class239.field3056.field4528 = 2;
            class98.field1317.field4528 = 2;
            class558.field7809.field4528 = 2;
            class431.field5876.field4528 = 2;
            class459.method2662(class501.field6954.field7835, false, 91, -1, -1);
            class26.field448 = class434.field5899.method2157(class245.field3103, 4074);
            class555.field7762 = 95;
            class562.field7853 = 200;
        } else if (class562.field7853 == 200) {
            class597.method3438((byte) 124, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method414(int arg0) {
        field8962++;
        if (class184.field2351) {
            class23.method138(1);
        }
        if (class301.field3918 != null) {
            class301.field3918.method920(arg0 ^ 0xFFFFFB3A);
        }
        if (class558.field7815 != null) {
            class334.method2126(class558.field7815, 77, class31.field488);
            class558.field7815 = null;
        }
        if (class96.field1294 != null) {
            class96.field1294.method3271((byte) 110);
            class96.field1294 = null;
        }
        class241.method1497(arg0 ^ 0xFFFFFB7E);
        class488.field6797.method744(true);
        class244.field3086.method2455(true);
        if (class640.field9293 != null) {
            class640.field9293.method230(1000);
            class640.field9293 = null;
        }
        if (arg0 != 1200) {
            method3588();
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method3569(int arg0) {
        field8965++;
        if (arg0 == 256) {
            boolean var2 = class488.field6797.method753((byte) -61);
            if (!var2) {
                this.method3586(arg0 + 2744);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljq;)Ljq;")
    public static final class447 method3570(class447 arg0) {
        int var1 = method3572(arg0).method2765((byte) -42);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class609.method3486(arg0.field6244, 983030160);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method419(int arg0) {
        field8964++;
        if (arg0 >= -24) {
            return;
        }
        if (class428.field5845 != 2) {
            this.method3581(1);
            return;
        }
        try {
            this.method3581(1);
        } catch (Throwable var3) {
            class447.method2602(var3, 78, var3.getMessage() + " (Recovered) " + this.method404(-15238));
            class293.method1796(0, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method412(boolean arg0) {
        if (class224.field2866) {
            class282.field3697 = 64;
        }
        field8958++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class522.method2916(arg0);
        class244.field3086 = new class411(class31.field488);
        class488.field6797 = new class140();
        if (class628.field9174 != class602.field8701) {
            class184.field2354 = new byte[50][];
        }
        class501.field6954 = new class618(class31.field488);
        if (class628.field9174 == class602.field8701) {
            class302.field3920.field3700 = this.getCodeBase().getHost();
        } else if (class238.method1492(class602.field8701, (byte) -114)) {
            class302.field3920.field3700 = this.getCodeBase().getHost();
            class302.field3920.field3707 = class302.field3920.field3702 + 40000;
            class15.field164.field3707 = class15.field164.field3702 + 40000;
            class302.field3920.field3708 = class302.field3920.field3702 + 50000;
            class540.field7557.field3707 = class540.field7557.field3702 + 40000;
            class15.field164.field3708 = class15.field164.field3702 + 50000;
            class540.field7557.field3708 = class540.field7557.field3702 + 50000;
        } else if (class602.field8701 == class265.field3394) {
            class302.field3920.field3700 = "127.0.0.1";
            class15.field164.field3700 = "127.0.0.1";
            class302.field3920.field3707 = class302.field3920.field3702 + 40000;
            class540.field7557.field3700 = "127.0.0.1";
            class15.field164.field3707 = class15.field164.field3702 + 40000;
            class302.field3920.field3708 = class302.field3920.field3702 + 50000;
            class540.field7557.field3707 = class540.field7557.field3702 + 40000;
            class15.field164.field3708 = class15.field164.field3702 + 50000;
            class540.field7557.field3708 = class540.field7557.field3702 + 50000;
        }
        class78.field1058 = class302.field3920;
        if (class532.field7433 == class26.field453) {
            class20.field290 = class55.field738;
            class370.field5162 = 0;
            class592.field8560 = true;
            class235.field3008 = 16777215;
            class384.field5358 = class426.field5804;
            class18.field203 = class505.field7026;
            class227.field2910 = class550.field7646;
        } else {
            class227.field2910 = class119.field1512;
            class20.field290 = class209.field2714;
            class18.field203 = class235.field3024;
            class384.field5358 = class540.field7560;
        }
        if (class612.field8806 == class26.field453) {
            class319.field4402 = false;
        }
        class9.field86 = class214.field2752 = class626.field9121 = class224.field2867 = new short[256];
        class634.field9227 = class141.method765(111, class141.field1806);
        class343.field4760 = class281.method1753(true, 2, class141.field1806);
        class627.field9127 = class279.field3639;
        try {
            if (class31.field488.field3635 != null) {
                class173.field2238 = new class640(class31.field488.field3635, 5200, 0);
                for (int var3 = 0; var3 < 32; var3++) {
                    class452.field6395[var3] = new class640(class31.field488.field3653[var3], 6000, 0);
                }
                class534.field7449 = new class640(class31.field488.field3636, 6000, 0);
                class267.field3415 = new class120(255, class173.field2238, class534.field7449, 500000);
                class254.field3161 = new class640(class31.field488.field3646, 24, 0);
                class31.field488.field3635 = null;
                class31.field488.field3636 = null;
                class31.field488.field3653 = null;
                class31.field488.field3646 = null;
            }
        } catch (IOException var4) {
            class267.field3415 = null;
            class254.field3161 = null;
            class173.field2238 = null;
            class534.field7449 = null;
        }
        if (class628.field9174 != class602.field8701) {
            class248.field3119 = true;
        }
        if (class612.field8806 == class26.field453) {
            class373.field5188 = class225.field2872.method2157(class245.field3103, 4074);
        } else if (class532.field7433 == class26.field453) {
            class373.field5188 = class194.field2521.method2157(class245.field3103, 4074);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method3571(int arg0, byte[] arg1) {
        field8960++;
        class551 var3 = new class551(arg1);
        if (arg0 > -32) {
            this.method419(-126);
        }
        while (true) {
            int var4 = var3.method3045(-125);
            if (var4 == 0) {
                return;
            }
            if (var4 == 2) {
                class491.field6867 = var3.method3090(-90);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljq;)Lf;")
    public static final class493 method3572(class447 arg0) {
        class493 var1 = (class493) class395.field5459.method3476(((long) arg0.field6229 << 32) + (long) arg0.field6317, (byte) 28);
        return var1 == null ? arg0.field6220 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method3573(int arg0, int arg1) {
        class474.field6695 = -1;
        class236.field3031 = false;
        class341.field4743 = -1;
        class217.field2773 = null;
        if (arg1 <= 4) {
            field8972 = null;
        }
        field8957++;
        class148.field1917 = 0;
        class148.field1924 = arg0;
        class463.field6597 = 1;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method417(int arg0) {
        field8961++;
        method3583(87);
        class380.method2314(-29821);
        class52.method285(5);
        class632.method3654((byte) -86);
        class344.method2158(-26607);
        class85.method479(96);
        class330.method2079(false);
        class95.method522((byte) -3);
        class108.method590(8);
        class358.method2219((byte) -84);
        class607.method3479((byte) -2);
        class71.method408(1);
        class324.method2008(-1);
        class414.method2465((byte) -17);
        class401.method2404(-9549);
        if (arg0 > -63) {
            return;
        }
        class513.method2861((byte) -115);
        class105.method577(-1);
        class167.method908((byte) -106);
        class618.method3536(12557);
        class391.method2357((byte) 127);
        class568.method3189(-1);
        class140.method741((byte) 84);
        class411.method2458(16137);
        class125.method673(41);
        class329.method2049((byte) 111);
        class640.method3686((byte) -114);
        class58.method324(-257);
        class233.method1470(19458);
        class117.method647(true);
        class552.method3100(125);
        class166.method902((byte) 70);
        class478.method2711(false);
        class603.method3461(-15813);
        class207.method1320((byte) 0);
        class256.method1539(-9670);
        class419.method2484(256);
        class627.method3622((byte) 79);
        class586.method3385(0);
        class24.method149(-16894);
        class98.method547(0);
        class97.method534(100);
        class173.method1064((byte) 119);
        class60.method352(50);
        class354.method2209(false);
        class202.method1292(24955);
        class389.method2346(113);
        class227.method1437(118);
        class480.method2718((byte) -89);
        class66.method385(true);
        class353.method2205((byte) 100);
        class39.method228(-3528);
        class277.method1715(-1);
        class270.method1647(12800);
        class106.method580(118);
        class318.method1985(false);
        class311.method1879(-26810);
        class447.method2603(-1);
        class492.method2762(-97);
        class20.method111(true);
        class44.method241((byte) 53);
        class527.method2934((byte) -72);
        class190.method1216(false);
        class23.method135(-1552);
        class317.method1977(-5101);
        class596.method3430(false);
        class508.method2841(true);
        class585.method3378((byte) 122);
        class496.method2784((byte) -127);
        class493.method2770(57);
        class101.method559((byte) 119);
        class488.method2746(8192);
        class446.method2593(24145);
        class181.method1113(18664);
        class165.method893(0);
        class588.method3396((byte) 125);
        class642.method3704(12766);
        class215.method1394((byte) 112);
        class272.method1667(-1);
        class457.method2658(-119);
        class284.method1765(128);
        class302.method1839(2036);
        class342.method2153(-87);
        class294.method1801(16);
        class135.method710(-66);
        class534.method2974(-121);
        class556.method3112((byte) -64);
        class320.method1992(-1);
        class257.method1547(76);
        class521.method2906(14810);
        class565.method3170(78);
        class266.method1640(-1);
        class307.method1845(25921);
        class217.method1397(105);
        class137.method728(-80);
        class528.method2941(124);
        class433.method2524((byte) 109);
        class544.method3011(-124);
        class626.method3619((byte) -11);
        class183.method1124((byte) -22);
        class487.method2745(0);
        class594.method3428((byte) -50);
        class157.method850((byte) 85);
        class174.method1068(-1);
        class592.method3417(80);
        class28.method164(106);
        class333.method2107(43142375);
        class59.method340(256);
        class440.method2559(-114);
        class201.method1285(0);
        class176.method1087(true);
        class65.method371((byte) -67);
        class477.method2703(27);
        class224.method1429(0);
        class388.method2342((byte) -128);
        class633.method3660(16777215);
        class291.method1787(false);
        class485.method2740(0);
        class92.method507(205);
        class604.method3464(-121);
        class450.method2619(false);
        class239.method1494(1);
        class541.method3001(1);
        class119.method655(8924);
        class309.method1853();
        class196.method1259(2);
        class362.method2242((byte) 102);
        class216.method1395((byte) 5);
        class115.method618((byte) 33);
        class254.method1533(-127);
        class643.method3709((byte) -91);
        class218.method1411();
        class614.method3524();
        class430.method2512((byte) -104);
        class273.method1671(3);
        class625.method3605(-1);
        class346.method2163();
        class251.method1530((byte) 11);
        class121.method663(76);
        class212.method1346(1);
        class223.method1426(-97);
        class341.method2149(212458441);
        class407.method2429(0);
        class360.method2234((byte) -125);
        class145.method792(108);
        class503.method2815(1024);
        class335.method2131(1190717);
        class355.method2214(-102);
        class641.method3698((byte) -86);
        class281.method1751((byte) 93);
        class264.method1630((byte) -43);
        class170.method1027(-98);
        class455.method2635(true);
        class77.method442(-116);
        class628.method3632(false);
        class536.method2980(1);
        class285.method1771(1);
        class208.method1326((byte) 94);
        class606.method3467((byte) 50);
        class598.method3441(512);
        class418.method2479((byte) -95);
        class371.method2268(-27853);
        class192.method1230(true);
        class308.method1847(-10);
        class200.method1277();
        class466.method2681(116);
        class30.method180(-14538);
        class67.method386(true);
        class75.method436(false);
        class9.method38(-16777216);
        class321.method2001(true);
        class532.method2959(true);
        class520.method2897(5000);
        class276.method1706((byte) 62);
        class597.method3436((byte) 84);
        class249.method1525(45);
        class293.method1798(30674);
        class8.method33((byte) 2);
        class486.method2743(true);
        class15.method72(11096);
        class57.method310(-45);
        class88.method489(96);
        class474.method2695(2);
        class601.method3457((byte) 36);
        class55.method303((byte) 82);
        class111.method600(-26301);
        class82.method460(-695742778);
        class458.method2659();
        class336.method2132(5);
        class164.method892(124);
        class637.method3672((byte) 116);
        class72.method425(-41);
        class139.method734((byte) 25);
        class61.method353(true);
        class426.method2501(true);
        class381.method2319((byte) 115);
        class48.method262((byte) 72);
        class345.method2160(true);
        class154.method835(false);
        class424.method2494(-74);
        class530.method2957(5325);
        class31.method182((byte) 102);
        class387.method2340((byte) 121);
        class68.method390((byte) -106);
        class646.method3718(-14120);
        class93.method512(-1579);
        class150.method819(-107);
        class35.method210(-13652);
        class263.method1627(125);
        class247.method1516((byte) -92);
        class434.method2529((byte) 89);
        class631.method3649(93);
        class602.method3460(2);
        class615.method3528(0);
        class453.method2632(1);
        class438.method2547((byte) -74);
        class599.method3451((byte) 100);
        class197.method1262(22);
        class422.method2490((byte) -85);
        class553.method3105((byte) -45);
        class507.method2836(-12788);
        class244.method1510(-6679);
        class151.method828(49);
        class384.method2329((byte) 118);
        class452.method2629(-18292);
        class566.method3173((byte) 91);
        class146.method800(true);
        class522.method2913((byte) -98);
        class630.method3643((byte) 105);
        class18.method86(32);
        class210.method1336();
        class516.method2868(6);
        class343.method2155((byte) -106);
        class184.method1125(111);
        class501.method2798(-7917);
        class100.method558(true);
        class580.method3266((byte) -117);
        class621.method3563(16383);
        class286.method1775(-27362);
        class12.method51((byte) 102);
        class144.method788((byte) -128);
        class515.method2864(16);
        class502.method2803((byte) -120);
        class265.method1635((byte) 118);
        class337.method2133(66);
        class579.method3254(-24270);
        class147.method801(36069);
        class332.method2085(-1);
        class194.method1242((byte) 67);
        class494.method2773(124);
        class288.method1780(86);
        class195.method1249((byte) -122);
        class325.method2011(23029);
        class175.method1080();
        class372.method2271((byte) -99);
        class315.method1975((byte) -124);
        class572.method3230();
        class470.method2691();
        class517.method2871();
        class369.method2261(35);
        class240.method1496();
        class310.method1868(false);
        class523.method2924(0);
        class379.method2311(31067);
        class109.method593(0);
        class2.method6((byte) -48);
        class624.method3600(false);
        class206.method1317((byte) -114);
        class156.method843();
        class423.method2491(-7902);
        class4.method9(114);
        class542.method3007((byte) 121);
        class546.method3020((byte) -10);
        class367.method2256((byte) 118);
        class228.method1444((byte) 107);
        class432.method2522(0);
        class548.method3024(300);
        class168.method1003(19791);
        class377.method2304((byte) 97);
        class497.method2787(-122);
        class141.method762((byte) -85);
        class6.method24(32);
        class558.method3141(true);
        class33.method190(1);
        class179.method1102((byte) -52);
        class489.method2750((byte) 111);
        class609.method3487(-326298800);
        class103.method569(-4342);
        class505.method2825(0);
        class468.method2686(256);
        class89.method493(44);
        class404.method2411(75);
        class408.method2437((byte) -77);
        class292.method1791(-268770322);
        class148.method812(127);
        class250.method1529((byte) -57);
        class600.method3452((byte) 118);
        class261.method1576(27898);
        class616.method3530((byte) -111);
        class415.method2475((byte) 47);
        class76.method439(-127);
        class280.method1750((byte) -100);
        class186.method1141(1);
        class368.method2259(32);
        class635.method3668((byte) 107);
        class577.method3246(-32428);
        class431.method2519((byte) -120);
        class554.method3109(1406);
        class123.method667(-120);
        class491.method2761((byte) -97);
        class436.method2537((byte) -127);
        class102.method563(false);
        class351.method2197(1594);
        class509.method2847(104);
        class32.method184((byte) 74);
        class331.method2083((byte) 53);
        class410.method2446(-116);
        class442.method2565(0);
        class83.method465(121);
        class539.method2997((byte) -128);
        class481.method2723();
        class255.method1537(-17540);
        class74.method433(4);
        class512.method2857(-11484);
        class90.method499((byte) -53);
        class110.method594(113);
        class467.method2682(2);
        class464.method2675(-22295);
        class50.method277((byte) -126);
        class591.method3413(true);
        class113.method611((byte) -86);
        class130.method696(1);
        class392.method2366(-122);
        class191.method1220(0);
        class282.method1757(-1);
        class339.method2139(1406);
        class613.method3499(-106);
        class70.method403(true);
        class104.method573((byte) 126);
        class394.method2367((byte) 114);
        class559.method3144(97);
        class16.method74((byte) -128);
        class45.method242(409);
        class645.method3713(111);
        class611.method3493(0);
        class445.method2590((byte) 102);
        class258.method1549((byte) -13);
        class413.method2463(-1556);
        class211.method1345((byte) 99);
        class155.method838(103);
        class583.method3364(4096);
        class226.method1433(98);
        class567.method3174((byte) 85);
        class274.method1673();
        class198.method1267(1713699342);
        class390.method2350(-129);
        class386.method2337(-115);
        class484.method2736();
        class395.method2369(-119);
        class296.method1817(false);
        class298.method1834(1);
        class163.method882(-24494);
        class356.method2217(-103);
        class69.method395(false);
        class443.method2573(759139619);
        class29.method168(true);
        class376.method2297(-115);
        class610.method3488(108);
        class26.method158(95);
        class584.method3368((byte) 95);
        class209.method1332(-8921);
        class94.method515(-104);
        class435.method2530(-768);
        class365.method2249((byte) 42);
        class222.method1423(0);
        class17.method78(0);
        class84.method477((byte) -90);
        class54.method301((byte) 115);
        class21.method122(false);
        class107.method582(4);
        class504.method2816((byte) -82);
        class99.method556((byte) -59);
        class220.method1413(-126);
        class370.method2264(1);
        class459.method2663(-85);
        class162.method878((byte) 109);
        class634.method3665((byte) 115);
        class14.method68(32373);
        class10.method40(-31171);
        class529.method2953((byte) 126);
        class118.method649((byte) 43);
        class463.method2673(2);
        class22.method127(false);
        class127.method681(365);
        class612.method3498(-18208);
        class364.method2247(false);
        class375.method2293(true);
        class319.method1989(2);
        class126.method680((byte) -38);
        class301.method1838((byte) -67);
        class237.method1490(5);
        class334.method2124((byte) -76);
        class545.method3013((byte) -124);
        class235.method1487(1);
        class78.method445((byte) -84);
        class171.method1038(-1);
        class36.method214((byte) 54);
        class374.method2290(-102);
        class405.method2420((byte) -33);
        class193.method1238((byte) 117);
        class131.method698(false);
        class449.method2617(0);
        class132.method699((byte) 78);
        class373.method2276(true);
        class350.method2180(115);
        class476.method2700(-1296190135);
        class203.method1297(-82);
        class172.method1056(-122);
        class267.method1642((byte) -115);
        class34.method206(-10703);
        class385.method2331(255);
        class214.method1390(79);
        class53.method291(true);
        class225.method1430(111);
        class543.method3010((byte) -21);
        class406.method2421((byte) -126);
        class260.method1553(-113);
        class199.method1270(10893);
        class644.method3712(-1);
        class149.method817(8225);
        class80.method450(false);
        class238.method1491(2933);
        class304.method1841((byte) 64);
        class483.method2728(-101);
        class451.method2625((byte) 126);
        class575.method3240((byte) 90);
        class7.method28(true);
        class268.method1643(-52);
        class287.method1779(true);
        class555.method3111(-1943742696);
        class526.method2933(-56);
        class525.method2930(-29661);
        class245.method1514(0);
        class402.method2407((byte) 121);
        class428.method2507(110);
        class623.method3593(-6165);
        class241.method1500(1);
        class248.method1520((byte) 18);
        class1.method2(73);
        class514.method2863(-127);
        class629.method3641((byte) -41);
        class620.method3555((byte) 77);
        class136.method714((byte) -113);
        class540.method3000((byte) 116);
        class161.method875(-1);
        class550.method3029((byte) -28);
        class96.method533(-613);
        class81.method455(true);
        class460.method2664(-1);
        class134.method707(-1);
        class638.method3674(7084);
        class429.method2509((byte) -43);
        class510.method2850(5);
        class178.method1100((byte) -81);
        class383.method2326((byte) 61);
        class49.method267((byte) 96);
        class40.method234(-2030);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method3574() {
        int var0 = class512.field7133;
        int[] var1 = class514.field7144;
        boolean var2 = class501.field6954.field7862 == 1 && var0 > 200 || class501.field6954.field7862 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class20 var13 = class364.field5092[var1[var3]];
            if (var13.method114(-104)) {
                var13.method143(true);
                if (var13.field6361 >= 0 && var13.field6359 >= 0 && var13.field6357 < class139.field1760 && var13.field6367 < class369.field5135) {
                    var13.field248 = var13.field398 ? var2 : false;
                    if (class147.field1899 == var13) {
                        var13.field344 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field348) {
                            var14++;
                        }
                        if (var13.field346 > class7.field61) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method104((byte) -92) << 2);
                        if (var13.field271) {
                            var15 += 512;
                        } else {
                            if (class50.field685 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field344 = var15 + 1;
                    }
                } else {
                    var13.field344 = -1;
                }
            } else {
                var13.field344 = -1;
            }
        }
        for (int var4 = 0; var4 < class551.field7652; var4++) {
            class585 var10 = ((class480) class131.field1619.method3476((long) class286.field3739[var4], (byte) 28)).field6729;
            if (var10.method3375(-114) && var10.field8478.method3612((byte) 54, class257.field3191)) {
                var10.method143(true);
                if (var10.field6361 >= 0 && var10.field6359 >= 0 && var10.field6357 < class139.field1760 && var10.field6367 < class369.field5135) {
                    int var11 = 0;
                    if (!var10.field348) {
                        var11++;
                    }
                    if (var10.field346 > class7.field61) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method104((byte) -92) << 2);
                    if (class50.field685 == 0) {
                        if (var10.field8478.field9088) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class50.field685 == 1) {
                        if (var10.field8478.field9088) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field8478.field9099) {
                        var12 += 1024;
                    } else if (!var10.field8478.field9091) {
                        var12 += 256;
                    }
                    var10.field344 = var12 + 1;
                } else {
                    var10.field344 = -1;
                }
            } else {
                var10.field344 = -1;
            }
        }
        for (int var5 = 0; var5 < class610.field8771.length; var5++) {
            class617 var6 = class610.field8771[var5];
            if (var6 != null) {
                if (var6.field8891 == 1) {
                    class480 var7 = (class480) class131.field1619.method3476((long) var6.field8889, (byte) 28);
                    if (var7 != null) {
                        class585 var8 = var7.field6729;
                        if (var8.field344 >= 0) {
                            var8.field344 += 2048;
                        }
                    }
                } else if (var6.field8891 == 10) {
                    class20 var9 = class364.field5092[var6.field8889];
                    if (var9 != null && class147.field1899 != var9 && var9.field344 >= 0) {
                        var9.field344 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method3575(int arg0) {
        int var1 = class512.field7133;
        int[] var2 = class514.field7144;
        for (int var3 = 0; var3 < class551.field7652 + var1; var3++) {
            class23 var4;
            if (var3 < var1) {
                var4 = class364.field5092[var2[var3]];
            } else {
                var4 = ((class480) class131.field1619.method3476((long) class286.field3739[var3 - var1], (byte) 28)).field6729;
            }
            if (var4.field6358 == arg0 && var4.field344 >= 0) {
                int var5 = var4.method104((byte) -92);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6362 & 0x1FF) != 0 || (var4.field6368 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field6362 & 0x1FF) != 256 || (var4.field6368 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6362 >> 9;
                    int var7 = var4.field6368 >> 9;
                    if (var4.field344 > class446.field6171[var6][var7]) {
                        class446.field6171[var6][var7] = var4.field344;
                        class503.field6997[var6][var7] = 1;
                    } else if (class446.field6171[var6][var7] == var4.field344) {
                        var10002 = class503.field6997[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field6362 - var8 >> 9;
                    int var10 = var4.field6368 - var8 >> 9;
                    int var11 = var4.field6362 + var8 >> 9;
                    int var12 = var4.field6368 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field344 > class446.field6171[var13][var14]) {
                                class446.field6171[var13][var14] = var4.field344;
                                class503.field6997[var13][var14] = 1;
                            } else if (class446.field6171[var13][var14] == var4.field344) {
                                var10002 = class503.field6997[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    private final void method3576(int arg0) {
        if (class630.field9188 == 6 && class294.field3824 == 0) {
            if (class327.field4494 > 1) {
                class411.field5646 = class591.field8533;
                class327.field4494--;
            }
            if (!class264.field3373) {
                class534.method2976(1073741824);
            }
            for (int var2 = 0; var2 < 100 && class9.method35(1); var2++) {
            }
        }
        field8959++;
        class153.field1999++;
        class445.method2588(-1, -1, null, (byte) -126);
        class367.method2253(5, -1, -1, null);
        class450.method2620(arg0 + 126);
        class591.field8533++;
        for (int var3 = 0; var3 < class604.field8710; var3++) {
            class585 var4 = class179.field2310[var3].field6729;
            if (var4 != null) {
                byte var5 = var4.field8478.field9051;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method104((byte) -92);
                    if ((var5 & 0x2) != 0 && var4.field421 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field419[0] + var7;
                            int var10 = var4.field417[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class139.field1760 - var6 - 1) < var9) {
                                var9 = class139.field1760 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class369.field5135 - var6 - 1) < var10) {
                                var10 = class369.field5135 - var6 - 1;
                            }
                            int var11 = class543.method3009(var6, var6, var4.field417[0], var6, -1, class588.field8511, true, var10, 0, -1, 0, class15.field154[var4.field6358], var4.field419[0], class307.field3934, var9);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field419[var12] = class307.field3934[var11 - var12 - 1];
                                    var4.field417[var12] = class588.field8511[var11 - var12 - 1];
                                    var4.field418[var12] = 1;
                                }
                                var4.field421 = var11;
                            }
                        }
                    }
                    class477.method2704(-106, var4, true);
                    int var13 = class358.method2221((byte) 78, var4);
                    class90.method500(var4, (byte) 33, var13, class216.field2769, class580.field8085);
                    class145.method793(-108, var4);
                }
            }
        }
        if (class294.field3824 == 0 && class245.field3098 == 0) {
            if (class621.field8952 == 2) {
                class488.method2747((byte) -4);
            } else {
                class65.method372((byte) -118);
            }
            if ((class196.field2555 >> 9) < 14 || (class139.field1760 - 14) <= (class196.field2555 >> 9) || class434.field5901 >> 9 < 14 || (class369.field5135 - 14) <= (class434.field5901 >> 9)) {
                class20.method116((byte) 127);
            }
        }
        if (arg0 != 1) {
            field8972 = null;
        }
        while (true) {
            class9 var14;
            class447 var15;
            class447 var16;
            do {
                var14 = (class9) class445.field6147.method3184(-5295);
                if (var14 == null) {
                    while (true) {
                        class9 var17;
                        class447 var18;
                        class447 var19;
                        do {
                            var17 = (class9) class104.field1366.method3184(-5295);
                            if (var17 == null) {
                                while (true) {
                                    class9 var20;
                                    class447 var21;
                                    class447 var22;
                                    do {
                                        var20 = (class9) class225.field2879.method3184(-5295);
                                        if (var20 == null) {
                                            if (class15.field162 != null) {
                                                class320.method1994(arg0 ^ 0x1);
                                            }
                                            if (class7.field61 % 1500 == 0) {
                                                class447.method2598(true);
                                            }
                                            if (class630.field9188 == 6 && class294.field3824 == 0) {
                                                class370.method2265(false);
                                            }
                                            class50.method276(2);
                                            if (class184.field2351 && (class348.method2175(arg0 - 122) - 60000L) > class335.field4686) {
                                                class23.method138(1);
                                            }
                                            for (class575 var23 = (class575) class434.field5902.method1876((byte) 120); var23 != null; var23 = (class575) class434.field5902.method1877(arg0 ^ 0x1)) {
                                                if ((class348.method2175(-126) / 1000L - 5L) > ((long) var23.field8022)) {
                                                    if (var23.field8026 > 0) {
                                                        class392.method2365(var23.field8023 + class362.field5069.method2157(class245.field3103, 4074), (byte) 107, 0, "", 5, "");
                                                    }
                                                    if (var23.field8026 == 0) {
                                                        class392.method2365(var23.field8023 + class566.field7924.method2157(class245.field3103, arg0 + 4073), (byte) 94, 0, "", 5, "");
                                                    }
                                                    var23.method3394(false);
                                                }
                                            }
                                            if (class630.field9188 == 6 && class294.field3824 == 0) {
                                                if (class96.field1294 == null) {
                                                    class493.method2772(false, arg0 ^ 0x493A);
                                                    return;
                                                }
                                                class426.field5796++;
                                                if (class426.field5796 > 50) {
                                                    class275.field3578++;
                                                    class118.method650(true, class45.field637);
                                                }
                                                try {
                                                    if (class96.field1294 != null && class272.field3457.field7707 > 0) {
                                                        class491.field6866 += class272.field3457.field7707;
                                                        class96.field1294.method3265(class272.field3457.field7707, 0, (byte) 119, class272.field3457.field7693);
                                                        class272.field3457.field7707 = 0;
                                                        class426.field5796 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class493.method2772(false, 18747);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field77;
                                        if (var21.field6317 < 0) {
                                            break;
                                        }
                                        var22 = class609.method3486(var21.field6244, 983030160);
                                    } while (var22 == null || var22.field6194 == null || var22.field6194.length <= var21.field6317 || var22.field6194[var21.field6317] != var21);
                                    class218.method1408(var20);
                                }
                            }
                            var18 = var17.field77;
                            if (var18.field6317 < 0) {
                                break;
                            }
                            var19 = class609.method3486(var18.field6244, 983030160);
                        } while (var19 == null || var19.field6194 == null || var19.field6194.length <= var18.field6317 || var19.field6194[var18.field6317] != var18);
                        class218.method1408(var17);
                    }
                }
                var15 = var14.field77;
                if (var15.field6317 < 0) {
                    break;
                }
                var16 = class609.method3486(var15.field6244, 983030160);
            } while (var16 == null || var16.field6194 == null || var15.field6317 >= var16.field6194.length || var16.field6194[var15.field6317] != var15);
            class218.method1408(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field8969++;
        if (!this.method418(-105)) {
            return;
        }
        class302.field3920 = new class284();
        class302.field3920.field3702 = Integer.parseInt(this.getParameter("worldid"));
        class15.field164 = new class284();
        class15.field164.field3702 = Integer.parseInt(this.getParameter("lobbyid"));
        class15.field164.field3700 = this.getParameter("lobbyaddress");
        class540.field7557 = new class284();
        class540.field7557.field3702 = Integer.parseInt(this.getParameter("demoid"));
        class540.field7557.field3700 = this.getParameter("demoaddress");
        class602.field8701 = class56.method308(Integer.parseInt(this.getParameter("modewhere")), 0);
        if (!class238.method1492(class602.field8701, (byte) -114) && class628.field9174 != class602.field8701) {
            class602.field8701 = class628.field9174;
        }
        class45.field647 = class38.method224(119, Integer.parseInt(this.getParameter("modewhat")));
        if (class45.field647 != class381.field5335 && class487.field6793 != class45.field647 && class618.field8915 != class45.field647) {
            class45.field647 = class618.field8915;
        }
        try {
            class245.field3103 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class245.field3103 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class308.field3941 = true;
        } else {
            class308.field3941 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class351.field4936 = true;
        } else {
            class351.field4936 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class354.field4958 = true;
        } else {
            class354.field4958 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class26.field453 = class612.field8806;
            } else if (var4.equals("1")) {
                class26.field453 = class532.field7433;
            }
        }
        try {
            class24.field428 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class24.field428 = 0;
        }
        class110.field1419 = this.getParameter("quiturl");
        class418.field5715 = this.getParameter("settings");
        if (class418.field5715 == null) {
            class418.field5715 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class553.field7740 = Integer.parseInt(var5);
            } catch (Exception var10) {
                class553.field7740 = 0;
            }
        }
        class189.field2445 = Integer.parseInt(this.getParameter("colourid"));
        if (class189.field2445 < 0 || class189.field2445 >= class410.field5626.length) {
            class189.field2445 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class434.field5903 = true;
            class505.field7032 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class391.field5418 = true;
        }
        class207.field2685 = this.getParameter("sskey");
        if (class207.field2685 != null && class207.field2685.length() < 2) {
            class207.field2685 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class224.field2866 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class540.field7554 = Integer.parseInt(var8);
            } catch (Exception var9) {
            }
        }
        class123.field1540 = this;
        if (class612.field8806 == class26.field453) {
            class164.field2082 = 503;
            class586.field8501 = 765;
        } else if (class532.field7433 == class26.field453) {
            class586.field8501 = 640;
            class164.field2082 = 480;
        }
        this.method410(class164.field2082, class45.field647.method2471((byte) 90) + 32, class586.field8501, 610, -103);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method404(int arg0) {
        field8974++;
        String var2 = null;
        try {
            var2 = "[1)" + class525.field7310 + "," + class58.field786 + "," + class139.field1760 + "," + class369.field5135 + "|";
            if (class147.field1899 != null) {
                var2 = var2 + "2)" + class187.field2407 + "," + (class147.field1899.field419[0] + class525.field7310) + "," + (class147.field1899.field417[0] + class58.field786) + "|";
            }
            var2 = var2 + "3)" + class428.field5845 + "|4)" + class501.field6954.field7858 + "|5)" + class207.method1324((byte) 95) + "|6)" + class502.field6955 + "," + class604.field8711 + "|";
            var2 = var2 + "7)" + class501.field6954.method3152(arg0 ^ 0xFFFFC406, class428.field5845) + "|";
            var2 = var2 + "8)" + class501.field6954.method3159(class428.field5845, true) + "|";
            var2 = var2 + "9)" + class501.field6954.field7873 + "|";
            var2 = var2 + "10)" + class501.field6954.field7880 + "|";
            var2 = var2 + "11)" + class501.field6954.field7864 + "|";
            var2 = var2 + "12)" + class501.field6954.method3539(class428.field5845, 2) + "|";
            var2 = var2 + "13)" + class282.field3697 + "|";
            var2 = var2 + "14)" + class630.field9188;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class428.field5845 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field8976 == null ? (field8976 = method3589("client")) : field8976).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
                if (arg0 != -15238) {
                    field8972 = null;
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ljq;IIIIIIIII)V")
    public static final void method3577(class447[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class447 var11 = arg0[var10];
            if (var11 != null && var11.field6244 == arg1) {
                int var12 = var11.field6335 + arg6;
                int var13 = var11.field6270 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6336 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6330 + var12;
                    int var19 = var11.field6218 + var13;
                    if (var11.field6336 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6336 == 0 || var11.field6289 || method3572(var11).field6885 != 0 || class254.field3157 == var11 || class48.field658 == var11.field6325) {
                    if (!method3580(var11)) {
                        if (class15.field162 == var11 && class331.method2082((byte) 2, class15.field162) != null) {
                            class495.field6900 = true;
                            class646.field9350 = var12;
                            class558.field7813 = var13;
                        }
                        if (var11.field6300 || var14 < var16 && var15 < var17) {
                            if (var11.field6180 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class9 var20 = (class9) class225.field2879.method3188((byte) -100); var20 != null; var20 = (class9) class225.field2879.method3182((byte) -2)) {
                                    if (var20.field73) {
                                        var20.method589(-8880);
                                        var20.field77.field6207 = false;
                                    }
                                }
                                if (class582.field8216 == 0) {
                                    class15.field162 = null;
                                    class254.field3157 = null;
                                }
                                class538.field7521 = 0;
                                class181.field2332 = false;
                                class187.field2415 = false;
                                if (!class264.field3373) {
                                    class534.method2976(1073741824);
                                }
                            }
                            boolean var21;
                            if (class343.field4760.method100((byte) -120) >= var14 && class343.field4760.method92(8) >= var15 && class343.field4760.method100((byte) -123) < var16 && class343.field4760.method92(8) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class280.field3669 && var21) {
                                if (var11.field6172 >= 0) {
                                    class48.field659 = var11.field6172;
                                } else if (var11.field6180) {
                                    class48.field659 = -1;
                                }
                            }
                            if (!class264.field3373 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class446.method2594(var11, -2048, arg9 - var13, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class343.field4760.method93(15997) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class7 var24 = (class7) class644.field9336.method3188((byte) -100);
                            if (var24 != null && var24.method29((byte) -72) == 0 && var24.method27(2) >= var14 && var24.method32(32679) >= var15 && var24.method27(2) < var16 && var24.method32(32679) < var17) {
                                var23 = true;
                            }
                            if (var11.field6273 != null) {
                                for (int var25 = 0; var25 < var11.field6273.length; var25++) {
                                    if (class634.field9227.method2004((byte) -11, var11.field6273[var25])) {
                                        if (var11.field6252 == null || class7.field61 >= var11.field6252[var25]) {
                                            byte var26 = var11.field6248[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class634.field9227.method2004((byte) 107, 86) && !class634.field9227.method2004((byte) -116, 82) && !class634.field9227.method2004((byte) -108, 81)) && ((var26 & 0x2) == 0 || class634.field9227.method2004((byte) 110, 86)) && ((var26 & 0x1) == 0 || class634.field9227.method2004((byte) -22, 82)) && ((var26 & 0x4) == 0 || class634.field9227.method2004((byte) 107, 81))) {
                                                if (var25 < 10) {
                                                    class362.method2244(var25 + 1, -1, var11.field6229, -128, "");
                                                } else if (var25 == 10) {
                                                    class606.method3471(112);
                                                    class493 var27 = method3572(var11);
                                                    class234.method1478(var27.field6884, var27.method2768(19270), var11, (byte) 124);
                                                    class88.field1171 = class522.method2919(var11, (byte) -128);
                                                    if (class88.field1171 == null) {
                                                        class88.field1171 = "Null";
                                                    }
                                                    class126.field1571 = var11.field6213 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field6186[var25];
                                                if (var11.field6252 == null) {
                                                    var11.field6252 = new int[var11.field6273.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field6252[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6252[var25] = class7.field61 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field6252 != null) {
                                        var11.field6252[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class632.method3653(var24.method32(32679) - var13, var24.method27(2) - var12, var11, -1551917856);
                            }
                            if (class15.field162 != null && class15.field162 != var11 && var21 && method3572(var11).method2769((byte) 122)) {
                                class103.field1353 = var11;
                            }
                            if (class254.field3157 == var11) {
                                class475.field6702 = true;
                                class227.field2905 = var12;
                                class384.field5356 = var13;
                            }
                            if (var11.field6289 || var11.field6325 != 0) {
                                if (var21 && class562.field7861 != 0 && var11.field6310 != null) {
                                    class9 var29 = new class9();
                                    var29.field73 = true;
                                    var29.field77 = var11;
                                    var29.field83 = class562.field7861;
                                    var29.field81 = var11.field6310;
                                    class225.field2879.method3181(var29, true);
                                }
                                if (class15.field162 != null || class264.field3373 || class209.field2715 != var11.field6325 && class538.field7521 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6325 != 0) {
                                    if (class548.field7627 == var11.field6325 || class10.field87 == var11.field6325) {
                                        class381.field5334 = var11;
                                        if (class466.field6615 != null) {
                                            class466.field6615.method1986(-23607, var11.field6218, class301.field3918);
                                        }
                                        if (class548.field7627 == var11.field6325) {
                                            if (!class264.field3373 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class150.method821(22683, arg9, arg8, class301.field3918);
                                                for (class93 var30 = (class93) class620.field8927.method1876((byte) -66); var30 != null; var30 = (class93) class620.field8927.method1877(0)) {
                                                    if (arg8 >= var30.field1228 && arg8 < var30.field1235 && arg9 >= var30.field1236 && arg9 < var30.field1232) {
                                                        class534.method2976(1073741824);
                                                        class388.method2343((byte) -57, var30.field1231);
                                                    }
                                                }
                                            }
                                            class445.method2588(var13, var12, var11, (byte) -76);
                                            continue;
                                        }
                                    }
                                    if (class48.field658 == var11.field6325) {
                                        if (var11.method2608(-115, class301.field3918) == null || class598.field8638 != 0 && class598.field8638 != 3 || class264.field3373 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field6288[var32];
                                        if (var31 < var33 || var31 > var11.field6216[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field6330 / 2;
                                        int var35 = var32 - var11.field6218 / 2;
                                        int var36;
                                        if (class621.field8952 == 4) {
                                            var36 = (int) class521.field7250 & 0x3FFF;
                                        } else {
                                            var36 = (int) class521.field7250 + class374.field5212 & 0x3FFF;
                                        }
                                        int var37 = class310.field3966[var36];
                                        int var38 = class310.field3965[var36];
                                        if (class621.field8952 != 4) {
                                            var37 = (class54.field728 + 256) * var37 >> 8;
                                            var38 = (class54.field728 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class621.field8952 == 4) {
                                            var41 = (class626.field9074 >> 9) + (var39 >> 2);
                                            var42 = (class20.field292 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class147.field1899.method104((byte) -92) - 1) * 256;
                                            var41 = (class147.field1899.field6362 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class147.field1899.field6368 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class280.field3669 && (class59.field809 & 0x40) != 0) {
                                            class447 var44 = class433.method2525(class167.field2109, class201.field2637, (byte) -123);
                                            if (var44 == null) {
                                                class606.method3471(122);
                                            } else {
                                                class431.method2520(1L, var42, " ->", var41, 30, 2, class88.field1171, var11.field6263, true, false, class497.field6936);
                                            }
                                            continue;
                                        }
                                        if (class532.field7433 == class26.field453) {
                                            class431.method2520(1L, var42, "", var41, 47, 2, class10.field89.method2157(class245.field3103, 4074), -1, true, false, -1);
                                        }
                                        class431.method2520(1L, var42, "", var41, 50, 2, class119.field1496, -1, true, false, class460.field6562);
                                        continue;
                                    }
                                    if (class209.field2715 == var11.field6325) {
                                        class516.field7207 = var11;
                                        if (var21) {
                                            class181.field2332 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method27(2) - var12 - var11.field6330 / 2) * 2.0D / (double) class614.field8831);
                                            int var46 = (int) (-((double) (var24.method32(32679) - var13 - var11.field6218 / 2) * 2.0D / (double) class614.field8831));
                                            int var47 = class80.field1091 + var45 + class614.field8850;
                                            int var48 = class2.field20 + var46 + class614.field8848;
                                            class270 var49 = class198.method1269((byte) 126);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1648(var47, var48, 0, var50);
                                            if (var50 != null) {
                                                if (class634.field9227.method2004((byte) -62, 82) && class615.field8876 > 0) {
                                                    class141.method761(var50[1], var50[2], -107, var50[0]);
                                                    continue;
                                                }
                                                class187.field2415 = true;
                                                class194.field2522 = var50[0];
                                                class405.field5560 = var50[1];
                                                class406.field5577 = var50[2];
                                            }
                                            class538.field7521 = 1;
                                            class74.field1019 = false;
                                            class624.field9002 = class343.field4760.method100((byte) -102);
                                            class520.field7240 = class343.field4760.method92(8);
                                            continue;
                                        }
                                        if (var22 && class538.field7521 > 0) {
                                            if (class538.field7521 == 1 && (class624.field9002 != class343.field4760.method100((byte) -65) || class520.field7240 != class343.field4760.method92(8))) {
                                                class64.field866 = class80.field1091;
                                                class233.field2978 = class2.field20;
                                                class538.field7521 = 2;
                                            }
                                            if (class538.field7521 == 2) {
                                                class74.field1019 = true;
                                                class280.method1747(class64.field866 + (int) ((double) (class624.field9002 - class343.field4760.method100((byte) -105)) * 2.0D / (double) class614.field8837), (byte) -67);
                                                class103.method567(class233.field2978 - (int) ((double) (class520.field7240 - class343.field4760.method92(8)) * 2.0D / (double) class614.field8837), -120);
                                            }
                                            continue;
                                        }
                                        if (class538.field7521 > 0 && !class74.field1019) {
                                            if ((class598.field8641 == 1 || class179.method1105((byte) 3)) && class50.field673 > 2) {
                                                class254.method1534(class624.field9002, class520.field7240, 13772);
                                            } else if (class221.method1417(118)) {
                                                class254.method1534(class624.field9002, class520.field7240, 13772);
                                            }
                                        }
                                        class538.field7521 = 0;
                                        continue;
                                    }
                                    if (class271.field3445 == var11.field6325) {
                                        if (var22) {
                                            class179.method1107(var11.field6330, class343.field4760.method100((byte) -96) - var12, var11.field6218, -30553, class343.field4760.method92(8) - var13);
                                        }
                                        continue;
                                    }
                                    if (class554.field7751 == var11.field6325) {
                                        class367.method2253(5, var13, var12, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field6210 && var23) {
                                    var11.field6210 = true;
                                    if (var11.field6285 != null) {
                                        class9 var51 = new class9();
                                        var51.field73 = true;
                                        var51.field77 = var11;
                                        var51.field85 = var24.method27(2) - var12;
                                        var51.field83 = var24.method32(32679) - var13;
                                        var51.field81 = var11.field6285;
                                        class225.field2879.method3181(var51, true);
                                    }
                                }
                                if (var11.field6210 && var22 && var11.field6209 != null) {
                                    class9 var52 = new class9();
                                    var52.field73 = true;
                                    var52.field77 = var11;
                                    var52.field85 = class343.field4760.method100((byte) -43) - var12;
                                    var52.field83 = class343.field4760.method92(8) - var13;
                                    var52.field81 = var11.field6209;
                                    class225.field2879.method3181(var52, true);
                                }
                                if (var11.field6210 && !var22) {
                                    var11.field6210 = false;
                                    if (var11.field6179 != null) {
                                        class9 var53 = new class9();
                                        var53.field73 = true;
                                        var53.field77 = var11;
                                        var53.field85 = class343.field4760.method100((byte) -70) - var12;
                                        var53.field83 = class343.field4760.method92(8) - var13;
                                        var53.field81 = var11.field6179;
                                        class104.field1366.method3181(var53, true);
                                    }
                                }
                                if (var22 && var11.field6283 != null) {
                                    class9 var54 = new class9();
                                    var54.field73 = true;
                                    var54.field77 = var11;
                                    var54.field85 = class343.field4760.method100((byte) -99) - var12;
                                    var54.field83 = class343.field4760.method92(8) - var13;
                                    var54.field81 = var11.field6283;
                                    class225.field2879.method3181(var54, true);
                                }
                                if (!var11.field6207 && var21) {
                                    var11.field6207 = true;
                                    if (var11.field6278 != null) {
                                        class9 var55 = new class9();
                                        var55.field73 = true;
                                        var55.field77 = var11;
                                        var55.field85 = class343.field4760.method100((byte) -88) - var12;
                                        var55.field83 = class343.field4760.method92(8) - var13;
                                        var55.field81 = var11.field6278;
                                        class225.field2879.method3181(var55, true);
                                    }
                                }
                                if (var11.field6207 && var21 && var11.field6231 != null) {
                                    class9 var56 = new class9();
                                    var56.field73 = true;
                                    var56.field77 = var11;
                                    var56.field85 = class343.field4760.method100((byte) -107) - var12;
                                    var56.field83 = class343.field4760.method92(8) - var13;
                                    var56.field81 = var11.field6231;
                                    class225.field2879.method3181(var56, true);
                                }
                                if (var11.field6207 && !var21) {
                                    var11.field6207 = false;
                                    if (var11.field6282 != null) {
                                        class9 var57 = new class9();
                                        var57.field73 = true;
                                        var57.field77 = var11;
                                        var57.field85 = class343.field4760.method100((byte) -70) - var12;
                                        var57.field83 = class343.field4760.method92(8) - var13;
                                        var57.field81 = var11.field6282;
                                        class104.field1366.method3181(var57, true);
                                    }
                                }
                                if (var11.field6237 != null) {
                                    class9 var58 = new class9();
                                    var58.field77 = var11;
                                    var58.field81 = var11.field6237;
                                    class445.field6147.method3181(var58, true);
                                }
                                if (var11.field6264 != null && class375.field5228 > var11.field6247) {
                                    if (var11.field6298 == null || class375.field5228 - var11.field6247 > 32) {
                                        class9 var63 = new class9();
                                        var63.field77 = var11;
                                        var63.field81 = var11.field6264;
                                        class225.field2879.method3181(var63, true);
                                    } else {
                                        label693: for (int var59 = var11.field6247; var59 < class375.field5228; var59++) {
                                            int var60 = class166.field2100[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field6298.length; var61++) {
                                                if (var11.field6298[var61] == var60) {
                                                    class9 var62 = new class9();
                                                    var62.field77 = var11;
                                                    var62.field81 = var11.field6264;
                                                    class225.field2879.method3181(var62, true);
                                                    break label693;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6247 = class375.field5228;
                                }
                                if (var11.field6256 != null && class157.field2044 > var11.field6242) {
                                    if (var11.field6241 == null || class157.field2044 - var11.field6242 > 32) {
                                        class9 var68 = new class9();
                                        var68.field77 = var11;
                                        var68.field81 = var11.field6256;
                                        class225.field2879.method3181(var68, true);
                                    } else {
                                        label669: for (int var64 = var11.field6242; var64 < class157.field2044; var64++) {
                                            int var65 = class450.field6365[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field6241.length; var66++) {
                                                if (var11.field6241[var66] == var65) {
                                                    class9 var67 = new class9();
                                                    var67.field77 = var11;
                                                    var67.field81 = var11.field6256;
                                                    class225.field2879.method3181(var67, true);
                                                    break label669;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6242 = class157.field2044;
                                }
                                if (var11.field6311 != null && class130.field1605 > var11.field6240) {
                                    if (var11.field6185 == null || class130.field1605 - var11.field6240 > 32) {
                                        class9 var73 = new class9();
                                        var73.field77 = var11;
                                        var73.field81 = var11.field6311;
                                        class225.field2879.method3181(var73, true);
                                    } else {
                                        label645: for (int var69 = var11.field6240; var69 < class130.field1605; var69++) {
                                            int var70 = class69.field911[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field6185.length; var71++) {
                                                if (var11.field6185[var71] == var70) {
                                                    class9 var72 = new class9();
                                                    var72.field77 = var11;
                                                    var72.field81 = var11.field6311;
                                                    class225.field2879.method3181(var72, true);
                                                    break label645;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6240 = class130.field1605;
                                }
                                if (var11.field6277 != null && class530.field7400 > var11.field6205) {
                                    if (var11.field6249 == null || class530.field7400 - var11.field6205 > 32) {
                                        class9 var78 = new class9();
                                        var78.field77 = var11;
                                        var78.field81 = var11.field6277;
                                        class225.field2879.method3181(var78, true);
                                    } else {
                                        label621: for (int var74 = var11.field6205; var74 < class530.field7400; var74++) {
                                            int var75 = class413.field5684[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field6249.length; var76++) {
                                                if (var11.field6249[var76] == var75) {
                                                    class9 var77 = new class9();
                                                    var77.field77 = var11;
                                                    var77.field81 = var11.field6277;
                                                    class225.field2879.method3181(var77, true);
                                                    break label621;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6205 = class530.field7400;
                                }
                                if (var11.field6286 != null && class459.field6556 > var11.field6328) {
                                    if (var11.field6302 == null || class459.field6556 - var11.field6328 > 32) {
                                        class9 var83 = new class9();
                                        var83.field77 = var11;
                                        var83.field81 = var11.field6286;
                                        class225.field2879.method3181(var83, true);
                                    } else {
                                        label597: for (int var79 = var11.field6328; var79 < class459.field6556; var79++) {
                                            int var80 = class489.field6805[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field6302.length; var81++) {
                                                if (var11.field6302[var81] == var80) {
                                                    class9 var82 = new class9();
                                                    var82.field77 = var11;
                                                    var82.field81 = var11.field6286;
                                                    class225.field2879.method3181(var82, true);
                                                    break label597;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6328 = class459.field6556;
                                }
                                if (class582.field8155 > var11.field6322 && var11.field6253 != null) {
                                    class9 var84 = new class9();
                                    var84.field77 = var11;
                                    var84.field81 = var11.field6253;
                                    class225.field2879.method3181(var84, true);
                                }
                                if (class277.field3625 > var11.field6322 && var11.field6312 != null) {
                                    class9 var85 = new class9();
                                    var85.field77 = var11;
                                    var85.field81 = var11.field6312;
                                    class225.field2879.method3181(var85, true);
                                }
                                if (class75.field1025 > var11.field6322 && var11.field6301 != null) {
                                    class9 var86 = new class9();
                                    var86.field77 = var11;
                                    var86.field81 = var11.field6301;
                                    class225.field2879.method3181(var86, true);
                                }
                                if (class510.field7110 > var11.field6322 && var11.field6221 != null) {
                                    class9 var87 = new class9();
                                    var87.field77 = var11;
                                    var87.field81 = var11.field6221;
                                    class225.field2879.method3181(var87, true);
                                }
                                if (class411.field5646 > var11.field6322 && var11.field6274 != null) {
                                    class9 var88 = new class9();
                                    var88.field77 = var11;
                                    var88.field81 = var11.field6274;
                                    class225.field2879.method3181(var88, true);
                                }
                                var11.field6322 = class591.field8533;
                                if (var11.field6199 != null) {
                                    for (int var89 = 0; var89 < class176.field2273; var89++) {
                                        class9 var90 = new class9();
                                        var90.field77 = var11;
                                        var90.field70 = class391.field5426[var89].method693((byte) -108);
                                        var90.field76 = class391.field5426[var89].method692(true);
                                        var90.field81 = var11.field6199;
                                        class225.field2879.method3181(var90, true);
                                    }
                                }
                                if (class510.field7116 && var11.field6267 != null) {
                                    class9 var91 = new class9();
                                    var91.field77 = var11;
                                    var91.field81 = var11.field6267;
                                    class225.field2879.method3181(var91, true);
                                }
                            }
                            if (var11.field6336 == 5 && var11.field6192 != -1) {
                                var11.method2596((byte) -122, class369.field5136, class1.field5).method1986(-23607, var11.field6218, class301.field3918);
                            }
                            class354.method2206((byte) -126, var11);
                            if (var11.field6336 == 0) {
                                method3577(arg0, var11.field6229, var14, var15, var16, var17, var12 - var11.field6291, var13 - var11.field6280, arg8, arg9);
                                if (var11.field6194 != null) {
                                    method3577(var11.field6194, var11.field6229, var14, var15, var16, var17, var12 - var11.field6291, var13 - var11.field6280, arg8, arg9);
                                }
                                class496 var92 = (class496) class523.field7289.method3476((long) var11.field6229, (byte) 28);
                                if (var92 != null) {
                                    if (class612.field8806 == class26.field453 && var92.field6912 == 0 && !class264.field3373 && var21 && !class427.field5824) {
                                        class534.method2976(1073741824);
                                    }
                                    class208.method1331(var16, var14, arg9, var13, -17139, var17, var12, arg8, var92.field6914, var15);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class354.method2206((byte) -97, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public static final void method3578(int arg0) {
        int var1 = class512.field7133;
        int[] var2 = class514.field7144;
        int var3 = class14.field137 ? var1 : class551.field7652 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class23 var5;
            if (var4 < var1) {
                var5 = class364.field5092[var2[var4]];
            } else {
                var5 = ((class480) class131.field1619.method3476((long) class286.field3739[var4 - var1], (byte) 28)).field6729;
            }
            if (var5.field6358 == arg0) {
                var5.field405 = 0;
                if (var5.field344 < 0) {
                    var5.field348 = false;
                } else {
                    int var6 = var5.method104((byte) -92);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6362 & 0x1FF) != 0 || (var5.field6368 & 0x1FF) != 0) {
                            var5.field348 = false;
                            continue;
                        }
                    } else if ((var5.field6362 & 0x1FF) != 256 || (var5.field6368 & 0x1FF) != 256) {
                        var5.field348 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6362 >> 9;
                        int var8 = var5.field6368 >> 9;
                        if (class446.field6171[var7][var8] != var5.field344) {
                            var5.field348 = true;
                            continue;
                        }
                        if (class503.field6997[var7][var8] > 1) {
                            var10002 = class503.field6997[var7][var8]--;
                            var5.field348 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field6362 - var9 >> 9;
                        int var11 = var5.field6368 - var9 >> 9;
                        int var12 = var5.field6362 + var9 >> 9;
                        int var13 = var5.field6368 + var9 >> 9;
                        if (!class388.method2341(var10, var5.field344, var13, var12, var11, -2)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class446.field6171[var14][var15] == var5.field344) {
                                        var10002 = class503.field6997[var14][var15]--;
                                    }
                                }
                            }
                            var5.field348 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class20 && var5.field423 != null && class7.field61 >= var5.field423.field2544 && class7.field61 < var5.field423.field2550) {
                        ((class20) var5).field248 = false;
                    }
                    var5.field348 = false;
                    var5.field6366 = class341.method2147(var5.field6358, var5.field6362, 0, var5.field6368);
                    class523.method2925(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method3579() {
        for (int var0 = 0; var0 < class139.field1760; var0++) {
            int[] var1 = class446.field6171[var0];
            for (int var2 = 0; var2 < class369.field5135; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ljq;)Z")
    public static final boolean method3580(class447 arg0) {
        if (class427.field5824) {
            if (method3572(arg0).field6885 != 0) {
                return false;
            }
            if (arg0.field6336 == 0) {
                return false;
            }
        }
        return arg0.field6250;
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    private final void method3581(int arg0) {
        field8975++;
        if (class630.field9188 == 13) {
            return;
        }
        long var2 = class319.method1990(arg0 + 66) / 1000000L - class414.field5690;
        if (arg0 != 1) {
            this.method417(-79);
        }
        class414.field5690 = class319.method1990(84) / 1000000L;
        boolean var4 = class541.method3004(22050);
        if (var4 && class54.field726 && class288.field3759 != null) {
            class288.field3759.method343((byte) -71);
        }
        if (class600.method3453(class630.field9188, -107)) {
            if (class288.field3762 != 0L && class288.field3762 < class348.method2175(-122)) {
                class459.method2662(class207.method1324((byte) 103), false, arg0 + 52, class501.field6954.field7877, class501.field6954.field7878);
            } else if (!class301.field3918.method941() && class485.field6770) {
                class317.method1978(115);
            }
        }
        if (class558.field7815 == null) {
            Container var5;
            if (class247.field3111 == null) {
                var5 = class31.field488.field3644;
            } else {
                var5 = class247.field3111;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class247.field3111 == var5) {
                Insets var8 = class247.field3111.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class611.field8788 != var6 || class322.field4443 != var7) {
                if (class301.field3918 == null || class301.field3918.method966()) {
                    class522.method2916(true);
                } else {
                    class322.field4443 = var7;
                    class611.field8788 = var6;
                }
                class288.field3762 = class348.method2175(-124) + 500L;
            }
        }
        if (class558.field7815 != null && !class70.field921 && class600.method3453(class630.field9188, -116)) {
            class459.method2662(class501.field6954.field7835, false, 94, -1, -1);
        }
        boolean var9 = false;
        if (class503.field7003) {
            var9 = true;
            class503.field7003 = false;
        }
        if (var9) {
            class342.method2152(arg0 + 122);
        }
        if (class301.field3918 != null && class301.field3918.method941() || class207.method1324((byte) 111) != 1) {
            class145.method794((byte) 122);
        }
        if (class630.field9188 == 0) {
            class404.method2412(97, class410.field5626[class189.field2445], class415.field5707[class189.field2445], class640.field9296[class189.field2445], var9, class26.field448, class555.field7762);
        } else if (class630.field9188 == 1) {
            class171.method1033(class301.field3918, class95.field1282, class640.field9296[class189.field2445].getRGB(), class415.field5707[class189.field2445].getRGB(), var9 | class301.field3918.method941(), class410.field5626[class189.field2445].getRGB(), 91);
        } else if (class611.method3490(-122, class630.field9188)) {
            class277.method1708(arg0 ^ 0x552);
        } else if (class323.method2006(class630.field9188, -126)) {
            class277.method1708(arg0 ^ 0x552);
        } else if (class611.method3489(65535, class630.field9188)) {
            if (class383.field5355 == 1) {
                if (class440.field5995 > class463.field6591) {
                    class463.field6591 = class440.field5995;
                }
                int var10 = (class463.field6591 - class440.field5995) * 50 / class463.field6591;
                class410.method2447(class512.field7135.method2157(class245.field3103, arg0 ^ 0xFEB) + "<br>(" + var10 + "%)", true, arg0 - 25376, class522.field7281);
            } else if (class383.field5355 == 2) {
                if (class235.field3005 > class163.field2068) {
                    class163.field2068 = class235.field3005;
                }
                int var11 = ((class163.field2068 - class235.field3005) * 50 / class163.field2068) + 50;
                class410.method2447(class512.field7135.method2157(class245.field3103, arg0 + 4073) + "<br>(" + var11 + "%)", true, -25375, class522.field7281);
            } else {
                class410.method2447(class512.field7135.method2157(class245.field3103, 4074), true, -25375, class522.field7281);
            }
        } else if (class630.field9188 == 9) {
            class611.method3497(arg0 ^ 0x7C, var2);
        } else if (class630.field9188 == 12) {
            class410.method2447(class371.field5165.method2157(class245.field3103, arg0 ^ 0xFEB) + "<br>" + class15.field163.method2157(class245.field3103, 4074), true, -25375, class522.field7281);
        }
        if (class3.field22 == 3) {
            for (int var12 = 0; var12 < class161.field2051; var12++) {
                Rectangle var13 = class331.field4576[var12];
                if (class202.field2644[var12]) {
                    class301.field3918.method974(-1996553985, arg0, var13.height, var13.x, var13.width, var13.y);
                } else if (class584.field8455[var12]) {
                    class301.field3918.method974(-1996554240, 1, var13.height, var13.x, var13.width, var13.y);
                }
            }
        }
        if (class197.method1261((byte) 118)) {
            class526.method2931(class301.field3918, (byte) -114);
        }
        if (class600.method3453(class630.field9188, -102) && class3.field22 == 0 && class207.method1324((byte) 106) == 1 && !var9 && class279.field3630.equals("1.1")) {
            int var16 = 0;
            for (int var17 = 0; var17 < class161.field2051; var17++) {
                if (class584.field8455[var17]) {
                    class584.field8455[var17] = false;
                    class267.field3416[var16++] = class331.field4576[var17];
                }
            }
            try {
                class301.field3918.method913(class267.field3416, var16);
            } catch (class487 var18) {
            }
        } else if (class630.field9188 != 0) {
            for (int var14 = 0; var14 < class161.field2051; var14++) {
                class584.field8455[var14] = false;
            }
            try {
                class301.field3918.method934();
            } catch (class487 var19) {
                class447.method2602(var19, 117, var19.getMessage() + " (Recovered) " + this.method404(-15238));
                class293.method1796(0, (byte) 78);
            }
        }
        if (class501.field6954.field7842 == 0) {
            class353.method2204(15L, arg0 ^ 0x1E7F);
        } else if (class501.field6954.field7842 == 1) {
            class353.method2204(10L, 7806);
        } else if (class501.field6954.field7842 == 2) {
            class353.method2204(5L, 7806);
        } else if (class501.field6954.field7842 == 3) {
            class353.method2204(2L, 7806);
        }
        if (class178.field2295) {
            class81.method457(5);
        }
        if (class501.field6954.field7846 && class630.field9188 == 2 && class126.field1565 != -1) {
            class501.field6954.field7846 = false;
            class501.field6954.method3537(arg0 ^ 0x7C, class31.field488);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method3582() {
        int var0 = class512.field7133;
        int[] var1 = class514.field7144;
        int var2 = class14.field137 ? var0 : class551.field7652 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class23 var4;
            if (var3 < var0) {
                var4 = class364.field5092[var1[var3]];
            } else {
                var4 = ((class480) class131.field1619.method3476((long) class286.field3739[var3 - var0], (byte) 28)).field6729;
            }
            if (var4.field344 >= 0) {
                int var5 = var4.method104((byte) -92);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6362 & 0x1FF) == 0 && (var4.field6368 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field6362 & 0x1FF) == 256 && (var4.field6368 & 0x1FF) == 256) {
                    continue;
                }
                if (var4 instanceof class20 && var4.field423 != null && class7.field61 >= var4.field423.field2544 && class7.field61 < var4.field423.field2550) {
                    ((class20) var4).field248 = false;
                }
                var4.field6366 = class341.method2147(var4.field6358, var4.field6362, 0, var4.field6368);
                class523.method2925(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public static void method3583(int arg0) {
        field8972 = null;
        if (arg0 != 87) {
            method3575(13);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method3584(boolean arg0) {
        field8973++;
        if (class630.field9188 == 13) {
            return;
        }
        class7.field61++;
        if (class7.field61 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class558.field7811 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class355.field4975.setSeed((long) class558.field7811);
        }
        if ((class7.field61 % 50) == 0) {
            class466.field6617 = class491.field6866;
            class282.field3693 = class633.field9215;
            class491.field6866 = 0;
            class633.field9215 = 0;
        }
        this.method3569(256);
        if (class466.field6612 != null) {
            class466.field6612.method676(0);
        }
        class115.method617((byte) -75);
        class634.field9227.method2005((byte) -125);
        class343.field4760.method99(-107);
        if (class301.field3918 != null) {
            class301.field3918.method932((int) class348.method2175(-123));
        }
        class432.method2521(-2);
        class176.field2273 = 0;
        class90.field1222 = 0;
        for (class129 var3 = class634.field9227.method2003(arg0); var3 != null; var3 = class634.field9227.method2003(true)) {
            int var6 = var3.method694(-8395);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method692(true);
                if (class163.method887(2) && (var7 == '`' || var7 == '§')) {
                    if (class197.method1261((byte) 115)) {
                        class203.method1298(13405);
                    } else {
                        class134.method706(0);
                    }
                } else if (class176.field2273 < 128) {
                    class391.field5426[class176.field2273] = var3;
                    class176.field2273++;
                }
            } else if (var6 == 0 && class90.field1222 < 75) {
                class151.field1994[class90.field1222] = var3;
                class90.field1222++;
            }
        }
        class562.field7861 = 0;
        for (class7 var4 = class343.field4760.method88(14211); var4 != null; var4 = class343.field4760.method88(14211)) {
            int var5 = var4.method29((byte) -93);
            if (var5 == -1) {
                class211.field2722.method3181(var4, true);
            } else if (var5 == 6) {
                class562.field7861 += var4.method30((byte) -109);
            } else if (class298.method1831(var5, 0)) {
                class644.field9336.method3181(var4, arg0);
                if (class644.field9336.method3176(false) > 10) {
                    class644.field9336.method3184(-5295);
                }
            }
        }
        if (class197.method1261((byte) 113)) {
            class292.method1789((byte) -120);
        }
        if (class630.field9188 == 0) {
            this.method3568(91);
            class49.method266(-1);
        } else if (class630.field9188 == 1) {
            this.method3568(87);
            class49.method266(-1);
        } else if (class611.method3489(65535, class630.field9188)) {
            class101.method562(45);
        }
        if (class76.method438(class630.field9188, 110) && !class611.method3489(65535, class630.field9188)) {
            this.method3576(1);
            class628.method3639(122);
            class512.method2855(116);
        } else if (class23.method136(false, class630.field9188) && !class611.method3489(65535, class630.field9188)) {
            this.method3576(1);
            class512.method2855(101);
        } else if (class630.field9188 == 11) {
            class512.method2855(101);
        } else if (class168.method1004(class630.field9188, -12) && !class611.method3489(65535, class630.field9188)) {
            class162.method879((byte) -119);
        } else if (class630.field9188 == 12) {
            class512.method2855(114);
            if (class18.field206 != -3 && class18.field206 != 2 && class18.field206 != 15) {
                class493.method2772(false, 18747);
            }
        }
        class296.method1821((byte) 124, class301.field3918);
        class644.field9336.method3184(-5295);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I[B)V")
    private final void method3585(int arg0, byte[] arg1) {
        if (arg0 > -75) {
            this.method419(21);
        }
        field8968++;
        class551 var3 = new class551(arg1);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method3045(-128);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class23.field335 = new int[6];
                        var9[0] = var3.method3090(-105);
                        var9[1] = var3.method3090(-113);
                        var9[2] = var3.method3090(-99);
                        var9[3] = var3.method3090(-99);
                        var9[4] = var3.method3090(-76);
                        var9[5] = var3.method3090(-116);
                    } else if (var4 == 4) {
                        int var5 = var3.method3045(-125);
                        class140.field1788 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class140.field1788[var6] = var3.method3090(-76);
                            if (class140.field1788[var6] == 65535) {
                                class140.field1788[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method3045(-128);
                        class620.field8929 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class620.field8929[var8] = var3.method3090(-100);
                            if (class620.field8929[var8] == 65535) {
                                class620.field8929[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    private final void method3586(int arg0) {
        field8970++;
        if (class634.field9222 < class488.field6797.field1797) {
            class50.field683 = (class488.field6797.field1797 - 1) * 50 * 5;
            class78.field1058.field3704 = !class78.field1058.field3704;
            if (class50.field683 > 3000) {
                class50.field683 = 3000;
            }
            if (class488.field6797.field1797 >= 2 && class488.field6797.field1795 == 6) {
                this.method420(arg0 + 26509, "js5connect_outofdate");
                class630.field9188 = 13;
                return;
            }
            if (class488.field6797.field1797 >= 4 && class488.field6797.field1795 == -1) {
                this.method420(29509, "js5crc");
                class630.field9188 = 13;
                return;
            }
            if (class488.field6797.field1797 >= 4 && class183.method1122((byte) 82, class630.field9188)) {
                if (class488.field6797.field1795 == 7 || class488.field6797.field1795 == 9) {
                    this.method420(29509, "js5connect_full");
                } else if (class488.field6797.field1795 <= 0) {
                    this.method420(29509, "js5io");
                } else {
                    this.method420(29509, "js5connect");
                }
                class630.field9188 = 13;
                return;
            }
        }
        class634.field9222 = class488.field6797.field1797;
        if (class50.field683 > 0) {
            class50.field683--;
            return;
        }
        try {
            if (class131.field1620 == 0) {
                class566.field7926 = class31.field488.method1734(class78.field1058.field3700, class78.field1058.method1763(16311), arg0 - 34887);
                class131.field1620++;
            }
            if (arg0 != 3000) {
                field8972 = null;
            }
            if (class131.field1620 == 1) {
                if (class566.field7926.field6001 == 2) {
                    this.method3587(11, 1000);
                    return;
                }
                if (class566.field7926.field6001 == 1) {
                    class131.field1620++;
                }
            }
            if (class131.field1620 == 2) {
                class302.field3919 = new class581((Socket) class566.field7926.field6000, class31.field488);
                class551 var2 = new class551(5);
                var2.method3060(class17.field185.field3141, arg0 ^ 0xFFFF964E);
                var2.method3071(-25, 610);
                class302.field3919.method3276(5, var2.field7693, 0, -121);
                class131.field1620++;
                class374.field5221 = class348.method2175(-118);
            }
            if (class131.field1620 == 3) {
                if (class183.method1122((byte) 127, class630.field9188) || class302.field3919.method3278(-449) > 0) {
                    int var3 = class302.field3919.method3272(true);
                    if (var3 != 0) {
                        this.method3587(11, var3);
                        return;
                    }
                    class131.field1620++;
                } else if (class348.method2175(-127) - class374.field5221 > 30000L) {
                    this.method3587(11, 1001);
                    return;
                }
            }
            if (class131.field1620 == 4) {
                boolean var4 = class630.field9188 == 1 || class76.method438(class630.field9188, 121) || class23.method136(false, class630.field9188);
                class488.field6797.method754((byte) 61, !var4, class302.field3919);
                class131.field1620 = 0;
                class302.field3919 = null;
                class566.field7926 = null;
            }
        } catch (IOException var5) {
            this.method3587(11, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field8971++;
        try {
            if (arg0.length != 6) {
                class167.method942((byte) 67, "Argument count");
            }
            class302.field3920 = new class284();
            class302.field3920.field3702 = Integer.parseInt(arg0[0]);
            class15.field164 = new class284();
            class15.field164.field3702 = Integer.parseInt(arg0[1]);
            class540.field7557 = new class284();
            class540.field7557.field3702 = Integer.parseInt(arg0[2]);
            class602.field8701 = class265.field3394;
            if (arg0[3].equals("live")) {
                class45.field647 = class618.field8915;
            } else if (arg0[3].equals("rc")) {
                class45.field647 = class487.field6793;
            } else if (arg0[3].equals("wip")) {
                class45.field647 = class381.field5335;
            } else {
                class167.method942((byte) 41, "modewhat");
            }
            class245.field3103 = class239.method1495(96, arg0[4]);
            if (class245.field3103 == -1) {
                if (arg0[4].equals("english")) {
                    class245.field3103 = 0;
                } else if (arg0[4].equals("german")) {
                    class245.field3103 = 1;
                } else {
                    class167.method942((byte) 70, "language");
                }
            }
            class308.field3941 = false;
            class351.field4936 = false;
            if (arg0[5].equals("game0")) {
                class26.field453 = class612.field8806;
            } else if (arg0[5].equals("game1")) {
                class26.field453 = class532.field7433;
            } else {
                class167.method942((byte) 85, "game");
            }
            class540.field7554 = 0;
            class189.field2445 = class26.field453.field7138;
            class391.field5418 = false;
            class24.field428 = 0;
            class434.field5903 = true;
            class505.field7032 = true;
            class418.field5715 = "";
            class553.field7740 = 0;
            class207.field2685 = null;
            class224.field2866 = false;
            client var1 = new client();
            class123.field1540 = var1;
            var1.method411(false, 610, class45.field647.method2471((byte) 117) + 32, class26.field453.field7139, 32, 1024, (byte) 16, 768);
            class247.field3111.setLocation(40, 40);
        } catch (Exception var3) {
            class447.method2602(var3, 97, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method3587(int arg0, int arg1) {
        class302.field3919 = null;
        field8963++;
        class488.field6797.field1797++;
        class566.field7926 = null;
        class131.field1620 = 0;
        if (arg0 == 11) {
            class488.field6797.field1795 = arg1;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method3588() {
        class372.field5182 = 0;
        for (int var0 = 0; var0 < class551.field7652; var0++) {
            class585 var1 = ((class480) class131.field1619.method3476((long) class286.field3739[var0], (byte) 28)).field6729;
            if (var1.field348 && var1.method113(49) != -1) {
                int var2 = (var1.method104((byte) -92) - 1) * 256 + 252;
                int var3 = var1.field6362 - var2 >> 9;
                int var4 = var1.field6368 - var2 >> 9;
                class23 var5 = class546.method3023(-114, var3, var1.field6358, var4);
                if (var5 != null) {
                    int var6 = var5.field366;
                    if (var5 instanceof class585) {
                        var6 += 2048;
                    }
                    if (var5.field405 == 0 && var5.method113(-123) != -1) {
                        class186.field2384[class372.field5182] = var6;
                        class460.field6565[class372.field5182] = var6;
                        class372.field5182++;
                        var5.field405++;
                    }
                    class186.field2384[class372.field5182] = var6;
                    class460.field6565[class372.field5182] = var1.field366 + 2048;
                    class372.field5182++;
                    var5.field405++;
                }
            }
        }
        class98.method549(class186.field2384, Integer.MIN_VALUE, class372.field5182 - 1, class460.field6565, 0);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method413(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field8966++;
        if (class428.field5845 != 2) {
            this.method3584(true);
            return;
        }
        try {
            this.method3584(true);
        } catch (Throwable var3) {
            class447.method2602(var3, 88, var3.getMessage() + " (Recovered) " + this.method404(-15238));
            class293.method1796(0, (byte) -109);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3589(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
