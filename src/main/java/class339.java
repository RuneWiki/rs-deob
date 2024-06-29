import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class339 {

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public int field5273 = 8;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public int field5265 = 16777215;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5263 = "Loading defaults - ";

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "[I")
    public static int[] field5268 = new int[14];

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5264 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public int field5256;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public int field5257;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public int field5260;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public int field5262;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public int field5270;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Llc;")
    public static class175 field5267;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Z")
    public boolean field5261;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Lqa;", line = 23)
    public static final class138 method2345(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        return var3 == null || var3.field3209 == null ? null : var3.field3209;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILp;I)V", line = 33)
    private final void method2346(int arg0, int arg1, class107 arg2, int arg3) {
        if (arg1 != -6) {
            this.field5270 = -12;
        }
        field5271++;
        if (arg3 == 1) {
            this.field5273 = arg2.method624(14612);
        } else if (arg3 == 2) {
            this.field5261 = true;
        } else if (arg3 == 3) {
            this.field5270 = arg2.method656(106);
            this.field5260 = arg2.method656(-118);
            this.field5256 = arg2.method656(arg1 ^ 0x78);
        } else if (arg3 == 4) {
            this.field5262 = arg2.method661(arg1 + 5);
        } else if (arg3 == 5) {
            this.field5257 = arg2.method624(14612);
        } else if (arg3 == 6) {
            this.field5265 = arg2.method622((byte) 102);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V", line = 79)
    public static void method2347(boolean arg0) {
        field5267 = null;
        field5263 = null;
        field5268 = null;
        if (!arg0) {
            method2345(-79, -97, 90);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z", line = 91)
    public static final boolean method2348(byte arg0) {
        field5259++;
        if (arg0 == 69) {
            return class250.field3787 ? true : class10.field136;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLlc;)V", line = 109)
    public static final void method2349(byte arg0, class175 arg1) {
        class40.field478 = arg1;
        if (arg0 > 63) {
            field5266++;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 124)
    public static final void method2350(int arg0) {
        field5269++;
        class308.field4767.method113((byte) -42);
        for (int var1 = 0; var1 < 32; var1++) {
            class321.field4929[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class36.field424[var2] = 0L;
        }
        class316.field4876 = 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILp;I)V", line = 149)
    public final void method2351(int arg0, class107 arg1, int arg2) {
        if (arg0 < 48) {
            this.field5273 = 99;
        }
        field5272++;
        while (true) {
            int var4 = arg1.method661(-1);
            if (var4 == 0) {
                return;
            }
            this.method2346(arg2, -6, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZIIIIIII)V", line = 181)
    public static final void method2352(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5258++;
        int var8 = class140.method930(24918, arg5, class248.field3759, class272.field4273);
        int var9 = class140.method930(24918, arg1, class248.field3759, class272.field4273);
        int var10 = class140.method930(24918, arg4, class56.field678, class109.field1494);
        int var11 = class140.method930(24918, arg3, class56.field678, class109.field1494);
        int var12 = class140.method930(24918, arg5 + arg7, class248.field3759, class272.field4273);
        int var13 = class140.method930(24918, arg1 - arg7, class248.field3759, class272.field4273);
        for (int var14 = var8; var14 < var12; var14++) {
            class279.method1997(var11, -824384948, var10, arg2, class206.field2886[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class279.method1997(var11, -824384948, var10, arg2, class206.field2886[var15]);
        }
        int var16 = class140.method930(24918, arg4 + arg7, class56.field678, class109.field1494);
        int var17 = class140.method930(24918, arg3 - arg7, class56.field678, class109.field1494);
        int var18 = var12;
        if (!arg0) {
            method2352(false, -66, -47, -69, 62, 117, -113, -64);
        }
        while (var18 <= var13) {
            int[] var19 = class206.field2886[var18];
            class279.method1997(var16, -824384948, var10, arg2, var19);
            class279.method1997(var17, -824384948, var16, arg6, var19);
            class279.method1997(var11, -824384948, var17, arg2, var19);
            var18++;
        }
    }
}
