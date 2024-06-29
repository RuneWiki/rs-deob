import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class17 {

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "[I")
    private int[] field277;

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "[I")
    public static int[] field273 = new int[256];

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "Lh;")
    public static class15 field278;

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Lh;")
    public static class15 field276;

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "Lh;")
    public static class15 field279;

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Lh;")
    public static class15 field275;

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Lh;")
    public static class15 field280;

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "Lh;")
    public static class15 field281;

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 8)
    public static final void method143(byte arg0) {
        if (arg0 != -26) {
            field275 = null;
        }
        if (class15.field251 != null) {
            class9 var1 = class15.field251;
            synchronized (class15.field251) {
                class15.field251 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I)V", line = 35)
    public static void method144(int arg0) {
        field273 = null;
        field281 = null;
        field276 = null;
        field278 = null;
        field279 = null;
        field275 = null;
        if (arg0 < 81) {
            method144(108);
        }
        field280 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(I)[Ls;", line = 55)
    public static final class32[] method145(int arg0) {
        int var1 = -86 / ((arg0 + 8) / 50);
        class32[] var2 = new class32[class3.field106];
        for (int var3 = 0; var3 < class3.field106; var3++) {
            class32 var4 = var2[var3] = new class32();
            var4.field435 = class25.field343[var3];
            var4.field431 = class2.field87[var3];
            var4.field434 = class16.field261[var3];
            var4.field432 = class29.field399[var3];
            int var5 = var4.field434 * var4.field432;
            byte[] var6 = class6.field130[var3];
            var4.field433 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var4.field433[var7] = class16.field269[class16.method141(255, var6[var7])];
            }
        }
        class4.method58(-46);
        return var2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field273[var0] = var1;
        }
        field278 = class26.method190(true, "Spinning Wheel");
        field276 = class26.method190(true, "(U");
        field279 = class26.method190(true, "Rare Trees");
        field275 = class26.method190(true, "Potters Wheel");
        field280 = class26.method190(true, "Loading ");
        field281 = class26.method190(true, "codeversion");
        field282 = 500;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(II)I", line = 104)
    public final int method146(int arg0, int arg1) {
        int var3 = this.field277.length - 2;
        if (arg0 != -6372) {
            method145(-120);
        }
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field277[var4];
            if (arg1 == var5) {
                return this.field277[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "([I)V", line = 168)
    public class17(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field277 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field277[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field277[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field277[var5 + var5] = arg0[var4];
            this.field277[var5 + var5 + 1] = var4++;
        }
    }
}
