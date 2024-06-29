import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class163 extends class285 {

    @OriginalMember(owner = "client!sq", name = "gb", descriptor = "[I")
    public int[] field1937 = new int[2200];

    @OriginalMember(owner = "client!sq", name = "fb", descriptor = "[[I")
    public int[][] field1936 = new int[32][512];

    @OriginalMember(owner = "client!sq", name = "db", descriptor = "[[I")
    public int[][] field1934 = new int[2200][64];

    @OriginalMember(owner = "client!sq", name = "nb", descriptor = "[I")
    public int[] field1944 = new int[12];

    @OriginalMember(owner = "client!sq", name = "mb", descriptor = "[I")
    public int[] field1943 = new int[class158.field1805];

    @OriginalMember(owner = "client!sq", name = "pb", descriptor = "[[I")
    public int[][] field1946 = new int[12][class158.field1840 - -8191];

    @OriginalMember(owner = "client!sq", name = "qb", descriptor = "[I")
    public int[] field1947 = new int[class158.field1840 + 8191];

    @OriginalMember(owner = "client!sq", name = "ob", descriptor = "[I")
    public int[] field1945 = new int[class158.field1840 - -8191];

    @OriginalMember(owner = "client!sq", name = "hb", descriptor = "[I")
    public int[] field1938 = new int[12];

    @OriginalMember(owner = "client!sq", name = "rb", descriptor = "[I")
    public int[] field1948 = new int[32];

    @OriginalMember(owner = "client!sq", name = "kb", descriptor = "Lqaa;")
    public class26 field1941;

    @OriginalMember(owner = "client!sq", name = "ib", descriptor = "[I")
    public static int[] field1939 = new int[120];

    @OriginalMember(owner = "client!sq", name = "lb", descriptor = "I")
    public static int field1942 = 100;

    @OriginalMember(owner = "client!sq", name = "jb", descriptor = "Z")
    public static boolean field1940 = true;

    @OriginalMember(owner = "client!sq", name = "cb", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!sq", name = "eb", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!sq", name = "sb", descriptor = "I")
    public static int field1949;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (300.0D * Math.pow(2.0D, (double) var2 / 7.0D) + (double) var2);
            var0 += var3;
            field1939[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Luq;)V", line = 4)
    public class163(class148 arg0) {
        super(arg0);
        this.field1941 = new class26(arg0);
        super.field3647 = new class262(super.field3612);
        super.field3650 = new class262(super.field3612);
        super.field3629 = new class262(super.field3612);
        super.field3648 = new class262(super.field3612);
        super.field3628 = new class262(super.field3612);
        super.field3616 = new class262(super.field3612);
        super.field3646 = new class262(super.field3612);
        super.field3632 = new class262(super.field3612);
        super.field3615 = new class262(super.field3612);
        super.field3630 = new class262(super.field3612);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 25)
    public final void method989(byte arg0) {
        this.field1941 = new class26(super.field3612);
        ++field1933;
        if (arg0 >= -79) {
            field1939 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Liaa;ZI)Ljava/lang/String;", line = 45)
    public static final String method990(class452 arg0, boolean arg1, int arg2) {
        ++field1935;
        try {
            int var3 = arg0.method2548(-29696);
            if (var3 > arg2) {
                var3 = arg2;
            }
            if (arg1) {
                method992((class452) null, (byte) 8);
            }
            byte[] var4 = new byte[var3];
            arg0.field6215 += class272.field3444.method1946(-29856, arg0.field6209, arg0.field6215, 0, var3, var4);
            return class37.method200(var3, 0, 0, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V", line = 99)
    public static void method991(int arg0) {
        field1939 = null;
        int var1 = -63 / ((arg0 - -62) / 36);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Liaa;B)Lmn;", line = 112)
    public static final class333 method992(class452 arg0, byte arg1) {
        if (arg1 > -19) {
            return null;
        } else {
            ++field1949;
            return new class333(arg0.method2549((byte) 32), arg0.method2549((byte) 32), arg0.method2549((byte) 32), arg0.method2549((byte) 32), arg0.method2524(3), arg0.method2524(3), arg0.method2541(79));
        }
    }
}
