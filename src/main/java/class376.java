import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public abstract class class376 extends class269 {

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field5479 = 2;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public int field5481;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public int field5488;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public int field5490;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Z")
    public boolean field5484;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static final void method2264(int arg0) {
        class241 var1 = class189.field2838;
        synchronized (class189.field2838) {
            class189.field2838.method1485(-22032);
        }
        field5482++;
        class241 var2 = class338.field5048;
        synchronized (class338.field5048) {
            if (arg0 != -1) {
                method2264(114);
            }
            class338.field5048.method1485(arg0 ^ 0x560F);
        }
        class241 var3 = class427.field6289;
        synchronized (class427.field6289) {
            class427.field6289.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2265(int arg0, String arg1) {
        field5480++;
        int var2 = arg1.length();
        if (arg0 != -63) {
            return null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lmr;II)V")
    public static final void method2266(class145 arg0, int arg1, int arg2) {
        field5489++;
        int var3 = -1;
        int var4 = 0;
        if (arg2 < 62) {
            field5479 = -89;
        }
        if (class26.field332 < arg0.field2004) {
            class171.method1052(-24715, arg0);
        } else if (class26.field332 <= arg0.field1978) {
            class121.method728(arg0, false);
        } else {
            class51.method301((byte) -128, false, arg0);
            var3 = class126.field1617;
            var4 = class331.field4949;
        }
        if (arg0.field1900 < 128 || arg0.field1892 < 128 || arg0.field1900 >= (class115.field1522 * 128 - 128) || arg0.field1892 >= (class198.field3004 * 128 - 128)) {
            var3 = -1;
            var4 = 0;
            arg0.field1938 = -1;
            arg0.field2004 = 0;
            arg0.field1978 = 0;
            arg0.field1955 = -1;
            arg0.field1900 = arg0.field2019[0] * 128 + arg0.method911(0) * 64;
            arg0.field1892 = arg0.field2018[0] * 128 + arg0.method911(0) * 64;
            arg0.method910((byte) -80);
        }
        if (class113.field1500 == arg0 && (arg0.field1900 < 1536 || arg0.field1892 < 1536 || arg0.field1900 >= ((class115.field1522 - 12) * 128) || class198.field3004 * 128 - 1536 <= arg0.field1892)) {
            arg0.field1978 = 0;
            arg0.field1938 = -1;
            var3 = -1;
            var4 = 0;
            arg0.field2004 = 0;
            arg0.field1955 = -1;
            arg0.field1900 = arg0.field2019[0] * 128 + arg0.method911(0) * 64;
            arg0.field1892 = arg0.field2018[0] * 128 + (arg0.method911(0) * 64);
            arg0.method910((byte) 45);
        }
        int var5 = class456.method2832((byte) 33, arg0);
        class387.method2387((byte) 52, var4, arg0, var3, var5);
        class187.method1138(arg0, -8079);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        if (arg1 != 0) {
            this.field5484 = false;
        }
        field5487++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        field5483++;
        if (arg0 <= -45) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (!arg0) {
            this.field5490 = -50;
        }
        field5486++;
        return false;
    }

    static {
        Math.sqrt(8192.0D);
    }
}
