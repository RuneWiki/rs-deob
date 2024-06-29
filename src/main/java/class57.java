import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class57 extends class3 {

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "[Lgj;")
    public class39[] field815;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field816 = 0;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "Lok;")
    public static class41 field820 = class137.method956("(U5", 45);

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "Lak;")
    public static class20 field821 = new class20(200);

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "Lok;")
    private static class41 field824 = class137.method956(" from your friend list first)3", 45);

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "Lok;")
    public static class41 field825 = field824;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "[[[I")
    public static int[][][] field819;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Z", line = 6)
    public final boolean method396(int arg0, int arg1) {
        field817++;
        if (arg1 >= -10) {
            field819 = (int[][][]) ((int[][][]) null);
        }
        return this.field815[arg0].field603;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([[II)V", line = 17)
    public static final void method397(int[][] arg0, int arg1) {
        field818++;
        if (arg1 <= 1) {
            method397((int[][]) ((int[][]) null), 65);
        }
        class239.field3829 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)V", line = 36)
    public static void method398(byte arg0) {
        field820 = null;
        field819 = (int[][][]) null;
        field825 = null;
        field821 = null;
        if (arg0 <= 123) {
            method398((byte) 88);
        }
        field824 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)V", line = 53)
    public static final void method399(int arg0, int arg1, int arg2, int arg3) {
        field822++;
        class46 var4 = class195.method1396(4, arg1, false);
        var4.method337(arg0 ^ arg0);
        var4.field721 = arg3;
        var4.field719 = arg2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIII)Z", line = 67)
    public static final boolean method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class153.field2441[arg0][var8][var9] == -class259.field4133) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class278.field4548[arg0][arg1][arg3] + arg5;
            if (!class125.method882(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class125.method882(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class125.method882(var10, var12, var14)) {
                return false;
            } else if (class125.method882(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class92.method651(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class125.method882(var6 + 1, class278.field4548[arg0][arg1][arg3] + arg5, var7 + 1) && class125.method882(var6 + 128 - 1, class278.field4548[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class125.method882(var6 + 128 - 1, class278.field4548[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class125.method882(var6 + 1, class278.field4548[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)V", line = 132)
    public static final void method401(byte arg0) {
        class169.field2676 = null;
        class107.field1517 = 0;
        field814++;
        if (arg0 < 36) {
            return;
        }
        class144.field2191 = (int[][][]) null;
        class281.field4571 = (int[][][]) null;
        class85.field1231 = (byte[][][]) null;
        class307.field5164 = (short[][][]) null;
        class244.field3891 = (byte[][][]) null;
        class67.field1009 = null;
        class226.field3618 = (byte[][][]) null;
        class277.field4539 = (byte[][][]) null;
        class64.field939 = (byte[][][]) null;
        class278.field4549 = null;
        class133.field1993.method1499(-3868);
        class256.field4110 = null;
        class217.field3482 = null;
        class268.field4273 = null;
        class46.field730 = null;
        class240.field3845 = null;
        class70.field1056 = null;
        class255.field4092 = null;
        class260.field4148 = null;
        class275.field4506 = null;
        class2.field28 = null;
        class23.field347 = null;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lmh;Lmh;IZ)V", line = 168)
    public class57(class65 arg0, class65 arg1, int arg2, boolean arg3) {
        class212 var5 = new class212();
        int var6 = arg0.method481(17377, arg2);
        this.field815 = new class39[var6];
        int[] var7 = arg0.method457(-62, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class9 var9 = null;
            byte[] var10 = arg0.method454(arg2, 0, var7[var8]);
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            for (class9 var12 = (class9) var5.method1495(-312); var12 != null; var12 = (class9) var5.method1501(97)) {
                if (var12.field120 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method470(0, var11, -1);
                } else {
                    var13 = arg1.method470(var11, 0, -1);
                }
                var9 = new class9(var11, var13);
                var5.method1503(var9, (byte) -65);
            }
            this.field815[var7[var8]] = new class39(var10, var9);
        }
    }
}
