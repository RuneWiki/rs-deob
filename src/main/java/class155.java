import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class155 extends class287 {

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field2668 = -1;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Lmh;")
    public static class128 field2674 = class22.method156(122, ":trade:");

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Ldj;")
    public static class314 field2675;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V", line = 46)
    public static final void method1029(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method1030((byte) -107);
        }
        field2667++;
        class296 var3 = class221.field3888[class133.field2315][arg0][arg1];
        if (var3 == null) {
            class217.method1494(class133.field2315, arg0, arg1);
            return;
        }
        class89 var4 = null;
        int var5 = -99999999;
        for (class89 var6 = (class89) var3.method2024(0); var6 != null; var6 = (class89) var3.method2027(arg2 + 1211754409)) {
            class200 var7 = class180.method1226(false, var6.field1520.field3586);
            int var8 = var7.field3534;
            if (var7.field3497 == 1) {
                var8 = (var6.field1520.field3590 + 1) * var8;
            }
            if (var8 > var5) {
                var4 = var6;
                var5 = var8;
            }
        }
        if (var4 == null) {
            class217.method1494(class133.field2315, arg0, arg1);
            return;
        }
        var3.method2022(-117, var4);
        class89 var9 = (class89) var3.method2024(arg2 + 1);
        class203 var10 = null;
        class203 var11 = null;
        while (var9 != null) {
            class203 var12 = var9.field1520;
            if (var4.field1520.field3586 != var12.field3586) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field3586 != var12.field3586 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class89) var3.method2027(arg2 + 1211754409);
        }
        long var13 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class205.method1417(class133.field2315, arg0, arg1, class64.method427(arg0 * 128 + 64, arg1 * 128 - -64, class133.field2315, (byte) 103), var4.field1520, var13, var10, var11);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 132)
    public class155() {
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V", line = 134)
    public class155(int arg0) {
        this.field2672 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 144)
    public static void method1030(byte arg0) {
        field2674 = null;
        if (arg0 != -65) {
            field2671 = 12;
        }
        field2675 = null;
    }
}
