import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
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

@OriginalClass("client!qj")
public class class297 extends class48 implements class9 {

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "Z")
    private boolean field4159;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "B")
    private byte field4146;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "Z")
    private boolean field4134;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "B")
    private byte field4144;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "B")
    private byte field4148;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "S")
    private short field4156;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "Z")
    private boolean field4151;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "Lmm;")
    private class152 field4138;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "Lbk;")
    private class210 field4143;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field4137 = 0;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "Liq;")
    public static class362 field4139 = new class362("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "[I")
    public static int[] field4155 = new int[4096];

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "I")
    public static int field4161 = -1;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "Llg;")
    public static class237 field4154 = new class237(64);

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLae;)Ljg;", line = 3)
    public final class186 method52(byte arg0, class134 arg1) {
        ++field4127;
        if (this.field4143 == null) {
            return null;
        } else {
            if (arg0 != -120) {
                this.field4138 = null;
            }
            class18 var3 = arg1.method649();
            var3.method116(super.field577 + super.field567, super.field568, super.field578 + super.field571);
            class186 var4 = null;
            if (this.field4134) {
                var4 = class348.method2229(1, 21534);
            }
            this.field4143.method1416(var3, var4 != null ? var4.field2704[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I", line = 28)
    public final int method68(int arg0) {
        if (arg0 < 118) {
            return 109;
        } else {
            ++field4133;
            return this.field4148;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILae;)V", line = 40)
    public final void method72(int arg0, class134 arg1) {
        int var3 = -47 / (-arg0 / 55);
        ++field4160;
        Object var4 = null;
        class152 var6;
        if (this.field4138 == null && this.field4151) {
            class371 var5 = this.method1962(arg1, 31, true, 131072);
            var6 = var5 != null ? var5.field5235 : null;
        } else {
            var6 = this.field4138;
            this.field4138 = null;
        }
        if (var6 != null) {
            class258.method1733(var6, this.field4146, super.field577, super.field571, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)I", line = 72)
    public final int method278(byte arg0) {
        ++field4136;
        int var2 = 0 % ((arg0 - 37) / 51);
        return this.field4143 == null ? 0 : this.field4143.method1405();
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)I", line = 82)
    public static final int method1956(int arg0) {
        ++field4130;
        if (arg0 != 30) {
            field4158 = 121;
        }
        class237 var1 = class337.field4789;
        synchronized (class337.field4789) {
            return class337.field4789.method1628((byte) 49);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 95)
    public final void method65(int arg0) {
        if (this.field4143 != null) {
            this.field4143.method1409();
        }
        if (arg0 == 17184) {
            ++field4135;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;ILjava/awt/Color;Ljava/awt/Color;ZLjava/awt/Color;)V", line = 109)
    public static final void method1957(int arg0, String arg1, int arg2, Color arg3, Color arg4, boolean arg5, Color arg6) {
        ++field4142;
        int var7 = 58 / ((49 - arg0) / 36);
        try {
            Graphics var8 = class402.field5767.getGraphics();
            if (class62.field722 == null) {
                class62.field722 = new Font("Helvetica", 1, 13);
            }
            if (arg5) {
                var8.setColor(Color.black);
                var8.fillRect(0, 0, class330.field4671, class105.field1259);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class4.field45 == null) {
                    class4.field45 = class402.field5767.createImage(304, 34);
                }
                Graphics var9 = class4.field45.getGraphics();
                var9.setColor(arg3);
                var9.drawRect(0, 0, 303, 33);
                var9.setColor(arg6);
                var9.fillRect(2, 2, arg2 * 3, 30);
                var9.setColor(Color.black);
                var9.drawRect(1, 1, 301, 31);
                var9.fillRect(2 - -(arg2 * 3), 2, 300 - arg2 * 3, 30);
                var9.setFont(class62.field722);
                var9.setColor(arg4);
                var9.drawString(arg1, (304 + -(arg1.length() * 6)) / 2, 22);
                var8.drawImage(class4.field45, class330.field4671 / 2 + -152, class105.field1259 / 2 + -18, (ImageObserver) null);
            } catch (Exception var12) {
                int var10 = class330.field4671 / 2 - 152;
                int var11 = class105.field1259 / 2 + -18;
                var8.setColor(arg3);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg6);
                var8.fillRect(var10 - -2, var11 + 2, arg2 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(var10 + 1, var11 + 1, 301, 31);
                var8.fillRect(arg2 * 3 + var10 + 2, var11 + 2, 300 - arg2 * 3, 30);
                var8.setFont(class62.field722);
                var8.setColor(arg4);
                var8.drawString(arg1, var10 + (304 + -(arg1.length() * 6)) / 2, var11 - -22);
            }
            if (class200.field2856 != null) {
                var8.setFont(class62.field722);
                var8.setColor(arg4);
                var8.drawString(class200.field2856, class330.field4671 / 2 - class200.field2856.length() * 6 / 2, class105.field1259 / 2 + -26);
            }
        } catch (Exception var13) {
            class402.field5767.repaint();
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)I", line = 187)
    public final int method69(int arg0) {
        if (arg0 != -5944) {
            return 55;
        } else {
            ++field4140;
            return this.field4144;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lae;ZI)Lbk;", line = 204)
    public final class210 method70(class134 arg0, boolean arg1, int arg2) {
        ++field4152;
        if (!arg1) {
            this.field4146 = -76;
        }
        return this.method1960(arg0, (byte) -45, arg2);
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "(I)V", line = 218)
    public static final void method1958(int arg0) {
        ++field4153;
        class35.field405 = -1;
        if (arg0 != 8936) {
            field4158 = -45;
        }
        class33.field386 = -1;
        class39.field447 = 0;
        class443.field6343 = -1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILfi;)V", line = 232)
    public static final void method1959(int arg0, int arg1, class332 arg2) {
        if (arg1 != 0) {
            field4161 = -19;
        }
        ++field4147;
        while (true) {
            class318 var3 = (class318) class402.field5762.method506((byte) -128);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var5 > ~var3.field4520; ++var5) {
                if (var3.field4510[var5] != null) {
                    if (var3.field4510[var5].field4498 == 2) {
                        var3.field4507[var5] = -5;
                    }
                    if (var3.field4510[var5].field4498 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4517[var5] != null) {
                    if (var3.field4517[var5].field4498 == 2) {
                        var3.field4507[var5] = -6;
                    }
                    if (~var3.field4517[var5].field4498 == -1) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method2143(arg0, arg1 ^ -2);
            arg2.method1583(0, (byte) -54);
            int var6 = arg2.field3320;
            arg2.method1603(var3.field4521, 871);
            for (int var7 = 0; var3.field4520 > var7; ++var7) {
                if (var3.field4507[var7] != 0) {
                    arg2.method1583(var3.field4507[var7], (byte) -121);
                } else {
                    try {
                        int var8 = var3.field4519[var7];
                        if (~var8 == -1) {
                            Field var9 = (Field) var3.field4510[var7].field4497;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1583(0, (byte) -46);
                            arg2.method1603(var10, 871);
                        } else if (~var8 != -2) {
                            if (var8 == 2) {
                                Field var11 = (Field) var3.field4510[var7].field4497;
                                int var12 = var11.getModifiers();
                                arg2.method1583(0, (byte) -61);
                                arg2.method1603(var12, 871);
                            }
                        } else {
                            Field var13 = (Field) var3.field4510[var7].field4497;
                            var13.setInt((Object) null, var3.field4514[var7]);
                            arg2.method1583(0, (byte) -97);
                        }
                        if (var8 != 3) {
                            if (~var8 == -5) {
                                Method var20 = (Method) var3.field4517[var7].field4497;
                                int var21 = var20.getModifiers();
                                arg2.method1583(0, (byte) -71);
                                arg2.method1603(var21, arg1 + 871);
                            }
                        } else {
                            Method var14 = (Method) var3.field4517[var7].field4497;
                            byte[][] var15 = var3.field4508[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; ++var17) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 != null) {
                                if (var19 instanceof Number) {
                                    arg2.method1583(1, (byte) -76);
                                    arg2.method1615(((Number) var19).longValue(), 61);
                                } else if (var19 instanceof String) {
                                    arg2.method1583(2, (byte) -93);
                                    arg2.method1596((String) var19, false);
                                } else {
                                    arg2.method1583(4, (byte) -82);
                                }
                            } else {
                                arg2.method1583(0, (byte) -86);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1583(-10, (byte) -110);
                    } catch (InvalidClassException var23) {
                        arg2.method1583(-11, (byte) -63);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1583(-12, (byte) -76);
                    } catch (OptionalDataException var25) {
                        arg2.method1583(-13, (byte) -100);
                    } catch (IllegalAccessException var26) {
                        arg2.method1583(-14, (byte) -95);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1583(-15, (byte) -123);
                    } catch (InvocationTargetException var28) {
                        arg2.method1583(-16, (byte) -108);
                    } catch (SecurityException var29) {
                        arg2.method1583(-17, (byte) -112);
                    } catch (IOException var30) {
                        arg2.method1583(-18, (byte) -107);
                    } catch (NullPointerException var31) {
                        arg2.method1583(-19, (byte) -89);
                    } catch (Exception var32) {
                        arg2.method1583(-20, (byte) -91);
                    } catch (Throwable var33) {
                        arg2.method1583(-21, (byte) -74);
                    }
                }
            }
            arg2.method1595(-114, var6);
            arg2.method1584(12299, -var6 + arg2.field3320);
            var3.method2594((byte) -22);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)I", line = 426)
    public final int method71(byte arg0) {
        ++field4128;
        if (arg0 >= -36) {
            this.field4151 = true;
        }
        return this.field4156 & 65535;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lae;BI)Lbk;", line = 440)
    private final class210 method1960(class134 arg0, byte arg1, int arg2) {
        ++field4129;
        if (arg1 != -45) {
            return null;
        } else if (this.field4143 != null && arg0.method689(this.field4143.method1410(), arg2) == 0) {
            return this.field4143;
        } else {
            class371 var4 = this.method1962(arg0, 31, false, arg2);
            return var4 != null ? var4.field5233 : null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lae;I)V", line = 463)
    public final void method66(class134 arg0, int arg1) {
        ++field4145;
        if (arg1 != 4257) {
            field4137 = -63;
        }
        Object var3 = null;
        class152 var5;
        if (this.field4138 == null && this.field4151) {
            class371 var4 = this.method1962(arg0, 31, true, 131072);
            var5 = var4 != null ? var4.field5235 : null;
        } else {
            var5 = this.field4138;
            this.field4138 = null;
        }
        if (var5 != null) {
            class122.method778(var5, this.field4146, super.field577, super.field571, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lae;B)V", line = 490)
    public final void method64(class134 arg0, byte arg1) {
        ++field4150;
        if (arg1 > -50) {
            this.method52((byte) -20, (class134) null);
        }
    }

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "(I)V", line = 505)
    public static void method1961(int arg0) {
        field4139 = null;
        if (arg0 <= 26) {
            method1957(-1, (String) null, -25, (Color) null, (Color) null, false, (Color) null);
        }
        field4155 = null;
        field4154 = null;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lae;Ljh;IIIIZIIIII)V", line = 518)
    public class297(class134 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class433.method2717(arg10, arg11, -5));
        this.field4159 = arg6;
        this.field4146 = (byte) arg2;
        this.field4134 = arg1.field998 != 0 && !arg6;
        this.field4144 = (byte) arg10;
        this.field4148 = (byte) arg11;
        super.field571 = (short) arg5;
        this.field4156 = (short) arg1.field1026;
        super.field577 = (short) arg3;
        this.field4151 = arg0.method615() && arg1.field995 && !this.field4159 && ~class141.field1739 != -1;
        class371 var13 = this.method1962(arg0, 31, this.field4151, 1024);
        if (var13 != null) {
            this.field4138 = var13.field5235;
            this.field4143 = var13.field5233;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Z", line = 546)
    public final boolean method67(int arg0) {
        if (arg0 != -3673) {
            this.method64((class134) null, (byte) 0);
        }
        ++field4141;
        return this.field4151;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILae;II)Z", line = 561)
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field4157;
        if (arg2 != 4835) {
            this.method72(89, (class134) null);
        }
        class210 var5 = this.method1960(arg1, (byte) -45, 65536);
        if (var5 != null) {
            class18 var6 = arg1.method649();
            var6.method116(super.field577, super.field568, super.field571);
            return var5.method1382(arg0, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lae;IZI)Lsk;", line = 582)
    private final class371 method1962(class134 arg0, int arg1, boolean arg2, int arg3) {
        ++field4132;
        if (arg1 != 31) {
            field4158 = 118;
        }
        class88 var5 = class374.method2382(65535 & this.field4156, false);
        class327 var6;
        class327 var7;
        if (this.field4159) {
            var6 = class399.field5693[this.field4146];
            var7 = class98.field1191[0];
        } else {
            var6 = class98.field1191[this.field4146];
            if (this.field4146 < 3) {
                var7 = class98.field1191[this.field4146 - -1];
            } else {
                var7 = null;
            }
        }
        return var5.method482(this.field4148, arg2, var6, arg0, this.field4144, super.field577, super.field571, super.field568, -97, arg3, var7);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ltq;ILjava/lang/String;Z)Lns;", line = 616)
    public static final class230 method1963(class376 arg0, int arg1, String arg2, boolean arg3) {
        ++field4131;
        int var4 = arg0.method2418(arg2, (byte) -23);
        if (~var4 == 0) {
            return new class230(0);
        } else {
            int[] var5 = arg0.method2419((byte) 95, var4);
            class230 var6 = new class230(var5.length);
            if (arg1 != 14003) {
                field4149 = -119;
            }
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (~var6.field3253 < ~var7) {
                    class236 var9 = new class236(arg0.method2431((byte) 62, var4, var5[var8++]));
                    int var10 = var9.method1597(3641);
                    int var11 = var9.method1617((byte) 48);
                    int var12 = var9.method1574(-91);
                    if (!arg3 && ~var12 == -2) {
                        --var6.field3253;
                    } else {
                        var6.field3248[var7] = var10;
                        var6.field3250[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }
}
