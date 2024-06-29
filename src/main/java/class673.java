import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public abstract class class673 {

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public int field9670;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public int field9672;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public int field9668;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "Lwo;")
    public static class690 field9664 = new class690(1, -2);

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "[I")
    public static int[] field9667 = new int[1];

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIZ)V")
    public abstract void method693(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V")
    public abstract void method694(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)I")
    public static final int method3828(int arg0, int arg1, int arg2) {
        if (arg1 != -18599) {
            method3830(79);
        }
        field9671++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZI)Lfn;")
    public static final class122 method3829(int arg0, boolean arg1, int arg2) {
        field9663++;
        if (arg0 == 1) {
            long var3 = (long) (arg2 | (arg1 ? Integer.MIN_VALUE : 0));
            return (class122) class115.field1492.method3678(var3, -120);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIB)V")
    public abstract void method695(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z")
    public static final boolean method3830(int arg0) {
        field9665++;
        try {
            if (class505.field7053 == 2) {
                if (class66.field1026 == null) {
                    class66.field1026 = class645.method3657(class74.field1112, class426.field6123, class108.field1399);
                    if (class66.field1026 == null) {
                        return false;
                    }
                }
                if (class151.field1866 == null) {
                    class151.field1866 = new class311(class14.field237, class487.field6808);
                }
                class364 var1 = class601.field8666;
                if (class548.field7959 != null) {
                    var1 = class548.field7959;
                }
                if (var1.method2112(class151.field1866, arg0 - 1, class66.field1026, 22050, class489.field6839)) {
                    class601.field8666 = var1;
                    class601.field8666.method2091(-93);
                    if (class160.field1957 > 0) {
                        class505.field7053 = 3;
                        class601.field8666.method2084(1380416688, class511.field7473 < class160.field1957 ? class511.field7473 : class160.field1957);
                        for (int var2 = 0; var2 < class505.field7051.length; var2++) {
                            class601.field8666.method2082(class505.field7051[var2], (byte) 1, var2);
                            class505.field7051[var2] = 255;
                        }
                    } else {
                        class505.field7053 = 0;
                        class601.field8666.method2084(1380416688, class511.field7473);
                        for (int var3 = 0; var3 < class505.field7051.length; var3++) {
                            class601.field8666.method2082(class505.field7051[var3], (byte) 1, var3);
                            class505.field7051[var3] = 255;
                        }
                    }
                    if (class548.field7959 == null) {
                        if (class287.field3874 > 0L) {
                            class601.field8666.method2101(0, class66.field1026, true, class287.field3874, class190.field2312);
                        } else {
                            class601.field8666.method2085(class190.field2312, class66.field1026, -15033);
                        }
                    }
                    if (class549.field7964 != null) {
                        class549.field7964.method1490(class601.field8666, 0);
                    }
                    class66.field1026 = null;
                    class74.field1112 = null;
                    class548.field7959 = null;
                    class287.field3874 = 0L;
                    class151.field1866 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class601.field8666.method2096(arg0 + 65280);
            class74.field1112 = null;
            class505.field7053 = 0;
            class548.field7959 = null;
            class66.field1026 = null;
            class151.field1866 = null;
        }
        if (arg0 != 0) {
            method3832((byte) -112);
        }
        return false;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
    public static void method3831(byte arg0) {
        field9667 = null;
        field9664 = null;
        int var1 = -88 / ((11 - arg0) / 35);
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)I")
    public static final int method3832(byte arg0) {
        if (arg0 >= -32) {
            method3830(41);
        }
        field9666++;
        return 46;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(III)V")
    public class673(int arg0, int arg1, int arg2) {
        this.field9670 = arg0;
        this.field9672 = arg1;
        this.field9668 = arg2;
    }
}
