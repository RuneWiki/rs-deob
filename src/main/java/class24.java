import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public abstract class class24 {

    @OriginalMember(owner = "mapview!la", name = "f", descriptor = "Ls;")
    public static class34 field238 = class9.method35("Platebody Shop", 220);

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "Z")
    public static volatile boolean field239 = true;

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "Z")
    public static boolean field237 = false;

    @OriginalMember(owner = "mapview!la", name = "k", descriptor = "Ls;")
    public static class34 field243 = class9.method35("Bank", 220);

    @OriginalMember(owner = "mapview!la", name = "n", descriptor = "Ls;")
    public static class34 field246 = class9.method35("Potters Wheel", 220);

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "Ls;")
    public static class34 field236 = class9.method35("Find", 220);

    @OriginalMember(owner = "mapview!la", name = "h", descriptor = "Ls;")
    public static class34 field240 = class9.method35("Anvil", 220);

    @OriginalMember(owner = "mapview!la", name = "q", descriptor = "Z")
    public static boolean field249 = true;

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "Ls;")
    public static class34 field242 = class9.method35("75(U", 220);

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "Ls;")
    public static class34 field241 = class9.method35("POH Portal", 220);

    @OriginalMember(owner = "mapview!la", name = "r", descriptor = "Ls;")
    public static class34 field250 = class9.method35("floorcol)3dat", 220);

    @OriginalMember(owner = "mapview!la", name = "p", descriptor = "Ls;")
    public static class34 field248 = class9.method35("Apothecary", 220);

    @OriginalMember(owner = "mapview!la", name = "m", descriptor = "Ls;")
    public static class34 field245 = class9.method35("map", 220);

    @OriginalMember(owner = "mapview!la", name = "s", descriptor = "Ls;")
    public static class34 field251 = class9.method35("uitext has incorrect number of strings", 220);

    @OriginalMember(owner = "mapview!la", name = "t", descriptor = "I")
    public static int field252 = 0;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "mapview!la", name = "l", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "mapview!la", name = "u", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "J")
    public static long field234;

    @OriginalMember(owner = "mapview!la", name = "v", descriptor = "Ljava/awt/Image;")
    public Image field254;

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "[I")
    public int[] field235;

    @OriginalMember(owner = "mapview!la", name = "o", descriptor = "[[[I")
    public static int[][][] field247;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)V", line = 5)
    public final void method129(int arg0) {
        if (arg0 >= -25) {
            this.field254 = null;
        }
        class23.method125(this.field235, this.field244, this.field253);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B", line = 51)
    public static final byte[] method130(Object arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            return (byte[]) null;
        } else if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class38.method266(103, var3) : var3;
        } else if (arg0 instanceof class30) {
            class30 var4 = (class30) arg0;
            return var4.method203((byte) -128);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(I)V", line = 86)
    public static void method131(int arg0) {
        field248 = null;
        field246 = null;
        field251 = null;
        field236 = null;
        field250 = null;
        field243 = null;
        field240 = null;
        field242 = null;
        field241 = null;
        if (arg0 <= -42) {
            field247 = null;
            field238 = null;
            field245 = null;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Lda;Lda;ZLs;Ls;)Lr;", line = 161)
    public static final class33 method132(class8 arg0, class8 arg1, boolean arg2, class34 arg3, class34 arg4) {
        if (!arg2) {
            field245 = null;
        }
        int var5 = arg0.method32(arg3, -1);
        int var6 = arg0.method21((byte) -114, arg4, var5);
        return class25.method137(var5, (byte) 97, arg0, var6, arg1);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(B)Z", line = 180)
    public static final boolean method133(byte arg0) {
        class35 var1 = class6.field39;
        synchronized (class6.field39) {
            if (class8.field78 == class30.field399) {
                return false;
            } else if (arg0 == 82) {
                class22.field220 = class28.field386[class8.field78];
                class29.field393 = class12.field119[class8.field78];
                class8.field78 = class8.field78 + 1 & 0x7F;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "()V", line = 197)
    protected class24() {
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V")
    public abstract void method53(boolean arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method49(Component arg0, int arg1, int arg2, int arg3);
}
