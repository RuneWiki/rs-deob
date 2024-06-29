import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class401 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[Lol;")
    public class246[] field5740 = null;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lte;")
    public class48 field5742 = null;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lte;")
    public class48 field5745 = null;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[Lol;")
    public class246[] field5741 = null;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lte;")
    public class48 field5737 = null;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Z")
    public boolean field5748;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[F")
    public static float[] field5736 = new float[4];

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Laf;")
    public static class13 field5746 = new class13();

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 4)
    public static void method2436(int arg0) {
        if (arg0 != 16) {
            method2436(-55);
        }
        field5746 = null;
        field5736 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 17)
    public static final void method2437(int arg0) {
        field5747++;
        class475.field6761.method4013(-3);
        if (arg0 > -85) {
            field5746 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)I", line = 32)
    public static final int method2438(int arg0, boolean arg1) {
        field5738++;
        if (class346.field4952 == null) {
            return 0;
        } else if (arg1 || class461.field6565 == null) {
            int var2 = 0;
            int var3 = 0;
            if (arg0 <= 46) {
                method2439(-51, null);
            }
            while (class346.field4952.length > var3) {
                int var4 = class346.field4952[var3];
                if (class595.field8457.method2609(0, var4)) {
                    var2++;
                }
                if (class714.field10077.method2609(0, var4)) {
                    var2++;
                }
                var3++;
            }
            return var2;
        } else {
            return class346.field4952.length * 2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lkw;)V", line = 152)
    public class401(class346 arg0) {
        this.field5748 = arg0.field5069;
        class641.method3701(-26, arg0);
        if (this.field5748) {
            byte[] var2 = class535.method3238(26, false, class611.field8737);
            this.field5742 = new class48(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class535.method3238(26, false, class76.field1108);
            this.field5745 = new class48(arg0, 6410, 128, 128, 16, var3, 6410);
            class294 var4 = arg0.field4974;
            if (var4.method1846(true)) {
                byte[] var5 = class535.method3238(26, false, class218.field3261);
                this.field5737 = new class48(arg0, 6408, 128, 128, 16);
                class48 var6 = new class48(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1845((byte) -118, this.field5737, var6, 2.0F)) {
                    this.field5737.method1126((byte) -61);
                } else {
                    this.field5737.method1127(0);
                    this.field5737 = null;
                }
                var6.method1127(0);
                return;
            }
        } else {
            this.field5741 = new class246[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class26.method114(var7 * 128 * 256, 4080, 32768, class611.field8737);
                this.field5741[var7] = new class246(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field5740 = new class246[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class26.method114(var8 * 128 * 2 * 128, 4080, 32768, class76.field1108);
                this.field5740[var8] = new class246(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILqk;)V", line = 76)
    public static final void method2439(int arg0, class146 arg1) {
        field5739++;
        if (arg0 != 1723) {
            field5750 = 106;
        }
        if (class207.field3140 == arg1.field2118) {
            class108.field1545[arg1.field2128] = true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 91)
    public static final void method2440(boolean arg0) {
        field5743++;
        class553 var1 = (class553) class466.field6643.method3565(-83);
        boolean var2 = class131.field1810 != null || class520.field7494 > 0;
        int var3 = var1.method760(123);
        int var4 = var1.method761(arg0);
        if (var2) {
            class3.field22 = 1;
        }
        if (var2) {
            class691.field9800 = class242.field3576;
        } else {
            class17.method82(-57, var4, var3, class242.field3576);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 124)
    public static final void method2441(String arg0, int arg1) {
        field5744++;
        if (arg0.equals("")) {
            return;
        }
        class321.field4375++;
        class88 var2 = class448.method2741((byte) 74, class15.field151, class583.field8319);
        var2.field1260.method2881(class231.method1605((byte) 44, arg0), (byte) 111);
        var2.field1260.method2902(arg0, false);
        class523.method3183(var2, (byte) 31);
        int var3 = 26 % ((-arg1 - 13) / 54);
    }
}
