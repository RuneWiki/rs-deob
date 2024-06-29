import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class454 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lmj;")
    public class562 field6409 = null;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lmj;")
    public class562 field6410 = null;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lmj;")
    public class562 field6415 = null;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[Lob;")
    public class629[] field6419 = null;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[Lob;")
    public class629[] field6412 = null;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
    public boolean field6411;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lvj;I)V")
    public static final void method2664(class374 arg0, int arg1) {
        arg0.field5037 = null;
        field6408++;
        if (arg1 == 128 && class304.field4148 < 20) {
            class282.field3899.method3145(arg0, arg1 + 2147483519);
            class304.field4148++;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIBLqa;I)V")
    public static final void method2665(int arg0, int arg1, int arg2, byte arg3, class207 arg4, int arg5) {
        field6418++;
        arg4.method1308(arg2, arg1, arg2 + arg5, arg0 + arg1);
        arg4.method1368(arg1, arg5, arg0, -16777216, arg2, (byte) -16);
        if (class132.field2109 < 100) {
            return;
        }
        float var6 = (float) class413.field5839 / (float) class413.field5821;
        int var7 = arg5;
        int var8 = arg0;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg5 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg5 - var7) / 2 + arg2;
        int var10 = (arg0 - var8) / 2 + arg1;
        if (class506.field7057 == null || class506.field7057.method429() != arg5 || arg0 != class506.field7057.method422()) {
            class413.method2462(class413.field5829, class413.field5839 + class413.field5826, class413.field5829 + class413.field5821, class413.field5826, var9, var10, var7 + var9, var8 + var10);
            class413.method2458(arg4);
            class506.field7057 = arg4.method1300(var9, var10, var7, var8, false);
        }
        int var11 = -70 / ((-arg3 - 22) / 54);
        class506.field7057.method497(var9, var10);
        int var12 = class86.field1380 * var7 / class413.field5821;
        int var13 = class271.field3772 * var8 / class413.field5839;
        int var14 = class309.field4172 * var7 / class413.field5821 + var9;
        int var15 = var10 + var8 - (class634.field9273 * var8 / class413.field5839) - var13;
        int var16 = -1996554240;
        if (class37.field767 == class163.field2363) {
            var16 = -1996488705;
        }
        arg4.method1321(var14, var15, var12, var13, var16, 1);
        arg4.method1325(var14, var15, var12, var13, var16, 0);
        if (class592.field8498 <= 0) {
            return;
        }
        int var17;
        if (class314.field4237 <= 50) {
            var17 = class314.field4237 * 5;
        } else {
            var17 = (100 - class314.field4237) * 5;
        }
        for (class299 var18 = (class299) class413.field5819.method456((byte) -120); var18 != null; var18 = (class299) class413.field5819.method460((byte) -91)) {
            class463 var19 = class413.field5809.method2136(-116, var18.field4088);
            if (class236.method1479((byte) -113, var19)) {
                if (class365.field4961 == var18.field4088) {
                    int var20 = var18.field4087 * var7 / class413.field5821 + var9;
                    int var21 = (class413.field5839 - var18.field4089) * var8 / class413.field5839 + var10;
                    arg4.method1368(var21 - 2, 4, 4, var17 << 24 | 0xFFFF00, var20 - 2, (byte) -16);
                } else if (class640.field9317 != -1 && class640.field9317 == var19.field6499) {
                    int var22 = var9 + (var18.field4087 * var7 / class413.field5821);
                    int var23 = var10 + ((class413.field5839 - var18.field4089) * var8 / class413.field5839);
                    arg4.method1368(var23 - 2, 4, 4, var17 << 24 | 0xFFFF00, var22 - 2, (byte) -16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method2666(int arg0) {
        if (arg0 != 2892) {
            return;
        }
        field6413++;
        for (class304 var1 = (class304) class625.field9107.method456((byte) -61); var1 != null; var1 = (class304) class625.field9107.method460((byte) 51)) {
            class51 var2 = var1.field4145;
            if (var2.field982) {
                var1.method1117(arg0 - 2892);
                var2.method486(4008);
            } else if (var2.field961 <= class405.field5763) {
                var2.method484(0, class64.field1097);
                if (var2.field982) {
                    var1.method1117(0);
                } else {
                    class108.method761(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZIII)Z")
    public static final boolean method2667(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6414++;
        if (!arg1) {
            field6417 = 106;
        }
        if ((class80.field1299[0][arg0][arg3] & 0x2) != 0) {
            return true;
        } else if ((class80.field1299[arg4][arg0][arg3] & 0x10) == 0) {
            return class648.method3728(arg3, arg4, (byte) 58, arg0) == arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public static final void method2668(int arg0, int arg1) {
        field6416++;
        class315.field4241 = -1;
        class627.field9160 = arg1;
        class315.field4241 = arg0;
        class399.method2386((byte) -113);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lgi;)V")
    public class454(class583 arg0) {
        this.field6411 = arg0.field8229;
        class536.method3079(arg0, 128);
        if (this.field6411) {
            byte[] var2 = class502.method2908(class209.field2953, 0, false);
            this.field6410 = new class562(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class502.method2908(class177.field2535, 0, false);
            this.field6415 = new class562(arg0, 6410, 128, 128, 16, var3, 6410);
            class277 var4 = arg0.field8199;
            if (var4.method1783((byte) 46)) {
                byte[] var5 = class502.method2908(class571.field7880, 0, false);
                this.field6409 = new class562(arg0, 6408, 128, 128, 16);
                class562 var6 = new class562(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1784(2.0F, this.field6409, var6, -2102)) {
                    this.field6409.method2510((byte) -98);
                } else {
                    this.field6409.method2506((byte) -119);
                    this.field6409 = null;
                }
                var6.method2506((byte) 74);
                return;
            }
        } else {
            this.field6419 = new class629[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class169.method1080(32768, var7 * 128 * 256, 255, class209.field2953);
                this.field6419[var7] = new class629(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field6412 = new class629[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class169.method1080(32768, var8 * 128 * 2 * 128, 255, class177.field2535);
                this.field6412[var8] = new class629(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
