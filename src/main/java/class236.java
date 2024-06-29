import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class236 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 10)
    public static final void method1602(String arg0, String arg1, int arg2) {
        if (arg2 >= -117) {
            field3552 = -105;
        }
        class240.field3598 = arg1;
        class490.field7159 = arg0;
        field3553++;
        if (class23.field262 != 3 && class490.field7159.equals("") || class240.field3598.equals("")) {
            class133.method969(3, (byte) 123);
            return;
        }
        if (class23.field262 != 1) {
            class51.field784 = -1;
            class196.field3067 = 0;
        }
        class295.field4544 = false;
        class133.method969(-3, (byte) 123);
        class308.field4708 = 0;
        class307.field4697 = 0;
        class114.field1750 = 1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BII[BIIII)V", line = 56)
    public static final void method1603(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field3549++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        int var11 = 9 % ((arg0 - 52) / 63);
        for (int var12 = -arg6; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg7++;
                arg4[var10001] = (byte) (arg4[var10001] - arg1[arg2++]);
                int var15 = arg7++;
                arg4[var15] = (byte) (arg4[var15] - arg1[arg2++]);
                int var16 = arg7++;
                arg4[var16] = (byte) (arg4[var16] - arg1[arg2++]);
                int var17 = arg7++;
                arg4[var17] = (byte) (arg4[var17] - arg1[arg2++]);
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg7++;
                arg4[var10001] = (byte) (arg4[var10001] - arg1[arg2++]);
            }
            arg2 += arg8;
            arg7 += arg5;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 101)
    public static final void method1604(int arg0) {
        class361.field5323 = null;
        class1.field4 = -1;
        field3550++;
        if (arg0 != -20769) {
            method1602(null, null, -67);
        }
    }
}
