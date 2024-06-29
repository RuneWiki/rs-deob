import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class68 extends class172 {

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field1188 = 0;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "Lid;")
    public static class149 field1183 = class60.method382(" x ", (byte) 114);

    @OriginalMember(owner = "client!af", name = "P", descriptor = "Lid;")
    private static class149 field1195 = class60.method382("white:", (byte) 5);

    @OriginalMember(owner = "client!af", name = "E", descriptor = "Lid;")
    public static class149 field1184 = field1195;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Lid;")
    public static class149 field1190 = field1195;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "Lnc;")
    private class85 field1181;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "[[[B")
    public static byte[][][] field1189;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lgd;BI)V")
    private final void method417(class74 arg0, byte arg1, int arg2) {
        field1193++;
        if (arg2 == 249) {
            int var4 = arg0.method489((byte) -127);
            if (this.field1181 == null) {
                int var5 = class5.method30(118, var4);
                this.field1181 = new class85(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method489((byte) 88) == 1;
                int var8 = arg0.method525(65280);
                class64 var9;
                if (var7) {
                    var9 = new class15(arg0.method529(-1));
                } else {
                    var9 = new class143(arg0.method498((byte) 125));
                }
                this.field1181.method638((byte) -89, var9, (long) var8);
            }
        }
        if (arg1 > -36) {
            field1190 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)Lmg;")
    public static final class264 method418(boolean arg0, int arg1) {
        class264 var2 = (class264) class9.field118.method1293((long) arg1, arg0);
        field1180++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class237.field4153.method1562(-809612665, arg1, 32);
        class264 var4 = new class264();
        if (var3 != null) {
            var4.method1839(new class74(var3), 0);
        }
        var4.method1836((byte) -44);
        class9.field118.method1295((long) arg1, var4, (byte) -71);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILgd;)V")
    public final void method419(int arg0, class74 arg1) {
        if (arg0 != -1) {
            field1183 = null;
        }
        field1182++;
        while (true) {
            int var3 = arg1.method489((byte) -121);
            if (var3 == 0) {
                return;
            }
            this.method417(arg1, (byte) -126, var3);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
    public final int method420(int arg0, int arg1, int arg2) {
        field1187++;
        if (this.field1181 == null) {
            return arg1;
        }
        if (arg0 != 0) {
            this.method417((class74) null, (byte) -62, -42);
        }
        class143 var4 = (class143) this.field1181.method639((byte) -82, (long) arg2);
        return var4 == null ? arg1 : var4.field2606;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lke;IBIIII)V")
    public static final void method421(class108 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        if (arg6 == 0) {
            var7 = class108.method756(arg4, arg1, arg5);
        } else if (arg6 == 1) {
            var7 = class157.method1139(arg4, arg1, arg5);
        } else if (arg6 == 2) {
            var7 = class165.method1210(arg4, arg1, arg5);
        } else if (arg6 == 3) {
            var7 = class133.method931(arg4, arg1, arg5);
        }
        field1186++;
        if (arg2 != 36) {
            field1188 = 36;
        }
        boolean var9 = false;
        boolean var10 = false;
        int var11 = ((int) var7 & 0x333ECA) >> 20;
        boolean var12 = true;
        int var13 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class268 var14 = class108.method755(11525, var13);
        int var15 = ((int) var7 & 0x7F451) >> 14;
        if (var14.method1855((byte) -95)) {
            class249.method1735(arg4, arg5, -75, arg1, var14);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg6 == 0) {
            class26.method145(arg4, arg1, arg5);
            if (var14.field4831 != 0) {
                arg0.method749(arg5, arg2 - 37, arg1, var15, var11, var14.field4801);
                return;
            }
            return;
        }
        if (arg6 == 1) {
            class43.method253(arg4, arg1, arg5);
            return;
        }
        if (arg6 != 2) {
            if (arg6 == 3) {
                class109.method769(arg4, arg1, arg5);
                if (var14.field4831 == 1) {
                    arg0.method761(arg5, -95, arg1);
                    return;
                }
            }
            return;
        }
        class210.method1432(arg4, arg1, arg5);
        if (var14.field4831 != 0 && (var14.field4820 + arg1) < 104 && (arg5 + var14.field4820) < 104 && var14.field4787 + arg1 < 104 && (arg5 + var14.field4787) < 104) {
            arg0.method762(var14.field4801, (byte) -61, arg5, var14.field4820, arg1, var14.field4787, var11);
            return;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)V")
    public static final void method422(byte arg0, int arg1, int arg2) {
        field1192++;
        class208.field3720.method162(arg0 ^ 0x5E, 132);
        class275.field4915++;
        class208.field3720.method481(arg2, 122);
        if (arg0 != 92) {
            field1195 = null;
        }
        class208.field3720.method509(arg1, arg0 ^ 0x5FE5F00C);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BILid;)Lid;")
    public final class149 method423(byte arg0, int arg1, class149 arg2) {
        field1185++;
        if (this.field1181 == null) {
            return arg2;
        }
        if (arg0 != -122) {
            this.method420(-128, -99, 7);
        }
        class15 var4 = (class15) this.field1181.method639((byte) -59, (long) arg1);
        return var4 == null ? arg2 : var4.field216;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
    public static final void method424(int arg0, int arg1, int arg2) {
        int var3 = -120 % ((60 - arg0) / 62);
        field1191++;
        if (class44.field667 != 0 && arg1 != -1) {
            class78.method592(0, false, arg1, class74.field1294, class44.field667, (byte) 99);
            class71.field1241 = true;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public static void method425(int arg0) {
        field1183 = null;
        field1189 = null;
        field1195 = null;
        field1184 = null;
        if (arg0 > -86) {
            method424(104, 88, -36);
        }
        field1190 = null;
    }
}
