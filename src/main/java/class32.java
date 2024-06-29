import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class32 extends RuntimeException {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Ljava/lang/String;")
    public String field474;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field480;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lhi;")
    public static class82 field476 = class95.method664((byte) -64, "p11_full");

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lhi;")
    public static class82 field478 = class95.method664((byte) -102, "jaune:");

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
    public static int[] field481 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lim;")
    public static class250 field473;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIIII)V", line = 16)
    public static final void method249(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field482++;
        if (arg0 > -108) {
            field478 = (class82) null;
        }
        class164 var5 = (class164) class67.field1038.method507((long) arg4, 602425312);
        if (var5 == null) {
            var5 = new class164();
            class67.field1038.method503((long) arg4, -70, var5);
        }
        if (var5.field2870.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field2870.length; var8++) {
                var6[var8] = var5.field2870[var8];
                var7[var8] = var5.field2864[var8];
            }
            for (int var9 = var5.field2870.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2870 = var6;
            var5.field2864 = var7;
        }
        var5.field2870[arg2] = arg3;
        var5.field2864[arg2] = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 74)
    public static void method250(int arg0) {
        field481 = null;
        field476 = null;
        field473 = null;
        field478 = null;
        if (arg0 > -73) {
            method251(15, (class75) null, 34, 54, -125, (class86) null, -15);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILme;IIILjf;I)V", line = 89)
    public static final void method251(int arg0, class75 arg1, int arg2, int arg3, int arg4, class86 arg5, int arg6) {
        field477++;
        if (arg5 == null) {
            return;
        }
        int var7 = class62.field970 + class219.field3804 & 0x7FF;
        int var8 = arg0 * arg0 + arg2 * arg2;
        int var9 = Math.max(arg1.field1216 / 2, arg1.field1205 / 2) + 10;
        if ((var9 * var9) < var8) {
            return;
        }
        int var10 = class102.field1813[var7];
        if (arg4 != -15639) {
            return;
        }
        int var11 = var10 * 256 / (class5.field41 + 256);
        int var12 = class102.field1819[var7];
        int var13 = var12 * 256 / (class5.field41 + 256);
        int var14 = arg2 * var13 - (arg0 * var11) >> 16;
        int var15 = arg0 * var13 + arg2 * var11 >> 16;
        if (class147.field2485) {
            ((class210) arg5).method1509(arg1.field1216 / 2 + (arg3 - (arg5.field1544 / 2 - var15)), arg6 - (-(arg1.field1205 / 2) - -var14) + -(arg5.field1538 / 2), (class210) arg1.method469(false, 2));
        } else {
            ((class303) arg5).method2103(arg3 + (arg1.field1216 / 2) + var15 - (arg5.field1544 / 2), arg6 - -(arg1.field1205 / 2) + -(arg5.field1538 / 2) + -var14, arg1.field1223, arg1.field1292);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 144)
    public class32(Throwable arg0, String arg1) {
        this.field474 = arg1;
        this.field480 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZI)I", line = 159)
    public static final int method252(int arg0, int arg1, boolean arg2, int arg3) {
        field475++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            if (!arg2) {
                method250(82);
            }
            return 1023 - arg1;
        }
    }
}
