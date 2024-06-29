import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class90 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lhb;")
    public static class44 field2294 = class102.method810("Wen m-Ochten Sie entfernen?", -28606);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lhb;")
    public static class44 field2303 = class102.method810(": ", -28606);

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2300 = -1;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2304 = -1;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lhb;")
    public static class44 field2295 = class102.method810("backvmid1", -28606);

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2301 = 0;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Z")
    public static volatile boolean field2309 = false;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "[I")
    public static int[] field2311 = new int[5];

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lhb;")
    private static class44 field2308 = class102.method810("purple:", -28606);

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lhb;")
    public static class44 field2302 = field2308;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lne;")
    public static class83 field2307;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Loe;")
    public static class89 field2306;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method726(int arg0, int arg1) {
        field2299++;
        if (arg0 != -49) {
            method728(114, 43);
        }
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Lm;", line = 23)
    public static final class72 method727(int arg0, int arg1) {
        field2296++;
        int var2 = arg0 & 0xFFFF;
        int var3 = arg0 >> 16;
        if (class113.field2777[var3] == null || class113.field2777[var3][var2] == null) {
            boolean var4 = class94.method748(9902, var3);
            if (!var4) {
                return null;
            }
        }
        if (arg1 != -160) {
            field2302 = null;
        }
        return class113.field2777[var3][var2];
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)Lmb;", line = 89)
    public static final class74 method728(int arg0, int arg1) {
        if (arg1 != 3) {
            method728(126, -58);
        }
        class74 var2 = (class74) class105.field2676.method330((long) arg0, -1);
        field2297++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class11.field216.method892(3, arg0, false);
        class74 var4 = new class74();
        if (var3 != null) {
            var4.method623((byte) 90, new class131(var3));
        }
        class105.field2676.method332(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 119)
    public static void method729(int arg0) {
        field2307 = null;
        field2308 = null;
        field2303 = null;
        field2295 = null;
        field2302 = null;
        field2306 = null;
        field2311 = null;
        field2294 = null;
        if (arg0 < 125) {
            field2309 = false;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(II)Z", line = 144)
    public static final boolean method730(int arg0, int arg1) {
        field2312++;
        if (arg0 < 32) {
            return false;
        }
        if (arg1 != -160) {
            method728(-13, 43);
        }
        if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }
}
