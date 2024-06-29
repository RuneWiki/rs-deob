import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class306 {

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "B")
    public byte field4594 = 0;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "S")
    public short field4581;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "B")
    public byte field4576;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "B")
    public byte field4583;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "S")
    public short field4593;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field4572 = 0;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "[F")
    public static float[] field4573 = new float[4];

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "B")
    public byte field4578;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "B")
    public byte field4579;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "B")
    public byte field4580;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "B")
    public byte field4595;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "Loa;")
    public class169 field4586;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "Loa;")
    public class169 field4592;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "Lwt;")
    public class17 field4589;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "Luc;")
    public class202 field4588;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "Lnu;")
    public class259 field4577;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "Lrr;")
    public class306 field4585;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "Lpv;")
    public class46 field4587;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "Llf;")
    public class512 field4582;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "Llf;")
    public class512 field4596;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "S")
    public short field4591;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "Z")
    public boolean field4575;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "Z")
    public boolean field4584;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "Z")
    public boolean field4590;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "[I")
    public static int[] field4571;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "[[I")
    public static int[][] field4574;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public final void method1905(byte arg0) {
        field4569++;
        if (arg0 != 47) {
            method1907(-84);
        }
        while (this.field4589 != null) {
            class17 var2 = this.field4589.field281;
            this.field4589.method198(-80);
            this.field4589 = var2;
        }
        this.field4594 = 0;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lsj;")
    public static final class506 method1906(int arg0) {
        if (arg0 != 0) {
            field4573 = null;
        }
        field4570++;
        class506 var1 = (class506) class513.field7514.method1713(105);
        if (var1 != null) {
            var1.method876((byte) -96);
            var1.method2440(-120);
            return var1;
        }
        class506 var2;
        do {
            var2 = (class506) class349.field5376.method1713(105);
            if (var2 == null) {
                return null;
            }
            if (var2.method2985(arg0 - 22854) > class381.method2281((byte) 67)) {
                return null;
            }
            var2.method876((byte) -96);
            var2.method2440(-122);
        } while ((Long.MIN_VALUE & var2.field6102) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
    public static void method1907(int arg0) {
        field4574 = null;
        field4571 = null;
        if (arg0 == 22215) {
            field4573 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(III)V")
    public class306(int arg0, int arg1, int arg2) {
        this.field4581 = (short) arg2;
        this.field4583 = this.field4576 = (byte) arg0;
        this.field4593 = (short) arg1;
    }
}
