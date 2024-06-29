import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class411 extends class503 {

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lha;")
    private class40 field6023;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lhu;")
    private class81 field6027;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field6028 = 1406;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field6031 = 1;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "[I")
    public static int[] field6034;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Lhe;")
    public static class239 field6026;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Lih;")
    public static class474 field6035;

    static {
        new class194("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field6034 = new int[1000];
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 4)
    public static void method2450(int arg0) {
        field6034 = null;
        field6035 = null;
        if (arg0 != 3170) {
            method2452(30);
        }
        field6026 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lrl;Lha;)V", line = 17)
    public class411(class487 arg0, class40 arg1) {
        super(arg0);
        this.field6023 = arg1;
        this.field6027 = new class81(arg0, 2);
        this.field6027.method520(123, 0);
        super.field7679.method2849(1, (byte) -109);
        if (this.field6023.field615) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field7679.method2849(0, (byte) -109);
        this.field6027.method522(false);
        this.field6027.method520(120, 1);
        super.field7679.method2849(1, (byte) -109);
        if (this.field6023.field615) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field7679.method2849(0, (byte) -109);
        this.field6027.method522(false);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(III)Z", line = 51)
    public static final boolean method2451(int arg0, int arg1, int arg2) {
        ++field6022;
        class486 var3 = class114.field1471.method2132((byte) 121, arg1);
        if (~arg2 == -12) {
            arg2 = 10;
        }
        int var4 = 95 / ((arg0 - 92) / 32);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method2840(-10216, arg2);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 72)
    public final void method629(byte arg0) {
        ++field6029;
        this.field6027.method523((byte) -88, '\u0001');
        if (arg0 != -122) {
            this.field6027 = null;
        }
        super.field7679.method2849(1, (byte) -109);
        super.field7679.method2883((class221) null, arg0 + 202);
        super.field7679.method2849(0, (byte) -109);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBLtu;)V", line = 86)
    public final void method626(int arg0, byte arg1, class221 arg2) {
        ++field6021;
        if (arg1 < -21) {
            super.field7679.method2883(arg2, 74);
            super.field7679.method2914(125, arg0);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V", line = 101)
    public final void method627(boolean arg0, int arg1) {
        if (arg1 != -1805) {
            field6035 = null;
        }
        ++field6025;
        this.field6027.method523((byte) 122, '\u0000');
        if (this.field6023.field615) {
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2883(this.field6023.field613, -118);
            super.field7679.method2849(0, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z", line = 121)
    public final boolean method623(byte arg0) {
        if (arg0 <= 45) {
            this.method629((byte) 84);
        }
        ++field6032;
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZZ)V", line = 136)
    public final void method625(boolean arg0, boolean arg1) {
        if (arg0) {
            field6035 = null;
        }
        ++field6024;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V", line = 146)
    public final void method624(int arg0, int arg1, int arg2) {
        ++field6020;
        float var4 = (float) ((arg2 & 3) + 1) * -5.0E-4F;
        int var5 = -49 / (-arg0 / 59);
        float var6 = (float) (((arg2 & 27) >> 3) + 1) * 5.0E-4F;
        float var7 = (64 & arg2) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        super.field7679.method2849(1, (byte) -109);
        boolean var8 = (128 & arg2) != 0;
        if (var8) {
            class222.field3138[0] = var7;
            class222.field3138[1] = 0.0F;
            class222.field3138[2] = 0.0F;
            class222.field3138[3] = 0.0F;
        } else {
            class222.field3138[2] = var7;
            class222.field3138[3] = 0.0F;
            class222.field3138[1] = 0.0F;
            class222.field3138[0] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class222.field3138, 0);
        class222.field3138[2] = 0.0F;
        class222.field3138[0] = 0.0F;
        class222.field3138[3] = (float) super.field7679.field7316 * var4 % 1.0F;
        class222.field3138[1] = var7;
        OpenGL.glTexGenfv(8193, 9474, class222.field3138, 0);
        if (this.field6023.field615) {
            class222.field3138[1] = 0.0F;
            class222.field3138[2] = 0.0F;
            class222.field3138[3] = (float) super.field7679.field7316 * var6 % 1.0F;
            class222.field3138[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class222.field3138, 0);
        } else {
            int var9 = (int) ((float) super.field7679.field7316 * var6 * 16.0F);
            super.field7679.method2883(this.field6023.field614[var9 % 16], -126);
        }
        super.field7679.method2849(0, (byte) -109);
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V", line = 206)
    public static final void method2452(int arg0) {
        class129.field1649.method257(arg0 ^ 110);
        ++field6030;
        class475.field6857.method2733(0);
        class315.field4621.method1292((byte) 7);
        class114.field1471.method2129(-3621);
        class508.field7744.method561(10675);
        class405.field5947.method1161((byte) -110);
        class286.field4083.method2594(25865);
        class53.field820.method2426(arg0 ^ 99);
        class78.field1102.method443(100);
        class503.field7685.method1166((byte) -96);
        class89.field1220.method478((byte) -16);
        class281.field4023.method1265(false);
        class96.field1295.method286(arg0 + -21748);
        class127.field1627.method1953((byte) 90);
        class228.field3209.method1539((byte) -119);
        class75.field1067.method2820((byte) -112);
        class66.field988.method2747(110);
        class481.field6941.method1335(arg0 ^ 19868);
        class337.field4911.method1589((byte) -2);
        class66.field989.method1388(-2);
        class135.method846(-48);
        class140.method885(67);
        class258.method1603((byte) -54);
        class354.method2147(-5);
        class399.field5876.method35((byte) -1);
        class468.field6754.method35((byte) -1);
        if (arg0 != 3) {
            field6028 = -49;
        }
        class141.field1846.method35((byte) -1);
        class413.field6116.method35((byte) -1);
        class396.field5841.method35((byte) -1);
    }
}
