import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class276 {

    @OriginalMember(owner = "client!no", name = "g", descriptor = "Lvq;")
    public static class22 field4153 = new class22();

    @OriginalMember(owner = "client!no", name = "i", descriptor = "[I")
    public static int[] field4155 = new int[] { 0, 0, 0, 0, -1, 0, 0, 2, -1, 0, 0, 5, 0, 1, 0, -2, 6, 0, 0, 0, 3, 0, 0, 0, 0, 0, -2, 0, 3, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 15, 0, -1, 0, 2, 0, 4, 0, 0, 1, -1, 5, 0, 5, 2, 6, 0, 11, 0, 0, -1, 0, 0, 6, 0, 0, 0, 8, 0, 4, 0, 0, 0, -2, 0, 0, -2, 0, 12, 0, -2, -2, -1, 0, 10, 6, 9, 3, 0, 8, 0, 0, 8, 0, 8, 10, -2, 3, 0, 0, 0, 2, 8, 0, 0, 0, 0, 0, 7, 0, 0, 2, 0, 2, -1, 0, 6, 6, -1, 17, 5, -2, 0, 0, -2, 28, 0, 0, -1, -1, 0, 0, 12, 0, 0, 3, 0, 12, 0, 0, 0, 0, 0, 6, 1, 0, 0, 3, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 8, 0, 0, 4, 0, 0, 6, 1, -1, -2, -2, 20, 7, 0, 0, 0, 1, 10, 0, 8, 0, 0, 0, 0, 0, -1, 0, 4, 6, 0, 0, 0, 0, 0, 15, -1, 2, 0, 6, 0, 0, 12, 0, 7, 2, 0, 0, 0, 0, 0, 0, -1, 3, 0, 12, 8, 6, 0, 14, 0, 0, 10, 0, -1, 7, 0, 0, 0, 6, 0, 0, 0, 0, -1, 0, 0, 14, 0, 0, 8, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 2, -2 };

    @OriginalMember(owner = "client!no", name = "k", descriptor = "Z")
    public static volatile boolean field4157 = true;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "Lmb;")
    public static class258 field4156 = null;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field4158 = 0;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field4159 = -1;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public static final void method1968(int arg0) {
        class376.field5322.method106((byte) -126);
        int var1 = 12 % ((arg0 - 27) / 57);
        field4154++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
    public static final void method1969(int arg0, int arg1, int arg2) {
        field4149++;
        if (arg2 != 0) {
            return;
        }
        class351.field4988[arg1] = arg0;
        class79 var3 = (class79) class190.field2821.method1219((long) arg1, -127);
        if (var3 == null) {
            class79 var4 = new class79(class10.method63(-21149) + 500L);
            class190.field2821.method1217(arg2 ^ 0x1, (long) arg1, var4);
        } else {
            var3.field1341 = class10.method63(arg2 ^ 0xFFFFAD63) + 500L;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
    public static void method1970(byte arg0) {
        field4156 = null;
        field4153 = null;
        if (arg0 <= -76) {
            field4155 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIII)Lli;")
    public static final class452 method1971(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4152++;
        int var5 = -80 / ((arg4 + 74) / 46);
        class145[] var6 = null;
        class277 var7 = class311.method2119(-21880, arg0);
        if (var7.field4166 != null) {
            var6 = new class145[var7.field4166.length];
            for (int var8 = 0; var8 < var6.length; var8++) {
                class360 var9 = class144.method1135(var7.field4166[var8], 30);
                var6[var8] = new class145(var9.field5132, var9.field5135, var9.field5138, var9.field5123, var9.field5128, var9.field5129, var9.field5126, var9.field5134);
            }
        }
        return new class452(var7.field4168, var6, var7.field4167, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)V")
    public static final void method1972(int arg0, byte arg1) {
        field4148++;
        class221 var2 = class447.method2795(9, (byte) -49, arg0);
        var2.method1689(120);
        int var3 = 54 % ((arg1 + 48) / 41);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lpe;I)V")
    public static final void method1973(class390 arg0, int arg1) {
        field4151++;
        int var2 = arg0.field5601 - class267.field4002;
        int var3 = arg0.field5633 * 128 + (arg0.method1070((byte) -50) * 64);
        int var4 = arg0.field5616 * 128 + (arg0.method1070((byte) -50) * 64);
        arg0.field6520 += (var3 - arg0.field6520) / var2;
        arg0.field6519 += (var4 - arg0.field6519) / var2;
        arg0.field5693 = arg1;
        if (arg0.field5676 == 0) {
            arg0.method2469(-16384, 8192);
        }
        if (arg0.field5676 == 1) {
            arg0.method2469(arg1 ^ 0xFFFFC000, 12288);
        }
        if (arg0.field5676 == 2) {
            arg0.method2469(-16384, 0);
        }
        if (arg0.field5676 == 3) {
            arg0.method2469(-16384, 4096);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([BI)Z")
    public static final boolean method1974(byte[] arg0, int arg1) {
        field4147++;
        class37 var2 = new class37(arg0);
        int var3 = var2.method271((byte) 121);
        if (var3 != 1) {
            return false;
        } else if (arg1 <= 118) {
            return false;
        } else {
            boolean var4 = var2.method271((byte) 122) == 1;
            if (var4) {
                class252.method1808(var2, true);
            }
            class88.method659(var2, (byte) 76);
            return true;
        }
    }
}
