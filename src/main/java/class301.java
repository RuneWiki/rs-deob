import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class301 {

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "[J")
    private long[] field4694 = new long[8];

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "[J")
    private long[] field4700 = new long[8];

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "[J")
    private long[] field4699 = new long[8];

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    private int field4693 = 0;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "[B")
    private byte[] field4703 = new byte[64];

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "[B")
    private byte[] field4702 = new byte[32];

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "[J")
    private long[] field4707 = new long[8];

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    private int field4704 = 0;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "[J")
    private long[] field4709 = new long[8];

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field4696 = 0;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Lrl;")
    public static class672 field4701 = new class672(9, -1);

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4708 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "Lln;")
    public static class347 field4710;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([BIB)V", line = 6)
    public final void method2077(byte[] arg0, int arg1, byte arg2) {
        this.field4703[this.field4704] = (byte) class81.method769(this.field4703[this.field4704], 0x80 >>> class453.method2846(7, this.field4693));
        field4705++;
        this.field4704++;
        if (this.field4704 > 32) {
            while (true) {
                if (this.field4704 >= 64) {
                    this.method2082(-126);
                    this.field4704 = 0;
                    break;
                }
                this.field4703[this.field4704++] = 0;
            }
        }
        while (this.field4704 < 32) {
            this.field4703[this.field4704++] = 0;
        }
        if (arg2 < 55) {
            field4701 = null;
        }
        class398.method2566(this.field4702, 0, this.field4703, 32, 32);
        this.method2082(-102);
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field4694[var4];
            arg0[var5] = (byte) ((int) (var6 >>> 56));
            arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg0[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(JZ[B)V", line = 58)
    public final void method2078(long arg0, boolean arg1, byte[] arg2) {
        field4698++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field4693 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        if (arg1) {
            method2080(9, null);
        }
        while (var10 >= 0) {
            int var16 = (this.field4702[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field4702[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field4703[this.field4704] = (byte) class81.method769(this.field4703[this.field4704], var15 >>> var7);
            this.field4693 += 8 - var7;
            this.field4704++;
            if (this.field4693 == 512) {
                this.method2082(-91);
                this.field4693 = this.field4704 = 0;
            }
            this.field4703[this.field4704] = (byte) class453.method2846(255, var15 << 8 - var7);
            this.field4693 += var7;
            var5++;
            arg0 -= 8L;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field4703[this.field4704] = (byte) class81.method769(this.field4703[this.field4704], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg0 < 8L) {
            this.field4693 = (int) ((long) this.field4693 + arg0);
            return;
        }
        this.field4704++;
        long var13 = arg0 - (long) (8 - var7);
        this.field4693 += 8 - var7;
        if (this.field4693 == 512) {
            this.method2082(-110);
            this.field4693 = this.field4704 = 0;
        }
        this.field4703[this.field4704] = (byte) class453.method2846(var12 << 8 - var7, 255);
        this.field4693 += (int) var13;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 150)
    public static void method2079(int arg0) {
        field4710 = null;
        field4701 = null;
        if (arg0 < 77) {
            method2079(63);
        }
        field4708 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILsp;)V", line = 164)
    public static final void method2080(int arg0, class589 arg1) {
        field4695++;
        for (class119 var2 = (class119) class235.field3738.method3465((byte) 111); var2 != null; var2 = (class119) class235.field3738.method3469(0)) {
            if (var2.field1918 == arg1) {
                if (var2.field1911 != null) {
                    class505.field7381.method1985(var2.field1911);
                    var2.field1911 = null;
                }
                var2.method707((byte) -33);
                return;
            }
        }
        if (arg0 > -108) {
            field4696 = 115;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V", line = 206)
    public final void method2081(byte arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field4702[var2] = 0;
        }
        if (arg0 != 3) {
            this.method2077(null, -97, (byte) -24);
        }
        field4697++;
        this.field4693 = this.field4704 = 0;
        this.field4703[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field4694[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 255)
    private final void method2082(int arg0) {
        field4706++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field4707[var2] = class396.method2559(class340.method2328(255L, (long) this.field4703[var3 + 7]), class396.method2559(class396.method2559(class396.method2559(class396.method2559(class396.method2559(class340.method2328(255L, (long) this.field4703[var3 + 2]) << 40, class396.method2559((long) this.field4703[var3] << 56, class340.method2328((long) this.field4703[var3 + 1] << 48, 0xFFL << 48))), class340.method2328(255L, (long) this.field4703[var3 + 3]) << 32), class340.method2328((long) this.field4703[var3 + 4], 255L) << 24), class340.method2328((long) this.field4703[var3 + 5], 255L) << 16), class340.method2328(255L, (long) this.field4703[var3 + 6]) << 8));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field4699[var4] = class396.method2559(this.field4707[var4], this.field4700[var4] = this.field4694[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field4709[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field4709[var7] = class396.method2559(this.field4709[var7], class667.field9439[var13][class453.method2846((int) (this.field4700[class453.method2846(var7 - var13, 7)] >>> var14), 255)]);
                    var14 -= 8;
                    var13++;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field4700[var8] = this.field4709[var8];
            }
            this.field4700[0] = class396.method2559(this.field4700[0], class667.field9437[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field4709[var9] = this.field4700[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field4709[var9] = class396.method2559(this.field4709[var9], class667.field9439[var11][class453.method2846((int) (this.field4699[class453.method2846(7, var9 - var11)] >>> var12), 255)]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field4699[var10] = this.field4709[var10];
            }
        }
        if (arg0 > -89) {
            this.method2078(98L, true, null);
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field4694[var6] = class396.method2559(this.field4694[var6], class396.method2559(this.field4699[var6], this.field4707[var6]));
        }
    }
}
