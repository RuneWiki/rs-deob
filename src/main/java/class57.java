import java.awt.Canvas;
import java.awt.Graphics;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class57 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Z")
    public static boolean field813 = true;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lpj;")
    public static class79 field817 = new class79(64);

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "[I")
    public static int[] field821 = new int[200];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public int field820;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field822;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
    public int[] field819;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public abstract void method375(int arg0, byte arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public static final void method376() {
        for (int var0 = 0; var0 < class155.field2185; var0++) {
            if (!class257.field3496[var0]) {
                class347 var1 = class84.field1302[var0];
                int var2 = var1.field4857;
                int var3 = var1.field1584 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field1583 - var3 >> 7;
                int var8 = var1.field1591 - var3 >> 7;
                int var9 = var1.field1591 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class371.field5311) {
                    var9 = class371.field5311 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field4860[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class386.field5629) {
                        var15 = class386.field5629 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class430 var18 = class32.method245(var2, var16, var10, field822 == null ? (field822 = method384("cp")) : field822);
                        if (var18 != null && var18.field6184 != 0) {
                            if (var18.field6184 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field4860[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field4860[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field4860[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field4860[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class257.field3496[var0] = true;
                class249.field3456[var2].method272(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILql;II)V")
    public static final void method377(int arg0, class437 arg1, int arg2, int arg3) {
        field818++;
        if (arg0 != -1) {
            return;
        }
        if (arg1.field931 == arg3 && arg3 != -1) {
            class449 var4 = class86.method599(false, arg3);
            int var5 = var4.field6516;
            if (var5 == 1) {
                arg1.field904 = 0;
                arg1.field864 = 0;
                arg1.field880 = arg2;
                arg1.field916 = 1;
                arg1.field896 = 0;
                class27.method218(false, (byte) -127, var4, arg1.field896, arg1.field6192, arg1.field6197);
            }
            if (var5 == 2) {
                arg1.field864 = 0;
            }
        } else if (arg3 == -1 || arg1.field931 == -1 || class86.method599(false, arg3).field6504 >= class86.method599(false, arg1.field931).field6504) {
            arg1.field880 = arg2;
            arg1.field896 = 0;
            arg1.field904 = 0;
            arg1.field916 = 1;
            arg1.field864 = 0;
            arg1.field947 = arg1.field948;
            arg1.field931 = arg3;
            if (arg1.field931 == -1) {
                return;
            }
            class27.method218(false, (byte) -86, class86.method599(false, arg1.field931), arg1.field896, arg1.field6192, arg1.field6197);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method378(int arg0) {
        field821 = null;
        field817 = null;
        if (arg0 != 1) {
            field817 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILkq;Ljava/lang/String;)Lmq;")
    public static final class295 method379(int arg0, int arg1, class351 arg2, String arg3) {
        field814++;
        if (arg0 == 0) {
            return arg2.method2242(arg3, 0);
        }
        if (arg1 <= 9) {
            field821 = null;
        }
        if (arg0 == 1) {
            try {
                class274.method1686(new Object[] { (new URL(arg2.field4888.getCodeBase(), arg3)).toString() }, arg2.field4888, "openjs", 96);
                class295 var4 = new class295();
                var4.field4068 = 1;
                return var4;
            } catch (Throwable var10) {
                class295 var5 = new class295();
                var5.field4068 = 2;
                return var5;
            }
        } else if (arg0 == 2) {
            try {
                arg2.field4888.getAppletContext().showDocument(new URL(arg2.field4888.getCodeBase(), arg3), "_blank");
                class295 var6 = new class295();
                var6.field4068 = 1;
                return var6;
            } catch (Exception var11) {
                class295 var7 = new class295();
                var7.field4068 = 2;
                return var7;
            }
        } else if (arg0 == 3) {
            try {
                class274.method1687(arg2.field4888, -5778, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg2.field4888.getAppletContext().showDocument(new URL(arg2.field4888.getCodeBase(), arg3), "_top");
                class295 var8 = new class295();
                var8.field4068 = 1;
                return var8;
            } catch (Exception var12) {
                class295 var9 = new class295();
                var9.field4068 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method380(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Lti;")
    public static final class254 method381(int arg0, int arg1, int arg2) {
        class142 var3 = class5.field79[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2031;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method382(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lra;")
    public static final class57 method383(Canvas arg0, int arg1) {
        field815++;
        try {
            if (arg1 != 1) {
                method378(-10);
            }
            Class var2 = Class.forName("hq");
            class57 var3 = (class57) var2.getDeclaredConstructor().newInstance();
            var3.method382(arg0, (byte) -75);
            return var3;
        } catch (Throwable var5) {
            class113 var4 = new class113();
            var4.method382(arg0, (byte) -75);
            return var4;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method384(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
