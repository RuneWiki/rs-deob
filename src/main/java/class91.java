import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class91 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "[I")
    private int[] field1278;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
    public static int[] field1282 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "F")
    public static float field1281 = 0.0F;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I", line = 6)
    public final int method758(int arg0, int arg1) {
        field1280++;
        int var3 = (this.field1278.length >> 1) - 1;
        int var4 = arg1 & var3;
        if (arg0 >= -80) {
            method762(25, 111, 8, 44);
        }
        while (true) {
            int var5 = this.field1278[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1278[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 38)
    public static void method759(int arg0) {
        field1282 = null;
        if (arg0 != -1) {
            field1282 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V", line = 48)
    public static final void method760(boolean arg0, int arg1) {
        class102.field1431 = arg0;
        field1284++;
        if (class468.field6599 != null) {
            class468.field6599.method502(!class435.method2628(2), 128);
        }
        int var2 = 74 / ((-arg1 - 46) / 59);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "([I)V", line = 68)
    public class91(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field1278 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1278[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1278[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1278[var5 + var5] = arg0[var4];
            this.field1278[var5 - (-var5 - 1)] = var4++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ld;Z)V", line = 103)
    public static final void method761(class57 arg0, boolean arg1) {
        class155.field2152 = arg0;
        field1279++;
        if (!arg1) {
            field1282 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)Lfo;", line = 114)
    public static final class418 method762(int arg0, int arg1, int arg2, int arg3) {
        field1283++;
        class52 var4 = class385.field5285[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        class418 var5 = null;
        int var6 = -1;
        for (class131 var7 = var4.field763; var7 != null; var7 = var7.field1796) {
            class325 var8 = var7.field1803;
            if (var8 instanceof class418) {
                class418 var9 = (class418) var8;
                int var10 = (var9.method245(arg3 ^ 0x1165) - 1) * 64 + 60;
                int var11 = var9.field4537 - var10 >> 7;
                int var12 = var9.field4530 - var10 >> 7;
                int var13 = var9.field4537 + var10 >> 7;
                int var14 = var9.field4530 + var10 >> 7;
                if (arg1 >= var11 && arg2 >= var12 && arg1 <= var13 && var14 >= arg2) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg1);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        if (arg3 != 1) {
            field1282 = null;
        }
        return var5;
    }
}
