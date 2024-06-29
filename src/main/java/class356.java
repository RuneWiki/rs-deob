import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class356 implements class46 {

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "Lwo;")
    public static class690 field4749 = new class690(6, 0);

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "J")
    public static long field4752 = 0L;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    public static int field4754 = 0;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "Ler;")
    public static class90 field4753 = new class90("stellardawn", 1);

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "Lwo;")
    public static class690 field4755 = new class690(54, 2);

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "Loe;")
    public static class183 field4756;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(III)Z")
    public static final boolean method2007(int arg0, int arg1, int arg2) {
        field4750++;
        int var3 = 77 % ((arg1 + 7) / 40);
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)Lsq;")
    public final class161 method448(byte arg0) {
        if (arg0 == 25) {
            field4748++;
            return class564.field8148;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(FB)F")
    public static final float method2008(float arg0, byte arg1) {
        if (arg1 < 117) {
            method2007(87, -97, 57);
        }
        field4747++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
    public static void method2009(int arg0) {
        field4755 = null;
        field4749 = null;
        field4756 = null;
        if (arg0 != 22072) {
            method2007(42, -75, -117);
        }
        field4753 = null;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(I)V")
    public class356(int arg0) {
        this.field4751 = arg0;
    }
}
