import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class634 extends class176 {

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
    public static int field9270;

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field9272;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public int field9260;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public int field9265;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "Lsv;")
    public static class567 field9271;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "[I")
    public int[] field9259;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "[I")
    public int[] field9262;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "[I")
    public int[] field9264;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "[Lci;")
    public class382[] field9266;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "[Lci;")
    public class382[] field9268;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "[[[B")
    public byte[][][] field9258;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ldj;ILjava/awt/Frame;)V")
    public static final void method3681(class288 arg0, int arg1, Frame arg2) {
        if (arg1 != 12837) {
            field9271 = null;
        }
        field9267++;
        while (true) {
            class382 var3 = arg0.method1846(7, arg2);
            while (var3.field5134 == 0) {
                class21.method220(arg1 - 12837, 10L);
            }
            if (var3.field5134 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class21.method220(0, 100L);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
    public static void method3682(byte arg0) {
        if (arg0 != 58) {
            field9271 = null;
        }
        field9272 = null;
        field9271 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
    public static final void method3683(int arg0, byte arg1) {
        field9263++;
        class567.field7831 = arg0;
        if (arg1 > -28) {
            method3681(null, -34, null);
        }
        class483.field6809.method3246(false);
    }

    static {
        new class104("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field9270 = 0;
        field9272 = new String[100];
    }
}
