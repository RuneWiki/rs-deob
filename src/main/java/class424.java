import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class424 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "F")
    public float field5316 = 1.0F;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "F")
    public float field5327 = 1.0F;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "F")
    public float field5331 = 0.25F;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public int field5330;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public int field5326;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Ljt;")
    public class533 field5329;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "F")
    public float field5315;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public int field5323;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public int field5320;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "F")
    public float field5324;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "F")
    public float field5328;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public int field5319;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "[I")
    public static int[] field5325 = new int[14];

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[S)[S")
    public static final short[] method2248(int arg0, int arg1, short[] arg2) {
        field5332++;
        short[] var3 = new short[arg1];
        int var4 = -103 / ((47 - arg0) / 44);
        class293.method1644(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method2249(int arg0) {
        if (arg0 <= -121) {
            field5325 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILmc;)Z")
    public final boolean method2250(int arg0, class424 arg1) {
        if (arg0 == 100) {
            field5318++;
            return this.field5326 == arg1.field5326 && this.field5324 == arg1.field5324 && this.field5328 == arg1.field5328 && this.field5315 == arg1.field5315 && this.field5331 == arg1.field5331 && this.field5327 == arg1.field5327 && this.field5316 == arg1.field5316 && this.field5319 == arg1.field5319 && this.field5330 == arg1.field5330 && this.field5329 == arg1.field5329;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILes;)V")
    public final void method2251(int arg0, class630 arg1) {
        field5317++;
        this.field5327 = (float) (arg1.method3501(-9268) * 8) / 255.0F;
        this.field5331 = (float) (arg1.method3501(-9268) * 8) / 255.0F;
        this.field5316 = (float) (arg1.method3501(arg0 ^ 0xFFFFDBC4) * arg0) / 255.0F;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLpn;)V")
    public static final void method2252(byte arg0, class69 arg1) {
        int var2 = 47 / ((-arg0 - 65) / 34);
        if (arg1.field941 != null) {
            arg1.field941.field3021 = 0;
        }
        field5321++;
        arg1.field939 = false;
        for (class69 var3 = arg1.method409(); var3 != null; var3 = arg1.method413()) {
            method2252((byte) 105, var3);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method2253(int arg0) {
        class232.method1397(-71);
        field5322++;
        class533.field7187 = null;
        class11.field192 = null;
        class71.field965 = null;
        class196.field2458 = 0;
        class8.field162 = 0;
        class325.field4172 = 0;
        class298.field3671.field8812 = 0;
        class221.field2713 = null;
        class362.method1989(-128);
        class113.method629(0);
        for (int var1 = 0; var1 < 2048; var1++) {
            class351.field4490[var1] = null;
        }
        class376.field4748 = null;
        for (int var2 = 0; var2 < class441.field5585; var2++) {
            class307 var4 = class518.field7076[var2].field2618;
            if (var4 != null) {
                var4.field9650 = -1;
            }
        }
        class565.method3106((byte) -61);
        class296.field3661 = 1;
        class196.field2471 = -1;
        class306.field3890 = -1;
        if (arg0 != 29723) {
            field5325 = null;
        }
        class361.method1987(10, 20);
        for (int var3 = 0; var3 < 100; var3++) {
            class413.field5168[var3] = true;
        }
        class76.method454(true);
        class581.field8124 = 0L;
        class373.field4703 = null;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class424() {
        this.field5314 = -60;
        this.field5330 = 0;
        this.field5326 = class130.field1620;
        this.field5329 = class474.field6009;
        this.field5315 = 1.2F;
        this.field5323 = -50;
        this.field5320 = -50;
        this.field5324 = 1.1523438F;
        this.field5328 = 0.69921875F;
        this.field5319 = class317.field4065;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Les;)V")
    public class424(class630 arg0) {
        int var2 = arg0.method3501(-9268);
        if (class301.field3698.method2700(-67, class651.field9191) && class337.field4338.method997() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5326 = class130.field1620;
            } else {
                this.field5326 = arg0.method3483(115);
            }
            if ((var2 & 0x2) == 0) {
                this.field5324 = 1.1523438F;
            } else {
                this.field5324 = (float) arg0.method3470(13111) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5328 = 0.69921875F;
            } else {
                this.field5328 = (float) arg0.method3470(13111) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5315 = 1.2F;
            } else {
                this.field5315 = (float) arg0.method3470(13111) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method3483(88);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method3470(13111);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method3470(13111);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method3470(13111);
            }
            this.field5324 = 1.1523438F;
            this.field5328 = 0.69921875F;
            this.field5315 = 1.2F;
            this.field5326 = class130.field1620;
        }
        if ((var2 & 0x10) == 0) {
            this.field5320 = -50;
            this.field5314 = -60;
            this.field5323 = -50;
        } else {
            this.field5320 = arg0.method3510(99);
            this.field5314 = arg0.method3510(114);
            this.field5323 = arg0.method3510(28);
        }
        if ((var2 & 0x20) == 0) {
            this.field5319 = class317.field4065;
        } else {
            this.field5319 = arg0.method3483(87);
        }
        if ((var2 & 0x40) == 0) {
            this.field5330 = 0;
        } else {
            this.field5330 = arg0.method3470(13111);
        }
        if ((var2 & 0x80) == 0) {
            this.field5329 = class474.field6009;
        } else {
            int var3 = arg0.method3470(13111);
            int var4 = arg0.method3470(13111);
            int var5 = arg0.method3470(13111);
            int var6 = arg0.method3470(13111);
            int var7 = arg0.method3470(13111);
            int var8 = arg0.method3470(13111);
            this.field5329 = class542.method2929(var3, var6, var7, var8, var5, var4, false);
        }
    }
}
