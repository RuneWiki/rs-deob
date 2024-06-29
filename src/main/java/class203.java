import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class203 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[J")
    public static long[] field3343 = new long[32];

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Lph;")
    public static class229 field3352 = class266.method1858("Liste des mises -9 jour charg-Be", 0);

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Lph;")
    private static class229 field3357 = class266.method1858(" is already on your friend list)3", 0);

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Lph;")
    public static class229 field3353 = field3357;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[[[I")
    public static int[][][] field3346;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIII)V", line = 6)
    public static final void method1421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3351++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg5 - arg3;
        int var12 = arg5 * arg5;
        int var13 = var11 * var11;
        int var14 = arg0 - arg3;
        int var15 = var14 * var14;
        int var16 = arg0 * arg0;
        int var17 = var12 << 1;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = var13 << 1;
        int var21 = var14 << 1;
        int var22 = var16 << 2;
        int var23 = var15 - (var21 - 1) * var20;
        int var24 = arg0 << 1;
        int var25 = var13 << 2;
        int var26 = (1 - var21) * var13 + var19;
        int var27 = var16 - ((var24 - 1) * var17);
        int var28 = var12 << 2;
        int var29 = (1 - var24) * var12 + var18;
        int var30 = var15 << 2;
        int var31 = var18 * 3;
        if (arg1 >= -93) {
            return;
        }
        int var32 = var19 * 3;
        int var33 = (var24 - 3) * var17;
        int var34 = (arg0 - 1) * var28;
        int var35 = var22;
        int var36 = (var21 - 3) * var20;
        int var37 = var30;
        int[] var38 = class202.field3337[arg4];
        class193.method1354((byte) -37, arg6 - var11, -arg5 + arg6, arg7, var38);
        int var39 = (var14 - 1) * var25;
        class193.method1354((byte) -37, arg6 + var11, -var11 + arg6, arg2, var38);
        class193.method1354((byte) -37, arg5 + arg6, arg6 + var11, arg7, var38);
        while (var9 > 0) {
            if (var29 < 0) {
                while (var29 < 0) {
                    var27 += var35;
                    var8++;
                    var35 += var22;
                    var29 += var31;
                    var31 += var22;
                }
            }
            if (var27 < 0) {
                var27 += var35;
                var29 += var31;
                var8++;
                var31 += var22;
                var35 += var22;
            }
            boolean var40 = var14 >= var9;
            if (var40) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var10++;
                        var23 += var37;
                        var37 += var30;
                        var26 += var32;
                        var32 += var30;
                    }
                }
                if (var23 < 0) {
                    var23 += var37;
                    var37 += var30;
                    var26 += var32;
                    var32 += var30;
                    var10++;
                }
                var23 += -var36;
                var36 -= var25;
                var26 += -var39;
                var39 -= var25;
            }
            var27 += -var33;
            var9--;
            var33 -= var28;
            int var41 = arg4 - var9;
            var29 += -var34;
            int var42 = arg6 + var8;
            int var43 = arg4 + var9;
            var34 -= var28;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class193.method1354((byte) -37, var46, var44, arg7, class202.field3337[var41]);
                class193.method1354((byte) -37, var45, var46, arg2, class202.field3337[var41]);
                class193.method1354((byte) -37, var42, var45, arg7, class202.field3337[var41]);
                class193.method1354((byte) -37, var46, var44, arg7, class202.field3337[var43]);
                class193.method1354((byte) -37, var45, var46, arg2, class202.field3337[var43]);
                class193.method1354((byte) -37, var42, var45, arg7, class202.field3337[var43]);
            } else {
                class193.method1354((byte) -37, var42, var44, arg7, class202.field3337[var41]);
                class193.method1354((byte) -37, var42, var44, arg7, class202.field3337[var43]);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 180)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3350++;
        if (class251.field4208 == null) {
            return;
        }
        class76.field1274 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class146.field2359.length) {
            var3 = class146.field2359[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class94.field1596 >= 0 && var3 >= 0) {
            class44.field684[class94.field1596] = var3;
            class94.field1596 = class94.field1596 + 1 & 0x7F;
            if (class94.field1596 == class328.field5587) {
                class94.field1596 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class252.field4215 + 1 & 0x7F;
            if (class6.field87 != var4) {
                class198.field3296[class252.field4215] = var3;
                class171.field2816[class252.field4215] = -1;
                class252.field4215 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ul", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 250)
    public final void keyTyped(KeyEvent arg0) {
        field3356++;
        if (class251.field4208 != null) {
            int var2 = class321.method2175(true, arg0);
            if (var2 >= 0) {
                int var3 = class252.field4215 + 1 & 0x7F;
                if (class6.field87 != var3) {
                    class198.field3296[class252.field4215] = -1;
                    class171.field2816[class252.field4215] = var2;
                    class252.field4215 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ul", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 300)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class251.field4208 != null) {
            class76.field1274 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class146.field2359.length) {
                var3 = class146.field2359[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class94.field1596 >= 0 && var3 >= 0) {
                class44.field684[class94.field1596] = ~var3;
                class94.field1596 = class94.field1596 + 1 & 0x7F;
                if (class94.field1596 == class328.field5587) {
                    class94.field1596 = -1;
                }
            }
        }
        field3355++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ul", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 357)
    public final void focusGained(FocusEvent arg0) {
        field3349++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V", line = 374)
    public static final void method1422(int arg0, boolean arg1) {
        if (arg1) {
            field3345++;
            class281 var2 = class135.method957(0, arg0, 1);
            var2.method1933(0);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 387)
    public static void method1423(byte arg0) {
        field3343 = null;
        if (arg0 > -65) {
            field3343 = (long[]) null;
        }
        field3352 = null;
        field3357 = null;
        field3346 = (int[][][]) null;
        field3353 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILsi;BI)[Lcc;", line = 406)
    public static final class220[] method1424(int arg0, class66 arg1, byte arg2, int arg3) {
        if (arg2 >= -113) {
            field3352 = (class229) null;
        }
        field3347++;
        return class176.method1264(arg0, (byte) 96, arg1, arg3) ? class223.method1556(26104) : null;
    }

    @OriginalMember(owner = "client!ul", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 422)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class251.field4208 != null) {
            class94.field1596 = -1;
        }
        field3344++;
    }
}
