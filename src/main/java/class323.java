import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class323 extends class398 {

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    private int field4739 = 0;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
    private int field4744 = 4096;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    public static volatile int field4738 = 0;

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "I")
    public static int field4745 = 2;

    @OriginalMember(owner = "client!bm", name = "V", descriptor = "I")
    public static int field4747 = 0;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4736 = "Loaded input handler";

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!bm", name = "W", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!bm", name = "X", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "[Lcq;")
    public static class67[] field4743;

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 7)
    public class323() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(II)V", line = 12)
    public static final void method2168(int arg0, int arg1) {
        if (arg1 != 0) {
            method2170((class210) null, (Canvas) null, -114, -14);
        }
        class250.field3435.method1142((byte) -56, arg0);
        ++field4742;
        class420.field6213.method1142((byte) -77, arg0);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lnj;II)V", line = 32)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 == -13132) {
            ++field4737;
            if (arg1 != 0) {
                if (arg1 == 1) {
                    this.field4744 = arg0.method1343(255);
                }
            } else {
                this.field4739 = arg0.method1343(arg2 + 13387);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Llm;ILlm;Lrh;Llm;)Z", line = 76)
    public static final boolean method2169(class347 arg0, int arg1, class347 arg2, class70 arg3, class347 arg4) {
        class364.field5255 = arg0;
        ++field4746;
        class321.field4733 = arg3;
        class388.field5603 = arg4;
        if (arg1 != 2) {
            field4738 = 5;
        }
        class23.field306 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I", line = 93)
    public final int[] method95(int arg0, int arg1) {
        ++field4749;
        int[] var3 = super.field5927.method305(arg0, (byte) 94);
        if (arg1 != 0) {
            this.method95(-85, -8);
        }
        if (super.field5927.field591) {
            int[] var4 = this.method2558(0, 29295, arg0);
            for (int var5 = 0; class140.field1922 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field4739 && ~this.field4744 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lfh;Ljava/awt/Canvas;II)Lii;", line = 128)
    public static final class405 method2170(class210 arg0, Canvas arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            method2172(false);
        }
        ++field4748;
        return new class342(arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V", line = 139)
    public static final void method2171(byte arg0) {
        ++field4741;
        if (arg0 >= -119) {
            field4736 = null;
        }
        if (class130.field1795 != null) {
            while (true) {
                while (~class407.field6046 > ~class16.field226.length) {
                    class92 var1 = class16.field226[class407.field6046];
                    if (var1 != null && ~var1.field1305 == 0) {
                        if (class372.field5412 == null) {
                            class372.field5412 = class130.field1795.method396(var1.field1297, -92);
                        }
                        int var2 = class372.field5412.field1675;
                        if (var2 == -1) {
                            return;
                        }
                        class372.field5412 = null;
                        ++class407.field6046;
                        var1.field1305 = var2;
                    } else {
                        ++class407.field6046;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(Z)V", line = 187)
    public static void method2172(boolean arg0) {
        if (!arg0) {
            method2173(-15, -110, -62, -100, 10, -91, -4, 117);
        }
        field4743 = null;
        field4736 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIII)V", line = 206)
    public static final void method2173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4740;
        class83.method579(arg2, arg0, arg5, -100, arg4, arg3, arg7, arg6, arg1);
    }
}
