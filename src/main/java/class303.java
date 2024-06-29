import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class303 {

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public int field4149 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public int field4145 = 0;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "[F")
    public float[] field4148 = new float[5000];

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public volatile int field4151 = 0;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public volatile int field4147 = 0;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "[Ljava/lang/Object;")
    public Object[] field4152 = new Object[5000];

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "[B")
    public byte[] field4153 = new byte[5000];

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "[S")
    public static short[] field4154 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Lbd;")
    public static class464 field4146 = new class464(7, 4);

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field4156 = 0;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Lcs;")
    public static class351 field4155 = new class351(17, -1);

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static final void method1841(int arg0) {
        class224.field3181.method290((byte) 107);
        field4150++;
        class70.field1040 = 1;
        if (arg0 < 10) {
            field4156 = -18;
        }
        class351.field4805 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lui;I)V")
    public abstract void method816(class406 arg0, int arg1);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method1842(int arg0) {
        field4154 = null;
        if (arg0 == 5000) {
            field4155 = null;
            field4146 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
    public abstract void method814(int arg0);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
    public abstract void method813(int arg0, int arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIFLdh;Z)V")
    public abstract void method810(int arg0, int arg1, float arg2, class269 arg3, boolean arg4);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lui;B)V")
    public abstract void method812(class406 arg0, byte arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLui;)V")
    public abstract void method818(byte arg0, class406 arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
    public abstract void method817(boolean arg0);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)V")
    public abstract void method811(int arg0, int arg1);

    static {
        new class112("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
