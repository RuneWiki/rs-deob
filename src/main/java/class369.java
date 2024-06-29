import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class369 {

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "[J")
    private long[] field4755 = new long[8];

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "[J")
    private long[] field4756 = new long[8];

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    private int field4753 = 0;

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "[J")
    private long[] field4758 = new long[8];

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "[J")
    private long[] field4760 = new long[8];

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "[B")
    private byte[] field4762 = new byte[64];

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    private int field4764 = 0;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "[B")
    private byte[] field4765 = new byte[32];

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "[J")
    private long[] field4766 = new long[8];

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "Lme;")
    public static class668 field4757 = new class668(32);

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)Z")
    public static final boolean method2121(boolean arg0) {
        for (int var1 = class62.field848; var1 < class20.field223; var1++) {
            class530[][] var2 = class483.field6438[var1];
            for (int var3 = -class703.field9809; var3 <= 0; var3++) {
                int var4 = class658.field9175 + var3;
                int var5 = class658.field9175 - var3;
                if (var4 >= class603.field8119 || var5 < class337.field4360) {
                    for (int var6 = -class703.field9809; var6 <= 0; var6++) {
                        int var7 = class659.field9178 + var6;
                        int var8 = class659.field9178 - var6;
                        if (var4 >= class603.field8119) {
                            if (var7 >= class244.field3272) {
                                class530 var9 = var2[var4][var7];
                                if (var9 != null && var9.field6894) {
                                    class314.field4071 = arg0;
                                    class89.field1174.method883(var9, true);
                                    class89.field1174.method877((byte) -40);
                                }
                            }
                            if (var8 < class120.field1551) {
                                class530 var10 = var2[var4][var8];
                                if (var10 != null && var10.field6894) {
                                    class314.field4071 = arg0;
                                    class89.field1174.method883(var10, true);
                                    class89.field1174.method877((byte) -41);
                                }
                            }
                        }
                        if (var5 < class337.field4360) {
                            if (var7 >= class244.field3272) {
                                class530 var11 = var2[var5][var7];
                                if (var11 != null && var11.field6894) {
                                    class314.field4071 = arg0;
                                    class89.field1174.method883(var11, true);
                                    class89.field1174.method877((byte) -76);
                                }
                            }
                            if (var8 < class120.field1551) {
                                class530 var12 = var2[var5][var8];
                                if (var12 != null && var12.field6894) {
                                    class314.field4071 = arg0;
                                    class89.field1174.method883(var12, true);
                                    class89.field1174.method877((byte) 114);
                                }
                            }
                        }
                        if (class352.field4518 == 0) {
                            if (class52.field715) {
                                class89.field1174.method875(24, 0);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public static void method2122(int arg0) {
        if (arg0 != 5) {
            method2121(true);
        }
        field4757 = null;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
    private final void method2123(int arg0) {
        field4761++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field4760[var2] = class370.method2131(class535.method2850(255L, (long) this.field4762[var3 + 7]), class370.method2131(class535.method2850(255L, (long) this.field4762[var3 + 6]) << 8, class370.method2131(class370.method2131(class370.method2131(class370.method2131(class370.method2131(class535.method2850((long) this.field4762[var3 + 1], 255L) << 48, (long) this.field4762[var3] << 56), class535.method2850(0xFFL << 40, (long) this.field4762[var3 + 2] << 40)), class535.method2850(0xFFL << 32, (long) this.field4762[var3 + 3] << 32)), class535.method2850(255L, (long) this.field4762[var3 + 4]) << 24), class535.method2850(255L, (long) this.field4762[var3 + 5]) << 16)));
            var2++;
            var3 += 8;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field4756[var4] = class370.method2131(this.field4760[var4], this.field4755[var4] = this.field4766[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field4758[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field4758[var7] = class370.method2131(this.field4758[var7], class484.field6451[var13][class597.method3238((int) (this.field4755[class597.method3238(var7 - var13, 7)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field4755[var8] = this.field4758[var8];
            }
            this.field4755[0] = class370.method2131(this.field4755[0], class484.field6446[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field4758[var9] = this.field4755[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field4758[var9] = class370.method2131(this.field4758[var9], class484.field6451[var11][class597.method3238(255, (int) (this.field4756[class597.method3238(7, var9 - var11)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field4756[var10] = this.field4758[var10];
            }
        }
        int var6 = 0;
        if (arg0 < 77) {
            this.field4758 = null;
        }
        while (var6 < 8) {
            this.field4766[var6] = class370.method2131(this.field4766[var6], class370.method2131(this.field4756[var6], this.field4760[var6]));
            var6++;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(J[BB)V")
    public final void method2124(long arg0, byte[] arg1, byte arg2) {
        field4754++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field4753 & 0x7;
        long var8 = arg0;
        if (arg2 != 42) {
            this.field4764 = -92;
        }
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field4765[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field4765[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field4762[this.field4764] = (byte) class131.method954(this.field4762[this.field4764], var15 >>> var7);
            this.field4753 += 8 - var7;
            this.field4764++;
            if (this.field4753 == 512) {
                this.method2123(94);
                this.field4753 = this.field4764 = 0;
            }
            this.field4762[this.field4764] = (byte) class597.method3238(255, var15 << 8 - var7);
            this.field4753 += var7;
            arg0 -= 8L;
            var5++;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field4762[this.field4764] = (byte) class131.method954(this.field4762[this.field4764], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if (((long) var7 + arg0) < 8L) {
            this.field4753 = (int) ((long) this.field4753 + arg0);
            return;
        }
        this.field4764++;
        long var13 = arg0 - (long) (8 - var7);
        this.field4753 += 8 - var7;
        if (this.field4753 == 512) {
            this.method2123(101);
            this.field4753 = this.field4764 = 0;
        }
        this.field4762[this.field4764] = (byte) class597.method3238(255, var12 << 8 - var7);
        this.field4753 += (int) var13;
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
    public final void method2125(int arg0) {
        field4759++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field4765[var2] = 0;
        }
        this.field4753 = this.field4764 = 0;
        this.field4762[0] = 0;
        if (arg0 != 8) {
            this.method2123(-13);
        }
        for (int var3 = 0; var3 < 8; var3++) {
            this.field4766[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB[B)V")
    public final void method2126(int arg0, byte arg1, byte[] arg2) {
        this.field4762[this.field4764] = (byte) class131.method954(this.field4762[this.field4764], 0x80 >>> class597.method3238(7, this.field4753));
        field4763++;
        this.field4764++;
        if (this.field4764 > 32) {
            while (true) {
                if (this.field4764 >= 64) {
                    this.method2123(120);
                    this.field4764 = 0;
                    break;
                }
                this.field4762[this.field4764++] = 0;
            }
        }
        while (this.field4764 < 32) {
            this.field4762[this.field4764++] = 0;
        }
        class443.method2514(this.field4765, 0, this.field4762, 32, 32);
        this.method2123(84);
        if (arg1 <= 5) {
            method2121(true);
        }
        int var4 = 0;
        int var5 = arg0;
        while (var4 < 8) {
            long var6 = this.field4766[var4];
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
}
