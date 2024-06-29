import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class122 implements class83 {

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Z")
    private boolean field2306 = false;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    private int field2320 = 50;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lpa;")
    private class123 field2302;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "Lpa;")
    private class123 field2328;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Lad;")
    private class43 field2312;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[Z")
    private boolean[] field2295;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "[Z")
    private boolean[] field2322;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[B")
    private byte[] field2310;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "[S")
    private short[] field2323;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "[B")
    private byte[] field2314;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[B")
    private byte[] field2300;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[Z")
    private boolean[] field2301;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "[Z")
    private boolean[] field2319;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[B")
    private byte[] field2304;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[Z")
    private boolean[] field2303;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Z")
    public static boolean field2321 = false;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "Loj;")
    public static class17 field2326 = new class17(200);

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "Lhh;")
    private static class163 field2327 = class137.method1065("Loading title screen )2 ", 17);

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "Lhh;")
    public static class163 field2333 = field2327;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field2331 = 0;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "Lhh;")
    private static class163 field2330 = class137.method1065("scroll:", 17);

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "Lhh;")
    public static class163 field2334 = field2330;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "Lhh;")
    public static class163 field2332 = field2330;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lpa;")
    public static class123 field2305;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)Z")
    public final boolean method672(int arg0, int arg1) {
        field2298++;
        if (arg0 != 32678) {
            this.field2328 = null;
        }
        return this.field2301[arg1];
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public final void method951(int arg0) {
        this.field2312.method320((byte) 126);
        if (arg0 != 1) {
            this.field2328 = null;
        }
        field2307++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z")
    public final boolean method668(byte arg0, int arg1) {
        field2308++;
        if (arg0 <= 32) {
            this.method957(-99, -111);
        }
        return this.field2322[arg1];
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)V")
    public final void method952(int arg0, boolean arg1) {
        field2311++;
        this.field2306 = arg1;
        if (arg0 != 255) {
            this.method952(88, false);
        }
        this.method951(arg0 - 254);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method953(int arg0) {
        field2327 = null;
        field2326 = null;
        if (arg0 != 0) {
            field2331 = -27;
        }
        field2330 = null;
        field2332 = null;
        field2305 = null;
        field2334 = null;
        field2333 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(ZI)Lsc;")
    private final class217 method954(boolean arg0, int arg1) {
        field2324++;
        class217 var3 = (class217) this.field2312.method326((long) arg1, (byte) -124);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2328.method973(arg1, arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            class81 var5 = new class81(var4);
            class217 var6 = new class217(var5);
            this.field2312.method328(8690, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lhh;IJILhh;SI)V")
    public static final void method955(class163 arg0, int arg1, long arg2, int arg3, class163 arg4, short arg5, int arg6) {
        field2297++;
        if (class130.field2530 || arg3 != -2 || class202.field3647 >= 500) {
            return;
        }
        class62.field1047[class202.field3647] = arg4;
        class60.field993[class202.field3647] = arg0;
        class4.field76[class202.field3647] = arg5;
        class51.field860[class202.field3647] = arg2;
        class23.field375[class202.field3647] = arg1;
        class213.field3882[class202.field3647] = arg6;
        class202.field3647++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BII)I")
    public static final int method956(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        field2315++;
        if (arg3 == 15953) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                var4 = class153.field2857[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)Z")
    public final boolean method671(boolean arg0, int arg1) {
        class217 var3 = this.method954(true, arg1);
        field2318++;
        if (arg0) {
            method955((class163) null, 1, -90L, -50, (class163) null, (short) -112, 60);
        }
        return var3 == null ? false : var3.method1540(this.field2302, this, (byte) -124);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)Z")
    public final boolean method670(int arg0, int arg1) {
        field2299++;
        if (this.field2306 || this.field2295[arg0]) {
            return true;
        } else {
            if (arg1 != 0) {
                this.field2310 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I")
    public final int[] method667(int arg0, int arg1) {
        class217 var3 = this.method954(true, arg0);
        int var4 = 42 / ((arg1 - 52) / 61);
        field2309++;
        return var3 == null ? null : var3.method1543(this.field2306 || this.field2295[arg0], (byte) -105, this.field2302, this);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)I")
    public final int method669(int arg0, int arg1) {
        int var3 = 115 / ((-arg0 - 17) / 54);
        field2325++;
        return this.field2323[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(II)V")
    public final void method957(int arg0, int arg1) {
        field2313++;
        if (arg1 != 65535) {
            this.field2300 = null;
        }
        for (class217 var3 = (class217) this.field2312.method324(arg1 - 78969); var3 != null; var3 = (class217) this.field2312.method318((byte) -128)) {
            if (var3.field3958) {
                var3.method1546((byte) 93, arg0);
                var3.field3958 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(FII)[I")
    public final int[] method666(float arg0, int arg1, int arg2) {
        field2296++;
        if (arg2 > -110) {
            method955((class163) null, 36, 104L, -88, (class163) null, (short) -57, -46);
        }
        class217 var4 = this.method954(true, arg1);
        if (var4 == null) {
            return null;
        } else {
            var4.field3958 = true;
            return var4.method1542(this.field2302, (byte) -58, arg0, this.field2306 || this.field2295[arg1], this);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lpa;Lpa;Lpa;IZ)V")
    public class122(class123 arg0, class123 arg1, class123 arg2, int arg3, boolean arg4) {
        this.field2302 = arg2;
        this.field2328 = arg0;
        this.field2306 = arg4;
        this.field2320 = arg3;
        this.field2312 = new class43(this.field2320);
        class81 var6 = new class81(arg1.method973(0, true, 0));
        int var7 = var6.method658(114);
        this.field2295 = new boolean[var7];
        this.field2322 = new boolean[var7];
        this.field2310 = new byte[var7];
        this.field2323 = new short[var7];
        this.field2314 = new byte[var7];
        this.field2300 = new byte[var7];
        this.field2301 = new boolean[var7];
        this.field2319 = new boolean[var7];
        this.field2304 = new byte[var7];
        this.field2303 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field2303[var8] = var6.method622(true) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field2303[var9]) {
                this.field2301[var9] = var6.method622(true) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field2303[var10]) {
                this.field2322[var10] = var6.method622(true) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field2303[var11]) {
                this.field2295[var11] = var6.method622(true) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field2303[var12]) {
                this.field2319[var12] = var6.method622(true) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field2303[var13]) {
                this.field2304[var13] = var6.method635(97);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field2303[var14]) {
                this.field2300[var14] = var6.method635(101);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field2303[var15]) {
                this.field2314[var15] = var6.method635(-59);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field2303[var16]) {
                this.field2310[var16] = var6.method635(-34);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field2303[var17]) {
                this.field2323[var17] = (short) var6.method658(-80);
            }
        }
    }
}
