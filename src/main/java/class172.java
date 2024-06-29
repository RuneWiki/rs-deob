import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class172 {

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2732 = "Take";

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[Lij;")
    public static class90[] field2733 = new class90[14];

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2736 = 0;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[[I")
    public static int[][] field2741 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 11)
    public static void method1174(int arg0) {
        field2733 = null;
        field2741 = (int[][]) null;
        if (arg0 != 1) {
            method1176(65, 95, -45);
        }
        field2732 = null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 24)
    public static final void method1175(int arg0) {
        class337.field5234.method1615(75);
        if (arg0 != 0) {
            method1175(107);
        }
        field2735++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V", line = 35)
    public static final void method1176(int arg0, int arg1, int arg2) {
        class88.field1323 = true;
        class131.field1936 = arg0;
        class239.field3787 = arg1;
        class114.field1720 = arg2;
        class209.field3412 = -1;
        class48.field664 = -1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)Z", line = 49)
    public static final boolean method1177(int arg0, int arg1, int arg2, int arg3) {
        if (!class296.method2065(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class84.field1282[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class88.field1347) {
                    if (!class52.method354(var4, var6, var5)) {
                        return false;
                    }
                    if (!class52.method354(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class52.method354(var4, var7, var5)) {
                        return false;
                    }
                    if (!class52.method354(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class52.method354(var4, var8, var5)) {
                    return false;
                }
                if (!class52.method354(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class2.field15) {
                    if (!class52.method354(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class52.method354(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class52.method354(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class52.method354(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class52.method354(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class52.method354(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class88.field1347) {
                    if (!class52.method354(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class52.method354(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class52.method354(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class52.method354(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class52.method354(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class52.method354(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class2.field15) {
                    if (!class52.method354(var4, var6, var5)) {
                        return false;
                    }
                    if (!class52.method354(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class52.method354(var4, var7, var5)) {
                        return false;
                    }
                    if (!class52.method354(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class52.method354(var4, var8, var5)) {
                    return false;
                }
                if (!class52.method354(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class52.method354(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class52.method354(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class52.method354(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class52.method354(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class52.method354(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 248)
    public class172() {
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lng;)V", line = 250)
    public class172(class172 arg0) {
        this.field2738 = arg0.field2738;
        this.field2742 = arg0.field2742;
        this.field2734 = arg0.field2734;
        this.field2740 = arg0.field2740;
    }
}
