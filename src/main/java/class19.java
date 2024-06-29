import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class19 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public int field247 = -1;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Ltl;")
    public static class400 field246 = new class400(8);

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Z")
    public static boolean field252 = false;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field253 = 0;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lbu;")
    public class99 field251;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "[I")
    public int[] field248;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field250;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I", line = 5)
    public static final int method186(int arg0, int arg1) {
        return class314.field4724 == null ? 0 : class314.field4724[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZLje;)I", line = 8)
    public static final int method187(int arg0, boolean arg1, class178 arg2) {
        field249++;
        if (arg1) {
            method186(121, 25);
        }
        if (!client.method2777(arg2).method1208(-197495039, arg0) && arg2.field2574 == null) {
            return -1;
        } else if (arg2.field2537 == null || arg0 >= arg2.field2537.length) {
            return -1;
        } else {
            return arg2.field2537[arg0];
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 27)
    public static void method188(int arg0) {
        if (arg0 == 8) {
            field246 = null;
        }
    }
}
