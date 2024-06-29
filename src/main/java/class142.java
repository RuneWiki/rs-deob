import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class142 extends class80 {

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field2299 = 0;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Lph;")
    public static class229 field2293 = class266.method1858("d-Broulement:", 0);

    @OriginalMember(owner = "client!al", name = "w", descriptor = "Lph;")
    private static class229 field2304 = class266.method1858("wave2:", 0);

    @OriginalMember(owner = "client!al", name = "A", descriptor = "Lph;")
    public static class229 field2308 = field2304;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Lph;")
    public static class229 field2297 = field2304;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "Lvm;")
    public static class202 field2298 = new class202(500);

    @OriginalMember(owner = "client!al", name = "B", descriptor = "Lo;")
    public static class227 field2309 = new class227();

    @OriginalMember(owner = "client!al", name = "z", descriptor = "B")
    public byte field2307;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Lph;")
    public class229 field2294;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "Lph;")
    public class229 field2305;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "[[[B")
    public static byte[][][] field2301;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V", line = 10)
    public static final void method1016(int arg0) {
        field2303++;
        if (arg0 != -11748) {
            method1017((byte) 73, -63);
        }
        class241.field3984.method1415(arg0 ^ 0x6ACA);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)V", line = 30)
    public static final void method1017(byte arg0, int arg1) {
        field2300++;
        class232.field3838.method1418((byte) -17, arg1);
        if (arg0 != 56) {
            method1016(14);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BZ)V", line = 48)
    public static final void method1018(byte arg0, boolean arg1) {
        class124.field2083 = arg1;
        if (class124.field2083) {
            int var15 = class88.field1497.method1187((byte) -99);
            int var16 = class88.field1497.method1183(2);
            int var17 = class88.field1497.method1183(2);
            int var18 = class88.field1497.method1187((byte) -99);
            int var19 = class88.field1497.method1199(false);
            class88.field1497.method40(8);
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    for (int var22 = 0; var22 < 13; var22++) {
                        int var23 = class88.field1497.method34(109, 1);
                        if (var23 == 1) {
                            class276.field4598[var20][var21][var22] = class88.field1497.method34(116, 26);
                        } else {
                            class276.field4598[var20][var21][var22] = -1;
                        }
                    }
                }
            }
            class88.field1497.method35((byte) 85);
            int var24 = (class187.field3052 - class88.field1497.field2670) / 16;
            class15.field188 = new int[var24][4];
            for (int var25 = 0; var25 < var24; var25++) {
                for (int var26 = 0; var26 < 4; var26++) {
                    class15.field188[var25][var26] = class88.field1497.method1177(24501);
                }
            }
            class131.field2132 = new byte[var24][];
            class153.field2501 = new int[var24];
            class139.field2264 = new int[var24];
            class277.field4608 = new byte[var24][];
            class178.field2930 = (byte[][]) null;
            class321.field5434 = new int[var24];
            class71.field1195 = new int[var24];
            class178.field2932 = new byte[var24][];
            class306.field5148 = null;
            class287.field4723 = new int[var24];
            class36.field590 = new byte[var24][];
            int var27 = 0;
            for (int var28 = 0; var28 < 4; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    for (int var30 = 0; var30 < 13; var30++) {
                        int var31 = class276.field4598[var28][var29][var30];
                        if (var31 != -1) {
                            int var32 = (var31 & 0x3FFA) >> 3;
                            int var33 = var31 >> 14 & 0x3FF;
                            int var34 = (var33 / 8 << 8) + var32 / 8;
                            for (int var35 = 0; var35 < var27; var35++) {
                                if (class287.field4723[var35] == var34) {
                                    var34 = -1;
                                    break;
                                }
                            }
                            if (var34 != -1) {
                                class287.field4723[var27] = var34;
                                int var36 = var34 & 0xFF;
                                int var37 = var34 >> 8 & 0xFF;
                                class139.field2264[var27] = class131.field2130.method498(class248.method1746(8528, new class229[] { class44.field673, class50.method354(0, var37), class289.field4736, class50.method354(0, var36) }), -1);
                                class71.field1195[var27] = class131.field2130.method498(class248.method1746(8528, new class229[] { class204.field3360, class50.method354(0, var37), class289.field4736, class50.method354(0, var36) }), -1);
                                class321.field5434[var27] = class131.field2130.method498(class248.method1746(8528, new class229[] { class110.field1864, class50.method354(0, var37), class289.field4736, class50.method354(0, var36) }), -1);
                                class153.field2501[var27] = class131.field2130.method498(class248.method1746(8528, new class229[] { class279.field4624, class50.method354(0, var37), class289.field4736, class50.method354(0, var36) }), -1);
                                var27++;
                            }
                        }
                    }
                }
            }
            class78.method589(var17, var19, var15, false, var18, 25, var16);
        } else {
            int var2 = (class187.field3052 - class88.field1497.field2670) / 16;
            class15.field188 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    class15.field188[var3][var4] = class88.field1497.method1191(31776);
                }
            }
            int var5 = class88.field1497.method1162(2);
            int var6 = class88.field1497.method1183(2);
            int var7 = class88.field1497.method1187((byte) -99);
            int var8 = class88.field1497.method1178(8);
            int var9 = class88.field1497.method1161(true);
            class287.field4723 = new int[var2];
            class178.field2930 = (byte[][]) null;
            class321.field5434 = new int[var2];
            class306.field5148 = null;
            class178.field2932 = new byte[var2][];
            class277.field4608 = new byte[var2][];
            class153.field2501 = new int[var2];
            class36.field590 = new byte[var2][];
            class139.field2264 = new int[var2];
            class131.field2132 = new byte[var2][];
            class71.field1195 = new int[var2];
            int var10 = 0;
            boolean var11 = false;
            if ((var5 / 8 == 48 || (var5 / 8) == 49) && var6 / 8 == 48) {
                var11 = true;
            }
            if (var5 / 8 == 48 && var6 / 8 == 148) {
                var11 = true;
            }
            for (int var12 = (var5 - 6) / 8; var12 <= ((var5 + 6) / 8); var12++) {
                for (int var13 = (var6 - 6) / 8; var13 <= ((var6 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var11 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class287.field4723[var10] = var14;
                        class139.field2264[var10] = -1;
                        class71.field1195[var10] = -1;
                        class321.field5434[var10] = -1;
                        class153.field2501[var10] = -1;
                    } else {
                        class287.field4723[var10] = var14;
                        class139.field2264[var10] = class131.field2130.method498(class248.method1746(8528, new class229[] { class44.field673, class50.method354(0, var12), class289.field4736, class50.method354(0, var13) }), -1);
                        class71.field1195[var10] = class131.field2130.method498(class248.method1746(8528, new class229[] { class204.field3360, class50.method354(0, var12), class289.field4736, class50.method354(0, var13) }), -1);
                        class321.field5434[var10] = class131.field2130.method498(class248.method1746(8528, new class229[] { class110.field1864, class50.method354(0, var12), class289.field4736, class50.method354(0, var13) }), -1);
                        class153.field2501[var10] = class131.field2130.method498(class248.method1746(8528, new class229[] { class279.field4624, class50.method354(0, var12), class289.field4736, class50.method354(0, var13) }), -1);
                    }
                    var10++;
                }
            }
            class78.method589(var5, var8, var7, false, var9, 25, var6);
        }
        field2302++;
        if (arg0 <= 90) {
            method1017((byte) 104, 50);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I[Lph;[SBI)V", line = 304)
    public static final void method1019(int arg0, class229[] arg1, short[] arg2, byte arg3, int arg4) {
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            class229 var6 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var6;
            int var7 = arg0;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (var6 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].method1617(var6, 0)) {
                    class229 var10 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7++] = var11;
                }
            }
            arg1[arg4] = arg1[var7];
            arg1[var7] = var6;
            arg2[arg4] = arg2[var7];
            arg2[var7] = var8;
            method1019(arg0, arg1, arg2, (byte) -48, var7 - 1);
            method1019(var7 + 1, arg1, arg2, (byte) -48, arg4);
        }
        if (arg3 != -48) {
            field2308 = (class229) null;
        }
        field2306++;
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V", line = 358)
    public static void method1020(int arg0) {
        field2301 = (byte[][][]) null;
        field2309 = null;
        field2298 = null;
        if (arg0 != -3500) {
            field2297 = (class229) null;
        }
        field2297 = null;
        field2308 = null;
        field2293 = null;
        field2304 = null;
    }
}
