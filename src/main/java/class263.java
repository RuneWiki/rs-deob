import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class263 extends class29 {

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field3898 = 0;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field3899 = 0;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "Z")
    public static boolean field3896;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "[I")
    public static int[] field3897;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Luk;IIIII)V", line = 3)
    public static final void method1816(class155 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2081 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class455.field6730[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class157 var13 = class120.field1613[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field2081; var14++) {
                            if (arg0.field2083[var14] == var13) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field2083[arg0.field2081++] = var13;
                        if (arg0.field2081 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field2081; var15 < 4; var15++) {
            arg0.field2083[var15] = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V", line = 84)
    public static void method1817(int arg0) {
        if (arg0 != 1) {
            field3899 = 45;
        }
        field3897 = null;
    }
}
