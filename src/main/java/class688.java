import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class688 extends class665 {

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public int field9684;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    public int field9691;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "Z")
    public static boolean field9686 = false;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([[[Lbt;B)V", line = 7)
    public static final void method3792(class40[][][] arg0, byte arg1) {
        if (arg1 > -43) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class40[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class40 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field663 instanceof class614) {
                            ((class614) var6.field663).method1174(-24082);
                        }
                        if (var6.field665 instanceof class614) {
                            ((class614) var6.field665).method1174(-24082);
                        }
                        if (var6.field662 instanceof class614) {
                            ((class614) var6.field662).method1174(-24082);
                        }
                        if (var6.field658 instanceof class614) {
                            ((class614) var6.field658).method1174(-24082);
                        }
                        if (var6.field669 instanceof class614) {
                            ((class614) var6.field669).method1174(-24082);
                        }
                        for (class106 var7 = var6.field671; var7 != null; var7 = var7.field1641) {
                            class454 var8 = var7.field1638;
                            if (var8 instanceof class614) {
                                ((class614) var8).method1174(-24082);
                            }
                        }
                    }
                }
            }
        }
        field9687++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIZ)Z", line = 81)
    public static final boolean method3793(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field9689++;
            return class695.method3875(arg1, 256, arg0) | (arg1 & 0x40000) != 0 || class352.method2161(arg1, true, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II)V", line = 97)
    public class688(int arg0, int arg1) {
        this.field9684 = arg1;
        this.field9691 = arg0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ldg;Lqm;B)Ld;", line = 106)
    public static final class135 method3794(class376 arg0, class129 arg1, byte arg2) {
        if (arg2 != 38) {
            method3794(null, null, (byte) 41);
        }
        field9685++;
        class135 var3 = class318.method1997((byte) 101);
        var3.field1984 = arg0;
        var3.field1979 = arg0.field5354;
        if (var3.field1979 == -1) {
            var3.field1978 = new class26(260);
        } else if (var3.field1979 == -2) {
            var3.field1978 = new class26(10000);
        } else if (var3.field1979 <= 18) {
            var3.field1978 = new class26(20);
        } else if (var3.field1979 <= 98) {
            var3.field1978 = new class26(100);
        } else {
            var3.field1978 = new class26(260);
        }
        var3.field1978.method319(255, arg1);
        var3.field1978.method316((byte) -74, var3.field1984.method2264(8));
        var3.field1980 = 0;
        return var3;
    }
}
