import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class295 extends class170 {

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Lmh;")
    public static class128 field5038 = class22.method156(126, "overlay");

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "Lmh;")
    public static class128 field5042 = class22.method156(122, " weitere Optionen");

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field5039 = 0;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)[I", line = 7)
    public final int[] method69(byte arg0, int arg1) {
        field5040++;
        if (arg0 != 85) {
            this.method69((byte) 83, 30);
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int[][] var4 = this.method1139(0, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class185.field3225; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 42)
    public class295() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILcb;Ljava/lang/Object;)V", line = 52)
    public static final void method2016(int arg0, class270 arg1, Object arg2) {
        field5043++;
        if (arg1.field4686 == null) {
            return;
        }
        for (int var3 = arg0; var3 < 50 && arg1.field4686.peekEvent() != null; var3++) {
            class177.method1213(0, 1L);
        }
        if (arg2 != null) {
            arg1.field4686.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V", line = 96)
    public static final void method2017(int arg0) {
        if (arg0 != 0) {
            field5042 = (class128) null;
        }
        class116.field1962 = null;
        class150.field2578 = null;
        class199.field3477 = null;
        field5045++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIILjm;IJIIII)Z", line = 124)
    public static final boolean method2018(int arg0, int arg1, int arg2, int arg3, class226 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class287.method1980(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V", line = 134)
    public static void method2019(int arg0) {
        if (arg0 >= -70) {
            field5039 = -128;
        }
        field5042 = null;
        field5038 = null;
    }
}
