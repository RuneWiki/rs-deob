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

@OriginalClass("client!f")
public abstract class class31 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[[B")
    public static byte[][] field655 = new byte[50][];

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lec;")
    public static class28 field670 = class28.method210(-46, "@gre@World");

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lec;")
    public static class28 field666 = class28.method210(-46, "Remove @whi@");

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[Lec;")
    public static class28[] field665 = new class28[5];

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lec;")
    public static class28 field660 = class28.method210(-46, "backvmid1");

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field659 = 0;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lec;")
    public static class28 field662 = class28.method210(-46, "Use @lre@");

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lvb;")
    public static class122 field669;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lcc;")
    public static class16 field658;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Lcc;")
    public static class16 field664;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
    public static int[] field671;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(JB)V")
    public static final void method247(long arg0, byte arg1) {
        field668++;
        if (arg1 != 123) {
            field658 = null;
        }
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class13.method70((byte) -103, arg0 - 1L);
            class13.method70((byte) -122, 1L);
        } else {
            class13.method70((byte) -87, arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static final void method248(int arg0) {
        field656++;
        class109 var1 = (class109) class37.field842.method326(0);
        if (arg0 >= -64) {
            return;
        }
        while (var1 != null) {
            if (var1.field2285 == -1) {
                var1.field2275 = 0;
                class109.method748(var1, 3);
            } else {
                var1.method319((byte) -127);
            }
            var1 = (class109) class37.field842.method325((byte) 121);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static void method249(byte arg0) {
        field671 = null;
        field665 = null;
        field662 = null;
        field655 = null;
        field670 = null;
        field669 = null;
        field666 = null;
        field658 = null;
        field660 = null;
        if (arg0 != -122) {
            field661 = -24;
        }
        field664 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
    public abstract int method30(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILvb;)V")
    public static final void method250(int arg0, class122 arg1) {
        if (arg0 != -6) {
            method251((byte) 81, 25, null);
        }
        field654++;
        class53.field1214 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public abstract void method28(boolean arg0);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BILdc;)V")
    public static final void method251(byte arg0, int arg1, class22 arg2) {
        if (arg0 <= 56) {
            field666 = null;
        }
        field663++;
        while (true) {
            class83 var3 = (class83) class7.field110.method326(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1890; var5++) {
                if (var3.field1886[var5] != null) {
                    if (var3.field1886[var5].field2157 == 2) {
                        var3.field1903[var5] = -5;
                    }
                    if (var3.field1886[var5].field2157 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1887[var5] != null) {
                    if (var3.field1887[var5].field2157 == 2) {
                        var3.field1903[var5] = -6;
                    }
                    if (var3.field1887[var5].field2157 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method161((byte) 89, arg1);
            arg2.method888(0, 72);
            int var6 = arg2.field2554;
            arg2.method898(var3.field1891, -1202576);
            for (int var7 = 0; var7 < var3.field1890; var7++) {
                if (var3.field1903[var7] == 0) {
                    try {
                        int var8 = var3.field1881[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1886[var7].field2154;
                            int var13 = var12.getInt(null);
                            arg2.method888(0, -84);
                            arg2.method898(var13, -1202576);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field1886[var7].field2154;
                            var9.setInt(null, var3.field1885[var7]);
                            arg2.method888(0, 48);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field1886[var7].field2154;
                            int var11 = var10.getModifiers();
                            arg2.method888(0, -107);
                            arg2.method898(var11, -1202576);
                        }
                        if (var8 == 3) {
                            byte[][] var16 = var3.field1883[var7];
                            Method var17 = (Method) var3.field1887[var7].field2154;
                            Object[] var18 = new Object[var16.length];
                            for (int var19 = 0; var19 < var16.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var17.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method888(0, 119);
                            } else if (var21 instanceof Number) {
                                arg2.method888(1, -114);
                                arg2.method854(false, ((Number) var21).longValue());
                            } else if (var21 instanceof class28) {
                                arg2.method888(2, -116);
                                arg2.method867((byte) 112, (class28) var21);
                            } else {
                                arg2.method888(4, 82);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1887[var7].field2154;
                            int var15 = var14.getModifiers();
                            arg2.method888(0, 67);
                            arg2.method898(var15, -1202576);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method888(-10, -128);
                    } catch (InvalidClassException var23) {
                        arg2.method888(-11, -84);
                    } catch (StreamCorruptedException var24) {
                        arg2.method888(-12, -85);
                    } catch (OptionalDataException var25) {
                        arg2.method888(-13, 44);
                    } catch (IllegalAccessException var26) {
                        arg2.method888(-14, -125);
                    } catch (IllegalArgumentException var27) {
                        arg2.method888(-15, 50);
                    } catch (InvocationTargetException var28) {
                        arg2.method888(-16, 102);
                    } catch (SecurityException var29) {
                        arg2.method888(-17, 123);
                    } catch (IOException var30) {
                        arg2.method888(-18, 50);
                    } catch (NullPointerException var31) {
                        arg2.method888(-19, 102);
                    } catch (Exception var32) {
                        arg2.method888(-20, 65);
                    } catch (Throwable var33) {
                        arg2.method888(-21, -105);
                    }
                } else {
                    arg2.method888(var3.field1903[var7], 57);
                }
            }
            arg2.method857(-90, var6);
            arg2.method887((byte) -66, arg2.field2554 - var6);
            var3.method319((byte) -1);
        }
    }
}
