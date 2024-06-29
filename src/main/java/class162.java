import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class162 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "[I")
    public static int[] field2161 = new int[1000];

    @OriginalMember(owner = "client!l", name = "c", descriptor = "S")
    public static short field2162 = 32767;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[I")
    public static int[] field2160 = new int[1];

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[[B")
    public static byte[][] field2164;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLra;ZLjava/lang/String;)V", line = 14)
    public static final void method946(byte arg0, class262 arg1, boolean arg2, String arg3) {
        field2163++;
        if (arg0 <= 33) {
            method947(19);
        }
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class519.field7716.method1055(null, (byte) 98, arg3, 250);
        int var8 = class519.field7716.method1058(36, arg3, null, 250) * 13;
        class379.field5558.method980(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var4 + var8, -16777216, 0);
        class379.field5558.method1032(var5 - var4, -var4 + var6, var7 + var4 + var4, var4 + var8 + var4, -1, 0);
        arg1.method1679(var8, var6, null, 0, 1, var7, arg3, var5, 30478, 0, null, -1, null, -1, 1, 0);
        class598.method3494(var8 + var4 + var4, var5 - var4, (byte) -102, var4 + var7 + var4, -var4 + var6);
        if (arg2) {
            try {
                class379.field5558.method288();
            } catch (class477 var9) {
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 50)
    public static void method947(int arg0) {
        field2161 = null;
        field2164 = null;
        field2160 = null;
        if (arg0 != -11268) {
            field2164 = null;
        }
    }
}
