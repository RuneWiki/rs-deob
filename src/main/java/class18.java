import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class18 extends class20 {

    @OriginalMember(owner = "mapview!ja", name = "y", descriptor = "Ll;")
    public static class21 field160 = class28.method185(-20839, "Herbalist");

    @OriginalMember(owner = "mapview!ja", name = "B", descriptor = "I")
    public static int field163 = -1;

    @OriginalMember(owner = "mapview!ja", name = "A", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "mapview!ja", name = "z", descriptor = "[I")
    public static int[] field161;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(ZZLjava/io/DataInputStream;)V", line = 7)
    private final void method79(boolean arg0, boolean arg1, DataInputStream arg2) throws IOException {
        int var4 = arg2.read();
        if (!arg1) {
        }
        int var5 = arg2.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class16 var7 = new class16(var5 + 5);
        var7.method69(var4, (byte) 59);
        var7.method70(-1407639432, var6);
        arg2.readFully(var7.field144, var7.field145, var5);
        this.method93((byte) 113, var7.field144);
        if (arg0) {
            for (int var8 = 0; ~super.field186 < ~var8; ++var8) {
                int var9 = arg2.read();
                int var10 = arg2.readInt();
                int var11 = var10;
                if (~var9 != -1) {
                    var10 += 4;
                }
                class16 var12 = new class16(var10 + 5);
                var12.method69(var9, (byte) 59);
                var12.method70(-1407639432, var11);
                while (33554432 < var10) {
                    arg2.readFully(var12.field144, var12.field145, 33554432);
                    var12.field145 += 33554432;
                    var10 -= 33554432;
                }
                arg2.readFully(var12.field144, var12.field145, var10);
                super.field189[super.field180[var8]] = var12.field144;
            }
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "([BZZZ)V", line = 67)
    private class18(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method79(true, arg3, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Ljava/awt/Component;III)Lma;", line = 77)
    public static final PixMap method80(Component arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field162 = -38;
        }
        try {
            Class var4 = Class.forName("c");
            PixMap var5 = (PixMap) var4.newInstance();
            var5.method78(arg1, arg2 ^ -4726, arg3, arg0);
            return var5;
        } catch (Throwable var8) {
            class17 var7 = new class17();
            var7.method78(arg1, -4726, arg3, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(I)V", line = 131)
    public static void method81(int arg0) {
        field161 = null;
        field160 = null;
        if (arg0 != 4080) {
            method80((Component) null, 94, -67, 120);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "([BZZ)V", line = 145)
    public class18(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }
}
