import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class262 implements class251 {

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    private int field3898 = 50;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "Z")
    private boolean field3909 = false;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Llb;")
    private class211 field3880;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Llb;")
    private class211 field3894;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lvj;")
    private class106 field3878;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "Lvj;")
    private class106 field3907;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "[B")
    private byte[] field3897;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "[Z")
    private boolean[] field3889;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "[Z")
    private boolean[] field3899;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "[B")
    private byte[] field3890;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "[Z")
    private boolean[] field3918;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "[S")
    private short[] field3895;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[B")
    private byte[] field3879;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "[Z")
    private boolean[] field3916;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "[B")
    private byte[] field3912;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "[Z")
    private boolean[] field3902;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static volatile int field3882 = 0;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field3900 = 0;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "Lvc;")
    public static class191 field3908 = null;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "J")
    public static volatile long field3905 = 0L;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "[S")
    public static short[] field3920 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Llb;")
    public static class211 field3881;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)Z", line = 5)
    public final boolean method1737(int arg0, int arg1) {
        field3922++;
        return arg0 == 0 ? this.field3916[arg1] : false;
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(II)V", line = 18)
    public final void method1802(int arg0, int arg1) {
        for (class272 var3 = (class272) this.field3878.method819(0); var3 != null; var3 = (class272) this.field3878.method826(0)) {
            if (var3.field4103) {
                var3.method1895(arg1, (byte) 9);
                var3.field4103 = false;
            }
        }
        if (arg0 != 24556) {
            field3900 = -78;
        }
        field3891++;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)I", line = 42)
    public final int method1739(int arg0, int arg1) {
        field3887++;
        return arg0 == 18170 ? this.field3879[arg1] & 0xFF : -49;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 60)
    public static final void method1803(boolean arg0, String arg1) {
        field3906++;
        int var2 = class114.method893((byte) 115, arg1);
        if (var2 != -1) {
            if (arg0) {
                method1812((byte) 44, (Component) null);
            }
            class222.method1586(127, class213.field3390.field125[var2], class213.field3390.field109[var2]);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(IB)Z", line = 78)
    public final boolean method1746(int arg0, byte arg1) {
        field3896++;
        if (arg1 < 28) {
            this.method1735(52, (byte) 48);
        }
        return this.field3909 || this.field3899[arg0];
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 93)
    public final void method1804(boolean arg0) {
        this.field3878.method825(0);
        if (this.field3907 != null) {
            this.field3907.method825(0);
        }
        if (arg0) {
            field3903++;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Z", line = 112)
    public final boolean method1747(byte arg0, int arg1) {
        field3904++;
        class272 var3 = this.method1810(-71, arg1);
        if (var3 == null) {
            return false;
        } else {
            if (arg0 != 77) {
                this.method1739(-54, 57);
            }
            return var3.method1894((byte) -65, this.field3894, this);
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(II)[I", line = 129)
    public final int[] method1742(int arg0, int arg1) {
        class272 var3 = this.method1810(arg1 + 9974, arg0);
        if (arg1 != -10062) {
            field3881 = (class211) null;
        }
        field3884++;
        return var3 == null ? null : var3.method1891(this, this.field3909 || this.field3899[arg0], (byte) -53, this.field3894);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(IB)Lua;", line = 145)
    private final class89 method1805(int arg0, byte arg1) {
        if (arg1 != -33) {
            this.method1736(68, -120);
        }
        class89 var3 = (class89) this.field3907.method816((long) arg0, (byte) 73);
        field3877++;
        if (var3 == null) {
            class89 var4 = new class89(this.field3895[arg0] & 0xFFFF);
            this.field3907.method817(var4, (long) arg0, (byte) -115);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)V", line = 167)
    public final void method1735(int arg0, byte arg1) {
        if (arg1 >= -37) {
            this.field3890 = (byte[]) null;
        }
        class309.method2143(this.field3879[arg0] & 0xFF, -115, this.field3912[arg0] & 0xFF);
        field3876++;
        boolean var3 = false;
        class272 var4 = this.method1810(-63, arg0);
        if (var4 != null) {
            var3 = var4.method1892((byte) 67, this, this.field3894, this.field3909 || this.field3899[arg0]);
        }
        if (!var3) {
            class89 var5 = this.method1805(arg0, (byte) -33);
            var5.method724(-63);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 202)
    public static void method1806(int arg0) {
        if (arg0 == -1) {
            field3881 = null;
            field3920 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IB)I", line = 213)
    public final int method1743(int arg0, byte arg1) {
        field3892++;
        if (arg1 >= -13) {
            this.field3916 = (boolean[]) null;
        }
        return this.field3912[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)Z", line = 228)
    public final boolean method1736(int arg0, int arg1) {
        field3919++;
        return arg0 == 1838177680 ? this.field3889[arg1] : false;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)I", line = 244)
    public final int method1740(int arg0, int arg1) {
        field3911++;
        return arg0 < 48 ? 38 : this.field3897[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 258)
    public static final void method1807(int arg0) {
        field3910++;
        if (arg0 != 18566) {
            return;
        }
        for (int var1 = 0; var1 < class122.field1922; var1++) {
            int var2 = class227.field3515[var1];
            class45 var3 = class161.field2394[var2];
            int var4 = class88.field1293.method273(65280);
            if ((var4 & 0x40) != 0) {
                var4 += class88.field1293.method273(arg0 + 46714) << 8;
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class88.field1293.method240((byte) 124);
                int var6 = class88.field1293.method286(-866);
                var3.method2027(class312.field4852, var5, 0, var6);
                var3.field4435 = class312.field4852 + 300;
                var3.field4524 = class88.field1293.method273(65280);
            }
            if ((var4 & 0x10) != 0) {
                var3.field4494 = class88.field1293.method300(-1394191632);
                if (var3.field4494 == 65535) {
                    var3.field4494 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var7 = class88.field1293.method273(65280);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class88.field1293.method252((byte) 124);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var9[var11] = class88.field1293.method286(class203.method1462(arg0, -19432));
                    var10[var11] = class88.field1293.method258(437);
                }
                class153.method1122(var9, var3, 4929, var8, var10);
            }
            if ((var4 & 0x1) != 0) {
                var3.field4518 = class88.field1293.method279(125);
                var3.field4469 = 100;
            }
            if ((var4 & 0x200) != 0) {
                var3.field4456 = class88.field1293.method245(-100);
                var3.field4450 = class88.field1293.method300(-1394191632);
            }
            if ((var4 & 0x80) != 0) {
                int var13 = class88.field1293.method300(-1394191632);
                boolean var14 = true;
                int var15 = class88.field1293.method291(5);
                if (var13 == 65535) {
                    var13 = -1;
                }
                if (var13 != -1 && var3.field4526 != -1 && class173.method1259((byte) 119, class99.method778(20951, var13).field4050).field2405 < class173.method1259((byte) 119, class99.method778(20951, var3.field4526).field4050).field2405) {
                    var14 = false;
                }
                if (var14) {
                    var3.field4526 = var13;
                    var3.field4533 = 0;
                    var3.field4480 = 1;
                    var3.field4509 = var15 >> 16;
                    var3.field4466 = (var15 & 0xFFFF) + class312.field4852;
                    var3.field4482 = 0;
                    if (class312.field4852 < var3.field4466) {
                        var3.field4482 = -1;
                    }
                    if (var3.field4526 != -1 && class312.field4852 == var3.field4466) {
                        int var16 = class99.method778(arg0 + 2385, var3.field4526).field4050;
                        if (var16 != -1) {
                            class162 var17 = class173.method1259((byte) 119, var16);
                            if (var17 != null && var17.field2401 != null) {
                                class158.method1143(var3.field4496, 118, var3.field4507, var17, false, 0);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field698.method1331(true)) {
                    class246.method1701(var3, arg0 ^ 0xFFFFF12D);
                }
                var3.method412(class10.method78(class88.field1293.method245(-54), 2), true);
                var3.method2031(false, var3.field698.field2750);
                var3.field4478 = var3.field698.field2794;
                if (var3.field698.method1331(true)) {
                    class51.method468(0, (class121) null, class50.field775, (class101) null, var3.field4470[0], 128, var3.field4477[0], var3);
                }
            }
            if ((var4 & 0x2) != 0) {
                int var18 = class88.field1293.method300(-1394191632);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class88.field1293.method240((byte) 107);
                class40.method360(0, var18, var19, var3);
            }
            if ((var4 & 0x8) != 0) {
                int var20 = class88.field1293.method240((byte) -99);
                int var21 = class88.field1293.method240((byte) 80);
                var3.method2027(class312.field4852, var20, arg0 - 18566, var21);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLie;Lie;)V", line = 442)
    public static final void method1808(boolean arg0, class86 arg1, class86 arg2) {
        if (arg1.field1258 != null) {
            arg1.method713((byte) 68);
        }
        arg1.field1258 = arg2;
        arg1.field1269 = arg2.field1269;
        arg1.field1258.field1269 = arg1;
        arg1.field1269.field1258 = arg1;
        if (arg0) {
            field3881 = (class211) null;
        }
        field3921++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZ)V", line = 462)
    public final void method1809(byte arg0, boolean arg1) {
        if (arg0 >= -34) {
            method1807(88);
        }
        this.field3909 = arg1;
        this.method1804(true);
        field3886++;
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(II)Lw;", line = 475)
    private final class272 method1810(int arg0, int arg1) {
        if (arg0 > -1) {
            this.method1738(12, 0.26441363F, -67);
        }
        field3917++;
        class272 var3 = (class272) this.field3878.method816((long) arg1, (byte) 73);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3880.method1507(0, (byte) 68, arg1);
        if (var4 == null) {
            return null;
        } else {
            class35 var5 = new class35(var4);
            class272 var6 = new class272(var5);
            this.field3878.method817(var6, (long) arg1, (byte) -97);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(II)I", line = 507)
    public final int method1744(int arg0, int arg1) {
        if (arg0 != -65536) {
            method1803(true, (String) null);
        }
        field3915++;
        return this.field3895[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Llb;Llb;Llb;IZ)V", line = 610)
    public class262(class211 arg0, class211 arg1, class211 arg2, int arg3, boolean arg4) {
        this.field3880 = arg0;
        this.field3894 = arg2;
        this.field3898 = arg3;
        this.field3909 = arg4;
        this.field3878 = new class106(this.field3898);
        if (class36.field534) {
            this.field3907 = new class106(this.field3898);
        } else {
            this.field3907 = null;
        }
        class35 var6 = new class35(arg1.method1507(0, (byte) -127, 0));
        int var7 = var6.method300(-1394191632);
        this.field3897 = new byte[var7];
        this.field3889 = new boolean[var7];
        this.field3899 = new boolean[var7];
        this.field3890 = new byte[var7];
        this.field3918 = new boolean[var7];
        this.field3895 = new short[var7];
        this.field3879 = new byte[var7];
        this.field3916 = new boolean[var7];
        this.field3912 = new byte[var7];
        this.field3902 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3918[var8] = var6.method273(65280) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3918[var9]) {
                this.field3916[var9] = var6.method273(65280) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3918[var10]) {
                this.field3902[var10] = var6.method273(65280) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3918[var11]) {
                this.field3899[var11] = var6.method273(65280) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3918[var12]) {
                this.field3889[var12] = var6.method273(65280) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3918[var13]) {
                this.field3890[var13] = var6.method242((byte) -93);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3918[var14]) {
                this.field3897[var14] = var6.method242((byte) -93);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3918[var15]) {
                this.field3912[var15] = var6.method242((byte) -93);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3918[var16]) {
                this.field3879[var16] = var6.method242((byte) -93);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3918[var17]) {
                this.field3895[var17] = (short) var6.method300(-1394191632);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)Z", line = 522)
    public final boolean method1741(boolean arg0, int arg1) {
        if (arg0) {
            field3893++;
            return this.field3902[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(ZI)I", line = 536)
    public final int method1745(boolean arg0, int arg1) {
        if (arg0) {
            this.field3880 = (class211) null;
        }
        field3913++;
        return this.field3890[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IFI)[I", line = 556)
    public final int[] method1738(int arg0, float arg1, int arg2) {
        field3885++;
        if (arg0 != 0) {
            return (int[]) null;
        }
        class272 var4 = this.method1810(-116, arg2);
        if (var4 == null) {
            return null;
        } else {
            var4.field4103 = true;
            return var4.method1893(arg1, 122, this, this.field3909 || this.field3899[arg2], this.field3894);
        }
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "(II)V", line = 572)
    public final void method1811(int arg0, int arg1) {
        field3914++;
        this.field3898 = arg0;
        this.field3878 = new class106(this.field3898);
        if (arg1 <= 114) {
            this.method1746(-2, (byte) -27);
        }
        if (class36.field534) {
            this.field3907 = new class106(this.field3898);
        } else {
            this.field3907 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 593)
    public static final void method1812(byte arg0, Component arg1) {
        arg1.addMouseListener(class252.field3767);
        arg1.addMouseMotionListener(class252.field3767);
        if (arg0 <= 25) {
            field3882 = 106;
        }
        field3888++;
        arg1.addFocusListener(class252.field3767);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIILal;I)V", line = 737)
    public static final void method1813(int arg0, int arg1, int arg2, int arg3, int arg4, class323 arg5, int arg6) {
        field3883++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg2 != 256) {
            return;
        }
        if (arg4 == 0) {
            var7 = class222.method1585(arg6, arg0, arg3);
        } else if (arg4 == 1) {
            var7 = class182.method1317(arg6, arg0, arg3);
        } else if (arg4 == 2) {
            var7 = class274.method1910(arg6, arg0, arg3);
        } else if (arg4 == 3) {
            var7 = class136.method1039(arg6, arg0, arg3);
        }
        boolean var10 = false;
        int var11 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        int var12 = (int) var7 >> 14 & 0x1F;
        class101 var13 = class281.method1984(var11, false);
        if (var13.method786(-6000)) {
            class268.method1866(arg6, arg3, arg0, 0, var13);
        }
        boolean var14 = false;
        int var15 = (int) var7 >> 20 & 0x3;
        if (var7 == 0L) {
            return;
        }
        class310 var16 = null;
        class310 var17 = null;
        if (arg4 == 0) {
            class10 var18 = class161.method1153(arg6, arg0, arg3);
            if (var18 != null) {
                var16 = var18.field98;
                var17 = var18.field94;
            }
            if (var13.field1514 != 0) {
                arg5.method2212(var15, arg0, var12, (byte) -124, arg3, var13.field1557);
            }
        } else if (arg4 == 1) {
            class290 var21 = class249.method1728(arg6, arg0, arg3);
            if (var21 != null) {
                var17 = var21.field4549;
                var16 = var21.field4563;
            }
        } else if (arg4 == 2) {
            class91 var20 = class3.method37(arg6, arg0, arg3);
            if (var20 != null) {
                var16 = var20.field1326;
            }
            if (var13.field1514 != 0 && (var13.field1533 + arg0) < 104 && arg3 + var13.field1533 < 104 && (arg0 + var13.field1524) < 104 && arg3 + var13.field1524 < 104) {
                arg5.method2214(var13.field1557, var15, 21011, var13.field1524, arg3, var13.field1533, arg0);
            }
        } else if (arg4 == 3) {
            class173 var19 = class206.method1476(arg6, arg0, arg3);
            if (var19 != null) {
                var16 = var19.field2560;
            }
            if (var13.field1514 == 1) {
                arg5.method2202(false, arg0, arg3);
            }
        }
        if (!class36.field534 || !var13.field1572) {
            return;
        }
        if (var12 == 2) {
            if ((var16 instanceof class30)) {
                ((class30) var16).method212((byte) 81);
            } else {
                class97.method769(var13, var15 + 4, (byte) 96, arg1, var12, 0, 0, arg0, arg3);
            }
            if (var17 instanceof class30) {
                ((class30) var17).method212((byte) 26);
            } else {
                class97.method769(var13, var15 + 1 & 0x3, (byte) 96, arg1, var12, 0, 0, arg0, arg3);
            }
        } else if (var12 == 5) {
            if ((var16 instanceof class30)) {
                ((class30) var16).method212((byte) 48);
            } else {
                class97.method769(var13, var15, (byte) 96, arg1, 4, class224.field3498[var15] * 8, class222.field3477[var15] * 8, arg0, arg3);
            }
        } else if (var12 == 6) {
            if ((var16 instanceof class30)) {
                ((class30) var16).method212((byte) 102);
            } else {
                class97.method769(var13, var15 + 4, (byte) 96, arg1, 4, class294.field4622[var15] * 8, class244.field3683[var15] * 8, arg0, arg3);
            }
        } else if (var12 == 7) {
            if (var16 instanceof class30) {
                ((class30) var16).method212((byte) 85);
            } else {
                class97.method769(var13, (var15 + 2 & 0x3) + 4, (byte) 96, arg1, 4, 0, 0, arg0, arg3);
            }
        } else if (var12 == 8) {
            if (var16 instanceof class30) {
                ((class30) var16).method212((byte) 68);
            } else {
                class97.method769(var13, var15 + 4, (byte) 96, arg1, 4, class294.field4622[var15] * 8, class244.field3683[var15] * 8, arg0, arg3);
            }
            if ((var17 instanceof class30)) {
                ((class30) var17).method212((byte) 17);
            } else {
                class97.method769(var13, (var15 + 2 & 0x3) + 4, (byte) 96, arg1, 4, class294.field4622[var15] * 8, class244.field3683[var15] * 8, arg0, arg3);
            }
        } else if (var12 == 11) {
            if (var16 instanceof class30) {
                ((class30) var16).method212((byte) 68);
            } else {
                class97.method769(var13, var15 + 4, (byte) 96, arg1, 10, 0, 0, arg0, arg3);
            }
        } else if ((var16 instanceof class30)) {
            ((class30) var16).method212((byte) 76);
        } else {
            class97.method769(var13, var15, (byte) 96, arg1, var12, 0, 0, arg0, arg3);
        }
    }
}
