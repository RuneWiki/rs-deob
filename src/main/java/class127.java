import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class127 {

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "Loaa;")
    private class305 field2232;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "Lfja;")
    public static class783 field2238 = new class783(21, 3);

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "Lwg;")
    public static class450 field2240 = new class450(2, 4, 4, 0);

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "Llda;")
    private class513 field2234;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IB)Lfp;")
    public static final class344 method1085(int arg0, byte arg1) {
        field2235++;
        class344 var2 = (class344) class580.field8216.method1077((long) arg0, (byte) 117);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class687.field9554.method3732(0, 8906, arg0);
        if (arg1 != 39) {
            return null;
        } else if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class344 var4;
            try {
                var4 = class347.method2142(var3, (byte) -104);
            } catch (Exception var6) {
                throw new RuntimeException(var6.getMessage() + " S: " + arg0);
            }
            class580.field8216.method1079(var4, (long) arg0, (byte) 86);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)Llda;")
    public final class513 method1086(int arg0) {
        field2239++;
        class513 var2 = this.field2234;
        if (this.field2232.field4189 == var2) {
            this.field2234 = null;
            return null;
        } else if (arg0 == 34379) {
            this.field2234 = var2.field7006;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BJ)V")
    public static final void method1087(byte arg0, long arg1) {
        class60.field821.setTime(new Date(arg1));
        if (arg0 != 83) {
            method1087((byte) -73, 94L);
        }
        field2236++;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)Llda;")
    public final class513 method1088(int arg0) {
        if (arg0 != 0) {
            method1085(-50, (byte) 36);
        }
        field2237++;
        class513 var2 = this.field2232.field4189.field7006;
        if (this.field2232.field4189 == var2) {
            this.field2234 = null;
            return null;
        } else {
            this.field2234 = var2.field7006;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILjava/lang/String;ILhk;)Lwea;")
    public static final class168 method1089(int arg0, String arg1, int arg2, class111 arg3) {
        field2231++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg1);
        if (arg2 != 3) {
            return null;
        }
        OpenGL.glGetIntegerv(34379, class179.field2820, 0);
        if (class179.field2820[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class168(arg3, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)V")
    public static void method1090(int arg0) {
        int var1 = 93 % ((arg0 - 69) / 51);
        field2238 = null;
        field2240 = null;
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "()V")
    public class127() {
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Loaa;)V")
    public class127(class305 arg0) {
        this.field2232 = arg0;
    }
}
