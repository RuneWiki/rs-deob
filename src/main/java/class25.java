import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class25 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[Lq;")
    public static class165[] field344 = new class165[14];

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lsb;")
    public static class110 field345 = new class110(512);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field349 = 0;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[[[I")
    public static int[][][] field348;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method143(int arg0) {
        field344 = null;
        field345 = null;
        field348 = null;
        int var1 = 83 / ((-arg0 - 71) / 39);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method144(Component arg0, byte arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
    public static final void method145(int arg0, int arg1) {
        class7.method39(18);
        class236.method1667((byte) -59);
        field346++;
        int var2 = class242.method1691(30099, arg0).field3865;
        if (var2 == 0) {
            return;
        }
        int var3 = class135.field2141[arg0];
        if (var2 == 6) {
            class159.field2536 = var3;
        }
        if (var2 == 5) {
            class233.field3851 = var3;
        }
        if (arg1 >= -45) {
            method145(8, -67);
        }
        if (var2 == 9) {
            class271.field4329 = var3;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method146(Component arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)I")
    public abstract int method147(int arg0);
}
