import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class94 extends class168 {

    @OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!iia", name = "l", descriptor = "Lqfa;")
    private class106 field1068;

    @OriginalMember(owner = "client!iia", name = "k", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!iia", name = "g", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "F")
    public static float field1062;

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "Lqba;")
    private class425 field1065;

    @OriginalMember(owner = "client!iia", name = "o", descriptor = "Lf;")
    public static class788 field1071;

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)Lqba;", line = 4)
    public final class425 method691(int arg0) {
        if (arg0 != 10002) {
            return null;
        }
        field1061++;
        if (this.field1065 == null) {
            class160 var2 = this.field1068.field774;
            class333.field4704[0] = this.field1070;
            class333.field4704[1] = this.field1069;
            class333.field4704[2] = this.field1067;
            class333.field4704[5] = this.field1066;
            class333.field4704[3] = this.field1063;
            class333.field4704[4] = this.field1064;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1212(112, class333.field4704[var5])) {
                    return null;
                }
                class467 var7 = var2.method1208((byte) 47, class333.field4704[var5]);
                int var8 = var7.field6574 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field6565 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class457.field6406[var6] = var2.method1211((byte) 22, var4, var4, false, class333.field4704[var6], 1.0F);
            }
            this.field1065 = new class425(this.field1068, 6407, var4, var3 != 0, class457.field6406);
        }
        return this.field1065;
    }

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "(I)V", line = 66)
    public static void method692(int arg0) {
        if (arg0 < -86) {
            field1071 = null;
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lqfa;IIIIII)V", line = 83)
    public class94(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1070 = arg1;
        this.field1068 = arg0;
        this.field1067 = arg3;
        this.field1066 = arg6;
        this.field1064 = arg5;
        this.field1063 = arg4;
        this.field1069 = arg2;
    }
}
