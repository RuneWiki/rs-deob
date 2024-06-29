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

@OriginalClass("client!ik")
public class class225 extends class90 {

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public int field3363 = 12800;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public int field3371 = 0;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public int field3378 = 0;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public int field3374 = -1;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public int field3379 = -1;

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "Z")
    public boolean field3384 = true;

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "I")
    public int field3386 = 12800;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "Ljava/lang/String;")
    public String field3375;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "Ljava/lang/String;")
    public String field3381;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "Lag;")
    public class97 field3368;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "Z")
    public static boolean field3370 = false;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "Lqd;")
    public static class37 field3382 = new class37(64);

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "Lag;")
    public static class97 field3385 = new class97();

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!ik", name = "db", descriptor = "Lve;")
    public static class233 field3388;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "Lcg;")
    public static class36 field3377;

    @OriginalMember(owner = "client!ik", name = "cb", descriptor = "[[[B")
    public static byte[][][] field3387;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static final void method1466(byte arg0) {
        field3365++;
        class68.field1071.method521(arg0 ^ 0xFFFFFF9B);
        int var1 = class68.field1071.method531((byte) -127, 8);
        if (var1 < class51.field756) {
            for (int var2 = var1; var2 < class51.field756; var2++) {
                class193.field2758[class153.field2230++] = class67.field1049[var2];
            }
        }
        if (var1 > class51.field756) {
            throw new RuntimeException("gnpov1");
        }
        class51.field756 = 0;
        int var3 = 0;
        if (arg0 != 3) {
            field3383 = -78;
        }
        while (var3 < var1) {
            int var4 = class67.field1049[var3];
            class72 var5 = class82.field1268[var4];
            int var6 = class68.field1071.method531((byte) -125, 1);
            if (var6 == 0) {
                class67.field1049[class51.field756++] = var4;
                var5.field85 = class82.field1267;
            } else {
                int var7 = class68.field1071.method531((byte) 37, 2);
                if (var7 == 0) {
                    class67.field1049[class51.field756++] = var4;
                    var5.field85 = class82.field1267;
                    class60.field909[class282.field4501++] = var4;
                } else if (var7 == 1) {
                    class67.field1049[class51.field756++] = var4;
                    var5.field85 = class82.field1267;
                    int var8 = class68.field1071.method531((byte) 125, 3);
                    var5.method68(var8, 1, true);
                    int var9 = class68.field1071.method531((byte) -128, 1);
                    if (var9 == 1) {
                        class60.field909[class282.field4501++] = var4;
                    }
                } else if (var7 == 2) {
                    class67.field1049[class51.field756++] = var4;
                    var5.field85 = class82.field1267;
                    if (class68.field1071.method531((byte) 34, 1) == 1) {
                        int var10 = class68.field1071.method531((byte) -29, 3);
                        var5.method68(var10, 2, true);
                        int var11 = class68.field1071.method531((byte) -125, 3);
                        var5.method68(var11, 2, true);
                    } else {
                        int var12 = class68.field1071.method531((byte) 35, 3);
                        var5.method68(var12, 0, true);
                    }
                    int var13 = class68.field1071.method531((byte) -127, 1);
                    if (var13 == 1) {
                        class60.field909[class282.field4501++] = var4;
                    }
                } else if (var7 == 3) {
                    class193.field2758[class153.field2230++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(CI)Z")
    public static final boolean method1467(char arg0, int arg1) {
        field3376++;
        if (arg1 != 48) {
            method1466((byte) 26);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILhe;I)V")
    public static final void method1468(int arg0, class79 arg1, int arg2) {
        field3372++;
        int var3 = 110 % ((-arg0 - 66) / 34);
        while (true) {
            class145 var4 = (class145) class98.field1474.method656(109);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field2072; var6++) {
                if (var4.field2087[var6] != null) {
                    if (var4.field2087[var6].field3588 == 2) {
                        var4.field2084[var6] = -5;
                    }
                    if (var4.field2087[var6].field3588 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field2075[var6] != null) {
                    if (var4.field2075[var6].field3588 == 2) {
                        var4.field2084[var6] = -6;
                    }
                    if (var4.field2075[var6].field3588 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg1.method522(arg2, 28727);
            arg1.method775(0, -125);
            int var7 = arg1.field1673;
            arg1.method737(-2645, var4.field2071);
            for (int var8 = 0; var8 < var4.field2072; var8++) {
                if (var4.field2084[var8] == 0) {
                    try {
                        int var9 = var4.field2086[var8];
                        if (var9 == 0) {
                            Field var10 = (Field) var4.field2087[var8].field3585;
                            int var11 = var10.getInt((Object) null);
                            arg1.method775(0, -120);
                            arg1.method737(-2645, var11);
                        } else if (var9 == 1) {
                            Field var14 = (Field) var4.field2087[var8].field3585;
                            var14.setInt((Object) null, var4.field2085[var8]);
                            arg1.method775(0, -126);
                        } else if (var9 == 2) {
                            Field var12 = (Field) var4.field2087[var8].field3585;
                            int var13 = var12.getModifiers();
                            arg1.method775(0, -115);
                            arg1.method737(-2645, var13);
                        }
                        if (var9 == 3) {
                            byte[][] var15 = var4.field2073[var8];
                            Method var16 = (Method) var4.field2075[var8].field3585;
                            Object[] var17 = new Object[var15.length];
                            for (int var18 = 0; var18 < var15.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var15[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var16.invoke((Object) null, var17);
                            if (var20 == null) {
                                arg1.method775(0, -115);
                            } else if (var20 instanceof Number) {
                                arg1.method775(1, -118);
                                arg1.method765(532401312, ((Number) var20).longValue());
                            } else if (var20 instanceof String) {
                                arg1.method775(2, -115);
                                arg1.method734((byte) -128, (String) var20);
                            } else {
                                arg1.method775(4, -117);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field2075[var8].field3585;
                            int var22 = var21.getModifiers();
                            arg1.method775(0, -113);
                            arg1.method737(-2645, var22);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg1.method775(-10, -123);
                    } catch (InvalidClassException var24) {
                        arg1.method775(-11, -128);
                    } catch (StreamCorruptedException var25) {
                        arg1.method775(-12, -116);
                    } catch (OptionalDataException var26) {
                        arg1.method775(-13, -121);
                    } catch (IllegalAccessException var27) {
                        arg1.method775(-14, -112);
                    } catch (IllegalArgumentException var28) {
                        arg1.method775(-15, -128);
                    } catch (InvocationTargetException var29) {
                        arg1.method775(-16, -115);
                    } catch (SecurityException var30) {
                        arg1.method775(-17, -125);
                    } catch (IOException var31) {
                        arg1.method775(-18, -121);
                    } catch (NullPointerException var32) {
                        arg1.method775(-19, -114);
                    } catch (Exception var33) {
                        arg1.method775(-20, -123);
                    } catch (Throwable var34) {
                        arg1.method775(-21, -112);
                    }
                } else {
                    arg1.method775(var4.field2084[var8], -116);
                }
            }
            arg1.method749((byte) 126, var7);
            arg1.method743(arg1.field1673 - var7, (byte) 36);
            var4.method1706(-96);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    public static void method1469(byte arg0) {
        field3388 = null;
        field3387 = null;
        field3385 = null;
        if (arg0 != 24) {
            field3388 = null;
        }
        field3377 = null;
        field3382 = null;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V")
    public final void method1470(byte arg0) {
        field3367++;
        this.field3386 = 12800;
        this.field3363 = 12800;
        this.field3378 = 0;
        this.field3371 = 0;
        class152 var2 = (class152) this.field3368.method656(96);
        int var3 = -91 / ((arg0 - 36) / 38);
        while (var2 != null) {
            if (this.field3378 < var2.field2192) {
                this.field3378 = var2.field2192;
            }
            if (this.field3363 > var2.field2190) {
                this.field3363 = var2.field2190;
            }
            if (var2.field2197 < this.field3386) {
                this.field3386 = var2.field2197;
            }
            if (this.field3371 < var2.field2187) {
                this.field3371 = var2.field2187;
            }
            var2 = (class152) this.field3368.method650(126);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(III)Z")
    public final boolean method1471(int arg0, int arg1, int arg2) {
        if (arg2 != -6) {
            method1469((byte) 111);
        }
        field3380++;
        if (this.field3386 > arg0 || arg0 > this.field3371 || this.field3363 > arg1 || this.field3378 < arg1) {
            return false;
        }
        for (class152 var4 = (class152) this.field3368.method656(102); var4 != null; var4 = (class152) this.field3368.method650(126)) {
            if (var4.method1029(arg0, arg1, -4)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBIII)V")
    public static final void method1472(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3366++;
        int var6 = arg5 - arg4;
        int var7 = arg3 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class79.method530(arg0, arg5, arg1, arg4, false);
            }
        } else if (var6 == 0) {
            class75.method503(arg0, arg3, arg1, arg4, (byte) 100);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg3;
                int var10 = arg0;
                arg0 = arg4;
                arg3 = arg5;
                arg5 = var9;
                arg4 = var10;
            }
            if (arg3 < arg0) {
                int var11 = arg0;
                arg0 = arg3;
                int var12 = arg4;
                arg4 = arg5;
                arg3 = var11;
                arg5 = var12;
            }
            int var13 = arg3 - arg0;
            if (arg2 >= 4) {
                int var14 = arg4;
                int var15 = arg5 - arg4;
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var16 = -(var13 >> 1);
                int var17 = arg5 > arg4 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg0; var18 <= arg3; var18++) {
                        var16 += var15;
                        class163.field2370[var18][var14] = arg1;
                        if (var16 > 0) {
                            var14 += var17;
                            var16 -= var13;
                        }
                    }
                } else {
                    for (int var19 = arg0; var19 <= arg3; var19++) {
                        var16 += var15;
                        class163.field2370[var14][var19] = arg1;
                        if (var16 > 0) {
                            var16 -= var13;
                            var14 += var17;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
    public static final void method1473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class270 var5 = class190.method1213(25702, arg0, arg4);
        field3373++;
        var5.method1808((byte) 62);
        var5.field4226 = arg2;
        var5.field4230 = arg1;
        var5.field4233 = arg3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIZI)V")
    public class225(String arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3364 = arg2;
        this.field3379 = arg6;
        this.field3375 = arg1;
        if (this.field3379 == 255) {
            this.field3379 = 0;
        }
        this.field3381 = arg0;
        this.field3369 = arg3;
        this.field3384 = arg5;
        this.field3374 = arg4;
        this.field3368 = new class97();
    }
}
