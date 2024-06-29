import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class416 {

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Los;")
    public static class309 field6274 = new class309("M", "M", "M", "M");

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "[[I")
    public static int[][] field6275;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "Lo;")
    public static class24 field6277;

    static {
        new class309("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field6275 = new int[128][128];
        field6276 = -1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lph;Lph;B)V", line = 3)
    public static final void method2551(class459 arg0, class459 arg1, byte arg2) {
        class60.field1254 = arg0;
        field6272++;
        if (arg2 < 2) {
            field6274 = null;
        }
        class13.field249 = arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BJ)V", line = 20)
    public static final void method2552(byte arg0, long arg1) {
        field6273++;
        int var3 = class407.field6171 + class15.field266.field6073;
        int var4 = class243.field3765 + class15.field266.field6078;
        if ((class376.field5501 - var3) < -500 || (class376.field5501 - var3) > 500 || class215.field3402 - var4 < -500 || class215.field3402 - var4 > 500) {
            class215.field3402 = var4;
            class376.field5501 = var3;
        }
        if (class376.field5501 != var3) {
            int var5 = var3 - class376.field5501;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class376.field5501 += var6;
        }
        if (class215.field3402 != var4) {
            int var7 = var4 - class215.field3402;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class215.field3402 += var8;
        }
        if (!class186.field2990.field2527) {
            class525.field7631 += (float) arg1 * class435.field6475 / 6.0F;
            class113.field2041 += (float) arg1 * class301.field4539 / 6.0F;
        }
        if (arg0 >= 87) {
            class380.method2337(786432);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 127)
    public static void method2553(int arg0) {
        field6275 = null;
        field6274 = null;
        field6277 = null;
        int var1 = 78 % ((arg0 + 16) / 42);
    }
}
