import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class20 extends class27 {

    @OriginalMember(owner = "mapview!l", name = "C", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "mapview!l", name = "D", descriptor = "I")
    public static int field228 = -1;

    @OriginalMember(owner = "mapview!l", name = "F", descriptor = "Lia;")
    public static class15 field229 = class28.method196("Loading )3)3)3", false);

    @OriginalMember(owner = "mapview!l", name = "B", descriptor = "Lia;")
    public static class15 field226 = class28.method196("???", false);

    @OriginalMember(owner = "mapview!l", name = "G", descriptor = "Lia;")
    public static class15 field230 = class28.method196("download", false);

    @OriginalMember(owner = "mapview!l", name = "H", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "mapview!l", name = "<init>", descriptor = "([BZZZ)V", line = 3)
    private class20(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method148(new DataInputStream(new ByteArrayInputStream(arg0)), 33554432, arg3);
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(I)V", line = 19)
    public static void method146(int arg0) {
        field229 = null;
        if (arg0 < -24) {
            field226 = null;
            field230 = null;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "<init>", descriptor = "([BZZ)V", line = 40)
    public class20(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B)Lf;", line = 49)
    public static final class9 method147(byte arg0) {
        if (arg0 > -14) {
            field230 = (class15) null;
        }
        try {
            return (class9) Class.forName("e").newInstance();
        } catch (Throwable var2) {
            return new class21();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ljava/io/DataInputStream;IZ)V", line = 67)
    private final void method148(DataInputStream arg0, int arg1, boolean arg2) throws IOException {
        if (arg2) {
        }
        int var4 = arg0.read();
        if (arg1 != 33554432) {
            field230 = (class15) null;
        }
        int var5 = arg0.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class1 var7 = new class1(var5 + 5);
        var7.method9(var4, -268435456);
        var7.method4(var6, (byte) 69);
        arg0.readFully(var7.field4, var7.field1, var5);
        this.method184((byte) -67, var7.field4);
        for (int var8 = 0; var8 < super.field377; ++var8) {
            int var9 = arg0.read();
            int var10 = arg0.readInt();
            int var11 = var10;
            if (var9 != 0) {
                var10 += 4;
            }
            class1 var12 = new class1(var10 - -5);
            var12.method9(var9, -268435456);
            var12.method4(var11, (byte) 69);
            while (~var10 < -33554433) {
                arg0.readFully(var12.field4, var12.field1, 33554432);
                var10 -= 33554432;
                var12.field1 += 33554432;
            }
            arg0.readFully(var12.field4, var12.field1, var10);
            if (super.field380) {
                super.field389[super.field379[var8]] = var12.field4;
            } else {
                super.field389[super.field379[var8]] = class19.method144(18002, var12.field4, false);
            }
        }
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(I)V", line = 127)
    public static final void method149(int arg0) {
        if (class2.field17[0][class2.field16][class36.field503] == null) {
            mapview.field259 = null;
        } else {
            mapview.field259 = class2.field17[0][class2.field16][class36.field503];
        }
        if (class2.field17[1][class2.field16][class36.field503] == null) {
            class39.field515 = null;
        } else {
            class39.field515 = class2.field17[1][class2.field16][class36.field503];
        }
        if (class2.field17[2][class2.field16][class36.field503] != null) {
            class39.field517 = class2.field17[2][class2.field16][class36.field503];
        } else {
            class39.field517 = null;
        }
        if (class2.field17[3][class2.field16][class36.field503] != null) {
            class15.field152 = class2.field17[3][class2.field16][class36.field503];
        } else {
            class15.field152 = null;
        }
        if (class2.field17[4][class2.field16][class36.field503] == null) {
            mapview.field342 = null;
        } else {
            mapview.field342 = class2.field17[4][class2.field16][class36.field503];
        }
        if (class19.field222[class2.field16][class36.field503] != null) {
            class12.field101 = class19.field222[class2.field16][class36.field503];
        } else {
            class12.field101 = null;
        }
        if (class26.field370[class2.field16][class36.field503] != null) {
            class6.field55 = class26.field370[class2.field16][class36.field503];
        } else {
            class6.field55 = null;
        }
        if (arg0 > -108) {
            method149(-20);
        }
        if (class36.field499[class2.field16][class36.field503] == null) {
            class17.field178 = null;
        } else {
            class17.field178 = class36.field499[class2.field16][class36.field503];
        }
    }
}
