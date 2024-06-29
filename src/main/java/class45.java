import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class45 {

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    public static int[] field580 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Leh;")
    public static class137 field575;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZIIIII)V")
    public static final void method252(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 - arg3 >= class116.field1653 && class114.field1634 >= (arg6 + arg3) && (arg0 - arg3) >= class117.field1656 && class132.field2105 >= arg0 + arg3) {
            class115.method750(4767, arg5, arg2, arg4, arg0, arg3, arg6);
        } else {
            class226.method1600((byte) 93, arg5, arg2, arg6, arg3, arg4, arg0);
        }
        if (!arg1) {
            method252(5, true, -7, 124, -107, -122, -110);
        }
        field582++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BIILeh;)Lnf;")
    public static final class227 method253(byte arg0, int arg1, int arg2, class137 arg3) {
        if (arg0 == 26) {
            field581++;
            return class111.method714(arg2, arg1, arg3, 107) ? class236.method1668((byte) 55) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method254(int arg0) {
        field575 = null;
        if (arg0 != 27538) {
            method257(-40, false);
        }
        field580 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method255(String arg0, int arg1, String arg2, String arg3) {
        int var4 = arg0.indexOf(arg3);
        field579++;
        if (arg1 > -81) {
            method252(88, false, -19, -100, 8, -8, 46);
        }
        while (var4 != -1) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(arg3.length() + var4);
            var4 = arg0.indexOf(arg3, var4 + arg2.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZB)V")
    public static final void method256(boolean arg0, byte arg1) {
        field576++;
        if (arg1 > 92 && class85.field1053 != arg0) {
            class85.field1053 = arg0;
            class263.method1780((byte) -97);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)I")
    public static final int method257(int arg0, boolean arg1) {
        field577++;
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (!arg1) {
            method253((byte) -109, 63, 12, (class137) null);
        }
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B[B)Lol;")
    public static final class109 method258(byte arg0, byte[] arg1) {
        field583++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 <= 41) {
            field575 = null;
        }
        class140 var2 = new class140(arg1, class40.field493, class129.field2072, class103.field1387, class172.field2726, class293.field4645);
        class24.method135(-124);
        return var2;
    }
}
