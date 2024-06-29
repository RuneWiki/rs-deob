import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class15 {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
    private int[] field308;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[I")
    public static int[] field306 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[I")
    public static int[] field303 = new int[500];

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Z")
    public static boolean field312 = false;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "[[I")
    public static int[][] field315 = new int[104][104];

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lae;")
    public static class6 field314 = class64.method474(105, "::noclip");

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lae;")
    public static class6 field310 = class64.method474(126, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lbd;")
    public static class12 field313 = new class12(64);

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lae;")
    public static class6 field317 = class64.method474(113, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lae;")
    private static class6 field318 = class64.method474(107, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Lae;")
    public static class6 field319 = field318;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lsd;")
    public static class114 field311;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "[I")
    public static int[] field316;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILbf;Lbf;IZ)Lod;", line = 4)
    public static final class90 method164(int arg0, class14 arg1, class14 arg2, int arg3, boolean arg4) {
        field307++;
        int var5 = 56 / ((-arg3 - 53) / 52);
        int[] var6 = arg1.method141(-1, arg0);
        boolean var7 = true;
        for (int var8 = 0; var8 < var6.length; var8++) {
            byte[] var9 = arg1.method149((byte) -115, arg0, var6[var8]);
            if (var9 == null) {
                var7 = false;
            } else {
                int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
                byte[] var11;
                if (arg4) {
                    var11 = arg2.method149((byte) -123, 0, var10);
                } else {
                    var11 = arg2.method149((byte) -124, var10, 0);
                }
                if (var11 == null) {
                    var7 = false;
                }
            }
        }
        if (!var7) {
            return null;
        }
        try {
            return new class90(arg1, arg2, arg0, arg4);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 72)
    public static void method165(int arg0) {
        field303 = null;
        field306 = null;
        field317 = null;
        field313 = null;
        field314 = null;
        field310 = null;
        field319 = null;
        field315 = null;
        field311 = null;
        field318 = null;
        int var1 = 126 % ((-arg0 - 3) / 52);
        field316 = null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([I)V", line = 102)
    public class15(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field308 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field308[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field308[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field308[var5 + var5] = arg0[var4];
            this.field308[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)I", line = 141)
    public final int method166(boolean arg0, int arg1) {
        field309++;
        int var3 = this.field308.length - 2;
        if (!arg0) {
            method165(-19);
        }
        int var4 = arg1 << 1 & var3;
        while (true) {
            int var5 = this.field308[var4];
            if (arg1 == var5) {
                return this.field308[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }
}
