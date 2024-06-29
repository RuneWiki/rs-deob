import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class101 {

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Lla;")
    public static class319 field1471;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Llo;")
    public static class539 field1470;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field1474;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method666(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)I", line = 13)
    public static final int method658(byte arg0) {
        if (arg0 <= 16) {
            method661((byte) 40);
        }
        field1472++;
        return 2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII[BI)Z", line = 26)
    public static final boolean method659(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1473++;
        boolean var6 = true;
        if (arg0 <= 49) {
            return false;
        }
        class164 var7 = new class164(arg4);
        int var8 = -1;
        label74: while (true) {
            int var9 = var7.method1063(-59);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class209 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method1077((byte) -123);
                                        if (var19 == 0) {
                                            continue label74;
                                        }
                                        var7.method1087(false);
                                    }
                                    int var12 = var7.method1077((byte) -115);
                                    if (var12 == 0) {
                                        continue label74;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = (var10 & 0xFCC) >> 6;
                                    var15 = var7.method1087(false) >> 2;
                                    var16 = var14 + arg3;
                                    var17 = arg1 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while ((arg5 - 1) <= var16);
                    } while (arg2 - 1 <= var17);
                    var18 = class432.field6575.method1872(var8, false);
                } while (var15 == 22 && !class203.field2716.field1155 && var18.field2930 == 0 && var18.field2910 != 1 && !var18.field2903);
                if (!var18.method1439(true)) {
                    class29.field448++;
                    var6 = false;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I", line = 110)
    public final int method660(int arg0) {
        field1464++;
        int var2 = 5 / ((arg0 + 12) / 37);
        return this.field1469;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 123)
    public static void method661(byte arg0) {
        field1470 = null;
        int var1 = -83 % ((arg0 + 8) / 52);
        field1471 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(FFBF)I", line = 133)
    public static final int method662(float arg0, float arg1, byte arg2, float arg3) {
        field1466++;
        float var4 = arg0 < 0.0F ? -arg0 : arg0;
        float var5 = (arg1 < 0.0F) ? -arg1 : arg1;
        if (arg2 != 58) {
            return 32;
        }
        float var6 = (arg3 < 0.0F) ? -arg3 : arg3;
        if (var5 > var4 && var5 > var6) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return (arg3 > 0.0F) ? 2 : 3;
        } else if ((arg0 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 176)
    public static final void method663(byte arg0) {
        field1467++;
        try {
            Method var1 = (field1474 == null ? (field1474 = method666("java.lang.Runtime")) : field1474).getMethod("availableProcessors");
            if (arg0 == 71 && var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class429.field6544 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIIIII)V", line = 203)
    public static final void method664(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1465++;
        int var6 = arg1 - arg2;
        int var7 = arg4 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class86.method589(arg5, (byte) -53, arg3, arg2, arg4);
            }
        } else if (var7 == 0) {
            class518.method3089(arg3, arg2, 5, arg5, arg1);
        } else {
            if (!arg0) {
                method665(-31, -32);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg1 < class377.field5760) {
                var11 = class377.field5760;
                var10 = (class377.field5760 * var8 >> 12) + var9;
            } else if (arg1 > class49.field701) {
                var10 = (class49.field701 * var8 >> 12) + var9;
                var11 = class49.field701;
            } else {
                var10 = arg4;
                var11 = arg1;
            }
            int var12;
            int var13;
            if (arg2 < class377.field5760) {
                var12 = var9 + (class377.field5760 * var8 >> 12);
                var13 = class377.field5760;
            } else if (arg2 > class49.field701) {
                var13 = class49.field701;
                var12 = var9 + (class49.field701 * var8 >> 12);
            } else {
                var13 = arg2;
                var12 = arg3;
            }
            if (var12 < class463.field6924) {
                var12 = class463.field6924;
                var13 = (class463.field6924 - var9 << 12) / var8;
            } else if (var12 > class369.field5628) {
                var12 = class369.field5628;
                var13 = (class369.field5628 - var9 << 12) / var8;
            }
            if (class463.field6924 > var10) {
                var10 = class463.field6924;
                var11 = (class463.field6924 - var9 << 12) / var8;
            } else if (class369.field5628 < var10) {
                var11 = (class369.field5628 - var9 << 12) / var8;
                var10 = class369.field5628;
            }
            class121.method738((byte) 79, arg5, var12, var11, var13, var10);
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 306)
    public class101(String arg0, int arg1) {
        this.field1469 = arg1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V", line = 316)
    public static final void method665(int arg0, int arg1) {
        if (arg1 != 5739) {
            method658((byte) 70);
        }
        field1468++;
        class177 var2 = class344.method2229(3, arg0, (byte) 91);
        var2.method1194(arg1 ^ 0xFFFFE9D6);
    }

    @OriginalMember(owner = "client!wh", name = "toString", descriptor = "()Ljava/lang/String;", line = 329)
    public final String toString() {
        field1463++;
        throw new IllegalStateException();
    }
}
