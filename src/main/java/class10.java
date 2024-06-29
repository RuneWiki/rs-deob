import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class176 {

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    private int field170 = 0;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "[Lob;")
    public class141[] field167 = new class141[5];

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "S")
    public short field173 = 0;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    private int field181 = -1;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "Z")
    public boolean field186 = true;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    private int field164 = 0;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public int field165 = -1;

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "I")
    public int field192 = -1;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "I")
    public int field191 = -1;

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "I")
    public int field194 = -1;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Z")
    public boolean field176 = true;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "Lob;")
    public class141 field182 = class143.field2764;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "I")
    private int field195 = 128;

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "Z")
    public boolean field193 = true;

    @OriginalMember(owner = "client!ai", name = "kb", descriptor = "I")
    public int field196 = -1;

    @OriginalMember(owner = "client!ai", name = "sb", descriptor = "I")
    public int field204 = -1;

    @OriginalMember(owner = "client!ai", name = "tb", descriptor = "I")
    public int field205 = 1;

    @OriginalMember(owner = "client!ai", name = "Ab", descriptor = "I")
    public int field212 = -1;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    private int field179 = 128;

    @OriginalMember(owner = "client!ai", name = "mb", descriptor = "I")
    public int field198 = -1;

    @OriginalMember(owner = "client!ai", name = "xb", descriptor = "S")
    public short field209 = 0;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "Z")
    public boolean field180 = false;

    @OriginalMember(owner = "client!ai", name = "Cb", descriptor = "I")
    public int field214 = 32;

    @OriginalMember(owner = "client!ai", name = "zb", descriptor = "I")
    public int field211 = -1;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    private int field184 = -1;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "Lob;")
    public static class141 field190 = class175.method1195(40, "Cabbage");

    @OriginalMember(owner = "client!ai", name = "ob", descriptor = "Lob;")
    public static class141 field200 = class175.method1195(40, "mapscene");

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "[Lnb;")
    public static class131[] field172 = new class131[32768];

    @OriginalMember(owner = "client!ai", name = "wb", descriptor = "I")
    public static int field208 = 0;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ai", name = "pb", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ai", name = "qb", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ai", name = "rb", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ai", name = "ub", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ai", name = "vb", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "Lpe;")
    public static class154 field185;

    @OriginalMember(owner = "client!ai", name = "yb", descriptor = "Lpe;")
    public static class154 field210;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "[I")
    private int[] field163;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "[I")
    private int[] field174;

    @OriginalMember(owner = "client!ai", name = "lb", descriptor = "[I")
    public int[] field197;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "[S")
    private short[] field178;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "[S")
    private short[] field189;

    @OriginalMember(owner = "client!ai", name = "nb", descriptor = "[S")
    private short[] field199;

    @OriginalMember(owner = "client!ai", name = "Bb", descriptor = "[S")
    private short[] field213;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)Lai;")
    public final class10 method61(byte arg0) {
        field201++;
        if (arg0 <= 111) {
            this.field182 = null;
        }
        int var2 = -1;
        if (this.field181 != -1) {
            var2 = class7.method53(this.field181, -29);
        } else if (this.field184 != -1) {
            var2 = class180.field3538[this.field184];
        }
        return var2 < 0 || var2 >= this.field197.length || this.field197[var2] == -1 ? null : class50.method323(this.field197[var2], 0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Log;II)V")
    private final void method62(class146 arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            int var4 = arg0.method991(arg1 + 254);
            this.field174 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field174[var5] = arg0.method1007(121);
            }
        } else if (arg2 == 2) {
            this.field182 = arg0.method1013(-19405);
        } else if (arg2 == 12) {
            this.field205 = arg0.method991(255);
        } else if (arg2 == 13) {
            this.field204 = arg0.method1007(89);
        } else if (arg2 == 14) {
            this.field194 = arg0.method1007(114);
        } else if (arg2 == 15) {
            this.field212 = arg0.method1007(55);
        } else if (arg2 == 16) {
            this.field192 = arg0.method1007(59);
        } else if (arg2 == 17) {
            this.field194 = arg0.method1007(arg1 + 122);
            this.field211 = arg0.method1007(68);
            this.field165 = arg0.method1007(94);
            this.field191 = arg0.method1007(117);
        } else if (arg2 >= 30 && arg2 < 35) {
            this.field167[arg2 - 30] = arg0.method1013(arg1 - 19406);
            if (this.field167[arg2 - 30].method933((byte) -81, class178.field3516)) {
                this.field167[arg2 - 30] = null;
            }
        } else if (arg2 == 40) {
            int var12 = arg0.method991(255);
            this.field199 = new short[var12];
            this.field189 = new short[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field189[var13] = (short) arg0.method1007(35);
                this.field199[var13] = (short) arg0.method1007(36);
            }
        } else if (arg2 == 41) {
            int var10 = arg0.method991(255);
            this.field213 = new short[var10];
            this.field178 = new short[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field213[var11] = (short) arg0.method1007(62);
                this.field178[var11] = (short) arg0.method1007(33);
            }
        } else if (arg2 == 60) {
            int var6 = arg0.method991(arg1 + 254);
            this.field163 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field163[var7] = arg0.method1007(29);
            }
        } else if (arg2 == 93) {
            this.field193 = false;
        } else if (arg2 == 95) {
            this.field196 = arg0.method1007(104);
        } else if (arg2 == 97) {
            this.field195 = arg0.method1007(arg1 ^ 0x3F);
        } else if (arg2 == 98) {
            this.field179 = arg0.method1007(arg1 + 36);
        } else if (arg2 == 99) {
            this.field180 = true;
        } else if (arg2 == 100) {
            this.field170 = arg0.method1000(1064893128);
        } else if (arg2 == 101) {
            this.field164 = arg0.method1000(1064893128) * 5;
        } else if (arg2 == 102) {
            this.field198 = arg0.method1007(50);
        } else if (arg2 == 103) {
            this.field214 = arg0.method1007(43);
        } else if (arg2 == 106) {
            this.field181 = arg0.method1007(76);
            if (this.field181 == 65535) {
                this.field181 = -1;
            }
            this.field184 = arg0.method1007(arg1 ^ 0x55);
            if (this.field184 == 65535) {
                this.field184 = -1;
            }
            int var8 = arg0.method991(255);
            this.field197 = new int[var8 + 1];
            for (int var9 = 0; var9 <= var8; var9++) {
                this.field197[var9] = arg0.method1007(arg1 + 113);
                if (this.field197[var9] == 65535) {
                    this.field197[var9] = -1;
                }
            }
        } else if (arg2 == 107) {
            this.field176 = false;
        } else if (arg2 == 109) {
            this.field186 = false;
        } else if (arg2 != 111) {
            if (arg2 == 113) {
                arg0.method1007(68);
                arg0.method1007(63);
            } else if (arg2 == 114) {
                arg0.method1000(1064893128);
                arg0.method1000(arg1 + 1064893127);
            } else if (arg2 == 115) {
                this.field173 = (short) (arg0.method991(255) * 4);
                this.field209 = (short) (arg0.method991(255) * 4);
            }
        }
        field183++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILce;)Lfe;")
    public final class56 method63(int arg0, int arg1, class26 arg2) {
        if (arg0 <= 108) {
            this.field209 = 81;
        }
        field203++;
        if (this.field197 != null) {
            class10 var4 = this.method61((byte) 123);
            return var4 == null ? null : var4.method63(122, arg1, arg2);
        } else if (this.field163 == null) {
            return null;
        } else {
            class56 var5 = (class56) class204.field3916.method1383((long) this.field169, (byte) -58);
            if (var5 == null) {
                boolean var6 = false;
                for (int var7 = 0; var7 < this.field163.length; var7++) {
                    if (!class187.field3628.method1080((byte) 75, this.field163[var7], 0)) {
                        var6 = true;
                    }
                }
                if (var6) {
                    return null;
                }
                class23[] var8 = new class23[this.field163.length];
                for (int var9 = 0; var9 < this.field163.length; var9++) {
                    var8[var9] = class23.method149(class187.field3628, this.field163[var9], 0);
                }
                class23 var10;
                if (var8.length == 1) {
                    var10 = var8[0];
                } else {
                    var10 = new class23(var8, var8.length);
                }
                if (this.field189 != null) {
                    for (int var11 = 0; var11 < this.field189.length; var11++) {
                        var10.method159(this.field189[var11], this.field199[var11]);
                    }
                }
                if (this.field213 != null) {
                    for (int var12 = 0; var12 < this.field213.length; var12++) {
                        var10.method147(this.field213[var12], this.field178[var12]);
                    }
                }
                var5 = var10.method166(64, 768, -50, -10, -50);
                class204.field3916.method1378(var5, (byte) -90, (long) this.field169);
            }
            if (arg2 != null) {
                var5 = arg2.method189(var5, arg1, true);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        field187++;
        if (arg0) {
            this.field189 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)Z")
    public final boolean method65(int arg0) {
        field168++;
        if (this.field197 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field181 != -1) {
            var2 = class7.method53(this.field181, -106);
        } else if (this.field184 != -1) {
            var2 = class180.field3538[this.field184];
        }
        if (arg0 == -5713) {
            return var2 >= 0 && this.field197.length > var2 && this.field197[var2] != -1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZILce;Lce;I)Lfe;")
    public final class56 method66(boolean arg0, int arg1, class26 arg2, class26 arg3, int arg4) {
        field166++;
        if (this.field197 != null) {
            class10 var6 = this.method61((byte) 122);
            return var6 == null ? null : var6.method66(true, arg1, arg2, arg3, arg4);
        }
        class56 var7 = (class56) class166.field3218.method1383((long) this.field169, (byte) -10);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field174.length; var9++) {
                if (!class187.field3628.method1080((byte) 97, this.field174[var9], 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class23[] var10 = new class23[this.field174.length];
            for (int var11 = 0; var11 < this.field174.length; var11++) {
                var10[var11] = class23.method149(class187.field3628, this.field174[var11], 0);
            }
            class23 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class23(var10, var10.length);
            }
            if (this.field189 != null) {
                for (int var13 = 0; var13 < this.field189.length; var13++) {
                    var12.method159(this.field189[var13], this.field199[var13]);
                }
            }
            if (this.field213 != null) {
                for (int var14 = 0; var14 < this.field213.length; var14++) {
                    var12.method147(this.field213[var14], this.field178[var14]);
                }
            }
            var7 = var12.method166(this.field170 + 64, this.field164 + 850, -30, -50, -30);
            class166.field3218.method1378(var7, (byte) -46, (long) this.field169);
        }
        if (!arg0) {
            this.field198 = -84;
        }
        class56 var15;
        if (arg2 != null && arg3 != null) {
            var15 = arg2.method190(var7, -18112, arg3, arg1, arg4);
        } else if (arg2 != null) {
            var15 = arg2.method188(var7, arg4, -7);
        } else if (arg3 == null) {
            var15 = var7.method377(true);
        } else {
            var15 = arg3.method188(var7, arg1, -125);
        }
        if (this.field195 != 128 || this.field179 != 128) {
            var15.method373(this.field195, this.field179, this.field195);
        }
        return var15;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Log;I)V")
    public final void method67(class146 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method991(arg1 ^ 0xFF);
            if (var3 == 0) {
                if (arg1 != 0) {
                    return;
                }
                field171++;
                return;
            }
            this.method62(arg0, 1, var3);
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)V")
    public static void method68(int arg0) {
        field172 = null;
        if (arg0 != -7018) {
            field200 = null;
        }
        field185 = null;
        field200 = null;
        field210 = null;
        field190 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)I")
    public static final int method69(int arg0, int arg1, byte arg2) {
        int var3 = class4.method26(4, arg1 + 45365, arg0 + 91923, (byte) 97) + (class4.method26(2, arg1 + 10294, arg0 + 37821, (byte) 97) - 128 >> 1) + (class4.method26(1, arg1, arg0, (byte) 97) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        field206++;
        int var5 = 21 / ((-arg2 - 6) / 35);
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)V")
    public static final void method70(int arg0, boolean arg1) {
        field175++;
        class118.method766(-5);
        class59.field1147++;
        if (arg0 >= -102) {
            method68(105);
        }
        if (class59.field1147 < 50 && !arg1) {
            return;
        }
        class59.field1147 = 0;
        if (class66.field1278 || class29.field562 == null) {
            return;
        }
        class7.field120.method32(33, 12885);
        try {
            class29.field562.method1093(39, class7.field120.field2859, class7.field120.field2865, 0);
            class7.field120.field2865 = 0;
        } catch (IOException var2) {
            class66.field1278 = true;
        }
        class124.field2392++;
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)I")
    public static final int method71(int arg0) {
        field202++;
        int var1 = -40 % ((66 - arg0) / 36);
        return 6;
    }
}
