import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class241 implements class86 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
    private boolean field4122 = false;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    private int field4134 = 50;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Lqm;")
    private class222 field4132;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Lqm;")
    private class222 field4139;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lmf;")
    private class43 field4126;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "Lmf;")
    private class43 field4160;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "[B")
    private byte[] field4152;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "[Z")
    private boolean[] field4128;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "[B")
    private byte[] field4156;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[B")
    private byte[] field4125;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "[S")
    private short[] field4149;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[Z")
    private boolean[] field4127;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "[Z")
    private boolean[] field4146;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "[Z")
    private boolean[] field4151;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "[Z")
    private boolean[] field4129;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "[B")
    private byte[] field4124;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Lke;")
    public static class106 field4135 = new class106();

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "Lcd;")
    public static class64 field4158 = class44.method335((byte) 71, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field4157 = 0;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field4161 = 0;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "Ldh;")
    public static class159 field4162 = new class159(16);

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "F")
    public static float field4163;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "Lqm;")
    public static class222 field4155;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)I", line = 10)
    public final int method661(int arg0, int arg1) {
        field4153++;
        return arg0 == 65535 ? this.field4156[arg1] & 0xFF : 111;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(II)Z", line = 21)
    public final boolean method669(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field4125 = (byte[]) null;
        }
        field4133++;
        return this.field4146[arg0];
    }

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "(II)Lwg;", line = 33)
    private final class277 method1748(int arg0, int arg1) {
        field4144++;
        class277 var3 = (class277) this.field4126.method329((long) arg0, (byte) -63);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4139.method1580(0, 0, arg0);
        if (arg1 != 255) {
            this.field4149 = (short[]) null;
        }
        if (var4 == null) {
            return null;
        } else {
            class13 var5 = new class13(var4);
            class277 var6 = new class277(var5);
            this.field4126.method331((long) arg0, var6, (byte) -64);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)Z", line = 59)
    public final boolean method659(int arg0, int arg1) {
        field4145++;
        if (arg1 != 1) {
            this.field4125 = (byte[]) null;
        }
        class277 var3 = this.method1748(arg0, 255);
        return var3 == null ? false : var3.method1924(arg1 ^ 0x3EAC, this, this.field4132);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lqm;Lqm;Lqm;IZ)V", line = 391)
    public class241(class222 arg0, class222 arg1, class222 arg2, int arg3, boolean arg4) {
        this.field4132 = arg2;
        this.field4139 = arg0;
        this.field4134 = arg3;
        this.field4122 = arg4;
        this.field4126 = new class43(this.field4134);
        if (class123.field2216) {
            this.field4160 = new class43(this.field4134);
        } else {
            this.field4160 = null;
        }
        class13 var6 = new class13(arg1.method1580(0, 0, 0));
        int var7 = var6.method112((byte) 92);
        this.field4152 = new byte[var7];
        this.field4128 = new boolean[var7];
        this.field4156 = new byte[var7];
        this.field4125 = new byte[var7];
        this.field4149 = new short[var7];
        this.field4127 = new boolean[var7];
        this.field4146 = new boolean[var7];
        this.field4151 = new boolean[var7];
        this.field4129 = new boolean[var7];
        this.field4124 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field4127[var8] = var6.method152((byte) -100) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field4127[var9]) {
                this.field4146[var9] = var6.method152((byte) -80) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field4127[var10]) {
                this.field4128[var10] = var6.method152((byte) -100) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field4127[var11]) {
                this.field4151[var11] = var6.method152((byte) -98) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field4127[var12]) {
                this.field4129[var12] = var6.method152((byte) -73) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field4127[var13]) {
                this.field4152[var13] = var6.method150((byte) 94);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field4127[var14]) {
                this.field4125[var14] = var6.method150((byte) 111);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field4127[var15]) {
                this.field4124[var15] = var6.method150((byte) 91);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field4127[var16]) {
                this.field4156[var16] = var6.method150((byte) 94);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field4127[var17]) {
                this.field4149[var17] = (short) var6.method112((byte) 92);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)[I", line = 85)
    public final int[] method660(int arg0, byte arg1) {
        field4150++;
        if (arg1 >= -32) {
            return (int[]) null;
        } else {
            class277 var3 = this.method1748(arg0, 255);
            return var3 == null ? null : var3.method1926(this.field4132, (byte) 91, this.field4122 || this.field4151[arg0], this);
        }
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "(II)Z", line = 105)
    public final boolean method670(int arg0, int arg1) {
        int var3 = -53 / ((54 - arg0) / 63);
        field4138++;
        return this.field4129[arg1];
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)Z", line = 116)
    public final boolean method665(byte arg0, int arg1) {
        if (arg0 > -85) {
            this.field4151 = (boolean[]) null;
        }
        field4140++;
        return this.field4128[arg1];
    }

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "(II)Lma;", line = 127)
    private final class274 method1749(int arg0, int arg1) {
        if (arg0 != 358392970) {
            this.method1752(112);
        }
        field4143++;
        class274 var3 = (class274) this.field4160.method329((long) arg1, (byte) -63);
        if (var3 == null) {
            class274 var4 = new class274(this.field4149[arg1] & 0xFFFF);
            this.field4160.method331((long) arg1, var4, (byte) -110);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "(II)V", line = 145)
    public final void method1750(int arg0, int arg1) {
        field4159++;
        for (class277 var3 = (class277) this.field4126.method333((byte) 54); var3 != null; var3 = (class277) this.field4126.method332(false)) {
            if (var3.field4775) {
                var3.method1919(21437, arg0);
                var3.field4775 = false;
            }
        }
        if (arg1 != 0) {
            field4157 = -25;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IB)I", line = 169)
    public final int method662(int arg0, byte arg1) {
        field4130++;
        int var3 = -23 / ((-arg1 - 7) / 53);
        return this.field4152[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)I", line = 188)
    public static final int method1751(byte arg0) {
        field4137++;
        return arg0 >= -75 ? 0 : ((class106.field1960 == 0 ? 0 : 1) << 22) + ((class155.field2741 & 0x3) << 17) + ((class175.field3000 ? 1 : 0) << 16) + ((class250.field4342 ? 1 : 0) << 15) + ((class69.field1324 ? 1 : 0) << 4) + (class201.field3441 & 0x7) + (((class275.field4718 ? 1 : 0) << 19) - -((class58.field959 == 0 ? 0 : 1) << 20)) + ((class163.field2865 == 0 ? 0 : 1) << 21) - (-((class141.field2485 ? 1 : 0) << 3) + -((class222.field3762 ? 1 : 0) << 5) - (((class83.field1522 ? 1 : 0) << 6) + ((class117.field2136 ? 1 : 0) << 7)) - (((class220.field3729 ? 1 : 0) << 8) + ((class109.field2015 ? 1 : 0) << 9) - -((class263.field4510 ? 1 : 0) << 10)) + (-((class244.field4251 & 0x3) << 11) - ((class274.field4701 ? 1 : 0) << 13)));
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I", line = 210)
    public final int method658(int arg0, int arg1) {
        int var3 = 78 % ((-arg1 - 44) / 62);
        field4142++;
        return this.field4125[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 224)
    public final void method1752(int arg0) {
        field4154++;
        if (arg0 != -13871) {
            field4161 = -32;
        }
        this.field4126.method334(false);
        if (this.field4160 != null) {
            this.field4160.method334(false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)I", line = 239)
    public final int method666(boolean arg0, int arg1) {
        field4147++;
        if (!arg0) {
            this.field4151 = (boolean[]) null;
        }
        return this.field4149[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V", line = 251)
    public final void method1753(int arg0, boolean arg1) {
        field4136++;
        this.field4122 = arg1;
        if (arg0 != -8268) {
            this.method664(87, 72);
        }
        this.method1752(-13871);
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(II)I", line = 264)
    public final int method664(int arg0, int arg1) {
        if (arg1 <= 11) {
            this.field4122 = true;
        }
        field4121++;
        return this.field4124[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(FBI)[I", line = 275)
    public final int[] method667(float arg0, byte arg1, int arg2) {
        field4141++;
        if (arg1 <= 84) {
            field4162 = (class159) null;
        }
        class277 var4 = this.method1748(arg2, 255);
        if (var4 == null) {
            return null;
        } else {
            var4.field4775 = true;
            return var4.method1921(this, arg0, this.field4132, this.field4122 || this.field4151[arg2], false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "(II)V", line = 300)
    public final void method1754(int arg0, int arg1) {
        this.field4134 = arg1;
        this.field4126 = new class43(this.field4134);
        field4123++;
        if (arg0 != 0) {
            this.field4125 = (byte[]) null;
        }
        if (class123.field2216) {
            this.field4160 = new class43(this.field4134);
        } else {
            this.field4160 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 317)
    public static void method1755(boolean arg0) {
        if (!arg0) {
            field4158 = null;
            field4135 = null;
            field4162 = null;
            field4155 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(II)Z", line = 334)
    public final boolean method663(int arg0, int arg1) {
        field4148++;
        int var3 = -116 / ((arg1 - 54) / 43);
        return this.field4122 || this.field4151[arg0];
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(II)V", line = 362)
    public final void method668(int arg0, int arg1) {
        field4131++;
        class125.method908(this.field4124[arg0] & 0xFF, arg1 + 16142, this.field4156[arg0] & 0xFF);
        boolean var3 = false;
        class277 var4 = this.method1748(arg0, arg1 ^ 0xFFFFC012);
        if (var4 != null) {
            var3 = var4.method1925(this, this.field4122 || this.field4151[arg0], this.field4132, true);
        }
        if (!var3) {
            class274 var5 = this.method1749(358392970, arg0);
            var5.method1902((byte) 111);
        }
        if (arg1 != -16147) {
            field4135 = (class106) null;
        }
    }
}
