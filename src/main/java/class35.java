import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public class class35 {

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "Lia;")
    public static class15 field488 = class28.method196("Vegetable Store", false);

    @OriginalMember(owner = "mapview!sa", name = "e", descriptor = "Lia;")
    public static class15 field492 = class28.method196("Chainmail Shop", false);

    @OriginalMember(owner = "mapview!sa", name = "d", descriptor = "Lia;")
    public static class15 field491 = class28.method196("Hunter Training", false);

    @OriginalMember(owner = "mapview!sa", name = "f", descriptor = "I")
    public static int field493 = 0;

    @OriginalMember(owner = "mapview!sa", name = "h", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "J")
    public static long field489;

    @OriginalMember(owner = "mapview!sa", name = "g", descriptor = "Ll;")
    public static class20 field494;

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field490;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(BII[B)I", line = 46)
    public static final int method239(byte arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        if (arg0 != 61) {
            field492 = null;
        }
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class39.field509[(arg3[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I)V", line = 96)
    public static void method240(int arg0) {
        field492 = null;
        field494 = null;
        field491 = null;
        field490 = null;
        if (arg0 > -112) {
            field495 = -85;
        }
        field488 = null;
    }

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "(I)V", line = 117)
    public static final void method241(int arg0) {
        int var1 = 66 % ((-arg0 - 26) / 32);
        if (++class17.field166 >= 64) {
            class17.field166 = 0;
            class2.field16++;
            if (class15.field150 >> 6 > class2.field16) {
                class20.method149(-109);
            }
        }
        class13.field111 = (class17.field166 << 6) + class18.field180;
    }
}
