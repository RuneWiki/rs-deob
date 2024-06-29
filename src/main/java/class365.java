import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class365 extends class258 {

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
    private int field4468 = -1;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "S")
    public static short field4464 = 32767;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(II)V")
    public static final void method2098(int arg0, int arg1) {
        class766 var2 = class28.field252[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class766 var4 = class28.field252[var3][arg0][arg1] = class28.field252[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class569 var5 = var4.field10431; var5 != null; var5 = var5.field7189) {
                    class620 var6 = var5.field7193;
                    if (var6.field7852 == arg0 && var6.field7844 == arg1) {
                        var6.field2895--;
                    }
                }
                if (var4.field10426 != null) {
                    var4.field10426.field2895--;
                }
                if (var4.field10433 != null) {
                    var4.field10433.field2895--;
                }
                if (var4.field10423 != null) {
                    var4.field10423.field2895--;
                }
                if (var4.field10432 != null) {
                    var4.field10432.field2895--;
                }
                if (var4.field10430 != null) {
                    var4.field10430.field2895--;
                }
            }
        }
        if (class28.field252[0][arg0][arg1] == null) {
            class28.field252[0][arg0][arg1] = new class766(0);
            class28.field252[0][arg0][arg1].field10421 = 1;
        }
        class28.field252[0][arg0][arg1].field10422 = var2;
        class28.field252[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method2099(int arg0, int arg1) {
        field4465++;
        if (arg0 <= 10) {
            return null;
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class659.field8577.method3589(class496.field6338, -22395) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class659.field8579.method3589(class496.field6338, -22395) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILkm;)V")
    public static final void method2100(int arg0, class476 arg1) {
        if (arg1.field6183 != null) {
            arg1.field6183.field3799 = 0;
        }
        arg1.field6182 = false;
        field4467++;
        if (arg0 == 3) {
            for (class476 var2 = arg1.method42(); var2 != null; var2 = arg1.method40()) {
                method2100(3, var2);
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)I")
    public static final int method2101(int arg0) {
        field4463++;
        class570 var1 = class576.field7320;
        boolean var2 = false;
        if (class485.field6252.field6949.method2402(false) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class576.method3099(true, 0, 0, var3, null, null);
        }
        long var4 = class502.method2786(-7114);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method972(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class502.method2786(-7114) - var4);
        var1.method3068(false, 0, 0, arg0, -16777216, 100);
        if (var2) {
            var1.method3072(arg0 ^ 0x61);
        }
        return var7;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLmc;)V")
    public final void method546(byte arg0, class234 arg1) {
        int var3 = -16 / ((7 - arg0) / 41);
        this.field4468 = arg1.method1553((byte) 87);
        field4466++;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lim;B)V")
    public final void method547(class652 arg0, byte arg1) {
        arg0.method3522(1, this.field4468);
        field4460++;
        if (arg1 <= 123) {
            field4464 = -45;
        }
    }
}
