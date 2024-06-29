import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class628 extends class378 {

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "F")
    public float field8870;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "F")
    public float field8873;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "F")
    public float field8875;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "F")
    public float field8876;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "F")
    public float field8877;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "F")
    public float field8879;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "F")
    public float field8880;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "F")
    public float field8885;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "F")
    public float field8886;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "F")
    public float field8895;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "F")
    public float field8896;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "F")
    public float field8897;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "J")
    public static long field8869;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(III[I)V", line = 4)
    public final void method1965(int arg0, int arg1, int arg2, int[] arg3) {
        field8894++;
        arg3[2] = (int) ((float) arg2 * this.field8895 + (float) arg0 * this.field8876 + (float) arg1 * this.field8897);
        arg3[1] = (int) ((float) arg2 * this.field8886 + (float) arg0 * this.field8880 + (float) arg1 * this.field8875);
        arg3[0] = (int) ((float) arg2 * this.field8877 + (float) arg0 * this.field8896 + (float) arg1 * this.field8870);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(III[I)V", line = 14)
    public final void method1961(int arg0, int arg1, int arg2, int[] arg3) {
        field8893++;
        int var5 = (int) ((float) arg1 - this.field8885);
        int var6 = (int) ((float) arg0 - this.field8873);
        int var7 = (int) ((float) arg2 - this.field8879);
        arg3[1] = (int) ((float) var7 * this.field8897 + (float) var5 * this.field8875 + (float) var6 * this.field8870);
        arg3[2] = (int) ((float) var7 * this.field8895 + (float) var5 * this.field8886 + (float) var6 * this.field8877);
        arg3[0] = (int) ((float) var7 * this.field8876 + (float) var5 * this.field8880 + (float) var6 * this.field8896);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 32)
    public final void method1937(int arg0) {
        field8892++;
        float var2 = class776.field10701[arg0 & 0x3FFF];
        float var3 = class776.field10704[arg0 & 0x3FFF];
        float var4 = this.field8896;
        float var5 = this.field8870;
        float var6 = this.field8877;
        this.field8896 = this.field8876 * var3 + var2 * var4;
        float var7 = this.field8873;
        this.field8876 = this.field8876 * var2 - var3 * var4;
        this.field8870 = this.field8897 * var3 + var2 * var5;
        this.field8877 = this.field8895 * var3 + var2 * var6;
        this.field8897 = this.field8897 * var2 - (var3 * var5);
        this.field8895 = this.field8895 * var2 - var3 * var6;
        this.field8873 = this.field8879 * var3 + var2 * var7;
        this.field8879 = this.field8879 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V", line = 59)
    public final void method1939(int arg0) {
        this.field8875 = 1.0F;
        field8883++;
        this.field8896 = this.field8895 = class776.field10701[arg0 & 0x3FFF];
        this.field8877 = class776.field10704[arg0 & 0x3FFF];
        this.field8870 = this.field8873 = this.field8880 = this.field8886 = this.field8885 = this.field8897 = this.field8879 = 0.0F;
        this.field8876 = -this.field8877;
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)Z", line = 71)
    public static final boolean method3595(int arg0) {
        field8890++;
        return class420.field5909 == arg0 ? class76.field1020.method753((byte) 34) : true;
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V", line = 84)
    public final void method1940(int arg0) {
        this.field8895 = 1.0F;
        field8871++;
        this.field8896 = this.field8875 = class776.field10701[arg0 & 0x3FFF];
        this.field8880 = class776.field10704[arg0 & 0x3FFF];
        this.field8870 = -this.field8880;
        this.field8877 = this.field8873 = this.field8886 = this.field8885 = this.field8876 = this.field8897 = this.field8879 = 0.0F;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V", line = 99)
    public final void method1952(int arg0, int arg1, int arg2) {
        field8874++;
        this.field8879 += arg2;
        this.field8885 += arg1;
        this.field8873 += arg0;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V", line = 111)
    public final void method1966(int arg0) {
        this.field8896 = 1.0F;
        field8884++;
        this.field8875 = this.field8895 = class776.field10701[arg0 & 0x3FFF];
        this.field8897 = class776.field10704[arg0 & 0x3FFF];
        this.field8886 = -this.field8897;
        this.field8870 = this.field8877 = this.field8873 = this.field8880 = this.field8885 = this.field8876 = this.field8879 = 0.0F;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([I)V", line = 127)
    public final void method1962(int[] arg0) {
        field8882++;
        float var2 = (float) arg0[0] - this.field8873;
        float var3 = (float) arg0[1] - this.field8885;
        float var4 = (float) arg0[2] - this.field8879;
        arg0[0] = (int) (this.field8876 * var4 + this.field8896 * var2 + this.field8880 * var3);
        arg0[1] = (int) (this.field8897 * var4 + this.field8875 * var3 + this.field8870 * var2);
        arg0[2] = (int) (this.field8895 * var4 + this.field8886 * var3 + this.field8877 * var2);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()V", line = 158)
    public final void method1956() {
        this.field8896 = this.field8875 = this.field8895 = 1.0F;
        field8867++;
        this.field8880 = this.field8876 = this.field8870 = this.field8897 = this.field8877 = this.field8886 = this.field8873 = this.field8885 = this.field8879 = 0.0F;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V", line = 167)
    public final void method1942(int arg0) {
        field8881++;
        float var2 = class776.field10701[arg0 & 0x3FFF];
        float var3 = class776.field10704[arg0 & 0x3FFF];
        float var4 = this.field8896;
        float var5 = this.field8870;
        float var6 = this.field8877;
        float var7 = this.field8873;
        this.field8896 = var2 * var4 - (this.field8880 * var3);
        this.field8880 = this.field8880 * var2 + var3 * var4;
        this.field8870 = var2 * var5 - (this.field8875 * var3);
        this.field8875 = this.field8875 * var2 + var3 * var5;
        this.field8877 = var2 * var6 - (this.field8886 * var3);
        this.field8873 = var2 * var7 - (this.field8885 * var3);
        this.field8886 = this.field8886 * var2 + var3 * var6;
        this.field8885 = this.field8885 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()Leh;", line = 204)
    public final class378 method1951() {
        field8872++;
        class628 var1 = new class628();
        var1.field8870 = this.field8870;
        var1.field8879 = this.field8879;
        var1.field8875 = this.field8875;
        var1.field8873 = this.field8873;
        var1.field8885 = this.field8885;
        var1.field8876 = this.field8876;
        var1.field8896 = this.field8896;
        var1.field8880 = this.field8880;
        var1.field8886 = this.field8886;
        var1.field8895 = this.field8895;
        var1.field8897 = this.field8897;
        var1.field8877 = this.field8877;
        return var1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILrv;)Lfq;", line = 235)
    public static final class211 method3596(int arg0, class120 arg1) {
        field8878++;
        int var2 = arg1.method842(2384);
        class336 var3 = class329.method2126(true)[arg1.method842(2384)];
        class185 var4 = class674.method3822(true)[arg1.method842(2384)];
        int var5 = arg1.method838(true);
        if (arg0 != 2) {
            method3595(-86);
        }
        int var6 = arg1.method838(true);
        int var7 = arg1.method898((byte) -78);
        int var8 = arg1.method898((byte) -98);
        int var9 = arg1.method871(arg0 + 23993);
        int var10 = arg1.method871(23995);
        int var11 = arg1.method871(23995);
        boolean var12 = arg1.method842(2384) == 1;
        return new class211(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V", line = 268)
    public final void method1957(int arg0) {
        field8889++;
        float var2 = class776.field10701[arg0 & 0x3FFF];
        float var3 = class776.field10704[arg0 & 0x3FFF];
        float var4 = this.field8880;
        float var5 = this.field8875;
        float var6 = this.field8886;
        this.field8880 = var2 * var4 - this.field8876 * var3;
        float var7 = this.field8885;
        this.field8876 = this.field8876 * var2 + var3 * var4;
        this.field8875 = var2 * var5 - this.field8897 * var3;
        this.field8897 = this.field8897 * var2 + var3 * var5;
        this.field8886 = var2 * var6 - (this.field8895 * var3);
        this.field8895 = this.field8895 * var2 + var3 * var6;
        this.field8885 = var2 * var7 - (this.field8879 * var3);
        this.field8879 = this.field8879 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[I)V", line = 296)
    public final void method1968(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field8895 + (float) arg0 * this.field8876 + (float) arg1 * this.field8897 + this.field8879);
        arg3[0] = (int) ((float) arg2 * this.field8877 + (float) arg0 * this.field8896 + (float) arg1 * this.field8870 + this.field8873);
        arg3[1] = (int) ((float) arg2 * this.field8886 + (float) arg0 * this.field8880 + (float) arg1 * this.field8875 + this.field8885);
        field8887++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Leh;)V", line = 309)
    public final void method1950(class378 arg0) {
        field8891++;
        class628 var2 = (class628) arg0;
        this.field8873 = var2.field8873;
        this.field8875 = var2.field8875;
        this.field8886 = var2.field8886;
        this.field8880 = var2.field8880;
        this.field8895 = var2.field8895;
        this.field8870 = var2.field8870;
        this.field8897 = var2.field8897;
        this.field8896 = var2.field8896;
        this.field8876 = var2.field8876;
        this.field8879 = var2.field8879;
        this.field8877 = var2.field8877;
        this.field8885 = var2.field8885;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(III)V", line = 331)
    public final void method1959(int arg0, int arg1, int arg2) {
        this.field8885 = arg1;
        this.field8873 = arg0;
        this.field8879 = arg2;
        this.field8880 = this.field8876 = this.field8870 = this.field8897 = this.field8877 = this.field8886 = 0.0F;
        field8868++;
        this.field8896 = this.field8875 = this.field8895 = 1.0F;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V", line = 344)
    public final void method1938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8888++;
        float var7 = class776.field10701[arg3 & 0x3FFF];
        float var8 = class776.field10704[arg3 & 0x3FFF];
        float var9 = class776.field10701[arg4 & 0x3FFF];
        float var10 = class776.field10704[arg4 & 0x3FFF];
        float var11 = class776.field10701[arg5 & 0x3FFF];
        float var12 = class776.field10704[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field8886 = var9 * var13 + var10 * var12;
        this.field8897 = -var8;
        this.field8870 = var7 * var12;
        this.field8895 = var7 * var9;
        this.field8877 = -var10 * var11 + var9 * var14;
        this.field8876 = var7 * var10;
        this.field8880 = -var9 * var12 + var10 * var13;
        this.field8875 = var7 * var11;
        this.field8896 = var9 * var11 + var10 * var14;
        this.field8879 = (float) (-arg0) * this.field8876 - (float) arg1 * this.field8897 - ((float) arg2 * this.field8895);
        this.field8873 = (float) (-arg0) * this.field8896 - (float) arg1 * this.field8870 - ((float) arg2 * this.field8877);
        this.field8885 = (float) (-arg0) * this.field8880 - (float) arg1 * this.field8875 - ((float) arg2 * this.field8886);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 378)
    public class628() {
        this.method1956();
    }
}
