import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class180 extends class55 {

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public int field2551 = 0;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field2548 = 0;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "[I")
    public static int[] field2559 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Ljava/lang/String;")
    public static String field2554 = "Attack";

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Z")
    public static boolean field2556 = false;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "[[[I")
    public static int[][][] field2550;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)Lpk;")
    public static final class43 method1169(byte arg0) {
        if (arg0 != 103) {
            method1169((byte) 100);
        }
        field2549++;
        class43 var1 = new class43(class238.field3435, class118.field1660, class233.field3367[0], class273.field4041[0], class296.field4677[0], class91.field1236[0], class277.field4210[0], class165.field2367);
        class294.method1965(true);
        return var1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIILca;IJ)Z")
    public static final boolean method1170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class131 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class44.method282(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
    public static void method1171(byte arg0) {
        int var1 = -95 / ((arg0 + 10) / 63);
        field2550 = null;
        field2554 = null;
        field2559 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLsi;Lqi;)V")
    public static final void method1172(int arg0, byte arg1, class56 arg2, class216 arg3) {
        class255 var4 = new class255();
        field2553++;
        var4.field3671 = arg3.method1407(126);
        var4.field3676 = arg3.method1358(arg1 ^ 0x56);
        var4.field3670 = new int[var4.field3671];
        var4.field3677 = new class81[var4.field3671];
        var4.field3673 = new class81[var4.field3671];
        var4.field3678 = new int[var4.field3671];
        var4.field3675 = new byte[var4.field3671][][];
        var4.field3669 = new int[var4.field3671];
        int var5 = 0;
        if (arg1 != 44) {
            field2556 = false;
        }
        while (var5 < var4.field3671) {
            try {
                int var6 = arg3.method1407(112);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method1352((byte) -115);
                    String var8 = arg3.method1352((byte) 60);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method1358(77);
                    }
                    var4.field3678[var5] = var6;
                    var4.field3669[var5] = var9;
                    var4.field3673[var5] = arg2.method340((byte) -48, class157.method1044(false, var7), var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method1352((byte) 111);
                    String var11 = arg3.method1352((byte) 51);
                    int var12 = arg3.method1407(105);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method1352((byte) -80);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method1358(93);
                            var15[var16] = new byte[var17];
                            arg3.method1374(var15[var16], 0, var17, (byte) -79);
                        }
                    }
                    var4.field3678[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class157.method1044(false, var13[var19]);
                    }
                    var4.field3677[var5] = arg2.method350(class157.method1044(false, var10), var11, var18, 0);
                    var4.field3675[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3670[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3670[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3670[var5] = -3;
            } catch (Exception var23) {
                var4.field3670[var5] = -4;
            } catch (Throwable var24) {
                var4.field3670[var5] = -5;
            }
            var5++;
        }
        class270.field3946.method1522(var4, arg1 ^ 0xFFFFFFA6);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BILqi;)V")
    private final void method1173(byte arg0, int arg1, class216 arg2) {
        if (arg1 == 2) {
            this.field2551 = arg2.method1380(true);
        }
        field2557++;
        if (arg0 > -36) {
            this.method1173((byte) -27, 107, (class216) null);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)V")
    public static final void method1174(boolean arg0, int arg1) {
        field2555++;
        int var2 = class282.field4278.length;
        byte[][] var3 = class261.field3801;
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class190.field2739[var4] >> 8) * 64 - class110.field1473;
                int var7 = (class190.field2739[var4] & 0xFF) * 64 - class166.field2383;
                class6.method32(68);
                class236.method1543(class127.field1825, (byte) -127, arg0, var7, var6, var5);
            }
        }
        if (arg1 != -9543) {
            method1169((byte) -100);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/Color;BZLjava/lang/String;)V")
    public static final void method1175(int arg0, Color arg1, byte arg2, boolean arg3, String arg4) {
        field2552++;
        try {
            Graphics var5 = class181.field2574.getGraphics();
            if (class222.field3138 == null) {
                class222.field3138 = new Font("Helvetica", 1, 13);
                class35.field410 = class181.field2574.getFontMetrics(class222.field3138);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class84.field1166, client.field4437);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class98.field1319 == null) {
                    class98.field1319 = class181.field2574.createImage(304, 34);
                }
                Graphics var6 = class98.field1319.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg0 * 3) + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class222.field3138);
                var6.setColor(Color.white);
                var6.drawString(arg4, (304 - class35.field410.stringWidth(arg4)) / 2, 22);
                if (arg2 != -105) {
                    field2556 = true;
                }
                var5.drawImage(class98.field1319, class84.field1166 / 2 - 152, client.field4437 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = client.field4437 / 2 - 18;
                int var8 = class84.field1166 / 2 - 152;
                var5.setColor(arg1);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var8 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var5.setFont(class222.field3138);
                var5.setColor(Color.white);
                var5.drawString(arg4, (304 - class35.field410.stringWidth(arg4)) / 2 + var8, var7 + 22);
            }
            if (class6.field86 != null) {
                var5.setFont(class222.field3138);
                var5.setColor(Color.white);
                var5.drawString(class6.field86, class84.field1166 / 2 - class35.field410.stringWidth(class6.field86) / 2, client.field4437 / 2 + -26);
            }
        } catch (Exception var10) {
            class181.field2574.repaint();
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILqi;)V")
    public final void method1176(int arg0, class216 arg1) {
        field2558++;
        while (true) {
            int var3 = arg1.method1407(116);
            if (var3 == 0) {
                if (arg0 == 300) {
                    return;
                } else {
                    method1175(84, (Color) null, (byte) -119, false, (String) null);
                    return;
                }
            }
            this.method1173((byte) -43, var3, arg1);
        }
    }
}
