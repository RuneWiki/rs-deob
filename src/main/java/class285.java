import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class285 {

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Ljn;")
    private class668 field3863;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Ljn;")
    private class668 field3855;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lwo;")
    public static class690 field3859 = new class690(75, 0);

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field3864 = 0;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field3861 = 0;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "[[I")
    public static int[][] field3865 = new int[6][];

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Leea;")
    private class116 field3856;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[I")
    public static int[] field3868;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[[S")
    public static short[][] field3860;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 4)
    public static void method1702(int arg0) {
        if (arg0 != 28549) {
            field3862 = 10;
        }
        field3859 = null;
        field3865 = null;
        field3860 = null;
        field3868 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Leea;", line = 18)
    private final class116 method1703(boolean arg0) {
        if (this.field3856 == null) {
            this.field3856 = new class116();
        }
        if (arg0) {
            this.method1703(false);
        }
        field3857++;
        return this.field3856;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIB)V", line = 32)
    public static final void method1704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field3858++;
        int var7 = 54 / ((-arg6 - 27) / 59);
        class341[] var8 = class631.field9068;
        for (int var9 = 0; var9 < var8.length; var9++) {
            class341 var10 = var8[var9];
            if (var10 != null && var10.field4508 == 2) {
                class181.method1125(var10.field4507 * 2, arg4 >> 1, var10.field4512, var10.field4504, var10.field4506, 104, arg0, arg5, arg1 >> 1);
                if (class438.field6260[0] > -1 && class543.field7882 % 20 < 10) {
                    class524.field7696[var10.field4510].method3924(arg2 + class438.field6260[0] - 12, arg3 + -28 + class438.field6260[1]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lwba;I)Ld;", line = 63)
    public final class134 method1705(class46 arg0, int arg1) {
        field3867++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == -6423) {
            class161 var3 = arg0.method448((byte) 25);
            if (class9.field91 == var3) {
                return new class582((class39) arg0);
            } else if (class335.field4449 == var3) {
                return new class610(this.method1703(false), (class91) arg0);
            } else if (class299.field4031 == var3) {
                return new class222(this.field3863, (class646) arg0);
            } else if (class518.field7575 == var3) {
                return new class551(this.field3863, (class468) arg0);
            } else if (class331.field4404 == var3) {
                return new class679(this.field3863, this.field3855, (class435) arg0);
            } else if (class659.field9371 == var3) {
                return new class101(this.field3863, this.field3855, (class63) arg0);
            } else if (class141.field1770 == var3) {
                return new class704(this.field3863, this.field3855, (class567) arg0);
            } else if (class557.field8055 == var3) {
                return new class334(this.field3863, this.field3855, (class403) arg0);
            } else if (class564.field8148 == var3) {
                return new class219(this.field3863, (class356) arg0);
            } else if (class531.field7748 == var3) {
                return new class240(this.field3863, this.field3855, (class277) arg0);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Ljn;Ljn;)V", line = 123)
    public class285(class668 arg0, class668 arg1) {
        this.field3863 = arg0;
        this.field3855 = arg1;
    }
}
