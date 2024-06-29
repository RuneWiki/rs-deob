import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class272 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Z")
    public boolean field4308 = false;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "[F")
    public float[] field4333 = new float[4];

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public int field4311;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "Z")
    public boolean field4330;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Z")
    public boolean field4310;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public int field4324;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "[S")
    public short[] field4331;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    private int field4315;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field4318 = 0;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "F")
    public float field4322;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "F")
    public float field4328;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    private int field4309;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    private int field4321;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    private int field4335;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    private int field4336;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "Lwh;")
    public class11 field4332;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1939(byte arg0) {
        field4323++;
        class240.field3799.method1623(1);
        if (arg0 == 69) {
            class218.field3501.method1623(1);
            class129.field1911.method1623(1);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V", line = 29)
    public final void method1940(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4309 = arg0;
        this.field4321 = arg1;
        field4313++;
        if (arg2 < -40) {
            this.field4336 = arg4;
            this.field4335 = arg3;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 374)
    protected class272() {
        if (class197.field3224 == null) {
            class241.method1707(-12929);
        }
        this.method1942((byte) 127);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lim;)V", line = 385)
    public class272(class192 arg0) {
        if (class197.field3224 == null) {
            class241.method1707(-12929);
        }
        this.field4311 = arg0.method1399(-1172389784);
        this.field4330 = (this.field4311 & 0x8) != 0;
        this.field4310 = (this.field4311 & 0x10) != 0;
        this.field4311 &= 0x7;
        this.field4325 = arg0.method1396(-106);
        this.field4317 = arg0.method1396(-16);
        this.field4312 = arg0.method1396(-120);
        this.field4324 = arg0.method1399(-1172389784);
        this.method1944((byte) 96);
        this.field4331 = new short[this.field4324 * 2 + 1];
        for (int var2 = 0; var2 < this.field4331.length; var2++) {
            this.field4331[var2] = (short) arg0.method1396(-78);
        }
        this.field4329 = class25.field368[arg0.method1396(-102)];
        int var3 = arg0.method1399(-1172389784);
        this.field4315 = var3 & 0xE0 << 3;
        this.field4334 = var3 & 0x1F;
        if (this.field4334 != 31) {
            this.method1942((byte) 110);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZI)V", line = 51)
    public final void method1941(int arg0, boolean arg1, int arg2) {
        if (arg2 != -20145) {
            field4327 = 69;
        }
        field4320++;
        int var4 = this.field4321 * arg0 / 50 + this.field4315 & 0x7FF;
        int var5 = this.field4335;
        int var6;
        if (var5 == 1) {
            var6 = (class25.field355[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class197.field3224[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg1) {
            var6 = 2048;
        }
        this.field4322 = (float) ((this.field4309 * var6 >> 11) + this.field4336) / 2048.0F;
        float var7 = this.field4322 / 255.0F;
        this.field4333[1] = var7 * (float) (class200.method1465(65440, this.field4329) >> 8);
        this.field4333[0] = var7 * (float) class200.method1465(255, this.field4329 >> 16);
        this.field4333[2] = (float) class200.method1465(255, this.field4329) * var7;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V", line = 133)
    private final void method1942(byte arg0) {
        if (arg0 < 10) {
            return;
        }
        field4326++;
        int var2 = this.field4334;
        if (var2 == 2) {
            this.field4321 = 2048;
            this.field4335 = 1;
            this.field4309 = 2048;
            this.field4336 = 0;
        } else if (var2 == 3) {
            this.field4335 = 1;
            this.field4336 = 0;
            this.field4321 = 4096;
            this.field4309 = 2048;
        } else if (var2 == 4) {
            this.field4336 = 0;
            this.field4309 = 2048;
            this.field4335 = 4;
            this.field4321 = 2048;
        } else if (var2 == 5) {
            this.field4335 = 4;
            this.field4309 = 2048;
            this.field4321 = 8192;
            this.field4336 = 0;
        } else if (var2 == 12) {
            this.field4336 = 0;
            this.field4309 = 2048;
            this.field4335 = 2;
            this.field4321 = 2048;
        } else if (var2 == 13) {
            this.field4335 = 2;
            this.field4309 = 2048;
            this.field4321 = 8192;
            this.field4336 = 0;
        } else if (var2 == 10) {
            this.field4336 = 1536;
            this.field4335 = 3;
            this.field4321 = 2048;
            this.field4309 = 512;
        } else if (var2 == 11) {
            this.field4321 = 4096;
            this.field4336 = 1536;
            this.field4335 = 3;
            this.field4309 = 512;
        } else if (var2 == 6) {
            this.field4309 = 768;
            this.field4321 = 2048;
            this.field4335 = 3;
            this.field4336 = 1280;
        } else if (var2 == 7) {
            this.field4309 = 768;
            this.field4336 = 1280;
            this.field4321 = 4096;
            this.field4335 = 3;
        } else if (var2 == 8) {
            this.field4321 = 2048;
            this.field4336 = 1024;
            this.field4335 = 3;
            this.field4309 = 1024;
        } else if (var2 == 9) {
            this.field4309 = 1024;
            this.field4336 = 1024;
            this.field4335 = 3;
            this.field4321 = 4096;
        } else if (var2 == 14) {
            this.field4309 = 768;
            this.field4336 = 1280;
            this.field4321 = 2048;
            this.field4335 = 1;
        } else if (var2 == 15) {
            this.field4309 = 512;
            this.field4335 = 1;
            this.field4336 = 1536;
            this.field4321 = 4096;
        } else if (var2 == 16) {
            this.field4335 = 1;
            this.field4321 = 8192;
            this.field4309 = 256;
            this.field4336 = 1792;
        } else {
            this.field4336 = 0;
            this.field4321 = 2048;
            this.field4335 = 0;
            this.field4309 = 2048;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V", line = 337)
    public static final void method1943(int arg0, int arg1, int arg2) {
        class206.field3363 = class161.field2636 + class331.field5158 + arg2 - arg0;
        field4319++;
        class138.field2069 = arg1 - class287.field4528;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V", line = 359)
    private final void method1944(byte arg0) {
        field4314++;
        if (arg0 == 96) {
            int var2 = (this.field4324 << 7) + 64;
            this.field4328 = 1.0F / (float) (var2 * var2);
        }
    }
}
