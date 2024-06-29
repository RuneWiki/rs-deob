import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class180 extends class187 {

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public int field2260 = 0;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "Z")
    public boolean field2261 = true;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public int field2265 = 12800;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public int field2262 = 12800;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public int field2254 = -1;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public int field2267 = 0;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    public int field2273 = -1;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "Ljava/lang/String;")
    public String field2258;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "Ljava/lang/String;")
    public String field2252;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "Lmk;")
    public class154 field2259;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "Lph;")
    public static class114 field2253 = new class114(64);

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public static int field2268 = -1;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "Lam;")
    public static class286 field2269;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "[I")
    public static int[] field2271;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V", line = 8)
    public final void method949(byte arg0) {
        field2270++;
        this.field2265 = 12800;
        this.field2260 = 0;
        this.field2262 = 12800;
        this.field2267 = 0;
        class179 var2 = (class179) this.field2259.method814((byte) 90);
        if (arg0 != -52) {
            this.field2261 = false;
        }
        while (var2 != null) {
            if (var2.field2249 > this.field2267) {
                this.field2267 = var2.field2249;
            }
            if (var2.field2238 > this.field2260) {
                this.field2260 = var2.field2238;
            }
            if (this.field2265 > var2.field2232) {
                this.field2265 = var2.field2232;
            }
            if (var2.field2231 < this.field2262) {
                this.field2262 = var2.field2231;
            }
            var2 = (class179) this.field2259.method827(-17);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III[I)Z", line = 47)
    public final boolean method950(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg1 != -12176) {
            this.field2261 = true;
        }
        field2257++;
        for (class179 var5 = (class179) this.field2259.method814((byte) 90); var5 != null; var5 = (class179) this.field2259.method827(3)) {
            if (var5.method945(-118, arg2, arg0)) {
                var5.method944((byte) 107, arg2, arg3, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V", line = 78)
    public static void method951(byte arg0) {
        int var1 = -15 / ((arg0 + 18) / 58);
        field2253 = null;
        field2271 = null;
        field2269 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([IIZII)Z", line = 90)
    public final boolean method952(int[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2255++;
        class179 var6 = (class179) this.field2259.method814((byte) 90);
        if (!arg2) {
            this.method952((int[]) null, 49, true, -118, 75);
        }
        while (var6 != null) {
            if (var6.method942(arg4, arg3, -1, arg1)) {
                var6.method948(0, arg3, arg0, arg1);
                return true;
            }
            var6 = (class179) this.field2259.method827(-127);
        }
        return false;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 204)
    public class180(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field2266 = arg0;
        this.field2261 = arg5;
        this.field2258 = arg1;
        this.field2254 = arg6;
        this.field2256 = arg3;
        this.field2252 = arg2;
        this.field2273 = arg4;
        if (this.field2254 == 255) {
            this.field2254 = 0;
        }
        this.field2259 = new class154();
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([IIIZ)Z", line = 125)
    public final boolean method953(int[] arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.method953((int[]) null, 34, -106, false);
        }
        field2264++;
        for (class179 var5 = (class179) this.field2259.method814((byte) 90); var5 != null; var5 = (class179) this.field2259.method827(68)) {
            if (var5.method943(-1, arg2, arg1)) {
                var5.method948(0, arg1, arg0, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Z", line = 166)
    public final boolean method954(int arg0, int arg1, int arg2) {
        field2263++;
        class179 var4 = (class179) this.field2259.method814((byte) 90);
        if (arg2 != 12800) {
            this.field2254 = -81;
        }
        while (var4 != null) {
            if (var4.method943(-1, arg1, arg0)) {
                return true;
            }
            var4 = (class179) this.field2259.method827(-126);
        }
        return false;
    }
}
