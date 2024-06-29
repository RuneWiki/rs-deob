import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class722 extends class392 {

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field10077;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field10078;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field10081;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "[[S")
    public static short[][] field10080;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        ++field10082;
        super.field5452 = arg1;
        int var3 = -120 % ((-80 - arg0) / 38);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)I")
    public final int method4010(int arg0) {
        if (arg0 != 17539) {
            this.method286((byte) 37, -100);
        }
        ++field10074;
        return super.field5452;
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(Z)V")
    public static void method4011(boolean arg0) {
        field10080 = null;
        if (arg0) {
            method4014(-34);
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lw;)V")
    public class722(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([II)Ljava/lang/String;")
    public static final String method4012(int[] arg0, int arg1) {
        ++field10078;
        StringBuffer var2 = new StringBuffer();
        int var3 = class224.field3292;
        for (int var4 = arg1; ~var4 > ~arg0.length; ++var4) {
            class61 var5 = class523.field7326.method2675((byte) 53, arg0[var4]);
            if (~var5.field917 != 0) {
                class85 var6 = (class85) class356.field5053.method2882((long) var5.field917, (byte) -90);
                if (var6 == null) {
                    class418 var7 = class418.method2468(class176.field2648, var5.field917, 0);
                    if (var7 != null) {
                        var6 = class686.field9702.method487(var7, true);
                        class356.field5053.method2890(-7307, (long) var5.field917, var6);
                    }
                }
                if (var6 != null) {
                    class312.field4420[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        ++field10077;
        if (arg1 > -124) {
            return 67;
        } else if (super.field5454.method3782((byte) 121)) {
            return 3;
        } else if (super.field5454.method3775(-95) == class448.field6175) {
            if (arg0 == 0) {
                if (~super.field5454.field9459.method3485(17539) == -2) {
                    return 2;
                }
                if (~super.field5454.field9487.method3081(17539) == -2) {
                    return 2;
                }
                if (super.field5454.field9489.method2326(17539) > 0) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[FB)[F")
    public static final float[] method4013(int arg0, float[] arg1, byte arg2) {
        ++field10075;
        float[] var3 = new float[arg0];
        class171.method1267(arg1, 0, var3, 0, arg0);
        return arg2 >= -37 ? null : var3;
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
    public static final void method4014(int arg0) {
        int var1 = 33 / (-arg0 / 49);
        ++field10081;
        class580.field8354.method2893((byte) -58);
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)Z")
    public final boolean method4015(int arg0) {
        ++field10076;
        if (super.field5454.method3782((byte) -78)) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method4010(-45);
            }
            return super.field5454.method3775(arg0 ^ -50) == class448.field6175;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(ILw;)V")
    public class722(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        ++field10079;
        return !arg0 ? -67 : 1;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        ++field10083;
        if (super.field5454.method3775(-101) != class448.field6175) {
            super.field5452 = 1;
        } else if (super.field5454.method3782((byte) 99)) {
            super.field5452 = 0;
        }
        if (super.field5452 != 0 && super.field5452 != 1) {
            super.field5452 = this.method292(!arg0);
        }
        if (arg0) {
            method4011(false);
        }
    }
}
