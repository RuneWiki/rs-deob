import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class37 extends class424 {

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "[B")
    public byte[] field786;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "[Lrw;")
    public static class543[] field795 = new class543[14];

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "I")
    public static int field799 = 0;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
    public static int field791 = 0;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "Lbd;")
    public static class44 field794 = new class44("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "Lqv;")
    public static class316 field803 = new class316(65, 6);

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
    public static final void method389(int arg0) {
        field787++;
        class358.method2218(true, class220.field3371.field2564);
        int var1 = (class82.field1315 >> 3) + (class315.field4688 >> 10);
        class123.field1944 = class364.field5293.field6956 = 0;
        int var2 = (class501.field7240 >> 3) + (class397.field5649 >> 10);
        class364.field5293.method2965(8, (byte) 44, 8);
        if (arg0 != -1) {
            field799 = 98;
        }
        byte var3 = 18;
        class433.field6206 = new byte[var3][];
        class213.field3209 = new int[var3];
        class185.field2731 = new int[var3][4];
        class299.field4461 = new int[var3];
        class452.field6602 = new int[var3];
        class502.field7247 = new byte[var3][];
        class259.field3837 = new byte[var3][];
        class333.field4938 = new int[var3];
        class475.field6929 = new int[var3];
        class25.field363 = new byte[var3][];
        class457.field6639 = new int[var3];
        class511.field7430 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class69.field1139 >> 4)) / 8; var5 <= ((class69.field1139 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class255.field3763 >> 4)) / 8; var8 <= (var2 + (class255.field3763 >> 4)) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class475.field6929[var4] = var9;
                class213.field3209[var4] = class76.field1243.method2043((byte) 65, "m" + var5 + "_" + var8);
                class333.field4938[var4] = class76.field1243.method2043((byte) -69, "l" + var5 + "_" + var8);
                class299.field4461[var4] = class76.field1243.method2043((byte) -81, "n" + var5 + "_" + var8);
                class457.field6639[var4] = class76.field1243.method2043((byte) -120, "um" + var5 + "_" + var8);
                class452.field6602[var4] = class76.field1243.method2043((byte) 72, "ul" + var5 + "_" + var8);
                if (class299.field4461[var4] == -1) {
                    class213.field3209[var4] = -1;
                    class333.field4938[var4] = -1;
                    class457.field6639[var4] = -1;
                    class452.field6602[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class299.field4461.length; var6++) {
            class299.field4461[var6] = -1;
            class213.field3209[var6] = -1;
            class333.field4938[var6] = -1;
            class457.field6639[var6] = -1;
            class452.field6602[var6] = -1;
        }
        byte var7;
        if (field799 == 1 || field799 == 2) {
            var7 = 3;
        } else {
            var7 = 7;
        }
        class349.method2200(0, var1, var2, var7, false);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBI)Z")
    public final boolean method390(int arg0, byte arg1, int arg2) {
        if (arg1 != -43) {
            method396(17, -88, -25, -90, (byte) -86, -10);
        }
        field793++;
        return (arg0 * arg2) <= this.field786.length;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V")
    public final void method391(int arg0) {
        field798++;
        int var2 = -1;
        int var3 = this.field786.length + arg0;
        while (var2 < var3) {
            var2++;
            this.field786[var2] = 0;
            var2++;
            this.field786[var2] = 0;
            var2++;
            this.field786[var2] = 0;
            var2++;
            this.field786[var2] = 0;
            var2++;
            this.field786[var2] = 0;
            var2++;
            this.field786[var2] = 0;
            var2++;
            this.field786[var2] = 0;
            var2++;
            this.field786[var2] = 0;
        }
        while (var2 < this.field786.length - 1) {
            var2++;
            this.field786[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
    public static final String method392(int arg0, String[] arg1, int arg2, int arg3) {
        field792++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            if (arg0 != -2901) {
                field794 = null;
            }
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(B)V")
    public static void method393(byte arg0) {
        field794 = null;
        field795 = null;
        if (arg0 > -32) {
            field794 = null;
        }
        field803 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIBI)V")
    public final void method394(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field801++;
        this.field800 = arg4 - arg1;
        this.field790 = arg2 - arg0;
        this.field788 = arg0;
        if (arg3 >= -83) {
            method392(74, null, -3, 79);
        }
        this.field796 = arg1;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BIIIIII)V")
    public final void method395(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field802++;
        int var8 = 0;
        if (arg1 != arg4) {
            var8 = (arg3 - arg2 << 16) / (arg4 - arg1);
        }
        int var9 = 0;
        if (arg0 != -44) {
            method392(60, null, 121, 101);
        }
        if (arg4 != arg5) {
            var9 = (arg6 - arg3 << 16) / (arg5 - arg4);
        }
        int var10 = 0;
        if (arg1 != arg5) {
            var10 = (arg2 - arg6 << 16) / (arg1 - arg5);
        }
        if (arg4 >= arg1 && arg1 <= arg5) {
            if (arg5 > arg4) {
                int var11;
                int var12 = var11 = arg2 << 16;
                if (arg1 < 0) {
                    var12 -= arg1 * var10;
                    var11 -= arg1 * var8;
                    arg1 = 0;
                }
                int var13 = arg3 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg1 == arg4 || var8 <= var10) && (arg1 != arg4 || var9 >= var10)) {
                    int var17 = arg5 - arg4;
                    int var18 = arg4 - arg1;
                    int var19 = this.field790 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class320.method2021(0, var13 >> 16, 125, var12 >> 16, this.field786, var19);
                                var12 += var10;
                                var13 += var9;
                                var19 += this.field790;
                            }
                        }
                        class320.method2021(0, var11 >> 16, arg0 ^ 0xFFFFFFAF, var12 >> 16, this.field786, var19);
                        var12 += var10;
                        var19 += this.field790;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg5 - arg4;
                    int var15 = arg4 - arg1;
                    int var16 = this.field790 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class320.method2021(0, var12 >> 16, -98, var13 >> 16, this.field786, var16);
                                var13 += var9;
                                var16 += this.field790;
                                var12 += var10;
                            }
                        }
                        class320.method2021(0, var12 >> 16, -92, var11 >> 16, this.field786, var16);
                        var11 += var8;
                        var16 += this.field790;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg2 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var10;
                    var20 -= arg1 * var8;
                    arg1 = 0;
                }
                int var22 = arg6 << 16;
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg1 != arg5 && var10 < var8 || arg1 == arg5 && var9 > var8) {
                    int var23 = arg4 - arg5;
                    int var24 = arg5 - arg1;
                    int var25 = this.field790 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class320.method2021(0, var22 >> 16, arg0 + 29, var20 >> 16, this.field786, var25);
                                var22 += var9;
                                var25 += this.field790;
                                var20 += var8;
                            }
                        }
                        class320.method2021(0, var21 >> 16, 117, var20 >> 16, this.field786, var25);
                        var25 += this.field790;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg4 - arg5;
                    int var27 = arg5 - arg1;
                    int var28 = this.field790 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class320.method2021(0, var20 >> 16, -19, var22 >> 16, this.field786, var28);
                                var20 += var8;
                                var28 += this.field790;
                                var22 += var9;
                            }
                        }
                        class320.method2021(0, var20 >> 16, 125, var21 >> 16, this.field786, var28);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field790;
                    }
                }
            }
        } else if (arg5 < arg4) {
            if (arg1 < arg4) {
                int var29;
                int var30 = var29 = arg6 << 16;
                if (arg5 < 0) {
                    var29 -= arg5 * var10;
                    var30 -= arg5 * var9;
                    arg5 = 0;
                }
                int var31 = arg2 << 16;
                if (arg1 < 0) {
                    var31 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg4 - arg1;
                    int var33 = arg1 - arg5;
                    int var34 = this.field790 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class320.method2021(0, var30 >> 16, arg0 ^ 0x26, var31 >> 16, this.field786, var34);
                                var31 += var8;
                                var34 += this.field790;
                                var30 += var9;
                            }
                        }
                        class320.method2021(0, var30 >> 16, 116, var29 >> 16, this.field786, var34);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field790;
                    }
                } else {
                    int var35 = arg4 - arg1;
                    int var36 = arg1 - arg5;
                    int var37 = this.field790 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class320.method2021(0, var31 >> 16, arg0 + 168, var30 >> 16, this.field786, var37);
                                var37 += this.field790;
                                var31 += var8;
                                var30 += var9;
                            }
                        }
                        class320.method2021(0, var29 >> 16, -72, var30 >> 16, this.field786, var37);
                        var29 += var10;
                        var37 += this.field790;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                int var40 = arg3 << 16;
                if (arg5 < 0) {
                    var39 -= arg5 * var9;
                    var38 -= arg5 * var10;
                    arg5 = 0;
                }
                if (arg4 < 0) {
                    var40 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg1 - arg4;
                    int var42 = arg4 - arg5;
                    int var43 = this.field790 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class320.method2021(0, var38 >> 16, 117, var40 >> 16, this.field786, var43);
                                var43 += this.field790;
                                var38 += var10;
                                var40 += var8;
                            }
                        }
                        class320.method2021(0, var38 >> 16, 123, var39 >> 16, this.field786, var43);
                        var38 += var10;
                        var43 += this.field790;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg1 - arg4;
                    int var45 = arg4 - arg5;
                    int var46 = this.field790 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class320.method2021(0, var40 >> 16, -42, var38 >> 16, this.field786, var46);
                                var38 += var10;
                                var46 += this.field790;
                                var40 += var8;
                            }
                        }
                        class320.method2021(0, var39 >> 16, arg0 + 171, var38 >> 16, this.field786, var46);
                        var39 += var9;
                        var46 += this.field790;
                        var38 += var10;
                    }
                }
            }
        } else if (arg5 < arg1) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg6 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var8;
                var47 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg5 < 0) {
                var49 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg4 != arg5 && var9 > var8 || arg4 == arg5 && var10 < var8) {
                int var50 = arg1 - arg5;
                int var51 = arg5 - arg4;
                int var52 = this.field790 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class320.method2021(0, var48 >> 16, -120, var49 >> 16, this.field786, var52);
                            var48 += var8;
                            var52 += this.field790;
                            var49 += var10;
                        }
                    }
                    class320.method2021(0, var48 >> 16, arg0 + 13, var47 >> 16, this.field786, var52);
                    var52 += this.field790;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var53 = arg1 - arg5;
                int var54 = arg5 - arg4;
                int var55 = this.field790 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class320.method2021(0, var49 >> 16, 115, var48 >> 16, this.field786, var55);
                            var49 += var10;
                            var48 += var8;
                            var55 += this.field790;
                        }
                    }
                    class320.method2021(0, var47 >> 16, 121, var48 >> 16, this.field786, var55);
                    var47 += var9;
                    var55 += this.field790;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            int var58 = arg2 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var9;
                var57 -= arg4 * var8;
                arg4 = 0;
            }
            if (arg1 < 0) {
                var58 -= arg1 * var10;
                arg1 = 0;
            }
            if (var8 < var9) {
                int var59 = arg5 - arg1;
                int var60 = arg1 - arg4;
                int var61 = this.field790 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class320.method2021(0, var58 >> 16, arg0 + 9, var56 >> 16, this.field786, var61);
                            var58 += var10;
                            var56 += var9;
                            var61 += this.field790;
                        }
                    }
                    class320.method2021(0, var57 >> 16, arg0 + 166, var56 >> 16, this.field786, var61);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field790;
                }
            } else {
                int var62 = arg5 - arg1;
                int var63 = arg1 - arg4;
                int var64 = this.field790 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class320.method2021(0, var56 >> 16, 116, var58 >> 16, this.field786, var64);
                            var58 += var10;
                            var64 += this.field790;
                            var56 += var9;
                        }
                    }
                    class320.method2021(0, var56 >> 16, 124, var57 >> 16, this.field786, var64);
                    var57 += var8;
                    var64 += this.field790;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lbt;II)V")
    public class37(class33 arg0, int arg1, int arg2) {
        this.field786 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIBI)V")
    public static final void method396(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (class333.field4936 >= arg2 && class424.field5996 <= arg3) {
            boolean var6;
            if (arg5 < class465.field6763) {
                var6 = false;
                arg5 = class465.field6763;
            } else if (arg5 <= class176.field2630) {
                var6 = true;
            } else {
                arg5 = class176.field2630;
                var6 = false;
            }
            boolean var7;
            if (arg0 < class465.field6763) {
                var7 = false;
                arg0 = class465.field6763;
            } else if (class176.field2630 < arg0) {
                var7 = false;
                arg0 = class176.field2630;
            } else {
                var7 = true;
            }
            if (arg2 >= class424.field5996) {
                class479.method2839(arg0, arg5, class271.field4078[arg2++], 93, arg1);
            } else {
                arg2 = class424.field5996;
            }
            if (class333.field4936 >= arg3) {
                class479.method2839(arg0, arg5, class271.field4078[arg3--], 106, arg1);
            } else {
                arg3 = class333.field4936;
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg3; var8++) {
                    int[] var9 = class271.field4078[var8];
                    var9[arg5] = var9[arg0] = arg1;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg3; var11++) {
                    class271.field4078[var11][arg5] = arg1;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg3; var10++) {
                    class271.field4078[var10][arg0] = arg1;
                }
            }
        }
        field789++;
        if (arg4 > -41) {
            method392(-91, null, -43, -126);
        }
    }
}
