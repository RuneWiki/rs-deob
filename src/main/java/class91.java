import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class91 extends class27 {

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    private int field1260 = 4096;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field1263 = 1;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "[I")
    public static int[] field1262 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!b", name = "P", descriptor = "Z")
    public static boolean field1265 = false;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 5)
    public static void method717(boolean arg0) {
        if (arg0) {
            method718(11, -97);
        }
        field1262 = null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 14)
    public class91() {
        super(1, true);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)I", line = 23)
    public static final int method718(int arg0, int arg1) {
        field1266++;
        if (arg0 >= -14) {
            method719(true, 21, (byte[]) null, -18);
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)[I", line = 40)
    public final int[] method18(int arg0, byte arg1) {
        if (arg1 != -62) {
            return (int[]) null;
        }
        int[] var3 = this.field375.method2087(-107, arg0);
        if (this.field375.field4382) {
            int[] var4 = this.method164(class214.field3080 & arg0 - 1, 22, 0);
            int[] var5 = this.method164(arg0, 119, 0);
            int[] var6 = this.method164(arg0 + 1 & class214.field3080, 18, 0);
            for (int var7 = 0; var7 < class209.field3053; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field1260;
                int var9 = (var5[class150.field2180 & var7 + 1] - var5[class150.field2180 & var7 - 1]) * this.field1260;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + var12 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        field1264++;
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI[BI)Ljava/lang/String;", line = 106)
    public static final String method719(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field1267++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = 0;
        if (arg0) {
            field1262 = (int[]) null;
        }
        while (var6 < arg1) {
            int var7 = arg2[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class98.field1382[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
            var6++;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILsb;I)V", line = 153)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 == -5836) {
            if (arg2 == 0) {
                this.field1260 = arg1.method1317((byte) 58);
            }
            field1268++;
        }
    }
}
