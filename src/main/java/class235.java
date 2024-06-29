import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class235 {

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public int field3765 = 0;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public int field3763 = 0;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Z")
    public boolean field3778 = false;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Z")
    public static boolean field3760 = true;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lbc;")
    public static class302 field3772 = null;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lok;")
    public static class41 field3768 = class137.method956("zap", 45);

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lok;")
    public static class41 field3771 = class137.method956("Verbindung mit Update)2Server)3)3)3", 45);

    @OriginalMember(owner = "client!t", name = "q", descriptor = "[I")
    public static int[] field3776 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3764 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Lok;")
    private static class41 field3780 = class137.method956("Select", 45);

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lok;")
    public static class41 field3781 = field3780;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Ltl;")
    public class257 field3775;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3773;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[Lka;")
    public static class279[] field3770;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(JB)Lok;", line = 5)
    public static final class41 method1690(long arg0, byte arg1) {
        field3761++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 20 / ((arg1 + 66) / 58);
            long var4 = arg0;
            int var6 = 0;
            while (var4 != 0L) {
                var6++;
                var4 /= 37L;
            }
            byte[] var7 = new byte[var6];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var6--;
                var7[var6] = class317.field5362[(int) (var8 - (arg0 * 37L))];
            }
            class41 var10 = new class41();
            var10.field660 = var7;
            var10.field617 = var7.length;
            return var10;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 46)
    public static void method1691(int arg0) {
        field3781 = null;
        field3776 = null;
        field3770 = null;
        field3768 = null;
        field3772 = null;
        field3771 = null;
        if (arg0 != 0) {
            field3760 = false;
        }
        field3780 = null;
        field3764 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 84)
    public static final void method1692(int arg0, int arg1) {
        class139.field2145 = arg1;
        field3769++;
        class196.method1402(96, 3);
        class196.method1402(-85, 4);
        if (arg0 <= 55) {
            field3770 = (class279[]) null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 122)
    public static final void method1693(byte arg0) {
        class292.method2027(38);
        field3762++;
        class272.method1923(8);
        class173.method1238(arg0 ^ 0xFFFFFFF1);
        class160.method1134((byte) -94);
        class13.method60(-1);
        class20.method133((byte) -112);
        class307.method2140(3);
        class93.method662(false);
        class70.method513(true);
        class266.method1881((byte) -94);
        class101.method707(arg0 ^ 0xFFFFFFBD);
        class214.method1514((byte) -21);
        class156.method1111(1);
        class109.method741((byte) -108);
        if (!class166.field2625) {
            ((class305) class31.field461).method2101((byte) -81);
        }
        class281.field4570.method548(arg0 ^ 0x2C);
        class60.field884.method472(-126);
        class63.field929.method472(-128);
        class167.field2657.method472(-14);
        class44.field693.method472(87);
        class245.field3938.method472(-127);
        class294.field4763.method472(arg0 ^ 0xFFFFFF99);
        class45.field711.method472(-128);
        if (arg0 != -114) {
            method1694((byte) 98);
        }
        class212.field3423.method472(101);
        class201.field3220.method472(arg0 ^ 0xFFFFFFBD);
        class81.field1201.method472(-8);
        class113.field1670.method472(arg0 ^ 0xFFFFFFF8);
        class245.field3914.method131(arg0 ^ 0x70);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)Z", line = 167)
    public static final boolean method1694(byte arg0) {
        field3774++;
        if (arg0 > -87) {
            field3771 = (class41) null;
        }
        return class199.field3199 == 0 ? class210.field3379.method1073(59) : true;
    }
}
