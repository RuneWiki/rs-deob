import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class57 extends class47 {

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    private final int field967;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    private final int field966;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    private final int field961;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    private final int field962;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Lmb;")
    public static class132 field957 = class166.method1092("(R", 111);

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field968 = 99;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field959 = 0;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Lgd;")
    public static class70 field964 = new class70();

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "[Lmb;")
    public static class132[] field973 = new class132[1000];

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field974 = 0;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Lga;")
    public static class68 field970;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method382(int arg0) {
        ++field972;
        for (class73 var1 = (class73) class55.field927.method811((byte) -4); var1 != null; var1 = (class73) class55.field927.method807(-19009)) {
            int var2 = var1.field1216;
            if (class137.method933(256, var2)) {
                boolean var3 = true;
                class96[] var4 = class97.field1866[var2];
                for (int var5 = 0; var5 < var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1766;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2760;
                    class96 var7 = class158.method1029((byte) -122, var6);
                    if (var7 != null) {
                        class183.method1174(var7, 16235);
                    }
                }
            }
        }
        if (arg0 < 109) {
            method382(122);
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIIII)V")
    public class57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field967 = arg1;
        this.field966 = arg2;
        this.field961 = arg3;
        this.field962 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        ++field971;
        int var4 = this.field967 * arg0 >> 12;
        int var5 = this.field961 * arg0 >> 12;
        int var6 = this.field966 * arg1 >> 12;
        if (arg2 != 1832079585) {
            method383(49);
        }
        int var7 = this.field962 * arg1 >> 12;
        class187.method1194(var4, super.field818, var6, super.field817, var7, super.field803, var5, false);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)V")
    public final void method318(int arg0, byte arg1, int arg2) {
        ++field963;
        int var4 = this.field962 * arg2 >> 12;
        if (arg1 <= 29) {
            this.method310(74, false, -110);
        }
        int var5 = this.field966 * arg2 >> 12;
        int var6 = this.field967 * arg0 >> 12;
        int var7 = this.field961 * arg0 >> 12;
        class225.method1439(93, var4, var5, var6, var7, super.field818);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZI)V")
    public final void method310(int arg0, boolean arg1, int arg2) {
        int var4 = this.field962 * arg0 >> 12;
        if (arg1) {
            int var5 = this.field966 * arg0 >> 12;
            int var6 = this.field967 * arg2 >> 12;
            ++field965;
            int var7 = this.field961 * arg2 >> 12;
            class218.method1359(super.field803, var6, super.field817, var7, 2, var5, var4);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static void method383(int arg0) {
        field973 = null;
        field957 = null;
        if (arg0 != 0) {
            method382(-16);
        }
        field964 = null;
        field970 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
    public static final boolean method384(int arg0, int arg1) {
        ++field958;
        if (arg0 != 97) {
            method384(9, 66);
        }
        return arg1 >= 97 && arg1 <= 122 || ~arg1 <= -66 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V")
    public static final void method385(int arg0, boolean arg1) {
        if (class141.field2647 == null || arg0 > class141.field2647.length) {
            class141.field2647 = new int[arg0];
        }
        if (!arg1) {
            ++field969;
        }
    }
}
