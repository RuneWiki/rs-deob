import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class408 {

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lwe;")
    private class24 field5683 = new class24();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    private int field5687;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    private int field5679;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Ltn;")
    private class109 field5682;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "[Z")
    public static boolean[] field5681 = new boolean[200];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "Lbb;")
    public static class137 field5692;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "[I")
    public static int[] field5694;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "[[[B")
    public static byte[][][] field5693;

    static {
        new class368("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        new class368((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method2520(int arg0) {
        field5675++;
        class81 var2 = (class81) this.field5682.method836(-101);
        while (var2 != null) {
            Object var3 = var2.method653(arg0 - 1);
            if (var3 != null) {
                return var3;
            }
            class81 var4 = var2;
            var2 = (class81) this.field5682.method836(-126);
            var4.method1884(false);
            var4.method1213((byte) 106);
            this.field5687++;
        }
        if (arg0 != 0) {
            field5693 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)Li;", line = 39)
    public static final class83 method2521(byte arg0, int arg1) {
        field5689++;
        class408 var2 = class398.field5514;
        class83 var3;
        synchronized (class398.field5514) {
            var3 = (class83) class398.field5514.method2529(0, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class282.field3843.method1926(0, class431.method2661((byte) -77, arg1), class349.method2109((byte) 86, arg1));
        class83 var5 = new class83();
        var5.field1165 = arg1;
        if (var4 != null) {
            var5.method667(new class366(var4), true);
        }
        var5.method666(108);
        int var6 = -25 % ((arg0 + 59) / 40);
        class408 var7 = class398.field5514;
        synchronized (class398.field5514) {
            class398.field5514.method2527(-95, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 68)
    public final void method2522(byte arg0) {
        for (class81 var2 = (class81) this.field5683.method152(-72); var2 != null; var2 = (class81) this.field5683.method148(5)) {
            if (var2.method654((byte) 104)) {
                var2.method1884(false);
                var2.method1213((byte) 106);
                this.field5687++;
            }
        }
        if (arg0 >= 13) {
            field5684++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 95)
    public static final void method2523(int arg0) {
        if (class220.field3083 != 0) {
            class210.field2937 -= class220.field3083 * 5;
            if (class395.field5486 <= class210.field2937) {
                class210.field2937 = class395.field5486 - 1;
            }
            if (class210.field2937 < 0) {
                class210.field2937 = 0;
            }
            class220.field3083 = 0;
        }
        if (class213.field2983 < 102) {
            class213.field2983 += 6;
        }
        field5669++;
        int var1 = 94 / ((26 - arg0) / 61);
        for (int var2 = 0; var2 < class86.field1211; var2++) {
            int var3 = class165.field2335[var2].method1678((byte) 93);
            char var4 = class165.field2335[var2].method1676(-27038);
            if (var3 == 84) {
                class213.method1424(-92);
            } else if (class146.field2122.method1474(-20986, 82) && var3 == 66) {
                if (class221.field3103 != null) {
                    String var5 = "";
                    for (int var6 = class178.field2543.length - 1; var6 >= 0; var6--) {
                        if (class178.field2543[var6] != null && class178.field2543[var6].length() > 0) {
                            var5 = var5 + class178.field2543[var6] + '\n';
                        }
                    }
                    class221.field3103.setContents(new StringSelection(var5), (ClipboardOwner) null);
                }
            } else if (class146.field2122.method1474(-20986, 82) && var3 == 67) {
                if (class221.field3103 != null) {
                    Transferable var7 = class221.field3103.getContents((Object) null);
                    if (var7 != null) {
                        try {
                            String var8 = (String) var7.getTransferData(DataFlavor.stringFlavor);
                            if (var8 != null) {
                                String[] var9 = class6.method27((byte) 57, var8, '\n');
                                if (var9.length > 1) {
                                    for (int var10 = 0; var10 < var9.length; var10++) {
                                        class80.field1116 = var9[var10];
                                        class213.method1424(-97);
                                    }
                                } else {
                                    class80.field1116 = class80.field1116 + var8;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class317.field4311 > 0) {
                class80.field1116 = class80.field1116.substring(0, class317.field4311 - 1) + class80.field1116.substring(class317.field4311);
                class317.field4311--;
            } else if (var3 == 101 && class317.field4311 < class80.field1116.length()) {
                class80.field1116 = class80.field1116.substring(0, class317.field4311) + class80.field1116.substring(class317.field4311 + 1);
            } else if (var3 == 96 && class317.field4311 > 0) {
                class317.field4311--;
            } else if (var3 == 97 && class317.field4311 < class80.field1116.length()) {
                class317.field4311++;
            } else if (var3 == 102) {
                class317.field4311 = 0;
            } else if (var3 == 103) {
                class317.field4311 = class80.field1116.length();
            } else if (var3 == 104 && class432.field6121 < class178.field2543.length) {
                class432.field6121++;
                class143.method1039(0);
                class317.field4311 = class80.field1116.length();
            } else if (var3 == 105 && class432.field6121 > 0) {
                class432.field6121--;
                class143.method1039(0);
                class317.field4311 = class80.field1116.length();
            } else if (class389.method2425(var4, 0) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+') {
                class80.field1116 = class80.field1116.substring(0, class317.field4311) + class165.field2335[var2].method1676(-27038) + class80.field1116.substring(class317.field4311);
                class317.field4311++;
            }
        }
        class86.field1211 = 0;
        for (int var11 = 0; var11 < 100; var11++) {
            int var10002;
            if (class25.field320[var11]) {
                var10002 = class359.field4975[var11]++;
                if (class359.field4975[var11] > 102) {
                    class25.field320[var11] = false;
                }
            } else {
                var10002 = class359.field4975[var11]--;
                if (class359.field4975[var11] < 0) {
                    class88.field1250[var11] = (int) (Math.random() * (double) class373.field5174);
                    class334.field4532[var11] = (int) (Math.random() * 350.0D);
                    class359.field4975[var11] = 0;
                    class25.field320[var11] = true;
                }
            }
        }
        class136.method1018((byte) 105);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)S", line = 289)
    public static final short method2524(int arg0, int arg1) {
        field5673++;
        int var2 = (arg0 & 0xFCA1) >> 10;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg1 & arg0;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I", line = 314)
    public final int method2525(int arg0) {
        field5695++;
        if (arg0 != -45) {
            this.field5683 = null;
        }
        return this.field5679;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)I", line = 327)
    public final int method2526(int arg0) {
        if (arg0 == -25192) {
            field5677++;
            return this.field5687;
        } else {
            return 74;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJLjava/lang/Object;)V", line = 341)
    public final void method2527(int arg0, long arg1, Object arg2) {
        field5676++;
        this.method2536(arg1, -120);
        if (this.field5687 == 0) {
            class81 var5 = (class81) this.field5683.method146((byte) 121);
            var5.method1884(false);
            var5.method1213((byte) 106);
        } else {
            this.field5687--;
        }
        class405 var6 = new class405(arg2);
        int var7 = -40 % ((-arg0 - 20) / 54);
        this.field5682.method835(4, var6, arg1);
        this.field5683.method145(var6, false);
        var6.field2411 = 0L;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)I", line = 370)
    public static final int method2528(int arg0, int arg1) {
        if (arg1 == 0) {
            field5674++;
            return arg0 >>> 8;
        } else {
            return -27;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 381)
    public final Object method2529(int arg0, long arg1) {
        field5686++;
        class81 var4 = (class81) this.field5682.method837((byte) -72, arg1);
        if (arg0 != 0) {
            field5681 = null;
        }
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method653(-1);
        if (var5 == null) {
            var4.method1884(false);
            var4.method1213((byte) 106);
            this.field5687++;
            return null;
        }
        if (var4.method654((byte) 104)) {
            class405 var6 = new class405(var5);
            this.field5682.method835(4, var6, var4.field4226);
            this.field5683.method145(var6, false);
            var6.field2411 = 0L;
            var4.method1884(false);
            var4.method1213((byte) 106);
        } else {
            this.field5683.method145(var4, false);
            var4.field2411 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V", line = 424)
    public final void method2530(byte arg0) {
        this.field5683.method151(103);
        field5670++;
        this.field5682.method843(-1);
        if (arg0 > -49) {
            field5692 = null;
        }
        this.field5687 = this.field5679;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V", line = 440)
    public final void method2531(int arg0, int arg1) {
        if (class193.field2795 != null) {
            for (class81 var3 = (class81) this.field5683.method152(arg1 - 172); var3 != null; var3 = (class81) this.field5683.method148(5)) {
                if (var3.method654((byte) 104)) {
                    if (var3.method653(-1) == null) {
                        var3.method1884(false);
                        var3.method1213((byte) 106);
                        this.field5687++;
                    }
                } else if (((long) arg0) < (++var3.field2411)) {
                    class81 var4 = class193.field2795.method1273((byte) -128, var3);
                    this.field5682.method835(4, var4, var3.field4226);
                    class104.method785(var3, -1, var4);
                    var3.method1884(false);
                    var3.method1213((byte) 106);
                }
            }
        }
        if (arg1 != 112) {
            field5692 = null;
        }
        field5671++;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V", line = 487)
    public static final void method2532(int arg0) {
        field5690++;
        if (class394.field5477 == null || arg0 != -65) {
            return;
        }
        while (true) {
            while (class85.field1193.length > class373.field5176) {
                class277 var1 = class85.field1193[class373.field5176];
                if (var1 != null && var1.field3770 == -1) {
                    if (class422.field5841 == null) {
                        class422.field5841 = class394.field5477.method286(-10499, var1.field3773);
                    }
                    int var2 = class422.field5841.field4070;
                    if (var2 == -1) {
                        return;
                    }
                    class373.field5176++;
                    var1.field3770 = var2;
                    class422.field5841 = null;
                } else {
                    class373.field5176++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLij;Lij;)V", line = 527)
    public static final void method2533(boolean arg0, class316 arg1, class316 arg2) {
        field5672++;
        if (arg0) {
            method2533(true, (class316) null, (class316) null);
        }
        class417.field5774 = arg2;
        class42.field564 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)I", line = 539)
    public final int method2534(byte arg0) {
        field5691++;
        int var2 = 0;
        class81 var3 = (class81) this.field5683.method152(44);
        if (arg0 != -7) {
            return -52;
        }
        while (var3 != null) {
            if (!var3.method654((byte) 104)) {
                var2++;
            }
            var3 = (class81) this.field5683.method148(5);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V", line = 564)
    public static void method2535(int arg0) {
        field5694 = null;
        field5692 = null;
        field5693 = null;
        field5681 = null;
        if (arg0 != 0) {
            method2535(2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JI)V", line = 579)
    private final void method2536(long arg0, int arg1) {
        int var4 = 30 / ((arg1 + 52) / 52);
        field5680++;
        class81 var5 = (class81) this.field5682.method837((byte) -72, arg0);
        if (var5 != null) {
            var5.method1884(false);
            var5.method1213((byte) 106);
            this.field5687++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V", line = 603)
    public class408(int arg0) {
        this.field5687 = arg0;
        this.field5679 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5682 = new class109(var2);
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 620)
    public final Object method2537(byte arg0) {
        int var2 = 125 % ((arg0 + 23) / 56);
        field5688++;
        class81 var3 = (class81) this.field5682.method842((byte) -25);
        while (var3 != null) {
            Object var4 = var3.method653(-1);
            if (var4 != null) {
                return var4;
            }
            class81 var5 = var3;
            var3 = (class81) this.field5682.method836(-110);
            var5.method1884(false);
            var5.method1213((byte) 106);
            this.field5687++;
        }
        return null;
    }
}
