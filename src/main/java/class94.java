import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class94 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1453 = 0;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1454 = -1;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1458 = 0;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lh;")
    public static class271 field1459 = new class271(0, 0);

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1463 = -1;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1464 = new String[200];

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Llf;")
    public static class211 field1460 = new class211(64);

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "[[I")
    public static int[][] field1465 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lkf;")
    public static class180 field1461;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[I")
    public static int[] field1462;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V")
    public static final void method626(int arg0, int arg1, byte arg2) {
        field1457++;
        class287 var3 = class261.method1786(arg1, false, 13);
        var3.method1914((byte) 46);
        var3.field4547 = arg0;
        if (arg2 != -92) {
            field1463 = 61;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Ldb;")
    public static final class17 method627(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        return var3 == null || var3.field635 == null ? null : var3.field635;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method628(byte arg0) {
        class13.field165.method892(111, (byte) -22);
        if (arg0 == -53) {
            class13.field165.method223(-1720191288, class246.field3949);
            class27.field373++;
            field1456++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public static void method629(byte arg0) {
        field1460 = null;
        int var1 = -122 / ((-arg0 - 3) / 42);
        field1465 = null;
        field1459 = null;
        field1461 = null;
        field1464 = null;
        field1462 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lef;I)Ljava/lang/String;")
    public static final String method630(class214 arg0, int arg1) {
        if (arg1 <= 110) {
            return null;
        }
        field1455++;
        if (client.method1038(arg0).method492((byte) -118) == 0) {
            return null;
        } else if (arg0.field3384 == null || arg0.field3384.trim().length() == 0) {
            return class22.field270 ? "Hidden-use" : null;
        } else {
            return arg0.field3384;
        }
    }
}
