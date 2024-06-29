import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class295 extends class456 {

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    private int field4433;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "Lo;")
    public static class332 field4437 = new class332("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "Z")
    public static boolean field4438 = false;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "Lct;")
    public static class285 field4439 = new class285(60, 15);

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lng;I)[Lv;", line = 3)
    public static final class426[] method1852(class153 arg0, int arg1) {
        ++field4434;
        if (!arg0.method1034(false)) {
            return new class426[0];
        } else {
            class397 var2 = arg0.method1038((byte) 88);
            if (arg1 != 1467792898) {
                method1852((class153) null, -85);
            }
            while (var2.field5822 == 0) {
                class325.method2005(true, 10L);
            }
            if (~var2.field5822 == -3) {
                return new class426[0];
            } else {
                int[] var3 = (int[]) var2.field5823;
                class426[] var4 = new class426[var3.length >> 2];
                for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                    class426 var6 = new class426();
                    var4[var5] = var6;
                    var6.field6085 = var3[var5 << 2];
                    var6.field6088 = var3[(var5 << 2) + 1];
                    var6.field6089 = var3[(var5 << 2) + 2];
                    var6.field6086 = var3[(var5 << 2) + 3];
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBLre;)V", line = 48)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        ++field4435;
        if (~arg0 == -1) {
            this.field4433 = (arg2.method2628(arg1 ^ 49207) << 12) / 255;
        }
        if (arg1 != 55) {
            method1853(-54);
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 76)
    public class295() {
        this(4096);
    }

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)V", line = 79)
    public static void method1853(int arg0) {
        field4437 = null;
        if (arg0 == 0) {
            field4439 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)[I", line = 90)
    public final int[] method33(int arg0, int arg1) {
        ++field4436;
        if (arg0 != -1) {
            this.method33(72, 82);
        }
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            class149.method1010(var3, 0, class156.field2169, this.field4433);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V", line = 116)
    public class295(int arg0) {
        super(0, true);
        this.field4433 = 4096;
        this.field4433 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lcp;Ljava/awt/Canvas;ZI)Ltq;", line = 130)
    public static final class63 method1854(class481 arg0, Canvas arg1, boolean arg2, int arg3) {
        ++field4432;
        return arg2 ? null : new class127(arg1, arg0, arg3);
    }
}
