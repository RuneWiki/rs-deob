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

@OriginalClass("client!wb")
public class class155 {

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    private int field3531 = 32;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "J")
    private long field3520 = class39.method307(8);

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    private int field3536 = 0;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    private int field3534 = 0;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "J")
    private long field3540 = 0L;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Z")
    private boolean field3535 = true;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "[Lkb;")
    private class71[] field3539 = new class71[8];

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    private int field3543 = 0;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "[Lkb;")
    private class71[] field3538 = new class71[8];

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    private int field3544 = 0;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "J")
    private long field3542 = 0L;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lid;")
    public static class60 field3502 = class11.method72("Lade Schrifts-=tze )2 ", (byte) 122);

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Lid;")
    private static class60 field3515 = class11.method72("Select a world", (byte) 117);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lid;")
    private static class60 field3503 = class11.method72("shake:", (byte) 93);

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Lid;")
    public static class60 field3519 = field3503;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lid;")
    public static class60 field3528 = field3515;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field3530 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Lid;")
    private static class60 field3517 = class11.method72("glow3:", (byte) 120);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lid;")
    public static class60 field3505 = field3517;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Lid;")
    public static class60 field3516 = field3503;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lid;")
    public static class60 field3509 = field3517;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "Lwd;")
    public static class157 field3523 = new class157(5000);

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "Lid;")
    public static class60 field3545 = class11.method72("gr-Un:", (byte) -123);

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field3546 = 0;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "B")
    public static byte field3547 = 0;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lie;")
    public static class61 field3529;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Lkb;")
    private class71 field3532;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "[I")
    public int[] field3514;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public final synchronized void method1181(int arg0) {
        field3527++;
        if (class45.field1179 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class45.field1179.field1375[var3] == this) {
                    class45.field1179.field1375[var3] = null;
                }
                if (class45.field1179.field1375[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class45.field1179.field1367 = true;
                while (class45.field1179.field1386) {
                    class128.method1007((byte) 79, 50L);
                }
                class45.field1179 = null;
            }
        }
        this.method273();
        this.field3514 = null;
        int var4 = -76 / ((-arg0 - 74) / 48);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([II)V")
    private final void method1182(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class144.field3258) {
            var3 = arg1 << 1;
        }
        class149.method1135(arg0, 0, var3);
        this.field3543 -= arg1;
        if (this.field3532 != null && this.field3543 <= 0) {
            this.field3543 += class14.field318 >> 4;
            class139.method1086(-13, this.field3532);
            this.method1189((byte) 116, this.field3532, this.field3532.method546());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class71 var10 = null;
                        class71 var11 = this.field3539[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class92 var12 = var11.field1724;
                                if (var12 == null || var12.field2289 <= var8) {
                                    var11.field1723 = true;
                                    int var13 = var11.method113();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2289 += var13;
                                    }
                                    if (var4 >= this.field3531) {
                                        break label107;
                                    }
                                    class71 var14 = var11.method87();
                                    if (var14 != null) {
                                        int var15 = var11.field1725;
                                        while (var14 != null) {
                                            this.method1189((byte) 111, var14, var15 * var14.method546() >> 8);
                                            var14 = var11.method109();
                                        }
                                    }
                                    class71 var16 = var11.field1726;
                                    var11.field1726 = null;
                                    if (var10 == null) {
                                        this.field3539[var7] = var16;
                                    } else {
                                        var10.field1726 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3538[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1726;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class71 var18 = this.field3539[var17];
                this.field3539[var17] = this.field3538[var17] = null;
                while (var18 != null) {
                    class71 var19 = var18.field1726;
                    var18.field1726 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3543 < 0) {
            this.field3543 = 0;
        }
        if (this.field3532 != null) {
            this.field3532.method120(arg0, 0, arg1);
        }
        this.field3520 = class39.method307(8);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
    private final void method1183(byte arg0, int arg1) {
        field3521++;
        this.field3543 -= arg1;
        if (arg0 != 6) {
            field3516 = null;
        }
        if (this.field3543 < 0) {
            this.field3543 = 0;
        }
        if (this.field3532 != null) {
            this.field3532.method104(arg1);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -15165) {
            field3523 = null;
        }
        field3510++;
        if (arg6 < 1 || arg0 < 1 || arg6 > 102 || arg0 > 102) {
            return;
        }
        if (class22.field548 && class46.field1222 != arg3) {
            return;
        }
        int var8 = 0;
        if (arg2 == 0) {
            var8 = class43.field1151.method584(arg3, arg6, arg0);
        }
        if (arg2 == 1) {
            var8 = class43.field1151.method582(arg3, arg6, arg0);
        }
        if (arg2 == 2) {
            var8 = class43.field1151.method595(arg3, arg6, arg0);
        }
        if (arg2 == 3) {
            var8 = class43.field1151.method592(arg3, arg6, arg0);
        }
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = true;
        if (var8 != 0) {
            int var12 = var8 >> 14 & 0x7FFF;
            int var13 = class43.field1151.method577(arg3, arg6, arg0, var8);
            int var14 = var13 & 0x1F;
            int var15 = var13 >> 6 & 0x3;
            if (arg2 == 0) {
                class43.field1151.method575(arg3, arg6, arg0);
                class148 var16 = class31.method238(-29628, var12);
                if (var16.field3348 != 0) {
                    class133.field3030[arg3].method879(arg4 ^ 0x3B60, var14, arg0, var15, var16.field3347, arg6);
                }
            }
            if (arg2 == 1) {
                class43.field1151.method574(arg3, arg6, arg0);
            }
            if (arg2 == 2) {
                class43.field1151.method602(arg3, arg6, arg0);
                class148 var17 = class31.method238(-29628, var12);
                if (var17.field3330 + arg6 > 103 || var17.field3330 + arg0 > 103 || var17.field3306 + arg6 > 103 || var17.field3306 + arg0 > 103) {
                    return;
                }
                if (var17.field3348 != 0) {
                    class133.field3030[arg3].method871(var15, var17.field3306, 1, arg0, var17.field3347, var17.field3330, arg6);
                }
            }
            if (arg2 == 3) {
                class43.field1151.method578(arg3, arg6, arg0);
                class148 var18 = class31.method238(-29628, var12);
                if (var18.field3348 == 1) {
                    class133.field3030[arg3].method880(arg6, arg0, (byte) 110);
                }
            }
        }
        if (arg1 < 0) {
            return;
        }
        int var19 = arg3;
        if (arg3 < 3 && (class124.field2869[1][arg6][arg0] & 0x2) == 2) {
            var19 = arg3 + 1;
        }
        class11.method73(arg5, var19, arg3, arg0, arg1, arg7, arg4 + 25703, class43.field1151, class133.field3030[arg3], arg6);
        return;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
    public void method273() {
        field3504++;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
    public void method271() throws Exception {
        field3513++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILwd;I)V")
    public static final void method1185(int arg0, class157 arg1, int arg2) {
        field3508++;
        if (arg2 != 0) {
            field3509 = null;
        }
        while (true) {
            class10 var3 = (class10) class112.field2686.method496(10153);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field165; var5++) {
                if (var3.field169[var5] != null) {
                    if (var3.field169[var5].field3145 == 2) {
                        var3.field163[var5] = -5;
                    }
                    if (var3.field169[var5].field3145 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field173[var5] != null) {
                    if (var3.field173[var5].field3145 == 2) {
                        var3.field163[var5] = -6;
                    }
                    if (var3.field173[var5].field3145 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1214(arg0, arg2);
            arg1.method818(false, 0);
            int var6 = arg1.field2501;
            arg1.method819(var3.field160, (byte) 31);
            for (int var7 = 0; var7 < var3.field165; var7++) {
                if (var3.field163[var7] == 0) {
                    try {
                        int var8 = var3.field164[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field169[var7].field3144;
                            int var13 = var12.getInt(null);
                            arg1.method818(false, 0);
                            arg1.method819(var13, (byte) 28);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field169[var7].field3144;
                            var11.setInt(null, var3.field166[var7]);
                            arg1.method818(false, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field169[var7].field3144;
                            int var10 = var9.getModifiers();
                            arg1.method818(false, 0);
                            arg1.method819(var10, (byte) -96);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field173[var7].field3144;
                            byte[][] var17 = var3.field161[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method818(false, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method818(false, 1);
                                arg1.method830(((Number) var21).longValue(), 124);
                            } else if (var21 instanceof class60) {
                                arg1.method818(false, 2);
                                arg1.method807((byte) 0, (class60) var21);
                            } else {
                                arg1.method818(false, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field173[var7].field3144;
                            int var15 = var14.getModifiers();
                            arg1.method818(false, 0);
                            arg1.method819(var15, (byte) 97);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method818(false, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method818(false, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method818(false, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method818(false, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method818(false, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method818(false, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method818(false, -16);
                    } catch (SecurityException var29) {
                        arg1.method818(false, -17);
                    } catch (IOException var30) {
                        arg1.method818(false, -18);
                    } catch (NullPointerException var31) {
                        arg1.method818(false, -19);
                    } catch (Exception var32) {
                        arg1.method818(false, -20);
                    } catch (Throwable var33) {
                        arg1.method818(false, -21);
                    }
                } else {
                    arg1.method818(false, var3.field163[var7]);
                }
            }
            arg1.method851(var6, (byte) -70);
            arg1.method844(124, arg1.field2501 - var6);
            var3.method1009((byte) 116);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public void method272(int arg0) throws Exception {
        field3512++;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
    public void method275() throws Exception {
        field3525++;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public final synchronized void method1186(int arg0) {
        field3511++;
        if (this.field3514 == null) {
            return;
        }
        long var2 = class39.method307(arg0 - 1016);
        try {
            if (this.field3542 != 0L) {
                if (this.field3542 > var2) {
                    return;
                }
                this.method272(this.field3548);
                this.field3535 = true;
                this.field3542 = 0L;
            }
            if (arg0 != 1024) {
                this.field3520 = -49L;
            }
            int var4 = this.method274();
            if (this.field3534 - var4 > this.field3544) {
                this.field3544 = this.field3534 - var4;
            }
            int var5 = this.field3541 + this.field3537;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3548 < var5 + 256) {
                this.field3548 += 1024;
                var4 = 0;
                if (this.field3548 > 16384) {
                    this.field3548 = 16384;
                }
                this.method273();
                this.method272(this.field3548);
                this.field3535 = true;
                if (this.field3548 < var5 + 256) {
                    var5 = this.field3548 - 256;
                    this.field3537 = var5 - this.field3541;
                }
            }
            while (var4 < var5) {
                var4 += 256;
                this.method1182(this.field3514, 256);
                this.method271();
            }
            if (this.field3540 < var2) {
                if (this.field3535) {
                    this.field3535 = false;
                } else if (this.field3544 == 0 && this.field3536 == 0) {
                    this.method273();
                    this.field3542 = var2 + 2000L;
                    return;
                } else {
                    this.field3537 = Math.min(this.field3536, this.field3544);
                    this.field3536 = this.field3544;
                }
                this.field3540 = var2 + 2000L;
                this.field3544 = 0;
            }
            this.field3534 = var4;
        } catch (Exception var7) {
            this.method273();
            this.field3542 = var2 + 2000L;
        }
        try {
            if (var2 > this.field3520 + 500000L) {
                var2 = this.field3520;
            }
            while (this.field3520 + 5000L < var2) {
                this.method1183((byte) 6, 256);
                this.field3520 += 256000 / class14.field318;
            }
        } catch (Exception var6) {
            this.field3520 = var2;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public final synchronized void method1187(byte arg0) {
        this.field3535 = true;
        field3526++;
        try {
            if (arg0 == -128) {
                this.method275();
            }
        } catch (Exception var2) {
            this.method273();
            this.field3542 = class39.method307(8) + 2000L;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method276(Component arg0) throws Exception {
        field3524++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public static final void method1188(int arg0, int arg1) {
        field3506++;
        class23 var2 = (class23) class16.field404.method716((byte) 116, (long) arg1);
        if (var2 != null && arg0 == 22265) {
            var2.method1009((byte) 88);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLkb;I)V")
    private final void method1189(byte arg0, class71 arg1, int arg2) {
        field3533++;
        if (arg0 < 80) {
            field3529 = null;
        }
        int var4 = arg2 >> 5;
        class71 var5 = this.field3538[var4];
        if (var5 == null) {
            this.field3539[var4] = arg1;
        } else {
            var5.field1726 = arg1;
        }
        this.field3538[var4] = arg1;
        arg1.field1725 = arg2;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    public final void method1190(int arg0) {
        if (arg0 == -2736) {
            field3518++;
            this.field3535 = true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public static void method1191(int arg0) {
        field3529 = null;
        field3519 = null;
        field3545 = null;
        field3517 = null;
        field3505 = null;
        field3528 = null;
        field3515 = null;
        if (arg0 != 0) {
            field3519 = null;
        }
        field3503 = null;
        field3502 = null;
        field3516 = null;
        field3523 = null;
        field3509 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLkb;)V")
    public final synchronized void method1192(byte arg0, class71 arg1) {
        if (arg0 <= -2) {
            this.field3532 = arg1;
            field3522++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
    public int method274() throws Exception {
        field3507++;
        return this.field3548;
    }
}
