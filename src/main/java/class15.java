import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class15 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lsg;")
    public static class30 field317 = class167.method1221((byte) 33, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Z")
    public static boolean field326 = false;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3) {
        field321++;
        class68 var4 = class103.method830(arg2, 4, 9);
        var4.method608(false);
        int var5 = 22 % ((arg3 - 43) / 60);
        var4.field1484 = arg1;
        var4.field1490 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lsg;")
    public static final class30 method156(int arg0, int arg1) {
        field325++;
        int var2 = 68 % ((54 - arg1) / 45);
        class30 var3 = class73.method675(123, arg0);
        for (int var4 = var3.method249(-88) - 3; var4 > 0; var4 -= 3) {
            var3 = class160.method1188(new class30[] { var3.method274(var4, 0, (byte) 124), class103.field2079, var3.method260((byte) -124, var4) }, 0);
        }
        if (var3.method249(-119) > 9) {
            return class160.method1188(new class30[] { class244.field4368, var3.method274(var3.method249(-74) - 8, 0, (byte) 40), class204.field3653, class104.field2088, var3, class168.field3088 }, 0);
        } else if (var3.method249(-9) > 6) {
            return class160.method1188(new class30[] { class183.field3366, var3.method274(var3.method249(-53) - 4, 0, (byte) 103), class124.field2425, class104.field2088, var3, class168.field3088 }, 0);
        } else {
            return class160.method1188(new class30[] { class117.field2304, var3, class276.field4817 }, 0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILmc;BI)[Lbj;")
    public static final class44[] method157(int arg0, class151 arg1, byte arg2, int arg3) {
        field323++;
        if (class224.method1608(arg3, arg0, arg1, 0)) {
            if (arg2 != -89) {
                field324 = -36;
            }
            return class167.method1225((byte) 21);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lmc;IZ)Lnb;")
    public static final class265 method158(class151 arg0, int arg1, boolean arg2) {
        field318++;
        if (class41.method433(arg1, 0, arg0)) {
            return arg2 ? class174.method1280(19139) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method159(byte arg0) {
        field317 = null;
        if (arg0 < 79) {
            method158((class151) null, 104, false);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static final void method160(int arg0) {
        class196.field3553.method1267(201, -9);
        class196.field3553.method97(class37.field899, (byte) -2);
        class40.field959++;
        field319++;
        if (arg0 != -8) {
            field324 = 44;
        }
    }
}
