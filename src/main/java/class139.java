import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class class139 {

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field2568 = 1;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Loh;")
    public static class263 field2565 = class253.method1681(-124, "rot:");

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method904(int arg0) {
        field2565 = null;
        if (arg0 <= 89) {
            method904(57);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
    public void method556(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 54) {
            this.method905();
        }
        field2570++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()Z")
    public boolean method905() {
        field2564++;
        return false;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()I")
    public abstract int method106();

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V")
    public static final void method906(int arg0, boolean arg1) {
        if (arg0 != 1) {
            return;
        }
        field2563++;
        byte[][] var2 = class233.field4077;
        int var3 = class78.field1587.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class128.field2370[var4] >> 8) * 64 - class93.field1844;
                int var7 = (class128.field2370[var4] & 0xFF) * 64 - class142.field2596;
                class61.method371((byte) 77);
                class163.method1073(var7, 4697, class103.field1954, arg1, var6, var5);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
    public static final void method907(int arg0, int arg1, int arg2) {
        if (arg0 != -31912) {
            field2561 = 110;
        }
        class64 var3 = class84.method563(13, arg1, -68);
        field2566++;
        var3.method396(true);
        var3.field1290 = arg2;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Lri;")
    public static final class64 method908(int arg0) {
        field2569++;
        class64 var1 = (class64) class176.field3178.method250(0);
        if (var1 != null) {
            var1.method1614(arg0 ^ 0xB82FCCD2);
            var1.method1401((byte) 27);
            return var1;
        }
        if (arg0 != 0) {
            field2568 = -47;
        }
        class64 var2;
        do {
            var2 = (class64) class20.field463.method250(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method388(true) > class25.method182(true)) {
                return null;
            }
            var2.method1614(-1204826926);
            var2.method1401((byte) 27);
        } while ((var2.field3647 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lnj;IIIZ)V")
    public void method909(class139 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2567++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)Lnj;")
    public class139 method910(int arg0, int arg1, int arg2) {
        field2562++;
        return this;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIIII)Z")
    public static final boolean method911(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class91.field1810 * arg0 + class275.field4820 * arg3 >> 16;
        int var6 = class91.field1810 * arg3 - class275.field4820 * arg0 >> 16;
        int var7 = class36.field850 * arg1 + class259.field4494 * var6 >> 16;
        int var8 = class259.field4494 * arg1 - class36.field850 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class36.field850 * arg2 + class259.field4494 * var6 >> 16;
        int var12 = class259.field4494 * arg2 - class36.field850 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class12.field337 && var13 < class12.field337) {
            return false;
        } else if (var9 > class126.field2332 && var13 > class126.field2332) {
            return false;
        } else if (var10 < class111.field2094 && var14 < class111.field2094) {
            return false;
        } else {
            return var10 <= class99.field1907 || var14 <= class99.field1907;
        }
    }
}
