import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class133 extends class28 {

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Lak;")
    public static class234 field2036;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "J")
    public long field2032;

    // $FF: synthetic field
    @OriginalMember(owner = "client!me", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field2046;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Lag;")
    public static final class484 method971(int arg0, int arg1) {
        field2034++;
        if (arg1 != 0) {
            field2036 = null;
        }
        class305[] var2 = class153.field2278;
        synchronized (class153.field2278) {
            class484 var3;
            if (class153.field2278.length <= arg0 || class153.field2278[arg0].method1955((byte) -77)) {
                var3 = new class484();
                var3.field6964 = new class83[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field6964[var4] = new class83();
                }
            } else {
                var3 = (class484) class153.field2278[arg0].method1960(-123);
                var3.method526((byte) -33);
                int var10002 = class116.field1761[arg0]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
    public final int method190(int arg0) {
        field2044++;
        return arg0 == 16711680 ? this.field2040 : -70;
    }

    @OriginalMember(owner = "client!me", name = "h", descriptor = "(I)I")
    public final int method194(int arg0) {
        field2038++;
        return arg0 == 2170 ? this.field2037 : 13;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 11742) {
            method975(-64);
        }
        field2039++;
        if (arg6 < 0 || arg7 < 0 || arg6 >= class69.field976 - 1 || class285.field4328 - 1 <= arg7) {
            return;
        }
        if (client.field3311 == null) {
            return;
        }
        if (arg5 == 0) {
            class164 var8 = (class164) class85.method713(arg0, arg6, arg7);
            class164 var9 = (class164) class268.method1779(arg0, arg6, arg7);
            if (var8 != null && arg3 != 2) {
                if ((var8 instanceof class71)) {
                    ((class71) var8).field1008.method241(arg1, (byte) -98);
                } else {
                    class45.method465(arg7, arg2, arg0, arg1, arg3, var8.method624((byte) -128), arg6, true, arg5);
                }
            }
            if (var9 != null) {
                if (var9 instanceof class71) {
                    ((class71) var9).field1008.method241(arg1, (byte) -109);
                    return;
                }
                class45.method465(arg7, arg2, arg0, arg1, arg3, var9.method624((byte) -128), arg6, true, arg5);
                return;
            }
            return;
        }
        if (arg5 != 1) {
            if (arg5 == 2) {
                class164 var11 = (class164) class154.method1057(arg0, arg6, arg7, field2046 == null ? (field2046 = method976("ig")) : field2046);
                if (var11 == null) {
                    return;
                }
                if (arg3 == 11) {
                    arg3 = 10;
                }
                if (!(var11 instanceof class223)) {
                    class45.method465(arg7, arg2, arg0, arg1, arg3, var11.method624((byte) -120), arg6, true, arg5);
                    return;
                }
                ((class223) var11).field3663.method241(arg1, (byte) -113);
            } else if (arg5 == 3) {
                class164 var10 = (class164) class446.method2736(arg0, arg6, arg7);
                if (var10 != null) {
                    if (!(var10 instanceof class488)) {
                        class45.method465(arg7, arg2, arg0, arg1, arg3, var10.method624((byte) -126), arg6, true, arg5);
                        return;
                    }
                    ((class488) var10).field7021.method241(arg1, (byte) -108);
                    return;
                }
            }
            return;
        }
        class164 var12 = (class164) class188.method1263(arg0, arg6, arg7);
        if (var12 == null) {
            return;
        }
        if (var12 instanceof class173) {
            ((class173) var12).field2577.method241(arg1, (byte) -123);
            return;
        }
        int var13 = var12.method624((byte) -128);
        if (arg3 != 4 && arg3 != 5) {
            if (arg3 != 6) {
                if (arg3 == 7) {
                    class45.method465(arg7, (arg2 + 2 & 0x3) + 4, arg0, arg1, 4, var13, arg6, true, arg5);
                } else if (arg3 == 8) {
                    class45.method465(arg7, arg2 + 4, arg0, arg1, 4, var13, arg6, true, arg5);
                    class45.method465(arg7, (arg2 + 2 & 0x3) + 4, arg0, arg1, 4, var13, arg6, true, arg5);
                    return;
                }
                return;
            }
            class45.method465(arg7, arg2 + 4, arg0, arg1, 4, var13, arg6, true, arg5);
            return;
        }
        class45.method465(arg7, arg2, arg0, arg1, 4, var13, arg6, true, arg5);
        return;
    }

    @OriginalMember(owner = "client!me", name = "i", descriptor = "(I)Z")
    public static final boolean method973(int arg0) {
        field2035++;
        if (arg0 != 0) {
            field2036 = null;
        }
        if (class507.field7413) {
            try {
                if ((Boolean) class513.method3040("showingVideoAd", class360.field5349.field5199, 1360)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)I")
    public final int method195(byte arg0) {
        field2033++;
        if (arg0 <= 39) {
            this.field2040 = 99;
        }
        return this.field2042;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Luq;I)V")
    public static final void method974(class114 arg0, int arg1) {
        field2041++;
        class114 var2 = class277.method1822((byte) 127, arg0);
        if (arg1 < 123) {
            method971(90, 33);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class80.field1163;
            var4 = class76.field1105;
        } else {
            var3 = var2.field1642;
            var4 = var2.field1627;
        }
        class403.method2519(arg0, var4, var3, false, -1);
        class355.method2231(var4, (byte) 113, arg0, var3);
    }

    @OriginalMember(owner = "client!me", name = "j", descriptor = "(I)V")
    public static void method975(int arg0) {
        if (arg0 == 2) {
            field2036 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)J")
    public final long method192(int arg0) {
        if (arg0 != 13) {
            this.method190(-101);
        }
        field2045++;
        return this.field2032;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method976(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class234(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field2036 = new class234("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");
    }
}
