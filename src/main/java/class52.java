import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class52 {

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Lai;")
    public class206 field752 = new class206();

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Lmh;")
    private static class62 field751 = class201.method1405(true, "Loading config )2 ");

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[I")
    public static int[] field742 = new int[25];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lmh;")
    public static class62 field737 = field751;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lud;")
    public static class52 field749 = new class52();

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field755 = 100;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Z")
    public static boolean field756 = true;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field757 = 0;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Lai;")
    private class206 field753;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 7)
    public static void method327(boolean arg0) {
        field751 = null;
        if (!arg0) {
            method327(true);
        }
        field749 = null;
        field742 = null;
        field737 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Z)V", line = 26)
    public final void method328(boolean arg0) {
        while (true) {
            class206 var2 = this.field752.field3492;
            if (this.field752 == var2) {
                if (arg0) {
                    return;
                }
                field744++;
                this.field753 = null;
                return;
            }
            var2.method1444((byte) 89);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Lai;", line = 45)
    public final class206 method329(int arg0) {
        if (arg0 != 25) {
            return (class206) null;
        }
        field746++;
        class206 var2 = this.field752.field3492;
        if (this.field752 == var2) {
            return null;
        } else {
            var2.method1444((byte) 89);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lai;I)V", line = 62)
    public final void method330(class206 arg0, int arg1) {
        if (arg0.field3495 != null) {
            arg0.method1444((byte) 89);
        }
        arg0.field3495 = this.field752.field3495;
        int var3 = -68 / ((-arg1 - 12) / 55);
        arg0.field3492 = this.field752;
        field750++;
        arg0.field3495.field3492 = arg0;
        arg0.field3492.field3495 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)Lsg;", line = 80)
    public static final class191 method331(byte arg0, int arg1, int arg2) {
        field738++;
        class191 var3 = class1.method2(arg1, (byte) -37);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3180 == null || var3.field3180.length <= arg2) {
            return null;
        } else {
            if (arg0 != -101) {
                method331((byte) -47, -17, 83);
            }
            return var3.field3180[arg2];
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V", line = 104)
    public static final void method332(int arg0, int arg1) {
        field748++;
        class82 var2 = new class82(512, 512);
        int[] var3 = var2.field1363;
        int var4 = var3.length;
        int var5 = -28 / ((arg1 + 22) / 53);
        for (int var6 = 0; var6 < var4; var6++) {
            var3[var6] = 1;
        }
        for (int var7 = 1; var7 < 103; var7++) {
            int var8 = (103 - var7) * 512 * 4 + 24628;
            for (int var9 = 1; var9 < 103; var9++) {
                if ((class42.field641[arg0][var9][var7] & 0x18) == 0) {
                    class220.method1567(var3, var8, 512, arg0, var9, var7);
                }
                if (arg0 < 3 && (class42.field641[arg0 + 1][var9][var7] & 0x8) != 0) {
                    class220.method1567(var3, var8, 512, arg0 + 1, var9, var7);
                }
                var8 += 4;
            }
        }
        var2.method635();
        int var10 = (((int) (Math.random() * 20.0D)) + 238) - 10 << 16;
        int var11 = (int) (Math.random() * 20.0D) - (-((((int) (Math.random() * 20.0D)) + 238) - 10 << 8) - ((int) (Math.random() * 20.0D) + 228 << 16) - 228);
        for (int var12 = 1; var12 < 103; var12++) {
            for (int var13 = 1; var13 < 103; var13++) {
                if ((class42.field641[arg0][var13][var12] & 0x18) == 0) {
                    class236.method1668(var13, var10, var12, 122, var11, arg0);
                }
                if (arg0 < 3 && (class42.field641[arg0 + 1][var13][var12] & 0x8) != 0) {
                    class236.method1668(var13, var10, var12, 122, var11, arg0 + 1);
                }
            }
        }
        class246.field4183 = 0;
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                long var16 = class44.method290(class7.field85, var14, var15);
                if (var16 != 0L) {
                    class216 var18 = class252.method1755(Integer.MAX_VALUE & (int) (var16 >>> 32), (byte) -51);
                    int var19 = var18.field3704;
                    if (var18.field3709 != null) {
                        for (int var20 = 0; var20 < var18.field3709.length; var20++) {
                            if (var18.field3709[var20] != -1) {
                                class216 var21 = class252.method1755(var18.field3709[var20], (byte) -100);
                                if (var21.field3704 >= 0) {
                                    var19 = var21.field3704;
                                    break;
                                }
                            }
                        }
                    }
                    if (var19 >= 0) {
                        int var22 = var14;
                        int var23 = var15;
                        if (var19 != 22 && var19 != 29 && var19 != 34 && var19 != 36 && var19 != 46 && var19 != 47 && var19 != 48) {
                            int[][] var24 = class250.field4244[class7.field85].field3756;
                            for (int var25 = 0; var25 < 10; var25++) {
                                int var26 = (int) (Math.random() * 4.0D);
                                if (var26 == 0 && var22 > 0 && var14 - 3 < var22 && (var24[var22 - 1][var23] & 0x12C0108) == 0) {
                                    var22--;
                                }
                                if (var26 == 1 && var22 < 103 && var14 + 3 > var22 && (var24[var22 + 1][var23] & 0x12C0180) == 0) {
                                    var22++;
                                }
                                if (var26 == 2 && var23 > 0 && (var15 - 3) < var23 && (var24[var22][var23 - 1] & 0x12C0102) == 0) {
                                    var23--;
                                }
                                if (var26 == 3 && var23 < 103 && (var15 + 3) > var23 && (var24[var22][var23 + 1] & 0x12C0120) == 0) {
                                    var23++;
                                }
                            }
                        }
                        class290.field4927[class246.field4183] = var18.field3689;
                        class163.field2645[class246.field4183] = var22;
                        class4.field36[class246.field4183] = var23;
                        class246.field4183++;
                    }
                }
            }
        }
        for (int var27 = 0; var27 < var4; var27++) {
            if (var3[var27] == 0) {
                var3[var27] = 1;
            }
        }
        class177.field2828 = new class257(var2);
        class280.field4795 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(JI)V", line = 303)
    public static final void method333(long arg0, int arg1) {
        int var3 = -92 % ((-arg1 - 65) / 52);
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var5) {
        }
        field747++;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lai;", line = 315)
    public final class206 method334(int arg0) {
        field741++;
        if (arg0 != -18673) {
            return (class206) null;
        }
        class206 var2 = this.field752.field3492;
        if (this.field752 == var2) {
            this.field753 = null;
            return null;
        } else {
            this.field753 = var2.field3492;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Lai;", line = 337)
    public final class206 method335(byte arg0) {
        field745++;
        if (arg0 < 56) {
            method332(74, -18);
        }
        class206 var2 = this.field753;
        if (this.field752 == var2) {
            this.field753 = null;
            return null;
        } else {
            this.field753 = var2.field3492;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIII)Z", line = 369)
    public static final boolean method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Lai;", line = 398)
    public final class206 method337(int arg0) {
        if (arg0 >= -104) {
            method333(-93L, 107);
        }
        class206 var2 = this.field752.field3495;
        field743++;
        if (this.field752 == var2) {
            this.field753 = null;
            return null;
        } else {
            this.field753 = var2.field3495;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Lai;I)V", line = 424)
    public final void method338(class206 arg0, int arg1) {
        field754++;
        if (arg0.field3495 != null) {
            arg0.method1444((byte) 89);
        }
        arg0.field3492 = this.field752.field3492;
        arg0.field3495 = this.field752;
        arg0.field3495.field3492 = arg0;
        if (arg1 != -1) {
            field742 = (int[]) null;
        }
        arg0.field3492.field3495 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Lai;", line = 443)
    public final class206 method339(int arg0) {
        field740++;
        class206 var2 = this.field753;
        if (this.field752 == var2) {
            this.field753 = null;
            return null;
        }
        if (arg0 != 25190) {
            this.field752 = (class206) null;
        }
        this.field753 = var2.field3495;
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 532)
    public class52() {
        this.field752.field3495 = this.field752;
        this.field752.field3492 = this.field752;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()V", line = 475)
    public static final void method340() {
        for (int var0 = 0; var0 < class164.field2669; var0++) {
            for (int var1 = 0; var1 < class114.field1900; var1++) {
                for (int var2 = 0; var2 < class252.field4273; var2++) {
                    class256.field4320[var0][var1][var2] = null;
                }
            }
        }
        for (int var3 = 0; var3 < class152.field2404; var3++) {
            class226.field3939[var3] = null;
        }
        class152.field2404 = 0;
        for (int var4 = 0; var4 < class143.field2276; var4++) {
            class208.field3531[var4] = null;
        }
        class143.field2276 = 0;
        for (int var5 = 0; var5 < class7.field76.length; var5++) {
            class7.field76[var5] = null;
        }
    }
}
