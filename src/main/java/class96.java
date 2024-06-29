import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class96 {

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "Ldn;")
    private class438 field1191;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIILqn;Lqn;)V", line = 5)
    public static final void method595(int arg0, int arg1, int arg2, class56 arg3, class56 arg4) {
        class349 var5 = class78.method450(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field4507 = arg3;
            var5.field4498 = arg4;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "([BIIIBII)Z", line = 14)
    public static final boolean method596(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1193++;
        int var7 = arg1 % arg2;
        if (arg4 > -34) {
            return false;
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg2 + arg3 - 1) / arg2);
        int var10 = -((arg1 + arg2 - 1) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg6] == 0) {
                    return true;
                }
                arg6 += arg2;
            }
            int var13 = arg6 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg6 = arg5 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lre;ILdn;)V", line = 77)
    public class96(class515 arg0, int arg1, class438 arg2) {
        new class641(64);
        this.field1191 = arg2;
        this.field1192 = this.field1191.method2554(15, 125);
    }
}
