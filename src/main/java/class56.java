import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class56 extends RuntimeException {

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Ljava/lang/String;")
    public String field891;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field890;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lrf;")
    public static class74 field892 = new class74();

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lwo;")
    public static class690 field893 = new class690(102, -1);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lrh;IIII)Z", line = 3)
    public static final boolean method583(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
        field888++;
        if (!class186.field2276) {
            return false;
        } else if (class86.field1213 < 100) {
            return false;
        } else if (class124.method860(arg1, false, arg4, arg2)) {
            int var5 = arg2 << class295.field3981;
            if (arg3 < 98) {
                return true;
            }
            int var6 = arg1 << class295.field3981;
            int var7 = class155.field1899[arg4].method437(103, arg1, arg2) - 1;
            int var8 = arg0.method173(32249) + var7;
            if (arg0.field3327 == 1) {
                if (!class201.method1227(var8, var8, var6, var5, class454.field6392 + var6, 4637, var7, var5, var6, var5)) {
                    return false;
                } else if (class201.method1227(var7, var8, class454.field6392 + var6, var5, var6 + class454.field6392, 4637, var7, var5, var6, var5)) {
                    class627.field8992++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3327 == 2) {
                if (!class201.method1227(var8, var8, class454.field6392 + var6, var5, class454.field6392 + var6, 4637, var7, var5, var6 + class454.field6392, var5 - -class454.field6392)) {
                    return false;
                } else if (class201.method1227(var8, var7, class454.field6392 + var6, var5, class454.field6392 + var6, 4637, var7, class454.field6392 + var5, class454.field6392 + var6, var5 + class454.field6392)) {
                    class627.field8992++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3327 == 4) {
                if (!class201.method1227(var8, var8, var6, class454.field6392 + var5, class454.field6392 + var6, 4637, var7, class454.field6392 + var5, var6, var5 + class454.field6392)) {
                    return false;
                } else if (class201.method1227(var7, var8, class454.field6392 + var6, class454.field6392 + var5, class454.field6392 + var6, 4637, var7, class454.field6392 + var5, var6, class454.field6392 + var5)) {
                    class627.field8992++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3327 == 8) {
                if (!class201.method1227(var8, var8, var6, var5, var6, 4637, var7, var5, var6, class454.field6392 + var5)) {
                    return false;
                } else if (class201.method1227(var8, var7, var6, var5, var6, 4637, var7, class454.field6392 + var5, var6, class454.field6392 + var5)) {
                    class627.field8992++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3327 == 16) {
                if (class281.method1691(class480.field6727, var7, -6, var6 + class480.field6727, var8, class480.field6727, var5)) {
                    class627.field8992++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3327 == 32) {
                if (class281.method1691(class480.field6727, var7, -6, var6 + class480.field6727, var8, class480.field6727, var5 + class480.field6727)) {
                    class627.field8992++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3327 == 64) {
                if (class281.method1691(class480.field6727, var7, -6, var6, var8, class480.field6727, class480.field6727 + var5)) {
                    class627.field8992++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg0.field3327 != 128) {
                return true;
            } else if (class281.method1691(class480.field6727, var7, -6, var6, var8, class480.field6727, var5)) {
                class627.field8992++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 128)
    public static void method584(int arg0) {
        field892 = null;
        field893 = null;
        if (arg0 != -17) {
            field892 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 144)
    public class56(Throwable arg0, String arg1) {
        this.field891 = arg1;
        this.field890 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I", line = 154)
    public static final int method585(int arg0, int arg1) {
        field889++;
        if (arg0 != -1) {
            field893 = null;
        }
        return arg1 & 0x7F;
    }
}
