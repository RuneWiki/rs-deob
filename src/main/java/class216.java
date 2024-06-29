import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class216 extends class309 {

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "B")
    public byte field2977 = 5;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field2971 = 0;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Z")
    public boolean field2972;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)Z")
    public static final boolean method1344(int arg0, int arg1, int arg2) {
        field2970++;
        if (arg2 > -97) {
            field2971 = -110;
        }
        if ((class455.method2739(false, arg0, arg1) | (arg0 & 0x10000) != 0) || class119.method852(112, arg0, arg1)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class403.method2473(arg0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)I")
    public static final int method1345(int arg0) {
        field2981++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class129.field1674.field10576 && !class129.field1674.field10561) {
            var1 = true;
            if (class495.field6813.field6744 < 512 && class495.field6813.field6744 != 0) {
                var1 = false;
            }
            if (class768.field10562.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
        }
        if (class559.field7878) {
            var3 = false;
        }
        if (class292.field4299) {
            var2 = false;
        }
        if (class695.field9696) {
            var1 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class72.method538((byte) -126);
        }
        if (arg0 != 24722) {
            field2971 = 86;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        if (var1) {
            try {
                var4 = class778.method4286(1000, (byte) 97, 2);
            } catch (Exception var15) {
            }
        }
        if (var3) {
            try {
                var6 = class778.method4286(1000, (byte) 97, 3);
                if (class688.field9602.field8517.method2604((byte) -98) == 3) {
                    class260 var7 = class111.field1332.method172();
                    long var8 = var7.field3812 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field3811;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class778.method4286(1000, (byte) 97, 1);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class72.method538((byte) 119);
        }
        int var11 = (int) ((float) var5 * 1.1F);
        int var12 = (int) ((float) var6 * 1.1F);
        if (var4 > var12 && var4 > var11) {
            return class754.method4161(arg0 ^ 0x6742, var4);
        } else if (var12 <= var11) {
            return class731.method4070(1, var11, (byte) -90);
        } else {
            return class731.method4070(3, var12, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1346(String arg0, int arg1) {
        field2973++;
        if (arg0 == null) {
            return -1;
        }
        int var2 = 14 / ((17 - arg1) / 37);
        for (int var3 = 0; var3 < class688.field9600; var3++) {
            if (arg0.equalsIgnoreCase(class396.field5622[var3])) {
                return var3;
            }
        }
        return -1;
    }
}
