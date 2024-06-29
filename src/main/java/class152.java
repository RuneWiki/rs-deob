import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class152 extends class64 {

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "Lsg;")
    private static class169 field2921 = class165.method1060(" has logged in)3", 1536);

    @OriginalMember(owner = "client!qh", name = "kb", descriptor = "I")
    public static int field2930 = 20;

    @OriginalMember(owner = "client!qh", name = "hb", descriptor = "Lsg;")
    public static class169 field2927 = class165.method1060("au", 1536);

    @OriginalMember(owner = "client!qh", name = "jb", descriptor = "Lsg;")
    public static class169 field2929 = class165.method1060(":assist:", 1536);

    @OriginalMember(owner = "client!qh", name = "eb", descriptor = "Lsg;")
    public static class169 field2924 = class165.method1060("Spieler kann nicht gefunden werden: ", 1536);

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "Lsg;")
    private static class169 field2922 = class165.method1060("OFF", 1536);

    @OriginalMember(owner = "client!qh", name = "mb", descriptor = "Lsg;")
    public static class169 field2932 = field2922;

    @OriginalMember(owner = "client!qh", name = "nb", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!qh", name = "ib", descriptor = "Lsg;")
    public static class169 field2928 = class165.method1060("(U1", 1536);

    @OriginalMember(owner = "client!qh", name = "ob", descriptor = "I")
    public static int field2934 = 0;

    @OriginalMember(owner = "client!qh", name = "pb", descriptor = "Lsg;")
    public static class169 field2935 = field2921;

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!qh", name = "fb", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!qh", name = "gb", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!qh", name = "lb", descriptor = "[I")
    public static int[] field2931;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
    public static void method1000(int arg0) {
        field2935 = null;
        field2932 = null;
        field2927 = null;
        field2928 = null;
        field2931 = null;
        field2921 = null;
        int var1 = -29 / ((-51 - arg0) / 62);
        field2922 = null;
        field2924 = null;
        field2929 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static final void method1001(byte arg0) {
        if (arg0 == -26) {
            ++field2925;
            try {
                if (class201.field3927 == 1) {
                    int var1 = class154.field2971.method1072(-121);
                    if (var1 > 0 && class154.field2971.method1096(false)) {
                        int var2 = var1 - class115.field2133;
                        if (var2 < 0) {
                            var2 = 0;
                        }
                        class154.field2971.method1069(-86, var2);
                    } else {
                        class154.field2971.method1080(-101);
                        class154.field2971.method1071((byte) 22);
                        class13.field300 = null;
                        class158.field3027 = null;
                        if (class3.field71 == null) {
                            class201.field3927 = 0;
                        } else {
                            class201.field3927 = 2;
                        }
                    }
                }
            } catch (Exception var4) {
                var4.printStackTrace();
                class154.field2971.method1080(arg0 + -41);
                class3.field71 = null;
                class13.field300 = null;
                class201.field3927 = 0;
                class158.field3027 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
    public static final void method1002(int arg0, boolean arg1) {
        ++field2926;
        class87 var2 = (class87) class3.field59.method1045((long) arg0, (byte) -77);
        if (!arg1) {
            if (var2 != null) {
                var2.method1213(9104);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field2923;
        if (arg1 != 19) {
            return null;
        } else {
            int[] var3 = super.field1192.method19((byte) 126, arg0);
            if (super.field1192.field75) {
                int[][] var4 = this.method402(false, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; class147.field2715 > var8; ++var8) {
                    var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class152() {
        super(1, true);
    }
}
