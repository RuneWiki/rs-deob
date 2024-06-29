import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class548 extends class465 {

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Lrda;")
    public static class467 field6848 = new class467(16);

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "F")
    public float field6843;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "F")
    public float field6844;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "F")
    public float field6846;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "F")
    public float field6847;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "F")
    public float field6853;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "F")
    public float field6855;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "F")
    public float field6856;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "F")
    public float field6861;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "F")
    public float field6862;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "F")
    public float field6865;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "F")
    public float field6871;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "F")
    public float field6873;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
    public final void method456(int arg0) {
        field6854++;
        float var2 = class689.field8848[arg0 & 0x3FFF];
        float var3 = class689.field8849[arg0 & 0x3FFF];
        float var4 = this.field6856;
        float var5 = this.field6846;
        float var6 = this.field6873;
        float var7 = this.field6844;
        this.field6856 = var2 * var4 - this.field6865 * var3;
        this.field6846 = var2 * var5 - (this.field6861 * var3);
        this.field6865 = this.field6865 * var2 + var3 * var4;
        this.field6861 = this.field6861 * var2 + var3 * var5;
        this.field6873 = var2 * var6 - (this.field6843 * var3);
        this.field6844 = var2 * var7 - (this.field6862 * var3);
        this.field6843 = this.field6843 * var2 + var3 * var6;
        this.field6862 = this.field6862 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Lai;")
    public static final class217 method2965(int arg0, int arg1) {
        field6872++;
        class217 var2 = (class217) class127.field1672.method2931((long) arg0, (byte) -115);
        if (arg1 != 27923) {
            field6848 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class615.field7806.method139(1, (byte) -94, arg0);
        class217 var4 = new class217();
        var4.field2955 = arg0;
        if (var3 != null) {
            var4.method1427((byte) 94, new class234(var3));
        }
        var4.method1428(127);
        if (var4.field2956 == 2 && class251.field3428.method2616((long) arg0, (byte) 74) == null) {
            class251.field3428.method2619(new class405(class117.field1559), (long) arg0, -1);
            class134.field1778[class117.field1559++] = var4;
        }
        class127.field1672.method2918((long) arg0, var4, 108);
        return var4;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "()V")
    public final void method462() {
        this.field6865 = this.field6853 = this.field6846 = this.field6855 = this.field6873 = this.field6843 = this.field6844 = this.field6862 = this.field6847 = 0.0F;
        this.field6856 = this.field6861 = this.field6871 = 1.0F;
        field6874++;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(III)V")
    public final void method449(int arg0, int arg1, int arg2) {
        this.field6847 = arg2;
        this.field6862 = arg1;
        this.field6865 = this.field6853 = this.field6846 = this.field6855 = this.field6873 = this.field6843 = 0.0F;
        field6866++;
        this.field6856 = this.field6861 = this.field6871 = 1.0F;
        this.field6844 = arg0;
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V")
    public final void method467(int arg0) {
        field6850++;
        float var2 = class689.field8848[arg0 & 0x3FFF];
        float var3 = class689.field8849[arg0 & 0x3FFF];
        float var4 = this.field6865;
        float var5 = this.field6861;
        float var6 = this.field6843;
        float var7 = this.field6862;
        this.field6865 = var2 * var4 - (this.field6853 * var3);
        this.field6861 = var2 * var5 - this.field6855 * var3;
        this.field6853 = this.field6853 * var2 + var3 * var4;
        this.field6843 = var2 * var6 - this.field6871 * var3;
        this.field6855 = this.field6855 * var2 + var3 * var5;
        this.field6862 = var2 * var7 - (this.field6847 * var3);
        this.field6871 = this.field6871 * var2 + var3 * var6;
        this.field6847 = this.field6847 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZBZLoq;Ljava/lang/String;)V")
    public static final void method2966(boolean arg0, byte arg1, boolean arg2, class775 arg3, String arg4) {
        field6857++;
        if (arg1 <= 73) {
            return;
        }
        if (!arg2) {
            class289.method1755(arg3, arg4, false, 3);
            return;
        }
        if (class775.field10561.startsWith("win") && arg3.field10571) {
            String var5 = null;
            if (class80.field1134 != null) {
                var5 = class80.field1134.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class339 var6 = class289.method1755(arg3, arg4, false, 0);
                class308.field3865 = var6;
                class552.field6961 = arg3;
                class266.field3531 = arg4;
                return;
            }
        }
        if (class775.field10561.startsWith("mac")) {
            String var7 = null;
            if (class80.field1134 != null) {
                var7 = class80.field1134.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg0) {
                class289.method1755(arg3, arg4, false, 1);
                return;
            }
        }
        class289.method1755(arg3, arg4, false, 2);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([I)V")
    public final void method447(int[] arg0) {
        field6867++;
        float var2 = (float) arg0[0] - this.field6844;
        float var3 = (float) arg0[1] - this.field6862;
        float var4 = (float) arg0[2] - this.field6847;
        arg0[2] = (int) (this.field6871 * var4 + this.field6873 * var2 + this.field6843 * var3);
        arg0[1] = (int) (this.field6855 * var4 + this.field6861 * var3 + this.field6846 * var2);
        arg0[0] = (int) (this.field6853 * var4 + this.field6865 * var3 + this.field6856 * var2);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIBI)V")
    public static final void method2967(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field6859++;
        if (class596.field7567 != 1) {
            return;
        }
        int var5 = arg0 / class65.field852;
        int var6 = arg4 / class65.field852;
        int var7 = arg2 / class422.field5550;
        int var8 = arg1 / class422.field5550;
        if (var5 >= class66.field867 || var6 < 0 || class449.field5867 <= var7 || var8 < 0) {
            return;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (var6 >= class66.field867) {
            var6 = class66.field867 - 1;
        }
        if (class449.field5867 <= var8) {
            var8 = class449.field5867 - 1;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class679.method3654(class235.field3224 + var9, class449.field5867, -4595) * class66.field867;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = class679.method3654(class5.field58 + var11, class66.field867, -4595) + var10;
                class212.field2921[var12] = class398.field5255;
            }
        }
        if (arg3 >= -77) {
            method2965(-101, -59);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "()Loha;")
    public final class465 method458() {
        field6851++;
        class548 var1 = new class548();
        var1.field6844 = this.field6844;
        var1.field6843 = this.field6843;
        var1.field6865 = this.field6865;
        var1.field6856 = this.field6856;
        var1.field6873 = this.field6873;
        var1.field6861 = this.field6861;
        var1.field6853 = this.field6853;
        var1.field6862 = this.field6862;
        var1.field6847 = this.field6847;
        var1.field6855 = this.field6855;
        var1.field6846 = this.field6846;
        var1.field6871 = this.field6871;
        return var1;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(III[I)V")
    public final void method446(int arg0, int arg1, int arg2, int[] arg3) {
        field6860++;
        arg3[0] = (int) ((float) arg2 * this.field6873 + (float) arg0 * this.field6856 + (float) arg1 * this.field6846 + this.field6844);
        arg3[2] = (int) ((float) arg2 * this.field6871 + (float) arg0 * this.field6853 + (float) arg1 * this.field6855 + this.field6847);
        arg3[1] = (int) ((float) arg2 * this.field6843 + (float) arg0 * this.field6865 + (float) arg1 * this.field6861 + this.field6862);
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)V")
    public final void method463(int arg0) {
        this.field6856 = 1.0F;
        field6852++;
        this.field6861 = this.field6871 = class689.field8848[arg0 & 0x3FFF];
        this.field6855 = class689.field8849[arg0 & 0x3FFF];
        this.field6843 = -this.field6855;
        this.field6846 = this.field6873 = this.field6844 = this.field6865 = this.field6862 = this.field6853 = this.field6847 = 0.0F;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public static void method2968(byte arg0) {
        field6848 = null;
        if (arg0 != 74) {
            field6849 = -2;
        }
    }

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "(I)V")
    public static final void method2969(int arg0) {
        class456.field5972.method2919(arg0);
        field6869++;
    }

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "(I)V")
    public final void method466(int arg0) {
        this.field6871 = 1.0F;
        field6870++;
        this.field6856 = this.field6861 = class689.field8848[arg0 & 0x3FFF];
        this.field6865 = class689.field8849[arg0 & 0x3FFF];
        this.field6873 = this.field6844 = this.field6843 = this.field6862 = this.field6853 = this.field6855 = this.field6847 = 0.0F;
        this.field6846 = -this.field6865;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
    public final void method448(int arg0) {
        field6842++;
        float var2 = class689.field8848[arg0 & 0x3FFF];
        float var3 = class689.field8849[arg0 & 0x3FFF];
        float var4 = this.field6856;
        float var5 = this.field6846;
        float var6 = this.field6873;
        this.field6856 = this.field6853 * var3 + var2 * var4;
        float var7 = this.field6844;
        this.field6846 = this.field6855 * var3 + var2 * var5;
        this.field6853 = this.field6853 * var2 - (var3 * var4);
        this.field6855 = this.field6855 * var2 - var3 * var5;
        this.field6873 = this.field6871 * var3 + var2 * var6;
        this.field6871 = this.field6871 * var2 - var3 * var6;
        this.field6844 = this.field6847 * var3 + var2 * var7;
        this.field6847 = this.field6847 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Loha;)V")
    public final void method468(class465 arg0) {
        field6845++;
        class548 var2 = (class548) arg0;
        this.field6853 = var2.field6853;
        this.field6865 = var2.field6865;
        this.field6862 = var2.field6862;
        this.field6855 = var2.field6855;
        this.field6843 = var2.field6843;
        this.field6847 = var2.field6847;
        this.field6846 = var2.field6846;
        this.field6871 = var2.field6871;
        this.field6844 = var2.field6844;
        this.field6873 = var2.field6873;
        this.field6861 = var2.field6861;
        this.field6856 = var2.field6856;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIII)V")
    public final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6875++;
        float var7 = class689.field8848[arg3 & 0x3FFF];
        float var8 = class689.field8849[arg3 & 0x3FFF];
        float var9 = class689.field8848[arg4 & 0x3FFF];
        float var10 = class689.field8849[arg4 & 0x3FFF];
        float var11 = class689.field8848[arg5 & 0x3FFF];
        float var12 = class689.field8849[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6865 = -var9 * var12 + var10 * var13;
        this.field6861 = var7 * var11;
        this.field6873 = -var10 * var11 + var9 * var14;
        this.field6846 = var7 * var12;
        this.field6843 = var9 * var13 + var10 * var12;
        this.field6871 = var7 * var9;
        this.field6853 = var7 * var10;
        this.field6856 = var9 * var11 + var10 * var14;
        this.field6855 = -var8;
        this.field6862 = (float) (-arg0) * this.field6865 - (float) arg1 * this.field6861 - (float) arg2 * this.field6843;
        this.field6844 = (float) (-arg0) * this.field6856 - (float) arg1 * this.field6846 - ((float) arg2 * this.field6873);
        this.field6847 = (float) (-arg0) * this.field6853 - (float) arg1 * this.field6855 - (float) arg2 * this.field6871;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public final void method454(int arg0) {
        field6863++;
        this.field6861 = 1.0F;
        this.field6856 = this.field6871 = class689.field8848[arg0 & 0x3FFF];
        this.field6873 = class689.field8849[arg0 & 0x3FFF];
        this.field6846 = this.field6844 = this.field6865 = this.field6843 = this.field6862 = this.field6855 = this.field6847 = 0.0F;
        this.field6853 = -this.field6873;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(III[I)V")
    public final void method460(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field6871 + (float) arg0 * this.field6853 + (float) arg1 * this.field6855);
        field6858++;
        arg3[1] = (int) ((float) arg2 * this.field6843 + (float) arg0 * this.field6865 + (float) arg1 * this.field6861);
        arg3[0] = (int) ((float) arg2 * this.field6873 + (float) arg0 * this.field6856 + (float) arg1 * this.field6846);
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
    public class548() {
        this.method462();
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III[I)V")
    public final void method457(int arg0, int arg1, int arg2, int[] arg3) {
        field6864++;
        int var5 = (int) ((float) arg2 - this.field6847);
        int var6 = (int) ((float) arg0 - this.field6844);
        int var7 = (int) ((float) arg1 - this.field6862);
        arg3[0] = (int) ((float) var5 * this.field6853 + (float) var6 * this.field6856 + (float) var7 * this.field6865);
        arg3[1] = (int) ((float) var5 * this.field6855 + (float) var6 * this.field6846 + (float) var7 * this.field6861);
        arg3[2] = (int) ((float) var5 * this.field6871 + (float) var6 * this.field6873 + (float) var7 * this.field6843);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V")
    public final void method450(int arg0, int arg1, int arg2) {
        this.field6847 += arg2;
        this.field6844 += arg0;
        this.field6862 += arg1;
        field6868++;
    }
}
