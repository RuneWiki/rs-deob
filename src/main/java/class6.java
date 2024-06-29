import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Laj;")
    private class287 field490 = new class287(64);

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Laj;")
    public class287 field504 = new class287(50);

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Ltb;")
    public class369 field505 = new class369(250);

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "Lhr;")
    private class488 field506 = new class488();

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Z")
    private boolean field498;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lom;")
    private class344 field487;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lom;")
    public class344 field493;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "Lgm;")
    private class109 field507;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field508;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field510;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lsb;")
    public static class266 field495 = new class266(43, -1);

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field500 = 0;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "[[B")
    public static byte[][] field501;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method247(int arg0) {
        field495 = null;
        field501 = null;
        if (arg0 != 32) {
            field500 = -115;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public final void method248(byte arg0) {
        class287 var2 = this.field490;
        synchronized (this.field490) {
            this.field490.method1913(true);
        }
        field484++;
        class287 var3 = this.field504;
        synchronized (this.field504) {
            this.field504.method1913(true);
        }
        class369 var4 = this.field505;
        synchronized (this.field505) {
            this.field505.method2328(0);
        }
        if (arg0 < 3) {
            method251(true, -103);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public final void method249(int arg0) {
        class287 var2 = this.field490;
        synchronized (this.field490) {
            this.field490.method1912(-2552);
        }
        if (arg0 != 36) {
            return;
        }
        field497++;
        class287 var3 = this.field504;
        synchronized (this.field504) {
            this.field504.method1912(-2552);
        }
        class369 var4 = this.field505;
        synchronized (this.field505) {
            this.field505.method2329((byte) -106);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
    public final void method250(int arg0, byte arg1) {
        field489++;
        int var3 = -49 / ((-arg1 - 4) / 53);
        this.field509 = arg0;
        class287 var4 = this.field504;
        synchronized (this.field504) {
            this.field504.method1913(true);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
    public static final void method251(boolean arg0, int arg1) {
        class521.field7373 = arg1;
        field492++;
        class287 var2 = class319.field4696;
        synchronized (class319.field4696) {
            class319.field4696.method1913(arg0);
        }
        class287 var3 = class395.field5768;
        synchronized (class395.field5768) {
            class395.field5768.method1913(arg0);
        }
        if (!arg0) {
            field501 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZZ)V")
    public final void method252(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field505 = null;
        }
        field485++;
        if (this.field498 != arg0) {
            this.field498 = arg0;
            this.method248((byte) 29);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZILr;Lefa;III)Lf;")
    public final class702 method253(int arg0, boolean arg1, int arg2, class167 arg3, class168 arg4, int arg5, int arg6, int arg7) {
        this.field506.field6993 = arg3.field2783;
        if (!arg1) {
            this.field498 = false;
        }
        this.field506.field6987 = arg4 != null;
        this.field506.field6988 = arg6;
        this.field506.field6992 = arg5;
        field499++;
        this.field506.field6994 = arg7;
        this.field506.field6986 = arg2;
        this.field506.field6996 = arg0;
        return (class702) this.field505.method2334(this.field506, -125);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    public final void method254(int arg0, int arg1) {
        if (arg0 != -31888) {
            return;
        }
        field502++;
        class287 var3 = this.field490;
        synchronized (this.field490) {
            this.field490.method1908(arg1, (byte) -11);
        }
        class287 var4 = this.field504;
        synchronized (this.field504) {
            this.field504.method1908(arg1, (byte) -11);
        }
        class369 var5 = this.field505;
        synchronized (this.field505) {
            this.field505.method2332((byte) -96, arg1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    public final void method255(int arg0) {
        if (arg0 > -46) {
            this.method255(67);
        }
        class287 var2 = this.field504;
        synchronized (this.field504) {
            this.field504.method1913(true);
        }
        field491++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIBLefa;ILr;Lla;IZZILr;)Lf;")
    public final class702 method256(int arg0, int arg1, byte arg2, class168 arg3, int arg4, class167 arg5, class421 arg6, int arg7, boolean arg8, boolean arg9, int arg10, class167 arg11) {
        field483++;
        class702 var13 = this.method253(arg4, true, arg10, arg11, arg3, arg1, arg7, arg0);
        if (var13 != null) {
            return var13;
        } else if (arg2 <= 66) {
            return null;
        } else {
            class110 var14 = this.method258(arg0, (byte) -67);
            if (arg4 > 1 && var14.field1967 != null) {
                int var15 = -1;
                for (int var16 = 0; var16 < 10; var16++) {
                    if (arg4 >= var14.field2006[var16] && var14.field2006[var16] != 0) {
                        var15 = var14.field1967[var16];
                    }
                }
                if (var15 != -1) {
                    var14 = this.method258(var15, (byte) -67);
                }
            }
            int[] var17 = var14.method999(arg1, arg6, arg3, arg4, arg5, arg7, (byte) -91, arg11, arg9, arg10);
            if (var17 == null) {
                return null;
            }
            class702 var18;
            if (arg8) {
                var18 = arg5.method54(var17, 0, 36, 36, 32);
            } else {
                var18 = arg11.method54(var17, 0, 36, 36, 32);
            }
            if (!arg8) {
                class488 var19 = new class488();
                var19.field6996 = arg4;
                var19.field6986 = arg10;
                var19.field6992 = arg1;
                var19.field6993 = arg11.field2783;
                var19.field6988 = arg7;
                var19.field6987 = arg3 != null;
                var19.field6994 = arg0;
                this.field505.method2335(var19, (byte) 125, var18);
            }
            return var18;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public final void method257(byte arg0) {
        class369 var2 = this.field505;
        synchronized (this.field505) {
            this.field505.method2328(0);
        }
        if (arg0 != 67) {
            this.field490 = null;
        }
        field486++;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IB)Lut;")
    public final class110 method258(int arg0, byte arg1) {
        field494++;
        class287 var3 = this.field490;
        class110 var4;
        synchronized (this.field490) {
            var4 = (class110) this.field490.method1900((long) arg0, -13);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field487;
        byte[] var6;
        synchronized (this.field487) {
            var6 = this.field487.method2216(class236.method1580(124, arg0), class252.method1685(false, arg0), true);
        }
        class110 var7 = new class110();
        var7.field2004 = arg0;
        var7.field1982 = this;
        var7.field1959 = new String[] { null, null, class265.field3882.method1733(255, this.field488), null, null };
        var7.field1936 = new String[] { null, null, null, null, class265.field3883.method1733(255, this.field488) };
        if (var6 != null) {
            var7.method988(new class61(var6), (byte) -90);
        }
        var7.method1002(-118);
        if (var7.field1988 != -1) {
            var7.method1003((byte) -127, this.method258(var7.field1988, (byte) -67), this.method258(var7.field1951, (byte) -67));
        }
        if (arg1 != -67) {
            this.method248((byte) -116);
        }
        if (var7.field1977 != -1) {
            var7.method998(105, this.method258(var7.field1976, (byte) -67), this.method258(var7.field1977, (byte) -67));
        }
        if (!this.field498 && var7.field1931) {
            var7.field1954 = class265.field3880.method1733(255, this.field488);
            var7.field1959 = this.field508;
            var7.field1971 = null;
            var7.field1955 = false;
            var7.field1978 = 0;
            var7.field1936 = this.field510;
            if (var7.field1935 != null) {
                boolean var8 = false;
                for (class425 var9 = var7.field1935.method2597((byte) 52); var9 != null; var9 = var7.field1935.method2594((byte) -122)) {
                    class445 var10 = this.field507.method980(-82, (int) var9.field6132);
                    if (var10.field6404) {
                        var9.method2588(arg1 + 367);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field1935 = null;
                }
            }
        }
        class287 var11 = this.field490;
        synchronized (this.field490) {
            this.field490.method1904(var7, (long) arg0, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lmea;IZLgm;Lom;Lom;)V")
    public class6(class398 arg0, int arg1, boolean arg2, class109 arg3, class344 arg4, class344 arg5) {
        this.field488 = arg1;
        this.field498 = arg2;
        this.field487 = arg4;
        this.field493 = arg5;
        this.field507 = arg3;
        if (this.field487 == null) {
            this.field496 = 0;
        } else {
            int var7 = this.field487.method2245(0) - 1;
            this.field496 = var7 * 256 + this.field487.method2236(var7, 0);
        }
        this.field508 = new String[] { null, null, class265.field3882.method1733(255, this.field488), null, null };
        this.field510 = new String[] { null, null, null, null, class265.field3883.method1733(255, this.field488) };
    }
}
