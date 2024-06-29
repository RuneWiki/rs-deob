import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class161 {

    @OriginalMember(owner = "client!in", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2217 = new String[100];

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field2216 = 0;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field2221 = 0;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "Z")
    public static boolean field2220 = false;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public int field2218;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Lgg;")
    public static class79 field2213;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2214;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lp;I)V", line = 5)
    public static final void method1061(class107 arg0, int arg1) {
        field2222++;
        if (arg1 >= -97) {
            method1061((class107) null, 18);
        }
        byte[] var2 = new byte[24];
        if (class89.field1115 != null) {
            try {
                class89.field1115.method301(0L, (byte) 45);
                int var3 = 0;
                class89.field1115.method307(var2, -18762);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method665(24, var2, -127, 0);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IILp;)V", line = 51)
    private final void method1062(int arg0, int arg1, class107 arg2) {
        field2212++;
        if (arg1 == 1) {
            this.field2223 = arg2.method624(14612);
            this.field2211 = arg2.method661(-1);
            this.field2218 = arg2.method661(-1);
        }
        if (arg0 != 0) {
            this.field2218 = 42;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([BZ)V", line = 71)
    public static final void method1063(byte[] arg0, boolean arg1) {
        field2226++;
        class107 var2 = new class107(arg0);
        var2.field1400 = arg0.length - 2;
        class21.field266 = var2.method624(14612);
        class264.field4159 = new int[class21.field266];
        class153.field2105 = new byte[class21.field266][];
        class120.field1681 = new int[class21.field266];
        if (arg1) {
            return;
        }
        class223.field3150 = new int[class21.field266];
        class185.field2668 = new boolean[class21.field266];
        class118.field1667 = new byte[class21.field266][];
        class54.field664 = new int[class21.field266];
        var2.field1400 = arg0.length - class21.field266 * 8 - 7;
        class99.field1288 = var2.method624(14612);
        class78.field988 = var2.method624(14612);
        int var3 = (var2.method661(-1) & 0xFF) + 1;
        for (int var4 = 0; var4 < class21.field266; var4++) {
            class120.field1681[var4] = var2.method624(14612);
        }
        for (int var5 = 0; var5 < class21.field266; var5++) {
            class223.field3150[var5] = var2.method624(14612);
        }
        for (int var6 = 0; var6 < class21.field266; var6++) {
            class54.field664[var6] = var2.method624(14612);
        }
        for (int var7 = 0; var7 < class21.field266; var7++) {
            class264.field4159[var7] = var2.method624(14612);
        }
        var2.field1400 = arg0.length - ((class21.field266 * 8) + (var3 * 3) + 7 - 3);
        class134.field1854 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class134.field1854[var8] = var2.method622((byte) -9);
            if (class134.field1854[var8] == 0) {
                class134.field1854[var8] = 1;
            }
        }
        var2.field1400 = 0;
        for (int var9 = 0; var9 < class21.field266; var9++) {
            int var10 = class54.field664[var9];
            int var11 = class264.field4159[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            class153.field2105[var9] = var13;
            byte[] var15 = new byte[var12];
            class118.field1667[var9] = var15;
            int var16 = var2.method661(-1);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method679(-3);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var15[var18] = var2.method679(-3);
                        var14 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var10) {
                                break label101;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var15[var10 * var23 + var22] = var2.method679(-3);
                                var14 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var10 * var21 + var20] = var2.method679(-3);
                    }
                    var20++;
                }
            }
            class185.field2668[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLp;)V", line = 239)
    public final void method1064(byte arg0, class107 arg1) {
        field2215++;
        while (true) {
            int var3 = arg1.method661(-1);
            if (var3 == 0) {
                if (arg0 > -16) {
                    this.method1064((byte) -117, (class107) null);
                }
                return;
            }
            this.method1062(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 289)
    public static void method1065(byte arg0) {
        field2214 = null;
        field2213 = null;
        int var1 = -127 / ((arg0 - 40) / 53);
        field2217 = null;
    }
}
