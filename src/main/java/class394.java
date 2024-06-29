import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class394 extends class504 {

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field5200;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Lap;")
    private class404 field5196;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lnda;")
    private class476 field5195;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Lvj;")
    public static class373 field5206 = new class373(76, 0);

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Lpt;")
    public static class451 field5207 = new class451(32);

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "Lvj;")
    public static class373 field5208 = new class373(61, 0);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II[BI)V", line = 6)
    public final void method2264(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        this.field5195.method2777(arg0, arg3, (byte) -125, arg2);
        field5204++;
        if (arg1 != 0) {
            field5206 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 18)
    public static void method2265(int arg0) {
        field5206 = null;
        field5207 = null;
        if (arg0 != -14416) {
            field5206 = null;
        }
        field5208 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 33)
    public final void method2266(byte arg0) {
        try {
            this.field5200.close();
        } catch (IOException var3) {
        }
        field5202++;
        this.field5196.method2307(0);
        this.field5195.method2781(-127);
        int var2 = -115 % ((62 - arg0) / 40);
    }

    @OriginalMember(owner = "client!wi", name = "finalize", descriptor = "()V", line = 51)
    protected final void finalize() {
        this.method2266((byte) 106);
        field5205++;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 58)
    public class394(Socket arg0, int arg1) throws IOException {
        this.field5200 = arg0;
        this.field5200.setSoTimeout(30000);
        this.field5200.setTcpNoDelay(true);
        this.field5196 = new class404(this.field5200.getInputStream(), arg1);
        this.field5195 = new class476(this.field5200.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIBI)V", line = 70)
    public static final void method2267(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var9 = arg0 + 1;
        class62.method363(arg5, -127, arg3, class328.field4287[arg0], arg1);
        field5201++;
        int var10 = arg2 - 1;
        class62.method363(arg5, -128, arg3, class328.field4287[arg2], arg1);
        for (int var6 = var9; var6 <= var10; var6++) {
            int[] var8 = class328.field4287[var6];
            var8[arg1] = var8[arg5] = arg3;
        }
        int var7 = -28 % ((arg4 + 57) / 40);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)Z", line = 92)
    public final boolean method2268(byte arg0, int arg1) throws IOException {
        if (arg0 != -95) {
            this.field5196 = null;
        }
        field5199++;
        return this.field5196.method2306(arg1, true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILqa;III)V", line = 103)
    public static final void method2269(int arg0, int arg1, class206 arg2, int arg3, int arg4, int arg5) {
        arg2.method1107(arg4, arg5, arg3 + arg4, arg0 + arg5);
        field5197++;
        arg2.method1118(-16777216, (byte) 49, arg3, arg4, arg5, arg0);
        if (class138.field1682 < 100) {
            return;
        }
        float var6 = (float) class353.field4615 / (float) class353.field4623;
        int var7 = arg3;
        int var8 = arg0;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg0 - var8) / 2 + arg5;
        int var10 = (arg3 - var7) / 2 + arg4;
        if (class536.field7516 == null || class536.field7516.method291() != arg3 || arg0 != class536.field7516.method290()) {
            class353.method1962(class353.field4621, class353.field4615 + class353.field4607, class353.field4623 + class353.field4621, class353.field4607, var10, var9, var7 + var10, var8 + var9);
            class353.method1966(arg2);
            class536.field7516 = arg2.method1161(var10, var9, var7, var8, false);
        }
        class536.field7516.method299(var10, var9);
        int var11 = class259.field3349 * var7 / class353.field4623;
        int var12 = class206.field2482 * var8 / class353.field4615;
        int var13 = var10 + (class511.field7234 * var7 / class353.field4623);
        int var14 = var9 + var8 - var12 - (class129.field1585 * var8 / class353.field4615);
        int var15 = -1996554240;
        if (class341.field4399 == class320.field4082) {
            var15 = -1996488705;
        }
        arg2.method1133(var13, var14, var11, var12, var15, arg1);
        arg2.method1142(var13, var14, var11, var12, var15, 0);
        if (class289.field3752 <= 0) {
            return;
        }
        int var16;
        if (class382.field5054 > 50) {
            var16 = (100 - class382.field5054) * 5;
        } else {
            var16 = class382.field5054 * 5;
        }
        for (class258 var17 = (class258) class353.field4597.method1050((byte) 73); var17 != null; var17 = (class258) class353.field4597.method1047(-7962)) {
            class107 var18 = class353.field4587.method3245((byte) -119, var17.field3313);
            if (class604.method3472(false, var18)) {
                if (class314.field4009 == var17.field3313) {
                    int var21 = var17.field3320 * var7 / class353.field4623 + var10;
                    int var22 = (class353.field4615 - var17.field3317) * var8 / class353.field4615 + var9;
                    arg2.method1118(var16 << 24 | 0xFFFF00, (byte) 48, 4, var21 - 2, var22 + -2, 4);
                } else if (class45.field389 != -1 && class45.field389 == var18.field1333) {
                    int var19 = var17.field3320 * var7 / class353.field4623 + var10;
                    int var20 = (class353.field4615 - var17.field3317) * var8 / class353.field4615 + var9;
                    arg2.method1118(var16 << 24 | 0xFFFF00, (byte) 112, 4, var19 - 2, var20 + -2, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([BIIZ)I", line = 200)
    public final int method2270(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        if (arg3) {
            return -93;
        } else {
            field5194++;
            return this.field5196.method2303(arg0, (byte) -36, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V", line = 216)
    public final void method2271(byte arg0) {
        this.field5196.method2309(arg0 + 133);
        if (arg0 == -40) {
            field5203++;
            this.field5195.method2779((byte) -88);
        }
    }
}
