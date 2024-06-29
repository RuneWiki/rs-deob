import java.awt.Frame;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class395 extends OutputStream {

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5921 = "glow1:";

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field5917 = 0;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "Z")
    public static boolean field5923 = true;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field5920;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)Lqh;")
    public static final class42 method2490(int arg0, byte arg1) {
        int var2 = 90 / ((arg1 - 44) / 54);
        field5919++;
        class52 var3 = class248.field4056;
        class42 var4;
        synchronized (class248.field4056) {
            var4 = (class42) class248.field4056.method331((byte) 69, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = class193.field3135.method2771(class407.method2550(-15194, arg0), class334.method2208(-15761, arg0), 3);
        class42 var6 = new class42();
        if (var5 != null) {
            var6.method279((byte) 64, new class186(var5));
        }
        class52 var7 = class248.field4056;
        synchronized (class248.field4056) {
            class248.field4056.method341(70, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBI)I")
    public static final int method2491(int arg0, byte arg1, int arg2) {
        int var3 = -96 % ((93 - arg1) / 32);
        field5916++;
        if (arg2 < arg0) {
            int var4 = arg2;
            arg2 = arg0;
            arg0 = var4;
        }
        while (arg0 != 0) {
            int var5 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var5;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method2492(int arg0) {
        field5921 = null;
        field5920 = null;
        if (arg0 > -39) {
            field5921 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)Ltb;")
    public static final class226 method2493(boolean arg0, int arg1) {
        field5918++;
        class52 var2 = class308.field4876;
        class226 var3;
        synchronized (class308.field4876) {
            var3 = (class226) class308.field4876.method331((byte) 69, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        if (arg0) {
            field5923 = true;
        }
        byte[] var4 = class85.field1051.method2771(class288.method1943(arg1, 22), class150.method1063(arg1, (byte) -126), 3);
        class226 var5 = new class226();
        var5.field3812 = arg1;
        if (var4 != null) {
            var5.method1621(new class186(var4), 101);
        }
        var5.method1616(-1);
        class52 var6 = class308.field4876;
        synchronized (class308.field4876) {
            class308.field4876.method341(126, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qp", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field5922++;
        throw new IOException();
    }
}
