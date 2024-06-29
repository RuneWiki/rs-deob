import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class296 extends class308 {

    @OriginalMember(owner = "client!of", name = "D", descriptor = "[Z")
    public static boolean[] field4909 = new boolean[200];

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static int field4916 = -1;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "Lil;")
    private class4 field4908;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "Ljava/awt/Frame;")
    public static Frame field4907;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "[I")
    public static int[] field4917;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "[Z")
    public static boolean[] field4914;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V", line = 11)
    public static void method2091(byte arg0) {
        field4917 = null;
        if (arg0 >= -46) {
            method2094(123, (byte) 90);
        }
        field4907 = null;
        field4909 = null;
        field4914 = null;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(III)I", line = 24)
    public final int method2092(int arg0, int arg1, int arg2) {
        field4913++;
        if (this.field4908 == null) {
            return arg1;
        }
        if (arg2 != -21145) {
            this.method2096((byte) 119, (class313) null, -19);
        }
        class94 var4 = (class94) this.field4908.method29((long) arg0, arg2 ^ 0xFFFFAD00);
        return var4 == null ? arg1 : var4.field1373;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;", line = 52)
    public final String method2093(int arg0, byte arg1, String arg2) {
        field4915++;
        if (this.field4908 == null) {
            return arg2;
        }
        class182 var4 = (class182) this.field4908.method29((long) arg0, 103);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg1 < 6) {
                this.method2096((byte) -77, (class313) null, 75);
            }
            return var4.field2826;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)Ltc;", line = 72)
    public static final class160 method2094(int arg0, byte arg1) {
        field4911++;
        class160 var2 = (class160) class117.field1704.method652((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class50.field721.method1504(arg0, true, 33);
        if (arg1 != 55) {
            return (class160) null;
        }
        class160 var4 = new class160();
        if (var3 != null) {
            var4.method1136(new class313(var3), arg0, (byte) -117);
        }
        class117.field1704.method642(var4, (long) arg0, arg1 - 147);
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILfh;)V", line = 101)
    public final void method2095(int arg0, class313 arg1) {
        if (arg0 >= -66) {
            field4918 = 112;
        }
        while (true) {
            int var3 = arg1.method2224(-119);
            if (var3 == 0) {
                field4910++;
                return;
            }
            this.method2096((byte) 87, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLfh;I)V", line = 123)
    private final void method2096(byte arg0, class313 arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg1.method2224(-126);
            if (this.field4908 == null) {
                int var5 = class329.method2347(var4, (byte) -96);
                this.field4908 = new class4(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method2224(-119) == 1;
                int var8 = arg1.method2249(-105);
                class159 var9;
                if (var7) {
                    var9 = new class182(arg1.method2198(-430));
                } else {
                    var9 = new class94(arg1.method2231((byte) -127));
                }
                this.field4908.method37(false, var9, (long) var8);
            }
        }
        if (arg0 < 82) {
            method2094(36, (byte) -67);
        }
        field4912++;
    }
}
