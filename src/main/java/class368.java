import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class368 implements class444 {

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public int field5203;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public int field5208;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lfe;")
    public class345 field5197;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public int field5205;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public int field5198;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public int field5202;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Z")
    public boolean field5213;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public int field5200;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field5192;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public int field5204;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Lmp;")
    public class565 field5201;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[[I")
    public static int[][] field5194 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
    public static int[] field5196 = new int[4096];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Z")
    public static boolean field5190 = false;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lgca;")
    public static class705 field5193 = new class705();

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "Lsv;")
    public static class570 field5210 = new class570(17, 3);

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field5212 = 0;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field5214 = 1;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static final void method2198(int arg0) {
        class613.field8701.method156((byte) 96);
        field5206++;
        class452.field6197.method3209(true);
        class38.field451.method2914((byte) -126);
        class312.field4418.method370(false);
        class677.field9511.method3696(arg0 ^ 0xFFFFEDDC);
        class422.field5873.method2935((byte) -112);
        class168.field2552.method3290(117);
        class620.field8760.method1831((byte) -74);
        class600.field8552.method3555(arg0 + 1484);
        class4.field60.method3718((byte) 100);
        class662.field9323.method1709(48);
        class150.field2404.method1773(-117);
        class309.field4401.method653(-16225);
        class451.field6195.method4103(-14467);
        class523.field7326.method2672(19775);
        class498.field6854.method3436(arg0 ^ 0x2270);
        class648.field9192.method2363((byte) -103);
        class606.field8616.method1219(0);
        class402.field5547.method1473((byte) -42);
        class422.field5876.method3118(113);
        class233.field3382.method3414((byte) 111);
        class153.field2446.method2732((byte) 73);
        class353.method2140(-92);
        class314.method1912(true);
        class382.method2311(arg0 ^ arg0);
        class722.method4014(arg0 ^ 0xFFFFFFBA);
        class157.method1212((byte) -103);
        class5.field69.method2893((byte) -69);
        class126.field2150.method2893((byte) -104);
        class267.field3772.method2893((byte) 85);
        class356.field5053.method2893((byte) -82);
        class46.field621.method2893((byte) 80);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lhl;")
    public final class353 method327(byte arg0) {
        field5199++;
        if (arg0 <= 51) {
            this.field5198 = 91;
        }
        return class614.field8711;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)I")
    public static final int method2199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5191++;
        int var5 = arg1 & 0xF;
        int var6 = var5 < 8 ? arg3 : arg4;
        if (arg0 == 4096) {
            int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg3 : arg2);
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        } else {
            return -3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[BB)I")
    public static final int method2200(int arg0, int arg1, byte[] arg2, byte arg3) {
        field5195++;
        int var4 = -1;
        if (arg3 > -63) {
            return 13;
        } else {
            for (int var5 = arg1; var5 < arg0; var5++) {
                var4 = class643.field9145[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static final void method2201(byte arg0) {
        class420.field5827 = null;
        class91.field1308 = null;
        class401.field5530 = null;
        class670.field9398 = null;
        class664.field9358 = null;
        field5209++;
        class315.field4468 = null;
        class71.field1124 = null;
        class329.field4677 = null;
        class143.field2327 = null;
        class491.field6736 = null;
        class447.field6168 = null;
        class352.field4999 = null;
        class673.field9427 = null;
        class581.field8365 = null;
        class727.field10127 = null;
        class150.field2405 = null;
        int var1 = 56 % ((arg0 - 68) / 35);
        class456.field6223 = null;
        class478.field6575 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static final void method2202(boolean arg0) {
        if (arg0) {
            class514.field7096 = class410.field5618;
            class678.field9594 = class454.field6207;
        } else {
            class514.field7096 = class723.field10084;
            class678.field9594 = class495.field6799;
        }
        class169.field2565 = class514.field7096.length;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
    public static final void method2203(byte arg0) {
        class452.field6199++;
        field5207++;
        class302 var1 = class582.method3419(class63.field954, (byte) 127, class626.field8901);
        var1.field4341.method2546(true, class661.field9319);
        if (arg0 == -61) {
            class501.method2928(0, var1);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static void method2204(int arg0) {
        field5196 = null;
        field5194 = null;
        if (arg0 != 0) {
            method2201((byte) 10);
        }
        field5210 = null;
        field5193 = null;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(ILmp;Lfe;IIIIIIIZ)V")
    public class368(int arg0, class565 arg1, class345 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field5203 = arg9;
        this.field5208 = arg4;
        this.field5197 = arg2;
        this.field5205 = arg3;
        this.field5198 = arg5;
        this.field5202 = arg8;
        this.field5213 = arg10;
        this.field5200 = arg7;
        this.field5192 = arg0;
        this.field5204 = arg6;
        this.field5201 = arg1;
    }
}
