import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class59 extends class334 {

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "[B")
    public byte[] field944;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "Lss;")
    public static class213 field939 = new class213("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "[I")
    public static int[] field945 = new int[5];

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "Lbi;")
    public static class104 field946 = new class104(22, -2);

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method446(boolean arg0, boolean arg1, String arg2) {
        field943++;
        if (arg2 == null) {
            return;
        }
        if (class358.field5566 >= 100) {
            class295.method1988(class128.field1729.method1583(92, class12.field131), 0);
            return;
        }
        String var3 = class114.method736((byte) -61, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class358.field5566; var4++) {
            String var8 = class114.method736((byte) -61, class329.field5176[var4]);
            if (var8 != null && var8.equals(var3)) {
                class295.method1988(arg2 + class514.field7627.method1583(79, class12.field131), 0);
                return;
            }
            if (class12.field132[var4] != null) {
                String var9 = class114.method736((byte) -61, class12.field132[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class295.method1988(arg2 + class514.field7627.method1583(83, class12.field131), 0);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class162.field2352; var5++) {
            String var6 = class114.method736((byte) -61, class401.field6038[var5]);
            if (var6 != null && var6.equals(var3)) {
                class295.method1988(class80.field1192.method1583(85, class12.field131) + arg2 + class156.field2094.method1583(86, class12.field131), 0);
                return;
            }
            if (class180.field2621[var5] != null) {
                String var7 = class114.method736((byte) -61, class180.field2621[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class295.method1988(class80.field1192.method1583(104, class12.field131) + arg2 + class156.field2094.method1583(93, class12.field131), 0);
                    return;
                }
            }
        }
        if (class114.method736((byte) -61, class358.field5565.field5443).equals(var3)) {
            class295.method1988(class434.field6554.method1583(94, class12.field131), 0);
            return;
        }
        class242.field3924++;
        if (arg0) {
            class81.method578((byte) 66, class447.field6933);
            class170.field2488.method1479((byte) -86, class147.method896(arg2, (byte) -99) + 1);
            class170.field2488.method1458(arg2, (byte) 78);
            class170.field2488.method1479((byte) -87, arg1 ? 1 : 0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIII)I")
    public static final int method447(int arg0, int arg1, int arg2, int arg3) {
        field941++;
        if (arg3 != 5) {
            method446(true, true, null);
        }
        int var4 = 255 - arg0;
        int var5 = ((arg2 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg2 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        return (((arg1 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg1 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "([B)V")
    public class59(byte[] arg0) {
        this.field944 = arg0;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public static void method448(byte arg0) {
        field946 = null;
        if (arg0 == -85) {
            field945 = null;
            field939 = null;
        }
    }
}
