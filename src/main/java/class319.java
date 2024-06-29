import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public abstract class class319 {

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public int field5006 = 4;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    private int field5003 = 4;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    private int field5008 = 0;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    private int field5011 = 4;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    private int field5009 = 4;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "[S")
    private short[] field5014 = new short[512];

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "Lvv;")
    public static class313 field5012 = new class313(20, 10);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "[S")
    private short[] field5007;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
    public abstract void method375(byte arg0);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    public static final void method2021(int arg0) {
        field5004++;
        class533.field7842.method873(class375.field5849, class148.field2401, class165.field2614);
        if (arg0 != 255) {
            method2025((byte) 3);
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
    private final void method2022(byte arg0) {
        this.field5007 = new short[this.field5006];
        field5002++;
        for (int var2 = 0; var2 < this.field5006; var2++) {
            this.field5007[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        int var3 = -107 % ((arg0 - 50) / 58);
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
    private final void method2023(byte arg0) {
        field5013++;
        Random var2 = new Random((long) this.field5008);
        int var3 = 50 / ((arg0 - 28) / 58);
        for (int var4 = 0; var4 < 255; var4++) {
            this.field5014[var4] = (short) var4;
        }
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class235.method1620(var2, var6, false);
            short var8 = this.field5014[var7];
            this.field5014[var7] = this.field5014[var6];
            this.field5014[var6] = this.field5014[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
    public abstract void method379(int arg0);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)V")
    public abstract void method380(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIII)V")
    public final void method2024(int arg0, int arg1, int arg2, int arg3) {
        field5005++;
        if (arg1 >= -106) {
            return;
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method379(1);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field5006; var14++) {
                        int var15 = this.field5007[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field5009 * var15 >> 12;
                        int var19 = this.field5003 * var15 >> 12;
                        int var20 = this.field5011 * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field5011 * var16;
                        int var23 = this.field5009 * var21;
                        int var24 = this.field5003 * var17;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34;
                        if (var18 <= var32) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35 = var23 & 0xFFF;
                        int var36;
                        if (var20 > var29) {
                            var36 = var29 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var22 & 0xFFF;
                        int var38 = var31 & 0xFF;
                        int var39;
                        if (var19 <= var26) {
                            var39 = 0;
                        } else {
                            var39 = var26 & 0xFF;
                        }
                        int var40 = class515.field7623[var37];
                        int var41 = var37 - 4096;
                        int var42 = var35 - 4096;
                        int var43 = var33 - 4096;
                        short var44 = this.field5014[var38];
                        short var45 = this.field5014[var34];
                        int var46 = class515.field7623[var35];
                        int var47 = class515.field7623[var33];
                        short var48 = this.field5014[var30 + var44];
                        short var49 = this.field5014[var36 + var44];
                        short var50 = this.field5014[var36 + var45];
                        short var51 = this.field5014[var30 + var45];
                        int var52 = class13.method73((byte) -12, var37, var35, this.field5014[var28 + var48], var33);
                        int var53 = class13.method73((byte) -12, var37, var35, this.field5014[var39 + var48], var43);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class13.method73((byte) -12, var41, var35, this.field5014[var28 + var49], var33);
                        int var56 = class13.method73((byte) -12, var41, var35, this.field5014[var39 + var49], var43);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = ((var57 - var54) * var40 >> 12) + var54;
                        int var59 = class13.method73((byte) -12, var37, var42, this.field5014[var28 + var51], var33);
                        int var60 = class13.method73((byte) -12, var37, var42, this.field5014[var39 + var51], var43);
                        int var61 = ((var60 - var59) * var47 >> 12) + var59;
                        int var62 = class13.method73((byte) -12, var41, var42, this.field5014[var28 + var50], var33);
                        int var63 = class13.method73((byte) -12, var41, var42, this.field5014[var39 + var50], var43);
                        int var64 = ((var63 - var62) * var47 >> 12) + var62;
                        int var65 = ((var64 - var61) * var40 >> 12) + var61;
                        this.method380(((var65 - var58) * var46 >> 12) + var58, var14, 0);
                    }
                    this.method375((byte) 120);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)V")
    public static void method2025(byte arg0) {
        if (arg0 >= 6) {
            field5012 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIII)V")
    public class319(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5003 = arg2;
        this.field5009 = arg4;
        this.field5008 = arg0;
        this.field5011 = arg3;
        this.field5006 = arg1;
        this.method2022((byte) 116);
        this.method2023((byte) 102);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BIII)V")
    public static final void method2026(byte arg0, int arg1, int arg2, int arg3) {
        field5010++;
        if (arg0 >= 0) {
            return;
        }
        int var4 = class510.field7403.field5087 * arg1 >> 8;
        if (arg2 == -1 && !class151.field2419) {
            class424.method2599(10619);
        } else if (arg2 != -1 && (class282.field4615 != arg2 || !class350.method2250(-6257)) && var4 != 0 && !class151.field2419) {
            class97.method675(arg3, class29.field472, false, 0, arg2, var4, 0);
        }
        class282.field4615 = arg2;
    }
}
