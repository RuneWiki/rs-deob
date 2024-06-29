import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class334 extends class75 {

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field5418 = 0;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "Ljava/lang/String;")
    public static String field5420 = "glow1:";

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "[Z")
    public static boolean[] field5424 = new boolean[100];

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
    public static int field5425 = 0;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "Lnm;")
    public static class221 field5417;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[[I", line = 8)
    public final int[][] method22(int arg0, int arg1) {
        if (arg0 != -21194) {
            method2362((byte) -126);
        }
        field5423++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556 && this.method511(256)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg1 % this.field1134 * this.field1134;
            for (int var8 = 0; var8 < class326.field5342; var8++) {
                int var9 = this.field1127[var8 % this.field1132 + var7];
                var5[var8] = class235.method1623(var9 << 4, 4080);
                var6[var8] = class235.method1623(var9 >> 4, 4080);
                var4[var8] = class235.method1623(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)Lnk;", line = 64)
    public static final class341 method2360(byte arg0, int arg1) {
        field5421++;
        class341 var2 = (class341) class258.field4089.method1539(-53, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class345.field5528.method1504(class109.method728(arg1, -108), true, class221.method1518(21298, arg1));
        class341 var4 = new class341();
        if (var3 != null) {
            var4.method2411(new class313(var3), false);
        }
        class258.field4089.method1538(19, (long) arg1, var4);
        if (arg0 != 122) {
            field5425 = -117;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILnm;II)Z", line = 97)
    public static final boolean method2361(int arg0, class221 arg1, int arg2, int arg3) {
        field5422++;
        if (arg2 != 16836) {
            method2361(72, (class221) null, -109, -108);
        }
        byte[] var4 = arg1.method1504(arg3, true, arg0);
        if (var4 == null) {
            return false;
        } else {
            class26.method228(var4, (byte) 51);
            return true;
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(B)V", line = 117)
    public static void method2362(byte arg0) {
        if (arg0 == -111) {
            field5417 = null;
            field5424 = null;
            field5420 = null;
        }
    }
}
