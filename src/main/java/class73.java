import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class73 extends class82 {

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "La;")
    private static class1 field1787 = class113.method934(-11538, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "La;")
    public static class1 field1788 = class113.method934(-11538, "Fertigkeit)2");

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "La;")
    public static class1 field1789 = class113.method934(-11538, "Mem:");

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "La;")
    private static class1 field1790 = class113.method934(-11538, "Loaded update list");

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "La;")
    public static class1 field1785 = field1790;

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "[I")
    public static int[] field1791 = new int[200];

    @OriginalMember(owner = "client!ma", name = "mb", descriptor = "La;")
    public static class1 field1792 = field1787;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "Lwc;")
    public static class134 field1783;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "La;")
    public class1 field1784;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 36)
    public static void method685(int arg0) {
        field1783 = null;
        field1792 = null;
        field1791 = null;
        field1788 = null;
        field1789 = null;
        if (arg0 == 63) {
            field1787 = null;
            field1790 = null;
            field1785 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B[BII)Z", line = 76)
    public static final boolean method686(byte arg0, byte[] arg1, int arg2, int arg3) {
        field1786++;
        boolean var4 = true;
        class8 var5 = new class8(arg1);
        int var6 = -1;
        if (arg0 > -40) {
            return false;
        }
        label54: while (true) {
            int var7 = var5.method179((byte) -94);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method179((byte) -114);
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var5.method145(false) >> 2;
                    int var14 = var8 >> 6 & 0x3F;
                    int var15 = var14 + arg2;
                    int var16 = var12 + arg3;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class49 var17 = class32.method390(var6, (byte) 127);
                        if (var13 != 22 || !class93.field2335 || var17.field1331 != 0 || var17.field1332) {
                            var9 = true;
                            if (!var17.method519((byte) 8)) {
                                var4 = false;
                                class95.field2361++;
                            }
                        }
                    }
                }
                int var10 = var5.method179((byte) -84);
                if (var10 == 0) {
                    break;
                }
                var5.method145(false);
            }
        }
    }
}
