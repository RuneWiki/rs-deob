import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class67 {

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "[I")
    public int[] field835;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "[I")
    public int[] field833;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "Lhb;")
    public static class250 field838 = new class250(15, -1);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "Loa;")
    public static class167 field834;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BJ)V", line = 5)
    public static final void method381(byte arg0, long arg1) {
        field837++;
        int var3 = class157.field2069;
        if (class73.field926 != var3) {
            int var4 = var3 - class73.field926;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var5 > var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var4 > var5) {
                var5 = var4;
            }
            class73.field926 += var5;
        }
        int var6 = class265.field3369;
        if (!class421.field5647.field7707) {
            class244.field3138 += (float) arg1 * class36.field553 / 40.0F * 8.0F;
            class163.field2110 += (float) arg1 * class183.field2409 / 40.0F * 8.0F;
        }
        if (class293.field3801 != var6) {
            int var7 = var6 - class293.field3801;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class293.field3801 += var8;
        }
        class21.method153(true);
        if (arg0 < 6) {
            method381((byte) 125, 10L);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLqa;)V", line = 91)
    public static final void method382(byte arg0, class129 arg1) {
        if (arg0 != 91) {
            method384(-28, -6, 38);
        }
        field836++;
        if (class450.field6267) {
            class511.method3048(arg1, (byte) 120);
        } else {
            class65.method364(88, arg1);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 107)
    public static void method383(int arg0) {
        if (arg0 == 0) {
            field838 = null;
            field834 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Lnm;", line = 119)
    public static final class270 method384(int arg0, int arg1, int arg2) {
        class510 var3 = class470.field6877[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7499;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V", line = 128)
    public class67(int arg0) {
        this.field832 = arg0;
        this.field835 = new int[this.field832];
        this.field833 = new int[this.field832];
    }
}
