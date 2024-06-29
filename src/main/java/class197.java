import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class197 extends class125 {

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Z")
    public boolean field3835 = false;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "Lg;")
    private class61 field3846;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Z")
    public boolean field3848;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Z")
    public boolean field3841;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    private int field3834;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    private int field3840;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    private int field3857;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Ljd;")
    private static class92 field3843 = class202.method1325((byte) 90, "Location");

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field3836 = -1;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Ljd;")
    public static class92 field3854 = class202.method1325((byte) 90, ")3");

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field3837 = 7759444;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "Ljd;")
    public static class92 field3839 = field3843;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "[J")
    public static long[] field3851 = new long[32];

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field3859 = 0;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "Ljd;")
    private static class92 field3860 = class202.method1325((byte) 90, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!v", name = "L", descriptor = "Ljd;")
    public static class92 field3845 = field3860;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "F")
    private float field3849;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "[I")
    private int[] field3844;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLo;Lnh;)Z")
    public final boolean method1305(boolean arg0, class134 arg1, class133 arg2) {
        field3853++;
        if (!arg0) {
            field3845 = null;
        }
        return this.field3846.method368((byte) -119, arg2, arg1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILo;Lnh;Z)[I")
    public final int[] method1306(int arg0, class134 arg1, class133 arg2, boolean arg3) {
        field3858++;
        if (this.field3846.method368((byte) 85, arg2, arg1)) {
            int var5 = this.field3838 <= arg0 ? this.field3838 : arg0;
            return arg3 ? null : this.field3846.method367(arg2, 0, var5, arg1, false, 1.0D, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    public final void method1307(int arg0, int arg1) {
        field3850++;
        if (arg1 >= 0) {
            this.method1310(null, null, -96, -1.2172575F, 114);
        }
        if (this.field3844 == null || this.field3857 == 0 && this.field3840 == 0) {
            return;
        }
        if (class55.field1150 == null || this.field3844.length > class55.field1150.length) {
            class55.field1150 = new int[this.field3844.length];
        }
        int var3 = this.field3844.length;
        int var4 = this.field3844.length == 4096 ? 64 : 128;
        int var5 = this.field3857 * arg0 * var4;
        int var6 = var4 - 1;
        int var7 = var3 - 1;
        int var8 = this.field3840 * arg0;
        for (int var9 = 0; var9 < var3; var9 += var4) {
            int var11 = var5 + var9 & var7;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var9 + var12;
                int var14 = (var8 + var12 & var6) + var11;
                class55.field1150[var13] = this.field3844[var14];
            }
        }
        int[] var10 = this.field3844;
        this.field3844 = class55.field1150;
        class55.field1150 = var10;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public static void method1308(int arg0) {
        if (arg0 != 1) {
            field3854 = null;
        }
        field3854 = null;
        field3843 = null;
        field3851 = null;
        field3845 = null;
        field3860 = null;
        field3839 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjd;)V")
    public static final void method1309(int arg0, class92 arg1) {
        field3847++;
        if (arg0 != -104) {
            method1309(78, null);
        }
        if (class88.field1730 >= 2) {
            if (arg1.method646(124, class29.field644)) {
                System.gc();
            }
            if (arg1.method646(122, class121.field2461)) {
                class209.method1358(false);
            }
            if (arg1.method646(104, class44.field987)) {
                class30.field650 = true;
            }
            if (arg1.method646(92, class100.field2062)) {
                class30.field650 = false;
            }
            arg1.method646(108, class41.field914);
            arg1.method646(122, class187.field3538);
            if (arg1.method646(113, class126.field2549)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class32.field729[var2].field2373[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method636(class164.field3209, true) && class98.field1996 != 0) {
                class192.method1271(-47, arg1.method613(0, 6).method621(-126));
            }
            if (arg1.method646(110, class115.field2341) && class98.field1996 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method636(class202.field3914, true)) {
                class142.field2832 = arg1.method613(arg0 + 104, 12).method607((byte) -122).method621(-7);
                class117.method788(null, -19001, 0, class77.method529(-3, new class92[] { class139.field2777, class142.method938(class142.field2832, false) }));
            }
            if (arg1.method646(~arg0, class76.field1586)) {
                class133.field2694 = true;
            }
        }
        class113.field2289++;
        class99.field2000.method405(177, arg0 ^ 0xFFFFFF9F);
        class99.field2000.method428(arg1.method640(true) - 1, 124);
        class99.field2000.method466(arg1.method613(0, 2), 119);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lo;Lnh;IFI)[I")
    public final int[] method1310(class134 arg0, class133 arg1, int arg2, float arg3, int arg4) {
        int var6 = 96 % ((arg2 - 11) / 50);
        field3855++;
        if (this.field3844 == null || this.field3849 != arg3) {
            if (!this.field3846.method368((byte) 98, arg1, arg0)) {
                return null;
            }
            int var7 = arg4 < this.field3838 ? arg4 : this.field3838;
            this.field3844 = this.field3846.method367(arg1, 0, var7, arg0, true, (double) arg3, var7);
            this.field3849 = arg3;
        }
        return this.field3844;
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3856++;
        super.finalize();
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lh;)V")
    public class197(class70 arg0) {
        this.field3846 = new class61(arg0);
        int var2 = arg0.method443(255);
        this.field3848 = (var2 & 0x2) != 0;
        int var3 = var2 >> 3 & 0x3;
        this.field3841 = (var2 & 0x1) != 0;
        int var4 = arg0.method443(255);
        this.field3838 = 0x1 << (var4 & 0x7) + 1;
        this.field3852 = arg0.method442(-21351);
        this.field3834 = arg0.method443(255);
        if (this.field3834 == 255) {
            this.field3834 = 256;
        }
        this.field3840 = arg0.method431(-12469);
        this.field3857 = arg0.method431(-12469);
        arg0.method443(255);
        arg0.method443(255);
        arg0.method443(255);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class197() {
        this.field3846 = new class61();
        this.field3841 = true;
        this.field3838 = 1;
    }
}
