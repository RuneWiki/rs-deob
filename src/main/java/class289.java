import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class289 extends class482 {

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
    private int field4285;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    private int field4274;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    private int field4277;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
    private int field4289;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "[I")
    public static int[] field4278 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
    public static int field4292 = 0;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
    public static int field4287 = 999999;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    private int field4281;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
    private int field4288;

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
    private int field4291;

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
    private int field4293;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "Ln;")
    public static class15 field4283;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "Ljava/awt/Image;")
    public static Image field4279;

    @OriginalMember(owner = "client!fr", name = "F", descriptor = "[B")
    private byte[] field4290;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "[S")
    public static short[] field4275;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BIB)V", line = 3)
    public void method1847(byte arg0, int arg1, byte arg2) {
        if (arg0 >= -113) {
            method1851(-6);
        }
        this.field4290[arg1] = arg2;
        field4276++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 17)
    public final void method1848(int arg0) {
        if (arg0 > 65) {
            field4282++;
            this.field4288 = 0;
            this.field4291 = 0;
        }
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V", line = 30)
    public static final void method1849(int arg0) {
        if (class524.field7655 < 1024.0F) {
            class524.field7655 = 1024.0F;
        }
        field4286++;
        while (class508.field7354 >= 16384.0F) {
            class508.field7354 -= 16384.0F;
        }
        if (class524.field7655 > 3072.0F) {
            class524.field7655 = 3072.0F;
        }
        while (class508.field7354 < 0.0F) {
            class508.field7354 += 16384.0F;
        }
        int var1 = class78.field1279 >> 7;
        int var2 = class486.field7048 >> 7;
        int var3 = class224.method1515(class78.field1279, class486.field7048, class123.field1944, -631749433);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && class69.field1139 - 4 > var1 && class255.field3763 - 4 > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class123.field1944;
                    if (var7 < 3 && class195.method1322(var5, var6, 28946)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class41.field848.field6012 != null && class41.field848.field6012[var7] != null) {
                        var8 = (class41.field848.field6012[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class146.field2262[var7].method156(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (~var10 < arg0) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class463.field6717) {
            class463.field6717 += (var10 - class463.field6717) / 24;
        } else if (var10 < class463.field6717) {
            class463.field6717 += (var10 - class463.field6717) / 80;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V", line = 116)
    public final void method1850(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field4281 = this.field4285 - (arg2 < 0 ? -arg2 : arg2);
            this.field4293 = 4096;
            this.field4281 = this.field4281 * this.field4281 >> 12;
            this.field4291 = this.field4281;
        } else {
            this.field4293 = this.field4281 * this.field4274 >> 12;
            if (this.field4293 < 0) {
                this.field4293 = 0;
            } else if (this.field4293 > 4096) {
                this.field4293 = 4096;
            }
            this.field4281 = this.field4285 - (arg2 < 0 ? -arg2 : arg2);
            this.field4281 = this.field4281 * this.field4281 >> 12;
            this.field4281 = this.field4293 * this.field4281 >> 12;
            this.field4291 += this.field4289 * this.field4281 >> 12;
            this.field4289 = this.field4289 * this.field4277 >> 12;
        }
        field4280++;
        if (arg0 != -1734376532) {
            this.field4274 = 41;
        }
    }

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)V", line = 160)
    public static void method1851(int arg0) {
        field4278 = null;
        field4283 = null;
        if (arg0 == 255) {
            field4275 = null;
            field4279 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILqa;Lci;)V", line = 177)
    public static final void method1852(int arg0, class167 arg1, class320 arg2) {
        field4284++;
        class104[] var3 = class104.method760(arg2, class320.field4761, 0);
        class330.field4895 = new class343[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class330.field4895[var4] = arg1.method308(var3[var4], true);
        }
        class104[] var5 = class104.method760(arg2, class172.field2557, 0);
        class156.field2391 = new class343[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class156.field2391[var6] = arg1.method308(var5[var6], true);
        }
        class104[] var7 = class104.method760(arg2, class313.field4673, 0);
        class189.field2776 = new class343[var7.length];
        if (arg0 < 17) {
            method1852(62, null, null);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class189.field2776[var8] = arg1.method308(var7[var8], true);
        }
        class104[] var9 = class104.method760(arg2, class246.field3678, 0);
        class355.field5178 = new class343[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class355.field5178[var10] = arg1.method308(var9[var10], true);
        }
        class104[] var11 = class104.method760(arg2, class175.field2610, 0);
        class368.field5317 = new class343[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class368.field5317[var12] = arg1.method308(var11[var12], true);
        }
        class104[] var13 = class104.method760(arg2, class134.field2089, 0);
        class288.field4263 = new class343[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class288.field4263[var14] = arg1.method308(var13[var14], true);
        }
        class104[] var15 = class104.method760(arg2, class69.field1146, 0);
        class468.field6798 = new class343[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class468.field6798[var16] = arg1.method308(var15[var16], true);
        }
        class104[] var17 = class104.method760(arg2, class189.field2775, 0);
        class197.field2881 = new class343[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class197.field2881[var18] = arg1.method308(var17[var18], true);
        }
        class104[] var19 = class104.method760(arg2, class58.field1048, 0);
        class117.field1816 = new class343[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class117.field1816[var20] = arg1.method308(var19[var20], true);
        }
        class104[] var21 = class104.method760(arg2, class276.field4121, 0);
        class279.field4164 = new class343[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class279.field4164[var22] = arg1.method308(var21[var22], true);
        }
        class104[] var23 = class104.method760(arg2, class154.field2348, 0);
        class75.field1225 = new class343[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class75.field1225[var24] = arg1.method308(var23[var24], true);
        }
        class104[] var25 = class104.method760(arg2, class107.field1613, 0);
        class525.field7661 = new class343[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class525.field7661[var26] = arg1.method308(var25[var26], true);
        }
        class496.field7175 = arg1.method308(class104.method767(arg2, class51.field934, 0), true);
        class375.field5393 = arg1.method308(class104.method767(arg2, class374.field5382, 0), true);
        class104[] var27 = class104.method760(arg2, class42.field865, 0);
        class503.field7264 = new class343[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class503.field7264[var28] = arg1.method308(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V", line = 318)
    public final void method1853(int arg0) {
        field4273++;
        this.field4289 = this.field4277;
        this.field4291 >>= 0x4;
        if (this.field4291 < 0) {
            this.field4291 = 0;
        } else if (this.field4291 > 255) {
            this.field4291 = 255;
        }
        if (arg0 != 343124908) {
            method1851(-40);
        }
        this.method1847((byte) -121, this.field4288++, (byte) this.field4291);
        this.field4291 = 0;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(IIIIIFFF)V", line = 344)
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4285 = (int) (arg6 * 4096.0F);
        this.field4274 = (int) (arg7 * 4096.0F);
        this.field4289 = this.field4277 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
