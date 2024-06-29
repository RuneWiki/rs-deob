import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class613 {

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public int field8816 = 0;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public int field8818 = 0;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "[F")
    public float[] field8817 = new float[5000];

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public volatile int field8814 = 0;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public volatile int field8819 = 0;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "[Ljava/lang/Object;")
    public Object[] field8821 = new Object[5000];

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "[B")
    public byte[] field8822 = new byte[5000];

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field8815 = 2;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "F")
    public static float field8813;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(FIILsa;Z)V")
    public abstract void method2853(float arg0, int arg1, int arg2, class174 arg3, boolean arg4);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
    public abstract void method2863(int arg0, int arg1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public abstract void method2855(int arg0);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
    public abstract void method2858(int arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILbo;)V")
    public abstract void method2854(int arg0, class622 arg1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZLbo;)V")
    public abstract void method2852(boolean arg0, class622 arg1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V")
    public abstract void method2856(int arg0, byte arg1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lan;Lan;Lqa;B)V")
    public static final void method3586(class21 arg0, class21 arg1, class207 arg2, byte arg3) {
        if (arg3 != -91) {
            field8815 = -83;
        }
        field8820++;
        class451.field6372 = class571.method3244(-32635, class491.field6877, 0, arg1);
        class503.field6998 = arg2.method1348(class451.field6372, class38.method397(arg0, class491.field6877, 0), true);
        class208.field2944 = class571.method3244(-32635, class176.field2518, 0, arg1);
        class206.field2905 = arg2.method1348(class208.field2944, class38.method397(arg0, class176.field2518, 0), true);
        class40.field798 = class571.method3244(-32635, class643.field9333, 0, arg1);
        class515.field7246 = arg2.method1348(class40.field798, class38.method397(arg0, class643.field9333, 0), true);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lbo;Z)V")
    public abstract void method2865(class622 arg0, boolean arg1);

    static {
        new class104("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }
}
