import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class703 extends class435 implements class414 {

    @OriginalMember(owner = "client!nt", name = "D", descriptor = "[B")
    public static byte[] field9950 = new byte[520];

    @OriginalMember(owner = "client!nt", name = "C", descriptor = "Leq;")
    public static class335 field9949 = new class335();

    @OriginalMember(owner = "client!nt", name = "G", descriptor = "I")
    public static int field9953 = -1;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "C")
    public char field9938;

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "F")
    public static float field9946;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    public int field9942;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
    public static int field9943;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
    public int field9944;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
    public static int field9945;

    @OriginalMember(owner = "client!nt", name = "A", descriptor = "I")
    public static int field9947;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "I")
    public int field9948;

    @OriginalMember(owner = "client!nt", name = "E", descriptor = "I")
    public static int field9951;

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
    public static int field9952;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "J")
    public long field9937;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "Lfa;")
    public static class615 field9939;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)I", line = 3)
    public final int method2468(int arg0) {
        int var2 = -5 % ((arg0 - 23) / 51);
        field9951++;
        return this.field9944;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V", line = 18)
    public static final void method3946(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9947++;
        int var5 = 0;
        if (arg1 != 520) {
            return;
        }
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class367.method2203(class512.field7620, class94.field1398, arg3 + arg4, true);
        int var10 = class367.method2203(class512.field7620, class94.field1398, arg4 - arg3, true);
        class223.method1484(class657.field9275[arg2], var9, -91, arg0, var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (var12 >= class198.field3084 && class627.field8931 >= var11) {
                    int var13 = class367.method2203(class512.field7620, class94.field1398, arg4 + var5, true);
                    int var14 = class367.method2203(class512.field7620, class94.field1398, arg4 - var5, true);
                    if (class627.field8931 >= var12) {
                        class223.method1484(class657.field9275[var12], var13, arg1 ^ 0xFFFFFD8B, arg0, var14);
                    }
                    if (class198.field3084 <= var11) {
                        class223.method1484(class657.field9275[var11], var13, -106, arg0, var14);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class198.field3084 && var15 <= class627.field8931) {
                int var17 = class367.method2203(class512.field7620, class94.field1398, arg4 + var6, true);
                int var18 = class367.method2203(class512.field7620, class94.field1398, arg4 - var6, true);
                if (var16 <= class627.field8931) {
                    class223.method1484(class657.field9275[var16], var17, -118, arg0, var18);
                }
                if (class198.field3084 <= var15) {
                    class223.method1484(class657.field9275[var15], var17, arg1 - 646, arg0, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)I", line = 93)
    public final int method2464(byte arg0) {
        field9940++;
        int var2 = 7 % ((arg0 + 66) / 54);
        return this.field9948;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V", line = 107)
    public static void method3947(boolean arg0) {
        field9939 = null;
        field9949 = null;
        if (!arg0) {
            method3946(11, 93, -94, -77, 104);
        }
        field9950 = null;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)J", line = 120)
    public final long method2466(int arg0) {
        field9943++;
        if (arg0 != 5435) {
            this.field9948 = 1;
        }
        return this.field9937;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)I", line = 131)
    public final int method2465(int arg0) {
        field9941++;
        return arg0 == -13747 ? this.field9942 : -111;
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)C", line = 142)
    public final char method2467(int arg0) {
        field9945++;
        return (char) (arg0 == 24968 ? this.field9938 : 65528);
    }
}
