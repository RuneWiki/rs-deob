import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class10 implements Runnable {

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "[Lvf;")
    public volatile class51[] field110 = new class51[2];

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Z")
    public volatile boolean field106 = false;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Z")
    public volatile boolean field109 = false;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "S")
    public static short field112 = 205;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Le;")
    public static class191 field113 = class54.method368("Lade Titelbild )2 ", 2047);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Le;")
    public static class191 field105 = class54.method368("0(U", 2047);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Lng;")
    public static class121 field116;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lt;")
    public class247 field117;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "[I")
    public static int[] field118;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
    public static final int method71(int arg0, int arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        field114++;
        int var5 = var4 | var4 >>> 8;
        if (arg1 != -480947516) {
            method72((byte) 103);
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method72(byte arg0) {
        if (arg0 > -93) {
            method73(-55L, -58, -11, 108);
        }
        field116 = null;
        field105 = null;
        field113 = null;
        field118 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(JIII)Z")
    public static final boolean method73(long arg0, int arg1, int arg2, int arg3) {
        field107++;
        int var5 = ((int) arg0 & 0x3434C1) >> 20;
        int var6 = (int) arg0 >> 14 & 0x1F;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (arg1 != 15) {
            return true;
        }
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class102 var8 = class31.method216(var7, (byte) 122);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field1652;
                var9 = var8.field1686;
            } else {
                var9 = var8.field1652;
                var10 = var8.field1686;
            }
            int var11 = var8.field1645;
            if (var5 != 0) {
                var11 = (var11 << var5 & 0xF) + (var11 >> 4 - var5);
            }
            class97.method604(var10, arg2, class175.field2946.field2953[0], arg3, 0, var11, 2, 0, class175.field2946.field3014[0], var9, true, 126);
        } else {
            class97.method604(0, arg2, class175.field2946.field2953[0], arg3, var6 + 1, 0, 2, var5, class175.field2946.field3014[0], 0, true, 95);
        }
        class242.field4327 = 2;
        class162.field2749 = 0;
        class126.field2091 = class104.field1709;
        class199.field3546 = class50.field897;
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB)Leg;")
    public static final class33 method74(int arg0, int arg1, byte arg2) {
        class33 var3 = class233.method1646(5877, arg0);
        field108++;
        if (arg1 == -1) {
            return var3;
        } else {
            int var4 = 44 / ((arg2 - 71) / 51);
            return var3 == null || var3.field548 == null || var3.field548.length <= arg1 ? null : var3.field548[arg1];
        }
    }

    @OriginalMember(owner = "client!nc", name = "run", descriptor = "()V")
    public final void run() {
        field115++;
        this.field109 = true;
        try {
            while (!this.field106) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field110[var1];
                    if (var2 != null) {
                        var2.method351(false);
                    }
                }
                class18.method142(true, 10L);
                class234.method1654((Object) null, this.field117, -119);
            }
        } catch (Exception var9) {
            class25.method182(var9, (String) null, true);
        } finally {
            Object var6 = null;
            this.field109 = false;
        }
    }
}
