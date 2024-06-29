import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class29 {

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[Lfd;")
    public static class58[] field350 = new class58[14];

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "[I")
    public static int[] field347 = new int[14];

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "[S")
    public static short[] field354 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field346 = 0;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Lwj;")
    public static class130 field352;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Lbc;")
    public static class282 field345;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lbc;Z)V")
    public static final void method174(class282 arg0, boolean arg1) {
        if (!arg1) {
            field344++;
            class129.field1866 = arg0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method175(int arg0) {
        field347 = null;
        field350 = null;
        field352 = null;
        if (arg0 >= -51) {
            method178(28, -30);
        }
        field354 = null;
        field345 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static final void method176(byte arg0) {
        field353++;
        class274.field4099.method67((byte) 112);
        class277.field4211.method67((byte) -120);
        if (arg0 != -112) {
            method176((byte) 63);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static final void method177(int arg0) {
        if (arg0 != 16732) {
            field352 = null;
        }
        field351++;
        class274.field4074.method67((byte) 126);
        class28.field336.method67((byte) -121);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)I")
    public static final int method178(int arg0, int arg1) {
        int var2 = arg1 >>> 1;
        field348++;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        if (arg0 > -64) {
            field347 = null;
        }
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }
}
