import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class750 extends class638 {

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lht;")
    public static class393 field10454 = new class393();

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field10450;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public int field10453;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public int field10455;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public int field10456;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field10457;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lpe;")
    public class109 field10451;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lro;")
    public static class522 field10452;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 6)
    public static void method4180(int arg0) {
        if (arg0 != 0) {
            field10457 = -11;
        }
        field10452 = null;
        field10454 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;", line = 17)
    public static final String[] method4181(byte arg0, String arg1, char arg2) {
        field10458++;
        int var3 = class562.method3254((byte) -58, arg2, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = -107 / ((arg0 - 54) / 51);
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = var7; arg1.charAt(var9) != arg2; var9++) {
            }
            var4[var5++] = arg1.substring(var7, var9);
            var7 = var9 + 1;
        }
        var4[var3] = arg1.substring(var7);
        return var4;
    }
}
