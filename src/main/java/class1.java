import java.awt.Component;
import java.awt.FontMetrics;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class1 extends class29 {

    @OriginalMember(owner = "mapview!aa", name = "B", descriptor = "Lna;")
    public static class26 field3 = class33.method219("Potters Wheel", 115);

    @OriginalMember(owner = "mapview!aa", name = "A", descriptor = "Lna;")
    public static class26 field2 = class33.method219("Herbalist", 94);

    @OriginalMember(owner = "mapview!aa", name = "C", descriptor = "I")
    public static int field4 = 500;

    @OriginalMember(owner = "mapview!aa", name = "E", descriptor = "Lna;")
    public static class26 field6 = class33.method219("Silver Shop", 113);

    @OriginalMember(owner = "mapview!aa", name = "D", descriptor = "Lna;")
    public static class26 field5 = class33.method219("Amulet Shop", 121);

    @OriginalMember(owner = "mapview!aa", name = "F", descriptor = "Lna;")
    public static class26 field7 = class33.method219("Skirt Shop", 86);

    @OriginalMember(owner = "mapview!aa", name = "z", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1;

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "(I)V", line = 11)
    public static void method1(int arg0) {
        field2 = null;
        field6 = null;
        if (arg0 != 0) {
            field4 = -3;
        }
        field7 = null;
        field3 = null;
        field5 = null;
        field1 = null;
    }

    @OriginalMember(owner = "mapview!aa", name = "<init>", descriptor = "([BZZZ)V", line = 25)
    private class1(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method3(new DataInputStream(new ByteArrayInputStream(arg0)), arg3, -1);
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lka;", line = 43)
    public static final class20 method2(Throwable arg0, String arg1) {
        class20 var2;
        if (!(arg0 instanceof class20)) {
            var2 = new class20(arg0, arg1);
        } else {
            var2 = (class20) arg0;
            var2.field216 = var2.field216 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ljava/io/DataInputStream;ZI)V", line = 67)
    private final void method3(DataInputStream arg0, boolean arg1, int arg2) throws IOException {
        if (!arg1) {
        }
        int var4 = arg0.read();
        int var5 = arg0.readInt();
        int var6 = var5;
        if (~var4 != arg2) {
            var5 += 4;
        }
        class40 var7 = new class40(var5 + 5);
        var7.method250(false, var4);
        var7.method249(var6, (byte) -126);
        arg0.readFully(var7.field530, var7.field528, var5);
        this.method199(var7.field530, (byte) 100);
        for (int var8 = 0; var8 < super.field441; ++var8) {
            int var9 = arg0.read();
            int var10 = arg0.readInt();
            int var11 = var10;
            if (var9 != 0) {
                var10 += 4;
            }
            class40 var12 = new class40(var10 + 5);
            var12.method250(false, var9);
            var12.method249(var11, (byte) -126);
            while (var10 > 33554432) {
                arg0.readFully(var12.field530, var12.field528, 33554432);
                var12.field528 += 33554432;
                var10 -= 33554432;
            }
            arg0.readFully(var12.field530, var12.field528, var10);
            if (super.field444) {
                super.field448[super.field450[var8]] = var12.field530;
            } else {
                super.field448[super.field450[var8]] = class20.method115(false, var12.field530, false);
            }
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "<init>", descriptor = "([BZZ)V", line = 124)
    public class1(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 133)
    public static final void method4(byte arg0, Component arg1) {
        arg1.removeMouseListener(class6.field64);
        arg1.removeMouseMotionListener(class6.field64);
        int var2 = -24 / ((arg0 - 23) / 60);
        arg1.removeFocusListener(class6.field64);
        class8.field82 = 0;
    }
}
