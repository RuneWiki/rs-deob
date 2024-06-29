import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class608 extends class475 {

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "[I")
    private int[] field7999;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    private int field8024;

    @OriginalMember(owner = "client!lj", name = "Jb", descriptor = "I")
    private int field8064;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    private int field8010;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "[I")
    private int[] field8007;

    @OriginalMember(owner = "client!lj", name = "wc", descriptor = "[S")
    private short[] field8103;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    private int field7994;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "[I")
    private int[] field8000;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "[I")
    private int[] field8006;

    @OriginalMember(owner = "client!lj", name = "xb", descriptor = "I")
    private int field8052;

    @OriginalMember(owner = "client!lj", name = "Qb", descriptor = "[Lhi;")
    private class207[] field8071;

    @OriginalMember(owner = "client!lj", name = "Db", descriptor = "[Lcm;")
    private class730[] field8058;

    @OriginalMember(owner = "client!lj", name = "ic", descriptor = "I")
    private int field8089;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "[Lida;")
    private class238[] field8016;

    @OriginalMember(owner = "client!lj", name = "sb", descriptor = "[Lra;")
    private class110[] field8047;

    @OriginalMember(owner = "client!lj", name = "Sb", descriptor = "[S")
    private short[] field8073;

    @OriginalMember(owner = "client!lj", name = "gc", descriptor = "[S")
    private short[] field8087;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "S")
    private short field8014;

    @OriginalMember(owner = "client!lj", name = "uc", descriptor = "[F")
    private float[] field8101;

    @OriginalMember(owner = "client!lj", name = "Pc", descriptor = "S")
    private short field8122;

    @OriginalMember(owner = "client!lj", name = "Rb", descriptor = "[S")
    private short[] field8072;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "[S")
    private short[] field8026;

    @OriginalMember(owner = "client!lj", name = "vc", descriptor = "[S")
    private short[] field8102;

    @OriginalMember(owner = "client!lj", name = "lb", descriptor = "[S")
    private short[] field8040;

    @OriginalMember(owner = "client!lj", name = "Ab", descriptor = "[S")
    private short[] field8055;

    @OriginalMember(owner = "client!lj", name = "Nc", descriptor = "[S")
    private short[] field8120;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "[S")
    private short[] field8028;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "[S")
    private short[] field8011;

    @OriginalMember(owner = "client!lj", name = "ac", descriptor = "[S")
    private short[] field8081;

    @OriginalMember(owner = "client!lj", name = "zc", descriptor = "[F")
    private float[] field8106;

    @OriginalMember(owner = "client!lj", name = "Pb", descriptor = "[B")
    private byte[] field8070;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "[B")
    private byte[] field8027;

    @OriginalMember(owner = "client!lj", name = "fc", descriptor = "[S")
    private short[] field8086;

    @OriginalMember(owner = "client!lj", name = "Ob", descriptor = "[I")
    private int[] field8069;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "[I")
    private int[] field8004;

    @OriginalMember(owner = "client!lj", name = "Fc", descriptor = "[I")
    private int[] field8112;

    @OriginalMember(owner = "client!lj", name = "hc", descriptor = "I")
    private int field8088;

    @OriginalMember(owner = "client!lj", name = "cc", descriptor = "I")
    private int field8083;

    @OriginalMember(owner = "client!lj", name = "rc", descriptor = "[[I")
    private int[][] field8098;

    @OriginalMember(owner = "client!lj", name = "oc", descriptor = "[[I")
    private int[][] field8095;

    @OriginalMember(owner = "client!lj", name = "jc", descriptor = "[[I")
    private int[][] field8090;

    @OriginalMember(owner = "client!lj", name = "kc", descriptor = "Z")
    private boolean field8091;

    @OriginalMember(owner = "client!lj", name = "Kb", descriptor = "Z")
    private boolean field8065;

    @OriginalMember(owner = "client!lj", name = "nc", descriptor = "Z")
    private boolean field8094;

    @OriginalMember(owner = "client!lj", name = "Mc", descriptor = "Z")
    private boolean field8119;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "Z")
    private boolean field8003;

    @OriginalMember(owner = "client!lj", name = "Lb", descriptor = "Lrv;")
    private class111 field8066;

    @OriginalMember(owner = "client!lj", name = "Gc", descriptor = "Luia;")
    private class367 field8113;

    @OriginalMember(owner = "client!lj", name = "Xb", descriptor = "Luia;")
    private class367 field8078;

    @OriginalMember(owner = "client!lj", name = "Eb", descriptor = "Luia;")
    private class367 field8059;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "Luia;")
    private class367 field8030;

    @OriginalMember(owner = "client!lj", name = "Gb", descriptor = "Lfm;")
    private class736 field8061;

    @OriginalMember(owner = "client!lj", name = "nb", descriptor = "[B")
    public static byte[] field8042 = new byte[520];

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    private int field7993;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    private int field7995;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field7997;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    private int field8017;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    private int field8022;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
    public static int field8029;

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!lj", name = "fb", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!lj", name = "gb", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!lj", name = "hb", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!lj", name = "ib", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!lj", name = "jb", descriptor = "I")
    private int field8038;

    @OriginalMember(owner = "client!lj", name = "kb", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!lj", name = "mb", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!lj", name = "ob", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!lj", name = "pb", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!lj", name = "qb", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!lj", name = "rb", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!lj", name = "tb", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!lj", name = "ub", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!lj", name = "vb", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!lj", name = "wb", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!lj", name = "yb", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!lj", name = "zb", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!lj", name = "Bb", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!lj", name = "Cb", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!lj", name = "Fb", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!lj", name = "Hb", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!lj", name = "Ib", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!lj", name = "Mb", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!lj", name = "Nb", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!lj", name = "Tb", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!lj", name = "Ub", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!lj", name = "Vb", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!lj", name = "Wb", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!lj", name = "Yb", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!lj", name = "Zb", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!lj", name = "bc", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!lj", name = "ec", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!lj", name = "lc", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!lj", name = "mc", descriptor = "I")
    private int field8093;

    @OriginalMember(owner = "client!lj", name = "pc", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!lj", name = "qc", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!lj", name = "sc", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!lj", name = "tc", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!lj", name = "xc", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!lj", name = "yc", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!lj", name = "Ac", descriptor = "I")
    private int field8107;

    @OriginalMember(owner = "client!lj", name = "Bc", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!lj", name = "Cc", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!lj", name = "Dc", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!lj", name = "Ec", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!lj", name = "Hc", descriptor = "I")
    private int field8114;

    @OriginalMember(owner = "client!lj", name = "Ic", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!lj", name = "Jc", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!lj", name = "Kc", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!lj", name = "Lc", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!lj", name = "Oc", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "Lhfa;")
    private class315 field8033;

    @OriginalMember(owner = "client!lj", name = "dc", descriptor = "[B")
    public static byte[] field8084;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    private final void method3300(int arg0) {
        field8068++;
        if (arg0 < 76 || this.field8064 == 0) {
            return;
        }
        if (this.method3305(108) && this.method3320(8)) {
            this.field8066.method825(0, 8, this.field8113.field5145);
            this.field8066.method825(1, 8, this.field8059.field5145);
            this.field8066.method825(2, 8, this.field8078.field5145);
            boolean var2;
            if ((this.field8083 & 0x37) == 0) {
                this.field8066.method817(false, -8043);
                var2 = false;
                this.field8066.method898(this.field8066.field1839, (byte) -15);
            } else {
                this.field8066.method817(true, -8043);
                var2 = true;
                this.field8066.method825(3, 8, this.field8030.field5145);
                this.field8066.method898(this.field8066.field1837, (byte) -15);
            }
            for (int var3 = 0; var3 < this.field8069.length; var3++) {
                int var4 = this.field8004[var3];
                int var5 = this.field8004[var3 + 1];
                int var6 = this.field8102[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field8066.method856(var6, 66, true, var2);
                this.field8066.method900(this.field8061.field10178, class322.field4583, var5 - var4, var4 * 3, this.field8112[var3], this.field8069[var3], -229);
            }
        }
        this.method3319((byte) 1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIZ)Lka;")
    public final class475 method171(byte arg0, int arg1, boolean arg2) {
        field8025++;
        class608 var4;
        class608 var5;
        if (arg0 == 1) {
            var4 = this.field8066.field1832;
            var5 = this.field8066.field1838;
        } else if (arg0 == 2) {
            var5 = this.field8066.field1836;
            var4 = this.field8066.field1830;
        } else if (arg0 == 3) {
            var4 = this.field8066.field1846;
            var5 = this.field8066.field1827;
        } else if (arg0 == 4) {
            var4 = this.field8066.field1833;
            var5 = this.field8066.field1826;
        } else if (arg0 == 5) {
            var4 = this.field8066.field1829;
            var5 = this.field8066.field1845;
        } else {
            var4 = var5 = new class608(this.field8066, 0, 0, true, false);
        }
        return this.method3304(var5, arg2, arg1, (byte) 60, arg0 != 0, var4);
    }

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "()Z")
    public final boolean method159() {
        field8085++;
        return this.field8091;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lrv;Lur;IIII)V")
    public class608(class111 arg0, class538 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class152 var7 = arg0.field717;
        this.field7999 = new int[arg1.field7131 + 1];
        int[] var8 = new int[arg1.field7084];
        for (int var9 = 0; var9 < arg1.field7084; var9++) {
            if (arg1.field7132 == null || arg1.field7132[var9] != 2) {
                if (arg1.field7112 != null && arg1.field7112[var9] != -1) {
                    class758 var178 = var7.method91(arg1.field7112[var9] & 0xFFFF, (byte) 125);
                    if (((this.field8083 & 0x40) == 0 || !var178.field10534) && var178.field10543) {
                        continue;
                    }
                }
                var8[this.field8024++] = var9;
                this.field7999[arg1.field7102[var9]]++;
                this.field7999[arg1.field7080[var9]]++;
                this.field7999[arg1.field7129[var9]]++;
            }
        }
        this.field8064 = this.field8024;
        long[] var10 = new long[this.field8024];
        boolean var11 = (this.field8010 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field8024; var12++) {
            int var161 = var8[var12];
            class758 var162 = null;
            int var163 = 0;
            byte var164 = 0;
            byte var165 = 0;
            byte var166 = 0;
            if (arg1.field7104 != null) {
                boolean var167 = false;
                for (int var168 = 0; var168 < arg1.field7104.length; var168++) {
                    class492 var169 = arg1.field7104[var168];
                    if (var169.field6660 == var161) {
                        class119 var170 = class591.method3219(0, var169.field6663);
                        if (var170.field1913) {
                            var167 = true;
                        }
                        if (var170.field1905 != -1) {
                            class758 var171 = var7.method91(var170.field1905, (byte) 127);
                            if (var171.field10541 == 2) {
                                this.field8091 = true;
                            }
                        }
                    }
                }
                if (var167) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field8064--;
                    continue;
                }
            }
            short var172 = -1;
            if (arg1.field7112 != null) {
                var172 = arg1.field7112[var161];
                if (var172 != -1) {
                    var162 = var7.method91(var172 & 0xFFFF, (byte) 126);
                    if ((this.field8083 & 0x40) != 0 && var162.field10534) {
                        var172 = -1;
                        var162 = null;
                    } else {
                        var166 = var162.field10558;
                        var165 = var162.field10536;
                    }
                }
            }
            boolean var173 = arg1.field7117 != null && arg1.field7117[var161] != 0 || var162 != null && var162.field10541 != 0;
            if ((var11 || var173) && arg1.field7128 != null) {
                var163 += arg1.field7128[var161] << 17;
            }
            if (var173) {
                var163 += 65536;
            }
            int var174 = (var165 & 0xFF << 8) + var163;
            int var175 = (var166 & 0xFF) + var174;
            int var176 = ((var172 & 0xFFFF) << 16) + var164;
            int var177 = (var12 & 0xFFFF) + var176;
            var10[var12] = ((long) var175 << 32) + (long) var177;
            this.field8091 |= var173;
            this.field8065 |= var162 != null && (var162.field10555 != 0 || var162.field10554 != 0);
        }
        class109.method804(var10, var8, (byte) -123);
        this.field8007 = arg1.field7125;
        this.field8103 = arg1.field7094;
        this.field7994 = arg1.field7119;
        this.field8000 = arg1.field7083;
        this.field8006 = arg1.field7096;
        this.field8052 = arg1.field7131;
        class354[] var13 = new class354[this.field8052];
        this.field8071 = arg1.field7116;
        this.field8058 = arg1.field7101;
        if (arg1.field7104 != null) {
            this.field8089 = arg1.field7104.length;
            this.field8016 = new class238[this.field8089];
            this.field8047 = new class110[this.field8089];
            for (int var14 = 0; var14 < this.field8089; var14++) {
                class492 var15 = arg1.field7104[var14];
                class119 var16 = class591.method3219(0, var15.field6663);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field8024; var18++) {
                    if (var8[var18] == var15.field6660) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class169.field2606[arg1.field7110[var15.field6660] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7117 == null ? 0 : arg1.field7117[var15.field6660]) << 24;
                this.field8016[var14] = new class238(var17, arg1.field7102[var15.field6660], arg1.field7080[var15.field6660], arg1.field7129[var15.field6660], var16.field1909, var16.field1908, var16.field1905, var16.field1910, var16.field1904, var16.field1913, var16.field1906, var15.field6662);
                this.field8047[var14] = new class110(var20);
            }
        }
        int var21 = this.field8024 * 3;
        this.field8073 = new short[var21];
        this.field8087 = new short[var21];
        this.field8014 = (short) arg4;
        this.field8101 = new float[var21];
        this.field8122 = (short) arg3;
        this.field8072 = new short[this.field8024];
        this.field8026 = new short[var21];
        this.field8102 = new short[this.field8024];
        if (arg1.field7120 != null) {
            this.field8040 = new short[this.field8024];
        }
        this.field8055 = new short[var21];
        this.field8120 = new short[var21];
        this.field8028 = new short[var21];
        this.field8011 = new short[this.field8024];
        this.field8081 = new short[this.field8024];
        this.field8106 = new float[var21];
        this.field8070 = new byte[this.field8024];
        this.field8027 = new byte[var21];
        class758.field10553 = new long[var21];
        this.field8086 = new short[this.field8024];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7131; var23++) {
            int var160 = this.field7999[var23];
            this.field7999[var23] = var22;
            var22 += var160;
            var13[var23] = new class354();
        }
        this.field7999[arg1.field7131] = var22;
        class365 var24 = class366.method2163(this.field8024, arg1, 0, var8);
        class308[] var25 = new class308[arg1.field7084];
        for (int var26 = 0; var26 < arg1.field7084; var26++) {
            short var139 = arg1.field7102[var26];
            short var140 = arg1.field7080[var26];
            short var141 = arg1.field7129[var26];
            int var142 = this.field8000[var140] - this.field8000[var139];
            int var143 = this.field8007[var140] - this.field8007[var139];
            int var144 = this.field8006[var140] - this.field8006[var139];
            int var145 = this.field8000[var141] - this.field8000[var139];
            int var146 = this.field8007[var141] - this.field8007[var139];
            int var147 = this.field8006[var141] - this.field8006[var139];
            int var148 = var143 * var147 - (var144 * var146);
            int var149 = var144 * var145 - (var142 * var147);
            int var150 = var142 * var146 - var143 * var145;
            while (var148 > 8192 || var149 > 8192 || var150 > 8192 || var148 < -8192 || var149 < -8192 || var150 < -8192) {
                var148 >>= 0x1;
                var150 >>= 0x1;
                var149 >>= 0x1;
            }
            int var151 = (int) Math.sqrt((double) (var150 * var150 + var148 * var148 + var149 * var149));
            if (var151 <= 0) {
                var151 = 1;
            }
            int var152 = var149 * 256 / var151;
            int var153 = var150 * 256 / var151;
            int var154 = var148 * 256 / var151;
            byte var155 = arg1.field7132 == null ? 0 : arg1.field7132[var26];
            if (var155 == 0) {
                class354 var157 = var13[var139];
                var157.field4989 += var152;
                var157.field4987 += var154;
                var157.field4984 += var153;
                var157.field4982++;
                class354 var158 = var13[var140];
                var158.field4987 += var154;
                var158.field4982++;
                var158.field4989 += var152;
                var158.field4984 += var153;
                class354 var159 = var13[var141];
                var159.field4989 += var152;
                var159.field4982++;
                var159.field4987 += var154;
                var159.field4984 += var153;
            } else if (var155 == 1) {
                class308 var156 = var25[var26] = new class308();
                var156.field4427 = var154;
                var156.field4430 = var152;
                var156.field4429 = var153;
            }
        }
        for (int var27 = 0; var27 < this.field8024; var27++) {
            int var48 = var8[var27];
            int var49 = arg1.field7110[var48] & 0xFFFF;
            int var50;
            if (arg1.field7082 == null) {
                var50 = -1;
            } else {
                var50 = arg1.field7082[var48];
            }
            int var51;
            if (arg1.field7117 == null) {
                var51 = 0;
            } else {
                var51 = arg1.field7117[var48] & 0xFF;
            }
            short var52 = arg1.field7112 == null ? -1 : arg1.field7112[var48];
            if (var52 != -1 && (this.field8083 & 0x40) != 0) {
                class758 var53 = var7.method91(var52 & 0xFFFF, (byte) 127);
                if (var53.field10534) {
                    var52 = -1;
                }
            }
            float var54 = 0.0F;
            float var55 = 0.0F;
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            byte var60 = 0;
            byte var61 = 0;
            int var62 = 0;
            if (var52 != -1) {
                if (var50 == -1) {
                    var55 = 1.0F;
                    var58 = 0.0F;
                    var59 = 0.0F;
                    var61 = 2;
                    var56 = 1.0F;
                    var60 = 1;
                    var57 = 1.0F;
                    var54 = 0.0F;
                } else {
                    var50 &= 0xFF;
                    byte var63 = arg1.field7089[var50];
                    if (var63 == 0) {
                        short var92 = arg1.field7102[var48];
                        short var93 = arg1.field7080[var48];
                        short var94 = arg1.field7129[var48];
                        short var95 = arg1.field7103[var50];
                        short var96 = arg1.field7105[var50];
                        short var97 = arg1.field7126[var50];
                        float var98 = (float) arg1.field7083[var95];
                        float var99 = (float) arg1.field7125[var95];
                        float var100 = (float) arg1.field7096[var95];
                        float var101 = (float) arg1.field7083[var96] - var98;
                        float var102 = (float) arg1.field7125[var96] - var99;
                        float var103 = (float) arg1.field7096[var96] - var100;
                        float var104 = (float) arg1.field7083[var97] - var98;
                        float var105 = (float) arg1.field7125[var97] - var99;
                        float var106 = (float) arg1.field7096[var97] - var100;
                        float var107 = (float) arg1.field7083[var92] - var98;
                        float var108 = (float) arg1.field7125[var92] - var99;
                        float var109 = (float) arg1.field7096[var92] - var100;
                        float var110 = (float) arg1.field7083[var93] - var98;
                        float var111 = (float) arg1.field7125[var93] - var99;
                        float var112 = (float) arg1.field7096[var93] - var100;
                        float var113 = (float) arg1.field7083[var94] - var98;
                        float var114 = (float) arg1.field7125[var94] - var99;
                        float var115 = (float) arg1.field7096[var94] - var100;
                        float var116 = var102 * var106 - var103 * var105;
                        float var117 = var103 * var104 - var101 * var106;
                        float var118 = var101 * var105 - (var102 * var104);
                        float var119 = var105 * var118 - var106 * var117;
                        float var120 = var106 * var116 - var104 * var118;
                        float var121 = var104 * var117 - var105 * var116;
                        float var122 = 1.0F / (var103 * var121 + var101 * var119 + var102 * var120);
                        var58 = (var115 * var121 + var113 * var119 + var114 * var120) * var122;
                        var56 = (var112 * var121 + var110 * var119 + var111 * var120) * var122;
                        var54 = (var109 * var121 + var107 * var119 + var108 * var120) * var122;
                        float var123 = var101 * var117 - var102 * var116;
                        float var124 = var102 * var118 - var103 * var117;
                        float var125 = var103 * var116 - (var101 * var118);
                        float var126 = 1.0F / (var106 * var123 + var104 * var124 + var105 * var125);
                        var57 = (var112 * var123 + var110 * var124 + var111 * var125) * var126;
                        var59 = (var115 * var123 + var113 * var124 + var114 * var125) * var126;
                        var55 = (var109 * var123 + var107 * var124 + var108 * var125) * var126;
                    } else {
                        short var64 = arg1.field7102[var48];
                        short var65 = arg1.field7080[var48];
                        short var66 = arg1.field7129[var48];
                        int var67 = var24.field5125[var50];
                        int var68 = var24.field5124[var50];
                        int var69 = var24.field5127[var50];
                        float[] var70 = var24.field5130[var50];
                        byte var71 = arg1.field7098[var50];
                        float var72 = (float) arg1.field7097[var50] / 256.0F;
                        if (var63 == 1) {
                            float var90 = (float) arg1.field7077[var50] / 1024.0F;
                            class101.method757(-113, arg1.field7096[var64], class189.field2851, var71, arg1.field7083[var64], var68, var72, var70, var90, var67, arg1.field7125[var64], var69);
                            var55 = class189.field2851[1];
                            var54 = class189.field2851[0];
                            class101.method757(-104, arg1.field7096[var65], class189.field2851, var71, arg1.field7083[var65], var68, var72, var70, var90, var67, arg1.field7125[var65], var69);
                            var57 = class189.field2851[1];
                            var56 = class189.field2851[0];
                            class101.method757(-119, arg1.field7096[var66], class189.field2851, var71, arg1.field7083[var66], var68, var72, var70, var90, var67, arg1.field7125[var66], var69);
                            var59 = class189.field2851[1];
                            var58 = class189.field2851[0];
                            float var91 = var90 / 2.0F;
                            if ((var71 & 0x1) == 0) {
                                if ((var56 - var54 > var91)) {
                                    var60 = 1;
                                    var56 -= var90;
                                } else if (var91 < var54 - var56) {
                                    var60 = 2;
                                    var56 += var90;
                                }
                                if (var58 - var54 > var91) {
                                    var61 = 1;
                                    var58 -= var90;
                                } else if (var91 < var54 - var58) {
                                    var58 += var90;
                                    var61 = 2;
                                }
                            } else {
                                if (var91 < var59 - var55) {
                                    var59 -= var90;
                                    var61 = 1;
                                } else if (var91 < var55 - var59) {
                                    var59 += var90;
                                    var61 = 2;
                                }
                                if (var57 - var55 > var91) {
                                    var57 -= var90;
                                    var60 = 1;
                                } else if (var91 < var55 - var57) {
                                    var60 = 2;
                                    var57 += var90;
                                }
                            }
                        } else if (var63 == 2) {
                            float var73 = (float) arg1.field7088[var50] / 256.0F;
                            float var74 = (float) arg1.field7090[var50] / 256.0F;
                            int var75 = arg1.field7083[var65] - arg1.field7083[var64];
                            int var76 = arg1.field7125[var65] - arg1.field7125[var64];
                            int var77 = arg1.field7096[var65] - arg1.field7096[var64];
                            int var78 = arg1.field7083[var66] - arg1.field7083[var64];
                            int var79 = arg1.field7125[var66] - arg1.field7125[var64];
                            int var80 = arg1.field7096[var66] - arg1.field7096[var64];
                            int var81 = var76 * var80 - (var77 * var79);
                            int var82 = var77 * var78 - var75 * var80;
                            int var83 = var75 * var79 - (var76 * var78);
                            float var84 = 64.0F / (float) arg1.field7114[var50];
                            float var85 = 64.0F / (float) arg1.field7085[var50];
                            float var86 = 64.0F / (float) arg1.field7077[var50];
                            float var87 = (var70[2] * (float) var83 + var70[1] * (float) var82 + var70[0] * (float) var81) / var84;
                            float var88 = (var70[5] * (float) var83 + var70[4] * (float) var82 + var70[3] * (float) var81) / var85;
                            float var89 = (var70[8] * (float) var83 + var70[6] * (float) var81 + var70[7] * (float) var82) / var86;
                            var62 = class6.method84(var87, var88, var89, (byte) 49);
                            class24.method241(var74, var67, arg1.field7096[var64], var69, var73, (byte) 9, var68, arg1.field7083[var64], arg1.field7125[var64], var72, var71, class189.field2851, var70, var62);
                            var55 = class189.field2851[1];
                            var54 = class189.field2851[0];
                            class24.method241(var74, var67, arg1.field7096[var65], var69, var73, (byte) 9, var68, arg1.field7083[var65], arg1.field7125[var65], var72, var71, class189.field2851, var70, var62);
                            var57 = class189.field2851[1];
                            var56 = class189.field2851[0];
                            class24.method241(var74, var67, arg1.field7096[var66], var69, var73, (byte) 9, var68, arg1.field7083[var66], arg1.field7125[var66], var72, var71, class189.field2851, var70, var62);
                            var59 = class189.field2851[1];
                            var58 = class189.field2851[0];
                        } else if (var63 == 3) {
                            class433.method2492(var71, arg1.field7125[var64], class189.field2851, 8, var72, var68, arg1.field7096[var64], arg1.field7083[var64], var67, var69, var70);
                            var55 = class189.field2851[1];
                            var54 = class189.field2851[0];
                            class433.method2492(var71, arg1.field7125[var65], class189.field2851, 8, var72, var68, arg1.field7096[var65], arg1.field7083[var65], var67, var69, var70);
                            var57 = class189.field2851[1];
                            var56 = class189.field2851[0];
                            class433.method2492(var71, arg1.field7125[var66], class189.field2851, 8, var72, var68, arg1.field7096[var66], arg1.field7083[var66], var67, var69, var70);
                            var59 = class189.field2851[1];
                            var58 = class189.field2851[0];
                            if ((var71 & 0x1) == 0) {
                                if (var58 - var54 > 0.5F) {
                                    var58--;
                                    var61 = 1;
                                } else if (var54 - var58 > 0.5F) {
                                    var58++;
                                    var61 = 2;
                                }
                                if ((var56 - var54 > 0.5F)) {
                                    var60 = 1;
                                    var56--;
                                } else if (var54 - var56 > 0.5F) {
                                    var60 = 2;
                                    var56++;
                                }
                            } else {
                                if (var57 - var55 > 0.5F) {
                                    var57--;
                                    var60 = 1;
                                } else if (var55 - var57 > 0.5F) {
                                    var60 = 2;
                                    var57++;
                                }
                                if ((var59 - var55 > 0.5F)) {
                                    var59--;
                                    var61 = 1;
                                } else if (var55 - var59 > 0.5F) {
                                    var61 = 2;
                                    var59++;
                                }
                            }
                        }
                    }
                }
            }
            byte var127;
            if (arg1.field7132 == null) {
                var127 = 0;
            } else {
                var127 = arg1.field7132[var48];
            }
            if (var127 == 0) {
                long var131 = ((long) (var49 << 8) + (long) (var62 << 24) + (long) var51 << 32) + (long) (var50 << 2);
                short var133 = arg1.field7102[var48];
                short var134 = arg1.field7080[var48];
                short var135 = arg1.field7129[var48];
                class354 var136 = var13[var133];
                this.field8072[var27] = this.method3312(var136.field4982, arg1, var27, var136.field4987, var54, var55, 0, var131, var136.field4984, var136.field4989, var133);
                class354 var137 = var13[var134];
                this.field8011[var27] = this.method3312(var137.field4982, arg1, var27, var137.field4987, var56, var57, 0, (long) var60 + var131, var137.field4984, var137.field4989, var134);
                class354 var138 = var13[var135];
                this.field8086[var27] = this.method3312(var138.field4982, arg1, var27, var138.field4987, var58, var59, 0, (long) var61 + var131, var138.field4984, var138.field4989, var135);
            } else if (var127 == 1) {
                class308 var128 = var25[var48];
                long var129 = (long) ((var128.field4429 + 256 << 22) + (var128.field4430 + 256 << 12) + (var50 << 2) + (var128.field4427 > 0 ? 1024 : 2048)) + ((long) (var49 << 8) + (long) var51 + (long) (var62 << 24) << 32);
                this.field8072[var27] = this.method3312(0, arg1, var27, var128.field4427, var54, var55, 0, var129, var128.field4429, var128.field4430, arg1.field7102[var48]);
                this.field8011[var27] = this.method3312(0, arg1, var27, var128.field4427, var56, var57, 0, (long) var60 + var129, var128.field4429, var128.field4430, arg1.field7080[var48]);
                this.field8086[var27] = this.method3312(0, arg1, var27, var128.field4427, var58, var59, 0, (long) var61 + var129, var128.field4429, var128.field4430, arg1.field7129[var48]);
            }
            if (arg1.field7117 != null) {
                this.field8070[var27] = arg1.field7117[var48];
            }
            if (arg1.field7120 != null) {
                this.field8040[var27] = arg1.field7120[var48];
            }
            this.field8081[var27] = arg1.field7110[var48];
            this.field8102[var27] = var52;
        }
        if (this.field8064 > 0) {
            int var28 = 1;
            short var29 = this.field8102[0];
            for (int var30 = 0; var30 < this.field8064; var30++) {
                short var40 = this.field8102[var30];
                if (var29 != var40) {
                    var28++;
                    var29 = var40;
                }
            }
            this.field8069 = new int[var28];
            this.field8004 = new int[var28 + 1];
            this.field8112 = new int[var28];
            this.field8004[0] = 0;
            int var31 = this.field8088;
            short var32 = 0;
            short var33 = this.field8102[0];
            int var34 = 0;
            for (int var35 = 0; var35 < this.field8064; var35++) {
                short var36 = this.field8102[var35];
                if (var33 != var36) {
                    this.field8069[var34] = var31;
                    this.field8112[var34] = var32 + 1 - var31;
                    var34++;
                    this.field8004[var34] = var35;
                    var33 = var36;
                    var32 = 0;
                    var31 = this.field8088;
                }
                short var37 = this.field8072[var35];
                if (var37 < var31) {
                    var31 = var37;
                }
                if (var32 < var37) {
                    var32 = var37;
                }
                short var38 = this.field8011[var35];
                if (var32 < var38) {
                    var32 = var38;
                }
                if (var31 > var38) {
                    var31 = var38;
                }
                short var39 = this.field8086[var35];
                if (var39 < var31) {
                    var31 = var39;
                }
                if (var39 > var32) {
                    var32 = var39;
                }
            }
            this.field8069[var34] = var31;
            this.field8112[var34] = var32 - (var31 - 1);
            var34++;
            this.field8004[var34] = this.field8064;
        }
        class758.field10553 = null;
        this.field8028 = class730.method4095(this.field8028, this.field8088, true);
        this.field8073 = class730.method4095(this.field8073, this.field8088, true);
        this.field8087 = class730.method4095(this.field8087, this.field8088, true);
        this.field8026 = class730.method4095(this.field8026, this.field8088, true);
        this.field8055 = class730.method4095(this.field8055, this.field8088, true);
        this.field8027 = class485.method2739(false, this.field8088, this.field8027);
        this.field8106 = class78.method624(this.field8106, (byte) -122, this.field8088);
        this.field8101 = class78.method624(this.field8101, (byte) -122, this.field8088);
        if (arg1.field7113 != null && class490.method2778(this.field8083, arg2, 24048)) {
            this.field8098 = arg1.method2989(false, 46);
        }
        if (arg1.field7104 != null && class128.method1012(this.field8083, (byte) 85, arg2)) {
            this.field8095 = arg1.method2991(-15362);
        }
        if (arg1.field7086 != null && class352.method2105(this.field8083, arg2, (byte) 110)) {
            int var41 = 0;
            int[] var42 = new int[256];
            for (int var43 = 0; var43 < this.field8024; var43++) {
                int var47 = arg1.field7086[var8[var43]];
                if (var47 >= 0) {
                    if (var47 > var41) {
                        var41 = var47;
                    }
                    int var10002 = var42[var47]++;
                }
            }
            this.field8090 = new int[var41 + 1][];
            for (int var44 = 0; var44 <= var41; var44++) {
                this.field8090[var44] = new int[var42[var44]];
                var42[var44] = 0;
            }
            for (int var45 = 0; var45 < this.field8024; var45++) {
                int var46 = arg1.field7086[var8[var45]];
                if (var46 >= 0) {
                    this.field8090[var46][var42[var46]++] = var45;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lofa;Lvh;I)V")
    public final void method155(class333 arg0, class364 arg1, int arg2) {
        field8105++;
        if (this.field8088 == 0) {
            return;
        }
        class615 var4 = this.field8066.field1719;
        if (!this.field8094) {
            this.method3308(-104);
        }
        class615 var5 = (class615) arg0;
        class404.field5631 = var4.field8225 * var5.field8215 + var4.field8215 * var5.field8208 + var4.field8199 * var5.field8221;
        class377.field5251 = var4.field8225 * var5.field8177 + var4.field8215 * var5.field8186 + var4.field8199 * var5.field8204 + var4.field8177;
        float var6 = (float) this.field8093 * class404.field5631 + class377.field5251;
        float var7 = (float) this.field8038 * class404.field5631 + class377.field5251;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = var7 - (float) this.field7993;
            var9 = (float) this.field7993 + var6;
        } else {
            var9 = (float) this.field7993 + var7;
            var8 = var6 - (float) this.field7993;
        }
        if ((this.field8066.field1769 <= var8) || (var9 <= (float) this.field8066.field1745)) {
            return;
        }
        class238.field3365 = var4.field8197 * var5.field8215 + var4.field8221 * var5.field8208 + var4.field8182 * var5.field8221;
        class352.field4952 = var4.field8197 * var5.field8177 + var4.field8221 * var5.field8186 + var4.field8182 * var5.field8204 + var4.field8204;
        float var10 = (float) this.field8093 * class238.field3365 + class352.field4952;
        float var11 = (float) this.field8038 * class238.field3365 + class352.field4952;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) this.field7993 + var10) * (float) this.field8066.field1768;
            var13 = (var11 - (float) this.field7993) * (float) this.field8066.field1768;
        } else {
            var12 = ((float) this.field7993 + var11) * (float) this.field8066.field1768;
            var13 = ((float) (-this.field7993) + var10) * (float) this.field8066.field1768;
        }
        if ((var13 / var9 >= this.field8066.field1763) || (this.field8066.field1785 >= var12 / var9)) {
            return;
        }
        class92.field1117 = var4.field8195 * var5.field8177 + var4.field8208 * var5.field8186 + var4.field8184 * var5.field8204 + var4.field8186;
        class573.field7530 = var4.field8195 * var5.field8215 + var4.field8208 * var5.field8208 + var4.field8184 * var5.field8221;
        float var14 = (float) this.field8093 * class573.field7530 + class92.field1117;
        float var15 = (float) this.field8038 * class573.field7530 + class92.field1117;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = (var15 - (float) this.field7993) * (float) this.field8066.field1815;
            var17 = ((float) this.field7993 + var14) * (float) this.field8066.field1815;
        } else {
            var17 = ((float) this.field7993 + var15) * (float) this.field8066.field1815;
            var16 = (var14 - (float) this.field7993) * (float) this.field8066.field1815;
        }
        if ((this.field8066.field1740 <= var16 / var9) || (var17 / var9 <= this.field8066.field1732)) {
            return;
        }
        if (arg1 != null || this.field8016 != null) {
            class439.field6069 = var4.field8225 * var5.field8199 + var4.field8215 * var5.field8184 + var4.field8199 * var5.field8182;
            class423.field5823 = var4.field8195 * var5.field8225 + var4.field8208 * var5.field8195 + var4.field8184 * var5.field8197;
            class621.field8280 = var4.field8197 * var5.field8199 + var4.field8221 * var5.field8184 + var4.field8182 * var5.field8182;
            class543.field7192 = var4.field8195 * var5.field8199 + var4.field8208 * var5.field8184 + var4.field8184 * var5.field8182;
            class736.field10182 = var4.field8225 * var5.field8225 + var4.field8215 * var5.field8195 + var4.field8199 * var5.field8197;
            class668.field9123 = var4.field8197 * var5.field8225 + var4.field8221 * var5.field8195 + var4.field8182 * var5.field8197;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field8114 + this.field8107 >> 1;
            int var21 = this.field8022 + this.field7995 >> 1;
            int var22 = (int) ((float) var21 * class668.field9123 + (float) this.field8093 * class238.field3365 + (float) var20 * class621.field8280 + class352.field4952);
            int var23 = (int) ((float) var21 * class423.field5823 + (float) this.field8093 * class573.field7530 + (float) var20 * class543.field7192 + class92.field1117);
            int var24 = (int) ((float) var21 * class736.field10182 + (float) this.field8093 * class404.field5631 + (float) var20 * class439.field6069 + class377.field5251);
            if (this.field8066.field1745 <= var24) {
                arg1.field5122 = this.field8066.field1768 * var22 / var24 + this.field8066.field1818;
                arg1.field5121 = this.field8066.field1815 * var23 / var24 + this.field8066.field1738;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class668.field9123 + (float) this.field8038 * class238.field3365 + (float) var20 * class621.field8280 + class352.field4952);
            int var26 = (int) ((float) var21 * class423.field5823 + (float) this.field8038 * class573.field7530 + (float) var20 * class543.field7192 + class92.field1117);
            int var27 = (int) ((float) var21 * class736.field10182 + (float) this.field8038 * class404.field5631 + (float) var20 * class439.field6069 + class377.field5251);
            if (this.field8066.field1745 > var27) {
                var18 = true;
            } else {
                arg1.field5120 = this.field8066.field1818 + (this.field8066.field1768 * var25 / var27);
                arg1.field5118 = this.field8066.field1815 * var26 / var27 + this.field8066.field1738;
            }
            if (var18) {
                if (var24 < this.field8066.field1745 && var27 < this.field8066.field1745) {
                    var19 = false;
                } else if (var24 < this.field8066.field1745) {
                    int var31 = (var27 - this.field8066.field1745 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field5122 = this.field8066.field1768 * var32 / this.field8066.field1745 + this.field8066.field1818;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field5121 = this.field8066.field1815 * var33 / this.field8066.field1745 + this.field8066.field1738;
                } else if (this.field8066.field1745 > var27) {
                    int var28 = (var24 - this.field8066.field1745 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field5122 = this.field8066.field1768 * var29 / this.field8066.field1745 + this.field8066.field1818;
                    arg1.field5121 = this.field8066.field1815 * var30 / this.field8066.field1745 + this.field8066.field1738;
                }
            }
            if (var19) {
                if (var24 <= var27) {
                    arg1.field5119 = this.field8066.field1818 + ((this.field7993 + var25) * this.field8066.field1768 / var27) - arg1.field5120;
                } else {
                    arg1.field5119 = (this.field7993 + var22) * this.field8066.field1768 / var24 + this.field8066.field1818 - arg1.field5122;
                }
                arg1.field5117 = true;
            }
        }
        this.field8066.method944((byte) -77);
        this.field8066.method839(var5, 127);
        this.method3300(100);
        this.method3311(-127);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    private final void method3301(int arg0) {
        field8020++;
        if (arg0 != 0) {
            this.field8059 = null;
        }
        if ((this.field8083 & 0x37) == 0) {
            if (this.field8059 == null) {
                return;
            }
            this.field8059.field5137 = false;
        } else if (this.field8030 != null) {
            this.field8030.field5137 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
    private final void method3302(int arg0) {
        field8008++;
        if (arg0 != -5565) {
            this.method203(105, 27, null, false, -88, -47);
        }
        if (this.field8059 != null) {
            this.field8059.field5137 = false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()Z")
    public final boolean method172() {
        field8118++;
        if (this.field8102 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field8102.length; var1++) {
            if (this.field8102[var1] != -1 && !this.field8066.field717.method85(this.field8102[var1], -32345)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "aa", descriptor = "(SS)V")
    public final void method152(short arg0, short arg1) {
        field8110++;
        class152 var3 = this.field8066.field717;
        for (int var4 = 0; var4 < this.field8024; var4++) {
            if (this.field8102[var4] == arg0) {
                this.field8102[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class758 var7 = var3.method91(arg0 & 0xFFFF, (byte) 127);
            var6 = var7.field10537;
            var5 = var7.field10542;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class758 var10 = var3.method91(arg1 & 0xFFFF, (byte) 126);
            var8 = var10.field10542;
            if (var10.field10555 != 0 || var10.field10554 != 0) {
                this.field8065 = true;
            }
            var9 = var10.field10537;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field8016 != null) {
            for (int var11 = 0; var11 < this.field8089; var11++) {
                class238 var12 = this.field8016[var11];
                class110 var13 = this.field8047[var11];
                var13.field1525 = class169.field2606[this.field8081[var12.field3362] & 0xFFFF] & 0xFFFFFF | var13.field1525 & 0xFF000000;
            }
        }
        this.method3302(-5565);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(IIII)Lkn;")
    public static final class742 method3303(int arg0, int arg1, int arg2, int arg3) {
        field8060++;
        class701 var4 = class660.field8718[arg0][arg3][arg2];
        if (var4 == null) {
            return null;
        }
        if (arg1 != -28802) {
            method3309(-87);
        }
        class742 var5 = null;
        int var6 = -1;
        for (class10 var7 = var4.field9742; var7 != null; var7 = var7.field174) {
            class675 var8 = var7.field170;
            if (var8 instanceof class742) {
                class742 var9 = (class742) var8;
                int var10 = (var9.method2256(-1) - 1) * 256 + 252;
                int var11 = var9.field3505 - var10 >> 9;
                int var12 = var9.field3502 - var10 >> 9;
                int var13 = var9.field3505 + var10 >> 9;
                int var14 = var9.field3502 + var10 >> 9;
                if (arg3 >= var11 && var12 <= arg2 && var13 >= arg3 && var14 >= arg2) {
                    int var15 = (var13 - (arg3 - 1)) * (var14 + 1 - arg2);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V")
    public final void method199(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field8024; var5++) {
            int var9 = this.field8081[var5] & 0xFFFF;
            int var10 = (var9 & 0xFD26) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field8081[var5] = (short) class446.method2556(var12, class446.method2556(var10 << 10, var11 << 7));
        }
        field8104++;
        if (this.field8016 != null) {
            for (int var6 = 0; var6 < this.field8089; var6++) {
                class238 var7 = this.field8016[var6];
                class110 var8 = this.field8047[var6];
                var8.field1525 = class169.field2606[this.field8081[var7.field3362] & 0xFFFF] & 0xFFFFFF | var8.field1525 & 0xFF000000;
            }
        }
        this.method3302(-5565);
    }

    @OriginalMember(owner = "client!lj", name = "ua", descriptor = "()I")
    public final int method214() {
        field8116++;
        return this.field8010;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "()V")
    public final void method181() {
        field8096++;
        if (this.field8088 > 0 && this.field8064 > 0) {
            this.method3305(110);
            this.method3320(8);
            this.method3319((byte) 1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "()Z")
    public final boolean method192() {
        field8100++;
        return this.field8065;
    }

    @OriginalMember(owner = "client!lj", name = "fa", descriptor = "()I")
    public final int method180() {
        field8048++;
        if (!this.field8094) {
            this.method3308(100);
        }
        return this.field8093;
    }

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "()I")
    public final int method211() {
        if (!this.field8094) {
            this.method3308(116);
        }
        field8032++;
        return this.field8114;
    }

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "()V")
    public final void method202() {
        field8099++;
        for (int var1 = 0; var1 < this.field8052; var1++) {
            this.field8006[var1] = -this.field8006[var1];
        }
        for (int var2 = 0; var2 < this.field8088; var2++) {
            this.field8055[var2] = (short) (-this.field8055[var2]);
        }
        for (int var3 = 0; var3 < this.field8024; var3++) {
            short var4 = this.field8072[var3];
            this.field8072[var3] = this.field8086[var3];
            this.field8086[var3] = var4;
        }
        this.method3318(-101);
        this.method3301(0);
        this.method3310(12460);
        this.field8094 = false;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()[Lhi;")
    public final class207[] method195() {
        field8109++;
        return this.field8071;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Llj;ZIBZLlj;)Lka;")
    private final class475 method3304(class608 arg0, boolean arg1, int arg2, byte arg3, boolean arg4, class608 arg5) {
        arg5.field8010 = arg2;
        arg5.field8065 = this.field8065;
        field8018++;
        arg5.field8089 = this.field8089;
        arg5.field8052 = this.field8052;
        arg5.field8088 = this.field8088;
        arg5.field8024 = this.field8024;
        if ((arg2 & 0x100) == 0) {
            arg5.field8091 = this.field8091;
        } else {
            arg5.field8091 = true;
        }
        arg5.field7994 = this.field7994;
        arg5.field8014 = this.field8014;
        arg5.field8122 = this.field8122;
        arg5.field8083 = this.field8083;
        arg5.field8064 = this.field8064;
        boolean var7 = class141.method1082(102, this.field8083, arg2);
        boolean var8 = class628.method3462((byte) -123, this.field8083, arg2);
        boolean var9 = class649.method3549(23606, this.field8083, arg2);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg5.field8000 = this.field8000;
            } else if (arg0.field8000 == null || arg0.field8000.length < this.field7994) {
                arg5.field8000 = arg0.field8000 = new int[this.field7994];
            } else {
                arg5.field8000 = arg0.field8000;
            }
            if (!var8) {
                arg5.field8007 = this.field8007;
            } else if (arg0.field8007 == null || this.field7994 > arg0.field8007.length) {
                arg5.field8007 = arg0.field8007 = new int[this.field7994];
            } else {
                arg5.field8007 = arg0.field8007;
            }
            if (!var9) {
                arg5.field8006 = this.field8006;
            } else if (arg0.field8006 == null || this.field7994 > arg0.field8006.length) {
                arg5.field8006 = arg0.field8006 = new int[this.field7994];
            } else {
                arg5.field8006 = arg0.field8006;
            }
            for (int var11 = 0; var11 < this.field7994; var11++) {
                if (var7) {
                    arg5.field8000[var11] = this.field8000[var11];
                }
                if (var8) {
                    arg5.field8007[var11] = this.field8007[var11];
                }
                if (var9) {
                    arg5.field8006[var11] = this.field8006[var11];
                }
            }
        } else {
            arg5.field8007 = this.field8007;
            arg5.field8006 = this.field8006;
            arg5.field8000 = this.field8000;
        }
        if (class705.method3965(arg2, (byte) -35, this.field8083)) {
            arg5.field8113 = arg0.field8113;
            arg5.field8113.field5137 = this.field8113.field5137;
            arg5.field8113.field5138 = true;
            arg5.field8113.field5145 = this.field8113.field5145;
        } else if (class677.method3784(arg2, true, this.field8083)) {
            arg5.field8113 = this.field8113;
        } else {
            arg5.field8113 = null;
        }
        if (class506.method2843((byte) 118, this.field8083, arg2)) {
            if (arg0.field8081 == null || this.field8024 > arg0.field8081.length) {
                arg5.field8081 = arg0.field8081 = new short[this.field8024];
            } else {
                arg5.field8081 = arg0.field8081;
            }
            for (int var12 = 0; var12 < this.field8024; var12++) {
                arg5.field8081[var12] = this.field8081[var12];
            }
        } else {
            arg5.field8081 = this.field8081;
        }
        if (class536.method2973(arg2, this.field8083, false)) {
            if (arg0.field8070 == null || this.field8024 > arg0.field8070.length) {
                arg5.field8070 = arg0.field8070 = new byte[this.field8024];
            } else {
                arg5.field8070 = arg0.field8070;
            }
            for (int var13 = 0; var13 < this.field8024; var13++) {
                arg5.field8070[var13] = this.field8070[var13];
            }
        } else {
            arg5.field8070 = this.field8070;
        }
        if (class548.method3062(this.field8083, 55, arg2)) {
            arg5.field8059 = arg0.field8059;
            arg5.field8059.field5145 = this.field8059.field5145;
            arg5.field8059.field5137 = this.field8059.field5137;
            arg5.field8059.field5138 = true;
        } else if (class593.method3224(arg2, this.field8083, 22926)) {
            arg5.field8059 = this.field8059;
        } else {
            arg5.field8059 = null;
        }
        if (class672.method3713(-31, arg2, this.field8083)) {
            if (arg0.field8087 == null || this.field8088 > arg0.field8087.length) {
                int var14 = this.field8088;
                arg5.field8055 = arg0.field8055 = new short[var14];
                arg5.field8026 = arg0.field8026 = new short[var14];
                arg5.field8087 = arg0.field8087 = new short[var14];
            } else {
                arg5.field8055 = arg0.field8055;
                arg5.field8087 = arg0.field8087;
                arg5.field8026 = arg0.field8026;
            }
            if (this.field8033 == null) {
                arg5.field8033 = null;
                for (int var15 = 0; var15 < this.field8088; var15++) {
                    arg5.field8087[var15] = this.field8087[var15];
                    arg5.field8026[var15] = this.field8026[var15];
                    arg5.field8055[var15] = this.field8055[var15];
                }
            } else {
                if (arg0.field8033 == null) {
                    arg0.field8033 = new class315();
                }
                class315 var16 = arg5.field8033 = arg0.field8033;
                if (var16.field4495 == null || var16.field4495.length < this.field8088) {
                    int var17 = this.field8088;
                    var16.field4495 = new short[var17];
                    var16.field4496 = new byte[var17];
                    var16.field4497 = new short[var17];
                    var16.field4499 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field8088; var18++) {
                    arg5.field8087[var18] = this.field8087[var18];
                    arg5.field8026[var18] = this.field8026[var18];
                    arg5.field8055[var18] = this.field8055[var18];
                    var16.field4495[var18] = this.field8033.field4495[var18];
                    var16.field4497[var18] = this.field8033.field4497[var18];
                    var16.field4499[var18] = this.field8033.field4499[var18];
                    var16.field4496[var18] = this.field8033.field4496[var18];
                }
            }
            arg5.field8027 = this.field8027;
        } else {
            arg5.field8026 = this.field8026;
            arg5.field8055 = this.field8055;
            arg5.field8027 = this.field8027;
            arg5.field8033 = this.field8033;
            arg5.field8087 = this.field8087;
        }
        if (class224.method1432(this.field8083, arg2, (byte) 106)) {
            arg5.field8030 = arg0.field8030;
            arg5.field8030.field5145 = this.field8030.field5145;
            arg5.field8030.field5137 = this.field8030.field5137;
            arg5.field8030.field5138 = true;
        } else if (class478.method2694(true, this.field8083, arg2)) {
            arg5.field8030 = this.field8030;
        } else {
            arg5.field8030 = null;
        }
        if (arg3 < 45) {
            this.field8090 = null;
        }
        if (class613.method3335(5, this.field8083, arg2)) {
            if (arg0.field8106 == null || this.field8024 > arg0.field8106.length) {
                int var19 = this.field8088;
                arg5.field8106 = arg0.field8106 = new float[var19];
                arg5.field8101 = arg0.field8101 = new float[var19];
            } else {
                arg5.field8101 = arg0.field8101;
                arg5.field8106 = arg0.field8106;
            }
            for (int var20 = 0; var20 < this.field8088; var20++) {
                arg5.field8106[var20] = this.field8106[var20];
                arg5.field8101[var20] = this.field8101[var20];
            }
        } else {
            arg5.field8106 = this.field8106;
            arg5.field8101 = this.field8101;
        }
        if (class199.method1343(arg2, 192, this.field8083)) {
            arg5.field8078 = arg0.field8078;
            arg5.field8078.field5137 = this.field8078.field5137;
            arg5.field8078.field5138 = true;
            arg5.field8078.field5145 = this.field8078.field5145;
        } else if (class374.method2189(this.field8083, arg2, 0)) {
            arg5.field8078 = this.field8078;
        } else {
            arg5.field8078 = null;
        }
        if (class101.method761(16, this.field8083, arg2)) {
            if (arg0.field8072 == null || arg0.field8072.length < this.field8024) {
                int var21 = this.field8024;
                arg5.field8086 = arg0.field8086 = new short[var21];
                arg5.field8011 = arg0.field8011 = new short[var21];
                arg5.field8072 = arg0.field8072 = new short[var21];
            } else {
                arg5.field8072 = arg0.field8072;
                arg5.field8011 = arg0.field8011;
                arg5.field8086 = arg0.field8086;
            }
            for (int var22 = 0; var22 < this.field8024; var22++) {
                arg5.field8072[var22] = this.field8072[var22];
                arg5.field8011[var22] = this.field8011[var22];
                arg5.field8086[var22] = this.field8086[var22];
            }
        } else {
            arg5.field8086 = this.field8086;
            arg5.field8011 = this.field8011;
            arg5.field8072 = this.field8072;
        }
        if (class130.method1021(this.field8083, arg2, (byte) -74)) {
            arg5.field8061 = arg0.field8061;
            arg5.field8061.field10172 = true;
            arg5.field8061.field10174 = this.field8061.field10174;
            arg5.field8061.field10178 = this.field8061.field10178;
        } else if (class730.method4094(arg2, this.field8083, 122)) {
            arg5.field8061 = this.field8061;
        } else {
            arg5.field8061 = null;
        }
        if (class390.method2312(arg2, false, this.field8083)) {
            if (arg0.field8102 == null || arg0.field8102.length < this.field8024) {
                int var23 = this.field8024;
                arg5.field8102 = arg0.field8102 = new short[var23];
            } else {
                arg5.field8102 = arg0.field8102;
            }
            for (int var24 = 0; var24 < this.field8024; var24++) {
                arg5.field8102[var24] = this.field8102[var24];
            }
        } else {
            arg5.field8102 = this.field8102;
        }
        if (!class241.method1510(arg2, 28466, this.field8083)) {
            arg5.field8047 = this.field8047;
        } else if (arg0.field8047 == null || arg0.field8047.length < this.field8089) {
            int var26 = this.field8089;
            arg5.field8047 = arg0.field8047 = new class110[var26];
            for (int var27 = 0; var27 < this.field8089; var27++) {
                arg5.field8047[var27] = this.field8047[var27].method813(24695);
            }
        } else {
            arg5.field8047 = arg0.field8047;
            for (int var25 = 0; var25 < this.field8089; var25++) {
                arg5.field8047[var25].method811(this.field8047[var25], 91);
            }
        }
        arg5.field8112 = this.field8112;
        arg5.field8073 = this.field8073;
        arg5.field8004 = this.field8004;
        arg5.field8071 = this.field8071;
        arg5.field8058 = this.field8058;
        arg5.field8120 = this.field8120;
        arg5.field8098 = this.field8098;
        arg5.field8103 = this.field8103;
        arg5.field8040 = this.field8040;
        arg5.field8090 = this.field8090;
        arg5.field8028 = this.field8028;
        arg5.field7999 = this.field7999;
        arg5.field8095 = this.field8095;
        arg5.field8069 = this.field8069;
        if (this.field8094) {
            arg5.field8094 = true;
            arg5.field8114 = this.field8114;
            arg5.field8038 = this.field8038;
            arg5.field8093 = this.field8093;
            arg5.field7993 = this.field7993;
            arg5.field8107 = this.field8107;
            arg5.field8017 = this.field8017;
            arg5.field7995 = this.field7995;
            arg5.field8022 = this.field8022;
        } else {
            arg5.field8094 = false;
        }
        arg5.field8016 = this.field8016;
        return arg5;
    }

    @OriginalMember(owner = "client!lj", name = "EA", descriptor = "()I")
    public final int method148() {
        field8012++;
        if (!this.field8094) {
            this.method3308(-118);
        }
        return this.field8038;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)Z")
    private final boolean method3305(int arg0) {
        field8054++;
        boolean var2 = !this.field8059.field5137;
        boolean var3 = (this.field8083 & 0x37) != 0 && !this.field8030.field5137;
        boolean var4 = !this.field8113.field5137;
        boolean var5 = !this.field8078.field5137;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (arg0 <= 106) {
            return false;
        }
        if (var4) {
            if (this.field8113.field5135 == null) {
                this.field8113.field5135 = this.field8066.method904(41, this.field8119);
            }
            class633 var7 = this.field8113.field5135;
            var7.method2603(12, -30987, this.field8088 * 12);
            Buffer var8 = var7.method2599(-4448, true);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field8066.field1570.copyPositions(this.field8000, this.field8007, this.field8006, this.field8028, 0, 12, this.field8088, var8.getAddress());
                if (var7.method2601(-13472)) {
                    this.field8113.field5145 = var7;
                    this.field8113.field5137 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field8059.field5135 == null) {
                this.field8059.field5135 = this.field8066.method904(53, this.field8119);
            }
            class633 var9 = this.field8059.field5135;
            var9.method2603(4, -30987, this.field8088 * 4);
            Buffer var10 = var9.method2599(-4448, true);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field8083 & 0x37) == 0) {
                    short[] var11;
                    byte[] var12;
                    short[] var13;
                    short[] var14;
                    if (this.field8033 == null) {
                        var14 = this.field8087;
                        var13 = this.field8055;
                        var11 = this.field8026;
                        var12 = this.field8027;
                    } else {
                        var11 = this.field8033.field4497;
                        var12 = this.field8033.field4496;
                        var13 = this.field8033.field4499;
                        var14 = this.field8033.field4495;
                    }
                    this.field8066.field1570.copyLighting(this.field8081, this.field8070, this.field8102, var14, var11, var13, var12, this.field8122, this.field8014, this.field8073, 0, 4, this.field8088, var10.getAddress());
                } else {
                    this.field8066.field1570.copyColours(this.field8081, this.field8070, this.field8102, this.field8122, this.field8073, 0, 4, this.field8088, var10.getAddress());
                }
                if (var9.method2601(-13472)) {
                    this.field8059.field5137 = true;
                    this.field8059.field5145 = var9;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field8030.field5135 == null) {
                this.field8030.field5135 = this.field8066.method904(44, this.field8119);
            }
            class633 var15 = this.field8030.field5135;
            var15.method2603(12, -30987, this.field8088 * 12);
            Buffer var16 = var15.method2599(-4448, true);
            if (var16 == null) {
                var6 = false;
            } else {
                short[] var17;
                byte[] var18;
                short[] var19;
                short[] var20;
                if (this.field8033 == null) {
                    var17 = this.field8055;
                    var18 = this.field8027;
                    var19 = this.field8087;
                    var20 = this.field8026;
                } else {
                    var20 = this.field8033.field4497;
                    var19 = this.field8033.field4495;
                    var17 = this.field8033.field4499;
                    var18 = this.field8033.field4496;
                }
                this.field8066.field1570.copyNormals(var19, var20, var17, var18, 3.0F / (float) this.field8014, 3.0F / (float) (this.field8014 + (this.field8014 / 2)), 0, 12, this.field8088, var16.getAddress());
                if (var15.method2601(-13472)) {
                    this.field8030.field5145 = var15;
                    this.field8030.field5137 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field8078.field5135 == null) {
                this.field8078.field5135 = this.field8066.method904(62, this.field8119);
            }
            class633 var21 = this.field8078.field5135;
            var21.method2603(8, -30987, this.field8088 * 8);
            Buffer var22 = var21.method2599(-4448, true);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field8066.field1570.copyTexCoords(this.field8106, this.field8101, 0, 8, this.field8088, var22.getAddress());
                if (var21.method2601(-13472)) {
                    this.field8078.field5145 = var21;
                    this.field8078.field5137 = true;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lj", name = "WA", descriptor = "()I")
    public final int method213() {
        field8045++;
        return this.field8122;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "()V")
    public final void method187() {
        field8021++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method144(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8108++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = 0;
            class125.field2072 = 0;
            class760.field10564 = 0;
            class122.field1970 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field8098.length > var14) {
                    int[] var15 = this.field8098[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class125.field2072 += this.field8000[var17];
                        class122.field1970 += this.field8007[var17];
                        var12++;
                        class760.field10564 += this.field8006[var17];
                    }
                }
            }
            if (var12 > 0) {
                class122.field1970 = class122.field1970 / var12 + var10;
                class125.field2072 = class125.field2072 / var12 + var9;
                class760.field10564 = class760.field10564 / var12 + var11;
            } else {
                class125.field2072 = var9;
                class760.field10564 = var11;
                class122.field1970 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg3 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field8098.length) {
                    int[] var23 = this.field8098[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field8000[var25] += var20;
                        this.field8007[var25] += var19;
                        this.field8006[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field8098.length > var45) {
                    int[] var46 = this.field8098[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field8000[var48] -= class125.field2072;
                            this.field8007[var48] -= class122.field1970;
                            this.field8006[var48] -= class760.field10564;
                            if (arg4 != 0) {
                                int var49 = class451.field6174[arg4];
                                int var50 = class451.field6177[arg4];
                                int var51 = this.field8007[var48] * var49 + (this.field8000[var48] * var50) + 16383 >> 14;
                                this.field8007[var48] = this.field8007[var48] * var50 + 16383 - (this.field8000[var48] * var49) >> 14;
                                this.field8000[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class451.field6174[arg2];
                                int var53 = class451.field6177[arg2];
                                int var54 = this.field8007[var48] * var53 + 16383 - (this.field8006[var48] * var52) >> 14;
                                this.field8006[var48] = this.field8007[var48] * var52 + this.field8006[var48] * var53 + 16383 >> 14;
                                this.field8007[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class451.field6174[arg3];
                                int var56 = class451.field6177[arg3];
                                int var57 = this.field8000[var48] * var56 + this.field8006[var48] * var55 + 16383 >> 14;
                                this.field8006[var48] = this.field8006[var48] * var56 + 16383 - (this.field8000[var48] * var55) >> 14;
                                this.field8000[var48] = var57;
                            }
                            this.field8000[var48] += class125.field2072;
                            this.field8007[var48] += class122.field1970;
                            this.field8006[var48] += class760.field10564;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field8000[var59] -= class125.field2072;
                            this.field8007[var59] -= class122.field1970;
                            this.field8006[var59] -= class760.field10564;
                            if (arg2 != 0) {
                                int var60 = class451.field6174[arg2];
                                int var61 = class451.field6177[arg2];
                                int var62 = this.field8007[var59] * var61 + 16383 - (this.field8006[var59] * var60) >> 14;
                                this.field8006[var59] = this.field8007[var59] * var60 + this.field8006[var59] * var61 + 16383 >> 14;
                                this.field8007[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class451.field6174[arg4];
                                int var64 = class451.field6177[arg4];
                                int var65 = this.field8007[var59] * var63 + this.field8000[var59] * var64 + 16383 >> 14;
                                this.field8007[var59] = this.field8007[var59] * var64 + 16383 - (this.field8000[var59] * var63) >> 14;
                                this.field8000[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class451.field6174[arg3];
                                int var67 = class451.field6177[arg3];
                                int var68 = this.field8006[var59] * var66 + (this.field8000[var59] * var67) + 16383 >> 14;
                                this.field8006[var59] = this.field8006[var59] * var67 + 16383 - (this.field8000[var59] * var66) >> 14;
                                this.field8000[var59] = var68;
                            }
                            this.field8000[var59] += class125.field2072;
                            this.field8007[var59] += class122.field1970;
                            this.field8006[var59] += class760.field10564;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field8098.length > var28) {
                        int[] var29 = this.field8098[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field7999[var31];
                            int var33 = this.field7999[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field8120[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class451.field6174[arg4];
                                    int var37 = class451.field6177[arg4];
                                    int var38 = this.field8087[var35] * var37 + this.field8026[var35] * var36 + 16383 >> 14;
                                    this.field8026[var35] = (short) (this.field8026[var35] * var37 + 16383 - (this.field8087[var35] * var36) >> 14);
                                    this.field8087[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class451.field6174[arg2];
                                    int var40 = class451.field6177[arg2];
                                    int var41 = this.field8026[var35] * var40 + 16383 - (this.field8055[var35] * var39) >> 14;
                                    this.field8055[var35] = (short) (this.field8055[var35] * var40 + this.field8026[var35] * var39 + 16383 >> 14);
                                    this.field8026[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class451.field6174[arg3];
                                    int var43 = class451.field6177[arg3];
                                    int var44 = this.field8055[var35] * var42 + (this.field8087[var35] * var43) + 16383 >> 14;
                                    this.field8055[var35] = (short) (this.field8055[var35] * var43 + 16383 - (this.field8087[var35] * var42) >> 14);
                                    this.field8087[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method3301(0);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field8098.length) {
                    int[] var71 = this.field8098[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field8000[var73] -= class125.field2072;
                        this.field8007[var73] -= class122.field1970;
                        this.field8006[var73] -= class760.field10564;
                        this.field8000[var73] = this.field8000[var73] * arg2 >> 7;
                        this.field8007[var73] = this.field8007[var73] * arg3 >> 7;
                        this.field8006[var73] = this.field8006[var73] * arg4 >> 7;
                        this.field8000[var73] += class125.field2072;
                        this.field8007[var73] += class122.field1970;
                        this.field8006[var73] += class760.field10564;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8090 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (this.field8090.length > var79) {
                        int[] var80 = this.field8090[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field8070[var82] & 0xFF) + arg2 * 8;
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field8070[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field8016 != null) {
                        for (int var76 = 0; var76 < this.field8089; var76++) {
                            class238 var77 = this.field8016[var76];
                            class110 var78 = this.field8047[var76];
                            var78.field1525 = var78.field1525 & 0xFFFFFF | 255 - (this.field8070[var77.field3362] & 0xFF) << 24;
                        }
                    }
                    this.method3302(-5565);
                }
            }
        } else if (arg0 == 7) {
            if (this.field8090 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (this.field8090.length > var89) {
                        int[] var90 = this.field8090[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field8081[var92] & 0xFFFF;
                            int var94 = var93 >> 10 & 0x3F;
                            int var95 = var93 >> 7 & 0x7;
                            int var96 = arg3 / 4 + var95;
                            int var97 = var93 & 0x7F;
                            int var98 = var94 + arg2 & 0x3F;
                            int var99 = arg4 + var97;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field8081[var92] = (short) class446.method2556(class446.method2556(var98 << 10, var96 << 7), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field8016 != null) {
                        for (int var86 = 0; var86 < this.field8089; var86++) {
                            class238 var87 = this.field8016[var86];
                            class110 var88 = this.field8047[var86];
                            var88.field1525 = class169.field2606[this.field8081[var87.field3362] & 0xFFFF] & 0xFFFFFF | var88.field1525 & 0xFF000000;
                        }
                    }
                    this.method3302(-5565);
                }
            }
        } else if (arg0 == 8) {
            if (this.field8095 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (this.field8095.length > var101) {
                        int[] var102 = this.field8095[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class110 var104 = this.field8047[var102[var103]];
                            var104.field1519 += arg3;
                            var104.field1524 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8095 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (this.field8095.length > var106) {
                        int[] var107 = this.field8095[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class110 var109 = this.field8047[var107[var108]];
                            var109.field1520 = var109.field1520 * arg3 >> 7;
                            var109.field1521 = var109.field1521 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8095 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (this.field8095.length > var111) {
                    int[] var112 = this.field8095[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class110 var114 = this.field8047[var112[var113]];
                        var114.field1522 = var114.field1522 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIZIILofa;I)Z")
    private final boolean method3306(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class333 arg5, int arg6) {
        field8023++;
        class615 var8 = (class615) arg5;
        class615 var9 = this.field8066.field1719;
        float var10 = var8.field8177 * var9.field8197 + var8.field8204 * var9.field8182 + var8.field8186 * var9.field8221 + var9.field8204;
        float var11 = var8.field8177 * var9.field8195 + var8.field8204 * var9.field8184 + var8.field8186 * var9.field8208 + var9.field8186;
        class423.field5823 = var8.field8225 * var9.field8195 + var8.field8197 * var9.field8184 + var8.field8195 * var9.field8208;
        class404.field5631 = var8.field8215 * var9.field8225 + var8.field8221 * var9.field8199 + var8.field8208 * var9.field8215;
        class736.field10182 = var8.field8225 * var9.field8225 + var8.field8197 * var9.field8199 + var8.field8195 * var9.field8215;
        class621.field8280 = var8.field8199 * var9.field8197 + var8.field8184 * var9.field8221 + var8.field8182 * var9.field8182;
        class668.field9123 = var8.field8225 * var9.field8197 + var8.field8197 * var9.field8182 + var8.field8195 * var9.field8221;
        class543.field7192 = var8.field8199 * var9.field8195 + var8.field8184 * var9.field8208 + var8.field8182 * var9.field8184;
        class439.field6069 = var8.field8199 * var9.field8225 + var8.field8184 * var9.field8215 + var8.field8182 * var9.field8199;
        class238.field3365 = var8.field8215 * var9.field8197 + var8.field8221 * var9.field8182 + var8.field8208 * var9.field8221;
        float var12 = var8.field8177 * var9.field8225 + var8.field8204 * var9.field8199 + var8.field8186 * var9.field8215 + var9.field8177;
        class573.field7530 = var8.field8215 * var9.field8195 + var8.field8221 * var9.field8184 + var8.field8208 * var9.field8208;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field8066.field1768;
        int var19 = this.field8066.field1815;
        if (!this.field8094) {
            this.method3308(74);
        }
        int var20 = this.field8107 - this.field8114 >> 1;
        int var21 = this.field8038 - this.field8093 >> 1;
        int var22 = this.field8022 - this.field7995 >> 1;
        if (!arg0) {
            this.field8004 = null;
        }
        int var23 = this.field8114 + var20;
        int var24 = this.field8093 + var21;
        int var25 = this.field7995 + var22;
        int var26 = var23 - (var20 << arg3);
        int var27 = var24 - (var21 << arg3);
        int var28 = var25 - (var22 << arg3);
        int var29 = var23 + (var20 << arg3);
        int var30 = var24 + (var21 << arg3);
        int var31 = (var22 << arg3) + var25;
        class499.field6717[0] = var26;
        class328.field4692[0] = var27;
        class401.field5595[0] = var28;
        class499.field6717[1] = var29;
        class328.field4692[1] = var27;
        class401.field5595[1] = var28;
        class499.field6717[2] = var26;
        class328.field4692[2] = var30;
        class401.field5595[2] = var28;
        class499.field6717[3] = var29;
        class328.field4692[3] = var30;
        class401.field5595[3] = var28;
        class499.field6717[4] = var26;
        class328.field4692[4] = var27;
        class401.field5595[4] = var31;
        class499.field6717[5] = var29;
        class328.field4692[5] = var27;
        class401.field5595[5] = var31;
        class499.field6717[6] = var26;
        class328.field4692[6] = var30;
        class499.field6717[7] = var29;
        class401.field5595[6] = var31;
        class328.field4692[7] = var30;
        class401.field5595[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var51 = (float) class499.field6717[var32];
            float var52 = (float) class328.field4692[var32];
            float var53 = (float) class401.field5595[var32];
            float var54 = class668.field9123 * var53 + class621.field8280 * var51 + class238.field3365 * var52 + var10;
            float var55 = class423.field5823 * var53 + class573.field7530 * var52 + class543.field7192 * var51 + var11;
            float var56 = class736.field10182 * var53 + class439.field6069 * var51 + class404.field5631 * var52 + var12;
            if (var56 >= (float) this.field8066.field1745) {
                if (arg4 > 0) {
                    var56 = arg4;
                }
                float var57 = (float) var18 * var54 / var56 + (float) this.field8066.field1818;
                if (var57 < var14) {
                    var14 = var57;
                }
                float var58 = (float) var19 * var55 / var56 + (float) this.field8066.field1738;
                if (var57 > var15) {
                    var15 = var57;
                }
                if (var16 > var58) {
                    var16 = var58;
                }
                if (var58 > var17) {
                    var17 = var58;
                }
                var13 = true;
            }
        }
        if (var13 && var14 < (float) arg6 && var15 > (float) arg6 && var16 < (float) arg1 && var17 > (float) arg1) {
            if (arg2) {
                return true;
            }
            if (class566.field7442.length < this.field8088) {
                class7.field152 = new int[this.field8088];
                class566.field7442 = new int[this.field8088];
            }
            for (int var33 = 0; var33 < this.field8052; var33++) {
                float var35 = (float) this.field8000[var33];
                float var36 = (float) this.field8006[var33];
                float var37 = (float) this.field8007[var33];
                float var38 = class736.field10182 * var36 + class439.field6069 * var35 + class404.field5631 * var37 + var12;
                float var39 = class668.field9123 * var36 + class621.field8280 * var35 + class238.field3365 * var37 + var10;
                float var40 = class423.field5823 * var36 + class573.field7530 * var37 + class543.field7192 * var35 + var11;
                if (var38 >= (float) this.field8066.field1745) {
                    if (arg4 > 0) {
                        var38 = arg4;
                    }
                    int var41 = (int) ((float) var18 * var39 / var38 + (float) this.field8066.field1818);
                    int var42 = (int) ((float) var19 * var40 / var38 + (float) this.field8066.field1738);
                    int var43 = this.field7999[var33];
                    int var44 = this.field7999[var33 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field8120[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        class566.field7442[var46] = var41;
                        class7.field152[var46] = var42;
                    }
                } else {
                    int var47 = this.field7999[var33];
                    int var48 = this.field7999[var33 + 1];
                    for (int var49 = var47; var49 < var48; var49++) {
                        int var50 = this.field8120[var49] - 1;
                        if (var50 == -1) {
                            break;
                        }
                        class566.field7442[this.field8120[var49] - 1] = -999999;
                    }
                }
            }
            for (int var34 = 0; var34 < this.field8024; var34++) {
                if (class566.field7442[this.field8072[var34]] != -999999 && class566.field7442[this.field8011[var34]] != -999999 && class566.field7442[this.field8086[var34]] != -999999 && this.method3307(class566.field7442[this.field8086[var34]], class7.field152[this.field8011[var34]], class7.field152[this.field8086[var34]], class7.field152[this.field8072[var34]], class566.field7442[this.field8011[var34]], class566.field7442[this.field8072[var34]], arg1, (byte) -124, arg6)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "LA", descriptor = "(I)V")
    public final void method156(int arg0) {
        this.field8014 = (short) arg0;
        field8035++;
        this.method3318(124);
        this.method3301(0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIBI)Z")
    private final boolean method3307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field8034++;
        if (arg6 < arg3 && arg6 < arg1 && arg6 < arg2) {
            return false;
        }
        if (arg7 > -123) {
            this.field7999 = null;
        }
        if (arg6 > arg3 && arg1 < arg6 && arg6 > arg2) {
            return false;
        } else if (arg8 < arg5 && arg8 < arg4 && arg8 < arg0) {
            return false;
        } else {
            return arg5 >= arg8 || arg4 >= arg8 || arg8 <= arg0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILofa;ZI)Z")
    public final boolean method158(int arg0, int arg1, class333 arg2, boolean arg3, int arg4) {
        field8092++;
        return this.method3306(true, arg1, arg3, arg4, -1, arg2, arg0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public final void method146(int arg0) {
        field8041++;
        int var2 = class451.field6174[arg0];
        int var3 = class451.field6177[arg0];
        for (int var4 = 0; var4 < this.field8052; var4++) {
            int var5 = this.field8006[var4] * var2 + this.field8000[var4] * var3 >> 14;
            this.field8006[var4] = this.field8006[var4] * var3 - (this.field8000[var4] * var2) >> 14;
            this.field8000[var4] = var5;
        }
        this.method3318(3);
        this.field8094 = false;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
    private final void method3308(int arg0) {
        field8111++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        int var10 = 45 / ((arg0 + 68) / 35);
        for (int var11 = 0; var11 < this.field8052; var11++) {
            int var12 = this.field8000[var11];
            int var13 = this.field8007[var11];
            if (var12 < var2) {
                var2 = var12;
            }
            int var14 = this.field8006[var11];
            if (var5 < var12) {
                var5 = var12;
            }
            if (var3 > var13) {
                var3 = var13;
            }
            if (var6 < var13) {
                var6 = var13;
            }
            if (var14 > var7) {
                var7 = var14;
            }
            if (var4 > var14) {
                var4 = var14;
            }
            int var15 = var12 * var12 + (var14 * var14);
            if (var15 > var8) {
                var8 = var15;
            }
            int var16 = var14 * var14 + var12 * var12 + var13 * var13;
            if (var16 > var9) {
                var9 = var16;
            }
        }
        this.field7995 = var4;
        this.field8038 = var6;
        this.field8107 = var5;
        this.field8022 = var7;
        this.field8093 = var3;
        this.field8114 = var2;
        this.field7993 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field8017 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field8094 = true;
    }

    @OriginalMember(owner = "client!lj", name = "wa", descriptor = "()V")
    public final void method178() {
        for (int var1 = 0; var1 < this.field7994; var1++) {
            this.field8000[var1] = this.field8000[var1] + 7 >> 4;
            this.field8007[var1] = this.field8007[var1] + 7 >> 4;
            this.field8006[var1] = this.field8006[var1] + 7 >> 4;
        }
        field8037++;
        this.method3318(-106);
        this.field8094 = false;
    }

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method207(int arg0, int arg1, class282 arg2, class282 arg3, int arg4, int arg5, int arg6) {
        if (!this.field8094) {
            this.method3308(20);
        }
        field8029++;
        int var8 = this.field8114 + arg4;
        int var9 = this.field8107 + arg4;
        int var10 = arg6 + this.field7995;
        int var11 = this.field8022 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3992 <= arg2.field3989 + var9 >> arg2.field3990 || var10 < 0 || arg2.field3989 + var11 >> arg2.field3990 >= arg2.field3996) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3992 <= arg3.field3989 + var9 >> arg3.field3990 || var10 < 0 || arg3.field3996 <= var11 + arg3.field3989 >> arg3.field3990) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3990;
            int var13 = arg2.field3989 + var9 - 1 >> arg2.field3990;
            int var14 = var10 >> arg2.field3990;
            int var15 = var11 - (1 - arg2.field3989) >> arg2.field3990;
            if (arg5 == arg2.method1742(var12, 119, var14) && arg2.method1742(var13, 120, var14) == arg5 && arg5 == arg2.method1742(var12, 79, var15) && arg2.method1742(var13, 62, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field8052; var32++) {
                this.field8007[var32] = this.field8007[var32] + arg2.method1750((byte) 111, this.field8000[var32] + arg4, this.field8006[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            int var29 = this.field8093;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field8052; var30++) {
                int var31 = (this.field8007[var30] << 16) / var29;
                if (var31 < arg1) {
                    this.field8007[var30] += (arg1 - var31) * (arg2.method1750((byte) 114, this.field8000[var30] + arg4, this.field8006[var30] - -arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = (arg1 >> 8 & 0xFF) * 4;
            int var18 = (arg1 & 0xFF2998) >> 16 << 6;
            int var19 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var16 >> 1) < 0 || (var16 >> 1) + arg4 + arg2.field3989 >= arg2.field3992 << arg2.field3990 || (arg6 - (var17 >> 1)) < 0 || (var17 >> 1) + arg2.field3989 + arg6 >= arg2.field3996 << arg2.field3990) {
                return;
            }
            this.method2678(arg2, var18, arg6, arg4, var16, 0, var19, arg5, var17);
        } else if (arg0 == 4) {
            int var27 = this.field8038 - this.field8093;
            for (int var28 = 0; var28 < this.field8052; var28++) {
                this.field8007[var28] += arg3.method1750((byte) 118, this.field8000[var28] + arg4, this.field8006[var28] + arg6) + var27 - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field8038 - this.field8093;
            for (int var21 = 0; var21 < this.field8052; var21++) {
                int var22 = this.field8000[var21] + arg4;
                int var23 = this.field8006[var21] + arg6;
                int var24 = arg2.method1750((byte) 126, var22, var23);
                int var25 = arg3.method1750((byte) 122, var22, var23);
                int var26 = var24 - arg1 - var25;
                this.field8007[var21] = -arg5 - (-var24 - ((this.field8007[var21] << 8) / var20 * var26 >> 8));
            }
        }
        this.method3318(8);
        this.field8094 = false;
    }

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "(III)V")
    public final void method183(int arg0, int arg1, int arg2) {
        field8082++;
        for (int var4 = 0; var4 < this.field8052; var4++) {
            if (arg0 != 128) {
                this.field8000[var4] = this.field8000[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field8007[var4] = this.field8007[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field8006[var4] = this.field8006[var4] * arg2 >> 7;
            }
        }
        this.method3318(81);
        this.field8094 = false;
    }

    @OriginalMember(owner = "client!lj", name = "HA", descriptor = "()I")
    public final int method217() {
        if (!this.field8094) {
            this.method3308(104);
        }
        field8009++;
        return this.field7995;
    }

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "(I)V")
    public final void method190(int arg0) {
        if (this.field8113 != null) {
            this.field8113.field5138 = class705.method3965(arg0, (byte) -35, this.field8083);
        }
        field7998++;
        if (this.field8078 != null) {
            this.field8078.field5138 = class199.method1343(arg0, 192, this.field8083);
        }
        if (this.field8059 != null) {
            this.field8059.field5138 = class548.method3062(this.field8083, 55, arg0);
        }
        if (this.field8030 != null) {
            this.field8030.field5138 = class224.method1432(this.field8083, arg0, (byte) -123);
        }
        this.field8010 = arg0;
        if (this.field8033 != null && (this.field8010 & 0x10000) == 0) {
            this.field8055 = this.field8033.field4499;
            this.field8026 = this.field8033.field4497;
            this.field8087 = this.field8033.field4495;
            this.field8027 = this.field8033.field4496;
            this.field8033 = null;
        }
        this.field8003 = true;
        this.method3319((byte) 1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILofa;ZII)Z")
    public final boolean method203(int arg0, int arg1, class333 arg2, boolean arg3, int arg4, int arg5) {
        field8056++;
        return this.method3306(true, arg1, arg3, arg4, arg5, arg2, arg0);
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V")
    public static void method3309(int arg0) {
        field8084 = null;
        if (arg0 != 0) {
            method3315((byte) 80);
        }
        field8042 = null;
    }

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "(I)V")
    public final void method185(int arg0) {
        field8031++;
        this.field8122 = (short) arg0;
        this.method3302(-5565);
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V")
    private final void method3310(int arg0) {
        if (arg0 != 12460) {
            this.field8033 = null;
        }
        if (this.field8061 != null) {
            this.field8061.field10174 = false;
        }
        field8019++;
    }

    @OriginalMember(owner = "client!lj", name = "FA", descriptor = "(I)V")
    public final void method143(int arg0) {
        field8074++;
        int var2 = class451.field6174[arg0];
        int var3 = class451.field6177[arg0];
        for (int var4 = 0; var4 < this.field8052; var4++) {
            int var5 = this.field8007[var4] * var3 - (this.field8006[var4] * var2) >> 14;
            this.field8006[var4] = this.field8007[var4] * var2 + this.field8006[var4] * var3 >> 14;
            this.field8007[var4] = var5;
        }
        this.method3318(-85);
        this.field8094 = false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lofa;)V")
    public final void method200(class333 arg0) {
        field7996++;
        class615 var2 = (class615) arg0;
        if (this.field8058 != null) {
            for (int var3 = 0; var3 < this.field8058.length; var3++) {
                class730 var4 = this.field8058[var3];
                class730 var5 = var4;
                if (var4.field10122 != null) {
                    var5 = var4.field10122;
                }
                var5.field10121 = (int) ((float) this.field8006[var4.field10120] * var2.field8197 + (float) this.field8007[var4.field10120] * var2.field8221 + (float) this.field8000[var4.field10120] * var2.field8182 + var2.field8204);
                var5.field10132 = (int) ((float) this.field8006[var4.field10120] * var2.field8195 + (float) this.field8007[var4.field10120] * var2.field8208 + (float) this.field8000[var4.field10120] * var2.field8184 + var2.field8186);
                var5.field10131 = (int) ((float) this.field8006[var4.field10120] * var2.field8225 + (float) this.field8007[var4.field10120] * var2.field8215 + (float) this.field8000[var4.field10120] * var2.field8199 + var2.field8177);
                var5.field10127 = (int) ((float) this.field8006[var4.field10125] * var2.field8197 + (float) this.field8007[var4.field10125] * var2.field8221 + (float) this.field8000[var4.field10125] * var2.field8182 + var2.field8204);
                var5.field10126 = (int) ((float) this.field8006[var4.field10125] * var2.field8195 + (float) this.field8007[var4.field10125] * var2.field8208 + (float) this.field8000[var4.field10125] * var2.field8184 + var2.field8186);
                var5.field10114 = (int) ((float) this.field8006[var4.field10125] * var2.field8225 + (float) this.field8007[var4.field10125] * var2.field8215 + (float) this.field8000[var4.field10125] * var2.field8199 + var2.field8177);
                var5.field10113 = (int) ((float) this.field8006[var4.field10130] * var2.field8197 + (float) this.field8007[var4.field10130] * var2.field8221 + (float) this.field8000[var4.field10130] * var2.field8182 + var2.field8204);
                var5.field10115 = (int) ((float) this.field8006[var4.field10130] * var2.field8195 + (float) this.field8007[var4.field10130] * var2.field8208 + (float) this.field8000[var4.field10130] * var2.field8184 + var2.field8186);
                var5.field10129 = (int) ((float) this.field8006[var4.field10130] * var2.field8225 + (float) this.field8007[var4.field10130] * var2.field8215 + (float) this.field8000[var4.field10130] * var2.field8199 + var2.field8177);
            }
        }
        if (this.field8071 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field8071.length; var6++) {
            class207 var7 = this.field8071[var6];
            class207 var8 = var7;
            if (var7.field3068 != null) {
                var8 = var7.field3068;
            }
            if (var7.field3070 == null) {
                var7.field3070 = var2.method1703();
            } else {
                var7.field3070.method1712(var2);
            }
            var8.field3073 = (int) ((float) this.field8006[var7.field3066] * var2.field8197 + (float) this.field8007[var7.field3066] * var2.field8221 + (float) this.field8000[var7.field3066] * var2.field8182 + var2.field8204);
            var8.field3072 = (int) ((float) this.field8006[var7.field3066] * var2.field8195 + (float) this.field8007[var7.field3066] * var2.field8208 + (float) this.field8000[var7.field3066] * var2.field8184 + var2.field8186);
            var8.field3079 = (int) ((float) this.field8006[var7.field3066] * var2.field8225 + (float) this.field8007[var7.field3066] * var2.field8215 + (float) this.field8000[var7.field3066] * var2.field8199 + var2.field8177);
        }
    }

    @OriginalMember(owner = "client!lj", name = "ia", descriptor = "(SS)V")
    public final void method206(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field8024; var3++) {
            if (this.field8081[var3] == arg0) {
                this.field8081[var3] = arg1;
            }
        }
        field8044++;
        if (this.field8016 != null) {
            for (int var4 = 0; var4 < this.field8089; var4++) {
                class238 var5 = this.field8016[var4];
                class110 var6 = this.field8047[var4];
                var6.field1525 = class169.field2606[this.field8081[var5.field3362] & 0xFFFF] & 0xFFFFFF | var6.field1525 & 0xFF000000;
            }
        }
        this.method3302(-5565);
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)V")
    private final void method3311(int arg0) {
        if (this.field8016 != null) {
            this.field8066.method493(!this.field8091);
            this.field8066.method817(false, -8043);
            this.field8066.method840(1, -104, class362.field5101);
            this.field8066.method845(class362.field5101, (byte) 106, 1);
            for (int var2 = 0; var2 < this.field8089; var2++) {
                class238 var3 = this.field8016[var2];
                class110 var4 = this.field8047[var2];
                if (!var3.field3355 || !this.field8066.method459()) {
                    float var5 = (float) (this.field8000[var3.field3360] + this.field8000[var3.field3350] + this.field8000[var3.field3363]) * 0.3333333F;
                    float var6 = (float) (this.field8007[var3.field3363] + this.field8007[var3.field3360] + this.field8007[var3.field3350]) * 0.3333333F;
                    float var7 = (float) (this.field8006[var3.field3360] + this.field8006[var3.field3350] + this.field8006[var3.field3363]) * 0.3333333F;
                    float var8 = class668.field9123 * var7 + class621.field8280 * var5 + class238.field3365 * var6 + class352.field4952;
                    float var9 = class423.field5823 * var7 + class573.field7530 * var6 + class543.field7192 * var5 + class92.field1117;
                    float var10 = class736.field10182 * var7 + class439.field6069 * var5 + class404.field5631 * var6 + class377.field5251;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9))) * (float) var3.field3354;
                    class615 var12 = this.field8066.method846(-24720);
                    var12.method3355((float) var4.field1519 + var9 - var9 * var11, -(var10 * var11) + var10, (float) var4.field1524 + var8 - var8 * var11, var4.field1522, var3.field3349 * var4.field1520 >> 7, var3.field3353 * var4.field1521 >> 7, 2);
                    var12.method3351(this.field8066.field1720, (byte) -32);
                    this.field8066.method842(83);
                    int var13 = var4.field1525;
                    this.field8066.method856(var3.field3351, 102, false, false);
                    this.field8066.method836(-129, var3.field3359);
                    this.field8066.method870(var13, false);
                    this.field8066.method880(-125);
                }
            }
            this.field8066.method845(class227.field3230, (byte) 106, 1);
            this.field8066.method840(1, -96, class227.field3230);
            this.field8066.method493(true);
        }
        field8076++;
        int var14 = 108 % ((-arg0 - 86) / 39);
    }

    @OriginalMember(owner = "client!lj", name = "VA", descriptor = "(I)V")
    public final void method210(int arg0) {
        field8077++;
        int var2 = class451.field6174[arg0];
        int var3 = class451.field6177[arg0];
        for (int var4 = 0; var4 < this.field8052; var4++) {
            int var5 = this.field8007[var4] * var2 + this.field8000[var4] * var3 >> 14;
            this.field8007[var4] = this.field8007[var4] * var3 - (this.field8000[var4] * var2) >> 14;
            this.field8000[var4] = var5;
        }
        this.method3318(-80);
        this.field8094 = false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lofa;IZ)V")
    public final void method191(class333 arg0, int arg1, boolean arg2) {
        field8080++;
        if (this.field8103 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field8052; var5++) {
            if ((arg1 & this.field8103[var5]) != 0) {
                if (arg2) {
                    arg0.method1723(this.field8000[var5], this.field8007[var5], this.field8006[var5], var4);
                } else {
                    arg0.method1708(this.field8000[var5], this.field8007[var5], this.field8006[var5], var4);
                }
                this.field8000[var5] = var4[0];
                this.field8007[var5] = var4[1];
                this.field8006[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "()I")
    public final int method205() {
        if (!this.field8094) {
            this.method3308(19);
        }
        field8063++;
        return this.field8022;
    }

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "(III)V")
    public final void method188(int arg0, int arg1, int arg2) {
        field8062++;
        for (int var4 = 0; var4 < this.field8052; var4++) {
            if (arg0 != 0) {
                this.field8000[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field8007[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field8006[var4] += arg2;
            }
        }
        this.method3318(91);
        this.field8094 = false;
    }

    @OriginalMember(owner = "client!lj", name = "ba", descriptor = "(Lr;)Lr;")
    public final class184 method154(class184 arg0) {
        field8013++;
        if (this.field8088 == 0) {
            return null;
        }
        if (!this.field8094) {
            this.method3308(-118);
        }
        int var2;
        int var3;
        if (this.field8066.field1782 > 0) {
            var2 = this.field8114 - (this.field8066.field1782 * this.field8038 >> 8) >> this.field8066.field1728;
            var3 = this.field8107 - (this.field8066.field1782 * this.field8093 >> 8) >> this.field8066.field1728;
        } else {
            var2 = this.field8114 - (this.field8066.field1782 * this.field8093 >> 8) >> this.field8066.field1728;
            var3 = this.field8107 - (this.field8066.field1782 * this.field8038 >> 8) >> this.field8066.field1728;
        }
        int var4;
        int var5;
        if (this.field8066.field1748 > 0) {
            var4 = this.field7995 - (this.field8066.field1748 * this.field8038 >> 8) >> this.field8066.field1728;
            var5 = this.field8022 - (this.field8066.field1748 * this.field8093 >> 8) >> this.field8066.field1728;
        } else {
            var4 = this.field7995 - (this.field8066.field1748 * this.field8093 >> 8) >> this.field8066.field1728;
            var5 = this.field8022 - (this.field8066.field1748 * this.field8038 >> 8) >> this.field8066.field1728;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class520 var8 = (class520) arg0;
        class520 var9;
        if (var8 != null && var8.method2883(var7, -127, var6)) {
            var9 = var8;
            var8.method2889(119);
        } else {
            var9 = new class520(this.field8066, var6, var7);
        }
        var9.method2891(var5, var4, -18573, var3, var2);
        this.method3316((byte) 2, var9);
        return var9;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILur;IIFFIJIII)S")
    private final short method3312(int arg0, class538 arg1, int arg2, int arg3, float arg4, float arg5, int arg6, long arg7, int arg8, int arg9, int arg10) {
        field8067++;
        int var13 = this.field7999[arg10];
        int var14 = this.field7999[arg10 + 1];
        int var15 = arg6;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field8120[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class758.field10553[var16] == arg7) {
                return (short) (var17 - 1);
            }
        }
        this.field8120[var15] = (short) (this.field8088 + 1);
        class758.field10553[var15] = arg7;
        this.field8073[this.field8088] = (short) arg2;
        this.field8028[this.field8088] = (short) arg10;
        this.field8087[this.field8088] = (short) arg3;
        this.field8026[this.field8088] = (short) arg9;
        this.field8055[this.field8088] = (short) arg8;
        this.field8027[this.field8088] = (byte) arg0;
        this.field8106[this.field8088] = arg4;
        this.field8101[this.field8088] = arg5;
        return (short) (this.field8088++);
    }

    @OriginalMember(owner = "client!lj", name = "ma", descriptor = "()I")
    public final int method167() {
        if (!this.field8094) {
            this.method3308(95);
        }
        field8121++;
        return this.field8017;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method170(class475 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8036++;
        class608 var6 = (class608) arg0;
        if (this.field8024 == 0 || var6.field8024 == 0) {
            return;
        }
        int var7 = var6.field8052;
        int[] var8 = var6.field8000;
        int[] var9 = var6.field8007;
        int[] var10 = var6.field8006;
        short[] var11 = var6.field8087;
        short[] var12 = var6.field8026;
        short[] var13 = var6.field8055;
        byte[] var14 = var6.field8027;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field8033 == null) {
            var17 = null;
            var16 = null;
            var18 = null;
            var15 = null;
        } else {
            var15 = this.field8033.field4495;
            var16 = this.field8033.field4499;
            var17 = this.field8033.field4496;
            var18 = this.field8033.field4497;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field8033 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field8033.field4499;
            var19 = var6.field8033.field4495;
            var22 = var6.field8033.field4496;
            var20 = var6.field8033.field4497;
        }
        int[] var23 = var6.field7999;
        short[] var24 = var6.field8120;
        if (!var6.field8094) {
            var6.method3308(-127);
        }
        int var25 = var6.field8093;
        int var26 = var6.field8038;
        int var27 = var6.field8114;
        int var28 = var6.field8107;
        int var29 = var6.field7995;
        int var30 = var6.field8022;
        for (int var31 = 0; var31 < this.field8052; var31++) {
            int var32 = this.field8007[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field8000[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field8006[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field7999[var31];
                        int var37 = this.field7999[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field8120[var38] - 1;
                            if (var35 == -1 || this.field8027[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = -1;
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var40; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var15 == null) {
                                            this.field8033 = new class315();
                                            var15 = this.field8033.field4495 = class230.method1461((byte) 64, this.field8087);
                                            var18 = this.field8033.field4497 = class230.method1461((byte) 64, this.field8026);
                                            var16 = this.field8033.field4499 = class230.method1461((byte) 64, this.field8055);
                                            var17 = this.field8033.field4496 = client.method1862((byte) 3, this.field8027);
                                        }
                                        if (var19 == null) {
                                            class315 var44 = var6.field8033 = new class315();
                                            var19 = var44.field4495 = class230.method1461((byte) 64, var11);
                                            var20 = var44.field4497 = class230.method1461((byte) 64, var12);
                                            var21 = var44.field4499 = class230.method1461((byte) 64, var13);
                                            var22 = var44.field4496 = client.method1862((byte) 3, var14);
                                        }
                                        short var45 = this.field8087[var35];
                                        short var46 = this.field8026[var35];
                                        short var47 = this.field8055[var35];
                                        int var48 = var23[var39 + 1];
                                        int var49 = var23[var39];
                                        byte var50 = this.field8027[var35];
                                        for (int var51 = var49; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var50;
                                            }
                                        }
                                        byte var53 = var14[var41];
                                        short var54 = var11[var41];
                                        short var55 = var12[var41];
                                        short var56 = var13[var41];
                                        int var57 = this.field7999[var31];
                                        int var58 = this.field7999[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field8120[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var15[var60] += var54;
                                                var18[var60] += var55;
                                                var16[var60] += var56;
                                                var17[var60] += var53;
                                            }
                                        }
                                        var6.method3301(0);
                                        this.method3301(0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "RA", descriptor = "()I")
    public final int method175() {
        if (!this.field8094) {
            this.method3308(-121);
        }
        field8015++;
        return this.field8107;
    }

    @OriginalMember(owner = "client!lj", name = "da", descriptor = "()I")
    public final int method163() {
        field8053++;
        return this.field8014;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z")
    public static final boolean method3313(int arg0, int arg1) {
        if (arg0 > -25) {
            return false;
        } else {
            field8043++;
            return arg1 == 4 || arg1 == 8 || arg1 == 11;
        }
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "(I)V")
    public final void method194(int arg0) {
        field8117++;
        int var2 = class451.field6174[arg0];
        int var3 = class451.field6177[arg0];
        for (int var4 = 0; var4 < this.field8052; var4++) {
            int var7 = this.field8006[var4] * var2 + this.field8000[var4] * var3 >> 14;
            this.field8006[var4] = this.field8006[var4] * var3 - (this.field8000[var4] * var2) >> 14;
            this.field8000[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field8088; var5++) {
            int var6 = this.field8087[var5] * var3 + this.field8055[var5] * var2 >> 14;
            this.field8055[var5] = (short) (this.field8055[var5] * var3 - (this.field8087[var5] * var2) >> 14);
            this.field8087[var5] = (short) var6;
        }
        this.method3318(-83);
        this.method3301(0);
        this.field8094 = false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lofa;Lvh;II)V")
    public final void method160(class333 arg0, class364 arg1, int arg2, int arg3) {
        field8051++;
        if (this.field8088 == 0) {
            return;
        }
        class615 var5 = this.field8066.field1719;
        class615 var6 = (class615) arg0;
        if (!this.field8094) {
            this.method3308(82);
        }
        class404.field5631 = var5.field8225 * var6.field8215 + var5.field8215 * var6.field8208 + var5.field8199 * var6.field8221;
        class377.field5251 = var5.field8225 * var6.field8177 + var5.field8215 * var6.field8186 + var5.field8199 * var6.field8204 + var5.field8177;
        float var7 = (float) this.field8093 * class404.field5631 + class377.field5251;
        float var8 = (float) this.field8038 * class404.field5631 + class377.field5251;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = var8 - (float) this.field7993;
            var10 = (float) this.field7993 + var7;
        } else {
            var9 = (float) (-this.field7993) + var7;
            var10 = (float) this.field7993 + var8;
        }
        if ((this.field8066.field1731 <= var9) || (var10 <= (float) this.field8066.field1745)) {
            return;
        }
        class352.field4952 = var5.field8197 * var6.field8177 + var5.field8221 * var6.field8186 + var5.field8182 * var6.field8204 + var5.field8204;
        class238.field3365 = var5.field8197 * var6.field8215 + var5.field8221 * var6.field8208 + var5.field8182 * var6.field8221;
        float var11 = (float) this.field8093 * class238.field3365 + class352.field4952;
        float var12 = (float) this.field8038 * class238.field3365 + class352.field4952;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) this.field7993 + var11) * (float) this.field8066.field1768;
            var14 = ((float) (-this.field7993) + var12) * (float) this.field8066.field1768;
        } else {
            var13 = ((float) this.field7993 + var12) * (float) this.field8066.field1768;
            var14 = (var11 - (float) this.field7993) * (float) this.field8066.field1768;
        }
        if ((var14 / (float) arg2 >= this.field8066.field1763) || (var13 / (float) arg2 <= this.field8066.field1785)) {
            return;
        }
        class92.field1117 = var5.field8195 * var6.field8177 + var5.field8208 * var6.field8186 + var5.field8184 * var6.field8204 + var5.field8186;
        class573.field7530 = var5.field8195 * var6.field8215 + var5.field8208 * var6.field8208 + var5.field8184 * var6.field8221;
        float var15 = (float) this.field8093 * class573.field7530 + class92.field1117;
        float var16 = (float) this.field8038 * class573.field7530 + class92.field1117;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) (-this.field7993) + var16) * (float) this.field8066.field1815;
            var18 = ((float) this.field7993 + var15) * (float) this.field8066.field1815;
        } else {
            var18 = ((float) this.field7993 + var16) * (float) this.field8066.field1815;
            var17 = ((float) (-this.field7993) + var15) * (float) this.field8066.field1815;
        }
        if ((this.field8066.field1740 <= var17 / (float) arg2) || (this.field8066.field1732 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field8016 != null) {
            class543.field7192 = var5.field8195 * var6.field8199 + var5.field8208 * var6.field8184 + var5.field8184 * var6.field8182;
            class736.field10182 = var5.field8225 * var6.field8225 + var5.field8215 * var6.field8195 + var5.field8199 * var6.field8197;
            class423.field5823 = var5.field8195 * var6.field8225 + var5.field8208 * var6.field8195 + var5.field8184 * var6.field8197;
            class668.field9123 = var5.field8197 * var6.field8225 + var5.field8221 * var6.field8195 + var5.field8182 * var6.field8197;
            class621.field8280 = var5.field8197 * var6.field8199 + var5.field8221 * var6.field8184 + var5.field8182 * var6.field8182;
            class439.field6069 = var5.field8225 * var6.field8199 + var5.field8215 * var6.field8184 + var5.field8199 * var6.field8182;
        }
        if (arg1 != null) {
            int var19 = this.field8114 + this.field8107 >> 1;
            int var20 = this.field8022 + this.field7995 >> 1;
            int var21 = (int) ((float) var20 * class668.field9123 + (float) this.field8093 * class238.field3365 + (float) var19 * class621.field8280 + class352.field4952);
            int var22 = (int) ((float) var20 * class423.field5823 + (float) this.field8093 * class573.field7530 + (float) var19 * class543.field7192 + class92.field1117);
            int var23 = (int) ((float) var20 * class736.field10182 + (float) this.field8093 * class404.field5631 + (float) var19 * class439.field6069 + class377.field5251);
            int var24 = (int) ((float) var20 * class668.field9123 + (float) this.field8038 * class238.field3365 + (float) var19 * class621.field8280 + class352.field4952);
            int var25 = (int) ((float) var20 * class423.field5823 + (float) this.field8038 * class573.field7530 + (float) var19 * class543.field7192 + class92.field1117);
            arg1.field5118 = this.field8066.field1815 * var25 / arg2 + this.field8066.field1738;
            arg1.field5122 = this.field8066.field1768 * var21 / arg2 + this.field8066.field1818;
            arg1.field5120 = this.field8066.field1768 * var24 / arg2 + this.field8066.field1818;
            arg1.field5121 = this.field8066.field1738 + (this.field8066.field1815 * var22 / arg2);
            int var26 = (int) ((float) var20 * class736.field10182 + (float) this.field8038 * class404.field5631 + (float) var19 * class439.field6069 + class377.field5251);
            if (this.field8066.field1745 <= var23 || var26 >= this.field8066.field1745) {
                arg1.field5119 = (this.field7993 + var21) * this.field8066.field1768 / arg2 + this.field8066.field1818 - arg1.field5122;
                arg1.field5117 = true;
            }
        }
        this.field8066.method871((float) arg2, -100);
        this.field8066.method946((byte) -95);
        this.field8066.method839(var6, 127);
        this.method3300(83);
        this.method3311(-128);
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)V")
    public final void method3314(int arg0) {
        if (this.field8113 != null) {
            this.field8113.method2170(true);
        }
        field8046++;
        if (this.field8078 != null) {
            this.field8078.method2170(true);
        }
        if (this.field8059 != null) {
            this.field8059.method2170(true);
        }
        if (this.field8030 != null) {
            this.field8030.method2170(true);
        }
        if (this.field8061 != null) {
            this.field8061.method4111((byte) -109);
        }
        if (arg0 != 13783) {
            this.method3301(-118);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
    public static final void method3315(byte arg0) {
        class622.field8296.field5225 = 1;
        field8115++;
        class663.field8911 = 0;
        class615.field8189 = 0;
        class84.field1014 = 0;
        class604.field7932 = 0;
        class111.field1648 = 0;
        class663.field8825 = 0;
        class539.field7141 = 0;
        class761.field10600 = 0;
        class615.field8185 = 0;
        class227.field3244 = 0;
        class543.field7186 = 0;
        class163.field2446 = 0;
        class86.field1035 = 0;
        class122.field1955 = 0;
        class292.field4166 = 0;
        class292.field4179 = 0;
        class663.field8929 = 0;
        class584.field7644 = 0;
        class109.field1478 = 0;
        class383.field5353 = 0;
        class360.field5076 = 0;
        class318.field4534 = 0;
        class251.field3462 = 0;
        class460.field6283 = 0;
        class111.field1709 = 0;
        class597.field7761 = 0;
        class146.field2317 = 0;
        class21.field366 = 0;
        class663.field8765 = 0;
        class663.field8810 = 0;
        class704.field9767 = 0;
        class4.field112 = 0;
        class516.field6832 = 0;
        class278.field3883 = 0;
        class672.field9195 = 0;
        class636.field8457 = 0;
        class612.field8151 = 0;
        class421.field5790 = 0;
        class601.field7885 = 0;
        class437.field6026 = 0;
        class569.field7490 = 0;
        class616.field8236 = 0;
        class320.field4570 = 0;
        class239.field3368 = 0;
        class310.field4460 = 0;
        class180.field2718 = 0;
        class376.field5227 = 0;
        class691.field9623 = 0;
        client.field4360 = 0;
        class295.field4223 = 0;
        class60.field737 = 0;
        class395.field5499 = 0;
        class615.field8191 = 0;
        class87.field1057 = 0;
        class455.field6211 = 0;
        class628.field8363 = 0;
        class574.field7532 = 0;
        class277.field3854 = 0;
        class164.field2495 = 0;
        class352.field4949 = 0;
        class750.field10442 = 0;
        class336.field4770 = 0;
        class58.field700 = 0;
        class173.field2635 = 0;
        class164.field2485 = 0;
        class324.field4599 = 0;
        class702.field9749 = 0;
        class725.field10090 = 0;
        class742.field10309 = 0;
        class475.field6513 = 0;
        class179.field2704 = 0;
        class663.field8812 = 0;
        class606.field7967 = 0;
        class434.field5972 = 0;
        class122.field2021 = 0;
        class48.field624 = 0;
        field8054 = 0;
        class569.field7482 = 0;
        class430.field5921 = 0;
        class352.field4936 = 0;
        class494.field6667 = 0;
        class59.field723 = 0;
        class15.field212 = 0;
        class251.field3453 = 0;
        class359.field5019 = 0;
        class425.field5848 = 0;
        class709.field9827 = 0;
        class327.field4667 = 0;
        class107.field1451 = 0;
        class718.field9963 = 0;
        class557.field7346 = 0;
        class184.field2784 = 0;
        class202.field3026 = 0;
        class663.field8841 = 0;
        class713.field9855 = 0;
        class726.field10092 = 0;
        class551.field7268 = 0;
        class60.field734 = 0;
        class435.field5993 = 0;
        class718.field9923 = 0;
        class399.field5571 = 0;
        class677.field9439 = 0;
        class334.field4745 = 0;
        class663.field8805 = 0;
        class13.field197 = 0;
        class155.field2366 = 0;
        class60.field745 = 0;
        class109.field1508 = 0;
        class640.field8479 = 0;
        class5.field121 = 0;
        class559.field7354 = 0;
        class497.field6695 = 0;
        class107.field1461 = 0;
        field8013 = 0;
        class148.field2327 = 0;
        class610.field8137 = 0;
        class539.field7140 = 0;
        class730.field10117 = 0;
        class325.field4627 = 0;
        class756.field10522 = 0;
        class714.field9858 = 0;
        class474.field6504 = 0;
        class698.field9707 = 0;
        class253.field3486 = 0;
        class708.field9805 = 0;
        class634.field8440 = 0;
        class330.field4710 = 0;
        class663.field8847 = 0;
        class70.field853 = 0;
        class98.field1233 = 0;
        class252.field3469 = 0;
        class29.field468 = 0;
        class129.field2124 = 0;
        class436.field6015 = 0;
        class103.field1429 = 0;
        class111.field1684 = 0;
        class100.field1289 = 0;
        class241.field3390 = 0;
        class230.field3270 = 0;
        class48.field627 = 0;
        class318.field4532 = 0;
        class583.field7639 = 0;
        class123.field2058 = 0;
        class599.field7867 = 0;
        class474.field6501 = 0;
        class76.field920 = 0;
        class749.field10413 = 0;
        class284.field4019 = 0;
        field8105 = 0;
        class663.field8817 = 0;
        class599.field7864 = 0;
        class267.field3709 = 0;
        class371.field5168 = 0;
        class548.field7245 = 0;
        class359.field5006 = 0;
        class224.field3184 = 0;
        class585.field7651 = 0;
        class732.field10142 = 0;
        class649.field8630 = 0;
        class594.field7708 = 0;
        class552.field7276 = 0;
        class282.field3993 = 0;
        class663.field8791 = 0;
        class615.field8178 = 0;
        class462.field6334 = 0;
        class535.field7049 = 0;
        class400.field5579 = 0;
        class430.field5932 = 0;
        class462.field6344 = 0;
        class631.field8403 = 0;
        class59.field722 = 0;
        class349.field4913 = 0;
        class262.field3659 = 0;
        class704.field9756 = 0;
        class603.field7919 = 0;
        class459.field6269 = 0;
        class117.field1891 = 0;
        class310.field4457 = 0;
        class573.field7521 = 0;
        class640.field8489 = 0;
        class535.field7051 = 0;
        class539.field7139 = 0;
        class706.field9780 = 0;
        class318.field4536 = 0;
        class225.field3200 = 0;
        class400.field5583 = 0;
        class628.field8372 = 0;
        class179.field2713 = 0;
        class277.field3857 = 0;
        class569.field7477 = 0;
        class48.field616 = 0;
        class476.field6525 = 0;
        class596.field7750 = 0;
        class654.field8658 = 0;
        class102.field1418 = 0;
        class294.field4213 = 0;
        class295.field4219 = 0;
        class663.field8782 = 0;
        class259.field3618 = 0;
        class743.field10324 = 0;
        class262.field3649 = 0;
        class556.field7307 = 0;
        class111.field1674 = 0;
        class320.field4561 = 0;
        class663.field8860 = 0;
        class663.field8871 = 0;
        class141.field2252 = 0;
        class122.field1942 = 0;
        class471.field6443 = 0;
        class390.field5448 = 0;
        class136.field2173 = 0;
        class111.field1636 = 0;
        class543.field7187 = 0;
        class227.field3248 = 0;
        class456.field6238 = 0;
        class286.field4044 = 0;
        class10.field167 = 0;
        class378.field5270 = 0;
        class663.field8857 = 0;
        class111.field1686 = 0;
        class111.field1543 = 0;
        class416.field5740 = 0;
        class320.field4566 = 0;
        class18.field234 = 0;
        class3.field36 = 0;
        class431.field5941 = 0;
        class109.field1464 = 0;
        client.field4365 = 0;
        class235.field3313 = 0;
        class677.field9404 = 0;
        class690.field9611 = 0;
        class432.field5947 = 0;
        class111.field1591 = 0;
        class670.field9133 = 0;
        class166.field2540 = 0;
        class461.field6313 = 0;
        class718.field9969 = 0;
        class111.field1616 = 0;
        class135.field2161 = 0;
        class552.field7273 = 0;
        class178.field2678 = 0;
        class663.field8907 = 0;
        class656.field8676 = 0;
        class75.field912 = 0;
        class737.field10197 = 0;
        class390.field5455 = 0;
        class183.field2774 = 0;
        class462.field6340 = 0;
        class723.field10071 = 0;
        class679.field9476 = 0;
        field8109 = 0;
        class752.field10484 = 0;
        class116.field1882 = 0;
        class359.field5041 = 0;
        class663.field8747 = 0;
        class721.field10033 = 0;
        class505.field6758 = 0;
        class353.field4957 = 0;
        field8074 = 0;
        class303.field4297 = 0;
        class663.field8908 = 0;
        class642.field8548 = 0;
        class677.field9405 = 0;
        class367.field5141 = 0;
        class122.field1943 = 0;
        class421.field5793 = 0;
        class314.field4481 = 0;
        class658.field8696 = 0;
        class628.field8350 = 0;
        class472.field6464 = 0;
        class663.field8843 = 0;
        class502.field6743 = 0;
        class353.field4979 = 0;
        class677.field9407 = 0;
        class597.field7794 = 0;
        class276.field3837 = 0;
        class111.field1547 = 0;
        class163.field2453 = 0;
        class284.field4004 = 0;
        field7998 = 0;
        class296.field4233 = 0;
        class444.field6110 = 0;
        class556.field7321 = 0;
        class509.field6782 = 0;
        class261.field3639 = 0;
        class305.field4378 = 0;
        class111.field1625 = 0;
        class129.field2121 = 0;
        class75.field917 = 0;
        class185.field2786 = 0;
        class359.field5032 = 0;
        class718.field9937 = 0;
        class111.field1610 = 0;
        class663.field8940 = 0;
        class431.field5938 = 0;
        class749.field10407 = 0;
        class3.field53 = 0;
        class614.field8171 = 0;
        class443.field6102 = 0;
        class528.field7006 = 0;
        class161.field2432 = 0;
        class155.field2374 = 0;
        class77.field939 = 0;
        class63.field773 = 0;
        class60.field742 = 0;
        class7.field146 = 0;
        class729.field10109 = 0;
        class194.field2923 = 0;
        class274.field3817 = 0;
        class278.field3886 = 0;
        class65.field797 = 0;
        class554.field7290 = 0;
        class749.field10409 = 0;
        class506.field6760 = 0;
        class100.field1306 = 0;
        class648.field8609 = 0;
        client.field4372 = 0;
        field8116 = 0;
        class137.field2177 = 0;
        class330.field4715 = 0;
        class60.field727 = 0;
        class485.field6626 = 0;
        class663.field8855 = 0;
        class59.field724 = 0;
        class603.field7920 = 0;
        class547.field7228 = 0;
        class359.field5013 = 0;
        class91.field1103 = 0;
        class711.field9842 = 0;
        class59.field725 = 0;
        class428.field5897 = 0;
        class217.field3137 = 0;
        class376.field5218 = 0;
        class122.field1989 = 0;
        class718.field9941 = 0;
        class383.field5358 = 0;
        class353.field4971 = 0;
        class603.field7916 = 0;
        class111.field1603 = 0;
        class663.field8892 = 0;
        class59.field719 = 0;
        class509.field6783 = 0;
        class593.field7704 = 0;
        class337.field4773 = 0;
        class646.field8582 = 0;
        class644.field8563 = 0;
        class177.field2675 = 0;
        class94.field1145 = 0;
        class200.field3009 = 0;
        class303.field4296 = 0;
        class274.field3808 = 0;
        class708.field9793 = 0;
        class383.field5363 = 0;
        field8092 = 0;
        class111.field1558 = 0;
        class230.field3285 = 0;
        class663.field8800 = 0;
        class725.field10088 = 0;
        class475.field6512 = 0;
        class111.field1704 = 0;
        class122.field1967 = 0;
        class111.field1669 = 0;
        class735.field10167 = 0;
        class496.field6685 = 0;
        class389.field5436 = 0;
        class573.field7513 = 0;
        class672.field9309 = 0;
        class615.field8194 = 0;
        class568.field7467 = 0;
        class353.field4978 = 0;
        class262.field3647 = 0;
        class291.field4160 = 0;
        class109.field1482 = 0;
        class66.field817 = 0;
        class749.field10411 = 0;
        class341.field4810 = 0;
        class200.field3003 = 0;
        class334.field4752 = 0;
        class71.field865 = 0;
        class597.field7778 = 0;
        class6.field137 = 0;
        class28.field437 = 0;
        class111.field1654 = 0;
        class287.field4060 = 0;
        class662.field8732 = 0;
        class217.field3142 = 0;
        class300.field4270 = 0;
        class599.field7850 = 0;
        class409.field5680 = 0;
        class212.field3112 = 0;
        class237.field3328 = 0;
        class439.field6061 = 0;
        class207.field3075 = 0;
        class92.field1108 = 0;
        class316.field4510 = 0;
        class456.field6223 = 0;
        class59.field713 = 0;
        class110.field1523 = 0;
        class677.field9416 = 0;
        class643.field8559 = 0;
        class553.field7285 = 0;
        class304.field4331 = 0;
        class153.field2343 = 0;
        class189.field2842 = 0;
        class622.field8294 = 0;
        class122.field1945 = 0;
        class171.field2623 = 0;
        class320.field4558 = 0;
        class648.field8601 = 0;
        class101.field1385 = 0;
        class84.field1010 = 0;
        class663.field8899 = 0;
        class663.field8829 = 0;
        class70.field847 = 0;
        class762.field10611 = 0;
        class428.field5900 = 0;
        class471.field6450 = 0;
        class677.field9402 = 0;
        class80.field963 = 0;
        class557.field7341 = 0;
        class663.field8856 = 0;
        class416.field5738 = 0;
        class262.field3669 = 0;
        class718.field9962 = 0;
        class567.field7456 = 0;
        class75.field910 = 0;
        class95.field1166 = 0;
        class438.field6028 = 0;
        class756.field10515 = 0;
        class252.field3467 = 0;
        class283.field3998 = 0;
        class24.field404 = 0;
        class389.field5417 = 0;
        client.field4363 = 0;
        class377.field5253 = 0;
        class512.field6797 = 0;
        class109.field1501 = 0;
        class59.field718 = 0;
        class148.field2329 = 0;
        class545.field7212 = 0;
        client.field4369 = 0;
        class505.field6756 = 0;
        class477.field6546 = 0;
        class123.field2065 = 0;
        class122.field1978 = 0;
        class539.field7137 = 0;
        class111.field1707 = 0;
        class636.field8459 = 0;
        class163.field2447 = 0;
        field8099 = 0;
        class287.field4062 = 0;
        class48.field609 = 0;
        class547.field7226 = 0;
        class51.field646 = 0;
        class640.field8497 = 0;
        class407.field5655 = 0;
        class615.field8210 = 0;
        class282.field3986 = 0;
        class475.field6506 = 0;
        class480.field6575 = 0;
        class235.field3311 = 0;
        class708.field9821 = 0;
        class122.field2007 = 0;
        class89.field1084 = 0;
        class328.field4685 = 0;
        class687.field9574 = 0;
        class337.field4774 = 0;
        class183.field2761 = 0;
        class164.field2486 = 0;
        class471.field6442 = 0;
        class336.field4765 = 0;
        class232.field3298 = 0;
        class204.field3051 = 0;
        class440.field6073 = 0;
        class500.field6726 = 0;
        field8037 = 0;
        class304.field4306 = 0;
        class326.field4661 = 0;
        class376.field5210 = 0;
        class120.field1920 = 0;
        class663.field8794 = 0;
        class27.field432 = 0;
        class559.field7356 = 0;
        class122.field1964 = 0;
        class153.field2353 = 0;
        class122.field1954 = 0;
        class339.field4786 = 0;
        class3.field89 = 0;
        class679.field9493 = 0;
        class143.field2279 = 0;
        class609.field8132 = 0;
        class718.field9971 = 0;
        class395.field5500 = 0;
        class663.field8809 = 0;
        class540.field7157 = 0;
        class208.field3087 = 0;
        class586.field7660 = 0;
        class251.field3463 = 0;
        class122.field1980 = 0;
        class721.field10035 = 0;
        class410.field5690 = 0;
        class663.field8844 = 0;
        class331.field4719 = 0;
        class374.field5187 = 0;
        class556.field7312 = 0;
        class718.field9994 = 0;
        class111.field1600 = 0;
        class721.field10040 = 0;
        class92.field1110 = 0;
        class465.field6406 = 0;
        class677.field9446 = 0;
        class238.field3358 = 0;
        class111.field1678 = 0;
        class353.field4972 = 0;
        class671.field9156 = 0;
        class122.field1999 = 0;
        client.field4373 = 0;
        class3.field42 = 0;
        class126.field2083 = 0;
        class251.field3451 = 0;
        class687.field9585 = 0;
        class672.field9273 = 0;
        class742.field10256 = 0;
        class586.field7666 = 0;
        class313.field4471 = 0;
        class122.field1975 = 0;
        class661.field8728 = 0;
        class343.field4817 = 0;
        class178.field2686 = 0;
        class189.field2831 = 0;
        class528.field7002 = 0;
        class111.field1641 = 0;
        class311.field4466 = 0;
        class672.field9172 = 0;
        class658.field8698 = 0;
        class21.field362 = 0;
        class462.field6337 = 0;
        class339.field4790 = 0;
        class708.field9814 = 0;
        class615.field8212 = 0;
        class677.field9451 = 0;
        class557.field7332 = 0;
        class212.field3114 = 0;
        class141.field2243 = 0;
        class111.field1537 = 0;
        class45.field580 = 0;
        class89.field1086 = 0;
        class741.field10212 = 0;
        class465.field6405 = 0;
        class741.field10209 = 0;
        class718.field10001 = 0;
        class351.field4935 = 0;
        class118.field1897 = 0;
        class170.field2610 = 0;
        class101.field1376 = 0;
        class18.field239 = 0;
        class629.field8378 = 0;
        class304.field4317 = 0;
        class464.field6399 = 0;
        class389.field5429 = 0;
        class6.field134 = 0;
        class615.field8202 = 0;
        class3.field65 = 0;
        class735.field10165 = 0;
        class110.field1518 = 0;
        class325.field4648 = 0;
        class111.field1652 = 0;
        class173.field2637 = 0;
        class240.field3384 = 0;
        class430.field5935 = 0;
        class442.field6089 = 0;
        class481.field6587 = 0;
        class189.field2838 = 0;
        class489.field6642 = 0;
        class359.field5029 = 0;
        class328.field4690 = 0;
        class737.field10183 = 0;
        class258.field3528 = 0;
        class672.field9247 = 0;
        class459.field6273 = 0;
        class373.field5183 = 0;
        class289.field4108 = 0;
        class273.field3802 = 0;
        class532.field7029 = 0;
        class291.field4156 = 0;
        class299.field4246 = 0;
        class347.field4855 = 0;
        class111.field1650 = 0;
        class100.field1367 = 0;
        class615.field8196 = 0;
        class284.field4010 = 0;
        class225.field3198 = 0;
        class276.field3847 = 0;
        class462.field6345 = 0;
        class227.field3231 = 0;
        class146.field2316 = 0;
        class77.field929 = 0;
        class490.field6649 = 0;
        class318.field4533 = 0;
        class733.field10146 = 0;
        class677.field9443 = 0;
        class269.field3764 = 0;
        class130.field2131 = 0;
        class612.field8148 = 0;
        class547.field7223 = 0;
        field8025 = 0;
        class122.field1976 = 0;
        class122.field1941 = 0;
        class111.field1614 = 0;
        class762.field10622 = 0;
        class419.field5776 = 0;
        class663.field8769 = 0;
        class427.field5883 = 0;
        class29.field466 = 0;
        class538.field7091 = 0;
        class97.field1207 = 0;
        class95.field1162 = 0;
        class677.field9437 = 0;
        class101.field1387 = 0;
        class284.field4007 = 0;
        class98.field1218 = 0;
        class190.field2872 = 0;
        class281.field3979 = 0;
        class306.field4398 = 0;
        class36.field517 = 0;
        class477.field6554 = 0;
        class4.field118 = 0;
        class276.field3843 = 0;
        class111.field1541 = 0;
        class4.field110 = 0;
        class663.field8742 = 0;
        class683.field9533 = 0;
        class75.field908 = 0;
        class677.field9424 = 0;
        class43.field566 = 0;
        class541.field7163 = 0;
        class367.field5140 = 0;
        class410.field5691 = 0;
        class327.field4664 = 0;
        class682.field9522 = 0;
        class348.field4892 = 0;
        class226.field3221 = 0;
        class182.field2752 = 0;
        class101.field1389 = 0;
        class663.field8802 = 0;
        class709.field9825 = 0;
        class389.field5434 = 0;
        class718.field9886 = 0;
        class672.field9316 = 0;
        class615.field8227 = 0;
        class304.field4323 = 0;
        class236.field3319 = 0;
        class663.field8821 = 0;
        class472.field6461 = 0;
        class26.field425 = 0;
        class717.field9876 = 0;
        class135.field2160 = 0;
        class318.field4539 = 0;
        class694.field9655 = 0;
        class122.field1994 = 0;
        class334.field4738 = 0;
        class763.field10632 = 0;
        class620.field8265 = 0;
        class3.field69 = 0;
        class585.field7653 = 0;
        class348.field4884 = 0;
        class294.field4205 = 0;
        class628.field8367 = 0;
        class663.field8897 = 0;
        class348.field4888 = 0;
        class640.field8494 = 0;
        class628.field8354 = 0;
        class189.field2837 = 0;
        field8031 = 0;
        class111.field1647 = 0;
        class397.field5531 = 0;
        class86.field1033 = 0;
        class90.field1095 = 0;
        class698.field9704 = 0;
        class172.field2627 = 0;
        class303.field4294 = 0;
        class395.field5506 = 0;
        class677.field9429 = 0;
        field8039 = 0;
        class336.field4760 = 0;
        class304.field4308 = 0;
        class362.field5092 = 0;
        class111.field1672 = 0;
        class613.field8159 = 0;
        class430.field5928 = 0;
        class550.field7258 = 0;
        class70.field851 = 0;
        class599.field7876 = 0;
        class430.field5925 = 0;
        class663.field8877 = 0;
        class367.field5136 = 0;
        class123.field2062 = 0;
        class495.field6676 = 0;
        class370.field5160 = 0;
        class749.field10421 = 0;
        class111.field1554 = 0;
        class284.field4020 = 0;
        class573.field7519 = 0;
        class278.field3867 = 0;
        class663.field8753 = 0;
        class111.field1538 = 0;
        class421.field5791 = 0;
        class374.field5188 = 0;
        field7996 = 0;
        class411.field5697 = 0;
        class564.field7397 = 0;
        class511.field6787 = 0;
        class400.field5582 = 0;
        class597.field7833 = 0;
        class615.field8175 = 0;
        class427.field5889 = 0;
        class3.field49 = 0;
        class75.field911 = 0;
        class163.field2448 = 0;
        class338.field4778 = 0;
        class473.field6493 = 0;
        class378.field5264 = 0;
        class536.field7056 = 0;
        class578.field7585 = 0;
        class564.field7406 = 0;
        class742.field10302 = 0;
        class3.field95 = 0;
        class475.field6518 = 0;
        class182.field2745 = 0;
        class100.field1348 = 0;
        class573.field7520 = 0;
        class300.field4259 = 0;
        class359.field5027 = 0;
        class371.field5167 = 0;
        class508.field6779 = 0;
        class455.field6205 = 0;
        class109.field1496 = 0;
        class354.field4988 = 0;
        class428.field5906 = 0;
        class718.field10000 = 0;
        class92.field1111 = 0;
        class166.field2515 = 0;
        class312.field4468 = 0;
        class718.field9977 = 0;
        class663.field8849 = 0;
        class729.field10112 = 0;
        class3.field104 = 0;
        class334.field4741 = 0;
        class438.field6032 = 0;
        class209.field3091 = 0;
        class639.field8472 = 0;
        class663.field8778 = 0;
        class273.field3799 = 0;
        class310.field4456 = 0;
        class564.field7398 = 0;
        class727.field10100 = 0;
        class595.field7721 = 0;
        class373.field5182 = 0;
        class455.field6208 = 0;
        class3.field48 = 0;
        class77.field944 = 0;
        class631.field8402 = 0;
        class28.field443 = 0;
        class65.field791 = 0;
        class122.field1966 = 0;
        field8111 = 0;
        class30.field477 = 0;
        class111.field1590 = 0;
        class127.field2101 = 0;
        class615.field8209 = 0;
        class257.field3519 = 0;
        class110.field1517 = 0;
        class212.field3115 = 0;
        class615.field8205 = 0;
        class104.field1431 = 0;
        class111.field1553 = 0;
        class580.field7605 = 0;
        class535.field7050 = 0;
        class750.field10440 = 0;
        class204.field3052 = 0;
        field8104 = 0;
        class94.field1128 = 0;
        class100.field1325 = 0;
        class122.field2018 = 0;
        class253.field3484 = 0;
        class66.field821 = 0;
        class495.field6679 = 0;
        class663.field8814 = 0;
        class672.field9302 = 0;
        class111.field1542 = 0;
        class389.field5425 = 0;
        class378.field5256 = 0;
        class148.field2331 = 0;
        class369.field5147 = 0;
        class763.field10631 = 0;
        class166.field2561 = 0;
        class71.field856 = 0;
        class265.field3700 = 0;
        class594.field7710 = 0;
        class325.field4647 = 0;
        class383.field5323 = 0;
        class10.field168 = 0;
        class111.field1576 = 0;
        class3.field72 = 0;
        class93.field1123 = 0;
        class228.field3254 = 0;
        class360.field5077 = 0;
        class273.field3805 = 0;
        class91.field1101 = 0;
        class111.field1675 = 0;
        class599.field7855 = 0;
        class610.field8136 = 0;
        class677.field9391 = 0;
        class334.field4750 = 0;
        class111.field1663 = 0;
        class161.field2414 = 0;
        class657.field8689 = 0;
        class189.field2835 = 0;
        class262.field3666 = 0;
        class353.field4956 = 0;
        class111.field1578 = 0;
        class709.field9828 = 0;
        class749.field10416 = 0;
        class120.field1915 = 0;
        class717.field9879 = 0;
        class109.field1485 = 0;
        class668.field9113 = 0;
        class395.field5516 = 0;
        class427.field5888 = 0;
        class348.field4885 = 0;
        class122.field2014 = 0;
        class227.field3247 = 0;
        class635.field8448 = 0;
        class448.field6141 = 0;
        class753.field10493 = 0;
        class615.field8188 = 0;
        class549.field7253 = 0;
        class741.field10217 = 0;
        class135.field2166 = 0;
        class546.field7219 = 0;
        class628.field8366 = 0;
        class109.field1483 = 0;
        class553.field7288 = 0;
        class761.field10598 = 0;
        class251.field3456 = 0;
        class227.field3245 = 0;
        field8110 = 0;
        class111.field1717 = 0;
        class718.field9900 = 0;
        class586.field7659 = 0;
        class556.field7319 = 0;
        class278.field3921 = 0;
        class718.field9946 = 0;
        class415.field5735 = 0;
        class443.field6105 = 0;
        class428.field5902 = 0;
        class343.field4822 = 0;
        class421.field5808 = 0;
        class476.field6527 = 0;
        class139.field2211 = 0;
        class339.field4785 = 0;
        class111.field1692 = 0;
        class325.field4626 = 0;
        class397.field5530 = 0;
        class663.field8850 = 0;
        class541.field7168 = 0;
        class374.field5185 = 0;
        class634.field8443 = 0;
        class668.field9124 = 0;
        class677.field9396 = 0;
        class254.field3495 = 0;
        class94.field1126 = 0;
        class92.field1109 = 0;
        class276.field3842 = 0;
        class516.field6829 = 0;
        class663.field8823 = 0;
        class284.field4025 = 0;
        class564.field7386 = 0;
        field8034 = 0;
        class390.field5464 = 0;
        class460.field6279 = 0;
        class111.field1550 = 0;
        class111.field1624 = 0;
        class148.field2328 = 0;
        class462.field6351 = 0;
        class224.field3175 = 0;
        class615.field8207 = 0;
        class179.field2711 = 0;
        class331.field4718 = 0;
        class663.field8910 = 0;
        class716.field9867 = 0;
        class498.field6708 = 0;
        class742.field10296 = 0;
        class276.field3846 = 0;
        class376.field5212 = 0;
        class122.field2008 = 0;
        class45.field579 = 0;
        class625.field8299 = 0;
        class31.field491 = 0;
        class176.field2653 = 0;
        class3.field88 = 0;
        class724.field10087 = 0;
        field8048 = 0;
        class94.field1127 = 0;
        class7.field149 = 0;
        class718.field9998 = 0;
        class29.field469 = 0;
        class595.field7728 = 0;
        class722.field10062 = 0;
        class5.field133 = 0;
        class92.field1106 = 0;
        class47.field601 = 0;
        class758.field10540 = 0;
        class109.field1500 = 0;
        class599.field7878 = 0;
        field8046 = 0;
        class556.field7320 = 0;
        class75.field913 = 0;
        class251.field3459 = 0;
        class690.field9609 = 0;
        class243.field3398 = 0;
        class718.field9988 = 0;
        class71.field858 = 0;
        class348.field4897 = 0;
        class712.field9850 = 0;
        class628.field8347 = 0;
        class226.field3223 = 0;
        class389.field5433 = 0;
        class566.field7443 = 0;
        class572.field7509 = 0;
        class100.field1356 = 0;
        class288.field4098 = 0;
        class385.field5380 = 0;
        class111.field1593 = 0;
        class100.field1352 = 0;
        class122.field1968 = 0;
        class415.field5736 = 0;
        class303.field4299 = 0;
        class164.field2490 = 0;
        class686.field9565 = 0;
        class382.field5308 = 0;
        class545.field7208 = 0;
        class672.field9270 = 0;
        class327.field4674 = 0;
        class274.field3812 = 0;
        class21.field360 = 0;
        class409.field5679 = 0;
        class94.field1138 = 0;
        class455.field6206 = 0;
        class416.field5749 = 0;
        class471.field6441 = 0;
        class353.field4965 = 0;
        class691.field9618 = 0;
        class543.field7190 = 0;
        class718.field9889 = 0;
        class449.field6145 = 0;
        class332.field4725 = 0;
        class677.field9403 = 0;
        class313.field4473 = 0;
        class656.field8675 = 0;
        class98.field1249 = 0;
        class412.field5720 = 0;
        class677.field9444 = 0;
        class663.field8934 = 0;
        class663.field8893 = 0;
        class232.field3296 = 0;
        class603.field7912 = 0;
        class591.field7697 = 0;
        class389.field5423 = 0;
        class536.field7055 = 0;
        class742.field10277 = 0;
        class663.field8816 = 0;
        class77.field937 = 0;
        class376.field5201 = 0;
        class395.field5522 = 0;
        class708.field9812 = 0;
        class58.field692 = 0;
        class587.field7671 = 0;
        class588.field7679 = 0;
        class586.field7663 = 0;
        class663.field8924 = 0;
        class595.field7722 = 0;
        class185.field2810 = 0;
        class675.field9364 = 0;
        class615.field8217 = 0;
        class538.field7130 = 0;
        class307.field4415 = 0;
        class615.field8193 = 0;
        class752.field10488 = 0;
        class272.field3798 = 0;
        class514.field6815 = 0;
        class739.field10203 = 0;
        class663.field8772 = 0;
        class689.field9587 = 0;
        class309.field4441 = 0;
        class706.field9782 = 0;
        class464.field6383 = 0;
        class723.field10078 = 0;
        class383.field5347 = 0;
        class120.field1918 = 0;
        class749.field10420 = 0;
        class121.field1925 = 0;
        class3.field39 = 0;
        class187.field2827 = 0;
        class402.field5602 = 0;
        class238.field3356 = 0;
        class450.field6172 = 0;
        class111.field1526 = 0;
        class677.field9445 = 0;
        class296.field4231 = 0;
        class492.field6661 = 0;
        field8062 = 0;
        class199.field2992 = 0;
        class3.field78 = 0;
        class531.field7020 = 0;
        class272.field3796 = 0;
        class48.field613 = 0;
        class111.field1683 = 0;
        class125.field2070 = 0;
        class718.field9949 = 0;
        class525.field6966 = 0;
        class111.field1668 = 0;
        class418.field5767 = 0;
        class383.field5321 = 0;
        class615.field8216 = 0;
        class718.field9914 = 0;
        class616.field8237 = 0;
        class294.field4211 = 0;
        class408.field5664 = 0;
        class385.field5382 = 0;
        class502.field6738 = 0;
        class284.field4023 = 0;
        class207.field3067 = 0;
        class496.field6684 = 0;
        class385.field5389 = 0;
        class540.field7155 = 0;
        class677.field9395 = 0;
        class44.field573 = 0;
        class169.field2598 = 0;
        class539.field7134 = 0;
        class59.field709 = 0;
        class130.field2137 = 0;
        class376.field5232 = 0;
        class597.field7788 = 0;
        class718.field9990 = 0;
        class289.field4120 = 0;
        class538.field7123 = 0;
        class592.field7698 = 0;
        class395.field5510 = 0;
        class545.field7210 = 0;
        class111.field1527 = 0;
        class524.field6954 = 0;
        class166.field2558 = 0;
        class292.field4185 = 0;
        class746.field10381 = 0;
        class548.field7238 = 0;
        class490.field6654 = 0;
        class411.field5696 = 0;
        class718.field9903 = 0;
        class288.field4073 = 0;
        class256.field3504 = 0;
        class265.field3692 = 0;
        class111.field1551 = 0;
        class189.field2841 = 0;
        class126.field2086 = 0;
        class718.field9966 = 0;
        class7.field148 = 0;
        class565.field7437 = 0;
        class352.field4938 = 0;
        field8076 = 0;
        class599.field7862 = 0;
        class586.field7667 = 0;
        class718.field9928 = 0;
        class155.field2370 = 0;
        class682.field9529 = 0;
        class470.field6436 = 0;
        class448.field6138 = 0;
        class265.field3693 = 0;
        class443.field6104 = 0;
        class556.field7314 = 0;
        class723.field10068 = 0;
        class532.field7027 = 0;
        class601.field7884 = 0;
        class109.field1476 = 0;
        class675.field9366 = 0;
        class156.field2387 = 0;
        class524.field6948 = 0;
        class111.field1596 = 0;
        class155.field2368 = 0;
        class383.field5352 = 0;
        class622.field8285 = 0;
        class325.field4643 = 0;
        class464.field6379 = 0;
        class392.field5475 = 0;
        class438.field6035 = 0;
        class200.field3006 = 0;
        class166.field2560 = 0;
        class663.field8923 = 0;
        class111.field1533 = 0;
        class564.field7399 = 0;
        class677.field9449 = 0;
        class111.field1659 = 0;
        class232.field3293 = 0;
        class388.field5406 = 0;
        class212.field3109 = 0;
        class598.field7845 = 0;
        class166.field2508 = 0;
        class408.field5661 = 0;
        class712.field9851 = 0;
        class663.field8764 = 0;
        class741.field10210 = 0;
        class286.field4043 = 0;
        class82.field984 = 0;
        class668.field9122 = 0;
        class193.field2908 = 0;
        class677.field9442 = 0;
        class70.field846 = 0;
        class721.field10037 = 0;
        class376.field5202 = 0;
        class71.field861 = 0;
        class574.field7545 = 0;
        class111.field1575 = 0;
        class116.field1885 = 0;
        class556.field7325 = 0;
        class541.field7172 = 0;
        class403.field5622 = 0;
        class708.field9803 = 0;
        class730.field10119 = 0;
        class3.field96 = 0;
        class262.field3671 = 0;
        class176.field2660 = 0;
        class62.field760 = 0;
        class336.field4761 = 0;
        class53.field656 = 0;
        class70.field850 = 0;
        class30.field485 = 0;
        class185.field2790 = 0;
        class428.field5908 = 0;
        class515.field6822 = 0;
        class111.field1640 = 0;
        class111.field1679 = 0;
        class460.field6278 = 0;
        class696.field9688 = 0;
        class189.field2852 = 0;
        class360.field5082 = 0;
        class98.field1251 = 0;
        class742.field10255 = 0;
        class724.field10083 = 0;
        class680.field9500 = 0;
        class477.field6544 = 0;
        class684.field9541 = 0;
        class176.field2651 = 0;
        class464.field6400 = 0;
        class127.field2087 = 0;
        class187.field2828 = 0;
        class399.field5565 = 0;
        class502.field6742 = 0;
        class703.field9753 = 0;
        class323.field4588 = 0;
        class718.field9907 = 0;
        class698.field9710 = 0;
        class236.field3317 = 0;
        class601.field7888 = 0;
        class359.field5008 = 0;
        class749.field10419 = 0;
        class446.field6125 = 0;
        class628.field8357 = 0;
        class298.field4237 = 0;
        class711.field9846 = 0;
        class663.field8838 = 0;
        class121.field1927 = 0;
        class520.field6935 = 0;
        class292.field4189 = 0;
        class179.field2694 = 0;
        class573.field7514 = 0;
        class127.field2093 = 0;
        class382.field5302 = 0;
        class359.field5011 = 0;
        class189.field2833 = 0;
        class435.field5988 = 0;
        class545.field7206 = 0;
        class485.field6623 = 0;
        class438.field6056 = 0;
        class214.field3133 = 0;
        class663.field8887 = 0;
        class536.field7058 = 0;
        class588.field7674 = 0;
        class339.field4796 = 0;
        class225.field3193 = 0;
        class86.field1034 = 0;
        class663.field8827 = 0;
        class541.field7173 = 0;
        class382.field5303 = 0;
        class410.field5693 = 0;
        class401.field5593 = 0;
        class289.field4116 = 0;
        class310.field4453 = 0;
        class513.field6806 = 0;
        class111.field1605 = 0;
        class483.field6601 = 0;
        class353.field4973 = 0;
        class65.field792 = 0;
        class718.field9930 = 0;
        class395.field5497 = 0;
        class609.field8128 = 0;
        class376.field5200 = 0;
        class421.field5803 = 0;
        class750.field10444 = 0;
        client.field4364 = 0;
        class663.field8914 = 0;
        class3.field50 = 0;
        class435.field6005 = 0;
        class411.field5704 = 0;
        class435.field5983 = 0;
        class668.field9120 = 0;
        class559.field7351 = 0;
        class443.field6107 = 0;
        class393.field5488 = 0;
        class289.field4130 = 0;
        class334.field4746 = 0;
        class597.field7805 = 0;
        class109.field1473 = 0;
        class330.field4707 = 0;
        class65.field789 = 0;
        class400.field5578 = 0;
        class272.field3794 = 0;
        class663.field8813 = 0;
        class111.field1567 = 0;
        class316.field4511 = 0;
        class122.field2003 = 0;
        class3.field38 = 0;
        class59.field720 = 0;
        class483.field6604 = 0;
        class96.field1192 = 0;
        class460.field6281 = 0;
        class600.field7879 = 0;
        class519.field6923 = 0;
        class724.field10082 = 0;
        class122.field2025 = 0;
        class684.field9540 = 0;
        class718.field9908 = 0;
        class705.field9778 = 0;
        class80.field975 = 0;
        class33.field500 = 0;
        class601.field7883 = 0;
        class101.field1374 = 0;
        class718.field9996 = 0;
        class111.field1676 = 0;
        class547.field7225 = 0;
        class462.field6357 = 0;
        class455.field6209 = 0;
        class678.field9463 = 0;
        class111.field1697 = 0;
        class541.field7165 = 0;
        class325.field4618 = 0;
        class71.field867 = 0;
        class327.field4668 = 0;
        class360.field5064 = 0;
        class185.field2787 = 0;
        class708.field9815 = 0;
        class24.field401 = 0;
        class407.field5652 = 0;
        class111.field1702 = 0;
        class660.field8715 = 0;
        class390.field5456 = 0;
        class177.field2668 = 0;
        class552.field7272 = 0;
        class20.field345 = 0;
        class750.field10432 = 0;
        class383.field5338 = 0;
        class175.field2648 = 0;
        class536.field7061 = 0;
        class400.field5586 = 0;
        class274.field3821 = 0;
        class645.field8570 = 0;
        class545.field7204 = 0;
        class729.field10111 = 0;
        class369.field5154 = 0;
        class420.field5780 = 0;
        class615.field8200 = 0;
        class63.field771 = 0;
        class520.field6927 = 0;
        class397.field5536 = 0;
        class752.field10487 = 0;
        class477.field6552 = 0;
        class411.field5706 = 0;
        class682.field9528 = 0;
        class179.field2706 = 0;
        class663.field8909 = 0;
        class309.field4440 = 0;
        class761.field10592 = 0;
        class287.field4066 = 0;
        class200.field3002 = 0;
        class671.field9157 = 0;
        class376.field5237 = 0;
        class109.field1497 = 0;
        class143.field2275 = 0;
        class749.field10402 = 0;
        class265.field3690 = 0;
        class615.field8176 = 0;
        class556.field7302 = 0;
        class448.field6139 = 0;
        class677.field9434 = 0;
        class193.field2919 = 0;
        class654.field8659 = 0;
        class610.field8141 = 0;
        class421.field5798 = 0;
        class2.field21 = 0;
        class663.field8751 = 0;
        class348.field4889 = 0;
        class122.field2017 = 0;
        class211.field3098 = 0;
        class531.field7024 = 0;
        class756.field10513 = 0;
        class691.field9619 = 0;
        class438.field6051 = 0;
        field8115 = 0;
        class564.field7407 = 0;
        class82.field987 = 0;
        class663.field8819 = 0;
        class444.field6111 = 0;
        class122.field1957 = 0;
        class538.field7127 = 0;
        class140.field2214 = 0;
        class277.field3861 = 0;
        class359.field5022 = 0;
        class484.field6612 = 0;
        class239.field3369 = 0;
        class540.field7152 = 0;
        class472.field6463 = 0;
        class451.field6176 = 0;
        class139.field2205 = 0;
        class94.field1136 = 0;
        class761.field10579 = 0;
        class265.field3698 = 0;
        class663.field8783 = 0;
        class334.field4740 = 0;
        class422.field5817 = 0;
        class698.field9708 = 0;
        class663.field8818 = 0;
        class663.field8738 = 0;
        class111.field1560 = 0;
        class294.field4207 = 0;
        class501.field6736 = 0;
        class194.field2931 = 0;
        class288.field4072 = 0;
        class289.field4127 = 0;
        class122.field2012 = 0;
        class167.field2582 = 0;
        class303.field4300 = 0;
        class383.field5319 = 0;
        class677.field9425 = 0;
        class182.field2748 = 0;
        class617.field8248 = 0;
        class66.field819 = 0;
        class684.field9557 = 0;
        class374.field5191 = 0;
        class286.field4057 = 0;
        class122.field1951 = 0;
        class663.field8927 = 0;
        class359.field5010 = 0;
        class719.field10002 = 0;
        class347.field4861 = 0;
        class319.field4557 = 0;
        class383.field5351 = 0;
        class202.field3022 = 0;
        class347.field4868 = 0;
        class288.field4104 = 0;
        class663.field8828 = 0;
        class718.field9948 = 0;
        class677.field9457 = 0;
        class110.field1515 = 0;
        class598.field7843 = 0;
        class244.field3414 = 0;
        class537.field7071 = 0;
        class475.field6515 = 0;
        class189.field2844 = 0;
        class615.field8224 = 0;
        class56.field676 = 0;
        class607.field7990 = 0;
        class348.field4886 = 0;
        class677.field9440 = 0;
        class725.field10091 = 0;
        class65.field799 = 0;
        class643.field8557 = 0;
        class447.field6127 = 0;
        class393.field5483 = 0;
        class122.field1962 = 0;
        class595.field7746 = 0;
        class233.field3305 = 0;
        class449.field6167 = 0;
        class355.field4994 = 0;
        class737.field10187 = 0;
        class164.field2484 = 0;
        class390.field5463 = 0;
        class43.field562 = 0;
        class439.field6060 = 0;
        class89.field1090 = 0;
        class300.field4262 = 0;
        class718.field9981 = 0;
        class111.field1597 = 0;
        class412.field5719 = 0;
        class200.field3007 = 0;
        class204.field3056 = 0;
        class677.field9389 = 0;
        class672.field9298 = 0;
        class615.field8198 = 0;
        class573.field7515 = 0;
        class472.field6471 = 0;
        class677.field9398 = 0;
        class528.field6998 = 0;
        class298.field4240 = 0;
        class65.field798 = 0;
        class603.field7913 = 0;
        class574.field7546 = 0;
        class370.field5158 = 0;
        class663.field8831 = 0;
        class60.field738 = 0;
        class383.field5332 = 0;
        class675.field9357 = 0;
        class230.field3284 = 0;
        class471.field6440 = 0;
        class367.field5139 = 0;
        class307.field4423 = 0;
        class298.field4241 = 0;
        class307.field4421 = 0;
        class284.field4018 = 0;
        class179.field2689 = 0;
        class464.field6382 = 0;
        class682.field9530 = 0;
        class420.field5786 = 0;
        class360.field5078 = 0;
        class686.field9562 = 0;
        class654.field8667 = 0;
        class389.field5443 = 0;
        class400.field5576 = 0;
        class464.field6401 = 0;
        class536.field7067 = 0;
        class757.field10533 = 0;
        class59.field716 = 0;
        class663.field8885 = 0;
        class501.field6733 = 0;
        class663.field8761 = 0;
        class1.field11 = 0;
        class111.field1589 = 0;
        class304.field4334 = 0;
        class284.field4013 = 0;
        class111.field1658 = 0;
        class64.field781 = 0;
        class3.field79 = 0;
        class675.field9356 = 0;
        class201.field3014 = 0;
        class436.field6008 = 0;
        class435.field6003 = 0;
        field8085 = 0;
        class461.field6316 = 0;
        class2.field23 = 0;
        class492.field6666 = 0;
        class288.field4085 = 0;
        class435.field5999 = 0;
        class562.field7370 = 0;
        class60.field731 = 0;
        class402.field5604 = 0;
        class161.field2424 = 0;
        class278.field3881 = 0;
        class305.field4379 = 0;
        class64.field784 = 0;
        class122.field1958 = 0;
        class232.field3297 = 0;
        class88.field1080 = 0;
        class742.field10244 = 0;
        class403.field5610 = 0;
        class435.field5996 = 0;
        class763.field10634 = 0;
        class217.field3141 = 0;
        class420.field5781 = 0;
        class489.field6635 = 0;
        class663.field8883 = 0;
        class615.field8179 = 0;
        class339.field4791 = 0;
        class564.field7408 = 0;
        class573.field7518 = 0;
        class244.field3409 = 0;
        class140.field2218 = 0;
        class663.field8797 = 0;
        class411.field5701 = 0;
        class629.field8383 = 0;
        class111.field1642 = 0;
        class721.field10046 = 0;
        class592.field7701 = 0;
        class663.field8836 = 0;
        class189.field2834 = 0;
        class256.field3506 = 0;
        class262.field3646 = 0;
        class496.field6687 = 0;
        class700.field9726 = 0;
        class385.field5384 = 0;
        class474.field6500 = 0;
        class691.field9629 = 0;
        class663.field8739 = 0;
        class163.field2449 = 0;
        class376.field5219 = 0;
        class156.field2384 = 0;
        class477.field6540 = 0;
        class172.field2629 = 0;
        class663.field8863 = 0;
        class304.field4304 = 0;
        class211.field3103 = 0;
        class122.field2000 = 0;
        class50.field640 = 0;
        class395.field5502 = 0;
        class29.field459 = 0;
        class556.field7303 = 0;
        class538.field7118 = 0;
        class676.field9387 = 0;
        class473.field6491 = 0;
        class57.field686 = 0;
        class436.field6010 = 0;
        class761.field10604 = 0;
        class595.field7731 = 0;
        class545.field7200 = 0;
        class599.field7872 = 0;
        class275.field3825 = 0;
        class595.field7717 = 0;
        class343.field4819 = 0;
        class485.field6622 = 0;
        class407.field5659 = 0;
        class538.field7107 = 0;
        class376.field5220 = 0;
        client.field4362 = 0;
        class761.field10602 = 0;
        class389.field5445 = 0;
        class663.field8919 = 0;
        field8060 = 0;
        class29.field455 = 0;
        class320.field4562 = 0;
        class599.field7857 = 0;
        class725.field10089 = 0;
        class675.field9358 = 0;
        class111.field1667 = 0;
        class663.field8781 = 0;
        class648.field8598 = 0;
        class399.field5570 = 0;
        class434.field5975 = 0;
        class80.field977 = 0;
        class122.field1983 = 0;
        class37.field520 = 0;
        class306.field4399 = 0;
        class663.field8915 = 0;
        class60.field728 = 0;
        class360.field5080 = 0;
        class286.field4052 = 0;
        class604.field7945 = 0;
        class100.field1285 = 0;
        class427.field5890 = 0;
        class319.field4550 = 0;
        class200.field3001 = 0;
        class199.field2994 = 0;
        class604.field7947 = 0;
        class607.field7985 = 0;
        class146.field2320 = 0;
        class435.field5992 = 0;
        class10.field172 = 0;
        class672.field9243 = 0;
        class307.field4422 = 0;
        class111.field1649 = 0;
        class423.field5828 = 0;
        class742.field10289 = 0;
        class29.field452 = 0;
        class430.field5919 = 0;
        class77.field930 = 0;
        class421.field5797 = 0;
        class169.field2592 = 0;
        class459.field6274 = 0;
        class273.field3804 = 0;
        class104.field1434 = 0;
        class668.field9119 = 0;
        class428.field5907 = 0;
        class663.field8889 = 0;
        class307.field4408 = 0;
        class212.field3111 = 0;
        class537.field7068 = 0;
        class265.field3691 = 0;
        class702.field9745 = 0;
        class316.field4513 = 0;
        class556.field7324 = 0;
        class296.field4232 = 0;
        class520.field6926 = 0;
        class194.field2926 = 0;
        class111.field1693 = 0;
        class595.field7738 = 0;
        class677.field9410 = 0;
        class314.field4484 = 0;
        class714.field9861 = 0;
        class146.field2308 = 0;
        class262.field3653 = 0;
        class408.field5663 = 0;
        class385.field5386 = 0;
        class514.field6819 = 0;
        class615.field8201 = 0;
        class96.field1193 = 0;
        class118.field1896 = 0;
        class111.field1681 = 0;
        class397.field5527 = 0;
        class749.field10429 = 0;
        class111.field1645 = 0;
        class574.field7541 = 0;
        class122.field1977 = 0;
        class594.field7711 = 0;
        class677.field9397 = 0;
        class718.field9983 = 0;
        class598.field7849 = 0;
        class265.field3685 = 0;
        class80.field961 = 0;
        class60.field749 = 0;
        class306.field4397 = 0;
        class369.field5155 = 0;
        class691.field9626 = 0;
        class111.field1582 = 0;
        class718.field9992 = 0;
        class517.field6836 = 0;
        class343.field4820 = 0;
        class677.field9422 = 0;
        class339.field4784 = 0;
        class691.field9637 = 0;
        class435.field5987 = 0;
        class79.field959 = 0;
        class389.field5418 = 0;
        class111.field1655 = 0;
        class113.field1859 = 0;
        class104.field1430 = 0;
        class295.field4224 = 0;
        class318.field4531 = 0;
        class121.field1929 = 0;
        class663.field8862 = 0;
        class48.field617 = 0;
        class122.field1979 = 0;
        class359.field5040 = 0;
        class400.field5584 = 0;
        class564.field7391 = 0;
        class440.field6074 = 0;
        class190.field2873 = 0;
        class663.field8916 = 0;
        class289.field4112 = 0;
        class100.field1311 = 0;
        class59.field711 = 0;
        class705.field9776 = 0;
        class269.field3769 = 0;
        class109.field1511 = 0;
        class125.field2073 = 0;
        class111.field1671 = 0;
        class316.field4508 = 0;
        class385.field5381 = 0;
        class663.field8858 = 0;
        class516.field6831 = 0;
        class617.field8242 = 0;
        class520.field6938 = 0;
        class447.field6133 = 0;
        class122.field1974 = 0;
        class111.field1540 = 0;
        class677.field9458 = 0;
        class77.field936 = 0;
        class600.field7881 = 0;
        class453.field6185 = 0;
        class56.field678 = 0;
        class556.field7306 = 0;
        class251.field3449 = 0;
        class613.field8158 = 0;
        class750.field10441 = 0;
        class747.field10392 = 0;
        class663.field8886 = 0;
        class384.field5374 = 0;
        class122.field1987 = 0;
        class60.field732 = 0;
        class535.field7053 = 0;
        class149.field2337 = 0;
        class320.field4563 = 0;
        class645.field8579 = 0;
        class418.field5765 = 0;
        class389.field5430 = 0;
        class723.field10077 = 0;
        class463.field6371 = 0;
        class183.field2776 = 0;
        class663.field8933 = 0;
        class122.field1971 = 0;
        class625.field8302 = 0;
        class501.field6735 = 0;
        class190.field2871 = 0;
        class21.field358 = 0;
        class146.field2305 = 0;
        class591.field7692 = 0;
        class684.field9539 = 0;
        class677.field9415 = 0;
        class511.field6785 = 0;
        class752.field10486 = 0;
        class350.field4926 = 0;
        class663.field8762 = 0;
        class119.field1907 = 0;
        class126.field2081 = 0;
        class363.field5107 = 0;
        class663.field8811 = 0;
        class663.field8792 = 0;
        class193.field2917 = 0;
        class710.field9839 = 0;
        class564.field7396 = 0;
        class2.field22 = 0;
        class84.field1022 = 0;
        class237.field3325 = 0;
        field8019 = 0;
        class677.field9430 = 0;
        class516.field6826 = 0;
        class698.field9706 = 0;
        class186.field2813 = 0;
        class609.field8124 = 0;
        class663.field8830 = 0;
        class402.field5603 = 0;
        class307.field4420 = 0;
        class193.field2910 = 0;
        class122.field2006 = 0;
        class376.field5207 = 0;
        class436.field6016 = 0;
        class313.field4472 = 0;
        class318.field4541 = 0;
        class718.field9942 = 0;
        class105.field1439 = 0;
        class89.field1088 = 0;
        class96.field1181 = 0;
        class111.field1646 = 0;
        class359.field5031 = 0;
        class663.field8834 = 0;
        class676.field9381 = 0;
        class362.field5093 = 0;
        class131.field2145 = 0;
        class75.field914 = 0;
        class384.field5370 = 0;
        class571.field7500 = 0;
        class642.field8546 = 0;
        class678.field9473 = 0;
        class378.field5259 = 0;
        class708.field9800 = 0;
        class288.field4084 = 0;
        class163.field2460 = 0;
        class64.field777 = 0;
        class595.field7719 = 0;
        class312.field4470 = 0;
        class122.field2023 = 0;
        class79.field956 = 0;
        class42.field556 = 0;
        class116.field1881 = 0;
        class34.field506 = 0;
        class289.field4107 = 0;
        class591.field7693 = 0;
        class538.field7078 = 0;
        class615.field8192 = 0;
        class677.field9433 = 0;
        class111.field1687 = 0;
        class185.field2799 = 0;
        class1.field3 = 0;
        class526.field6981 = 0;
        class169.field2605 = 0;
        class741.field10211 = 0;
        class159.field2399 = 0;
        class251.field3457 = 0;
        class75.field909 = 0;
        class681.field9517 = 0;
        class236.field3315 = 0;
        class762.field10614 = 0;
        class178.field2682 = 0;
        field8015 = 0;
        class276.field3849 = 0;
        class589.field7686 = 0;
        class712.field9849 = 0;
        class586.field7669 = 0;
        class135.field2162 = 0;
        class304.field4333 = 0;
        class460.field6280 = 0;
        class604.field7938 = 0;
        class8.field158 = 0;
        class615.field8190 = 0;
        class284.field4017 = 0;
        class663.field8833 = 0;
        class760.field10572 = 0;
        class615.field8228 = 0;
        class272.field3791 = 0;
        field8036 = 0;
        class435.field5980 = 0;
        field8121 = 0;
        class761.field10577 = 0;
        class300.field4268 = 0;
        class378.field5272 = 0;
        class663.field8876 = 0;
        class614.field8172 = 0;
        class427.field5880 = 0;
        class167.field2583 = 0;
        class244.field3411 = 0;
        class329.field4695 = 0;
        class564.field7412 = 0;
        class462.field6350 = 0;
        class472.field6453 = 0;
        class130.field2135 = 0;
        class156.field2377 = 0;
        class122.field2015 = 0;
        class199.field2989 = 0;
        class595.field7735 = 0;
        field8075 = 0;
        class718.field9899 = 0;
        class615.field8211 = 0;
        class474.field6503 = 0;
        class438.field6033 = 0;
        class410.field5684 = 0;
        class615.field8187 = 0;
        class462.field6356 = 0;
        class199.field2990 = 0;
        class28.field438 = 0;
        class716.field9869 = 0;
        class718.field9929 = 0;
        class440.field6079 = 0;
        class528.field7008 = 0;
        class348.field4890 = 0;
        class383.field5342 = 0;
        class122.field1944 = 0;
        class583.field7633 = 0;
        class722.field10053 = 0;
        class214.field3127 = 0;
        class272.field3793 = 0;
        class378.field5273 = 0;
        class718.field9984 = 0;
        class418.field5769 = 0;
        class401.field5598 = 0;
        class112.field1849 = 0;
        class565.field7434 = 0;
        class584.field7642 = 0;
        class595.field7727 = 0;
        class109.field1498 = 0;
        class185.field2788 = 0;
        class359.field5034 = 0;
        class97.field1200 = 0;
        class742.field10299 = 0;
        field8049 = 0;
        class663.field8913 = 0;
        class375.field5196 = 0;
        class60.field736 = 0;
        class239.field3366 = 0;
        class111.field1536 = 0;
        class663.field8868 = 0;
        class691.field9627 = 0;
        class718.field9980 = 0;
        class187.field2824 = 0;
        class197.field2970 = 0;
        class269.field3760 = 0;
        class687.field9578 = 0;
        class240.field3381 = 0;
        class442.field6092 = 0;
        class161.field2433 = 0;
        class597.field7807 = 0;
        class490.field6648 = 0;
        class137.field2183 = 0;
        class146.field2315 = 0;
        class462.field6329 = 0;
        class140.field2222 = 0;
        class687.field9575 = 0;
        class564.field7410 = 0;
        class80.field962 = 0;
        class111.field1694 = 0;
        class708.field9808 = 0;
        field8063 = 0;
        class95.field1171 = 0;
        class320.field4565 = 0;
        class629.field8379 = 0;
        class571.field7503 = 0;
        class404.field5630 = 0;
        class663.field8880 = 0;
        class722.field10057 = 0;
        class7.field139 = 0;
        class222.field3161 = 0;
        class681.field9506 = 0;
        class552.field7275 = 0;
        class480.field6579 = 0;
        class684.field9551 = 0;
        class2.field30 = 0;
        class166.field2525 = 0;
        class111.field1696 = 0;
        class644.field8566 = 0;
        class166.field2572 = 0;
        class3.field94 = 0;
        class292.field4194 = 0;
        class258.field3578 = 0;
        class252.field3468 = 0;
        class569.field7481 = 0;
        class649.field8624 = 0;
        class84.field1015 = 0;
        class390.field5450 = 0;
        class376.field5233 = 0;
        class230.field3287 = 0;
        class111.field1635 = 0;
        class628.field8346 = 0;
        class48.field621 = 0;
        class700.field9722 = 0;
        class140.field2221 = 0;
        class122.field2030 = 0;
        class182.field2741 = 0;
        class615.field8181 = 0;
        class646.field8581 = 0;
        class737.field10196 = 0;
        class166.field2511 = 0;
        class663.field8895 = 0;
        class708.field9809 = 0;
        class420.field5785 = 0;
        class698.field9709 = 0;
        class201.field3017 = 0;
        class218.field3146 = 0;
        class360.field5065 = 0;
        class636.field8462 = 0;
        class729.field10106 = 0;
        class662.field8731 = 0;
        class111.field1571 = 0;
        class247.field3433 = 0;
        class100.field1361 = 0;
        class359.field5037 = 0;
        class288.field4079 = 0;
        class709.field9826 = 0;
        class421.field5796 = 0;
        class567.field7459 = 0;
        class60.field726 = 0;
        class471.field6447 = 0;
        class640.field8480 = 0;
        class595.field7726 = 0;
        class460.field6289 = 0;
        class186.field2814 = 0;
        field8057 = 0;
        class538.field7093 = 0;
        class111.field1568 = 0;
        class687.field9576 = 0;
        class737.field10185 = 0;
        class749.field10426 = 0;
        class700.field9724 = 0;
        class636.field8454 = 0;
        class663.field8763 = 0;
        class538.field7121 = 0;
        class207.field3078 = 0;
        class109.field1487 = 0;
        class292.field4197 = 0;
        class307.field4410 = 0;
        class2.field29 = 0;
        class460.field6290 = 0;
        class285.field4038 = 0;
        class163.field2456 = 0;
        class111.field1565 = 0;
        class373.field5180 = 0;
        class230.field3275 = 0;
        class278.field3920 = 0;
        class4.field109 = 0;
        class47.field595 = 0;
        class111.field1628 = 0;
        class378.field5275 = 0;
        class645.field8574 = 0;
        class18.field240 = 0;
        class111.field1552 = 0;
        class477.field6535 = 0;
        class269.field3762 = 0;
        class604.field7940 = 0;
        class343.field4823 = 0;
        class753.field10496 = 0;
        class126.field2077 = 0;
        class691.field9622 = 0;
        class565.field7429 = 0;
        class256.field3501 = 0;
        class376.field5239 = 0;
        class211.field3099 = 0;
        client.field4367 = 0;
        class163.field2459 = 0;
        class199.field2996 = 0;
        class723.field10066 = 0;
        class77.field928 = 0;
        class296.field4225 = 0;
        class484.field6611 = 0;
        class489.field6646 = 0;
        class436.field6009 = 0;
        class122.field2026 = 0;
        class677.field9454 = 0;
        class732.field10144 = 0;
        class122.field1984 = 0;
        class409.field5676 = 0;
        class663.field8768 = 0;
        class284.field4029 = 0;
        class427.field5886 = 0;
        class227.field3236 = 0;
        class719.field10007 = 0;
        class253.field3478 = 0;
        class663.field8935 = 0;
        class296.field4226 = 0;
        class663.field8815 = 0;
        class376.field5213 = 0;
        class24.field402 = 0;
        class469.field6431 = 0;
        class477.field6551 = 0;
        class111.field1612 = 0;
        class62.field757 = 0;
        class101.field1382 = 0;
        class668.field9116 = 0;
        class737.field10194 = 0;
        class416.field5743 = 0;
        class502.field6744 = 0;
        class472.field6470 = 0;
        class328.field4679 = 0;
        class395.field5521 = 0;
        class304.field4310 = 0;
        class672.field9322 = 0;
        class111.field1539 = 0;
        class403.field5612 = 0;
        class155.field2362 = 0;
        class663.field8912 = 0;
        class44.field577 = 0;
        class330.field4711 = 0;
        class92.field1113 = 0;
        class169.field2599 = 0;
        class227.field3249 = 0;
        class350.field4927 = 0;
        class362.field5099 = 0;
        class2.field18 = 0;
        class109.field1474 = 0;
        class122.field1959 = 0;
        class372.field5172 = 0;
        class111.field1613 = 0;
        class541.field7166 = 0;
        class643.field8553 = 0;
        class691.field9632 = 0;
        class111.field1633 = 0;
        class388.field5410 = 0;
        class716.field9870 = 0;
        class466.field6412 = 0;
        class687.field9577 = 0;
        class359.field5028 = 0;
        class111.field1708 = 0;
        class7.field144 = 0;
        class390.field5452 = 0;
        class111.field1584 = 0;
        class89.field1083 = 0;
        class63.field772 = 0;
        class420.field5788 = 0;
        class332.field4727 = 0;
        class653.field8655 = 0;
        class473.field6489 = 0;
        class163.field2458 = 0;
        class37.field527 = 0;
        class272.field3795 = 0;
        class111.field1573 = 0;
        class713.field9856 = 0;
        class628.field8374 = 0;
        class161.field2430 = 0;
        class376.field5230 = 0;
        class442.field6087 = 0;
        class528.field7003 = 0;
        class258.field3546 = 0;
        class24.field416 = 0;
        class251.field3466 = 0;
        class677.field9417 = 0;
        class571.field7499 = 0;
        class677.field9414 = 0;
        class397.field5529 = 0;
        class376.field5203 = 0;
        class691.field9621 = 0;
        class322.field4584 = 0;
        class601.field7895 = 0;
        class195.field2935 = 0;
        class609.field8125 = 0;
        class111.field1583 = 0;
        class251.field3460 = 0;
        class373.field5179 = 0;
        class749.field10410 = 0;
        class296.field4228 = 0;
        class288.field4070 = 0;
        class323.field4595 = 0;
        class761.field10599 = 0;
        class390.field5457 = 0;
        class541.field7167 = 0;
        class663.field8872 = 0;
        class111.field1598 = 0;
        class262.field3660 = 0;
        class601.field7901 = 0;
        class305.field4381 = 0;
        class339.field4788 = 0;
        class65.field800 = 0;
        class709.field9832 = 0;
        class237.field3337 = 0;
        class376.field5235 = 0;
        class659.field8706 = 0;
        class438.field6034 = 0;
        class302.field4277 = 0;
        class18.field238 = 0;
        class661.field8726 = 0;
        class496.field6691 = 0;
        class262.field3657 = 0;
        class597.field7819 = 0;
        class607.field7991 = 0;
        class183.field2767 = 0;
        class663.field8835 = 0;
        class376.field5242 = 0;
        class710.field9840 = 0;
        class643.field8554 = 0;
        class598.field7844 = 0;
        class122.field1956 = 0;
        class629.field8377 = 0;
        class711.field9843 = 0;
        class59.field708 = 0;
        class111.field1615 = 0;
        class663.field8921 = 0;
        class157.field2388 = 0;
        class435.field5995 = 0;
        class475.field6510 = 0;
        class170.field2613 = 0;
        class571.field7501 = 0;
        class677.field9411 = 0;
        class756.field10523 = 0;
        class75.field905 = 0;
        class756.field10512 = 0;
        class276.field3838 = 0;
        class146.field2312 = 0;
        class137.field2185 = 0;
        class390.field5451 = 0;
        class155.field2359 = 0;
        class286.field4045 = 0;
        class615.field8226 = 0;
        class721.field10048 = 0;
        class292.field4192 = 0;
        class561.field7363 = 0;
        class175.field2643 = 0;
        class548.field7239 = 0;
        class244.field3405 = 0;
        class179.field2700 = 0;
        class254.field3494 = 0;
        class135.field2164 = 0;
        class139.field2207 = 0;
        class438.field6036 = 0;
        class612.field8150 = 0;
        class360.field5073 = 0;
        class204.field3058 = 0;
        class189.field2836 = 0;
        class670.field9136 = 0;
        class491.field6657 = 0;
        class274.field3823 = 0;
        class45.field591 = 0;
        class122.field1960 = 0;
        class278.field3907 = 0;
        class82.field982 = 0;
        client.field4366 = 0;
        class55.field662 = 0;
        class451.field6175 = 0;
        class597.field7797 = 0;
        class175.field2647 = 0;
        class111.field1594 = 0;
        class752.field10489 = 0;
        class166.field2523 = 0;
        class677.field9456 = 0;
        class193.field2906 = 0;
        class353.field4977 = 0;
        class694.field9652 = 0;
        class376.field5215 = 0;
        class597.field7818 = 0;
        class3.field76 = 0;
        class663.field8901 = 0;
        class70.field848 = 0;
        class670.field9140 = 0;
        class244.field3408 = 0;
        class292.field4199 = 0;
        class359.field5023 = 0;
        class718.field9952 = 0;
        class83.field1005 = 0;
        class657.field8685 = 0;
        class127.field2102 = 0;
        class111.field1556 = 0;
        class95.field1152 = 0;
        class122.field1997 = 0;
        class89.field1085 = 0;
        class24.field410 = 0;
        class442.field6093 = 0;
        class541.field7162 = 0;
        class663.field8798 = 0;
        class200.field2999 = 0;
        class549.field7254 = 0;
        field8051 = 0;
        field8056 = 0;
        class663.field8852 = 0;
        class182.field2750 = 0;
        class290.field4144 = 0;
        class609.field8130 = 0;
        class663.field8904 = 0;
        class207.field3077 = 0;
        class267.field3754 = 0;
        class165.field2498 = 0;
        class58.field702 = 0;
        class194.field2924 = 0;
        class446.field6121 = 0;
        class2.field20 = 0;
        class175.field2646 = 0;
        class556.field7304 = 0;
        class722.field10064 = 0;
        class745.field10373 = 0;
        class111.field1604 = 0;
        class663.field8875 = 0;
        class66.field816 = 0;
        class70.field852 = 0;
        class578.field7584 = 0;
        class122.field2022 = 0;
        class539.field7146 = 0;
        class742.field10270 = 0;
        class359.field5035 = 0;
        class289.field4119 = 0;
        class512.field6796 = 0;
        class704.field9760 = 0;
        class649.field8621 = 0;
        class397.field5534 = 0;
        class230.field3273 = 0;
        class663.field8826 = 0;
        class262.field3651 = 0;
        class111.field1638 = 0;
        class498.field6709 = 0;
        class187.field2829 = 0;
        field8020 = 0;
        class574.field7538 = 0;
        class561.field7361 = 0;
        class436.field6013 = 0;
        class536.field7057 = 0;
        class462.field6352 = 0;
        class677.field9413 = 0;
        class721.field10043 = 0;
        class416.field5741 = 0;
        class691.field9631 = 0;
        class111.field1609 = 0;
        class645.field8568 = 0;
        class435.field5990 = 0;
        class359.field5026 = 0;
        class549.field7249 = 0;
        class111.field1545 = 0;
        class746.field10380 = 0;
        class288.field4074 = 0;
        class553.field7287 = 0;
        class420.field5784 = 0;
        class290.field4141 = 0;
        class573.field7523 = 0;
        class745.field10377 = 0;
        class48.field607 = 0;
        class170.field2614 = 0;
        class761.field10597 = 0;
        class169.field2596 = 0;
        class609.field8129 = 0;
        class122.field1992 = 0;
        class469.field6434 = 0;
        class275.field3824 = 0;
        class336.field4762 = 0;
        class663.field8902 = 0;
        class663.field8873 = 0;
        class132.field2150 = 0;
        class419.field5779 = 0;
        class24.field403 = 0;
        class327.field4673 = 0;
        class663.field8846 = 0;
        class464.field6377 = 0;
        class599.field7859 = 0;
        class677.field9459 = 0;
        class263.field3676 = 0;
        class706.field9781 = 0;
        class603.field7917 = 0;
        class603.field7918 = 0;
        class13.field199 = 0;
        class541.field7170 = 0;
        class412.field5717 = 0;
        class376.field5241 = 0;
        class182.field2734 = 0;
        class122.field2013 = 0;
        class761.field10587 = 0;
        class3.field64 = 0;
        class59.field707 = 0;
        class464.field6375 = 0;
        class418.field5766 = 0;
        class588.field7677 = 0;
        class292.field4164 = 0;
        class671.field9153 = 0;
        class189.field2857 = 0;
        class524.field6953 = 0;
        class213.field3118 = 0;
        class395.field5524 = 0;
        class677.field9448 = 0;
        class291.field4151 = 0;
        class288.field4096 = 0;
        class26.field422 = 0;
        class723.field10075 = 0;
        class122.field1985 = 0;
        class389.field5439 = 0;
        class226.field3225 = 0;
        class696.field9691 = 0;
        field8080 = 0;
        class423.field5834 = 0;
        class60.field741 = 0;
        class272.field3797 = 0;
        class454.field6197 = 0;
        field8053 = 0;
        class485.field6624 = 0;
        class353.field4967 = 0;
        class88.field1074 = 0;
        class663.field8832 = 0;
        class95.field1154 = 0;
        class240.field3380 = 0;
        class62.field755 = 0;
        class111.field1639 = 0;
        class127.field2088 = 0;
        class164.field2493 = 0;
        class711.field9844 = 0;
        class505.field6757 = 0;
        class722.field10051 = 0;
        class718.field9902 = 0;
        class423.field5832 = 0;
        class12.field184 = 0;
        class547.field7232 = 0;
        class571.field7497 = 0;
        class742.field10307 = 0;
        class454.field6193 = 0;
        class111.field1644 = 0;
        class462.field6336 = 0;
        class538.field7081 = 0;
        class381.field5294 = 0;
        class442.field6088 = 0;
        class663.field8920 = 0;
        class33.field499 = 0;
        class111.field1534 = 0;
        class122.field1952 = 0;
        class91.field1098 = 0;
        class376.field5211 = 0;
        class596.field7756 = 0;
        class663.field8866 = 0;
        class372.field5171 = 0;
        class549.field7247 = 0;
        class378.field5258 = 0;
        class347.field4862 = 0;
        class663.field8937 = 0;
        field8118 = 0;
        class410.field5686 = 0;
        class686.field9571 = 0;
        class258.field3598 = 0;
        class57.field687 = 0;
        class262.field3662 = 0;
        class428.field5910 = 0;
        class506.field6761 = 0;
        client.field4371 = 0;
        class111.field1706 = 0;
        class499.field6719 = 0;
        class100.field1278 = 0;
        class412.field5716 = 0;
        class336.field4769 = 0;
        class459.field6268 = 0;
        class264.field3684 = 0;
        class232.field3294 = 0;
        class98.field1239 = 0;
        class733.field10153 = 0;
        class399.field5569 = 0;
        class597.field7801 = 0;
        class51.field649 = 0;
        class60.field748 = 0;
        class328.field4678 = 0;
        class183.field2771 = 0;
        class670.field9138 = 0;
        class122.field2031 = 0;
        class545.field7203 = 0;
        class306.field4395 = 0;
        class164.field2488 = 0;
        class111.field1606 = 0;
        class60.field733 = 0;
        class288.field4086 = 0;
        class599.field7869 = 0;
        class469.field6432 = 0;
        class663.field8930 = 0;
        class237.field3324 = 0;
        class323.field4598 = 0;
        class111.field1666 = 0;
        class454.field6202 = 0;
        class325.field4655 = 0;
        class352.field4954 = 0;
        class454.field6196 = 0;
        class378.field5269 = 0;
        class513.field6803 = 0;
        class318.field4538 = 0;
        class100.field1315 = 0;
        class24.field406 = 0;
        class517.field6837 = 0;
        class146.field2311 = 0;
        class319.field4554 = 0;
        class474.field6498 = 0;
        class227.field3235 = 0;
        class512.field6792 = 0;
        class663.field8867 = 0;
        class737.field10188 = 0;
        class660.field8709 = 0;
        class464.field6393 = 0;
        class140.field2220 = 0;
        class470.field6439 = 0;
        class352.field4942 = 0;
        class111.field1586 = 0;
        class109.field1495 = 0;
        class60.field744 = 0;
        class359.field5039 = 0;
        class281.field3975 = 0;
        class135.field2158 = 0;
        class2.field17 = 0;
        class599.field7853 = 0;
        class291.field4155 = 0;
        class319.field4547 = 0;
        class741.field10219 = 0;
        class208.field3084 = 0;
        class743.field10325 = 0;
        class111.field1695 = 0;
        class440.field6078 = 0;
        class363.field5103 = 0;
        class378.field5266 = 0;
        class631.field8410 = 0;
        class677.field9450 = 0;
        class388.field5413 = 0;
        class291.field4161 = 0;
        class161.field2426 = 0;
        class519.field6920 = 0;
        class434.field5971 = 0;
        class59.field712 = 0;
        class649.field8629 = 0;
        class736.field10176 = 0;
        class552.field7279 = 0;
        class89.field1082 = 0;
        class232.field3295 = 0;
        class51.field648 = 0;
        class347.field4858 = 0;
        class186.field2820 = 0;
        class193.field2918 = 0;
        class637.field8464 = 0;
        class569.field7485 = 0;
        class275.field3833 = 0;
        class423.field5835 = 0;
        class304.field4313 = 0;
        class375.field5195 = 0;
        class501.field6737 = 0;
        class60.field739 = 0;
        class122.field1972 = 0;
        class352.field4944 = 0;
        class37.field528 = 0;
        class589.field7685 = 0;
        class694.field9654 = 0;
        class438.field6049 = 0;
        class514.field6817 = 0;
        class334.field4751 = 0;
        class338.field4776 = 0;
        class648.field8596 = 0;
        class668.field9114 = 0;
        class663.field8787 = 0;
        class225.field3195 = 0;
        class614.field8166 = 0;
        class320.field4568 = 0;
        class749.field10406 = 0;
        class376.field5222 = 0;
        class677.field9427 = 0;
        class696.field9689 = 0;
        class265.field3697 = 0;
        class677.field9426 = 0;
        class385.field5390 = 0;
        class253.field3477 = 0;
        class480.field6578 = 0;
        class62.field765 = 0;
        class217.field3136 = 0;
        class390.field5459 = 0;
        class677.field9390 = 0;
        class237.field3330 = 0;
        class616.field8241 = 0;
        class77.field938 = 0;
        class251.field3461 = 0;
        class513.field6811 = 0;
        class347.field4873 = 0;
        class111.field1701 = 0;
        class520.field6932 = 0;
        class643.field8555 = 0;
        class288.field4100 = 0;
        class601.field7889 = 0;
        class142.field2271 = 0;
        class109.field1492 = 0;
        class111.field1580 = 0;
        class278.field3906 = 0;
        class111.field1662 = 0;
        class742.field10305 = 0;
        class118.field1898 = 0;
        class735.field10169 = 0;
        class111.field1643 = 0;
        class256.field3512 = 0;
        class286.field4050 = 0;
        class294.field4216 = 0;
        class589.field7681 = 0;
        class709.field9823 = 0;
        class10.field171 = 0;
        class329.field4693 = 0;
        class376.field5223 = 0;
        class448.field6142 = 0;
        class663.field8824 = 0;
        class47.field594 = 0;
        class678.field9468 = 0;
        class2.field14 = 0;
        class702.field9746 = 0;
        class82.field981 = 0;
        class45.field587 = 0;
        class417.field5752 = 0;
        class284.field4028 = 0;
        class2.field31 = 0;
        class663.field8770 = 0;
        class282.field3987 = 0;
        class122.field1965 = 0;
        class597.field7811 = 0;
        class543.field7185 = 0;
        class569.field7473 = 0;
        class615.field8219 = 0;
        class122.field1981 = 0;
        class421.field5794 = 0;
        class80.field968 = 0;
        class111.field1548 = 0;
        class225.field3204 = 0;
        class69.field841 = 0;
        class597.field7798 = 0;
        class760.field10573 = 0;
        class201.field3016 = 0;
        class303.field4301 = 0;
        class111.field1677 = 0;
        class176.field2649 = 0;
        class761.field10586 = 0;
        class374.field5184 = 0;
        class663.field8795 = 0;
        class3.field58 = 0;
        class28.field439 = 0;
        class35.field512 = 0;
        class182.field2737 = 0;
        class723.field10072 = 0;
        class663.field8736 = 0;
        class613.field8160 = 0;
        class252.field3473 = 0;
        class320.field4571 = 0;
        class2.field19 = 0;
        class742.field10286 = 0;
        class421.field5807 = 0;
        class549.field7248 = 0;
        class599.field7873 = 0;
        class141.field2237 = 0;
        class244.field3415 = 0;
        class312.field4467 = 0;
        class359.field5014 = 0;
        class119.field1911 = 0;
        class630.field8392 = 0;
        class48.field622 = 0;
        class597.field7841 = 0;
        class489.field6639 = 0;
        class189.field2839 = 0;
        class417.field5762 = 0;
        class57.field689 = 0;
        class496.field6683 = 0;
        class86.field1040 = 0;
        class435.field6007 = 0;
        class574.field7533 = 0;
        class347.field4874 = 0;
        class672.field9307 = 0;
        class71.field869 = 0;
        class304.field4315 = 0;
        class595.field7743 = 0;
        class663.field8903 = 0;
        class166.field2571 = 0;
        class326.field4659 = 0;
        class190.field2867 = 0;
        class663.field8928 = 0;
        class33.field498 = 0;
        class677.field9432 = 0;
        class704.field9757 = 0;
        class189.field2855 = 0;
        class468.field6427 = 0;
        class683.field9536 = 0;
        class462.field6343 = 0;
        class317.field4527 = 0;
        class528.field7001 = 0;
        class629.field8380 = 0;
        class122.field1982 = 0;
        class716.field9868 = 0;
        class464.field6395 = 0;
        class3.field54 = 0;
        class615.field8206 = 0;
        class309.field4447 = 0;
        class701.field9736 = 0;
        class334.field4739 = 0;
        class742.field10308 = 0;
        class422.field5815 = 0;
        class557.field7335 = 0;
        class329.field4697 = 0;
        class117.field1889 = 0;
        class27.field429 = 0;
        class111.field1588 = 0;
        class539.field7133 = 0;
        class45.field588 = 0;
        class464.field6387 = 0;
        class484.field6614 = 0;
        class496.field6689 = 0;
        class456.field6216 = 0;
        class262.field3644 = 0;
        class419.field5775 = 0;
        class595.field7741 = 0;
        class111.field1535 = 0;
        class122.field1973 = 0;
        field8077 = 0;
        class702.field9747 = 0;
        class614.field8173 = 0;
        class456.field6233 = 0;
        class122.field1969 = 0;
        class185.field2800 = 0;
        class359.field5009 = 0;
        class261.field3635 = 0;
        class537.field7069 = 0;
        class545.field7207 = 0;
        class343.field4818 = 0;
        class489.field6636 = 0;
        class672.field9319 = 0;
        class687.field9580 = 0;
        class385.field5379 = 0;
        class263.field3672 = 0;
        class267.field3715 = 0;
        class4.field115 = 0;
        class541.field7169 = 0;
        class327.field4676 = 0;
        class12.field186 = 0;
        field8002 = 0;
        class397.field5533 = 0;
        class516.field6833 = 0;
        class376.field5221 = 0;
        class353.field4962 = 0;
        class229.field3262 = 0;
        class286.field4053 = 0;
        class613.field8164 = 0;
        class278.field3916 = 0;
        class48.field619 = 0;
        field8041 = 0;
        class146.field2321 = 0;
        class756.field10525 = 0;
        class65.field806 = 0;
        class428.field5905 = 0;
        class328.field4687 = 0;
        class111.field1714 = 0;
        class18.field235 = 0;
        class262.field3664 = 0;
        class363.field5113 = 0;
        class597.field7802 = 0;
        class102.field1425 = 0;
        class7.field141 = 0;
        class123.field2064 = 0;
        class545.field7211 = 0;
        class260.field3623 = 0;
        class84.field1020 = 0;
        class552.field7277 = 0;
        class683.field9537 = 0;
        class397.field5526 = 0;
        class95.field1167 = 0;
        class131.field2146 = 0;
        class137.field2186 = 0;
        class501.field6731 = 0;
        class433.field5961 = 0;
        class309.field4450 = 0;
        class411.field5702 = 0;
        class663.field8884 = 0;
        class426.field5866 = 0;
        class615.field8218 = 0;
        class531.field7023 = 0;
        class202.field3025 = 0;
        class111.field1607 = 0;
        class303.field4303 = 0;
        class211.field3100 = 0;
        class722.field10056 = 0;
        class538.field7108 = 0;
        class118.field1900 = 0;
        class284.field4008 = 0;
        class26.field423 = 0;
        class628.field8349 = 0;
        class501.field6730 = 0;
        class186.field2818 = 0;
        class640.field8502 = 0;
        class740.field10207 = 0;
        class601.field7886 = 0;
        class603.field7922 = 0;
        class507.field6773 = 0;
        class459.field6271 = 0;
        class428.field5903 = 0;
        class359.field5007 = 0;
        class136.field2169 = 0;
        class389.field5438 = 0;
        class686.field9564 = 0;
        class554.field7292 = 0;
        class305.field4383 = 0;
        class660.field8716 = 0;
        class615.field8229 = 0;
        class747.field10398 = 0;
        class750.field10437 = 0;
        class63.field767 = 0;
        class148.field2330 = 0;
        class59.field715 = 0;
        class212.field3116 = 0;
        class33.field497 = 0;
        class140.field2213 = 0;
        class204.field3059 = 0;
        class122.field1986 = 0;
        class513.field6813 = 0;
        class520.field6936 = 0;
        class464.field6386 = 0;
        class304.field4305 = 0;
        class353.field4968 = 0;
        class262.field3665 = 0;
        class634.field8445 = 0;
        class84.field1021 = 0;
        class111.field1665 = 0;
        class440.field6071 = 0;
        class80.field970 = 0;
        class320.field4569 = 0;
        class405.field5643 = 0;
        class628.field8359 = 0;
        class179.field2705 = 0;
        class362.field5094 = 0;
        class360.field5072 = 0;
        class626.field8309 = 0;
        class742.field10239 = 0;
        class383.field5366 = 0;
        class303.field4298 = 0;
        class484.field6615 = 0;
        class554.field7291 = 0;
        int var1 = -39 % ((arg0 + 84) / 33);
        class347.field4877 = 0;
        class376.field5228 = 0;
        class471.field6446 = 0;
        class304.field4322 = 0;
        class288.field4067 = 0;
        class381.field5299 = 0;
        class640.field8491 = 0;
        class462.field6354 = 0;
        class480.field6574 = 0;
        class3.field47 = 0;
        class453.field6191 = 0;
        class286.field4051 = 0;
        class663.field8775 = 0;
        class205.field3064 = 0;
        class540.field7149 = 0;
        class421.field5805 = 0;
        class677.field9406 = 0;
        class214.field3122 = 0;
        class734.field10159 = 0;
        class353.field4964 = 0;
        class421.field5802 = 0;
        class742.field10278 = 0;
        class743.field10330 = 0;
        class367.field5134 = 0;
        class718.field9917 = 0;
        class2.field25 = 0;
        class122.field1963 = 0;
        class95.field1151 = 0;
        class548.field7242 = 0;
        class323.field4593 = 0;
        class394.field5489 = 0;
        class663.field8820 = 0;
        class383.field5327 = 0;
        class595.field7745 = 0;
        class472.field6472 = 0;
        class464.field6391 = 0;
        class596.field7755 = 0;
        class111.field1618 = 0;
        class161.field2427 = 0;
        class462.field6338 = 0;
        class477.field6553 = 0;
        class677.field9408 = 0;
        class179.field2708 = 0;
        class677.field9412 = 0;
        class90.field1092 = 0;
        class224.field3182 = 0;
        class717.field9875 = 0;
        class663.field8758 = 0;
        class597.field7771 = 0;
        class390.field5466 = 0;
        class380.field5286 = 0;
        class491.field6659 = 0;
        class444.field6109 = 0;
        class548.field7237 = 0;
        class111.field1656 = 0;
        class325.field4610 = 0;
        class718.field9884 = 0;
        field8044 = 0;
        class719.field10010 = 0;
        class749.field10422 = 0;
        class616.field8233 = 0;
        class615.field8220 = 0;
        class730.field10118 = 0;
        class472.field6454 = 0;
        class721.field10042 = 0;
        class663.field8743 = 0;
        class718.field9955 = 0;
        class141.field2244 = 0;
        class594.field7709 = 0;
        class111.field1685 = 0;
        class311.field4464 = 0;
        class718.field9976 = 0;
        class700.field9721 = 0;
        class339.field4781 = 0;
        class170.field2617 = 0;
        class663.field8745 = 0;
        class438.field6045 = 0;
        class556.field7300 = 0;
        class233.field3299 = 0;
        class508.field6776 = 0;
        class226.field3209 = 0;
        class484.field6617 = 0;
        class501.field6732 = 0;
        class24.field415 = 0;
        class483.field6602 = 0;
        class502.field6745 = 0;
        class724.field10085 = 0;
        class535.field7043 = 0;
        class111.field1564 = 0;
        class96.field1185 = 0;
        class718.field9985 = 0;
        class361.field5090 = 0;
        class350.field4924 = 0;
        class7.field145 = 0;
        class101.field1375 = 0;
        class460.field6288 = 0;
        class182.field2735 = 0;
        class237.field3336 = 0;
        class168.field2589 = 0;
        class347.field4863 = 0;
        class708.field9794 = 0;
        class495.field6675 = 0;
        class502.field6740 = 0;
        class127.field2096 = 0;
        class442.field6086 = 0;
        class663.field8898 = 0;
        class663.field8861 = 0;
        class492.field6665 = 0;
        class29.field454 = 0;
        class223.field3168 = 0;
        class13.field204 = 0;
        class404.field5636 = 0;
        class30.field484 = 0;
        class468.field6421 = 0;
        class288.field4076 = 0;
        class400.field5588 = 0;
        class359.field5018 = 0;
        class553.field7282 = 0;
        class595.field7715 = 0;
        class473.field6495 = 0;
        class675.field9362 = 0;
        class606.field7969 = 0;
        class615.field8222 = 0;
        class747.field10397 = 0;
        class659.field8703 = 0;
        class87.field1060 = 0;
        class663.field8793 = 0;
        class243.field3399 = 0;
        class91.field1096 = 0;
        class436.field6019 = 0;
        class580.field7616 = 0;
        class675.field9353 = 0;
        class489.field6641 = 0;
        class460.field6285 = 0;
        class146.field2310 = 0;
        class663.field8859 = 0;
        field8045 = 0;
        class538.field7124 = 0;
        class534.field7036 = 0;
        class689.field9591 = 0;
        class272.field3790 = 0;
        class359.field5036 = 0;
        class615.field8223 = 0;
        class625.field8300 = 0;
        class209.field3093 = 0;
        class288.field4103 = 0;
        class485.field6625 = 0;
        class123.field2061 = 0;
        class97.field1205 = 0;
        class549.field7250 = 0;
        class202.field3030 = 0;
        class292.field4193 = 0;
        class58.field690 = 0;
        class383.field5348 = 0;
        class3.field87 = 0;
        class401.field5600 = 0;
        class658.field8692 = 0;
        class101.field1380 = 0;
        class195.field2939 = 0;
        class3.field44 = 0;
        class539.field7148 = 0;
        class389.field5419 = 0;
        class180.field2726 = 0;
        class122.field2020 = 0;
        class288.field4077 = 0;
        class155.field2376 = 0;
        class378.field5268 = 0;
        class597.field7838 = 0;
        class325.field4635 = 0;
        class718.field9896 = 0;
        class183.field2770 = 0;
        class63.field770 = 0;
        class639.field8469 = 0;
        class374.field5190 = 0;
        class640.field8481 = 0;
        class18.field236 = 0;
        class567.field7446 = 0;
        class122.field1993 = 0;
        class71.field874 = 0;
        class663.field8799 = 0;
        class536.field7063 = 0;
        class189.field2859 = 0;
        class111.field1546 = 0;
        class663.field8771 = 0;
        class677.field9435 = 0;
        class670.field9144 = 0;
        class294.field4210 = 0;
        class394.field5490 = 0;
        class654.field8671 = 0;
        class392.field5472 = 0;
        class298.field4235 = 0;
        class678.field9471 = 0;
        class305.field4392 = 0;
        class628.field8376 = 0;
        class111.field1660 = 0;
        class122.field1948 = 0;
        class427.field5882 = 0;
        class438.field6058 = 0;
        class35.field515 = 0;
        class435.field5998 = 0;
        class65.field794 = 0;
        class417.field5756 = 0;
        class603.field7921 = 0;
        class556.field7327 = 0;
        class311.field4462 = 0;
        class537.field7073 = 0;
        class292.field4178 = 0;
        class759.field10560 = 0;
        class10.field173 = 0;
        class3.field85 = 0;
        class305.field4382 = 0;
        class111.field1651 = 0;
        class727.field10099 = 0;
        class556.field7317 = 0;
        class269.field3758 = 0;
        field8008 = 0;
        class565.field7436 = 0;
        class412.field5714 = 0;
        class691.field9617 = 0;
        class402.field5601 = 0;
        class545.field7209 = 0;
        class712.field9847 = 0;
        class163.field2455 = 0;
        class545.field7201 = 0;
        class56.field670 = 0;
        class663.field8784 = 0;
        class421.field5806 = 0;
        class663.field8756 = 0;
        class322.field4587 = 0;
        class359.field5025 = 0;
        class3.field86 = 0;
        class180.field2722 = 0;
        field8079 = 0;
        class686.field9572 = 0;
        class360.field5081 = 0;
        class183.field2777 = 0;
        class341.field4813 = 0;
        class3.field74 = 0;
        class385.field5383 = 0;
        class163.field2452 = 0;
        class675.field9359 = 0;
        class718.field9895 = 0;
        class48.field610 = 0;
        class483.field6598 = 0;
        class762.field10615 = 0;
        class254.field3489 = 0;
        class538.field7099 = 0;
        class703.field9752 = 0;
        class407.field5656 = 0;
        class180.field2723 = 0;
        class433.field5966 = 0;
        class454.field6200 = 0;
        class582.field7632 = 0;
        class677.field9421 = 0;
        class378.field5271 = 0;
        class77.field947 = 0;
        class660.field8714 = 0;
        class122.field1950 = 0;
        class86.field1032 = 0;
        class658.field8694 = 0;
        class130.field2132 = 0;
        class663.field8777 = 0;
        class85.field1028 = 0;
        class539.field7138 = 0;
        class308.field4433 = 0;
        class163.field2465 = 0;
        class299.field4251 = 0;
        class389.field5415 = 0;
        class65.field793 = 0;
        class543.field7177 = 0;
        class671.field9148 = 0;
        class653.field8654 = 0;
        class556.field7323 = 0;
        class456.field6222 = 0;
        class425.field5846 = 0;
        class289.field4117 = 0;
        class350.field4920 = 0;
        class663.field8801 = 0;
        class749.field10412 = 0;
        field8043 = 0;
        class305.field4387 = 0;
        class564.field7395 = 0;
        class672.field9170 = 0;
        field8012 = 0;
        class721.field10038 = 0;
        class595.field7737 = 0;
        field8021 = 0;
        class289.field4121 = 0;
        class663.field8839 = 0;
        class517.field6835 = 0;
        class341.field4811 = 0;
        class226.field3208 = 0;
        class204.field3055 = 0;
        class130.field2136 = 0;
        class111.field1601 = 0;
        class109.field1465 = 0;
        class749.field10408 = 0;
        class3.field40 = 0;
        class111.field1698 = 0;
        class749.field10417 = 0;
        class466.field6411 = 0;
        class143.field2276 = 0;
        class631.field8405 = 0;
        class749.field10424 = 0;
        class189.field2850 = 0;
        class376.field5240 = 0;
        class537.field7074 = 0;
        class71.field863 = 0;
        class453.field6190 = 0;
        class672.field9199 = 0;
        class4.field114 = 0;
        class71.field860 = 0;
        class146.field2306 = 0;
        class671.field9147 = 0;
        class395.field5503 = 0;
        class92.field1107 = 0;
        class71.field879 = 0;
        class694.field9664 = 0;
        class47.field593 = 0;
        class705.field9774 = 0;
        class431.field5940 = 0;
        class662.field8735 = 0;
        class473.field6494 = 0;
        class460.field6286 = 0;
        class519.field6922 = 0;
        class258.field3565 = 0;
        class498.field6711 = 0;
        class677.field9453 = 0;
        class640.field8488 = 0;
        class327.field4671 = 0;
        class677.field9392 = 0;
        class672.field9168 = 0;
        class92.field1114 = 0;
        class383.field5324 = 0;
        class343.field4821 = 0;
        class111.field1602 = 0;
        class555.field7294 = 0;
        class111.field1716 = 0;
        class412.field5713 = 0;
        class166.field2538 = 0;
        class161.field2425 = 0;
        class47.field592 = 0;
        class677.field9441 = 0;
        class179.field2714 = 0;
        class8.field159 = 0;
        class109.field1477 = 0;
        class303.field4295 = 0;
        class614.field8174 = 0;
        class111.field1611 = 0;
        class677.field9423 = 0;
        class464.field6394 = 0;
        class628.field8344 = 0;
        class539.field7144 = 0;
        class483.field6599 = 0;
        class353.field4976 = 0;
        class460.field6296 = 0;
        class189.field2845 = 0;
        class320.field4579 = 0;
        class564.field7402 = 0;
        class656.field8674 = 0;
        class207.field3076 = 0;
        class226.field3218 = 0;
        class692.field9643 = 0;
        class338.field4775 = 0;
        class87.field1058 = 0;
        class111.field1689 = 0;
        class546.field7218 = 0;
        class53.field653 = 0;
        class509.field6781 = 0;
        class64.field778 = 0;
        class435.field6001 = 0;
        class253.field3488 = 0;
        class718.field9993 = 0;
        class111.field1531 = 0;
        class43.field560 = 0;
        class12.field188 = 0;
        class373.field5177 = 0;
        class367.field5143 = 0;
        class42.field551 = 0;
        class663.field8744 = 0;
        class397.field5540 = 0;
        class37.field522 = 0;
        class682.field9527 = 0;
        class459.field6272 = 0;
        class442.field6090 = 0;
        class464.field6396 = 0;
        class113.field1862 = 0;
        class122.field2028 = 0;
        class494.field6668 = 0;
        class690.field9604 = 0;
        class350.field4923 = 0;
        class385.field5385 = 0;
        class111.field1623 = 0;
        class207.field3069 = 0;
        class387.field5404 = 0;
        class204.field3049 = 0;
        class597.field7827 = 0;
        class213.field3120 = 0;
        class27.field434 = 0;
        class100.field1344 = 0;
        class741.field10218 = 0;
        class718.field9956 = 0;
        class296.field4230 = 0;
        class111.field1691 = 0;
        class111.field1637 = 0;
        class694.field9656 = 0;
        client.field4358 = 0;
        class475.field6507 = 0;
        class180.field2720 = 0;
        class359.field5020 = 0;
        class87.field1065 = 0;
        class291.field4158 = 0;
        class681.field9510 = 0;
        class561.field7365 = 0;
        class640.field8499 = 0;
        class663.field8878 = 0;
        class187.field2826 = 0;
        class663.field8790 = 0;
        class111.field1653 = 0;
        class288.field4091 = 0;
        class82.field988 = 0;
        class172.field2630 = 0;
        class672.field9281 = 0;
        class718.field9995 = 0;
        class111.field1673 = 0;
        class463.field6367 = 0;
        class1.field7 = 0;
        class348.field4891 = 0;
        field8029 = 0;
        class210.field3094 = 0;
        class403.field5620 = 0;
        class489.field6644 = 0;
        class207.field3080 = 0;
        class585.field7654 = 0;
        class66.field820 = 0;
        class351.field4932 = 0;
        class178.field2681 = 0;
        class111.field1688 = 0;
        class262.field3668 = 0;
        class743.field10328 = 0;
        class205.field3065 = 0;
        class250.field3440 = 0;
        class360.field5069 = 0;
        class438.field6042 = 0;
        class663.field8737 = 0;
        class556.field7315 = 0;
        class359.field5038 = 0;
        class55.field666 = 0;
        class498.field6704 = 0;
        class75.field907 = 0;
        class111.field1585 = 0;
        class578.field7582 = 0;
        class628.field8373 = 0;
        class471.field6448 = 0;
        class65.field788 = 0;
        class498.field6706 = 0;
        class97.field1201 = 0;
        class377.field5254 = 0;
        class435.field6004 = 0;
        class126.field2079 = 0;
        class259.field3612 = 0;
        class400.field5587 = 0;
        class657.field8688 = 0;
        class679.field9491 = 0;
        class3.field75 = 0;
        class111.field1718 = 0;
        class111.field1620 = 0;
        class663.field8891 = 0;
        class598.field7846 = 0;
        class694.field9661 = 0;
        class691.field9628 = 0;
        class111.field1608 = 0;
        class749.field10418 = 0;
        class211.field3101 = 0;
        class288.field4089 = 0;
        class299.field4252 = 0;
        class299.field4248 = 0;
        class663.field8896 = 0;
        class330.field4712 = 0;
        class353.field4958 = 0;
        class354.field4985 = 0;
        class761.field10601 = 0;
        class94.field1142 = 0;
        class329.field4696 = 0;
        class161.field2407 = 0;
        class122.field1961 = 0;
        class648.field8592 = 0;
        class660.field8713 = 0;
        class382.field5305 = 0;
        class437.field6023 = 0;
        class259.field3611 = 0;
        class276.field3840 = 0;
        class111.field1544 = 0;
        class197.field2973 = 0;
        class199.field2995 = 0;
        class663.field8851 = 0;
        class169.field2602 = 0;
        class360.field5066 = 0;
        class6.field136 = 0;
        class122.field2016 = 0;
        class663.field8760 = 0;
        class225.field3194 = 0;
        class710.field9838 = 0;
        class291.field4157 = 0;
        class183.field2765 = 0;
        class284.field4034 = 0;
        class612.field8153 = 0;
        class65.field804 = 0;
        class440.field6077 = 0;
        class478.field6561 = 0;
        class730.field10123 = 0;
        class111.field1599 = 0;
        class4.field111 = 0;
        class334.field4749 = 0;
        class645.field8573 = 0;
        class614.field8170 = 0;
        class369.field5152 = 0;
        class663.field8779 = 0;
        class585.field7646 = 0;
        class294.field4209 = 0;
        class96.field1186 = 0;
        class140.field2215 = 0;
        class122.field2019 = 0;
        class663.field8788 = 0;
        class111.field1670 = 0;
        class746.field10382 = 0;
        class82.field983 = 0;
        class122.field1991 = 0;
        class663.field8906 = 0;
        class426.field5863 = 0;
        class352.field4940 = 0;
        class365.field5123 = 0;
        class389.field5442 = 0;
        class615.field8183 = 0;
        class3.field60 = 0;
        class173.field2636 = 0;
        class65.field802 = 0;
        class663.field8752 = 0;
        class595.field7723 = 0;
        class284.field4026 = 0;
        class684.field9546 = 0;
        class505.field6753 = 0;
        class595.field7740 = 0;
        class251.field3458 = 0;
        class273.field3806 = 0;
        class594.field7713 = 0;
        class86.field1031 = 0;
        class663.field8905 = 0;
        class459.field6267 = 0;
        class276.field3839 = 0;
        class423.field5822 = 0;
        field8001 = 0;
        class389.field5422 = 0;
        class288.field4075 = 0;
        class616.field8230 = 0;
        class435.field5984 = 0;
        class464.field6390 = 0;
        class412.field5724 = 0;
        class185.field2793 = 0;
        class304.field4311 = 0;
        class65.field795 = 0;
        class538.field7106 = 0;
        class586.field7658 = 0;
        class169.field2591 = 0;
        class696.field9693 = 0;
        class392.field5474 = 0;
        class291.field4150 = 0;
        field8068 = 0;
        class520.field6942 = 0;
        class502.field6741 = 0;
        class348.field4900 = 0;
        class2.field16 = 0;
        class718.field9973 = 0;
        class553.field7286 = 0;
        class120.field1916 = 0;
        class328.field4688 = 0;
        class409.field5678 = 0;
        class663.field8774 = 0;
        class681.field9507 = 0;
        class498.field6700 = 0;
        class318.field4542 = 0;
        class421.field5792 = 0;
        class435.field5982 = 0;
        class460.field6294 = 0;
        class440.field6072 = 0;
        class721.field10036 = 0;
        class1.field5 = 0;
        class636.field8460 = 0;
        class677.field9452 = 0;
        class672.field9206 = 0;
        class366.field5131 = 0;
        class677.field9428 = 0;
        class156.field2381 = 0;
        class164.field2489 = 0;
        class684.field9545 = 0;
        class116.field1873 = 0;
        class535.field7046 = 0;
        class726.field10094 = 0;
        class30.field482 = 0;
        class461.field6302 = 0;
        class3.field90 = 0;
        class395.field5512 = 0;
        class481.field6586 = 0;
        class284.field4035 = 0;
        class121.field1932 = 0;
        class289.field4113 = 0;
        class663.field8869 = 0;
        class679.field9475 = 0;
        class761.field10591 = 0;
        client.field4368 = 0;
        class663.field8943 = 0;
        class599.field7852 = 0;
        class3.field92 = 0;
        field8018 = 0;
        class677.field9431 = 0;
        class524.field6959 = 0;
        class689.field9590 = 0;
        class474.field6497 = 0;
        class682.field9521 = 0;
        class111.field1530 = 0;
        class156.field2378 = 0;
        class129.field2118 = 0;
        class122.field1988 = 0;
        class100.field1318 = 0;
        class741.field10216 = 0;
        class111.field1574 = 0;
        class464.field6403 = 0;
        class284.field4009 = 0;
        class659.field8705 = 0;
        class435.field6006 = 0;
        class410.field5683 = 0;
        class253.field3475 = 0;
        class111.field1626 = 0;
        class761.field10594 = 0;
        class477.field6541 = 0;
        field8108 = 0;
        class672.field9241 = 0;
        class325.field4608 = 0;
        class116.field1884 = 0;
        class395.field5511 = 0;
        field8100 = 0;
        class535.field7041 = 0;
        class288.field4068 = 0;
        class742.field10242 = 0;
        class474.field6496 = 0;
        class456.field6231 = 0;
        class229.field3259 = 0;
        class477.field6537 = 0;
        class537.field7072 = 0;
        class227.field3250 = 0;
        class736.field10179 = 0;
        class190.field2869 = 0;
        class595.field7714 = 0;
        class135.field2165 = 0;
        class263.field3675 = 0;
        class359.field5015 = 0;
        class359.field5017 = 0;
        class122.field2029 = 0;
        class742.field10281 = 0;
        class161.field2415 = 0;
        class515.field6824 = 0;
        class631.field8401 = 0;
        class208.field3088 = 0;
        class265.field3694 = 0;
        class122.field2010 = 0;
        class525.field6965 = 0;
        class677.field9436 = 0;
        class536.field7062 = 0;
        class161.field2434 = 0;
        class265.field3695 = 0;
        class384.field5372 = 0;
        class84.field1009 = 0;
        class663.field8749 = 0;
        class114.field1868 = 0;
        class250.field3443 = 0;
        class111.field1595 = 0;
        class122.field2001 = 0;
        class741.field10214 = 0;
        class498.field6702 = 0;
        class2.field32 = 0;
        class663.field8894 = 0;
        class756.field10511 = 0;
        class737.field10184 = 0;
        class2.field27 = 0;
        class62.field764 = 0;
        class536.field7060 = 0;
        class307.field4409 = 0;
        class204.field3054 = 0;
        class89.field1087 = 0;
        class122.field1998 = 0;
        class490.field6650 = 0;
        class649.field8622 = 0;
        class209.field3092 = 0;
        class622.field8295 = 0;
        field8035 = 0;
        class574.field7535 = 0;
        class704.field9759 = 0;
        class48.field620 = 0;
        class425.field5852 = 0;
        class622.field8286 = 0;
        class3.field45 = 0;
        class269.field3765 = 0;
        class742.field10288 = 0;
        class503.field6748 = 0;
        class711.field9845 = 0;
        class111.field1664 = 0;
        class4.field113 = 0;
        class243.field3400 = 0;
        class339.field4787 = 0;
        class400.field5581 = 0;
        class691.field9635 = 0;
        class397.field5528 = 0;
        class284.field4012 = 0;
        class718.field9957 = 0;
        class686.field9567 = 0;
        class564.field7379 = 0;
        field8082 = 0;
        class480.field6576 = 0;
        class596.field7751 = 0;
        class224.field3189 = 0;
        class395.field5517 = 0;
        class78.field950 = 0;
        class498.field6705 = 0;
        class497.field6698 = 0;
        class161.field2422 = 0;
        class306.field4403 = 0;
        class545.field7213 = 0;
        class718.field9991 = 0;
        class135.field2163 = 0;
        class507.field6769 = 0;
        class363.field5104 = 0;
        class691.field9638 = 0;
        class200.field3000 = 0;
        class582.field7629 = 0;
        class95.field1173 = 0;
        class233.field3303 = 0;
        class663.field8938 = 0;
        class97.field1194 = 0;
        class718.field9890 = 0;
        class400.field5574 = 0;
        class64.field783 = 0;
        class512.field6791 = 0;
        class99.field1268 = 0;
        class237.field3329 = 0;
        class292.field4163 = 0;
        class516.field6834 = 0;
        class185.field2792 = 0;
        class676.field9374 = 0;
        class663.field8931 = 0;
        class304.field4324 = 0;
        class185.field2791 = 0;
        class226.field3219 = 0;
        class462.field6353 = 0;
        class708.field9797 = 0;
        class428.field5913 = 0;
        field8023 = 0;
        class400.field5575 = 0;
        class30.field480 = 0;
        class583.field7635 = 0;
        class663.field8864 = 0;
        class20.field350 = 0;
        class225.field3202 = 0;
        class569.field7470 = 0;
        class100.field1292 = 0;
        class176.field2652 = 0;
        class663.field8848 = 0;
        class389.field5420 = 0;
        class574.field7547 = 0;
        class677.field9420 = 0;
        class718.field9936 = 0;
        class87.field1066 = 0;
        class291.field4148 = 0;
        class718.field9921 = 0;
        class389.field5440 = 0;
        class3.field67 = 0;
        class197.field2979 = 0;
        class620.field8269 = 0;
        class663.field8808 = 0;
        class153.field2349 = 0;
        class122.field2004 = 0;
        class668.field9112 = 0;
        class111.field1700 = 0;
        class43.field561 = 0;
        class128.field2106 = 0;
        class236.field3321 = 0;
        class663.field8773 = 0;
        class195.field2933 = 0;
        class20.field348 = 0;
        class397.field5541 = 0;
        class50.field639 = 0;
        class663.field8780 = 0;
        class718.field9881 = 0;
        class189.field2843 = 0;
        class729.field10108 = 0;
        class383.field5322 = 0;
        class383.field5359 = 0;
        class438.field6055 = 0;
        class172.field2625 = 0;
        class276.field3845 = 0;
        class657.field8691 = 0;
        class742.field10272 = 0;
        class111.field1682 = 0;
        class114.field1869 = 0;
        class313.field4475 = 0;
        class761.field10578 = 0;
        class34.field511 = 0;
        class473.field6492 = 0;
        class595.field7729 = 0;
        class514.field6816 = 0;
        class555.field7296 = 0;
        class390.field5460 = 0;
        class395.field5508 = 0;
        class129.field2122 = 0;
        class1.field2 = 0;
        class199.field2991 = 0;
        client.field4361 = 0;
        class98.field1215 = 0;
        class708.field9818 = 0;
        class690.field9612 = 0;
        class323.field4594 = 0;
        class376.field5209 = 0;
        class599.field7874 = 0;
        class353.field4969 = 0;
        class691.field9636 = 0;
        field8050 = 0;
        class448.field6144 = 0;
        class663.field8870 = 0;
        class547.field7236 = 0;
        field8009 = 0;
        class483.field6606 = 0;
        class212.field3108 = 0;
        class663.field8840 = 0;
        class621.field8284 = 0;
        class111.field1621 = 0;
        class672.field9236 = 0;
        class5.field123 = 0;
        class252.field3470 = 0;
        class520.field6933 = 0;
        class60.field729 = 0;
        class548.field7243 = 0;
        class140.field2219 = 0;
        class677.field9455 = 0;
        class588.field7678 = 0;
        class721.field10039 = 0;
        class237.field3340 = 0;
        class395.field5514 = 0;
        class270.field3779 = 0;
        class456.field6244 = 0;
        class95.field1156 = 0;
        class122.field2002 = 0;
        class430.field5929 = 0;
        class111.field1532 = 0;
        class380.field5287 = 0;
        class40.field547 = 0;
        class187.field2823 = 0;
        class439.field6065 = 0;
        class111.field1579 = 0;
        class241.field3389 = 0;
        class572.field7511 = 0;
        class663.field8936 = 0;
        class354.field4983 = 0;
        class275.field3828 = 0;
        class672.field9258 = 0;
        class217.field3140 = 0;
        class708.field9819 = 0;
        class359.field5030 = 0;
        client.field4359 = 0;
        class287.field4065 = 0;
        class564.field7385 = 0;
        class63.field768 = 0;
        class299.field4258 = 0;
        class698.field9705 = 0;
        class427.field5892 = 0;
        class700.field9723 = 0;
        class677.field9409 = 0;
        class288.field4097 = 0;
        class663.field8803 = 0;
        class376.field5245 = 0;
        class363.field5116 = 0;
        class51.field643 = 0;
        class513.field6812 = 0;
        class663.field8806 = 0;
        class319.field4546 = 0;
        class733.field10147 = 0;
        class327.field4670 = 0;
        class353.field4970 = 0;
        class286.field4055 = 0;
        class284.field4033 = 0;
        class463.field6370 = 0;
        class663.field8854 = 0;
        class446.field6122 = 0;
        class677.field9401 = 0;
        class1.field8 = 0;
        class278.field3919 = 0;
        class190.field2864 = 0;
        class628.field8362 = 0;
        class543.field7182 = 0;
        class686.field9563 = 0;
        class390.field5449 = 0;
        class230.field3286 = 0;
        class111.field1705 = 0;
        class3.field66 = 0;
        class742.field10245 = 0;
        class585.field7649 = 0;
        class143.field2273 = 0;
        class156.field2380 = 0;
        class750.field10433 = 0;
        class556.field7310 = 0;
        class1.field6 = 0;
        class549.field7246 = 0;
        class95.field1175 = 0;
        class274.field3815 = 0;
        class603.field7925 = 0;
        class251.field3452 = 0;
        class389.field5444 = 0;
        class564.field7405 = 0;
        class464.field6374 = 0;
        class417.field5759 = 0;
        class303.field4302 = 0;
        class363.field5102 = 0;
        class484.field6616 = 0;
        class696.field9692 = 0;
        class34.field509 = 0;
        class447.field6130 = 0;
        class161.field2438 = 0;
        class472.field6466 = 0;
        class382.field5311 = 0;
        class723.field10074 = 0;
        class540.field7150 = 0;
        class426.field5860 = 0;
        class574.field7542 = 0;
        class305.field4391 = 0;
        class430.field5930 = 0;
        class459.field6264 = 0;
        class359.field5012 = 0;
        class272.field3792 = 0;
        class64.field779 = 0;
        class48.field612 = 0;
        class737.field10193 = 0;
        class369.field5151 = 0;
        class244.field3410 = 0;
        class35.field513 = 0;
        class595.field7747 = 0;
        class663.field8888 = 0;
        class541.field7175 = 0;
        field8032 = 0;
        class339.field4782 = 0;
        class462.field6331 = 0;
        class53.field652 = 0;
        class639.field8471 = 0;
        class307.field4411 = 0;
        class615.field8214 = 0;
        class390.field5454 = 0;
        class163.field2461 = 0;
        class237.field3343 = 0;
        class289.field4118 = 0;
        class741.field10213 = 0;
        class663.field8776 = 0;
        class163.field2450 = 0;
        class304.field4318 = 0;
        class217.field3138 = 0;
        class71.field864 = 0;
        class653.field8650 = 0;
        class663.field8874 = 0;
        class761.field10603 = 0;
        class419.field5777 = 0;
        class485.field6628 = 0;
        class125.field2069 = 0;
        class447.field6136 = 0;
        class284.field4014 = 0;
        class593.field7706 = 0;
        class421.field5789 = 0;
        class28.field440 = 0;
        class383.field5335 = 0;
        class663.field8767 = 0;
        field8096 = 0;
        class377.field5246 = 0;
        class353.field4960 = 0;
        class135.field2167 = 0;
        class94.field1144 = 0;
        class376.field5205 = 0;
        class598.field7847 = 0;
        class659.field8704 = 0;
        class517.field6839 = 0;
        class376.field5206 = 0;
        class663.field8932 = 0;
        class564.field7425 = 0;
        class556.field7311 = 0;
        class285.field4037 = 0;
        class663.field8740 = 0;
        class348.field4893 = 0;
        class435.field5994 = 0;
        class122.field2011 = 0;
        class571.field7502 = 0;
        class615.field8213 = 0;
        class718.field9954 = 0;
        class111.field1690 = 0;
        class421.field5799 = 0;
        class122.field1995 = 0;
        class111.field1563 = 0;
        class506.field6759 = 0;
        class439.field6064 = 0;
        class535.field7042 = 0;
        class705.field9773 = 0;
        class656.field8678 = 0;
        class225.field3191 = 0;
        class15.field210 = 0;
        class292.field4165 = 0;
        class663.field8757 = 0;
        class288.field4095 = 0;
        class501.field6734 = 0;
        class284.field4006 = 0;
        class179.field2702 = 0;
        class235.field3309 = 0;
        class390.field5462 = 0;
        class392.field5476 = 0;
        class684.field9549 = 0;
        class127.field2089 = 0;
        class182.field2740 = 0;
        field8067 = 0;
        class189.field2849 = 0;
        class169.field2593 = 0;
        class761.field10590 = 0;
        class601.field7887 = 0;
        class585.field7650 = 0;
        class376.field5224 = 0;
        class595.field7720 = 0;
        class708.field9807 = 0;
        class224.field3186 = 0;
        class480.field6581 = 0;
        class545.field7214 = 0;
        class284.field4016 = 0;
        class757.field10528 = 0;
        class417.field5763 = 0;
        class538.field7100 = 0;
        class284.field4036 = 0;
        class677.field9438 = 0;
        class687.field9581 = 0;
        class746.field10379 = 0;
        class360.field5070 = 0;
        class460.field6295 = 0;
        class663.field8786 = 0;
        class292.field4180 = 0;
        class107.field1460 = 0;
        class299.field4254 = 0;
        class472.field6467 = 0;
        class101.field1386 = 0;
        class318.field4537 = 0;
        class390.field5453 = 0;
        class360.field5068 = 0;
        class111.field1622 = 0;
        class111.field1562 = 0;
        class271.field3786 = 0;
        field7997 = 0;
        class761.field10583 = 0;
        class227.field3229 = 0;
        class95.field1169 = 0;
        class111.field1555 = 0;
        class58.field694 = 0;
        class111.field1627 = 0;
        class126.field2082 = 0;
        class475.field6509 = 0;
        class681.field9508 = 0;
        class125.field2074 = 0;
        class446.field6120 = 0;
        class708.field9792 = 0;
        class284.field4011 = 0;
        class320.field4575 = 0;
        class237.field3333 = 0;
        class389.field5426 = 0;
        class540.field7156 = 0;
        class448.field6143 = 0;
        class71.field876 = 0;
        class718.field9972 = 0;
        class350.field4929 = 0;
        class607.field7992 = 0;
        class435.field6000 = 0;
        class663.field8785 = 0;
        class427.field5885 = 0;
        class462.field6348 = 0;
        class337.field4772 = 0;
        class719.field10009 = 0;
        class389.field5427 = 0;
        class353.field4961 = 0;
        class161.field2416 = 0;
        class719.field10017 = 0;
        client.field4356 = 0;
        class462.field6342 = 0;
        class639.field8470 = 0;
        class111.field1561 = 0;
        class723.field10065 = 0;
        class557.field7334 = 0;
        class595.field7718 = 0;
        class320.field4573 = 0;
        class60.field746 = 0;
        class117.field1886 = 0;
        class3.field80 = 0;
        class761.field10582 = 0;
        class690.field9607 = 0;
        class64.field780 = 0;
        class621.field8283 = 0;
        class741.field10215 = 0;
        class628.field8370 = 0;
        class330.field4704 = 0;
        class580.field7623 = 0;
        class708.field9806 = 0;
        class760.field10568 = 0;
        class427.field5884 = 0;
        class393.field5485 = 0;
        class679.field9484 = 0;
        class557.field7337 = 0;
        class182.field2757 = 0;
        class94.field1125 = 0;
        class484.field6619 = 0;
        class127.field2100 = 0;
        class663.field8804 = 0;
        class553.field7280 = 0;
        class315.field4500 = 0;
        class411.field5703 = 0;
        class722.field10059 = 0;
        class78.field951 = 0;
        class100.field1366 = 0;
        class331.field4716 = 0;
        class12.field191 = 0;
        class155.field2372 = 0;
        class616.field8239 = 0;
        class51.field650 = 0;
        class737.field10189 = 0;
        class474.field6499 = 0;
        class515.field6823 = 0;
        class98.field1246 = 0;
        class484.field6610 = 0;
        class135.field2159 = 0;
        class642.field8544 = 0;
        class531.field7026 = 0;
        class489.field6637 = 0;
        class462.field6347 = 0;
        class597.field7769 = 0;
        class383.field5340 = 0;
        class140.field2216 = 0;
        class122.field1949 = 0;
        class363.field5110 = 0;
        class185.field2785 = 0;
        class438.field6037 = 0;
        class376.field5226 = 0;
        class686.field9568 = 0;
        class105.field1440 = 0;
        class538.field7122 = 0;
        class425.field5847 = 0;
        class1.field4 = 0;
        class447.field6128 = 0;
        class680.field9498 = 0;
        class226.field3214 = 0;
        class80.field976 = 0;
        class111.field1592 = 0;
        class601.field7892 = 0;
        class212.field3107 = 0;
        class369.field5156 = 0;
        class60.field740 = 0;
        class601.field7900 = 0;
        class288.field4071 = 0;
        class416.field5746 = 0;
        class111.field1661 = 0;
        class122.field1947 = 0;
        class175.field2645 = 0;
        class264.field3678 = 0;
        class749.field10414 = 0;
        class637.field8465 = 0;
        class663.field8789 = 0;
        class185.field2798 = 0;
        class376.field5236 = 0;
        class359.field5016 = 0;
        class296.field4229 = 0;
        class621.field8276 = 0;
        class101.field1381 = 0;
        class109.field1504 = 0;
        class500.field6723 = 0;
        class459.field6270 = 0;
        class273.field3800 = 0;
        class532.field7030 = 0;
        class3.field43 = 0;
        class83.field994 = 0;
        class300.field4260 = 0;
        class663.field8865 = 0;
        class528.field7005 = 0;
        class628.field8369 = 0;
        class118.field1901 = 0;
        class761.field10595 = 0;
        class122.field1990 = 0;
        class477.field6548 = 0;
        class677.field9418 = 0;
        class701.field9741 = 0;
        class34.field504 = 0;
        class410.field5682 = 0;
        class129.field2130 = 0;
        class66.field812 = 0;
        class129.field2129 = 0;
        class663.field8881 = 0;
        class663.field8741 = 0;
        class111.field1619 = 0;
        class410.field5687 = 0;
        class182.field2733 = 0;
        class691.field9634 = 0;
        class395.field5505 = 0;
        class141.field2251 = 0;
        class259.field3604 = 0;
        class439.field6070 = 0;
        class382.field5315 = 0;
        class538.field7079 = 0;
        class102.field1424 = 0;
        class95.field1161 = 0;
        class58.field698 = 0;
        class11.field178 = 0;
        class577.field7575 = 0;
        class745.field10375 = 0;
        class663.field8822 = 0;
        class663.field8754 = 0;
        class288.field4087 = 0;
        class635.field8450 = 0;
        class584.field7643 = 0;
        class42.field555 = 0;
        class742.field10282 = 0;
        class756.field10505 = 0;
        class111.field1630 = 0;
        class111.field1557 = 0;
        class343.field4815 = 0;
        class724.field10084 = 0;
        class91.field1099 = 0;
        class430.field5923 = 0;
        class230.field3274 = 0;
        class254.field3493 = 0;
        class105.field1437 = 0;
        class675.field9355 = 0;
        class651.field8637 = 0;
        class277.field3855 = 0;
        class708.field9810 = 0;
        class258.field3544 = 0;
        field8005 = 0;
        class607.field7988 = 0;
        class165.field2500 = 0;
        class616.field8232 = 0;
        class78.field952 = 0;
        class164.field2496 = 0;
        class37.field521 = 0;
        class348.field4881 = 0;
        class142.field2267 = 0;
        class299.field4253 = 0;
        class663.field8890 = 0;
        class762.field10617 = 0;
        class718.field9891 = 0;
        class211.field3097 = 0;
        class233.field3304 = 0;
        class122.field1946 = 0;
        class333.field4735 = 0;
        class129.field2128 = 0;
        class760.field10570 = 0;
        class681.field9514 = 0;
        class592.field7699 = 0;
        class99.field1266 = 0;
        class239.field3370 = 0;
        class3.field68 = 0;
        class18.field233 = 0;
        class553.field7284 = 0;
        class761.field10596 = 0;
        class569.field7472 = 0;
        class642.field8545 = 0;
        class603.field7914 = 0;
        class267.field3710 = 0;
        class705.field9777 = 0;
        class438.field6030 = 0;
        class663.field8837 = 0;
        class60.field730 = 0;
        class119.field1912 = 0;
        class464.field6397 = 0;
        class475.field6508 = 0;
        class56.field681 = 0;
        class513.field6805 = 0;
        class742.field10266 = 0;
        class663.field8879 = 0;
        class564.field7387 = 0;
        class212.field3106 = 0;
        class382.field5309 = 0;
        class232.field3291 = 0;
        class614.field8167 = 0;
        class499.field6718 = 0;
        class586.field7662 = 0;
        class677.field9447 = 0;
        class111.field1549 = 0;
        class383.field5317 = 0;
        class185.field2797 = 0;
        class76.field919 = 0;
        class545.field7205 = 0;
        class450.field6168 = 0;
        class615.field8180 = 0;
        class259.field3603 = 0;
        class22.field395 = 0;
        class464.field6402 = 0;
        class348.field4894 = 0;
        class109.field1481 = 0;
        class501.field6727 = 0;
        class100.field1288 = 0;
        class45.field582 = 0;
        class128.field2108 = 0;
        class3.field77 = 0;
        class498.field6701 = 0;
        class621.field8273 = 0;
        field8117 = 0;
        class437.field6024 = 0;
        class663.field8807 = 0;
        class556.field7301 = 0;
        class383.field5364 = 0;
        class677.field9394 = 0;
        class12.field185 = 0;
        class318.field4529 = 0;
        class293.field4202 = 0;
        class531.field7021 = 0;
        class376.field5208 = 0;
        class480.field6583 = 0;
        class189.field2846 = 0;
        class111.field1587 = 0;
        class59.field714 = 0;
        class448.field6140 = 0;
        class5.field129 = 0;
        class569.field7479 = 0;
        class742.field10268 = 0;
        class159.field2397 = 0;
        class435.field5997 = 0;
        class663.field8917 = 0;
        class435.field5991 = 0;
        class490.field6653 = 0;
        class548.field7240 = 0;
        class126.field2076 = 0;
        class348.field4883 = 0;
        class373.field5181 = 0;
        class679.field9490 = 0;
        class374.field5192 = 0;
        class694.field9659 = 0;
        class376.field5244 = 0;
        class347.field4857 = 0;
        class230.field3272 = 0;
        class185.field2795 = 0;
        class388.field5412 = 0;
        class663.field8941 = 0;
        class404.field5637 = 0;
        class155.field2375 = 0;
        field8097 = 0;
        class718.field9938 = 0;
        class87.field1064 = 0;
        class684.field9538 = 0;
        class318.field4540 = 0;
        class87.field1056 = 0;
        class339.field4789 = 0;
        class292.method1810((byte) 97);
        class709.field9831 = true;
        class265.field3687 = true;
        class583.method3186(4270);
        for (int var2 = 0; var2 < class27.field435.length; var2++) {
            class27.field435[var2] = null;
        }
        class142.field2268 = false;
        class60.method524(-107);
        class356.field4996 = (int) (Math.random() * 100.0D) - 50;
        class649.field8626 = (int) (Math.random() * 120.0D) - 60;
        class262.field3656 = (int) (Math.random() * 80.0D) - 40;
        class171.field2622 = (int) (Math.random() * 110.0D) - 55;
        class260.field3629 = (int) (Math.random() * 30.0D) - 20;
        class547.field7230 = ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
        class481.method2710(50);
        for (int var3 = 0; var3 < 2048; var3++) {
            class248.field3438[var3] = null;
        }
        class243.field3403 = 0;
        class306.field4404 = 0;
        class390.field5470.method2138(-1);
        class64.field776.method23(10);
        class141.field2256.method23(10);
        class36.field518.method3872(0);
        class649.field8627.method2138(-1);
        class409.field5677 = new class2();
        class271.field3785 = new class2();
        class74.field901.method4067(-12777);
        class87.method664(-58);
        class617.field8245 = 0;
        class516.field6830 = 0;
        class75.field918 = 0;
        class168.field2588 = 0;
        class4.field120 = 0;
        class98.field1230 = 0;
        class489.field6634 = 0;
        class45.field583 = 0;
        class324.field4605 = 0;
        class762.field10616 = 0;
        for (int var4 = 0; var4 < class540.field7160.length; var4++) {
            if (!class763.field10629[var4]) {
                class540.field7160[var4] = -1;
            }
        }
        if (class443.field6101 != -1) {
            class439.method2532(120, class443.field6101);
        }
        for (class8 var5 = (class8) class350.field4925.method2144(true); var5 != null; var5 = (class8) class350.field4925.method2146(false)) {
            if (!var5.method3566((byte) 78)) {
                var5 = (class8) class350.field4925.method2144(true);
                if (var5 == null) {
                    break;
                }
            }
            class710.method3990(false, false, true, var5);
        }
        class443.field6101 = -1;
        class350.field4925 = new class360(8);
        class709.method3987((byte) 40);
        class420.field5787 = null;
        for (int var6 = 0; var6 < 8; var6++) {
            class44.field574[var6] = null;
            class416.field5745[var6] = false;
            class343.field4826[var6] = -1;
        }
        class661.method3583((byte) 70);
        class229.field3264 = true;
        for (int var7 = 0; var7 < 100; var7++) {
            class12.field192[var7] = true;
        }
        for (int var8 = 0; var8 < 6; var8++) {
            class369.field5148[var8] = new class612();
        }
        for (int var9 = 0; var9 < 25; var9++) {
            class91.field1104[var9] = 0;
            class520.field6940[var9] = 0;
            class101.field1415[var9] = 0;
        }
        class320.method1940(1);
        class616.field8238 = true;
        class393.field5486 = class454.field6195 = class601.field7894 = class528.field7010 = new short[256];
        class643.field8558 = class517.field6866.method2877(class713.field9854, (byte) -108);
        class411.field5711.method1677(class411.field5711.field3888, (byte) -71, class411.field5711.field3882.method1289(true));
        class411.field5711.method1677(class411.field5711.field3890, (byte) -71, class411.field5711.field3908.method984(true));
        class589.field7684 = 0;
        class492.method2787((byte) -116);
        class407.method2381((byte) 68);
        class622.field8296.field5225 = 2;
        class281.field3982 = 0L;
        class66.field826 = null;
    }

    @OriginalMember(owner = "client!lj", name = "na", descriptor = "()I")
    public final int method209() {
        field8039++;
        if (!this.field8094) {
            this.method3308(40);
        }
        return this.field7993;
    }

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method165(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field8097++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            int var13 = 0;
            class125.field2072 = 0;
            class122.field1970 = 0;
            class760.field10564 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field8098.length) {
                    int[] var16 = this.field8098[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field8103 == null || (this.field8103[var18] & arg6) != 0) {
                            class125.field2072 += this.field8000[var18];
                            class122.field1970 += this.field8007[var18];
                            class760.field10564 += this.field8006[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class760.field10564 = var11;
                class125.field2072 = var10;
                class122.field1970 = var12;
            } else {
                class125.field2072 = class125.field2072 / var13 + var10;
                class122.field1970 = class122.field1970 / var13 + var12;
                class760.field10564 = class760.field10564 / var13 + var11;
                class299.field4247 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + (arg7[2] * arg4) + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + (arg7[4] * arg3) + (arg7[5] * arg4) + 8192 >> 14;
                int var21 = arg7[6] * arg2 + (arg7[8] * arg4) + arg7[7] * arg3 + 8192 >> 14;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field8098.length) {
                    int[] var27 = this.field8098[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field8103 == null || (this.field8103[var29] & arg6) != 0) {
                            this.field8000[var29] += var24;
                            this.field8007[var29] += var23;
                            this.field8006[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field8098.length > var109) {
                        int[] var110 = this.field8098[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field8103 == null || (arg6 & this.field8103[var112]) != 0) {
                                this.field8000[var112] -= class125.field2072;
                                this.field8007[var112] -= class122.field1970;
                                this.field8006[var112] -= class760.field10564;
                                if (arg4 != 0) {
                                    int var113 = class451.field6174[arg4];
                                    int var114 = class451.field6177[arg4];
                                    int var115 = this.field8007[var112] * var113 + this.field8000[var112] * var114 + 16383 >> 14;
                                    this.field8007[var112] = this.field8007[var112] * var114 + 16383 - (this.field8000[var112] * var113) >> 14;
                                    this.field8000[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class451.field6174[arg2];
                                    int var117 = class451.field6177[arg2];
                                    int var118 = this.field8007[var112] * var117 + 16383 - (this.field8006[var112] * var116) >> 14;
                                    this.field8006[var112] = this.field8007[var112] * var116 + this.field8006[var112] * var117 + 16383 >> 14;
                                    this.field8007[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class451.field6174[arg3];
                                    int var120 = class451.field6177[arg3];
                                    int var121 = this.field8006[var112] * var119 + this.field8000[var112] * var120 + 16383 >> 14;
                                    this.field8006[var112] = this.field8006[var112] * var120 + 16383 - this.field8000[var112] * var119 >> 14;
                                    this.field8000[var112] = var121;
                                }
                                this.field8000[var112] += class125.field2072;
                                this.field8007[var112] += class122.field1970;
                                this.field8006[var112] += class760.field10564;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field8098.length > var92) {
                            int[] var93 = this.field8098[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field8103 == null || (this.field8103[var95] & arg6) != 0) {
                                    int var96 = this.field7999[var95];
                                    int var97 = this.field7999[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field8120[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class451.field6174[arg4];
                                            int var101 = class451.field6177[arg4];
                                            int var102 = this.field8087[var99] * var101 + this.field8026[var99] * var100 + 16383 >> 14;
                                            this.field8026[var99] = (short) (this.field8026[var99] * var101 + (16383 - (this.field8087[var99] * var100)) >> 14);
                                            this.field8087[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class451.field6174[arg2];
                                            int var104 = class451.field6177[arg2];
                                            int var105 = this.field8026[var99] * var104 + 16383 - (this.field8055[var99] * var103) >> 14;
                                            this.field8055[var99] = (short) (this.field8055[var99] * var104 + this.field8026[var99] * var103 + 16383 >> 14);
                                            this.field8026[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class451.field6174[arg3];
                                            int var107 = class451.field6177[arg3];
                                            int var108 = this.field8055[var99] * var106 + (this.field8087[var99] * var107) + 16383 >> 14;
                                            this.field8055[var99] = (short) (this.field8055[var99] * var107 + 16383 - (this.field8087[var99] * var106) >> 14);
                                            this.field8087[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method3301(0);
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class299.field4247) {
                    int var36 = arg7[6] * class760.field10564 + arg7[3] * class122.field1970 + arg7[0] * class125.field2072 + 8192 >> 14;
                    int var37 = arg7[1] * class125.field2072 + arg7[7] * class760.field10564 + arg7[4] * class122.field1970 + 8192 >> 14;
                    int var38 = var34 + var37;
                    int var39 = arg7[8] * class760.field10564 + arg7[2] * class125.field2072 - (-(arg7[5] * class122.field1970) + -8192) >> 14;
                    int var40 = var33 + var36;
                    int var41 = var35 + var39;
                    class122.field1970 = var38;
                    class125.field2072 = var40;
                    class299.field4247 = false;
                    class760.field10564 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class451.field6177[arg2];
                int var44 = class451.field6174[arg2];
                int var45 = class451.field6177[arg3];
                int var46 = class451.field6174[arg3];
                int var47 = class451.field6177[arg4];
                int var48 = class451.field6174[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[5] = -var44;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[1] = var46 * var49 + -var45 * var48 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[7] = var46 * var48 + (var45 * var49) + 8192 >> 14;
                var42[0] = var45 * var47 + (var46 * var50 + 8192) >> 14;
                int var51 = var42[0] * -class125.field2072 + var42[1] * -class122.field1970 - (-(var42[2] * -class760.field10564) + -8192) >> 14;
                int var52 = var42[5] * -class760.field10564 + var42[4] * -class122.field1970 + var42[3] * -class125.field2072 + 8192 >> 14;
                int var53 = var42[8] * -class760.field10564 + (var42[7] * -class122.field1970 + var42[6] * -class125.field2072 + 8192) >> 14;
                int var54 = var51 + class125.field2072;
                int var55 = class122.field1970 + var52;
                int var56 = class760.field10564 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[2] * var35 + var42[0] * var33 + (var42[1] * var34) + 8192 >> 14;
                int var60 = var42[3] * var33 + var42[5] * var35 + var42[4] * var34 + 8192 >> 14;
                int var61 = var54 + var59;
                int var62 = var42[7] * var34 + (var42[6] * var33 + (var42[8] * var35)) + 8192 >> 14;
                int var63 = var55 + var60;
                int var64 = var56 + var62;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var84 + (var86 * 3)];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[2] * var64 + arg7[1] * var63 + arg7[0] * var61 + 8192 >> 14;
                int var68 = arg7[3] * var61 + arg7[5] * var64 + arg7[4] * var63 + 8192 >> 14;
                int var69 = arg7[8] * var64 + arg7[7] * var63 + arg7[6] * var61 + 8192 >> 14;
                int var70 = var30 + var67;
                int var71 = var31 + var68;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field8098.length) {
                        int[] var75 = this.field8098[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field8103 == null || (this.field8103[var77] & arg6) != 0) {
                                int var78 = this.field8007[var77] * var65[1] + this.field8000[var77] * var65[0] + (this.field8006[var77] * var65[2]) + 8192 >> 14;
                                int var79 = this.field8006[var77] * var65[5] + this.field8007[var77] * var65[4] + this.field8000[var77] * var65[3] + 8192 >> 14;
                                int var80 = var71 + var79;
                                int var81 = this.field8007[var77] * var65[7] + this.field8000[var77] * var65[6] + this.field8006[var77] * var65[8] + 8192 >> 14;
                                int var82 = var70 + var78;
                                int var83 = var72 + var81;
                                this.field8000[var77] = var82;
                                this.field8007[var77] = var80;
                                this.field8006[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field8098.length > var173) {
                        int[] var174 = this.field8098[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field8103 == null || (arg6 & this.field8103[var176]) != 0) {
                                this.field8000[var176] -= class125.field2072;
                                this.field8007[var176] -= class122.field1970;
                                this.field8006[var176] -= class760.field10564;
                                this.field8000[var176] = this.field8000[var176] * arg2 >> 7;
                                this.field8007[var176] = this.field8007[var176] * arg3 >> 7;
                                this.field8006[var176] = this.field8006[var176] * arg4 >> 7;
                                this.field8000[var176] += class125.field2072;
                                this.field8007[var176] += class122.field1970;
                                this.field8006[var176] += class760.field10564;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class299.field4247) {
                    int var128 = arg7[6] * class760.field10564 + arg7[3] * class122.field1970 + arg7[0] * class125.field2072 + 8192 >> 14;
                    int var129 = arg7[1] * class125.field2072 + arg7[4] * class122.field1970 + arg7[7] * class760.field10564 + 8192 >> 14;
                    int var130 = var126 + var129;
                    int var131 = arg7[8] * class760.field10564 + arg7[5] * class122.field1970 + arg7[2] * class125.field2072 + 8192 >> 14;
                    int var132 = var125 + var128;
                    class122.field1970 = var130;
                    int var133 = var127 + var131;
                    class125.field2072 = var132;
                    class760.field10564 = var133;
                    class299.field4247 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class125.field2072 * var134 + 8192 >> 14;
                int var138 = -class122.field1970 * var135 + 8192 >> 14;
                int var139 = -class760.field10564 * var136 + 8192 >> 14;
                int var140 = class125.field2072 + var137;
                int var141 = class122.field1970 + var138;
                int var142 = class760.field10564 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var141 + var145;
                int var147 = var140 + var144;
                int var148 = var127 * var136 + 8192 >> 14;
                int var149 = var142 + var148;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[1] * var146 + arg7[0] * var147 + 8192 >> 14;
                int var153 = arg7[3] * var147 + arg7[4] * var146 + arg7[5] * var149 + 8192 >> 14;
                int var154 = var123 + var153;
                int var155 = var122 + var152;
                int var156 = arg7[7] * var146 + arg7[8] * var149 + arg7[6] * var147 + 8192 >> 14;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field8098.length > var159) {
                        int[] var160 = this.field8098[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field8103 == null || (this.field8103[var162] & arg6) != 0) {
                                int var163 = this.field8000[var162] * var150[0] + (this.field8006[var162] * var150[2]) + this.field8007[var162] * var150[1] + 8192 >> 14;
                                int var164 = this.field8007[var162] * var150[4] + this.field8006[var162] * var150[5] + this.field8000[var162] * var150[3] + 8192 >> 14;
                                int var165 = var154 + var164;
                                int var166 = this.field8006[var162] * var150[8] + this.field8000[var162] * var150[6] + (this.field8007[var162] * var150[7]) + 8192 >> 14;
                                int var167 = var155 + var163;
                                this.field8000[var162] = var167;
                                int var168 = var157 + var166;
                                this.field8007[var162] = var165;
                                this.field8006[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8090 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (var182 < this.field8090.length) {
                        int[] var183 = this.field8090[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field8040 == null || (arg6 & this.field8040[var185]) != 0) {
                                int var186 = (this.field8070[var185] & 0xFF) + arg2 * 8;
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field8070[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field8016 != null) {
                        for (int var179 = 0; var179 < this.field8089; var179++) {
                            class238 var180 = this.field8016[var179];
                            class110 var181 = this.field8047[var179];
                            var181.field1525 = var181.field1525 & 0xFFFFFF | 255 - (this.field8070[var180.field3362] & 0xFF) << 24;
                        }
                    }
                    this.method3302(-5565);
                }
            }
        } else if (arg0 == 7) {
            if (this.field8090 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (var192 < this.field8090.length) {
                        int[] var193 = this.field8090[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field8040 == null || (this.field8040[var195] & arg6) != 0) {
                                int var196 = this.field8081[var195] & 0xFFFF;
                                int var197 = var196 >> 10 & 0x3F;
                                int var198 = var196 >> 7 & 0x7;
                                int var199 = var196 & 0x7F;
                                int var200 = arg2 + var197 & 0x3F;
                                int var201 = arg3 / 4 + var198;
                                int var202 = arg4 + var199;
                                if (var201 < 0) {
                                    var201 = 0;
                                } else if (var201 > 7) {
                                    var201 = 7;
                                }
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field8081[var195] = (short) class446.method2556(var202, class446.method2556(var201 << 7, var200 << 10));
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field8016 != null) {
                        for (int var189 = 0; var189 < this.field8089; var189++) {
                            class238 var190 = this.field8016[var189];
                            class110 var191 = this.field8047[var189];
                            var191.field1525 = var191.field1525 & 0xFF000000 | class169.field2606[this.field8081[var190.field3362] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method3302(-5565);
                }
            }
        } else if (arg0 == 8) {
            if (this.field8095 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (var204 < this.field8095.length) {
                        int[] var205 = this.field8095[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class110 var207 = this.field8047[var205[var206]];
                            var207.field1519 += arg3;
                            var207.field1524 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8095 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (this.field8095.length > var209) {
                        int[] var210 = this.field8095[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class110 var212 = this.field8047[var210[var211]];
                            var212.field1521 = var212.field1521 * arg2 >> 7;
                            var212.field1520 = var212.field1520 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8095 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (var214 < this.field8095.length) {
                    int[] var215 = this.field8095[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class110 var217 = this.field8047[var215[var216]];
                        var217.field1522 = var217.field1522 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLhv;)V")
    private final void method3316(byte arg0, class520 arg1) {
        field8057++;
        if (arg0 != 2) {
            return;
        }
        if (class566.field7442.length < this.field8088) {
            class566.field7442 = new int[this.field8088];
            class7.field152 = new int[this.field8088];
        }
        for (int var3 = 0; var3 < this.field8052; var3++) {
            int var14 = (this.field8000[var3] - (this.field8007[var3] * this.field8066.field1782 >> 8) >> this.field8066.field1728) - arg1.field6941;
            int var15 = (this.field8006[var3] - (this.field8007[var3] * this.field8066.field1748 >> 8) >> this.field8066.field1728) - arg1.field6939;
            int var16 = this.field7999[var3];
            int var17 = this.field7999[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field8120[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class566.field7442[var19] = var14;
                class7.field152[var19] = var15;
            }
        }
        for (int var4 = 0; var4 < this.field8064; var4++) {
            if (this.field8070 == null || this.field8070[var4] <= 128) {
                short var5 = this.field8072[var4];
                short var6 = this.field8011[var4];
                short var7 = this.field8086[var4];
                int var8 = class566.field7442[var5];
                int var9 = class566.field7442[var6];
                int var10 = class566.field7442[var7];
                int var11 = class7.field152[var5];
                int var12 = class7.field152[var6];
                int var13 = class7.field152[var7];
                if ((var12 - var13) * (var8 - var9) - ((var12 - var11) * (var10 - var9)) > 0) {
                    arg1.method2888(var8, var9, 4, var12, var13, var11, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "(I)[Luk;")
    public static final class263[] method3317(int arg0) {
        field8001++;
        if (arg0 > -81) {
            method3309(53);
        }
        return new class263[] { class304.field4326, class612.field8154, class672.field9266, class464.field6384, class76.field924, class500.field6722 };
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "()[Lcm;")
    public final class730[] method150() {
        field8005++;
        return this.field8058;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()V")
    public final void method157() {
        field8049++;
    }

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "(I)V")
    private final void method3318(int arg0) {
        field8050++;
        if (this.field8113 != null) {
            this.field8113.field5137 = false;
        }
        int var2 = -4 / ((-arg0 - 42) / 35);
    }

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "(IIII)V")
    public final void method179(int arg0, int arg1, int arg2, int arg3) {
        field8002++;
        if (arg0 == 0) {
            class125.field2072 = 0;
            class122.field1970 = 0;
            int var5 = 0;
            class760.field10564 = 0;
            for (int var6 = 0; var6 < this.field8052; var6++) {
                class125.field2072 += this.field8000[var6];
                class122.field1970 += this.field8007[var6];
                var5++;
                class760.field10564 += this.field8006[var6];
            }
            if (var5 > 0) {
                class122.field1970 = class122.field1970 / var5 + arg2;
                class125.field2072 = class125.field2072 / var5 + arg1;
                class760.field10564 = class760.field10564 / var5 + arg3;
            } else {
                class760.field10564 = arg3;
                class122.field1970 = arg2;
                class125.field2072 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field8052; var7++) {
                this.field8000[var7] += arg1;
                this.field8007[var7] += arg2;
                this.field8006[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field8052; var8++) {
                this.field8000[var8] -= class125.field2072;
                this.field8007[var8] -= class122.field1970;
                this.field8006[var8] -= class760.field10564;
                if (arg3 != 0) {
                    int var9 = class451.field6174[arg3];
                    int var10 = class451.field6177[arg3];
                    int var11 = this.field8000[var8] * var10 + (this.field8007[var8] * var9 + 16383) >> 14;
                    this.field8007[var8] = this.field8007[var8] * var10 + 16383 - (this.field8000[var8] * var9) >> 14;
                    this.field8000[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class451.field6174[arg1];
                    int var13 = class451.field6177[arg1];
                    int var14 = this.field8007[var8] * var13 + 16383 - (this.field8006[var8] * var12) >> 14;
                    this.field8006[var8] = this.field8006[var8] * var13 + this.field8007[var8] * var12 + 16383 >> 14;
                    this.field8007[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class451.field6174[arg2];
                    int var16 = class451.field6177[arg2];
                    int var17 = this.field8006[var8] * var15 + this.field8000[var8] * var16 + 16383 >> 14;
                    this.field8006[var8] = this.field8006[var8] * var16 + 16383 - (this.field8000[var8] * var15) >> 14;
                    this.field8000[var8] = var17;
                }
                this.field8000[var8] += class125.field2072;
                this.field8007[var8] += class122.field1970;
                this.field8006[var8] += class760.field10564;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field8052; var18++) {
                this.field8000[var18] -= class125.field2072;
                this.field8007[var18] -= class122.field1970;
                this.field8006[var18] -= class760.field10564;
                this.field8000[var18] = this.field8000[var18] * arg1 / 128;
                this.field8007[var18] = this.field8007[var18] * arg2 / 128;
                this.field8006[var18] = this.field8006[var18] * arg3 / 128;
                this.field8000[var18] += class125.field2072;
                this.field8007[var18] += class122.field1970;
                this.field8006[var18] += class760.field10564;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field8024; var19++) {
                int var23 = (this.field8070[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field8070[var19] = (byte) var23;
            }
            if (this.field8016 != null) {
                for (int var20 = 0; var20 < this.field8089; var20++) {
                    class238 var21 = this.field8016[var20];
                    class110 var22 = this.field8047[var20];
                    var22.field1525 = var22.field1525 & 0xFFFFFF | 255 - (this.field8070[var21.field3362] & 0xFF) << 24;
                }
            }
            this.method3302(-5565);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field8024; var24++) {
                int var28 = this.field8081[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x39A) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var31;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field8081[var24] = (short) class446.method2556(var34, class446.method2556(var32 << 10, var33 << 7));
            }
            if (this.field8016 != null) {
                for (int var25 = 0; var25 < this.field8089; var25++) {
                    class238 var26 = this.field8016[var25];
                    class110 var27 = this.field8047[var25];
                    var27.field1525 = var27.field1525 & 0xFF000000 | class169.field2606[this.field8081[var26.field3362] & 0xFFFF] & 0xFFFFFF;
                }
            }
            this.method3302(-5565);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field8089; var35++) {
                class110 var36 = this.field8047[var35];
                var36.field1524 += arg1;
                var36.field1519 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field8089; var37++) {
                class110 var38 = this.field8047[var37];
                var38.field1520 = var38.field1520 * arg2 >> 7;
                var38.field1521 = var38.field1521 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field8089; var39++) {
                class110 var40 = this.field8047[var39];
                var40.field1522 = var40.field1522 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "NA", descriptor = "()Z")
    public final boolean method145() {
        field8075++;
        if (this.field8098 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field7994; var1++) {
            this.field8000[var1] <<= 0x4;
            this.field8007[var1] <<= 0x4;
            this.field8006[var1] <<= 0x4;
        }
        class122.field1970 = 0;
        class760.field10564 = 0;
        class125.field2072 = 0;
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
    private final void method3319(byte arg0) {
        field7997++;
        if (!this.field8003 || arg0 != 1) {
            return;
        }
        this.field8003 = false;
        if (this.field8058 == null && this.field8071 == null && this.field8016 == null) {
            if (this.field8000 != null && !class129.method1017(this.field8010, this.field8083, (byte) 125)) {
                if (this.field8113 == null || this.field8113.method2171(29782)) {
                    if (!this.field8094) {
                        this.method3308(26);
                    }
                    this.field8000 = null;
                } else {
                    this.field8003 = true;
                }
            }
            if (this.field8007 != null && !class671.method3703((byte) 11, this.field8010, this.field8083)) {
                if (this.field8113 == null || this.field8113.method2171(29782)) {
                    if (!this.field8094) {
                        this.method3308(arg0 ^ 0x37);
                    }
                    this.field8007 = null;
                } else {
                    this.field8003 = true;
                }
            }
            if (this.field8006 != null && !class377.method2234(this.field8083, arg0 ^ 0x1, this.field8010)) {
                if (this.field8113 == null || this.field8113.method2171(29782)) {
                    if (!this.field8094) {
                        this.method3308(4);
                    }
                    this.field8006 = null;
                } else {
                    this.field8003 = true;
                }
            }
        }
        if (this.field8120 != null && this.field8000 == null && this.field8007 == null && this.field8006 == null) {
            this.field7999 = null;
            this.field8120 = null;
        }
        if (this.field8027 != null && !class463.method2628(1, this.field8083, this.field8010)) {
            label205: {
                label204: {
                    boolean var10000;
                    if ((this.field8083 & 0x37) == 0) {
                        if (this.field8059 == null || this.field8059.method2171(29782)) {
                            break label204;
                        }
                        var10000 = false;
                    } else {
                        if (this.field8030 == null || this.field8030.method2171(arg0 + 29781)) {
                            break label204;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field8003 = true;
                        break label205;
                    }
                }
                this.field8087 = this.field8026 = this.field8055 = null;
                this.field8027 = null;
            }
        }
        if (this.field8081 != null && !class762.method4237(arg0 + 24427, this.field8010, this.field8083)) {
            if (this.field8059 == null || this.field8059.method2171(29782)) {
                this.field8081 = null;
            } else {
                this.field8003 = true;
            }
        }
        if (this.field8070 != null && !class528.method2949(262144, this.field8010, this.field8083)) {
            if (this.field8059 == null || this.field8059.method2171(arg0 + 29781)) {
                this.field8070 = null;
            } else {
                this.field8003 = true;
            }
        }
        if (this.field8106 != null && !class303.method1852(this.field8083, this.field8010, (byte) -10)) {
            if (this.field8078 == null || this.field8078.method2171(29782)) {
                this.field8106 = this.field8101 = null;
            } else {
                this.field8003 = true;
            }
        }
        if (this.field8102 != null && !class64.method547(-3, this.field8083, this.field8010)) {
            if (this.field8059 == null || this.field8059.method2171(29782)) {
                this.field8102 = null;
            } else {
                this.field8003 = true;
            }
        }
        if (this.field8072 != null && !class498.method2809(this.field8010, (byte) -104, this.field8083)) {
            if ((this.field8061 == null || this.field8061.method4109(true)) && (this.field8059 == null || this.field8059.method2171(29782))) {
                this.field8072 = this.field8011 = this.field8086 = null;
            } else {
                this.field8003 = true;
            }
        }
        if (this.field8028 != null) {
            if (this.field8113 == null || this.field8113.method2171(arg0 + 29781)) {
                this.field8028 = null;
            } else {
                this.field8003 = true;
            }
        }
        if (this.field8073 != null) {
            if (this.field8059 == null || this.field8059.method2171(29782)) {
                this.field8073 = null;
            } else {
                this.field8003 = true;
            }
        }
        if (this.field8090 != null && !class352.method2105(this.field8083, this.field8010, (byte) 83)) {
            this.field8090 = null;
            this.field8040 = null;
        }
        if (this.field8098 != null && !class490.method2778(this.field8083, this.field8010, arg0 ^ 0x5DF1)) {
            this.field8103 = null;
            this.field8098 = null;
        }
        if (this.field8095 != null && !class128.method1012(this.field8083, (byte) 100, this.field8010)) {
            this.field8095 = null;
        }
        if (this.field8004 != null && (this.field8010 & 0x800) == 0 && (this.field8010 & 0x40000) == 0) {
            this.field8069 = null;
            this.field8112 = null;
            this.field8004 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "(I)Z")
    private final boolean method3320(int arg0) {
        field8079++;
        if (this.field8061.field10174) {
            return true;
        }
        if (arg0 != 8) {
            this.field8106 = null;
        }
        if (this.field8061.field10173 == null) {
            this.field8061.field10173 = this.field8066.method818(-23469, this.field8119);
        }
        class268 var2 = this.field8061.field10173;
        var2.method585(this.field8064 * 6, (byte) 102);
        Buffer var3 = var2.method587(arg0 + 30899, true);
        if (var3 != null) {
            Stream var4 = this.field8066.method820((byte) -20, var3);
            if (Stream.method3739()) {
                for (int var5 = 0; var5 < this.field8064; var5++) {
                    var4.method3735(this.field8072[var5]);
                    var4.method3735(this.field8011[var5]);
                    var4.method3735(this.field8086[var5]);
                }
            } else {
                for (int var6 = 0; var6 < this.field8064; var6++) {
                    var4.method3737(this.field8072[var6]);
                    var4.method3737(this.field8011[var6]);
                    var4.method3737(this.field8086[var6]);
                }
            }
            var4.method3734();
            if (var2.method586(-17694)) {
                this.field8003 = true;
                this.field8061.field10178 = var2;
                this.field8061.field10174 = true;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lrv;IIZZ)V")
    public class608(class111 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field7994 = 0;
        this.field8065 = false;
        this.field8024 = 0;
        this.field8091 = false;
        this.field8052 = 0;
        this.field8094 = false;
        this.field8064 = 0;
        this.field8088 = 0;
        this.field8119 = false;
        this.field8003 = true;
        this.field8010 = arg1;
        this.field8083 = arg2;
        this.field8066 = arg0;
        this.field8119 = arg4;
        if (arg3 || class677.method3784(this.field8010, true, this.field8083)) {
            this.field8113 = new class367(class705.method3965(this.field8010, (byte) -35, this.field8083));
        }
        if (arg3 || class374.method2189(this.field8083, this.field8010, 0)) {
            this.field8078 = new class367(class199.method1343(this.field8010, 192, this.field8083));
        }
        if (arg3 || class593.method3224(this.field8010, this.field8083, 22926)) {
            this.field8059 = new class367(class548.method3062(this.field8083, 55, this.field8010));
        }
        if (arg3 || class478.method2694(true, this.field8083, this.field8010)) {
            this.field8030 = new class367(class224.method1432(this.field8083, this.field8010, (byte) -122));
        }
        if (arg3 || class730.method4094(this.field8010, this.field8083, 125)) {
            this.field8061 = new class736(class130.method1021(this.field8083, this.field8010, (byte) -74));
        }
    }
}
