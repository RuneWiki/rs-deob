import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class81 extends class3 {

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    private int field1193 = 0;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    private int field1188 = -1;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "Lok;")
    public static class41 field1191 = class137.method956("Speicher wird zugewiesen)3", 45);

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "Lok;")
    public static class41 field1195 = class137.method956("::wm0", 45);

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "Lak;")
    public static class20 field1190 = new class20(100);

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "[[[Lda;")
    public static class212[][][] field1199 = new class212[4][104][104];

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "Z")
    public static boolean field1200 = true;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "Lmh;")
    public static class65 field1201;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILag;)[Lel;", line = 21)
    public static final class83[] method576(int arg0, class211 arg1) {
        field1194++;
        if (!arg1.method1491(80)) {
            return new class83[0];
        }
        class182 var2 = arg1.method1475(7908);
        while (var2.field2948 == 0) {
            class300.method2068(119, 10L);
        }
        if (var2.field2948 == 2) {
            return new class83[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field2945);
        class83[] var4 = new class83[var3.length >> 2];
        if (arg0 < 91) {
            field1190 = (class20) null;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class83 var6 = new class83();
            var4[var5] = var6;
            var6.field1209 = var3[var5 << 2];
            var6.field1204 = var3[(var5 << 2) + 1];
            var6.field1207 = var3[(var5 << 2) + 2];
            var6.field1206 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V", line = 63)
    public final void method577(int arg0) {
        field1192++;
        int var2 = class51.method354((byte) 79);
        if ((var2 & 0x1) == 0) {
            class166.method1182(this.field1188);
        }
        if (arg0 != 15017) {
            return;
        }
        if ((var2 & 0x2) == 0) {
            class166.method1160(0);
        }
        if ((var2 & 0x4) == 0) {
            class166.method1177(0);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILmh;I)Lmg;", line = 88)
    public static final class314 method578(int arg0, class65 arg1, int arg2) {
        field1198++;
        if (class226.method1628(arg2, (byte) -62, arg1)) {
            return arg0 == 4 ? class285.method2003(0) : (class314) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BIIIIZ)V", line = 103)
    public static final void method579(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1196++;
        class112.field1646++;
        if (!arg5) {
            class104.method722(true, 2);
            class273.method1929(false, true);
            class104.method722(false, 2);
        }
        class273.method1929(false, false);
        if (!arg5) {
            class30.method191((byte) -101);
        }
        class27.method180((byte) -125);
        if (class166.field2625) {
            class152.method1056(arg2, true, arg4, (byte) -86, arg1, arg3);
            arg1 = class107.field1516;
            arg2 = class206.field3339;
            arg3 = class139.field2142;
            arg4 = class22.field344;
        }
        if (class28.field416 == 1) {
            int var6 = class286.field4658;
            if (var6 < class288.field4680 / 256) {
                var6 = class288.field4680 / 256;
            }
            if (class234.field3730[4] && var6 < (class124.field1839[4] + 128)) {
                var6 = class124.field1839[4] + 128;
            }
            int var7 = class8.field101 + class176.field2851 & 0x7FF;
            class156.method1113(var6 * 3 + 600, class79.field1167, var7, class140.method983((byte) -123, class55.field807, class62.field913.field4280, class62.field913.field4311) - 50, arg3, true, var6, class272.field4420);
        }
        int var8 = class235.field3779;
        int var9 = class251.field3990;
        int var10 = class57.field823;
        int var11 = class13.field159;
        if (arg0 >= -96) {
            return;
        }
        int var12 = class304.field5072;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class234.field3730[var13]) {
                int var14 = (int) (Math.random() * (double) (class91.field1320[var13] * 2 + 1) + Math.sin((double) class242.field3866[var13] / 100.0D * (double) class192.field3103[var13]) * (double) class124.field1839[var13] - (double) class91.field1320[var13]);
                if (var13 == 1) {
                    class13.field159 += var14;
                }
                if (var13 == 2) {
                    class251.field3990 += var14;
                }
                if (var13 == 0) {
                    class235.field3779 += var14;
                }
                if (var13 == 4) {
                    class57.field823 += var14;
                    if (class57.field823 < 128) {
                        class57.field823 = 128;
                    }
                    if (class57.field823 > 383) {
                        class57.field823 = 383;
                    }
                }
                if (var13 == 3) {
                    class304.field5072 = class304.field5072 + var14 & 0x7FF;
                }
            }
        }
        class277.method1960(4);
        if (class166.field2625) {
            class190.method1369(arg2, arg1, arg2 + arg4, arg1 + arg3);
            float var15 = (float) class57.field823 * 0.17578125F;
            float var16 = (float) class304.field5072 * 0.17578125F;
            if (class28.field416 == 3) {
                var15 = class175.field2847 * 360.0F / 6.2831855F;
                var16 = class77.field1144 * 360.0F / 6.2831855F;
            }
            class166.method1166(arg2, arg1, arg4, arg3, arg4 / 2 + arg2, arg3 / 2 + arg1, var15, var16, class153.field2448, class153.field2448);
        } else {
            class54.method375(arg2, arg1, arg2 + arg4, arg1 - -arg3);
            class31.method201();
        }
        if (class251.field3993 || class196.field3164 < arg2 || class196.field3164 >= arg2 + arg4 || arg1 > class130.field1948 || (arg1 + arg3) <= class130.field1948) {
            class268.field4316 = 0;
            class104.field1472 = false;
        } else {
            class104.field1472 = true;
            class268.field4316 = 0;
            int var17 = class174.field2826;
            int var18 = class22.field327;
            class46.field732 = (class196.field3164 - arg2) * (var18 - var17) / arg4 + var17;
            int var19 = class302.field5003;
            int var20 = class50.field760;
            class205.field3315 = (var20 - var19) * (class130.field1948 - arg1) / arg3 + var19;
        }
        class234.method1685(-20783);
        byte var21 = class48.method346(0) == 2 ? (byte) class112.field1646 : 1;
        if (class166.field2625) {
            class166.method1195();
            boolean var22 = false;
            class166.method1174(true);
            class166.method1169(true);
            int var23;
            if (class94.field1377 == 10) {
                var23 = class194.method1392(class140.field2163, class235.field3779 >> 10, -1154803480, class251.field3990 >> 10, class262.field4171);
            } else {
                var23 = class194.method1392(class140.field2163, class62.field913.field4341[0] >> 3, -1154803480, class62.field913.field4306[0] >> 3, class262.field4171);
            }
            class179.method1283(class18.field234, !class14.field181);
            class166.method1168(var23);
            class184.method1337(class13.field159, class251.field3990, class304.field5072, class235.field3779, 111, class57.field823);
            class166.field2630 = class18.field234;
            class184.method1335(class235.field3779, class13.field159, class251.field3990, class57.field823, class304.field5072, class252.field4015, class162.field2578, class223.field3580, class104.field1485, class300.field4871, class234.field3744, class55.field807 + 1, var21, class62.field913.field4280 >> 7, class62.field913.field4311 >> 7);
            class86.field1266 = true;
            class179.method1274();
            class184.method1337(0, 0, 0, 0, 127, 0);
            class234.method1685(-20783);
            class134.method941();
            class97.method696(arg1, arg4, class153.field2448, class153.field2448, arg2, 20861, arg3);
            class312.method2165((byte) -105, arg3, arg4, class153.field2448, arg1, arg2, class153.field2448);
        } else {
            class54.method383(arg2, arg1, arg4, arg3, 0);
            class184.method1335(class235.field3779, class13.field159, class251.field3990, class57.field823, class304.field5072, class252.field4015, class162.field2578, class223.field3580, class104.field1485, class300.field4871, class234.field3744, class55.field807 + 1, var21, class62.field913.field4280 >> 7, class62.field913.field4311 >> 7);
            class234.method1685(-20783);
            class134.method941();
            class97.method696(arg1, arg4, 256, 256, arg2, 20861, arg3);
            class312.method2165((byte) -105, arg3, arg4, 256, arg1, arg2, 256);
        }
        ((class305) class31.field461).method2097(class140.field2163, (byte) -54);
        class91.method644(8, arg2, arg3, arg4, arg1);
        class251.field3990 = var9;
        class13.field159 = var11;
        class304.field5072 = var12;
        class235.field3779 = var8;
        class57.field823 = var10;
        if (class259.field4127 && class174.field2831.method899((byte) -18) == 0) {
            class259.field4127 = false;
        }
        if (class259.field4127) {
            if (class166.field2625) {
                class190.method1363(arg2, arg1, arg4, arg3, 0);
            } else {
                class54.method383(arg2, arg1, arg4, arg3, 0);
            }
            class305.method2105(false, class217.field3477, -19861);
        }
        if (!arg5 && !class259.field4127 && !class251.field3993 && class196.field3164 >= arg2 && class196.field3164 < arg2 + arg4 && class130.field1948 >= arg1 && class130.field1948 < arg1 + arg3) {
            class30.method186(arg4, class196.field3164, arg3, arg2, class130.field1948, arg1, -22191);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V", line = 369)
    public class81(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class166.field2648;
        var3.glGenTextures(1, var2, 0);
        this.field1197 = class103.field1460;
        this.field1188 = var2[0];
        class166.method1182(this.field1188);
        int var4 = class31.field447[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class103.field1457 += var6.limit() - this.field1193;
        this.field1193 = var6.limit();
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Z)V", line = 323)
    public static void method580(boolean arg0) {
        if (!arg0) {
            field1195 = (class41) null;
        }
        field1195 = null;
        field1199 = (class212[][][]) null;
        field1190 = null;
        field1201 = null;
        field1191 = null;
    }

    @OriginalMember(owner = "client!jk", name = "finalize", descriptor = "()V", line = 347)
    protected final void finalize() throws Throwable {
        if (this.field1188 != -1) {
            class103.method715(this.field1188, this.field1193, this.field1197);
            this.field1188 = -1;
            this.field1193 = 0;
        }
        field1187++;
        super.finalize();
    }
}
