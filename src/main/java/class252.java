import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class252 {

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lke;")
    public static class407 field3845 = new class407(64);

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Loe;")
    public static class127 field3850 = new class127(69, 0);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[I")
    public static int[] field3852 = new int[2];

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field3851 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ba", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field3846++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BIIIB)Z", line = 13)
    public static final boolean method1513(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3848++;
        boolean var6 = true;
        class40 var7 = new class40(arg1);
        int var8 = -1;
        label56: while (true) {
            int var9 = var7.method229(-1);
            if (var9 == 0) {
                int var20 = -98 / ((-arg5 - 2) / 58);
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method236(true);
                    if (var13 == 0) {
                        continue label56;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method257((byte) 127) >> 2;
                    int var17 = arg0 + var15;
                    int var18 = var14 + arg3;
                    if (var17 > 0 && var18 > 0 && var17 < arg2 - 1 && var18 < (arg4 - 1)) {
                        class56 var19 = class128.field2070.method916((byte) -15, var8);
                        if (var16 != 22 || class463.field7116.field2944 || var19.field895 != 0 || var19.field885 == 1 || var19.field923) {
                            if (!var19.method395(-113)) {
                                class178.field2788++;
                                var6 = false;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method236(true);
                if (var12 == 0) {
                    break;
                }
                var7.method257((byte) 51);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 100)
    public static void method1514(byte arg0) {
        field3850 = null;
        if (arg0 == 51) {
            field3845 = null;
            field3852 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(II)V", line = 122)
    public class252(int arg0, int arg1) {
        this.field3849 = arg0;
    }
}
