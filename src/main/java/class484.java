import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class484 {

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "Ldc;")
    private class5 field7016 = new class5(16);

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Lhe;")
    private class239 field7006;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Lgn;")
    public static class475 field7007 = new class475(38, -1);

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "[I")
    public static int[] field7017 = new int[5];

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public static int field7018 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILev;IIII)Lho;")
    public final class97 method2818(int arg0, class469 arg1, int arg2, int arg3, int arg4, int arg5) {
        field7010++;
        class314[] var7 = null;
        if (arg4 != 21929) {
            method2827(false, -35);
        }
        class369 var8 = this.method2819(120, arg0);
        if (var8.field5536 != null) {
            var7 = new class314[var8.field5536.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class42 var10 = arg1.method2744((byte) -94, var8.field5536[var9]);
                var7[var9] = new class314(var10.field636, var10.field637, var10.field642, var10.field646, var10.field644, var10.field643, var10.field641, var10.field639);
            }
        }
        return new class97(var8.field5541, var7, var8.field5534, arg5, arg3, arg2);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Lnl;")
    private final class369 method2819(int arg0, int arg1) {
        field7005++;
        class5 var3 = this.field7016;
        class369 var4;
        synchronized (this.field7016) {
            var4 = (class369) this.field7016.method40(0, (long) arg1);
        }
        if (arg0 <= 118) {
            this.method2819(11, 103);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7006.method1470(4, arg1, 29);
        class369 var6 = new class369();
        if (var5 != null) {
            var6.method2247(false, new class156(var5));
        }
        class5 var7 = this.field7016;
        synchronized (this.field7016) {
            this.field7016.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public final void method2820(byte arg0) {
        field7009++;
        class5 var2 = this.field7016;
        synchronized (this.field7016) {
            this.field7016.method35((byte) -1);
            int var3 = -127 / ((-arg0 - 66) / 34);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lss;III[Z)Z")
    public static final boolean method2821(class283 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class311.field4527 != class178.field2562) {
            int var6 = class459.field6685[arg1].method855(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class441 var8 = class459.field6685[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method855(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method858(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method857(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBI)I")
    public static final int method2822(int arg0, byte arg1, int arg2) {
        field7019++;
        int var3 = class209.method1286(73, arg2 - 1, arg0 + -1) + class209.method1286(arg1 + 208, arg2 + 1, arg0 - 1) + (class209.method1286(65, arg2 - 1, arg0 + 1) - -class209.method1286(75, arg2 - -1, arg0 + 1));
        if (arg1 != -104) {
            method2825(false);
        }
        int var4 = class209.method1286(62, arg2 - 1, arg0) + class209.method1286(62, arg2 + 1, arg0) + class209.method1286(arg1 ^ 0xFFFFFFD5, arg2, arg0 - 1) + class209.method1286(118, arg2, arg0 + 1);
        int var5 = class209.method1286(99, arg2, arg0);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public static final void method2823(int arg0) {
        if (arg0 != 10) {
            method2827(false, 63);
        }
        field7014++;
        class230.field3213.method2315((byte) -100);
        class55.field854.method2315((byte) -124);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
    public final void method2824(byte arg0) {
        field7013++;
        if (arg0 != -95) {
            field7018 = -18;
        }
        class5 var2 = this.field7016;
        synchronized (this.field7016) {
            this.field7016.method38((byte) -32);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
    public static final void method2825(boolean arg0) {
        field7012++;
        if (class19.field267 < 102) {
            class19.field267 += 6;
        }
        if (class193.field2735 != 0) {
            class81.field1124 -= class193.field2735 * 5;
            if (class81.field1124 >= class251.field3614) {
                class81.field1124 = class251.field3614 - 1;
            }
            if (class81.field1124 < 0) {
                class81.field1124 = 0;
            }
            class193.field2735 = 0;
        }
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class406.field5954; var1++) {
            int var2 = class227.field3200[var1].method574(250);
            char var3 = class227.field3200[var1].method575(26283);
            if (var2 == 84) {
                class194.method1218(0);
            } else if (class489.field7484.method1877(126, 82) && var2 == 66) {
                if (class103.field1388 != null) {
                    String var4 = "";
                    for (int var5 = class388.field5759.length - 1; var5 >= 0; var5--) {
                        if (class388.field5759[var5] != null && class388.field5759[var5].length() > 0) {
                            var4 = var4 + class388.field5759[var5] + '\n';
                        }
                    }
                    class103.field1388.setContents(new StringSelection(var4), null);
                }
            } else if (class489.field7484.method1877(2, 82) && var2 == 67) {
                if (class103.field1388 != null) {
                    Transferable var6 = class103.field1388.getContents(null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class452.method2628(var7, 0, '\n');
                                if (var8.length > 1) {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class272.field3805 = var8[var9];
                                        class194.method1218(0);
                                    }
                                } else {
                                    class272.field3805 = class272.field3805 + var7;
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && class222.field3145 > 0) {
                class272.field3805 = class272.field3805.substring(0, class222.field3145 - 1) + class272.field3805.substring(class222.field3145);
                class222.field3145--;
            } else if (var2 == 101 && class222.field3145 < class272.field3805.length()) {
                class272.field3805 = class272.field3805.substring(0, class222.field3145) + class272.field3805.substring(class222.field3145 + 1);
            } else if (var2 == 96 && class222.field3145 > 0) {
                class222.field3145--;
            } else if (var2 == 97 && class222.field3145 < class272.field3805.length()) {
                class222.field3145++;
            } else if (var2 == 102) {
                class222.field3145 = 0;
            } else if (var2 == 103) {
                class222.field3145 = class272.field3805.length();
            } else if (var2 == 104 && class388.field5759.length > class65.field973) {
                class65.field973++;
                class445.method2598((byte) 35);
                class222.field3145 = class272.field3805.length();
            } else if (var2 == 105 && class65.field973 > 0) {
                class65.field973--;
                class445.method2598((byte) 35);
                class222.field3145 = class272.field3805.length();
            } else if (class456.method2659(82, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class272.field3805 = class272.field3805.substring(0, class222.field3145) + class227.field3200[var1].method575(26283) + class272.field3805.substring(class222.field3145);
                class222.field3145++;
            }
        }
        class406.field5954 = 0;
        class176.method1103(0);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)V")
    public final void method2826(int arg0, int arg1) {
        field7015++;
        if (arg1 != 29) {
            method2827(true, 106);
        }
        class5 var3 = this.field7016;
        synchronized (this.field7016) {
            this.field7016.method39(false, arg0);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)I")
    public static final int method2827(boolean arg0, int arg1) {
        field7011++;
        if (!arg0) {
            field7018 = -17;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
    public static final void method2828(int arg0) {
        field7008++;
        for (int var1 = 0; var1 < 5; var1++) {
            class179.field2584[var1] = false;
        }
        class298.field4334 = class263.field3748;
        class28.field487 = class205.field2843;
        class494.field7536 = class21.field284;
        class278.field3964 = arg0;
        class306.field4454 = 5;
        class67.field999 = class317.field4653;
        class312.field4537 = class282.field4026;
        class72.field1058 = -1;
        class391.field5800 = 0;
        class362.field5446 = -1;
        class330.field4794 = class432.field6338;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)V")
    public static void method2829(byte arg0) {
        field7007 = null;
        field7017 = null;
        if (arg0 != -43) {
            field7007 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lci;ILhe;)V")
    public class484(class298 arg0, int arg1, class239 arg2) {
        this.field7006 = arg2;
        this.field7006.method1473(4309, 29);
    }
}
