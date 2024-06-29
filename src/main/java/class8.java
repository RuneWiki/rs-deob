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

@OriginalClass("client!ba")
public class class8 extends class29 {

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "I")
    public int field268 = -1;

    @OriginalMember(owner = "client!ba", name = "yb", descriptor = "[I")
    private int[] field283 = new int[6];

    @OriginalMember(owner = "client!ba", name = "tb", descriptor = "[I")
    private int[] field278 = new int[6];

    @OriginalMember(owner = "client!ba", name = "Eb", descriptor = "[I")
    private int[] field289 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ba", name = "Fb", descriptor = "Z")
    public boolean field290 = false;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    public static int field264 = 0;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "Lwb;")
    private static class130 field257 = class26.method212("Please check your message)2centre for details)3", -32376);

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public static int field262 = 0;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    public static int field260 = 0;

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "Lwb;")
    private static class130 field270 = class26.method212("No reply from loginserver)3", -32376);

    @OriginalMember(owner = "client!ba", name = "rb", descriptor = "I")
    public static int field276 = 0;

    @OriginalMember(owner = "client!ba", name = "ub", descriptor = "Lwb;")
    public static class130 field279 = field270;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "Lwb;")
    public static class130 field258 = class26.method212("nicht hergestellt werden)3", -32376);

    @OriginalMember(owner = "client!ba", name = "sb", descriptor = "Lwb;")
    public static class130 field277 = field257;

    @OriginalMember(owner = "client!ba", name = "Bb", descriptor = "Lwb;")
    private static class130 field286 = class26.method212("RuneScape is loading )2 please wait)3)3)3", -32376);

    @OriginalMember(owner = "client!ba", name = "vb", descriptor = "Lwb;")
    public static class130 field280 = field286;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ba", name = "nb", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ba", name = "pb", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ba", name = "qb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ba", name = "wb", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ba", name = "xb", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ba", name = "zb", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ba", name = "Ab", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ba", name = "Cb", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ba", name = "ob", descriptor = "Lda;")
    public static class20 field273;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "[I")
    private int[] field259;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "[[[B")
    public static byte[][][] field263;

    @OriginalMember(owner = "client!ba", name = "Db", descriptor = "[[[B")
    public static byte[][][] field288;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLqa;I)V", line = 3)
    public static final void method58(byte arg0, class97 arg1, int arg2) {
        if (arg0 >= -66) {
            method66(true);
        }
        field265++;
        while (true) {
            class45 var3 = (class45) class90.field2187.method813(52);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1205; var5++) {
                if (var3.field1232[var5] != null) {
                    if (var3.field1232[var5].field1099 == 2) {
                        var3.field1226[var5] = -5;
                    }
                    if (var3.field1232[var5].field1099 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1216[var5] != null) {
                    if (var3.field1216[var5].field1099 == 2) {
                        var3.field1226[var5] = -6;
                    }
                    if (var3.field1216[var5].field1099 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method727(arg2, -118);
            arg1.method330(-1, 0);
            int var6 = arg1.field1057;
            arg1.method325(-405801808, var3.field1203);
            for (int var7 = 0; var7 < var3.field1205; var7++) {
                if (var3.field1226[var7] == 0) {
                    try {
                        int var8 = var3.field1213[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1232[var7].field1100;
                            int var13 = var12.getInt(null);
                            arg1.method330(-1, 0);
                            arg1.method325(-405801808, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field1232[var7].field1100;
                            var9.setInt(null, var3.field1212[var7]);
                            arg1.method330(-1, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field1232[var7].field1100;
                            int var11 = var10.getModifiers();
                            arg1.method330(-1, 0);
                            arg1.method325(-405801808, var11);
                        }
                        if (var8 == 3) {
                            byte[][] var16 = var3.field1206[var7];
                            Method var17 = (Method) var3.field1216[var7].field1100;
                            Object[] var18 = new Object[var16.length];
                            for (int var19 = 0; var19 < var16.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var17.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method330(-1, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method330(-1, 1);
                                arg1.method344(((Number) var21).longValue(), -1652311768);
                            } else if (var21 instanceof class130) {
                                arg1.method330(-1, 2);
                                arg1.method372(980803184, (class130) var21);
                            } else {
                                arg1.method330(-1, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1216[var7].field1100;
                            int var15 = var14.getModifiers();
                            arg1.method330(-1, 0);
                            arg1.method325(-405801808, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method330(-1, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method330(-1, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method330(-1, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method330(-1, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method330(-1, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method330(-1, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method330(-1, -16);
                    } catch (SecurityException var29) {
                        arg1.method330(-1, -17);
                    } catch (IOException var30) {
                        arg1.method330(-1, -18);
                    } catch (NullPointerException var31) {
                        arg1.method330(-1, -19);
                    } catch (Exception var32) {
                        arg1.method330(-1, -20);
                    } catch (Throwable var33) {
                        arg1.method330(-1, -21);
                    }
                } else {
                    arg1.method330(-1, var3.field1226[var7]);
                }
            }
            arg1.method362((byte) 76, var6);
            arg1.method359(arg1.field1057 - var6, 7);
            var3.method714((byte) 61);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfe;B)V", line = 205)
    public final void method59(class36 arg0, byte arg1) {
        field261++;
        if (arg1 <= 24) {
            this.field289 = null;
        }
        while (true) {
            int var3 = arg0.method365((byte) -127);
            if (var3 == 0) {
                return;
            }
            this.method69(-7895, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)Z", line = 239)
    public final boolean method60(byte arg0) {
        field266++;
        if (this.field259 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field259.length; var3++) {
            if (!class33.field921.method498(13199, 0, this.field259[var3])) {
                var2 = false;
            }
        }
        if (arg0 <= 37) {
            method65(null, null, (byte) 78);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)Z", line = 271)
    public final boolean method61(byte arg0) {
        boolean var2 = true;
        field272++;
        if (arg0 != -23) {
            method58((byte) -121, null, 111);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field289[var3] != -1 && !class33.field921.method498(arg0 + 13222, 0, this.field289[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V", line = 302)
    public static void method62(boolean arg0) {
        field263 = null;
        field288 = null;
        field279 = null;
        field258 = null;
        if (arg0) {
            field273 = null;
        }
        field270 = null;
        field286 = null;
        field277 = null;
        field280 = null;
        field273 = null;
        field257 = null;
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V", line = 321)
    public static final void method63(int arg0) {
        field287++;
        class94.field2292 = true;
        class48.method423(18298);
        if (class105.field2538 != -1) {
            boolean var1 = class90.method667(0, 0, -36, -1, 1, class105.field2538, 0, 190, 261);
            if (!var1) {
                class20.field585 = true;
            }
        } else if (class71.field1814[class42.field1181] != -1) {
            boolean var2 = class90.method667(0, 0, -36, -1, 1, class71.field1814[class42.field1181], 0, 190, 261);
            if (!var2) {
                class20.field585 = true;
            }
        }
        if (class58.field1462 && class116.field2863 == 1) {
            if (class67.field1708 == 1) {
                client.method156((byte) -105);
            } else {
                method66(true);
            }
        }
        if (arg0 != 16178) {
            field257 = null;
        }
        class115.method884(553);
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V", line = 364)
    public static final void method64(int arg0) {
        field284++;
        if (class63.field1605 > 0) {
            class53.method457(-57);
            return;
        }
        if (arg0 > -110) {
            field271 = -111;
        }
        class90.method669(19013, 40);
        class10.field329 = class47.field1255;
        class47.field1255 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lsb;Ljava/awt/Component;B)V", line = 396)
    public static final void method65(class110 arg0, Component arg1, byte arg2) {
        field267++;
        try {
            class86 var3 = (class86) Class.forName("jc").getDeclaredConstructor().newInstance();
            var3.method646(arg0, 2048);
            class81.field1934 = var3;
            if (arg2 >= -48) {
                method58((byte) 71, null, 24);
            }
        } catch (Throwable var6) {
            try {
                class81.field1934 = new class77(arg0, arg1);
            } catch (Throwable var5) {
                if (class110.field2701.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class81.field1934 = new class73();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class81.field1934 = new class111(8000);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(Z)V", line = 437)
    public static final void method66(boolean arg0) {
        int var1 = class69.field1767;
        field275++;
        int var2 = class18.field496;
        int var3 = class119.field2908;
        int var4 = 6116423;
        int var5 = class35.field1007;
        class49.method440(var2, var1, var3, var5, var4);
        class49.method440(var2 + 1, var1 + 1, var3 - 2, 16, 0);
        class49.method431(var2 + 1, var1 - -18, var3 - 2, var5 - 19, 0);
        class43.field1187.method1002(client.field527, var2 + 3, var1 + 14, var4);
        int var6 = class18.field483;
        int var7 = class101.field2429;
        if (class116.field2863 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (!arg0) {
            field262 = 50;
        }
        if (class116.field2863 == 1) {
            var7 -= 205;
            var6 -= 553;
        }
        if (class116.field2863 == 2) {
            var6 -= 17;
            var7 -= 357;
        }
        for (int var8 = 0; var8 < class26.field757; var8++) {
            int var9 = (class26.field757 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var6 > var2 && var2 + var3 > var6 && var7 > var9 - 13 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class43.field1187.method1000(class105.field2546[var8], var2 + 3, var9, var10, true);
        }
    }

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)V", line = 509)
    public static final void method67(int arg0) {
        int var1 = 0;
        if (arg0 > -89) {
            method58((byte) -40, null, -74);
        }
        while (var1 < class58.field1466) {
            int var2 = class24.field716[var1];
            class33 var3 = class26.field766[var2];
            if (var3 != null) {
                class132.method1020(-1, var3.field913.field1981, var3);
            }
            var1++;
        }
        field269++;
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)Lr;", line = 554)
    public final class102 method68(byte arg0) {
        int var2 = -44 % ((arg0 - 36) / 61);
        field281++;
        class102[] var3 = new class102[5];
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field289[var5] != -1) {
                var3[var4++] = class102.method791(class33.field921, this.field289[var5], 0);
            }
        }
        class102 var6 = new class102(var3, var4);
        for (int var7 = 0; var7 < 6 && this.field278[var7] != 0; var7++) {
            var6.method763(this.field278[var7], this.field283[var7]);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILfe;)V", line = 595)
    private final void method69(int arg0, int arg1, class36 arg2) {
        if (arg0 != -7895) {
            this.method59(null, (byte) 7);
        }
        if (arg1 == 1) {
            this.field268 = arg2.method365((byte) -127);
        } else if (arg1 == 2) {
            int var4 = arg2.method365((byte) -127);
            this.field259 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field259[var5] = arg2.method351((byte) -113);
            }
        } else if (arg1 == 3) {
            this.field290 = true;
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field278[arg1 - 40] = arg2.method351((byte) -119);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field283[arg1 - 50] = arg2.method351((byte) -100);
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field289[arg1 - 60] = arg2.method351((byte) -103);
        }
        field282++;
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(B)Lr;", line = 647)
    public final class102 method70(byte arg0) {
        field274++;
        if (this.field259 == null) {
            return null;
        }
        class102[] var2 = new class102[this.field259.length];
        for (int var3 = 0; var3 < this.field259.length; var3++) {
            var2[var3] = class102.method791(class33.field921, this.field259[var3], 0);
        }
        int var4 = -123 % (arg0 / 63);
        class102 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class102(var2, var2.length);
        }
        for (int var6 = 0; var6 < 6 && this.field278[var6] != 0; var6++) {
            var5.method763(this.field278[var6], this.field283[var6]);
        }
        return var5;
    }
}
