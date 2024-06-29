import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class226 extends Canvas {

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field3188;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Lak;")
    public static class222 field3186 = new class222(11, 0, 1, 2);

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Lwt;")
    public static class194 field3194 = new class194("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field3196 = -60;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field3195 = -50;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field3197 = 0;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "Lgn;")
    public static class475 field3198 = new class475(10, 7);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lhe;")
    public static class239 field3190;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3193;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static void method1393(byte arg0) {
        field3198 = null;
        field3190 = null;
        field3194 = null;
        field3193 = null;
        int var1 = 82 % ((arg0 - 36) / 40);
        field3186 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)Z")
    public static final boolean method1394(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method1393((byte) 9);
        }
        field3189++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!km", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3187++;
        this.field3188.update(arg0);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(III)Z")
    public static final boolean method1395(int arg0, int arg1, int arg2) {
        field3191++;
        if (arg1 > -48) {
            field3197 = 50;
        }
        return class397.method2375(540800, arg0, arg2) || class56.method419(arg0, true, arg2);
    }

    @OriginalMember(owner = "client!km", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3185++;
        this.field3188.paint(arg0);
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class226(Component arg0) {
        this.field3188 = arg0;
    }
}
