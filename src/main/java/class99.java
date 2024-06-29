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

@OriginalClass("client!di")
public class class99 extends RuntimeException {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1696;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Ljava/lang/String;")
    public String field1698;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[Lta;")
    public static class189[] field1699 = new class189[4];

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Lkk;")
    public static class62 field1708;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[[[B")
    public static byte[][][] field1700;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1705++;
        class27 var13 = new class27();
        var13.field407 = arg12;
        var13.field402 = arg7;
        var13.field409 = arg9;
        var13.field410 = arg11;
        var13.field399 = arg0;
        var13.field405 = arg2;
        if (arg10 != -14) {
            method624(-48, -77, (class30) null);
        }
        var13.field403 = arg1;
        var13.field412 = arg5;
        var13.field417 = arg8;
        var13.field406 = arg6;
        var13.field401 = arg3;
        var13.field400 = arg4;
        class66.field1104.method374(-1, var13);
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class99(Throwable arg0, String arg1) {
        this.field1696 = arg0;
        this.field1698 = arg1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILvf;)V")
    public static final void method624(int arg0, int arg1, class30 arg2) {
        if (arg0 <= 87) {
            return;
        }
        field1701++;
        while (true) {
            class281 var3 = (class281) class21.field330.method379(6347);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4477; var5++) {
                if (var3.field4467[var5] != null) {
                    if (var3.field4467[var5].field2857 == 2) {
                        var3.field4473[var5] = -5;
                    }
                    if (var3.field4467[var5].field2857 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4468[var5] != null) {
                    if (var3.field4468[var5].field2857 == 2) {
                        var3.field4473[var5] = -6;
                    }
                    if (var3.field4468[var5].field2857 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method199(arg1, -127);
            arg2.method682(0, 22555);
            int var6 = arg2.field1762;
            arg2.method698(-20, var3.field4472);
            for (int var7 = 0; var7 < var3.field4477; var7++) {
                if (var3.field4473[var7] == 0) {
                    try {
                        int var8 = var3.field4465[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4467[var7].field2859;
                            int var10 = var9.getInt((Object) null);
                            arg2.method682(0, 22555);
                            arg2.method698(119, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4467[var7].field2859;
                            var11.setInt((Object) null, var3.field4469[var7]);
                            arg2.method682(0, 22555);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field4467[var7].field2859;
                            int var13 = var12.getModifiers();
                            arg2.method682(0, 22555);
                            arg2.method698(107, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4468[var7].field2859;
                            byte[][] var17 = var3.field4475[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method682(0, 22555);
                            } else if ((var21 instanceof Number)) {
                                arg2.method682(1, 22555);
                                arg2.method640(21691, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg2.method682(2, 22555);
                                arg2.method645((String) var21, (byte) 125);
                            } else {
                                arg2.method682(4, 22555);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4468[var7].field2859;
                            int var15 = var14.getModifiers();
                            arg2.method682(0, 22555);
                            arg2.method698(-64, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method682(-10, 22555);
                    } catch (InvalidClassException var23) {
                        arg2.method682(-11, 22555);
                    } catch (StreamCorruptedException var24) {
                        arg2.method682(-12, 22555);
                    } catch (OptionalDataException var25) {
                        arg2.method682(-13, 22555);
                    } catch (IllegalAccessException var26) {
                        arg2.method682(-14, 22555);
                    } catch (IllegalArgumentException var27) {
                        arg2.method682(-15, 22555);
                    } catch (InvocationTargetException var28) {
                        arg2.method682(-16, 22555);
                    } catch (SecurityException var29) {
                        arg2.method682(-17, 22555);
                    } catch (IOException var30) {
                        arg2.method682(-18, 22555);
                    } catch (NullPointerException var31) {
                        arg2.method682(-19, 22555);
                    } catch (Exception var32) {
                        arg2.method682(-20, 22555);
                    } catch (Throwable var33) {
                        arg2.method682(-21, 22555);
                    }
                } else {
                    arg2.method682(var3.field4473[var7], 22555);
                }
            }
            arg2.method679(var6, (byte) 16);
            arg2.method661(arg2.field1762 - var6, (byte) 117);
            var3.method547(10026);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method625(int arg0) {
        if (arg0 != -9208) {
            field1699 = null;
        }
        field1708 = null;
        field1699 = null;
        field1700 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I")
    public static final int method626(int arg0, int arg1) {
        int var2 = -2 / ((arg1 - 56) / 62);
        field1707++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lga;Z)V")
    public static final void method627(class141 arg0, boolean arg1) {
        if (!arg1) {
            method629(122);
        }
        field1702++;
        for (class57 var2 = (class57) class155.field2591.method379(6347); var2 != null; var2 = (class57) class155.field2591.method378(96)) {
            if (var2.field1002 == arg0) {
                if (var2.field1001 != null) {
                    class10.field149.method259(var2.field1001);
                    var2.field1001 = null;
                }
                var2.method547(10026);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static final void method628(byte arg0) {
        field1703++;
        int var1 = -92 % ((arg0 + 38) / 59);
        for (int var2 = 0; var2 < class187.field3037; var2++) {
            int var3 = class292.field4668[var2];
            class141 var4 = class42.field625[var3];
            if (var4 != null) {
                class187.method1225(var4, 0, var4.field2421.field3537);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public static final void method629(int arg0) {
        field1706++;
        for (int var1 = 0; var1 < 5; var1++) {
            class201.field3306[var1] = false;
        }
        class154.field2572 = -1;
        class162.field2688 = -1;
        class112.field2009 = 0;
        if (arg0 == 15089) {
            class241.field3970 = 1;
            class126.field2208 = 0;
        }
    }
}
