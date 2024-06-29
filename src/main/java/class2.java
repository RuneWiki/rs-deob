import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class2 {

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "Lka;")
    public static class473 field33 = new class473(4);

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "Lkc;")
    public static class157 field34 = new class157("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public static void method14(int arg0) {
        if (arg0 != 258441539) {
            field34 = null;
        }
        field34 = null;
        field33 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
    public static final void method15(int arg0, int arg1) {
        field32++;
        if (class77.field1081 == arg0) {
            return;
        }
        class9.field111 = class192.field2809 = class87.field1413[arg0];
        class120.method879((byte) 48);
        class473.field6844 = new int[class9.field111][class192.field2809];
        class217.field3086 = new int[class9.field111][class192.field2809];
        class93.field1520 = new int[4][class9.field111 >> 3][class192.field2809 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class264.field3553[var2] = class22.method135(class192.field2809, class9.field111, 1);
        }
        int var3 = 20 % ((arg1 - 48) / 40);
        class398.field5712 = new byte[4][class9.field111][class192.field2809];
        class414.method2434(4, class192.field2809, class9.field111, (byte) -3);
        class445.method2630(-57, class192.field2809 >> 3, class275.field3737, class9.field111 >> 3);
        class77.field1081 = arg0;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z")
    public static final boolean method16(byte arg0) {
        field31++;
        int var1 = -61 / ((-arg0 - 74) / 33);
        if (class219.field3091) {
            try {
                class344.method2077(false, "showVideoAd", class346.field4985.field2623);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIILor;IB)Ljava/awt/Frame;")
    public static final Frame method17(int arg0, int arg1, int arg2, class173 arg3, int arg4, byte arg5) {
        field30++;
        if (arg5 > -122) {
            method16((byte) 86);
        }
        if (!arg3.method1202(0)) {
            return null;
        }
        if (arg2 == 0) {
            class293[] var6 = class370.method2210((byte) -115, arg3);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3959 == arg0 && var6[var8].field3958 == arg1 && (arg4 == 0 || var6[var8].field3966 == arg4) && (!var7 || var6[var8].field3962 > arg2)) {
                    arg2 = var6[var8].field3962;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class464 var9 = arg3.method1203(arg2, arg1, arg4, arg0, 6);
        while (var9.field6699 == 0) {
            class334.method2047(10L, 0);
        }
        Frame var10 = (Frame) var9.field6695;
        if (var10 == null) {
            return null;
        } else if (var9.field6699 == 2) {
            class196.method1290(-14477, var10, arg3);
            return null;
        } else {
            return var10;
        }
    }
}
