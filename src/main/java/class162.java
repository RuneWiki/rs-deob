import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class162 extends class123 {

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "I")
    private int field2895;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "Leb;")
    public static class230 field2881 = class68.method589(0, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public static int field2886 = (int) (Math.random() * 17.0D) + -8;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "Leb;")
    public static class230 field2880 = class68.method589(0, "(U(Y");

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "Leb;")
    public static class230 field2889 = class68.method589(0, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "Leb;")
    public static class230 field2891 = class68.method589(0, "blinken3:");

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "Leb;")
    public static class230 field2893 = class68.method589(0, "::clientjs5drop");

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Leb;")
    public static class230 field2885 = class68.method589(0, "Fallen lassen");

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "Lij;")
    public static class189 field2890;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "Lkk;")
    public static class223 field2884;

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "[Leh;")
    public static class80[] field2894;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
    private class162(int arg0) {
        super(0, true);
        this.field2895 = 4096;
        this.field2895 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ[I[II)V")
    public static final void method1215(int arg0, boolean arg1, int[] arg2, int[] arg3, int arg4) {
        ++field2883;
        if (!arg1) {
            if (arg4 > arg0) {
                int var5 = (arg0 + arg4) / 2;
                int var6 = arg0;
                int var7 = arg3[var5];
                arg3[var5] = arg3[arg4];
                arg3[arg4] = var7;
                int var8 = arg2[var5];
                arg2[var5] = arg2[arg4];
                arg2[arg4] = var8;
                for (int var9 = arg0; ~arg4 < ~var9; ++var9) {
                    if (var7 - -(var9 & 1) < arg3[var9]) {
                        int var10 = arg3[var9];
                        arg3[var9] = arg3[var6];
                        arg3[var6] = var10;
                        int var11 = arg2[var9];
                        arg2[var9] = arg2[var6];
                        arg2[var6++] = var11;
                    }
                }
                arg3[arg4] = arg3[var6];
                arg3[var6] = var7;
                arg2[arg4] = arg2[var6];
                arg2[var6] = var8;
                method1215(arg0, false, arg2, arg3, var6 + -1);
                method1215(var6 + 1, false, arg2, arg3, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
    public static void method1216(int arg0) {
        field2885 = null;
        if (arg0 != -30416) {
            field2885 = null;
        }
        field2894 = null;
        field2881 = null;
        field2893 = null;
        field2880 = null;
        field2884 = null;
        field2891 = null;
        field2890 = null;
        field2889 = null;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class162() {
        this(4096);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)Lrj;")
    public static final class8 method1217(byte arg0, int arg1) {
        ++field2882;
        if (arg0 <= 74) {
            return null;
        } else {
            class8 var2 = (class8) class6.field83.method1125((long) arg1, true);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class24.field466.method1546(class31.method292(2899, arg1), (byte) -100, class54.method426(true, arg1));
                class8 var4 = new class8();
                var4.field147 = arg1;
                if (var3 != null) {
                    var4.method78(16531, new class14(var3));
                }
                class6.field83.method1129((long) arg1, true, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field2888;
        int var3 = 63 % ((-24 - arg1) / 57);
        int[] var4 = super.field2160.method1323((byte) 87, arg0);
        if (super.field2160.field3243) {
            class43.method373(var4, 0, class140.field2505, this.field2895);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg0 == 0) {
            this.field2895 = (arg1.method200(255) << 12) / 255;
        }
        if (arg2 != 1876195788) {
            method1217((byte) 17, -47);
        }
        ++field2892;
    }
}
