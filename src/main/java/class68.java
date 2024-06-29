import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class68 extends class124 {

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    private int field1181 = 1024;

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "I")
    private int field1197 = 1024;

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "I")
    private int field1193 = 81;

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
    private int field1195 = 8;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    private int field1173 = 204;

    @OriginalMember(owner = "client!oc", name = "pb", descriptor = "I")
    private int field1199 = 409;

    @OriginalMember(owner = "client!oc", name = "rb", descriptor = "I")
    private int field1201 = 0;

    @OriginalMember(owner = "client!oc", name = "qb", descriptor = "I")
    private int field1200 = 4;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field1179 = 0;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "Le;")
    public static class191 field1185 = class54.method368("(U(Y", 2047);

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "Le;")
    public static class191 field1184 = class54.method368("Schrifts-=tze geladen)3", 2047);

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "[I")
    public static int[] field1180 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "Le;")
    public static class191 field1192 = class54.method368("Mitglieder)2Welt", 2047);

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!oc", name = "mb", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!oc", name = "sb", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "Lng;")
    public static class121 field1188;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "[I")
    private int[] field1175;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "[I")
    public static int[] field1183;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "[[I")
    private int[][] field1176;

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "[[I")
    private int[][] field1189;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "[[[I")
    public static int[][][] field1190;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (!arg2) {
            this.field1199 = 18;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field1181 = arg1.method1593(true);
                                    }
                                } else {
                                    this.field1193 = arg1.method1593(true);
                                }
                            } else {
                                this.field1201 = arg1.method1593(true);
                            }
                        } else {
                            this.field1197 = arg1.method1593(true);
                        }
                    } else {
                        this.field1173 = arg1.method1593(true);
                    }
                } else {
                    this.field1199 = arg1.method1593(true);
                }
            } else {
                this.field1195 = arg1.method1580(-29);
            }
        } else {
            this.field1200 = arg1.method1580(-80);
        }
        ++field1196;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILbe;Lbe;IIJ)V")
    public static final void method448(int arg0, int arg1, int arg2, int arg3, class16 arg4, class16 arg5, int arg6, int arg7, long arg8) {
        if (arg4 != null || arg5 != null) {
            class254 var10 = new class254();
            var10.field4498 = arg8;
            var10.field4492 = arg1 * 128 + 64;
            var10.field4504 = arg2 * 128 + 64;
            var10.field4501 = arg3;
            var10.field4499 = arg4;
            var10.field4493 = arg5;
            var10.field4502 = arg6;
            var10.field4495 = arg7;
            for (int var11 = arg0; var11 >= 0; --var11) {
                if (class201.field3608[var11][arg1][arg2] == null) {
                    class201.field3608[var11][arg1][arg2] = new class199(var11, arg1, arg2);
                }
            }
            class201.field3608[arg0][arg1][arg2].field3535 = var10;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)V")
    public static final void method449(boolean arg0, int arg1) {
        if (!arg0) {
            field1179 = 34;
        }
        ++field1187;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    throw new RuntimeException();
                } else {
                    class4.method15(1);
                }
            } else {
                class176.method1187((byte) 116);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;IZI)Lfg;")
    public static final class39 method450(Component arg0, int arg1, boolean arg2, int arg3) {
        ++field1186;
        if (arg2) {
            field1188 = null;
        }
        try {
            Class var4 = Class.forName("eb");
            class39 var5 = (class39) var4.newInstance();
            var5.method157(arg1, arg3, (byte) -29, arg0);
            return var5;
        } catch (Throwable var7) {
            class21 var6 = new class21();
            var6.method157(arg1, arg3, (byte) -51, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 <= 68) {
            return null;
        } else {
            ++field1178;
            int[] var3 = super.field2064.method378(arg1, 0);
            if (super.field2064.field1035) {
                int var4 = 0;
                int var5;
                for (var5 = class236.field4202[arg1] + this.field1201; var5 < 0; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (~var4 > ~this.field1195 && this.field1175[var4] <= var5) {
                    ++var4;
                }
                boolean var6 = ~(1 & var4) == -1;
                int var7 = var4 + -1;
                int var8 = this.field1175[var4];
                int var9 = this.field1175[var4 - 1];
                if (~(this.field1174 + var9) > ~var5 && ~(-this.field1174 + var8) < ~var5) {
                    for (int var10 = 0; ~var10 > ~class64.field1132; ++var10) {
                        int var11 = 0;
                        int var12 = var6 ? this.field1197 : -this.field1197;
                        int var13;
                        for (var13 = (this.field1177 * var12 >> 12) + class257.field4559[var10]; ~var13 > -1; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (this.field1200 > var11 && ~var13 <= ~this.field1189[var7][var11]) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field1189[var7][var14];
                        int var16 = this.field1189[var7][var11];
                        if (~var13 < ~(this.field1174 + var15) && var13 < -this.field1174 + var16) {
                            var3[var10] = this.field1176[var7][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class58.method389(var3, 0, class64.field1132, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class68() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 == -1) {
            this.method453(-17967);
            ++field1191;
        }
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
    public static void method452(int arg0) {
        field1180 = null;
        field1183 = null;
        field1185 = null;
        field1190 = null;
        field1184 = null;
        if (arg0 <= 7) {
            method449(false, 110);
        }
        field1188 = null;
        field1192 = null;
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V")
    private final void method453(int arg0) {
        ++field1182;
        Random var2 = new Random((long) this.field1195);
        this.field1202 = 4096 / this.field1195;
        this.field1177 = 4096 / this.field1200;
        this.field1175 = new int[this.field1195 + 1];
        this.field1189 = new int[this.field1195][this.field1200 - -1];
        int var3 = this.field1202 / 2;
        this.field1174 = this.field1193 / 2;
        if (arg0 != -17967) {
            method450((Component) null, -80, true, 5);
        }
        int var4 = this.field1177 / 2;
        this.field1175[0] = 0;
        this.field1176 = new int[this.field1195][this.field1200];
        for (int var5 = 0; var5 < this.field1195; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1202;
                int var7 = (-2048 + class172.method1156(var2, arg0 ^ 2147465681, 4096)) * this.field1173 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field1175[var5] = this.field1175[var5 + -1] + var8;
            }
            this.field1189[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field1200; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1177;
                    int var11 = (-2048 + class172.method1156(var2, Integer.MIN_VALUE, 4096)) * this.field1199 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field1189[var5][var9] = this.field1189[var5][var9 + -1] + var12;
                }
                this.field1176[var5][var9] = this.field1181 <= 0 ? 4096 : -class172.method1156(var2, Integer.MIN_VALUE, this.field1181) + 4096;
            }
            this.field1189[var5][this.field1200] = 4096;
        }
        this.field1175[this.field1195] = 4096;
    }
}
