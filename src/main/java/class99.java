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

@OriginalClass("client!ob")
public class class99 extends class4 {

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    public int field2314 = 0;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "Lja;")
    public static class63 field2312 = new class63();

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "Loa;")
    public static class98 field2317 = class38.method349(255, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "Loa;")
    public static class98 field2316 = class38.method349(255, "Name eingeben:");

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "Loa;")
    public static class98 field2320 = class38.method349(255, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "Loa;")
    public static class98 field2319 = class38.method349(255, "Abbrechen");

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "Z")
    public static boolean field2318;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public static void method821(int arg0) {
        if (arg0 < 105) {
            field2319 = null;
        }
        field2317 = null;
        field2312 = null;
        field2319 = null;
        field2316 = null;
        field2320 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method822(String arg0, byte arg1) throws ClassNotFoundException {
        field2315++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else {
            int var2 = -8 / ((arg1 + 31) / 59);
            if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lb;I)V")
    public final void method823(class8 arg0, int arg1) {
        if (arg1 >= -26) {
            method821(100);
        }
        field2313++;
        while (true) {
            int var3 = arg0.method62((byte) 108);
            if (var3 == 0) {
                return;
            }
            this.method824(var3, arg0, 123);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILb;I)V")
    private final void method824(int arg0, class8 arg1, int arg2) {
        field2310++;
        if (arg2 < 60) {
            this.method824(-3, null, -72);
        }
        if (arg0 == 2) {
            this.field2314 = arg1.method68(-2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILcc;I)V")
    public static final void method825(int arg0, class18 arg1, int arg2) {
        if (arg0 != 0) {
            method825(-32, null, -37);
        }
        field2311++;
        while (true) {
            class42 var3 = (class42) class84.field1943.method512(arg0 + 114);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field992; var5++) {
                if (var3.field983[var5] != null) {
                    if (var3.field983[var5].field2134 == 2) {
                        var3.field974[var5] = -5;
                    }
                    if (var3.field983[var5].field2134 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field975[var5] != null) {
                    if (var3.field975[var5].field2134 == 2) {
                        var3.field974[var5] = -6;
                    }
                    if (var3.field975[var5].field2134 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method177(arg0 + 6624, arg2);
            arg1.method95(0, true);
            int var6 = arg1.field182;
            arg1.method72((byte) 80, var3.field973);
            for (int var7 = 0; var7 < var3.field992; var7++) {
                if (var3.field974[var7] == 0) {
                    try {
                        int var8 = var3.field995[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field983[var7].field2130;
                            int var10 = var9.getInt(null);
                            arg1.method95(0, true);
                            arg1.method72((byte) -56, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field983[var7].field2130;
                            var13.setInt(null, var3.field986[var7]);
                            arg1.method95(0, true);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field983[var7].field2130;
                            int var12 = var11.getModifiers();
                            arg1.method95(0, true);
                            arg1.method72((byte) 99, var12);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field975[var7].field2130;
                            byte[][] var15 = var3.field979[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg1.method95(0, true);
                            } else if (var19 instanceof Number) {
                                arg1.method95(1, true);
                                arg1.method92(true, ((Number) var19).longValue());
                            } else if (var19 instanceof class98) {
                                arg1.method95(2, true);
                                arg1.method85((class98) var19, false);
                            } else {
                                arg1.method95(4, true);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field975[var7].field2130;
                            int var21 = var20.getModifiers();
                            arg1.method95(0, true);
                            arg1.method72((byte) -101, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method95(-10, true);
                    } catch (InvalidClassException var23) {
                        arg1.method95(-11, true);
                    } catch (StreamCorruptedException var24) {
                        arg1.method95(-12, true);
                    } catch (OptionalDataException var25) {
                        arg1.method95(-13, true);
                    } catch (IllegalAccessException var26) {
                        arg1.method95(-14, true);
                    } catch (IllegalArgumentException var27) {
                        arg1.method95(-15, true);
                    } catch (InvocationTargetException var28) {
                        arg1.method95(-16, true);
                    } catch (SecurityException var29) {
                        arg1.method95(-17, true);
                    } catch (IOException var30) {
                        arg1.method95(-18, true);
                    } catch (NullPointerException var31) {
                        arg1.method95(-19, true);
                    } catch (Exception var32) {
                        arg1.method95(-20, true);
                    } catch (Throwable var33) {
                        arg1.method95(-21, true);
                    }
                } else {
                    arg1.method95(var3.field974[var7], true);
                }
            }
            arg1.method65(var6, -67);
            arg1.method67((byte) -126, arg1.field182 - var6);
            var3.method975(-116);
        }
    }
}
