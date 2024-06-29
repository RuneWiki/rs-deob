import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class275 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Z")
    public static boolean field4685 = true;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lma;")
    public static class5 field4683 = class12.method119("b12_full", (byte) 113);

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[I")
    public static int[] field4687 = new int[2];

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4688 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field4690 = 0;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field4689 = 0;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lma;")
    public static class5 field4696 = class12.method119("leuchten2:", (byte) 96);

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lma;")
    public static class5 field4692 = class12.method119(")3runescape)3com", (byte) 124);

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lma;")
    public static class5 field4693 = class12.method119(":clan:", (byte) 64);

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lma;")
    private static class5 field4694 = class12.method119("level)2", (byte) 107);

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[Lje;")
    public static class158[] field4697 = new class158[256];

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lma;")
    public static class5 field4691 = field4694;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lma;")
    public static class5 field4695 = class12.method119("sch-Utteln:", (byte) 115);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field4698 = 0;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I", line = 12)
    public static final int method1871(int arg0, int arg1) {
        field4686++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1 != 1110164296) {
            method1871(46, 4);
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 51)
    public static void method1872(int arg0) {
        field4695 = null;
        int var1 = -12 / ((arg0 - 20) / 53);
        field4687 = null;
        field4691 = null;
        field4696 = null;
        field4683 = null;
        field4692 = null;
        field4693 = null;
        field4697 = null;
        field4694 = null;
        field4688 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Lue;", line = 73)
    public static final class89 method1873(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class89 var4 = var3.field3149;
            var3.field3149 = null;
            return var4;
        }
    }
}
