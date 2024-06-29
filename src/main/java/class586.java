import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class586 {

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8638 = new String[] { method4374(method4373("\u001f~K)\u000f")), method4374(method4373("\u0010&KEZ")), method4374(method4373("8`\u0004\u000fB\u0019(\t\u0002I\u0000a\u000b\f\u0007\ri\f\u0007B\u000f2")), method4374(method4373("\u0005}\t\u0007")), method4374(method4373("\u001f~K(\u000f")), method4374(method4373("\u001f~K*\u000f")) };

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "Z")
    public static boolean field8634 = false;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "Lel;")
    public static class573 field8629 = new class573(3, 10);

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "[B")
    public byte[] field8636;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "[S")
    public short[] field8630;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "[S")
    public short[] field8631;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "[S")
    public short[] field8635;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V", line = 10)
    public static void method4370(int arg0) {
        try {
            field8629 = null;
            if (arg0 != -7803) {
                field8629 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8638[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lffa;B[Lwj;)Lvc;", line = 20)
    public static final class335 method4371(class197 arg0, byte arg1, class414[] arg2) {
        try {
            field8632++;
            for (int var3 = 0; var3 < arg2.length; var3++) {
                if (arg2[var3] == null || arg2[var3].field6097 <= 0L) {
                    return null;
                }
            }
            long var4 = OpenGL.glCreateProgramObjectARB();
            for (int var6 = 0; var6 < arg2.length; var6++) {
                OpenGL.glAttachObjectARB(var4, arg2[var6].field6097);
            }
            OpenGL.glLinkProgramARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class351.field5418, 0);
            if (arg1 > -117) {
                method4370(-103);
            }
            if (class351.field5418[0] == 0) {
                if (class351.field5418[0] == 0) {
                    System.out.println(field8638[2]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class351.field5418, 1);
                if (class351.field5418[1] > 1) {
                    byte[] var7 = new byte[class351.field5418[1]];
                    OpenGL.glGetInfoLogARB(var4, class351.field5418[1], class351.field5418, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (class351.field5418[0] == 0) {
                    for (int var8 = 0; var8 < arg2.length; var8++) {
                        OpenGL.glDetachObjectARB(var4, arg2[var8].field6097);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class335(arg0, var4, arg2);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field8638[0] + (arg0 == null ? field8638[3] : field8638[1]) + ',' + arg1 + ',' + (arg2 == null ? field8638[3] : field8638[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)V", line = 88)
    public static final void method4372(int arg0, int arg1, int arg2) {
        try {
            field8633++;
            if (arg2 != 0) {
                method4371(null, (byte) -115, null);
            }
            class411.field6070++;
            class280 var3 = class610.method4508(class465.field6779, class279.field4190, (byte) 118);
            var3.field4197.method1418((byte) -124, arg1);
            var3.field4197.method1456(arg0, arg2 ^ 0x29852598);
            class106.method934((byte) 53, var3);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8638[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4373(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4374(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
