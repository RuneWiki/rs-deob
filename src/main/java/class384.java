import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class class384 {

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "Lqk;")
    public static class148 field5396 = new class148(18, 0);

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "Lfha;")
    public static class522 field5397 = new class522();

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "I")
    public int field5393;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
    public int field5394;

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "I")
    public int field5395;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)Z")
    public final boolean method2344(int arg0) {
        field5389++;
        if (arg0 != 0) {
            this.field5393 = 99;
        }
        return (this.field5394 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)[Lmha;")
    public static final class701[] method2345(int arg0) {
        field5387++;
        return arg0 == -27382 ? new class701[] { class136.field1821, class417.field5803, class694.field9697, class626.field8941, class81.field1103, class337.field4337, class519.field7243, class90.field1214, class224.field3147, class638.field9073, class506.field7069, class289.field3791, class374.field5156, class88.field1209 } : null;
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)Z")
    public final boolean method2346(int arg0) {
        int var2 = -119 / ((arg0 + 40) / 38);
        field5388++;
        return (this.field5394 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)Z")
    public final boolean method2347(byte arg0) {
        if (arg0 <= 45) {
            field5396 = null;
        }
        field5390++;
        return (this.field5394 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V")
    public static void method2348(int arg0) {
        field5397 = null;
        if (arg0 == 9461) {
            field5396 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "([B[BIIIBIII)V")
    public static final void method2349(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field5391++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        int var11 = 24 / ((18 - arg5) / 53);
        for (int var12 = -arg7; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg4++;
                arg1[var10001] = (byte) (arg1[var10001] - arg0[arg2++]);
                int var15 = arg4++;
                arg1[var15] = (byte) (arg1[var15] - arg0[arg2++]);
                int var16 = arg4++;
                arg1[var16] = (byte) (arg1[var16] - arg0[arg2++]);
                int var17 = arg4++;
                arg1[var17] = (byte) (arg1[var17] - arg0[arg2++]);
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg4++;
                arg1[var10001] = (byte) (arg1[var10001] - arg0[arg2++]);
            }
            arg2 += arg8;
            arg4 += arg6;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)Z")
    public final boolean method2350(boolean arg0) {
        field5392++;
        if (arg0) {
            return false;
        } else {
            return (this.field5394 & 0x2) != 0;
        }
    }
}
