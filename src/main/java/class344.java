import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class344 {

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "Z")
    public boolean field4639 = false;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    private int field4646 = 0;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public int field4648 = -1;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Z")
    public boolean field4650 = false;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    private int field4656 = 128;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    private int field4653 = 0;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
    private int field4659 = 128;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    private int field4661 = 0;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "[I")
    public static int[] field4643 = new int[13];

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field4647 = 2;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "[I")
    public static int[] field4658 = new int[2];

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "[[B")
    public static byte[][] field4660 = new byte[1000][];

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    private int field4649;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "Lij;")
    public static class316 field4652;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "Lij;")
    public static class316 field4655;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "Lij;")
    public static class316 field4657;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "[Lwn;")
    public static class77[] field4644;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "[S")
    private short[] field4637;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "[S")
    private short[] field4642;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "[S")
    private short[] field4645;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "[S")
    private short[] field4654;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIBLea;II)Lts;")
    public final class116 method2088(int arg0, int arg1, byte arg2, class58 arg3, int arg4, int arg5) {
        field4651++;
        int var7 = arg4;
        class83 var8 = this.field4648 == -1 || arg0 == -1 ? null : class408.method2521((byte) 50, this.field4648);
        if (var8 != null) {
            var7 = arg4 | var8.method668(arg0, arg2 ^ 0x37, false, arg1);
        }
        if (this.field4659 != 128) {
            var7 |= 0x2;
        }
        if (arg2 != 55) {
            method2090((byte) 31, -75);
        }
        if (this.field4656 != 128 || this.field4646 != 0) {
            var7 |= 0x5;
        }
        class408 var9 = class422.field5838;
        class116 var10;
        synchronized (class422.field5838) {
            var10 = (class116) class422.field5838.method2529(0, (long) (this.field4640 |= arg3.field744 << 29));
        }
        if (var10 == null || arg3.method187(var10.method866(), var7) != 0) {
            if (var10 != null) {
                var7 = arg3.method213(var7, var10.method866());
            }
            int var11 = var7;
            if (this.field4645 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field4642 != null) {
                var11 |= 0x4000;
            }
            class98 var12 = class267.method1702((byte) -116, this.field4649, 0, class249.field3497);
            if (var12 == null) {
                return null;
            }
            var10 = arg3.method254(var12, var11, class57.field743, this.field4661 + 64, this.field4653 - -850);
            if (this.field4645 != null) {
                for (int var13 = 0; var13 < this.field4645.length; var13++) {
                    var10.method909(this.field4645[var13], this.field4637[var13]);
                }
            }
            if (this.field4642 != null) {
                for (int var14 = 0; var14 < this.field4642.length; var14++) {
                    var10.method877(this.field4642[var14], this.field4654[var14]);
                }
            }
            var10.method897(var7);
            class408 var15 = class422.field5838;
            synchronized (class422.field5838) {
                class422.field5838.method2527(arg2 ^ 0xFFFFFFBF, (long) (this.field4640 |= arg3.field744 << 29), var10);
            }
        }
        class116 var16 = var8 == null ? var10.method907((byte) 2, var7, true) : var8.method669((byte) -119, var7, arg0, 0, arg1, arg5, (byte) 2, var10);
        if (this.field4656 != 128 || this.field4659 != 128) {
            var16.method890(this.field4656, this.field4659, this.field4656);
        }
        if (this.field4646 != 0) {
            if (this.field4646 == 90) {
                var16.method867(4096);
            }
            if (this.field4646 == 180) {
                var16.method867(8192);
            }
            if (this.field4646 == 270) {
                var16.method867(12288);
            }
        }
        var16.method897(arg4);
        return var16;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lrg;I)V")
    public final void method2089(class366 arg0, int arg1) {
        field4638++;
        if (arg1 > -111) {
            return;
        }
        while (true) {
            int var3 = arg0.method2306((byte) 27);
            if (var3 == 0) {
                return;
            }
            this.method2091(arg0, true, var3);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)I")
    public static final int method2090(byte arg0, int arg1) {
        if (arg0 > -102) {
            return 5;
        } else {
            field4641++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lrg;ZI)V")
    private final void method2091(class366 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field4650 = false;
        }
        field4636++;
        if (arg2 == 1) {
            this.field4649 = arg0.method2297(13352);
        } else if (arg2 == 2) {
            this.field4648 = arg0.method2297(13352);
        } else if (arg2 == 4) {
            this.field4656 = arg0.method2297(13352);
        } else if (arg2 == 5) {
            this.field4659 = arg0.method2297(13352);
        } else if (arg2 == 6) {
            this.field4646 = arg0.method2297(13352);
        } else if (arg2 == 7) {
            this.field4661 = arg0.method2306((byte) 70);
        } else if (arg2 == 8) {
            this.field4653 = arg0.method2306((byte) 86);
        } else if (arg2 == 9) {
            this.field4639 = true;
        } else if (arg2 == 10) {
            this.field4650 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method2306((byte) 24);
            this.field4645 = new short[var6];
            this.field4637 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4645[var7] = (short) arg0.method2297(13352);
                this.field4637[var7] = (short) arg0.method2297(13352);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method2306((byte) 45);
            this.field4654 = new short[var4];
            this.field4642 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4642[var5] = (short) arg0.method2297(13352);
                this.field4654[var5] = (short) arg0.method2297(13352);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
    public static void method2092(byte arg0) {
        field4644 = null;
        field4657 = null;
        field4655 = null;
        field4658 = null;
        field4652 = null;
        if (arg0 >= -99) {
            field4657 = null;
        }
        field4660 = null;
        field4643 = null;
    }
}
