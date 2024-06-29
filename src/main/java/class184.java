import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class184 {

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Ltm;")
    private class349 field2131 = new class349(256);

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "Ltm;")
    private class349 field2141 = new class349(256);

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Lwo;")
    private class285 field2137;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Lwo;")
    private class285 field2136;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Lwo;")
    public static class285 field2138;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "[S")
    public static short[] field2127;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "[Z")
    public static boolean[] field2135;

    static {
        new class72(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1142(byte arg0) {
        if (arg0 <= 77) {
            method1147((class42) null, -80, -82, -19);
        }
        field2134++;
        class219.field2697.method2216((byte) -127);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 17)
    public static final void method1143(String arg0, int arg1) {
        System.out.println("Error: " + class134.method875(arg0, "\n", false, "%0a"));
        field2140++;
        if (arg1 != -27893) {
            method1147((class42) null, 30, -54, -54);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III[I)Lve;", line = 33)
    private final class159 method1144(int arg0, int arg1, int arg2, int[] arg3) {
        field2128++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF5) ^ arg1;
        if (arg2 <= 44) {
            return null;
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class159 var9 = (class159) this.field2141.method2218(1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class417 var10 = class417.method2566(this.field2136, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class159 var11 = var10.method2565();
            this.field2141.method2227(var11, -8218, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field1859.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II[I)Lve;", line = 78)
    public final class159 method1145(int arg0, int arg1, int[] arg2) {
        field2139++;
        if (arg0 != 6744) {
            return null;
        } else if (this.field2137.method1793(0) == 1) {
            return this.method1150(arg2, false, arg1, 0);
        } else if (this.field2137.method1821(122, arg1) == 1) {
            return this.method1150(arg2, false, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 99)
    public static void method1146(int arg0) {
        field2135 = null;
        field2127 = null;
        if (arg0 >= -81) {
            field2135 = null;
        }
        field2138 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lil;III)V", line = 113)
    public static final void method1147(class42 arg0, int arg1, int arg2, int arg3) {
        int var4 = class59.field747[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field494 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 0xFF;
            if (var6 <= 0) {
                break;
            }
            arg0.field498[arg0.field494++] = class349.field4761[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field494; var7 < 4; var7++) {
            arg0.field498[var7] = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)I", line = 141)
    public static final int method1148(byte arg0) {
        field2130++;
        return arg0 <= 38 ? -111 : class244.field3244;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([III)Lve;", line = 158)
    public final class159 method1149(int[] arg0, int arg1, int arg2) {
        field2129++;
        if (arg1 > -127) {
            return null;
        } else if (this.field2136.method1793(0) == 1) {
            return this.method1144(0, arg2, 110, arg0);
        } else if (this.field2136.method1821(65, arg2) == 1) {
            return this.method1144(arg2, 0, 123, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([IZII)Lve;", line = 179)
    private final class159 method1150(int[] arg0, boolean arg1, int arg2, int arg3) {
        field2132++;
        int var5 = (arg3 >>> 12 | (arg3 & 0x40000FFF) << 4) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class159 var9 = (class159) this.field2141.method2218(1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class24 var10 = (class24) this.field2131.method2218(1, var7);
            if (var10 == null) {
                var10 = class24.method156(this.field2137, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field2131.method2227(var10, -8218, var7);
            }
            class159 var11 = var10.method149(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method263(arg1);
                this.field2141.method2227(var11, -8218, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lwo;Lwo;)V", line = 238)
    public class184(class285 arg0, class285 arg1) {
        this.field2137 = arg1;
        this.field2136 = arg0;
    }
}
