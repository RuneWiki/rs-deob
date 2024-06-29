import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class class122 extends class406 {

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IBI)I")
    public static final int method775(int arg0, byte arg1, int arg2) {
        if (arg1 != -15) {
            method778((class152) null, -86, 68, -111, (boolean[]) null);
        }
        field1499++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IBIII)V")
    public static final void method776(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class401.field5730 != 0 && arg3 != 0 && class229.field3247 < 50 && arg0 != -1) {
            class418.field5981[class229.field3247] = arg0;
            class229.field3234[class229.field3247] = arg3;
            class55.field657[class229.field3247] = arg4;
            class225.field3161[class229.field3247] = null;
            class200.field2857[class229.field3247] = 0;
            class276.field3916[class229.field3247] = arg2;
            class229.field3247++;
        }
        field1497++;
        int var5 = 47 % ((-arg1 - 14) / 48);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)V")
    public static final void method777(boolean arg0, int arg1) {
        class237 var2 = class50.field595;
        synchronized (class50.field595) {
            class50.field595.method1629(arg1, 88);
        }
        field1500++;
        if (arg0) {
            return;
        }
        class237 var3 = class247.field3528;
        synchronized (class247.field3528) {
            class247.field3528.method1629(arg1, 66);
        }
        class237 var4 = class265.field3773;
        synchronized (class265.field3773) {
            class265.field3773.method1629(arg1, 87);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lmm;III[Z)V")
    public static final void method778(class152 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class399.field5693 == class161.field2122) {
            return;
        }
        int var5 = class98.field1191[arg1].method342(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class327 var7 = class98.field1191[var6];
                if (var7 != null) {
                    var7.method339(arg0, arg2, var5 - var7.method342(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
