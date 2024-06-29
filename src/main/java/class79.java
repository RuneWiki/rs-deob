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

@OriginalClass("client!gg")
public class class79 extends class104 {

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public int field993 = -1;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public int field1003 = 0;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public int field1004 = -1;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public int field1006 = 0;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public int field995 = 12800;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Z")
    public boolean field1012 = true;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public int field998 = 12800;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "Ljava/lang/String;")
    public String field1010;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Ljava/lang/String;")
    public String field992;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "Lan;")
    public class337 field1001;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field1002 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "[Lhi;")
    public static class307[] field1009;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)I", line = 4)
    public static final int method465(boolean arg0, int arg1) {
        field1013++;
        return arg0 ? 42 : arg1 >>> 10;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)[I", line = 18)
    public final int[] method466(int arg0, int arg1, int arg2, int arg3) {
        field991++;
        for (class112 var5 = (class112) this.field1001.method2331((byte) 78); var5 != null; var5 = (class112) this.field1001.method2332(arg1 - 50)) {
            if (var5.method775(arg3, 10429, arg2, arg0)) {
                return var5.method770(arg3, -26040, arg2);
            }
        }
        if (arg1 != -10) {
            this.field994 = -28;
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)[I", line = 42)
    public final int[] method467(int arg0, int arg1, byte arg2) {
        field999++;
        class112 var4 = (class112) this.field1001.method2331((byte) 28);
        if (arg2 > -70) {
            return (int[]) null;
        }
        while (var4 != null) {
            if (var4.method773(arg0, arg1, -128)) {
                return var4.method770(arg0, -26040, arg1);
            }
            var4 = (class112) this.field1001.method2332(-79);
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V", line = 67)
    public static void method468(int arg0) {
        field1009 = null;
        if (arg0 != 0) {
            field1009 = (class307[]) null;
        }
        field1002 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIII)V", line = 78)
    public static final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class84.method498(0, arg3);
        int var7 = -70 % ((arg1 - 43) / 38);
        int var8 = arg3 - arg5;
        field1014++;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg3;
        int var10 = arg3;
        int var11 = 0;
        int var12 = -var8;
        int var13 = var8;
        int var14 = -1;
        int var15 = -1;
        if (class272.field4273 <= arg0 && arg0 <= class248.field3759) {
            int[] var16 = class206.field2886[arg0];
            int var17 = class140.method930(24918, arg6 - arg3, class56.field678, class109.field1494);
            int var18 = class140.method930(24918, arg6 + arg3, class56.field678, class109.field1494);
            int var19 = class140.method930(24918, arg6 - var8, class56.field678, class109.field1494);
            int var20 = class140.method930(24918, arg6 + var8, class56.field678, class109.field1494);
            class279.method1997(var19, -824384948, var17, arg2, var16);
            class279.method1997(var20, -824384948, var19, arg4, var16);
            class279.method1997(var18, -824384948, var20, arg2, var16);
        }
        while (var10 > var11) {
            var14 += 2;
            var15 += 2;
            var12 += var15;
            var9 += var14;
            if (var12 >= 0 && var13 >= 1) {
                var13--;
                var12 -= var13 << 1;
                class7.field100[var13] = var11;
            }
            var11++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                int var21 = arg0 - var10;
                int var22 = arg0 + var10;
                if (class272.field4273 <= var22 && class248.field3759 >= var21) {
                    if (var8 > var10) {
                        int var23 = class7.field100[var10];
                        int var24 = class140.method930(24918, arg6 + var11, class56.field678, class109.field1494);
                        int var25 = class140.method930(24918, arg6 - var11, class56.field678, class109.field1494);
                        int var26 = class140.method930(24918, arg6 + var23, class56.field678, class109.field1494);
                        int var27 = class140.method930(24918, arg6 - var23, class56.field678, class109.field1494);
                        if (class248.field3759 >= var22) {
                            int[] var28 = class206.field2886[var22];
                            class279.method1997(var27, -824384948, var25, arg2, var28);
                            class279.method1997(var26, -824384948, var27, arg4, var28);
                            class279.method1997(var24, -824384948, var26, arg2, var28);
                        }
                        if (class272.field4273 <= var21) {
                            int[] var29 = class206.field2886[var21];
                            class279.method1997(var27, -824384948, var25, arg2, var29);
                            class279.method1997(var26, -824384948, var27, arg4, var29);
                            class279.method1997(var24, -824384948, var26, arg2, var29);
                        }
                    } else {
                        int var30 = class140.method930(24918, arg6 + var11, class56.field678, class109.field1494);
                        int var31 = class140.method930(24918, arg6 - var11, class56.field678, class109.field1494);
                        if (var22 <= class248.field3759) {
                            class279.method1997(var30, -824384948, var31, arg2, class206.field2886[var22]);
                        }
                        if (class272.field4273 <= var21) {
                            class279.method1997(var30, -824384948, var31, arg2, class206.field2886[var21]);
                        }
                    }
                }
            }
            int var32 = arg0 - var11;
            int var33 = arg0 + var11;
            if (var33 >= class272.field4273 && class248.field3759 >= var32) {
                int var34 = arg6 - var10;
                int var35 = arg6 + var10;
                if (var35 >= class109.field1494 && class56.field678 >= var34) {
                    int var36 = class140.method930(24918, var35, class56.field678, class109.field1494);
                    int var37 = class140.method930(24918, var34, class56.field678, class109.field1494);
                    if (var8 > var11) {
                        int var38 = var13 >= var11 ? var13 : class7.field100[var11];
                        int var39 = class140.method930(24918, arg6 + var38, class56.field678, class109.field1494);
                        int var40 = class140.method930(24918, arg6 - var38, class56.field678, class109.field1494);
                        if (var33 <= class248.field3759) {
                            int[] var41 = class206.field2886[var33];
                            class279.method1997(var40, -824384948, var37, arg2, var41);
                            class279.method1997(var39, -824384948, var40, arg4, var41);
                            class279.method1997(var36, -824384948, var39, arg2, var41);
                        }
                        if (var32 >= class272.field4273) {
                            int[] var42 = class206.field2886[var32];
                            class279.method1997(var40, -824384948, var37, arg2, var42);
                            class279.method1997(var39, -824384948, var40, arg4, var42);
                            class279.method1997(var36, -824384948, var39, arg2, var42);
                        }
                    } else {
                        if (class248.field3759 >= var33) {
                            class279.method1997(var36, -824384948, var37, arg2, class206.field2886[var33]);
                        }
                        if (class272.field4273 <= var32) {
                            class279.method1997(var36, -824384948, var37, arg2, class206.field2886[var32]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V", line = 261)
    public final void method470(boolean arg0) {
        this.field1006 = 0;
        field1000++;
        this.field998 = 12800;
        this.field995 = 12800;
        this.field1003 = 0;
        for (class112 var2 = (class112) this.field1001.method2331((byte) 10); var2 != null; var2 = (class112) this.field1001.method2332(-42)) {
            if (var2.field1598 > this.field1003) {
                this.field1003 = var2.field1598;
            }
            if (this.field998 > var2.field1600) {
                this.field998 = var2.field1600;
            }
            if (var2.field1582 > this.field1006) {
                this.field1006 = var2.field1582;
            }
            if (var2.field1583 < this.field995) {
                this.field995 = var2.field1583;
            }
        }
        if (!arg0) {
            field1009 = (class307[]) null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 593)
    public class79(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field1010 = arg1;
        this.field994 = arg0;
        this.field1012 = arg5;
        this.field990 = arg3;
        this.field993 = arg4;
        this.field1004 = arg6;
        if (this.field1004 == 255) {
            this.field1004 = 0;
        }
        this.field992 = arg2;
        this.field1001 = new class337();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Z", line = 310)
    public final boolean method471(int arg0, int arg1, int arg2) {
        field1011++;
        class112 var4 = (class112) this.field1001.method2331((byte) 95);
        if (arg1 != -19) {
            field1009 = (class307[]) null;
        }
        while (var4 != null) {
            if (var4.method773(arg2, arg0, -44)) {
                return true;
            }
            var4 = (class112) this.field1001.method2332(-86);
        }
        return false;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)[I", line = 335)
    public final int[] method472(byte arg0, int arg1, int arg2) {
        if (arg0 != -118) {
            this.method471(-97, -7, 119);
        }
        field1008++;
        for (class112 var4 = (class112) this.field1001.method2331((byte) 22); var4 != null; var4 = (class112) this.field1001.method2332(arg0 ^ 0x25)) {
            if (var4.method767(arg0 ^ 0x75, arg1, arg2)) {
                return var4.method765(true, arg2, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(ZI)V", line = 371)
    public static final void method473(boolean arg0, int arg1) {
        if (!arg0) {
            field1002 = (String[]) null;
        }
        field1007++;
        class96 var2 = class141.method935(arg1, 9, 81);
        var2.method582(-1);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLie;)V", line = 384)
    public static final void method474(int arg0, byte arg1, class94 arg2) {
        field996++;
        if (arg1 != -117) {
            field997 = -93;
        }
        while (true) {
            class60 var3 = (class60) class186.field2681.method2331((byte) 80);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field731; var5++) {
                if (var3.field744[var5] != null) {
                    if (var3.field744[var5].field238 == 2) {
                        var3.field735[var5] = -5;
                    }
                    if (var3.field744[var5].field238 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field730[var5] != null) {
                    if (var3.field730[var5].field238 == 2) {
                        var3.field735[var5] = -6;
                    }
                    if (var3.field730[var5].field238 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method573(122, arg0);
            arg2.method648(0, (byte) 38);
            int var6 = arg2.field1400;
            arg2.method641(arg1 ^ 0x964F13D3, var3.field746);
            for (int var7 = 0; var7 < var3.field731; var7++) {
                if (var3.field735[var7] == 0) {
                    try {
                        int var8 = var3.field736[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field744[var7].field241;
                            int var13 = var12.getInt((Object) null);
                            arg2.method648(0, (byte) 38);
                            arg2.method641(1773202520, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field744[var7].field241;
                            var9.setInt((Object) null, var3.field737[var7]);
                            arg2.method648(0, (byte) 38);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field744[var7].field241;
                            int var11 = var10.getModifiers();
                            arg2.method648(0, (byte) 38);
                            arg2.method641(1773202520, var11);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field730[var7].field241;
                            byte[][] var15 = var3.field741[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method648(0, (byte) 38);
                            } else if ((var19 instanceof Number)) {
                                arg2.method648(1, (byte) 38);
                                arg2.method678(((Number) var19).longValue(), (byte) 112);
                            } else if ((var19 instanceof String)) {
                                arg2.method648(2, (byte) 38);
                                arg2.method636(arg1 + 372, (String) var19);
                            } else {
                                arg2.method648(4, (byte) 38);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field730[var7].field241;
                            int var21 = var20.getModifiers();
                            arg2.method648(0, (byte) 38);
                            arg2.method641(1773202520, var21);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method648(-10, (byte) 38);
                    } catch (InvalidClassException var35) {
                        arg2.method648(-11, (byte) 38);
                    } catch (StreamCorruptedException var36) {
                        arg2.method648(-12, (byte) 38);
                    } catch (OptionalDataException var37) {
                        arg2.method648(-13, (byte) 38);
                    } catch (IllegalAccessException var38) {
                        arg2.method648(-14, (byte) 38);
                    } catch (IllegalArgumentException var39) {
                        arg2.method648(-15, (byte) 38);
                    } catch (InvocationTargetException var40) {
                        arg2.method648(-16, (byte) 38);
                    } catch (SecurityException var41) {
                        arg2.method648(-17, (byte) 38);
                    } catch (IOException var42) {
                        arg2.method648(-18, (byte) 38);
                    } catch (NullPointerException var43) {
                        arg2.method648(-19, (byte) 38);
                    } catch (Exception var44) {
                        arg2.method648(-20, (byte) 38);
                    } catch (Throwable var45) {
                        arg2.method648(-21, (byte) 38);
                    }
                } else {
                    arg2.method648(var3.field735[var7], (byte) 38);
                }
            }
            arg2.method675((byte) 52, var6);
            arg2.method654(arg2.field1400 - var6, 38102816);
            var3.method2285(true);
        }
    }
}
