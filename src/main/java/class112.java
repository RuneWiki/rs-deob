import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class112 extends class283 {

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "[I")
    private int[] field1764 = new int[3];

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    private int field1762 = 3216;

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
    private int field1767 = 4096;

    @OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
    private int field1773 = 3216;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lna;")
    public static class26 field1760 = class69.method505("glissement:", (byte) -127);

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "[S")
    public static short[] field1765 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!pk", name = "eb", descriptor = "Lna;")
    public static class26 field1774 = class69.method505("Angreifen", (byte) -121);

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!pk", name = "fb", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "Lve;")
    public static class266 field1769;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "Lna;")
    public static class26 field1771;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "[[Lhg;")
    public static class172[][] field1761;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "(I)V", line = 7)
    public static void method782(int arg0) {
        field1771 = null;
        if (arg0 <= 6) {
            field1760 = (class26) null;
        }
        field1765 = null;
        field1761 = (class172[][]) null;
        field1774 = null;
        field1760 = null;
        field1769 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILwa;Z)V", line = 47)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field1767 = arg1.method576(1);
        } else if (arg0 == 1) {
            this.field1762 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field1773 = arg1.method576(1);
        }
        field1759++;
        if (!arg2) {
            method784(-47);
        }
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(B)I", line = 81)
    public static final int method783(byte arg0) {
        field1775++;
        int var1 = -47 / ((45 - arg0) / 57);
        return class315.field5399;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 96)
    public class112() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)V", line = 110)
    public final void method130(int arg0) {
        if (arg0 == 16251) {
            this.method785((byte) 59);
            field1763++;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I", line = 124)
    public final int[] method8(int arg0, byte arg1) {
        int var3 = -79 % ((arg1 - 30) / 36);
        field1770++;
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int var5 = class313.field5357 * this.field1767 >> 12;
            int[] var6 = this.method1990(0, class210.field3268 & arg0 - 1, 32755);
            int[] var7 = this.method1990(0, arg0, 32755);
            int[] var8 = this.method1990(0, arg0 + 1 & class210.field3268, 32755);
            for (int var9 = 0; var9 < class101.field1632; var9++) {
                int var10 = (var7[class236.field3783 & var9 - 1] - var7[var9 + 1 & class236.field3783]) * var5 >> 12;
                int var11 = (var8[var9] - var6[var9]) * var5 >> 12;
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = var11 >> 4;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > 255) {
                    var13 = 255;
                }
                int var14 = class314.field5361[((var13 + 1) * var13 >> 1) + var12] & 0xFF;
                int var15 = var11 * var14 >> 8;
                int var16 = var10 * var14 >> 8;
                int var17 = this.field1764[1] * var15 >> 12;
                int var18 = this.field1764[0] * var16 >> 12;
                int var19 = var14 * 4096 >> 8;
                int var20 = this.field1764[2] * var19 >> 12;
                var4[var9] = var17 + var20 + var18;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "(I)V", line = 191)
    public static final void method784(int arg0) {
        if (arg0 != 2) {
            method783((byte) 56);
        }
        field1772++;
        for (class280 var1 = (class280) class18.field258.method264(-37); var1 != null; var1 = (class280) class18.field258.method263(4)) {
            class319 var2 = var1.field4669;
            if (class279.field4651 != var2.field5466 || var2.field5453 < class229.field3626) {
                var1.method1006(-1024);
            } else if (class229.field3626 >= var2.field5487) {
                if (var2.field5481 > 0) {
                    class324 var3 = class185.field2877[var2.field5481 - 1];
                    if (var3 != null && var3.field3962 >= 0 && var3.field3962 < 13312 && var3.field3972 >= 0 && var3.field3972 < 13312) {
                        var2.method2216(var3.field3972, 1, class229.field3626, class17.method118(var2.field5466, 1, var3.field3962, var3.field3972) - var2.field5459, var3.field3962);
                    }
                }
                if (var2.field5481 < 0) {
                    int var4 = -var2.field5481 - 1;
                    class159 var5;
                    if (class327.field5668 == var4) {
                        var5 = class13.field221;
                    } else {
                        var5 = class268.field4427[var4];
                    }
                    if (var5 != null && var5.field3962 >= 0 && var5.field3962 < 13312 && var5.field3972 >= 0 && var5.field3972 < 13312) {
                        var2.method2216(var5.field3972, 1, class229.field3626, class17.method118(var2.field5466, 1, var5.field3962, var5.field3972) - var2.field5459, var5.field3962);
                    }
                }
                var2.method2215((byte) -59, class25.field366);
                class318.method2207(class279.field4651, (int) var2.field5482, (int) var2.field5454, (int) var2.field5476, 60, var2, var2.field5486, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(B)V", line = 271)
    private final void method785(byte arg0) {
        double var2 = Math.cos((double) ((float) this.field1773 / 4096.0F));
        this.field1764[0] = (int) (var2 * 4096.0D * Math.sin((double) ((float) this.field1762 / 4096.0F)));
        field1766++;
        if (arg0 < 46) {
            return;
        }
        this.field1764[1] = (int) (Math.cos((double) ((float) this.field1762 / 4096.0F)) * var2 * 4096.0D);
        this.field1764[2] = (int) (Math.sin((double) ((float) this.field1773 / 4096.0F)) * 4096.0D);
        int var4 = this.field1764[2] * this.field1764[2] >> 12;
        int var5 = this.field1764[1] * this.field1764[1] >> 12;
        int var6 = this.field1764[0] * this.field1764[0] >> 12;
        int var7 = (int) (Math.sqrt((double) (var6 - (-var5 - var4) >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1764[2] = (this.field1764[2] << 12) / var7;
            this.field1764[0] = (this.field1764[0] << 12) / var7;
            this.field1764[1] = (this.field1764[1] << 12) / var7;
        }
    }
}
