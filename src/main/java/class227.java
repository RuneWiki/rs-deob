import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public abstract class class227 {

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Llc;")
    public static class270 field3332;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lwk;")
    public static class54 field3334;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "[[[B")
    public static byte[][][] field3335;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
    public abstract void method486(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I")
    public static final int method1570(int arg0) {
        if (arg0 < 27) {
            method1572(-98);
        }
        field3336++;
        return 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V")
    public abstract void method485(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(III)V")
    public class227(int arg0, int arg1, int arg2) {
        this.field3331 = arg1;
        this.field3330 = arg0;
        this.field3329 = arg2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([BIII)Z")
    public static final boolean method1571(byte[] arg0, int arg1, int arg2, int arg3) {
        field3327++;
        class53 var4 = new class53(arg0);
        boolean var5 = true;
        if (arg3 != 6710) {
            method1573(-77);
        }
        int var6 = -1;
        label58: while (true) {
            int var7 = var4.method334(arg3 ^ 0x7A6CA7DD);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var4.method368(-129);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var8 & 0x3F;
                    int var14 = var4.method366(arg3 ^ 0xFFFFA5B1) >> 2;
                    int var15 = arg2 + var12;
                    int var16 = arg1 + var13;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class93 var17 = class48.method297(false, var6);
                        if (var14 != 22 || class225.field3308 || var17.field1540 != 0 || var17.field1574 == 1 || var17.field1497) {
                            var9 = true;
                            if (!var17.method717(-108)) {
                                class309.field4973++;
                                var5 = false;
                            }
                        }
                    }
                }
                int var10 = var4.method368(-129);
                if (var10 == 0) {
                    break;
                }
                var4.method366(arg3 ^ 0xFFFFA5B1);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)V")
    public abstract void method487(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static void method1572(int arg0) {
        field3332 = null;
        if (arg0 != -1) {
            method1570(19);
        }
        field3335 = null;
        field3334 = null;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public static final void method1573(int arg0) {
        field3328++;
        int var1 = class208.field3084.method78(class143.field2310);
        for (int var2 = 0; var2 < class147.field2360; var2++) {
            int var6 = class208.field3084.method78(class207.method1462(var2, -1));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        int var3 = class147.field2360 * arg0 + 21;
        var1 += 8;
        int var4 = class121.field1991 - (var1 / 2);
        if ((var1 + var4) > class179.field2677) {
            var4 = class179.field2677 - var1;
        }
        int var5 = class299.field4833;
        if (var4 < 0) {
            var4 = 0;
        }
        if (class137.field2230 < var3 + var5) {
            var5 = class137.field2230 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class79.field1275 != 1) {
            if (class17.field187 == class121.field1991 && class299.field4833 == class13.field153) {
                class137.field2226 = (class247.field3655 ? 26 : 22) + class147.field2360 * 15;
                class253.field3817 = var1;
                class79.field1275 = 0;
                class191.field2823 = true;
                class71.field1125 = var4;
                class171.field2587 = var5;
                return;
            }
            class57.field842 = class13.field153;
            class79.field1275 = 1;
            class211.field3113 = class17.field187;
        } else if (class211.field3113 == class121.field1991 && class57.field842 == class299.field4833) {
            class79.field1275 = 0;
            class171.field2587 = var5;
            class137.field2226 = class147.field2360 * 15 + (class247.field3655 ? 26 : 22);
            class253.field3817 = var1;
            class71.field1125 = var4;
            class191.field2823 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILlc;)V")
    public static final void method1574(int arg0, class270 arg1) {
        field3333++;
        class78.field1264 = arg1.method1884("runes", (byte) 127);
        if (arg0 != 24113) {
            method1571((byte[]) null, 46, -5, 74);
        }
    }
}
