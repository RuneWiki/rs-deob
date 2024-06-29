import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class12 extends class151 {

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "Ljava/lang/Object;")
    private Object field194;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field196 = 0;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "[I")
    public static int[] field190 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field199 = -1;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "Lmc;")
    public static class165 field193;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "[I")
    public static int[] field188;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)Z")
    public static final boolean method63(int arg0, boolean arg1) {
        field197++;
        if (!arg1) {
            field188 = null;
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
    public static final void method64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field192++;
        class24.method170((byte) 33, arg1 - arg0, class6.field100[arg5], arg1 + arg0, arg2);
        int var6 = 0;
        if (arg4 != -1191017215) {
            field190 = null;
        }
        int var7 = arg0 * arg0;
        int var8 = arg3;
        int var9 = arg3 * arg3;
        int var10 = var7 << 1;
        int var11 = var9 << 1;
        int var12 = arg3 << 1;
        int var13 = var9 - ((var12 - 1) * var10);
        int var14 = (1 - var12) * var7 + var11;
        int var15 = var7 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var11;
        int var18 = (var6 + 1) * var16;
        int var19 = ((arg3 << 1) - 3) * var10;
        int var20 = (arg3 - 1) * var15;
        while (var8 > 0) {
            var8--;
            int var21 = arg5 - var8;
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var17;
                    var13 += var18;
                    var6++;
                    var17 += var16;
                    var18 += var16;
                }
            }
            int var22 = arg5 + var8;
            if (var13 < 0) {
                var13 += var18;
                var6++;
                var14 += var17;
                var17 += var16;
                var18 += var16;
            }
            int var23 = arg1 + var6;
            var14 += -var20;
            var20 -= var15;
            var13 += -var19;
            var19 -= var15;
            int var24 = arg1 - var6;
            class24.method170((byte) 33, var24, class6.field100[var21], var23, arg2);
            class24.method170((byte) 33, var24, class6.field100[var22], var23, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZII)Lha;")
    public static final class46 method65(boolean arg0, int arg1, int arg2) {
        field195++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class263.field4580;
        } else if (arg0) {
            return null;
        } else if (var3 < -6) {
            return class3.field60;
        } else if (var3 < -3) {
            return class140.field2506;
        } else if (var3 < 0) {
            return class245.field4348;
        } else if (var3 > 9) {
            return class273.field4769;
        } else if (var3 > 6) {
            return class168.field2971;
        } else if (var3 > 3) {
            return class229.field3998;
        } else if (var3 > 0) {
            return class171.field3057;
        } else {
            return class220.field3875;
        }
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
    public static final void method66(int arg0) {
        int var1 = 9 / ((9 - arg0) / 35);
        class111.field2100.method83(25216);
        field189++;
        class188.field3356.method83(25216);
        class174.field3140.method83(25216);
        client.field4679.method83(25216);
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method67(int arg0) {
        field191++;
        int var2 = 34 % ((arg0 + 15) / 61);
        return this.field194;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class12(Object arg0) {
        this.field194 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)Z")
    public final boolean method68(int arg0) {
        field200++;
        int var2 = -68 % ((61 - arg0) / 46);
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
    public static void method69(byte arg0) {
        field190 = null;
        field188 = null;
        if (arg0 <= 122) {
            method65(true, 25, -128);
        }
        field193 = null;
    }
}
