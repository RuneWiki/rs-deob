import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class322 extends class335 {

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    private int field5026 = -1;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "Z")
    public static boolean field5023 = false;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field5029 = 0;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    private int field5025;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    private int field5027;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Laa;")
    public static class35 field5022;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "[I")
    private int[] field5030;

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 7)
    public class322() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V", line = 12)
    public final void method1649(int arg0) {
        super.method1649(-119);
        this.field5030 = null;
        int var2 = -102 / ((-arg0 - 79) / 34);
        field5031++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILkh;I)V", line = 26)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg2 >= 51) {
            field5032++;
            if (arg0 == 0) {
                this.field5026 = arg1.method1151(-110);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILl;)V", line = 41)
    public static final void method2191(int arg0, class133 arg1) {
        class176.field2666 = class121.method882(arg1, class339.field5301, (byte) -128, 0);
        class244.field3907 = class337.method2339(-40, arg1, class258.field4041, 0);
        field5028++;
        class200.field3002 = class337.method2339(-52, arg1, class58.field937, 0);
        class7.field93 = class337.method2339(arg0 + 19532, arg1, class90.field1443, 0);
        class337.field5276 = class337.method2339(-34, arg1, class238.field3781, 0);
        class314.field4876 = class337.method2339(-34, arg1, class204.field3071, 0);
        class39.field600 = class337.method2339(-122, arg1, class188.field2811, 0);
        class226.field3593 = class154.method1058(0, (byte) 40, arg1, class316.field4935);
        class111.field1721 = class23.method227((byte) -117, arg1, 0, class150.field2270);
        class288.field4493 = class23.method227((byte) 109, arg1, 0, class181.field2729);
        class240.field3842 = class213.method1501(127, 0, class131.field2061, arg1);
        class78.field1251 = class213.method1501(127, 0, class212.field3227, arg1);
        class112.field1736.method2242(class78.field1251, (int[]) null);
        class233.field3723.method2242(class78.field1251, (int[]) null);
        class344.field5343.method2242(class78.field1251, (int[]) null);
        if (class94.field1516) {
            class6.field80 = class278.method1911(arg1, class344.field5337, 0, false);
            for (int var2 = 0; var2 < class6.field80.length; var2++) {
                class6.field80[var2].method1205();
            }
        }
        class249 var3 = class234.method1646(class222.field3542, 0, arg1, false);
        var3.method1711();
        if (class94.field1516) {
            class284.field4421 = new class86(var3);
        } else {
            class284.field4421 = var3;
        }
        class249[] var4 = class121.method882(arg1, class32.field460, (byte) -128, 0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1711();
        }
        if (class94.field1516) {
            class193.field2886 = new class270[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class193.field2886[var6] = new class86(var4[var6]);
            }
        } else {
            class193.field2886 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        if (arg0 != -19605) {
            return;
        }
        int var8 = (int) (Math.random() * 41.0D) - 20;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        for (int var11 = 0; var11 < class176.field2666.length; var11++) {
            class176.field2666[var11].method1720(var7 + var8, var8 + var10, var9 + var8);
        }
        if (class94.field1516) {
            class17.field242 = new class270[class176.field2666.length];
            for (int var12 = 0; var12 < class176.field2666.length; var12++) {
                class17.field242[var12] = new class86(class176.field2666[var12]);
            }
        } else {
            class17.field242 = class176.field2666;
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Z", line = 141)
    private final boolean method2192(int arg0) {
        field5019++;
        if (arg0 != 32179) {
            field5024 = 51;
        }
        if (this.field5030 != null) {
            return true;
        } else if (this.field5026 < 0) {
            return false;
        } else {
            int var2 = class105.field1630;
            int var3 = class75.field1213;
            int var4 = class89.field1431.method574(0, this.field5026).field4748 ? 64 : 128;
            this.field5030 = class89.field1431.method573(var4, this.field5026, 1.0F, false, var4, true);
            this.field5027 = var4;
            this.field5025 = var4;
            class80.method577(var3, 0, var2);
            return this.field5030 != null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V", line = 179)
    public static void method2193(byte arg0) {
        if (arg0 >= -106) {
            field5024 = -55;
        }
        field5022 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[[I", line = 199)
    public final int[][] method249(int arg0, byte arg1) {
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (arg1 != 51) {
            this.field5027 = -72;
        }
        if (this.field5232.field2446 && this.method2192(32179)) {
            int var4 = this.field5025 * (class75.field1213 == this.field5027 ? arg0 : this.field5027 * arg0 / class75.field1213);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class105.field1630 == this.field5025) {
                for (int var8 = 0; var8 < class105.field1630; var8++) {
                    int var9 = this.field5030[var4++];
                    var7[var8] = class270.method1860(var9 << 4, 4080);
                    var6[var8] = class270.method1860(var9, 65280) >> 4;
                    var5[var8] = class270.method1860(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class105.field1630; var10++) {
                    int var11 = this.field5025 * var10 / class105.field1630;
                    int var12 = this.field5030[var4 + var11];
                    var7[var10] = class270.method1860(var12 << 4, 4080);
                    var6[var10] = class270.method1860(var12, 65280) >> 4;
                    var5[var10] = class270.method1860(16711680, var12) >> 12;
                }
            }
        }
        field5021++;
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)I", line = 267)
    public final int method2194(byte arg0) {
        field5020++;
        return arg0 == 112 ? this.field5026 : 11;
    }
}
