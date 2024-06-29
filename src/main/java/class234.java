import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class234 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Z")
    public static boolean field3971 = false;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lqe;")
    private static class168 field3984 = class66.method448("Loaded textures", -123);

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lqe;")
    public static class168 field3981 = class66.method448(" GMT", -127);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lqe;")
    public static class168 field3986 = field3984;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[I")
    public static int[] field3980;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[[S")
    public static short[][] field3972;

    @OriginalMember(owner = "client!fb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3977++;
        if (class165.field2816 != null) {
            class74.field1121 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class34.field426.length > var2) {
                var3 = class34.field426[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class104.field1678 >= 0 && var3 >= 0) {
                class143.field2515[class104.field1678] = ~var3;
                class104.field1678 = class104.field1678 + 1 & 0x7F;
                if (class21.field248 == class104.field1678) {
                    class104.field1678 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lmj;IZ)Lqe;")
    public static final class168 method1509(class129 arg0, int arg1, boolean arg2) {
        field3979++;
        if (!class58.method403(client.method266(arg0), arg1, -112) && arg0.field2201 == null) {
            return null;
        } else if (arg0.field2174 == null || arg1 >= arg0.field2174.length || arg0.field2174[arg1] == null || arg0.field2174[arg1].method1086((byte) -125).method1109((byte) 98) == 0) {
            return class125.field2051 ? class50.method347(2, new class168[] { class205.field3571, class128.method867((byte) 123, arg1) }) : null;
        } else {
            if (arg2) {
                method1513((byte) -91);
            }
            return arg0.field2174[arg1];
        }
    }

    @OriginalMember(owner = "client!fb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class165.field2816 != null) {
            class74.field1121 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class34.field426.length > var2) {
                var3 = class34.field426[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class104.field1678 >= 0 && var3 >= 0) {
                class143.field2515[class104.field1678] = var3;
                class104.field1678 = class104.field1678 + 1 & 0x7F;
                if (class21.field248 == class104.field1678) {
                    class104.field1678 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class82.field1242 + 1 & 0x7F;
                if (class221.field3798 != var4) {
                    class112.field1814[class82.field1242] = var3;
                    class253.field4380[class82.field1242] = -1;
                    class82.field1242 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3983++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field3972 = null;
        field3980 = null;
        field3981 = null;
        field3986 = null;
        field3984 = null;
        if (arg0 != 17314) {
            method1509(null, 2, true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if (arg2 != 21067) {
            method1511(-40, -89, 62, -7, -52, 24, 97);
        }
        field3973++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 7 + 1 - arg6 - arg1;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3985++;
        if (class165.field2816 != null) {
            int var2 = class125.method856(9546, arg0);
            if (var2 >= 0) {
                int var3 = class82.field1242 + 1 & 0x7F;
                if (class221.field3798 != var3) {
                    class112.field1814[class82.field1242] = -1;
                    class253.field4380[class82.field1242] = var2;
                    class82.field1242 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static final void method1512(int arg0) {
        field3974++;
        try {
            if (arg0 < 73) {
                field3980 = null;
            }
            if (class227.field3872 == null) {
                class227.field3872 = new class192(class205.field3559, class50.method347(2, new class168[] { class25.method166((byte) 113), class152.field2646 }).method1071(-2010182716));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class227.field3872 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3978++;
        if (class165.field2816 != null) {
            class104.field1678 = -1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3975++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method1513(byte arg0) {
        class139.field2467 = null;
        class9.field99 = null;
        class76.field1138 = null;
        if (arg0 <= 104) {
            method1514(false, 47, 92, -122, 7, -80);
        }
        class176.field3081 = null;
        class30.field369 = null;
        class221.field3792 = null;
        class179.field3155 = null;
        field3976++;
        class96.field1510 = null;
        class135.field2360 = null;
        class208.field3614 = null;
        class254.field4397 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1514(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3982++;
        long var6 = class186.method1213(arg3, arg1, arg5);
        if (!arg0) {
            method1512(-119);
        }
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = arg2;
            if (var6 > 0L) {
                var10 = arg4;
            }
            int[] var11 = class216.field3731;
            int var12 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            int var13 = (103 - arg5) * 2048 + arg1 * 4 + 24624;
            class70 var14 = class190.method1232(var12, 13090);
            if (var14.field1030 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var13] = var10;
                        var11[var13 + 512] = var10;
                        var11[var13 + 1024] = var10;
                        var11[var13 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var13] = var10;
                        var11[var13 + 1] = var10;
                        var11[var13 + 2] = var10;
                        var11[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 3] = var10;
                        var11[var13 + 3 + 512] = var10;
                        var11[var13 + 3 + 1024] = var10;
                        var11[var13 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var13 + 1536] = var10;
                        var11[var13 + 1536 + 1] = var10;
                        var11[var13 + 1536 + 2] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var13] = var10;
                    } else if (var8 == 1) {
                        var11[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var13 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var13] = var10;
                        var11[var13 + 512] = var10;
                        var11[var13 + 1024] = var10;
                        var11[var13 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var13] = var10;
                        var11[var13 + 1] = var10;
                        var11[var13 + 2] = var10;
                        var11[var13 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var13 + 3] = var10;
                        var11[var13 + 3 + 512] = var10;
                        var11[var13 + 1024 + 3] = var10;
                        var11[var13 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 1536] = var10;
                        var11[var13 + 1536 + 1] = var10;
                        var11[var13 + 2 + 1536] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    }
                }
            } else {
                class217 var15 = class111.field1769[var14.field1030];
                if (var15 != null) {
                    int var16 = (var14.field1059 * 4 - var15.field2737) / 2;
                    int var17 = (var14.field1048 * 4 - var15.field2739) / 2;
                    var15.method1038(arg1 * 4 + var16 + 48, (-arg5 + 104 + -var14.field1048) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class94.method622(arg3, arg1, arg5);
        if (var18 != 0L) {
            int var20 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            int var21 = (int) var18 >> 14 & 0x1F;
            class70 var22 = class190.method1232(var20, 13090);
            int var23 = (int) var18 >> 20 & 0x3;
            if (var22.field1030 != -1) {
                class217 var27 = class111.field1769[var22.field1030];
                if (var27 != null) {
                    int var28 = (var22.field1059 * 4 - var27.field2737) / 2;
                    int var29 = (var22.field1048 * 4 - var27.field2739) / 2;
                    var27.method1038(var28 + arg1 * 4 + 48, 48 - -((-var22.field1048 + -arg5 + 104) * 4) + var29);
                }
            } else if (var21 == 9) {
                int var24 = (103 - arg5) * 512 * 4 + arg1 * 4 + 24624;
                int[] var25 = class216.field3731;
                int var26 = 15658734;
                if (var18 > 0L) {
                    var26 = 15597568;
                }
                if (var23 == 0 || var23 == 2) {
                    var25[var24 + 1536] = var26;
                    var25[var24 + 1024 + 1] = var26;
                    var25[var24 + 2 + 512] = var26;
                    var25[var24 + 3] = var26;
                } else {
                    var25[var24] = var26;
                    var25[var24 + 512 + 1] = var26;
                    var25[var24 + 1024 + 2] = var26;
                    var25[var24 + 1536 + 3] = var26;
                }
            }
        }
        long var30 = class23.method117(arg3, arg1, arg5);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class70 var33 = class190.method1232(var32, 13090);
        if (var33.field1030 == -1) {
            return;
        }
        class217 var34 = class111.field1769[var33.field1030];
        if (var34 != null) {
            int var35 = (var33.field1059 * 4 - var34.field2737) / 2;
            int var36 = (var33.field1048 * 4 - var34.field2739) / 2;
            var34.method1038(arg1 * 4 + var35 + 48, (-var33.field1048 + 104 + -arg5) * 4 + 48 + var36);
            return;
        }
    }
}
