import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class420 extends class477 {

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "Lpp;")
    public static class464 field6177 = new class464(74, 2);

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
    public int field6180;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "Lgg;")
    public class270 field6174;

    @OriginalMember(owner = "client!bq", name = "P", descriptor = "Lgp;")
    public static class561 field6182;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "[B")
    public byte[] field6175;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method2524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6179;
        if (arg7 >= class183.field2638 && arg4 <= class268.field3911 && ~class222.field3350 >= ~arg5 && ~arg6 >= ~class409.field6071) {
            class127.method1000(false, arg2, arg0, arg5, arg6, arg3, arg7, arg4);
        } else {
            class390.method2358(arg3, arg6, arg2, 1, arg5, arg4, arg0, arg7);
        }
        int var8 = -45 % ((arg1 - 32) / 63);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)I", line = 23)
    public final int method2525(int arg0) {
        ++field6173;
        if (super.field6814) {
            return 0;
        } else {
            int var2 = 21 / ((arg0 - -46) / 59);
            return 100;
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)[B", line = 37)
    public final byte[] method2526(int arg0) {
        ++field6181;
        if (arg0 != -14568) {
            this.method2526(-63);
        }
        if (super.field6814) {
            throw new RuntimeException();
        } else {
            return this.field6175;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)Lao;", line = 59)
    public static final class367 method2527(int arg0, int arg1, int arg2) {
        class184 var3 = class277.field4051[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2666;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I[BI)[B", line = 68)
    public static final byte[] method2528(int arg0, byte[] arg1, int arg2) {
        ++field6178;
        byte[] var3 = new byte[arg2];
        class164.method1151(arg1, arg0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)V", line = 79)
    public static final void method2529(byte arg0) {
        for (int var1 = 0; var1 < class104.field1755.length; ++var1) {
            for (int var2 = 0; class104.field1755[0].length > var2; ++var2) {
                for (int var3 = 0; class104.field1755[0][0].length > var3; ++var3) {
                    class104.field1755[var1][var2][var3] = 0;
                }
            }
        }
        if (arg0 != 0) {
            field6182 = null;
        }
        ++field6176;
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V", line = 118)
    public static void method2530(byte arg0) {
        field6182 = null;
        if (arg0 < 79) {
            method2530((byte) 116);
        }
        field6177 = null;
    }
}
