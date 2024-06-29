import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class41 {

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Lde;")
    private class58 field786 = null;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    private int field780 = 65000;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Lde;")
    private class58 field788 = null;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[I")
    public static int[] field776 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "[I")
    public static int[] field783 = new int[256];

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lqd;")
    public static class40 field782 = class147.method1106("Spieler kann nicht gefunden werden: ", (byte) -89);

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field779 = 0;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Lqd;")
    public static class40 field789 = class147.method1106("::fps ", (byte) -90);

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Lrb;")
    public static class213 field792;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Lce;")
    public static class239 field791;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIILbg;Lbg;IIJ)V", line = 4)
    public static final void method376(int arg0, int arg1, int arg2, int arg3, class196 arg4, class196 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class302 var10 = new class302();
        var10.field5061 = arg8;
        var10.field5062 = arg1 * 128 + 64;
        var10.field5063 = arg2 * 128 + 64;
        var10.field5071 = arg3;
        var10.field5059 = arg4;
        var10.field5066 = arg5;
        var10.field5067 = arg6;
        var10.field5064 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class93.field1690[var11][arg1][arg2] == null) {
                class93.field1690[var11][arg1][arg2] = new class14(var11, arg1, arg2);
            }
        }
        class93.field1690[arg0][arg1][arg2].field235 = var10;
    }

    @OriginalMember(owner = "client!fk", name = "toString", descriptor = "()Ljava/lang/String;", line = 42)
    public final String toString() {
        field787++;
        return "Cache:" + this.field778;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field783[var0] = var1;
        }
        field792 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBIZ[Lm;[BIIIII)V", line = 63)
    public static final void method377(int arg0, byte arg1, int arg2, boolean arg3, class44[] arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field775++;
        int var11 = 75 / ((arg1 + 38) / 46);
        byte var12;
        if (arg3) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        if (!arg3) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    if (arg9 + var13 > 0 && (arg9 + var13) < 103 && (arg10 + var14) > 0 && arg10 + var14 < 103) {
                        arg4[arg8].field839[arg9 + var13][arg10 + var14] = class276.method1923(arg4[arg8].field839[arg9 + var13][arg10 + var14], -16777217);
                    }
                }
            }
        }
        class26 var15 = new class26(arg5);
        for (int var16 = 0; var16 < var12; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    if (arg6 == var16 && arg2 <= var17 && arg2 + 8 > var17 && arg0 <= var18 && var18 < (arg0 + 8)) {
                        class204.method1439(arg9 + class98.method726(128, var17 & 0x7, var18 & 0x7, arg7), arg10 - -class228.method1599(var18 & 0x7, (byte) 119, arg7, var17 & 0x7), arg8, arg7, 0, 0, var15, 124, arg3);
                    } else {
                        class204.method1439(-1, -1, 0, 0, 0, 0, var15, 114, arg3);
                    }
                }
            }
        }
        if (!class21.field350 || arg3) {
            return;
        }
        class217 var19 = null;
        while (true) {
            while (var15.field478 < var15.field472.length) {
                int var20 = var15.method226(255);
                if (var20 == 0) {
                    var19 = new class217(var15);
                } else if (var20 == 1) {
                    int var21 = var15.method226(255);
                    if (var21 > 0) {
                        for (int var22 = 0; var22 < var21; var22++) {
                            class90 var23 = new class90(var15);
                            int var24 = var23.field1614 >> 7;
                            int var25 = var23.field1641 >> 7;
                            if (var23.field1634 == arg6 && var25 >= arg2 && (arg2 + 8) > var25 && arg0 <= var24 && (arg0 + 8) > var24) {
                                int var26 = (arg9 << 7) + class140.method1036(var23.field1641 & 0x3FF, arg7, (byte) -10, var23.field1614 & 0x3FF);
                                int var27 = (arg10 << 7) + class86.method668(105, var23.field1641 & 0x3FF, var23.field1614 & 0x3FF, arg7);
                                var23.field1614 = var27;
                                var23.field1641 = var26;
                                int var28 = var23.field1641 >> 7;
                                int var29 = var23.field1614 >> 7;
                                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                                    var23.field1626 = class78.field1316[var23.field1634][var28][var29] - var23.field1626;
                                    class84.method642(var23);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var19 == null) {
                var19 = new class217();
            }
            class59.field1140[arg9 >> 3][arg10 >> 3] = var19;
            break;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB[BZI)Z", line = 207)
    private final boolean method378(int arg0, byte arg1, byte[] arg2, boolean arg3, int arg4) {
        field781++;
        class58 var6 = this.field786;
        synchronized (this.field786) {
            try {
                int var7;
                boolean var10000;
                if (arg3) {
                    if (this.field788.method488(3) < (long) (arg4 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field788.method495((long) (arg4 * 6), 0);
                    this.field788.method487((byte) 116, 6, class1.field3, 0);
                    var7 = ((class1.field3[3] & 0xFF) << 16) + (class1.field3[5] & 0xFF) + (class1.field3[4] & 0xFF << 8);
                    if (var7 <= 0 || ((long) var7) > (this.field786.method488(3) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field786.method488(3) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class1.field3[1] = (byte) (arg0 >> 8);
                class1.field3[3] = (byte) (var7 >> 16);
                class1.field3[5] = (byte) var7;
                class1.field3[4] = (byte) (var7 >> 8);
                int var8 = 0;
                class1.field3[2] = (byte) arg0;
                int var9 = 0;
                class1.field3[0] = (byte) (arg0 >> 16);
                if (arg1 > -69) {
                    this.method382(90, 52);
                }
                this.field788.method495((long) (arg4 * 6), 0);
                this.field788.method492(class1.field3, 0, 6, (byte) -91);
                while (true) {
                    if (arg0 > var9) {
                        label141: {
                            int var10 = 0;
                            if (arg3) {
                                this.field786.method495((long) (var7 * 520), 0);
                                try {
                                    this.field786.method487((byte) 63, 8, class1.field3, 0);
                                } catch (EOFException var18) {
                                    break label141;
                                }
                                int var12 = (class1.field3[0] & 0xFF << 8) + (class1.field3[1] & 0xFF);
                                var10 = (class1.field3[6] & 0xFF) + ((class1.field3[4] & 0xFF << 16) + ((class1.field3[5] & 0xFF) << 8));
                                int var13 = (class1.field3[2] & 0xFF << 8) + (class1.field3[3] & 0xFF);
                                int var14 = class1.field3[7] & 0xFF;
                                if (arg4 != var12 || var8 != var13 || this.field778 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field786.method488(3) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            int var15 = arg0 - var9;
                            if (var10 == 0) {
                                arg3 = false;
                                var10 = (int) ((this.field786.method488(3) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class1.field3[2] = (byte) (var8 >> 8);
                            class1.field3[1] = (byte) arg4;
                            class1.field3[3] = (byte) var8;
                            class1.field3[7] = (byte) this.field778;
                            var8++;
                            class1.field3[0] = (byte) (arg4 >> 8);
                            if ((arg0 - var9) <= 512) {
                                var10 = 0;
                            }
                            class1.field3[4] = (byte) (var10 >> 16);
                            class1.field3[5] = (byte) (var10 >> 8);
                            class1.field3[6] = (byte) var10;
                            this.field786.method495((long) (var7 * 520), 0);
                            var7 = var10;
                            this.field786.method492(class1.field3, 0, 8, (byte) 103);
                            this.field786.method492(arg2, var9, var15, (byte) 117);
                            var9 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[BZI)Z", line = 331)
    public final boolean method379(int arg0, byte[] arg1, boolean arg2, int arg3) {
        field790++;
        class58 var5 = this.field786;
        synchronized (this.field786) {
            if (arg0 < 0 || arg0 > this.field780) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method378(arg0, (byte) -100, arg1, arg2, arg3);
            if (!var6) {
                var6 = this.method378(arg0, (byte) -120, arg1, false, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljh;ZI)V", line = 354)
    public static final void method380(class259 arg0, boolean arg1, int arg2) {
        field774++;
        if (class21.field350 || arg1) {
            int var3 = class73.field1287;
            int var4 = var3 * 956 / 503;
            class194.field3132.method734((class112.field1945 - var4) / 2, 0, var4, var3);
            class308.field5165.method587(class112.field1945 / 2 - (class308.field5165.field4116 / 2), 18);
        }
        arg0.method1825(class23.field399, class112.field1945 / 2, class73.field1287 / 2 - 26, 16777215, -1);
        int var5 = class73.field1287 / 2 - 18;
        if (class21.field350) {
            class111.method835(class112.field1945 / 2 - 152, var5, 304, 34, 9179409);
            class111.method835(class112.field1945 / 2 - 151, var5 + 1, 302, 32, 0);
            class111.method846(class112.field1945 / 2 - 150, var5 + 2, class5.field67 * 3, 30, 9179409);
            class111.method846(class112.field1945 / 2 + ((class5.field67 * 3) - 150), var5 + 2, 300 - class5.field67 * 3, 30, 0);
        } else {
            class115.method881(class112.field1945 / 2 - 152, var5, 304, 34, 9179409);
            class115.method881(class112.field1945 / 2 - 151, var5 + 1, 302, 32, 0);
            class115.method880(class112.field1945 / 2 - 150, var5 + 2, class5.field67 * 3, 30, 9179409);
            class115.method880(class112.field1945 / 2 + class5.field67 * 3 - 150, var5 - -2, 300 - (class5.field67 * 3), 30, 0);
        }
        if (arg2 != 17302) {
            method383(false, (short[]) null);
        }
        arg0.method1825(class37.field698, class112.field1945 / 2, class73.field1287 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 393)
    public static void method381(byte arg0) {
        field782 = null;
        field789 = null;
        field791 = null;
        if (arg0 != 74) {
            method376(-60, 26, 87, -115, (class196) null, (class196) null, 67, 66, -9L);
        }
        field776 = null;
        field792 = null;
        field783 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[B", line = 410)
    public final byte[] method382(int arg0, int arg1) {
        field785++;
        class58 var3 = this.field786;
        synchronized (this.field786) {
            try {
                Object var10000;
                if (this.field788.method488(arg1 + 4) < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field788.method495((long) (arg0 * 6), 0);
                this.field788.method487((byte) 116, 6, class1.field3, 0);
                int var4 = (class1.field3[5] & 0xFF) + (((class1.field3[3] & 0xFF) << 16) + (class1.field3[4] & 0xFF << 8));
                int var5 = ((class1.field3[0] & 0xFF) << 16) + (class1.field3[1] & 0xFF << 8) + (class1.field3[2] & 0xFF);
                if (var5 < 0 || this.field780 < var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 <= 0 || (this.field786.method488(3) / 520L) < ((long) var4)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    byte[] var19;
                    if (arg1 != -1) {
                        var19 = (byte[]) null;
                        return var19;
                    }
                    while (var5 > var7) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field786.method495((long) (var4 * 520), 0);
                        int var9 = var5 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field786.method487((byte) 74, var9 + 8, class1.field3, 0);
                        int var10 = ((class1.field3[2] & 0xFF) << 8) + (class1.field3[3] & 0xFF);
                        int var11 = (class1.field3[0] & 0xFF << 8) + (class1.field3[1] & 0xFF);
                        int var12 = class1.field3[7] & 0xFF;
                        int var13 = ((class1.field3[4] & 0xFF) << 16) + (class1.field3[6] & 0xFF) + ((class1.field3[5] & 0xFF) << 8);
                        if (arg0 == var11 && var8 == var10 && this.field778 == var12) {
                            if (var13 >= 0 && ((long) var13) <= (this.field786.method488(3) / 520L)) {
                                var8++;
                                for (int var14 = 0; var14 < var9; var14++) {
                                    var6[var7++] = class1.field3[var14 + 8];
                                }
                                var4 = var13;
                                continue;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(ILde;Lde;I)V", line = 561)
    public class41(int arg0, class58 arg1, class58 arg2, int arg3) {
        this.field780 = arg3;
        this.field788 = arg2;
        this.field778 = arg0;
        this.field786 = arg1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z[S)[S", line = 504)
    public static final short[] method383(boolean arg0, short[] arg1) {
        if (arg0) {
            return (short[]) null;
        }
        field777++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class234.method1628(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }
}
