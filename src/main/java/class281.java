import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class281 {

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public int field4627 = -1;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4624 = "Loaded interfaces";

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4630 = "Ok";

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field4617;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 20)
    public static void method1993(int arg0) {
        field4630 = null;
        field4624 = null;
        if (arg0 != -1) {
            field4630 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V", line = 35)
    public static final void method1994(int arg0, short[] arg1, int arg2, String[] arg3, int arg4) {
        if (arg0 < arg2) {
            int var5 = arg0;
            int var6 = (arg0 + arg2) / 2;
            String var7 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var7;
            short var8 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5++] = var11;
                }
            }
            arg3[arg2] = arg3[var5];
            arg3[var5] = var7;
            arg1[arg2] = arg1[var5];
            arg1[var5] = var8;
            method1994(arg0, arg1, var5 - 1, arg3, 37);
            method1994(var5 + 1, arg1, arg2, arg3, 119);
        }
        if (arg4 <= 16) {
            field4625 = 71;
        }
        field4629++;
    }
}
