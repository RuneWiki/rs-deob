import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class261 extends class177 {

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    private int field3871 = 4096;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    private int field3873 = 0;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3865 = " has logged out.";

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field3868 = 0;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field3872 = 0;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field3874 = 127;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "Llb;")
    public static class211 field3863;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Lcn;")
    public static class267 field3861;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "[Z")
    public static boolean[] field3867;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lhb;II)V", line = 14)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3873 = arg0.method300(-1394191632);
        } else if (arg2 == 1) {
            this.field3871 = arg0.method300(-1394191632);
        }
        field3869++;
        if (arg1 != -18061) {
            field3868 = 53;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lld;I)V", line = 41)
    public static final void method1800(class121 arg0, int arg1) {
        if (arg1 != -18789) {
            field3862 = -92;
        }
        class117 var2 = (class117) class17.field192.method203(1710, class224.method1597(true, arg0.field1895));
        field3866++;
        if (var2 == null) {
            class51.method468(0, arg0, class50.field775, (class101) null, arg0.field4470[0], arg1 + 18917, arg0.field4477[0], (class45) null);
        } else {
            var2.method908(2);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I", line = 71)
    public final int[] method95(int arg0, int arg1) {
        int[] var3 = this.field2652.method1481(arg1, (byte) -108);
        field3875++;
        if (this.field2652.field3287) {
            int[] var4 = this.method1280(arg1, 0, false);
            for (int var5 = 0; var5 < class287.field4415; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field3873 <= var6 && this.field3871 >= var6 ? 4096 : 0;
            }
        }
        if (arg0 > -52) {
            method1800((class121) null, -30);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 117)
    public class261() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V", line = 121)
    public static void method1801(int arg0) {
        field3861 = null;
        field3867 = null;
        field3863 = null;
        if (arg0 > 37) {
            field3865 = null;
        }
    }
}
