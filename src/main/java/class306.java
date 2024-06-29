import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class306 extends class23 {

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    private int field5122 = 4096;

    @OriginalMember(owner = "client!si", name = "mb", descriptor = "I")
    private int field5134 = 4096;

    @OriginalMember(owner = "client!si", name = "lb", descriptor = "I")
    private int field5133 = 4096;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
    public static int field5126 = 0;

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "Lqd;")
    public static class40 field5128 = class147.method1106("1", (byte) -106);

    @OriginalMember(owner = "client!si", name = "ob", descriptor = "Lqd;")
    public static class40 field5136 = class147.method1106("::rebuild", (byte) -88);

    @OriginalMember(owner = "client!si", name = "jb", descriptor = "I")
    public static int field5131 = -1;

    @OriginalMember(owner = "client!si", name = "nb", descriptor = "Lpe;")
    public static class95 field5135 = new class95();

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!si", name = "hb", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!si", name = "ib", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "Lce;")
    public static class239 field5127;

    @OriginalMember(owner = "client!si", name = "pb", descriptor = "Lce;")
    public static class239 field5137;

    @OriginalMember(owner = "client!si", name = "kb", descriptor = "Lwd;")
    public static class75 field5132;

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 7)
    public class306() {
        super(1, false);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[[I", line = 15)
    public final int[][] method17(int arg0, int arg1) {
        field5125++;
        if (arg0 <= 30) {
            this.method23(-86, 33, (class26) null);
        }
        int[][] var3 = this.field417.method1251(arg1, 122);
        if (this.field417.field2751) {
            int[][] var4 = this.method173(0, arg1, (byte) -103);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[1];
            int[] var8 = var4[0];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class52.field1007; var11++) {
                int var12 = var8[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var13 == var14) {
                    var9[var11] = this.field5122 * var12 >> 12;
                    var7[var11] = this.field5134 * var13 >> 12;
                    var10[var11] = this.field5133 * var14 >> 12;
                } else {
                    var9[var11] = this.field5122;
                    var7[var11] = this.field5134;
                    var10[var11] = this.field5133;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILsd;)V", line = 86)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg1 != 0) {
            method2092((byte) 107);
        }
        if (arg0 == 0) {
            this.field5122 = arg2.method197(-1);
        } else if (arg0 == 1) {
            this.field5134 = arg2.method197(-1);
        } else if (arg0 == 2) {
            this.field5133 = arg2.method197(arg1 - 1);
        }
        field5129++;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)V", line = 135)
    public static final void method2090(int arg0, int arg1, int arg2) {
        class307.field5140++;
        field5121++;
        class19.field295.method1464(arg1, 0);
        class19.field295.method200(arg0, (byte) -119);
        class19.field295.method191(arg2, arg1 ^ 0xFFFFFFD1);
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V", line = 151)
    public static void method2091(int arg0) {
        field5128 = null;
        field5137 = null;
        field5127 = null;
        field5132 = null;
        if (arg0 != 10137) {
            field5132 = (class75) null;
        }
        field5135 = null;
        field5136 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V", line = 179)
    public static final void method2092(byte arg0) {
        for (int var1 = 0; var1 < class275.field4581; var1++) {
            class214 var2 = class62.method514(var1, 16);
            if (var2 != null && var2.field3587 == 0) {
                class243.field4015[var1] = 0;
                class192.field3098[var1] = 0;
            }
        }
        if (arg0 >= -48) {
            field5136 = (class40) null;
        }
        class7.field100 = new class199(16);
        field5120++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIII)V", line = 222)
    public static final void method2093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5124++;
        if (arg6 == arg7) {
            class254.method1789(arg0, (byte) 28, arg6, arg2, arg5, arg1, arg4);
            return;
        }
        if (arg3 <= 90) {
            method2094(-59, -49, (class239) null);
        }
        if ((arg0 - arg6) >= class125.field2164 && arg0 + arg6 <= class48.field941 && class220.field3664 <= (arg5 - arg7) && class72.field1275 >= (arg5 + arg7)) {
            class185.method1342(arg5, arg2, arg6, arg0, arg1, arg7, arg4, 743906408);
        } else {
            class204.method1435(arg0, arg1, arg6, arg7, arg5, arg4, 27346, arg2);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILce;)Lmm;", line = 246)
    public static final class249 method2094(int arg0, int arg1, class239 arg2) {
        if (arg1 == -832020500) {
            field5123++;
            return class178.method1311(arg0, arg2, (byte) 99) ? class288.method1995((byte) 120) : null;
        } else {
            return (class249) null;
        }
    }
}
