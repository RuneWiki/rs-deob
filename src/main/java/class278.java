import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class278 implements class239 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field4975 = 0;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[Ljl;")
    public static class245[] field4980 = new class245[28];

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
    public static int[] field4981;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB[IJ)Lcf;")
    public final class93 method1625(int arg0, byte arg1, int[] arg2, long arg3) {
        field4979++;
        if (arg1 != -56) {
            method1862((class177) null, -67, 82, 59);
        }
        if (arg0 == 0) {
            class118 var6 = class275.method1845(false, arg2[0]);
            return var6.method881((int) arg3, arg1 ^ 0xFFFFFFB7);
        } else if (arg0 == 1 || arg0 == 10) {
            class29 var7 = class89.method617((int) arg3, 0);
            return var7.field357;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class275.method1845(false, arg2[0]).method881((int) arg3, 126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method1861(int arg0) {
        field4981 = null;
        field4980 = null;
        if (arg0 != -8) {
            field4980 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lhg;III)Lnf;")
    public static final class158 method1862(class177 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 8) {
            method1863(86);
        }
        field4976++;
        return class149.method1074(arg2, arg0, 16597, arg1) ? class248.method1684(false) : null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static final void method1863(int arg0) {
        if (arg0 <= 69) {
            method1862((class177) null, 48, 74, -53);
        }
        for (int var1 = 0; var1 < class138.field2407; var1++) {
            int var2 = class264.field4708[var1];
            class237 var3 = class224.field4031[var2];
            int var4 = class250.field4504.method1907(16832);
            if ((var4 & 0x8) != 0) {
                var4 += class250.field4504.method1907(16832) << 8;
            }
            class26.method142(var2, var4, -1814, var3);
        }
        field4977++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V")
    public static final void method1864(boolean arg0, int arg1) {
        class11.field149.method298(arg0, arg1);
        class247.field4447.method298(arg0, arg1);
        field4978++;
    }
}
