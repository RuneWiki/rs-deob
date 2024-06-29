import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 {

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "Ljm;")
    public static class485 field178 = new class485(58, -1);

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public static int field186 = 0;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Lof;")
    public static class438 field179 = new class438("WTI", 5);

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "[B")
    public byte[] field176;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "[S")
    public short[] field177;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "[S")
    public short[] field182;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "[S")
    public short[] field185;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 3)
    public static final void method136(int arg0) {
        field181++;
        class266.field3627 = new class38(8);
        class504.field7420 = arg0;
        for (class206 var1 = (class206) class297.field4104.method2306(116); var1 != null; var1 = (class206) class297.field4104.method2302(-117)) {
            var1.method1251();
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIII)V", line = 24)
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field184++;
        if (arg0 == arg5) {
            class464.method2727(arg1, -11436, arg0, arg3, arg2);
        } else if (arg4 == 58) {
            if (arg2 - arg0 >= class382.field5379 && class175.field2497 >= (arg0 + arg2) && arg1 - arg5 >= class343.field4727 && arg1 + arg5 <= class54.field753) {
                class160.method994(arg0, arg5, arg2, arg1, arg3, true);
            } else {
                class243.method1440(arg0, arg2, arg1, arg3, (byte) -77, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V", line = 47)
    public static void method138(int arg0) {
        field179 = null;
        if (arg0 != 0) {
            field180 = -111;
        }
        field178 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "([B[III[[B[I[[BZ)I", line = 67)
    public static final int method139(byte[] arg0, int[] arg1, int arg2, int arg3, byte[][] arg4, int[] arg5, byte[][] arg6, boolean arg7) {
        field183++;
        int var8 = arg1[arg3];
        int var9 = var8 + arg5[arg3];
        int var10 = arg1[arg2];
        int var11 = arg5[arg2] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg0[arg3] & 0xFF;
        if (var14 > (arg0[arg2] & 0xFF)) {
            var14 = arg0[arg2] & 0xFF;
        }
        byte[] var15 = arg6[arg3];
        byte[] var16 = arg4[arg2];
        int var17 = var12 - var8;
        if (arg7) {
            return -46;
        }
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 123)
    public static final void method140(byte arg0) {
        field187++;
        for (class149 var1 = (class149) class260.field3585.method3072((byte) 89); var1 != null; var1 = (class149) class260.field3585.method3066(2)) {
            if (class227.method1340(-9469, var1.field2102)) {
                class8.method50(var1, arg0 ^ 0xFFFFFFFC);
            }
        }
        if (arg0 != -32) {
            field186 = 25;
        }
        if (class370.field5198 == 1) {
            class9.field86 = false;
            class469.method2758(class312.field4293, class217.field3071, class224.field3155, class267.field3662, 0);
            return;
        }
        class469.method2758(class312.field4293, class217.field3071, class224.field3155, class267.field3662, 0);
        int var2 = class105.field1430.method362(class56.field767.method590(class105.field1434, -22602), (byte) 67);
        for (class149 var3 = (class149) class260.field3585.method3072((byte) 117); var3 != null; var3 = (class149) class260.field3585.method3066(2)) {
            int var4 = class384.method2208(82, var3);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class312.field4293 = var2 + 8;
        class224.field3155 = class370.field5198 * 16 + (class205.field2910 ? 26 : 22);
    }
}
