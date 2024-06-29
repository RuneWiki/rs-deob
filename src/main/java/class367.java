import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class367 extends class331 {

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5207;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "Z")
    public static boolean field5204;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "[I")
    public static int[] field5203;

    static {
        new class362("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field5209 = 0;
        field5207 = new Rectangle[100];
        field5204 = false;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V", line = 3)
    public static void method2342(byte arg0) {
        field5203 = null;
        field5207 = null;
        int var1 = -29 % ((-arg0 - 9) / 40);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ltq;Ltq;ILtq;Ltq;)V", line = 13)
    public static final void method2343(class376 arg0, class376 arg1, int arg2, class376 arg3, class376 arg4) {
        class22.field281 = arg4;
        field5206++;
        class318.field4511 = arg3;
        class106.field1286 = arg0;
        class274.field3881 = arg1;
        class98.field1194 = new class184[class274.field3881.method2432(true)][];
        if (arg2 < -91) {
            class327.field4638 = new boolean[class274.field3881.method2432(true)];
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V", line = 35)
    public static final void method2344(int arg0) {
        field5202++;
        class208.field2958 = 0;
        class393.field5547.method505((byte) 44);
        if (arg0 <= 114) {
            field5203 = null;
        }
        class393.field5547.method509((byte) 114, class264.field3756);
        class208.field2958++;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V", line = 60)
    public static final void method2345(byte arg0) {
        field5208++;
        int var1 = 0;
        int var2 = -74 / ((-arg0 - 81) / 43);
        for (int var3 = 0; var3 < class176.field2403; var3++) {
            for (int var4 = 0; var4 < class383.field5395; var4++) {
                if (class183.method1232(var1, -97, var3, true, class250.field3570, var4)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(B)Z")
    public abstract boolean method934(byte arg0);

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method935(boolean arg0);
}
