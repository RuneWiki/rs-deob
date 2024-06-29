import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class53 extends class1 {

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Lok;")
    public static class41 field793 = class137.method956("Zugewiesener Speicher)3", 45);

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "[Lmg;")
    public static class314[] field790;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(JI)V", line = 4)
    public static final void method361(long arg0, int arg1) {
        field791++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class281.field4576; var3++) {
            if (class273.field4436[var3] == arg0) {
                class44.field702++;
                class281.field4576--;
                for (int var4 = var3; var4 < class281.field4576; var4++) {
                    class273.field4436[var4] = class273.field4436[var4 + 1];
                    class315.field5310[var4] = class315.field5310[var4 + 1];
                }
                class275.field4508 = class33.field493;
                class285.field4642.method844(arg1 ^ 0xFFFFFFDA, 38);
                class285.field4642.method800(arg0, (byte) -113);
                break;
            }
        }
        if (arg1 != 38) {
            field793 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Llb;I)Lvd;", line = 51)
    public static final class161 method362(class112 arg0, int arg1) {
        field792++;
        class161 var2 = new class161(arg0.method763(true), arg0.method763(true), arg0.method759((byte) -101), arg0.method759((byte) -46), arg0.method779(arg1 ^ 0xFFFF9625), arg1 == arg0.method792(2));
        int var3 = arg0.method792(2);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field2546.method1503(new class250(arg0.method759((byte) -44), arg0.method759((byte) -41), arg0.method759((byte) -91), arg0.method759((byte) -60)), (byte) -86);
        }
        var2.method1138(628);
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[II[JB)V", line = 73)
    public static final void method363(int arg0, int[] arg1, int arg2, long[] arg3, byte arg4) {
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var9;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg3[var10]) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var9;
            method363(arg0, arg1, var6 - 1, arg3, (byte) 127);
            method363(var6 + 1, arg1, arg2, arg3, (byte) 127);
        }
        field788++;
        if (arg4 <= 126) {
            field789 = 87;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 138)
    public static void method364(int arg0) {
        if (arg0 == -12128) {
            field793 = null;
            field790 = null;
        }
    }
}
