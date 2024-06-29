import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class31 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field467 = 0;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lhi;")
    public static class82 field466 = class95.method664((byte) -66, "<col=ff9040>");

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[I")
    public static int[] field470 = new int[] { 0, 0, 0, -2, 0, 0, 0, 9, 10, 0, 0, 6, 0, -1, 0, 0, 0, 0, 0, -1, 24, 0, 0, 0, 5, -2, -2, -2, 0, 8, 0, 0, 0, 0, 0, 0, -2, 5, 0, 0, -2, 0, 0, 15, 0, 2, 15, -1, -1, 4, 0, 0, 8, 0, 0, 0, -2, 6, 0, 0, 5, 14, 0, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 10, -1, 0, 6, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 20, 0, 0, -2, 0, 1, 7, 0, 0, 0, 0, 1, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 7, 0, 12, 1, -2, 0, 0, 3, 0, -2, 0, 0, 0, 0, 10, 0, 0, 4, 6, 0, 10, 0, 10, 12, 3, 0, 0, 0, 6, 0, 2, 0, 0, 0, 8, 5, 0, 0, 0, -1, 0, 2, -1, 0, 0, 4, 0, 0, 0, 4, 0, 0, -1, 8, -1, 3, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 8, 0, 6, 0, 0, 9, 0, 0, 0, 5, 4, 0, 7, 3, 0, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 6, 0, -1, -2, 5, 14, 0, 0, 6, 0, 0, 0, 0, 0, 0, -1, 6, 6, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 8, 0, 0, 0, 0, -1, 0, 0, 0, 2, 1, 0, 0, 2 };

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Lhi;")
    public static class82 field469 = class95.method664((byte) -56, "Liste des serveurs charg-Be");

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Lhi;")
    public static class82 field471 = class95.method664((byte) -96, "1");

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 8)
    public static void method245(int arg0) {
        field469 = null;
        if (arg0 == -27782) {
            field466 = null;
            field470 = null;
            field471 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lbc;B)V", line = 31)
    public static final void method246(class153 arg0, byte arg1) {
        if (arg1 >= -94) {
            field467 = -43;
        }
        if (class87.field1548 != null) {
            try {
                class87.field1548.method956(0L, (byte) 104);
                class87.field1548.method957((byte) -94, arg0.field2598, arg0.field2611, 24);
            } catch (Exception var3) {
            }
        }
        field472++;
        arg0.field2611 += 24;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)I", line = 62)
    public static final int method247(int arg0, int arg1, byte arg2) {
        field465++;
        if (arg2 <= 34) {
            method248(-94, -91, -34, -102, 99, false);
        }
        int var3 = class109.method743(arg0 - 1, arg1 + -1, (byte) 9) + class109.method743(arg0 - 1, arg1 + 1, (byte) 48) - (-class109.method743(arg0 + 1, arg1 - 1, (byte) 15) + -class109.method743(arg0 + 1, arg1 + 1, (byte) -108));
        int var4 = class109.method743(arg0, arg1 - 1, (byte) -117) - (-class109.method743(arg0, arg1 + 1, (byte) 61) - class109.method743(arg0 - 1, arg1, (byte) -116)) + class109.method743(arg0 - -1, arg1, (byte) 36);
        int var5 = class109.method743(arg0, arg1, (byte) -109);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIZ)V", line = 86)
    public static final void method248(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class114.method780(118, arg1 - arg4, arg1 + arg4, arg3, class73.field1117[arg2]);
        field468++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg4 * arg4;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = var8 << 2;
        int var13 = arg0 << 1;
        int var14 = var9 - ((var13 - 1) * var11);
        int var15 = var9 << 2;
        if (arg5) {
            return;
        }
        int var16 = (1 - var13) * var8 + var10;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg0 - 1) * var12;
        while (var7 > 0) {
            var7--;
            int var21 = arg2 - var7;
            int var22 = arg2 + var7;
            if (var16 < 0) {
                while (var16 < 0) {
                    var16 += var17;
                    var14 += var19;
                    var6++;
                    var17 += var15;
                    var19 += var15;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var19 += var15;
                var16 += var17;
                var17 += var15;
                var6++;
            }
            int var23 = arg1 + var6;
            var16 += -var20;
            int var24 = arg1 - var6;
            var20 -= var12;
            class114.method780(78, var24, var23, arg3, class73.field1117[var21]);
            class114.method780(106, var24, var23, arg3, class73.field1117[var22]);
            var14 += -var18;
            var18 -= var12;
        }
    }
}
