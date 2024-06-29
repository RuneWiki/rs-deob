import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class462 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    private int field6290 = 0;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "[J")
    private long[] field6289 = new long[8];

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "[J")
    private long[] field6292 = new long[8];

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "[J")
    private long[] field6298 = new long[8];

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "[J")
    private long[] field6288 = new long[8];

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    private int field6291 = 0;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "[B")
    private byte[] field6303 = new byte[64];

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "[B")
    private byte[] field6301 = new byte[32];

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "[J")
    private long[] field6299 = new long[8];

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "Lfca;")
    public static class188 field6293 = null;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "Lcb;")
    public static class318 field6302 = new class318(115, 3);

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public static int field6305 = 0;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "F")
    public static float field6304;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "Lpq;")
    public static class159 field6300;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    private final void method2612(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field6288[var2] = class107.method573(class442.method2545((long) this.field6303[var3 + 7], 255L), class107.method573(class107.method573(class442.method2545(0xFFL << 16, (long) this.field6303[var3 + 5] << 16), class107.method573(class107.method573(class442.method2545((long) this.field6303[var3 + 3] << 32, 0xFFL << 32), class107.method573(class442.method2545((long) this.field6303[var3 + 2], 255L) << 40, class107.method573(class442.method2545(0xFFL << 48, (long) this.field6303[var3 + 1] << 48), (long) this.field6303[var3] << 56))), class442.method2545((long) this.field6303[var3 + 4], 255L) << 24)), class442.method2545(0xFFL << 8, (long) this.field6303[var3 + 6] << 8)));
            var3 += 8;
            var2++;
        }
        field6294++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field6298[var4] = class107.method573(this.field6288[var4], this.field6289[var4] = this.field6292[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field6299[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field6299[var7] = class107.method573(this.field6299[var7], client.field3004[var13][class230.method1424(255, (int) (this.field6289[class230.method1424(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field6289[var8] = this.field6299[var8];
            }
            this.field6289[0] = class107.method573(this.field6289[0], client.field3003[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field6299[var9] = this.field6289[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field6299[var9] = class107.method573(this.field6299[var9], client.field3004[var11][class230.method1424(255, (int) (this.field6298[class230.method1424(var9 - var11, 7)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field6298[var10] = this.field6299[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field6292[var6] = class107.method573(this.field6292[var6], class107.method573(this.field6288[var6], this.field6298[var6]));
        }
        if (arg0 >= -106) {
            this.method2612((byte) 13);
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)V")
    public final void method2613(byte arg0) {
        if (arg0 != -9) {
            this.field6292 = null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            this.field6301[var2] = 0;
        }
        field6296++;
        this.field6303[0] = 0;
        this.field6290 = this.field6291 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field6292[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IJ[B)V")
    public final void method2614(int arg0, long arg1, byte[] arg2) {
        if (arg0 != 255) {
            this.method2613((byte) -69);
        }
        field6295++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field6290 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field6301[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field6301[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field6303[this.field6291] = (byte) class288.method1722(this.field6303[this.field6291], var15 >>> var7);
            this.field6290 += 8 - var7;
            this.field6291++;
            if (this.field6290 == 512) {
                this.method2612((byte) -114);
                this.field6290 = this.field6291 = 0;
            }
            this.field6303[this.field6291] = (byte) class230.method1424(255, var15 << 8 - var7);
            var5++;
            arg1 -= 8L;
            this.field6290 += var7;
        }
        int var12;
        if (arg1 > 0L) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field6303[this.field6291] = (byte) class288.method1722(this.field6303[this.field6291], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg1 < 8L) {
            this.field6290 = (int) ((long) this.field6290 + arg1);
            return;
        }
        this.field6291++;
        long var13 = arg1 - (long) (8 - var7);
        this.field6290 += 8 - var7;
        if (this.field6290 == 512) {
            this.method2612((byte) -114);
            this.field6290 = this.field6291 = 0;
        }
        this.field6303[this.field6291] = (byte) class230.method1424(var12 << 8 - var7, 255);
        this.field6290 += (int) var13;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V")
    public static void method2615(boolean arg0) {
        if (!arg0) {
            field6305 = -59;
        }
        field6293 = null;
        field6300 = null;
        field6302 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II[B)V")
    public final void method2616(int arg0, int arg1, byte[] arg2) {
        this.field6303[this.field6291] = (byte) class288.method1722(this.field6303[this.field6291], 0x80 >>> class230.method1424(this.field6290, 7));
        field6297++;
        this.field6291++;
        if (this.field6291 > 32) {
            while (true) {
                if (this.field6291 >= 64) {
                    this.method2612((byte) -128);
                    this.field6291 = 0;
                    break;
                }
                this.field6303[this.field6291++] = 0;
            }
        }
        while (this.field6291 < 32) {
            this.field6303[this.field6291++] = 0;
        }
        class657.method3639(this.field6301, 0, this.field6303, 32, 32);
        if (arg0 != 4) {
            method2615(false);
        }
        this.method2612((byte) -110);
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field6292[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/awt/Component;Z)Len;")
    public static final class5 method2617(Component arg0, boolean arg1) {
        if (arg1) {
            field6287++;
            return new class67(arg0);
        } else {
            return null;
        }
    }
}
