import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class109 {

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "Z")
    public static boolean field1768;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;CI)Ljava/lang/String;", line = 10)
    public static final String method893(String arg0, String arg1, char arg2, int arg3) {
        field1767++;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (arg3 != var7) {
            int var8 = 0;
            while (true) {
                var8 = arg0.indexOf(arg2, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg0.indexOf(arg2, var10);
            if (var11 < 0) {
                var9.append(arg0.substring(var10));
                return var9.toString();
            }
            var9.append(arg0.substring(var10, var11));
            var10 = var11 + 1;
            var9.append(arg1);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lkfa;I)V", line = 66)
    public static final void method894(class382 arg0, int arg1) {
        if (class335.field4673 == null) {
            class657 var2 = new class657();
            byte[] var3 = var2.method3708(128, 128, 10, 16);
            class335.field4673 = class8.method32((byte) -69, false, var3);
        }
        field1769++;
        if (class435.field6263 == null) {
            class263 var4 = new class263();
            byte[] var5 = var4.method1677(128, false, 128, 16);
            class435.field6263 = class8.method32((byte) -69, false, var5);
        }
        class266 var6 = arg0.field5458;
        if (var6.method1689((byte) 9) && class691.field9794 == null) {
            byte[] var7 = class441.method2573(16.0F, 4.0F, 0.6F, 0.5F, 128, 4.0F, new class126(419684), 18911, 16, 8, 128);
            class691.field9794 = class8.method32((byte) -69, false, var7);
        }
        if (arg1 != 128) {
            method893(null, null, (char) 65486, 76);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([BLad;II)Lar;", line = 106)
    public static final class526 method895(byte[] arg0, class669 arg1, int arg2, int arg3) {
        field1766++;
        if (arg0 == null) {
            return null;
        } else if (arg2 == 32173) {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg3, var4);
            OpenGL.glProgramRawARB(arg3, 34933, arg0);
            OpenGL.glGetIntegerv(34379, class674.field9613, 0);
            if (class674.field9613[0] == -1) {
                OpenGL.glBindProgramARB(arg3, 0);
                return new class526(arg1, arg3, var4);
            } else {
                OpenGL.glBindProgramARB(arg3, 0);
                return null;
            }
        } else {
            return null;
        }
    }
}
