import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class137 extends class197 {

    @OriginalMember(owner = "client!el", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field2342 = "Cancel";

    @OriginalMember(owner = "client!el", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field2336 = "Close";

    @OriginalMember(owner = "client!el", name = "jb", descriptor = "I")
    public static int field2343 = 0;

    @OriginalMember(owner = "client!el", name = "eb", descriptor = "I")
    public static int field2338 = 0;

    @OriginalMember(owner = "client!el", name = "db", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!el", name = "fb", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!el", name = "gb", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!el", name = "hb", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "[Z")
    public static boolean[] field2335;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)V", line = 5)
    public static void method955(byte arg0) {
        field2342 = null;
        field2336 = null;
        field2335 = null;
        int var1 = 72 % ((71 - arg0) / 53);
    }

    @OriginalMember(owner = "client!el", name = "j", descriptor = "(I)V", line = 21)
    public static final void method956(int arg0) {
        class298.field4848 = null;
        if (arg0 <= 10) {
            field2338 = -4;
        }
        field2341++;
        class54.field1081 = (byte[][][]) null;
        class79.field1409 = (byte[][][]) null;
        class144.field2418 = null;
        class58.field1145 = null;
        class198.field3307 = null;
        class99.field1811 = (byte[][][]) null;
        class144.field2417 = null;
        class11.field367 = null;
        class167.field2793 = (int[][][]) null;
        class355.field5656 = (byte[][][]) null;
        class1.field23 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(IIIII)V", line = 49)
    public static final void method957(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2337++;
        class199 var5 = class173.method1231(false, 10, arg3);
        if (arg0 != 2088751436) {
            field2343 = -26;
        }
        var5.method1367((byte) -38);
        var5.field3340 = arg1;
        var5.field3338 = arg4;
        var5.field3343 = arg2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[[I", line = 77)
    public final int[][] method122(int arg0, int arg1) {
        field2339++;
        if (arg1 != 4944) {
            field2340 = 43;
        }
        int[][] var3 = this.field3152.method1953(arg0, 126);
        if (this.field3152.field4493 && this.method1349(arg1 - 4945)) {
            int[] var4 = var3[1];
            int var5 = arg0 % this.field3292 * this.field3292;
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            for (int var8 = 0; var8 < class26.field672; var8++) {
                int var9 = this.field3305[var8 % this.field3298 + var5];
                var6[var8] = class83.method613(var9 << 4, 4080);
                var4[var8] = class83.method613(var9, 65280) >> 4;
                var7[var8] = class83.method613(var9, 16711680) >> 12;
            }
        }
        return var3;
    }
}
