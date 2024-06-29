import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class345 extends class26 {

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public int field5364;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public int field5356;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "[I")
    public int[] field5353;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "[I")
    public int[] field5358;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "[Z")
    public boolean[] field5362;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "[[I")
    public int[][] field5366;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "[I")
    public static int[] field5365 = new int[5];

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Lcc;")
    public static class327 field5360 = new class327(50);

    @OriginalMember(owner = "client!af", name = "D", descriptor = "[I")
    public static int[] field5368 = new int[5];

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field5370 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "Lfh;")
    public static class140 field5369;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Lvk;")
    public static class188 field5355;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "[[[Lnh;")
    public static class119[][][] field5367;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lvh;", line = 4)
    public static final class219 method2392(int arg0, int arg1) {
        field5363++;
        if (arg1 != 0) {
            method2394((byte) -2);
        }
        class219 var2 = (class219) class182.field2482.method2265((long) arg0, (byte) -124);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class122.field1605.method1089(class236.method1677(114, arg0), (byte) 120, class119.method866(true, arg0));
        class219 var4 = new class219();
        var4.field3157 = arg0;
        if (var3 != null) {
            var4.method1590(-1, new class299(var3));
        }
        var4.method1602(125);
        if (!class211.field2983 && var4.field3124) {
            var4.field3122 = null;
        }
        if (var4.field3161) {
            var4.field3087 = 0;
            var4.field3115 = false;
        }
        class182.field2482.method2257(-126, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIBII)V", line = 47)
    public static final void method2393(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field5361++;
        if (arg4 != 84) {
            method2394((byte) -110);
        }
        if (class245.field3574 <= arg5 - arg0 && (arg0 + arg5) <= class321.field4722 && arg2 - arg0 >= class207.field2937 && class25.field292 >= (arg0 + arg2)) {
            class315.method2181(arg6, arg1, true, arg0, arg3, arg5, arg2);
        } else {
            class3.method11(arg0, arg6, arg5, arg1, arg4 - 85, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V", line = 68)
    public static final void method2394(byte arg0) {
        class44.field549 = 0;
        class217.field3067 = 1;
        class192.field2657 = false;
        if (arg0 != -120) {
            return;
        }
        class28.field322 = 0;
        class274.field3922 = 0;
        class275.field3937 = -1;
        field5359++;
        class49.field654 = -3;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 85)
    public static void method2395(int arg0) {
        if (arg0 != 5) {
            field5368 = (int[]) null;
        }
        field5360 = null;
        field5368 = null;
        field5365 = null;
        field5367 = (class119[][][]) null;
        field5355 = null;
        field5369 = null;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)[Lvn;", line = 106)
    public static final class11[] method2396(int arg0) {
        field5354++;
        class11[] var1 = new class11[class171.field2369];
        for (int var2 = 0; var2 < class171.field2369; var2++) {
            int var3 = class251.field3673[var2] * class184.field2508[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class338.field5276[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class292.field4253[class335.method2339(255, var5[var6])];
            }
            var1[var2] = new class11(class16.field201, class133.field1805, class348.field5418[var2], class119.field1578[var2], class251.field3673[var2], class184.field2508[var2], var4);
        }
        if (arg0 != 5325) {
            method2395(-127);
        }
        class236.method1685(false);
        return var1;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I[B)V", line = 152)
    public class345(int arg0, byte[] arg1) {
        this.field5364 = arg0;
        class299 var3 = new class299(arg1);
        this.field5356 = var3.method2096((byte) -122);
        this.field5353 = new int[this.field5356];
        this.field5358 = new int[this.field5356];
        this.field5362 = new boolean[this.field5356];
        this.field5366 = new int[this.field5356][];
        for (int var4 = 0; var4 < this.field5356; var4++) {
            this.field5353[var4] = var3.method2096((byte) -122);
        }
        for (int var5 = 0; var5 < this.field5356; var5++) {
            this.field5362[var5] = var3.method2096((byte) -122) == 1;
        }
        for (int var6 = 0; var6 < this.field5356; var6++) {
            this.field5358[var6] = var3.method2083((byte) -75);
        }
        for (int var7 = 0; var7 < this.field5356; var7++) {
            this.field5366[var7] = new int[var3.method2096((byte) -122)];
        }
        for (int var8 = 0; var8 < this.field5356; var8++) {
            for (int var9 = 0; var9 < this.field5366[var8].length; var9++) {
                this.field5366[var8][var9] = var3.method2096((byte) -122);
            }
        }
    }
}
