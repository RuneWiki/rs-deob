import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class228 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "[I")
    public static int[] field3768 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[I")
    public static int[] field3771;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method1603(boolean arg0) {
        field3768 = null;
        field3771 = null;
        if (arg0) {
            method1603(false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
    public static final void method1604(int arg0, int arg1, int arg2) {
        if (class125.field2019 > 0) {
            class117.method859((byte) 48, class125.field2019);
            class125.field2019 = 0;
        }
        field3769++;
        short var3 = 256;
        int var4 = 0;
        int var5 = class2.field36 * arg2;
        int var6 = 0;
        for (int var7 = arg1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class227.field3751[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class64.field1079[var4++];
                int var12 = class2.field34[var5++ + arg0];
                if (var11 == 0) {
                    class186.field2953.field723[var6++] = var12;
                } else {
                    int var13 = 256 - var11 - 18;
                    int var14 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class54.field928[var11];
                    class186.field2953.field723[var6++] = class202.method1393(var13 * class202.method1393(16711935, var12) + class202.method1393(var15, 16711935) * var14, -16711936) + class202.method1393(var13 * class202.method1393(65280, var12) + class202.method1393(var15, 65280) * var14, 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class186.field2953.field723[var6++] = class2.field34[arg0 + (var5++)];
            }
            var5 += class2.field36 - 128;
        }
        class186.field2953.method314(arg0, arg2);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
    public static final void method1605(int arg0, byte arg1) {
        class133.field2127 = false;
        class285.field4512 = 0;
        field3767++;
        class244.field3917 = null;
        if (arg1 != 74) {
            method1606(-22, -87);
        }
        class132.field2119 = -1;
        class99.field1623 = arg0;
        class220.field3599 = 1;
        class94.field1549 = -1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Z")
    public static final boolean method1606(int arg0, int arg1) {
        field3770++;
        if (class10.field147[arg1]) {
            return true;
        } else if (class234.field3819.method1380(arg1, (byte) -96)) {
            int var2 = class234.field3819.method1361(arg1, arg0 - 111);
            if (~var2 == arg0) {
                class10.field147[arg1] = true;
                return true;
            }
            if (class136.field2250[arg1] == null) {
                class136.field2250[arg1] = new class36[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class136.field2250[arg1][var3] == null) {
                    byte[] var4 = class234.field3819.method1357(var3, arg1, -1);
                    if (var4 != null) {
                        class36 var5 = class136.field2250[arg1][var3] = new class36();
                        var5.field648 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method307(new class221(var4), 1);
                        } else {
                            var5.method309(new class221(var4), (byte) -86);
                        }
                    }
                }
            }
            class10.field147[arg1] = true;
            return true;
        } else {
            return false;
        }
    }
}
