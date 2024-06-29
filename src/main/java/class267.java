import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class267 {

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    private int field3441 = -1;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    private int field3447 = 0;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lbb;")
    private class270 field3437 = new class270();

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Z")
    public boolean field3451 = false;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    private int field3445;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[Lwk;")
    private class282[] field3440;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "[[[I")
    private int[][][] field3448;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "Lih;")
    public static class108 field3452 = new class108(64);

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field3453 = 0;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "Luo;")
    public static class118 field3454;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Lgd;")
    public static class172 field3446;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "Lwo;")
    public static class285 field3455;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[[I", line = 5)
    public final int[][] method1667(int arg0, int arg1) {
        field3442++;
        if (arg1 >= -60) {
            return null;
        } else if (this.field3445 == this.field3434) {
            this.field3451 = this.field3440[arg0] == null;
            this.field3440[arg0] = class334.field4565;
            return this.field3448[arg0];
        } else if (this.field3434 == 1) {
            this.field3451 = this.field3441 != arg0;
            this.field3441 = arg0;
            return this.field3448[0];
        } else {
            class282 var3 = this.field3440[arg0];
            if (var3 == null) {
                this.field3451 = true;
                if (this.field3434 > this.field3447) {
                    var3 = new class282(arg0, this.field3447);
                    this.field3447++;
                } else {
                    class282 var4 = (class282) this.field3437.method1700((byte) 48);
                    var3 = new class282(arg0, var4.field3680);
                    this.field3440[var4.field3677] = null;
                    var4.method263(false);
                }
                this.field3440[arg0] = var3;
            } else {
                this.field3451 = false;
            }
            this.field3437.method1691(-8567, var3);
            return this.field3448[var3.field3680];
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)Lpm;", line = 75)
    public static final class91 method1668(int arg0, byte arg1) {
        int var2 = -58 % ((-arg1 - 18) / 57);
        field3439++;
        class365 var3 = class321.field4308;
        class91 var4;
        synchronized (class321.field4308) {
            var4 = (class91) class321.field4308.method2295((long) arg0, (byte) 74);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = class349.field4757.method1794(5860, 16, arg0);
        class91 var6 = new class91();
        if (var5 != null) {
            var6.method573(new class242(var5), (byte) 0);
        }
        class365 var7 = class321.field4308;
        synchronized (class321.field4308) {
            class321.field4308.method2294(var6, (byte) 77, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)[[[I", line = 103)
    public final int[][][] method1669(int arg0) {
        field3443++;
        if (this.field3445 != this.field3434) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = -7 % ((-arg0 - 48) / 55);
        while (this.field3434 > var2) {
            this.field3440[var2] = class334.field4565;
            var2++;
        }
        return this.field3448;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 124)
    public final void method1670(byte arg0) {
        field3438++;
        for (int var2 = 0; var2 < this.field3434; var2++) {
            this.field3448[var2][0] = null;
            this.field3448[var2][1] = null;
            this.field3448[var2][2] = null;
            this.field3448[var2] = null;
        }
        this.field3448 = null;
        this.field3440 = null;
        if (arg0 <= 61) {
            method1671(-28, -89, 88, 4, 67, 64, -53, -50, -14, -59, 5, -64, 55);
        }
        this.field3437.method1701(true);
        this.field3437 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 155)
    public static final void method1671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field3449++;
        class362 var13 = new class362();
        var13.field4908 = arg7;
        var13.field4900 = arg5;
        var13.field4909 = arg4;
        var13.field4897 = arg10;
        var13.field4904 = arg8;
        var13.field4913 = arg0;
        var13.field4911 = arg9;
        if (arg2 != 0) {
            method1672((byte) 75);
        }
        var13.field4898 = arg11;
        var13.field4912 = arg6;
        var13.field4910 = arg3;
        var13.field4899 = arg1;
        var13.field4915 = arg12;
        class244.field3241.method1696(false, var13);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V", line = 180)
    public static void method1672(byte arg0) {
        if (arg0 != -97) {
            method1675(124);
        }
        field3452 = null;
        field3454 = null;
        field3455 = null;
        field3446 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V", line = 195)
    public static final void method1673(int arg0, boolean arg1) {
        field3450++;
        if (class139.field1590 == 0) {
            class284.field3716.method1417(arg0, (byte) -26);
        } else {
            class97.field1144 = arg0;
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V", line = 214)
    public static final void method1674(int arg0, int arg1) {
        field3435++;
        if (arg1 == 7313) {
            class12 var2 = class390.method2422(341555040, arg0, 4);
            var2.method65(arg1 ^ 0xFFFFE30C);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 230)
    public static final void method1675(int arg0) {
        class368.field5021 = class236.field3101.field4708 - (-class236.field3101.field4706 - 2);
        class190.field2230 = class213.field2611.field4708 + class213.field2611.field4706 + 2;
        field3444++;
        class431.field5878 = new String[500];
        for (int var1 = 0; var1 < class431.field5878.length; var1++) {
            class431.field5878[var1] = "";
        }
        if (arg0 != -5824) {
            field3454 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(III)V", line = 298)
    public class267(int arg0, int arg1, int arg2) {
        this.field3434 = arg0;
        this.field3445 = arg1;
        this.field3440 = new class282[this.field3445];
        this.field3448 = new int[this.field3434][3][arg2];
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BZ)V", line = 259)
    public static final void method1676(byte arg0, boolean arg1) {
        field3436++;
        int var2 = -12 / ((47 - arg0) / 32);
        if (class252.field3303 != arg1) {
            class252.field3303 = arg1;
            class428.method2611((byte) -102);
        }
    }
}
