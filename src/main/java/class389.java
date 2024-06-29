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

@OriginalClass("client!bl")
public abstract class class389 {

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public int field5582;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public int field5592;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Lec;")
    public static class129 field5584 = new class129(512);

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field5591 = 0;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[I")
    public static int[] field5580;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "[I")
    public static int[] field5587;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V", line = 3)
    public static final void method2461(int arg0, int arg1) {
        field5588++;
        class286.field4032.method901(arg1, 12223);
        class376.field5368.method901(arg1, 12223);
        if (arg0 != -1860768891) {
            field5584 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V", line = 22)
    public static final void method2462(int arg0, int arg1) {
        class377.field5396 = 100;
        class352.field4820 = arg0;
        field5581++;
        class223.field3122 = -1;
        if (arg1 != -23063) {
            method2464(73, (byte) 52, (class181) null);
        }
        class222.field3105 = 3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 37)
    public static void method2463(boolean arg0) {
        field5584 = null;
        field5580 = null;
        if (arg0) {
            field5587 = null;
        }
        field5587 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBLjs;)V", line = 50)
    public static final void method2464(int arg0, byte arg1, class181 arg2) {
        if (arg1 != 72) {
            field5591 = 73;
        }
        field5586++;
        while (true) {
            class1 var3 = (class1) class432.field6110.method646(arg1 ^ 0x78);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field5; var5++) {
                if (var3.field8[var5] != null) {
                    if (var3.field8[var5].field3998 == 2) {
                        var3.field17[var5] = -5;
                    }
                    if (var3.field8[var5].field3998 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field16[var5] != null) {
                    if (var3.field16[var5].field3998 == 2) {
                        var3.field17[var5] = -6;
                    }
                    if (var3.field16[var5].field3998 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1178(63, arg0);
            arg2.method173(0, 255);
            int var6 = arg2.field191;
            arg2.method155(15489, var3.field3);
            for (int var7 = 0; var7 < var3.field5; var7++) {
                if (var3.field17[var7] == 0) {
                    try {
                        int var8 = var3.field2[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field8[var7].field3999;
                            int var13 = var12.getInt((Object) null);
                            arg2.method173(0, 255);
                            arg2.method155(arg1 ^ 0x3CC9, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field8[var7].field3999;
                            var9.setInt((Object) null, var3.field6[var7]);
                            arg2.method173(0, arg1 + 183);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field8[var7].field3999;
                            int var11 = var10.getModifiers();
                            arg2.method173(0, 255);
                            arg2.method155(15489, var11);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field16[var7].field3999;
                            byte[][] var15 = var3.field18[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method173(0, 255);
                            } else if ((var19 instanceof Number)) {
                                arg2.method173(1, 255);
                                arg2.method165(((Number) var19).longValue(), (byte) 16);
                            } else if ((var19 instanceof String)) {
                                arg2.method173(2, 255);
                                arg2.method160((String) var19, false);
                            } else {
                                arg2.method173(4, 255);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field16[var7].field3999;
                            int var21 = var20.getModifiers();
                            arg2.method173(0, 255);
                            arg2.method155(15489, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method173(-10, 255);
                    } catch (InvalidClassException var23) {
                        arg2.method173(-11, 255);
                    } catch (StreamCorruptedException var24) {
                        arg2.method173(-12, 255);
                    } catch (OptionalDataException var25) {
                        arg2.method173(-13, 255);
                    } catch (IllegalAccessException var26) {
                        arg2.method173(-14, 255);
                    } catch (IllegalArgumentException var27) {
                        arg2.method173(-15, 255);
                    } catch (InvocationTargetException var28) {
                        arg2.method173(-16, 255);
                    } catch (SecurityException var29) {
                        arg2.method173(-17, arg1 + 183);
                    } catch (IOException var30) {
                        arg2.method173(-18, 255);
                    } catch (NullPointerException var31) {
                        arg2.method173(-19, arg1 + 183);
                    } catch (Exception var32) {
                        arg2.method173(-20, 255);
                    } catch (Throwable var33) {
                        arg2.method173(-21, 255);
                    }
                } else {
                    arg2.method173(var3.field17[var7], 255);
                }
            }
            arg2.method163(var6, arg1 - 70);
            arg2.method170((byte) -9, arg2.field191 - var6);
            var3.method2467((byte) -105);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 241)
    public static final long method2465(String arg0, int arg1) {
        field5583++;
        int var2 = arg0.length();
        long var3 = 0L;
        int var5 = 0;
        int var6 = 37 / ((29 - arg1) / 36);
        while (var2 > var5) {
            var3 = (var3 << 5) + (((long) arg0.charAt(var5)) - var3);
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 265)
    public static final void method2466(byte arg0) {
        if (class156.field2207 != null) {
            class156.field2207.method2210(-2);
            class156.field2207 = null;
        }
        field5590++;
        client.method1095(false);
        class291.method1884();
        for (int var1 = 0; var1 < 4; var1++) {
            class426.field5999[var1].method532((byte) -95);
        }
        class18.method251((byte) 101, false);
        System.gc();
        class187.method1210((byte) -109, 2);
        class434.field6125 = -1;
        class429.field6078 = false;
        class76.method564(true, -23445);
        class316.field4320 = 0;
        class243.field3452 = false;
        class212.field2968 = 0;
        class218.field3021 = 0;
        class447.field6269 = 0;
        for (int var2 = 0; var2 < class131.field1864.length; var2++) {
            class131.field1864[var2] = null;
        }
        class125.field1758 = 0;
        class26.field467 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class381.field5447[var3] = null;
            class414.field5864[var3] = null;
        }
        if (arg0 != 111) {
            return;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class98.field1358[var4] = null;
        }
        class367.field5182.method888(-12);
        class83.method605(arg0 ^ 0xFFFFFFC1);
        class254.field3573 = 0;
        class14.method229((byte) -104);
        class12.method216((byte) 93);
        class345.method2186((byte) -93);
        class19.method273(true, true);
        try {
            class262.method1715("loggedout", class241.field3426.field4121, (byte) -112);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(III)V", line = 347)
    public class389(int arg0, int arg1, int arg2) {
        this.field5589 = arg0;
        this.field5582 = arg1;
        this.field5592 = arg2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
    public abstract void method552(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZI)V")
    public abstract void method554(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V")
    public abstract void method553(int arg0, int arg1, int arg2);
}
