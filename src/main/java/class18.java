import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 {

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field273 = new BigInteger("b0870f4d81534cda58944e60c803db50b4e9c81917e62b0a7018f91ee377da86232095ffabe0f6eefc8ea220c9d96270bcb8d58f6e0610ce79c71b3c95d0b7b74b6e0955595b5673b9a3ee0cb8d9240c4f0fb356bdf6760aeba4844534cf4e07eb44377d943396f3518f527f11ec0772c0b9412b0da0fac7c00551a089d7db67bb271c7bd27022bc6b780b938f60eb0ad95a4de757b0ad6f4415ab75eecf08ebd5e89962c1a39d587e3fd8171bc998dd0bb28d0e6fe76260eadb903ddc14144489b1f6e83abf4ba9f2446c9c931f819909bc3136299f893af5a8e29c2e60d528d68458b550442a9407d825d81b26ef06ae5e54860eb7fda0d0f69e0f08f70a5ad02261e5c5f37f10decdbb7824cddd984b72bd56ef120eb44974ef4afc93388a20f37cc346b4095295e12c9c06a80041fa32fad127a8bfd5847138f2f2348fc010035a01f94a695f2ae97b9ec03266fb590c7bd0bdf1e0263f81580295d8e1b6c6dc39c02946c42f28f7b70af084e81c3e0bd70e1503c10aed4b2feecc6c3f0b8bee181fe7875c0e981b0ab5ad8570152f2d7c6b3d536c7883e367f8f1e0bff2838bf5c11d7265b052cf586ac0edcafdb143ff869eff9a536966ca2598dbfc21b5ca788b7f56ea0972c56817479470ef051c5b7471bb5d6f7d56bff88f49ae90d7f1801b9e1d517c483a1c2f82d668f3a3ced3fdda912a2349bc1c32b5943627", 16);

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lfc;")
    public static class235 field276 = new class235(93, 8);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lpj;")
    public static class132 field268;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static final void method94(boolean arg0) {
        field275++;
        if (class145.field2153 != null) {
            return;
        }
        class145.field2153 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (!arg0) {
            field266 = 58;
        }
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var9 = var16;
                    var10 = var8;
                    var11 = var18;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var11 = var17;
                    var9 = var8;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class145.field2153[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method95(int arg0) {
        class94.method690(11, (byte) 125);
        field265++;
        if (arg0 > -24) {
            method98(47);
        }
        class573.method3153((byte) -104);
        System.gc();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILpj;ZLpj;)V")
    public static final void method96(int arg0, class132 arg1, boolean arg2, class132 arg3) {
        field269++;
        if (arg2) {
            class77.field1054 = arg1;
            class417.field5876 = arg3;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
    public static final void method97(int arg0, int arg1) {
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        field274++;
        class684.field9621 = arg1;
        class632.field8852 = new class401[class342.field4964[class684.field9621] + 1];
        class627.field8754 = 0;
        class105.field1408 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method98(int arg0) {
        field273 = null;
        if (arg0 != 30375) {
            field266 = 127;
        }
        field276 = null;
        field268 = null;
    }
}
