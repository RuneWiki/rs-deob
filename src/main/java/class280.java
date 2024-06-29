import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class280 extends class59 {

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    private int field4628 = 12288;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    private int field4629 = 8192;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    private int field4633 = 2048;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    private int field4631 = 4096;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    private int field4634 = 2048;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    private int field4639 = 0;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    private int field4640 = 0;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "Lph;")
    public static class229 field4627 = class266.method1858("Connexion au serveur de mise -9 jour en cours", 0);

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "Z")
    public static boolean field4635 = false;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "Lph;")
    private static class229 field4645 = class266.method1858("Loaded config", 0);

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "Lph;")
    public static class229 field4644 = field4645;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "Z")
    public static boolean field4642 = false;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "Lph;")
    public static class229 field4646 = class266.method1858("Liste der Welten geladen", 0);

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "(I)V", line = 13)
    public static void method1924(int arg0) {
        if (arg0 == -3270) {
            field4646 = null;
            field4644 = null;
            field4645 = null;
            field4627 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(III)Z", line = 26)
    private final boolean method1925(int arg0, int arg1, int arg2) {
        field4632++;
        int var4 = (arg1 + arg2) * this.field4628 >> 12;
        int var5 = class51.field730[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field4628;
        int var7 = (var6 << 12) / this.field4629;
        if (arg0 > -117) {
            this.field4633 = 2;
        }
        int var8 = this.field4631 * var7 >> 12;
        return var8 > arg1 - arg2 && (-var8) < (arg1 - arg2);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V", line = 48)
    public static final void method1926(int arg0, int arg1) {
        class253 var2 = class326.field5571;
        synchronized (class326.field5571) {
            class119.field1998 = arg1;
        }
        if (arg0 < -93) {
            field4630++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 227)
    public class280() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "(I)V", line = 68)
    public static final void method1927(int arg0) {
        class313.field5278 = 0;
        field4637++;
        class63.field950 = 0;
        class103.method794(26950);
        class193.method1351((byte) 105);
        if (arg0 <= 25) {
            field4627 = (class229) null;
        }
        class67.method526(128);
        for (int var1 = 0; var1 < class63.field950; var1++) {
            int var2 = class57.field809[var1];
            if (class319.field5393 != class187.field3035[var2].field5162) {
                if (class187.field3035[var2].field3559.method2117(false)) {
                    class108.method826(class187.field3035[var2], (byte) 118);
                }
                class187.field3035[var2].method1523((byte) 123, (class313) null);
                class187.field3035[var2] = null;
            }
        }
        if (class187.field3052 != class88.field1497.field2670) {
            throw new RuntimeException("gnp1 pos:" + class88.field1497.field2670 + " psize:" + class187.field3052);
        }
        for (int var3 = 0; var3 < class253.field4233; var3++) {
            if (class187.field3035[class162.field2620[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class253.field4233);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BILhb;)V", line = 136)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field4638++;
        if (arg1 == 0) {
            this.field4634 = arg2.method1161(true);
        } else if (arg1 == 1) {
            this.field4639 = arg2.method1161(true);
        } else if (arg1 == 2) {
            this.field4640 = arg2.method1161(true);
        } else if (arg1 == 3) {
            this.field4633 = arg2.method1161(true);
        } else if (arg1 == 4) {
            this.field4628 = arg2.method1161(true);
        } else if (arg1 == 5) {
            this.field4631 = arg2.method1161(true);
        } else if (arg1 == 6) {
            this.field4629 = arg2.method1161(true);
        }
        if (arg0 != 115) {
            this.method63(false, 73);
        }
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)V", line = 214)
    public final void method65(int arg0) {
        field4636++;
        if (arg0 < 110) {
            field4645 = (class229) null;
        }
        class189.method1320(4096);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lsi;I)V", line = 235)
    public static final void method1928(class66 arg0, int arg1) {
        field4647++;
        if (arg1 != -4) {
            field4645 = (class229) null;
        }
        class178.field2936 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(III)Z", line = 252)
    private final boolean method1929(int arg0, int arg1, int arg2) {
        field4643++;
        int var4 = (arg0 - arg1) * this.field4628 >> 12;
        int var5 = class51.field730[var4 * 255 >> 12 & 0xFF];
        if (arg2 < 47) {
            this.field4634 = 15;
        }
        int var6 = (var5 << 12) / this.field4628;
        int var7 = (var6 << 12) / this.field4629;
        int var8 = this.field4631 * var7 >> 12;
        return arg0 + arg1 < var8 && arg0 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)[I", line = 287)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            field4644 = (class229) null;
        }
        field4648++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int var4 = class269.field4504[arg1] - 2048;
            for (int var5 = 0; var5 < class293.field4789; var5++) {
                int var6 = class219.field3608[var5] - 2048;
                int var7 = this.field4634 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 - 4096 : var8;
                int var10 = var4 + this.field4639;
                int var11 = this.field4640 + var6;
                int var12 = var4 + this.field4633;
                int var13 = var11 >= -2048 ? var11 : var11 + 4096;
                int var14 = var13 > 2048 ? var13 - 4096 : var13;
                int var15 = var12 >= -2048 ? var12 : var12 + 4096;
                int var16 = var15 > 2048 ? var15 - 4096 : var15;
                int var17 = var10 < -2048 ? var10 + 4096 : var10;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = this.method1929(var18, var9, 119) || this.method1925(-120, var16, var14) ? 4096 : 0;
            }
        }
        return var3;
    }
}
