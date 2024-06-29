import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class648 {

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "[F")
    public static float[] field9001 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "Ljw;")
    public static class581 field9004 = new class581(61, -1);

    @OriginalMember(owner = "client!kia", name = "j", descriptor = "Z")
    public static boolean field9005 = false;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!kia", name = "h", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "Lvr;")
    public static class147 field9000;

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "Lvr;")
    public static class147 field9002;

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "Lub;")
    public static class22 field8997;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V", line = 11)
    public static void method3619(int arg0) {
        field9004 = null;
        field9002 = null;
        field8997 = null;
        field9000 = null;
        if (arg0 >= 97) {
            field9001 = null;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 27)
    public static final String method3620(int arg0, String arg1) {
        field8999++;
        String var2 = null;
        int var3 = arg1.indexOf("--> ");
        if (arg0 <= var3) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var4 = arg1.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg1.length();
                arg1 = arg1.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)V", line = 72)
    public static final void method3621(int arg0, int arg1, int arg2) {
        int var3 = -46 / ((-arg1 - 22) / 34);
        field8996++;
        class16 var4 = class94.method753(14, 13175, (long) arg0);
        var4.method119(-107);
        var4.field237 = arg2;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(BII)Z", line = 85)
    public static final boolean method3622(byte arg0, int arg1, int arg2) {
        field9003++;
        if (arg0 > -21) {
            method3622((byte) 83, 48, -73);
        }
        return (arg1 & 0x84080) != 0;
    }
}
