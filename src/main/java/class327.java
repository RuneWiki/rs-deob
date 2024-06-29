import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class327 extends class86 {

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    private int field5028 = 32768;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field5030 = 1;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "Z")
    public static boolean field5034 = true;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field5031 = -2;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "Ll;")
    public static class66 field5023 = new class66(100);

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "Lkh;")
    public static class264 field5037 = new class264(0, 0);

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "Z")
    public static boolean field5038 = false;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field5039 = -1;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "Lrn;")
    public static class18 field5025;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "Leh;")
    public static class59 field5027;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)Lvj;", line = 5)
    public static final class292 method2316(byte arg0) {
        field5026++;
        try {
            if (arg0 != 75) {
                method2318(true);
            }
            return (class292) Class.forName("ic").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V", line = 20)
    public final void method476(int arg0) {
        if (arg0 != 0) {
            field5037 = (class264) null;
        }
        field5029++;
        class164.method1307((byte) 0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLug;)V", line = 32)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field5036++;
        if (arg1) {
            this.method158(-2, 112);
        }
        if (arg0 == 0) {
            this.field5028 = arg2.method314((byte) 120) << 4;
        } else if (arg0 == 1) {
            this.field1228 = arg2.method281(-126) == 1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(III)Lcb;", line = 69)
    public static final class98 method2317(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class98 var4 = var3.field5047;
            var3.field5047 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)V", line = 80)
    public static void method2318(boolean arg0) {
        field5025 = null;
        field5027 = null;
        if (arg0) {
            method2319(false);
        }
        field5023 = null;
        field5037 = null;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(Z)V", line = 97)
    public static final void method2319(boolean arg0) {
        class44.field711 = null;
        field5032++;
        class205.field3167 = null;
        class6.field83 = null;
        if (!arg0) {
            method2318(true);
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(III)Lbl;", line = 110)
    public static final class202 method2320(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5064;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)[[I", line = 118)
    public final int[][] method156(int arg0, byte arg1) {
        field5033++;
        if (arg1 >= -126) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int[] var4 = this.method774(0, arg0, 1);
            int[] var5 = this.method774(0, arg0, 2);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class93.field1424; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF276) >> 12;
                int var11 = var5[var9] * this.field5028 >> 12;
                int var12 = class239.field3711[var10] * var11 >> 12;
                int var13 = class193.field3042[var10] * var11 >> 12;
                int var14 = class280.field4324 & (var13 >> 12) + arg0;
                int var15 = class313.field4848 & var9 + (var12 >> 12);
                int[][] var16 = this.method782(var14, 0, 1);
                var7[var9] = var16[0][var15];
                var6[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[I", line = 177)
    public final int[] method158(int arg0, int arg1) {
        field5035++;
        if (arg1 <= 7) {
            return (int[]) null;
        }
        int[] var3 = this.field1225.method1914(arg0, 113);
        if (this.field1225.field3995) {
            int[] var4 = this.method774(0, arg0, 1);
            int[] var5 = this.method774(0, arg0, 2);
            for (int var6 = 0; var6 < class93.field1424; var6++) {
                int var7 = (var4[var6] & 0xFF9) >> 4;
                int var8 = var5[var6] * this.field5028 >> 12;
                int var9 = class239.field3711[var7] * var8 >> 12;
                int var10 = class193.field3042[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class313.field4848;
                int var12 = class280.field4324 & (var10 >> 12) + arg0;
                int[] var13 = this.method774(0, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 243)
    public class327() {
        super(3, false);
    }
}
