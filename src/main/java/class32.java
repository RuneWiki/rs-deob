import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class32 extends class191 {

    @OriginalMember(owner = "client!da", name = "R", descriptor = "Z")
    public boolean field673 = false;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "Ldh;")
    private class39 field687;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "Z")
    public boolean field674;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "Z")
    public boolean field688;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    private int field679;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "Ldd;")
    public static class35 field668 = class180.method1196((byte) 126, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!da", name = "W", descriptor = "Ldd;")
    public static class35 field678 = class180.method1196((byte) 126, "<img=0>");

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "Ldd;")
    private static class35 field681 = class180.method1196((byte) 127, "Malformed login packet)3");

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Ldd;")
    public static class35 field665 = field681;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "Ldd;")
    public static class35 field683 = class180.method1196((byte) 126, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field667 = 2;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "[Z")
    public static boolean[] field680 = new boolean[100];

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "F")
    private float field672;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "[I")
    private int[] field663;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLag;I)Lre;")
    public static final class166 method304(byte arg0, class8 arg1, int arg2) {
        if (arg0 >= -104) {
            field678 = null;
        }
        field676++;
        byte[] var3 = arg1.method41(arg2, (byte) -110);
        return var3 == null ? null : new class166(var3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldd;Lag;BLdd;)[Lbg;")
    public static final class18[] method305(class35 arg0, class8 arg1, byte arg2, class35 arg3) {
        field666++;
        if (arg2 == 74) {
            int var4 = arg1.method37(arg0, (byte) -62);
            int var5 = arg1.method51(var4, arg3, (byte) -65);
            return class129.method897(var4, arg1, var5, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field661++;
        super.finalize();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lag;Lph;Z)Z")
    public final boolean method306(class8 arg0, class151 arg1, boolean arg2) {
        if (!arg2) {
            this.method309(null, 1.913781F, null, 50, (byte) 123);
        }
        field685++;
        return this.field687.method380(arg0, -103, arg1);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Z")
    public static final boolean method307(int arg0, int arg1) {
        field671++;
        if (arg0 != 0) {
            field678 = null;
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;I)V")
    public static final void method308(class21 arg0, int arg1) {
        field684++;
        long var2 = 0L;
        if (arg0.field420 == 0) {
            var2 = class111.method812(arg0.field437, arg0.field423, arg0.field434);
        }
        if (arg0.field420 == 1) {
            var2 = class55.method484(arg0.field437, arg0.field423, arg0.field434);
        }
        if (arg0.field420 == 2) {
            var2 = class88.method651(arg0.field437, arg0.field423, arg0.field434);
        }
        if (arg0.field420 == 3) {
            var2 = class56.method495(arg0.field437, arg0.field423, arg0.field434);
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        if ((long) arg1 != var2) {
            var6 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = (int) var2 >> 20 & 0x3;
            var4 = (int) var2 >> 14 & 0x1F;
        }
        arg0.field417 = var5;
        arg0.field428 = var4;
        arg0.field425 = var6;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lph;FLag;IB)[I")
    public final int[] method309(class151 arg0, float arg1, class8 arg2, int arg3, byte arg4) {
        field675++;
        if (this.field663 == null || this.field672 != arg1) {
            if (!this.field687.method380(arg2, -124, arg0)) {
                return null;
            }
            int var6 = arg3 < this.field689 ? arg3 : this.field689;
            this.field663 = this.field687.method379(arg2, var6, 1, (double) arg1, true, arg0, var6);
            this.field672 = arg1;
        }
        return arg4 == 58 ? this.field663 : null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
    public final void method310(byte arg0, int arg1) {
        field664++;
        if (arg0 > -67 || (this.field663 == null || this.field669 == 0 && this.field679 == 0)) {
            return;
        }
        if (class56.field1395 == null || this.field663.length > class56.field1395.length) {
            class56.field1395 = new int[this.field663.length];
        }
        int var3 = this.field663.length == 4096 ? 64 : 128;
        int var4 = this.field679 * arg1;
        int var5 = this.field663.length;
        int var6 = this.field669 * arg1 * var3;
        int var7 = var3 - 1;
        int var8 = var5 - 1;
        for (int var9 = 0; var9 < var5; var9 += var3) {
            int var11 = var6 + var9 & var8;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var12 + var4 & var7) + var11;
                class56.field1395[var13] = this.field663[var14];
            }
        }
        int[] var10 = this.field663;
        this.field663 = class56.field1395;
        class56.field1395 = var10;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lph;Lag;II)[I")
    public final int[] method311(class151 arg0, class8 arg1, int arg2, int arg3) {
        field662++;
        if (!this.field687.method380(arg1, arg2 ^ 0xFFFFFFAB, arg0)) {
            return null;
        }
        int var5 = arg3 < this.field689 ? arg3 : this.field689;
        if (arg2 != 0) {
            field667 = 98;
        }
        return this.field687.method379(arg1, var5, 1, 1.0D, false, arg0, var5);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void method312(int arg0) {
        field665 = null;
        field680 = null;
        field681 = null;
        field683 = null;
        if (arg0 == -2304) {
            field668 = null;
            field678 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLag;IILag;)Lae;")
    public static final class6 method313(boolean arg0, class8 arg1, int arg2, int arg3, class8 arg4) {
        if (arg0) {
            field678 = null;
        }
        field682++;
        return class19.method166(arg2, 61, arg1, arg3) ? class203.method1343(arg4.method39(arg3, -1, arg2), 8) : null;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lce;)V")
    public class32(class26 arg0) {
        this.field687 = new class39(arg0);
        int var2 = arg0.method221(-102);
        this.field674 = (var2 & 0x1) != 0;
        this.field688 = (var2 & 0x2) != 0;
        int var3 = var2 >> 3 & 0x3;
        int var4 = arg0.method221(-78);
        this.field689 = 0x1 << (var4 & 0x7) + 1;
        this.field677 = arg0.method256((byte) -78);
        this.field670 = arg0.method221(-109);
        if (this.field670 == 255) {
            this.field670 = 256;
        }
        this.field679 = arg0.method225((byte) -108);
        this.field669 = arg0.method225((byte) -107);
        arg0.method221(-107);
        arg0.method221(-87);
        arg0.method221(-77);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class32() {
        this.field687 = new class39();
        this.field689 = 1;
        this.field674 = true;
    }
}
