import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class592 {

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lgda;")
    private class58 field8579;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[[I")
    private int[][] field8575;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[Z")
    private boolean[] field8573;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    private int field8581;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8584 = new String[] { method4348(method4347(">\u000b\b\u001b")), method4348(method4347(">\u000b\f\u001b")), method4348(method4347(".\u000bc\u001d|")), method4348(method4347(">\u000bqZo<Qs\u001b")), method4348(method4347(";P!_")), method4348(method4347(">\u000b\u000e\u001b")), method4348(method4347(">\u000b\u000f\u001b")), method4348(method4347(">\u000b\t\u001b")) };

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field8574 = 0;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "J")
    public static long field8578 = -1L;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)Z")
    public static final boolean method4342(boolean arg0, int arg1) {
        try {
            field8583++;
            if (arg0) {
                return true;
            } else {
                return arg1 == 7 || arg1 == 8 || arg1 == 9 || arg1 == 10;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8584[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)Leo;")
    public final class312 method4343(int arg0, boolean arg1) {
        try {
            field8576++;
            if (!arg1) {
                this.field8575 = null;
            }
            byte[] var3 = this.field8579.method604((byte) -5, arg0, 1);
            class312 var4 = new class312();
            var4.method2678(new class176(var3), (byte) -117);
            return var4;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8584[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
    public final int[] method4344(int arg0, int arg1) {
        try {
            field8582++;
            if (arg0 < 0 || arg0 >= this.field8575.length) {
                return this.field8581 == -1 ? new int[0] : new int[] { this.field8581 };
            } else if (this.field8573[arg0] && this.field8575[arg0].length > 1) {
                int var3 = this.field8581 == -1 ? 0 : 1;
                Random var4 = new Random();
                int[] var5 = new int[this.field8575[arg0].length];
                class405.method3262(this.field8575[arg0], arg1, var5, 0, var5.length);
                for (int var6 = var3; var6 < var5.length; var6++) {
                    int var7 = class235.method2039(var4, var5.length - var3, arg1 + -89) + var3;
                    int var8 = var5[var6];
                    var5[var6] = var5[var7];
                    var5[var7] = var8;
                }
                return var5;
            } else {
                return this.field8575[arg0];
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field8584[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public static final void method4345(boolean arg0) {
        try {
            field8577++;
            if (class82.field1247 == null) {
                int var1 = class687.field9928;
                if (!arg0) {
                    field8574 = 110;
                }
                int var2 = class250.field3835;
                int var3 = class413.field6568 - class64.field881 - var1;
                int var4 = class464.field7131 - class333.field5444 - var2;
                if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
                    try {
                        Container var5;
                        if (class517.field7660 != null) {
                            var5 = class517.field7660;
                        } else if (class476.field7255 == null) {
                            var5 = class540.field7955;
                        } else {
                            var5 = class476.field7255;
                        }
                        int var6 = 0;
                        int var7 = 0;
                        if (class517.field7660 == var5) {
                            Insets var8 = class517.field7660.getInsets();
                            var7 = var8.top;
                            var6 = var8.left;
                        }
                        Graphics var9 = var5.getGraphics();
                        var9.setColor(Color.black);
                        if (var1 > 0) {
                            var9.fillRect(var6, var7, var1, class464.field7131);
                        }
                        if (var2 > 0) {
                            var9.fillRect(var6, var7, class413.field6568, var2);
                        }
                        if (var3 > 0) {
                            var9.fillRect(class413.field6568 + var6 - var3, var7, var3, class464.field7131);
                        }
                        if (var4 > 0) {
                            var9.fillRect(var6, var7 + class464.field7131 - var4, class413.field6568, var4);
                            return;
                        }
                    } catch (Exception var11) {
                        return;
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field8584[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Z")
    public final boolean method4346(int arg0) {
        try {
            field8580++;
            if (arg0 != 1) {
                this.field8581 = 35;
            }
            return this.field8581 != -1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8584[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lpo;ILgda;)V")
    public class592(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field8579 = arg2;
            this.field8579.method580(78, 1);
            class176 var4 = new class176(this.field8579.method604((byte) 127, 0, 0));
            int var5 = var4.method1645((byte) -83);
            if (var5 > 3) {
                this.field8575 = new int[0][];
                this.field8573 = new boolean[0];
                this.field8581 = -1;
            } else {
                int var6 = var4.method1645((byte) -83);
                class155[] var7 = class63.method663(true);
                boolean var8 = true;
                if (var7.length == var6) {
                    for (int var9 = 0; var9 < var7.length; var9++) {
                        int var10 = var4.method1645((byte) -104);
                        if (var7[var9].field2157 != var10) {
                            var8 = false;
                            break;
                        }
                    }
                } else {
                    var8 = false;
                }
                if (var8) {
                    int var11 = var4.method1645((byte) -125);
                    int var12 = var4.method1645((byte) -87);
                    if (var5 > 2) {
                        this.field8581 = var4.method1657(90);
                    } else {
                        this.field8581 = -1;
                    }
                    this.field8573 = new boolean[var12 + 1];
                    this.field8575 = new int[var12 + 1][];
                    for (int var13 = 0; var13 < var11; var13++) {
                        int var14 = var4.method1645((byte) -91);
                        this.field8573[var14] = var4.method1645((byte) -86) == 1;
                        int var15 = var4.method1687((byte) -94);
                        if (this.field8581 == -1) {
                            this.field8575[var14] = new int[var15];
                            for (int var16 = 0; var16 < var15; var16++) {
                                this.field8575[var14][var16] = var4.method1687((byte) -94);
                            }
                        } else {
                            this.field8575[var14] = new int[var15 + 1];
                            this.field8575[var14][0] = this.field8581;
                            for (int var17 = 0; var17 < var15; var17++) {
                                this.field8575[var14][var17 + 1] = var4.method1687((byte) -82);
                            }
                        }
                    }
                    for (int var18 = 0; var18 < var12 + 1; var18++) {
                        if (this.field8575[var18] == null) {
                            if (this.field8581 == -1) {
                                this.field8575[var18] = new int[0];
                            } else {
                                this.field8575[var18] = new int[] { this.field8581 };
                            }
                        }
                    }
                } else {
                    this.field8581 = -1;
                    this.field8573 = new boolean[0];
                    this.field8575 = new int[0][];
                }
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field8584[3] + (arg0 == null ? field8584[4] : field8584[2]) + ',' + arg1 + ',' + (arg2 == null ? field8584[4] : field8584[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4347(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!k", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4348(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
