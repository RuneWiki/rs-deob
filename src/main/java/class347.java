import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class347 extends class335 {

    @OriginalMember(owner = "client!n", name = "G", descriptor = "[I")
    private int[] field5367 = new int[this.field5224];

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Ljava/lang/String;")
    public static String field5357 = "M";

    @OriginalMember(owner = "client!n", name = "I", descriptor = "Ljava/lang/String;")
    public static String field5369 = "Ok";

    @OriginalMember(owner = "client!n", name = "H", descriptor = "[S")
    public static short[] field5368 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    private int field5370;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    private int field5371;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[B")
    private byte[] field5358;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "[I")
    public static int[] field5364;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field5365;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 14)
    public final void method932(byte arg0) {
        if (arg0 > -93) {
            method2437(79, -92, 60);
        }
        field5362++;
        this.field5370 = Math.abs(this.field5370);
        if (this.field5370 >= 4096) {
            this.field5370 = 4095;
        }
        this.method855(this.field5371++, (byte) (this.field5370 >> 4));
        this.field5370 = 0;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V", line = 31)
    public static final void method2436(int arg0, int arg1) {
        class167 var2 = class302.field4502[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class167 var4 = class302.field4502[var3][arg0][arg1] = class302.field4502[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2398--;
                for (int var5 = 0; var5 < var4.field2407; var5++) {
                    class180 var6 = var4.field2406[var5];
                    if ((var6.field2585 >> 29 & 0x3L) == 2L && var6.field2590 == arg0 && var6.field2580 == arg1) {
                        var6.field2579--;
                    }
                }
            }
        }
        if (class302.field4502[0][arg0][arg1] == null) {
            class302.field4502[0][arg0][arg1] = new class167(0, arg0, arg1);
        }
        class302.field4502[0][arg0][arg1].field2416 = var2;
        class302.field4502[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIIF)V", line = 69)
    public class347(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field5224; var7++) {
            this.field5367[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Ltn;", line = 91)
    public static final class85 method2437(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class85 var4 = var3.field2390;
            var3.field2390 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILsb;)Lli;", line = 102)
    public static final class93 method2438(int arg0, class190 arg1) {
        field5355++;
        if (arg0 != 0) {
            method2438(-95, (class190) null);
        }
        return new class93(arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1312(arg0 ^ 0x51), arg1.method1319(255));
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)I", line = 114)
    public static final int method2439(int arg0, int arg1) {
        if (arg1 != 1) {
            field5361 = -59;
        }
        field5359++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V", line = 129)
    public final void method937(byte arg0) {
        this.field5371 = 0;
        this.field5370 = 0;
        field5356++;
        int var2 = 69 % ((arg0 - 60) / 57);
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(B)V", line = 141)
    public static void method2440(byte arg0) {
        field5368 = null;
        field5365 = null;
        field5369 = null;
        field5357 = null;
        if (arg0 != 48) {
            method2437(55, -79, -117);
        }
        field5364 = null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IB)V", line = 166)
    public void method855(int arg0, byte arg1) {
        field5360++;
        this.field5358[this.field5371++] = (byte) ((class287.method2076(255, arg1) >> 1) + 127);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V", line = 174)
    public final void method931(int arg0, byte arg1, int arg2) {
        field5363++;
        this.field5370 += this.field5367[arg2] * arg0 >> 12;
        if (arg1 < 44) {
            method2436(72, 64);
        }
    }
}
