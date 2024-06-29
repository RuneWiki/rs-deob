import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class533 {

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7787 = new Rectangle[100];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILbv;)I")
    public static final int method3131(int arg0, class279 arg1) {
        if (arg0 != -17966) {
            method3132(false);
        }
        field7788++;
        if (class279.field3787 == arg1) {
            return 5120;
        } else if (class279.field3791 == arg1) {
            return 5122;
        } else if (class279.field3792 == arg1) {
            return 5124;
        } else if (class279.field3793 == arg1) {
            return 5121;
        } else if (class279.field3794 == arg1) {
            return 5123;
        } else if (class279.field3795 == arg1) {
            return 5125;
        } else if (class279.field3796 == arg1) {
            return 5131;
        } else if (class279.field3797 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static void method3132(boolean arg0) {
        if (arg0) {
            field7787 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)V")
    public static final synchronized void method3133(byte[] arg0, int arg1) {
        field7785++;
        if (arg1 != 17671) {
            return;
        }
        if (arg0.length == 100 && class425.field6109 < 1000) {
            class637.field9121[class425.field6109++] = arg0;
        } else if (arg0.length == 5000 && class216.field2803 < 250) {
            class156.field1915[class216.field2803++] = arg0;
        } else if (arg0.length == 30000 && class197.field2390 < 50) {
            class53.field861[class197.field2390++] = arg0;
        } else if (class74.field1106 != null) {
            for (int var2 = 0; var2 < class564.field8152.length; var2++) {
                if (class564.field8152[var2] == arg0.length && class378.field5076[var2] < class74.field1106[var2].length) {
                    class74.field1106[var2][class378.field5076[var2]++] = arg0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method3134(boolean arg0, int arg1) {
        field7786++;
        if (arg1 == 100 && class425.field6109 > 0) {
            byte[] var2 = class637.field9121[--class425.field6109];
            class637.field9121[class425.field6109] = null;
            return var2;
        } else if (arg1 == 5000 && class216.field2803 > 0) {
            byte[] var3 = class156.field1915[--class216.field2803];
            class156.field1915[class216.field2803] = null;
            return var3;
        } else {
            if (arg0) {
                method3131(-25, null);
            }
            if (arg1 == 30000 && class197.field2390 > 0) {
                byte[] var4 = class53.field861[--class197.field2390];
                class53.field861[class197.field2390] = null;
                return var4;
            }
            if (class74.field1106 != null) {
                for (int var5 = 0; var5 < class564.field8152.length; var5++) {
                    if (class564.field8152[var5] == arg1 && class378.field5076[var5] > 0) {
                        byte[] var6 = class74.field1106[var5][--class378.field5076[var5]];
                        class74.field1106[var5][class378.field5076[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }
}
