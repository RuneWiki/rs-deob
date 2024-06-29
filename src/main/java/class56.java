import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class class56 {

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    private int field866 = 4;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    private int field865 = 4;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    private int field863 = 4;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    private int field864 = 0;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "[S")
    private short[] field867 = new short[512];

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public int field868 = 4;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Lri;")
    public static class73 field858 = new class73(55, 10);

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "Lpk;")
    public static class132 field869 = new class132(0, 0);

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "Z")
    public static boolean field871 = false;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "[S")
    private short[] field862;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public abstract void method338(int arg0);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IBII)V")
    public final void method339(int arg0, byte arg1, int arg2, int arg3) {
        field860++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        int var10 = 0;
        if (arg1 < 33) {
            return;
        }
        while (var10 < arg3) {
            var7[var10] = (var10 << 12) / arg3;
            var10++;
        }
        this.method344((byte) 54);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field868; var14++) {
                        int var15 = this.field862[var14] << 12;
                        int var16 = this.field866 * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field865 * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field863 * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field865 * var21;
                        int var23 = this.field863 * var17;
                        int var24 = this.field866 * var19;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var20 > var26) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34;
                        if (var18 > var32) {
                            var34 = var32 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36 = var23 & 0xFFF;
                        int var37 = var30 & 0xFF;
                        int var38 = var24 & 0xFFF;
                        int var39;
                        if (var16 > var29) {
                            var39 = var29 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = class223.field3286[var38];
                        int var41 = var35 - 4096;
                        int var42 = var38 - 4096;
                        short var43 = this.field867[var37];
                        int var44 = class223.field3286[var36];
                        int var45 = class223.field3286[var35];
                        short var46 = this.field867[var34];
                        int var47 = var36 - 4096;
                        short var48 = this.field867[var39 + var43];
                        short var49 = this.field867[var31 + var43];
                        short var50 = this.field867[var39 + var46];
                        short var51 = this.field867[var31 + var46];
                        int var52 = class406.method2442(var38, var36, this.field867[var28 + var49], 164, var35);
                        int var53 = class406.method2442(var38, var47, this.field867[var33 + var49], 164, var35);
                        int var54 = ((var53 - var52) * var44 >> 12) + var52;
                        int var55 = class406.method2442(var42, var36, this.field867[var28 + var48], 164, var35);
                        int var56 = class406.method2442(var42, var47, this.field867[var33 + var48], 164, var35);
                        int var57 = var55 + ((var56 - var55) * var44 >> 12);
                        int var58 = class406.method2442(var38, var36, this.field867[var28 + var51], 164, var41);
                        int var59 = ((var57 - var54) * var40 >> 12) + var54;
                        int var60 = class406.method2442(var38, var47, this.field867[var33 + var51], 164, var41);
                        int var61 = var58 + ((var60 - var58) * var44 >> 12);
                        int var62 = class406.method2442(var42, var36, this.field867[var28 + var50], 164, var41);
                        int var63 = class406.method2442(var42, var47, this.field867[var33 + var50], 164, var41);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = ((var64 - var61) * var40 >> 12) + var61;
                        this.method340(var14, ((var65 - var59) * var45 >> 12) + var59, (byte) 47);
                    }
                    this.method338(-125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIB)V")
    public abstract void method340(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
    private final void method341(int arg0) {
        field857++;
        this.field862 = new short[this.field868];
        for (int var2 = 0; var2 < this.field868; var2++) {
            this.field862[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 2) {
            this.method344((byte) 123);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
    public static void method342(boolean arg0) {
        field858 = null;
        field869 = null;
        if (arg0) {
            method345(true, null, -83);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    private final void method343(byte arg0) {
        field859++;
        Random var2 = new Random((long) this.field864);
        if (arg0 >= -26) {
            this.method341(-88);
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field867[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class317.method1984(104, var2, var5);
            short var7 = this.field867[var6];
            this.field867[var6] = this.field867[var5];
            this.field867[var5] = this.field867[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V")
    public abstract void method344(byte arg0);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method345(boolean arg0, String arg1, int arg2) {
        field861++;
        if (arg1 == null) {
            return;
        }
        if (class61.field927 >= 100) {
            class61.method359(class226.field3320.method2838(false, class143.field2137), (byte) -77);
            return;
        }
        String var3 = class14.method93(arg1, 3841);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class61.field927; var4++) {
            String var9 = class14.method93(class3.field41[var4], 3841);
            if (var9 != null && var9.equals(var3)) {
                class61.method359(arg1 + class29.field298.method2838(false, class143.field2137), (byte) -22);
                return;
            }
            if (class231.field3446[var4] != null) {
                String var10 = class14.method93(class231.field3446[var4], 3841);
                if (var10 != null && var10.equals(var3)) {
                    class61.method359(arg1 + class29.field298.method2838(false, class143.field2137), (byte) -119);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class315.field4496; var5++) {
            String var7 = class14.method93(class474.field6980[var5], 3841);
            if (var7 != null && var7.equals(var3)) {
                class61.method359(class367.field5609.method2838(false, class143.field2137) + arg1 + class155.field2281.method2838(false, class143.field2137), (byte) -128);
                return;
            }
            if (class287.field4106[var5] != null) {
                String var8 = class14.method93(class287.field4106[var5], 3841);
                if (var8 != null && var8.equals(var3)) {
                    class61.method359(class367.field5609.method2838(false, class143.field2137) + arg1 + class155.field2281.method2838(false, class143.field2137), (byte) -45);
                    return;
                }
            }
        }
        int var6 = 29 / ((arg2 + 49) / 41);
        if (class14.method93(class500.field7365.field3548, 3841).equals(var3)) {
            class61.method359(class27.field283.method2838(false, class143.field2137), (byte) 109);
            return;
        }
        class512.field7488++;
        class291.method1861((byte) -104, class366.field5597);
        class356.field5471.method1410(class456.method2739((byte) -101, arg1) + 1, -27645);
        class356.field5471.method1418(true, arg1);
        class356.field5471.method1410(arg0 ? 1 : 0, -27645);
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIII)V")
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field865 = arg4;
        this.field864 = arg0;
        this.field866 = arg3;
        this.field868 = arg1;
        this.field863 = arg2;
        this.method341(2);
        this.method343((byte) -50);
    }
}
