import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class116 extends class369 {

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Lps;")
    public static class469 field1284 = new class469(4, 7);

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lmj;)V", line = 6)
    public class116(class344 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)V", line = 12)
    public static void method677(boolean arg0) {
        field1284 = null;
        if (arg0) {
            method679(-46, true, 38, 97, 99, -57, -97);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V", line = 22)
    public final void method5(int arg0, boolean arg1) {
        ++field1287;
        if (arg0 != 382) {
            field1284 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)V", line = 35)
    public final void method10(boolean arg0, int arg1) {
        ++field1280;
        if (arg1 != -14330) {
            this.method3((byte) 62);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V", line = 45)
    public final void method7(int arg0, int arg1, int arg2) {
        if (arg1 != 8250) {
            field1284 = null;
        }
        ++field1286;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZII)V", line = 55)
    public static final void method678(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (class619.field8759 != null && (arg0 != 3 || class639.field9075.field6790 != arg4 || ~class639.field9075.field6774 != ~arg1)) {
            class146.method803((byte) -94, class353.field4757, class619.field8759);
            class619.field8759 = null;
        }
        ++field1288;
        if (arg0 == 3 && class619.field8759 == null) {
            class619.field8759 = class149.method815(arg1, 0, arg4, true, 0, class353.field4757);
            if (class619.field8759 != null) {
                class639.field9075.field6790 = arg4;
                class639.field9075.field6774 = arg1;
                class639.field9075.method2642(arg2 + -2, class353.field4757);
            }
        }
        if (~arg0 == -4 && class619.field8759 == null) {
            method678(class639.field9075.field6791, -1, 0, true, -1, arg5);
        } else {
            Container var6;
            if (class619.field8759 != null) {
                class533.field7491 = arg1;
                var6 = class619.field8759;
                class338.field4245 = arg4;
            } else if (class503.field7242 == null) {
                if (class591.field8347 == null) {
                    var6 = class188.field2161;
                } else {
                    var6 = class591.field8347;
                }
                class338.field4245 = var6.getSize().width;
                class533.field7491 = var6.getSize().height;
            } else {
                Insets var7 = class503.field7242.getInsets();
                class338.field4245 = class503.field7242.getSize().width - var7.right - var7.left;
                int var10001 = -var7.top;
                class533.field7491 = class503.field7242.getSize().height + (var10001 - var7.bottom);
                var6 = class503.field7242;
            }
            if (~arg0 != -2) {
                class131.method744((byte) 121);
            } else {
                class146.field1618 = class267.field3329;
                class434.field6130 = 0;
                class338.field4244 = class87.field873;
                class5.field57 = (-class267.field3329 + class338.field4245) / 2;
            }
            if (class364.field4875 != class337.field4237) {
                boolean var10000;
                if (class146.field1618 < 1024 && class338.field4244 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg3) {
                class537.method3013(true);
            } else {
                class41.field407.setSize(class146.field1618, class338.field4244);
                class701.field9813.method956(class41.field407);
                if (class503.field7242 != var6) {
                    class41.field407.setLocation(class5.field57, class434.field6130);
                } else {
                    Insets var8 = class503.field7242.getInsets();
                    class41.field407.setLocation(class5.field57 + var8.left, class434.field6130 + var8.top);
                }
            }
            if (arg0 < 2) {
                class633.field8927 = false;
            } else {
                class633.field8927 = true;
            }
            if (~class209.field2466 != arg2) {
                class175.method1067(true, 2620);
            }
            if (class99.field1061 != null && class578.method3271(class421.field5601, true)) {
                class215.method1264(arg2 + 77);
            }
            for (int var9 = 0; var9 < 100; ++var9) {
                class313.field3894[var9] = true;
            }
            class316.field3929 = true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)Z", line = 183)
    public final boolean method8(int arg0) {
        int var2 = 31 % ((37 - arg0) / 36);
        ++field1285;
        return false;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BILlc;)V", line = 193)
    public final void method9(byte arg0, int arg1, class686 arg2) {
        super.field5047.method1997(arg0 ^ -35, arg2);
        ++field1283;
        super.field5047.method2004(arg1, 2);
        if (arg0 != -94) {
            field1284 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V", line = 210)
    public final void method3(byte arg0) {
        ++field1281;
        int var2 = -16 / ((54 - arg0) / 47);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZIIIII)V", line = 219)
    public static final void method679(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -23 % ((-54 - arg5) / 53);
        if (~(arg1 ? class639.field9075.field6776 : class639.field9075.field6773) != -1 && ~arg0 != -1 && class309.field3825 < 50 && arg3 != -1) {
            class89.field891[class309.field3825++] = new class340((byte) (arg1 ? 3 : 2), arg3, arg0, arg2, arg6, arg4);
        }
        ++field1282;
    }
}
