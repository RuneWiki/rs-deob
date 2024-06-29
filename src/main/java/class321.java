import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class321 {

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Lbg;")
    public static class324 field4528 = new class324(50, 3);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "Lau;")
    public class516 field4523;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "[I")
    public int[] field4525;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method1986(int arg0) {
        field4528 = null;
        if (arg0 != 3) {
            method1987(-83, null, (byte) -17, -86);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;")
    public static final String method1987(int arg0, String[] arg1, byte arg2, int arg3) {
        field4526++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var12 = arg1[var7];
                if (var12 == null) {
                    var6 += 4;
                } else {
                    var6 += var12.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var11 = arg1[var9];
                if (var11 == null) {
                    var8.append("null");
                } else {
                    var8.append(var11);
                }
            }
            int var10 = 117 / ((45 - arg2) / 53);
            return var8.toString();
        }
    }
}
