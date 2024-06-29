import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class621 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Lmda;")
    public static class267 field8562;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lii;")
    public class556 field8559;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Ltl;")
    public class621 field8560;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 4)
    public final void method3491(byte arg0) {
        if (arg0 != -67) {
            this.field8559 = null;
        }
        field8557++;
        if (class263.field3319 < 500) {
            this.field8560 = class516.field7230;
            this.field8559 = null;
            class263.field3319++;
            class516.field7230 = this;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 22)
    public static void method3492(int arg0) {
        field8562 = null;
        if (arg0 < 5) {
            field8562 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lrl;I[II)V", line = 32)
    public static final void method3493(class724 arg0, int arg1, int[] arg2, int arg3) {
        field8558++;
        if (arg0.field165 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field165.length; var5++) {
                if (arg0.field165[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field153 != -1) {
                class56 var6 = class66.field941.method1299((byte) -98, arg0.field153);
                int var7 = var6.field776;
                if (var7 == 1) {
                    arg0.field198 = 0;
                    arg0.field202 = 0;
                    arg0.field243 = 1;
                    arg0.field172 = 0;
                    arg0.field171 = arg1;
                    if (!arg0.field206) {
                        class758.method4218(arg0.field198, arg0, 0, var6);
                    }
                }
                if (var7 == 2) {
                    arg0.field172 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg2.length; var9++) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg0.field165 == null || arg0.field165[var9] == -1 || class66.field941.method1299((byte) -93, arg2[var9]).field786 >= class66.field941.method1299((byte) -126, arg0.field165[var9]).field786) {
                arg0.field171 = arg1;
                arg0.field165 = arg2;
                break;
            }
        }
        if (var8) {
            arg0.field171 = arg1;
            arg0.field165 = arg2;
        }
        int var10 = 39 % ((-arg3 - 38) / 60);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 122)
    public static final void method3494(int arg0) {
        class607.field8430 = null;
        class514.field7218 = null;
        class474.field6386 = null;
        class686.field9562 = null;
        class29.field520 = null;
        class327.field4198 = false;
        if (arg0 != 0) {
            field8562 = null;
        }
        field8561++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLjava/awt/Frame;Lqg;)V", line = 141)
    public static final void method3495(byte arg0, Frame arg1, class465 arg2) {
        field8555++;
        while (true) {
            class181 var3 = arg2.method2639(arg1, arg0 ^ 0x8);
            while (var3.field2538 == 0) {
                class149.method1052(10L, true);
            }
            if (var3.field2538 == 1) {
                if (arg0 != 8) {
                    return;
                }
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class149.method1052(100L, true);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIBI)V", line = 172)
    public static final void method3496(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = class748.field10451.field10402.method4186((byte) 117) * arg0 >> 8;
        field8556++;
        if (arg2 > -60) {
            field8562 = null;
        }
        if (var4 == 0 || arg1 == -1) {
            return;
        }
        if (!class87.field1208 && class309.field4068 != -1 && class453.method2546((byte) 69) && !class594.method3365((byte) 89)) {
            class292.field3841 = class87.method716((byte) -106);
            class216 var5 = class143.method1036(-112, class292.field3841);
            class660.method3715(var5, true, 5);
        }
        class393.method2216(false, 0, class417.field5330, 0, var4, arg1);
        class300.method1794(-1, 0, 255);
        class87.field1208 = true;
    }
}
