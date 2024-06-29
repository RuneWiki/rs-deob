import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class228 extends class152 {

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "I")
    private int field3851 = 585;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "Z")
    public static boolean field3846 = false;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "Lce;")
    public static class126 field3841 = class206.method1445(-7923, "<)4col>");

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "Lsg;")
    public static class164 field3844;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "Lcc;")
    public static class313 field3840;

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "Lpj;")
    public static class57 field3852;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BZ)V", line = 15)
    public static final void method1551(byte arg0, boolean arg1) {
        field3842++;
        if (arg0 != 74) {
            return;
        }
        byte var2;
        byte[][] var3;
        if (class56.field846 && arg1) {
            var2 = 1;
            var3 = class69.field1132;
        } else {
            var3 = class322.field5502;
            var2 = 4;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class181.method1294(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class12.field162[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3E3C373) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class148.field2732.length; var13++) {
                                if (class148.field2732[var13] == var12 && var3[var13] != null) {
                                    class19.method101((var11 & 0x7) * 8, var9, class94.field1475, var4, arg1, var6 * 8, (var10 & 0x7) * 8, var3[var13], var8, var5 * 8, 109);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILbb;)V", line = 98)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            method1552(48);
        }
        field3843++;
        if (arg1 == 0) {
            this.field3851 = arg2.method942(true);
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V", line = 126)
    public static void method1552(int arg0) {
        field3844 = null;
        if (arg0 != 12) {
            field3840 = (class313) null;
        }
        field3840 = null;
        field3841 = null;
        field3852 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)[I", line = 147)
    public final int[] method6(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        field3849++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int var4 = class122.field2038[arg1];
            for (int var5 = 0; var5 < class244.field4133; var5++) {
                int var6 = class29.field406[var5];
                if (var6 > this.field3851 && 4096 - this.field3851 > var6 && 2048 - this.field3851 < var4 && var4 < this.field3851 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3851);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field3851 < var6 && this.field3851 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field3851;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3851);
                } else if (var4 < this.field3851 || var4 > 4096 - this.field3851) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field3851;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3851);
                } else if (this.field3851 <= var6 && 4096 - this.field3851 >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field3851);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIIIIIILbb;)V", line = 226)
    public static final void method1553(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class134 arg8) {
        if (arg5 >= 0 && arg5 < 104 && arg4 >= 0 && arg4 < 104) {
            if (!arg1) {
                class301.field4992[arg3][arg5][arg4] = 0;
            }
            while (true) {
                int var9 = arg8.method948(-127);
                if (var9 == 0) {
                    if (arg1) {
                        class264.field4396[0][arg5][arg4] = class320.field5486[0][arg5][arg4];
                    } else if (arg3 == 0) {
                        class264.field4396[0][arg5][arg4] = -class36.method196(-121, arg4 + arg0 + 556238, 932731 - -arg5 + arg2) * 8;
                    } else {
                        class264.field4396[arg3][arg5][arg4] = class264.field4396[arg3 - 1][arg5][arg4] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg8.method948(-124);
                    if (arg1) {
                        class264.field4396[0][arg5][arg4] = var10 * 8 + class320.field5486[0][arg5][arg4];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg3 == 0) {
                            class264.field4396[0][arg5][arg4] = -var10 * 8;
                        } else {
                            class264.field4396[arg3][arg5][arg4] = class264.field4396[arg3 - 1][arg5][arg4] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class65.field1103[arg3][arg5][arg4] = arg8.method977(19773);
                    class122.field2042[arg3][arg5][arg4] = (byte) ((var9 - 2) / 4);
                    class17.field238[arg3][arg5][arg4] = (byte) class47.method289(var9 + arg7 - 2, 3);
                } else if (var9 > 81) {
                    class172.field3048[arg3][arg5][arg4] = (byte) (var9 - 81);
                } else if (!arg1) {
                    class301.field4992[arg3][arg5][arg4] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg8.method948(-125);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg8.method948(-123);
                    break;
                }
                if (var11 <= 49) {
                    arg8.method948(-128);
                }
            }
        }
        if (arg6 > -114) {
            method1551((byte) -33, false);
        }
        field3847++;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 335)
    public class228() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(B)I", line = 348)
    public static final int method1554(byte arg0) {
        field3845++;
        int var1 = -43 % ((-arg0 - 21) / 54);
        return class81.field1309.method1184(107);
    }
}
