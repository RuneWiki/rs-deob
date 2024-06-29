import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class class92 extends class84 {

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field1276 = 10;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1277 = "Choose Option";

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public static int field1279 = 0;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lge;B)V")
    public static final void method597(class72 arg0, byte arg1) {
        short var2 = 256;
        for (int var3 = 0; var3 < class283.field4384.length; var3++) {
            class283.field4384[var3] = 0;
        }
        field1285++;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class283.field4384[var16] = (int) (Math.random() * 284.0D);
        }
        int var5 = 0;
        if (arg1 <= 120) {
            field1279 = 84;
        }
        while (var5 < 20) {
            for (int var12 = 1; var12 < (var2 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class146.field2034[var15] = (class283.field4384[var15 + 1] + class283.field4384[var15 - 128] + class283.field4384[var15 + -1] + class283.field4384[var15 - -128]) / 4;
                }
            }
            int[] var13 = class283.field4384;
            class283.field4384 = class146.field2034;
            class146.field2034 = var13;
            var5++;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2609; var7++) {
            for (int var8 = 0; var8 < arg0.field2611; var8++) {
                if (arg0.field997[var6++] != 0) {
                    int var9 = var7 + arg0.field2612 + 16;
                    int var10 = var8 + arg0.field2610 + 16;
                    int var11 = (var9 << 7) + var10;
                    class283.field4384[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(BI)I")
    public static final int method598(byte arg0, int arg1) {
        field1284++;
        if (arg0 != 67) {
            field1279 = -123;
        }
        if (arg1 > 0) {
            return 1;
        } else if (arg1 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)Z")
    public abstract boolean method599(int arg0);

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)V")
    public static void method600(int arg0) {
        if (arg0 != 8937) {
            method597((class72) null, (byte) 71);
        }
        field1277 = null;
    }

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method601(int arg0);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lme;")
    public static final class230 method602(int arg0, int arg1) {
        field1282++;
        class230 var2 = (class230) class278.field4312.method961((long) arg1, 9156);
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -70) {
            field1279 = -57;
        }
        byte[] var3 = class142.field1971.method1576(-120, 11, arg1);
        class230 var4 = new class230();
        if (var3 != null) {
            var4.method1521(new class224(var3), 113);
        }
        class278.field4312.method957(21915, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method603(String arg0, int arg1) {
        field1281++;
        int var2 = class273.method1823((byte) -121, arg0);
        if (var2 == -1) {
            return;
        }
        int[] var3 = class210.field3000.method1701(30, class146.field2037.field2386[var2] >> 28 & 0x3, class146.field2037.field2386[var2] & 0x3FFF, class146.field2037.field2386[var2] >> 14 & 0x3FFF);
        if (arg1 != -24088) {
            method597((class72) null, (byte) -33);
        }
        class270.method1785(var3[1], true, var3[2]);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)Lwd;")
    public static final class23 method604(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        return var3 == null || var3.field1237 == null ? null : var3.field1237;
    }
}
