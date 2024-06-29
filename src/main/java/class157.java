import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class157 extends class447 {

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "Lhp;")
    public class179 field2222;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Lsb;")
    public class160 field2220;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "[[B")
    public static byte[][] field2218 = new byte[250][];

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field2221 = 0;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "[Llf;")
    public static class130[] field2230;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
    public static final void method1053(boolean arg0, int arg1) {
        field2224++;
        byte[][] var2;
        if (arg0) {
            var2 = class322.field4418;
        } else {
            var2 = class237.field3223;
        }
        int var3 = class387.field5635.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class324.field4432[var4] >> 8) * 64 - class449.field6509;
                int var7 = (class324.field4432[var4] & 0xFF) * 64 - class354.field4981;
                class154.method1038(0);
                class23.method152(class408.field5920, var7, class24.field326, 14, arg0, var6, var5);
            }
        }
        if (arg1 >= -99) {
            method1056((byte) -121);
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
    public static void method1054(int arg0) {
        field2230 = null;
        field2218 = null;
        if (arg0 != -31377) {
            method1057(-33, 41, -83, true, -1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
    public final void method1055(int arg0) {
        this.field2233 = this.field2222.field2501;
        field2234++;
        this.field2225 = this.field2222.field2511;
        this.field2223 = this.field2222.field2500;
        if (this.field2222.field2505 != null) {
            this.field2222.field2505.method881(this.field2220.field2260, this.field2220.field2246, this.field2220.field2254, class197.field2737);
        }
        this.field2219 = class197.field2737[arg0];
        this.field2226 = class197.field2737[0];
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(B)I")
    public static final int method1056(byte arg0) {
        field2228++;
        return arg0 > -96 ? -12 : class307.field4213;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIZI)V")
    public static final void method1057(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 >= class379.field5397 && arg4 <= class43.field659) {
            int var5 = class231.method1452(103, class398.field5827, arg2, class300.field4164);
            int var6 = class231.method1452(84, class398.field5827, arg0, class300.field4164);
            class367.method2354(var5, arg1, -4278, arg4, var6);
        }
        if (!arg3) {
            field2229++;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public static final void method1058(boolean arg0) {
        field2231++;
        class236.field3216 = -1;
        class12.field154 = null;
        if (!arg0) {
            method1057(37, 3, 105, true, -64);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lhp;Ljl;)V")
    public class157(class179 arg0, class147 arg1) {
        this.field2222 = arg0;
        this.field2220 = class54.method368(arg0.field2512, (byte) 105);
        this.method1055(2);
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
    public static final void method1059(int arg0) {
        class14.method79(class129.field1800, (byte) 101);
        field2227++;
        int var1 = (class368.field5158 >> 10) + (class449.field6509 >> 3);
        int var2 = (class354.field4981 >> 3) + (class336.field4561 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class149.field2149 = new byte[var6][];
        class245.field3391 = new byte[var6][];
        class191.field2656 = new int[var6];
        class62.field974 = new int[var6][4];
        class108.field1599 = new int[var6];
        class387.field5635 = new byte[var6][];
        class279.field3781 = new int[var6];
        class322.field4418 = new byte[var6][];
        if (arg0 >= 0) {
            return;
        }
        class419.field6060 = new int[var6];
        class237.field3223 = new byte[var6][];
        class383.field5490 = new int[var6];
        class324.field4432 = new int[var6];
        int var7 = 0;
        for (int var8 = (var1 - (class432.field6220 >> 4)) / 8; var8 <= (((class432.field6220 >> 4) + var1) / 8); var8++) {
            for (int var10 = (var2 - (class267.field3646 >> 4)) / 8; var10 <= (((class267.field3646 >> 4) + var2) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class324.field4432[var7] = var11;
                class383.field5490[var7] = class215.field2857.method1914(-1, "m" + var8 + "_" + var10);
                class108.field1599[var7] = class215.field2857.method1914(-1, "l" + var8 + "_" + var10);
                class191.field2656[var7] = class215.field2857.method1914(-1, "n" + var8 + "_" + var10);
                class419.field6060[var7] = class215.field2857.method1914(-1, "um" + var8 + "_" + var10);
                class279.field3781[var7] = class215.field2857.method1914(-1, "ul" + var8 + "_" + var10);
                if (class191.field2656[var7] == -1) {
                    class383.field5490[var7] = -1;
                    class108.field1599[var7] = -1;
                    class419.field6060[var7] = -1;
                    class279.field3781[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class191.field2656.length; var9++) {
            class191.field2656[var9] = -1;
            class383.field5490[var9] = -1;
            class108.field1599[var9] = -1;
            class419.field6060[var9] = -1;
            class279.field3781[var9] = -1;
        }
        class398.method2577(true, var3, var4, var2, (byte) -115, var1, var5, false);
    }
}
