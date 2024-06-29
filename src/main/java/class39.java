import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class39 {

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lpk;")
    private static class66 field700 = new class66(64);

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Le;")
    public static class191 field703 = class54.method368("Zugewiesener Speicher)3", 2047);

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field706 = 0;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "[[I")
    public static int[][] field707 = new int[104][104];

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field708 = 0;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Le;")
    private static class191 field710 = class54.method368(" has logged in)3", 2047);

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "Z")
    public static boolean field709 = false;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Le;")
    public static class191 field704 = field710;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Lng;")
    public static class121 field705;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field702;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    public int[] field699;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public final void method261(int arg0) {
        int var2 = 119 % ((arg0 - 43) / 41);
        class7.method43(this.field699, this.field696, this.field698);
        field694++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public abstract void method157(int arg0, int arg1, byte arg2, Component arg3);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method155(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method262(byte arg0) {
        field707 = null;
        field710 = null;
        if (arg0 <= -118) {
            field700 = null;
            field705 = null;
            field703 = null;
            field704 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V")
    public abstract void method156(boolean arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)Lsa;")
    public static final class69 method263(int arg0, byte arg1) {
        class69 var2 = (class69) field700.method437((byte) 110, (long) arg0);
        field697++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class17.field233.method826((byte) 35, 1, arg0);
        } else {
            var3 = class91.field1496.method826((byte) 35, 1, arg0 & 0x7FFF);
        }
        if (arg1 > -119) {
            return null;
        }
        class69 var4 = new class69();
        if (var3 != null) {
            var4.method460((byte) 5, new class225(var3));
        }
        if (arg0 >= 32768) {
            var4.method458(33);
        }
        field700.method439(var4, -1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IB)V")
    public static final void method264(int arg0, byte arg1) {
        if (arg1 != 14) {
            method263(-125, (byte) -86);
        }
        if (class273.field4825 == 0) {
            class42.field733.method1522(arg1 ^ 0xFFFFACDD, arg0);
        } else {
            class114.field1888 = arg0;
        }
        field701++;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    protected class39() {
    }
}
