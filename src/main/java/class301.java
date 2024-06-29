import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class301 extends class120 {

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "I")
    private int field4883 = 0;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    private int field4875 = 4096;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field4878 = 0;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    public static int field4876 = 3353893;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "[Lok;")
    public static class41[] field4877 = new class41[1000];

    @OriginalMember(owner = "client!sj", name = "db", descriptor = "[[I")
    public static int[][] field4884 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!sj", name = "eb", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!sj", name = "fb", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!sj", name = "gb", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "Lmh;")
    public static class65 field4874;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "Z")
    public static boolean field4880;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Llb;II)V", line = 7)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field4881++;
        if (arg2 == 0) {
            this.field4883 = arg0.method759((byte) -86);
        } else if (arg2 == 1) {
            this.field4875 = arg0.method759((byte) -119);
        }
        if (arg1 != -1) {
            method2073(true);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)V", line = 43)
    public static void method2073(boolean arg0) {
        if (!arg0) {
            field4884 = (int[][]) ((int[][]) null);
        }
        field4884 = (int[][]) null;
        field4877 = null;
        field4874 = null;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V", line = 67)
    public static final void method2074(int arg0) {
        field4882++;
        int var1 = class128.field1903 * 128 + 64;
        int var2 = class207.field3353 * 128 + 64;
        int var3 = class140.method983((byte) -102, class55.field807, var1, var2) - class299.field4841;
        if (class292.field4737 < 100) {
            if (class235.field3779 < var1) {
                class235.field3779 += (var1 - class235.field3779) * class292.field4737 / 1000 + class121.field1782;
                if (class235.field3779 > var1) {
                    class235.field3779 = var1;
                }
            }
            if (var2 > class251.field3990) {
                class251.field3990 += (var2 - class251.field3990) * class292.field4737 / 1000 + class121.field1782;
                if (class251.field3990 > var2) {
                    class251.field3990 = var2;
                }
            }
            if (var2 < class251.field3990) {
                class251.field3990 -= (class251.field3990 - var2) * class292.field4737 / 1000 + class121.field1782;
                if (class251.field3990 < var2) {
                    class251.field3990 = var2;
                }
            }
            if (var3 > class13.field159) {
                class13.field159 += (var3 - class13.field159) * class292.field4737 / 1000 + class121.field1782;
                if (class13.field159 > var3) {
                    class13.field159 = var3;
                }
            }
            if (class13.field159 > var3) {
                class13.field159 -= class121.field1782 + ((class13.field159 - var3) * class292.field4737 / 1000);
                if (class13.field159 < var3) {
                    class13.field159 = var3;
                }
            }
            if (var1 < class235.field3779) {
                class235.field3779 -= class121.field1782 + ((class235.field3779 - var1) * class292.field4737 / 1000);
                if (class235.field3779 < var1) {
                    class235.field3779 = var1;
                }
            }
        } else {
            class235.field3779 = class128.field1903 * 128 + 64;
            class251.field3990 = class207.field3353 * 128 + 64;
            class13.field159 = class140.method983((byte) 68, class55.field807, class235.field3779, class251.field3990) - class299.field4841;
        }
        int var4 = class51.field770 * 128 + 64;
        if (arg0 != 2048) {
            field4874 = (class65) null;
        }
        int var5 = class272.field4416 * 128 + 64;
        int var6 = class140.method983((byte) -107, class55.field807, var4, var5) - class167.field2654;
        int var7 = var6 - class13.field159;
        int var8 = var4 - class235.field3779;
        int var9 = var5 - class251.field3990;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var9)) & 0x7FF;
        int var13 = var12 - class304.field5072;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var13 > 0) {
            class304.field5072 += class176.field2865 * var13 / 1000 + class194.field3124;
            class304.field5072 &= 0x7FF;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < 0) {
            class304.field5072 -= -var13 * class176.field2865 / 1000 + class194.field3124;
            class304.field5072 &= 0x7FF;
        }
        int var14 = var12 - class304.field5072;
        if (var11 > class57.field823) {
            class57.field823 += (var11 - class57.field823) * class176.field2865 / 1000 + class194.field3124;
            if (class57.field823 > var11) {
                class57.field823 = var11;
            }
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var11 < class57.field823) {
            class57.field823 -= class194.field3124 + ((class57.field823 - var11) * class176.field2865 / 1000);
            if (var11 > class57.field823) {
                class57.field823 = var11;
            }
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class304.field5072 = var12;
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)Lhj;", line = 231)
    public static final class117 method2075(int arg0, int arg1) {
        class117 var2 = (class117) class151.field2344.method136((long) arg1, true);
        field4885++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class259.field4139.method454(4, 0, arg1);
        class117 var4 = new class117();
        if (arg0 != 1000) {
            method2073(false);
        }
        if (var3 != null) {
            var4.method833(arg1, arg0 - 1001, new class112(var3));
        }
        class151.field2344.method132((long) arg1, var4, arg0 ^ 0xFFFFFC17);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I", line = 257)
    public final int[] method14(int arg0, int arg1) {
        field4887++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (arg1 != -14959) {
            method2074(-45);
        }
        if (this.field1775.field1798) {
            int[] var4 = this.method854(0, arg0, -24059);
            for (int var5 = 0; var5 < class307.field5160; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field4883 && var6 <= this.field4875 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 306)
    public class301() {
        super(1, true);
    }
}
