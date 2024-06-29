import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class16 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field219 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "[I")
    public static int[] field226 = new int[] { 0, 0, -1, 0, 8, 2, 6, 0, 4, 0, -1, 8, 12, -2, 0, 0, 0, 0, 15, -2, 0, 12, 0, 0, 3, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 0, 0, 2, -2, -1, 0, -1, 0, 0, 0, 6, 0, 0, 0, 0, 12, -1, -1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 5, 0, 6, 0, 0, 0, 10, 0, 12, 0, 0, 0, 4, 0, -2, 8, 3, 6, 5, 8, 0, 0, 0, 0, 0, 0, 3, 0, 14, 0, 0, 0, 0, 4, -2, 0, 20, 11, -1, -2, 0, 0, 0, 0, 6, 3, 0, 7, 0, 0, 0, 0, 6, -1, 0, 0, 0, 0, 7, 0, 0, 28, 0, 1, 0, 0, 4, 0, 15, 0, 2, 0, 0, 7, 2, 0, 0, 0, 7, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 6, 0, 0, 2, 0, 0, 0, 2, 3, -1, 0, 0, 17, 0, 0, 0, 0, 10, 0, 1, -2, 0, 6, 0, 0, 9, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 6, 0, 2, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 8, 14, -1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 3, 0, 2, 0, 0, 8, 0, 0, 0, 0, 0, -2, 0, 0, 0, -2, 6, 1, 0, 6, 0, 1, -1, 0, 10, 10, 0, 8, 5 };

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lcc;")
    public static class263 field223;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Lnn;")
    public class44 field220;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
    public int[] field225;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 4)
    public static final void method109(byte arg0) {
        field222++;
        class246.method1773();
        class275.field4286 = new class70[9];
        class275.field4286[1] = new class77();
        if (arg0 != 4) {
            method112(34);
        }
        class275.field4286[2] = new class102();
        class275.field4286[3] = new class95();
        class275.field4286[4] = new class46();
        class275.field4286[5] = new class32();
        class275.field4286[6] = new class4();
        class275.field4286[7] = new class301();
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I", line = 32)
    public static final int method110(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
        int var3 = -98 % ((arg1 - 65) / 36);
        int var4 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var5 = (var4 >>> 4) + var4 & 0xF0F0F0F;
        field224++;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 47)
    public static void method111(int arg0) {
        field226 = null;
        field223 = null;
        if (arg0 != 8) {
            method112(96);
        }
        field219 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Lge;", line = 60)
    public static final class163 method112(int arg0) {
        field227++;
        if (class149.field2076 >= class184.field2649.length) {
            if (arg0 >= -49) {
                method109((byte) -59);
            }
            return null;
        } else {
            return class184.field2649[class149.field2076++];
        }
    }
}
