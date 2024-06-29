import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class326 {

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field5060 = 0;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[F")
    public static float[] field5062 = new float[4];

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field5065 = -1;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Ljava/awt/Font;")
    public static Font field5061;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lli;", line = 11)
    public static final class219 method2238(int arg0, int arg1) {
        field5057++;
        if (arg0 != 1) {
            field5064 = -102;
        }
        class219 var2 = (class219) class55.field866.method2017(1022, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class175.field2760.method467(arg1 & 0x7FFF, 110, 1);
        } else {
            var3 = class176.field2764.method467(arg1, 80, 1);
        }
        class219 var4 = new class219();
        if (var3 != null) {
            var4.method1583(new class101(var3), -119);
        }
        if (arg1 >= 32768) {
            var4.method1578(7291);
        }
        class55.field866.method2018((long) arg1, var4, -114);
        return var4;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 49)
    public static void method2239(boolean arg0) {
        if (arg0) {
            method2238(38, -14);
        }
        field5061 = null;
        field5062 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;", line = 64)
    public static final String[] method2240(int arg0, String arg1, char arg2) {
        if (arg0 > -89) {
            return (String[]) null;
        }
        field5059++;
        int var3 = class273.method1970(false, arg2, arg1);
        int var4 = 0;
        String[] var5 = new String[var3 + 1];
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg2; var8++) {
            }
            var5[var4++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var5[var3] = arg1.substring(var6);
        return var5;
    }
}
