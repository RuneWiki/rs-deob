import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class73 extends class285 {

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1028 = "Loading wordpack - ";

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "[[[B")
    public static byte[][][] field1025;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 3)
    public class73() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljj;B)V", line = 8)
    public static final void method487(class44 arg0, byte arg1) {
        field1026++;
        if (arg1 != -23) {
            method489(120);
        }
        while (true) {
            while (arg0.field586 < arg0.field573.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method286((byte) -110) == 1) {
                    var2 = true;
                    var3 = arg0.method286((byte) -96);
                    var4 = arg0.method286((byte) -127);
                }
                int var5 = arg0.method286((byte) -112);
                int var6 = arg0.method286((byte) -70);
                int var7 = var5 * 64 - class27.field377;
                int var8 = class93.field1276 + class74.field1048 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class111.field1650 > var7 + 63 && var8 < class74.field1048) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < var3 * 8 + 8 && var12 >= (var4 * 8) && var12 < (var4 * 8 + 8)) {
                                int var13 = arg0.method286((byte) -95);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method286((byte) -95);
                                        if (class129.field2018[var9][var10] == null) {
                                            class129.field2018[var9][var10] = new byte[4096];
                                        }
                                        class129.field2018[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method273(-867673064);
                                        if (class323.field5007[var9][var10] == null) {
                                            class323.field5007[var9][var10] = new int[4096];
                                        }
                                        class323.field5007[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method273(-867673064);
                                        if (class296.field4683[var9][var10] == null) {
                                            class296.field4683[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class97 var17 = class69.method454(false, var16);
                                        if (var17.field1387 != null) {
                                            var17 = var17.method656((byte) 7);
                                            if (var17 == null || var17.field1319 == -1) {
                                                continue;
                                            }
                                        }
                                        class296.field4683[var9][var10][(63 - var12 << 6) + var11] = var17.field1345 + 1;
                                        class280 var18 = new class280();
                                        var18.field4513 = var8;
                                        var18.field4521 = var7;
                                        var18.field4517 = var17.field1319;
                                        class97.field1324.method1232(arg1 + 148, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method286((byte) -91);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field586++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field586 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field586 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V", line = 166)
    public static final void method488(int arg0, boolean arg1) {
        class14.field157 = arg1;
        field1027++;
        int var2 = 105 % ((arg0 + 40) / 33);
        class287.field4601 = !class76.method518(-19076);
    }

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "(I)V", line = 177)
    public static void method489(int arg0) {
        field1025 = (byte[][][]) null;
        if (arg0 <= 108) {
            field1028 = (String) null;
        }
        field1028 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)[I", line = 196)
    public final int[] method60(boolean arg0, int arg1) {
        if (arg0) {
            field1024++;
            return class48.field669;
        } else {
            return (int[]) null;
        }
    }
}
