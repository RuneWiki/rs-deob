import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public abstract class class95 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "[S")
    private short[] field1621 = new short[512];

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    private int field1631 = 4;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    private int field1624 = 4;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    private int field1627 = 0;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    private int field1626 = 4;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public int field1634 = 4;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Lfg;")
    public static class203 field1622 = new class203();

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Lve;")
    public static class255 field1636 = class87.method607(81, "l");

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Lwl;")
    public static class81 field1638 = new class81(500);

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "F")
    public static float field1635;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "[S")
    private short[] field1623;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BIII)V", line = 10)
    public final void method742(byte arg0, int arg1, int arg2, int arg3) {
        field1625++;
        if (arg0 != 85) {
            method744((byte) -15, 7, -23, 18, 7);
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method740(arg0 - 128);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field1634; var14++) {
                        int var15 = this.field1623[var14] << 12;
                        int var16 = this.field1626 * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = var7[var11] * var15 >> 12;
                        int var20 = this.field1624 * var17;
                        int var21 = this.field1626 * var19;
                        int var22 = var21 >> 12;
                        int var23 = var21 & 0xFFF;
                        int var24 = this.field1631 * var15 >> 12;
                        int var25 = this.field1631 * var18;
                        int var26 = var25 >> 12;
                        int var27 = class307.field5245[var23];
                        int var28 = var22 + 1;
                        int var29 = var26 + 1;
                        int var30 = var26 & 0xFF;
                        int var31;
                        if (var24 > var29) {
                            var31 = var29 & 0xFF;
                        } else {
                            var31 = 0;
                        }
                        int var32 = this.field1624 * var15 >> 12;
                        int var33 = var22 & 0xFF;
                        int var34 = var23 - 4096;
                        short var35 = this.field1621[var33];
                        int var36 = var25 & 0xFFF;
                        int var37 = var20 >> 12;
                        short var38 = this.field1621[var30 + var35];
                        int var39;
                        if (var28 < var16) {
                            var39 = var28 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = class307.field5245[var36];
                        short var41 = this.field1621[var39];
                        short var42 = this.field1621[var31 + var35];
                        int var43 = var20 & 0xFFF;
                        int var44 = var43 - 4096;
                        short var45 = this.field1621[var30 + var41];
                        short var46 = this.field1621[var31 + var41];
                        int var47 = var36 - 4096;
                        int var48 = class307.field5245[var43];
                        int var49 = var37 + 1;
                        int var50 = var37 & 0xFF;
                        int var51 = class291.method2056(var36, false, this.field1621[var38 + var50], var43, var23);
                        int var52;
                        if (var49 < var32) {
                            var52 = var49 & 0xFF;
                        } else {
                            var52 = 0;
                        }
                        int var53 = class291.method2056(var36, false, this.field1621[var38 + var52], var44, var23);
                        int var54 = ((var53 - var51) * var48 >> 12) + var51;
                        int var55 = class291.method2056(var47, false, this.field1621[var42 + var50], var43, var23);
                        int var56 = class291.method2056(var47, false, this.field1621[var52 + var42], var44, var23);
                        int var57 = ((var56 - var55) * var48 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var40 >> 12);
                        int var59 = class291.method2056(var36, false, this.field1621[var45 + var50], var43, var34);
                        int var60 = class291.method2056(var36, false, this.field1621[var52 + var45], var44, var34);
                        int var61 = ((var60 - var59) * var48 >> 12) + var59;
                        int var62 = class291.method2056(var47, false, this.field1621[var46 + var50], var43, var34);
                        int var63 = class291.method2056(var47, false, this.field1621[var46 + var52], var44, var34);
                        int var64 = ((var63 - var62) * var48 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var40 >> 12);
                        this.method743(((var65 - var58) * var27 >> 12) + var58, var14, (byte) 93);
                    }
                    this.method741((byte) -119);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BIIII)I", line = 180)
    public static final int method744(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1633++;
        if (arg0 >= -113) {
            field1636 = (class255) null;
        }
        int var5 = 65536 - class283.field4870[arg4 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIII)V", line = 312)
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1626 = arg4;
        this.field1634 = arg1;
        this.field1624 = arg2;
        this.field1627 = arg0;
        this.field1631 = arg3;
        this.method746(2);
        this.method747((byte) 53);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 204)
    public static void method745(int arg0) {
        field1638 = null;
        field1636 = null;
        field1622 = null;
        if (arg0 > -47) {
            method745(-76);
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 216)
    private final void method746(int arg0) {
        field1628++;
        this.field1623 = new short[this.field1634];
        for (int var2 = 0; var2 < this.field1634; var2++) {
            this.field1623[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 2) {
            field1637 = -75;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V", line = 238)
    private final void method747(byte arg0) {
        field1632++;
        Random var2 = new Random((long) this.field1627);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1621[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class212.method1522(var2, var5, (byte) 109);
            short var7 = this.field1621[var6];
            this.field1621[var6] = this.field1621[var5];
            this.field1621[var5] = this.field1621[var5 + 256] = var7;
        }
        if (arg0 != 53) {
            method744((byte) 60, 49, -75, 83, 45);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)V", line = 287)
    public static final void method748(byte arg0, int arg1) {
        field1629++;
        class53 var2 = class303.method2112(-1155040160, arg1, 7);
        var2.method326(57);
        int var3 = 81 / ((arg0 - 33) / 34);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public abstract void method740(int arg0);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public abstract void method741(byte arg0);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIB)V")
    public abstract void method743(int arg0, int arg1, byte arg2);
}
