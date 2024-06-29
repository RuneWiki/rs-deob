import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class172 {

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Ldl;")
    public static class31 field3212 = null;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lsg;")
    public static class30 field3211 = class167.method1221((byte) 33, "zap");

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lsg;")
    public static class30 field3210 = class167.method1221((byte) 33, "Lade)3)3)3");

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lsg;")
    public static class30 field3222 = class167.method1221((byte) 33, "leuchten3:");

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lsg;")
    public static class30 field3223 = class167.method1221((byte) 33, ":clanreq:");

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Le;")
    public class130 field3219;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lmc;")
    public static class151 field3215;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lmc;")
    public static class151 field3220;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lbj;")
    public static class44 field3218;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[I")
    public int[] field3217;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z")
    public static final boolean method1263(int arg0, int arg1) {
        field3221++;
        if (arg0 != 1) {
            field3223 = null;
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
    public static final void method1264(int arg0, int arg1, int arg2, int arg3) {
        field3213++;
        int var4 = -5 % ((56 - arg3) / 47);
        class30 var5 = class160.method1188(new class30[] { class110.field2209, class73.method675(-61, arg0), class103.field2079, class73.method675(-86, arg1 >> 6), class103.field2079, class73.method675(4, arg2 >> 6), class103.field2079, class73.method675(-79, arg1 & 0x3F), class103.field2079, class73.method675(-87, arg2 & 0x3F) }, 0);
        var5.method284(true);
        class55.method528(var5, 2);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method1265(int arg0) {
        field3216++;
        class208.field3730 = new class157(32);
        if (arg0 > -92) {
            method1263(-2, -84);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static void method1266(int arg0) {
        field3223 = null;
        field3212 = null;
        field3220 = null;
        field3218 = null;
        if (arg0 != 2408) {
            field3212 = null;
        }
        field3215 = null;
        field3222 = null;
        field3211 = null;
        field3210 = null;
    }
}
