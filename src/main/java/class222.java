import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class222 {

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public int field3182 = 0;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public int field3183 = 0;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "Ljv;")
    private class55 field3187 = new class55(64);

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "Lim;")
    private class401 field3188 = null;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Lbu;")
    private class17 field3181;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "Lbu;")
    private class17 field3178;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(J[IILef;)Ljava/lang/String;", line = 4)
    public final String method1472(long arg0, int[] arg1, int arg2, class335 arg3) {
        if (arg2 != 1) {
            this.field3188 = null;
        }
        field3180++;
        if (this.field3188 != null) {
            String var6 = this.field3188.method2328(arg0, arg3, 0, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZI)Luc;", line = 30)
    public final class23 method1473(boolean arg0, int arg1) {
        field3185++;
        class23 var3 = (class23) this.field3187.method494(0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field3181.method114(arg1, 1, -44);
        } else {
            var4 = this.field3178.method114(arg1 & 0x7FFF, 1, 125);
        }
        class23 var5 = new class23();
        var5.field462 = this;
        if (var4 != null) {
            var5.method186(new class145(var4), 0);
        }
        if (arg1 >= 32768) {
            var5.method194((byte) 89);
        }
        this.field3187.method485((long) arg1, (byte) -125, var5);
        if (!arg0) {
            this.method1472(93L, null, 124, null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 63)
    public static final void method1474(int arg0) {
        field3186++;
        class432 var1 = (class432) class502.field7411.method2427(114);
        boolean var2 = class475.field7100 != null || class333.field5035 > 0;
        if (var2) {
            class440.field6579 = 1;
        }
        if (class420.field6277 && class380.field5726.method1584(14, 81) && class363.field5500 > 2) {
            if (var2) {
                class446.field6663 = (class208) class339.field5122.field5929.field4906.field4906;
            } else {
                class282.method1802(var1.method2183(-5), true, (class208) class339.field5122.field5929.field4906.field4906, var1.method2186((byte) 105));
            }
        } else if (var2) {
            class446.field6663 = (class208) class339.field5122.field5929.field4906;
        } else {
            class282.method1802(var1.method2183(-5), true, (class208) class339.field5122.field5929.field4906, var1.method2186((byte) 123));
        }
        if (arg0 >= -39) {
            method1475(true, -113, 94, 37, -23, -24, false, -84, -48);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZIIIIIZII)Z", line = 102)
    public static final boolean method1475(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field3179++;
        int var9 = class139.field2224.field7692[0];
        int var10 = class139.field2224.field7694[0];
        if (var9 < 0 || class33.field662 <= var9 || var10 < 0 || class121.field1966 <= var10) {
            return false;
        } else if (arg7 >= 0 && arg7 < class33.field662 && arg1 >= 0 && arg1 < class121.field1966) {
            int var11 = class408.method2484(arg5, var9, arg0, arg7, arg3, class141.field2244[class139.field2224.field6232], arg4, 108, var10, arg1, class139.field2224.method1654(108), arg8, class149.field2375, class338.field5094, arg2);
            if (var11 < 1) {
                return false;
            }
            class467.field6967 = class338.field5094[var11 - 1];
            if (arg6) {
                class308.field4710 = class149.field2375[var11 - 1];
                class100.field1648 = false;
                class482.method2866(108);
                return true;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(ILbu;Lbu;Lim;)V", line = 149)
    public class222(int arg0, class17 arg1, class17 arg2, class401 arg3) {
        this.field3188 = arg3;
        this.field3181 = arg1;
        this.field3178 = arg2;
        if (this.field3181 != null) {
            this.field3183 = this.field3181.method119(29630, 1);
        }
        if (this.field3178 != null) {
            this.field3182 = this.field3178.method119(29630, 1);
        }
    }
}
