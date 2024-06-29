import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class15 extends class197 {

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "Z")
    private boolean field198 = true;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "Z")
    private boolean field195 = true;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "Z")
    public static boolean field189 = false;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    public static int field193 = 0;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "Loh;")
    public static class258 field194 = class153.method1046("logo", 90);

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "Lmi;")
    public static class12 field201 = new class12();

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "Lke;")
    public static class116 field199;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)[[I", line = 9)
    public final int[][] method101(int arg0, byte arg1) {
        field190++;
        int[][] var3 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int[][] var4 = this.method1322(0, this.field198 ? class155.field2662 - arg0 : arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field195) {
                for (int var12 = 0; var12 < class190.field3362; var12++) {
                    var8[var12] = var6[class48.field723 - var12];
                    var9[var12] = var5[class48.field723 - var12];
                    var10[var12] = var7[class48.field723 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class190.field3362; var11++) {
                    var8[var11] = var6[var11];
                    var9[var11] = var5[var11];
                    var10[var11] = var7[var11];
                }
            }
        }
        int var13 = 11 / ((arg1 - 1) / 37);
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(Z)V", line = 77)
    public static void method102(boolean arg0) {
        field201 = null;
        field194 = null;
        if (arg0) {
            field194 = (class258) null;
        }
        field199 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILva;I)V", line = 90)
    public final void method98(int arg0, class235 arg1, int arg2) {
        field188++;
        if (arg0 != 7955) {
            field193 = 108;
        }
        if (arg2 == 0) {
            this.field195 = arg1.method1589(89) == 1;
        } else if (arg2 == 1) {
            this.field198 = arg1.method1589(98) == 1;
        } else if (arg2 == 2) {
            this.field3462 = arg1.method1589(65) == 1;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIILrk;IJIIII)Z", line = 134)
    public static final boolean method103(int arg0, int arg1, int arg2, int arg3, class123 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : client.method349(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V", line = 141)
    public class15() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 150)
    public static final void method104(int arg0) {
        field191++;
        class171.method1144();
        if (arg0 >= -69) {
            field189 = true;
        }
        class50.field767 = -1;
        class139.field2368 = null;
        class182.method1242(0);
        class195.field3437.method704(true);
        class100.field1783 = new class294();
        ((class272) class266.field4643).method1917(0);
        class267.field4647 = 0;
        class267.field4651 = new class284[255];
        class175.method1185();
        class9.method62();
        class314.method2174(-120);
        class45.method375((byte) -120);
        class233.method1557(-25523);
        for (int var1 = 0; var1 < 2048; var1++) {
            class231 var2 = class38.field527[var1];
            if (var2 != null) {
                var2.field3984 = null;
            }
        }
        if (class257.field4390) {
            class9.method47(104, 104);
        }
        class86.method617(class34.field395, (byte) -123, class234.field4044);
        class271.method1909(0, class34.field395);
        if (class280.field4818 == 5) {
            class283.method1985((byte) -79, class34.field395);
        }
        if (class280.field4818 == 10) {
            class238.method1633(false, 0);
        }
        if (class280.field4818 == 30) {
            class106.method791((byte) 8, 25);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILgb;I)[Lrm;", line = 213)
    public static final class113[] method105(int arg0, int arg1, class213 arg2, int arg3) {
        field197++;
        return class162.method1086(arg3, arg2, arg0, arg1) ? class154.method1049((byte) 41) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)[I", line = 232)
    public final int[] method96(int arg0, int arg1) {
        field200++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (arg0 != -16221) {
            method103(-97, 85, 115, 87, (class123) null, -20, -24L, 62, 58, -107, -82);
        }
        if (this.field3456.field5115) {
            int[] var4 = this.method1327(0, -123, this.field198 ? class155.field2662 - arg1 : arg1);
            if (this.field195) {
                for (int var5 = 0; var5 < class190.field3362; var5++) {
                    var3[var5] = var4[class48.field723 - var5];
                }
            } else {
                class275.method1930(var4, 0, var3, 0, class190.field3362);
            }
        }
        return var3;
    }
}
