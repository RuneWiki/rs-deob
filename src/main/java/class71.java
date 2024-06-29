import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class71 extends class216 {

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "Lbd;")
    private static class162 field1133 = class17.method142(0, "Ok");

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lbd;")
    public static class162 field1129 = class17.method142(0, "unzap");

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "Lbd;")
    public static class162 field1136 = field1133;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "[I")
    public static int[] field1140 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Lvb;")
    public static class166 field1132;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V", line = 12)
    public static final void method516(int arg0, boolean arg1) {
        field1138++;
        byte var2;
        byte[][] var3;
        if (class117.field2159 && arg1) {
            var2 = 1;
            var3 = class131.field2361;
        } else {
            var2 = 4;
            var3 = class209.field3542;
        }
        if (arg0 >= -117) {
            field1129 = (class162) null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class58.method401((byte) 62);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class47.field756[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 14 & 0x3FF;
                            int var10 = (var7 & 0x7) >> 1;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var9 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class123.field2230.length; var13++) {
                                if (class123.field2230[var13] == var12 && var3[var13] != null) {
                                    class119.method975(arg1, var3[var13], var8, (var11 & 0x7) * 8, 4610, var4, var6 * 8, class267.field4473, var5 * 8, var10, (var9 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIIII)V", line = 106)
    public final void method517(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field1134 << 3;
        if (arg0 != 314936878) {
            this.method515(124, -2, -96, -96, -116, 1);
        }
        int var7 = (arg1 << 4) + (var6 & 0xF);
        field1137++;
        int var8 = this.field1141 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        this.method515(var6, var8, var7, var9, arg3, arg4);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 142)
    public static void method519(int arg0) {
        field1140 = null;
        field1136 = null;
        field1132 = null;
        field1133 = null;
        if (arg0 != -10728) {
            method516(32, true);
        }
        field1129 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
    public abstract void method513(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
    public abstract void method514(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIII)V")
    public abstract void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
    public abstract void method285(int arg0, int arg1);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V")
    public abstract void method518(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)V")
    public abstract void method286(int arg0, int arg1);
}
