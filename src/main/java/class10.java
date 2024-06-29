import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class10 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "[I")
    public static int[] field201 = new int[2000];

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Ldj;")
    public static class44 field202 = class89.method650(255, "<col=ffb000>");

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Ldj;")
    private static class44 field209 = class89.method650(255, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Ldj;")
    public static class44 field211 = field209;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Ldj;")
    private static class44 field203 = class89.method650(255, "Please wait)3)3)3");

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Lvc;")
    public static class223 field215 = null;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Ldj;")
    public static class44 field206 = field203;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field207;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "[I")
    public int[] field210;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "[S")
    public static short[] field208;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method93(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static final void method94(byte arg0) {
        class54.field990 = new class120(32);
        field200++;
        if (arg0 < 108) {
            field204 = 32;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method95(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    protected class10() {
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        field214++;
        class99.method705(this.field210, this.field205, this.field213);
        if (arg0 >= -21) {
            this.method93(-47, null, -127, -86);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public abstract void method97(Graphics arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V")
    public static void method98(byte arg0) {
        field202 = null;
        field206 = null;
        field209 = null;
        field201 = null;
        field211 = null;
        field215 = null;
        field203 = null;
        field208 = null;
        if (arg0 > -70) {
            method94((byte) -76);
        }
    }
}
