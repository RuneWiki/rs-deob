import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class230 extends class217 {

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Lli;")
    public static class191 field4203 = new class191();

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "Llc;")
    public static class143 field4210 = class66.method374("<col=00ffff>", -1);

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field4211 = 0;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public int field4198;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public int field4199;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public int field4201;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public int field4208;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public int field4209;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIIILlc;JI)V")
    public static final void method1565(byte arg0, int arg1, int arg2, int arg3, class143 arg4, long arg5, int arg6) {
        field4207++;
        class190 var8 = new class190(128);
        var8.method1276(arg0 ^ 0xCDA9A8F9, 10);
        var8.method1278((int) (Math.random() * 99999.0D), (byte) 85);
        var8.method1278(522, (byte) 103);
        var8.method1243(arg5, arg0 ^ 0xFFFFFFA3);
        var8.method1280(-112, (int) (Math.random() * 9.9999999E7D));
        var8.method1255(arg4, (byte) 0);
        var8.method1280(-113, (int) (Math.random() * 9.9999999E7D));
        var8.method1278(class188.field3414, (byte) 52);
        var8.method1276(844519173, arg3);
        var8.method1276(844519173, arg1);
        var8.method1280(arg0 - 112, (int) (Math.random() * 9.9999999E7D));
        var8.method1278(arg6, (byte) 117);
        var8.method1278(arg2, (byte) 51);
        var8.method1280(-118, (int) (Math.random() * 9.9999999E7D));
        var8.method1242(class51.field1012, 0, class42.field703);
        class285.field5010.field3487 = 0;
        class285.field5010.method1276(arg0 ^ 0xCDA9A8F9, 112);
        class285.field5010.method1276(844519173, var8.field3487);
        class285.field5010.method1264(var8.field3465, 0, var8.field3487, arg0 + 51314340);
        if (arg0 == -4) {
            class249.field4488 = 0;
            class83.field1504 = 1;
            class262.field4678 = -3;
            class4.field63 = 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public abstract void method1043(int arg0, int arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BILvh;IILvg;I)V")
    public static final void method1566(byte arg0, int arg1, class43 arg2, int arg3, int arg4, class230 arg5, int arg6) {
        field4200++;
        if (arg5 == null) {
            return;
        }
        int var7 = class184.field3339 + class137.field2400 & 0x7FF;
        int var8 = Math.max(arg2.field735 / 2, arg2.field831 / 2) + 10;
        int var9 = arg3 * arg3 + (arg4 * arg4);
        if ((var8 * var8) < var9 || arg0 != -73) {
            return;
        }
        int var10 = class196.field3635[var7];
        int var11 = var10 * 256 / (field4211 + 256);
        int var12 = class196.field3630[var7];
        int var13 = var12 * 256 / (field4211 + 256);
        int var14 = arg4 * var11 + (arg3 * var13) >> 16;
        int var15 = arg4 * var13 - (arg3 * var11) >> 16;
        ((class160) arg5).method1049(arg2.field735 / 2 + arg1 + var14 - (arg5.field4209 / 2), arg2.field831 / 2 + arg6 + -(arg5.field4206 / 2) + -var15, arg2.field779, arg2.field826);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
    public abstract void method1051(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIBI)V")
    public final void method1567(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var6 = this.field4209 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = 116 % ((arg3 + 59) / 62);
        int var9 = this.field4206 << 3;
        int var10 = (arg4 << 4) + (var9 & 0xF);
        field4204++;
        this.method1055(var6, var9, var7, var10, arg1, arg0);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
    public abstract void method1058(int arg0, int arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
    public abstract void method1046(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)V")
    public abstract void method1065(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static void method1568(boolean arg0) {
        field4203 = null;
        if (arg0) {
            method1568(false);
        }
        field4210 = null;
    }
}
