import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class281 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    private int field4334 = 128;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    private int field4337 = 128;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Z")
    public boolean field4338 = false;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public int field4343 = -1;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    private int field4346 = 0;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    private int field4350 = 0;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "Z")
    public boolean field4351 = false;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    private int field4354 = 0;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field4353 = 0;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    private int field4349;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "[Lqi;")
    public static class246[] field4345;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "[S")
    private short[] field4333;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "[S")
    private short[] field4335;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[S")
    private short[] field4339;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "[S")
    private short[] field4344;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lug;I)V", line = 6)
    public final void method2048(class25 arg0, int arg1) {
        field4347++;
        while (true) {
            int var3 = arg0.method281(-128);
            if (var3 == 0) {
                int var4 = -80 / ((arg1 + 9) / 39);
                return;
            }
            this.method2049(12617, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILug;)V", line = 30)
    private final void method2049(int arg0, int arg1, class25 arg2) {
        field4340++;
        if (arg1 == 1) {
            this.field4349 = arg2.method314((byte) 80);
        } else if (arg1 == 2) {
            this.field4343 = arg2.method314((byte) 44);
        } else if (arg1 == 4) {
            this.field4334 = arg2.method314((byte) 122);
        } else if (arg1 == 5) {
            this.field4337 = arg2.method314((byte) 114);
        } else if (arg1 == 6) {
            this.field4350 = arg2.method314((byte) 99);
        } else if (arg1 == 7) {
            this.field4354 = arg2.method281(12);
        } else if (arg1 == 8) {
            this.field4346 = arg2.method281(arg0 - 12528);
        } else if (arg1 == 9) {
            this.field4338 = true;
        } else if (arg1 == 10) {
            this.field4351 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method281(arg0 ^ 0x3130);
            this.field4333 = new short[var4];
            this.field4344 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4333[var5] = (short) arg2.method314((byte) 39);
                this.field4344[var5] = (short) arg2.method314((byte) 51);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method281(-128);
            this.field4335 = new short[var6];
            this.field4339 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4335[var7] = (short) arg2.method314((byte) 127);
                this.field4339[var7] = (short) arg2.method314((byte) 92);
            }
        }
        if (arg0 != 12617) {
            field4353 = 21;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBI)Lhm;", line = 117)
    public final class52 method2050(int arg0, int arg1, byte arg2, int arg3) {
        field4341++;
        if (arg2 != -127) {
            this.method2049(-66, -118, (class25) null);
        }
        class52 var5 = (class52) class211.field3246.method654(arg2 ^ 0xFFFFFFFB, (long) this.field4336);
        if (var5 == null) {
            class40 var6 = class40.method415(class64.field990, this.field4349, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field4333 != null) {
                for (int var7 = 0; var7 < this.field4333.length; var7++) {
                    var6.method421(this.field4333[var7], this.field4344[var7]);
                }
            }
            if (this.field4335 != null) {
                for (int var8 = 0; var8 < this.field4335.length; var8++) {
                    var6.method412(this.field4335[var8], this.field4339[var8]);
                }
            }
            var5 = var6.method410(this.field4354 + 64, this.field4346 + 850, -30, -50, -30);
            class211.field3246.method652(-98, var5, (long) this.field4336);
        }
        class52 var9;
        if (this.field4343 == -1 || arg0 == -1) {
            var9 = var5.method513(true, true, true);
        } else {
            var9 = class126.method1091((byte) 25, this.field4343).method831(arg0, arg3, arg2 + 5, var5, arg1);
        }
        if (this.field4334 != 128 || this.field4337 != 128) {
            var9.method511(this.field4334, this.field4337, this.field4334);
        }
        if (this.field4350 != 0) {
            if (this.field4350 == 90) {
                var9.method501();
            }
            if (this.field4350 == 180) {
                var9.method493();
            }
            if (this.field4350 == 270) {
                var9.method507();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 207)
    public static void method2051(byte arg0) {
        if (arg0 != 27) {
            method2052(122, 57, -121, -104, -102, 48);
        }
        field4345 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V", line = 247)
    public static final void method2052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4348++;
        if (arg3 != -10) {
            field4345 = (class246[]) null;
        }
        for (int var6 = arg1; var6 <= arg2; var6++) {
            class283.method2059(arg0, class133.field2235[var6], (byte) 124, arg4, arg5);
        }
    }
}
