import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class42 extends class21 {

    @OriginalMember(owner = "client!d", name = "U", descriptor = "Z")
    private boolean field806 = true;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Z")
    private boolean field801 = true;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "Ljava/lang/String;")
    public static String field807 = "purple:";

    @OriginalMember(owner = "client!d", name = "R", descriptor = "Lth;")
    public static class55 field803 = new class55();

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "[I")
    public static int[] field811 = new int[100];

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field810 = "Loaded world list data";

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "Z")
    public static boolean field812 = false;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IB)[[I", line = 9)
    public final int[][] method175(int arg0, byte arg1) {
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532) {
            int[][] var4 = this.method173(0, this.field801 ? class204.field3323 - arg0 : arg0, (byte) 77);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field806) {
                for (int var12 = 0; var12 < class294.field4489; var12++) {
                    var8[var12] = var5[class4.field108 - var12];
                    var9[var12] = var6[class4.field108 - var12];
                    var10[var12] = var7[class4.field108 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class294.field4489; var11++) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            }
        }
        if (arg1 < 16) {
            return (int[][]) ((int[][]) null);
        } else {
            field802++;
            return var3;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V", line = 70)
    public static final void method317(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field799++;
        class2 var5 = class212.method1433(arg3, 8, arg4 ^ 0xFFFF8817);
        var5.method13((byte) -1);
        var5.field43 = arg0;
        var5.field39 = arg2;
        var5.field32 = arg1;
        if (arg4 != 16897) {
            method319(0, -126, -100);
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(B)V", line = 86)
    public static void method318(byte arg0) {
        if (arg0 >= -13) {
            method320((byte) -58);
        }
        field803 = null;
        field811 = null;
        field807 = null;
        field810 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)Lrf;", line = 107)
    public static final class79 method319(int arg0, int arg1, int arg2) {
        if (arg1 > -111) {
            return (class79) null;
        }
        field808++;
        class79 var3 = new class79();
        for (class328 var4 = (class328) class50.field1013.method306(0); var4 != null; var4 = (class328) class50.field1013.method300(1)) {
            if (var4.field5016 && var4.method2269(arg2, arg0, 1)) {
                var3.method578(-126, var4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(B)V", line = 137)
    public static final void method320(byte arg0) {
        field809++;
        class141 var1 = class95.field1710;
        synchronized (class95.field1710) {
            class335.field5140 = class75.field1528;
            class298.field4530++;
            if (arg0 != -82) {
                method318((byte) 79);
            }
            class120.field2083 = class90.field1667;
            class9.field196 = class260.field4047;
            class187.field3036 = class156.field2531;
            class215.field3441 = class6.field138;
            class72.field1510 = class38.field740;
            class70.field1481 = class23.field460;
            class156.field2531 = 0;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I", line = 173)
    public final int[] method177(int arg0, int arg1) {
        field804++;
        int var3 = -19 % ((33 - arg0) / 36);
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int[] var5 = this.method171(0, -51, this.field801 ? class204.field3323 - arg1 : arg1);
            if (this.field806) {
                for (int var6 = 0; var6 < class294.field4489; var6++) {
                    var4[var6] = var5[class4.field108 - var6];
                }
            } else {
                class129.method853(var5, 0, var4, 0, class294.field4489);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 280)
    public class42() {
        super(1, false);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILag;)V", line = 222)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field805++;
        if (arg0 != -318) {
            this.method175(-57, (byte) -80);
        }
        if (arg1 == 0) {
            this.field806 = arg2.method1317((byte) -117) == 1;
        } else if (arg1 == 1) {
            this.field801 = arg2.method1317((byte) -76) == 1;
        } else if (arg1 == 2) {
            this.field444 = arg2.method1317((byte) -91) == 1;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V", line = 270)
    public static final void method321(String arg0, int arg1, int arg2, String arg3) {
        field800++;
        if (arg2 == 1) {
            class234.method1557((String) null, arg3, arg0, arg1, 51, -1);
        }
    }
}
