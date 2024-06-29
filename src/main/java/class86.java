import java.awt.Rectangle;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class86 extends InputStream {

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1270 = new Rectangle[100];

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Lcb;")
    public static class631 field1269 = new class631(14, 4);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lla;")
    public static class422 field1267;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Lcl;")
    public static class746 field1271;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lha;ZIIIIII)V")
    public static final void method753(class544 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1268++;
        class13.field119 = arg0;
        class377.field5673 = class13.field119.method414();
        class118.field1823 = class13.field119.method414();
        class418.field6153 = class13.field119.method414();
        class554.field7897 = 1;
        if (!arg1) {
            method757(null, -43);
        }
        class558.field7923 = arg3;
        class84.field1241 = 0;
        class362.field5468 = arg6;
        class285.field4381 = 0;
        class412.field6070 = arg2;
        class548.field7817 = null;
        class384.field5762 = arg5;
        class447.method2753(arg7, arg4, (byte) 56);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method754(int arg0) {
        field1270 = null;
        field1269 = null;
        field1271 = null;
        if (arg0 != -1) {
            field1269 = null;
        }
        field1267 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZII)Lwj;")
    public static final class118 method755(boolean arg0, int arg1, int arg2) {
        field1265++;
        class118 var3 = (class118) class657.field9351.method3512(arg0, (long) arg2 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class118(arg1, arg2);
            class657.field9351.method3516(255, var3.field1039, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/io/File;[BII)V")
    public static final void method756(File arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1263++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        try {
            var4.readFully(arg1, 0, arg2);
        } catch (EOFException var5) {
        }
        if (arg3 <= 123) {
            field1271 = null;
        }
        var4.close();
    }

    @OriginalMember(owner = "client!dk", name = "read", descriptor = "()I")
    public final int read() {
        class484.method2932(true, 30000L);
        field1262++;
        return -1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method757(String arg0, int arg1) {
        field1266++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 >= -83) {
            field1271 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
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

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIFIIZIII)[[I")
    public static final int[][] method758(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field1261++;
        int[][] var9 = new int[arg3][arg4];
        class387 var10 = new class387();
        var10.field5809 = arg5;
        var10.field5797 = (int) (arg2 * 4096.0F);
        if (arg6 < 67) {
            method754(5);
        }
        var10.field5810 = arg8;
        var10.field5803 = arg1;
        var10.field5805 = arg0;
        var10.method65(51);
        class423.method2646(0, arg4, arg3);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method2420(var11, (byte) -35, var9[var11]);
        }
        return var9;
    }
}
