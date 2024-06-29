import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class636 {

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "[J")
    private long[] field8771 = new long[8];

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "[B")
    private byte[] field8765 = new byte[32];

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    private int field8770 = 0;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "[J")
    private long[] field8773 = new long[8];

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "[B")
    private byte[] field8777 = new byte[64];

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "[J")
    private long[] field8780 = new long[8];

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "[J")
    private long[] field8778 = new long[8];

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[J")
    private long[] field8764 = new long[8];

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    private int field8779 = 0;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field8768 = new String[100];

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Lnd;")
    public static class547 field8776;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public final void method3563(int arg0) {
        field8781++;
        if (arg0 <= 2) {
            return;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            this.field8765[var2] = 0;
        }
        this.field8777[0] = 0;
        this.field8779 = this.field8770 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field8773[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
    public static final void method3564(int arg0, int arg1) {
        class534 var2 = class28.field500;
        synchronized (class28.field500) {
            class28.field500.method3070(arg1, 124);
        }
        field8766++;
        if (arg0 != 8) {
            method3564(-33, -110);
        }
        class534 var3 = class344.field4348;
        synchronized (class344.field4348) {
            class344.field4348.method3070(arg1, 124);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI[B)V")
    public final void method3565(boolean arg0, int arg1, byte[] arg2) {
        field8763++;
        this.field8777[this.field8770] = (byte) class683.method3840(this.field8777[this.field8770], 0x80 >>> class702.method3949(this.field8779, 7));
        this.field8770++;
        if (this.field8770 > 32) {
            while (true) {
                if (this.field8770 >= 64) {
                    this.method3568(true);
                    this.field8770 = 0;
                    break;
                }
                this.field8777[this.field8770++] = 0;
            }
        }
        while (this.field8770 < 32) {
            this.field8777[this.field8770++] = 0;
        }
        class135.method999(this.field8765, 0, this.field8777, 32, 32);
        this.method3568(arg0);
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field8773[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZII)V")
    public static final void method3566(int arg0, boolean arg1, int arg2, int arg3) {
        field8782++;
        if (arg0 > -72) {
            field8768 = null;
        }
        if (class297.field3910.method1160((long) arg3, 121) != null) {
            return;
        }
        if (class525.field7340) {
            class375 var4 = new class375(arg3, new class89(4096, field8776, arg3), arg2, arg1);
            var4.field4807.method2928(-112, class575.field8087[class243.field3143]);
            class297.field3910.method1153(var4, (long) arg3, -1);
        } else {
            class618.method3452((byte) 126, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method3567(byte arg0) {
        if (arg0 != 45) {
            method3566(-106, true, 55, -78);
        }
        field8768 = null;
        field8776 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    private final void method3568(boolean arg0) {
        field8774++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field8771[var2] = class525.method3040(class521.method3026((long) this.field8777[var3 + 7], 255L), class525.method3040(class525.method3040(class525.method3040(class525.method3040(class525.method3040(class521.method3026((long) this.field8777[var3 + 2], 255L) << 40, class525.method3040((long) this.field8777[var3] << 56, class521.method3026((long) this.field8777[var3 + 1], 255L) << 48)), class521.method3026((long) this.field8777[var3 + 3] << 32, 0xFFL << 32)), class521.method3026((long) this.field8777[var3 + 4], 255L) << 24), class521.method3026(0xFFL << 16, (long) this.field8777[var3 + 5] << 16)), class521.method3026(255L, (long) this.field8777[var3 + 6]) << 8));
            var3 += 8;
            var2++;
        }
        if (!arg0) {
            return;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field8780[var4] = class525.method3040(this.field8771[var4], this.field8764[var4] = this.field8773[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field8778[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field8778[var7] = class525.method3040(this.field8778[var7], class216.field2915[var13][class702.method3949(255, (int) (this.field8764[class702.method3949(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field8764[var8] = this.field8778[var8];
            }
            this.field8764[0] = class525.method3040(this.field8764[0], class216.field2894[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field8778[var9] = this.field8764[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field8778[var9] = class525.method3040(this.field8778[var9], class216.field2915[var11][class702.method3949((int) (this.field8780[class702.method3949(var9 - var11, 7)] >>> var12), 255)]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field8780[var10] = this.field8778[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field8773[var6] = class525.method3040(this.field8773[var6], class525.method3040(this.field8780[var6], this.field8771[var6]));
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII[I)V")
    public static final void method3569(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field8775++;
        arg2--;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        if (arg3 != 347845800) {
            return;
        }
        while (var5 > arg2) {
            int var7 = arg2 + 1;
            arg4[var7] = arg1;
            int var8 = var7 + 1;
            arg4[var8] = arg1;
            int var9 = var8 + 1;
            arg4[var9] = arg1;
            int var10 = var9 + 1;
            arg4[var10] = arg1;
            int var11 = var10 + 1;
            arg4[var11] = arg1;
            int var12 = var11 + 1;
            arg4[var12] = arg1;
            int var13 = var12 + 1;
            arg4[var13] = arg1;
            arg2 = var13 + 1;
            arg4[arg2] = arg1;
        }
        while (var6 > arg2) {
            arg2++;
            arg4[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(J[BI)V")
    public final void method3570(long arg0, byte[] arg1, int arg2) {
        field8772++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field8779 & 0x7;
        long var8 = arg0;
        if (arg2 != -29059) {
            method3571(-119, -30, -3);
        }
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field8765[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field8765[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field8777[this.field8770] = (byte) class683.method3840(this.field8777[this.field8770], var15 >>> var7);
            this.field8779 += 8 - var7;
            this.field8770++;
            if (this.field8779 == 512) {
                this.method3568(true);
                this.field8779 = this.field8770 = 0;
            }
            this.field8777[this.field8770] = (byte) class702.method3949(255, var15 << 8 - var7);
            arg0 -= 8L;
            var5++;
            this.field8779 += var7;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field8777[this.field8770] = (byte) class683.method3840(this.field8777[this.field8770], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if (((long) var7 + arg0) < 8L) {
            this.field8779 = (int) ((long) this.field8779 + arg0);
            return;
        }
        this.field8770++;
        long var13 = arg0 - (long) (8 - var7);
        this.field8779 += 8 - var7;
        if (this.field8779 == 512) {
            this.method3568(true);
            this.field8779 = this.field8770 = 0;
        }
        this.field8777[this.field8770] = (byte) class702.method3949(255, var12 << 8 - var7);
        this.field8779 += (int) var13;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lbh;")
    public static final class37 method3571(int arg0, int arg1, int arg2) {
        field8767++;
        if (arg2 > -30) {
            field8768 = null;
        }
        class37 var3 = (class37) class174.field2414.method1160((long) arg0 << 32 | (long) arg1, 119);
        if (var3 == null) {
            var3 = new class37(arg0, arg1);
            class174.field2414.method1153(var3, var3.field2333, -1);
        }
        return var3;
    }
}
