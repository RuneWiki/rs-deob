import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class192 extends class23 {

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
    private int field3089 = 4;

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "I")
    private int field3093 = 4;

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "Lo;")
    public static class199 field3091 = new class199(512);

    @OriginalMember(owner = "client!ci", name = "hb", descriptor = "Lqd;")
    public static class40 field3096 = class147.method1106("<col=80ff00>", (byte) -84);

    @OriginalMember(owner = "client!ci", name = "ib", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3097 = Calendar.getInstance();

    @OriginalMember(owner = "client!ci", name = "jb", descriptor = "[I")
    public static int[] field3098 = new int[2500];

    @OriginalMember(owner = "client!ci", name = "lb", descriptor = "Lqd;")
    private static class40 field3100 = class147.method1106("Loaded input handler", (byte) -78);

    @OriginalMember(owner = "client!ci", name = "kb", descriptor = "Lqd;")
    public static class40 field3099 = field3100;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ci", name = "gb", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ci", name = "fb", descriptor = "[Lmm;")
    public static class249[] field3094;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILsd;)V", line = 14)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field3090++;
        if (arg1 != 0) {
            field3096 = (class40) null;
        }
        if (arg0 == 0) {
            this.field3093 = arg2.method226(255);
        } else if (arg0 == 1) {
            this.field3089 = arg2.method226(arg1 ^ 0xFF);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(BLce;)V", line = 58)
    public static final void method1377(byte arg0, class239 arg1) {
        int var2 = 102 % ((arg0 - 36) / 45);
        field3092++;
        class147.field2477 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[[I", line = 71)
    public final int[][] method17(int arg0, int arg1) {
        field3087++;
        int[][] var3 = this.field417.method1251(arg1, 127);
        if (arg0 < 30) {
            field3094 = (class249[]) null;
        }
        if (this.field417.field2751) {
            int var4 = class271.field4497 / this.field3089;
            int var5 = class52.field1007 / this.field3093;
            int[][] var6;
            if (var4 <= 0) {
                var6 = this.method173(0, 0, (byte) -128);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method173(0, class271.field4497 * var7 / var4, (byte) -112);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var3[0];
            int[] var11 = var6[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class52.field1007; var14++) {
                int var15;
                if (var5 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class52.field1007 * var16 / var5;
                }
                var10[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var11[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 139)
    public class192() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)V", line = 149)
    public static void method1378(int arg0) {
        field3098 = null;
        field3100 = null;
        field3097 = null;
        field3099 = null;
        field3094 = null;
        field3096 = null;
        if (arg0 != 2695) {
            field3091 = (class199) null;
        }
        field3091 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)[I", line = 188)
    public final int[] method32(byte arg0, int arg1) {
        if (arg0 != -94) {
            this.method17(-59, 13);
        }
        int[] var3 = this.field403.method724((byte) 118, arg1);
        if (this.field403.field1760) {
            int var4 = class52.field1007 / this.field3093;
            int var5 = class271.field4497 / this.field3089;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method174(0, 0, class271.field4497 * var6 / var5);
            } else {
                var7 = this.method174(0, 0, 0);
            }
            for (int var8 = 0; var8 < class52.field1007; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class52.field1007 * var9 / var4];
                }
            }
        }
        field3088++;
        return var3;
    }
}
