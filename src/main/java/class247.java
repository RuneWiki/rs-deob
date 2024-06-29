import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class247 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lvf;")
    private class248 field4295 = new class248();

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lij;")
    public static class50 field4293 = class78.method578(127, "gr-Un:");

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lij;")
    private static class50 field4298 = class78.method578(127, "Members only world");

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Lij;")
    public static class50 field4304 = field4298;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "Lvf;")
    private class248 field4306;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "[I")
    public static int[] field4302;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "[I")
    public static int[] field4305;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Lvf;")
    public final class248 method1680(int arg0) {
        field4294++;
        class248 var2 = this.field4295.field4315;
        if (this.field4295 == var2) {
            return null;
        } else if (arg0 == -354669215) {
            var2.method1693(63);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lvf;I)V")
    public final void method1681(class248 arg0, int arg1) {
        field4299++;
        if (arg1 != -354669215) {
            this.method1685(-11, (class248) null);
        }
        if (arg0.field4314 != null) {
            arg0.method1693(arg1 + 354669278);
        }
        arg0.field4315 = this.field4295;
        arg0.field4314 = this.field4295.field4314;
        arg0.field4314.field4315 = arg0;
        arg0.field4315.field4314 = arg0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4303++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg4 * arg4;
        int var9 = var8 << 1;
        int var10 = arg3 * arg3;
        int var11 = arg3 << 1;
        int var12 = var8 << 2;
        int var13 = var10 - ((var11 - 1) * var9);
        int var14 = var10 << 1;
        int var15 = (1 - var11) * var8 + var14;
        int var16 = ((arg3 << 1) - 3) * var9;
        int var17 = ((var6 << 1) + 3) * var14;
        int var18 = (arg3 - 1) * var12;
        if (arg0 != 797590370) {
            return;
        }
        int var19 = var10 << 2;
        int var20 = (var6 + 1) * var19;
        if (arg2 >= class100.field1855 && class97.field1816 >= arg2) {
            int var21 = class2.method10(class177.field2953, (byte) 97, arg1 + arg4, class224.field3773);
            int var22 = class2.method10(class177.field2953, (byte) 97, arg1 - arg4, class224.field3773);
            class155.method1090(class177.field2963[arg2], var22, arg5, 160, var21);
        }
        while (var7 > 0) {
            if (var15 < 0) {
                while (var15 < 0) {
                    var13 += var20;
                    var6++;
                    var20 += var19;
                    var15 += var17;
                    var17 += var19;
                }
            }
            if (var13 < 0) {
                var13 += var20;
                var15 += var17;
                var17 += var19;
                var20 += var19;
                var6++;
            }
            var15 += -var18;
            var13 += -var16;
            var7--;
            int var23 = arg2 - var7;
            var18 -= var12;
            int var24 = arg2 + var7;
            if (var24 >= class100.field1855 && var23 <= class97.field1816) {
                int var25 = class2.method10(class177.field2953, (byte) 97, arg1 + var6, class224.field3773);
                int var26 = class2.method10(class177.field2953, (byte) 97, arg1 - var6, class224.field3773);
                if (var23 >= class100.field1855) {
                    class155.method1090(class177.field2963[var23], var26, arg5, arg0 - 797590210, var25);
                }
                if (var24 <= class97.field1816) {
                    class155.method1090(class177.field2963[var24], var26, arg5, 160, var25);
                }
            }
            var16 -= var12;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static void method1683(boolean arg0) {
        field4293 = null;
        field4302 = null;
        if (!arg0) {
            method1682(61, 15, 104, -8, 40, -36);
        }
        field4304 = null;
        field4298 = null;
        field4305 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Lvf;")
    public final class248 method1684(int arg0) {
        field4307++;
        if (arg0 != -1128) {
            this.field4295 = null;
        }
        class248 var2 = this.field4295.field4315;
        if (this.field4295 == var2) {
            this.field4306 = null;
            return null;
        } else {
            this.field4306 = var2.field4315;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILvf;)V")
    public final void method1685(int arg0, class248 arg1) {
        if (arg1.field4314 != null) {
            arg1.method1693(arg0 - 1831570274);
        }
        arg1.field4315 = this.field4295.field4315;
        arg1.field4314 = this.field4295;
        if (arg0 == 1831570337) {
            field4297++;
            arg1.field4314.field4315 = arg1;
            arg1.field4315.field4314 = arg1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)Lvf;")
    public final class248 method1686(int arg0) {
        field4296++;
        class248 var2 = this.field4306;
        if (this.field4295 == var2) {
            this.field4306 = null;
            return null;
        }
        if (arg0 != 1784) {
            this.field4295 = null;
        }
        this.field4306 = var2.field4315;
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public final void method1687(int arg0) {
        while (true) {
            class248 var2 = this.field4295.field4315;
            if (this.field4295 == var2) {
                if (arg0 > -25) {
                    field4304 = null;
                }
                field4300++;
                this.field4306 = null;
                return;
            }
            var2.method1693(63);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lvf;BLvf;)V")
    public final void method1688(class248 arg0, byte arg1, class248 arg2) {
        field4301++;
        if (arg2.field4314 != null) {
            arg2.method1693(63);
        }
        arg2.field4314 = arg0;
        if (arg1 <= 114) {
            this.method1681((class248) null, -24);
        }
        arg2.field4315 = arg0.field4315;
        arg2.field4314.field4315 = arg2;
        arg2.field4315.field4314 = arg2;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class247() {
        this.field4295.field4314 = this.field4295;
        this.field4295.field4315 = this.field4295;
    }
}
