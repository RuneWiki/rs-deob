import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class421 extends class571 {

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Z")
    public boolean field5750 = false;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lfba;")
    public static class27 field5756 = new class27(28, 0);

    @OriginalMember(owner = "client!je", name = "r", descriptor = "B")
    public byte field5749;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "B")
    public byte field5755;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public int field5741;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public int field5742;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public int field5744;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field5745;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public int field5746;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public int field5757;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lje;")
    public class421 field5747;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Z")
    public boolean field5751;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)V", line = 7)
    public static void method2545(byte arg0) {
        field5756 = null;
        if (arg0 > -11) {
            method2545((byte) -10);
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(B)I", line = 18)
    public int method2546(byte arg0) {
        field5754++;
        int var2 = -1 % ((-arg0 - 27) / 42);
        return 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IJ)I", line = 37)
    public static final int method2547(int arg0, long arg1) {
        if (arg0 > -11) {
            method2545((byte) 71);
        }
        field5748++;
        class193.method1338(arg1, -103);
        return class4.field30.get(1);
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V", line = 57)
    public static final void method2548(int arg0) {
        class267.field3893.method3735(2);
        field5752++;
        int var1 = 82 / ((44 - arg0) / 50);
    }

    @OriginalMember(owner = "client!je", name = "i", descriptor = "(I)V", line = 67)
    public static final void method2549(int arg0) {
        field5743++;
        if (class184.field2827 < 102) {
            class184.field2827 += 6;
        }
        if (class551.field7916 != -1 && class732.field10137 < class459.method2731(111)) {
            for (int var1 = class551.field7916; var1 < class21.field352.length; var1++) {
                if (class21.field352[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class21.field352[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class587.method3423("Pausing for " + var2 + " seconds...", -114);
                    class551.field7916 = var1 + 1;
                    class732.field10137 = class459.method2731(109) + (long) (var2 * 1000);
                    return;
                }
                class46.field578 = class21.field352[var1];
                class234.method1568(-128, false);
            }
            class551.field7916 = -1;
        }
        if (class170.field2660 != 0) {
            class138.field2057 -= class170.field2660 * 5;
            if (class787.field10806 <= class138.field2057) {
                class138.field2057 = class787.field10806 - 1;
            }
            class170.field2660 = 0;
            if (class138.field2057 < 0) {
                class138.field2057 = 0;
            }
        }
        if (arg0 != 12080) {
            return;
        }
        for (int var3 = 0; var3 < class310.field4431; var3++) {
            class542 var4 = class354.field4983[var3];
            int var5 = var4.method1496(21053);
            char var6 = var4.method1489(100);
            int var7 = var4.method1497(-2342);
            if (var5 == 84) {
                class234.method1568(-128, false);
            }
            if (var5 == 80) {
                class234.method1568(-128, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class430.field5834 != null) {
                    String var8 = "";
                    for (int var9 = class353.field4964.length - 1; var9 >= 0; var9--) {
                        if (class353.field4964[var9] != null && class353.field4964[var9].length() > 0) {
                            var8 = var8 + class353.field4964[var9] + '\n';
                        }
                    }
                    class430.field5834.setContents(new StringSelection(var8), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class430.field5834 != null) {
                    Transferable var10 = class430.field5834.getContents(null);
                    if (var10 != null) {
                        try {
                            String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                            if (var11 != null) {
                                String[] var12 = class3.method22(true, '\n', var11);
                                class752.method4187((byte) 97, var12);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class284.field4199 > 0) {
                class46.field578 = class46.field578.substring(0, class284.field4199 - 1) + class46.field578.substring(class284.field4199);
                class284.field4199--;
            } else if (var5 == 101 && class284.field4199 < class46.field578.length()) {
                class46.field578 = class46.field578.substring(0, class284.field4199) + class46.field578.substring(class284.field4199 + 1);
            } else if (var5 == 96 && class284.field4199 > 0) {
                class284.field4199--;
            } else if (var5 == 97 && class284.field4199 < class46.field578.length()) {
                class284.field4199++;
            } else if (var5 == 102) {
                class284.field4199 = 0;
            } else if (var5 == 103) {
                class284.field4199 = class46.field578.length();
            } else if (var5 == 104 && class353.field4964.length > class148.field2135) {
                class148.field2135++;
                class510.method3087(false);
                class284.field4199 = class46.field578.length();
            } else if (var5 == 105 && class148.field2135 > 0) {
                class148.field2135--;
                class510.method3087(false);
                class284.field4199 = class46.field578.length();
            } else if (class140.method1012(var6, 93) || "\\/.:, _-+[]~@".indexOf(var6) != -1) {
                class46.field578 = class46.field578.substring(0, class284.field4199) + class354.field4983[var3].method1489(arg0 - 11971) + class46.field578.substring(class284.field4199);
                class284.field4199++;
            }
        }
        class54.field688 = 0;
        class310.field4431 = 0;
        class351.method2224((byte) 119);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI[Lqm;I)I", line = 280)
    public final int method2550(boolean arg0, int arg1, class154[] arg2, int arg3) {
        field5753++;
        long var5 = class143.field2105[this.field5755][arg3][arg1];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg2[var9++] = class603.field8444[var10 - 1].field6391;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg2[var11] = null;
        }
        if (arg0) {
            this.field5751 = true;
        }
        return var9;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)I")
    public abstract int method917(int arg0);

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)Z")
    public abstract boolean method906(int arg0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lha;I)Lmaa;")
    public abstract class495 method918(class65 arg0, int arg1);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILha;)Z")
    public abstract boolean method902(int arg0, int arg1, int arg2, class65 arg3);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(ILha;)Z")
    public abstract boolean method2456(int arg0, class65 arg1);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Lha;I)Lrn;")
    public abstract class281 method901(class65 arg0, int arg1);

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
    public abstract void method903(int arg0);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)I")
    public abstract int method916(boolean arg0);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)Z")
    public abstract boolean method910(boolean arg0);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(Z)Z")
    public abstract boolean method909(boolean arg0);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(ILha;)V")
    public abstract void method912(int arg0, class65 arg1);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[Lqm;)I")
    public abstract int method2458(int arg0, class154[] arg1);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLje;IIILha;I)V")
    public abstract void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6);

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(B)Z")
    public abstract boolean method2457(byte arg0);
}
