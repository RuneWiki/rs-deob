import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class60 extends class93 {

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "Ljd;")
    private static class92 field1240 = class202.method1325((byte) 90, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "Ljd;")
    public static class92 field1249 = field1240;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "[[B")
    public static byte[][] field1243 = new byte[250][];

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "Ljd;")
    private static class92 field1250 = class202.method1325((byte) 90, "Service unavailable)3");

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "Ljd;")
    public static class92 field1251 = class202.method1325((byte) 90, "null");

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "Ljd;")
    public static class92 field1253 = class202.method1325((byte) 90, " ");

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "Ljd;")
    public static class92 field1247 = field1250;

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "Ljd;")
    public static class92 field1255 = class202.method1325((byte) 90, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "[[La;")
    public static class1[][] field1256;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != 4096) {
            field1245 = 123;
        }
        ++field1248;
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (super.field1873.field1656) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class150.field2985; ++var7) {
                var4[var7] = this.field1242;
                var5[var7] = this.field1252;
                var6[var7] = this.field1246;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)V")
    private final void method364(int arg0, int arg1) {
        ++field1241;
        this.field1252 = arg1 >> 4 & 4080;
        this.field1246 = (255 & arg1) << 4;
        this.field1242 = (arg1 & 16711680) >> 12;
        if (arg0 != 0) {
            field1254 = -11;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class60() {
        this(0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (~arg0 == -1) {
            this.method364(0, arg1.method415(116));
        }
        if (arg2 != 0) {
            this.method62(10, 108);
        }
        ++field1244;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
    private class60(int arg0) {
        super(0, false);
        this.method364(0, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    public static void method365(int arg0) {
        field1247 = null;
        if (arg0 >= 112) {
            field1249 = null;
            field1250 = null;
            field1251 = null;
            field1243 = null;
            field1256 = null;
            field1240 = null;
            field1255 = null;
            field1253 = null;
        }
    }
}
