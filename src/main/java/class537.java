import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class537 extends class164 {

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    public int field7817;

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "I")
    public int field7821;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
    public int field7822;

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "I")
    public int field7823;

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!ht", name = "G", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "Lhu;")
    public class115 field7818;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "Ljava/lang/String;")
    public String field7819;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "[I")
    public int[] field7814;

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "[I")
    public int[] field7825;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "[Lwaa;")
    public class652[] field7820;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field7815;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BJLr;)V", line = 3)
    public static final void method3155(byte arg0, long arg1, class165 arg2) {
        field7826++;
        class265.field3639 = class498.field6966;
        class12.field206 = 0;
        class512.field7507 = 0;
        if (arg0 != -120) {
            return;
        }
        class498.field6966 = 0;
        long var4 = class301.method1787((byte) 70);
        for (class684 var6 = (class684) class24.field580.method2070((byte) -126); var6 != null; var6 = (class684) class24.field580.method2068(-2001)) {
            if (var6.method3880(arg2, arg1)) {
                class512.field7507++;
            }
        }
        if (class692.field9845 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class24.field580.method2067(100) + ", running: " + class512.field7507);
            System.out.println("Emitters: " + class12.field206 + " Particles: " + class498.field6966 + ". Time taken: " + (class301.method1787((byte) 126) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(III)V", line = 37)
    public static final void method3156(int arg0, int arg1, int arg2) {
        field7824++;
        class233 var3 = class7.method44(arg2, 6, arg0 + 25359);
        var3.method1422(arg0 ^ arg0);
        var3.field3114 = arg1;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/awt/Frame;ILwd;)V", line = 53)
    public static final void method3157(Frame arg0, int arg1, class248 arg2) {
        if (arg1 != 0) {
            return;
        }
        while (true) {
            class477 var3 = arg2.method1509(arg0, 0);
            while (var3.field6693 == 0) {
                class151.method974((byte) -102, 10L);
            }
            if (var3.field6693 == 1) {
                field7816++;
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class151.method974((byte) -102, 100L);
        }
    }
}
