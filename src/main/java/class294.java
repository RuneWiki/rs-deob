import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class294 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "[[I")
    public static int[][] field4437 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 9)
    public static void method1991(int arg0) {
        field4437 = null;
        if (arg0 != -5889) {
            method1995(46, -16, 51, (Class) null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 24)
    public static final void method1992(int arg0) {
        field4438++;
        if (arg0 != 6) {
            method1992(-72);
        }
        class51 var1 = class322.field4795;
        synchronized (class322.field4795) {
            class322.field4795.method372(118);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)I", line = 38)
    public static int method1993(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V", line = 45)
    public static final void method1994(int arg0) {
        field4440++;
        class93.method750(0);
        class127.method900(1);
        class27.method228((byte) 115);
        class86.method697((byte) 19);
        class263.method1759(arg0 ^ 0x42C3);
        class8.method51(100);
        class228.method1487(2);
        class60.method535((byte) -109);
        class68.method575(-1);
        if (arg0 != 16956) {
            method1995(-74, -102, 16, (Class) null);
        }
        class378.method2468(0);
        class185.method1217(15184);
        class87.method704(arg0 - 1843);
        class273.method1807((byte) -91);
        class331.method2166((byte) 110);
        class295.method2000((byte) 73);
        class268.method1790(-20225);
        class165.method1117((byte) -123);
        class245.method1597(true);
        class447.method2774((byte) -106);
        class157.method1043(false);
        class36.method279(9685);
        class366.method2416(false);
        class3.method13(arg0 - 15956);
        class66.field981.method366(arg0 ^ 0xFFFFBDBD);
        class235.field3278.method366(arg0 - 16904);
        class278.field4074.method366(-123);
        class258.field3801.method366(-103);
        class293.field4436.method366(35);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 86)
    public static final void method1995(int arg0, int arg1, int arg2, Class arg3) {
        class77 var4 = class106.field1405[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class356 var5 = var4.field1064; var5 != null; var5 = var5.field5275) {
            class407 var6 = var5.field5274;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5917 == arg1 && var6.field5918 == arg2) {
                class347.method2299(var6);
                return;
            }
        }
    }
}
