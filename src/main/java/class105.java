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

@OriginalClass("client!jh")
public class class105 extends class213 {

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
    public int field1950 = -1;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public int field1944 = -1;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
    public int field1952 = 0;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "Z")
    public boolean field1951 = true;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lvd;")
    public static class222 field1939 = class212.method1357("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 10731);

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "Lvd;")
    public static class222 field1936 = class212.method1357("<)4col> x", 10731);

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "Lvd;")
    private static class222 field1945 = class212.method1357("Drop", 10731);

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "Lvd;")
    public static class222 field1943 = class212.method1357("da dieser Computer gegen unsere ", 10731);

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "Lvd;")
    public static class222 field1949 = class212.method1357("Hier wechseln", 10731);

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "Lvd;")
    public static class222 field1937 = field1945;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "Lvd;")
    public static class222 field1948 = class212.method1357(" x ", 10731);

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    public static int field1947 = 0;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "Lud;")
    public static class212 field1938;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lka;III)V")
    private final void method642(class109 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field1952 = class27.method229(arg0.method701(869322848), arg2 ^ 0xF4EE7AEF);
        } else if (arg1 == 2) {
            this.field1950 = arg0.method662((byte) -111);
        } else if (arg1 == 3) {
            this.field1950 = arg0.method675(arg2 ^ 0xFFFD);
            if (this.field1950 == 65535) {
                this.field1950 = -1;
            }
        } else if (arg1 == 5) {
            this.field1951 = false;
        } else if (arg1 == 7) {
            this.field1944 = class27.method229(arg0.method701(869322848), -185694960);
        } else if (arg1 == 8) {
            class56.field1063 = arg3;
        } else if (arg1 == 9) {
            arg0.method675(2);
        }
        if (arg2 != 65535) {
            field1936 = null;
        }
        field1941++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLuc;I)V")
    public static final void method643(byte arg0, class211 arg1, int arg2) {
        field1946++;
        if (arg0 < 4) {
            field1948 = null;
        }
        while (true) {
            class237 var3 = (class237) class118.field2244.method236(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4419; var5++) {
                if (var3.field4409[var5] != null) {
                    if (var3.field4409[var5].field2716 == 2) {
                        var3.field4422[var5] = -5;
                    }
                    if (var3.field4409[var5].field2716 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4410[var5] != null) {
                    if (var3.field4410[var5].field2716 == 2) {
                        var3.field4422[var5] = -6;
                    }
                    if (var3.field4410[var5].field2716 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1347((byte) -65, arg2);
            arg1.method676(0, (byte) -3);
            int var6 = arg1.field2053;
            arg1.method684(var3.field4417, 72);
            for (int var7 = 0; var7 < var3.field4419; var7++) {
                if (var3.field4422[var7] == 0) {
                    try {
                        int var8 = var3.field4416[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field4409[var7].field2714;
                            int var13 = var12.getInt(null);
                            arg1.method676(0, (byte) -3);
                            arg1.method684(var13, 119);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4409[var7].field2714;
                            var11.setInt(null, var3.field4414[var7]);
                            arg1.method676(0, (byte) -3);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field4409[var7].field2714;
                            int var10 = var9.getModifiers();
                            arg1.method676(0, (byte) -3);
                            arg1.method684(var10, 62);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4410[var7].field2714;
                            byte[][] var17 = var3.field4412[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method676(0, (byte) -3);
                            } else if (var21 instanceof Number) {
                                arg1.method676(1, (byte) -3);
                                arg1.method668(((Number) var21).longValue(), 8);
                            } else if (var21 instanceof class222) {
                                arg1.method676(2, (byte) -3);
                                arg1.method670((class222) var21, (byte) -113);
                            } else {
                                arg1.method676(4, (byte) -3);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4410[var7].field2714;
                            int var15 = var14.getModifiers();
                            arg1.method676(0, (byte) -3);
                            arg1.method684(var15, 84);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method676(-10, (byte) -3);
                    } catch (InvalidClassException var23) {
                        arg1.method676(-11, (byte) -3);
                    } catch (StreamCorruptedException var24) {
                        arg1.method676(-12, (byte) -3);
                    } catch (OptionalDataException var25) {
                        arg1.method676(-13, (byte) -3);
                    } catch (IllegalAccessException var26) {
                        arg1.method676(-14, (byte) -3);
                    } catch (IllegalArgumentException var27) {
                        arg1.method676(-15, (byte) -3);
                    } catch (InvocationTargetException var28) {
                        arg1.method676(-16, (byte) -3);
                    } catch (SecurityException var29) {
                        arg1.method676(-17, (byte) -3);
                    } catch (IOException var30) {
                        arg1.method676(-18, (byte) -3);
                    } catch (NullPointerException var31) {
                        arg1.method676(-19, (byte) -3);
                    } catch (Exception var32) {
                        arg1.method676(-20, (byte) -3);
                    } catch (Throwable var33) {
                        arg1.method676(-21, (byte) -3);
                    }
                } else {
                    arg1.method676(var3.field4422[var7], (byte) -3);
                }
            }
            arg1.method692((byte) 64, var6);
            arg1.method694(arg1.field2053 - var6, 32);
            var3.method826(-22101);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lvd;Lka;I)I")
    public static final int method644(class222 arg0, class109 arg1, int arg2) {
        int var3 = arg1.field2053;
        field1940++;
        arg1.method693(-88, arg0.field4121);
        arg1.field2053 += class27.field602.method634(arg1.field2006, (byte) -11, arg0.field4121, arg1.field2053, arg0.field4163, arg2);
        return arg1.field2053 - var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILka;I)V")
    public final void method645(int arg0, class109 arg1, int arg2) {
        if (arg0 != -4936) {
            field1943 = null;
        }
        field1953++;
        while (true) {
            int var4 = arg1.method662((byte) -92);
            if (var4 == 0) {
                return;
            }
            this.method642(arg1, var4, 65535, arg2);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
    public static void method646(byte arg0) {
        field1943 = null;
        if (arg0 != 20) {
            return;
        }
        field1945 = null;
        field1939 = null;
        field1937 = null;
        field1949 = null;
        field1948 = null;
        field1938 = null;
        field1936 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([IIIIIII)V")
    public static final void method647(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class69.field1293 = arg5;
        class139.field2681 = new boolean[8][32][class69.field1293 + class69.field1293 + 1][class69.field1293 + class69.field1293 + 1];
        class14.field402 = 0;
        class217.field4038 = 0;
        class235.field4393 = arg3;
        class112.field2110 = arg4;
        class47.field953 = arg3 / 2;
        class36.field786 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class69.field1293 + class69.field1293 + 3][class69.field1293 + class69.field1293 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class60.field1118 = class199.field3640[var8];
                class69.field1302 = class199.field3624[var8];
                class186.field3431 = class199.field3640[var16];
                class120.field2275 = class199.field3624[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class69.field1293 + 1); var19 <= class69.field1293 + 1; var19++) {
                    for (int var20 = -(class69.field1293 + 1); var20 <= class69.field1293 + 1; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class83.method540(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class69.field1293 + var19 + 1][class69.field1293 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 32; var10++) {
                for (int var11 = -class69.field1293; var11 < class69.field1293; var11++) {
                    for (int var12 = -class69.field1293; var12 < class69.field1293; var12++) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; var14++) {
                            for (int var15 = -1; var15 <= 1; var15++) {
                                if (var7[var9][var10][var11 + var14 + class69.field1293 + 1][var12 + var15 + class69.field1293 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class69.field1293 + 1][var12 + var15 + class69.field1293 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class69.field1293 + 1][var12 + var15 + class69.field1293 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class69.field1293 + 1][var12 + var15 + class69.field1293 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class139.field2681[var9][var10][class69.field1293 + var11][class69.field1293 + var12] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILab;B)[Lva;")
    public static final class219[] method648(int arg0, class3 arg1, byte arg2) {
        field1942++;
        if (class184.method1158(true, arg1, arg0)) {
            return arg2 == 42 ? class227.method1491((byte) 76) : null;
        } else {
            return null;
        }
    }
}
