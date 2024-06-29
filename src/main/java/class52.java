import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class52 {

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    private int field866;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field867 = 0;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lsm;")
    public static class249 field863;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 6)
    public static void method409(int arg0) {
        if (arg0 != 65535) {
            method410(-101);
        }
        field863 = null;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 16)
    public static final void method410(int arg0) {
        field862++;
        if (arg0 != 18525) {
            field867 = -123;
        }
        class169 var1 = null;
        try {
            class420 var2 = class343.field4703.method123(false);
            while (var2.field5789 == 0) {
                class258.method1603(-649, 1L);
            }
            if (var2.field5789 == 1) {
                var1 = (class169) var2.field5791;
                byte[] var3 = new byte[(int) var1.method1045(-127)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1046(var3.length - var4, var4, true, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class115.method721(new class425(var3), -25693);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1044(true);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Z", line = 71)
    public static final boolean method411(byte arg0, int arg1) {
        field868++;
        if (arg0 < 88) {
            field867 = -92;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!fn", name = "toString", descriptor = "()Ljava/lang/String;", line = 83)
    public final String toString() {
        field861++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lvd;IIIII)V", line = 91)
    public static final void method412(class216 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3067 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field3059[var6] != null) {
                arg0.field3067++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field3067; var7++) {
            long var8 = class355.field4951[arg1][arg2][arg3];
            while (var8 != 0L) {
                class270 var14 = class488.field6890[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field3059[var7] == var14) {
                    continue label50;
                }
            }
            long var10 = class355.field4951[arg1][arg4][arg5];
            while (var10 != 0L) {
                class270 var13 = class488.field6890[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field3059[var7] == var13) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field3067 - 1; var12++) {
                arg0.field3059[var12] = arg0.field3059[var12 + 1];
            }
            arg0.field3067--;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I", line = 145)
    public final int method413(byte arg0) {
        field864++;
        return arg0 > -50 ? -104 : this.field866;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(II)V", line = 157)
    public class52(int arg0, int arg1) {
        this.field865 = arg1;
        this.field866 = arg0;
    }
}
