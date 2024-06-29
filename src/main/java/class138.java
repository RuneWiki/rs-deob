import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class138 {

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public int field2192 = 0;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "Z")
    public boolean field2190 = false;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "Z")
    public boolean field2200 = false;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "Z")
    public boolean field2201 = false;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "Liia;")
    public class88 field2203 = null;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "[S")
    public short[] field2189;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "[S")
    public short[] field2204;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "[S")
    public short[] field2199;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "[S")
    public short[] field2198;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "[S")
    public short[] field2194;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "[B")
    public byte[] field2202;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "[S")
    private static short[] field2195 = new short[500];

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "[B")
    private static byte[] field2191 = new byte[500];

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "[S")
    private static short[] field2196 = new short[500];

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "[S")
    private static short[] field2197 = new short[500];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "[S")
    private static short[] field2188 = new short[500];

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[S")
    private static short[] field2193 = new short[500];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()V", line = 9)
    public static void method1067() {
        field2195 = null;
        field2193 = null;
        field2188 = null;
        field2197 = null;
        field2196 = null;
        field2191 = null;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "([BLiia;)V", line = 65)
    public class138(byte[] arg0, class88 arg1) {
        this.field2203 = arg1;
        try {
            class677 var3 = new class677(arg0);
            class677 var4 = new class677(arg0);
            var3.method3821((byte) 109);
            var3.field9419 += 2;
            int var5 = var3.method3821((byte) -104);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field9419 = var3.field9419 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2203.field1081[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3821((byte) -116);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2195[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2193[var6] = var12;
                    } else {
                        field2193[var6] = (short) var4.method3822((byte) 106);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2188[var6] = var12;
                    } else {
                        field2188[var6] = (short) var4.method3822((byte) 107);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2197[var6] = var12;
                    } else {
                        field2197[var6] = (short) var4.method3822((byte) 119);
                    }
                    field2191[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field2193[var6] = (short) (field2193[var6] << 2 & 0x3FFF);
                        field2188[var6] = (short) (field2188[var6] << 2 & 0x3FFF);
                        field2197[var6] = (short) (field2197[var6] << 2 & 0x3FFF);
                    }
                    field2196[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2196[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2190 = true;
                    } else if (var10 == 7) {
                        this.field2200 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2201 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field9419) {
                throw new RuntimeException();
            }
            this.field2192 = var6;
            this.field2189 = new short[var6];
            this.field2204 = new short[var6];
            this.field2199 = new short[var6];
            this.field2198 = new short[var6];
            this.field2194 = new short[var6];
            this.field2202 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2189[var13] = field2195[var13];
                this.field2204[var13] = field2193[var13];
                this.field2199[var13] = field2188[var13];
                this.field2198[var13] = field2197[var13];
                this.field2194[var13] = field2196[var13];
                this.field2202[var13] = field2191[var13];
            }
        } catch (Exception var14) {
            this.field2192 = 0;
            this.field2190 = false;
            this.field2200 = false;
        }
    }
}
