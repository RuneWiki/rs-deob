import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class284 extends Canvas {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field4880;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lkl;")
    public static class64 field4885 = new class64();

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field4889 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lma;")
    public static class263 field4888;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
    public static int[] field4879;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IJ)Ltl;", line = 5)
    public static final class59 method1986(int arg0, long arg1) {
        field4881++;
        int var3 = 97 / ((arg0 - 9) / 41);
        return class219.method1519(false, arg1, 10, -26661);
    }

    @OriginalMember(owner = "client!rh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 18)
    public final void update(Graphics arg0) {
        field4882++;
        this.field4880.update(arg0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Lsb;", line = 26)
    public static final class165 method1987(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4092; var4++) {
            class165 var5 = var3.field4107[var4];
            if ((var5.field2673 >> 29 & 0x3L) == 2L && var5.field2682 == arg1 && var5.field2670 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)I", line = 48)
    public static final int method1988(byte arg0) {
        field4883++;
        if (class232.field3811 != null) {
            return 3;
        } else if (class55.field815 && class266.field4588) {
            return 2;
        } else if (class55.field815 && !class266.field4588) {
            return 1;
        } else {
            if (arg0 <= 35) {
                field4888 = (class263) null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 73)
    public class284(Component arg0) {
        this.field4880 = arg0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLme;)V", line = 85)
    public static final void method1989(byte arg0, class295 arg1) {
        field4884++;
        class14.field198 = arg1.method2064(124, class189.field3172);
        class37.field561 = arg1.method2064(127, class306.field5181);
        class157.field2570 = arg1.method2064(125, class226.field3645);
        class6.field60 = arg1.method2064(arg0 ^ 0x6A, class243.field4067);
        class275.field4732 = arg1.method2064(123, class235.field3899);
        class43.field642 = arg1.method2064(arg0 + 102, class311.field5281);
        class227.field3665 = arg1.method2064(123, class251.field4182);
        class148.field2428 = arg1.method2064(126, class300.field5126);
        if (arg0 != 18) {
            method1990(-68);
        }
        class113.field1832 = arg1.method2064(125, class296.field5078);
        class8.field104 = arg1.method2064(arg0 + 104, class172.field2836);
        class179.field2926 = arg1.method2064(120, class148.field2423);
        class285.field4896 = arg1.method2064(126, class221.field3585);
        class33.field471 = arg1.method2064(arg0 + 107, class23.field307);
        class20.field259 = arg1.method2064(126, class40.field604);
        class186.field3112 = arg1.method2064(122, class10.field134);
        class295.field5040 = arg1.method2064(120, class20.field274);
        class120.field1999 = arg1.method2064(arg0 + 107, class307.field5201);
        class98.field1575 = arg1.method2064(arg0 ^ 0x6F, class199.field3306);
        class215.field3523 = arg1.method2064(arg0 + 107, class7.field82);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 114)
    public static void method1990(int arg0) {
        if (arg0 >= -12) {
            field4889 = -98;
        }
        field4888 = null;
        field4879 = null;
        field4885 = null;
    }

    @OriginalMember(owner = "client!rh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 131)
    public final void paint(Graphics arg0) {
        field4886++;
        this.field4880.paint(arg0);
    }
}
