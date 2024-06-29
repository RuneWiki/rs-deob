import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public abstract class class192 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "[I")
    public static int[] field2972 = new int[4];

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field2974 = 20;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field2978 = 0;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[I")
    public static int[] field2975 = new int[256];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1289(int arg0, String arg1) {
        field2971++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class166.field2604; var2++) {
            if (arg1.equalsIgnoreCase(class129.field2024[var2])) {
                return var2;
            }
        }
        if (arg0 != -20473) {
            method1294((byte) -40, -92, 5, -100);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
    public abstract void method1290(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(ILjava/lang/String;)V")
    public static final void method1291(int arg0, String arg1) {
        int var2 = class198.method1348(true, arg1);
        field2979++;
        if (var2 != -1) {
            int[] var3 = class230.field3654.method1758(class93.field1596.field3243[var2] >> 14 & 0x3FFF, class93.field1596.field3243[var2] & 0x3FFF, (byte) -110, class93.field1596.field3243[var2] >> 28 & 0x3);
            class223.method1501(var3[2], (byte) 100, var3[arg0]);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field2972 = null;
        field2975 = null;
        if (arg0 != 20) {
            field2972 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIII)I")
    public static final int method1293(int arg0, int arg1, int arg2, int arg3) {
        field2977++;
        if (~(class181.field2827[arg2][arg3][arg1] & 0x8) == arg0) {
            return arg2 <= 0 || (class181.field2827[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BIII)I")
    public static final int method1294(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -126) {
            return -107;
        }
        field2983++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Ljb;")
    public static final class276 method1295(int arg0) {
        field2984++;
        byte[] var1 = class198.field3123[arg0];
        int var2 = class28.field390[0] * class171.field2679[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class94.field1601[class55.method420(var1[var4], 255)];
        }
        class276 var5 = new class276(class213.field3317, class130.field2056, class193.field3066[0], class108.field1779[0], class28.field390[0], class171.field2679[0], var3);
        class19.method179(8);
        return var5;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
    public abstract void method1296(int arg0, int arg1);
}
