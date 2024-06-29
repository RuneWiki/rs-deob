import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class76 extends class352 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "S")
    public short field1272;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "S")
    public short field1271;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "B")
    public byte field1273;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Z")
    public boolean field1276;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "B")
    public byte field1274;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "S")
    public short field1277;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public int field1279;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "S")
    public short field1283;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lpu;")
    public static class179 field1280 = new class179("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field1286 = 0;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "Z")
    public static boolean field1289 = false;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "Ljp;")
    public static class55 field1288 = new class55(108, 0);

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lsc;")
    public static class270 field1291;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Lhg;")
    public static class372 field1290;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field1292;

    // $FF: synthetic method
    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method700(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class34("", 73);
        field1291 = new class270(9, 0, 4, 1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[S)[S", line = 7)
    public static final short[] method694(int arg0, short[] arg1) {
        field1281++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 22868) {
            field1286 = -88;
        }
        short[] var2 = new short[arg1.length];
        class325.method2137(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V", line = 24)
    public static final void method695(int arg0) {
        class540.field7909 = 0;
        field1282++;
        class154.field2370.method291(false);
        class154.field2370.method292((byte) 121, class4.field60);
        class540.field7909++;
        if (arg0 > -36) {
            field1290 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V", line = 38)
    public static void method696(byte arg0) {
        field1290 = null;
        field1280 = null;
        field1291 = null;
        int var1 = 27 / ((arg0 - 41) / 53);
        field1288 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Led;", line = 54)
    public static final class90 method697(int arg0, int arg1, int arg2) {
        class281 var3 = class348.field5192[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class90 var4 = var3.field4388;
            var3.field4388 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V", line = 70)
    public void method698(int arg0) {
        if (arg0 < 7) {
            this.field1271 = -74;
        }
        field1284++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIIIIII)V", line = 89)
    public static final void method699(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1287++;
        if (arg0) {
            method696((byte) -75);
        }
        if (arg3 < 0 || arg7 < 0 || arg3 >= (class338.field5076 - 1) || arg7 >= class250.field4077 - 1) {
            return;
        }
        if (class348.field5192 == null) {
            return;
        }
        if (arg6 == 0) {
            class161 var8 = (class161) class454.method2781(arg5, arg3, arg7);
            class161 var9 = (class161) class178.method1261(arg5, arg3, arg7);
            if (var8 != null && arg1 != 2) {
                if ((var8 instanceof class117)) {
                    ((class117) var8).field1801.method1320((byte) -10, arg2);
                } else {
                    class303.method2006(arg1, var8.method99((byte) -107), (byte) 119, arg5, arg2, arg7, arg4, arg6, arg3);
                }
            }
            if (var9 != null) {
                if (var9 instanceof class117) {
                    ((class117) var9).field1801.method1320((byte) -127, arg2);
                    return;
                }
                class303.method2006(arg1, var9.method99((byte) -107), (byte) 102, arg5, arg2, arg7, arg4, arg6, arg3);
                return;
            }
            return;
        }
        if (arg6 != 1) {
            if (arg6 == 2) {
                class161 var10 = (class161) class35.method217(arg5, arg3, arg7, field1292 == null ? (field1292 = method700("bs")) : field1292);
                if (var10 != null) {
                    if (arg1 == 11) {
                        arg1 = 10;
                    }
                    if (var10 instanceof class17) {
                        ((class17) var10).field193.method1320((byte) 81, arg2);
                        return;
                    }
                    class303.method2006(arg1, var10.method99((byte) -107), (byte) 102, arg5, arg2, arg7, arg4, arg6, arg3);
                    return;
                }
            } else if (arg6 == 3) {
                class161 var11 = (class161) class404.method2542(arg5, arg3, arg7);
                if (var11 == null) {
                    return;
                }
                if (var11 instanceof class86) {
                    ((class86) var11).field1402.method1320((byte) -127, arg2);
                    return;
                }
                class303.method2006(arg1, var11.method99((byte) -107), (byte) 103, arg5, arg2, arg7, arg4, arg6, arg3);
            } else {
                return;
            }
            return;
        }
        class161 var12 = (class161) class124.method921(arg5, arg3, arg7);
        if (var12 == null) {
            return;
        }
        if (!(var12 instanceof class223)) {
            int var13 = var12.method99((byte) -107);
            if (arg1 != 4 && arg1 != 5) {
                if (arg1 != 6) {
                    if (arg1 == 7) {
                        class303.method2006(4, var13, (byte) 95, arg5, arg2, arg7, (arg4 + 2 & 0x3) + 4, arg6, arg3);
                    } else if (arg1 == 8) {
                        class303.method2006(4, var13, (byte) 95, arg5, arg2, arg7, arg4 + 4, arg6, arg3);
                        class303.method2006(4, var13, (byte) 108, arg5, arg2, arg7, (arg4 + 2 & 0x3) + 4, arg6, arg3);
                        return;
                    }
                    return;
                }
                class303.method2006(4, var13, (byte) 118, arg5, arg2, arg7, arg4 + 4, arg6, arg3);
                return;
            }
            class303.method2006(4, var13, (byte) 98, arg5, arg2, arg7, arg4, arg6, arg3);
            return;
        }
        ((class223) var12).field3411.method1320((byte) -127, arg2);
        return;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 214)
    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field1272 = (short) arg7;
        this.field1271 = (short) arg5;
        this.field1273 = arg9;
        this.field1276 = arg8;
        this.field1274 = (byte) arg0;
        this.field1277 = (short) arg6;
        this.field1278 = arg2;
        this.field1279 = arg3;
        this.field1275 = arg1;
        this.field1283 = (short) arg4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)I")
    public abstract int method101(boolean arg0);
}
