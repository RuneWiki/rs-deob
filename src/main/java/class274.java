import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class274 {

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
    public static int[] field4818 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lsf;")
    public static class108 field4812 = class140.method973(255, "blinken2:");

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lsf;")
    public static class108 field4821 = class140.method973(255, "<br>(X");

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field4810;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field4819;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field4816;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
    public int[] field4811;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[[B")
    public static byte[][] field4822;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)I", line = 7)
    public static final int method1976(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4817++;
        int var5 = arg0 & 0xF;
        if (arg4 != 31552) {
            method1979((byte) 96);
        }
        int var6 = var5 < 8 ? arg3 : arg2;
        int var7 = var5 < 4 ? arg2 : (var5 == 12 || var5 == 14 ? arg3 : arg1);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 25)
    public static final void method1977(byte arg0) {
        class78.field1193 = 0;
        int var1 = (class95.field1513.field4452 >> 7) + class305.field5295;
        field4820++;
        if (arg0 <= 14) {
            return;
        }
        int var2 = (class95.field1513.field4457 >> 7) + class137.field2421;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class78.field1193 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class78.field1193 = 1;
        }
        if (class78.field1193 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class78.field1193 = 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 51)
    public final void method1978(byte arg0) {
        class28.method189(this.field4811, this.field4819, this.field4810);
        if (arg0 != -105) {
            method1977((byte) -68);
        }
        field4808++;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V", line = 62)
    public static final void method1979(byte arg0) {
        class96.field1554 = new class1();
        field4814++;
        int var1 = 21 / ((arg0 - 70) / 54);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Z", line = 87)
    public static final boolean method1980(int arg0, int arg1) {
        field4807++;
        if (arg0 < 0) {
            return false;
        } else if (arg1 < 72) {
            return false;
        } else {
            int var2 = class305.field5299[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1001;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 110)
    public static final void method1981(int arg0) {
        class291.field5089 = null;
        class223.field3953 = null;
        class51.field740 = null;
        class145.field2624 = null;
        class203.field3664 = null;
        class284.field4971 = null;
        class104.field1813 = null;
        class73.field1109 = null;
        class178.field3230 = null;
        if (arg0 != -9536) {
            method1981(61);
        }
        class298.field5188 = null;
        field4809++;
        class147.field2640 = null;
        class209.field3743 = null;
        class145.field2623 = null;
        class256.field4525 = null;
        class158.field2850 = null;
        class130.field2226 = null;
        class157.field2831 = null;
        class318.field5470 = null;
        class223.field3948 = null;
        class86.field1362 = null;
        class248.field4296 = null;
        class10.field129 = null;
        class270.field4732 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 145)
    protected class274() {
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLlj;)V", line = 151)
    public static final void method1982(byte arg0, class51 arg1) {
        int var2 = -17 % ((arg0 - 77) / 38);
        field4813++;
        class299 var3 = (class299) class36.field494.method1676(arg1.field757.method743(false), (byte) -104);
        if (var3 == null) {
            return;
        }
        if (var3.field5220 != null) {
            class213.field3789.method2186(var3.field5220);
            var3.field5220 = null;
        }
        var3.method1325(0);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 177)
    public static void method1983(int arg0) {
        field4822 = (byte[][]) null;
        field4812 = null;
        if (arg0 != -2504) {
            field4822 = (byte[][]) ((byte[][]) null);
        }
        field4818 = null;
        field4821 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V", line = 194)
    public static final void method1984(int arg0, int arg1, int arg2) {
        class1.field7 = true;
        class199.field3578 = arg0;
        class170.field3045 = arg1;
        class160.field2877 = arg2;
        class242.field4205 = -1;
        class200.field3619 = -1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIILjava/awt/Component;)V")
    public abstract void method263(byte arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method257(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method262(int arg0, Graphics arg1, int arg2, int arg3);
}
