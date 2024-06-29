import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class79 {

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "[I")
    public static int[] field1172 = new int[99];

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1176;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lum;")
    public static class82 field1173;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "[[Z")
    public static boolean[][] field1174;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 15)
    public static void method548(int arg0) {
        field1173 = null;
        if (arg0 == 0) {
            field1172 = null;
            field1176 = null;
            field1174 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)Lfc;", line = 37)
    public static final class183 method549(byte arg0, int arg1) {
        field1167++;
        class183 var2 = (class183) class220.field3493.method1294((long) arg1, 115);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class245.field3852.method2103(0, 1, arg1);
        if (arg0 >= -44) {
            method549((byte) 109, 66);
        }
        class183 var4 = new class183();
        if (var3 != null) {
            var4.method1266(new class303(var3), (byte) -16, arg1);
        }
        class220.field3493.method1292((long) arg1, -112, var4);
        return var4;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1172[var1] = var0 / 4;
        }
        field1176 = "Cancel";
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public abstract void method157(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public abstract void method159(int arg0, int arg1);
}
