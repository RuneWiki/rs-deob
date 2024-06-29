import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class53 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lwf;")
    private class1 field861 = new class1();

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field869 = 0;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field858 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Lkk;")
    public static class239 field870 = new class239(0, 0);

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "[I")
    public static int[] field876 = new int[14];

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "Lwf;")
    private class1 field871;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIZIB[BI[Lha;)[I")
    public static final int[] method358(int arg0, int arg1, boolean arg2, int arg3, byte arg4, byte[] arg5, int arg6, class31[] arg7) {
        field872++;
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg2) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg6 + var10) > 0 && (arg6 + var10) < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
                            arg7[var9].field460[arg6 + var10][arg1 + var11] = class94.method598(arg7[var9].field460[arg6 + var10][arg1 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class248 var12 = new class248(arg5);
        int var13 = arg0 + arg6;
        int var14 = arg1 + arg3;
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class54.method370(var14 + var40, var12, arg2, 0, false, arg1 + var40, 0, var15, (byte) -50, 0, var13 + var39, arg6 + var39);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var12.field3748 < var12.field3723.length) {
            int var18 = var12.method1593((byte) 27);
            if (var18 == 128) {
                var16 = true;
                class293.field4620[0] = var12.method1575(false);
                class293.field4620[1] = var12.method1606((byte) 77);
                class293.field4620[2] = var12.method1606((byte) 77);
                class293.field4620[3] = var12.method1606((byte) 77);
                class293.field4620[4] = var12.method1575(false);
            } else {
                if (var18 != 129) {
                    var12.field3748--;
                    break;
                }
                var17 = true;
                for (int var24 = 0; var24 < 4; var24++) {
                    byte var25 = var12.method1604(4);
                    if (var25 == 0) {
                        int var35 = arg6;
                        int var36 = arg1 + 64;
                        int var37 = arg1;
                        if (var36 < 0) {
                            var36 = 0;
                        } else if (var36 >= 104) {
                            var36 = 104;
                        }
                        int var38 = arg6 + 64;
                        if (arg1 < 0) {
                            var37 = 0;
                        } else if (arg1 >= 104) {
                            var37 = 104;
                        }
                        if (arg6 < 0) {
                            var35 = 0;
                        } else if (arg6 >= 104) {
                            var35 = 104;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 >= 104) {
                            var38 = 104;
                        }
                        while (var38 > var35) {
                            while (var37 < var36) {
                                class163.field2508[var24][var35][var37] = 0;
                                var37++;
                            }
                            var35++;
                        }
                    } else if (var25 == 1) {
                        for (int var26 = 0; var26 < 64; var26 += 4) {
                            for (int var27 = 0; var27 < 64; var27 += 4) {
                                byte var28 = var12.method1604(4);
                                for (int var29 = arg6 + var26; var29 < (var26 + arg6 + 4); var29++) {
                                    for (int var30 = arg1 + var27; var30 < (var27 + arg1 + 4); var30++) {
                                        if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                                            class163.field2508[var24][var29][var30] = var28;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var25 == 2 && var24 > 0) {
                        int var31 = arg6 + 64;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        int var32 = arg6;
                        if (arg6 < 0) {
                            var32 = 0;
                        } else if (arg6 >= 104) {
                            var32 = 104;
                        }
                        int var33 = arg1;
                        if (arg1 < 0) {
                            var33 = 0;
                        } else if (arg1 >= 104) {
                            var33 = 104;
                        }
                        int var34 = arg1 + 64;
                        if (var34 < 0) {
                            var34 = 0;
                        } else if (var34 >= 104) {
                            var34 = 104;
                        }
                        while (var31 > var32) {
                            while (var34 > var33) {
                                class163.field2508[var24][var32][var33] = class163.field2508[var24 - 1][var32][var33];
                                var33++;
                            }
                            var32++;
                        }
                    }
                }
            }
        }
        if (arg4 < 44) {
            method361(35, -74, 25, 116, -19, -110);
        }
        if (!var17) {
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var20 = 0; var20 < 16; var20++) {
                    for (int var21 = 0; var21 < 16; var21++) {
                        int var22 = (arg1 >> 2) + var21;
                        int var23 = (arg6 >> 2) + var20;
                        if (var23 >= 0 && var23 < 26 && var22 >= 0 && var22 < 26) {
                            class163.field2508[var19][var23][var22] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class293.field4620;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Lwf;")
    public final class1 method359(int arg0) {
        field865++;
        if (arg0 >= -36) {
            return null;
        }
        class1 var2 = this.field871;
        if (this.field861 == var2) {
            this.field871 = null;
            return null;
        } else {
            this.field871 = var2.field7;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)Luj;")
    public static final class287 method360(byte arg0, int arg1) {
        if (arg0 != -73) {
            method365(-81);
        }
        class287 var2 = (class287) class47.field760.method122((long) arg1, (byte) -119);
        field863++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class115.field1757.method1973(1, 0, arg1);
        } else {
            var3 = class186.field2825.method1973(1, 0, arg1 & 0x7FFF);
        }
        class287 var4 = new class287();
        if (var3 != null) {
            var4.method1887(new class248(var3), (byte) 121);
        }
        if (arg1 >= 32768) {
            var4.method1888((byte) 25);
        }
        class47.field760.method119((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V")
    public static final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field867++;
        if (class248.field3765 <= arg4 && class163.field2505 >= arg2 && arg5 >= class243.field3635 && arg0 <= class118.field1782) {
            class8.method38(arg0, arg1, arg5, (byte) 114, arg4, arg2);
        } else {
            class296.method1984(arg0, arg2, (byte) -78, arg4, arg5, arg1);
        }
        if (arg3 < 108) {
            field870 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static final void method362(byte arg0) {
        field874++;
        if (arg0 != 36) {
            field873 = 94;
        }
        int var1 = class214.field3191;
        int var2 = class26.field321 - class180.field2748 - var1;
        int var3 = class272.field4090;
        int var4 = class107.field1676 - var3 - class77.field1245;
        if (var3 <= 0 && var4 <= 0 && var1 <= 0 && var2 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class244.field3657 != null) {
                var5 = class244.field3657;
            } else if (class210.field3152 == null) {
                var5 = class209.field3147.field150;
            } else {
                var5 = class210.field3152;
            }
            int var6 = 0;
            int var7 = 0;
            if (class210.field3152 == var5) {
                Insets var8 = class210.field3152.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var3 > 0) {
                var9.fillRect(var6, var7, var3, class26.field321);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class107.field1676, var1);
            }
            if (var4 > 0) {
                var9.fillRect(var6 + class107.field1676 - var4, var7, var4, class26.field321);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7 + class26.field321 - var2, class107.field1676, var2);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lwf;I)V")
    public final void method363(class1 arg0, int arg1) {
        field860++;
        if (arg0.field5 != null) {
            arg0.method4((byte) -55);
        }
        arg0.field5 = this.field861.field5;
        if (arg1 == -105) {
            arg0.field7 = this.field861;
            arg0.field5.field7 = arg0;
            arg0.field7.field5 = arg0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)I")
    public final int method364(byte arg0) {
        field875++;
        int var2 = 0;
        class1 var3 = this.field861.field7;
        if (arg0 != 80) {
            this.method367(-23);
        }
        while (this.field861 != var3) {
            var2++;
            var3 = var3.field7;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public static void method365(int arg0) {
        field870 = null;
        field858 = null;
        field876 = null;
        if (arg0 != 0) {
            field869 = -68;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V")
    public final void method366(byte arg0) {
        while (true) {
            class1 var2 = this.field861.field7;
            if (this.field861 == var2) {
                field866++;
                this.field871 = null;
                if (arg0 != 9) {
                    method358(53, -43, false, -12, (byte) 101, (byte[]) null, -45, (class31[]) null);
                    return;
                }
                return;
            }
            var2.method4((byte) -55);
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)Lwf;")
    public final class1 method367(int arg0) {
        field859++;
        if (arg0 <= 42) {
            field870 = null;
        }
        class1 var2 = this.field861.field7;
        if (this.field861 == var2) {
            this.field871 = null;
            return null;
        } else {
            this.field871 = var2.field7;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)Lwf;")
    public final class1 method368(int arg0) {
        if (arg0 != 0) {
            method362((byte) -126);
        }
        field864++;
        class1 var2 = this.field861.field7;
        if (this.field861 == var2) {
            return null;
        } else {
            var2.method4((byte) -55);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class53() {
        this.field861.field7 = this.field861;
        this.field861.field5 = this.field861;
    }
}
