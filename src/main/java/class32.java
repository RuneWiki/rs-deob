import java.io.DataInputStream;
import java.net.URL;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class32 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field586 = 0;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lsd;")
    public static class166 field587 = class135.method935("<col=ffffff> )4 ", 0);

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lsc;")
    public static class165 field588 = new class165();

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field596 = 0;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field589;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    public static int[] field594;

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class32() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static final void method235(int arg0) {
        field590++;
        class10.field190.method71(arg0 - 28991);
        if (arg0 == 29491) {
            class124.field2441.method71(500);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static void method236(boolean arg0) {
        if (arg0) {
            field594 = null;
            field587 = null;
            field588 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIILvd;)V")
    public static final void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class193 arg7) {
        if (class161.field3080) {
            class122.field2394 = 32;
        } else {
            class122.field2394 = 0;
        }
        class161.field3080 = false;
        if (class51.field929 != 0) {
            if (arg0 <= arg2 && arg0 + 16 > arg2 && arg4 >= arg6 && arg6 + 16 > arg4) {
                arg7.field3739 -= 4;
                class68.method550(arg7, 15);
            } else if (arg0 <= arg2 && arg2 < arg0 + 16 && arg4 >= arg6 + arg1 - 16 && arg4 < arg1 + arg6) {
                arg7.field3739 += 4;
                class68.method550(arg7, 15);
            } else if (arg2 >= arg0 - class122.field2394 && class122.field2394 + arg0 + 16 > arg2 && arg6 + 16 <= arg4 && arg1 + arg6 - 16 > arg4) {
                int var8 = (arg1 - 32) * arg1 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - var8 / 2 - arg6 - 16;
                int var10 = arg1 - var8 - 32;
                arg7.field3739 = (arg5 - arg1) * var9 / var10;
                class68.method550(arg7, 15);
                class161.field3080 = true;
            }
        }
        if (arg3 != -32) {
            field594 = null;
        }
        if (class31.field576 != 0) {
            int var11 = arg7.field3705;
            if (arg2 >= arg0 - var11 && arg6 <= arg4 && arg2 < arg0 + 16 && arg1 + arg6 >= arg4) {
                arg7.field3739 += class31.field576 * 45;
                class68.method550(arg7, 15);
            }
        }
        field593++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method238(byte arg0, Throwable arg1, String arg2) {
        field585++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class5.method32(12659, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class143.field2782.field1630 != null) {
                if (arg0 != -65) {
                    field594 = null;
                }
                class65 var8 = class143.field2782.method657(new URL(class143.field2782.field1630.getCodeBase(), "clienterror.ws?c=" + class162.field3091 + "&u=" + class42.field750 + "&v1=" + class80.field1642 + "&v2=" + class80.field1644 + "&e=" + var7), (byte) 95);
                while (var8.field1351 == 0) {
                    class189.method1260(1L, 1);
                }
                if (var8.field1351 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1352;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
    public static final void method239(int arg0, int arg1) {
        int[] var2 = class8.field152.field3014;
        int var3 = var2.length;
        field592++;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 1;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class122.field2387[arg1][var21][var5] & 0x18) == 0) {
                    class131.field2556.method618(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class122.field2387[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class131.field2556.method618(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class8.field152.method1054();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class122.field2387[arg1][var19][var8] & 0x18) == 0) {
                    class54.method442(var6, var19, arg1, var7, 117, var8);
                }
                if (arg1 < 3 && (class122.field2387[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class54.method442(var6, var19, arg1 + 1, var7, 120, var8);
                }
            }
        }
        class82.field1668 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class131.field2556.method600(class165.field3130, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class170.method1185((byte) 70, var12).field2816;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class46.field822[class165.field3130].field2748;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var10 + 3 > var15 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class62.field1280[class82.field1668] = class116.field2244[var13];
                        class41.field724[class82.field1668] = var14;
                        class102.field1982[class82.field1668] = var15;
                        class82.field1668++;
                    }
                }
            }
        }
        class99.field1885.method544(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z[BLff;)V")
    public final void method240(boolean arg0, byte[] arg1, class53 arg2) {
        field591++;
        if (!arg0) {
            return;
        }
        if (arg2.field988[arg2.field1000] != 31 || arg2.field988[arg2.field1000 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field589 == null) {
            this.field589 = new Inflater(true);
        }
        try {
            this.field589.setInput(arg2.field988, arg2.field1000 + 10, arg2.field988.length + -10 + -arg2.field1000 + -8);
            this.field589.inflate(arg1);
        } catch (Exception var4) {
            this.field589.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field589.reset();
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
    private class32(int arg0, int arg1, int arg2) {
    }
}
