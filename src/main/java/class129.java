import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class129 implements Runnable {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[Lt;")
    public volatile class132[] field2825 = new class132[2];

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Z")
    public volatile boolean field2837 = false;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Z")
    public volatile boolean field2835 = false;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lje;")
    private static class67 field2832 = class85.method592(255, "Please try using a different world)3");

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lje;")
    public static class67 field2826 = field2832;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lje;")
    public static class67 field2827 = field2832;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lje;")
    public static class67 field2836 = field2832;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lje;")
    public static class67 field2831 = field2832;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lje;")
    public static class67 field2824 = field2832;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lje;")
    public static class67 field2833 = field2832;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2834 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Lje;")
    public static class67 field2843 = class85.method592(255, ":");

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Lje;")
    private static class67 field2840 = class85.method592(255, "Take");

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "[[B")
    public static byte[][] field2844 = new byte[1000][];

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lje;")
    public static class67 field2841 = field2840;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field2842 = 127;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "[I")
    public static int[] field2839 = new int[32];

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Lje;")
    public static class67 field2846 = class85.method592(255, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "[I")
    public static int[] field2845 = new int[50];

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "[[I")
    public static int[][] field2847 = new int[104][104];

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lq;")
    public class111 field2828;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lqb;")
    public static class113 field2829;

    @OriginalMember(owner = "client!sd", name = "run", descriptor = "()V")
    public final void run() {
        this.field2835 = true;
        try {
            while (!this.field2837) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class132 var2 = this.field2825[var1];
                    if (var2 != null) {
                        var2.method1009((byte) 121);
                    }
                }
                class104.method822(-91, 10L);
                class60.method418(null, 9, this.field2828);
            }
        } catch (Exception var9) {
            class112.method887(-32453, var9, null);
        } finally {
            Object var6 = null;
            this.field2835 = false;
        }
        field2838++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method984(byte arg0) {
        field2833 = null;
        field2826 = null;
        field2827 = null;
        field2831 = null;
        field2847 = null;
        field2841 = null;
        field2843 = null;
        field2840 = null;
        field2829 = null;
        field2846 = null;
        field2839 = null;
        field2832 = null;
        field2824 = null;
        int var1 = 12 / ((arg0 + 68) / 42);
        field2845 = null;
        field2834 = null;
        field2844 = null;
        field2836 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(JZ)V")
    public static final void method985(long arg0, boolean arg1) {
        try {
            if (arg1) {
                return;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field2830++;
    }
}
