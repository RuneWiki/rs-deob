import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class606 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Luaa;")
    private class395 field8622 = new class395(256);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Ln;")
    private class472 field8620;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Ljj;")
    private class66 field8627;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Liu;")
    public static class517 field8626;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "S")
    public static short field8628;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method3451(int arg0) {
        field8626 = null;
        if (arg0 != -11344) {
            field8625 = 76;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public final void method3452(boolean arg0) {
        field8624++;
        if (arg0) {
            field8628 = -89;
        }
        this.field8622.method2406(-116);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public final void method3453(byte arg0) {
        field8623++;
        if (arg0 != -86) {
            this.method3453((byte) 56);
        }
        this.field8622.method2397(5, (byte) -68);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lhp;")
    public final class355 method3454(int arg0, int arg1) {
        field8619++;
        Object var3 = this.field8622.method2407(false, (long) arg1);
        if (var3 != null) {
            return (class355) var3;
        } else if (this.field8620.method2389(arg0 - 3592, arg1)) {
            if (arg0 != 3553) {
                this.field8627 = null;
            }
            class576 var4 = this.field8620.method2387((byte) 127, arg1);
            int var5 = var4.field8205 ? 64 : this.field8627.field1127;
            class355 var7;
            if (var4.field8221 && this.field8627.method157()) {
                float[] var6 = this.field8620.method2392(0.7F, var5, arg1, arg0 ^ 0x652, false, var5);
                var7 = new class355(this.field8627, 3553, 34842, var5, var5, var4.field8201 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field8217) {
                    var8 = this.field8620.method2385(0.7F, var5, false, arg1, true, var5);
                } else {
                    var8 = this.field8620.method2388(var5, var5, true, arg1, 0.7F, (byte) -64);
                }
                var7 = new class355(this.field8627, 3553, 6408, var5, var5, var4.field8201 != 0, var8, false);
            }
            var7.method2163(83, var4.field8218, var4.field8207);
            this.field8622.method2408(var7, (long) arg1, -128);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Loh;III)V")
    public static final void method3455(class549 arg0, int arg1, int arg2, int arg3) {
        field8621++;
        if (class311.field4557 != null || class2.field20 || arg0 == null || class332.method2053(arg0, arg2 - 3646) == null) {
            return;
        }
        class311.field4557 = arg0;
        class179.field2601 = class332.method2053(arg0, arg2 - 3641);
        class55.field790 = 0;
        class216.field3271 = arg1;
        class412.field6107 = false;
        if (arg2 != 3553) {
            method3455(null, -5, 87, 37);
        }
        class641.field9292 = arg3;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Ljj;Ln;)V")
    public class606(class66 arg0, class472 arg1) {
        this.field8620 = arg1;
        this.field8627 = arg0;
    }

    static {
        new class567("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field8625 = 0;
        field8626 = new class517(84, 3);
        field8628 = 1;
    }
}
