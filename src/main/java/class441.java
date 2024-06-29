import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public abstract class class441 {

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Ljm;")
    public static class485 field6420 = new class485(65, -1);

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "Lfg;")
    public static class83 field6423 = new class83("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "[I")
    public static int[] field6422;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lht;[Llo;I)Led;", line = 6)
    public static final class497 method2631(class410 arg0, class528[] arg1, int arg2) {
        field6419++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field7761 <= 0L) {
                return null;
            }
        }
        if (arg2 != 16) {
            field6420 = null;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field7761);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class463.field6732, 0);
        if (class463.field6732[0] == 0) {
            if (class463.field6732[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class463.field6732, 1);
            if (class463.field6732[1] > 1) {
                byte[] var7 = new byte[class463.field6732[1]];
                OpenGL.glGetInfoLogARB(var4, class463.field6732[1], class463.field6732, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class463.field6732[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field7761);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class497(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V", line = 76)
    public static void method2632(byte arg0) {
        if (arg0 != 76) {
            method2632((byte) 115);
        }
        field6423 = null;
        field6422 = null;
        field6420 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 93)
    public static final void method2633(boolean arg0, String arg1, byte arg2) {
        String var3 = arg1.toLowerCase();
        field6421++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class517.field7602.field12 : class517.field7602.field13);
        for (int var8 = var6; var8 < var7; var8++) {
            class412 var11 = class517.field7602.method2((byte) -47, var8);
            if (var11.field6042 && var11.method2456(-127).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class141.field2014 = -1;
                    class344.field4740 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class133.field1925 = 0;
        class344.field4740 = var4;
        class141.field2014 = var5;
        String[] var9 = new String[class141.field2014];
        if (arg2 != 15) {
            method2632((byte) 53);
        }
        for (int var10 = 0; var10 < class141.field2014; var10++) {
            var9[var10] = class517.field7602.method2((byte) -47, var4[var10]).method2456(-107);
        }
        class244.method1448(var9, class344.field4740, 12950);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Lbd;")
    public abstract class43 method1215(byte arg0);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public abstract void method1210(int arg0);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
    public abstract boolean method1212(int arg0, int arg1);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
    public abstract void method1214(boolean arg0);
}
