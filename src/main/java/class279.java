import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class279 extends class23 {

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "[Lqd;")
    public static class40[] field4706 = new class40[100];

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public static int field4707 = 0;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "Lqd;")
    public static class40 field4704 = class147.method1106(": ", (byte) -76);

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "Lqd;")
    public static class40 field4709 = class147.method1106("Sprites geladen)3", (byte) -125);

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)[I", line = 6)
    public final int[] method32(byte arg0, int arg1) {
        field4702++;
        int[] var3 = this.field403.method724((byte) 81, arg1);
        if (arg0 != -94) {
            field4709 = (class40) null;
        }
        if (this.field403.field1760) {
            int[][] var4 = this.method173(0, arg1, (byte) -124);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class52.field1007; var8++) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V", line = 51)
    public static final void method1950(int arg0, int arg1) {
        field4705++;
        class177 var2 = class177.method1310(arg0 + 97, 11, arg1);
        var2.method1303((byte) 107);
        if (arg0 != 1) {
            field4709 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B[B)Ljh;", line = 66)
    public static final class259 method1951(byte arg0, byte[] arg1) {
        field4703++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 < 121) {
            method1952((byte) 11, true);
        }
        class259 var2;
        if (class21.field350) {
            var2 = new class36(arg1, class12.field208, class256.field4265, class102.field1802, class210.field3356, class22.field387);
        } else {
            var2 = new class262(arg1, class12.field208, class256.field4265, class102.field1802, class210.field3356, class22.field387);
        }
        class181.method1324(-105);
        return var2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BZ)I", line = 89)
    public static final int method1952(byte arg0, boolean arg1) {
        field4708++;
        if (arg0 > -102) {
            field4706 = (class40[]) null;
        }
        long var2 = class69.method535(true);
        for (class170 var4 = arg1 ? (class170) class7.field100.method1400(-1) : (class170) class7.field100.method1403(114); var4 != null; var4 = (class170) class7.field100.method1403(-84)) {
            if ((var4.field2791 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field2791 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field5149;
                    class192.field3098[var5] = class243.field4015[var5];
                    var4.method2095(0);
                    return var5;
                }
                var4.method2095(0);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V", line = 127)
    public static void method1953(byte arg0) {
        field4704 = null;
        field4709 = null;
        if (arg0 != -83) {
            method1952((byte) 95, false);
        }
        field4706 = null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 155)
    public class279() {
        super(1, true);
    }
}
