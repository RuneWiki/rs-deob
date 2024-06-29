import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class class268 {

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    private int field3457 = 4;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public int field3463 = 4;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "[S")
    private short[] field3460 = new short[512];

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    private int field3461 = 4;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    private int field3459 = 0;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    private int field3466 = 4;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "[I")
    public static int[] field3469 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!go", name = "l", descriptor = "Lcq;")
    public static class72 field3467 = new class72("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "[S")
    private short[] field3465;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lla;Z)I")
    public static final int method1677(class266 arg0, boolean arg1) {
        field3456++;
        String var2 = class302.method1921(false, arg0);
        int[] var3 = null;
        if (class94.method590(arg0.field3424, 45)) {
            var3 = class131.method843((byte) 5, (int) arg0.field3427).field716;
        } else if (class213.method1308(arg0.field3424, -46)) {
            class298 var4 = class220.field2726[(int) arg0.field3427];
            if (var4 != null) {
                var3 = var4.field3971.field4174;
            }
        } else if (class276.method1737(2, arg0.field3424)) {
            if (arg0.field3424 == 1011) {
                var3 = class380.method2361((int) arg0.field3427, -29012).field6220;
            } else {
                var3 = class380.method2361((int) (arg0.field3427 >>> 32 & 0x7FFFFFFFL), -29012).field6220;
            }
        }
        if (arg1) {
            if (var3 != null) {
                var2 = var2 + class337.method2161(var3, (byte) -34);
            }
            return class213.field2611.method2212(121, class53.field621, var2);
        } else {
            return -124;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BII)V")
    public abstract void method886(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static void method1678(byte arg0) {
        field3469 = null;
        field3467 = null;
        if (arg0 != 120) {
            method1677((class266) null, false);
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V")
    private final void method1679(byte arg0) {
        this.field3465 = new short[this.field3463];
        if (arg0 != -60) {
            this.method1679((byte) -125);
        }
        field3458++;
        for (int var2 = 0; var2 < this.field3463; var2++) {
            this.field3465[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII)V")
    public final void method1680(int arg0, int arg1, int arg2, int arg3) {
        field3464++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg2];
        if (arg0 != 1) {
            return;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var8[var10] = (var10 << 12) / arg2;
        }
        this.method885((byte) -102);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field3463; var14++) {
                        int var15 = this.field3465[var14] << 12;
                        int var16 = this.field3457 * var15 >> 12;
                        int var17 = this.field3466 * var15 >> 12;
                        int var18 = var8[var11] * var15 >> 12;
                        int var19 = this.field3461 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field3457 * var20;
                        int var23 = this.field3466 * var21;
                        int var24 = this.field3461 * var18;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var26 >= var16) {
                            var33 = 0;
                        } else {
                            var33 = var26 & 0xFF;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35 = var24 & 0xFFF;
                        int var36;
                        if (var29 >= var17) {
                            var36 = 0;
                        } else {
                            var36 = var29 & 0xFF;
                        }
                        int var37;
                        if (var32 < var19) {
                            var37 = var32 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var22 & 0xFFF;
                        int var39 = var30 & 0xFF;
                        int var40 = var35 - 4096;
                        short var41 = this.field3460[var39];
                        int var42 = var34 - 4096;
                        int var43 = var38 - 4096;
                        int var44 = class204.field2401[var38];
                        int var45 = class204.field2401[var35];
                        short var46 = this.field3460[var37];
                        int var47 = class204.field2401[var34];
                        short var48 = this.field3460[var36 + var41];
                        short var49 = this.field3460[var36 + var46];
                        short var50 = this.field3460[var31 + var41];
                        short var51 = this.field3460[var31 + var46];
                        int var52 = class293.method1874(this.field3460[var28 + var50], var35, var34, (byte) -75, var38);
                        int var53 = class293.method1874(this.field3460[var33 + var50], var35, var34, (byte) -75, var43);
                        int var54 = ((var53 - var52) * var44 >> 12) + var52;
                        int var55 = class293.method1874(this.field3460[var28 + var48], var35, var42, (byte) -75, var38);
                        int var56 = class293.method1874(this.field3460[var33 + var48], var35, var42, (byte) -75, var43);
                        int var57 = ((var56 - var55) * var44 >> 12) + var55;
                        int var58 = ((var57 - var54) * var47 >> 12) + var54;
                        int var59 = class293.method1874(this.field3460[var28 + var51], var40, var34, (byte) -75, var38);
                        int var60 = class293.method1874(this.field3460[var33 + var51], var40, var34, (byte) -75, var43);
                        int var61 = ((var60 - var59) * var44 >> 12) + var59;
                        int var62 = class293.method1874(this.field3460[var28 + var49], var40, var42, (byte) -75, var38);
                        int var63 = class293.method1874(this.field3460[var33 + var49], var40, var42, (byte) -75, var43);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = ((var64 - var61) * var47 >> 12) + var61;
                        this.method886((byte) -38, ((var65 - var58) * var45 >> 12) + var58, var14);
                    }
                    this.method887(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
    private final void method1681(boolean arg0) {
        field3462++;
        Random var2 = new Random((long) this.field3459);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3460[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class174.method1096(-20548, var2, var5);
            short var7 = this.field3460[var6];
            this.field3460[var6] = this.field3460[var5];
            this.field3460[var5] = this.field3460[var5 + 256] = var7;
        }
        if (arg0) {
            this.field3461 = -98;
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)V")
    public abstract void method887(boolean arg0);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)V")
    public static final void method1682(byte arg0, int arg1) {
        field3468++;
        class12 var2 = class390.method2422(341555040, arg1, 7);
        var2.method65(-63);
        if (arg0 != 66) {
            field3469 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(B)V")
    public abstract void method885(byte arg0);

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIII)V")
    public class268(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3463 = arg1;
        this.field3466 = arg3;
        this.field3459 = arg0;
        this.field3457 = arg2;
        this.field3461 = arg4;
        this.method1679((byte) -60);
        this.method1681(false);
    }
}
