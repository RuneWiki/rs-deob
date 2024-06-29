import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class323 {

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Z")
    public boolean field5234 = false;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public int field5236 = 0;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
    public boolean field5233 = false;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lmaa;")
    public class498 field5247 = null;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Z")
    public boolean field5240 = false;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[S")
    public short[] field5238;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[S")
    public short[] field5235;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "[S")
    public short[] field5244;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[S")
    public short[] field5237;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[S")
    public short[] field5241;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "[B")
    public byte[] field5232;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[B")
    private static byte[] field5242 = new byte[500];

    @OriginalMember(owner = "client!le", name = "m", descriptor = "[S")
    private static short[] field5239 = new short[500];

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[S")
    private static short[] field5243 = new short[500];

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[S")
    private static short[] field5246 = new short[500];

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[S")
    private static short[] field5245 = new short[500];

    @OriginalMember(owner = "client!le", name = "i", descriptor = "[S")
    private static short[] field5248 = new short[500];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public static void method2746() {
        field5239 = null;
        field5245 = null;
        field5243 = null;
        field5246 = null;
        field5248 = null;
        field5242 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([BLmaa;)V")
    public class323(byte[] arg0, class498 arg1) {
        this.field5247 = arg1;
        try {
            class176 var3 = new class176(arg0);
            class176 var4 = new class176(arg0);
            var3.method1645((byte) -108);
            var3.field2799 += 2;
            int var5 = var3.method1645((byte) -87);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2799 = var3.field2799 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5247.field7472[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1645((byte) -87);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5239[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5245[var6] = var12;
                    } else {
                        field5245[var6] = (short) var4.method1627(true);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5243[var6] = var12;
                    } else {
                        field5243[var6] = (short) var4.method1627(true);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5246[var6] = var12;
                    } else {
                        field5246[var6] = (short) var4.method1627(true);
                    }
                    field5242[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field5245[var6] = (short) (field5245[var6] << 2 & 0x3FFF);
                        field5243[var6] = (short) (field5243[var6] << 2 & 0x3FFF);
                        field5246[var6] = (short) (field5246[var6] << 2 & 0x3FFF);
                    }
                    field5248[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5248[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5233 = true;
                    } else if (var10 == 7) {
                        this.field5234 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field5240 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2799) {
                throw new RuntimeException();
            }
            this.field5236 = var6;
            this.field5238 = new short[var6];
            this.field5235 = new short[var6];
            this.field5244 = new short[var6];
            this.field5237 = new short[var6];
            this.field5241 = new short[var6];
            this.field5232 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5238[var13] = field5239[var13];
                this.field5235[var13] = field5245[var13];
                this.field5244[var13] = field5243[var13];
                this.field5237[var13] = field5246[var13];
                this.field5241[var13] = field5248[var13];
                this.field5232[var13] = field5242[var13];
            }
        } catch (Exception var14) {
            this.field5236 = 0;
            this.field5233 = false;
            this.field5234 = false;
        }
    }
}
