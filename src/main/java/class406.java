import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class406 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "B")
    public byte field5604 = 0;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "S")
    public short field5616;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "S")
    public short field5619;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "B")
    public byte field5622;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "B")
    public byte field5620;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Lfn;")
    public static class52 field5623 = new class52(53, 6);

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "B")
    public byte field5605;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "B")
    public byte field5607;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "B")
    public byte field5615;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "B")
    public byte field5626;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lnp;")
    public class146 field5613;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lwm;")
    public class242 field5614;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Lof;")
    public class367 field5621;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lui;")
    public class406 field5606;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lpi;")
    public class467 field5617;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Lpi;")
    public class467 field5624;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "Lnd;")
    public class473 field5628;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lwe;")
    public class87 field5608;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Lwe;")
    public class87 field5625;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "S")
    public short field5618;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Z")
    public boolean field5609;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Z")
    public boolean field5610;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Z")
    public boolean field5611;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "[I")
    public static int[] field5629;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static final void method2384(int arg0) {
        field5630++;
        if (class90.field1344 != null) {
            return;
        }
        int var1 = class335.field4600;
        int var2 = class192.field2743;
        int var3 = class3.field28 - class67.field987 - var1;
        int var4 = class77.field1166 - var2 - class371.field5248;
        if (~var1 >= arg0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class240.field3384 == null) {
                var5 = class343.field4703.field234;
            } else {
                var5 = class240.field3384;
            }
            int var6 = 0;
            int var7 = 0;
            if (class240.field3384 == var5) {
                Insets var8 = class240.field3384.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class77.field1166);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class3.field28, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class3.field28 + var6 - var3, var7, var3, class77.field1166);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class77.field1166 - var4, class3.field28, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(III)V")
    public class406(int arg0, int arg1, int arg2) {
        this.field5616 = (short) arg1;
        this.field5619 = (short) arg2;
        this.field5620 = this.field5622 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static final void method2385(byte arg0) {
        class62.method456();
        int var1 = -124 % ((arg0 + 8) / 41);
        field5603++;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
    public final void method2386(byte arg0) {
        field5627++;
        while (this.field5613 != null) {
            class146 var2 = this.field5613.field2066;
            this.field5613.method905(-501);
            this.field5613 = var2;
        }
        if (arg0 > -64) {
            method2388(-46, 89);
        }
        this.field5604 = 0;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static void method2387(int arg0) {
        if (arg0 != -32695) {
            method2388(72, 7);
        }
        field5629 = null;
        field5623 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public static final int method2388(int arg0, int arg1) {
        field5612++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg1 > -35) {
            field5629 = null;
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }
}
