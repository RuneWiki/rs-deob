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

@OriginalClass("client!nb")
public class class80 {

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lrc;")
    private static class105 field1793 = class43.method374("Click to continue", 0);

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lrc;")
    public static class105 field1796 = class43.method374("@cr1@", 0);

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lrc;")
    public static class105 field1791 = field1793;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lrc;")
    public static class105 field1789 = class43.method374("Freunde", 0);

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[I")
    public static int[] field1797 = new int[5];

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[B")
    public static byte[] field1803 = new byte[520];

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lrc;")
    public static class105 field1804 = class43.method374("Side panel redrawn", 0);

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field1795 = 0;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
    public static boolean field1805 = false;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lrc;")
    public static class105 field1801 = class43.method374("mapedge", 0);

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lrc;")
    public static class105 field1806 = class43.method374("::noclip", 0);

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lrc;")
    public static class105 field1800 = class43.method374("zur-Uck auf die RuneScape)2Webseite gehen", 0);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field1790 = 0;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field1794 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lc;")
    public static class13 field1799;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 11)
    public static final void method684(int arg0) {
        field1787++;
        if (class111.field2585 != 0) {
            return;
        }
        if (class104.field2371 == 1) {
            int var1 = class30.field683 - 5 - 4;
            int var2 = class86.field1937 - 550 - 25;
            if (var2 >= 0 && var1 >= 0 && var2 < 146 && var1 < 151) {
                var2 -= 73;
                var1 -= 75;
                int var3 = client.field432 + class12.field249 & 0x7FF;
                int var4 = class38.field885[var3];
                int var5 = class38.field876[var3];
                int var6 = (class35.field807 + 256) * var5 >> 8;
                int var7 = (class35.field807 + 256) * var4 >> 8;
                int var8 = var1 * var7 + var2 * var6 >> 11;
                int var9 = class119.field2842.field1229 + var8 >> 7;
                int var10 = var1 * var6 - var2 * var7 >> 11;
                int var11 = class119.field2842.field1274 - var10 >> 7;
                boolean var12 = class93.method773((byte) 80, var11, 0, class119.field2842.field1281[0], true, 0, 0, 0, 1, class119.field2842.field1261[0], 0, var9);
                if (var12) {
                    class66.field1472.method102((byte) 123, var2);
                    class66.field1472.method102((byte) 123, var1);
                    class66.field1472.method113(client.field432, 116);
                    class66.field1472.method102((byte) 123, 57);
                    class66.field1472.method102((byte) 123, class12.field249);
                    class66.field1472.method102((byte) 123, class35.field807);
                    class66.field1472.method102((byte) 123, 89);
                    class66.field1472.method113(class119.field2842.field1229, 125);
                    class66.field1472.method113(class119.field2842.field1274, 121);
                    class66.field1472.method102((byte) 123, class98.field2258);
                    class66.field1472.method102((byte) 123, 63);
                }
            }
        }
        if (arg0 <= 124) {
            method687(22);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 77)
    public static void method685(boolean arg0) {
        field1801 = null;
        field1799 = null;
        if (arg0) {
            method685(false);
        }
        field1806 = null;
        field1793 = null;
        field1803 = null;
        field1800 = null;
        field1796 = null;
        field1789 = null;
        field1804 = null;
        field1797 = null;
        field1791 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lrc;", line = 110)
    public static final class105 method686(int arg0, int arg1) {
        field1802++;
        if (arg0 < 999999999) {
            return class75.method637(arg0, arg1 ^ 0xFFFFDF31);
        } else {
            if (arg1 != -256) {
                field1799 = null;
            }
            return class136.field3330;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 155)
    public static final void method687(int arg0) {
        class81 var1 = (class81) class108.field2480.method31(1280);
        if (arg0 != -2) {
            method684(-73);
        }
        while (var1 != null) {
            if (var1.field1831 != null) {
                var1.method691((byte) -117);
            }
            var1 = (class81) class108.field2480.method26((byte) 108);
        }
        field1788++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI[Lte;IIIII)Lte;", line = 188)
    public static final class119 method688(boolean arg0, int arg1, class119[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1792++;
        if (arg2 == null) {
            return null;
        }
        class119 var8 = null;
        if (arg1 > -66) {
            return null;
        }
        for (int var9 = 0; var9 < arg2.length; var9++) {
            class119 var10 = arg2[var9];
            if (var10 != null && var10.field2797 == arg6) {
                int var11 = var10.field2810 + arg5;
                int var12 = var10.field2862 + arg3;
                if (arg4 >= var11 && arg7 >= var12 && var10.field2855 + var11 > arg4 && var10.field2787 + var12 > arg7 && !var10.field2815) {
                    if (var10.field2867 < 0 && arg0 || var10.field2867 >= 0 && !arg0) {
                        var8 = var10;
                    }
                    if (var10.field2811 == 0) {
                        class119 var13 = method688(arg0, -102, arg2, var10.field2862 - var10.field2838, arg4, var10.field2810 - var10.field2794, var10.field2867, arg7);
                        if (var13 != null) {
                            var8 = var13;
                        }
                        if (arg0 && var10.field2831 != null) {
                            class119 var14 = method688(arg0, -90, var10.field2831, var10.field2862 - var10.field2838, arg4, var10.field2810 - var10.field2794, var10.field2867, arg7);
                            if (var14 != null) {
                                var8 = var14;
                            }
                        }
                    }
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILpe;I)V", line = 256)
    public static final void method689(int arg0, class95 arg1, int arg2) {
        if (arg2 != -22071) {
            field1801 = null;
        }
        field1798++;
        while (true) {
            class22 var3 = (class22) class123.field3026.method31(1280);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field522; var5++) {
                if (var3.field515[var5] != null) {
                    if (var3.field515[var5].field916 == 2) {
                        var3.field529[var5] = -5;
                    }
                    if (var3.field515[var5].field916 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field518[var5] != null) {
                    if (var3.field518[var5].field916 == 2) {
                        var3.field529[var5] = -6;
                    }
                    if (var3.field518[var5].field916 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method781(arg0, (byte) -55);
            arg1.method102((byte) 123, 0);
            int var6 = arg1.field143;
            arg1.method100(var3.field517, false);
            for (int var7 = 0; var7 < var3.field522; var7++) {
                if (var3.field529[var7] == 0) {
                    try {
                        int var8 = var3.field525[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field515[var7].field918;
                            int var13 = var12.getInt(null);
                            arg1.method102((byte) 123, 0);
                            arg1.method100(var13, false);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field515[var7].field918;
                            var9.setInt(null, var3.field516[var7]);
                            arg1.method102((byte) 123, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field515[var7].field918;
                            int var11 = var10.getModifiers();
                            arg1.method102((byte) 123, 0);
                            arg1.method100(var11, false);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field518[var7].field918;
                            byte[][] var17 = var3.field523[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method102((byte) 123, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method102((byte) 123, 1);
                                arg1.method64(((Number) var21).longValue(), arg2 ^ 0x5655);
                            } else if (var21 instanceof class105) {
                                arg1.method102((byte) 123, 2);
                                arg1.method94(false, (class105) var21);
                            } else {
                                arg1.method102((byte) 123, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field518[var7].field918;
                            int var15 = var14.getModifiers();
                            arg1.method102((byte) 123, 0);
                            arg1.method100(var15, false);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method102((byte) 123, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method102((byte) 123, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method102((byte) 123, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method102((byte) 123, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method102((byte) 123, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method102((byte) 123, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method102((byte) 123, -16);
                    } catch (SecurityException var29) {
                        arg1.method102((byte) 123, -17);
                    } catch (IOException var30) {
                        arg1.method102((byte) 123, -18);
                    } catch (NullPointerException var31) {
                        arg1.method102((byte) 123, -19);
                    } catch (Exception var32) {
                        arg1.method102((byte) 123, -20);
                    } catch (Throwable var33) {
                        arg1.method102((byte) 123, -21);
                    }
                } else {
                    arg1.method102((byte) 123, var3.field529[var7]);
                }
            }
            arg1.method61(var6, 120);
            arg1.method107((byte) 7, arg1.field143 - var6);
            var3.method551(118);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIII)V", line = 465)
    public static final void method690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 2048 - arg2 & 0x7FF;
        field1786++;
        int var8 = 2048 - arg6 & 0x7FF;
        if (arg5 != -7420) {
            return;
        }
        int var9 = 0;
        int var10 = arg1;
        int var11 = 0;
        if (var7 != 0) {
            int var12 = class56.field1151[var7];
            int var13 = class56.field1159[var7];
            int var14 = var9 * var13 - arg1 * var12 >> 16;
            var10 = var9 * var12 + arg1 * var13 >> 16;
            var9 = var14;
        }
        if (var8 != 0) {
            int var15 = class56.field1151[var8];
            int var16 = class56.field1159[var8];
            int var17 = var10 * var15 + var11 * var16 >> 16;
            var10 = var10 * var16 - var11 * var15 >> 16;
            var11 = var17;
        }
        class78.field1755 = arg0 - var10;
        class113.field2658 = arg4 - var11;
        class100.field2291 = arg2;
        class10.field214 = arg3 - var9;
        class3.field52 = arg6;
    }
}
