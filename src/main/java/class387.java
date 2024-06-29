import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class387 {

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field5383 = 0;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "Lim;")
    public static class353 field5385 = new class353(1, 3);

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Lha;")
    public static class116 field5384;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Lrl;")
    public static class633 field5386;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method2338(byte arg0, long arg1) {
        field5388++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (arg0 >= -117) {
                method2338((byte) 113, -6L);
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class4.field27[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public static final void method2339(int arg0) {
        field5387++;
        if (arg0 <= -6) {
            for (int var1 = 0; var1 < 100; var1++) {
                class615.field8872[var1] = null;
            }
            class315.field4365 = 0;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public static void method2340(byte arg0) {
        field5385 = null;
        field5384 = null;
        if (arg0 > 115) {
            field5386 = null;
        }
    }

    static {
        new class344("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
    }
}
