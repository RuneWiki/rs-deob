import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class89 extends class12 {

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "[I")
    public static int[] field1594 = new int[1000];

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static volatile int field1598 = 0;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Ldg;")
    public static class276 field1597 = new class276(64);

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field1603 = 0;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "Lvf;")
    public static class265 field1604 = class87.method582(-46, "::tele ");

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "[I")
    public static int[] field1593;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILgk;ILoe;I)V")
    public static final void method609(int arg0, int arg1, int arg2, class6 arg3, int arg4, class108 arg5, int arg6) {
        field1599++;
        if (arg5 == null) {
            return;
        }
        if (arg0 > -69) {
            field1597 = null;
        }
        int var7 = class79.field1500 + class122.field2180 & 0x7FF;
        int var8 = Math.max(arg3.field89 / 2, arg3.field84 / 2) + 10;
        int var9 = arg2 * arg2 + (arg4 * arg4);
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class247.field4289[var7];
        int var11 = var10 * 256 / (class39.field908 + 256);
        int var12 = class247.field4298[var7];
        int var13 = var12 * 256 / (class39.field908 + 256);
        int var14 = arg2 * var13 + arg4 * var11 >> 16;
        int var15 = arg4 * var13 - (arg2 * var11) >> 16;
        ((class88) arg5).method593(arg3.field89 / 2 + arg1 + var14 - (arg5.field1900 / 2), -var15 + arg6 - -(arg3.field84 / 2) + -(arg5.field1907 / 2), arg3.field202, arg3.field173);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public static void method610(byte arg0) {
        field1594 = null;
        field1597 = null;
        field1604 = null;
        if (arg0 != 81) {
            method609(-23, 93, 15, (class6) null, -52, (class108) null, 7);
        }
        field1593 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lfl;III)[Lcg;")
    public static final class34[] method611(class192 arg0, int arg1, int arg2, int arg3) {
        int var4 = -105 / ((-arg1 - 70) / 38);
        field1600++;
        return class28.method239(50, arg0, arg2, arg3) ? class217.method1493(10768) : null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(II)V")
    public class89(int arg0, int arg1) {
        this.field1596 = arg1;
        this.field1601 = arg0;
    }
}
