import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class93 {

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field1187 = 0;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "Laba;")
    public static class164 field1189;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IB)V")
    public final void method684(int arg0, byte arg1) {
        OpenGL.glNewList(this.field1194 + arg0, 4864);
        field1193++;
        if (arg1 >= -123) {
            this.field1194 = 22;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)V")
    public static void method685(boolean arg0) {
        field1189 = null;
        if (!arg0) {
            method687(true, null);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
    public static final void method686(int arg0) {
        if (arg0 > 85) {
            class69.field903.method1218(111);
            field1190++;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method687(boolean arg0, String arg1) {
        field1196++;
        if (arg0) {
            field1187 = -94;
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 - 55;
                }
                char var9 = arg1.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - '0';
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var10 + 10 - (97 - var9);
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 + '\n' - 65;
                }
                var4 += 2;
                if (var11 != 0 && class233.method1406((byte) var11, (byte) 31)) {
                    var2.append(class171.method1030((byte) var11, true));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(BC)V")
    public final void method688(byte arg0, char arg1) {
        field1195++;
        if (arg0 < 65) {
            method686(-87);
        }
        OpenGL.glCallList(this.field1194 + arg1);
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
    public static final void method689(int arg0) {
        if (class506.field6334 != null) {
            class506.field6334.method1753(0);
        }
        if (arg0 != 0) {
            field1188 = -105;
        }
        field1191++;
        if (class502.field6253 != null) {
            class502.field6253.method1753(0);
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(Z)V")
    public final void method690(boolean arg0) {
        OpenGL.glEndList();
        if (!arg0) {
            field1188 = 8;
        }
        field1192++;
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Ljaa;I)V")
    public class93(class576 arg0, int arg1) {
        this.field1194 = OpenGL.glGenLists(arg1);
    }
}
