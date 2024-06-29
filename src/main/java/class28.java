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

@OriginalClass("client!df")
public class class28 extends class145 {

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    private int field612 = 0;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "Ltd;")
    public static class136 field609 = class145.method1172("<col=ff0000>", 45);

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    public static int field614 = 50;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "Ltd;")
    public static class136 field620 = null;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "Ltd;")
    public static class136 field622 = class145.method1172("VOLL", 45);

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "[I")
    public static int[] field618 = new int[500];

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "Lue;")
    public static class143 field617 = new class143(64);

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "Ltd;")
    private static class136 field627 = class145.method1172("Press (Wrecover a locked account(W on front page)3", 45);

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "Ltd;")
    public static class136 field626 = field627;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "Lpd;")
    public static class108 field625;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLbe;I)V")
    public static final void method238(int arg0, byte arg1, class13 arg2, int arg3) {
        if (arg1 <= 85) {
            field617 = null;
        }
        if ((arg0 & 0x100) != 0) {
            int var4 = class4.field70.method1034(-47);
            int var5 = class4.field70.method1011(41);
            arg2.method1211(class44.field1013, var4, (byte) -117, var5);
            arg2.field3596 = class44.field1013 + 300;
            arg2.field3600 = class4.field70.method994((byte) 124);
            arg2.field3549 = class4.field70.method1034(-108);
        }
        field613++;
        if ((arg0 & 0x20) != 0) {
            int var6 = class4.field70.method1020(false);
            int var7 = class4.field70.method994((byte) 125);
            int var8 = class4.field70.method992(-24514);
            int var9 = class4.field70.field2995;
            if (arg2.field249 != null && arg2.field258 != null) {
                long var10 = arg2.field249.method1117(125);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < class89.field2104; var13++) {
                        if (class43.field988[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && class64.field1370 == 0) {
                    class9.field152.field2995 = 0;
                    class4.field70.method998(class9.field152.field2960, 78, 0, var8);
                    class9.field152.field2995 = 0;
                    class136 var14 = class95.method717(class62.method470(-3119, class9.field152).method1110(-107));
                    arg2.field3548 = var14.method1129(false);
                    arg2.field3609 = 150;
                    arg2.field3568 = var6 & 0xFF;
                    arg2.field3553 = var6 >> 8;
                    if (var7 == 2 || var7 == 3) {
                        class27.method236((byte) -38, var14, 1, class79.method570(0, new class136[] { class142.field3299, arg2.field249 }));
                    } else if (var7 == 1) {
                        class27.method236((byte) -38, var14, 1, class79.method570(0, new class136[] { class19.field399, arg2.field249 }));
                    } else {
                        class27.method236((byte) -38, var14, 2, arg2.field249);
                    }
                }
            }
            class4.field70.field2995 = var8 + var9;
        }
        if ((arg0 & 0x400) != 0) {
            arg2.field3537 = class4.field70.method1011(107);
            arg2.field3571 = class4.field70.method992(-24514);
            arg2.field3540 = class4.field70.method1034(-123);
            arg2.field3542 = class4.field70.method1011(91);
            arg2.field3576 = class4.field70.method1019((byte) -17) + class44.field1013;
            arg2.field3539 = class4.field70.method1007(6119) + class44.field1013;
            arg2.field3563 = class4.field70.method994((byte) 127);
            arg2.field3564 = 1;
            arg2.field3536 = 0;
        }
        if ((arg0 & 0x1) != 0) {
            int var15 = class4.field70.method1034(-78);
            int var16 = class4.field70.method1034(-45);
            arg2.method1211(class44.field1013, var15, (byte) -117, var16);
            arg2.field3596 = class44.field1013 + 300;
            arg2.field3600 = class4.field70.method1011(117);
            arg2.field3549 = class4.field70.method994((byte) 120);
        }
        if ((arg0 & 0x80) != 0) {
            int var17 = class4.field70.method1020(false);
            int var18 = class4.field70.method992(-24514);
            if (var17 == 65535) {
                var17 = -1;
            }
            class152.method1198(var17, false, var18, arg2);
        }
        if ((arg0 & 0x10) != 0) {
            int var19 = class4.field70.method1011(33);
            byte[] var20 = new byte[var19];
            class127 var21 = new class127(var20);
            class4.field70.method998(var20, 56, 0, var19);
            class1.field15[arg3] = var21;
            arg2.method95(15, var21);
        }
        if ((arg0 & 0x8) != 0) {
            arg2.field3587 = class4.field70.method1020(false);
            if (arg2.field3587 == 65535) {
                arg2.field3587 = -1;
            }
        }
        if ((arg0 & 0x2) != 0) {
            arg2.field3566 = class4.field70.method1019((byte) -95);
            arg2.field3597 = class4.field70.method1019((byte) -72);
        }
        if ((arg0 & 0x200) != 0) {
            arg2.field3579 = class4.field70.method1004((byte) -83);
            int var22 = class4.field70.method999(0);
            arg2.field3551 = 0;
            if (arg2.field3579 == 65535) {
                arg2.field3579 = -1;
            }
            arg2.field3607 = (var22 & 0xFFFF) + class44.field1013;
            arg2.field3590 = 0;
            if (arg2.field3607 > class44.field1013) {
                arg2.field3551 = -1;
            }
            arg2.field3567 = var22 >> 16;
        }
        if ((arg0 & 0x4) == 0) {
            return;
        }
        arg2.field3548 = class4.field70.method1010(-14330);
        if (arg2.field3548.method1094(false, 0) == 126) {
            arg2.field3548 = arg2.field3548.method1108(1, -16621);
            class27.method236((byte) -38, arg2.field3548, 2, arg2.field249);
        } else if (class24.field555 == arg2) {
            class27.method236((byte) -38, arg2.field3548, 2, arg2.field249);
        }
        arg2.field3553 = 0;
        arg2.field3568 = 0;
        arg2.field3609 = 150;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILsb;I)V")
    private final void method239(int arg0, int arg1, class127 arg2, int arg3) {
        if (arg3 == 1) {
            this.field612 = arg2.method1022(arg0 - 99);
        }
        field619++;
        if (arg0 != 0) {
            field626 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public final void method240(int arg0) {
        field607++;
        this.method242(this.field612, 1);
        int var2 = 95 / ((38 - arg0) / 43);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZILsb;)V")
    public final void method241(boolean arg0, int arg1, class127 arg2) {
        if (arg0) {
            return;
        }
        field624++;
        while (true) {
            int var4 = arg2.method1011(57);
            if (var4 == 0) {
                return;
            }
            this.method239(0, arg1, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
    private final void method242(int arg0, int arg1) {
        field623++;
        double var3 = (double) (arg0 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        double var11 = var5;
        double var13 = 0.0D;
        if (var5 < var7) {
            var11 = var7;
        }
        double var15 = var5;
        if (var11 < var3) {
            var11 = var3;
        }
        if (var5 > var7) {
            var15 = var7;
        }
        if (var15 > var3) {
            var15 = var3;
        }
        double var17 = (var11 + var15) / 2.0D;
        if (var11 != var15) {
            if (var17 < 0.5D) {
                var13 = (var11 - var15) / (var11 + var15);
            }
            if (var5 == var11) {
                var9 = (var7 - var3) / (var11 - var15);
            } else if (var7 == var11) {
                var9 = (var3 - var5) / (-var15 + var11) + 2.0D;
            } else if (var3 == var11) {
                var9 = (var5 - var7) / (var11 - var15) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var15) / (2.0D - var11 - var15);
            }
        }
        this.field616 = (int) (var17 * 256.0D);
        double var19 = var9 / 6.0D;
        if (this.field616 < 0) {
            this.field616 = 0;
        } else if (this.field616 > 255) {
            this.field616 = 255;
        }
        if (var17 > 0.5D) {
            this.field611 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field611 = (int) (var13 * var17 * 512.0D);
        }
        if (arg1 > this.field611) {
            this.field611 = 1;
        }
        this.field608 = (int) (var13 * 256.0D);
        this.field606 = (int) ((double) this.field611 * var19);
        if (this.field608 < 0) {
            this.field608 = 0;
        } else if (this.field608 > 255) {
            this.field608 = 255;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ltd;Ltd;IZLtd;)V")
    public static final void method243(class136 arg0, class136 arg1, int arg2, boolean arg3, class136 arg4) {
        if (arg3) {
            return;
        }
        for (int var5 = 99; var5 > 0; var5--) {
            class131.field3105[var5] = class131.field3105[var5 - 1];
            class108.field2534[var5] = class108.field2534[var5 - 1];
            class61.field1298[var5] = class61.field1298[var5 - 1];
            class152.field3486[var5] = class152.field3486[var5 - 1];
        }
        class127.field3022 = class67.field1423;
        class108.field2534[0] = arg4;
        class131.field3105[0] = arg2;
        class61.field1298[0] = arg1;
        field615++;
        class152.field3486[0] = arg0;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
    public static void method244(byte arg0) {
        field622 = null;
        field625 = null;
        field627 = null;
        field617 = null;
        int var1 = -50 / ((-arg0 - 52) / 47);
        field626 = null;
        field609 = null;
        field620 = null;
        field618 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILpf;Z)V")
    public static final void method245(int arg0, class110 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field610++;
        while (true) {
            class119 var3 = (class119) class2.field26.method512(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2720; var5++) {
                if (var3.field2710[var5] != null) {
                    if (var3.field2710[var5].field3442 == 2) {
                        var3.field2707[var5] = -5;
                    }
                    if (var3.field2710[var5].field3442 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2726[var5] != null) {
                    if (var3.field2726[var5].field3442 == 2) {
                        var3.field2707[var5] = -6;
                    }
                    if (var3.field2726[var5].field3442 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method867(arg0, true);
            arg1.method1026(0, (byte) 127);
            int var6 = arg1.field2995;
            arg1.method989(var3.field2723, (byte) 118);
            for (int var7 = 0; var7 < var3.field2720; var7++) {
                if (var3.field2707[var7] == 0) {
                    try {
                        int var8 = var3.field2728[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2710[var7].field3441;
                            int var10 = var9.getInt(null);
                            arg1.method1026(0, (byte) 127);
                            arg1.method989(var10, (byte) 79);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2710[var7].field3441;
                            var13.setInt(null, var3.field2717[var7]);
                            arg1.method1026(0, (byte) 127);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2710[var7].field3441;
                            int var12 = var11.getModifiers();
                            arg1.method1026(0, (byte) 127);
                            arg1.method989(var12, (byte) 85);
                        }
                        if (var8 == 3) {
                            byte[][] var14 = var3.field2712[var7];
                            Object[] var15 = new Object[var14.length];
                            Method var16 = (Method) var3.field2726[var7].field3441;
                            for (int var17 = 0; var17 < var14.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var14[var17]));
                                var15[var17] = var18.readObject();
                            }
                            Object var19 = var16.invoke(null, var15);
                            if (var19 == null) {
                                arg1.method1026(0, (byte) 127);
                            } else if (var19 instanceof Number) {
                                arg1.method1026(1, (byte) 127);
                                arg1.method990(((Number) var19).longValue(), (byte) -38);
                            } else if (var19 instanceof class136) {
                                arg1.method1026(2, (byte) 127);
                                arg1.method1031(91, (class136) var19);
                            } else {
                                arg1.method1026(4, (byte) 127);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2726[var7].field3441;
                            int var21 = var20.getModifiers();
                            arg1.method1026(0, (byte) 127);
                            arg1.method989(var21, (byte) 43);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1026(-10, (byte) 127);
                    } catch (InvalidClassException var23) {
                        arg1.method1026(-11, (byte) 127);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1026(-12, (byte) 127);
                    } catch (OptionalDataException var25) {
                        arg1.method1026(-13, (byte) 127);
                    } catch (IllegalAccessException var26) {
                        arg1.method1026(-14, (byte) 127);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1026(-15, (byte) 127);
                    } catch (InvocationTargetException var28) {
                        arg1.method1026(-16, (byte) 127);
                    } catch (SecurityException var29) {
                        arg1.method1026(-17, (byte) 127);
                    } catch (IOException var30) {
                        arg1.method1026(-18, (byte) 127);
                    } catch (NullPointerException var31) {
                        arg1.method1026(-19, (byte) 127);
                    } catch (Exception var32) {
                        arg1.method1026(-20, (byte) 127);
                    } catch (Throwable var33) {
                        arg1.method1026(-21, (byte) 127);
                    }
                } else {
                    arg1.method1026(var3.field2707[var7], (byte) 127);
                }
            }
            arg1.method1030((byte) 20, var6);
            arg1.method993(arg1.field2995 - var6, (byte) -114);
            var3.method674(32);
        }
    }
}
