import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class140 extends class139 {

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
    private int field2884 = -1;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field2877 = 1;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "Lrf;")
    public static class163 field2875 = class53.method392(64, "0(U");

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
    public static int field2881 = 0;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "Lrf;")
    public static class163 field2879 = class53.method392(90, "swe");

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "Lff;")
    public static class57 field2883 = new class57();

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "Lad;")
    public static class5 field2888 = new class5();

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "Lrf;")
    public static class163 field2889 = class53.method392(-82, "");

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    private int field2876;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
    private int field2885;

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "[I")
    private int[] field2887;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V")
    public static void method920(int arg0) {
        field2883 = null;
        if (arg0 == 64) {
            field2875 = null;
            field2879 = null;
            field2889 = null;
            field2888 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg0 == 0) {
            this.field2884 = arg2.method390((byte) 118);
        }
        ++field2874;
        if (arg1 != 21) {
            this.method921((byte) 2);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class140() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(B)Z")
    private final boolean method921(byte arg0) {
        ++field2886;
        if (this.field2887 != null) {
            return true;
        } else if (arg0 > -24) {
            return true;
        } else if (~this.field2884 <= -1) {
            int var2 = !class21.field367.method1224(this.field2884, 59) ? 128 : 64;
            this.field2887 = class21.field367.method1223((byte) 97, this.field2884);
            this.field2885 = var2;
            this.field2876 = var2;
            return this.field2887 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field2878;
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885 && this.method921((byte) -64)) {
            int var4 = this.field2876 * (class205.field4008 == this.field2885 ? arg1 : this.field2885 * arg1 / class205.field4008);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class23.field402 == this.field2876) {
                for (int var8 = 0; class23.field402 > var8; ++var8) {
                    int var9 = this.field2887[var4++];
                    var7[var8] = class133.method887(255, var9) << 4;
                    var6[var8] = class133.method887(var9, 65280) >> 4;
                    var5[var8] = class133.method887(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; class23.field402 > var10; ++var10) {
                    int var11 = this.field2876 * var10 / class23.field402;
                    int var12 = this.field2887[var4 + var11];
                    var7[var10] = class133.method887(var12, 255) << 4;
                    var6[var10] = class133.method887(65280, var12) >> 4;
                    var5[var10] = class133.method887(16711680, var12) >> 12;
                }
            }
        }
        return arg0 <= 53 ? null : var3;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)I")
    public final int method919(boolean arg0) {
        ++field2882;
        if (arg0) {
            this.method77(-6, -88);
        }
        return this.field2884;
    }
}
