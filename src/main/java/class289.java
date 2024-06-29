import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class289 extends Canvas {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field4762;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field4769 = 0;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field4767 = 255;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field4761 = 0;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field4768 = 0;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
    public static int[] field4765;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[[B")
    public static byte[][] field4758;

    @OriginalMember(owner = "client!ca", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4766++;
        this.field4762.update(arg0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method2007(Throwable arg0, byte arg1) throws IOException {
        String var3;
        if (arg0 instanceof class33) {
            class33 var2 = (class33) arg0;
            arg0 = var2.field534;
            var3 = var2.field531 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 > -21) {
            field4769 = -31;
        }
        arg0.printStackTrace(var5);
        var5.close();
        field4760++;
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field4762.paint(arg0);
        field4763++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Laj;III)[Lbj;")
    public static final class92[] method2008(class151 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -936) {
            method2009(67, (String) null, false, 1L, 63, 126, (String) null, (short) 50);
        }
        field4770++;
        return class167.method1242(arg0, arg2, arg1, arg3 ^ 0xFFFFFC18) ? class196.method1398((byte) -41) : null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class289(Component arg0) {
        this.field4762 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;ZJIILjava/lang/String;S)V")
    public static final void method2009(int arg0, String arg1, boolean arg2, long arg3, int arg4, int arg5, String arg6, short arg7) {
        field4771++;
        if (class259.field4360) {
            return;
        }
        if (class287.field4747 < 500) {
            class63.field1065[class287.field4747] = arg6;
            class184.field2932[class287.field4747] = arg1;
            class100.field1588[class287.field4747] = arg5 == -1 ? class221.field3718 : arg5;
            class195.field3154[class287.field4747] = arg7;
            class68.field1149[class287.field4747] = arg3;
            class197.field3204[class287.field4747] = arg0;
            class67.field1125[class287.field4747] = arg4;
            class287.field4747++;
        }
        if (!arg2) {
            field4767 = -49;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method2010(int arg0) {
        if (arg0 == 103) {
            field4758 = null;
            field4765 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Z")
    public static final boolean method2011(int arg0, byte arg1) {
        field4757++;
        byte var2 = 0;
        byte var3 = 0;
        if (class144.field2371 == null) {
            if (class17.field339 == null) {
                class144.field2371 = new class92(512, 512);
            } else {
                class144.field2371 = (class92) class17.field339;
            }
            int[] var4 = class144.field2371.field1516;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < (104 - var3 - 1); var7++) {
                int var23 = ((var3 + 103 - var7) * 512 * 4) + 24628;
                for (int var24 = var2 + 1; var24 < (104 - var2 - 1); var24++) {
                    if ((class67.field1132[arg0][var24][var7] & 0x18) == 0) {
                        class131.method972(var4, var23, 512, arg0, var24, var7);
                    }
                    if (arg0 < 3 && (class67.field1132[arg0 + 1][var24][var7] & 0x8) != 0) {
                        class131.method972(var4, var23, 512, arg0 + 1, var24, var7);
                    }
                    var23 += 4;
                }
            }
            class89.field1460 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class20.method133(arg0, var2 + var8, var3 + var9);
                    if (var10 == 0L) {
                        var10 = class76.method539(arg0, var2 + var8, var9 - -var3);
                    }
                    if (var10 == 0L) {
                        var10 = class185.method1342(arg0, var2 + var8, var3 + var9);
                    }
                    if (var10 == 0L) {
                        var10 = class299.method2050(arg0, var2 + var8, var3 + var9);
                    }
                    if (var10 != 0L) {
                        class1 var12 = class110.method827((int) (var10 >>> 32) & Integer.MAX_VALUE, (byte) -106);
                        if (!var12.field45 || class85.field1418) {
                            int var13 = var12.field21;
                            if (var12.field34 != null) {
                                for (int var14 = 0; var14 < var12.field34.length; var14++) {
                                    if (var12.field34[var14] != -1) {
                                        class1 var15 = class110.method827(var12.field34[var14], (byte) -73);
                                        if (var15.field21 >= 0) {
                                            var13 = var15.field21;
                                        }
                                    }
                                }
                            }
                            if (var13 >= 0) {
                                boolean var16 = false;
                                int var17 = var2 + var8;
                                class195 var18 = class22.method146((byte) -63, var13);
                                int var19 = var3 + var9;
                                if (var18 != null && var18.field3146) {
                                    var16 = true;
                                }
                                if (var16) {
                                    int[][] var20 = class225.field3790[arg0].field5006;
                                    for (int var21 = 0; var21 < 10; var21++) {
                                        int var22 = (int) (Math.random() * 4.0D);
                                        if (var22 == 0 && var17 > 0 && var17 > (var8 - 3) && (var20[var17 - 1][var19] & 0x2C0108) == 0) {
                                            var17--;
                                        }
                                        if (var22 == 1 && var17 < 103 && (var8 + 3) > var17 && (var20[var17 + 1][var19] & 0x2C0180) == 0) {
                                            var17++;
                                        }
                                        if (var22 == 2 && var19 > 0 && var19 > var9 - 3 && (var20[var17][var19 - 1] & 0x2C0102) == 0) {
                                            var19--;
                                        }
                                        if (var22 == 3 && var19 < 103 && (var9 + 3) > var19 && (var20[var17][var19 + 1] & 0x2C0120) == 0) {
                                            var19++;
                                        }
                                    }
                                }
                                class184.field2946[class89.field1460] = var12.field50;
                                class167.field2699[class89.field1460] = var17 - var2;
                                class298.field4865[class89.field1460] = var19 - var3;
                                class89.field1460++;
                            }
                        }
                    }
                }
            }
        }
        class144.field2371.method666();
        int var25 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var26 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (((int) (Math.random() * 20.0D) + 238 - 10 << 8) + 238 - (-((int) (Math.random() * 20.0D)) + 10));
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var29 = 1; var29 < 103; var29++) {
                if ((class67.field1132[arg0][var2 + var29][var3 + var27] & 0x18) == 0 && !class207.method1442(var26, (byte) -121, var27, var2, var3, var29, arg0, var25)) {
                    class7.field152.method1016(255);
                    return false;
                }
                if (arg0 < 3 && (class67.field1132[arg0 + 1][var2 + var29][var27 + var3] & 0x8) != 0 && !class207.method1442(var26, (byte) -121, var27, var2, var3, var29, arg0 + 1, var25)) {
                    class7.field152.method1016(255);
                    return false;
                }
            }
        }
        class17.field339 = class144.field2371;
        class7.field152.method1016(255);
        class144.field2371 = null;
        int var28 = -64 % ((-arg1 - 21) / 41);
        return true;
    }
}
