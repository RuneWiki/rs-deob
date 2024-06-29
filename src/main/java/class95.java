import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class95 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Z")
    public static boolean field1316 = false;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "[I")
    public static int[] field1318 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lle;")
    public static class65 field1315 = new class65(64);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lij;")
    public static class316 field1311;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[B")
    public static byte[] field1314;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILjava/lang/Class;)Lti;", line = 7)
    public static final class5 method734(int arg0, int arg1, int arg2, Class arg3) {
        class63 var4 = class341.field4617[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class48 var5 = var4.field853; var5 != null; var5 = var5.field608) {
            class5 var6 = var5.field617;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field52 == arg1 && var6.field55 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lvg;B)V", line = 32)
    public static final void method735(class108 arg0, byte arg1) {
        if (arg1 >= -84) {
            field1318 = null;
        }
        if (arg0.field1666 == 5 && arg0.field1575 != -1) {
            class17.method102(true, class354.field4765, arg0);
        }
        field1312++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 53)
    public static void method736(byte arg0) {
        field1314 = null;
        if (arg0 <= 95) {
            field1315 = null;
        }
        field1315 = null;
        field1311 = null;
        field1318 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 69)
    public static final void method737(byte arg0) {
        class63.field852 = 0;
        class93.field1300 = -1;
        field1317++;
        if (arg0 >= -48) {
            method734(-47, 62, -88, (Class) null);
        }
        class233.field3265 = -1;
        class111.field1711 = -1;
    }
}
