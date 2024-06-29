import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class356 {

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "Loaa;")
    private class556 field5134;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public int field5135;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "Laf;")
    public static class39 field5132 = new class39(5);

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "Z")
    public static boolean field5140 = false;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "Lae;")
    public static class283 field5136;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "[Lvs;")
    public static class532[] field5133;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "[[I")
    public static int[][] field5138;

    @OriginalMember(owner = "client!eca", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() throws Throwable {
        this.field5134.method3270(this.field5135, (byte) 46);
        field5137++;
        super.finalize();
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Loaa;II)V", line = 23)
    public class356(class556 arg0, int arg1, int arg2) {
        this.field5134 = arg0;
        this.field5135 = arg2;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V", line = 39)
    public static void method2234(int arg0) {
        field5138 = null;
        field5133 = null;
        field5136 = null;
        if (arg0 == 8) {
            field5132 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "([[BLtf;B)V", line = 56)
    public static final void method2235(byte[][] arg0, class245 arg1, byte arg2) {
        field5139++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field10098; var4++) {
            class482.method2865(23105);
            for (int var9 = 0; var9 < class741.field10208 >> 3; var9++) {
                for (int var10 = 0; var10 < (class525.field7224 >> 3); var10++) {
                    int var11 = class465.field6476[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = var11 >> 24 & 0x3;
                        if (!arg1.field10088 || var12 == 0) {
                            int var13 = (var11 & 0x7) >> 1;
                            int var14 = var11 >> 14 & 0x3FF;
                            int var15 = var11 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class611.field8607.length; var17++) {
                                if (class611.field8607[var17] == var16 && arg0[var17] != null) {
                                    class511 var18 = new class511(arg0[var17]);
                                    arg1.method4058(var9 * 8, var12, var4, 7, var15, client.field1305, var10 * 8, var13, var14, var18);
                                    arg1.method1636(class111.field1332, var18, var9 * 8, var15, var3[0] == -1 ? var3 : null, var12, var14, var10 * 8, false, var4, var13);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 <= 34) {
            method2234(0);
        }
        for (int var5 = 0; var5 < arg1.field10098; var5++) {
            class482.method2865(23105);
            for (int var6 = 0; var6 < (class741.field10208 >> 3); var6++) {
                for (int var7 = 0; var7 < (class525.field7224 >> 3); var7++) {
                    int var8 = class465.field6476[var5][var6][var7];
                    if (var8 == -1) {
                        arg1.method4061((byte) 98, var6 * 8, 8, var7 * 8, 8, var5);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class516.field7081 = class72.field790.method670(29, var3[0], var3[3], var3[2], var3[1], class651.field9101);
            class759.field10435 = var3[4];
        }
    }
}
