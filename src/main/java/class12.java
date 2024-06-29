import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 {

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "S")
    public short field136;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "B")
    public byte field137;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Lbm;")
    public class74 field142;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "B")
    public byte field133;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Z")
    public static boolean field143;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "[I")
    public static int[] field144;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field145;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field146;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lm;IILkj;Ljava/awt/Canvas;)Lqa;")
    public static final class162 method100(class126 arg0, int arg1, int arg2, class397 arg3, Canvas arg4) {
        if (arg2 >= -19) {
            method103();
        }
        field135++;
        return new class470(arg1, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public static void method101(byte arg0) {
        int var1 = 111 / ((arg0 - 16) / 48);
        field144 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lqa;)V")
    public static final void method102(class162 arg0) {
        for (int var1 = class354.field4827; var1 < class401.field5574; var1++) {
            for (int var2 = 0; var2 < class469.field6860; var2++) {
                for (int var3 = 0; var3 < class472.field6900; var3++) {
                    class61 var4 = class385.field5410[var1][var2][var3];
                    if (var4 != null) {
                        class134 var5 = var4.field814;
                        class134 var6 = var4.field832;
                        if (var5 != null && var5.method399(false)) {
                            class361.method2002(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method399(false)) {
                                class361.method2002(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method394(0, 0, var5, 0, arg0, false, true);
                                var6.method398(105);
                            }
                            var5.method398(84);
                        }
                        for (class302 var7 = var4.field819; var7 != null; var7 = var7.field4140) {
                            class33 var9 = var7.field4136;
                            if (var9 != null && var9.method399(false)) {
                                class361.method2002(arg0, var9, var1, var2, var3, var9.field456 + 1 - var9.field463, var9.field471 - var9.field468 + 1);
                                var9.method398(106);
                            }
                        }
                        class180 var8 = var4.field824;
                        if (var8 != null && var8.method399(false)) {
                            class14.method114(arg0, var8, var1, var2, var3);
                            var8.method398(99);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "()V")
    public static final void method103() {
        for (int var0 = 0; var0 < class34.field482; var0++) {
            if (!class178.field2528[var0]) {
                class340 var1 = class461.field6699[var0];
                class432 var2 = var1.field4681;
                int var3 = var1.field4683;
                int var4 = var2.method2574(false) - class77.field1110;
                int var5 = (var4 * 2 >> class34.field484) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2578(true) - var4 >> class34.field484;
                int var9 = var2.method2572(false) - var4 >> class34.field484;
                int var10 = var2.method2572(false) + var4 >> class34.field484;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class472.field6900) {
                    var10 = class472.field6900 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field4684[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class469.field6860) {
                        var16 = class469.field6860 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class33 var19 = class490.method2876(var3, var17, var11, field146 == null ? (field146 = method107("bt")) : field146);
                        if (var19 != null && var19.field458 != 0) {
                            if (var19.field458 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field4684[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field4684[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field4684[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field4684[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class178.field2528[var0] = true;
                class383.field5391[var3].method233(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public static final void method104(int arg0) {
        class342.field4720 = class105.field1430.field776 + class105.field1430.field774 + 2;
        class52.field695 = class68.field987.field774 + class68.field987.field776 + 2;
        class306.field4199 = new String[500];
        field134++;
        if (arg0 != 1) {
            field144 = null;
        }
        for (int var1 = 0; var1 < class306.field4199.length; var1++) {
            class306.field4199[var1] = "";
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lht;Lbm;III)V")
    public class12(class410 arg0, class74 arg1, int arg2, int arg3, int arg4) {
        this.field136 = (short) arg2;
        this.field137 = (byte) arg4;
        this.field142 = arg1;
        this.field133 = (byte) arg3;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
    public static final byte[] method105(Object arg0, int arg1, int arg2, int arg3) {
        field145++;
        if (arg2 != -21478) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class77.method570(arg1, arg3, 46, var4);
        } else if (arg0 instanceof class277) {
            class277 var5 = (class277) arg0;
            return var5.method1565(arg1, 0, arg3);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBI)Lss;")
    public static final class295 method106(int arg0, byte arg1, int arg2) {
        field140++;
        int var3 = -106 / ((-arg1 - 18) / 50);
        class295 var4 = class339.method1882((byte) 121, arg0);
        if (arg2 == -1) {
            return var4;
        } else if (var4 == null || var4.field4050 == null || var4.field4050.length <= arg2) {
            return null;
        } else {
            return var4.field4050[arg2];
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method107(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class83("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field139 = 999999;
        field143 = false;
        field138 = -1;
        field144 = new int[8];
    }
}
