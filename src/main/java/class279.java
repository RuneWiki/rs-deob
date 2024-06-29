import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class279 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lph;")
    public static class229 field4612 = class266.method1858("overlay2", 0);

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lph;")
    public static class229 field4616 = class266.method1858(":assistreq:", 0);

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lph;")
    public static class229 field4620 = class266.method1858("M-Bmoire attribu-Be", 0);

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Lph;")
    public static class229 field4624 = class266.method1858("ul", 0);

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lph;")
    public static class229 field4617 = class266.method1858("Untersuchen", 0);

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field4625 = 0;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lsi;")
    public static class66 field4621;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[[B")
    public static byte[][] field4623;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)I", line = 4)
    public static final int method1916(int arg0) {
        field4618++;
        return arg0 < 111 ? 4 : 6;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 17)
    public static void method1917(int arg0) {
        field4612 = null;
        if (arg0 >= -93) {
            method1921(-6, (byte) 75);
        }
        field4616 = null;
        field4617 = null;
        field4623 = (byte[][]) null;
        field4624 = null;
        field4620 = null;
        field4621 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lsi;Z)V", line = 33)
    public static final void method1918(class66 arg0, boolean arg1) {
        class19.field256 = class48.method342(117, arg0, class223.field3668);
        class75.field1259 = new int[256];
        field4619++;
        int var2 = 0;
        if (arg1) {
            return;
        }
        while (var2 < 3) {
            int var3 = (class88.field1491[var2 + 1] & 0xFF0000) >> 16;
            float var4 = (float) (class88.field1491[var2] >> 16 & 0xFF);
            float var5 = (float) ((class88.field1491[var2] & 0xFF00) >> 8);
            float var6 = ((float) var3 - var4) / 64.0F;
            int var7 = class88.field1491[var2 + 1] >> 8 & 0xFF;
            int var8 = class88.field1491[var2 + 1] & 0xFF;
            float var9 = (float) (class88.field1491[var2] & 0xFF);
            float var10 = ((float) var7 - var5) / 64.0F;
            float var11 = ((float) var8 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class75.field1259[var2 * 64 + var12] = class201.method1410(class201.method1410((int) var5 << 8, (int) var4 << 16), (int) var9);
                var5 += var10;
                var9 += var11;
                var4 += var6;
            }
            var2++;
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class75.field1259[var13] = class88.field1491[3];
        }
        class241.field3991 = new int[32768];
        class316.field5374 = new int[32768];
        class129.method932(-74, (class32) null);
        class208.field3432 = new int[32768];
        class193.field3187 = new int[32768];
        if (class99.field1675) {
            class120.field2027 = new class267(128, 254);
        } else {
            class120.field2027 = new class327(128, 254);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)Lue;", line = 107)
    public static final class235 method1919(int arg0) {
        if (arg0 == 16711680) {
            field4615++;
            return class169.field2795;
        } else {
            return (class235) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V", line = 118)
    public static final void method1920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class1.field2 = arg3;
        class203.field3348 = arg1;
        class326.field5578 = arg2;
        field4614++;
        if (arg5 > 97) {
            class263.field4398 = arg4;
            class97.field1626 = arg0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)Lai;", line = 136)
    public static final class221 method1921(int arg0, byte arg1) {
        field4613++;
        class221 var2 = (class221) class134.field2173.method1027(-111, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field2936.method523(arg1 - 142, class100.method770(0, arg0), class168.method1234(arg0, (byte) 22));
        class221 var4 = new class221();
        if (var3 != null) {
            var4.method1545(new class164(var3), -75);
        }
        if (arg1 == 64) {
            class134.field2173.method1026(var4, 120, (long) arg0);
            return var4;
        } else {
            return (class221) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I", line = 162)
    public static final int method1922(int arg0, int arg1) {
        field4622++;
        return arg0 == 1247254535 ? arg1 >>> 7 : 106;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)[B", line = 187)
    public static final synchronized byte[] method1923(int arg0, int arg1) {
        if (arg0 != 1) {
            field4623 = (byte[][]) ((byte[][]) null);
        }
        field4626++;
        if (arg1 == 100 && class271.field4539 > 0) {
            byte[] var2 = class229.field3791[--class271.field4539];
            class229.field3791[class271.field4539] = null;
            return var2;
        } else if (arg1 == 5000 && class211.field3488 > 0) {
            byte[] var3 = class175.field2880[--class211.field3488];
            class175.field2880[class211.field3488] = null;
            return var3;
        } else if (arg1 == 30000 && class82.field1342 > 0) {
            byte[] var4 = class45.field693[--class82.field1342];
            class45.field693[class82.field1342] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
