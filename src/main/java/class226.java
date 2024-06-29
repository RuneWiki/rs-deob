import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class226 {

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public int field3183 = 0;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lbg;")
    public class274 field3191 = null;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Z")
    public boolean field3194 = false;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "Z")
    public boolean field3196 = false;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "Z")
    public boolean field3197 = false;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[S")
    public short[] field3182;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "[S")
    public short[] field3190;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "[S")
    public short[] field3184;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "[S")
    public short[] field3189;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "[S")
    public short[] field3193;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "[B")
    public byte[] field3186;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[S")
    private static short[] field3188 = new short[500];

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "[S")
    private static short[] field3185 = new short[500];

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[S")
    private static short[] field3187 = new short[500];

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[S")
    private static short[] field3192 = new short[500];

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "[S")
    private static short[] field3195 = new short[500];

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "[B")
    private static byte[] field3198 = new byte[500];

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
    public static void method1400() {
        field3185 = null;
        field3187 = null;
        field3195 = null;
        field3192 = null;
        field3188 = null;
        field3198 = null;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([BLbg;)V")
    public class226(byte[] arg0, class274 arg1) {
        this.field3191 = arg1;
        try {
            class319 var3 = new class319(arg0);
            class319 var4 = new class319(arg0);
            var3.field4360 = 2;
            int var5 = var3.method1869(-77);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field4360 = var3.field4360 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field3191.field3713[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1869(-90);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field3185[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field3187[var6] = var12;
                    } else {
                        field3187[var6] = (short) var4.method1870(1);
                    }
                    if ((var11 & 0x2) == 0) {
                        field3195[var6] = var12;
                    } else {
                        field3195[var6] = (short) var4.method1870(1);
                    }
                    if ((var11 & 0x4) == 0) {
                        field3192[var6] = var12;
                    } else {
                        field3192[var6] = (short) var4.method1870(1);
                    }
                    field3198[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field3187[var6] = (short) (((field3187[var6] & 0xFF) << 3) + (field3187[var6] >> 8 & 0x7));
                        field3195[var6] = (short) (((field3195[var6] & 0xFF) << 3) + (field3195[var6] >> 8 & 0x7));
                        field3192[var6] = (short) (((field3192[var6] & 0xFF) << 3) + (field3192[var6] >> 8 & 0x7));
                        field3187[var6] = (short) (field3187[var6] << 3);
                        field3195[var6] = (short) (field3195[var6] << 3);
                        field3192[var6] = (short) (field3192[var6] << 3);
                    }
                    field3188[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field3188[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field3196 = true;
                    } else if (var10 == 7) {
                        this.field3197 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field3194 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field4360) {
                throw new RuntimeException();
            }
            this.field3183 = var6;
            this.field3182 = new short[var6];
            this.field3190 = new short[var6];
            this.field3184 = new short[var6];
            this.field3189 = new short[var6];
            this.field3193 = new short[var6];
            this.field3186 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field3182[var13] = field3185[var13];
                this.field3190[var13] = field3187[var13];
                this.field3184[var13] = field3195[var13];
                this.field3189[var13] = field3192[var13];
                this.field3193[var13] = field3188[var13];
                this.field3186[var13] = field3198[var13];
            }
        } catch (Exception var14) {
            this.field3183 = 0;
            this.field3196 = false;
            this.field3197 = false;
        }
    }
}
