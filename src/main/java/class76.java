import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class76 extends class139 {

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Z")
    public volatile boolean field1090 = true;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field1089 = 0;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Z")
    public static boolean field1093 = false;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Z")
    public static boolean field1096 = false;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Z")
    public boolean field1094;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Z")
    public boolean field1095;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I")
    public abstract int method461(byte arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBIZI)V")
    public static final void method550(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field1097++;
        int var5 = -58 % ((arg1 + 69) / 34);
        class149.field2435 = 0L;
        int var6 = class243.method1724(109);
        if (arg4 == 3 || var6 == 3) {
            arg3 = true;
        }
        boolean var7 = false;
        if (class7.field73.startsWith("mac") && arg4 > 0) {
            arg3 = true;
        }
        if (arg4 > 0 != var6 > 0) {
            var7 = true;
        }
        if (arg3 && arg4 > 0) {
            var7 = true;
        }
        class217.method1560(arg4, var6, arg3, (byte) 80, arg0, arg2, var7);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Ldh;")
    public static final class122 method551(int arg0, int arg1) {
        field1088++;
        class122 var2 = (class122) class149.field2433.method310(-24190, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class245.field4033.method643(0, arg1, false);
        if (var3 == null) {
            return null;
        }
        class122 var4 = new class122();
        class152 var5 = new class152(var3);
        var5.field2511 = var5.field2523.length - 2;
        int var6 = var5.method1126(false);
        int var7 = var5.field2523.length - var6 - 2 - 12;
        var5.field2511 = var7;
        int var8 = var5.method1097(127);
        var4.field1785 = var5.method1126(false);
        var4.field1788 = var5.method1126(false);
        var4.field1783 = var5.method1126(false);
        var4.field1789 = var5.method1126(false);
        int var9 = var5.method1111(arg0 + 255);
        if (var9 > 0) {
            var4.field1780 = new class144[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1126(false);
                class144 var12 = new class144(class254.method1801(var11, (byte) 74));
                var4.field1780[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1097(126);
                    int var14 = var5.method1097(126);
                    var12.method1032(false, new class130(var14), (long) var13);
                }
            }
        }
        var5.field2511 = arg0;
        var4.field1790 = var5.method1088(arg0 + 12650);
        var4.field1791 = new int[var8];
        var4.field1778 = new String[var8];
        int var15 = 0;
        var4.field1781 = new int[var8];
        while (var7 > var5.field2511) {
            int var16 = var5.method1126(false);
            if (var16 == 3) {
                var4.field1778[var15] = var5.method1078(-1).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field1781[var15] = var5.method1111(255);
            } else {
                var4.field1781[var15] = var5.method1097(126);
            }
            var4.field1791[var15++] = var16;
        }
        class149.field2433.method312((long) arg1, var4, (byte) 123);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Llc;IIZ)[Lak;")
    public static final class140[] method552(class86 arg0, int arg1, int arg2, boolean arg3) {
        field1092++;
        if (class156.method1155(arg1, arg0, 106, arg2)) {
            if (arg3) {
                method551(116, -62);
            }
            return class218.method1567((byte) -70);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)[B")
    public abstract byte[] method462(int arg0);

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public static final void method553(int arg0) {
        if (class276.field4431 != null) {
            class164 var1 = class276.field4431;
            synchronized (class276.field4431) {
                class276.field4431 = null;
            }
        }
        if (arg0 != -1) {
            method552((class86) null, 42, -107, true);
        }
        field1098++;
    }
}
