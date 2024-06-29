import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class428 extends class18 {

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lcm;")
    public static class449 field6358 = new class449(74, 7);

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "F")
    public static float field6370;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field6359;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field6362;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field6364;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public int field6365;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field6368;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public int field6369;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Ljava/lang/String;")
    public String field6366;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "[Luf;")
    public static class349[] field6363;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method2565(byte arg0) {
        int var1 = -83 % ((arg0 - 59) / 59);
        field6363 = null;
        field6358 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2566(String[] arg0, int arg1) {
        if (arg1 != 5) {
            return null;
        }
        field6367++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method2567(int arg0, int arg1) {
        if (arg1 == 992180488) {
            field6360++;
            return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
        } else {
            return null;
        }
    }
}
