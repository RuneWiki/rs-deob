import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class396 extends class17 {

    @OriginalMember(owner = "client!fs", name = "H", descriptor = "Leh;")
    public static class246 field5618 = new class246(51, 5);

    @OriginalMember(owner = "client!fs", name = "F", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!fs", name = "G", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg1 <= 53) {
            this.method27(-50, 44);
        }
        field5616++;
        return class492.field6966;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V")
    public static final void method2302(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class136 var5 = (class136) class26.field317.method2655(15152); var5 != null; var5 = (class136) class26.field317.method2660((byte) 67)) {
            class215.method1346(arg0, arg4, var5, arg2, (byte) 123, arg3);
        }
        field5617++;
        for (class136 var6 = (class136) class503.field7294.method2655(15152); var6 != null; var6 = (class136) class503.field7294.method2660((byte) 67)) {
            byte var11 = 1;
            class98 var12 = var6.field1778.method1406((byte) 110);
            if (var6.field1778.field3302) {
                var11 = 0;
            } else if (var6.field1778.field3337 == var12.field1326 || var6.field1778.field3337 == var12.field1282 || var6.field1778.field3337 == var12.field1283 || var6.field1778.field3337 == var12.field1296) {
                var11 = 2;
            } else if (var6.field1778.field3337 == var12.field1299 || var6.field1778.field3337 == var12.field1279 || var6.field1778.field3337 == var12.field1308 || var6.field1778.field3337 == var12.field1297) {
                var11 = 3;
            }
            if (var6.field1783 != var11) {
                int var13 = class123.method812(var6.field1778, 78);
                if (var6.field1785 != var13) {
                    if (var6.field1780 != null) {
                        class138.field1810.method2312(var6.field1780);
                        var6.field1780 = null;
                    }
                    var6.field1785 = var13;
                }
                var6.field1783 = var11;
            }
            var6.field1792 = var6.field1778.field1896;
            var6.field1776 = var6.field1778.field1896 + (var6.field1778.method125((byte) -102) << 6);
            var6.field1791 = var6.field1778.field1899;
            var6.field1784 = var6.field1778.field1899 + (var6.field1778.method125((byte) -80) << 6);
            class215.method1346(arg0, arg4, var6, arg2, (byte) 119, arg3);
        }
        if (arg1 > -33) {
            return;
        }
        for (class136 var7 = (class136) class542.field7922.method2414((byte) -127); var7 != null; var7 = (class136) class542.field7922.method2410((byte) 94)) {
            byte var8 = 1;
            class98 var9 = var7.field1787.method1406((byte) 123);
            if (var7.field1787.field3302) {
                var8 = 0;
            } else if (var7.field1787.field3337 == var9.field1326 || var7.field1787.field3337 == var9.field1282 || var7.field1787.field3337 == var9.field1283 || var7.field1787.field3337 == var9.field1296) {
                var8 = 2;
            } else if (var7.field1787.field3337 == var9.field1299 || var7.field1787.field3337 == var9.field1279 || var7.field1787.field3337 == var9.field1308 || var7.field1787.field3337 == var9.field1297) {
                var8 = 3;
            }
            if (var7.field1783 != var8) {
                int var10 = class460.method2684(-100, var7.field1787);
                if (var7.field1785 != var10) {
                    if (var7.field1780 != null) {
                        class138.field1810.method2312(var7.field1780);
                        var7.field1780 = null;
                    }
                    var7.field1785 = var10;
                }
                var7.field1783 = var8;
            }
            var7.field1792 = var7.field1787.field1896;
            var7.field1776 = var7.field1787.field1896 + (var7.field1787.method125((byte) -118) << 6);
            var7.field1791 = var7.field1787.field1899;
            var7.field1784 = var7.field1787.field1899 + (var7.field1787.method125((byte) -108) << 6);
            class215.method1346(arg0, arg4, var7, arg2, (byte) 55, arg3);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
    public static void method2303(boolean arg0) {
        if (arg0) {
            field5618 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
    public class396() {
        super(0, true);
    }
}
