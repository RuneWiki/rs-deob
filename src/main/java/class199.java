import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class199 extends class403 {

    @OriginalMember(owner = "client!js", name = "J", descriptor = "Lh;")
    public static class434 field2690 = new class434(73, 6);

    @OriginalMember(owner = "client!js", name = "Q", descriptor = "[B")
    public static byte[] field2697;

    @OriginalMember(owner = "client!js", name = "B", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!js", name = "D", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public int field2692;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    public int field2694;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!js", name = "P", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!js", name = "G", descriptor = "Lbc;")
    public class225 field2687;

    @OriginalMember(owner = "client!js", name = "E", descriptor = "Ljava/lang/String;")
    public String field2685;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "[I")
    public int[] field2686;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "[I")
    public int[] field2691;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "[Lad;")
    public class268[] field2689;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "[Ljava/lang/String;")
    public String[] field2693;

    static {
        new class206("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field2697 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 3)
    public static final String method1137(long arg0, byte arg1) {
        field2683++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = -64 % ((-arg1 - 73) / 50);
            int var4 = 0;
            for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                var4++;
            }
            StringBuffer var7 = new StringBuffer(var4);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                char var10 = class26.field337[(int) (var8 - (arg0 * 37L))];
                if (var10 == '_') {
                    int var11 = var7.length() - 1;
                    var10 = ' ';
                    var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                }
                var7.append(var10);
            }
            var7.reverse();
            var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
            return var7.toString();
        }
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(B)V", line = 61)
    public static void method1138(byte arg0) {
        if (arg0 >= -46) {
            field2690 = null;
        }
        field2690 = null;
        field2697 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILbu;[[B)V", line = 82)
    public static final void method1139(int arg0, class17 arg1, byte[][] arg2) {
        field2688++;
        int var3 = class243.field3238.length;
        int var4 = -53 / ((arg0 + 64) / 54);
        for (int var5 = 0; var5 < var3; var5++) {
            byte[] var6 = arg2[var5];
            if (var6 != null) {
                int var7 = (class306.field4050[var5] >> 8) * 64 - class162.field2260;
                int var8 = (class306.field4050[var5] & 0xFF) * 64 - class266.field3511;
                class183.method1073(-1);
                arg1.method113(class60.field805, -106, var8, var6, var7, class98.field1432);
            }
        }
    }
}
