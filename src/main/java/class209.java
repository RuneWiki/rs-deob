import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class209 {

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "Lpr;")
    public static class379 field2952;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field2953;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([Lsca;Lgi;I)Liu;")
    public static final class496 method1377(class40[] arg0, class583 arg1, int arg2) {
        field2955++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field796 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg2 != 26013) {
            method1379(40);
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field796);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class546.field7565, 0);
        if (class546.field7565[0] == 0) {
            if (class546.field7565[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class546.field7565, 1);
            if (class546.field7565[1] > 1) {
                byte[] var7 = new byte[class546.field7565[1]];
                OpenGL.glGetInfoLogARB(var4, class546.field7565[1], class546.field7565, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class546.field7565[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field796);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class496(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
    public static final void method1378(int arg0) {
        if (arg0 != -1) {
            field2952 = null;
        }
        field2951++;
        int var1 = class525.field7381.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class525.field7381[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class437.field6202; var4++) {
                    if (class183.field2585[var2] == class118.field1944[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class118.field1944[class437.field6202] = class183.field2585[var2];
                    var3 = class437.field6202++;
                }
                class11 var5 = new class11(class525.field7381[var2]);
                int var6 = 0;
                while (var5.field165 < class525.field7381[var2].length && var6 < 511 && class480.field6764 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method93((byte) 126);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class183.field2585[var2] >> 8) * 64 + var10 - class519.field7304;
                    int var13 = (class183.field2585[var2] & 0xFF) * 64 + var11 - class6.field80;
                    class593 var14 = class516.field7253.method3263(var5.method93((byte) 72), (byte) -103);
                    class576 var15 = (class576) class278.field3837.method1242(0, (long) var7);
                    if (var15 == null && (var14.field8535 & 0x1) > 0 && class67.field1116 == var9 && var12 >= 0 && class32.field513 > (var14.field8597 + var12) && var13 >= 0 && var14.field8597 + var13 < class611.field8786) {
                        class109 var16 = new class109();
                        var16.field607 = var7;
                        class576 var17 = new class576(var16);
                        class278.field3837.method1241(var17, (long) var7, -123);
                        class342.field4610[class204.field2859++] = var17;
                        class586.field8386[class480.field6764++] = var7;
                        var16.field549 = class405.field5763;
                        var16.method770(var14, true);
                        var16.method346(var16.field1669.field8597, (byte) -125);
                        var16.field610 = var16.field1669.field8547 << 3;
                        var16.method341(true, (var16.field1669.field8575 + 4 & 0x40C00007) << 11, -119);
                        var16.method765(true, var12, 118, var13, var9, var16.method337(0));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
    public static void method1379(int arg0) {
        field2952 = null;
        field2953 = null;
        if (arg0 != 11602) {
            method1379(-88);
        }
    }

    static {
        new class104("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field2954 = 765;
    }
}
