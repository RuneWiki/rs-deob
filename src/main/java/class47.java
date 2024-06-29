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

@OriginalClass("client!rf")
public class class47 {

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public int field680 = -1;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
    public static int[] field678 = new int[1000];

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lrh;")
    public static class17 field681 = new class17();

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lue;")
    public static class222 field682 = new class222(16);

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Llm;")
    public static class150 field683 = new class150(64);

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field685 = 0;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Laa;")
    public class43 field674;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
    public int[] field676;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field679;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLjm;I)V")
    public static final void method292(byte arg0, class126 arg1, int arg2) {
        field675++;
        if (arg0 != -76) {
            method294(48);
        }
        while (true) {
            class103 var3 = (class103) class112.field1604.method369((byte) -77);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1479; var5++) {
                if (var3.field1473[var5] != null) {
                    if (var3.field1473[var5].field4570 == 2) {
                        var3.field1484[var5] = -5;
                    }
                    if (var3.field1473[var5].field4570 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1472[var5] != null) {
                    if (var3.field1472[var5].field4570 == 2) {
                        var3.field1484[var5] = -6;
                    }
                    if (var3.field1472[var5].field4570 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method809(arg2, 0);
            arg1.method1363(0, -74);
            int var6 = arg1.field3280;
            arg1.method1398(true, var3.field1478);
            for (int var7 = 0; var7 < var3.field1479; var7++) {
                if (var3.field1484[var7] == 0) {
                    try {
                        int var8 = var3.field1486[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1473[var7].field4567;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1363(0, 111);
                            arg1.method1398(true, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1473[var7].field4567;
                            var11.setInt((Object) null, var3.field1489[var7]);
                            arg1.method1363(0, 126);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field1473[var7].field4567;
                            int var13 = var12.getModifiers();
                            arg1.method1363(0, 125);
                            arg1.method1398(true, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1472[var7].field4567;
                            byte[][] var15 = var3.field1481[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method1363(0, 104);
                            } else if (var19 instanceof Number) {
                                arg1.method1363(1, -58);
                                arg1.method1386(((Number) var19).longValue(), true);
                            } else if (var19 instanceof String) {
                                arg1.method1363(2, -16);
                                arg1.method1384((String) var19, -595448376);
                            } else {
                                arg1.method1363(4, 106);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1472[var7].field4567;
                            int var21 = var20.getModifiers();
                            arg1.method1363(0, arg0 ^ 0x7);
                            arg1.method1398(true, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1363(-10, 124);
                    } catch (InvalidClassException var23) {
                        arg1.method1363(-11, -27);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1363(-12, -71);
                    } catch (OptionalDataException var25) {
                        arg1.method1363(-13, 127);
                    } catch (IllegalAccessException var26) {
                        arg1.method1363(-14, -112);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1363(-15, arg0 + 30);
                    } catch (InvocationTargetException var28) {
                        arg1.method1363(-16, 127);
                    } catch (SecurityException var29) {
                        arg1.method1363(-17, arg0 - 50);
                    } catch (IOException var30) {
                        arg1.method1363(-18, 120);
                    } catch (NullPointerException var31) {
                        arg1.method1363(-19, 95);
                    } catch (Exception var32) {
                        arg1.method1363(-20, -31);
                    } catch (Throwable var33) {
                        arg1.method1363(-21, 116);
                    }
                } else {
                    arg1.method1363(var3.field1484[var7], -112);
                }
            }
            arg1.method1370(3764, var6);
            arg1.method1404(-1, arg1.field3280 - var6);
            var3.method962(128);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static final void method293(int arg0) {
        if (class142.field1961 == 30) {
            class82.method519(-120, 25);
        }
        if (arg0 != 0) {
            field684 = 44;
        }
        field677++;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public static void method294(int arg0) {
        field683 = null;
        field681 = null;
        if (arg0 != 31041) {
            field684 = 23;
        }
        field678 = null;
        field682 = null;
    }
}
