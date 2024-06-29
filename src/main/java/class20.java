import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 extends class376 {

    @OriginalMember(owner = "client!an", name = "H", descriptor = "I")
    public int field233 = 0;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field224 = new String[100];

    @OriginalMember(owner = "client!an", name = "B", descriptor = "[I")
    public static int[] field227 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!an", name = "E", descriptor = "F")
    public static float field230 = 1.0F;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "Z")
    public static boolean field234 = false;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "[[S")
    public static short[][] field229;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILiv;)V")
    public final void method181(int arg0, class65 arg1) {
        if (arg0 != 1439100504) {
            field229 = null;
        }
        field231++;
        while (true) {
            int var3 = arg1.method577(arg0 - 1439100249);
            if (var3 == 0) {
                return;
            }
            this.method186(var3, -22, arg1);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public static void method182(int arg0) {
        field229 = null;
        field227 = null;
        if (arg0 != -14495) {
            method183(-57, 50, 81, -3, true, null, false);
        }
        field224 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIZLlp;Z)V")
    public static final void method183(int arg0, int arg1, int arg2, int arg3, boolean arg4, class267 arg5, boolean arg6) {
        field226++;
        if (class388.field5740 >= 50 || arg5 == null || arg5.field3929 == null || arg1 >= arg5.field3929.length || arg5.field3929[arg1] == null) {
            return;
        }
        int var7 = arg5.field3929[arg1][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xEE) >> 5;
        int var10 = var7 & 0x1F;
        if (arg5.field3929[arg1].length > 1) {
            int var11 = (int) ((double) arg5.field3929[arg1].length * Math.random());
            if (var11 > 0) {
                var8 = arg5.field3929[arg1][var11];
            }
        }
        if (var10 != 0) {
            if (!arg4) {
                method185(-40, (byte) -8, 12);
            }
            if (class478.field7044.field3350 != 0) {
                int var12 = arg0 - 64 >> 7;
                int var13 = arg3 - 64 >> 7;
                class476.field7011[class388.field5740++] = new class114((byte) 1, var8, var9, 0, 255, (arg2 << 24) + (var12 << 16) + (var13 << 8) + var10);
            }
        } else if (arg6) {
            class432.method2621(var8, 0, var9, 255, 0);
        }
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)[Lsp;")
    public static final class448[] method184(int arg0) {
        field232++;
        if (arg0 != 0) {
            field230 = -0.30582246F;
        }
        return new class448[] { class297.field4260, client.field2879, class255.field3743, class104.field1451, class258.field3807, class267.field3930 };
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IBI)I")
    public static final int method185(int arg0, byte arg1, int arg2) {
        field225++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg1 != 66) {
            return -1;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILiv;)V")
    private final void method186(int arg0, int arg1, class65 arg2) {
        if (arg0 == 2) {
            this.field233 = arg2.method623((byte) 101);
        }
        field228++;
        if (arg1 >= -13) {
            field230 = -1.2130574F;
        }
    }
}
