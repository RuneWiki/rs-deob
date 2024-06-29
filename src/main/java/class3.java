import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class106 {

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Z")
    public static boolean field73 = false;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field75 = -1;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(JIII)Z")
    public static final boolean method27(long arg0, int arg1, int arg2, int arg3) {
        int var5 = (int) arg0 >> 20 & 0x3;
        int var6 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        int var7 = (int) arg0 >> 14 & arg1;
        field71++;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class93 var8 = class5.method32((byte) 50, var6);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var9 = var8.field1697;
                var10 = var8.field1715;
            } else {
                var9 = var8.field1715;
                var10 = var8.field1697;
            }
            int var11 = var8.field1688;
            if (var5 != 0) {
                var11 = (var11 >> 4 - var5) + (var11 << var5 & 0xF);
            }
            class225.method1414(-110, 0, var9, arg2, true, var10, var11, 2, arg3, class228.field3975.field4031[0], 0, class228.field3975.field3978[0]);
        } else {
            class225.method1414(122, var7 + 1, 0, arg2, true, 0, 0, 2, arg3, class228.field3975.field4031[0], var5, class228.field3975.field3978[0]);
        }
        class109.field1938 = class2.field61;
        class28.field600 = 2;
        class211.field3692 = 0;
        class33.field668 = class209.field3677;
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V")
    public class3(int arg0, int arg1) {
        this.field72 = arg1;
        this.field76 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method28(Random arg0, int arg1, int arg2) {
        field74++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (arg1 < 76) {
            field73 = true;
        }
        if (class128.method777(arg2, (byte) 47)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        }
        int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
        int var4;
        do {
            var4 = arg0.nextInt();
        } while (var3 <= var4);
        return class154.method1012(var4, arg2, true);
    }
}
