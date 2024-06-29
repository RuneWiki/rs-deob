import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class209 extends InputStream {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3267 = "Loading wordpack - ";

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lol;")
    public static class220 field3270 = new class220();

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method1450(byte arg0) {
        field3267 = null;
        field3270 = null;
        if (arg0 != 74) {
            field3270 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "read", descriptor = "()I")
    public final int read() {
        field3269++;
        class7.method43(-127, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg1 - arg5;
        field3265++;
        int var7 = arg0 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class240.method1693(arg3, arg5, arg4, arg1, (byte) 45);
            }
        } else if (var6 == 0) {
            class8.method47(arg0, arg4, arg5, (byte) -74, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg3;
                arg3 = arg5;
                arg5 = var9;
                int var10 = arg0;
                arg0 = arg1;
                arg1 = var10;
            }
            if (arg0 < arg3) {
                int var11 = arg3;
                int var12 = arg5;
                arg3 = arg0;
                arg0 = var11;
                arg5 = arg1;
                arg1 = var12;
            }
            if (arg2 == 5238) {
                int var13 = arg5;
                int var14 = arg1 - arg5;
                int var15 = arg0 - arg3;
                int var16 = -(var15 >> 1);
                if (var14 < 0) {
                    var14 = -var14;
                }
                int var17 = arg1 > arg5 ? 1 : -1;
                if (var8) {
                    for (int var19 = arg3; var19 <= arg0; var19++) {
                        var16 += var14;
                        class78.field1180[var19][var13] = arg4;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var15;
                        }
                    }
                } else {
                    for (int var18 = arg3; var18 <= arg0; var18++) {
                        var16 += var14;
                        class78.field1180[var13][var18] = arg4;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var15;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Ljm;")
    public static final class225 method1452(byte arg0) {
        field3268++;
        try {
            return new class292();
        } catch (Throwable var2) {
            if (arg0 != -49) {
                field3267 = null;
            }
            try {
                return (class225) Class.forName("il").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class34();
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILim;I)V")
    public static final void method1453(int arg0, class170 arg1, int arg2) {
        if (arg2 != 0) {
            field3270 = null;
        }
        if (class231.field3690 != null) {
            try {
                class231.field3690.method1815(0L, (byte) 98);
                class231.field3690.method1819(arg0, -1, arg1.field2650, 24);
            } catch (Exception var3) {
            }
        }
        field3271++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1454(String arg0, int arg1) {
        field3266++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 > -5) {
            field3267 = null;
        }
        while (var2 < class76.field1142) {
            if (arg0.equalsIgnoreCase(class301.field4799[var2])) {
                return true;
            }
            var2++;
        }
        return arg0.equalsIgnoreCase(class214.field3347.field31);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1455(int arg0, int arg1, int arg2, int arg3) {
        if (!class277.method1911(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class8.field114[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class220.field3458) {
                    if (!class117.method773(var4, var6, var5)) {
                        return false;
                    }
                    if (!class117.method773(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class117.method773(var4, var7, var5)) {
                        return false;
                    }
                    if (!class117.method773(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class117.method773(var4, var8, var5)) {
                    return false;
                }
                if (!class117.method773(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class140.field2008) {
                    if (!class117.method773(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class117.method773(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class117.method773(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class117.method773(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class117.method773(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class117.method773(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class220.field3458) {
                    if (!class117.method773(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class117.method773(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class117.method773(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class117.method773(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class117.method773(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class117.method773(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class140.field2008) {
                    if (!class117.method773(var4, var6, var5)) {
                        return false;
                    }
                    if (!class117.method773(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class117.method773(var4, var7, var5)) {
                        return false;
                    }
                    if (!class117.method773(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class117.method773(var4, var8, var5)) {
                    return false;
                }
                if (!class117.method773(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class117.method773(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class117.method773(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class117.method773(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class117.method773(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class117.method773(var4, var8, var5);
        } else {
            return true;
        }
    }
}
