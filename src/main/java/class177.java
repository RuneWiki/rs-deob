import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class177 {

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public int field2213 = -1;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Z")
    public static boolean field2211 = false;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field2215 = 0;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Z")
    public static boolean field2217 = true;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lqp;")
    public static class278 field2214;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lml;")
    public class451 field2212;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "[I")
    public static int[] field2221;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "[I")
    public int[] field2222;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field2218;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V")
    public static final void method931(int arg0, byte arg1) {
        field2219++;
        class40 var2 = class162.method872(arg0, (byte) 92, 2);
        var2.method193(-118);
        if (arg1 >= -80) {
            field2217 = true;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BZ)V")
    public static final void method932(byte arg0, boolean arg1) {
        field2220++;
        byte[][] var2;
        if (arg1) {
            var2 = class297.field4042;
        } else {
            var2 = class105.field1293;
        }
        int var3 = class295.field4011.length;
        if (arg0 != -95) {
            field2216 = 45;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class138.field1777[var4] >> 8) * 64 - class70.field767;
                int var7 = (class138.field1777[var4] & 0xFF) * 64 - class291.field3961;
                class449.method2771(-32);
                class382.method2367((byte) -40, class36.field352, class88.field1003, var7, var5, arg1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public static void method933(boolean arg0) {
        if (arg0) {
            method932((byte) 100, false);
        }
        field2221 = null;
        field2214 = null;
    }
}
