import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class547 extends class774 {

    @OriginalMember(owner = "client!fha", name = "G", descriptor = "[S")
    private static short[] field6832 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fha", name = "I", descriptor = "[S")
    private static short[] field6834 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!fha", name = "M", descriptor = "[S")
    private static short[] field6838 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fha", name = "N", descriptor = "I")
    public static int field6839 = 0;

    @OriginalMember(owner = "client!fha", name = "H", descriptor = "[[S")
    public static short[][] field6833 = new short[][] { field6832, field6834, field6838 };

    @OriginalMember(owner = "client!fha", name = "E", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!fha", name = "F", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!fha", name = "K", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!fha", name = "L", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!fha", name = "O", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!fha", name = "P", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!fha", name = "J", descriptor = "[B")
    private byte[] field6835;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(IILjha;I)V")
    public static final void method2959(int arg0, int arg1, class33 arg2, int arg3) {
        field6841++;
        int[] var4 = new int[4];
        class642.method3478(var4, arg3, var4.length, arg0);
        class780.method4276(var4, arg1, (byte) 75, arg2);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2960(int arg0, int arg1, int arg2, int arg3) {
        this.field6835 = new byte[arg0 * arg3 * arg2 * 2];
        field6837++;
        this.method2291(arg2, arg0, false, arg3);
        int var5 = 57 / ((49 - arg1) / 46);
        return this.field6835;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lel;[[BI)V")
    public static final void method2961(class752 arg0, byte[][] arg1, int arg2) {
        if (arg2 != -17429) {
            method2959(30, -7, null, -68);
        }
        field6830++;
        for (int var3 = 0; var3 < arg0.field7591; var3++) {
            class204.method1385(116);
            for (int var4 = 0; var4 < class240.field3280 >> 3; var4++) {
                for (int var5 = 0; var5 < class276.field3602 >> 3; var5++) {
                    int var6 = class788.field10788[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field7571 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFB) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class644.field8240.length; var12++) {
                                if (class644.field8240[var12] == var11 && arg1[var12] != null) {
                                    arg0.method4082(true, class576.field7320, arg1[var12], var4 * 8, var5 * 8, var8, class179.field2391, var3, var7, (var9 & 0x7) * 8, (var10 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2962(byte arg0, String arg1) {
        field6836++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        if (arg0 != 4) {
            method2962((byte) 108, null);
        }
        String var2 = class463.method2604(arg1, (byte) -125);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class703.field9297; var3++) {
            String var4 = class176.field2319[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class463.method2604(var4, (byte) 43);
            if (var5 != null && var5.equals(var2)) {
                class703.field9297--;
                for (int var6 = var3; var6 < class703.field9297; var6++) {
                    class176.field2319[var6] = class176.field2319[var6 + 1];
                    class686.field8837[var6] = class686.field8837[var6 + 1];
                    class459.field5995[var6] = class459.field5995[var6 + 1];
                    class506.field6470[var6] = class506.field6470[var6 + 1];
                    class645.field8248[var6] = class645.field8248[var6 + 1];
                    class341.field4181[var6] = class341.field4181[var6 + 1];
                }
                class20.field180++;
                class351.field4289 = class518.field6597;
                class13 var7 = class659.method3587(class68.field909, 98, class113.field1500);
                var7.field130.method1491(-129, class32.method168(arg1, 107));
                var7.field130.method1547(arg1, arg0 - 6461);
                class116.method679(var7, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "()V")
    public class547() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(Z)V")
    public static void method2963(boolean arg0) {
        if (arg0) {
            method2962((byte) 19, null);
        }
        field6834 = null;
        field6833 = null;
        field6832 = null;
        field6838 = null;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(BIB)V")
    public final void method2964(byte arg0, int arg1, byte arg2) {
        field6831++;
        byte var4 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var5 = arg1 * 2;
        int var6 = -22 % ((arg2 - 28) / 34);
        int var10001 = var5;
        int var7 = var5 + 1;
        this.field6835[var10001] = var4;
        this.field6835[var7] = var4;
    }
}
