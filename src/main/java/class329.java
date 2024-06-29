import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class329 extends class128 {

    @OriginalMember(owner = "client!bo", name = "T", descriptor = "I")
    private int field5027 = -1;

    @OriginalMember(owner = "client!bo", name = "bb", descriptor = "B")
    public static byte field5035;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
    public int field5018;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!bo", name = "W", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!bo", name = "X", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!bo", name = "Z", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!bo", name = "ab", descriptor = "I")
    public int field5034;

    @OriginalMember(owner = "client!bo", name = "V", descriptor = "Ljava/awt/Frame;")
    public static Frame field5029;

    @OriginalMember(owner = "client!bo", name = "Y", descriptor = "[I")
    public int[] field5032;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)[[I", line = 10)
    public int[][] method102(int arg0, int arg1) {
        if (arg1 != 5110) {
            field5020 = 6;
        }
        int[][] var3 = this.field1755.method875(arg1 ^ 0x13DA, arg0);
        field5022++;
        if (this.field1755.field1815 && this.method2274(65280)) {
            int[] var4 = var3[0];
            int var5 = (class322.field4940 == this.field5018 ? arg0 : this.field5018 * arg0 / class322.field4940) * this.field5034;
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class10.field141 == this.field5034) {
                for (int var8 = 0; var8 < class10.field141; var8++) {
                    int var9 = this.field5032[var5++];
                    var7[var8] = class229.method1613(255, var9) << 4;
                    var6[var8] = class229.method1613(var9, 65280) >> 4;
                    var4[var8] = class229.method1613(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class10.field141; var10++) {
                    int var11 = this.field5034 * var10 / class10.field141;
                    int var12 = this.field5032[var5 + var11];
                    var7[var10] = class229.method1613(var12 << 4, 4080);
                    var6[var10] = class229.method1613(4080, var12 >> 4);
                    var4[var10] = class229.method1613(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lp;I)Lud;", line = 75)
    public static final class296 method2273(class107 arg0, int arg1) {
        if (arg1 == 24776) {
            field5023++;
            return new class296(arg0.method656(-105), arg0.method656(100), arg0.method656(121), arg0.method656(-64), arg0.method622((byte) -110), arg0.method622((byte) 75), arg0.method661(-1));
        } else {
            return (class296) null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 87)
    public final void method852(int arg0) {
        field5025++;
        super.method852(arg0);
        this.field5032 = null;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V", line = 97)
    public class329() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Z", line = 106)
    public final boolean method2274(int arg0) {
        if (arg0 != 65280) {
            this.field5018 = 23;
        }
        field5028++;
        if (this.field5032 != null) {
            return true;
        } else if (this.field5027 >= 0) {
            class189 var2 = class93.field1158 >= 0 ? class165.method1082(class93.field1158, (byte) 45, this.field5027, class109.field1517) : class311.method2184(this.field5027, class109.field1517, arg0 - 65381);
            var2.method1307();
            this.field5018 = var2.field1144;
            this.field5032 = var2.field2717;
            this.field5034 = var2.field1136;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "(I)V", line = 135)
    public static void method2275(int arg0) {
        if (arg0 > 7) {
            field5029 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "(I)V", line = 151)
    public static final void method2276(int arg0) {
        class25.method158(104, class163.field2260);
        if (arg0 <= 4) {
            return;
        }
        field5031++;
        int var1 = (class142.field1992 >> 3) + (class130.field1792 >> 10);
        int var2 = (class118.field1668 >> 3) + (class109.field1506 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class110.field1545 = new byte[var6][];
        class120.field1694 = new int[var6];
        class239.field3574 = new byte[var6][];
        class106.field1347 = new byte[var6][];
        class150.field2082 = new int[var6];
        class230.field3361 = new byte[var6][];
        class295.field4613 = new int[var6];
        class61.field754 = new int[var6];
        class343.field5326 = new int[var6][4];
        class186.field2691 = new int[var6];
        class272.field4270 = new byte[var6][];
        class61.field750 = new int[var6];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class120.field1694[var7] = var10;
                class186.field2691[var7] = class222.field3133.method1179((byte) -120, "m" + var8 + "_" + var9);
                class61.field754[var7] = class222.field3133.method1179((byte) 68, "l" + var8 + "_" + var9);
                class61.field750[var7] = class222.field3133.method1179((byte) -109, "n" + var8 + "_" + var9);
                class295.field4613[var7] = class222.field3133.method1179((byte) -116, "um" + var8 + "_" + var9);
                class150.field2082[var7] = class222.field3133.method1179((byte) 114, "ul" + var8 + "_" + var9);
                if (class61.field750[var7] == -1) {
                    class186.field2691[var7] = -1;
                    class61.field754[var7] = -1;
                    class295.field4613[var7] = -1;
                    class150.field2082[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class61.field750.length; var11++) {
            class61.field750[var11] = -1;
            class186.field2691[var11] = -1;
            class61.field754[var11] = -1;
            class295.field4613[var11] = -1;
            class150.field2082[var11] = -1;
        }
        class149.method1004(var3, var4, false, var1, (byte) 123, var2, var5, true);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lp;II)V", line = 235)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field5027 = arg0.method624(14612);
        }
        field5026++;
        if (arg2 > -85) {
            this.field5018 = -119;
        }
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)I", line = 251)
    public final int method860(int arg0) {
        field5030++;
        if (arg0 != -6967) {
            method2273((class107) null, -23);
        }
        return this.field5027;
    }
}
