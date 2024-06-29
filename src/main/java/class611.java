import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class611 {

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "[I")
    public int[] field8689;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "[I")
    public int[] field8694;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "[I")
    public int[] field8691;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "[[F")
    public float[][] field8695;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "[I")
    public static int[] field8693 = new int[2];

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "Lqk;")
    public static class148 field8692 = new class148(34, -2);

    @OriginalMember(owner = "client!iha", name = "l", descriptor = "Z")
    public static boolean field8698 = false;

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "[Lcw;")
    public static class21[] field8687;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(III)I", line = 7)
    public static final int method3569(int arg0, int arg1, int arg2) {
        field8690++;
        int var3 = arg2 - 1 & arg1 >> 31;
        if (arg0 != 2439) {
            method3571(false);
        }
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lkp;B)I", line = 22)
    public static final int method3570(class480 arg0, byte arg1) {
        field8688++;
        if (arg1 == -41) {
            String var2 = class71.method451((byte) -17, arg0);
            return class514.field7181.method4140(1, var2, class298.field3904);
        } else {
            return -47;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V", line = 35)
    public static final void method3571(boolean arg0) {
        field8697++;
        client var1 = class306.field3966;
        synchronized (class306.field3966) {
            if (class455.field6257 == null) {
                Container var2;
                if (class244.field3384 != null) {
                    var2 = class244.field3384;
                } else if (class622.field8847 == null) {
                    var2 = class128.field1752;
                } else {
                    var2 = class622.field8847;
                }
                class389.field5428 = var2.getSize().width;
                field8696 = var2.getSize().height;
                if (!arg0) {
                    field8696 = -96;
                }
                if (class244.field3384 == var2) {
                    Insets var3 = class244.field3384.getInsets();
                    class389.field5428 -= var3.right + var3.left;
                    field8696 -= var3.top + var3.bottom;
                }
                if (class615.method3609((byte) 98) == 1) {
                    class58.field807 = class95.field1381;
                    class614.field8750 = 0;
                    class305.field3963 = (class389.field5428 - class95.field1381) / 2;
                    class582.field8281 = class631.field8989;
                } else {
                    class354.method2008((byte) -86);
                }
                if (class746.field10392 != class456.field6280) {
                    boolean var10000;
                    if (class58.field807 < 1024 && class582.field8281 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class438.field6016.setSize(class58.field807, class582.field8281);
                if (class96.field1401 != null) {
                    if (class264.field3595) {
                        class595.method3525(class438.field6016, (byte) 2);
                    } else {
                        class96.field1401.method2224(class438.field6016, class58.field807, class582.field8281);
                    }
                }
                if (class244.field3384 == var2) {
                    Insets var4 = class244.field3384.getInsets();
                    class438.field6016.setLocation(class305.field3963 + var4.left, class614.field8750 + var4.top);
                } else {
                    class438.field6016.setLocation(class305.field3963, class614.field8750);
                }
                if (class312.field4004 != -1) {
                    class636.method3700(true, 1);
                }
                class183.method1221(0);
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V", line = 127)
    public static void method3572(byte arg0) {
        field8692 = null;
        field8687 = null;
        field8693 = null;
        if (arg0 >= -17) {
            field8692 = null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "([I[I[I[[F)V", line = 142)
    public class611(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field8689 = arg2;
        this.field8694 = arg0;
        this.field8691 = arg1;
        this.field8695 = arg3;
    }
}
