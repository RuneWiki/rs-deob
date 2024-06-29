import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class338 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lss;")
    public class294 field4356 = null;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public int field4361 = 0;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Z")
    public boolean field4360 = false;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Z")
    public boolean field4359 = false;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "Z")
    public boolean field4369 = false;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "[S")
    public short[] field4372;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "[S")
    public short[] field4365;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "[S")
    public short[] field4370;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "[S")
    public short[] field4363;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "[S")
    public short[] field4367;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "[B")
    public byte[] field4362;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "[S")
    private static short[] field4357 = new short[500];

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "[S")
    private static short[] field4364 = new short[500];

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "[S")
    private static short[] field4366 = new short[500];

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "[S")
    private static short[] field4371 = new short[500];

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "[B")
    private static byte[] field4368 = new byte[500];

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "[S")
    private static short[] field4358 = new short[500];

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()V")
    public static void method1982() {
        field4366 = null;
        field4357 = null;
        field4358 = null;
        field4364 = null;
        field4371 = null;
        field4368 = null;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "([BLss;)V")
    public class338(byte[] arg0, class294 arg1) {
        this.field4356 = arg1;
        try {
            class179 var3 = new class179(arg0);
            class179 var4 = new class179(arg0);
            var3.method1094(255);
            var3.field2354 += 2;
            int var5 = var3.method1094(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2354 = var3.field2354 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4356.field3833[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1094(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4366[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4357[var6] = var12;
                    } else {
                        field4357[var6] = (short) var4.method1128(-1);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4358[var6] = var12;
                    } else {
                        field4358[var6] = (short) var4.method1128(-1);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4364[var6] = var12;
                    } else {
                        field4364[var6] = (short) var4.method1128(-1);
                    }
                    field4368[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field4357[var6] = (short) (field4357[var6] << 2 & 0x3FFF);
                        field4358[var6] = (short) (field4358[var6] << 2 & 0x3FFF);
                        field4364[var6] = (short) (field4364[var6] << 2 & 0x3FFF);
                    }
                    field4371[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4371[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4360 = true;
                    } else if (var10 == 7) {
                        this.field4369 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field4359 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2354) {
                throw new RuntimeException();
            }
            this.field4361 = var6;
            this.field4372 = new short[var6];
            this.field4365 = new short[var6];
            this.field4370 = new short[var6];
            this.field4363 = new short[var6];
            this.field4367 = new short[var6];
            this.field4362 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4372[var13] = field4366[var13];
                this.field4365[var13] = field4357[var13];
                this.field4370[var13] = field4358[var13];
                this.field4363[var13] = field4364[var13];
                this.field4367[var13] = field4371[var13];
                this.field4362[var13] = field4368[var13];
            }
        } catch (Exception var14) {
            this.field4361 = 0;
            this.field4360 = false;
            this.field4369 = false;
        }
    }
}
