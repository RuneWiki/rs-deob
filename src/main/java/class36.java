import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class36 extends Canvas {

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field434;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field433 = null;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field437;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field438;

    @OriginalMember(owner = "client!kg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field434.update(arg0);
        field436++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method204(byte arg0) {
        field433 = null;
        if (arg0 <= 75) {
            field433 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
    public static final void method205() {
        for (int var0 = 0; var0 < class358.field5278; var0++) {
            if (!class154.field2117[var0]) {
                class21 var1 = class281.field4303[var0];
                int var2 = var1.field284;
                int var3 = var1.field2037 - class267.field4058;
                int var4 = (var3 * 2 >> class254.field3869) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field2033 - var3 >> class254.field3869;
                int var8 = var1.field2038 - var3 >> class254.field3869;
                int var9 = var1.field2038 + var3 >> class254.field3869;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class265.field4044) {
                    var9 = class265.field4044 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field281[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class275.field4206) {
                        var15 = class275.field4206 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class141 var18 = class51.method293(var2, var16, var10, field438 == null ? (field438 = method207("bs")) : field438);
                        if (var18 != null && var18.field1899 != 0) {
                            if (var18.field1899 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field281[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field281[var5 - 1];
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
                                    short var29 = var1.field281[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field281[var5 + 1];
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
                class154.field2117[var0] = true;
                class307.field4638[var2].method105(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field434.paint(arg0);
        field435++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILsc;)V")
    public static final void method206(int arg0, class239 arg1) {
        field432++;
        if (arg0 != -18199) {
            method204((byte) 23);
        }
        class235 var2 = null;
        try {
            class211 var3 = arg1.method1448((byte) -113);
            while (var3.field3172 == 0) {
                class109.method674((byte) 99, 1L);
            }
            if (var3.field3172 == 1) {
                var2 = (class235) var3.field3175;
                class385 var4 = class357.method2142(arg0 + 18200);
                var2.method1417(var4.field5666, var4.field5685, 0, false);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1420((byte) 73);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class36(Component arg0) {
        this.field434 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method207(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
