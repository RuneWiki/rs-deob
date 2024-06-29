import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 {

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public int field585 = 128;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public int field592 = 128;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "[Z")
    public static boolean[] field587 = new boolean[5];

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "[Z")
    public static boolean[] field591;

    static {
        new class115("", 76);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljn;B)V", line = 3)
    public static final void method366(class668 arg0, byte arg1) {
        if (arg1 <= 4) {
            method366(null, (byte) -88);
        }
        field593++;
        class336.field4467 = arg0.method3804((byte) 127, "p11_full");
        class524.field7694 = arg0.method3804((byte) 112, "p12_full");
        class113.field1454 = arg0.method3804((byte) 84, "b12_full");
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lir;B)V", line = 19)
    public final void method367(class25 arg0, byte arg1) {
        this.field592 = arg0.field592;
        if (arg1 != -71) {
            return;
        }
        this.field585 = arg0.field585;
        field589++;
        this.field584 = arg0.field584;
        this.field586 = arg0.field586;
        this.field583 = arg0.field583;
        this.field594 = arg0.field594;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V", line = 36)
    public static void method368(byte arg0) {
        field587 = null;
        if (arg0 < 119) {
            method366(null, (byte) 83);
        }
        field591 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V", line = 51)
    public static final void method369(int arg0, int arg1, int arg2) {
        if (arg2 <= 124) {
            return;
        }
        field588++;
        int var3 = class12.field205.method553(class424.field6062.method2561(class370.field4980, 0), 54);
        for (class377 var4 = (class377) class34.field679.method1132((byte) 95); var4 != null; var4 = (class377) class34.field679.method1134(8446)) {
            int var8 = class31.method396(var4, 87);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class271.field3704 * 16 + 21;
        int var6 = arg1 - (var3 / 2);
        if ((var3 + var6) > class467.field6533) {
            var6 = class467.field6533 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg0;
        if (class300.field4038 < (var5 + arg0)) {
            var7 = class300.field4038 - var5;
        }
        class22.field548 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class1.field2 = var7;
        class84.field1195 = (class120.field1561 ? 26 : 22) + class271.field3704 * 16;
        class361.field4805 = true;
        class675.field9685 = var3;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I)V", line = 127)
    public class25(int arg0) {
        this.field584 = arg0;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(IIIIII)V", line = 138)
    private class25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field586 = arg3;
        this.field594 = arg4;
        this.field592 = arg1;
        this.field585 = arg2;
        this.field584 = arg0;
        this.field583 = arg5;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)Lir;", line = 112)
    public final class25 method370(byte arg0) {
        if (arg0 > -74) {
            this.field586 = 80;
        }
        field590++;
        return new class25(this.field584, this.field592, this.field585, this.field586, this.field594, this.field583);
    }
}
