import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class344 {

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public int field4719 = -1;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public int field4720 = -1;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "F")
    public static float field4710 = 0.0F;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field4713 = 0;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lvea;")
    public static class254 field4718;

    // $FF: synthetic field
    @OriginalMember(owner = "client!he", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field4721;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Z")
    public static boolean field4715;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
    public int[] field4714;

    // $FF: synthetic method
    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2072(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I", line = 4)
    public static final int method2067(byte arg0) {
        field4711++;
        int var1 = 125 % ((-arg0 - 75) / 48);
        return class236.field3340++;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V", line = 17)
    public static final void method2068(byte arg0) {
        if (arg0 != -124) {
            return;
        }
        field4716++;
        if (class688.field9669.field6917) {
            class660.field9362 = 96;
            return;
        }
        try {
            Method var1 = (field4721 == null ? (field4721 = method2072("java.lang.Runtime")) : field4721).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class660.field9362 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Leh;I)V", line = 55)
    public final void method2069(class335 arg0, int arg1) {
        if (arg1 <= 49) {
            this.method2070(null, -66, -32);
        }
        while (true) {
            int var3 = arg0.method2034(255);
            if (var3 == 0) {
                field4712++;
                return;
            }
            this.method2070(arg0, var3, -4);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Leh;II)V", line = 81)
    private final void method2070(class335 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field4720 = arg0.method2001((byte) -83);
        } else if (arg1 == 2) {
            this.field4714 = new int[arg0.method2034(255)];
            for (int var4 = 0; var4 < this.field4714.length; var4++) {
                this.field4714[var4] = arg0.method2001((byte) -83);
            }
        } else if (arg1 == 3) {
            this.field4719 = arg0.method2034(arg2 ^ 0xFFFFFF03);
        }
        field4717++;
        if (arg2 != -4) {
            method2071(-106);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 114)
    public static void method2071(int arg0) {
        field4718 = null;
        if (arg0 != 96) {
            field4713 = -67;
        }
    }
}
