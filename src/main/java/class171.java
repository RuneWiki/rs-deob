import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class171 extends class18 {

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "Z")
    public boolean field2661 = true;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "Loh;")
    public static class281 field2664 = new class281(30);

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
    public static int field2675 = 0;

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "Loh;")
    public static class281 field2676 = new class281(100);

    @OriginalMember(owner = "client!wl", name = "W", descriptor = "I")
    public static int field2677 = -2;

    @OriginalMember(owner = "client!wl", name = "X", descriptor = "Loh;")
    public static class281 field2678 = new class281(64);

    @OriginalMember(owner = "client!wl", name = "Z", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!wl", name = "bb", descriptor = "Z")
    public static boolean field2682 = false;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!wl", name = "ab", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "[I")
    public int[] field2660;

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "[I")
    private int[] field2673;

    @OriginalMember(owner = "client!wl", name = "Y", descriptor = "[I")
    public static int[] field2679;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "[Ljava/lang/String;")
    private String[] field2668;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "[[I")
    private int[][] field2670;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)V")
    public final void method1146(byte arg0) {
        field2667++;
        if (arg0 != 20) {
            field2676 = null;
        }
        if (this.field2660 != null) {
            for (int var2 = 0; var2 < this.field2660.length; var2++) {
                this.field2660[var2] = class45.method330(this.field2660[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1147(int arg0, String arg1) {
        field2671++;
        if (arg0 != 0) {
            method1152((byte) 60);
        }
        System.out.println("Error: " + class266.method1799((byte) -113, "%0a", "\n", arg1));
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII)I")
    public final int method1148(byte arg0, int arg1, int arg2) {
        if (arg0 != -6) {
            this.method1150(-103);
        }
        field2662++;
        if (this.field2673 == null || arg2 < 0 || arg2 > this.field2673.length) {
            return -1;
        } else if (this.field2670[arg2] == null || arg1 < 0 || arg1 > this.field2670[arg2].length) {
            return -1;
        } else {
            return this.field2670[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)V")
    public static final void method1149(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class239.field3885[var1] = false;
        }
        class65.field1100 = 0;
        class160.field2477 = -1;
        class33.field497 = -1;
        class110.field1804 = arg0;
        class259.field4130 = 5;
        field2672++;
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)I")
    public final int method1150(int arg0) {
        if (arg0 <= 22) {
            return -50;
        } else {
            field2666++;
            return this.field2673 == null ? 0 : this.field2673.length;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method1151(int arg0, boolean arg1, byte[] arg2) {
        field2658++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 > ~arg2.length && !class38.field541) {
            try {
                class245 var3 = (class245) Class.forName("fg").getDeclaredConstructor().newInstance();
                var3.method110(arg2, arg0 ^ 0x44FE);
                return var3;
            } catch (Throwable var4) {
                class38.field541 = true;
            }
        }
        return arg1 ? class161.method1094(0, arg2) : arg2;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(B)V")
    public static void method1152(byte arg0) {
        field2676 = null;
        field2664 = null;
        field2679 = null;
        if (arg0 != 124) {
            method1151(-41, true, (byte[]) null);
        }
        field2678 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)I")
    public final int method1153(boolean arg0, int arg1) {
        if (arg0) {
            return -8;
        } else {
            field2665++;
            return this.field2673 == null || arg1 < 0 || arg1 > this.field2673.length ? -1 : this.field2673[arg1];
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILai;)Ljava/lang/String;")
    public final String method1154(int arg0, class88 arg1) {
        if (arg0 != -8211) {
            this.method1146((byte) -50);
        }
        field2674++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2673 != null) {
            for (int var4 = 0; var4 < this.field2673.length; var4++) {
                var3.append(this.field2668[var4]);
                var3.append(class85.method599(-26198, arg1.method655(class208.field3244[this.field2673[var4]], 255), this.field2670[var4], this.field2673[var4]));
            }
        }
        var3.append(this.field2668[this.field2668.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBLai;)V")
    private final void method1155(int arg0, byte arg1, class88 arg2) {
        if (arg1 != -128) {
            this.method1158(-46);
        }
        if (arg0 == 1) {
            this.field2668 = class58.method443((byte) 123, '<', arg2.method675((byte) 16));
        } else if (arg0 == 2) {
            int var8 = arg2.method633(arg1 ^ 0xFFFFFFB9);
            this.field2660 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2660[var9] = arg2.method645(class87.method619(arg1, -11572));
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method633(118);
            this.field2670 = new int[var4][];
            this.field2673 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method645(11596);
                this.field2673[var5] = var6;
                this.field2670[var5] = new int[class263.field4176[var6]];
                for (int var7 = 0; var7 < class263.field4176[var6]; var7++) {
                    this.field2670[var5][var7] = arg2.method645(11596);
                }
            }
        } else if (arg0 == 4) {
            this.field2661 = false;
        }
        field2669++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLai;)V")
    public final void method1156(byte arg0, class88 arg1) {
        while (true) {
            int var3 = arg1.method633(116);
            if (var3 == 0) {
                int var4 = 111 / ((47 - arg0) / 49);
                field2656++;
                return;
            }
            this.method1155(var3, (byte) -128, arg1);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([IILai;)V")
    public final void method1157(int[] arg0, int arg1, class88 arg2) {
        field2657++;
        if (this.field2673 == null) {
            return;
        }
        for (int var4 = 0; this.field2673.length > var4 && arg0.length > var4; var4++) {
            int var5 = class38.field533[this.method1153(false, var4)];
            if (var5 > 0) {
                arg2.method665((long) arg0[var4], var5, arg1 + 24550);
            }
        }
        if (arg1 != -1) {
            method1147(-123, (String) null);
        }
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)Ljava/lang/String;")
    public final String method1158(int arg0) {
        StringBuffer var2 = new StringBuffer(80);
        field2659++;
        if (this.field2668 == null) {
            return "";
        }
        var2.append(this.field2668[0]);
        int var3 = 1;
        if (arg0 != 60) {
            this.method1148((byte) 79, 120, 91);
        }
        while (var3 < this.field2668.length) {
            var2.append("...");
            var2.append(this.field2668[var3]);
            var3++;
        }
        return var2.toString();
    }
}
