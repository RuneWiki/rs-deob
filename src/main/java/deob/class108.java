package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ObfuscatedName("de")
public class class108 {

    @ObfuscatedName("de.t")
    public static class104 field1504 = new class104();

    public class108() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.t(I)V")
    public static void method881() {
        field1504 = new class104();
    }

    @ObfuscatedName("cj.n(Ler;IS)V")
    public static void method983(class150 arg0, int arg1) {
        while (true) {
            class144 var2 = (class144) field1504.method1305();
            if (var2 == null) {
                return;
            }
            arg0.method2288(arg1);
            arg0.method1558(0);
            int var3 = arg0.field1722;
            arg0.method1561(var2.field1901);
            for (int var4 = 0; var4 < var2.field1900; var4++) {
                if (var2.field1903[var4] == 0) {
                    try {
                        int var5 = var2.field1906[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field1902[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method1558(0);
                            arg0.method1561(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field1902[var4];
                            var8.setInt((Object) null, var2.field1904[var4]);
                            arg0.method1558(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field1902[var4];
                            int var10 = var9.getModifiers();
                            arg0.method1558(0);
                            arg0.method1561(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field1905[var4];
                            byte[][] var12 = var2.field1899[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method1558(0);
                            } else if (var16 instanceof Number) {
                                arg0.method1558(1);
                                arg0.method1597(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method1558(2);
                                arg0.method1563((String) var16);
                            } else {
                                arg0.method1558(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field1905[var4];
                            int var18 = var17.getModifiers();
                            arg0.method1558(0);
                            arg0.method1561(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method1558(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method1558(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method1558(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method1558(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method1558(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method1558(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method1558(-16);
                    } catch (SecurityException var38) {
                        arg0.method1558(-17);
                    } catch (IOException var39) {
                        arg0.method1558(-18);
                    } catch (NullPointerException var40) {
                        arg0.method1558(-19);
                    } catch (Exception var41) {
                        arg0.method1558(-20);
                    } catch (Throwable var42) {
                        arg0.method1558(-21);
                    }
                } else {
                    arg0.method1558(var2.field1903[var4]);
                }
            }
            arg0.method1590(var3);
            arg0.method1568(arg0.field1722 - var3);
            var2.method1307();
        }
    }
}
