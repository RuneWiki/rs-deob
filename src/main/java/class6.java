import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class6 extends class393 {

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "Ljava/lang/String;")
    public static String field61 = " is already on your ignore list.";

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "Ljava/lang/String;")
    public static String field60 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "F")
    public static float field51 = 0.0F;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    public static volatile int field62 = 0;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "[I")
    public static int[] field63 = new int[13];

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "Ljava/lang/String;")
    public static String field59 = "Loaded input handler";

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method48(byte arg0, int arg1) {
        field54++;
        return arg0 == 41 ? arg1 & 0xFF : 56;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBI)I", line = 15)
    public static final int method49(int arg0, byte arg1, int arg2) {
        int var3 = 98 / ((arg1 + 36) / 50);
        field56++;
        return arg0 == 4 || arg0 == 5 ? class116.field1576[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V", line = 30)
    public static void method50(byte arg0) {
        if (arg0 > -65) {
            field58 = -46;
        }
        field59 = null;
        field60 = null;
        field61 = null;
        field63 = null;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)I", line = 51)
    public static final int method51(int arg0) {
        field53++;
        if (arg0 > -10) {
            field61 = null;
        }
        if (class106.field1428 == null) {
            return class425.field6312 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lfg;I)I", line = 66)
    public static final int method52(class18 arg0, int arg1) {
        field55++;
        if (arg0.field285 == 0) {
            return 0;
        }
        if (arg1 != 16383) {
            field63 = null;
        }
        if (arg0.field230 != -1 && arg0.field230 < 32768) {
            class129 var2 = class23.field408[arg0.field230];
            if (var2 != null) {
                int var3 = arg0.field5284 - var2.field5284;
                int var4 = arg0.field5298 - var2.field5298;
                if (var3 != 0 || var4 != 0) {
                    arg0.method143(-1408718297, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg0.field230 >= 32768) {
            int var5 = arg0.field230 - 32768;
            if (class452.field6590 == var5) {
                var5 = 2047;
            }
            class194 var6 = class125.field1664[var5];
            if (var6 != null) {
                int var7 = arg0.field5284 - var6.field5284;
                int var8 = arg0.field5298 - var6.field5298;
                if (var7 != 0 || var8 != 0) {
                    arg0.method143(-1408718297, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0.field221 != 0 || arg0.field274 != 0) && (arg0.field309 == 0 || arg0.field296 > 0)) {
            int var9 = arg0.field5284 - (arg0.field221 - class184.field2482 - class184.field2482) * 64;
            int var10 = arg0.field5298 - ((arg0.field274 - class38.field620 - class38.field620) * 64);
            if (var9 != 0 || var10 != 0) {
                arg0.method143(-1408718297, (int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF);
            }
            arg0.field221 = 0;
            arg0.field274 = 0;
        }
        return arg0.method125(arg1 ^ 0x3FFD);
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(II)V", line = 139)
    public class6(int arg0, int arg1) {
        this.field52 = arg1;
        this.field57 = arg0;
    }
}
