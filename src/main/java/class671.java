import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class671 {

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lkaa;")
    public static class47 field9155 = new class47(38, 2);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public int field9150;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public int field9151;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public int field9158;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lcv;")
    public static class569 field9154;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[[B")
    public static byte[][] field9152;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method3698(boolean arg0) {
        field9155 = null;
        field9152 = null;
        field9154 = null;
        if (!arg0) {
            method3698(true);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lee;BI)V")
    private final void method3699(class677 arg0, byte arg1, int arg2) {
        field9147++;
        if (arg2 == 1) {
            this.field9151 = arg0.method3807(-1);
            this.field9150 = arg0.method3821((byte) 124);
            this.field9158 = arg0.method3821((byte) -86);
        }
        if (arg1 <= 78) {
            this.field9150 = 123;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILee;)V")
    public final void method3700(int arg0, class677 arg1) {
        while (true) {
            int var3 = arg1.method3821((byte) -93);
            if (var3 == 0) {
                if (arg0 != 38) {
                    return;
                }
                field9156++;
                return;
            }
            this.method3699(arg1, (byte) 108, var3);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZJ)Ljava/lang/String;")
    public static final String method3701(int arg0, boolean arg1, long arg2) {
        field9148++;
        class56.method376(arg2, -8474);
        int var4 = class132.field2151.get(5);
        if (!arg1) {
            method3701(-61, true, -124L);
        }
        int var5 = class132.field2151.get(2);
        int var6 = class132.field2151.get(1);
        int var7 = class132.field2151.get(11);
        int var8 = class132.field2151.get(12);
        return arg0 == 3 ? class433.method2494(-113, arg0, arg2) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class56.field680[arg0][var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILwd;I)V")
    public static final void method3702(int arg0, class276 arg1, int arg2) {
        class696.field9702 = false;
        class408.field5673 = 0;
        field9157++;
        class604.method3287(arg0 ^ arg0, arg1);
        class290.method1801(arg0 - 31024, arg1);
        if (class696.field9702) {
            System.out.println("---endgpp---");
        }
        if (arg1.field9419 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field9419 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII)Z")
    public static final boolean method3703(byte arg0, int arg1, int arg2) {
        if (arg0 != 11) {
            method3701(-103, true, -9L);
        }
        field9153++;
        return (arg1 & 0x70000) != 0 | class628.method3462((byte) -124, arg2, arg1) || class705.method3965(arg1, (byte) -35, arg2);
    }
}
