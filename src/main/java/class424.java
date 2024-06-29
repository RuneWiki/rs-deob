import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class424 {

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public int field6206 = 0;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "[Z")
    public boolean[] field6221 = new boolean[16];

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[B")
    public byte[] field6209 = new byte[18002];

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "[[I")
    public int[][] field6222 = new int[6][258];

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "[[I")
    public int[][] field6225 = new int[6][258];

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "[Z")
    public boolean[] field6227 = new boolean[256];

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "[I")
    public int[] field6210 = new int[16];

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public int field6212 = 0;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "[[I")
    public int[][] field6223 = new int[6][258];

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[[B")
    public byte[][] field6214 = new byte[6][258];

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "[I")
    public int[] field6231 = new int[256];

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "[I")
    public int[] field6237 = new int[6];

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "[B")
    public byte[] field6211 = new byte[256];

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "[B")
    public byte[] field6236 = new byte[4096];

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "[I")
    public int[] field6239 = new int[257];

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "[B")
    public byte[] field6240 = new byte[18002];

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field6204 = 0;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Lwj;")
    public static class270 field6218 = new class270(1, -2);

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "B")
    public byte field6216;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public int field6205;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public int field6215;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public int field6217;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public int field6219;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public int field6220;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public int field6229;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public int field6230;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public int field6232;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public int field6233;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public int field6234;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public int field6235;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "Lmu;")
    public static class196 field6242;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "Z")
    public static boolean field6226;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "[B")
    public byte[] field6203;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "[B")
    public byte[] field6238;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method2518(int arg0) {
        field6218 = null;
        field6242 = null;
        if (arg0 != 63) {
            field6218 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
    public static final void method2519(int arg0, String arg1, int arg2, int arg3, String arg4, int arg5, String arg6, String arg7) {
        int var8 = -114 / ((arg5 + 62) / 39);
        field6213++;
        for (int var9 = 99; var9 > 0; var9--) {
            class340.field4903[var9] = class340.field4903[var9 - 1];
            class30.field402[var9] = class30.field402[var9 - 1];
            class20.field267[var9] = class20.field267[var9 - 1];
            class147.field2127[var9] = class147.field2127[var9 - 1];
            class453.field6663[var9] = class453.field6663[var9 - 1];
            class128.field1897[var9] = class128.field1897[var9 - 1];
            class140.field1987[var9] = class140.field1987[var9 - 1];
        }
        class340.field4903[0] = arg2;
        class30.field402[0] = arg3;
        class20.field267[0] = arg4;
        class147.field2127[0] = arg1;
        class453.field6663[0] = arg7;
        class128.field1897[0] = arg6;
        class211.field2946 = class483.field7062;
        class199.field2822++;
        class140.field1987[0] = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static final void method2520(byte arg0) {
        if (arg0 != 125) {
            method2520((byte) 70);
        }
        field6207++;
        int var1 = class318.field4372.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class318.field4372[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class170.field2531; var4++) {
                    if (class523.field7741[var4] == class310.field4218[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class523.field7741[class170.field2531] = class310.field4218[var2];
                    var3 = class170.field2531++;
                }
                class391 var5 = new class391(class318.field4372[var2]);
                int var6 = 0;
                while (var5.field5719 < class318.field4372[var2].length && var6 < 511 && class275.field3772 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2353((byte) 93);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class310.field4218[var2] >> 8) * 64 + var10 - class510.field7566;
                    int var13 = (class310.field4218[var2] & 0xFF) * 64 + var11 - class14.field204;
                    class79 var14 = class158.field2401.method2208(var5.method2353((byte) 94), -94);
                    if (class378.field5533[var7] == null && (var14.field1205 & 0x1) > 0 && class124.field1854 == var9 && var12 >= 0 && class527.field7799 > (var14.field1168 + var12) && var13 >= 0 && var14.field1168 + var13 < class422.field6182) {
                        class378.field5533[var7] = new class502();
                        class378.field5533[var7].field1035 = var7;
                        class502 var15 = class378.field5533[var7];
                        class65.field899[class275.field3772++] = var7;
                        var15.field1027 = class441.field6516;
                        var15.method2939(119, var14);
                        var15.method620(arg0 - 113, var15.field7387.field1168);
                        var15.field1036 = var15.field7387.field1194 << 3;
                        if (var15.field1036 == 0) {
                            var15.method612((byte) 46, 0);
                        } else {
                            var15.method612((byte) -105, var15.field7387.field1162 + 4 << 11 & 0x3ED0);
                        }
                        var15.method2946(var12, var13, true, var9, var15.method626((byte) 120), -123);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V")
    public static final void method2521(int arg0, int arg1, int arg2) {
        class486 var3 = class89.field1305[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7103 != null) {
            var3.field7103 = null;
        }
        if (var3.field7105 != null) {
            var3.field7105 = null;
        }
    }
}
