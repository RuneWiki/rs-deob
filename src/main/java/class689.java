import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class689 {

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
    private int[] field9408 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lpca;")
    public static class714 field9415 = new class714(32);

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field9420 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lle;")
    public class307 field9406;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field9409;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "[I")
    private int[] field9412;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "[J")
    public static long[] field9421;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[S")
    private short[] field9403;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[S")
    private short[] field9405;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[S")
    private short[] field9410;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "[S")
    private short[] field9414;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method3847(int arg0) {
        field9413++;
        boolean var2 = true;
        class323 var3 = this.field9406.field4296;
        synchronized (this.field9406.field4296) {
            int var4 = -112 % ((-arg0 - 30) / 46);
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field9408[var5] != -1 && !this.field9406.field4296.method2097((byte) -95, this.field9408[var5], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lee;B)V", line = 36)
    public final void method3848(class675 arg0, byte arg1) {
        if (arg1 != -36) {
            return;
        }
        field9411++;
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                return;
            }
            this.method3850((byte) -42, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 59)
    public static final void method3849(int arg0) {
        field9422++;
        if (arg0 == 18429 && class577.field8147 != null) {
            class268.field3824 = new class710();
            class268.field3824.method3987(class577.field8147, class577.field8147.field3662.method588((byte) 120, class549.field7669), class271.field3877, class577.field8147.field3659, (byte) 118);
            class461.field6497 = new Thread(class268.field3824, "");
            class461.field6497.start();
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BILee;)V", line = 80)
    private final void method3850(byte arg0, int arg1, class675 arg2) {
        field9416++;
        if (arg0 != -42) {
            this.method3856((byte) -103);
        }
        if (arg1 == 1) {
            arg2.method3750((byte) 35);
        } else if (arg1 == 2) {
            int var8 = arg2.method3750((byte) 35);
            this.field9412 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field9412[var9] = arg2.method3757((byte) -65);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg2.method3750((byte) 35);
                this.field9414 = new short[var6];
                this.field9405 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field9414[var7] = (short) arg2.method3757((byte) -65);
                    this.field9405[var7] = (short) arg2.method3757((byte) -65);
                }
            } else if (arg1 == 41) {
                int var4 = arg2.method3750((byte) 35);
                this.field9403 = new short[var4];
                this.field9410 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field9403[var5] = (short) arg2.method3757((byte) -65);
                    this.field9410[var5] = (short) arg2.method3757((byte) -65);
                }
                return;
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field9408[arg1 - 60] = arg2.method3757((byte) -65);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 171)
    public static void method3851(int arg0) {
        field9415 = null;
        if (arg0 == -31693) {
            field9421 = null;
            field9409 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)Z", line = 190)
    public final boolean method3852(int arg0) {
        field9418++;
        if (arg0 != 10779) {
            this.field9405 = null;
        }
        if (this.field9412 == null) {
            return true;
        }
        boolean var2 = true;
        class323 var3 = this.field9406.field4296;
        synchronized (this.field9406.field4296) {
            for (int var4 = 0; var4 < this.field9412.length; var4++) {
                if (!this.field9406.field4296.method2097((byte) -114, this.field9412[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILha;)V", line = 225)
    public static final void method3853(int arg0, class58 arg1) {
        field9402++;
        int var2 = 0;
        int var3 = 0;
        if (class589.field8295) {
            var2 = class171.method1102(5467);
            var3 = class575.method3288((byte) -113);
        }
        arg1.method469(var2, var3, class446.field6323 + var2, var3 + 350);
        arg1.method431(var2, var3, class446.field6323, 350, class101.field1199 << 24 | 0x332277, 1);
        class189.method1186(var3 + 350, class446.field6323 + var2, (byte) -122, var2, var3);
        int var4 = 350 / class570.field8090;
        if (class407.field5766 > 0) {
            int var5 = 346 - class570.field8090 - 4;
            int var6 = var4 * var5 / (var4 + class407.field5766 - 1);
            int var7 = 4;
            if (class407.field5766 > 1) {
                var7 += (class407.field5766 - class446.field6324 - 1) * (var5 - var6) / (class407.field5766 - 1);
            }
            arg1.method431(class446.field6323 + var2 - 16, var3 + var7, 12, var6, class101.field1199 << 24 | 0x332277, 2);
            for (int var8 = class446.field6324; var8 < class446.field6324 + var4 && var8 < class407.field5766; var8++) {
                String[] var9 = class719.method4040(11027, '\b', class540.field7569[var8]);
                int var10 = (class446.field6323 - 8 - 16) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = var10 * var11 + 8;
                    arg1.method469(var2 + var12, var3, var12 + var10 + var2 - 8, var3 + 350);
                    class478.field6780.method498(var2 + var12, 173, -1, var3 - ((var8 - class446.field6324) * class570.field8090) - class455.field6428.field2047 - (-350 - -class676.field9233 - -2), class399.method2494(-112, var9[var11]), -16777216);
                }
            }
        }
        class352.field4974.method506((byte) -102, -16777216, class446.field6323 + var2 - 25, "Build: 633", -1, var3 + 350 - 20);
        arg1.method469(var2, var3, class446.field6323 + var2, var3 - -350);
        arg1.method458(var2, var3 + 350 - class676.field9233, 8985, class446.field6323, -1);
        if (arg0 != 1599052696) {
            return;
        }
        class505.field7241.method498(var2 + 10, 173, -1, var3 + 349 - class119.field1441.field2047, "--> " + class399.method2494(arg0 ^ 0xA0B0642B, class185.field2500), -16777216);
        if (!class70.field876) {
            return;
        }
        int var13 = -1;
        if (class740.field10285 % 30 > 15) {
            var13 = 16777215;
        }
        arg1.method400(121, class119.field1441.method992("--> " + class399.method2494(arg0 ^ 0xA0B06428, class185.field2500).substring(0, class115.field1387), (byte) -47) + (var2 + 10), var3 - -350 + -class119.field1441.field2047 + -11, 12, var13);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Lie;", line = 309)
    public final class6 method3854(byte arg0) {
        field9419++;
        if (this.field9412 == null) {
            return null;
        }
        class6[] var2 = new class6[this.field9412.length];
        class323 var3 = this.field9406.field4296;
        synchronized (this.field9406.field4296) {
            int var4 = 0;
            while (true) {
                if (this.field9412.length <= var4) {
                    break;
                }
                var2[var4] = class393.method2470(0, this.field9406.field4296, this.field9412[var4], 0);
                var4++;
            }
        }
        if (arg0 != 20) {
            field9415 = null;
        }
        for (int var5 = 0; var5 < this.field9412.length; var5++) {
            if (var2[var5].field62 < 13) {
                var2[var5].method33(2, true);
            }
        }
        class6 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class6(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field9414 != null) {
            for (int var7 = 0; var7 < this.field9414.length; var7++) {
                var6.method36(this.field9405[var7], this.field9414[var7], (byte) -1);
            }
        }
        if (this.field9403 != null) {
            for (int var8 = 0; var8 < this.field9403.length; var8++) {
                var6.method34(this.field9403[var8], this.field9410[var8], arg0 - 143);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JB)V", line = 381)
    public static final void method3855(long arg0, byte arg1) {
        field9417++;
        if (class553.field7776 != null) {
            if (class97.field1168 == 1 || class97.field1168 == 5) {
                class271.method1769(arg0, (byte) -116);
            } else if (class97.field1168 == 4) {
                class156.method1045(arg0, arg1 ^ 0x3DFF);
            }
        }
        class388.method2442((long) class740.field10285, class268.field3831, -16448);
        if (class457.field6447 != -1) {
            class55.method359(class457.field6447, -125);
        }
        if (arg1 != 87) {
            method3849(96);
        }
        for (int var3 = 0; var3 < class540.field7565; var3++) {
            if (class583.field8210[var3]) {
                class220.field2877[var3] = true;
            }
            class722.field10021[var3] = class583.field8210[var3];
            class583.field8210[var3] = false;
        }
        class74.field974 = class740.field10285;
        class545.method3156(-1, -1, null, 0);
        class746.method4151(null, -1, -104, -1);
        if (class457.field6447 != -1) {
            class540.field7565 = 0;
            class177.method1124((byte) -72);
        }
        class268.field3831.method424();
        class603.method3386(class268.field3831, -16711936);
        int var4 = class346.method2240(false);
        if (var4 == -1) {
            var4 = class86.field1057;
        }
        if (var4 == -1) {
            var4 = class519.field7376;
        }
        class385.method2437(var4, (byte) 125);
        int var5 = class660.field9039.method1835((byte) 127) << 8;
        class463.method2747(class660.field9039.field1250 + var5, class660.field9039.field1264 + var5, class660.field9039.field1266, (byte) 109, class144.field2064);
        class144.field2064 = 0;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Lie;", line = 450)
    public final class6 method3856(byte arg0) {
        field9407++;
        class6[] var2 = new class6[5];
        int var3 = 0;
        class323 var4 = this.field9406.field4296;
        synchronized (this.field9406.field4296) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    if (arg0 >= -6) {
                        field9415 = null;
                    }
                    break;
                }
                if (this.field9408[var5] != -1) {
                    var2[var3++] = class393.method2470(0, this.field9406.field4296, this.field9408[var5], 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field62 < 13) {
                var2[var6].method33(2, true);
            }
        }
        class6 var7 = new class6(var2, var3);
        if (this.field9414 != null) {
            for (int var8 = 0; var8 < this.field9414.length; var8++) {
                var7.method36(this.field9405[var8], this.field9414[var8], (byte) -1);
            }
        }
        if (this.field9403 != null) {
            for (int var9 = 0; var9 < this.field9403.length; var9++) {
                var7.method34(this.field9403[var9], this.field9410[var9], -112);
            }
        }
        return var7;
    }
}
