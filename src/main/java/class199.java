import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class199 extends class397 {

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "[[B")
    private byte[][] field2943 = new byte[10][];

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "Ljc;")
    private class711 field2945 = new class711(null);

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "Ljc;")
    private class711 field2947 = new class711(null);

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    private int field2938;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "Llga;")
    private class47 field2941;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "[Ljava/lang/String;")
    private static final String[] field2949 = new String[] { method1721(method1720("~\u000bg}\u0017v\t=\u007fV")), method1721(method1720("cNgo\u0003")), method1721(method1720("v\u0015%-")), method1721(method1720("~\u000bg\u000fV")), method1721(method1720("~\u000bg\u0013V")), method1721(method1720("~\u000bg\u0010V")) };

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field2944 = 0;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    private int field2939;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "[I")
    private int[] field2940;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILbo;)I", line = 4)
    public static final int method1717(int arg0, class801 arg1) {
        try {
            if (arg0 != 0) {
                method1717(94, null);
            }
            field2948++;
            String var2 = class24.method284(~arg0, arg1);
            return class520.field7584.method1366(class342.field4978, -103, var2);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2949[4] + arg0 + ',' + (arg1 == null ? field2949[2] : field2949[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([BI)I", line = 24)
    public final int method1718(byte[] arg0, int arg1) throws IOException {
        try {
            field2946++;
            if (this.field2940 == null) {
                if (!this.field2941.method506(-77, this.field2938, 0)) {
                    return 0;
                }
                byte[] var3 = this.field2941.method512(0, this.field2938, (byte) -33);
                if (var3 == null) {
                    throw new IllegalStateException("");
                }
                this.field2947.field9996 = var3;
                this.field2947.field9945 = 0;
                int var4 = var3.length >> 1;
                this.field2940 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2940[var5] = this.field2947.method5116((byte) -119);
                }
            }
            if (this.field2940.length <= this.field2939) {
                return -1;
            } else if (arg1 == 1) {
                this.method1719((byte) 121);
                this.field2947.field9996 = arg0;
                this.field2947.field9945 = 0;
                do {
                    if (this.field2947.field9996.length <= this.field2947.field9945) {
                        this.field2947.field9996 = null;
                        return arg0.length;
                    }
                    if (this.field2945.field9996 == null) {
                        if (this.field2943[0] == null) {
                            this.field2947.field9996 = null;
                            return this.field2947.field9945;
                        }
                        this.field2945.field9996 = this.field2943[0];
                    }
                    int var6 = this.field2947.field9996.length - this.field2947.field9945;
                    int var7 = this.field2945.field9996.length - this.field2945.field9945;
                    if (var7 > var6) {
                        this.field2945.method5117(var6, this.field2947.field9945, this.field2947.field9996, 115);
                        this.field2947.field9996 = null;
                        return arg0.length;
                    }
                    this.field2947.method5086(this.field2945.field9945, this.field2945.field9996, var7, -2);
                    this.field2945.field9945 = 0;
                    this.field2939++;
                    this.field2945.field9996 = null;
                    for (int var8 = 0; var8 < 9; var8++) {
                        this.field2943[var8] = this.field2943[var8 + 1];
                    }
                    this.field2943[9] = null;
                } while (this.field2940.length > this.field2939);
                this.field2947.field9996 = null;
                return this.field2947.field9945;
            } else {
                return -105;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2949[3] + (arg0 == null ? field2949[2] : field2949[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(ILlga;I)V", line = 162)
    public class199(int arg0, class47 arg1, int arg2) {
        super(arg0);
        try {
            this.field2938 = arg2;
            this.field2941 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2949[0] + arg0 + ',' + (arg1 == null ? field2949[2] : field2949[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(B)V", line = 127)
    public final void method1719(byte arg0) {
        try {
            field2942++;
            if (arg0 < 120) {
                this.method1719((byte) -117);
            }
            if (this.field2940 != null) {
                for (int var2 = 0; var2 < 10; var2++) {
                    if (this.field2940.length <= this.field2939 + var2) {
                        return;
                    }
                    if (this.field2943[var2] == null && this.field2941.method506(-99, this.field2940[this.field2939 + var2], 0)) {
                        this.field2943[var2] = this.field2941.method512(0, this.field2940[this.field2939 + var2], (byte) -65);
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2949[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1720(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1721(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 24;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
