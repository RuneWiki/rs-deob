import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class182 extends class53 {

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "[I")
    public static int[] field3030 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
    public static int field3033 = 1;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "Lwa;")
    public static class75 field3037 = class66.method560("m-Ochte mit Ihnen handeln)3", false);

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "Lwa;")
    public static class75 field3031 = class66.method560("Update)2Liste geladen)3", false);

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "Lwa;")
    public static class75 field3035 = class66.method560("Lade Schrifts-=tze )2 ", false);

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!pl", name = "X", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!pl", name = "Y", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!pl", name = "Z", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!pl", name = "ab", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!pl", name = "bb", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[[I", line = 11)
    public final int[][] method66(int arg0, int arg1) {
        int var3 = -10 % ((arg1 - 76) / 42);
        field3040++;
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class269.field4644; var8++) {
                this.method1341(arg0, (byte) -86, var8);
                int[][] var9 = this.method388(124, 0, class298.field5093);
                var6[var8] = var9[0][class66.field1137];
                var5[var8] = var9[1][class66.field1137];
                var7[var8] = var9[2][class66.field1137];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBI)V", line = 54)
    private final void method1341(int arg0, byte arg1, int arg2) {
        field3032++;
        if (arg1 != -86) {
            return;
        }
        int var4 = class50.field814[arg0];
        int var5 = class67.field1178[arg2];
        float var6 = (float) Math.atan2((double) (var5 - 2048), (double) (var4 - 2048));
        if (-3.141592653589793D <= (double) var6 && (double) var6 <= -2.356194490192345D) {
            class66.field1137 = arg2;
            class298.field5093 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class66.field1137 = arg0;
            class298.field5093 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && -1.5707963267948966D <= (double) var6) {
            class66.field1137 = class269.field4644 - arg0;
            class298.field5093 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class298.field5093 = class303.field5189 - arg0;
            class66.field1137 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class66.field1137 = class269.field4644 - arg2;
            class298.field5093 = class303.field5189 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class66.field1137 = class269.field4644 - arg0;
            class298.field5093 = class303.field5189 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class66.field1137 = arg0;
            class298.field5093 = class303.field5189 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class66.field1137 = class269.field4644 - arg2;
            class298.field5093 = arg0;
        }
        class66.field1137 &= class157.field2697;
        class298.field5093 &= class3.field31;
    }

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "(I)V", line = 130)
    public static final void method1342(int arg0) {
        class275.method1959((byte) 121);
        class297.method2058((byte) 103);
        class199.method1482((byte) 106);
        class2.method12(21);
        class125.method973((byte) 116);
        field3038++;
        class54.method394(0);
        class229.method1681(104);
        class5.method30(-110);
        class291.method2029(20456);
        class100.method761((byte) -4);
        class207.method1530(-4);
        class171.method1268((byte) 59);
        class35.method233(true);
        class163.method1220(26462);
        class217.field3715.method1510((byte) -123);
        class109.field1877.method1920((byte) -59);
        class42.field698.method1920((byte) -59);
        class168.field2831.method1920((byte) -59);
        class126.field2187.method1920((byte) -59);
        if (arg0 > -70) {
            return;
        }
        class121.field2039.method1920((byte) -59);
        class302.field5172.method1920((byte) -59);
        class236.field3983.method1920((byte) -59);
        class136.field2333.method1920((byte) -59);
        class163.field2778.method1920((byte) -59);
        class66.field1150.method1920((byte) -59);
        class294.field5063.method1920((byte) -59);
        class134.field2307.method1201(-20111);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILja;Z)V", line = 170)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field3034++;
        if (!arg2) {
            field3035 = (class75) null;
        }
        if (arg0 == 0) {
            this.field880 = arg1.method501(0) == 1;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 195)
    public class182() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)Lfe;", line = 205)
    public static final class229 method1343(int arg0, byte arg1) {
        field3043++;
        class229 var2 = (class229) class194.field3225.method1193((long) arg0, 100);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 62) {
            method1343(4, (byte) 121);
        }
        byte[] var3 = class244.field4107.method1911(class269.method1930(1699, arg0), class188.method1419(107, arg0), -67);
        class229 var4 = new class229();
        var4.field3838 = arg0;
        if (var3 != null) {
            var4.method1672(new class60(var3), arg1 ^ 0x48);
        }
        var4.method1669(-1);
        class194.field3225.method1194(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZB)V", line = 230)
    public static final void method1344(boolean arg0, byte arg1) {
        class287.field4937 = arg0;
        if (arg1 != 54) {
            method1346((byte) -96);
        }
        class306.field5235 = !class300.method2067(-12461);
        field3041++;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 246)
    public static final void method1345(byte arg0) {
        class67.field1168.method1200(false);
        class14.field188.method1200(false);
        if (arg0 != 38) {
            method1346((byte) 50);
        }
        field3044++;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)V", line = 258)
    public static void method1346(byte arg0) {
        field3030 = null;
        field3035 = null;
        field3037 = null;
        field3031 = null;
        if (arg0 != 43) {
            field3035 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)[I", line = 271)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            method1343(-42, (byte) 44);
        }
        field3042++;
        int[] var3 = this.field878.method1603(arg1, (byte) 108);
        if (this.field878.field3749) {
            for (int var4 = 0; var4 < class269.field4644; var4++) {
                this.method1341(arg1, (byte) -86, var4);
                int[] var5 = this.method391(0, 0, class298.field5093);
                var3[var4] = var5[class66.field1137];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(IBI)V", line = 317)
    public static final void method1347(int arg0, byte arg1, int arg2) {
        class233 var3 = class237.method1721(arg2, -124);
        int var4 = var3.field3946;
        int var5 = var3.field3945;
        field3045++;
        int var6 = var3.field3948;
        int var7 = class273.field4719[var6 - var4];
        if (arg1 < 109) {
            return;
        }
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class162.method1212(false, ~var8 & class6.field77[var5] | arg0 << var4 & var8, var5);
    }
}
