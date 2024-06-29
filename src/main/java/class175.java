import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class175 extends class102 {

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Lbb;")
    public class49 field2825 = new class49();

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Lod;")
    public class18 field2835 = new class18();

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "Lqk;")
    private class104 field2830;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field2827 = 0;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "()Lnk;")
    public final class102 method109() {
        field2826++;
        class272 var1;
        do {
            var1 = (class272) this.field2825.method312((byte) -99);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4539 == null);
        return var1.field4539;
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V")
    public static final void method1287(int arg0) {
        class292.field4791 = 0;
        class163.field2661 = 0;
        class133.field2194 = 0;
        class68.field1144 = -1;
        class130.field2149 = false;
        field2832++;
        if (arg0 > 38) {
            class240.field4059 = 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V")
    public final void method112(int arg0) {
        this.field2835.method112(arg0);
        field2831++;
        for (class272 var2 = (class272) this.field2825.method309(0); var2 != null; var2 = (class272) this.field2825.method312((byte) -79)) {
            if (!this.field2830.method780(var2, 24984)) {
                int var3 = arg0;
                do {
                    if (var2.field4561 >= var3) {
                        this.method1289(var2, var3, (byte) -83);
                        var2.field4561 -= var3;
                        break;
                    }
                    this.method1289(var2, var2.field4561, (byte) 127);
                    var3 -= var2.field4561;
                } while (!this.field2830.method767(128, 0, var2, var3, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIB[ILbh;)V")
    private final void method1288(int arg0, int arg1, int arg2, byte arg3, int[] arg4, class272 arg5) {
        if ((this.field2830.field1694[arg5.field4558] & 0x4) != 0 && arg5.field4540 < 0) {
            int var7 = this.field2830.field1684[arg5.field4558] / class142.field2343;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field4559) / var7;
                if (var8 > arg2) {
                    arg5.field4559 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg5.field4539.method110(arg4, arg0, var8);
                arg5.field4559 += var7 * var8 - 1048576;
                arg0 += var8;
                int var9 = class142.field2343 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class59 var11 = arg5.field4539;
                if (this.field2830.field1660[arg5.field4558] == 0) {
                    arg5.field4539 = class59.method392(arg5.field4557, var11.method403(), var11.method381(), var11.method393());
                } else {
                    arg5.field4539 = class59.method392(arg5.field4557, var11.method403(), 0, var11.method393());
                    this.field2830.method772(arg5, arg5.field4532.field3233[arg5.field4544] < 0, 1148);
                    arg5.field4539.method402(var9, var11.method381());
                }
                if (arg5.field4532.field3233[arg5.field4544] < 0) {
                    arg5.field4539.method376(-1);
                }
                var11.method387(var9);
                var11.method110(arg4, arg0, arg1 - arg0);
                if (var11.method398()) {
                    this.field2835.method107(var11);
                }
            }
        }
        if (arg3 != -72) {
            this.field2830 = null;
        }
        field2823++;
        arg5.field4539.method110(arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lbh;IB)V")
    private final void method1289(class272 arg0, int arg1, byte arg2) {
        field2833++;
        int var4 = -103 % ((61 - arg2) / 37);
        if ((this.field2830.field1694[arg0.field4558] & 0x4) != 0 && arg0.field4540 < 0) {
            int var5 = this.field2830.field1684[arg0.field4558] / class142.field2343;
            int var6 = (var5 + 1048575 - arg0.field4559) / var5;
            arg0.field4559 = arg1 * var5 + arg0.field4559 & 0xFFFFF;
            if (arg1 >= var6) {
                if (this.field2830.field1660[arg0.field4558] == 0) {
                    arg0.field4539 = class59.method392(arg0.field4557, arg0.field4539.method403(), arg0.field4539.method381(), arg0.field4539.method393());
                } else {
                    arg0.field4539 = class59.method392(arg0.field4557, arg0.field4539.method403(), 0, arg0.field4539.method393());
                    this.field2830.method772(arg0, arg0.field4532.field3233[arg0.field4544] < 0, 1148);
                }
                if (arg0.field4532.field3233[arg0.field4544] < 0) {
                    arg0.field4539.method376(-1);
                }
                arg1 = arg0.field4559 / var5;
            }
        }
        arg0.field4539.method112(arg1);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "([III)V")
    public final void method110(int[] arg0, int arg1, int arg2) {
        this.field2835.method110(arg0, arg1, arg2);
        field2829++;
        for (class272 var4 = (class272) this.field2825.method309(0); var4 != null; var4 = (class272) this.field2825.method312((byte) -119)) {
            if (!this.field2830.method780(var4, 24984)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field4561) {
                        this.method1288(var6, var5 + var6, var5, (byte) -72, arg0, var4);
                        var4.field4561 -= var5;
                        break;
                    }
                    this.method1288(var6, var5 + var6, var4.field4561, (byte) -72, arg0, var4);
                    var5 -= var4.field4561;
                    var6 += var4.field4561;
                } while (!this.field2830.method767(128, var6, var4, var5, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()Lnk;")
    public final class102 method105() {
        field2828++;
        class272 var1 = (class272) this.field2825.method309(0);
        if (var1 == null) {
            return null;
        } else if (var1.field4539 == null) {
            return this.method109();
        } else {
            return var1.field4539;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
    public static final void method1290(int arg0, int arg1) {
        field2824++;
        if (arg0 == 37) {
            class148.field2444 = 3.0F;
        } else if (arg0 == 50) {
            class148.field2444 = 4.0F;
        } else if (arg0 == 75) {
            class148.field2444 = 6.0F;
        } else if (arg0 == 100) {
            class148.field2444 = 8.0F;
        } else if (arg0 == 200) {
            class148.field2444 = 16.0F;
        }
        class253.field4282 = -1;
        class253.field4282 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "()I")
    public final int method111() {
        field2822++;
        return 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1291(String arg0, byte arg1) {
        field2834++;
        if (arg0 == null) {
            return;
        }
        if (!(class76.field1296 < 100 || class226.field3830) || class76.field1296 >= 200) {
            class42.method248((byte) -108, class58.field1010);
        } else if (arg1 < -112) {
            String var2 = class207.method1458(-110, arg0);
            if (var2 != null) {
                for (int var3 = 0; var3 < class76.field1296; var3++) {
                    String var7 = class207.method1458(-110, class190.field3040[var3]);
                    if (var7 != null && var7.equals(var2)) {
                        class42.method248((byte) -83, arg0 + class277.field4619);
                        return;
                    }
                    if (class94.field1537[var3] != null) {
                        String var8 = class207.method1458(-63, class94.field1537[var3]);
                        if (var8 != null && var8.equals(var2)) {
                            class42.method248((byte) -69, arg0 + class277.field4619);
                            return;
                        }
                    }
                }
                for (int var4 = 0; var4 < class86.field1425; var4++) {
                    String var5 = class207.method1458(-117, class180.field2876[var4]);
                    if (var5 != null && var5.equals(var2)) {
                        class42.method248((byte) -109, class264.field4400 + arg0 + class87.field1450);
                        return;
                    }
                    if (class122.field2045[var4] != null) {
                        String var6 = class207.method1458(-122, class122.field2045[var4]);
                        if (var6 != null && var6.equals(var2)) {
                            class42.method248((byte) -123, class264.field4400 + arg0 + class87.field1450);
                            return;
                        }
                    }
                }
                if (class207.method1458(-112, class16.field314.field2069).equals(var2)) {
                    class42.method248((byte) -73, class251.field4245);
                } else {
                    class236.field3980.method640((byte) 97, 188);
                    class236.field3980.method1780(class73.method517(-1, arg0), 87);
                    class236.field3980.method1786(-25149, arg0);
                    class244.field4087++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public static final void method1292(int arg0, int arg1, int arg2) {
        class80.field1345 = true;
        class111.field1830 = arg0;
        class307.field4963 = arg1;
        class295.field4845 = arg2;
        class97.field1571 = -1;
        class100.field1587 = -1;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lqk;)V")
    public class175(class104 arg0) {
        this.field2830 = arg0;
    }
}
