import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class463 extends class270 {

    @OriginalMember(owner = "client!od", name = "v", descriptor = "F")
    public float field6436;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    private int field6435;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public int field6428;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    private int field6442;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public int field6439;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public int field6438;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[I")
    public static int[] field6437 = new int[14];

    @OriginalMember(owner = "client!od", name = "s", descriptor = "Lgs;")
    public static class41 field6433 = new class41("WTI", 5);

    @OriginalMember(owner = "client!od", name = "C", descriptor = "Lpr;")
    public static class407 field6443 = new class407(29, -2);

    @OriginalMember(owner = "client!od", name = "D", descriptor = "[[Z")
    public static boolean[][] field6444 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method2633(int arg0) {
        field6433 = null;
        field6444 = null;
        if (arg0 <= 108) {
            field6433 = null;
        }
        field6443 = null;
        field6437 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZF)V")
    public abstract void method2507(boolean arg0, float arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)I")
    public final int method2634(boolean arg0) {
        field6440++;
        if (!arg0) {
            method2633(53);
        }
        return this.field6435;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)F")
    public final float method2635(int arg0) {
        int var2 = -70 % ((55 - arg0) / 40);
        field6431++;
        return this.field6436;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static final void method2636(int arg0) {
        class334.field4314.field6215 = 0;
        field6434++;
        class416.field5523 = null;
        class680.field9630.field6215 = 0;
        class588.field8361 = 0;
        class145.field1631 = null;
        class273.field3455 = null;
        if (arg0 <= 73) {
            field6445 = -5;
        }
        class478.field7009 = 0;
        class419.field5570 = null;
        class112.field1306 = 0;
        class195.method1125(-15444);
        class437.method2414((byte) -25);
        for (int var1 = 0; var1 < 2048; var1++) {
            class362.field4726[var1] = null;
        }
        class377.field4914 = null;
        for (int var2 = 0; var2 < class208.field2528; var2++) {
            class625 var4 = class609.field8605[var2].field6107;
            if (var4 != null) {
                var4.field3803 = -1;
            }
        }
        class245.method1420(-16981);
        class5.field41 = 1;
        class508.method2921(10, (byte) -123);
        for (int var3 = 0; var3 < 100; var3++) {
            class406.field5409[var3] = true;
        }
        class200.method1220((byte) -117);
        class450.field6201 = null;
        class67.field725 = 0L;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)I")
    public final int method2637(int arg0) {
        field6432++;
        return arg0 <= 56 ? -4 : this.field6442;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)I")
    public final int method2638(byte arg0) {
        if (arg0 >= -59) {
            return -110;
        } else {
            field6429++;
            return this.field6428;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
    public abstract void method2509(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)Lsf;")
    public static final class478 method2639(int arg0, boolean arg1) {
        if (arg1) {
            field6444 = null;
        }
        field6441++;
        class478 var2 = (class478) class294.field3865.method3690((byte) -51, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class25.field304.method1719(arg0, 0, 4);
        class478 var4 = new class478();
        if (var3 != null) {
            var4.method2797(-31717, new class452(var3));
        }
        var4.method2794(-15038);
        class294.field3865.method3683(var4, (byte) 105, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)I")
    public final int method2640(int arg0) {
        if (arg0 != -2049) {
            this.field6436 = 0.040346872F;
        }
        field6427++;
        return this.field6438;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)I")
    public final int method2641(byte arg0) {
        if (arg0 == -14) {
            field6430++;
            return this.field6439;
        } else {
            return 28;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIF)V")
    public class463(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6436 = arg5;
        this.field6435 = arg4;
        this.field6428 = arg1;
        this.field6442 = arg3;
        this.field6439 = arg2;
        this.field6438 = arg0;
    }
}
