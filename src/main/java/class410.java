import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class410 {

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    public int field5813 = 0;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "Lwm;")
    public class322 field5814 = null;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "Z")
    public boolean field5805 = false;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "Z")
    public boolean field5810 = false;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "[S")
    public short[] field5809;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "[S")
    public short[] field5801;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "[S")
    public short[] field5808;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[S")
    public short[] field5802;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "[S")
    public short[] field5811;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "[B")
    public byte[] field5807;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "[S")
    private static short[] field5806 = new short[500];

    @OriginalMember(owner = "client!os", name = "d", descriptor = "[S")
    private static short[] field5803 = new short[500];

    @OriginalMember(owner = "client!os", name = "a", descriptor = "[S")
    private static short[] field5800 = new short[500];

    @OriginalMember(owner = "client!os", name = "e", descriptor = "[S")
    private static short[] field5804 = new short[500];

    @OriginalMember(owner = "client!os", name = "m", descriptor = "[B")
    private static byte[] field5812 = new byte[500];

    @OriginalMember(owner = "client!os", name = "p", descriptor = "[S")
    private static short[] field5815 = new short[500];

    @OriginalMember(owner = "client!os", name = "a", descriptor = "()V", line = 10)
    public static void method2430() {
        field5803 = null;
        field5804 = null;
        field5806 = null;
        field5815 = null;
        field5800 = null;
        field5812 = null;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "([BLwm;)V", line = 61)
    public class410(byte[] arg0, class322 arg1) {
        this.field5814 = arg1;
        try {
            class179 var3 = new class179(arg0);
            class179 var4 = new class179(arg0);
            var3.field2206 = 2;
            int var5 = var3.method895((byte) -94);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2206 = var3.field2206 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5814.field4658[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method895((byte) -82);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5803[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5804[var6] = var12;
                    } else {
                        field5804[var6] = (short) var4.method931(-115);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5806[var6] = var12;
                    } else {
                        field5806[var6] = (short) var4.method931(69);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5815[var6] = var12;
                    } else {
                        field5815[var6] = (short) var4.method931(79);
                    }
                    field5812[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field5804[var6] = (short) (((field5804[var6] & 0xFF) << 3) + (field5804[var6] >> 8 & 0x7));
                        field5806[var6] = (short) (((field5806[var6] & 0xFF) << 3) + (field5806[var6] >> 8 & 0x7));
                        field5815[var6] = (short) (((field5815[var6] & 0xFF) << 3) + (field5815[var6] >> 8 & 0x7));
                        field5804[var6] = (short) (field5804[var6] << 3);
                        field5806[var6] = (short) (field5806[var6] << 3);
                        field5815[var6] = (short) (field5815[var6] << 3);
                    }
                    field5800[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5800[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5805 = true;
                    } else if (var10 == 7) {
                        this.field5810 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2206) {
                throw new RuntimeException();
            }
            this.field5813 = var6;
            this.field5809 = new short[var6];
            this.field5801 = new short[var6];
            this.field5808 = new short[var6];
            this.field5802 = new short[var6];
            this.field5811 = new short[var6];
            this.field5807 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5809[var13] = field5803[var13];
                this.field5801[var13] = field5804[var13];
                this.field5808[var13] = field5806[var13];
                this.field5802[var13] = field5815[var13];
                this.field5811[var13] = field5800[var13];
                this.field5807[var13] = field5812[var13];
            }
        } catch (Exception var14) {
            this.field5813 = 0;
            this.field5805 = false;
            this.field5810 = false;
        }
    }
}
