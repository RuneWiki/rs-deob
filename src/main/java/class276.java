import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class276 extends class259 {

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "[I")
    public static int[] field4813 = new int[2];

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "Lsg;")
    private static class30 field4810 = class167.method1221((byte) 33, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "Lsg;")
    private static class30 field4821 = class167.method1221((byte) 33, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "Lsg;")
    public static class30 field4814 = field4810;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "Lsg;")
    public static class30 field4817 = class167.method1221((byte) 33, "<)4col>");

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "Lsg;")
    public static class30 field4819 = field4821;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "[Lgj;")
    public static class192[] field4818;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "[Lqd;")
    public static class35[] field4812;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lva;IZII)V")
    public static final void method1869(class120 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4816++;
        if (class247.field4394 == arg0 || class52.field1165 >= 400) {
            return;
        }
        if (!arg2) {
            field4821 = null;
        }
        class30 var5;
        if (arg0.field2363 == 0) {
            boolean var6 = true;
            if (class247.field4394.field2351 != -1 && arg0.field2351 != -1) {
                int var7 = arg0.field2341 >= class247.field4394.field2341 ? arg0.field2341 : class247.field4394.field2341;
                int var8 = class247.field4394.field2341 - arg0.field2341;
                int var9 = class247.field4394.field2351 >= arg0.field2351 ? arg0.field2351 : class247.field4394.field2351;
                if (var8 < 0) {
                    var8 = -var8;
                }
                int var10 = var7 * 10 / 100 + var9 + 5;
                if (var8 > var10) {
                    var6 = false;
                }
            }
            if (arg0.field2341 < arg0.field2370) {
                var5 = class160.method1188(new class30[] { arg0.method916(-1), var6 ? class236.method1679(class247.field4394.field2341, arg0.field2341, 110) : class270.field4757, class104.field2088, class109.field2194, class73.method675(-40, arg0.field2341), class103.field2084, class73.method675(-103, arg0.field2370 - arg0.field2341), class239.field4250 }, 0);
            } else {
                var5 = class160.method1188(new class30[] { arg0.method916(-1), var6 ? class236.method1679(class247.field4394.field2341, arg0.field2341, 116) : class270.field4757, class104.field2088, class109.field2194, class73.method675(-5, arg0.field2341), class239.field4250 }, 0);
            }
        } else {
            var5 = class160.method1188(new class30[] { arg0.method916(-1), class104.field2088, class106.field2133, class73.method675(-16, arg0.field2363), class239.field4250 }, 0);
        }
        if (class132.field2607 == 1) {
            class31.method311(arg1, (long) arg3, class160.method1188(new class30[] { class173.field3234, class159.field2978, var5 }, 0), class163.field3031, (short) 6, -501, arg4);
            class24.field456++;
        } else if (!class175.field3258) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class157.field2956[var11] != null) {
                    short var12 = 0;
                    boolean var13 = false;
                    class32.field813++;
                    if (class138.field2705 == 0 && class157.field2956[var11].method285(class100.field2038, 0)) {
                        if (class247.field4394.field2341 < arg0.field2341) {
                            var12 = 2000;
                        }
                        if (class247.field4394.field2354 != 0 && arg0.field2354 != 0) {
                            if (class247.field4394.field2354 == arg0.field2354) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class48.field1105[var11]) {
                        var12 = 2000;
                    }
                    short var14 = class5.field66[var11];
                    short var15 = (short) (var12 + var14);
                    class31.method311(arg1, (long) arg3, class160.method1188(new class30[] { class270.field4757, var5 }, 0), class157.field2956[var11], var15, -501, arg4);
                }
            }
        } else if ((class195.field3514 & 0x8) == 8) {
            class209.field3753++;
            class31.method311(arg1, (long) arg3, class160.method1188(new class30[] { class246.field4384, class159.field2978, var5 }, 0), class93.field1867, (short) 17, -501, arg4);
        }
        for (int var16 = 0; var16 < class52.field1165; var16++) {
            if (class30.field602[var16] == 47) {
                class48.field1088[var16] = class160.method1188(new class30[] { class270.field4757, var5 }, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
    public static void method1870(byte arg0) {
        field4812 = null;
        field4817 = null;
        field4821 = null;
        field4813 = null;
        field4818 = null;
        field4814 = null;
        int var1 = 11 % ((arg0 + 53) / 47);
        field4819 = null;
        field4810 = null;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class276() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field4811++;
            return class29.field558;
        }
    }
}
