import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class278 {

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public int field4363 = -1;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Lgf;")
    public class9 field4364 = null;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Z")
    public boolean field4368 = false;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Z")
    public boolean field4373 = false;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "[S")
    public short[] field4369;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[S")
    public short[] field4361;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "[S")
    public short[] field4371;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[S")
    public short[] field4358;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[S")
    public short[] field4362;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[B")
    public byte[] field4360;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[S")
    private static short[] field4359 = new short[500];

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[S")
    private static short[] field4367 = new short[500];

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "[S")
    private static short[] field4366 = new short[500];

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "[S")
    private static short[] field4370 = new short[500];

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "[S")
    private static short[] field4365 = new short[500];

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "[B")
    private static byte[] field4372 = new byte[500];

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([BLgf;)V", line = 60)
    public class278(byte[] arg0, class9 arg1) {
        this.field4364 = arg1;
        class1 var3 = new class1(arg0);
        class1 var4 = new class1(arg0);
        var3.field48 = 2;
        int var5 = var3.method15((byte) -123);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field48 = var3.field48 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field4364.field219[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method15((byte) 115);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field4365[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4370[var6] = var12;
                } else {
                    field4370[var6] = (short) var4.method6(-121);
                }
                if ((var11 & 0x2) == 0) {
                    field4359[var6] = var12;
                } else {
                    field4359[var6] = (short) var4.method6(-98);
                }
                if ((var11 & 0x4) == 0) {
                    field4366[var6] = var12;
                } else {
                    field4366[var6] = (short) var4.method6(-58);
                }
                field4372[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field4370[var6] = (short) (((field4370[var6] & 0xFF) << 3) + (field4370[var6] >> 8 & 0x7));
                    field4359[var6] = (short) (((field4359[var6] & 0xFF) << 3) + (field4359[var6] >> 8 & 0x7));
                    field4366[var6] = (short) (((field4366[var6] & 0xFF) << 3) + (field4366[var6] >> 8 & 0x7));
                }
                field4367[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field4367[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field4368 = true;
                } else if (var10 == 7) {
                    this.field4373 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field48) {
            throw new RuntimeException();
        }
        this.field4363 = var6;
        this.field4369 = new short[var6];
        this.field4361 = new short[var6];
        this.field4371 = new short[var6];
        this.field4358 = new short[var6];
        this.field4362 = new short[var6];
        this.field4360 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field4369[var13] = field4365[var13];
            this.field4361[var13] = field4370[var13];
            this.field4371[var13] = field4359[var13];
            this.field4358[var13] = field4366[var13];
            this.field4362[var13] = field4367[var13];
            this.field4360[var13] = field4372[var13];
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()V", line = 34)
    public static void method1969() {
        field4365 = null;
        field4370 = null;
        field4359 = null;
        field4366 = null;
        field4367 = null;
        field4372 = null;
    }
}
