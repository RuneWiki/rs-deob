import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class59 {

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Lhp;")
    private class277 field672 = new class277(64);

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lkea;")
    private class203 field675;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field674 = 0;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lkca;")
    public static class73 field671 = new class73(82, 2);

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field682 = -1;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lik;")
    public static class178 field680;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lq;")
    public static class364 field678;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Ljava/applet/Applet;")
    public static Applet field679;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Z")
    public static boolean field681;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method421(int arg0) {
        field673++;
        if (class61.field701 == -1 || class74.field787 == -1) {
            return;
        }
        int var1 = class562.field8020 + ((class614.field8931 - class562.field8020) * class39.field422 >> 16);
        class39.field422 += var1;
        if (class39.field422 < 65535) {
            class144.field1765 = false;
            class494.field7201 = false;
        } else {
            if (class144.field1765) {
                class494.field7201 = false;
            } else {
                class494.field7201 = true;
            }
            class39.field422 = 65535;
            class144.field1765 = true;
        }
        float var2 = (float) class39.field422 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class563.field8024 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class398.field6047[class61.field701][var4][var5] * 3;
            int var22 = class398.field6047[class61.field701][var4 + 1][var5] * 3;
            int var23 = (-class398.field6047[class61.field701][var4 + 3][var5] - (-class398.field6047[class61.field701][var4 + 2][var5] - class398.field6047[class61.field701][var4 + 2][var5])) * 3;
            int var24 = class398.field6047[class61.field701][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 - (var22 * 2 - var23);
            int var27 = class398.field6047[class61.field701][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class337.field4821 = (int) var3[0] - (class287.field3980 * 512);
        class100.field1192 = (int) var3[1] * -1;
        class207.field2781 = (int) var3[2] - (class250.field3549 * arg0);
        float[] var6 = new float[3];
        int var7 = class259.field3693 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class398.field6047[class74.field787][var7][var8] * 3;
            int var15 = class398.field6047[class74.field787][var7 + 1][var8] * 3;
            int var16 = (class398.field6047[class74.field787][var7 + 2][var8] + class398.field6047[class74.field787][var7 + 2][var8] - class398.field6047[class74.field787][var7 + 3][var8]) * 3;
            int var17 = class398.field6047[class74.field787][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class398.field6047[class74.field787][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class309.field4550 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class17.field177 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class474.field7009 = ((class398.field6047[class61.field701][var4 + 2][3] - class398.field6047[class61.field701][var4][3]) * class39.field422 >> 16) + class398.field6047[class61.field701][var4][3];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V", line = 104)
    public final void method422(boolean arg0) {
        class277 var2 = this.field672;
        synchronized (this.field672) {
            this.field672.method1810(arg0);
        }
        field676++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V", line = 114)
    public final void method423(int arg0, byte arg1) {
        field668++;
        if (arg1 != 18) {
            this.method424(-113, 77);
        }
        class277 var3 = this.field672;
        synchronized (this.field672) {
            this.field672.method1811((byte) 113, arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lbf;", line = 129)
    public final class465 method424(int arg0, int arg1) {
        field669++;
        class277 var3 = this.field672;
        class465 var4;
        synchronized (this.field672) {
            var4 = (class465) this.field672.method1801(arg0 - 31, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field675;
        byte[] var6;
        synchronized (this.field675) {
            var6 = this.field675.method1286(arg1, arg0, (byte) -49);
        }
        class465 var7 = new class465();
        if (var6 != null) {
            var7.method2847(new class194(var6), 0);
        }
        class277 var8 = this.field672;
        synchronized (this.field672) {
            this.field672.method1808((long) arg1, var7, (byte) -116);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 158)
    public static void method425(byte arg0) {
        field679 = null;
        field680 = null;
        if (arg0 <= -122) {
            field678 = null;
            field671 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V", line = 171)
    public final void method426(boolean arg0) {
        class277 var2 = this.field672;
        synchronized (this.field672) {
            this.field672.method1805(-10);
        }
        if (!arg0) {
            method421(23);
        }
        field670++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 195)
    public static final void method427(byte arg0, String arg1, int arg2) {
        field677++;
        class467 var3 = class541.method3144(arg2, (byte) -115, 2);
        var3.method2851(true);
        var3.field6933 = arg1;
        if (arg0 < 29) {
            method427((byte) -82, null, -118);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lcda;ILkea;)V", line = 212)
    public class59(class149 arg0, int arg1, class203 arg2) {
        this.field675 = arg2;
        this.field675.method1309(1675886592, 31);
    }
}
