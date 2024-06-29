import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class167 extends class377 {

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "[I")
    public static int[] field1959 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    public static int field1958 = 0;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1960 = new Hashtable();

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "Ljt;")
    public static class94 field1965;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "[Ldm;")
    public static class48[] field1964;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field1956;
        int[] var3 = super.field4842.method2772(arg0, (byte) -127);
        if (super.field4842.field6354) {
            int[][] var4 = this.method2173(1, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class528.field6661; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        int var9 = 5 % ((arg1 - 5) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
    public class167() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V")
    public static final void method1012(int arg0) {
        ++field1957;
        if (class37.field542) {
            class337 var1 = class680.method3758(true, class168.field1978, class112.field1383);
            if (var1 != null && var1.field4193 != null) {
                class402 var2 = new class402();
                var2.field5153 = var1.field4193;
                var2.field5154 = var1;
                class620.method3450(var2);
            }
            class530.field6684 = -1;
            class194.field2290 = -1;
            class37.field542 = false;
            if (var1 != null) {
                class99.method721((byte) -119, var1);
            }
            if (arg0 < 96) {
                field1964 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BILpfa;I)Lnj;")
    public static final class229 method1013(byte arg0, int arg1, class275 arg2, int arg3) {
        ++field1962;
        byte[] var4 = arg2.method1659(arg0 + 114, arg3, arg1);
        if (arg0 != -28) {
            return null;
        } else {
            return var4 == null ? null : new class229(var4);
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(III)V")
    public static final void method1014(int arg0, int arg1, int arg2) {
        class565 var3 = class407.field5237[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field7085 != null) {
                var3.field7085 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public static final void method1015(boolean arg0) {
        ++field1961;
        class80.field1036.method3839((byte) -118);
        class124.field1520.method2501(9);
        if (!arg0) {
            method1017((byte) -85);
        }
        class214.field2512.method2501(9);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIZBII)V")
    public static final void method1016(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        ++field1963;
        if (arg4 != -91) {
            field1965 = null;
        }
        if (~(arg3 ? class611.field8310.field8681 : class611.field8310.field8689) != -1 && arg5 != 0 && class141.field1697 < 50 && arg1 != -1) {
            class266.field3358[class141.field1697++] = new class175((byte) (arg3 ? 3 : 2), arg1, arg5, arg2, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(B)V")
    public static void method1017(byte arg0) {
        field1964 = null;
        if (arg0 <= 13) {
            method1014(102, -90, 45);
        }
        field1960 = null;
        field1965 = null;
        field1959 = null;
    }
}
