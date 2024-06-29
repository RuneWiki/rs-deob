import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class89 extends class139 {

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field1932 = 0;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    public static int field1931 = 0;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "J")
    public static volatile long field1933 = 0L;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "[[I")
    public static int[][] field1928 = new int[104][104];

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "Z")
    public static boolean field1934 = false;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1928 = null;
        if (arg0 != 2077) {
            method620(61);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lgg;ILjava/lang/Object;)V")
    public static final void method621(class67 arg0, int arg1, Object arg2) {
        ++field1929;
        if (arg0.field1406 != null) {
            for (int var3 = 0; ~var3 > -51 && arg0.field1406.peekEvent() != null; ++var3) {
                class25.method151(1L, (byte) 0);
            }
            if (arg1 != 1001) {
                method622(-107, (class163) null, -4);
            }
            if (arg2 != null) {
                arg0.field1406.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            field1928 = null;
        }
        int[] var3 = super.field2859.method1319(arg1 + -7577, arg0);
        if (super.field2859.field3966) {
            int[][] var4 = this.method910((byte) -110, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class23.field402 < ~var8; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        ++field1935;
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class89() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILrf;I)V")
    public static final void method622(int arg0, class163 arg1, int arg2) {
        class141.field2896.method326(104, 71);
        ++class100.field2096;
        class141.field2896.method347(272741536, arg1.method1058(arg0 + -123));
        ++field1930;
        class141.field2896.method377(arg2, 112);
        if (arg0 != 0) {
            method621((class67) null, 12, (Object) null);
        }
    }
}
