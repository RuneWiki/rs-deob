import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class7 extends class326 {

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    private int field152 = 4096;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "[I")
    private int[] field151 = new int[3];

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    private int field153 = 3216;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    private int field147 = 3216;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "[B")
    private static byte[] field143 = new byte[32896];

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "Z")
    public static boolean field156;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "F")
    public static float field142;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "Lug;")
    public static class253 field144;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(B)V", line = 4)
    public static final void method97(byte arg0) {
        field148++;
        if (class281.field4344) {
            return;
        }
        class281.field4320 = true;
        class281.field4344 = true;
        if (class82.field1124) {
            class45.field604 = (float) ((int) class45.field604 + 191 & 0xFFFFFF80);
        } else {
            class135.field1975 += (24.0F - class135.field1975) / 2.0F;
        }
        if (arg0 < 44) {
            method100(36);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZLvl;)V", line = 39)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field152 = arg2.method39((byte) 30);
        } else if (arg0 == 1) {
            this.field153 = arg2.method39((byte) 89);
        } else if (arg0 == 2) {
            this.field147 = arg2.method39((byte) 124);
        }
        field149++;
        if (arg1) {
            field143 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V", line = 73)
    public final void method99(byte arg0) {
        this.method102(-61);
        if (arg0 == 31) {
            field155++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 85)
    public class7() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V", line = 92)
    public static void method100(int arg0) {
        field143 = null;
        field144 = null;
        if (arg0 != 32557) {
            field144 = (class253) null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 112)
    public static final String method101(String arg0, byte arg1) {
        if (arg1 <= 84) {
            field144 = (class253) null;
        }
        field150++;
        String var2 = class154.method1118(119, class83.method608(arg0, (byte) -91));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V", line = 127)
    private final void method102(int arg0) {
        field145++;
        int var2 = -68 % ((arg0 - 72) / 50);
        double var3 = Math.cos((double) ((float) this.field147 / 4096.0F));
        this.field151[0] = (int) (Math.sin((double) ((float) this.field153 / 4096.0F)) * 4096.0D * var3);
        this.field151[1] = (int) (Math.cos((double) ((float) this.field153 / 4096.0F)) * var3 * 4096.0D);
        this.field151[2] = (int) (Math.sin((double) ((float) this.field147 / 4096.0F)) * 4096.0D);
        int var5 = this.field151[0] * this.field151[0] >> 12;
        int var6 = this.field151[2] * this.field151[2] >> 12;
        int var7 = this.field151[1] * this.field151[1] >> 12;
        int var8 = (int) (Math.sqrt((double) (var5 + var6 + var7 >> 12)) * 4096.0D);
        if (var8 != 0) {
            this.field151[2] = (this.field151[2] << 12) / var8;
            this.field151[0] = (this.field151[0] << 12) / var8;
            this.field151[1] = (this.field151[1] << 12) / var8;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field143[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field156 = false;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I", line = 184)
    public final int[] method103(int arg0, int arg1) {
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (arg0 > -25) {
            field156 = false;
        }
        field154++;
        if (this.field5112.field3583) {
            int var4 = class214.field3383 * this.field152 >> 12;
            int[] var5 = this.method2287(0, arg1 - 1 & class29.field427, -3896);
            int[] var6 = this.method2287(0, arg1, -3896);
            int[] var7 = this.method2287(0, arg1 + 1 & class29.field427, -3896);
            for (int var8 = 0; var8 < class166.field2731; var8++) {
                int var9 = (var6[var8 - 1 & class215.field3397] - var6[var8 + 1 & class215.field3397]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = field143[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field151[2] * var14 >> 12;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field151[0] * var16 >> 12;
                int var18 = var10 * var13 >> 8;
                int var19 = this.field151[1] * var18 >> 12;
                var3[var8] = var15 + var17 + var19;
            }
        }
        return var3;
    }
}
