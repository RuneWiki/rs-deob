import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 extends class378 {

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "Lcu;")
    public static class145 field535 = new class145(25, 7);

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "Z")
    public static boolean field543 = false;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "J")
    public long field544;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I")
    public final int method255(int arg0) {
        if (arg0 <= 104) {
            return 126;
        } else {
            field542++;
            return this.field532;
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I")
    public final int method256(byte arg0) {
        if (arg0 >= -126) {
            return 69;
        } else {
            field534++;
            return this.field533;
        }
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)V")
    public static final void method257(int arg0) {
        class406.method2361(arg0 - 31339);
        field538++;
        class344.method2003(arg0 - 28, 2, class154.field2244.field7765, 22050);
        class487.field6768 = class99.method705(0, class389.field5281, true, class518.field7663, 22050);
        class487.field6768.method2469(false, class26.field449);
        class322.field4216 = class99.method705(1, class389.field5281, true, class518.field7663, 2048);
        if (arg0 == 37) {
            class322.field4216.method2469(false, class318.field4175);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIII)V")
    public static final void method258(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field540++;
        class231.field3100 = arg3;
        class93.field1410 = arg0;
        class220.field2980 = arg4;
        class298.field3924 = arg2;
        if (arg1 != -96) {
            field543 = true;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method259(String arg0, int arg1) {
        field541++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = arg1; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)J")
    public final long method260(int arg0) {
        if (arg0 != 2) {
            method262(68, -113, 60);
        }
        field539++;
        return this.field544;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(Z)V")
    public static void method261(boolean arg0) {
        field535 = null;
        if (!arg0) {
            field535 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)V")
    public static final void method262(int arg0, int arg1, int arg2) {
        class409 var3 = class497.field6886[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field5627 != null) {
            var3.field5627 = null;
        }
        if (var3.field5607 != null) {
            var3.field5607 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)I")
    public final int method263(byte arg0) {
        field537++;
        return arg0 > -123 ? -12 : this.field536;
    }
}
