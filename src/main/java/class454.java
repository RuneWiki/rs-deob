import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class454 extends class260 {

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public int field6670 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public int field6668 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public int field6667 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public int field6672 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public int field6664 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public int field6673 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public int field6675 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public int field6676 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Lhq;")
    public class109 field6674;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)Z", line = 4)
    public final boolean method2672(byte arg0, int arg1, int arg2) {
        if (arg0 <= 84) {
            field6666 = 81;
        }
        field6669++;
        if (this.field6672 <= arg1 && this.field6673 >= arg1 && arg2 >= this.field6676 && this.field6667 >= arg2) {
            return true;
        } else {
            return arg1 >= this.field6675 && this.field6668 >= arg1 && arg2 >= this.field6664 && arg2 <= this.field6670;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lhq;)V", line = 124)
    public class454(class109 arg0) {
        this.field6674 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lga;ILdr;IILjava/awt/Canvas;)Lya;", line = 34)
    public static final class38 method2673(class277 arg0, int arg1, class504 arg2, int arg3, int arg4, Canvas arg5) {
        if (arg3 != Integer.MIN_VALUE) {
            field6666 = 53;
        }
        field6671++;
        return new class338(arg4, arg5, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V", line = 65)
    public static final void method2674(int arg0) {
        field6665++;
        int var1 = class375.field5498;
        int[] var2 = class397.field5793;
        for (int var3 = 0; var3 < var1; var3++) {
            class438 var7 = class12.field182[var2[var3]];
            if (var7 != null && var7.field1050 > 0) {
                var7.field1050--;
                if (var7.field1050 == 0) {
                    var7.field1100 = null;
                }
            }
        }
        if (arg0 > -65) {
            method2673(null, 120, null, -71, 33, null);
        }
        for (int var4 = 0; var4 < class275.field3772; var4++) {
            int var5 = class65.field899[var4];
            class502 var6 = class378.field5533[var5];
            if (var6 != null && var6.field1050 > 0) {
                var6.field1050--;
                if (var6.field1050 == 0) {
                    var6.field1100 = null;
                }
            }
        }
    }
}
