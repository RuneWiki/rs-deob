import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class171 extends class25 {

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Ldf;")
    public static class51 field2804 = class46.method233("l", 100);

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "Lu;")
    public static class111 field2798;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "[Ldf;")
    public static class51[] field2801;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)V")
    public abstract void method1100(int arg0, int arg1);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZI)V")
    public static final void method1198(int arg0, boolean arg1, int arg2) {
        if (class136.field2261 > 0) {
            class147.method1063(100, class136.field2261);
            class136.field2261 = 0;
        }
        short var3 = 256;
        field2795++;
        int var4 = 0;
        int var5 = class59.field960 * arg2;
        int var6 = 0;
        int var7 = 1;
        if (!arg1) {
            field2804 = null;
        }
        while (var3 - 1 > var7) {
            int var8 = (var3 - var7) * class122.field2072[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class37.field570[var4++];
                int var12 = class59.field957[arg0 + (var5++)];
                if (var11 == 0) {
                    class38.field589.field4447[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 238 - var11;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class75.field1199[var11];
                    class38.field589.field4447[var6++] = class191.method1366(var14 * class191.method1366(var12, 16711935) + class191.method1366(16711935, var15) * var13, -16711936) + class191.method1366(var14 * class191.method1366(var12, 65280) + var13 * class191.method1366(65280, var15), 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class38.field589.field4447[var6++] = class59.field957[arg0 + (var5++)];
            }
            var5 += class59.field960 - 128;
            var7++;
        }
        class38.field589.method1100(arg0, arg2);
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
    public static void method1199(int arg0) {
        if (arg0 != 99999) {
            method1204(-120, 35, 97, (class111) null);
        }
        field2798 = null;
        field2801 = null;
        field2804 = null;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(II)V")
    public abstract void method1103(int arg0, int arg1);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
    public final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2802++;
        int var6 = this.field2805 << 3;
        int var7 = this.field2803 << 3;
        int var8 = (arg4 << 4) + (var6 & 0xF);
        int var9 = (arg2 << 4) + (var7 & 0xF);
        if (arg0 == 10) {
            this.method1094(var6, var7, var8, var9, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
    public abstract void method1201(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1094(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIII)V")
    public abstract void method1202(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(JIIIILdf;I)V")
    public static final void method1203(long arg0, int arg1, int arg2, int arg3, int arg4, class51 arg5, int arg6) {
        field2796++;
        class121 var8 = new class121(128);
        var8.method919(-4742, 10);
        var8.method895(arg2 - 100000024, (int) (Math.random() * 99999.0D));
        var8.method895(-88, 509);
        var8.method885(arg0, (byte) -123);
        var8.method870((int) (Math.random() * 9.9999999E7D), (byte) 12);
        var8.method896((byte) 0, arg5);
        var8.method870((int) (Math.random() * 9.9999999E7D), (byte) 12);
        var8.method895(-60, class5.field40);
        var8.method919(-4742, arg3);
        var8.method919(-4742, arg4);
        var8.method870((int) (Math.random() * 9.9999999E7D), (byte) 12);
        var8.method895(arg2 ^ 0xFA0A1F6A, arg6);
        var8.method895(-109, arg1);
        var8.method870((int) ((double) arg2 * Math.random()), (byte) 12);
        var8.method879(class107.field1772, class39.field602, -33);
        class95.field1575.field2026 = 0;
        class95.field1575.method919(-4742, 155);
        class95.field1575.method919(-4742, var8.field2026);
        class95.field1575.method920(0, var8.field2014, var8.field2026, 7521);
        class130.field2185 = 0;
        class210.field3497 = 1;
        class144.field2403 = 0;
        class181.field2987 = -3;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIIII)V")
    public abstract void method1093(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIILu;)[Ltg;")
    public static final class171[] method1204(int arg0, int arg1, int arg2, class111 arg3) {
        field2794++;
        if (class69.method480(arg2, 57, arg0, arg3)) {
            int var4 = -90 / ((68 - arg1) / 39);
            return class260.method1768((byte) 66);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V")
    public abstract void method1095(int arg0, int arg1, int arg2);
}
