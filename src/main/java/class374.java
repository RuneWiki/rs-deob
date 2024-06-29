import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class374 implements class211 {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Llg;")
    private class377 field5327;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "[Lkba;")
    private class90[] field5339;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field5326 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lnea;")
    public static class664 field5329 = new class664(82, 8);

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Lr;")
    private class166 field5332;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5333;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Z")
    private boolean field5337;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)V")
    public static void method2255(int arg0) {
        field5333 = null;
        int var1 = -115 % ((-arg0 - 17) / 63);
        field5329 = null;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
    public final void method702(int arg0) {
        if (class282.field4228 != this.field5332) {
            this.field5332 = class282.field4228;
            this.field5337 = true;
        }
        field5335++;
        this.field5332.method139(0);
        class90[] var2 = this.field5339;
        if (arg0 >= -10) {
            method2257((byte) 108);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class90 var4 = var2[var3];
            if (var4 != null) {
                var4.method420((byte) 67);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZB)V")
    public final void method704(boolean arg0, byte arg1) {
        field5334++;
        boolean var3 = true;
        if (arg1 != -48) {
            this.field5332 = null;
        }
        class90[] var4 = this.field5339;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class90 var6 = var4[var5];
            if (var6 != null) {
                var6.method421((byte) -54, var3 || this.field5337);
            }
        }
        this.field5337 = false;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lbd;[[BB)V")
    public static final void method2256(class56 arg0, byte[][] arg1, byte arg2) {
        field5338++;
        int var3 = class505.field7133.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class273.field4105[var4] >> 8) * 64 - class109.field1672;
                int var7 = (class273.field4105[var4] & 0xFF) * 64 - class203.field2874;
                class263.method1730(arg2 ^ 0x78);
                arg0.method606(var5, class423.field6155, var6, var7, class282.field4228, (byte) -36);
            }
        }
        if (arg2 != -121) {
            field5329 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
    public final void method703(int arg0) {
        if (arg0 < 59) {
            this.method696(-13, 101L);
        }
        field5340++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I")
    public final int method701(int arg0) {
        field5336++;
        int var2 = 0;
        if (arg0 <= 116) {
            method2257((byte) 0);
        }
        class90[] var3 = this.field5339;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class90 var5 = var3[var4];
            if (var5 == null || var5.method419((byte) 108)) {
                var2++;
            }
        }
        return var2 * 100 / this.field5339.length;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IJ)Z")
    public final boolean method696(int arg0, long arg1) {
        if (arg0 > -31) {
            field5326 = 99;
        }
        field5328++;
        return class490.method2840(true) >= ((long) this.field5327.field5366 + arg1);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)I")
    public final int method700(boolean arg0) {
        field5331++;
        return arg0 ? -3 : this.field5327.field5368;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Llg;Lmu;)V")
    public class374(class377 arg0, class270 arg1) {
        this.field5327 = arg0;
        this.field5339 = new class90[this.field5327.field5365.length];
        for (int var3 = 0; var3 < this.field5339.length; var3++) {
            this.field5339[var3] = arg1.method1762(this.field5327.field5365[var3], (byte) 100);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public static final void method2257(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class598.field8449[var1] = false;
        }
        field5330++;
        class200.field2825 = -1;
        class666.field9399 = -1;
        class563.field7927 = -1;
        class270.field4055 = 0;
        class429.field6294 = 0;
        class682.field9621 = class637.field9001;
        class43.field700 = 5;
        class394.field5844 = class413.field6011;
        class515.field7281 = class564.field7962;
        class328.field4854 = class131.field1928;
        if (arg0 <= 88) {
            method2257((byte) -98);
        }
        class21.field294 = class568.field7998;
        class450.field6492 = -1;
        class575.field8090 = class544.field7662;
    }
}
