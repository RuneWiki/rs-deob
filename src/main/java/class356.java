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

@OriginalClass("client!dk")
public class class356 {

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "S")
    public short field5269;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Z")
    public boolean field5274;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public int field5273;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "S")
    public short field5265;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "B")
    public byte field5277;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "S")
    public short field5263;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public int field5266;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public int field5267;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public int field5260;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "B")
    public byte field5272;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Lob;")
    public static class521 field5262 = new class521(7, 6);

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[C")
    public static char[] field5271 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Lob;")
    public static class521 field5280;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Ljs;")
    public static class219 field5279;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Lul;")
    public static class406 field5275;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static final void method2232(int arg0) {
        int var1 = 98 % ((57 - arg0) / 44);
        class387.method2419(false, (byte) -1);
        field5278++;
        if (class385.field5798 >= 0 && class385.field5798 != 0) {
            class185.method1229((byte) -33, class385.field5798);
            class385.field5798 = -1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBILul;)Ltp;")
    public static final class374 method2233(int arg0, byte arg1, int arg2, class406 arg3) {
        field5268++;
        byte[] var4 = arg3.method2536(arg0, 0, arg2);
        if (var4 == null) {
            return null;
        } else if (arg1 == -71) {
            return new class374(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILad;)Ljava/lang/String;")
    public static final String method2234(int arg0, class295 arg1) {
        field5276++;
        if (arg0 == 0) {
            return arg1.field4491 == null || arg1.field4491.length() <= 0 ? arg1.field4499 : arg1.field4499 + class59.field710.method1635(class224.field3673, (byte) -14) + arg1.field4491;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static void method2235(int arg0) {
        field5262 = null;
        field5275 = null;
        field5271 = null;
        field5279 = null;
        field5280 = null;
        if (arg0 <= 77) {
            field5261 = -74;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field5269 = (short) arg4;
        this.field5274 = arg10;
        this.field5273 = arg2;
        this.field5265 = (short) arg6;
        this.field5277 = (byte) arg8;
        this.field5263 = (short) arg5;
        this.field5264 = arg0;
        this.field5266 = arg1;
        this.field5267 = arg3;
        this.field5260 = arg11;
        this.field5272 = (byte) arg7;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILah;I)V")
    public static final void method2236(int arg0, class263 arg1, int arg2) {
        if (arg2 != 0) {
            method2235(11);
        }
        field5270++;
        while (true) {
            class233 var3 = (class233) class295.field4504.method1004((byte) -116);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3765; var5++) {
                if (var3.field3766[var5] != null) {
                    if (var3.field3766[var5].field6570 == 2) {
                        var3.field3761[var5] = -5;
                    }
                    if (var3.field3766[var5].field6570 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3758[var5] != null) {
                    if (var3.field3758[var5].field6570 == 2) {
                        var3.field3761[var5] = -6;
                    }
                    if (var3.field3758[var5].field6570 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1761((byte) 33, arg0);
            arg1.method1545(0, -49);
            int var6 = arg1.field3556;
            arg1.method1566(true, var3.field3755);
            for (int var7 = 0; var7 < var3.field3765; var7++) {
                if (var3.field3761[var7] == 0) {
                    try {
                        int var8 = var3.field3760[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3766[var7].field6569;
                            int var10 = var9.getInt(null);
                            arg1.method1545(0, arg2 ^ 0xFFFFFFE0);
                            arg1.method1566(true, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3766[var7].field6569;
                            var11.setInt(null, var3.field3767[var7]);
                            arg1.method1545(0, -36);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field3766[var7].field6569;
                            int var13 = var12.getModifiers();
                            arg1.method1545(0, -104);
                            arg1.method1566(true, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3758[var7].field6569;
                            byte[][] var17 = var3.field3757[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method1545(0, -110);
                            } else if ((var21 instanceof Number)) {
                                arg1.method1545(1, arg2 - 110);
                                arg1.method1507(((Number) var21).longValue(), (byte) -118);
                            } else if (var21 instanceof String) {
                                arg1.method1545(2, -113);
                                arg1.method1534((String) var21, false);
                            } else {
                                arg1.method1545(4, arg2 ^ 0xFFFFFF9D);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3758[var7].field6569;
                            int var15 = var14.getModifiers();
                            arg1.method1545(0, -75);
                            arg1.method1566(true, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1545(-10, -56);
                    } catch (InvalidClassException var23) {
                        arg1.method1545(-11, -85);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1545(-12, arg2 ^ -87);
                    } catch (OptionalDataException var25) {
                        arg1.method1545(-13, -73);
                    } catch (IllegalAccessException var26) {
                        arg1.method1545(-14, -29);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1545(-15, -88);
                    } catch (InvocationTargetException var28) {
                        arg1.method1545(-16, -96);
                    } catch (SecurityException var29) {
                        arg1.method1545(-17, -78);
                    } catch (IOException var30) {
                        arg1.method1545(-18, -84);
                    } catch (NullPointerException var31) {
                        arg1.method1545(-19, -40);
                    } catch (Exception var32) {
                        arg1.method1545(-20, -124);
                    } catch (Throwable var33) {
                        arg1.method1545(-21, -83);
                    }
                } else {
                    arg1.method1545(var3.field3761[var7], -89);
                }
            }
            arg1.method1541((byte) -90, var6);
            arg1.method1513(arg1.field3556 - var6, (byte) 107);
            var3.method2677(-22491);
        }
    }

    static {
        new class234("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field5280 = new class521(25, 7);
    }
}
