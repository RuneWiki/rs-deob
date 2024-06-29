import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class52 extends class129 {

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field1206 = 0;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Lpa;")
    public static class91 field1208 = new class91(5000);

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lva;")
    private static class121 field1214 = class107.method797("Error connecting to server)3", -10983);

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Lva;")
    public static class121 field1213 = field1214;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field1215 = 10;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field1212 = -1;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBIJ)V", line = 17)
    public final void method366(int arg0, byte arg1, int arg2, long arg3) {
        field1204++;
        int var6 = (int) ((double) arg2 * Math.pow(0.1D, (double) arg0 * 5.0E-4D) + 0.5D);
        if (arg1 < 68) {
            field1208 = null;
        }
        if (class14.field248 == var6) {
            return;
        }
        class14.field248 = var6;
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method374(var7);
            this.method144(var7 + 176, 7, var8 >> 7, arg3);
            this.method144(var7 + 176, 39, var8 & 0x7F, arg3);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IIIJ)Z", line = 54)
    public final boolean method367(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method144(arg0, arg1, arg2, arg3);
                int var6 = arg0 & 0xF;
                class60.field1436[var6] = 12800;
                int var7 = method374(var6);
                this.method144(arg0, 7, var7 >> 7, arg3);
                this.method144(arg0, 39, var7 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var8 = arg0 & 0xF;
                if (arg1 == 7) {
                    class60.field1436[var8] = (arg2 << 7) + (class60.field1436[var8] & 0x7F);
                } else {
                    class60.field1436[var8] = (class60.field1436[var8] & 0x3F80) + arg2;
                }
                int var9 = method374(var8);
                this.method144(arg0, 7, var9 >> 7, arg3);
                this.method144(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)V", line = 90)
    public final void method368(long arg0, int arg1) {
        field1203++;
        for (int var4 = 0; var4 < 16; var4++) {
            this.method144(var4 + 176, 123, 0, arg0);
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method144(var5 + 176, 120, 0, arg0);
        }
        if (arg1 != 127) {
            field1213 = null;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method144(var6 + 176, 121, 0, arg0);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method144(var7 + 176, 0, 0, arg0);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method144(var8 + 176, 32, 0, arg0);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method144(var9 + 192, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)Lva;", line = 148)
    public static final class121 method369(byte arg0, int arg1) {
        field1210++;
        class121 var2 = class35.method242(arg1, 10);
        if (arg0 >= -22) {
            field1216 = -95;
        }
        for (int var3 = var2.method942(36) - 3; var3 > 0; var3 -= 3) {
            var2 = class113.method866((byte) -124, new class121[] { var2.method957(var3, true, 0), class47.field1121, var2.method965(63, var3) });
        }
        if (var2.method942(36) > 8) {
            var2 = class113.method866((byte) -120, new class121[] { class22.field589, var2.method957(var2.method942(36) - 8, true, 0), class20.field533, class97.field2187, var2, class64.field1563 });
        } else if (var2.method942(36) > 4) {
            var2 = class113.method866((byte) -54, new class121[] { class43.field997, var2.method957(var2.method942(36) - 4, true, 0), class62.field1506, class97.field2187, var2, class64.field1563 });
        }
        return class113.method866((byte) -36, new class121[] { class27.field687, var2 });
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IJB)V", line = 177)
    public final void method370(int arg0, long arg1, byte arg2) {
        if (arg2 != 20) {
            return;
        }
        field1205++;
        class14.field248 = arg0;
        for (int var5 = 0; var5 < 16; var5++) {
            class60.field1436[var5] = 12800;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method374(var6);
            this.method144(var6 + 176, 7, var7 >> 7, arg1);
            this.method144(var6 + 176, 39, var7 & 0x7F, arg1);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIII)I", line = 220)
    public static final int method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 30 % ((arg0 + 47) / 49);
        field1209++;
        int var8 = arg1 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var9 = arg6;
            arg6 = arg5;
            arg5 = var9;
        }
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg5;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V", line = 252)
    public static void method372(int arg0) {
        field1214 = null;
        field1213 = null;
        field1208 = null;
        if (arg0 != 29250) {
            method373(true);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V", line = 269)
    public static final void method373(boolean arg0) {
        class14.field264++;
        class60.field1437.method622(101, arg0);
        field1207++;
        if (class69.field1651 != -1) {
            class125.method982(-62, class69.field1651);
            class126.field2883 = false;
            class97.field2168 = true;
            class69.field1651 = -1;
            class25.field630 = true;
        }
        if (class90.field2038 != -1) {
            class125.method982(-102, class90.field2038);
            class126.field2883 = false;
            class9.field140 = true;
            class90.field2038 = -1;
        }
        if (!arg0) {
            method374(-111);
        }
        if (class63.field1525 != -1) {
            class125.method982(-92, class63.field1525);
            class63.field1525 = -1;
            class60.method437((byte) 67, 30);
        }
        if (class4.field59 != -1) {
            class125.method982(-71, class4.field59);
            class4.field59 = -1;
        }
        if (class26.field659 != -1) {
            class125.method982(-119, class26.field659);
            class26.field659 = -1;
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)I", line = 327)
    private static final int method374(int arg0) {
        int var1 = class60.field1436[arg0];
        int var2 = (class14.field248 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIJ)V")
    public abstract void method144(int arg0, int arg1, int arg2, long arg3);
}
