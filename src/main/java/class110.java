import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.PrintWriter;
import java.io.StreamCorruptedException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class110 {

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field1905 = 0;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Ljj;")
    public static class134 field1898;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Ljj;")
    public static class134 field1899;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[Z")
    public static boolean[] field1901;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)V")
    public static final void method796(int arg0, byte arg1) {
        if (arg1 == 6) {
            field1906++;
            class260.field4132.method1832(arg0, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lhk;Z[I[I[I)V")
    public static final void method797(class275 arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        if (!arg1) {
            method797((class275) null, false, (int[]) null, (int[]) null, (int[]) null);
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg0.field654.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field654[var9] = null;
                    } else {
                        class21 var10 = class267.method1812((byte) 89, var6);
                        class171 var11 = arg0.field654[var9];
                        int var12 = var10.field239;
                        if (var11 != null) {
                            if (var11.field2762 == var6) {
                                if (var12 == 0) {
                                    var11 = arg0.field654[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field2759 = 1;
                                    var11.field2756 = var8;
                                    var11.field2754 = 0;
                                    var11.field2765 = 0;
                                    var11.field2767 = 0;
                                    class150.method1022(var10, (byte) -79, 0, arg0.field613, false, arg0.field614);
                                } else if (var12 == 2) {
                                    var11.field2767 = 0;
                                }
                            } else if (var10.field257 >= class267.method1812((byte) 89, var11.field2762).field257) {
                                var11 = arg0.field654[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class171 var13 = arg0.field654[var9] = new class171();
                            var13.field2762 = var6;
                            var13.field2767 = 0;
                            var13.field2759 = 1;
                            var13.field2754 = 0;
                            var13.field2756 = var8;
                            var13.field2765 = 0;
                            class150.method1022(var10, (byte) -66, 0, arg0.field613, false, arg0.field614);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field1904++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZIIILjava/lang/String;ZLjava/lang/String;IJIZ)V")
    public static final void method798(boolean arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5, String arg6, int arg7, long arg8, int arg9, boolean arg10) {
        field1903++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class264 var14 = new class264(128);
        var14.method1757(10, (byte) 105);
        var14.method1761((arg10 ? 4 : 0) | (arg0 ? 2 : 0) | (arg5 ? 1 : 0), 4334);
        var14.method1762(arg8, (byte) -117);
        var14.method1789((byte) -38, var12[0]);
        var14.method1770(arg6, (byte) 118);
        var14.method1789((byte) -38, var12[1]);
        var14.method1761(class286.field4561, 4334);
        var14.method1757(arg2, (byte) 4);
        var14.method1757(arg3, (byte) 107);
        var14.method1789((byte) -38, var12[2]);
        var14.method1761(arg9, 4334);
        var14.method1761(arg1, 4334);
        var14.method1789((byte) -38, var12[3]);
        var14.method1748(class138.field2278, (byte) 125, class257.field4111);
        class264 var15 = new class264(350);
        var15.method1770(arg4, (byte) 114);
        int var16 = 8 - (class157.method1060(arg4, -4850) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1757((int) (Math.random() * 255.0D), (byte) -23);
        }
        var15.method1734(var12, (byte) 104);
        class83.field1148.field4195 = 0;
        class83.field1148.method1757(22, (byte) 115);
        class83.field1148.method1761(var14.field4195 + var15.field4195 + 2, 4334);
        class83.field1148.method1761(543, 4334);
        class83.field1148.method1760(var14.field4198, var14.field4195, 21015, 0);
        class83.field1148.method1760(var15.field4198, var15.field4195, 21015, 0);
        class95.field1429 = 1;
        class62.field883 = 0;
        class104.field1736 = -3;
        class102.field1539 = 0;
        if (arg7 < 9) {
            method799((class178) null, -63, 124);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lfh;II)V")
    public static final void method799(class178 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1899 = null;
        }
        field1900++;
        while (true) {
            class57 var3 = (class57) class288.field4608.method365(arg1 ^ 0x3);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field805; var5++) {
                if (var3.field793[var5] != null) {
                    if (var3.field793[var5].field2271 == 2) {
                        var3.field792[var5] = -5;
                    }
                    if (var3.field793[var5].field2271 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field790[var5] != null) {
                    if (var3.field790[var5].field2271 == 2) {
                        var3.field792[var5] = -6;
                    }
                    if (var3.field790[var5].field2271 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1238(arg2, -136478397);
            arg0.method1757(0, (byte) -43);
            int var6 = arg0.field4195;
            arg0.method1789((byte) -38, var3.field801);
            for (int var7 = 0; var7 < var3.field805; var7++) {
                if (var3.field792[var7] == 0) {
                    try {
                        int var8 = var3.field798[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field793[var7].field2266;
                            int var10 = var9.getInt((Object) null);
                            arg0.method1757(0, (byte) 114);
                            arg0.method1789((byte) -38, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field793[var7].field2266;
                            var11.setInt((Object) null, var3.field800[var7]);
                            arg0.method1757(0, (byte) 116);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field793[var7].field2266;
                            int var13 = var12.getModifiers();
                            arg0.method1757(0, (byte) 108);
                            arg0.method1789((byte) -38, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field790[var7].field2266;
                            byte[][] var15 = var3.field803[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method1757(0, (byte) 119);
                            } else if ((var19 instanceof Number)) {
                                arg0.method1757(1, (byte) -31);
                                arg0.method1762(((Number) var19).longValue(), (byte) 86);
                            } else if ((var19 instanceof String)) {
                                arg0.method1757(2, (byte) -73);
                                arg0.method1770((String) var19, (byte) 109);
                            } else {
                                arg0.method1757(4, (byte) 114);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field790[var7].field2266;
                            int var21 = var20.getModifiers();
                            arg0.method1757(0, (byte) -45);
                            arg0.method1789((byte) -38, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1757(-10, (byte) -26);
                    } catch (InvalidClassException var23) {
                        arg0.method1757(-11, (byte) 116);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1757(-12, (byte) 121);
                    } catch (OptionalDataException var25) {
                        arg0.method1757(-13, (byte) -14);
                    } catch (IllegalAccessException var26) {
                        arg0.method1757(-14, (byte) 119);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1757(-15, (byte) 127);
                    } catch (InvocationTargetException var28) {
                        arg0.method1757(-16, (byte) 121);
                    } catch (SecurityException var29) {
                        arg0.method1757(-17, (byte) 109);
                    } catch (IOException var30) {
                        arg0.method1757(-18, (byte) -79);
                    } catch (NullPointerException var31) {
                        arg0.method1757(-19, (byte) 120);
                    } catch (Exception var32) {
                        arg0.method1757(-20, (byte) -38);
                    } catch (Throwable var33) {
                        arg0.method1757(-21, (byte) -101);
                    }
                } else {
                    arg0.method1757(var3.field792[var7], (byte) 114);
                }
            }
            arg0.method1745(var6, (byte) -127);
            arg0.method1775(67, arg0.field4195 - var6);
            var3.method544(108);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method800(int arg0) {
        field1901 = null;
        field1899 = null;
        field1898 = null;
        if (arg0 != 24221) {
            method797((class275) null, false, (int[]) null, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method801(Throwable arg0, int arg1) throws IOException {
        field1902++;
        String var3;
        if (arg0 instanceof class93) {
            class93 var2 = (class93) arg0;
            var3 = var2.field1323 + " | ";
            arg0 = var2.field1320;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != 26053) {
            method796(-39, (byte) 77);
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }
}
