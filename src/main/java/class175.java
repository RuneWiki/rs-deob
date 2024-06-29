import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class175 extends class59 {

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    private int field2882 = 585;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "S")
    public static short field2875 = 32767;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "Lph;")
    public static class229 field2881 = class266.method1858("mem=", 0);

    @OriginalMember(owner = "client!om", name = "T", descriptor = "[[B")
    public static byte[][] field2880 = new byte[250][];

    @OriginalMember(owner = "client!om", name = "S", descriptor = "Lph;")
    private static class229 field2879 = class266.method1858("red:", 0);

    @OriginalMember(owner = "client!om", name = "L", descriptor = "Lph;")
    public static class229 field2872 = class266.method1858("Bitte warten Sie)3)3)3", 0);

    @OriginalMember(owner = "client!om", name = "M", descriptor = "Lph;")
    public static class229 field2873 = field2879;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "Z")
    public static boolean field2877 = true;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "Lph;")
    public static class229 field2869 = field2879;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "Lph;")
    public static class229 field2878 = class266.method1858("comp-Btence ", 0);

    @OriginalMember(owner = "client!om", name = "W", descriptor = "Lph;")
    public static class229 field2883 = class266.method1858("p11_full", 0);

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 11)
    public static void method1262(byte arg0) {
        if (arg0 >= -99) {
            method1263(true, (class229) null, (byte) -76);
        }
        field2879 = null;
        field2881 = null;
        field2878 = null;
        field2880 = (byte[][]) null;
        field2869 = null;
        field2872 = null;
        field2873 = null;
        field2883 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BILhb;)V", line = 42)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field2882 = arg2.method1161(true);
        }
        if (arg0 == 115) {
            field2876++;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 245)
    public class175() {
        super(0, true);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)[I", line = 78)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            field2883 = (class229) null;
        }
        field2871++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int var4 = class269.field4504[arg1];
            for (int var5 = 0; var5 < class293.field4789; var5++) {
                int var6 = class219.field3608[var5];
                if (this.field2882 < var6 && var6 < 4096 - this.field2882 && 2048 - this.field2882 < var4 && this.field2882 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field2882);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field2882) && (this.field2882 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2882;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2882);
                } else if (this.field2882 > var4 || 4096 - this.field2882 < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field2882;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2882);
                } else if (this.field2882 <= var6 && 4096 - this.field2882 >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field2882);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLph;B)V", line = 175)
    public static final void method1263(boolean arg0, class229 arg1, byte arg2) {
        field2870++;
        short[] var3 = new short[16];
        int var4 = 0;
        class229 var5 = arg1.method1616(-985019996);
        for (int var6 = 0; var6 < class154.field2507; var6++) {
            class191 var7 = class124.method920(-84, var6);
            if ((!arg0 || var7.field3142) && var7.field3141 == -1 && var7.field3164 == -1 && var7.field3167 == 0 && var7.field3154.method1616(arg2 - 985019937).method1611(var5, 24104) != -1) {
                if (var4 >= 250) {
                    class38.field610 = -1;
                    class65.field987 = null;
                    return;
                }
                if (var3.length <= var4) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var4++] = (short) var6;
            }
        }
        class65.field987 = var3;
        class206.field3400 = 0;
        if (arg2 != -59) {
            field2875 = -93;
        }
        class38.field610 = var4;
        class229[] var10 = new class229[class38.field610];
        for (int var11 = 0; var11 < class38.field610; var11++) {
            var10[var11] = class124.method920(-84, var3[var11]).field3154;
        }
        class59.method392(var10, true, class65.field987);
    }
}
