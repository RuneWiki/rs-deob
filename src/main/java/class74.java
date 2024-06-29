import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class74 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lvc;")
    public class142 field1116 = new class142();

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1115 = "shake:";

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1120 = "Loaded config";

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "[I")
    public static int[] field1121 = new int[2];

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lvc;")
    private class142 field1125;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZLvc;)V", line = 8)
    public final void method502(boolean arg0, class142 arg1) {
        if (arg1.field2281 != null) {
            arg1.method1005((byte) -75);
        }
        arg1.field2281 = this.field1116.field2281;
        field1124++;
        arg1.field2280 = this.field1116;
        arg1.field2281.field2280 = arg1;
        if (!arg0) {
            field1115 = (String) null;
        }
        arg1.field2280.field2281 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Lvc;", line = 34)
    public final class142 method503(int arg0) {
        field1126++;
        if (arg0 != 0) {
            this.field1125 = (class142) null;
        }
        class142 var2 = this.field1125;
        if (this.field1116 == var2) {
            this.field1125 = null;
            return null;
        } else {
            this.field1125 = var2.field2280;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lbh;", line = 54)
    public static final class21 method504(int arg0, int arg1) {
        field1122++;
        class21 var2 = (class21) class25.field374.method1539(-59, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 62) {
            field1115 = (String) null;
        }
        byte[] var3 = class262.field4132.method1504(arg0, true, 11);
        class21 var4 = new class21();
        if (var3 != null) {
            var4.method134(new class313(var3), true);
        }
        class25.field374.method1538(-86, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)I", line = 78)
    public final int method505(boolean arg0) {
        field1123++;
        int var2 = 0;
        class142 var3 = this.field1116.field2280;
        if (arg0) {
            return -60;
        }
        while (this.field1116 != var3) {
            var3 = var3.field2280;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Lvc;", line = 100)
    public final class142 method506(int arg0) {
        if (arg0 != 18673) {
            this.method505(true);
        }
        field1113++;
        class142 var2 = this.field1116.field2280;
        if (this.field1116 == var2) {
            this.field1125 = null;
            return null;
        } else {
            this.field1125 = var2.field2280;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 135)
    public static void method507(byte arg0) {
        if (arg0 != -50) {
            field1120 = (String) null;
        }
        field1120 = null;
        field1115 = null;
        field1121 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 247)
    public class74() {
        this.field1116.field2281 = this.field1116;
        this.field1116.field2280 = this.field1116;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)V", line = 164)
    public static final void method508(int arg0, int arg1) {
        class117.field1704.method645(arg0, (byte) -85);
        if (arg1 <= 52) {
            field1117 = 42;
        }
        field1114++;
        class123.field1826.method645(arg0, (byte) -40);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILuo;BII)Ljava/awt/Frame;", line = 177)
    public static final Frame method509(int arg0, int arg1, class274 arg2, byte arg3, int arg4, int arg5) {
        field1118++;
        if (!arg2.method1954((byte) 54)) {
            return null;
        }
        if (arg4 == 0) {
            class16[] var6 = class325.method2323(arg2, 578578818);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field207 == arg5 && var6[var8].field210 == arg0 && (arg1 == 0 || var6[var8].field205 == arg1) && (!var7 || var6[var8].field209 > arg4)) {
                    arg4 = var6[var8].field209;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class158 var9 = arg2.method1940(arg4, arg1, arg0, arg5, (byte) -84);
        while (var9.field2542 == 0) {
            class177.method1246(10L, -32644);
        }
        if (arg3 != 33) {
            field1117 = -116;
        }
        Frame var10 = (Frame) var9.field2538;
        if (var10 == null) {
            return null;
        } else if (var9.field2542 == 2) {
            class219.method1479(arg2, var10, arg3 ^ 0xFFFFFFAA);
            return null;
        } else {
            return var10;
        }
    }
}
