import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class424 extends class85 {

    @OriginalMember(owner = "client!iu", name = "A", descriptor = "I")
    private int field5832;

    @OriginalMember(owner = "client!iu", name = "C", descriptor = "Loi;")
    public static class169 field5834 = new class169("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
    public static int field5838 = -50;

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!iu", name = "B", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!iu", name = "G", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!iu", name = "y", descriptor = "[Ldc;")
    public class15[] field5830;

    @OriginalMember(owner = "client!iu", name = "F", descriptor = "[[B")
    private byte[][] field5836;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILgk;IIII)Lcw;", line = 4)
    public static final class386 method2509(int arg0, class463 arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 64 % ((arg0 + 26) / 56);
        field5835++;
        if (!arg1.field6817 && (!class158.method1064(arg4, (byte) -19) || !class158.method1064(arg5, (byte) -11))) {
            return arg1.field6833 ? new class386(arg1, 34037, arg2, arg3, arg4, arg5, true) : new class386(arg1, arg2, arg3, arg4, arg5, class124.method788(arg4, -116), class124.method788(arg5, -123), true);
        } else {
            return new class386(arg1, 3553, arg2, arg3, arg4, arg5, true);
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)Z", line = 22)
    public final boolean method2510(int arg0, int arg1) {
        field5833++;
        return arg0 == -1488416952 ? this.field5830[arg1].field256 : false;
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(II)Z", line = 34)
    public final boolean method2511(int arg0, int arg1) {
        field5831++;
        if (arg0 != 255) {
            field5838 = -79;
        }
        return this.field5830[arg1].field253;
    }

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "(B)V", line = 47)
    public static void method2512(byte arg0) {
        field5834 = null;
        if (arg0 != -77) {
            field5838 = -4;
        }
    }

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "(II)Z", line = 59)
    public final boolean method2513(int arg0, int arg1) {
        field5837++;
        if (arg1 != 3553) {
            this.field5836 = null;
        }
        return this.field5830[arg0].field247;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)Z", line = 75)
    public final boolean method2514(int arg0) {
        field5839++;
        if (this.field5830 != null) {
            return true;
        }
        if (this.field5836 == null) {
            if (!class37.field572.method1308(this.field5832, (byte) -25)) {
                return false;
            }
            int[] var2 = class37.field572.method1292(-72, this.field5832);
            this.field5836 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field5836[var3] = class37.field572.method1313((byte) -101, this.field5832, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field5836.length; var5++) {
            byte[] var14 = this.field5836[var5];
            int var15 = (var14[0] & 0xFF) << 8 | var14[1] & 0xFF;
            var4 &= class199.field2559.method1294(var15, (byte) -122);
        }
        if (!var4) {
            return false;
        }
        class7 var6 = new class7();
        int var7 = class37.field572.method1302(arg0 + 20608, this.field5832);
        if (arg0 != -20724) {
            this.method2510(-1, 61);
        }
        this.field5830 = new class15[var7];
        int[] var8 = class37.field572.method1292(arg0 ^ 0x50A3, this.field5832);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field5836[var9];
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            class509 var12 = null;
            for (class509 var13 = (class509) var6.method49(-4); var13 != null; var13 = (class509) var6.method46((byte) 127)) {
                if (var13.field7471 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class509(var11, class199.field2559.method1320(var11, arg0 + 20725));
                var6.method42(var12, arg0 + 20724);
            }
            this.field5830[var8[var9]] = new class15(var10, var12);
        }
        this.field5836 = null;
        return true;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(I)V", line = 171)
    public class424(int arg0) {
        this.field5832 = arg0;
    }
}
