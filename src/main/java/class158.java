import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public abstract class class158 {

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "[B")
    public static byte[] field2196 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "Lll;")
    public static class203 field2197;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2199;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)I")
    public static final int method1078(byte arg0, int arg1) {
        field2198++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg0 > -47) {
            field2197 = null;
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public static void method1079(byte arg0) {
        field2197 = null;
        if (arg0 == 2) {
            field2199 = null;
            field2196 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1080(int arg0);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B[B)V")
    public abstract void method1081(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lui;B)V")
    public static final void method1082(class451 arg0, byte arg1) {
        if (arg1 != 0) {
            field2199 = null;
        }
        class179.field2674 = 0;
        field2195++;
        class488.field6843 = 0;
        class10.field153 = new class250();
        class312.field4709 = new class300[1024];
        class63.method543(true, arg0);
        class461.method2716(arg0, (byte) -127);
    }

    static {
        new class332("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }
}
