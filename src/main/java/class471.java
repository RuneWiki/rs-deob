import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class471 extends class467 {

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public int field6889;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public int field6882;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "F")
    public float field6885;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    private int field6893;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    private int field6891;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public int field6890;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "Z")
    public static volatile boolean field6883 = true;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "[I")
    public static int[] field6876 = new int[25];

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "Lpg;")
    public static class492 field6896;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lrv;")
    public static class41 field6878;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
    public static int[] field6894;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "[[Ljb;")
    public static class499[][] field6886;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIJI)V")
    public static final void method2822(int arg0, int arg1, long arg2, int arg3) {
        field6877++;
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = ((int) arg2 & arg3) >> 20;
        int var7 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class126.method805(var5, var6, 0, true, 0, 0, arg1, true, arg0);
            return;
        }
        class130 var8 = class56.field755.method2031(arg3 ^ 0xFFC19DD8, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field1843;
            var9 = var8.field1898;
        } else {
            var9 = var8.field1843;
            var10 = var8.field1898;
        }
        int var11 = var8.field1840;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class126.method805(0, 0, var11, true, var9, var10, arg1, true, arg0);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(FI)V")
    public abstract void method423(float arg0, int arg1);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
    public static final void method2823(int arg0, int arg1, int arg2) {
        boolean var3 = class380.field5802[0][arg1][arg2] != null && class380.field5802[0][arg1][arg2].field6275 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class380.field5802[var4][arg1][arg2] == null) {
                class420 var5 = class380.field5802[var4][arg1][arg2] = new class420(var4, arg1, arg2);
                if (var3) {
                    var5.field6274++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
    public static final void method2824(int arg0, int arg1, int arg2) {
        field6892++;
        int var3 = class472.field6901.method45(class167.field2428.method2335((byte) -100, class288.field4292), (byte) -49);
        if (arg2 >= -103) {
            return;
        }
        for (class32 var4 = (class32) class96.field1395.method1970(64); var4 != null; var4 = (class32) class96.field1395.method1960(24)) {
            int var8 = class66.method441(var4, (byte) -117);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class12.field201 * 16 + 21;
        int var6 = arg1 - (var3 / 2);
        if (class7.field112 < (var3 + var6)) {
            var6 = class7.field112 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg0;
        if ((var5 + arg0) > class486.field7136) {
            var7 = class486.field7136 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class107.field1519 = var6;
        class439.field6536 = var7;
        class148.field2128 = class12.field201 * 16 + (class207.field2923 ? 26 : 22);
        class455.field6680 = true;
        class455.field6686 = var3;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)I")
    public final int method2825(int arg0) {
        field6875++;
        if (arg0 != 45) {
            field6894 = null;
        }
        return this.field6890;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)F")
    public final float method2826(int arg0) {
        if (arg0 != -1) {
            this.method2827(32);
        }
        field6880++;
        return this.field6885;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)I")
    public final int method2827(int arg0) {
        if (arg0 != 23087) {
            method2828(54, null, null);
        }
        field6888++;
        return this.field6882;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V")
    public static final void method2828(int arg0, Object[] arg1, int[] arg2) {
        field6887++;
        class386.method2385(arg1, 0, arg2, true, arg2.length - 1);
        if (arg0 < 95) {
            field6886 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
    public static void method2829(int arg0) {
        int var1 = -16 % ((-arg0 - 17) / 47);
        field6876 = null;
        field6886 = null;
        field6896 = null;
        field6894 = null;
        field6878 = null;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)I")
    public final int method2830(int arg0) {
        if (arg0 < 121) {
            field6896 = null;
        }
        field6881++;
        return this.field6893;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)V")
    public abstract void method428(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IF)F")
    public static final float method2831(int arg0, float arg1) {
        field6879++;
        return arg0 > -14 ? -0.45842236F : arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)I")
    public final int method2832(int arg0) {
        if (arg0 != 15) {
            this.field6889 = 108;
        }
        field6895++;
        return this.field6889;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)I")
    public final int method2833(boolean arg0) {
        if (arg0) {
            method2828(79, null, null);
        }
        field6884++;
        return this.field6891;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIF)V")
    public class471(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6889 = arg2;
        this.field6882 = arg0;
        this.field6885 = arg5;
        this.field6893 = arg3;
        this.field6891 = arg4;
        this.field6890 = arg1;
    }

    static {
        new class375("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field6896 = new class492(45, -2);
    }
}
