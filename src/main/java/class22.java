import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class22 extends class13 {

    @OriginalMember(owner = "mapview!ka", name = "C", descriptor = "Lh;")
    public static class15 field306 = class18.method153("Spinning Wheel", 1);

    @OriginalMember(owner = "mapview!ka", name = "y", descriptor = "I")
    public static int field302 = 0;

    @OriginalMember(owner = "mapview!ka", name = "B", descriptor = "Lh;")
    public static class15 field305 = class18.method153("Clothes Shop", 1);

    @OriginalMember(owner = "mapview!ka", name = "G", descriptor = "Lh;")
    public static class15 field309 = class18.method153("Fur Trader", 1);

    @OriginalMember(owner = "mapview!ka", name = "H", descriptor = "Lh;")
    public static class15 field310 = class18.method153("Furnace", 1);

    @OriginalMember(owner = "mapview!ka", name = "F", descriptor = "Lh;")
    public static class15 field308 = class18.method153("Vegetable Store", 1);

    @OriginalMember(owner = "mapview!ka", name = "A", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "mapview!ka", name = "D", descriptor = "Lka;")
    public static class22 field307;

    @OriginalMember(owner = "mapview!ka", name = "z", descriptor = "[I")
    public static int[] field303;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 15)
    public static final void method180(int arg0, Component arg1) {
        arg1.removeMouseListener(class19.field262);
        arg1.removeMouseMotionListener(class19.field262);
        if (arg0 == 5) {
            arg1.removeFocusListener(class19.field262);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "([BZZZ)V", line = 31)
    private class22(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method182(33554432, new DataInputStream(new ByteArrayInputStream(arg0)), arg3);
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "([BZZ)V", line = 74)
    public class22(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 88)
    public static void method181(int arg0) {
        if (arg0 != 33554432) {
            method181(20);
        }
        field308 = null;
        field310 = null;
        field307 = null;
        field305 = null;
        field309 = null;
        field306 = null;
        field303 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(ILjava/io/DataInputStream;Z)V", line = 107)
    private final void method182(int arg0, DataInputStream arg1, boolean arg2) throws IOException {
        if (arg2) {
        }
        int var4 = arg1.read();
        int var5 = arg1.readInt();
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class19 var7 = new class19(var5 + 5);
        var7.method170(true, var4);
        var7.method159(var6, -126);
        arg1.readFully(var7.field263, var7.field261, var5);
        this.method102(var7.field263, (byte) 125);
        if (arg0 != 33554432) {
            method180(-6, (Component) null);
        }
        for (int var8 = 0; ~super.field197 < ~var8; ++var8) {
            int var9 = arg1.read();
            int var10 = arg1.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class19 var12 = new class19(var10 + 5);
            var12.method170(true, var9);
            var12.method159(var11, 116);
            while (var10 > 33554432) {
                arg1.readFully(var12.field263, var12.field261, 33554432);
                var12.field261 += 33554432;
                var10 -= 33554432;
            }
            arg1.readFully(var12.field263, var12.field261, var10);
            super.field202[super.field193[var8]] = var12.field263;
        }
    }
}
