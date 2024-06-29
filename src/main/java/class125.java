import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class125 {

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lpa;")
    public class342 field1666 = new class342();

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
    public boolean field1671 = false;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[Lvp;")
    public static class194[] field1664 = new class194[2048];

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1662 = 0;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1668 = 0;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1667 = -1;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1661++;
        int var7 = -102 % ((57 - arg2) / 53);
        int var8 = class143.method950(-15543, class50.field695, class180.field2375, arg3);
        int var9 = class143.method950(-15543, class50.field695, class180.field2375, arg4);
        int var10 = class143.method950(-15543, class297.field4268, class203.field2942, arg1);
        int var11 = class143.method950(-15543, class297.field4268, class203.field2942, arg5);
        int var12 = class143.method950(-15543, class50.field695, class180.field2375, arg3 + arg6);
        int var13 = class143.method950(-15543, class50.field695, class180.field2375, arg4 - arg6);
        for (int var14 = var8; var14 < var12; var14++) {
            class370.method2440(var11, class227.field3201[var14], arg0, var10, 56);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class370.method2440(var11, class227.field3201[var15], arg0, var10, 68);
        }
        int var16 = class143.method950(-15543, class297.field4268, class203.field2942, arg1 + arg6);
        int var17 = class143.method950(-15543, class297.field4268, class203.field2942, arg5 - arg6);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class227.field3201[var18];
            class370.method2440(var16, var19, arg0, var10, 108);
            class370.method2440(var11, var19, arg0, var17, 99);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[II[JI)V")
    public static final void method855(int arg0, int[] arg1, int arg2, long[] arg3, int arg4) {
        if (arg4 < arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var9;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg3[var10]) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var9;
            method855(-116, arg1, var6 - 1, arg3, arg4);
            method855(-127, arg1, arg2, arg3, var6 + 1);
        }
        field1663++;
        int var14 = 10 % ((8 - arg0) / 47);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method856(int arg0) {
        class24 var1 = class104.field1396;
        synchronized (class104.field1396) {
            class104.field1396.method212(-66);
        }
        field1660++;
        class24 var2 = class197.field2822;
        synchronized (class197.field2822) {
            class197.field2822.method212(-78);
            int var3 = -1 / ((-arg0 - 59) / 46);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILqj;)V")
    public static final void method857(int arg0, class238 arg1) {
        field1665++;
        class314.field4507 = arg1;
        class244.field3408 = class314.field4507.method1476(4, (byte) -72);
        if (arg0 != 21187) {
            method854(-109, 17, 6, 47, -75, -3, 10);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method858(int arg0) {
        field1658++;
        class24 var1 = class249.field3592;
        synchronized (class249.field3592) {
            class249.field3592.method212(arg0 - 69);
        }
        class24 var2 = class86.field1204;
        synchronized (class86.field1204) {
            class86.field1204.method212(-102);
        }
        class24 var3 = class197.field2819;
        synchronized (class197.field2819) {
            class197.field2819.method212(-95);
            if (arg0 != 0) {
                field1664 = null;
            }
        }
        class24 var4 = class295.field4257;
        synchronized (class295.field4257) {
            class295.field4257.method212(-120);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static void method859(int arg0) {
        if (arg0 >= -105) {
            field1667 = 4;
        }
        field1664 = null;
    }
}
