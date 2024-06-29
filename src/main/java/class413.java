import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class413 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public int field6224 = 0;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public volatile int field6229 = 0;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public volatile int field6226 = 0;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[Ljava/lang/Object;")
    public Object[] field6231 = new Object[5000];

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public int field6233 = 0;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[B")
    public byte[] field6228 = new byte[5000];

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[F")
    public float[] field6232 = new float[5000];

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lsl;")
    public static class456 field6236 = new class456("", 12);

    @OriginalMember(owner = "client!of", name = "n", descriptor = "[I")
    public static int[] field6237 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Ldp;")
    public static class347 field6238 = new class347("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!of", name = "q", descriptor = "[Lua;")
    public static class451[] field6240 = new class451[6];

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field6241;

    // $FF: synthetic field
    @OriginalMember(owner = "client!of", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field6242;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Z")
    public static boolean field6239;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method2472(int arg0) {
        field6240 = null;
        if (arg0 < 116) {
            field6240 = null;
        }
        field6236 = null;
        field6238 = null;
        field6237 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZFLta;II)V")
    public abstract void method490(boolean arg0, float arg1, class337 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lrr;I)V")
    public abstract void method500(class306 arg0, int arg1);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILgo;I)I")
    public static final int method2473(int arg0, class310 arg1, int arg2) {
        field6227++;
        if (arg2 != -1) {
            return 101;
        } else if (!client.method3039(arg1).method2407((byte) -128, arg0) && arg1.field4790 == null) {
            return -1;
        } else if (arg1.field4720 == null || arg0 >= arg1.field4720.length) {
            return -1;
        } else {
            return arg1.field4720[arg0];
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public abstract void method493(int arg0);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method2474(byte arg0) {
        field6230++;
        if (class109.field1613 == 2) {
            class521.field7648 = 96;
        } else {
            try {
                Method var1 = (field6242 == null ? (field6242 = method2477("java.lang.Runtime")) : field6242).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class521.field7648 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 != 56) {
            field6239 = true;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public abstract void method496(int arg0);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lgo;I)V")
    public static final void method2475(class310 arg0, int arg1) {
        field6235++;
        if (arg1 != 0) {
            method2475(null, -28);
        }
        if (class400.field5965 != arg0.field4680) {
            return;
        }
        if (class410.field6198.field7063 == null) {
            arg0.field4782 = 0;
            arg0.field4717 = 0;
            return;
        }
        arg0.field4797 = 150;
        arg0.field4705 = (int) (Math.sin((double) class86.field1350 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field4802 = 5;
        arg0.field4782 = class449.field6615;
        arg0.field4717 = class164.method1150(class410.field6198.field7063, -118);
        arg0.field4710 = class410.field6198.field5999;
        arg0.field4739 = class410.field6198.field5985;
        arg0.field4641 = 0;
        arg0.field4772 = class410.field6198.field6043;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Lrr;I)V")
    public abstract void method489(class306 arg0, int arg1);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILrr;)V")
    public abstract void method488(int arg0, class306 arg1);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
    public abstract void method491(int arg0, int arg1);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
    public abstract void method499(int arg0, int arg1);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
    public static final byte[] method2476(int arg0, int arg1, int arg2, Object arg3) {
        if (arg1 != -11393) {
            field6238 = null;
        }
        field6225++;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class534.method3161(arg0, (byte) 0, var4, arg2);
        } else if (arg3 instanceof class33) {
            class33 var5 = (class33) arg3;
            return var5.method283(arg0, arg1 + 11396, arg2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2477(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
