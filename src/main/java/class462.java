import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class462 extends class427 {

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "B")
    public byte field6907 = 5;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "[I")
    public static int[] field6908 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "Lof;")
    public static class446 field6906 = new class446("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public int field6910;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public int field6911;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public int field6914;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public int field6917;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public int field6918;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "Z")
    public boolean field6909;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([BIB)[B")
    public static final byte[] method2794(byte[] arg0, int arg1, byte arg2) {
        field6916++;
        byte[] var3 = new byte[arg1];
        class192.method1299(arg0, 0, var3, 0, arg1);
        if (arg2 <= 23) {
            method2796(false, false, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public static void method2795(int arg0) {
        if (arg0 != 4) {
            field6906 = null;
        }
        field6906 = null;
        field6908 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZZLwk;)V")
    public static final void method2796(boolean arg0, boolean arg1, class96 arg2) {
        field6912++;
        if (class367.field5621 >= 400) {
            return;
        }
        if (class56.field800 != arg2) {
            String var9;
            if (arg2.field1390 == 0) {
                boolean var3 = true;
                if (class56.field800.field1395 != -1 && arg2.field1395 != -1) {
                    int var4 = class56.field800.field1391 <= arg2.field1391 ? arg2.field1391 : class56.field800.field1391;
                    int var5 = arg2.field1395 > class56.field800.field1395 ? class56.field800.field1395 : arg2.field1395;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class56.field800.field1391 - arg2.field1391;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class67.field957 == class249.field3474 ? class430.field6549.method2705((byte) 69, class257.field3556) : class257.field3549.method2705((byte) 69, class257.field3556);
                if (arg2.field1423 > arg2.field1391) {
                    var9 = arg2.method640(255, true) + (var3 ? class478.method2843(-10, arg2.field1391, class56.field800.field1391) : "<col=ffffff>") + " (" + var8 + arg2.field1391 + "+" + (arg2.field1423 - arg2.field1391) + ")";
                } else {
                    var9 = arg2.method640(255, true) + (var3 ? class478.method2843(-10, arg2.field1391, class56.field800.field1391) : "<col=ffffff>") + " (" + var8 + arg2.field1391 + ")";
                }
            } else {
                var9 = arg2.method640(255, true) + " (" + class350.field5383.method2705((byte) 69, class257.field3556) + arg2.field1390 + ")";
            }
            if (class44.field641) {
                if (!arg1 && (class144.field1922 & 0x8) != 0) {
                    class24.method227(false, 4, 0, (byte) -49, true, class466.field6947 + " -> <col=ffffff>" + var9, -1, class48.field691, class468.field7001, (long) arg2.field3882, 0);
                    class31.field455++;
                }
            } else if (arg1) {
                class24.method227(true, -1, 0, (byte) 111, false, "", 0, -1, "<col=cccccc>" + var9, 0L, 0);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class428.field6500[var10] != null) {
                        short var11 = 0;
                        if (class67.field957 == class41.field603 && class428.field6500[var10].equalsIgnoreCase(class331.field5168.method2705((byte) 69, class257.field3556))) {
                            if (class56.field800.field1391 < arg2.field1391) {
                                var11 = 2000;
                            }
                            if (class56.field800.field1396 != 0 && arg2.field1396 != 0) {
                                if (class56.field800.field1396 == arg2.field1396) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class416.field6341[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class422.field6440[var10] + var11);
                        int var13 = class418.field6373[var10] == -1 ? class239.field3364 : class418.field6373[var10];
                        class431.field6556++;
                        class24.method227(false, var12, 0, (byte) -71, true, "<col=ffffff>" + var9, -1, var13, class428.field6500[var10], (long) arg2.field3882, 0);
                    }
                }
            }
            if (arg0) {
                field6908 = null;
            }
            if (!arg1) {
                for (class54 var14 = (class54) class131.field1769.method445(33); var14 != null; var14 = (class54) class131.field1769.method451(arg0)) {
                    if (var14.field764 == 8) {
                        var14.field752 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class44.field641 && (class144.field1922 & 0x10) != 0) {
            class24.method227(false, 20, 0, (byte) -66, true, class466.field6947 + " -> <col=ffffff>" + class66.field940.method2705((byte) 69, class257.field3556), -1, class48.field691, class468.field7001, 0L, 0);
            class351.field5413++;
        }
    }
}
