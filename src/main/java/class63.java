import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 extends class20 {

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "Lsc;")
    public static class128 field1339 = class129.method1017(false, "<)4col> x");

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "Lsc;")
    private static class128 field1341 = class129.method1017(false, "Login limit exceeded)3");

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "[[S")
    public static short[][] field1343 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Lsc;")
    public static class128 field1340 = class129.method1017(false, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "Lsc;")
    public static class128 field1342 = class129.method1017(false, "AUS");

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "Lsc;")
    public static class128 field1349 = class129.method1017(false, "Clientscript error in: ");

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "Lsc;")
    public static class128 field1357 = field1341;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "Lsc;")
    private static class128 field1348 = class129.method1017(false, "K");

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "Lsc;")
    public static class128 field1347 = field1348;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "Lsc;")
    public static class128 field1351 = field1348;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public static int field1352 = 20;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1361 = 0;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    public static int field1346 = 0;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field1362 = -1;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "Lsc;")
    public static class128 field1353 = class129.method1017(false, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "B")
    public byte field1344;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "Lsc;")
    public class128 field1355;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "Ljd;")
    public static class66 field1358;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "[I")
    public static int[] field1354;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLhe;)V")
    public static final void method466(boolean arg0, class54 arg1) {
        field1350++;
        if (!arg0) {
            field1349 = null;
        }
        int var2 = arg1.field1078;
        if (var2 == 324) {
            if (class147.field3413 == -1) {
                class147.field3413 = arg1.field1202;
                class9.field141 = arg1.field1080;
            }
            if (class135.field3182.field1603) {
                arg1.field1202 = class147.field3413;
            } else {
                arg1.field1202 = class9.field141;
            }
        } else if (var2 == 325) {
            if (class147.field3413 == -1) {
                class9.field141 = arg1.field1080;
                class147.field3413 = arg1.field1202;
            }
            if (class135.field3182.field1603) {
                arg1.field1202 = class9.field141;
            } else {
                arg1.field1202 = class147.field3413;
            }
        } else if (var2 == 327) {
            arg1.field1217 = 150;
            arg1.field1128 = (int) (Math.sin((double) class29.field554 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1093 = 0;
            arg1.field1179 = 5;
        } else if (var2 == 328) {
            arg1.field1217 = 150;
            arg1.field1128 = (int) (Math.sin((double) class29.field554 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1179 = 5;
            arg1.field1093 = 1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Z")
    public static final boolean method467(int arg0, int arg1) {
        field1360++;
        if (arg0 != 0) {
            method467(42, 118);
        }
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLsc;B)V")
    public static final void method468(boolean arg0, class128 arg1, byte arg2) {
        if (arg2 <= 40) {
            method469((byte) -38);
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        field1356++;
        int var5 = var3 + 6;
        int var6 = class137.field3235.method1063(arg1, 250);
        int var7 = class137.field3235.method1069(arg1, 250) * 13;
        class138.method1136(var4 - var3, -var3 + var5, var3 + var3 + var6, var3 + var7 + var3, 0);
        class138.method1128(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 + var3, 16777215);
        class137.field3235.method1062(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class19.method169((byte) -58, var4 - var3, var3 + var6 - -var3, var3 + var3 + var7, var5 - var3);
        if (!arg0) {
            class35.method258(-11, var6, var5, var7, var4);
            return;
        }
        try {
            Graphics var8 = class127.field2888.getGraphics();
            class5.field51.method66((byte) 85, 0, var8, 0);
        } catch (Exception var9) {
            class127.field2888.repaint();
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
    public static void method469(byte arg0) {
        field1343 = null;
        field1353 = null;
        field1341 = null;
        field1358 = null;
        field1348 = null;
        field1354 = null;
        field1339 = null;
        int var1 = 104 / ((-arg0 - 31) / 35);
        field1342 = null;
        field1351 = null;
        field1340 = null;
        field1357 = null;
        field1349 = null;
        field1347 = null;
    }
}
