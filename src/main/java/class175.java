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

@OriginalClass("client!hf")
public class class175 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2370 = "Unable to find ";

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 3)
    public static void method1161(int arg0) {
        if (arg0 != 339) {
            method1164((char) 65524, -43);
        }
        field2370 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 15)
    private static final void method1162(int arg0, int arg1) {
        class238.field3346.method379(arg0, false);
        if (arg1 == 25873) {
            field2369++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 31)
    public static final void method1163(byte arg0) {
        method1162(5, 25873);
        field2368++;
        class134.method958(1, 5);
        class171.method1145(arg0 - 10888, 5);
        class97.method765(5, 1);
        class400.method2568(5, -1);
        class289.method1965(5, 0);
        class228.method1490(true, 5);
        class228.method1482(5, 0);
        class353.method2326(5, (byte) -127);
        class216.method1428(true, 5);
        class335.method2189(89, 5);
        class194.method1290(5, arg0 + 23169);
        class157.method1046(5, -2);
        class208.method1364(5, 6789);
        class303.method2035(5, arg0 - 1557319952);
        class157.method1047(1, 5);
        class139.method973(arg0 ^ 0xFFFFFFA0, 5);
        class387.method2507(5, 65535);
        class329.method2156(5, (byte) -57);
        class58.method423(5, -23892);
        class283.method1939(50, 3);
        class24.method217((byte) 112, 5);
        class444.method2769(5, 2050372865);
        class66.field981.method379(5, false);
        class235.field3278.method379(5, false);
        if (arg0 != -36) {
            field2372 = -84;
        }
        class278.field4074.method379(5, false);
        class258.field3801.method379(5, false);
        class293.field4436.method379(5, false);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(CI)C", line = 72)
    public static final char method1164(char arg0, int arg1) {
        field2373++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else if (arg1 == 0) {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        } else {
            return (char) 65442;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILni;)V", line = 102)
    public static final void method1165(int arg0, int arg1, class279 arg2) {
        field2371++;
        if (arg0 <= 23) {
            field2372 = -54;
        }
        while (true) {
            class388 var3 = (class388) class176.field2376.method1575(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field5683; var5++) {
                if (var3.field5671[var5] != null) {
                    if (var3.field5671[var5].field3104 == 2) {
                        var3.field5679[var5] = -5;
                    }
                    if (var3.field5671[var5].field3104 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field5682[var5] != null) {
                    if (var3.field5682[var5].field3104 == 2) {
                        var3.field5679[var5] = -6;
                    }
                    if (var3.field5682[var5].field3104 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1833(-20379, arg1);
            arg2.method2204(0, 8);
            int var6 = arg2.field5049;
            arg2.method2240((byte) -88, var3.field5672);
            for (int var7 = 0; var7 < var3.field5683; var7++) {
                if (var3.field5679[var7] == 0) {
                    try {
                        int var8 = var3.field5684[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field5671[var7].field3105;
                            int var13 = var12.getInt((Object) null);
                            arg2.method2204(0, 8);
                            arg2.method2240((byte) -88, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field5671[var7].field3105;
                            var9.setInt((Object) null, var3.field5680[var7]);
                            arg2.method2204(0, 8);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field5671[var7].field3105;
                            int var11 = var10.getModifiers();
                            arg2.method2204(0, 8);
                            arg2.method2240((byte) -88, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field5682[var7].field3105;
                            byte[][] var17 = var3.field5676[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method2204(0, 8);
                            } else if ((var21 instanceof Number)) {
                                arg2.method2204(1, 8);
                                arg2.method2258(25445, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg2.method2204(2, 8);
                                arg2.method2214((String) var21, -87);
                            } else {
                                arg2.method2204(4, 8);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field5682[var7].field3105;
                            int var15 = var14.getModifiers();
                            arg2.method2204(0, 8);
                            arg2.method2240((byte) -88, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method2204(-10, 8);
                    } catch (InvalidClassException var23) {
                        arg2.method2204(-11, 8);
                    } catch (StreamCorruptedException var24) {
                        arg2.method2204(-12, 8);
                    } catch (OptionalDataException var25) {
                        arg2.method2204(-13, 8);
                    } catch (IllegalAccessException var26) {
                        arg2.method2204(-14, 8);
                    } catch (IllegalArgumentException var27) {
                        arg2.method2204(-15, 8);
                    } catch (InvocationTargetException var28) {
                        arg2.method2204(-16, 8);
                    } catch (SecurityException var29) {
                        arg2.method2204(-17, 8);
                    } catch (IOException var30) {
                        arg2.method2204(-18, 8);
                    } catch (NullPointerException var31) {
                        arg2.method2204(-19, 8);
                    } catch (Exception var32) {
                        arg2.method2204(-20, 8);
                    } catch (Throwable var33) {
                        arg2.method2204(-21, 8);
                    }
                } else {
                    arg2.method2204(var3.field5679[var7], 8);
                }
            }
            arg2.method2208(117, var6);
            arg2.method2251(arg2.field5049 - var6, (byte) -61);
            var3.method2632(true);
        }
    }
}
