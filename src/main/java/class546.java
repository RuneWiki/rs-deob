import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class546 extends class656 {

    @OriginalMember(owner = "client!dca", name = "P", descriptor = "Lkg;")
    public static class57 field7267 = class563.method3089((byte) 121);

    @OriginalMember(owner = "client!dca", name = "T", descriptor = "[I")
    public static int[] field7271 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!dca", name = "Q", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!dca", name = "S", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!dca", name = "U", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!dca", name = "R", descriptor = "Lsa;")
    public static class595 field7269;

    @OriginalMember(owner = "client!dca", name = "V", descriptor = "Lcv;")
    public static class635 field7273;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2944(boolean arg0) {
        field7269 = null;
        field7271 = null;
        field7273 = null;
        if (!arg0) {
            field7271 = null;
        }
        field7267 = null;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(Z)I", line = 18)
    public static final int method2945(boolean arg0) {
        field7272++;
        if (class368.field4672 == 0) {
            class565.field7860.method3104(new class520("jaclib"), (byte) 121);
            if (class565.field7860.method3101(91).method1266(54) != 100) {
                return 1;
            }
            if (!((class520) class565.field7860.method3101(91)).method2845((byte) 25)) {
                class520.field7094.method3701(87);
            }
            class368.field4672 = 1;
        }
        if (class368.field4672 == 1) {
            class294.field3644 = class565.method3107(-111);
            class565.field7856.method3104(new class213(class398.field5007), (byte) -84);
            class565.field7861.method3104(new class520("jaggl"), (byte) 125);
            class565.field7862.method3104(new class520("jagdx"), (byte) 124);
            class565.field7863.method3104(new class520("jagmisc"), (byte) -51);
            class565.field7864.method3104(new class520("sw3d"), (byte) 113);
            class565.field7865.method3104(new class520("hw3d"), (byte) -18);
            class565.field7866.method3104(new class213(class689.field9772), (byte) -99);
            class565.field7867.method3104(new class213(class193.field2408), (byte) 121);
            class565.field7868.method3104(new class213(class493.field6500), (byte) -38);
            class565.field7869.method3104(new class213(class242.field3020), (byte) -92);
            class565.field7870.method3104(new class213(class622.field8709), (byte) -18);
            class565.field7871.method3104(new class213(class415.field5188), (byte) 124);
            class565.field7872.method3104(new class213(class673.field9472), (byte) -122);
            class565.field7873.method3104(new class213(class105.field1411), (byte) -108);
            class565.field7874.method3104(new class213(class475.field6030), (byte) -123);
            class565.field7875.method3104(new class213(class581.field8130), (byte) -45);
            class565.field7876.method3104(new class213(class572.field7994), (byte) 118);
            class565.field7877.method3104(new class213(class374.field4711), (byte) -12);
            class565.field7878.method3104(new class213(class224.field2809), (byte) 121);
            class565.field7879.method3104(new class213(class488.field6460), (byte) -86);
            class565.field7880.method3104(new class412(class590.field8283, "huffman"), (byte) 120);
            class565.field7881.method3104(new class213(class642.field9038), (byte) 115);
            class565.field7882.method3104(new class213(class689.field9770), (byte) 119);
            class565.field7883.method3104(new class213(class301.field3700), (byte) -60);
            class565.field7884.method3104(new class516(class381.field4806, "details"), (byte) -123);
            for (int var1 = 0; var1 < class294.field3644.length; var1++) {
                if (class294.field3644[var1].method3101(91) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class565[] var3 = class294.field3644;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class565 var5 = var3[var4];
                int var6 = var5.method3102((byte) 119);
                int var7 = var5.method3101(91).method1266(-106);
                var2 += var6 * var7 / 100;
            }
            class698.field9870 = var2;
            class368.field4672 = 2;
        }
        if (class294.field3644 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class565[] var11 = class294.field3644;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class565 var16 = var11[var12];
            int var17 = var16.method3102((byte) 114);
            int var18 = var16.method3101(91).method1266(-124);
            var8 += var17;
            if (var18 < 100) {
                var10 = false;
            }
            var9 += var17 * var18 / 100;
        }
        if (var10) {
            if (!((class520) class565.field7863.method3101(91)).method2845((byte) 25)) {
                class520.field7094.method3696((byte) -116);
            }
            class294.field3644 = null;
        }
        int var13 = var8 - class698.field9870;
        int var14 = var9 - class698.field9870;
        if (arg0) {
            return -90;
        }
        int var15 = var13 > 0 ? var14 * 100 / var13 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }
}
