import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class115 {

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2013 = 1;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2014 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Lce;")
    public static class10 field2018 = null;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "[S")
    public static short[] field2019 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[[[B")
    public static byte[][][] field2016;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static final void method826(int arg0) {
        if (arg0 < 76) {
            field2017 = -65;
        }
        client.field1524.method763(0);
        class188.field3107.method763(0);
        field2012++;
        class20.field416.method763(0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BII)V")
    public static final void method827(byte arg0, int arg1, int arg2) {
        field2010++;
        int var3 = -70 / ((arg0 + 59) / 56);
        if (class211.field3514 != arg1) {
            class129.field2272 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class129.field2272[var4] = (var4 << 12) / arg1;
            }
            class161.field2765 = arg1 - 1;
            class117.field2066 = arg1 == 64 ? 2048 : 4096;
            class211.field3514 = arg1;
        }
        if (class220.field3690 == arg2) {
            return;
        }
        if (class211.field3514 == arg2) {
            class29.field616 = class129.field2272;
        } else {
            class29.field616 = new int[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                class29.field616[var5] = (var5 << 12) / arg2;
            }
        }
        class108.field1928 = arg2 - 1;
        class220.field3690 = arg2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILag;B)V")
    public static final void method828(int arg0, class235 arg1, byte arg2) {
        int var3 = 14 / ((arg2 + 19) / 41);
        field2011++;
        while (true) {
            class125 var4 = (class125) class127.field2222.method689(1001);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field2183; var6++) {
                if (var4.field2191[var6] != null) {
                    if (var4.field2191[var6].field133 == 2) {
                        var4.field2196[var6] = -5;
                    }
                    if (var4.field2191[var6].field133 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field2189[var6] != null) {
                    if (var4.field2189[var6].field133 == 2) {
                        var4.field2196[var6] = -6;
                    }
                    if (var4.field2189[var6].field133 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg1.method1598((byte) -97, arg0);
            arg1.method1471(0, (byte) 24);
            int var7 = arg1.field3581;
            arg1.method1446(-32, var4.field2202);
            for (int var8 = 0; var8 < var4.field2183; var8++) {
                if (var4.field2196[var8] == 0) {
                    try {
                        int var9 = var4.field2195[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field2191[var8].field132;
                            int var14 = var13.getInt((Object) null);
                            arg1.method1471(0, (byte) 24);
                            arg1.method1446(127, var14);
                        } else if (var9 == 1) {
                            Field var10 = (Field) var4.field2191[var8].field132;
                            var10.setInt((Object) null, var4.field2194[var8]);
                            arg1.method1471(0, (byte) 24);
                        } else if (var9 == 2) {
                            Field var11 = (Field) var4.field2191[var8].field132;
                            int var12 = var11.getModifiers();
                            arg1.method1471(0, (byte) 24);
                            arg1.method1446(116, var12);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field2189[var8].field132;
                            byte[][] var16 = var4.field2201[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 == null) {
                                arg1.method1471(0, (byte) 24);
                            } else if ((var20 instanceof Number)) {
                                arg1.method1471(1, (byte) 24);
                                arg1.method1464(((Number) var20).longValue(), 867341416);
                            } else if ((var20 instanceof class50)) {
                                arg1.method1471(2, (byte) 24);
                                arg1.method1482((class50) var20, -29586);
                            } else {
                                arg1.method1471(4, (byte) 24);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field2189[var8].field132;
                            int var22 = var21.getModifiers();
                            arg1.method1471(0, (byte) 24);
                            arg1.method1446(4, var22);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg1.method1471(-10, (byte) 24);
                    } catch (InvalidClassException var24) {
                        arg1.method1471(-11, (byte) 24);
                    } catch (StreamCorruptedException var25) {
                        arg1.method1471(-12, (byte) 24);
                    } catch (OptionalDataException var26) {
                        arg1.method1471(-13, (byte) 24);
                    } catch (IllegalAccessException var27) {
                        arg1.method1471(-14, (byte) 24);
                    } catch (IllegalArgumentException var28) {
                        arg1.method1471(-15, (byte) 24);
                    } catch (InvocationTargetException var29) {
                        arg1.method1471(-16, (byte) 24);
                    } catch (SecurityException var30) {
                        arg1.method1471(-17, (byte) 24);
                    } catch (IOException var31) {
                        arg1.method1471(-18, (byte) 24);
                    } catch (NullPointerException var32) {
                        arg1.method1471(-19, (byte) 24);
                    } catch (Exception var33) {
                        arg1.method1471(-20, (byte) 24);
                    } catch (Throwable var34) {
                        arg1.method1471(-21, (byte) 24);
                    }
                } else {
                    arg1.method1471(var4.field2196[var8], (byte) 24);
                }
            }
            arg1.method1439(var7, (byte) 101);
            arg1.method1458(arg1.field3581 - var7, -1);
            var4.method267(119);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public static void method829(int arg0) {
        if (arg0 > 104) {
            field2018 = null;
            field2014 = null;
            field2019 = null;
            field2016 = null;
        }
    }
}
