import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public abstract class class24 {

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "Lh;")
    public static class15 field322 = class18.method153("Farming shop", 1);

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "Lh;")
    public static class15 field319 = class18.method153("Chainmail Shop", 1);

    @OriginalMember(owner = "mapview!la", name = "h", descriptor = "Lh;")
    public static class15 field326 = class18.method153("Transportation", 1);

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "Lh;")
    public static class15 field323 = class18.method153("Archery Shop", 1);

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "Lh;")
    public static class15 field320 = class18.method153("Gem Shop", 1);

    @OriginalMember(owner = "mapview!la", name = "k", descriptor = "Lh;")
    public static class15 field329 = class18.method153("Prev page", 1);

    @OriginalMember(owner = "mapview!la", name = "l", descriptor = "Lh;")
    public static class15 field330 = class18.method153("floorcol)3dat", 1);

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "Lh;")
    public static class15 field328 = class18.method153("Agility Training", 1);

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "[[[[B")
    public static byte[][][][] field327 = new byte[5][][][];

    @OriginalMember(owner = "mapview!la", name = "m", descriptor = "I")
    public static int field331 = 0;

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "mapview!la", name = "f", descriptor = "[I")
    public static int[] field324;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)V", line = 15)
    public static void method185(int arg0) {
        field320 = null;
        field329 = null;
        field326 = null;
        field328 = null;
        if (arg0 != -26237) {
            field321 = -124;
        }
        field322 = null;
        field327 = null;
        field324 = null;
        field323 = null;
        field330 = null;
        field319 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IILjava/awt/Component;I)Le;", line = 35)
    public static final class9 method186(int arg0, int arg1, Component arg2, int arg3) {
        try {
            if (arg0 == 0) {
                Class var4 = Class.forName("w");
                class9 var5 = (class9) var4.getDeclaredConstructor().newInstance();
                var5.method78(arg2, true, arg3, arg1);
                return var5;
            } else {
                return (class9) null;
            }
        } catch (Throwable var8) {
            class28 var7 = new class28();
            var7.method78(arg2, true, arg3, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(I)V")
    public abstract void method50(int arg0);

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IIB)I")
    public abstract int method48(int arg0, int arg1, byte arg2);
}
