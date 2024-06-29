import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class141 extends class766 {

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field2306 = 0;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Lin;")
    public static class380 field2308 = new class380(110, 7);

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "Lsv;")
    public static class570 field2312 = new class570(68, 3);

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "D")
    public static double field2313;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 12)
    public static final void method1141(byte arg0) {
        field2311++;
        if (class379.field5314 == -1) {
            return;
        }
        int var1 = class754.field10496.method3065(-28062);
        int var2 = class754.field10496.method3066(72);
        class453 var3 = (class453) class397.field5480.method3731((byte) -95);
        if (arg0 != 111) {
            field2308 = null;
        }
        if (var3 != null) {
            var1 = var3.method1873(-122);
            var2 = var3.method1869((byte) -66);
        }
        int var4 = 0;
        int var5 = 0;
        if (class593.field8489) {
            var4 = class45.method342(false);
            var5 = class87.method771(-2);
        }
        class613.method3538(var5, class379.field5314, var2, var5, var2 + var5, class448.field6174 + var5, var4, var1 + var4, var1, -1, var4, var4 + class709.field9923);
        if (class260.field3685 != null) {
            class113.method934(var2 + var5, var1 + var4, 63);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 53)
    public static final void method1142(Canvas arg0, int arg1) {
        field2309++;
        Dimension var2 = arg0.getSize();
        if (arg1 != 0) {
            method1141((byte) 45);
        }
        class747.method4115(var2.height, var2.width, -5321);
        if (class388.field5420 == 1) {
            class390.field5440.method437(arg0, class81.field1198, class278.field4016);
        } else {
            class390.field5440.method437(arg0, class183.field2780, class483.field6679);
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V", line = 71)
    public class141(int arg0, int arg1) {
        this.field2307 = arg0;
        this.field2310 = arg1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 80)
    public static void method1143(int arg0) {
        if (arg0 >= 55) {
            field2308 = null;
            field2312 = null;
        }
    }
}
