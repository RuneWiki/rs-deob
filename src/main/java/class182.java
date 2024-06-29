import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class182 extends class114 {

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "Z")
    public boolean field2468 = true;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lla;")
    public static class319 field2459 = new class319(0, 10);

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lem;")
    public class152 field2461;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "Lod;")
    public static class355 field2469;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[I")
    public int[] field2456;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "[I")
    private int[] field2458;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field2464;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "[[I")
    private int[][] field2466;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method1230(int arg0) {
        field2462++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2464 == null) {
            return "";
        }
        var2.append(this.field2464[0]);
        for (int var3 = 1; var3 < this.field2464.length; var3++) {
            var2.append("...");
            var2.append(this.field2464[var3]);
        }
        if (arg0 > -45) {
            field2469 = null;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field2459 = null;
        if (arg0 != 0) {
            method1231(-32);
        }
        field2469 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLnj;)V")
    public final void method1232(byte arg0, class164 arg1) {
        int var3 = -93 / ((59 - arg0) / 61);
        field2467++;
        while (true) {
            int var4 = arg1.method1087(false);
            if (var4 == 0) {
                return;
            }
            this.method1237(var4, arg1, -5);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[ILnj;)V")
    public final void method1233(byte arg0, int[] arg1, class164 arg2) {
        field2473++;
        if (this.field2458 == null || arg0 <= 13) {
            return;
        }
        for (int var4 = 0; var4 < this.field2458.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method1235(var4, -122).field1229;
            if (var5 > 0) {
                arg2.method1116(false, var5, (long) arg1[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
    public final int method1234(int arg0, int arg1, int arg2) {
        field2465++;
        if (this.field2458 == null || arg2 < 0 || arg2 > this.field2458.length) {
            return -1;
        } else {
            if (arg0 != 65536) {
                this.method1233((byte) -55, null, null);
            }
            return this.field2466[arg2] == null || arg1 < 0 || arg1 > this.field2466[arg2].length ? -1 : this.field2466[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lfg;")
    public final class84 method1235(int arg0, int arg1) {
        if (arg1 >= -116) {
            this.field2466 = null;
        }
        field2457++;
        return this.field2458 == null || arg0 < 0 || this.field2458.length < arg0 ? null : class375.method2360(false, this.field2458[arg0]);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLnj;)Ljava/lang/String;")
    public final String method1236(boolean arg0, class164 arg1) {
        if (arg0) {
            this.field2464 = null;
        }
        field2472++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2458 != null) {
            for (int var4 = 0; var4 < this.field2458.length; var4++) {
                var3.append(this.field2464[var4]);
                var3.append(this.field2461.method995(this.method1235(var4, -120), 1, arg1.method1070(class375.method2360(arg0, this.field2458[var4]).field1228, 124), this.field2466[var4]));
            }
        }
        var3.append(this.field2464[this.field2464.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILnj;I)V")
    private final void method1237(int arg0, class164 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2464 = class61.method437(arg1.method1064(false), '<', 243);
        } else if (arg0 == 2) {
            int var9 = arg1.method1087(false);
            this.field2456 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2456[var10] = arg1.method1074(-635989152);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1087(false);
            this.field2458 = new int[var4];
            this.field2466 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1074(-635989152);
                class84 var7 = class375.method2360(false, var6);
                if (var7 != null) {
                    this.field2458[var5] = var6;
                    this.field2466[var5] = new int[var7.field1220];
                    for (int var8 = 0; var8 < var7.field1220; var8++) {
                        this.field2466[var5][var8] = arg1.method1074(-635989152);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field2468 = false;
        }
        field2463++;
        if (arg2 != -5) {
            this.method1230(73);
        }
    }

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)I")
    public final int method1238(int arg0) {
        field2471++;
        if (this.field2458 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method1236(true, null);
            }
            return this.field2458.length;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public final void method1239(byte arg0) {
        if (arg0 <= 24) {
            return;
        }
        if (this.field2456 != null) {
            for (int var2 = 0; var2 < this.field2456.length; var2++) {
                this.field2456[var2] = class311.method1956(this.field2456[var2], 32768);
            }
        }
        field2460++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)Z")
    public static final boolean method1240(int arg0, int arg1, int arg2) {
        field2470++;
        if ((~(arg2 & 0x10000) != arg1 | class24.method226(false, arg0, arg2)) || class527.method3123((byte) 125, arg0, arg2)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && class167.method1134(55, arg0, arg2);
        }
    }

    static {
        new class446("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }
}
