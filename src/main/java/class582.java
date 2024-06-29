import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class582 {

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public int field7991 = 1;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
    public static int field7985 = 0;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Llf;")
    public static class200 field7987 = new class200();

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "C")
    public char field7984;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
    public static final void method3321(byte arg0) {
        field7992++;
        int var1 = 74 / ((-arg0 - 27) / 60);
        class116 var2 = null;
        try {
            class382 var3 = class500.field6968.method1840("2", true, (byte) 102);
            while (var3.field5134 == 0) {
                class21.method220(0, 1L);
            }
            if (var3.field5134 == 1) {
                var2 = (class116) var3.field5132;
                byte[] var4 = new byte[(int) var2.method817(-2826)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method819(var4, 108, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class227.method1448(7, new class11(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method821(17981);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIII)V")
    public static final void method3322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 64) {
            method3325((byte) 36);
        }
        for (int var6 = arg4; var6 <= arg5; var6++) {
            class266.method1742(26844, class182.field2580[var6], arg3, arg0, arg2);
        }
        field7983++;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ldaa;Z)V")
    public final void method3323(class11 arg0, boolean arg1) {
        field7988++;
        while (true) {
            int var3 = arg0.method110((byte) 78);
            if (var3 == 0) {
                if (arg1) {
                    this.method3323(null, true);
                    return;
                } else {
                    return;
                }
            }
            this.method3327(arg0, var3, -1);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIILjava/lang/Class;)Llm;")
    public static final class425 method3324(int arg0, int arg1, int arg2, Class arg3) {
        class622 var4 = class356.field4807[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class559 var5 = var4.field8973; var5 != null; var5 = var5.field7736) {
            class425 var6 = var5.field7742;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6036 == arg1 && var6.field6028 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V")
    public static void method3325(byte arg0) {
        field7987 = null;
        if (arg0 != 10) {
            field7987 = null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I[S)[S")
    public static final short[] method3326(int arg0, short[] arg1) {
        field7990++;
        if (arg1 == null) {
            return null;
        } else if (arg0 < 70) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class416.method2501(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ldaa;II)V")
    private final void method3327(class11 arg0, int arg1, int arg2) {
        field7989++;
        if (arg2 != -1) {
            field7987 = null;
        }
        if (arg1 == 1) {
            this.field7984 = class363.method2173(arg0.method67(65280), true);
        } else if (arg1 == 2) {
            this.field7991 = 0;
            return;
        }
    }
}
