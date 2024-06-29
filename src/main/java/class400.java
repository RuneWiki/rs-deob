import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class400 {

    @OriginalMember(owner = "client!op", name = "a", descriptor = "Z")
    private boolean field6087 = true;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    private int field6101 = -1;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "[Lwl;")
    private class98[] field6093;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    private int field6094;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    private int field6099;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    private int field6097;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    private int field6103;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Lwl;")
    private class98 field6102;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "[Lwl;")
    private class98[] field6089;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Z")
    public static boolean field6088 = true;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "Llo;")
    public static class306 field6096 = new class306("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!op", name = "s", descriptor = "[I")
    public static int[] field6105 = new int[100];

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    private int field6091;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    private int field6095;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "Lo;")
    private class138 field6092;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method2489(int arg0) {
        field6096 = null;
        field6105 = null;
        int var1 = 38 % ((arg0 - 68) / 36);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lza;IIIIIIIII)V")
    public final void method2490(class491 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg2 + arg9 & 0x3FFF;
        field6098++;
        if (this.field6097 == -1) {
            arg0.method914(arg6, arg8, arg3, arg5, arg7, 0);
        } else {
            class320 var12 = class215.field3752.method195(this.field6097, (byte) -105);
            if (this.field6092 == null && class215.field3752.method194((byte) 89, this.field6097)) {
                int[] var13 = var12.field5028 ? class215.field3752.method197(this.field6097, 0.7F, this.field6091, (byte) 117, this.field6091, false) : class215.field3752.method187(false, false, this.field6091, this.field6097, this.field6091, 0.7F);
                this.field6092 = arg0.method834(var13, 0, this.field6091, this.field6091, this.field6091);
            }
            if (!var12.field5028) {
                arg0.method914(arg6, arg8, arg3, arg5, arg7, 0);
            }
            if (this.field6092 != null) {
                int var14 = var12.field5028 ? 0 : 1;
                int var15 = arg4 * arg5 / -4096;
                int var16;
                for (var16 = (arg3 - arg5) / 2 + (arg5 * var11 / 4096); var16 > arg5; var16 -= arg5) {
                }
                while (var16 < 0) {
                    var16 += arg5;
                }
                while (arg5 < var15) {
                    var15 -= arg5;
                }
                while (var15 < 0) {
                    var15 += arg5;
                }
                for (int var17 = var16 - arg5; var17 < arg3; var17 += arg5) {
                    for (int var18 = var15 - arg5; var18 < arg5; var18 += arg5) {
                        this.field6092.method202(arg6 + var17, var18 - -arg8, arg5, arg5, 1, 0, var14);
                    }
                }
            }
        }
        int var19 = this.field6095 - 1;
        if (arg1 != 0) {
            this.method2490(null, -113, 16, -9, -4, -119, -124, 111, -2, -119);
        }
        while (var19 >= 0) {
            this.field6089[var19].method684(arg0, arg6, arg8, arg3, arg5, arg4, var11);
            var19--;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public final void method2491(int arg0) {
        if (this.field6093 != null) {
            for (int var2 = 0; var2 < this.field6093.length; var2++) {
                this.field6093[var2].method679();
            }
        }
        field6090++;
        if (arg0 == 16383) {
            this.field6092 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IBLza;)Z")
    public final boolean method2492(int arg0, byte arg1, class491 arg2) {
        if (arg1 < 122) {
            this.method2492(-71, (byte) -23, null);
        }
        if (this.field6101 != arg0) {
            this.field6101 = arg0;
            int var4 = class206.method1351(arg0, 82);
            if (arg0 < var4) {
                var4 = class237.method1629(arg0, -58);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field6091 != var4) {
                this.field6091 = var4;
                this.field6092 = null;
            }
            if (this.field6093 != null) {
                this.field6095 = 0;
                int[] var5 = new int[this.field6093.length];
                for (int var6 = 0; var6 < this.field6093.length; var6++) {
                    class98 var7 = this.field6093[var6];
                    if (var7.method683(this.field6094, this.field6103, this.field6099, this.field6101)) {
                        var5[this.field6095] = var7.field1636;
                        this.field6089[this.field6095++] = var7;
                    }
                }
                class110.method790(0, this.field6095 - 1, var5, 2, this.field6089);
            }
            this.field6087 = true;
        }
        field6104++;
        boolean var8 = false;
        if (this.field6087) {
            this.field6087 = false;
            for (int var9 = this.field6095 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field6089[var9].method685(arg2, this.field6102);
                var8 |= var10;
                this.field6087 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I[Lwl;IIII)V")
    public class400(int arg0, class98[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6093 = arg1;
        this.field6094 = arg3;
        this.field6099 = arg5;
        this.field6097 = arg0;
        this.field6103 = arg4;
        if (arg1 == null) {
            this.field6102 = null;
            this.field6089 = null;
        } else {
            this.field6089 = new class98[arg1.length];
            this.field6102 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
