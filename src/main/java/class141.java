import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class141 {

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public int field2472 = -1;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "[I")
    public static int[] field2467 = new int[256];

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lod;")
    public static class127 field2475;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[I")
    public static int[] field2477;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2478;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public int field2474;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lda;")
    public static class22 field2476;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "[[S")
    public static short[][] field2480;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)Z")
    public static final boolean method986(int arg0) {
        field2470++;
        class160 var1 = class89.field1696;
        synchronized (class89.field1696) {
            if (class54.field980 == class229.field3850) {
                return false;
            }
            class190.field3153 = class45.field833[class229.field3850];
            class133.field2333 = class225.field3779[class229.field3850];
            class229.field3850 = class229.field3850 + 1 & 0x7F;
            if (arg0 != -31402) {
                field2476 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILda;II)Lek;")
    public static final class169 method987(int arg0, class22 arg1, int arg2, int arg3) {
        field2468++;
        if (class79.method581((byte) -118, arg0, arg1, arg3)) {
            return arg2 > -72 ? null : class15.method116((byte) 121);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method988(int arg0) {
        field2467 = null;
        field2480 = null;
        field2476 = null;
        field2475 = null;
        if (arg0 < -96) {
            field2477 = null;
            field2478 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
    public static final void method989(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2466++;
        for (int var5 = 0; var5 < class60.field1094; var5++) {
            if ((class238.field4046[var5] + class172.field2877[var5]) > arg1 && class238.field4046[var5] < arg1 + arg2 && arg3 < class159.field2741[var5] + class151.field2624[var5] && class159.field2741[var5] < arg3 + arg4) {
                class208.field3458[var5] = true;
            }
        }
        if (arg0 <= 83) {
            field2475 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2467[var0] = var1;
        }
        field2475 = new class127(128);
        field2477 = new int[200];
        field2478 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    }
}
