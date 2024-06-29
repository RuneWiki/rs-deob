import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 implements class27 {

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field467 = 0;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lda;")
    public static class275 field471 = class255.method1672(125, " )2> ");

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[S")
    public static short[] field476 = new short[256];

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lda;")
    public static class275 field470 = class255.method1672(92, "Konfig geladen)3");

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lda;")
    public static class275 field472 = class255.method1672(110, " loggt sich aus)3");

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lda;")
    public static class275 field477 = class255.method1672(126, "<col=00ffff>");

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[Lgd;")
    public static class165[] field478 = new class165[32768];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lhd;")
    public static class95 field474;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIILhh;)Lhh;")
    public static final class176 method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class176 arg6) {
        field469++;
        long var7 = (long) arg1;
        class176 var9 = (class176) class233.field4072.method990(var7, (byte) 10);
        if (var9 == null) {
            class263 var10 = class263.method1719(class105.field1800, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1744(64, 768, -50, -10, -50);
            class233.field4072.method986(arg3 ^ 0xFFFFFFF6, var7, var9);
        }
        if (arg3 != -10) {
            method182(72, 4, 94, -105, 51, 99, (class176) null);
        }
        int var11 = arg6.method942();
        int var12 = arg6.method929();
        int var13 = arg6.method952();
        int var14 = arg6.method935();
        class176 var15 = var9.method943(true, true);
        if (arg5 != 0) {
            var15.method926(arg5);
        }
        class130 var16 = (class130) var15;
        if (class89.method647(arg0 + var13, class159.field2790, arg2 + var11, -41) != arg4 || class89.method647(arg0 + var14, class159.field2790, arg2 + var12, arg3 ^ 0xFFFFFF8A) != arg4) {
            for (int var17 = 0; var17 < var16.field2281; var17++) {
                var16.field2285[var17] += class89.method647(var16.field2292[var17] + arg0, class159.field2790, var16.field2308[var17] + arg2, 121) - arg4;
            }
            var16.field2301 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method183(int arg0) {
        if (arg0 <= 41) {
            method187((byte) 87);
        }
        field465++;
        for (class112 var1 = (class112) class267.field4633.method1864((byte) -73); var1 != null; var1 = (class112) class267.field4633.method1869(-1)) {
            int var2 = var1.field1977;
            if (class267.method1755(0, var2)) {
                class229[] var3 = class173.field3005[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field3884;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field1707;
                    class229 var7 = class261.method1709(var6, -96);
                    if (var7 != null) {
                        class40.method231(var7, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static final void method184(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class73.field1195[var1] = false;
        }
        if (arg0 != -25218) {
            method187((byte) -60);
        }
        class159.field2789 = 1;
        field473++;
        class44.field750 = -1;
        class29.field434 = -1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
    public static final void method185(int arg0, byte arg1) {
        field468++;
        if (arg1 == -74) {
            class225.field3823.method988(arg0, arg1 ^ 0x38);
            class268.field4648.method988(arg0, arg1 ^ 0x38);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ldj;I)V")
    public static final void method186(class104 arg0, int arg1) {
        if (class35.field576 == arg0.field1737 || arg0.field1776 == -1 || arg0.field1749 != 0 || (arg0.field1780 + 1) > class201.method1321(128, arg0.field1776).field3667[arg0.field1740]) {
            int var2 = arg0.field1737 - arg0.field1779;
            int var3 = class35.field576 - arg0.field1779;
            int var4 = arg0.field1748 * 128 + (arg0.method750((byte) -111) * 64);
            int var5 = arg0.field1756 * 128 + (arg0.method750((byte) -103) * 64);
            int var6 = arg0.field1789 * 128 + (arg0.method750((byte) -115) * 64);
            int var7 = arg0.field1772 * 128 + arg0.method750((byte) -116) * 64;
            arg0.field1758 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
            arg0.field1770 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        if (arg0.field1753 == 0) {
            arg0.field1773 = 1024;
        }
        field475++;
        arg0.field1763 = 0;
        if (arg0.field1753 == 1) {
            arg0.field1773 = 1536;
        }
        if (arg1 != 64) {
            return;
        }
        if (arg0.field1753 == 2) {
            arg0.field1773 = 0;
        }
        if (arg0.field1753 == 3) {
            arg0.field1773 = 512;
        }
        arg0.field1787 = arg0.field1773;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJ[II)Lda;")
    public final class275 method166(byte arg0, long arg1, int[] arg2, int arg3) {
        if (arg0 < 56) {
            return null;
        }
        field479++;
        if (arg3 == 0) {
            class74 var6 = class216.method1392(arg2[0], 29436);
            return var6.method491((int) arg1, false);
        } else if (arg3 == 1 || arg3 == 10) {
            class245 var7 = class210.method1352(30, (int) arg1);
            return var7.field4322;
        } else if (arg3 == 6 || arg3 == 7) {
            return class216.method1392(arg2[0], 29436).method491((int) arg1, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method187(byte arg0) {
        field478 = null;
        if (arg0 != -107) {
            return;
        }
        field472 = null;
        field470 = null;
        field476 = null;
        field471 = null;
        field474 = null;
        field477 = null;
    }
}
