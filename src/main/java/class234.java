import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class234 extends class183 {

    @OriginalMember(owner = "client!ol", name = "cb", descriptor = "I")
    private int field4055 = 585;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "[[Z")
    public static boolean[][] field4046 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "[I")
    public static int[] field4047 = new int[50];

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "[I")
    public static int[] field4050 = new int[32];

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ol", name = "Y", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ol", name = "Z", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ol", name = "ab", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ol", name = "bb", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BII)V", line = 13)
    public static final void method1672(byte arg0, int arg1, int arg2) {
        field4051++;
        class303 var3 = class105.field1822[class16.field254][arg1][arg2];
        if (var3 == null) {
            class260.method1853(class16.field254, arg1, arg2);
            return;
        }
        if (arg0 < 5) {
            field4050 = (int[]) null;
        }
        class277 var4 = null;
        int var5 = -99999999;
        for (class277 var6 = (class277) var3.method2078(-92); var6 != null; var6 = (class277) var3.method2080(5)) {
            class313 var7 = class113.method799(var6.field4764.field894, (byte) 50);
            int var8 = var7.field5300;
            if (var7.field5298 == 1) {
                var8 = (var6.field4764.field898 + 1) * var8;
            }
            if (var5 < var8) {
                var4 = var6;
                var5 = var8;
            }
        }
        if (var4 == null) {
            class260.method1853(class16.field254, arg1, arg2);
            return;
        }
        var3.method2074(var4, (byte) 98);
        class277 var9 = (class277) var3.method2078(-122);
        class51 var10 = null;
        class51 var11 = null;
        while (var9 != null) {
            class51 var12 = var9.field4764;
            if (var4.field4764.field894 != var12.field894) {
                if (var11 == null) {
                    var11 = var12;
                }
                if (var11.field894 != var12.field894 && var10 == null) {
                    var10 = var12;
                }
            }
            var9 = (class277) var3.method2080(5);
        }
        long var13 = (long) ((arg2 << 7) + arg1 + 1610612736);
        class128.method904(class16.field254, arg1, arg2, class282.method1984((byte) -123, arg2 * 128 + 64, arg1 * 128 + 64, class16.field254), var4.field4764, var13, var11, var10);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(II)[I", line = 111)
    public final int[] method10(int arg0, int arg1) {
        int[] var3 = this.field3161.method664(arg0, arg1 ^ arg1);
        if (this.field3161.field1736) {
            int var4 = class42.field746[arg0];
            for (int var5 = 0; var5 < class22.field393; var5++) {
                int var6 = class97.field1737[var5];
                if (this.field4055 < var6 && 4096 - this.field4055 > var6 && var4 > 2048 - this.field4055 && (this.field4055 + 2048) > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4055);
                    var3[var5] = 4096 - var10;
                } else if ((2048 - this.field4055) < var6 && var6 < (this.field4055 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field4055;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4055);
                } else if (this.field4055 > var4 || var4 > 4096 - this.field4055) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4055;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4055);
                } else if (var6 >= this.field4055 && var6 <= (4096 - this.field4055)) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field4055);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        field4048++;
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 188)
    public class234() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V", line = 192)
    public static void method1673(int arg0) {
        field4047 = null;
        if (arg0 != 4096) {
            method1672((byte) -81, 127, -87);
        }
        field4046 = (boolean[][]) null;
        field4050 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILkh;I)V", line = 219)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4055 = arg1.method116(-1);
        }
        field4054++;
        if (arg0 > -43) {
            this.method10(-76, -65);
        }
    }
}
