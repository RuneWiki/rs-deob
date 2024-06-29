import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class315 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field4901;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[I")
    public int[] field4908;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "[Ljava/lang/String;")
    public String[] field4911;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "[B")
    public byte[] field4902;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "[I")
    public int[] field4910;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4903 = null;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
    public static boolean field4907 = false;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
    public static int[] field4900 = new int[50];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Z", line = 8)
    public final boolean method2187(int arg0, int arg1) {
        if (arg0 == 0) {
            field4909++;
            return (this.field4902[arg1] & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)[F", line = 21)
    public static final float[] method2188(int arg0) {
        field4912++;
        float var1 = class109.method747() + class109.method757();
        int var2 = class109.method756();
        float var3 = (float) ((var2 & 0xFF8604) >> 16) / 255.0F;
        class136.field2057[3] = 1.0F;
        float var4 = (float) (var2 >> 8 & 0xFF) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        if (arg0 != 5247) {
            method2188(-77);
        }
        float var6 = 0.58823526F;
        class136.field2057[1] = class185.field2978[1] * var4 * var6 * var1;
        class136.field2057[0] = class185.field2978[0] * var3 * var6 * var1;
        class136.field2057[2] = class185.field2978[2] * var5 * var6 * var1;
        return class136.field2057;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)I", line = 47)
    public final int method2189(int arg0, int arg1) {
        if (arg1 >= -97) {
            this.field4911 = (String[]) null;
        }
        field4906++;
        return this.field4902[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)Z", line = 61)
    public final boolean method2190(int arg0, byte arg1) {
        if (arg1 != -106) {
            this.field4910 = (int[]) null;
        }
        field4905++;
        return (this.field4902[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IB)Z", line = 76)
    public final boolean method2191(int arg0, byte arg1) {
        if (arg1 != -87) {
            this.method2190(22, (byte) 68);
        }
        field4904++;
        return (this.field4902[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 102)
    public static void method2192(int arg0) {
        field4903 = null;
        field4900 = null;
        if (arg0 != 4) {
            field4907 = true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V", line = 111)
    public class315(int arg0) {
        this.field4901 = arg0;
        this.field4908 = new int[this.field4901];
        this.field4911 = new String[this.field4901];
        this.field4902 = new byte[this.field4901];
        this.field4910 = new int[this.field4901];
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lkb;Lkb;I)V", line = 129)
    public static final void method2193(class39 arg0, class39 arg1, int arg2) {
        class64.field852 = arg1;
        field4899++;
        class324.field5063 = arg0;
        class64.field852.method261(-121, 34);
        int var3 = arg2 + (int) (Math.random() * 21.0D);
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class281.field4430 = var3 + var5;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class31.field439 = var4 + var5;
        class313.field4881 = var6 + var5;
    }
}
