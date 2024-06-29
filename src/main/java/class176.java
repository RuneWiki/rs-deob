import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class176 extends class259 {

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "Lcc;")
    private class209 field3217 = class173.field3158;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "Lcc;")
    private static class209 field3200 = class95.method669(109, "K");

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field3201 = 0;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "Lcc;")
    public static class209 field3195 = class95.method669(82, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "Lcc;")
    public static class209 field3207 = class95.method669(101, "<col=ff0000>");

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "Lcc;")
    public static class209 field3211 = class95.method669(97, " s(West d-Bconnect-B)3");

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "Lcc;")
    public static class209 field3215 = null;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field3202 = 127;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "Lcc;")
    public static class209 field3216 = class95.method669(111, "Fichiers config charg-Bs");

    @OriginalMember(owner = "client!hg", name = "db", descriptor = "Lcc;")
    public static class209 field3221 = field3200;

    @OriginalMember(owner = "client!hg", name = "bb", descriptor = "Lcc;")
    public static class209 field3219 = field3200;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    private int field3210;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!hg", name = "cb", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!hg", name = "eb", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!hg", name = "fb", descriptor = "Lal;")
    public static class231 field3223;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "Lta;")
    private class255 field3198;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "Lta;")
    public class255 field3205;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ltf;BI)V")
    private final void method1206(class106 arg0, byte arg1, int arg2) {
        int var4 = -5 / ((arg1 - 44) / 33);
        field3214++;
        if (arg2 == 1) {
            this.field3204 = arg0.method774((byte) 113);
        } else if (arg2 == 2) {
            this.field3199 = arg0.method774((byte) 108);
        } else if (arg2 == 3) {
            this.field3217 = arg0.method755(1);
        } else if (arg2 == 4) {
            this.field3210 = arg0.method746((byte) -100);
        } else if (arg2 == 5 || arg2 == 6) {
            int var5 = arg0.method736(126);
            this.field3205 = new class255(class136.method943((byte) 19, var5));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg0.method746((byte) -100);
                class34 var8;
                if (arg2 == 5) {
                    var8 = new class275(arg0.method755(1));
                } else {
                    var8 = new class18(arg0.method746((byte) -100));
                }
                this.field3205.method1762(var8, (long) var7, (byte) 73);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)Z")
    public final boolean method1207(int arg0, byte arg1) {
        field3212++;
        if (this.field3205 == null) {
            return false;
        }
        if (this.field3198 == null) {
            this.method1212(-17509);
        }
        class18 var3 = (class18) this.field3198.method1755((long) arg0, (byte) -103);
        if (arg1 <= 104) {
            field3202 = -57;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
    private final void method1208(int arg0) {
        if (arg0 != -1) {
            return;
        }
        this.field3198 = new class255(this.field3205.method1764((byte) 16));
        field3213++;
        for (class275 var2 = (class275) this.field3205.method1759((byte) 43); var2 != null; var2 = (class275) this.field3205.method1767((byte) 41)) {
            class138 var3 = new class138(var2.field4864, (int) var2.field596);
            this.field3198.method1762(var3, var2.field4864.method1446(false), (byte) 73);
        }
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V")
    public static void method1209(int arg0) {
        field3195 = null;
        field3207 = null;
        if (arg0 != -13288) {
            method1218((class111) null, -99);
        }
        field3216 = null;
        field3221 = null;
        field3219 = null;
        field3223 = null;
        field3200 = null;
        field3211 = null;
        field3215 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
    public static final void method1210(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3197++;
        method1215(arg3 - arg2, arg1, class252.field4543[arg4], arg2 + arg3, (byte) -25);
        int var5 = 0;
        if (arg0 != 15979) {
            field3202 = -78;
        }
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class252.field4543[arg4 + var6];
                var7 -= var6 << 1;
                int[] var10 = class252.field4543[arg4 - var6];
                int var11 = arg3 - var5;
                int var12 = arg3 + var5;
                method1215(var11, arg1, var9, var12, (byte) 124);
                method1215(var11, arg1, var10, var12, (byte) -4);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class252.field4543[arg4 + var5];
            int[] var16 = class252.field4543[arg4 - var5];
            method1215(var14, arg1, var15, var13, (byte) -117);
            method1215(var14, arg1, var16, var13, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ltf;I)V")
    public final void method1211(class106 arg0, int arg1) {
        if (arg1 < 115) {
            this.method1217((class209) null, (byte) 119);
        }
        while (true) {
            int var3 = arg0.method774((byte) 99);
            if (var3 == 0) {
                field3222++;
                return;
            }
            this.method1206(arg0, (byte) -2, var3);
        }
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "(I)V")
    private final void method1212(int arg0) {
        field3208++;
        this.field3198 = new class255(this.field3205.method1764((byte) 75));
        if (arg0 != -17509) {
            this.method1217((class209) null, (byte) 31);
        }
        for (class18 var2 = (class18) this.field3205.method1759((byte) 43); var2 != null; var2 = (class18) this.field3205.method1767((byte) 41)) {
            class18 var3 = new class18((int) var2.field596);
            this.field3198.method1762(var3, (long) var2.field363, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(II)I")
    public final int method1213(int arg0, int arg1) {
        field3220++;
        if (this.field3205 == null) {
            return this.field3210;
        }
        if (arg0 < 76) {
            this.method1212(11);
        }
        class18 var3 = (class18) this.field3205.method1755((long) arg1, (byte) -77);
        return var3 == null ? this.field3210 : var3.field363;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)[Lij;")
    public static final class194[] method1214(byte arg0) {
        field3196++;
        class194[] var1 = new class194[class191.field3465];
        if (arg0 < 63) {
            return null;
        }
        for (int var2 = 0; var2 < class191.field3465; var2++) {
            var1[var2] = new class194(class241.field4360, class50.field996, class182.field3289[var2], class271.field4815[var2], class110.field2226[var2], class185.field3332[var2], class202.field3638[var2], class117.field2341);
        }
        class63.method468(114);
        return var1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[IIB)V")
    public static final void method1215(int arg0, int arg1, int[] arg2, int arg3, byte arg4) {
        int var5 = 39 % ((62 - arg4) / 45);
        arg0--;
        field3203++;
        int var14 = arg3 - 1;
        int var6 = var14 - 7;
        while (arg0 < var6) {
            int var7 = arg0 + 1;
            arg2[var7] = arg1;
            int var8 = var7 + 1;
            arg2[var8] = arg1;
            int var9 = var8 + 1;
            arg2[var9] = arg1;
            int var10 = var9 + 1;
            arg2[var10] = arg1;
            int var11 = var10 + 1;
            arg2[var11] = arg1;
            int var12 = var11 + 1;
            arg2[var12] = arg1;
            int var13 = var12 + 1;
            arg2[var13] = arg1;
            arg0 = var13 + 1;
            arg2[arg0] = arg1;
        }
        while (arg0 < var14) {
            arg0++;
            arg2[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IB)Lcc;")
    public final class209 method1216(int arg0, byte arg1) {
        field3209++;
        if (this.field3205 == null) {
            return this.field3217;
        } else {
            int var3 = -80 % ((arg1 - 6) / 44);
            class275 var4 = (class275) this.field3205.method1755((long) arg0, (byte) -109);
            return var4 == null ? this.field3217 : var4.field4864;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lcc;B)Z")
    public final boolean method1217(class209 arg0, byte arg1) {
        field3218++;
        if (this.field3205 == null) {
            return false;
        }
        if (this.field3198 == null) {
            this.method1208(-1);
        }
        if (arg1 != -22) {
            return true;
        }
        for (class138 var3 = (class138) this.field3198.method1755(arg0.method1446(false), (byte) -94); var3 != null; var3 = (class138) this.field3198.method1763(true)) {
            if (var3.field2594.method1457((byte) -83, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lsk;I)V")
    public static final void method1218(class111 arg0, int arg1) {
        field3206++;
        long var2 = 0L;
        int var4 = arg1;
        if (arg0.field2249 == 0) {
            var2 = class227.method1598(arg0.field2235, arg0.field2234, arg0.field2243);
        }
        if (arg0.field2249 == 1) {
            var2 = class118.method840(arg0.field2235, arg0.field2234, arg0.field2243);
        }
        int var5 = 0;
        if (arg0.field2249 == 2) {
            var2 = class278.method1882(arg0.field2235, arg0.field2234, arg0.field2243);
        }
        int var6 = 0;
        if (arg0.field2249 == 3) {
            var2 = class275.method1870(arg0.field2235, arg0.field2234, arg0.field2243);
        }
        if (var2 != 0L) {
            var5 = (int) var2 >> 14 & 0x1F;
            var6 = ((int) var2 & 0x35D29C) >> 20;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg0.field2237 = var6;
        arg0.field2231 = var4;
        arg0.field2247 = var5;
    }
}
