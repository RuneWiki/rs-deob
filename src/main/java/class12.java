import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class12 extends class201 {

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "Ljd;")
    public static class85 field186 = class221.method1499("hitbar_default", (byte) -51);

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "Lsb;")
    public static class214 field188 = new class214(64);

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "Z")
    public static boolean field193 = false;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "Ljd;")
    public static class85 field194 = class221.method1499("Welt", (byte) 111);

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "Lge;")
    public static class68 field192;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
    public abstract void method52(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
    public abstract void method50(int arg0, int arg1);

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
    public static void method97(int arg0) {
        field188 = null;
        field192 = null;
        if (arg0 == 7427) {
            field186 = null;
            field194 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
    public abstract void method98(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
    public abstract void method51(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIII)V")
    public abstract void method99(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)V")
    public static final void method100(int arg0) {
        field195++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class115.field2058 - 1); var2++) {
                if (class90.field1659[var2] < 1000 && class90.field1659[var2 + 1] > 1000) {
                    var1 = false;
                    class85 var3 = class184.field3161[var2];
                    class184.field3161[var2] = class184.field3161[var2 + 1];
                    class184.field3161[var2 + 1] = var3;
                    class85 var4 = class124.field2198[var2];
                    class124.field2198[var2] = class124.field2198[var2 + 1];
                    class124.field2198[var2 + 1] = var4;
                    int var5 = class251.field4313[var2];
                    class251.field4313[var2] = class251.field4313[var2 + 1];
                    class251.field4313[var2 + 1] = var5;
                    int var6 = class193.field3292[var2];
                    class193.field3292[var2] = class193.field3292[var2 + 1];
                    class193.field3292[var2 + 1] = var6;
                    short var7 = class90.field1659[var2];
                    class90.field1659[var2] = class90.field1659[var2 + 1];
                    class90.field1659[var2 + 1] = var7;
                    long var8 = class268.field4767[var2];
                    class268.field4767[var2] = class268.field4767[var2 + 1];
                    class268.field4767[var2 + 1] = var8;
                }
            }
        }
        if (arg0 != -7031) {
            field193 = false;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIIII)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field187++;
        if (arg2 != 781) {
            this.method99(-68, 2, -107, 30);
        }
        int var6 = this.field182 << 3;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        int var8 = this.field185 << 3;
        int var9 = (arg3 << 4) + (var8 & 0xF);
        this.method57(var6, var8, var7, var9, arg4, arg0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V")
    public abstract void method57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V")
    public abstract void method56(int arg0, int arg1);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZIIIII)V")
    public static final void method102(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field190++;
        int var7 = 0;
        int var8 = arg4 - arg3;
        client.method997(arg4, (byte) -112);
        int var9 = arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg1) {
            method97(-48);
        }
        int var10 = var8;
        int var11 = -1;
        int var12 = -1;
        int[] var13 = class146.field2488[arg2];
        int var14 = arg0 - var8;
        int var15 = -var8;
        int var16 = -arg4;
        class183.method1260(arg6, arg0 - arg4, 28, var13, var14);
        int var17 = arg0 + var8;
        class183.method1260(arg5, var14, -114, var13, var17);
        class183.method1260(arg6, var17, 85, var13, arg0 + arg4);
        while (var7 < var9) {
            var11 += 2;
            var16 += var11;
            var12 += 2;
            var15 += var12;
            if (var15 >= 0 && var10 >= 1) {
                class140.field2426[var10] = var7;
                var10--;
                var15 -= var10 << 1;
            }
            var7++;
            if (var16 >= 0) {
                var9--;
                var16 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var18 = class146.field2488[arg2 - var9];
                    int var19 = arg0 + var7;
                    int var20 = arg0 - var7;
                    int[] var21 = class146.field2488[arg2 + var9];
                    class183.method1260(arg6, var20, -122, var21, var19);
                    class183.method1260(arg6, var20, -109, var18, var19);
                } else {
                    int[] var22 = class146.field2488[arg2 - var9];
                    int[] var23 = class146.field2488[arg2 + var9];
                    int var24 = class140.field2426[var9];
                    int var25 = arg0 + var7;
                    int var26 = arg0 + var24;
                    int var27 = arg0 - var24;
                    int var28 = arg0 - var7;
                    class183.method1260(arg6, var28, -6, var23, var27);
                    class183.method1260(arg5, var27, -104, var23, var26);
                    class183.method1260(arg6, var26, -118, var23, var25);
                    class183.method1260(arg6, var28, -113, var22, var27);
                    class183.method1260(arg5, var27, 111, var22, var26);
                    class183.method1260(arg6, var26, -119, var22, var25);
                }
            }
            int[] var29 = class146.field2488[arg2 + var7];
            int[] var30 = class146.field2488[arg2 - var7];
            int var31 = arg0 + var9;
            int var32 = arg0 - var9;
            if (var8 > var7) {
                int var33 = var7 > var10 ? class140.field2426[var7] : var10;
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class183.method1260(arg6, var32, -122, var29, var35);
                class183.method1260(arg5, var35, -122, var29, var34);
                class183.method1260(arg6, var34, 41, var29, var31);
                class183.method1260(arg6, var32, -126, var30, var35);
                class183.method1260(arg5, var35, 4, var30, var34);
                class183.method1260(arg6, var34, 94, var30, var31);
            } else {
                class183.method1260(arg6, var32, -114, var29, var31);
                class183.method1260(arg6, var32, -111, var30, var31);
            }
        }
    }
}
