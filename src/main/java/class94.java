import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class94 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field1279 = -1;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field1280 = 1;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lnb;IIIII)V", line = 11)
    public static final void method754(class340 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5014 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field5015[var6] != null) {
                arg0.field5014++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field5014; var7++) {
            int var8 = class131.field1714[arg1][arg2][arg3];
            while (var8 != 0) {
                class64 var12 = class280.field4131[(var8 & 0xFF) - 1];
                var8 >>>= 0x8;
                if (arg0.field5015[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class131.field1714[arg1][arg4][arg5];
            while (var9 != 0) {
                class64 var11 = class280.field4131[(var9 & 0xFF) - 1];
                var9 >>>= 0x8;
                if (arg0.field5015[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field5014 - 1; var10++) {
                arg0.field5015[var10] = arg0.field5015[var10 + 1];
            }
            arg0.field5014--;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 68)
    public static final void method755(int arg0) {
        field1277++;
        for (class438 var1 = (class438) class197.field2718.method52((byte) -58); var1 != null; var1 = (class438) class197.field2718.method52((byte) -58)) {
            class210.method1373(var1, 105);
        }
        client.method397();
        client.method417();
        client.method394();
        client.method416();
        if (arg0 == 255) {
            client.method410();
            client.method413();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I", line = 93)
    public static final int method756(int arg0, int arg1) {
        field1278++;
        if (arg1 >= -3) {
            field1280 = -121;
        }
        return arg0 & 0xFF;
    }
}
