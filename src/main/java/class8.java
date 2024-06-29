import java.awt.event.ActionEvent;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 extends class1 {

    @OriginalMember(owner = "mapview!da", name = "A", descriptor = "Z")
    public static boolean field91 = false;

    @OriginalMember(owner = "mapview!da", name = "B", descriptor = "[Z")
    public static boolean[] field92 = new boolean[112];

    @OriginalMember(owner = "mapview!da", name = "y", descriptor = "Lna;")
    public static class26 field89 = class6.method40("u_pass", 48);

    @OriginalMember(owner = "mapview!da", name = "z", descriptor = "Lna;")
    public static class26 field90 = class6.method40("Archery Shop", 48);

    @OriginalMember(owner = "mapview!da", name = "C", descriptor = "Ld;")
    public static class7 field93 = new class7();

    @OriginalMember(owner = "mapview!da", name = "G", descriptor = "Lna;")
    public static class26 field97 = class6.method40("???", 48);

    @OriginalMember(owner = "mapview!da", name = "F", descriptor = "Lna;")
    public static class26 field96 = class6.method40("50(U", 48);

    @OriginalMember(owner = "mapview!da", name = "H", descriptor = "I")
    public static int field98 = 500;

    @OriginalMember(owner = "mapview!da", name = "D", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "mapview!da", name = "E", descriptor = "[B")
    public static byte[] field95;

    @OriginalMember(owner = "mapview!da", name = "I", descriptor = "[I")
    public static int[] field99;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Z)B", line = 5)
    public static final byte method50(boolean arg0) {
        if (!arg0) {
            field97 = (class26) null;
        }
        return class23.field238 != null ? class23.field238[class20.field213] : 0;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(II)I", line = 20)
    public static int method51(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "([BZZZ)V", line = 27)
    private class8(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method52(new DataInputStream(new ByteArrayInputStream(arg0)), arg3, -33554433);
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "([BZZ)V", line = 53)
    public class8(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Ljava/io/DataInputStream;ZI)V", line = 73)
    private final void method52(DataInputStream arg0, boolean arg1, int arg2) throws IOException {
        if (arg1) {
        }
        int var4 = arg0.read();
        int var5 = arg0.readInt();
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class10 var7 = new class10(var5 - -5);
        var7.method72(var4, -94);
        if (arg2 != -33554433) {
            method54(false, (byte) 35);
        }
        var7.method62(-2, var6);
        arg0.readFully(var7.field122, var7.field119, var5);
        this.method2(var7.field122, false);
        for (int var8 = 0; super.field1 > var8; ++var8) {
            int var9 = arg0.read();
            int var10 = arg0.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class10 var12 = new class10(var10 + 5);
            var12.method72(var9, -83);
            var12.method62(-2, var11);
            while (~var10 < -33554433) {
                var10 -= 33554432;
                arg0.readFully(var12.field122, var12.field119, 33554432);
                var12.field119 += 33554432;
            }
            arg0.readFully(var12.field122, var12.field119, var10);
            super.field9[super.field15[var8]] = class14.method85(-16, var12.field122, false);
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)I", line = 131)
    public static final int method53(int arg0) {
        if (arg0 != 10735) {
            return 31;
        } else if (class6.field82 != null) {
            return class6.field82.field49 != null ? class34.field436[class6.field82.field49[class20.field213] & 255] : class34.field436[class6.field82.field43 & 255];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(ZB)V", line = 167)
    public static final void method54(boolean arg0, byte arg1) {
        if (class4.field50.field190 != null) {
            for (int var2 = 0; var2 < 50 && null != class4.field50.field190.peekEvent(); ++var2) {
                class23.method135(-24879, 1L);
            }
            int var3 = 121 % ((arg1 - 55) / 52);
            if (arg0) {
                class4.field50.field190.postEvent(new ActionEvent(class4.field44, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(I)V", line = 193)
    public static void method55(int arg0) {
        field95 = null;
        field97 = null;
        field90 = null;
        field92 = null;
        if (arg0 == 4) {
            field89 = null;
            field93 = null;
            field99 = null;
            field96 = null;
        }
    }
}
