import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class766 extends class319 {

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field11076;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "Lbea;")
    private class235 field11071;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "Lpw;")
    private class733 field11070;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11081 = new String[] { method5535(method5534("\u0013H^\u0018l\fE\u001c\u0017\u007f\u0007\f")), method5535(method5534("\u0013H^8-")), method5535(method5534("\u0019\n^Px")), method5535(method5534("\fQ\u001c\u0012")), method5535(method5534("\u0013H^<-")), method5535(method5534("\u0013H^Bl\fM\u0004@-")), method5535(method5534("\u0013H^;-")), method5535(method5534("\u0013H^?-")), method5535(method5534("\u0013H^:-")) };

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field11075 = 0;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field11072;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field11073;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field11074;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field11077;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field11078;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field11079;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field11080;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[B)I")
    public final int method2697(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        try {
            if (arg2 != 2) {
                this.field11070 = null;
            }
            field11072++;
            return this.field11071.method2008(arg3, arg1, arg0, -14963);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11081[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field11081[3] : field11081[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[BII)V")
    public final void method2703(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        try {
            field11078++;
            this.field11070.method5348(-25850, arg2, arg1, arg3);
            int var5 = 110 / ((44 - arg0) / 35);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field11081[1] + arg0 + ',' + (arg1 == null ? field11081[3] : field11081[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
    public final void method2696(byte arg0) {
        try {
            this.field11071.method2002(-370);
            if (arg0 <= 113) {
                this.field11076 = null;
            }
            field11080++;
            this.field11070.method5343((byte) 70);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11081[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lvv;Z)V")
    public static final void method5533(class343 arg0, boolean arg1) {
        for (int var2 = arg0.field5330; var2 <= arg0.field5335; var2++) {
            for (int var3 = arg0.field5329; var3 <= arg0.field5325; var3++) {
                class96 var4 = class734.field10683[arg0.field6200][var2][var3];
                if (var4 != null) {
                    class681 var5 = var4.field1085;
                    class681 var6 = null;
                    while (var5 != null) {
                        if (var5.field9867 == arg0) {
                            if (var6 == null) {
                                var4.field1085 = var5.field9865;
                            } else {
                                var6.field9865 = var5.field9865;
                            }
                            var5.method4991(-501);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field9865;
                    }
                }
            }
        }
        if (!arg1) {
            class645.method4748(arg0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        try {
            this.method2700((byte) 111);
            field11073++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11081[0] + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public final void method2700(byte arg0) {
        try {
            field11079++;
            try {
                this.field11076.close();
            } catch (IOException var3) {
            }
            if (arg0 <= 92) {
                this.field11071 = null;
            }
            this.field11071.method2005(-84);
            this.field11070.method5346((byte) -82);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11081[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Z")
    public final boolean method2698(int arg0, int arg1) throws IOException {
        try {
            field11077++;
            int var3 = 103 / ((arg0 + 88) / 37);
            return this.field11071.method2004(arg1, 0);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11081[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class766(Socket arg0, int arg1) throws IOException {
        try {
            this.field11076 = arg0;
            this.field11076.setSoTimeout(30000);
            this.field11076.setTcpNoDelay(true);
            this.field11071 = new class235(this.field11076.getInputStream(), arg1);
            this.field11070 = new class733(this.field11076.getOutputStream(), arg1);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11081[5] + (arg0 == null ? field11081[3] : field11081[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5534(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5535(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
