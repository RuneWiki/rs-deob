import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class164 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
    private int[] field3025;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lhj;")
    public static class69 field3028 = class181.method1318(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) -115);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lka;")
    public static class243 field3022 = new class243();

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "J")
    public static long field3031 = 0L;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lhj;")
    public static class69 field3032 = class181.method1318("Lade Titelbild )2 ", (byte) -117);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lsd;")
    public static class42 field3029;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "[S")
    public static short[] field3030;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)I")
    public final int method1216(byte arg0, int arg1) {
        int var3 = (this.field3025.length >> 1) - 1;
        int var4 = 17 / ((arg0 - 11) / 42);
        field3024++;
        int var5 = arg1 & var3;
        while (true) {
            int var6 = this.field3025[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field3025[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var5 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method1217(byte arg0) {
        field3030 = null;
        field3029 = null;
        field3028 = null;
        if (arg0 > 94) {
            field3022 = null;
            field3032 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BIIII)V")
    public static final void method1218(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3026++;
        class65 var5 = (class65) class4.field25.method769(true, (long) arg1);
        if (var5 == null) {
            var5 = new class65();
            class4.field25.method761((long) arg1, 0, var5);
        }
        int var6 = 95 / ((arg0 - 17) / 54);
        if (arg3 >= var5.field1261.length) {
            int[] var7 = new int[arg3 + 1];
            int[] var8 = new int[arg3 + 1];
            for (int var9 = 0; var9 < var5.field1261.length; var9++) {
                var7[var9] = var5.field1261[var9];
                var8[var9] = var5.field1257[var9];
            }
            for (int var10 = var5.field1261.length; var10 < arg3; var10++) {
                var7[var10] = -1;
                var8[var10] = 0;
            }
            var5.field1261 = var7;
            var5.field1257 = var8;
        }
        var5.field1261[arg3] = arg4;
        var5.field1257[arg3] = arg2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Lqb;")
    public static final class56 method1219(int arg0) {
        int var1 = class69.field1350[0] * class113.field2167[0];
        byte[] var2 = class157.field2919[0];
        field3023++;
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class50.field841[class69.method443(255, var2[var4])];
        }
        int var5 = 8 / ((-arg0 - 67) / 46);
        class264 var6 = new class264(class229.field4196, class53.field941, class138.field2585[0], class88.field1682[0], class69.field1350[0], class113.field2167[0], var3);
        class229.method1636((byte) 37);
        return var6;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([I)V")
    public class164(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3025 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3025[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3025[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3025[var5 + var5] = arg0[var4];
            this.field3025[var5 + var5 + 1] = var4++;
        }
    }
}
