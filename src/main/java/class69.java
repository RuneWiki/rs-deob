import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class69 {

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    private int field792 = 4;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "[S")
    private short[] field798 = new short[512];

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public int field799 = 4;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    private int field802 = 0;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    private int field791 = 4;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    private int field804 = 4;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Llg;")
    public static class237 field796 = new class237(4);

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field803 = 0;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "[S")
    private short[] field794;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static final void method390(int arg0) {
        while (true) {
            if (class359.field5120.method2140(14369, class55.field658) >= 11) {
                int var1 = class359.field5120.method2146(11, (byte) 52);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class26.field314[var1] == null) {
                        class26.field314[var1] = new class40();
                        class26.field314[var1].field5620 = var1;
                        if (class100.field1216[var1] != null) {
                            class26.field314[var1].method238(class100.field1216[var1], -20165);
                        }
                        var2 = true;
                    }
                    class94.field1135[class305.field4287++] = var1;
                    class40 var3 = class26.field314[var1];
                    var3.field5625 = class189.field2726;
                    int var4 = class359.field5120.method2146(1, (byte) 52);
                    int var5 = class276.field3927[class359.field5120.method2146(3, (byte) 52)];
                    int var6 = class359.field5120.method2146(5, (byte) 52);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class359.field5120.method2146(1, (byte) 52);
                    if (var7 == 1) {
                        class150.field1853[class176.field2399++] = var1;
                    }
                    int var8 = class359.field5120.method2146(5, (byte) 52);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    if (var2) {
                        var3.method2533(var5, -71);
                    }
                    var3.method247(class129.field1570, class384.field5422.field5677[0] + var8, var4 == 1, class384.field5422.field5664[0] + var6, -69);
                    continue;
                }
            }
            if (arg0 != 0) {
                field790 = -34;
            }
            field793++;
            class359.field5120.method2145((byte) -108);
            return;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    private final void method391(byte arg0) {
        field800++;
        if (arg0 > -123) {
            return;
        }
        Random var2 = new Random((long) this.field802);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field798[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class211.method1428(var2, var5, -113);
            short var7 = this.field798[var6];
            this.field798[var6] = this.field798[var5];
            this.field798[var5] = this.field798[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public abstract void method392(int arg0);

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    private final void method393(int arg0) {
        this.field794 = new short[this.field799];
        field801++;
        for (int var2 = 0; var2 < this.field799; var2++) {
            this.field794[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 2) {
            this.field804 = -33;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
    public abstract void method394(byte arg0);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZZ)V")
    public static final void method395(int arg0, boolean arg1, boolean arg2) {
        field795++;
        if (arg0 != 1089195052) {
            field803 = -106;
        }
        if (arg1) {
            class365.field5180++;
            class418.method2655((byte) -68);
        }
        if (arg2) {
            class114.field1398++;
            class130.method806((byte) -95);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZI)V")
    public abstract void method396(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V")
    public static void method397(int arg0) {
        int var1 = -14 % ((arg0 + 69) / 52);
        field796 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)V")
    public final void method398(int arg0, int arg1, int arg2, int arg3) {
        field797++;
        if (arg3 != -32442) {
            return;
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method392(arg3 + 32542);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field799; var14++) {
                        int var15 = this.field794[var14] << 12;
                        int var16 = this.field804 * var15 >> 12;
                        int var17 = this.field792 * var15 >> 12;
                        int var18 = this.field791 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field791 * var19;
                        int var23 = this.field804 * var20;
                        int var24 = this.field792 * var21;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34;
                        if (var16 <= var29) {
                            var34 = 0;
                        } else {
                            var34 = var29 & 0xFF;
                        }
                        int var35 = var30 & 0xFF;
                        int var36;
                        if (var18 > var26) {
                            var36 = var26 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var24 & 0xFFF;
                        int var38 = var22 & 0xFFF;
                        int var39;
                        if (var17 > var32) {
                            var39 = var32 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = class146.field1789[var38];
                        int var41 = class146.field1789[var33];
                        short var42 = this.field798[var39];
                        int var43 = var38 - 4096;
                        short var44 = this.field798[var35];
                        int var45 = class146.field1789[var37];
                        int var46 = var33 - 4096;
                        int var47 = var37 - 4096;
                        short var48 = this.field798[var31 + var42];
                        short var49 = this.field798[var34 + var42];
                        short var50 = this.field798[var31 + var44];
                        short var51 = this.field798[var34 + var44];
                        int var52 = class217.method1457(var38, var37, this.field798[var28 + var50], -109, var33);
                        int var53 = class217.method1457(var43, var37, this.field798[var36 + var50], -96, var33);
                        int var54 = var52 + ((var53 - var52) * var40 >> 12);
                        int var55 = class217.method1457(var38, var37, this.field798[var28 + var51], -120, var46);
                        int var56 = class217.method1457(var43, var37, this.field798[var36 + var51], arg3 ^ 0x7ECD, var46);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = ((var57 - var54) * var41 >> 12) + var54;
                        int var59 = class217.method1457(var38, var47, this.field798[var28 + var48], -107, var33);
                        int var60 = class217.method1457(var43, var47, this.field798[var36 + var48], -100, var33);
                        int var61 = var59 + ((var60 - var59) * var40 >> 12);
                        int var62 = class217.method1457(var38, var47, this.field798[var28 + var49], -107, var46);
                        int var63 = class217.method1457(var43, var47, this.field798[var36 + var49], arg3 + 32314, var46);
                        int var64 = ((var63 - var62) * var40 >> 12) + var62;
                        int var65 = ((var64 - var61) * var41 >> 12) + var61;
                        this.method396(var14, false, ((var65 - var58) * var45 >> 12) + var58);
                    }
                    this.method394((byte) -14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIII)V")
    public class69(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field791 = arg2;
        this.field804 = arg3;
        this.field792 = arg4;
        this.field802 = arg0;
        this.field799 = arg1;
        this.method393(2);
        this.method391((byte) -126);
    }
}
