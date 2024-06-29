import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class109 extends class307 {

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "J")
    public static long field1917 = 0L;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "Lrb;")
    public class213 field1902;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "Lrb;")
    public class213 field1910;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "Lce;")
    public static class239 field1913;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "Lqd;")
    public class40 field1915;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "Z")
    public boolean field1899;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "[Ljava/lang/Object;")
    public Object[] field1908;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "[[B")
    public static byte[][] field1903;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 22)
    public static void method822(int arg0) {
        field1913 = null;
        if (arg0 != 0) {
            method826(-122, (class40) null);
        }
        field1903 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([II)[I", line = 38)
    public static final int[] method823(int[] arg0, int arg1) {
        field1916++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class234.method1624(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILce;)I", line = 59)
    public static final int method824(int arg0, class239 arg1) {
        int var2 = 0;
        if (arg0 != -15745) {
            method825(125);
        }
        if (arg1.method1676(class247.field4084, arg0 - 4289)) {
            var2++;
        }
        if (arg1.method1676(class7.field111, -20034)) {
            var2++;
        }
        field1914++;
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)Lmb;", line = 80)
    public static final class99 method825(int arg0) {
        field1906++;
        byte[] var1 = class22.field387[0];
        int var2 = class210.field3356[0] * class102.field1802[0];
        class99 var6;
        if (class51.field979[arg0]) {
            byte[] var3 = class50.field964[0];
            int[] var4 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = class11.method71(class171.field2797[class276.method1923(255, var1[var5])], class276.method1923(var3[var5], 255) << 24);
            }
            var6 = new class281(class102.field1799, class169.field2787, class12.field208[0], class256.field4265[0], class102.field1802[0], class210.field3356[0], var4);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class171.field2797[class276.method1923(var1[var8], 255)];
            }
            var6 = new class99(class102.field1799, class169.field2787, class12.field208[0], class256.field4265[0], class102.field1802[0], class210.field3356[0], var7);
        }
        class181.method1324(arg0 ^ 0x74);
        return var6;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILqd;)V", line = 132)
    public static final void method826(int arg0, class40 arg1) {
        field1912++;
        if (class276.field4603 == null) {
            return;
        }
        int var2 = arg0;
        long var3 = arg1.method362(arg0 ^ 0xFFFF9D96);
        if (var3 == 0L) {
            return;
        }
        while (class276.field4603.length > var2 && class276.field4603[var2].field5149 != var3) {
            var2++;
        }
        if (class276.field4603.length > var2 && class276.field4603[var2] != null) {
            class19.field295.method1464(192, 0);
            class10.field158++;
            class19.field295.method241(class276.field4603[var2].field5149, 126);
        }
    }
}
