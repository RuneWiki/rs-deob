import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class250 extends class240 {

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public int field3858;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[[[B")
    public static byte[][][] field3857 = new byte[4][104][104];

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lj;")
    public static class285 field3856 = new class285(64);

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 8)
    public static void method1770(byte arg0) {
        int var1 = -75 % ((13 - arg0) / 35);
        field3857 = (byte[][][]) null;
        field3856 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[B)V", line = 24)
    public static final void method1771(int arg0, byte[] arg1) {
        class101 var2 = new class101(arg1);
        field3854++;
        var2.field1667 = arg1.length - 2;
        class103.field1744 = var2.method731(false);
        class270.field4198 = new byte[class103.field1744][];
        class3.field14 = new int[class103.field1744];
        class33.field548 = new boolean[class103.field1744];
        class108.field1797 = new int[class103.field1744];
        class62.field962 = new int[class103.field1744];
        class24.field408 = new byte[class103.field1744][];
        class246.field3811 = new int[class103.field1744];
        var2.field1667 = arg1.length - (class103.field1744 * 8 + 7);
        class326.field5064 = var2.method731(false);
        class52.field820 = var2.method731(false);
        int var3 = (var2.method741(112) & 0xFF) + 1;
        for (int var4 = 0; var4 < class103.field1744; var4++) {
            class246.field3811[var4] = var2.method731(false);
        }
        for (int var5 = 0; var5 < class103.field1744; var5++) {
            class62.field962[var5] = var2.method731(false);
        }
        for (int var6 = 0; var6 < class103.field1744; var6++) {
            class108.field1797[var6] = var2.method731(false);
        }
        for (int var7 = 0; var7 < class103.field1744; var7++) {
            class3.field14[var7] = var2.method731(false);
        }
        var2.field1667 = arg0 + arg1.length - (var3 * 3) - (class103.field1744 * 8) - 7;
        class251.field3871 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class251.field3871[var8] = var2.method776(-1574267376);
            if (class251.field3871[var8] == 0) {
                class251.field3871[var8] = 1;
            }
        }
        var2.field1667 = 0;
        for (int var9 = 0; var9 < class103.field1744; var9++) {
            int var10 = class108.field1797[var9];
            int var11 = class3.field14[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class270.field4198[var9] = var13;
            class24.field408[var9] = var14;
            int var15 = var2.method741(arg0 ^ 0x61);
            boolean var16 = false;
            if ((var15 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method727((byte) 126);
                }
                if ((var15 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method727((byte) 112);
                        var16 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label98: while (true) {
                    if (var20 >= var10) {
                        if ((var15 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var10) {
                                break label98;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var14[var10 * var23 + var22] = var2.method727((byte) 121);
                                var16 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var10 * var21 + var20] = var2.method727((byte) 111);
                    }
                    var20++;
                }
            }
            class33.field548[var9] = var16;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 188)
    public class250() {
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V", line = 194)
    public class250(int arg0) {
        this.field3858 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lda;", line = 203)
    public static final class120 method1772(byte arg0) {
        field3859++;
        if (arg0 >= -2) {
            method1770((byte) -19);
        }
        return class13.field248.length > class217.field3487 ? class13.field248[class217.field3487++] : null;
    }
}
