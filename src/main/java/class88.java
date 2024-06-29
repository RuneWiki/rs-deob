import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class88 extends class258 {

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    private int field1299 = -32768;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "Lqj;")
    public static class196 field1288 = class80.method502("Starte 3D)2Softwarebibliothek)3", -48);

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lqj;")
    public static class196 field1294 = class80.method502("Konfig geladen)3", -48);

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field1293 = 0;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "[[[B")
    public static byte[][][] field1300 = new byte[4][104][104];

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Lp;")
    public static class56 field1290;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "[Lub;")
    public static class43[] field1296;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method549(byte arg0) {
        field1296 = null;
        field1290 = null;
        field1300 = null;
        if (arg0 == -75) {
            field1294 = null;
            field1288 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lw;I)V")
    public static final void method550(class157 arg0, int arg1) {
        class129.method790(200000, arg0, 8952);
        field1297++;
        if (arg1 >= -30) {
            method551(9);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "()I")
    public final int method266() {
        field1295++;
        return this.field1299;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1289++;
        class119 var11 = class178.method1154(false, this.field1298).method1366(this.field1301, null, 0, -50);
        if (var11 != null) {
            var11.method269(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1299 = var11.method266();
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static final void method551(int arg0) {
        field1292++;
        if (class13.field146 == -1 || class235.field4181 == -1) {
            return;
        }
        int var1 = ((class199.field3537 - class227.field4063) * class215.field3867 >> 16) + class227.field4063;
        float[] var2 = new float[3];
        class215.field3867 += var1;
        if (class215.field3867 < 65535) {
            class213.field3820 = false;
            class120.field1736 = false;
        } else {
            class215.field3867 = 65535;
            if (class120.field1736) {
                class213.field3820 = false;
            } else {
                class213.field3820 = true;
            }
            class120.field1736 = true;
        }
        int var3 = class73.field1052 * 2;
        float var4 = (float) class215.field3867 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class168.field2816[class13.field146][var3][var5] * 3;
            int var22 = class168.field2816[class13.field146][var3 + 1][var5] * 3;
            int var23 = class168.field2816[class13.field146][var3][var5];
            int var24 = (class168.field2816[class13.field146][var3 + 2][var5] + class168.field2816[class13.field146][var3 + 2][var5] - class168.field2816[class13.field146][var3 + 3][var5]) * 3;
            int var25 = var24 + var21 - var22 * 2;
            int var26 = var22 - var21;
            int var27 = class168.field2816[class13.field146][var3 + 2][var5] + var22 - var24 - var23;
            var2[var5] = (((float) var27 * var4 + (float) var25) * var4 + (float) var26) * var4 + (float) var23;
        }
        float[] var6 = new float[3];
        class132.field1889 = (int) var2[1] * -1;
        if (class106.field1523 == 0 && class178.field3011 == 0) {
            class106.field1523 = (((int) var2[0] >> 10) - 6) * 8;
            class178.field3011 = (((int) var2[2] >> 10) - 6) * 8;
        }
        class25.field321 = (int) var2[arg0] - class178.field3011 * 128;
        class13.field151 = (int) var2[0] - class106.field1523 * 128;
        int var7 = class238.field4232 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class168.field2816[class235.field4181][var7][var8] * 3;
            int var15 = class168.field2816[class235.field4181][var7 + 1][var8] * 3;
            int var16 = (class168.field2816[class235.field4181][var7 + 2][var8] + class168.field2816[class235.field4181][var7 + 2][var8] - class168.field2816[class235.field4181][var7 + 3][var8]) * 3;
            int var17 = class168.field2816[class235.field4181][var7][var8];
            int var18 = var14 + var16 - var15 * 2;
            int var19 = class168.field2816[class235.field4181][var7 + 2][var8] + var15 - var17 - var16;
            int var20 = var15 - var14;
            var6[var8] = (((float) var19 * var4 + (float) var18) * var4 + (float) var20) * var4 + (float) var17;
        }
        float var9 = (var6[1] - var2[1]) * -1.0F;
        float var10 = var6[0] - var2[0];
        float var11 = var6[2] - var2[2];
        double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class178.field3002 = (float) Math.atan2((double) var9, var12);
        class64.field880 = -((float) Math.atan2((double) var10, (double) var11));
        class149.field2396 = (int) ((double) class178.field3002 * 325.949D) & 0x7FF;
        class185.field3232 = (int) ((double) class64.field880 * 325.949D) & 0x7FF;
    }
}
