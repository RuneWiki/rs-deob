import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class11 {

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    private int field173 = 32;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "Z")
    private boolean field176 = false;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "J")
    private long field175 = class504.method3034((byte) -125);

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "[Lhu;")
    private class86[] field194 = new class86[8];

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    private int field192 = 0;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "J")
    private long field195 = 0L;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "Z")
    private boolean field196 = true;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    private int field190 = 0;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "J")
    private long field191 = 0L;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    private int field201 = 0;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    private int field200 = 0;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "[Lhu;")
    private class86[] field198 = new class86[8];

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "Ldq;")
    public static class493 field181 = new class493(88, -2);

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "[I")
    public static int[] field188 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "[I")
    public static int[] field197 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "Ldq;")
    public static class493 field203 = new class493(72, 8);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Lhu;")
    private class86 field166;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "[I")
    public int[] field168;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method73(int arg0) {
        if (arg0 < 85) {
            method74(true, 97, -116, -84, 75, -7, 54);
        }
        field188 = null;
        field203 = null;
        field181 = null;
        field197 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method74(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class320.method1884((byte) 98, arg2);
        field179++;
        int var7 = 0;
        int var8 = arg2 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class387.field5088[arg4];
        int var16 = arg5 - var8;
        int var17 = arg5 + var8;
        class184.method1160(var15, -7, arg1, var16, arg5 - arg2);
        class184.method1160(var15, -7, arg6, var17, var16);
        class184.method1160(var15, -7, arg1, arg2 + arg5, var17);
        if (!arg0) {
            return;
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class36.field485[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var18 = class387.field5088[arg4 + var9];
                    int[] var19 = class387.field5088[arg4 - var9];
                    int var20 = arg5 + var7;
                    int var21 = arg5 - var7;
                    class184.method1160(var18, -7, arg1, var20, var21);
                    class184.method1160(var19, -7, arg1, var20, var21);
                } else {
                    int[] var22 = class387.field5088[arg4 + var9];
                    int[] var23 = class387.field5088[arg4 - var9];
                    int var24 = class36.field485[var9];
                    int var25 = arg5 + var7;
                    int var26 = arg5 - var7;
                    int var27 = arg5 + var24;
                    int var28 = arg5 - var24;
                    class184.method1160(var22, -7, arg1, var28, var26);
                    class184.method1160(var22, -7, arg6, var27, var28);
                    class184.method1160(var22, -7, arg1, var25, var27);
                    class184.method1160(var23, -7, arg1, var28, var26);
                    class184.method1160(var23, -7, arg6, var27, var28);
                    class184.method1160(var23, -7, arg1, var25, var27);
                }
            }
            int[] var29 = class387.field5088[arg4 + var7];
            int[] var30 = class387.field5088[arg4 - var7];
            int var31 = arg5 + var9;
            int var32 = arg5 - var9;
            if (var7 < var8) {
                int var33 = var7 > var11 ? class36.field485[var7] : var11;
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class184.method1160(var29, -7, arg1, var35, var32);
                class184.method1160(var29, -7, arg6, var34, var35);
                class184.method1160(var29, -7, arg1, var31, var34);
                class184.method1160(var30, -7, arg1, var35, var32);
                class184.method1160(var30, -7, arg6, var34, var35);
                class184.method1160(var30, -7, arg1, var31, var34);
            } else {
                class184.method1160(var29, -7, arg1, var31, var32);
                class184.method1160(var30, -7, arg1, var31, var32);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public final synchronized void method75(byte arg0) {
        field170++;
        if (this.field176) {
            return;
        }
        long var2 = class504.method3034((byte) -110);
        try {
            if (var2 > (this.field175 + 500000L)) {
                this.field175 = var2 - 500000L;
            }
            while (var2 > (this.field175 + 5000L)) {
                this.method78(256, 2);
                this.field175 += (256000 / class94.field1140);
            }
        } catch (Exception var8) {
            this.field175 = var2;
        }
        if (this.field168 == null) {
            return;
        }
        try {
            if (this.field191 != 0L) {
                if (var2 < this.field191) {
                    return;
                }
                this.method79(this.field199);
                this.field196 = true;
                this.field191 = 0L;
            }
            int var4 = this.method84();
            if ((this.field201 - var4) > this.field192) {
                this.field192 = this.field201 - var4;
            }
            int var5 = this.field202 + this.field193;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field199) {
                this.field199 += 1024;
                if (this.field199 > 16384) {
                    this.field199 = 16384;
                }
                this.method82();
                var4 = 0;
                this.method79(this.field199);
                if (this.field199 < var5 + 256) {
                    var5 = this.field199 - 256;
                    this.field193 = var5 - this.field202;
                }
                this.field196 = true;
            }
            while (var5 > var4) {
                this.method88(this.field168, 256);
                var4 += 256;
                this.method86();
            }
            if (this.field195 < var2) {
                if (this.field196) {
                    this.field196 = false;
                } else if (this.field192 == 0 && this.field190 == 0) {
                    this.method82();
                    this.field191 = var2 + 2000L;
                    return;
                } else {
                    this.field193 = Math.min(this.field190, this.field192);
                    this.field190 = this.field192;
                }
                this.field192 = 0;
                this.field195 = var2 + 2000L;
            }
            this.field201 = var4;
            int var6 = 7 / ((arg0 - 13) / 33);
        } catch (Exception var7) {
            this.method82();
            this.field191 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lhu;I)V")
    public final synchronized void method76(class86 arg0, int arg1) {
        this.field166 = arg0;
        if (arg1 == -10997) {
            field189++;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[S)[S")
    public static final short[] method77(int arg0, short[] arg1) {
        field174++;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = -24 % ((-arg0 - 40) / 52);
            short[] var3 = new short[arg1.length];
            class318.method1877(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    private final void method78(int arg0, int arg1) {
        field165++;
        this.field200 -= arg0;
        if (this.field200 < 0) {
            this.field200 = 0;
        }
        if (this.field166 != null) {
            this.field166.method688(arg0);
        }
        if (arg1 != 2) {
            this.field195 = -86L;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public void method79(int arg0) throws Exception {
        field183++;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        this.field196 = true;
        field184++;
        if (arg0 != -30270) {
            this.field168 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()V")
    public void method81() throws Exception {
        field185++;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "()V")
    public void method82() {
        field169++;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
    public final synchronized void method83(int arg0) {
        int var2 = -75 / ((45 - arg0) / 53);
        if (class116.field1567 != null) {
            boolean var3 = true;
            for (int var4 = 0; var4 < 2; var4++) {
                if (class116.field1567.field5821[var4] == this) {
                    class116.field1567.field5821[var4] = null;
                }
                if (class116.field1567.field5821[var4] != null) {
                    var3 = false;
                }
            }
            if (var3) {
                class116.field1567.field5822 = true;
                while (class116.field1567.field5814) {
                    class199.method1251(50L, (byte) 121);
                }
                class116.field1567 = null;
            }
        }
        field182++;
        this.method82();
        this.field176 = true;
        this.field168 = null;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "()I")
    public int method84() throws Exception {
        field171++;
        return this.field199;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method85(String arg0, int arg1) {
        field180++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "()V")
    public void method86() throws Exception {
        field167++;
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V")
    public final synchronized void method87(int arg0) {
        if (arg0 != 0) {
            this.field166 = null;
        }
        this.field196 = true;
        field172++;
        try {
            this.method81();
        } catch (Exception var2) {
            this.method82();
            this.field191 = class504.method3034((byte) -102) + 2000L;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([II)V")
    private final void method88(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class8.field72) {
            var3 = arg1 << 1;
        }
        class318.method1873(arg0, 0, var3);
        this.field200 -= arg1;
        if (this.field166 != null && this.field200 <= 0) {
            this.field200 += class94.field1140 >> 4;
            class136.method937(-90, this.field166);
            this.method89(this.field166, -76245787, this.field166.method690());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class86 var10 = null;
                        class86 var11 = this.field198[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class333 var12 = var11.field1077;
                                if (var12 == null || var12.field4201 <= var8) {
                                    var11.field1078 = true;
                                    int var13 = var11.method691();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4201 += var13;
                                    }
                                    if (var4 >= this.field173) {
                                        break label107;
                                    }
                                    class86 var14 = var11.method689();
                                    if (var14 != null) {
                                        int var15 = var11.field1080;
                                        while (var14 != null) {
                                            this.method89(var14, -76245787, var15 * var14.method690() >> 8);
                                            var14 = var11.method692();
                                        }
                                    }
                                    class86 var16 = var11.field1079;
                                    var11.field1079 = null;
                                    if (var10 == null) {
                                        this.field198[var7] = var16;
                                    } else {
                                        var10.field1079 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field194[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1079;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class86 var18 = this.field198[var17];
                this.field198[var17] = this.field194[var17] = null;
                while (var18 != null) {
                    class86 var19 = var18.field1079;
                    var18.field1079 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field200 < 0) {
            this.field200 = 0;
        }
        if (this.field166 != null) {
            this.field166.method693(arg0, 0, arg1);
        }
        this.field175 = class504.method3034((byte) -102);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lhu;II)V")
    private final void method89(class86 arg0, int arg1, int arg2) {
        field178++;
        int var4 = arg2 >> 5;
        class86 var5 = this.field194[var4];
        if (arg1 != -76245787) {
            return;
        }
        if (var5 == null) {
            this.field198[var4] = arg0;
        } else {
            var5.field1079 = arg0;
        }
        this.field194[var4] = arg0;
        arg0.field1080 = arg2;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method90(Component arg0) throws Exception {
        field187++;
    }

    static {
        new class335("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }
}
