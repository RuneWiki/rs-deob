import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class44 extends class61 {

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "[S")
    public static short[] field778 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "Leb;")
    public static class230 field782 = class68.method589(0, "::clientdrop");

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "Leb;")
    public static class230 field781 = class68.method589(0, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field787 = 1;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field779 = 0;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "J")
    public static long field791 = 0L;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "Leb;")
    public static class230 field792 = null;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "[I")
    public int[] field777;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "[I")
    public int[] field783;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "[I")
    public static int[] field785;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "[I")
    public int[] field790;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "[Lug;")
    public class193[] field780;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "[Lug;")
    public class193[] field784;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "[[[B")
    public byte[][][] field786;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lmj;)V")
    public static final void method379(class111 arg0) {
        for (int var1 = arg0.field1988; var1 <= arg0.field1989; var1++) {
            for (int var2 = arg0.field1994; var2 <= arg0.field2002; var2++) {
                class233 var3 = class53.field916[arg0.field1998][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4058; var4++) {
                        if (var3.field4050[var4] == arg0) {
                            var3.field4058--;
                            for (int var5 = var4; var5 < var3.field4058; var5++) {
                                var3.field4050[var5] = var3.field4050[var5 + 1];
                                var3.field4064[var5] = var3.field4064[var5 + 1];
                            }
                            var3.field4050[var3.field4058] = null;
                            break;
                        }
                    }
                    var3.field4062 = 0;
                    for (int var6 = 0; var6 < var3.field4058; var6++) {
                        var3.field4062 |= var3.field4064[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)J")
    public static final long method380(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        return var3 == null || var3.field4065 == null ? 0L : var3.field4065.field4720;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)V")
    public static void method381(byte arg0) {
        if (arg0 < 76) {
            field779 = -44;
        }
        field785 = null;
        field782 = null;
        field792 = null;
        field778 = null;
        field781 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BIII)I")
    public static final int method382(byte arg0, int arg1, int arg2, int arg3) {
        field776++;
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        if (arg0 != 91) {
            field778 = null;
        }
        return (arg2 >> 1) + ((arg1 >> 2 << 10) + (arg3 >> 5 << 7));
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(II)Z")
    public static final boolean method383(int arg0, int arg1) {
        if (arg1 > -40) {
            return true;
        } else {
            field788++;
            return ((arg0 & 0x7DFBC155) >> 30) != 0;
        }
    }
}
