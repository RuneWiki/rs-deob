import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class272 {

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "B")
    private byte field4426;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field4429;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public int field4419;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public int field4422;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lke;")
    public static class106 field4427 = new class106(128);

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4431 = " is already on your ignore list.";

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field4432 = 0;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field4430 = 0;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field4433 = new String[1000];

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)I")
    public final int method1890(byte arg0) {
        if (arg0 != 90) {
            this.method1890((byte) -87);
        }
        field4428++;
        return (this.field4426 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static void method1891(byte arg0) {
        field4431 = null;
        field4427 = null;
        if (arg0 != 62) {
            field4427 = null;
        }
        field4433 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lvl;II)Lqe;")
    public static final class176 method1892(class73 arg0, int arg1, int arg2) {
        if (arg2 != -2671) {
            field4427 = null;
        }
        field4418++;
        byte[] var3 = arg0.method507(arg2 ^ 0xA6F, arg1);
        return var3 == null ? null : new class176(var3);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lvl;Lvl;ILeb;Z)V")
    public static final void method1893(class73 arg0, class73 arg1, int arg2, class109 arg3, boolean arg4) {
        field4421++;
        class86.field1317 = arg1;
        if (arg2 != -9) {
            return;
        }
        class254.field4154 = arg4;
        class124.field1791 = arg0;
        int var5 = class124.field1791.method494(111) - 1;
        class148.field2202 = var5 * 256 + class124.field1791.method481(arg2 + 2697, var5);
        class161.field2408 = new String[] { null, null, class81.field1246, null, null };
        class21.field280 = arg3;
        class120.field1724 = new String[] { null, null, null, null, class252.field4128 };
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    public static final void method1894(int arg0, int arg1) {
        field4420++;
        class108.field1577.method1514(arg0, (byte) -55);
        if (arg1 != 1) {
            method1894(-13, -9);
        }
        class295.field4722.method1514(arg0, (byte) -55);
        class205.field3204.method1514(arg0, (byte) -55);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
    public final int method1895(int arg0) {
        field4424++;
        int var2 = 42 % ((arg0 - 11) / 61);
        return this.field4426 & 0x7;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class272() {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lim;)V")
    public class272(class170 arg0) {
        this.field4426 = arg0.method1215(128);
        this.field4429 = arg0.method1186((byte) -37);
        this.field4419 = arg0.method1190(6345);
        this.field4425 = arg0.method1190(6345);
        this.field4422 = arg0.method1190(6345);
        this.field4416 = arg0.method1190(6345);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZII)Lek;")
    public static final class173 method1896(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg0 << 8 | arg2;
        field4423++;
        if (arg1) {
            field4433 = null;
        }
        class173 var5 = (class173) class255.field4156.method707((long) var4 << 16, (byte) 122);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class186.field2927.method507(-2, class186.field2927.method508(var4, (byte) -108));
        if (var6 == null) {
            int var8 = arg2 | arg3 + 65536 << 8;
            class173 var9 = (class173) class255.field4156.method707((long) var8 << 16, (byte) -93);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class186.field2927.method507(-2, class186.field2927.method508(var8, (byte) -106));
            if (var10 == null) {
                int var12 = arg2 | 0xFFFF00;
                class173 var13 = (class173) class255.field4156.method707((long) var12 << 16, (byte) -128);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class186.field2927.method507(-2, class186.field2927.method508(var12, (byte) -102));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class173 var15 = class94.method640((byte) 111, var14);
                    var15.field2716 = arg2;
                    class255.field4156.method712(false, var15, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class173 var11 = class94.method640((byte) 72, var10);
                var11.field2716 = arg2;
                class255.field4156.method712(false, var11, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class173 var7 = class94.method640((byte) 84, var6);
            var7.field2716 = arg2;
            class255.field4156.method712(false, var7, (long) var4 << 16);
            return var7;
        }
    }
}
