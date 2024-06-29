import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class146 extends RuntimeException {

    @OriginalMember(owner = "client!su", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2241;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "Ljava/lang/String;")
    public String field2243;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "[I")
    public static int[] field2239 = new int[25];

    @OriginalMember(owner = "client!su", name = "b", descriptor = "D")
    public static double field2240 = -1.0D;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "Luaa;")
    public static class395 field2244;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "Lpp;")
    public static class464 field2245;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field2248;

    static {
        new class567("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field2244 = new class395(64);
        field2247 = 104;
        field2245 = new class464(10, 3);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lqa;I)V", line = 5)
    public static final void method1066(class167 arg0, int arg1) {
        field2242++;
        arg0.method615(0, 0, class68.field1285, 350);
        arg0.method653(0, 0, class68.field1285, 350, class217.field3276 << 24 | 0x332277, 1);
        int var2 = 350 / class105.field1762;
        if (class308.field4466 > 0) {
            int var3 = 346 - class105.field1762 - 4;
            int var4 = var2 * var3 / (class308.field4466 + var2 - 1);
            int var5 = 4;
            if (class308.field4466 > 1) {
                var5 += (var3 - var4) * (class308.field4466 - class637.field9254 - 1) / (class308.field4466 - 1);
            }
            arg0.method653(class68.field1285 - 16, var5, 12, var4, class217.field3276 << 24 | 0x332277, 2);
            for (int var6 = class637.field9254; var6 < (class637.field9254 + var2) && var6 < class308.field4466; var6++) {
                String[] var7 = class580.method3325((byte) 118, '\b', class555.field7859[var6]);
                int var8 = (class68.field1285 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method615(var10, 0, var8 + var10 - 8, 350);
                    class409.field6077.method1642(-16777216, (byte) -60, var10, 350 - class106.field1780.field9192 - class558.field7906 - ((-class637.field9254 + var6) * class105.field1762) - 2, var7[var9], -1);
                }
            }
        }
        if (arg1 != -26173) {
            return;
        }
        arg0.method615(0, 0, class68.field1285, 350);
        arg0.method1160(class68.field1285, 350 - class558.field7906, 0, -3, -1);
        class273.field3996.method1642(-16777216, (byte) 77, 10, 350 - class26.field358.field9192 - 1, "--> " + class57.field822, -1);
        if (!class497.field6973) {
            return;
        }
        int var11 = -1;
        if (class310.field4553 % 30 > 15) {
            var11 = 16777215;
        }
        arg0.method1164(12, class26.field358.method3651(arg1 ^ 0x4E9B, "--> " + class57.field822.substring(0, class424.field6206)) + 10, 1, 350 - (class26.field358.field9192 + 11), var11);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V", line = 77)
    public static void method1067(int arg0) {
        field2239 = null;
        field2245 = null;
        if (arg0 != -28558) {
            field2248 = -13;
        }
        field2244 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(JJ)J", line = 90)
    public static long method1068(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 97)
    public class146(Throwable arg0, String arg1) {
        this.field2241 = arg0;
        this.field2243 = arg1;
    }
}
