import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class14 extends class31 {

    @OriginalMember(owner = "mapview!h", name = "x", descriptor = "La;")
    public static class1 field125 = class3.method36("Estate Agent", -88);

    @OriginalMember(owner = "mapview!h", name = "C", descriptor = "La;")
    public static class1 field129 = class3.method36("Agility Training", -103);

    @OriginalMember(owner = "mapview!h", name = "z", descriptor = "La;")
    public static class1 field127 = class3.method36("(U", -127);

    @OriginalMember(owner = "mapview!h", name = "E", descriptor = "La;")
    public static class1 field131 = class3.method36("Windmill", -82);

    @OriginalMember(owner = "mapview!h", name = "D", descriptor = "La;")
    public static class1 field130 = class3.method36("null", -100);

    @OriginalMember(owner = "mapview!h", name = "B", descriptor = "Ljava/awt/Image;")
    public static Image field128;

    @OriginalMember(owner = "mapview!h", name = "y", descriptor = "[I")
    public static int[] field126;

    @OriginalMember(owner = "mapview!h", name = "w", descriptor = "[Lh;")
    public static class14[] field124;

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "([BZZZ)V", line = 5)
    private class14(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method71(arg3, (byte) -96, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Z[La;II)V", line = 16)
    public static final void method69(boolean arg0, class1[] arg1, int arg2, int arg3) {
        if (arg0) {
            if (arg2 == 1) {
                arg1[0].method25(-67);
            } else {
                class1.method24(arg3, arg2, -115, arg1).method25(-61);
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(B)V", line = 34)
    public static void method70(byte arg0) {
        field131 = null;
        field124 = null;
        field126 = null;
        field128 = null;
        field125 = null;
        field130 = null;
        field127 = null;
        if (arg0 >= 28) {
            field129 = null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "([BZZ)V", line = 55)
    public class14(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ZBLjava/io/DataInputStream;)V", line = 68)
    private final void method71(boolean arg0, byte arg1, DataInputStream arg2) throws IOException {
        if (arg0) {
        }
        int var4 = arg2.read();
        int var5 = arg2.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class39 var7 = new class39(var5 + 5);
        var7.method251(false, var4);
        var7.method252(var6, -10914);
        arg2.readFully(var7.field497, var7.field493, var5);
        this.method203(var7.field497, 0);
        for (int var8 = 0; ~super.field430 < ~var8; ++var8) {
            int var9 = arg2.read();
            int var10 = arg2.readInt();
            int var11 = var10;
            if (var9 != 0) {
                var10 += 4;
            }
            class39 var12 = new class39(var10 + 5);
            var12.method251(false, var9);
            var12.method252(var11, -10914);
            while (~var10 < -33554433) {
                arg2.readFully(var12.field497, var12.field493, 33554432);
                var12.field493 += 33554432;
                var10 -= 33554432;
            }
            arg2.readFully(var12.field497, var12.field493, var10);
            if (!super.field435) {
                super.field432[super.field439[var8]] = class36.method232(var12.field497, false, (byte) 121);
            } else {
                super.field432[super.field439[var8]] = var12.field497;
            }
        }
        if (arg1 >= -5) {
            field127 = (class1) null;
        }
    }
}
