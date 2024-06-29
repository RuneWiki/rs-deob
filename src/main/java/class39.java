import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class39 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public int field401 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lr;")
    public class123 field399 = null;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Z")
    public boolean field400 = false;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Z")
    public boolean field406 = false;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Z")
    public boolean field414 = false;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "[S")
    public short[] field407;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[S")
    public short[] field409;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[S")
    public short[] field402;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "[S")
    public short[] field413;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[S")
    public short[] field410;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "[B")
    public byte[] field408;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[S")
    private static short[] field403 = new short[500];

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[S")
    private static short[] field405 = new short[500];

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[B")
    private static byte[] field404 = new byte[500];

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "[S")
    private static short[] field411 = new short[500];

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "[S")
    private static short[] field412 = new short[500];

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "[S")
    private static short[] field415 = new short[500];

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V")
    public static void method223() {
        field405 = null;
        field412 = null;
        field411 = null;
        field403 = null;
        field415 = null;
        field404 = null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([BLr;)V")
    public class39(byte[] arg0, class123 arg1) {
        this.field399 = arg1;
        try {
            class396 var3 = new class396(arg0);
            class396 var4 = new class396(arg0);
            var3.field5729 = 2;
            int var5 = var3.method2388((byte) -127);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5729 = var3.field5729 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field399.field1591[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2388((byte) -121);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field405[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field412[var6] = var12;
                    } else {
                        field412[var6] = (short) var4.method2389(-49152);
                    }
                    if ((var11 & 0x2) == 0) {
                        field411[var6] = var12;
                    } else {
                        field411[var6] = (short) var4.method2389(-49152);
                    }
                    if ((var11 & 0x4) == 0) {
                        field403[var6] = var12;
                    } else {
                        field403[var6] = (short) var4.method2389(-49152);
                    }
                    field404[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field412[var6] = (short) (((field412[var6] & 0xFF) << 3) + (field412[var6] >> 8 & 0x7));
                        field411[var6] = (short) (((field411[var6] & 0xFF) << 3) + (field411[var6] >> 8 & 0x7));
                        field403[var6] = (short) (((field403[var6] & 0xFF) << 3) + (field403[var6] >> 8 & 0x7));
                        field412[var6] = (short) (field412[var6] << 3);
                        field411[var6] = (short) (field411[var6] << 3);
                        field403[var6] = (short) (field403[var6] << 3);
                    }
                    field415[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field415[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field400 = true;
                    } else if (var10 == 7) {
                        this.field414 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field406 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5729) {
                throw new RuntimeException();
            }
            this.field401 = var6;
            this.field407 = new short[var6];
            this.field409 = new short[var6];
            this.field402 = new short[var6];
            this.field413 = new short[var6];
            this.field410 = new short[var6];
            this.field408 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field407[var13] = field405[var13];
                this.field409[var13] = field412[var13];
                this.field402[var13] = field411[var13];
                this.field413[var13] = field403[var13];
                this.field410[var13] = field415[var13];
                this.field408[var13] = field404[var13];
            }
        } catch (Exception var14) {
            this.field401 = 0;
            this.field400 = false;
            this.field414 = false;
        }
    }
}
