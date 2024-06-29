import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class313 {

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "F")
    public float field5304;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "F")
    public float field5309;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field5303;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public int field5313;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "F")
    public float field5305;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Lke;")
    public static class106 field5312 = new class106();

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lcd;")
    public static class64 field5316 = class44.method335((byte) 71, "(Y<)4col>");

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "[Lvd;")
    public static class127[] field5317;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 6)
    public static final void method2165(byte arg0) {
        if (class94.field1747 != null) {
            class94.field1747.method1060(-27441);
        }
        if (class315.field5334 != null) {
            class315.field5334.method1060(-27441);
        }
        field5301++;
        class31.method271(22050, 2, class275.field4718, (byte) 126);
        class94.field1747 = class234.method1677(0, -1024, 22050, class228.field3876, class307.field5251);
        class94.field1747.method1058(256, class140.field2479);
        class315.field5334 = class234.method1677(1, -1024, 2048, class228.field3876, class307.field5251);
        if (arg0 == 77) {
            class315.field5334.method1058(256, class250.field4341);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)I", line = 32)
    public static final int method2166(int arg0) {
        if (arg0 != 16) {
            method2165((byte) -98);
        }
        field5311++;
        return 16;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)J", line = 43)
    public static final long method2167(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        return var3 == null || var3.field5092 == null ? 0L : var3.field5092.field2848;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLcd;Lqm;)Ll;", line = 64)
    public static final class284 method2168(byte arg0, class64 arg1, class222 arg2) {
        field5299++;
        int var3 = arg2.method1606(88, arg1);
        if (var3 == -1) {
            return new class284(0);
        }
        int[] var4 = arg2.method1592(-61, var3);
        if (arg0 >= -91) {
            field5316 = (class64) null;
        }
        class284 var5 = new class284(var4.length);
        for (int var6 = 0; var6 < var5.field4886; var6++) {
            class13 var7 = new class13(arg2.method1580(0, var4[var6], var3));
            var5.field4887[var6] = var7.method104((byte) -103);
            var5.field4885[var6] = var7.method150((byte) 110);
            var5.field4878[var6] = (short) var7.method112((byte) 92);
            var5.field4884[var6] = (short) var7.method112((byte) 92);
            var5.field4880[var6] = var7.method105((byte) 94);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIII)I", line = 103)
    public static final int method2169(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field5298++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else {
            if (arg0 != 60) {
                field5300 = 47;
            }
            return var4 == 2 ? 7 - arg2 : arg3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 131)
    public static void method2170(byte arg0) {
        if (arg0 != 47) {
            method2167(16, 62, -60);
        }
        field5316 = null;
        field5317 = null;
        field5312 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 153)
    public class313() {
        this.field5314 = -50;
        this.field5310 = class52.field843;
        this.field5306 = 0;
        this.field5304 = 1.1523438F;
        this.field5309 = 0.69921875F;
        this.field5302 = -60;
        this.field5303 = class52.field841;
        this.field5313 = -50;
        this.field5305 = 1.2F;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lkh;)V", line = 173)
    public class313(class13 arg0) {
        int var2 = arg0.method152((byte) -118);
        if ((var2 & 0x1) == 0) {
            this.field5303 = class52.field841;
        } else {
            this.field5303 = arg0.method105((byte) 90);
        }
        if ((var2 & 0x2) == 0) {
            this.field5304 = 1.1523438F;
        } else {
            this.field5304 = (float) arg0.method112((byte) 92) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field5309 = 0.69921875F;
        } else {
            this.field5309 = (float) arg0.method112((byte) 92) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field5305 = 1.2F;
        } else {
            this.field5305 = (float) arg0.method112((byte) 92) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5313 = -50;
            this.field5314 = -50;
            this.field5302 = -60;
        } else {
            this.field5314 = arg0.method153(47);
            this.field5302 = arg0.method153(-72);
            this.field5313 = arg0.method153(-95);
        }
        if ((var2 & 0x20) == 0) {
            this.field5310 = class52.field843;
        } else {
            this.field5310 = arg0.method105((byte) 104);
        }
        if ((var2 & 0x40) == 0) {
            this.field5306 = 0;
        } else {
            this.field5306 = arg0.method112((byte) 92);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([III[II)V", line = 226)
    public static final void method2171(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field5307++;
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg4; var9 < arg2; var9++) {
                if (arg0[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method2171(arg0, 56, var6 - 1, arg3, arg4);
            method2171(arg0, 72, arg2, arg3, var6 + 1);
        }
        if (arg1 <= 35) {
            method2170((byte) 127);
        }
    }
}
