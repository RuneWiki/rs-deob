import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Z")
    public boolean field1267 = true;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Ltd;")
    private static class136 field1266 = class145.method1172("To create a new account you need to", 45);

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Ltd;")
    public static class136 field1269 = field1266;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Ltd;")
    private static class136 field1272 = class145.method1172("wishes to duel with you)3", 45);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Ltd;")
    public static class136 field1279 = class145.method1172("titlebutton", 45);

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Ltd;")
    public static class136 field1275 = field1272;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lpd;")
    public static class108 field1278;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lnb;")
    public static class92 field1264;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[I")
    public static int[] field1277;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lke;I)I")
    public static final int method444(class74 arg0, int arg1) {
        if (arg1 == 0) {
            field1261++;
            class85 var2 = (class85) class113.field2617.method109(121, ((long) arg0.field1663 << 32) + ((long) arg0.field1635));
            return var2 == null ? arg0.field1574 : var2.field2002;
        } else {
            return 61;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method445(int arg0) {
        class19.field401.method346(-724);
        field1270++;
        int var1 = 0;
        if (arg0 != 11097) {
            field1264 = null;
        }
        while (var1 < 32) {
            class93.field2198[var1] = 0L;
            var1++;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class63.field1353[var2] = 0L;
        }
        class121.field2814 = 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public static void method446(boolean arg0) {
        if (arg0) {
            field1266 = null;
        }
        field1279 = null;
        field1278 = null;
        field1277 = null;
        field1264 = null;
        field1272 = null;
        field1266 = null;
        field1269 = null;
        field1275 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1268 = arg1;
        this.field1274 = arg5;
        this.field1263 = arg2;
        this.field1271 = arg4;
        this.field1267 = arg6;
        this.field1273 = arg0;
        this.field1276 = arg3;
    }
}
