import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class217 extends class30 {

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field3550 = 0;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field3552 = -1;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3553 = "Ok";

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    private int field3545;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    private int field3547;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "Lmo;")
    public static class447 field3546;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V", line = 4)
    private final void method1552(int arg0, int arg1) {
        this.field3547 = arg0 >> 12 & 4080;
        this.field3549 = 4080 & arg0 >> 4;
        ++field3551;
        this.field3545 = (arg0 & 255) << 4;
        if (arg1 != 2) {
            field3553 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V", line = 31)
    public static final void method1553(int arg0) {
        ++field3554;
        class362.field5525.method336(109);
        if (arg0 >= -100) {
            method1554(117);
        }
        class121.field1663.method336(122);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)[[I", line = 49)
    public final int[][] method203(byte arg0, int arg1) {
        if (arg0 != -93) {
            return null;
        } else {
            ++field3548;
            int[][] var3 = super.field360.method2803(arg1, true);
            if (super.field360.field6566) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class369.field5610; ++var7) {
                    var4[var7] = this.field3547;
                    var5[var7] = this.field3549;
                    var6[var7] = this.field3545;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V", line = 88)
    private class217(int arg0) {
        super(0, false);
        this.method1552(arg0, 2);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljg;II)V", line = 96)
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field3559;
        if (~arg2 == -1) {
            this.method1552(arg0.method1275(-1), 2);
        }
        if (arg1 != 6456) {
            this.field3549 = -38;
        }
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V", line = 123)
    public static void method1554(int arg0) {
        int var1 = -5 % ((arg0 - -35) / 40);
        field3546 = null;
        field3553 = null;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 133)
    public class217() {
        this(0);
    }
}
