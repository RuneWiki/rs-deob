import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class293 {

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field3963 = 0;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public int field3966;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[Ljava/lang/String;Z[SI)V")
    public static final void method1696(int arg0, String[] arg1, boolean arg2, short[] arg3, int arg4) {
        field3965++;
        if (arg0 > arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method1696(var6 - 1, arg1, true, arg3, arg4);
            method1696(arg0, arg1, true, arg3, var6 + 1);
        }
        if (!arg2) {
            field3963 = 58;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)I")
    public static final int method1697(byte arg0, int arg1) {
        int var2 = 38 % ((arg0 - 14) / 56);
        field3964++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1698(int arg0, int arg1) {
        if (arg1 <= 75) {
            method1697((byte) -127, 119);
        }
        field3961++;
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }
}
