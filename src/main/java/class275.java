import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class275 extends class286 {

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    private int field4603 = 1024;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    private int field4605 = 1024;

    @OriginalMember(owner = "client!mk", name = "Z", descriptor = "I")
    private int field4612 = 0;

    @OriginalMember(owner = "client!mk", name = "X", descriptor = "I")
    private int field4610 = 819;

    @OriginalMember(owner = "client!mk", name = "ab", descriptor = "I")
    private int field4613 = 1024;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    private int field4601 = 0;

    @OriginalMember(owner = "client!mk", name = "fb", descriptor = "I")
    private int field4618 = 2048;

    @OriginalMember(owner = "client!mk", name = "gb", descriptor = "I")
    private int field4619 = 409;

    @OriginalMember(owner = "client!mk", name = "cb", descriptor = "I")
    private int field4615 = 1024;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "Lbe;")
    public static class283 field4602 = class153.method941(2, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "Lbe;")
    public static class283 field4604 = class153.method941(10, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!mk", name = "bb", descriptor = "I")
    public static int field4614 = 0;

    @OriginalMember(owner = "client!mk", name = "eb", descriptor = "[B")
    public static byte[] field4617 = new byte[520];

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!mk", name = "Y", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!mk", name = "db", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!mk", name = "hb", descriptor = "I")
    private int field4620;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "Lla;")
    public static class130 field4608;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "(I)V", line = 4)
    public static void method1846(int arg0) {
        field4602 = null;
        field4604 = null;
        field4608 = null;
        if (arg0 != -3584) {
            method1846(-22);
        }
        field4617 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 172)
    public class275() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lfe;ZI)V", line = 43)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field4606++;
        if (arg1) {
            field4608 = (class130) null;
        }
        if (arg2 == 0) {
            this.field4601 = arg0.method1535((byte) 83);
        } else if (arg2 == 1) {
            this.field4605 = arg0.method1496(true);
        } else if (arg2 == 2) {
            this.field4618 = arg0.method1496(!arg1);
        } else if (arg2 == 3) {
            this.field4619 = arg0.method1496(true);
        } else if (arg2 == 4) {
            this.field4610 = arg0.method1496(true);
        } else if (arg2 == 5) {
            this.field4613 = arg0.method1496(true);
        } else if (arg2 == 6) {
            this.field4612 = arg0.method1535((byte) 105);
        } else if (arg2 == 7) {
            this.field4615 = arg0.method1496(!arg1);
        } else if (arg2 == 8) {
            this.field4603 = arg0.method1496(true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V", line = 147)
    public final void method276(int arg0) {
        field4600++;
        if (arg0 != 3) {
            this.field4605 = 70;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)[I", line = 184)
    public final int[] method14(int arg0, int arg1) {
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (arg0 >= -52) {
            this.field4620 = 0;
        }
        field4616++;
        if (!this.field4863.field3984) {
            return var3;
        }
        int[][] var4 = this.field4863.method1581(0);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean var9 = true;
        boolean var10 = true;
        int var11 = 0;
        int var12 = class27.field410 * this.field4605 >> 12;
        int var13 = 0;
        int var14 = 0;
        int var15 = class27.field410 * this.field4618 >> 12;
        int var16 = class13.field124 * this.field4610 >> 12;
        int var17 = class13.field124 * this.field4619 >> 12;
        if (var16 <= 1) {
            return var4[arg1];
        }
        this.field4620 = class27.field410 / 8 * this.field4613 >> 12;
        int var18 = class27.field410 / var12 + 1;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field4601);
        while (true) {
            while (true) {
                int var22 = var12 + class47.method275(var15 - var12, var21, -1625284640);
                int var23 = var7 + var22;
                int var24 = var17 + class47.method275(var16 - var17, var21, -1625284640);
                if (var23 > class27.field410) {
                    var23 = class27.field410;
                    var22 = class27.field410 - var7;
                }
                int var10000;
                int var28;
                if (var9) {
                    var28 = 0;
                } else {
                    int var25 = var14;
                    int[] var26 = var20[var14];
                    int var27 = 0;
                    var28 = var26[2];
                    int var29 = var5 + var23;
                    if (var29 < 0) {
                        var29 += class27.field410;
                    }
                    if (class27.field410 < var29) {
                        var29 -= class27.field410;
                    }
                    while (true) {
                        int[] var30 = var20[var25];
                        if (var29 >= var30[0] && var29 <= var30[1]) {
                            if (var14 != var25) {
                                int var31 = var5 + var7;
                                if (var31 < 0) {
                                    var31 += class27.field410;
                                }
                                if (class27.field410 < var31) {
                                    var31 -= class27.field410;
                                }
                                for (int var32 = 1; var32 <= var27; var32++) {
                                    int[] var33 = var20[(var14 + var32) % var13];
                                    var28 = Math.max(var28, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var27; var34++) {
                                    int[] var35 = var20[(var14 + var34) % var13];
                                    int var36 = var35[2];
                                    if (var28 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var29 > var31) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var39 = 0;
                                            var40 = Math.min(var29, var38);
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class27.field410;
                                        }
                                        this.method1847(var21, var8 + var39, (byte) -110, var36, var4, var28 - var36, -var39 + var40);
                                    }
                                }
                            }
                            var14 = var25;
                            break;
                        }
                        var10000 = ~var13;
                        var25++;
                        if (var10000 >= ~var25) {
                            var25 = 0;
                        }
                        var27++;
                    }
                }
                if (var24 + var28 <= class13.field124) {
                    var10 = false;
                } else {
                    var24 = class13.field124 - var28;
                }
                if (class27.field410 == var23) {
                    this.method1847(var21, var7 + var6, (byte) -121, var28, var4, var24, var22);
                    if (var10) {
                        return var3;
                    }
                    var14 = 0;
                    var10 = true;
                    var9 = false;
                    int[][] var42 = var20;
                    var20 = var19;
                    int[] var43 = var19[var11++];
                    var13 = var11;
                    var8 = var6;
                    var43[2] = var28 + var24;
                    var19 = var42;
                    var43[0] = var7;
                    var43[1] = var23;
                    var11 = 0;
                    var6 = class47.method275(class27.field410, var21, -1625284640);
                    var5 = var6 - var8;
                    int var44 = var5;
                    if (var5 < 0) {
                        var44 = class27.field410 + var5;
                    }
                    var7 = 0;
                    if (var44 > class27.field410) {
                        var44 -= class27.field410;
                    }
                    while (true) {
                        int[] var45 = var20[var14];
                        if (var44 >= var45[0] && var45[1] >= var44) {
                            break;
                        }
                        var10000 = ~var13;
                        var14++;
                        if (var10000 >= ~var14) {
                            var14 = 0;
                        }
                    }
                } else {
                    int[] var41 = var19[var11++];
                    var41[2] = var24 + var28;
                    var41[1] = var23;
                    var41[0] = var7;
                    this.method1847(var21, var6 + var7, (byte) -122, var28, var4, var24, var22);
                    var7 = var23;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/util/Random;IBI[[III)V", line = 446)
    private final void method1847(Random arg0, int arg1, byte arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        field4607++;
        if (arg2 > -97) {
            this.field4605 = -70;
        }
        int var8 = this.field4603 > 0 ? 4096 - class47.method275(this.field4603, arg0, -1625284640) : 4096;
        int var9 = this.field4620 * this.field4615 >> 12;
        int var10 = this.field4620 - (var9 <= 0 ? 0 : class47.method275(var9, arg0, -1625284640));
        if (arg1 >= class27.field410) {
            arg1 -= class27.field410;
        }
        if (var10 > 0) {
            if (arg5 <= 0 || arg6 <= 0) {
                return;
            }
            int var11 = arg6 / 2;
            int var12 = var11 >= var10 ? var10 : var11;
            int var13 = arg5 / 2;
            int var14 = var10 <= var13 ? var10 : var13;
            int var15 = arg1 + var12;
            int var16 = arg6 - (var12 * 2);
            for (int var17 = 0; var17 < arg5; var17++) {
                int[] var18 = arg4[arg3 + var17];
                if (var14 <= var17) {
                    int var19 = arg5 - var17 - 1;
                    if (var19 < var14) {
                        int var20 = var8 * var19 / var14;
                        if (this.field4612 == 0) {
                            for (int var23 = 0; var23 < var12; var23++) {
                                int var24 = var8 * var23 / var12;
                                var18[class178.method1174(arg1 + var23, class284.field4857)] = var18[class178.method1174(arg1 + arg6 - var23 - 1, class284.field4857)] = var20 * var24 >> 12;
                            }
                        } else {
                            for (int var21 = 0; var21 < var12; var21++) {
                                int var22 = var8 * var21 / var12;
                                var18[class178.method1174(class284.field4857, arg1 + var21)] = var18[class178.method1174(class284.field4857, arg1 + arg6 - var21 - 1)] = var22 < var20 ? var22 : var20;
                            }
                        }
                        if (class27.field410 >= (var15 + var16)) {
                            class136.method849(var18, var15, var16, var20);
                        } else {
                            int var25 = class27.field410 - var15;
                            class136.method849(var18, var15, var25, var20);
                            class136.method849(var18, 0, var16 - var25, var20);
                        }
                    } else {
                        for (int var26 = 0; var26 < var12; var26++) {
                            var18[class178.method1174(arg1 + var26, class284.field4857)] = var18[class178.method1174(arg6 + arg1 - var26 - 1, class284.field4857)] = var8 * var26 / var12;
                        }
                        if (class27.field410 >= var15 + var16) {
                            class136.method849(var18, var15, var16, var8);
                        } else {
                            int var27 = class27.field410 - var15;
                            class136.method849(var18, var15, var27, var8);
                            class136.method849(var18, 0, var16 - var27, var8);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var14;
                    if (this.field4612 == 0) {
                        for (int var29 = 0; var29 < var12; var29++) {
                            int var30 = var8 * var29 / var12;
                            var18[class178.method1174(arg1 + var29, class284.field4857)] = var18[class178.method1174(arg6 + arg1 - var29 - 1, class284.field4857)] = var28 * var30 >> 12;
                        }
                    } else {
                        for (int var31 = 0; var31 < var12; var31++) {
                            int var32 = var8 * var31 / var12;
                            var18[class178.method1174(arg1 + var31, class284.field4857)] = var18[class178.method1174(arg1 + arg6 - var31 - 1, class284.field4857)] = var32 >= var28 ? var28 : var32;
                        }
                    }
                    if (class27.field410 >= (var15 + var16)) {
                        class136.method849(var18, var15, var16, var28);
                    } else {
                        int var33 = class27.field410 - var15;
                        class136.method849(var18, var15, var33, var28);
                        class136.method849(var18, 0, var16 - var33, var28);
                    }
                }
            }
        } else if (arg1 + arg6 <= class27.field410) {
            for (int var34 = 0; var34 < arg5; var34++) {
                class136.method849(arg4[arg3 + var34], arg1, arg6, var8);
            }
        } else {
            int var35 = class27.field410 - arg1;
            for (int var36 = 0; var36 < arg5; var36++) {
                int[] var37 = arg4[arg3 + var36];
                class136.method849(var37, arg1, var35, var8);
                class136.method849(var37, 0, arg6 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILbe;JBILbe;S)V", line = 661)
    public static final void method1848(int arg0, class283 arg1, long arg2, byte arg3, int arg4, class283 arg5, short arg6) {
        field4611++;
        if (arg3 != -60 || class306.field5253 || class42.field589 >= 500) {
            return;
        }
        class103.field1752[class42.field589] = arg1;
        class216.field3656[class42.field589] = arg5;
        class110.field1868[class42.field589] = arg6;
        class76.field1320[class42.field589] = arg2;
        class135.field2257[class42.field589] = arg0;
        class215.field3647[class42.field589] = arg4;
        class42.field589++;
    }
}
