import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class374 {

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field5256 = 0;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "S")
    public static short field5258 = 32767;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field5257;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oo", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field5259;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5249;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "Z")
    public static boolean field5254;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "[Lsl;")
    public static class265[] field5252;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2388(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 8)
    public class374() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZ)Ljh;", line = 18)
    public static final class88 method2382(int arg0, boolean arg1) {
        field5257++;
        class237 var2 = class255.field3677;
        class88 var3;
        synchronized (class255.field3677) {
            var3 = (class88) class255.field3677.method1625((long) arg0, 0);
        }
        if (var3 != null) {
            return var3;
        } else if (arg1) {
            return null;
        } else {
            byte[] var4 = class300.field4215.method2431((byte) 112, class68.method387(arg1, arg0), class106.method585(arg0, 2));
            class88 var5 = new class88();
            var5.field1026 = arg0;
            if (var4 != null) {
                var5.method486((byte) -8, new class236(var4));
            }
            var5.method489(69);
            if (var5.field1069) {
                var5.field1040 = false;
                var5.field1003 = 0;
            }
            if (!class178.field2452 && var5.field1000) {
                var5.field1051 = null;
                var5.field1020 = null;
            }
            class237 var6 = class255.field3677;
            synchronized (class255.field3677) {
                class255.field3677.method1622((byte) 13, var5, (long) arg0);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZII)V", line = 65)
    public static final void method2383(boolean arg0, int arg1, int arg2) {
        if (arg2 != -5626) {
            return;
        }
        field5251++;
        class411 var3 = class144.method878(arg0, arg1, -119);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field5904.length; var4++) {
                var3.field5904[var4] = -1;
                var3.field5902[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 96)
    public static void method2384(int arg0) {
        field5252 = null;
        if (arg0 != -4) {
            field5254 = true;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Lwk;", line = 107)
    public static final class75 method2385(byte arg0) {
        field5255++;
        try {
            return new class391();
        } catch (Throwable var2) {
            if (arg0 <= 24) {
                field5256 = 60;
            }
            try {
                return (class75) Class.forName("vr").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class314();
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIIII)V", line = 131)
    public static final void method2386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -22646) {
            method2382(16, true);
        }
        field5253++;
        if (arg2 < 0 || arg3 < 0 || (class176.field2403 - 1) <= arg2 || arg3 >= class383.field5395 - 1) {
            return;
        }
        if (class250.field3570 == null) {
            return;
        }
        if (arg4 != 0) {
            if (arg4 == 1) {
                class9 var8 = (class9) class109.method696(arg5, arg2, arg3);
                if (var8 != null) {
                    if (var8 instanceof class420) {
                        ((class420) var8).field6003.method2584(arg1, -119);
                        return;
                    }
                    int var9 = var8.method71((byte) -109);
                    if (arg7 != 4 && arg7 != 5) {
                        if (arg7 != 6) {
                            if (arg7 == 7) {
                                class93.method518(var9, arg4, 4, (byte) -25, (arg0 + 2 & 0x3) + 4, arg2, arg1, arg3, arg5);
                            } else if (arg7 == 8) {
                                class93.method518(var9, arg4, 4, (byte) -110, arg0 + 4, arg2, arg1, arg3, arg5);
                                class93.method518(var9, arg4, 4, (byte) -118, (arg0 + 2 & 0x3) + 4, arg2, arg1, arg3, arg5);
                                return;
                            }
                            return;
                        }
                        class93.method518(var9, arg4, 4, (byte) -126, arg0 + 4, arg2, arg1, arg3, arg5);
                        return;
                    }
                    class93.method518(var9, arg4, 4, (byte) -42, arg0, arg2, arg1, arg3, arg5);
                    return;
                }
            } else if (arg4 == 2) {
                class9 var10 = (class9) class159.method1013(arg5, arg2, arg3, field5259 == null ? (field5259 = method2388("vl")) : field5259);
                if (var10 != null) {
                    if (arg7 == 11) {
                        arg7 = 10;
                    }
                    if (var10 instanceof class403) {
                        ((class403) var10).field5774.method2584(arg1, 19);
                        return;
                    }
                    class93.method518(var10.method71((byte) -108), arg4, arg7, (byte) -47, arg0, arg2, arg1, arg3, arg5);
                    return;
                }
            } else if (arg4 == 3) {
                class9 var11 = (class9) class327.method2118(arg5, arg2, arg3);
                if (var11 == null) {
                    return;
                }
                if (var11 instanceof class423) {
                    ((class423) var11).field6042.method2584(arg1, arg6 ^ 0xFFFFA7C2);
                    return;
                }
                class93.method518(var11.method71((byte) -85), arg4, arg7, (byte) -26, arg0, arg2, arg1, arg3, arg5);
            } else {
                return;
            }
            return;
        }
        class9 var12 = (class9) class137.method847(arg5, arg2, arg3);
        class9 var13 = (class9) class339.method2181(arg5, arg2, arg3);
        if (var12 != null && arg7 != 2) {
            if (var12 instanceof class254) {
                ((class254) var12).field3661.method2584(arg1, -128);
            } else {
                class93.method518(var12.method71((byte) -71), arg4, arg7, (byte) -38, arg0, arg2, arg1, arg3, arg5);
            }
        }
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class254) {
            ((class254) var13).field3661.method2584(arg1, 47);
            return;
        }
        class93.method518(var13.method71((byte) -117), arg4, arg7, (byte) -59, arg0, arg2, arg1, arg3, arg5);
        return;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I[BLdg;)V", line = 252)
    public final void method2387(int arg0, byte[] arg1, class236 arg2) {
        field5250++;
        if (arg2.field3364[arg2.field3320] != 31 || arg2.field3364[arg2.field3320 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5249 == null) {
            this.field5249 = new Inflater(true);
        }
        try {
            this.field5249.setInput(arg2.field3364, arg2.field3320 + 10, -arg2.field3320 + -10 + -8 + arg2.field3364.length);
            this.field5249.inflate(arg1);
        } catch (Exception var4) {
            this.field5249.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5249.reset();
        if (arg0 != -4) {
            field5256 = 58;
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(III)V", line = 282)
    private class374(int arg0, int arg1, int arg2) {
    }
}
