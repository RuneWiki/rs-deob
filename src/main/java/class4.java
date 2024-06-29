import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 extends class35 {

    @OriginalMember(owner = "mapview!ba", name = "A", descriptor = "Lea;")
    public static class10 field25 = class3.method8("Fishing Shop", -31);

    @OriginalMember(owner = "mapview!ba", name = "C", descriptor = "Lea;")
    public static class10 field26 = class3.method8("Fishing Spot", 117);

    @OriginalMember(owner = "mapview!ba", name = "F", descriptor = "Lea;")
    public static class10 field29 = class3.method8("Anvil", 114);

    @OriginalMember(owner = "mapview!ba", name = "E", descriptor = "Lea;")
    public static class10 field28 = class3.method8("b12_full", -82);

    @OriginalMember(owner = "mapview!ba", name = "I", descriptor = "I")
    public static int field32 = 0;

    @OriginalMember(owner = "mapview!ba", name = "G", descriptor = "Lea;")
    public static class10 field30 = class3.method8("null", 96);

    @OriginalMember(owner = "mapview!ba", name = "D", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "mapview!ba", name = "H", descriptor = "[I")
    public static int[] field31;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/io/DataInputStream;ZB)V", line = 6)
    private final void method12(DataInputStream arg0, boolean arg1, byte arg2) throws IOException {
        if (arg1) {
        }
        int var4 = arg0.read();
        int var5 = arg0.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class11 var7 = new class11(var5 + 5);
        var7.method81(-938252856, var4);
        var7.method77(var6, true);
        if (arg2 == -125) {
            arg0.readFully(var7.field89, var7.field86, var5);
            this.method240(0, var7.field89);
            for (int var8 = 0; super.field467 > var8; ++var8) {
                int var9 = arg0.read();
                int var10 = arg0.readInt();
                int var11 = var10;
                if (~var9 != -1) {
                    var10 += 4;
                }
                class11 var12 = new class11(var10 - -5);
                var12.method81(-938252856, var9);
                var12.method77(var11, true);
                while (var10 > 33554432) {
                    var10 -= 33554432;
                    arg0.readFully(var12.field89, var12.field86, 33554432);
                    var12.field86 += 33554432;
                }
                arg0.readFully(var12.field89, var12.field86, var10);
                if (!super.field475) {
                    super.field476[super.field481[var8]] = class8.method35(false, var12.field89, (byte) -19);
                } else {
                    super.field476[super.field481[var8]] = var12.field89;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "([BZZ)V", line = 69)
    public class4(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I[B)Lt;", line = 73)
    public static final class37 method13(int arg0, byte[] arg1) {
        if (arg1 != null) {
            class37 var2 = new class37(arg1, field31, class6.field43, class19.field208, class19.field209, class33.field443, mapview.field338);
            int var3 = -61 % ((arg0 - 37) / 42);
            class14.method101(16267);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 99)
    public static void method14(int arg0) {
        field31 = null;
        field29 = null;
        field30 = null;
        field25 = null;
        field26 = null;
        field28 = null;
        if (arg0 != 0) {
            method15((Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "([BZZZ)V", line = 113)
    private class4(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method12(new DataInputStream(new ByteArrayInputStream(arg0)), arg3, (byte) -125);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqa;", line = 127)
    public static final class32 method15(Throwable arg0, String arg1) {
        class32 var2;
        if (!(arg0 instanceof class32)) {
            var2 = new class32(arg0, arg1);
        } else {
            var2 = (class32) arg0;
            var2.field440 = var2.field440 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I[BI)I", line = 163)
    public static final int method16(int arg0, byte[] arg1, int arg2) {
        if (arg2 >= -84) {
            method13(-7, (byte[]) null);
        }
        return class39.method250(arg1, 0, arg0, 99);
    }
}
