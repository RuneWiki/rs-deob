import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class68 {

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Ljv;")
    private class55 field1168 = new class55(64);

    @OriginalMember(owner = "client!er", name = "h", descriptor = "Lbu;")
    public class17 field1171;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "Lbu;")
    private class17 field1173;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "[I")
    public static int[] field1165 = new int[14];

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field1164 = 1;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "[I")
    public static int[] field1172 = new int[13];

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field1169 = -2;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Liv;")
    public static class64 field1174 = new class64(86, -1);

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public static int field1179 = 0;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "[I")
    public static int[] field1167;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public static final void method557(int arg0) {
        for (int var1 = 0; var1 < class148.field2361; var1++) {
            class150 var2 = class245.field3527[var1];
            if (var2.field2382 == 2) {
                if (var2.field2390 == null) {
                    var2.field2380 = Integer.MIN_VALUE;
                } else {
                    class45.field837.method2035(var2.field2390);
                }
            }
        }
        field1178++;
        if (arg0 != 64) {
            field1174 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)V")
    public final void method558(byte arg0, int arg1) {
        field1176++;
        int var3 = 125 / ((14 - arg0) / 58);
        class55 var4 = this.field1168;
        synchronized (this.field1168) {
            this.field1168.method493(false, arg1);
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public final void method559(int arg0) {
        if (arg0 != 8) {
            this.field1173 = null;
        }
        class55 var2 = this.field1168;
        synchronized (this.field1168) {
            this.field1168.method484(arg0 - 116);
        }
        field1166++;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lqp;")
    public final class466 method560(int arg0, int arg1) {
        field1175++;
        class55 var3 = this.field1168;
        class466 var4;
        synchronized (this.field1168) {
            var4 = (class466) this.field1168.method494(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1173.method114(arg0, arg1, arg1 - 60);
        class466 var6 = new class466();
        var6.field6951 = this;
        if (var5 != null) {
            var6.method2769(new class145(var5), 0);
        }
        class55 var7 = this.field1168;
        synchronized (this.field1168) {
            this.field1168.method485((long) arg0, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
    public static void method561(int arg0) {
        field1167 = null;
        field1172 = null;
        if (arg0 != 13) {
            field1174 = null;
        }
        field1165 = null;
        field1174 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IJIIZLjava/lang/String;ZBLjava/lang/String;ZI)V")
    public static final void method562(int arg0, long arg1, int arg2, int arg3, boolean arg4, String arg5, boolean arg6, byte arg7, String arg8, boolean arg9, int arg10) {
        if (arg7 != 113) {
            method562(117, 41L, 85, -93, false, null, false, (byte) 12, null, false, -45);
        }
        field1177++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class145 var14 = new class145(128);
        var14.method1109(false, 10);
        var14.method1094(arg7 + 1618659671, (arg6 ? 4 : 0) | (arg9 ? 1 : 0) | (arg4 ? 2 : 0));
        var14.method1084(arg7 - 111, arg1);
        var14.method1117(var12[0], (byte) 12);
        var14.method1089((byte) -89, arg8);
        var14.method1117(var12[1], (byte) 12);
        var14.method1094(1618659784, class110.field1871);
        var14.method1109(false, arg10);
        var14.method1109(false, arg3);
        var14.method1117(var12[2], (byte) 12);
        var14.method1094(1618659784, arg2);
        var14.method1094(1618659784, arg0);
        var14.method1117(var12[3], (byte) 12);
        var14.method1062(3, class472.field7075, class79.field1377);
        class145 var15 = new class145(350);
        var15.method1089((byte) -89, arg5);
        int var16 = 8 - class217.method1444(arg5, -123) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1109(false, (int) (Math.random() * 255.0D));
        }
        var15.method1102(var12, 1480411104);
        class410.field6141.field2289 = 0;
        class410.field6141.method1109(false, class339.field5135.field6139);
        class410.field6141.method1094(1618659784, var14.field2289 + var15.field2289 + 2);
        class410.field6141.method1094(arg7 ^ 0x607AC9B9, 590);
        class410.field6141.method1076(var14.field2289, -1, 0, var14.field2270);
        class410.field6141.method1076(var15.field2289, -1, 0, var15.field2270);
        class369.field5594 = 0;
        class91.field1568 = 1;
        class457.field6848 = 0;
        class47.field864 = -3;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
    public final void method563(int arg0) {
        class55 var2 = this.field1168;
        synchronized (this.field1168) {
            this.field1168.method488(arg0 - 3);
            if (arg0 != 0) {
                method561(-87);
            }
        }
        field1170++;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Loq;ILbu;Lbu;)V")
    public class68(class239 arg0, int arg1, class17 arg2, class17 arg3) {
        this.field1171 = arg3;
        this.field1173 = arg2;
        this.field1173.method119(29630, 3);
    }
}
