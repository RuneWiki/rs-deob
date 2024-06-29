import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class200 {

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "Lgw;")
    private class690 field2670 = new class690(64);

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "Luu;")
    private class237 field2673;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)I", line = 3)
    public static final int method1213(int arg0, int arg1) {
        return class151.field2085 == null ? 0 : class151.field2085[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)V", line = 6)
    public final void method1214(int arg0, int arg1) {
        class690 var3 = this.field2670;
        synchronized (this.field2670) {
            this.field2670.method3896(1, arg0);
            if (arg1 <= 77) {
                this.method1217((byte) 94);
            }
        }
        field2666++;
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(II)Lrfa;", line = 20)
    public final class401 method1215(int arg0, int arg1) {
        field2674++;
        class690 var3 = this.field2670;
        class401 var4;
        synchronized (this.field2670) {
            var4 = (class401) this.field2670.method3898((byte) -42, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field2673;
        byte[] var6;
        synchronized (this.field2673) {
            var6 = this.field2673.method1572(arg1, 0, arg0);
        }
        class401 var7 = new class401();
        if (var6 != null) {
            var7.method2495(new class63(var6), (byte) 99);
        }
        class690 var8 = this.field2670;
        synchronized (this.field2670) {
            this.field2670.method3899(108, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIII)V", line = 48)
    public static final void method1216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class409.field5827 = arg4;
        class204.field2693 = arg2;
        class49.field734 = arg5;
        field2671++;
        if (arg0 < 13) {
            return;
        }
        class724.field10048 = arg3;
        class355.field5109 = arg1;
        if (class355.field5109 >= 100) {
            int var6 = class409.field5827 * 512 + 256;
            int var7 = class49.field734 * 512 + 256;
            int var8 = class737.method4102((byte) 19, var6, var7, class96.field1331) - class724.field10048;
            int var9 = var6 - class671.field9282;
            int var10 = var8 - class206.field2702;
            int var11 = var7 - class123.field1680;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class25.field318 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class230.field3118 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class118.field1556 = 0;
            if (class25.field318 < 1024) {
                class25.field318 = 1024;
            }
            if (class25.field318 > 3072) {
                class25.field318 = 3072;
            }
        }
        class221.field2987 = -1;
        class388.field5597 = -1;
        class720.field10023 = 2;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 101)
    public final void method1217(byte arg0) {
        if (arg0 > -75) {
            return;
        }
        class690 var2 = this.field2670;
        synchronized (this.field2670) {
            this.field2670.method3906(-100);
        }
        field2669++;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Luv;Luv;I)V", line = 117)
    public static final void method1218(class755 arg0, class755 arg1, int arg2) {
        field2672++;
        class435.field6068++;
        class583 var3 = class54.method400(class213.field2800, (byte) 125, class265.field3896);
        var3.field7963.method473(-127, arg1.field10445);
        var3.field7963.method492(-2, arg0.field10469);
        var3.field7963.method473(-128, arg0.field10445);
        var3.field7963.method453(arg0.field10441, (byte) -78);
        var3.field7963.method488(-128, arg1.field10441);
        var3.field7963.method453(arg1.field10469, (byte) 110);
        class463.method2838(var3, (byte) 126);
        if (arg2 > 34) {
            ;
        }
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(II)I", line = 137)
    public static final int method1219(int arg0, int arg1) {
        if (arg1 != 8) {
            return -65;
        }
        field2667++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V", line = 185)
    public final void method1220(boolean arg0) {
        if (!arg0) {
            this.field2673 = null;
        }
        field2668++;
        class690 var2 = this.field2670;
        synchronized (this.field2670) {
            this.field2670.method3902(0);
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lgp;ILuu;)V", line = 205)
    public class200(class553 arg0, int arg1, class237 arg2) {
        this.field2673 = arg2;
        this.field2673.method1597(31, 0);
    }
}
