import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class112 extends class469 {

    @OriginalMember(owner = "client!gfa", name = "t", descriptor = "I")
    private int field1450 = -1;

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "I")
    private int field1451 = -1;

    @OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1453 = new String[] { method1049(method1048("__\u000eBt")), method1049(method1048("C\u0017AB5M\u001fI\u00187\f")), method1049(method1048("J\u0004L\u0000")), method1049(method1048("C\u0017ABH\f")), method1049(method1048("C\u0017ABC\f")), method1049(method1048("C\u0017ABB\f")) };

    @OriginalMember(owner = "client!gfa", name = "s", descriptor = "Luu;")
    public static class240 field1447 = new class240(2, 2);

    @OriginalMember(owner = "client!gfa", name = "x", descriptor = "Lsb;")
    public static class261 field1452 = new class261(63, 0);

    @OriginalMember(owner = "client!gfa", name = "w", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lml;IIZ[[I)V", line = 4)
    public class112(class194 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        try {
            this.field1448 = arg2;
            super.field6859.method1618((byte) -124, this);
            if (arg3) {
                for (int var6 = 0; var6 < 6; ++var6) {
                    class219.method1850(arg4[var6], var6 + 34069, arg2, 32993, super.field6870, super.field6859.field2824, 126, arg2);
                }
            } else {
                for (int var7 = 0; ~var7 > -7; ++var7) {
                    OpenGL.glTexImage2Di(var7 + 34069, 0, super.field6870, arg2, arg2, 0, 32993, super.field6859.field2824, arg4[var7], 0);
                }
            }
            this.method3600(-59, true);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1453[1] + (arg0 != null ? field1453[0] : field1453[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1453[0] : field1453[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIZI)V", line = 36)
    public final void method1046(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        try {
            OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg4, super.field6867, arg1);
            ++field1449;
            this.field1450 = arg2;
            this.field1451 = arg0;
            if (arg3) {
                this.method1046(8, -21, 33, false, -14);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1453[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V", line = 50)
    public final void method992(int arg0) {
        try {
            OpenGL.glFramebufferTexture2DEXT(this.field1451, this.field1450, 3553, 0, 0);
            ++field1446;
            this.field1451 = arg0;
            this.field1450 = -1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1453[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lml;IIZ[[BI)V", line = 61)
    public class112(class194 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        try {
            this.field1448 = arg2;
            super.field6859.method1618((byte) -88, this);
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field6870, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
            }
            this.method3600(85, true);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1453[1] + (arg0 != null ? field1453[0] : field1453[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1453[0] : field1453[2]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lml;II)V", line = 83)
    public class112(class194 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        try {
            this.field1448 = arg2;
            super.field6859.method1618((byte) -125, this);
            for (int var4 = 0; var4 < 6; ++var4) {
                OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field6870, arg2, arg2, 0, class393.method3078(127, super.field6870), 5121, (byte[]) null, 0);
            }
            this.method3600(123, true);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1453[1] + (arg0 != null ? field1453[0] : field1453[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(B)V", line = 107)
    public static void method1047(byte arg0) {
        try {
            field1452 = null;
            field1447 = null;
            if (arg0 > -114) {
                field1452 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1453[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1048(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1049(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
