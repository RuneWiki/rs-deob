import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class167 {

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "Lpe;")
    public class435 field2165 = new class435();

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "Ljc;")
    public static class305 field2158 = new class305("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "Lao;")
    public static class191 field2170 = new class191(47, 12);

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "Lpe;")
    private class435 field2168;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Lpe;")
    public final class435 method970(int arg0) {
        field2160++;
        class435 var2 = this.field2165.field6344;
        if (arg0 != 12) {
            this.field2168 = null;
        }
        if (this.field2165 == var2) {
            this.field2168 = null;
            return null;
        } else {
            this.field2168 = var2.field6344;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILpe;)V")
    public final void method971(int arg0, class435 arg1) {
        field2161++;
        if (arg1.field6345 != null) {
            arg1.method2674(true);
        }
        arg1.field6344 = this.field2165.field6344;
        arg1.field6345 = this.field2165;
        arg1.field6345.field6344 = arg1;
        if (arg0 != 12) {
            method980(-119, 1, -77, 41, 65, 13, 75);
        }
        arg1.field6344.field6345 = arg1;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Lpe;")
    public final class435 method972(int arg0) {
        field2159++;
        class435 var2 = this.field2168;
        if (this.field2165 == var2) {
            this.field2168 = null;
            return null;
        }
        this.field2168 = var2.field6345;
        if (arg0 > -23) {
            this.method978(75);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
    public static void method973(int arg0) {
        field2170 = null;
        if (arg0 != 2) {
            method982(15);
        }
        field2158 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lsr;I)V")
    public final void method974(class167 arg0, int arg1) {
        if (arg1 != 2) {
            this.method971(-105, null);
        }
        this.method983(arg0, this.field2165.field6344, 47);
        field2163++;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(ILpe;)V")
    public final void method975(int arg0, class435 arg1) {
        if (arg0 != 0) {
            return;
        }
        field2169++;
        if (arg1.field6345 != null) {
            arg1.method2674(true);
        }
        arg1.field6344 = this.field2165;
        arg1.field6345 = this.field2165.field6345;
        arg1.field6345.field6344 = arg1;
        arg1.field6344.field6345 = arg1;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Lpe;")
    public final class435 method976(byte arg0) {
        field2153++;
        class435 var2 = this.field2168;
        int var3 = 44 % ((-arg0 - 82) / 34);
        if (this.field2165 == var2) {
            this.field2168 = null;
            return null;
        } else {
            this.field2168 = var2.field6344;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)Lpe;")
    public final class435 method977(byte arg0) {
        int var2 = 66 % ((arg0 - 8) / 41);
        field2162++;
        class435 var3 = this.field2165.field6344;
        if (this.field2165 == var3) {
            return null;
        } else {
            var3.method2674(true);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)I")
    public final int method978(int arg0) {
        field2155++;
        if (arg0 <= 111) {
            this.method971(15, null);
        }
        int var2 = 0;
        class435 var3 = this.field2165.field6344;
        while (this.field2165 != var3) {
            var3 = var3.field6344;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)Z")
    public final boolean method979(int arg0) {
        field2164++;
        if (arg0 != 2) {
            this.method977((byte) -107);
        }
        return this.field2165.field6344 == this.field2165;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2154++;
        class388.method2355(arg3, false);
        int var7 = 0;
        int var8 = arg3 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        if (arg2 != 24799) {
            method973(92);
        }
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class169.field2184 <= arg4 && arg4 <= class386.field5620) {
            int[] var15 = class5.field54[arg4];
            int var16 = class406.method2491(class307.field4111, false, class91.field1086, arg6 - arg3);
            int var17 = class406.method2491(class307.field4111, false, class91.field1086, arg3 + arg6);
            int var18 = class406.method2491(class307.field4111, false, class91.field1086, arg6 - var8);
            int var19 = class406.method2491(class307.field4111, false, class91.field1086, arg6 + var8);
            class476.method2907(var18, 92, arg1, var15, var16);
            class476.method2907(var19, 43, arg0, var15, var18);
            class476.method2907(var17, 55, arg1, var15, var19);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class532.field7840[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg4 - var9;
                int var21 = arg4 + var9;
                if (class169.field2184 <= var21 && var20 <= class386.field5620) {
                    if (var9 >= var8) {
                        int var22 = class406.method2491(class307.field4111, false, class91.field1086, arg6 + var7);
                        int var23 = class406.method2491(class307.field4111, false, class91.field1086, arg6 - var7);
                        if (class386.field5620 >= var21) {
                            class476.method2907(var22, 77, arg1, class5.field54[var21], var23);
                        }
                        if (class169.field2184 <= var20) {
                            class476.method2907(var22, arg2 ^ 0x60F6, arg1, class5.field54[var20], var23);
                        }
                    } else {
                        int var24 = class532.field7840[var9];
                        int var25 = class406.method2491(class307.field4111, false, class91.field1086, arg6 + var7);
                        int var26 = class406.method2491(class307.field4111, false, class91.field1086, arg6 - var7);
                        int var27 = class406.method2491(class307.field4111, false, class91.field1086, arg6 + var24);
                        int var28 = class406.method2491(class307.field4111, false, class91.field1086, arg6 - var24);
                        if (var21 <= class386.field5620) {
                            int[] var29 = class5.field54[var21];
                            class476.method2907(var28, 73, arg1, var29, var26);
                            class476.method2907(var27, 101, arg0, var29, var28);
                            class476.method2907(var25, 92, arg1, var29, var27);
                        }
                        if (var20 >= class169.field2184) {
                            int[] var30 = class5.field54[var20];
                            class476.method2907(var28, 92, arg1, var30, var26);
                            class476.method2907(var27, arg2 ^ 0x6093, arg0, var30, var28);
                            class476.method2907(var25, 86, arg1, var30, var27);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (var32 >= class169.field2184 && class386.field5620 >= var31) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class307.field4111 && class91.field1086 >= var34) {
                    int var35 = class406.method2491(class307.field4111, false, class91.field1086, var33);
                    int var36 = class406.method2491(class307.field4111, false, class91.field1086, var34);
                    if (var7 >= var8) {
                        if (var32 <= class386.field5620) {
                            class476.method2907(var35, 115, arg1, class5.field54[var32], var36);
                        }
                        if (class169.field2184 <= var31) {
                            class476.method2907(var35, 41, arg1, class5.field54[var31], var36);
                        }
                    } else {
                        int var37 = var7 <= var11 ? var11 : class532.field7840[var7];
                        int var38 = class406.method2491(class307.field4111, false, class91.field1086, arg6 + var37);
                        int var39 = class406.method2491(class307.field4111, false, class91.field1086, arg6 - var37);
                        if (var32 <= class386.field5620) {
                            int[] var40 = class5.field54[var32];
                            class476.method2907(var39, arg2 ^ 0x60FB, arg1, var40, var36);
                            class476.method2907(var38, 126, arg0, var40, var39);
                            class476.method2907(var35, arg2 - 24717, arg1, var40, var38);
                        }
                        if (var31 >= class169.field2184) {
                            int[] var41 = class5.field54[var31];
                            class476.method2907(var39, 117, arg1, var41, var36);
                            class476.method2907(var38, 112, arg0, var41, var39);
                            class476.method2907(var35, 105, arg1, var41, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)Lpe;")
    public final class435 method981(int arg0) {
        field2166++;
        class435 var2 = this.field2165.field6345;
        int var3 = 124 % ((38 - arg0) / 57);
        if (this.field2165 == var2) {
            this.field2168 = null;
            return null;
        } else {
            this.field2168 = var2.field6345;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)V")
    public static final void method982(int arg0) {
        field2157++;
        class309.field4144.method986(9);
        for (int var1 = 0; var1 < 32; var1++) {
            class149.field1954[var1] = 0L;
        }
        if (arg0 != 32) {
            field2158 = null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class238.field3175[var2] = 0L;
        }
        class1.field5 = 0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lsr;Lpe;I)V")
    private final void method983(class167 arg0, class435 arg1, int arg2) {
        if (arg2 != 47) {
            this.method977((byte) -107);
        }
        field2167++;
        class435 var4 = this.field2165.field6345;
        this.field2165.field6345 = arg1.field6345;
        arg1.field6345.field6344 = this.field2165;
        if (this.field2165 != arg1) {
            arg1.field6345 = arg0.field2165.field6345;
            arg1.field6345.field6344 = arg1;
            arg0.field2165.field6345 = var4;
            var4.field6344 = arg0.field2165;
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
    public class167() {
        this.field2165.field6345 = this.field2165;
        this.field2165.field6344 = this.field2165;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
    public final void method984(boolean arg0) {
        field2156++;
        while (true) {
            class435 var2 = this.field2165.field6344;
            if (this.field2165 == var2) {
                if (arg0) {
                    this.method976((byte) -14);
                }
                this.field2168 = null;
                return;
            }
            var2.method2674(true);
        }
    }

    static {
        new class305("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field2171 = 0;
    }
}
