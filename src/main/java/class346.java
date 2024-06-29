import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public abstract class class346 extends class418 {

    @OriginalMember(owner = "client!qs", name = "F", descriptor = "[Lqs;")
    public class346[] field5171;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Z")
    public boolean field5151;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field5150 = 0;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field5155 = 0;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "Ljava/lang/String;")
    public static String field5159 = null;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!qs", name = "G", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "Lwn;")
    public class215 field5152;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "Lsj;")
    public static class248 field5156;

    @OriginalMember(owner = "client!qs", name = "E", descriptor = "Lhn;")
    public class432 field5170;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5167++;
        int var7 = class400.method2567(class157.field1981, class312.field4602, (byte) -91, arg4);
        int var8 = class400.method2567(class157.field1981, class312.field4602, (byte) 6, arg2);
        int var9 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg6);
        int var10 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg3);
        int var11 = class400.method2567(class157.field1981, class312.field4602, (byte) 127, arg1 + arg4);
        int var12 = class400.method2567(class157.field1981, class312.field4602, (byte) 127, arg2 - arg1);
        for (int var13 = var7; var13 < var11; var13++) {
            class351.method2317(false, var10, class444.field6416[var13], var9, arg0);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class351.method2317(false, var10, class444.field6416[var14], var9, arg0);
        }
        int var15 = class400.method2567(class240.field3368, class136.field1769, (byte) 23, arg1 + arg6);
        int var16 = class400.method2567(class240.field3368, class136.field1769, (byte) -53, arg3 - arg1);
        if (arg5 != -256) {
            method2287(124, 92, -73, 57, -3, -2, -17);
        }
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class444.field6416[var17];
            class351.method2317(false, var15, var18, var9, arg0);
            class351.method2317(false, var10, var18, var16, arg0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public static void method2288(int arg0) {
        field5159 = null;
        if (arg0 != -20748) {
            method2291(71);
        }
        field5156 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIZFII)[I")
    public static final int[] method2289(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5, int arg6, int arg7) {
        field5166++;
        int[] var8 = new int[arg1];
        class211 var9 = new class211();
        var9.field2868 = arg7;
        var9.field2881 = arg0;
        var9.field2864 = arg4;
        var9.field2876 = arg6;
        var9.field2869 = arg2;
        var9.field2883 = (int) (arg5 * 4096.0F);
        var9.method237((byte) -104);
        int var10 = -36 % ((arg3 + 70) / 35);
        class154.method1036((byte) 99, arg1, 1);
        var9.method1376(0, var8, 12718);
        return var8;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public void method1763(byte arg0) {
        if (this.field5151) {
            this.field5152.method1411(66);
            this.field5152 = null;
        } else {
            this.field5170.method2702((byte) 71);
            this.field5170 = null;
        }
        field5163++;
        if (arg0 <= 124) {
            method2287(-59, -62, -119, -19, -103, 58, -36);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
    public void method2290(int arg0, int arg1, int arg2) {
        field5168++;
        int var4 = this.field5165 == 255 ? arg2 : this.field5165;
        if (arg0 != 28666) {
            field5159 = null;
        }
        if (this.field5151) {
            this.field5152 = new class215(var4, arg2, arg1);
        } else {
            this.field5170 = new class432(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
    public static final void method2291(int arg0) {
        if (arg0 != -27281) {
            field5155 = -52;
        }
        class199.field2756 = null;
        class161.field2097 = null;
        class237.field3307 = null;
        class109.field1428 = null;
        class41.field630 = null;
        class237.field3304 = null;
        class181.field2424 = null;
        class193.field2687 = null;
        class112.field1455 = null;
        field5162++;
        class255.field3720 = null;
        class217.field3027 = null;
        class145.field1856 = null;
        class160.field2083 = null;
        class276.field4053 = null;
        class24.field441 = null;
        class13.field206 = null;
        class390.field5706 = null;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)[I")
    public int[] method45(int arg0, int arg1) {
        if (arg1 == 3) {
            field5161++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(Z)I")
    public int method2292(boolean arg0) {
        field5153++;
        if (arg0) {
            method2289(112, -56, 40, -91, false, -0.14828274F, 117, 52);
        }
        return -1;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)[[I")
    public final int[][] method2293(int arg0, int arg1, int arg2) {
        field5154++;
        if (arg1 != 0) {
            return null;
        } else if (this.field5171[arg0].field5151) {
            int[] var4 = this.field5171[arg0].method45(arg2, arg1 + 3);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5171[arg0].method287(arg2, -22);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
    public void method237(byte arg0) {
        if (arg0 < -95) {
            field5160++;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lfb;ZI)V")
    public void method38(class341 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field5169++;
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)I")
    public int method1760(byte arg0) {
        field5158++;
        return arg0 < 19 ? -40 : -1;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)[I")
    public final int[] method2294(byte arg0, int arg1, int arg2) {
        if (arg0 != 54) {
            field5159 = null;
        }
        field5157++;
        return this.field5171[arg2].field5151 ? this.field5171[arg2].method45(arg1, 3) : this.field5171[arg2].method287(arg1, -49)[0];
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(II)[[I")
    public int[][] method287(int arg0, int arg1) {
        if (arg1 >= -3) {
            this.method38((class341) null, false, 29);
        }
        field5164++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IZ)V")
    public class346(int arg0, boolean arg1) {
        this.field5171 = new class346[arg0];
        this.field5151 = arg1;
    }
}
