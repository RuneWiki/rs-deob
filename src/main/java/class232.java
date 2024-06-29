import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class232 implements class86 {

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    private int field3903 = 50;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "Z")
    private boolean field3922 = false;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "Lcc;")
    private class313 field3899;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "Lcc;")
    private class313 field3914;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Lfg;")
    private class48 field3885;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lfg;")
    private class48 field3892;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "[B")
    private byte[] field3926;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "[Z")
    private boolean[] field3918;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "[S")
    private short[] field3907;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "[Z")
    private boolean[] field3921;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "[Z")
    private boolean[] field3925;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "[Z")
    private boolean[] field3902;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "[B")
    private byte[] field3916;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "[B")
    private byte[] field3923;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "[B")
    private byte[] field3890;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[Z")
    private boolean[] field3894;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field3889 = 0;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field3900 = 0;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "Lfg;")
    public static class48 field3924 = new class48(64);

    @OriginalMember(owner = "client!el", name = "l", descriptor = "F")
    public static float field3896;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "F")
    public static float field3927;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "[S")
    public static short[] field3905;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZF)[I", line = 5)
    public final int[] method603(int arg0, boolean arg1, float arg2) {
        class139 var4 = this.method1581(arg0, -11167);
        if (arg1) {
            this.field3925 = (boolean[]) null;
        }
        field3908++;
        if (var4 == null) {
            return null;
        } else {
            var4.field2516 = true;
            return var4.method1026(this.field3922 || this.field3894[arg0], this, arg2, 30764, this.field3899);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(BI)V", line = 23)
    public final void method604(byte arg0, int arg1) {
        boolean var3 = false;
        field3910++;
        class51.method325(this.field3916[arg1] & 0xFF, this.field3923[arg1] & 0xFF, 26604);
        class139 var4 = this.method1581(arg1, -11167);
        if (var4 != null) {
            var3 = var4.method1023(-65, this.field3922 || this.field3894[arg1], this, this.field3899);
        }
        if (arg0 <= 23) {
            this.method601(100, -59);
        }
        if (!var3) {
            class39 var5 = this.method1576(arg1, 65535);
            var5.method249(1);
        }
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(II)Lhk;", line = 53)
    private final class39 method1576(int arg0, int arg1) {
        field3920++;
        class39 var3 = (class39) this.field3892.method303((long) arg0, 0);
        if (var3 == null) {
            class39 var4 = new class39(arg1 & this.field3907[arg0]);
            this.field3892.method308(var4, (long) arg0, (byte) 126);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(II)Z", line = 68)
    public final boolean method608(int arg0, int arg1) {
        if (arg0 != -14101) {
            this.method601(2, 59);
        }
        field3919++;
        return this.field3902[arg1];
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 85)
    public static void method1577(byte arg0) {
        field3924 = null;
        if (arg0 == 84) {
            field3905 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 98)
    public final void method1578(int arg0) {
        this.field3885.method307(0);
        field3913++;
        if (this.field3892 != null) {
            this.field3892.method307(arg0 - 7);
        }
        if (arg0 != 7) {
            this.field3902 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Z", line = 123)
    public final boolean method599(int arg0, int arg1) {
        field3886++;
        int var3 = -65 % ((30 - arg0) / 41);
        return this.field3921[arg1];
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(IB)Z", line = 133)
    public final boolean method607(int arg0, byte arg1) {
        if (arg1 != -69) {
            field3889 = -78;
        }
        class139 var3 = this.method1581(arg0, -11167);
        field3917++;
        return var3 == null ? false : var3.method1018(this, (byte) -127, this.field3899);
    }

    @OriginalMember(owner = "client!el", name = "h", descriptor = "(II)I", line = 157)
    public static final int method1579(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(ZI)V", line = 171)
    public final void method1580(boolean arg0, int arg1) {
        if (arg1 >= -94) {
            this.method1583((byte) 119, -122);
        }
        field3928++;
        this.field3922 = arg0;
        this.method1578(7);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)Z", line = 184)
    public final boolean method600(int arg0, int arg1) {
        field3887++;
        if (arg0 != 200) {
            this.method598(false, -43);
        }
        return this.field3922 || this.field3894[arg1];
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)I", line = 205)
    public final int method601(int arg0, int arg1) {
        field3895++;
        if (arg1 > -120) {
            field3905 = (short[]) null;
        }
        return this.field3923[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)I", line = 216)
    public final int method597(int arg0, byte arg1) {
        if (arg1 == -98) {
            field3897++;
            return this.field3907[arg0] & 0xFFFF;
        } else {
            return -122;
        }
    }

    @OriginalMember(owner = "client!el", name = "i", descriptor = "(II)Lng;", line = 232)
    private final class139 method1581(int arg0, int arg1) {
        class139 var3 = (class139) this.field3885.method303((long) arg0, 0);
        field3911++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3914.method2173(arg0, 0, (byte) -32);
        if (var4 == null) {
            return null;
        }
        if (arg1 != -11167) {
            this.field3890 = (byte[]) null;
        }
        class134 var5 = new class134(var4);
        class139 var6 = new class139(var5);
        this.field3885.method308(var6, (long) arg0, (byte) 125);
        return var6;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZ)V", line = 259)
    public final void method1582(int arg0, boolean arg1) {
        this.field3903 = arg0;
        field3888++;
        if (!arg1) {
            this.field3894 = (boolean[]) null;
        }
        this.field3885 = new class48(this.field3903);
        if (class56.field846) {
            this.field3892 = new class48(this.field3903);
        } else {
            this.field3892 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(BI)V", line = 278)
    public final void method1583(byte arg0, int arg1) {
        field3906++;
        if (arg0 >= -90) {
            field3900 = -49;
        }
        for (class139 var3 = (class139) this.field3885.method305(1); var3 != null; var3 = (class139) this.field3885.method306(-98)) {
            if (var3.field2516) {
                var3.method1028(arg1, 9480);
                var3.field2516 = false;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "j", descriptor = "(II)V", line = 302)
    public static final void method1584(int arg0, int arg1) {
        field3891++;
        class127 var2 = class294.field4879;
        synchronized (class294.field4879) {
            class298.field4955 = arg0;
            if (arg1 != 0) {
                field3905 = (short[]) null;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(JI)V", line = 317)
    public static final void method1585(long arg0, int arg1) {
        field3912++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class14.field197 < 100 || class4.field31) || class14.field197 >= 200) {
            class73.method530(class224.field3772, (byte) 97, 0, class48.field747);
            return;
        }
        class126 var3 = class250.method1696(false, arg0).method869(126);
        for (int var4 = 0; var4 < class14.field197; var4++) {
            if (class64.field1088[var4] == arg0) {
                class73.method530(class224.field3772, (byte) 121, 0, class12.method69(new class126[] { var3, class96.field1529 }, (byte) 123));
                return;
            }
        }
        for (int var5 = 0; var5 < class116.field1961; var5++) {
            if (class163.field2922[var5] == arg0) {
                class73.method530(class224.field3772, (byte) 84, 0, class12.method69(new class126[] { class46.field714, var3, class241.field4061 }, (byte) 122));
                return;
            }
        }
        if (var3.method872(class286.field4744.field5019, 0)) {
            class73.method530(class224.field3772, (byte) 87, 0, class128.field2207);
            return;
        }
        class298.field4953[class14.field197] = var3;
        class64.field1088[class14.field197] = arg0;
        class262.field4381[class14.field197] = 0;
        class87.field1372[class14.field197] = class224.field3772;
        class200.field3404[class14.field197] = arg1;
        class36.field531++;
        class132.field2265[class14.field197] = false;
        class14.field197++;
        class130.field2227 = class50.field777;
        class103.field1645.method1238(229, 103);
        class103.field1645.method962(-121, arg0);
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(II)Z", line = 382)
    public final boolean method605(int arg0, int arg1) {
        if (arg0 == 0) {
            field3909++;
            return this.field3925[arg1];
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)I", line = 395)
    public final int method596(byte arg0, int arg1) {
        field3898++;
        return arg0 >= -32 ? -10 : this.field3926[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lcc;Lcc;Lcc;IZ)V", line = 481)
    public class232(class313 arg0, class313 arg1, class313 arg2, int arg3, boolean arg4) {
        this.field3903 = arg3;
        this.field3899 = arg2;
        this.field3914 = arg0;
        this.field3922 = arg4;
        this.field3885 = new class48(this.field3903);
        if (class56.field846) {
            this.field3892 = new class48(this.field3903);
        } else {
            this.field3892 = null;
        }
        class134 var6 = new class134(arg1.method2173(0, 0, (byte) -125));
        int var7 = var6.method942(true);
        this.field3926 = new byte[var7];
        this.field3918 = new boolean[var7];
        this.field3907 = new short[var7];
        this.field3921 = new boolean[var7];
        this.field3925 = new boolean[var7];
        this.field3902 = new boolean[var7];
        this.field3916 = new byte[var7];
        this.field3923 = new byte[var7];
        this.field3890 = new byte[var7];
        this.field3894 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3918[var8] = var6.method948(-125) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3918[var9]) {
                this.field3921[var9] = var6.method948(-126) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3918[var10]) {
                this.field3925[var10] = var6.method948(-121) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3918[var11]) {
                this.field3894[var11] = var6.method948(-127) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3918[var12]) {
                this.field3902[var12] = var6.method948(-125) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3918[var13]) {
                this.field3890[var13] = var6.method977(19773);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3918[var14]) {
                this.field3926[var14] = var6.method977(19773);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3918[var15]) {
                this.field3916[var15] = var6.method977(19773);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3918[var16]) {
                this.field3923[var16] = var6.method977(19773);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3918[var17]) {
                this.field3907[var17] = (short) var6.method942(true);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)I", line = 413)
    public final int method598(boolean arg0, int arg1) {
        if (!arg0) {
            this.method597(-22, (byte) 0);
        }
        field3904++;
        return this.field3916[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(IB)I", line = 439)
    public final int method602(int arg0, byte arg1) {
        field3915++;
        if (arg1 != -87) {
            method1579(8, 55);
        }
        return this.field3890[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(II)[I", line = 464)
    public final int[] method606(int arg0, int arg1) {
        field3901++;
        class139 var3 = this.method1581(arg1, -11167);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -11820) {
                this.field3902 = (boolean[]) null;
            }
            return var3.method1024(this.field3899, -1991, this, this.field3922 || this.field3894[arg1]);
        }
    }
}
