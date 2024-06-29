import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class248 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    private int field3304 = 0;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    private int field3309 = 128;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    private int field3307 = 0;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Z")
    public boolean field3305 = false;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field3310 = -1;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    private int field3319 = 128;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    private int field3313 = 0;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Z")
    public boolean field3316 = false;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    private int field3315;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lsg;")
    public class250 field3302;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lci;")
    public static class287 field3300;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[S")
    private short[] field3301;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[S")
    private short[] field3306;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[S")
    private short[] field3311;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "[S")
    private short[] field3317;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[Z")
    public static boolean[] field3308;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 12)
    public static void method1388(int arg0) {
        int var1 = 44 / ((arg0 - 50) / 62);
        field3308 = null;
        field3300 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLbt;)V", line = 28)
    public final void method1389(byte arg0, class32 arg1) {
        field3303++;
        int var3 = 116 % ((-arg0 - 11) / 45);
        while (true) {
            int var4 = arg1.method201((byte) -127);
            if (var4 == 0) {
                return;
            }
            this.method1390(126, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILbt;I)V", line = 57)
    private final void method1390(int arg0, class32 arg1, int arg2) {
        if (arg0 < 122) {
            this.method1390(99, (class32) null, -86);
        }
        if (arg2 == 1) {
            this.field3315 = arg1.method215((byte) 93);
        } else if (arg2 == 2) {
            this.field3310 = arg1.method215((byte) 92);
        } else if (arg2 == 4) {
            this.field3319 = arg1.method215((byte) 93);
        } else if (arg2 == 5) {
            this.field3309 = arg1.method215((byte) 96);
        } else if (arg2 == 6) {
            this.field3304 = arg1.method215((byte) 126);
        } else if (arg2 == 7) {
            this.field3307 = arg1.method201((byte) -114);
        } else if (arg2 == 8) {
            this.field3313 = arg1.method201((byte) -126);
        } else if (arg2 == 9) {
            this.field3316 = true;
        } else if (arg2 == 10) {
            this.field3305 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method201((byte) -111);
            this.field3317 = new short[var6];
            this.field3301 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3317[var7] = (short) arg1.method215((byte) 112);
                this.field3301[var7] = (short) arg1.method215((byte) 94);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method201((byte) -109);
            this.field3311 = new short[var4];
            this.field3306 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3311[var5] = (short) arg1.method215((byte) 95);
                this.field3306[var5] = (short) arg1.method215((byte) 103);
            }
        }
        field3314++;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 143)
    public static final void method1391(int arg0) {
        class491.method2861(class136.field1982, 1);
        field3320++;
        class6.field68++;
        class203.field2751.method229(class45.field618, 1309449544);
        int var1 = -32 % ((-arg0 - 79) / 43);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILwm;BILgp;I)Lgn;", line = 180)
    public final class456 method1392(int arg0, int arg1, class364 arg2, byte arg3, int arg4, class35 arg5, int arg6) {
        field3312++;
        int var8 = arg4;
        class181 var9 = this.field3310 == -1 || arg6 == -1 ? null : arg5.method266(16107, this.field3310);
        if (var9 != null) {
            var8 = arg4 | var9.method1062(arg6, false, arg0, 65535);
        }
        if (this.field3309 != 128) {
            var8 |= 0x2;
        }
        if (this.field3319 != 128 || this.field3304 != 0) {
            var8 |= 0x5;
        }
        class76 var10 = this.field3302.field3337;
        class456 var11;
        synchronized (this.field3302.field3337) {
            var11 = (class456) this.field3302.field3337.method493((byte) 19, (long) (this.field3318 |= arg2.field4999 << 29));
        }
        if (var11 == null || arg2.method2103(var11.method1863(), var8) != 0) {
            if (var11 != null) {
                var8 = arg2.method1979(var8, var11.method1863());
            }
            int var12 = var8;
            if (this.field3317 != null) {
                var12 = var8 | 0x2000;
            }
            if (this.field3311 != null) {
                var12 |= 0x4000;
            }
            class284 var13 = class346.method2136(0, false, this.field3302.field3326, this.field3315);
            if (var13 == null) {
                return null;
            }
            var11 = arg2.method2094(var13, var12, this.field3302.field3338, this.field3307 + 64, this.field3313 + 850);
            if (this.field3317 != null) {
                for (int var14 = 0; var14 < this.field3317.length; var14++) {
                    var11.method1872(this.field3317[var14], this.field3301[var14]);
                }
            }
            if (this.field3311 != null) {
                for (int var15 = 0; var15 < this.field3311.length; var15++) {
                    var11.method1884(this.field3311[var15], this.field3306[var15]);
                }
            }
            var11.method1841(var8);
            class76 var16 = this.field3302.field3337;
            synchronized (this.field3302.field3337) {
                this.field3302.field3337.method505((long) (this.field3318 |= arg2.field4999 << 29), var11, 41);
            }
        }
        class456 var17 = var9 == null ? var11.method1893((byte) 2, var8, true) : var9.method1059(arg0, (byte) 2, arg6, 0, arg1, var8, (byte) 116, var11);
        if (this.field3319 != 128 || this.field3309 != 128) {
            var17.method1876(this.field3319, this.field3309, this.field3319);
        }
        if (this.field3304 != 0) {
            if (this.field3304 == 90) {
                var17.method1865(4096);
            }
            if (this.field3304 == 180) {
                var17.method1865(8192);
            }
            if (this.field3304 == 270) {
                var17.method1865(12288);
            }
        }
        if (arg3 >= -101) {
            return null;
        } else {
            var17.method1841(arg4);
            return var17;
        }
    }
}
