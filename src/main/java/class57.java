import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class57 {

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Lir;")
    public class20 field785 = null;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Z")
    public boolean field780 = false;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Z")
    public boolean field789 = false;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Z")
    public boolean field784 = false;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public int field791 = 0;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "[S")
    public short[] field790;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[S")
    public short[] field787;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[S")
    public short[] field782;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "[S")
    public short[] field788;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[S")
    public short[] field786;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "[B")
    public byte[] field776;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[B")
    private static byte[] field777 = new byte[500];

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "[S")
    private static short[] field779 = new short[500];

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[S")
    private static short[] field778 = new short[500];

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[S")
    private static short[] field781 = new short[500];

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[S")
    private static short[] field783 = new short[500];

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "[S")
    private static short[] field792 = new short[500];

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
    public static void method415() {
        field781 = null;
        field792 = null;
        field779 = null;
        field783 = null;
        field778 = null;
        field777 = null;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "([BLir;)V")
    public class57(byte[] arg0, class20 arg1) {
        this.field785 = arg1;
        try {
            class468 var3 = new class468(arg0);
            class468 var4 = new class468(arg0);
            var3.field6830 = 2;
            int var5 = var3.method2765(61);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field6830 = var3.field6830 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field785.field299[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2765(74);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field781[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field792[var6] = var12;
                    } else {
                        field792[var6] = (short) var4.method2758((byte) -16);
                    }
                    if ((var11 & 0x2) == 0) {
                        field779[var6] = var12;
                    } else {
                        field779[var6] = (short) var4.method2758((byte) -16);
                    }
                    if ((var11 & 0x4) == 0) {
                        field783[var6] = var12;
                    } else {
                        field783[var6] = (short) var4.method2758((byte) -16);
                    }
                    field777[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field792[var6] = (short) (((field792[var6] & 0xFF) << 3) + (field792[var6] >> 8 & 0x7));
                        field779[var6] = (short) (((field779[var6] & 0xFF) << 3) + (field779[var6] >> 8 & 0x7));
                        field783[var6] = (short) (((field783[var6] & 0xFF) << 3) + (field783[var6] >> 8 & 0x7));
                        field792[var6] = (short) (field792[var6] << 3);
                        field779[var6] = (short) (field779[var6] << 3);
                        field783[var6] = (short) (field783[var6] << 3);
                    }
                    field778[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field778[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field789 = true;
                    } else if (var10 == 7) {
                        this.field780 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field784 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field6830) {
                throw new RuntimeException();
            }
            this.field791 = var6;
            this.field790 = new short[var6];
            this.field787 = new short[var6];
            this.field782 = new short[var6];
            this.field788 = new short[var6];
            this.field786 = new short[var6];
            this.field776 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field790[var13] = field781[var13];
                this.field787[var13] = field792[var13];
                this.field782[var13] = field779[var13];
                this.field788[var13] = field783[var13];
                this.field786[var13] = field778[var13];
                this.field776[var13] = field777[var13];
            }
        } catch (Exception var14) {
            this.field791 = 0;
            this.field789 = false;
            this.field780 = false;
        }
    }
}
