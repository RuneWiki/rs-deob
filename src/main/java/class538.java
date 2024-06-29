import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class538 {

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "[J")
    private long[] field6779 = new long[8];

    @OriginalMember(owner = "client!gja", name = "h", descriptor = "I")
    private int field6784 = 0;

    @OriginalMember(owner = "client!gja", name = "e", descriptor = "[J")
    private long[] field6781 = new long[8];

    @OriginalMember(owner = "client!gja", name = "g", descriptor = "[J")
    private long[] field6783 = new long[8];

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "[B")
    private byte[] field6778 = new byte[64];

    @OriginalMember(owner = "client!gja", name = "o", descriptor = "[J")
    private long[] field6791 = new long[8];

    @OriginalMember(owner = "client!gja", name = "j", descriptor = "I")
    private int field6786 = 0;

    @OriginalMember(owner = "client!gja", name = "m", descriptor = "[J")
    private long[] field6789 = new long[8];

    @OriginalMember(owner = "client!gja", name = "q", descriptor = "[B")
    private byte[] field6793 = new byte[32];

    @OriginalMember(owner = "client!gja", name = "f", descriptor = "Z")
    public static boolean field6782 = false;

    @OriginalMember(owner = "client!gja", name = "p", descriptor = "[I")
    public static int[] field6792 = new int[32];

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "Leg;")
    public static class336 field6777 = new class336(16);

    @OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!gja", name = "i", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!gja", name = "k", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!gja", name = "l", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!gja", name = "n", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!gja", name = "r", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(B)V")
    public final void method2934(byte arg0) {
        field6788++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field6793[var2] = 0;
        }
        this.field6778[0] = 0;
        this.field6786 = this.field6784 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field6781[var3] = 0L;
        }
        if (arg0 >= -37) {
            this.field6786 = 3;
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
    private final void method2935(int arg0) {
        field6794++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field6789[var2] = class281.method1724(class235.method1567((long) this.field6778[var3 + 7], 255L), class281.method1724(class235.method1567((long) this.field6778[var3 + 6] << 8, 0xFFL << 8), class281.method1724(class235.method1567((long) this.field6778[var3 + 5], 255L) << 16, class281.method1724(class235.method1567((long) this.field6778[var3 + 4] << 24, 0xFFL << 24), class281.method1724(class281.method1724(class235.method1567((long) this.field6778[var3 + 2], 255L) << 40, class281.method1724(class235.method1567((long) this.field6778[var3 + 1] << 48, 0xFFL << 48), (long) this.field6778[var3] << 56)), class235.method1567(0xFFL << 32, (long) this.field6778[var3 + 3] << 32))))));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field6783[var4] = class281.method1724(this.field6789[var4], this.field6779[var4] = this.field6781[var4]);
        }
        if (arg0 != 7) {
            method2940(-110);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field6791[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field6791[var7] = class281.method1724(this.field6791[var7], class490.field6300[var13][class249.method1625(255, (int) (this.field6779[class249.method1625(var7 - var13, 7)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field6779[var8] = this.field6791[var8];
            }
            this.field6779[0] = class281.method1724(this.field6779[0], class490.field6299[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field6791[var9] = this.field6779[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field6791[var9] = class281.method1724(this.field6791[var9], class490.field6300[var11][class249.method1625(255, (int) (this.field6783[class249.method1625(var9 - var11, 7)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field6783[var10] = this.field6791[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field6781[var6] = class281.method1724(this.field6781[var6], class281.method1724(this.field6789[var6], this.field6783[var6]));
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2936(int arg0, String arg1) {
        if (arg0 != -6303) {
            method2940(23);
        }
        field6790++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (1 - (65 - var6));
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(J[BB)V")
    public final void method2937(long arg0, byte[] arg1, byte arg2) {
        field6787++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        if (arg2 != -112) {
            method2939(-88);
        }
        int var7 = this.field6786 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field6793[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field6793[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field6778[this.field6784] = (byte) class77.method473(this.field6778[this.field6784], var15 >>> var7);
            this.field6784++;
            this.field6786 += 8 - var7;
            if (this.field6786 == 512) {
                this.method2935(7);
                this.field6786 = this.field6784 = 0;
            }
            this.field6778[this.field6784] = (byte) class249.method1625(var15 << 8 - var7, 255);
            this.field6786 += var7;
            arg0 -= 8L;
            var5++;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field6778[this.field6784] = (byte) class77.method473(this.field6778[this.field6784], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg0 < 8L) {
            this.field6786 = (int) ((long) this.field6786 + arg0);
            return;
        }
        this.field6784++;
        long var13 = arg0 - (long) (8 - var7);
        this.field6786 += 8 - var7;
        if (this.field6786 == 512) {
            this.method2935(7);
            this.field6786 = this.field6784 = 0;
        }
        this.field6778[this.field6784] = (byte) class249.method1625(var12 << 8 - var7, 255);
        this.field6786 += (int) var13;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I[BZ)V")
    public final void method2938(int arg0, byte[] arg1, boolean arg2) {
        field6780++;
        this.field6778[this.field6784] = (byte) class77.method473(this.field6778[this.field6784], 0x80 >>> class249.method1625(7, this.field6786));
        this.field6784++;
        if (this.field6784 > 32) {
            while (true) {
                if (this.field6784 >= 64) {
                    this.method2935(7);
                    this.field6784 = 0;
                    break;
                }
                this.field6778[this.field6784++] = 0;
            }
        }
        while (this.field6784 < 32) {
            this.field6778[this.field6784++] = 0;
        }
        class642.method3480(this.field6793, 0, this.field6778, 32, 32);
        this.method2935(7);
        if (!arg2) {
            return;
        }
        int var4 = 0;
        int var5 = arg0;
        while (var4 < 8) {
            long var6 = this.field6781[var4];
            arg1[var5] = (byte) ((int) (var6 >>> 56));
            arg1[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg1[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg1[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg1[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg1[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg1[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg1[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)Z")
    public static final boolean method2939(int arg0) {
        if (arg0 >= -10) {
            return false;
        } else {
            field6785++;
            return class496.field6339;
        }
    }

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "(I)V")
    public static void method2940(int arg0) {
        field6777 = null;
        field6792 = null;
        if (arg0 != 519) {
            field6792 = null;
        }
    }
}
