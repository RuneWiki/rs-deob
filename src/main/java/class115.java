import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class115 {

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    private int field1752 = 0;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "[J")
    private long[] field1753 = new long[8];

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "[J")
    private long[] field1749 = new long[8];

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "[J")
    private long[] field1758 = new long[8];

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    private int field1757 = 0;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "[B")
    private byte[] field1759 = new byte[32];

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "[J")
    private long[] field1760 = new long[8];

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "[J")
    private long[] field1761 = new long[8];

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "[B")
    private byte[] field1762 = new byte[64];

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "Ldg;")
    public static class376 field1756 = new class376(7, -1);

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1764 = new CRC32();

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "[[Lgf;")
    public static class248[][] field1765;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "([BIZ)V")
    public final void method896(byte[] arg0, int arg1, boolean arg2) {
        this.field1762[this.field1757] = (byte) class486.method2826(this.field1762[this.field1757], 0x80 >>> class689.method3797(this.field1752, 7));
        field1755++;
        this.field1757++;
        if (this.field1757 > 32) {
            while (true) {
                if (this.field1757 >= 64) {
                    this.method900(-26559);
                    this.field1757 = 0;
                    break;
                }
                this.field1762[this.field1757++] = 0;
            }
        }
        while (this.field1757 < 32) {
            this.field1762[this.field1757++] = 0;
        }
        class476.method2792(this.field1759, 0, this.field1762, 32, 32);
        this.method900(-26559);
        int var4 = 0;
        int var5 = arg1;
        if (arg2) {
            this.method900(-102);
        }
        while (var4 < 8) {
            long var6 = this.field1761[var4];
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

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public static void method897(int arg0) {
        field1765 = null;
        field1756 = null;
        field1764 = null;
        if (arg0 != 364) {
            method901(80, 86);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
    public final void method898(byte arg0) {
        field1754++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field1759[var2] = 0;
        }
        this.field1752 = this.field1757 = 0;
        this.field1762[0] = 0;
        if (arg0 >= -28) {
            this.field1757 = -111;
        }
        for (int var3 = 0; var3 < 8; var3++) {
            this.field1761[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(JZ[B)V")
    public final void method899(long arg0, boolean arg1, byte[] arg2) {
        field1751++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field1752 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        if (arg1) {
            this.field1761 = null;
        }
        while (var10 >= 0) {
            int var16 = (this.field1759[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field1759[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field1762[this.field1757] = (byte) class486.method2826(this.field1762[this.field1757], var15 >>> var7);
            this.field1757++;
            this.field1752 += 8 - var7;
            if (this.field1752 == 512) {
                this.method900(-26559);
                this.field1752 = this.field1757 = 0;
            }
            this.field1762[this.field1757] = (byte) class689.method3797(var15 << 8 - var7, 255);
            var5++;
            this.field1752 += var7;
            arg0 -= 8L;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field1762[this.field1757] = (byte) class486.method2826(this.field1762[this.field1757], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg0 < 8L) {
            this.field1752 = (int) ((long) this.field1752 + arg0);
            return;
        }
        long var13 = arg0 - (long) (8 - var7);
        this.field1757++;
        this.field1752 += 8 - var7;
        if (this.field1752 == 512) {
            this.method900(-26559);
            this.field1752 = this.field1757 = 0;
        }
        this.field1762[this.field1757] = (byte) class689.method3797(var12 << 8 - var7, 255);
        this.field1752 += (int) var13;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
    private final void method900(int arg0) {
        if (arg0 != -26559) {
            field1764 = null;
        }
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field1753[var2] = class43.method467(class43.method467(class43.method467(class43.method467(class43.method467(class43.method467(class120.method917((long) this.field1762[var3 + 2], 255L) << 40, class43.method467((long) this.field1762[var3] << 56, class120.method917(0xFFL << 48, (long) this.field1762[var3 + 1] << 48))), class120.method917((long) this.field1762[var3 + 3] << 32, 0xFFL << 32)), class120.method917((long) this.field1762[var3 + 4], 255L) << 24), class120.method917((long) this.field1762[var3 + 5], 255L) << 16), class120.method917((long) this.field1762[var3 + 6] << 8, 0xFFL << 8)), class120.method917((long) this.field1762[var3 + 7], 255L));
            var2++;
            var3 += 8;
        }
        field1763++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field1760[var4] = class43.method467(this.field1753[var4], this.field1758[var4] = this.field1761[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field1749[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field1749[var7] = class43.method467(this.field1749[var7], class230.field3596[var13][class689.method3797((int) (this.field1758[class689.method3797(7, var7 - var13)] >>> var14), 255)]);
                    var14 -= 8;
                    var13++;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1758[var8] = this.field1749[var8];
            }
            this.field1758[0] = class43.method467(this.field1758[0], class230.field3595[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field1749[var9] = this.field1758[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field1749[var9] = class43.method467(this.field1749[var9], class230.field3596[var11][class689.method3797(255, (int) (this.field1760[class689.method3797(7, var9 - var11)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field1760[var10] = this.field1749[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field1761[var6] = class43.method467(this.field1761[var6], class43.method467(this.field1760[var6], this.field1753[var6]));
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V")
    public static final void method901(int arg0, int arg1) {
        field1750++;
        class191 var2 = class6.method38(14, -118, arg1);
        if (arg0 <= -66) {
            var2.method1284((byte) -128);
        }
    }
}
