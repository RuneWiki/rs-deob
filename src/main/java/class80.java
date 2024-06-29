import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class80 extends class263 {

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "[B")
    public byte[] field1072;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "Lgk;")
    public static class331 field1064 = new class331("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "Lsl;")
    public static class318 field1075 = new class318(65, 3);

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V")
    public final void method724(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -8) {
            field1064 = null;
        }
        this.field1066 = arg4 - arg0;
        this.field1069 = arg0;
        this.field1071 = arg2;
        this.field1073 = arg3 - arg2;
        field1067++;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(B)V")
    public static void method725(byte arg0) {
        if (arg0 != -77) {
            method727((byte) 109, null);
        }
        field1064 = null;
        field1075 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)Z")
    public final boolean method726(int arg0, int arg1, int arg2) {
        field1068++;
        if (arg0 != 22582) {
            field1075 = null;
        }
        return this.field1072.length >= arg1 * arg2;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method727(byte arg0, String arg1) {
        field1070++;
        int var2 = 101 % ((68 - arg0) / 50);
        int var3 = arg1.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = arg1.charAt(var5) + (var4 << 5) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIZIII)V")
    public final void method728(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1065++;
        int var8 = 0;
        if (arg1 != arg2) {
            var8 = (arg4 - arg0 << 16) / (arg1 - arg2);
        }
        int var9 = 0;
        if (arg1 != arg5) {
            var9 = (arg6 - arg4 << 16) / (arg5 - arg1);
        }
        int var10 = 0;
        if (arg3) {
            this.field1072 = null;
        }
        if (arg2 != arg5) {
            var10 = (arg0 - arg6 << 16) / (arg2 - arg5);
        }
        if (arg2 <= arg1 && arg5 >= arg2) {
            if (arg1 >= arg5) {
                int var11;
                int var12 = var11 = arg0 << 16;
                int var13 = arg6 << 16;
                if (arg2 < 0) {
                    var12 -= arg2 * var10;
                    var11 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 != arg5 && var8 > var10 || arg2 == arg5 && var9 > var8) {
                    int var14 = arg1 - arg5;
                    int var15 = arg5 - arg2;
                    int var16 = this.field1073 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class99.method838(0, this.field1072, true, var11 >> 16, var13 >> 16, var16);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field1073;
                            }
                        }
                        class99.method838(0, this.field1072, true, var11 >> 16, var12 >> 16, var16);
                        var12 += var10;
                        var16 += this.field1073;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg1 - arg5;
                    int var18 = arg5 - arg2;
                    int var19 = this.field1073 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class99.method838(0, this.field1072, true, var13 >> 16, var11 >> 16, var19);
                                var13 += var9;
                                var11 += var8;
                                var19 += this.field1073;
                            }
                        }
                        class99.method838(0, this.field1072, true, var12 >> 16, var11 >> 16, var19);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field1073;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                int var22 = arg4 << 16;
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if ((arg1 == arg2 || var8 <= var10) && (arg1 != arg2 || var10 <= var9)) {
                    int var26 = arg5 - arg1;
                    int var27 = arg1 - arg2;
                    int var28 = this.field1073 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class99.method838(0, this.field1072, true, var21 >> 16, var22 >> 16, var28);
                                var28 += this.field1073;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class99.method838(0, this.field1072, !arg3, var21 >> 16, var20 >> 16, var28);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field1073;
                    }
                } else {
                    int var23 = arg5 - arg1;
                    int var24 = arg1 - arg2;
                    int var25 = this.field1073 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class99.method838(0, this.field1072, true, var22 >> 16, var21 >> 16, var25);
                                var21 += var10;
                                var22 += var9;
                                var25 += this.field1073;
                            }
                        }
                        class99.method838(0, this.field1072, true, var20 >> 16, var21 >> 16, var25);
                        var25 += this.field1073;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg1 > arg5) {
            if (arg1 > arg2) {
                int var29;
                int var30 = var29 = arg6 << 16;
                int var31 = arg0 << 16;
                if (arg5 < 0) {
                    var29 -= arg5 * var10;
                    var30 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 < 0) {
                    var31 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var9 >= var10) {
                    int var32 = arg1 - arg2;
                    int var33 = arg2 - arg5;
                    int var34 = this.field1073 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class99.method838(0, this.field1072, true, var30 >> 16, var31 >> 16, var34);
                                var31 += var8;
                                var34 += this.field1073;
                                var30 += var9;
                            }
                        }
                        class99.method838(0, this.field1072, true, var30 >> 16, var29 >> 16, var34);
                        var34 += this.field1073;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg1 - arg2;
                    int var36 = arg2 - arg5;
                    int var37 = this.field1073 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class99.method838(0, this.field1072, true, var31 >> 16, var30 >> 16, var37);
                                var37 += this.field1073;
                                var30 += var9;
                                var31 += var8;
                            }
                        }
                        class99.method838(0, this.field1072, true, var29 >> 16, var30 >> 16, var37);
                        var37 += this.field1073;
                        var30 += var9;
                        var29 += var10;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                if (arg5 < 0) {
                    var38 -= arg5 * var10;
                    var39 -= arg5 * var9;
                    arg5 = 0;
                }
                int var40 = arg4 << 16;
                if (arg1 < 0) {
                    var40 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg2 - arg1;
                    int var42 = arg1 - arg5;
                    int var43 = this.field1073 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class99.method838(0, this.field1072, true, var40 >> 16, var38 >> 16, var43);
                                var38 += var10;
                                var40 += var8;
                                var43 += this.field1073;
                            }
                        }
                        class99.method838(0, this.field1072, true, var39 >> 16, var38 >> 16, var43);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field1073;
                    }
                } else {
                    int var44 = arg2 - arg1;
                    int var45 = arg1 - arg5;
                    int var46 = this.field1073 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class99.method838(0, this.field1072, true, var38 >> 16, var40 >> 16, var46);
                                var46 += this.field1073;
                                var38 += var10;
                                var40 += var8;
                            }
                        }
                        class99.method838(0, this.field1072, !arg3, var38 >> 16, var39 >> 16, var46);
                        var38 += var10;
                        var46 += this.field1073;
                        var39 += var9;
                    }
                }
            }
        } else if (arg2 <= arg5) {
            int var47;
            int var48 = var47 = arg4 << 16;
            int var49 = arg0 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var8;
                var47 -= arg1 * var9;
                arg1 = 0;
            }
            if (arg2 < 0) {
                var49 -= arg2 * var10;
                arg2 = 0;
            }
            if (var8 < var9) {
                int var50 = arg5 - arg2;
                int var51 = arg2 - arg1;
                int var52 = this.field1073 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class99.method838(0, this.field1072, true, var47 >> 16, var49 >> 16, var52);
                            var49 += var10;
                            var47 += var9;
                            var52 += this.field1073;
                        }
                    }
                    class99.method838(0, this.field1072, true, var47 >> 16, var48 >> 16, var52);
                    var52 += this.field1073;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var53 = arg5 - arg2;
                int var54 = arg2 - arg1;
                int var55 = this.field1073 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class99.method838(0, this.field1072, !arg3, var49 >> 16, var47 >> 16, var55);
                            var55 += this.field1073;
                            var49 += var10;
                            var47 += var9;
                        }
                    }
                    class99.method838(0, this.field1072, true, var48 >> 16, var47 >> 16, var55);
                    var55 += this.field1073;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            if (arg1 < 0) {
                var56 -= arg1 * var9;
                var57 -= arg1 * var8;
                arg1 = 0;
            }
            int var58 = arg6 << 16;
            if (arg5 < 0) {
                var58 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg1 != arg5 && var8 < var9 || arg1 == arg5 && var10 < var8) {
                int var59 = arg2 - arg5;
                int var60 = arg5 - arg1;
                int var61 = this.field1073 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class99.method838(0, this.field1072, !arg3, var58 >> 16, var57 >> 16, var61);
                            var58 += var10;
                            var61 += this.field1073;
                            var57 += var8;
                        }
                    }
                    class99.method838(0, this.field1072, true, var56 >> 16, var57 >> 16, var61);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field1073;
                }
            } else {
                int var62 = arg2 - arg5;
                int var63 = arg5 - arg1;
                int var64 = this.field1073 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class99.method838(0, this.field1072, true, var57 >> 16, var58 >> 16, var64);
                            var64 += this.field1073;
                            var58 += var10;
                            var57 += var8;
                        }
                    }
                    class99.method838(0, this.field1072, true, var57 >> 16, var56 >> 16, var64);
                    var57 += var8;
                    var64 += this.field1073;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
    public final void method729(int arg0) {
        field1074++;
        int var2 = -1;
        int var3 = this.field1072.length - 8;
        if (arg0 != 292993616) {
            return;
        }
        while (var3 > var2) {
            var2++;
            this.field1072[var2] = 0;
            var2++;
            this.field1072[var2] = 0;
            var2++;
            this.field1072[var2] = 0;
            var2++;
            this.field1072[var2] = 0;
            var2++;
            this.field1072[var2] = 0;
            var2++;
            this.field1072[var2] = 0;
            var2++;
            this.field1072[var2] = 0;
            var2++;
            this.field1072[var2] = 0;
        }
        while (var2 < this.field1072.length - 1) {
            var2++;
            this.field1072[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lfd;II)V")
    public class80(class365 arg0, int arg1, int arg2) {
        this.field1072 = new byte[arg1 * arg2];
    }
}
