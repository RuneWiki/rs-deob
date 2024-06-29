import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class675 {

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    private int field9485;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "B")
    public byte field9492;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public int field9472;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public int field9482;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public int field9495;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "[I")
    public static int[] field9477 = new int[4];

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field9486 = -1;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field9478 = new String[8];

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public int field9473;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public int field9479;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field9480;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public int field9481;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public int field9483;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public int field9484;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public int field9488;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public int field9489;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public int field9490;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public int field9494;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lgw;")
    public static class169 field9475;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Lgi;")
    public class675 field9476;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)Lgi;", line = 5)
    public final class675 method3814(int arg0, int arg1, int arg2, int arg3) {
        field9474++;
        return arg2 > -27 ? null : new class675(this.field9485, arg3, arg0, arg1, this.field9492);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 16)
    public static void method3815(byte arg0) {
        if (arg0 > -104) {
            method3817(33, 104, 13, 6);
        }
        field9477 = null;
        field9478 = null;
        field9475 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([BBIIII)V", line = 32)
    public static final void method3816(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field9493++;
        if (arg2 <= arg4) {
            return;
        }
        int var6 = arg2 - arg4 >> 2;
        if (arg1 != -2) {
            method3815((byte) -54);
        }
        int var7 = arg4 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg2 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var7++] = 1;
                }
            }
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIII)Z", line = 69)
    public static final boolean method3817(int arg0, int arg1, int arg2, int arg3) {
        field9487++;
        if (!class186.field2665 || !class491.field6993) {
            return false;
        } else if (class671.field9405 < 100) {
            return false;
        } else {
            int var4 = class159.field2370[arg0][arg3][arg2];
            if (-class335.field4737 == var4) {
                return false;
            } else if (class335.field4737 == var4) {
                return true;
            } else if (class4.field56 == class138.field2153) {
                return false;
            } else {
                int var5 = arg3 << class440.field6142;
                int var6 = arg2 << class440.field6142;
                if (class50.method442(var6 + class546.field7701 - 1, class546.field7701 + var6 - arg1, class546.field7701 + var5 - 1, class138.field2153[arg0].method1825(arg2 - -1, -128, arg3), var6 + 1, class138.field2153[arg0].method1825(arg2 - -1, arg1 + -129, arg3 + 1), var5 + 1, var5 + 1, (byte) 101, class138.field2153[arg0].method1825(arg2, -128, arg3)) && class50.method442(var6 + 1, var6 - -class546.field7701 + -1, class546.field7701 + var5 - 1, class138.field2153[arg0].method1825(arg2 - -1, -128, arg3 + 1), var6 + 1, class138.field2153[arg0].method1825(arg2, -128, arg3 + 1), class546.field7701 + var5 - 1, var5 + 1, (byte) -102, class138.field2153[arg0].method1825(arg2, -128, arg3))) {
                    class115.field1836++;
                    class159.field2370[arg0][arg3][arg2] = class335.field4737;
                    return true;
                } else {
                    class159.field2370[arg0][arg3][arg2] = -class335.field4737;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)Lfe;", line = 121)
    public final class567 method3818(byte arg0) {
        if (arg0 >= -44) {
            field9478 = null;
        }
        field9491++;
        return class634.method3645(this.field9485, 121);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIIIB)V", line = 141)
    public class675(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field9485 = arg0;
        this.field9492 = arg4;
        this.field9472 = arg1;
        this.field9482 = arg2;
        this.field9495 = arg3;
    }
}
