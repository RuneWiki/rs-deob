import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class368 extends class390 {

    @OriginalMember(owner = "client!of", name = "p", descriptor = "[I")
    public static int[] field5157 = new int[13];

    @OriginalMember(owner = "client!of", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field5163 = new String[100];

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public int field5154;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public int field5155;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public int field5156;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public int field5159;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Lqj;")
    public static class296 field5161;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Ljava/lang/String;")
    public String field5160;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lu;", line = 5)
    public static final class46 method2358(int arg0, int arg1) {
        field5153++;
        class46 var2 = (class46) class240.field3335.method1246((byte) -40, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class176.field2489.method1920(arg0, false, arg1);
        class46 var4 = new class46();
        var4.field727 = arg0;
        if (var3 != null) {
            var4.method328(new class371(var3), -31463);
        }
        var4.method327(-70);
        class240.field3335.method1247((long) arg0, (byte) -120, var4);
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V", line = 35)
    public static void method2359(byte arg0) {
        field5163 = null;
        field5161 = null;
        field5157 = null;
        int var1 = 64 % ((47 - arg0) / 63);
    }
}
