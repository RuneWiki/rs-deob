import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class112 extends class270 {

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "[I")
    public int[] field1297;

    @OriginalMember(owner = "client!ju", name = "x", descriptor = "[I")
    public int[] field1305;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "[Z")
    public boolean[] field1295;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "[[I")
    public int[][] field1299;

    @OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
    public static int field1306 = 0;

    @OriginalMember(owner = "client!ju", name = "A", descriptor = "[B")
    public static byte[] field1308 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ju", name = "v", descriptor = "Lpr;")
    public static class407 field1303 = new class407(66, -1);

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ju", name = "w", descriptor = "Lco;")
    public static class106 field1304;

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "Lq;")
    public static class389 field1307;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 23)
    public static final String method696(byte arg0, int arg1) {
        if (arg0 > -72) {
            method698(-39, -41, -30, -13, 60, -40);
        }
        field1294++;
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF39ED) >> 16) + "." + ((arg1 & 0xFF53) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V", line = 35)
    public static void method697(byte arg0) {
        field1308 = null;
        field1303 = null;
        if (arg0 < 107) {
            method698(17, 51, 59, -2, -115, 32);
        }
        field1304 = null;
        field1307 = null;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(I[B)V", line = 49)
    public class112(int arg0, byte[] arg1) {
        this.field1301 = arg0;
        class452 var3 = new class452(arg1);
        this.field1298 = var3.method2541(88);
        this.field1297 = new int[this.field1298];
        this.field1305 = new int[this.field1298];
        this.field1295 = new boolean[this.field1298];
        this.field1299 = new int[this.field1298][];
        for (int var4 = 0; var4 < this.field1298; var4++) {
            this.field1297[var4] = var3.method2541(68);
            if (this.field1297[var4] == 6) {
                this.field1297[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field1298; var5++) {
            this.field1295[var5] = var3.method2541(104) == 1;
        }
        for (int var6 = 0; var6 < this.field1298; var6++) {
            this.field1305[var6] = var3.method2574(-1758460248);
        }
        for (int var7 = 0; var7 < this.field1298; var7++) {
            this.field1299[var7] = new int[var3.method2541(104)];
        }
        for (int var8 = 0; var8 < this.field1298; var8++) {
            for (int var9 = 0; var9 < this.field1299[var8].length; var9++) {
                this.field1299[var8][var9] = var3.method2541(40);
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIII)V", line = 116)
    public static final void method698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -38 % ((arg3 + 18) / 38);
        field1302++;
        int var7 = class512.method2932((byte) -46, arg1, class501.field7217, class58.field602);
        int var8 = class512.method2932((byte) -46, arg0, class501.field7217, class58.field602);
        int var9 = class512.method2932((byte) -46, arg4, class163.field1942, class326.field4246);
        int var10 = class512.method2932((byte) -46, arg5, class163.field1942, class326.field4246);
        for (int var11 = var7; var11 <= var8; var11++) {
            class445.method2463(var9, 119, var10, arg2, class156.field1755[var11]);
        }
    }
}
