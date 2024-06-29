import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class34 {

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Lcc;")
    public static class209 field62 = class95.method669(84, "tbrefresh");

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Lcc;")
    private static class209 field63 = class95.method669(126, "Opened title screen");

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static volatile int field72 = -1;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "Lcc;")
    public static class209 field74 = field63;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "Lla;")
    public static class95 field75 = new class95(30);

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "B")
    public byte field69;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Lcc;")
    public class209 field64;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Lcc;")
    public class209 field67;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static void method42(boolean arg0) {
        field75 = null;
        field63 = null;
        field62 = null;
        field74 = null;
        if (arg0) {
            method44(true, false, 19, -5);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V")
    public static final void method43(int arg0, int arg1, int arg2) {
        if (arg1 >= -3) {
            field72 = -71;
        }
        field68++;
        class195 var3 = class178.method1229(arg0, 6, -128);
        var3.method1338(0);
        var3.field3511 = arg2;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZZII)V")
    public static final void method44(boolean arg0, boolean arg1, int arg2, int arg3) {
        field70++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class32.field577 = arg0;
        class132.field2538 = arg3;
        class192.field3479 = arg2;
        if (arg1) {
            field63 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)I")
    public static final int method45(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 / arg3;
        int var5 = -59 / ((28 - arg1) / 49);
        field71++;
        int var6 = arg0 & arg3 - 1;
        int var7 = arg2 / arg3;
        int var8 = arg3 - 1 & arg2;
        int var9 = class69.method508(var7, var4, (byte) 111);
        int var10 = class69.method508(var7, var4 + 1, (byte) 111);
        int var11 = class69.method508(var7 + 1, var4, (byte) 111);
        int var12 = class69.method508(var7 + 1, var4 + 1, (byte) 111);
        int var13 = class82.method592(arg3, (byte) 125, var10, var9, var6);
        int var14 = class82.method592(arg3, (byte) 92, var12, var11, var6);
        return class82.method592(arg3, (byte) 112, var14, var13, var8);
    }
}
