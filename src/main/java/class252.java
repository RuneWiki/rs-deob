import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class252 extends class68 {

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public int field4219 = 0;

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
    public int field4235 = -1;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Lce;")
    public static class126 field4212 = class206.method1445(-7923, ")4a=");

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "Lce;")
    public static class126 field4233 = class206.method1445(-7923, "gleiten:");

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "Lce;")
    private static class126 field4224 = class206.method1445(-7923, "Loaded input handler");

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "Lce;")
    public static class126 field4234 = class206.method1445(-7923, "scrollen:");

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "Lce;")
    private static class126 field4227 = class206.method1445(-7923, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "Lce;")
    public static class126 field4229 = field4227;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "Lce;")
    public static class126 field4220 = field4224;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field4209;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public int field4211;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public int field4217;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public int field4218;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 7)
    public static void method1703(int arg0) {
        if (arg0 != -17) {
            return;
        }
        field4212 = null;
        field4229 = null;
        field4234 = null;
        field4224 = null;
        field4233 = null;
        field4220 = null;
        field4227 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIBI)V", line = 26)
    public static final void method1704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field4214++;
        int var8 = class94.method645(class197.field3372, 0, arg7, class194.field3302);
        int var9 = class94.method645(class197.field3372, 0, arg0, class194.field3302);
        int var10 = class94.method645(class321.field5489, 0, arg1, class52.field795);
        int var11 = class94.method645(class321.field5489, 0, arg3, class52.field795);
        int var12 = class94.method645(class197.field3372, 0, arg5 + arg7, class194.field3302);
        int var13 = class94.method645(class197.field3372, 0, arg0 - arg5, class194.field3302);
        for (int var14 = var8; var14 < var12; var14++) {
            class94.method647(class314.field5393[var14], var10, -7, var11, arg2);
        }
        if (arg6 <= 67) {
            return;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class94.method647(class314.field5393[var15], var10, -7, var11, arg2);
        }
        int var16 = class94.method645(class321.field5489, 0, arg1 + arg5, class52.field795);
        int var17 = class94.method645(class321.field5489, 0, arg3 - arg5, class52.field795);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class314.field5393[var18];
            class94.method647(var19, var10, -7, var16, arg2);
            class94.method647(var19, var16, -7, var17, arg4);
            class94.method647(var19, var17, -7, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BIIIII)V", line = 79)
    public static final void method1705(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class15.field211[0].method10(arg1, arg2);
        field4213++;
        int var6 = (arg5 - 32) * arg5 / arg3;
        if (arg0 != -8) {
            field4227 = (class126) null;
        }
        class15.field211[1].method10(arg1, arg2 + arg5 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg4 / (arg3 - arg5);
        if (!class56.field846) {
            class276.method1844(arg1, arg2 + 16, 16, arg5 - 32, class18.field249);
            class276.method1844(arg1, var7 + arg2 + 16, 16, var6, class161.field2905);
            class276.method1859(arg1, arg2 + var7 + 16, var6, class50.field778);
            class276.method1859(arg1 + 1, arg2 + 16 + var7, var6, class50.field778);
            class276.method1850(arg1, arg2 + var7 + 16, 16, class50.field778);
            class276.method1850(arg1, var7 + arg2 + 17, 16, class50.field778);
            class276.method1859(arg1 + 15, arg2 + 16 - -var7, var6, class76.field1241);
            class276.method1859(arg1 + 14, arg2 + var7 - -17, var6 - 1, class76.field1241);
            class276.method1850(arg1, arg2 + var7 + var6 + 15, 16, class76.field1241);
            class276.method1850(arg1 + 1, arg2 + var7 + 14 - -var6, 15, class76.field1241);
            return;
        }
        class101.method689(arg1, arg2 + 16, 16, arg5 - 32, class18.field249);
        class101.method689(arg1, var7 + arg2 + 16, 16, var6, class161.field2905);
        class101.method684(arg1, arg2 + var7 + 16, var6, class50.field778);
        class101.method684(arg1 + 1, arg2 + var7 - -16, var6, class50.field778);
        class101.method694(arg1, arg2 + var7 + 16, 16, class50.field778);
        class101.method694(arg1, arg2 + var7 + 17, 16, class50.field778);
        class101.method684(arg1 + 15, var7 + 16 + arg2, var6, class76.field1241);
        class101.method684(arg1 + 14, arg2 - -var7 + 17, var6 - 1, class76.field1241);
        class101.method694(arg1, arg2 + var7 + var6 + 15, 16, class76.field1241);
        class101.method694(arg1 + 1, 14 - -var7 + arg2 + var6, 15, class76.field1241);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(II)Lwd;", line = 139)
    public static final class112 method1706(int arg0, int arg1) {
        int var2 = arg1 >> 16;
        field4232++;
        int var3 = arg1 & 0xFFFF;
        if (class291.field4825[var2] == null || class291.field4825[var2][var3] == null) {
            boolean var4 = class13.method75(var2, (byte) -43);
            if (!var4) {
                return null;
            }
        }
        if (arg0 != 5157) {
            field4210 = -117;
        }
        return class291.field4825[var2][var3];
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILki;Lcc;Lcc;Lcc;)Z", line = 183)
    public static final boolean method1707(int arg0, class307 arg1, class313 arg2, class313 arg3, class313 arg4) {
        class40.field638 = arg4;
        class5.field45 = arg3;
        class301.field5005 = arg2;
        if (arg0 != 1) {
            method1707(89, (class307) null, (class313) null, (class313) null, (class313) null);
        }
        field4226++;
        class217.field3654 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(II)V", line = 198)
    public static final void method1708(int arg0, int arg1) {
        if (arg0 != -2) {
            return;
        }
        field4215++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class259.method1753(arg0 + 1419472494);
        } else if (arg1 == 2) {
            class298.method2010((byte) 44);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBIII)V", line = 225)
    public static final void method1709(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -106) {
            field4220 = (class126) null;
        }
        field4216++;
        if (arg3 > class194.field3302 || arg4 < class197.field3372) {
            return;
        }
        boolean var6;
        if (class321.field5489 > arg1) {
            arg1 = class321.field5489;
            var6 = false;
        } else if (class52.field795 < arg1) {
            var6 = false;
            arg1 = class52.field795;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg0 < class321.field5489) {
            var7 = false;
            arg0 = class321.field5489;
        } else if (arg0 <= class52.field795) {
            var7 = true;
        } else {
            arg0 = class52.field795;
            var7 = false;
        }
        if (arg3 >= class197.field3372) {
            class94.method647(class314.field5393[arg3++], arg1, -7, arg0, arg5);
        } else {
            arg3 = class197.field3372;
        }
        if (class194.field3302 >= arg4) {
            class94.method647(class314.field5393[arg4--], arg1, -7, arg0, arg5);
        } else {
            arg4 = class194.field3302;
        }
        if (var6 && var7) {
            for (int var8 = arg3; var8 <= arg4; var8++) {
                int[] var9 = class314.field5393[var8];
                var9[arg1] = var9[arg0] = arg5;
            }
        } else if (var6) {
            for (int var11 = arg3; var11 <= arg4; var11++) {
                class314.field5393[var11][arg1] = arg5;
            }
        } else if (var7) {
            for (int var10 = arg3; var10 <= arg4; var10++) {
                class314.field5393[var10][arg0] = arg5;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)I", line = 330)
    public static final int method1710(int arg0, int arg1, int arg2, int arg3) {
        field4223++;
        int var4 = arg2 / arg0;
        int var5 = arg1 / arg0;
        int var6 = arg2 & arg0 - 1;
        int var7 = arg0 - 1 & arg1;
        if (arg3 != 16) {
            return 48;
        }
        int var8 = class244.method1677(var5, var4, -25815);
        int var9 = class244.method1677(var5, var4 + 1, -25815);
        int var10 = class244.method1677(var5 + 1, var4, -25815);
        int var11 = class244.method1677(var5 + 1, var4 - -1, arg3 - 25831);
        int var12 = class197.method1397(var6, arg0, 734607760, var8, var9);
        int var13 = class197.method1397(var6, arg0, 734607760, var10, var11);
        return class197.method1397(var7, arg0, 734607760, var12, var13);
    }
}
