import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class224 extends class235 {

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public int field3858;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "Lgj;")
    public static class226 field3862 = new class226(5);

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "Lsb;")
    public static class98 field3866 = class47.method368("m-Ochte mit Ihnen handeln)3", 0);

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field3867 = 0;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "S")
    public static short field3868 = 256;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "Z")
    public static boolean field3865 = true;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field3871 = -1;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "Lsb;")
    public static class98 field3870 = null;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "Ltg;")
    public static class75 field3869;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Z")
    public static boolean field3872;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static final void method1544(int arg0) {
        field3861++;
        if (arg0 != 6740) {
            method1545((class148) null, (byte) -14);
        }
        class34.field588 = null;
        class198.field3410 = null;
        class170.field2994 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lq;B)V")
    public static final void method1545(class148 arg0, byte arg1) {
        if (arg1 != -68) {
            return;
        }
        field3857++;
        class148 var2 = class261.method1790(arg0, 3);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class180.field3111;
            var4 = class121.field2227;
        } else {
            var3 = var2.field2647;
            var4 = var2.field2694;
        }
        class233.method1598(var4, false, -106, arg0, var3);
        class190.method1310(true, arg0, var3, var4);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class224() {
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public static void method1546(int arg0) {
        field3869 = null;
        if (arg0 != 5) {
            method1547(64, (class75) null);
        }
        field3866 = null;
        field3862 = null;
        field3870 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILtg;)V")
    public static final void method1547(int arg0, class75 arg1) {
        if (arg0 != 1) {
            method1545((class148) null, (byte) -77);
        }
        field3860++;
        class143.field2518 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ltg;IIZLtg;)Lgk;")
    public static final class166 method1548(class75 arg0, int arg1, int arg2, boolean arg3, class75 arg4) {
        field3859++;
        boolean var5 = true;
        int[] var6 = arg4.method554(0, arg1);
        for (int var7 = arg2; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method570(arg1, false, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg0.method570(0, false, var9);
                } else {
                    var10 = arg0.method570(var9, false, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class166(arg4, arg0, arg1, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I)V")
    public class224(int arg0) {
        this.field3858 = arg0;
    }
}
