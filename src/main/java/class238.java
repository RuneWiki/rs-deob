import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class238 {

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public int field2973 = 16777215;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
    public int field2984 = 8;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field2971 = 0;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "Lf;")
    public static class536 field2972;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "Z")
    public boolean field2978;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(JI)V")
    public static final void method1426(long arg0, int arg1) {
        field2982++;
        int var3 = class493.field6499;
        int var4 = class214.field2661;
        if (arg1 < 28) {
            field2979 = -33;
        }
        if (class263.field3256 != var3) {
            int var5 = var3 - class263.field3256;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class263.field3256 += var6;
        }
        if (class91.field1278 != var4) {
            int var7 = var4 - class91.field1278;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class91.field1278 += var8;
        }
        if (!class301.field3698.field6607) {
            class133.field1739 += (float) arg0 * class304.field3757 / 40.0F * 8.0F;
            class331.field4223 += (float) arg0 * class539.field7228 / 40.0F * 8.0F;
        }
        class285.method1600(5126);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILes;)V")
    public final void method1427(int arg0, class630 arg1) {
        while (true) {
            int var3 = arg1.method3501(arg0 - 9267);
            if (var3 == 0) {
                field2969++;
                if (arg0 != -1) {
                    method1428(-100, -105, -37);
                    return;
                }
                return;
            }
            this.method1429((byte) -106, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)Z")
    public static final boolean method1428(int arg0, int arg1, int arg2) {
        int var3 = -40 / ((arg1 - 9) / 62);
        field2985++;
        return (arg0 & 0x70000) != 0 | class445.method2378(110, arg0, arg2) || class167.method955(arg0, -1, arg2);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLes;I)V")
    private final void method1429(byte arg0, class630 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2984 = arg1.method3470(13111);
        } else if (arg2 == 2) {
            this.field2978 = true;
        } else if (arg2 == 3) {
            this.field2981 = arg1.method3510(124);
            this.field2983 = arg1.method3510(96);
            this.field2977 = arg1.method3510(88);
        } else if (arg2 == 4) {
            this.field2975 = arg1.method3501(-9268);
        } else if (arg2 == 5) {
            this.field2974 = arg1.method3470(13111);
        } else if (arg2 == 6) {
            this.field2973 = arg1.method3517(-1);
        }
        field2976++;
        int var4 = 100 / ((-arg0 - 57) / 46);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
    public static void method1430(int arg0) {
        field2972 = null;
        if (arg0 != 16777215) {
            field2972 = null;
        }
    }
}
