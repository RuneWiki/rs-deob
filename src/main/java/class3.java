import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 extends class4 {

    @OriginalMember(owner = "mapview!b", name = "C", descriptor = "Ld;")
    public static class7 field26 = class37.method242("Fishing Shop", 1333943984);

    @OriginalMember(owner = "mapview!b", name = "E", descriptor = "Z")
    public static boolean field28 = false;

    @OriginalMember(owner = "mapview!b", name = "B", descriptor = "Ld;")
    public static class7 field25 = class37.method242("Spice Shop", 1333943984);

    @OriginalMember(owner = "mapview!b", name = "F", descriptor = "Ld;")
    public static class7 field29 = class37.method242("Altar", 1333943984);

    @OriginalMember(owner = "mapview!b", name = "G", descriptor = "I")
    public static int field30 = 0;

    @OriginalMember(owner = "mapview!b", name = "z", descriptor = "Ld;")
    public static class7 field23 = class37.method242("Scimitar Shop", 1333943984);

    @OriginalMember(owner = "mapview!b", name = "A", descriptor = "Ld;")
    public static class7 field24 = class37.method242("Enter place name to find", 1333943984);

    @OriginalMember(owner = "mapview!b", name = "I", descriptor = "Ld;")
    public static class7 field32 = class37.method242("Kebab Seller", 1333943984);

    @OriginalMember(owner = "mapview!b", name = "D", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "mapview!b", name = "H", descriptor = "J")
    public static long field31;

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "([BZZZ)V", line = 5)
    private class3(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method22(arg3, 33554432, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ZILjava/io/DataInputStream;)V", line = 20)
    private final void method22(boolean arg0, int arg1, DataInputStream arg2) throws IOException {
        if (arg1 != 33554432) {
            field25 = (class7) null;
        }
        if (!arg0) {
        }
        int var4 = arg2.read();
        int var5 = arg2.readInt();
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class37 var7 = new class37(var5 - -5);
        var7.method249(var4, -128);
        var7.method239(121, var6);
        arg2.readFully(var7.field505, var7.field509, var5);
        this.method30(8, var7.field505);
        for (int var8 = 0; ~super.field44 < ~var8; ++var8) {
            int var9 = arg2.read();
            int var10 = arg2.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class37 var12 = new class37(var10 + 5);
            var12.method249(var9, arg1 ^ -33554560);
            var12.method239(106, var11);
            while (var10 > 33554432) {
                var10 -= 33554432;
                arg2.readFully(var12.field505, var12.field509, 33554432);
                var12.field509 += 33554432;
            }
            arg2.readFully(var12.field505, var12.field509, var10);
            super.field48[super.field38[var8]] = var12.field505;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(I)V", line = 87)
    public static void method23(int arg0) {
        field29 = null;
        field32 = null;
        if (arg0 == 0) {
            field25 = null;
            field24 = null;
            field23 = null;
            field26 = null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "([BZZ)V", line = 104)
    public class3(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(BLba;II)[Lla;", line = 109)
    public static final class23[] method24(byte arg0, class4 arg1, int arg2, int arg3) {
        if (arg0 != -61) {
            return (class23[]) null;
        } else {
            return class29.method210(115, arg3, arg1, arg2) ? class1.method6(-54) : null;
        }
    }
}
