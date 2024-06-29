import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class21 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[Z")
    public static boolean[] field540 = new boolean[100];

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field544 = 0;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field543 = 0;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field548 = 0;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field547 = 3;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Ljd;")
    public static class86 field551 = class122.method868("Spieler kann nicht gefunden werden: ", true);

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field542;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "[I")
    public int[] field539;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLjd;)V")
    public static final void method156(boolean arg0, class86 arg1) {
        field550++;
        int var2 = class160.method1165(114, arg1);
        if (var2 == -1) {
            return;
        }
        if (arg0) {
            method161((byte) -119);
        }
        class51.field1074 = class106.field2030.field1179[var2] - class90.field1847;
        int var3 = class51.field1074 - ((int) ((float) class239.field4310.field163 / class202.field3658));
        int var4 = (int) ((float) class239.field4310.field163 / class202.field3658) + class51.field1074;
        class152.field2875 = class38.field894 - (class106.field2030.field1182[var2] - class238.field4289) - 1;
        int var5 = (int) ((float) class239.field4310.field131 / class202.field3658) + class152.field2875;
        int var6 = class152.field2875 - (int) ((float) class239.field4310.field131 / class202.field3658);
        if (var3 < 0) {
            class51.field1074 = (int) ((float) class239.field4310.field163 / class202.field3658);
        }
        if (class263.field4668 < var4) {
            class51.field1074 = class263.field4668 - ((int) ((float) class239.field4310.field163 / class202.field3658));
        }
        if (var6 < 0) {
            class152.field2875 = (int) ((float) class239.field4310.field131 / class202.field3658);
        }
        if (var5 > class38.field894) {
            class152.field2875 = class38.field894 - ((int) ((float) class239.field4310.field131 / class202.field3658));
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public final void method157(boolean arg0) {
        field553++;
        if (!arg0) {
            this.field549 = 15;
        }
        class131.method928(this.field539, this.field546, this.field549);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public abstract void method158(int arg0, Graphics arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public abstract void method159(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method160(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method161(byte arg0) {
        if (arg0 != -55) {
            field540 = null;
        }
        field551 = null;
        field540 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    protected class21() {
    }
}
