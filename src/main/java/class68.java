import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 {

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Laf;")
    private static class7 field1482 = class48.method406(40, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Laf;")
    public static class7 field1487 = field1482;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1485 = 0;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Laf;")
    public static class7 field1483 = class48.method406(40, " )2> ");

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lbd;")
    public static class12 field1479 = new class12(32);

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field1494 = 0;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "Laf;")
    public static class7 field1497 = class48.method406(40, " weitere Optionen");

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Laf;")
    private static class7 field1496 = class48.method406(40, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Laf;")
    private static class7 field1493 = class48.method406(40, "Loading)3)3)3");

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Laf;")
    public static class7 field1495 = field1493;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Laf;")
    public static class7 field1492 = field1496;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Laf;")
    private static class7 field1498 = class48.method406(40, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Laf;")
    public static class7 field1491 = field1498;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lkb;")
    public static class71 field1480;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Laf;Lkb;Laf;I)Lfd;")
    public static final class40 method544(class7 arg0, class71 arg1, class7 arg2, int arg3) {
        if (arg3 == -292) {
            field1478++;
            int var4 = arg1.method586(arg0, arg3 ^ 0x1399);
            int var5 = arg1.method560(arg2, var4, arg3 + 390);
            return class54.method437(var5, arg1, true, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lua;II)V")
    public static final void method545(class139 arg0, int arg1, int arg2) {
        if (arg2 != -5) {
            return;
        }
        field1486++;
        while (true) {
            class67 var3 = (class67) class121.field2856.method758(255);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1460; var5++) {
                if (var3.field1468[var5] != null) {
                    if (var3.field1468[var5].field2087 == 2) {
                        var3.field1474[var5] = -5;
                    }
                    if (var3.field1468[var5].field2087 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1464[var5] != null) {
                    if (var3.field1464[var5].field2087 == 2) {
                        var3.field1474[var5] = -6;
                    }
                    if (var3.field1464[var5].field2087 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1131(arg1, 2027385224);
            arg0.method959(0, (byte) -120);
            int var6 = arg0.field2903;
            arg0.method970((byte) -96, var3.field1469);
            for (int var7 = 0; var7 < var3.field1460; var7++) {
                if (var3.field1474[var7] == 0) {
                    try {
                        int var8 = var3.field1473[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1468[var7].field2090;
                            int var13 = var12.getInt(null);
                            arg0.method959(0, (byte) -120);
                            arg0.method970((byte) -96, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1468[var7].field2090;
                            var11.setInt(null, var3.field1465[var7]);
                            arg0.method959(0, (byte) -120);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field1468[var7].field2090;
                            int var10 = var9.getModifiers();
                            arg0.method959(0, (byte) -120);
                            arg0.method970((byte) -96, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1464[var7].field2090;
                            byte[][] var17 = var3.field1472[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg0.method959(0, (byte) -120);
                            } else if (var21 instanceof Number) {
                                arg0.method959(1, (byte) -120);
                                arg0.method956(((Number) var21).longValue(), -822368080);
                            } else if (var21 instanceof class7) {
                                arg0.method959(2, (byte) -120);
                                arg0.method932((class7) var21, (byte) 86);
                            } else {
                                arg0.method959(4, (byte) -120);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1464[var7].field2090;
                            int var15 = var14.getModifiers();
                            arg0.method959(0, (byte) -120);
                            arg0.method970((byte) -96, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method959(-10, (byte) -120);
                    } catch (InvalidClassException var23) {
                        arg0.method959(-11, (byte) -120);
                    } catch (StreamCorruptedException var24) {
                        arg0.method959(-12, (byte) -120);
                    } catch (OptionalDataException var25) {
                        arg0.method959(-13, (byte) -120);
                    } catch (IllegalAccessException var26) {
                        arg0.method959(-14, (byte) -120);
                    } catch (IllegalArgumentException var27) {
                        arg0.method959(-15, (byte) -120);
                    } catch (InvocationTargetException var28) {
                        arg0.method959(-16, (byte) -120);
                    } catch (SecurityException var29) {
                        arg0.method959(-17, (byte) -120);
                    } catch (IOException var30) {
                        arg0.method959(-18, (byte) -120);
                    } catch (NullPointerException var31) {
                        arg0.method959(-19, (byte) -120);
                    } catch (Exception var32) {
                        arg0.method959(-20, (byte) -120);
                    } catch (Throwable var33) {
                        arg0.method959(-21, (byte) -120);
                    }
                } else {
                    arg0.method959(var3.field1474[var7], (byte) -120);
                }
            }
            arg0.method975(var6, (byte) -109);
            arg0.method976(arg0.field2903 - var6, (byte) 21);
            var3.method1124((byte) 62);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([Laf;III)Laf;")
    public static final class7 method546(class7[] arg0, int arg1, int arg2, int arg3) {
        field1488++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class26.field688;
            }
            var4 += arg0[arg2 + var5].field139;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        int var8 = -39 / ((-arg3 - 23) / 60);
        for (int var9 = 0; var9 < arg1; var9++) {
            class7 var11 = arg0[arg2 + var9];
            class125.method1039(var11.field162, 0, var7, var6, var11.field139);
            var6 += var11.field139;
        }
        class7 var10 = new class7();
        var10.field139 = var4;
        var10.field162 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)I")
    public static final int method547(int arg0, int arg1, int arg2, int arg3) {
        field1484++;
        if (arg2 <= 6) {
            field1497 = null;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIILnb;)V")
    public static final void method548(int arg0, int arg1, int arg2, class92 arg3) {
        if ((arg2 & 0x80) != 0) {
            int var4 = class91.field2100.method984((byte) -83);
            byte[] var5 = new byte[var4];
            class122 var6 = new class122(var5);
            class91.field2100.method954(0, var5, -128, var4);
            class111.field2688[arg1] = var6;
            arg3.method742((byte) 31, var6);
        }
        if ((arg2 & 0x10) != 0) {
            int var7 = class91.field2100.method931((byte) 124);
            int var8 = class91.field2100.method962(1206579365);
            arg3.method184(class155.field3611, var8, var7, 0);
            arg3.field468 = class155.field3611 + 300;
            arg3.field496 = class91.field2100.method984((byte) -45);
            arg3.field467 = class91.field2100.method962(arg0 + 1206579364);
        }
        if ((arg2 & 0x200) != 0) {
            arg3.field469 = class91.field2100.method965(false);
            int var9 = class91.field2100.method945(255);
            arg3.field448 = var9 >> 16;
            if (arg3.field469 == 65535) {
                arg3.field469 = -1;
            }
            arg3.field477 = 0;
            arg3.field475 = 0;
            arg3.field500 = (var9 & 0xFFFF) + class155.field3611;
            if (class155.field3611 < arg3.field500) {
                arg3.field475 = -1;
            }
        }
        field1490++;
        if ((arg2 & 0x20) != 0) {
            arg3.field444 = class91.field2100.method947(13771);
            arg3.field494 = class91.field2100.method969(127);
        }
        if ((arg0 & arg2) != 0) {
            int var10 = class91.field2100.method978(-83);
            int var11 = class91.field2100.method962(1206579365);
            int var12 = class91.field2100.method962(1206579365);
            int var13 = class91.field2100.field2903;
            if (arg3.field2121 != null && arg3.field2118 != null) {
                long var14 = arg3.field2121.method70(arg0 ^ 0x4A27);
                boolean var16 = false;
                if (var11 <= 1) {
                    for (int var17 = 0; var17 < class105.field2573; var17++) {
                        if (class39.field968[var17] == var14) {
                            var16 = true;
                            break;
                        }
                    }
                }
                if (!var16 && class44.field1050 == 0) {
                    class51.field1236.field2903 = 0;
                    class91.field2100.method954(0, class51.field1236.field2895, -128, var12);
                    class51.field1236.field2903 = 0;
                    class7 var18 = class5.method40(class99.method811(40, class51.field1236).method90(-3882));
                    arg3.field453 = var18.method71(arg0 ^ 0x70);
                    arg3.field507 = var10 >> 8;
                    arg3.field451 = var10 & 0xFF;
                    arg3.field488 = 150;
                    if (var11 == 2 || var11 == 3) {
                        class53.method432(var18, 1, class116.method905(new class7[] { class92.field2148, arg3.field2121 }, 1), arg0 + 48);
                    } else if (var11 == 1) {
                        class53.method432(var18, 1, class116.method905(new class7[] { class103.field2481, arg3.field2121 }, arg0), -8);
                    } else {
                        class53.method432(var18, 2, arg3.field2121, 0);
                    }
                }
            }
            class91.field2100.field2903 = var12 + var13;
        }
        if ((arg2 & 0x4) != 0) {
            int var19 = class91.field2100.method965(false);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class91.field2100.method931((byte) 124);
            class97.method795((byte) -117, arg3, var20, var19);
        }
        if ((arg2 & 0x40) != 0) {
            arg3.field445 = class91.field2100.method965(false);
            if (arg3.field445 == 65535) {
                arg3.field445 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg3.field481 = class91.field2100.method984((byte) -78);
            arg3.field506 = class91.field2100.method948((byte) 121);
            arg3.field461 = class91.field2100.method962(1206579365);
            arg3.field446 = class91.field2100.method948((byte) 121);
            arg3.field483 = class91.field2100.method978(arg0 ^ 0xFFFFFF96) + class155.field3611;
            arg3.field486 = class91.field2100.method978(-100) + class155.field3611;
            arg3.field479 = class91.field2100.method984((byte) -92);
            arg3.field455 = 1;
            arg3.field471 = 0;
        }
        if ((arg2 & 0x400) != 0) {
            int var21 = class91.field2100.method931((byte) 124);
            int var22 = class91.field2100.method931((byte) 124);
            arg3.method184(class155.field3611, var22, var21, 0);
            arg3.field468 = class155.field3611 + 300;
            arg3.field496 = class91.field2100.method962(1206579365);
            arg3.field467 = class91.field2100.method948((byte) 121);
        }
        if ((arg2 & 0x8) == 0) {
            return;
        }
        arg3.field453 = class91.field2100.method979(26250);
        if (arg3.field453.method79(0, 0) == 126) {
            arg3.field453 = arg3.field453.method61(arg0 - 94, 1);
            class53.method432(arg3.field453, 2, arg3.field2121, arg0 ^ 0xFFFFFF89);
        } else if (class21.field531 == arg3) {
            class53.method432(arg3.field453, 2, arg3.field2121, arg0 ^ 0x3A);
        }
        arg3.field488 = 150;
        arg3.field451 = 0;
        arg3.field507 = 0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method549(byte arg0) {
        field1498 = null;
        if (arg0 != 48) {
            method546(null, -111, 108, -60);
        }
        field1493 = null;
        field1491 = null;
        field1492 = null;
        field1479 = null;
        field1496 = null;
        field1480 = null;
        field1483 = null;
        field1482 = null;
        field1497 = null;
        field1487 = null;
        field1495 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method550(int arg0) {
        class124.field2960 = false;
        class91.field2106 = false;
        if (arg0 != 2) {
            field1498 = null;
        }
        field1489++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method551(int arg0, Component arg1) {
        field1481++;
        arg1.removeMouseListener(class106.field2589);
        arg1.removeMouseMotionListener(class106.field2589);
        arg1.removeFocusListener(class106.field2589);
        if (arg0 != 28243) {
            field1482 = null;
        }
        class20.field521 = 0;
    }
}
