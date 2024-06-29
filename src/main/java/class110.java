import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class110 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1448 = 0;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "[I")
    public static int[] field1450 = new int[16384];

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
    public static int[] field1452 = new int[16384];

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Ljr;")
    public static class318 field1454;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method675(int arg0) {
        if (arg0 >= 69) {
            field1452 = null;
            field1450 = null;
            field1454 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
    public static final void method676(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 32768) {
            method677((char) 65456, (String) null, (byte) 26);
        }
        field1451++;
        if (arg0 > arg3) {
            for (int var5 = arg3; var5 < arg0; var5++) {
                class292.field4448[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg3; var6++) {
                class292.field4448[var6][arg1] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(CLjava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method677(char arg0, String arg1, byte arg2) {
        if (arg2 > -100) {
            return null;
        }
        field1449++;
        int var3 = class147.method919(29478, arg1, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg0; var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1450[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field1452[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field1453 = 999999;
        field1454 = new class318();
    }
}
