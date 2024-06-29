import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class148 extends class136 {

    @OriginalMember(owner = "client!tca", name = "E", descriptor = "[I")
    public static int[] field2272 = new int[120];

    @OriginalMember(owner = "client!tca", name = "H", descriptor = "[I")
    public static int[] field2275 = new int[5];

    @OriginalMember(owner = "client!tca", name = "F", descriptor = "I")
    public static int field2273 = 0;

    @OriginalMember(owner = "client!tca", name = "J", descriptor = "I")
    public static int field2277 = 0;

    @OriginalMember(owner = "client!tca", name = "C", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!tca", name = "D", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!tca", name = "I", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!tca", name = "K", descriptor = "Ljava/lang/Object;")
    public static Object field2278;

    @OriginalMember(owner = "client!tca", name = "G", descriptor = "[B")
    private byte[] field2274;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)V")
    public static void method980(byte arg0) {
        int var1 = 69 % ((arg0 - 75) / 48);
        field2272 = null;
        field2275 = null;
        field2278 = null;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZILdj;ZLjava/lang/String;)V")
    public static final void method981(boolean arg0, int arg1, class288 arg2, boolean arg3, String arg4) {
        if (arg1 != 2) {
            return;
        }
        field2271++;
        if (!arg3) {
            class104.method735(arg2, 3, arg4, false);
            return;
        }
        if (class288.field3967.startsWith("win") && class288.field3965 != 3) {
            String var5 = null;
            if (arg2.field3975 != null) {
                var5 = arg2.field3975.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class382 var6 = class104.method735(arg2, 0, arg4, false);
                class165.field2373 = arg4;
                class40.field800 = arg2;
                class178.field2554 = var6;
                return;
            }
        }
        if (class288.field3967.startsWith("mac")) {
            String var7 = null;
            if (arg2.field3975 != null) {
                var7 = arg2.field3975.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg0) {
                class104.method735(arg2, 1, arg4, false);
                return;
            }
        }
        class104.method735(arg2, 2, arg4, false);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(BIB)V")
    public final void method916(byte arg0, int arg1, byte arg2) {
        field2276++;
        if (arg2 != 114) {
            method981(true, 18, null, false, null);
        }
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var6 = var4 + 1;
        this.field2274[var4] = -1;
        this.field2274[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)[B")
    public final byte[] method982(int arg0, int arg1, int arg2, int arg3) {
        this.field2274 = new byte[arg1 * arg2 * arg0 * arg3];
        field2270++;
        this.method2367(arg1, arg2, true, arg0);
        return this.field2274;
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
    public class148() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2272[var1] = var0 / 4;
        }
    }
}
