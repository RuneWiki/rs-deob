import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class222 {

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public int field2764 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    private int field2769 = -1;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    private int field2759 = -1;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Z")
    public boolean field2760 = true;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public int field2765 = 0;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public int field2761 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    private int field2743 = -1;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    private int field2763 = -1;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[Ljava/lang/String;")
    public String[] field2751 = new String[5];

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public int field2749 = -1;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "Z")
    public boolean field2776 = false;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "Z")
    public boolean field2775 = true;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public int field2754 = -1;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public int field2783 = -1;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    private int field2782 = -1;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public int field2762 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public int field2781 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public int field2784 = -1;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "Z")
    public boolean field2771 = true;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "[I")
    public static int[] field2774;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    private int field2755;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    private int field2757;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public int field2767;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    private int field2779;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    private int field2786;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/lang/String;")
    public String field2747;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "Ljava/lang/String;")
    public String field2785;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "[I")
    public int[] field2773;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "[[[B")
    public static byte[][][] field2770;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Z")
    public final boolean method1345(byte arg0) {
        field2752++;
        if (arg0 != 55) {
            field2774 = null;
        }
        if (this.field2743 == -1 && this.field2782 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field2743 == -1) {
            var3 = class106.method640((byte) 45, this.field2782);
        } else {
            var3 = class56.field649[this.field2743];
        }
        if (this.field2779 > var3 || var3 > this.field2786) {
            return false;
        } else if (this.field2769 == -1 && this.field2763 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field2769 == -1) {
                var5 = class106.method640((byte) 45, this.field2763);
            } else {
                var5 = class56.field649[this.field2769];
            }
            return this.field2755 <= var5 && var5 <= this.field2757;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Luo;I)Lc;")
    public final class436 method1346(class118 arg0, int arg1) {
        field2746++;
        class436 var3 = (class436) class373.field5051.method2295((long) (arg0.field1360 << 29 | this.field2759 | 0x20000), (byte) 74);
        if (arg1 != -10345) {
            return null;
        } else if (var3 == null) {
            class362.field4916.method1797(0, this.field2759);
            class132 var4 = class132.method849(class362.field4916, this.field2759, 0);
            if (var4 != null) {
                var3 = arg0.method697(var4, true);
                class373.field5051.method2294(var3, (byte) 74, (long) (arg0.field1360 << 29 | this.field2759 | 0x20000));
            }
            return var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static final void method1347(int arg0) {
        field2768++;
        if (arg0 >= -66) {
            field2774 = null;
        }
        class184.field2133 = 0;
        class90.field1043 = -1;
        class249.field3276 = -1;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method1348(int arg0) {
        field2770 = null;
        if (arg0 != -1) {
            method1347(56);
        }
        field2774 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lbg;IB)V")
    private final void method1349(class242 arg0, int arg1, byte arg2) {
        int var4 = -42 % ((2 - arg2) / 47);
        if (arg1 == 1) {
            this.field2783 = arg0.method1587((byte) -102);
        } else if (arg1 == 2) {
            this.field2749 = arg0.method1587((byte) -102);
        } else if (arg1 == 3) {
            this.field2785 = arg0.method1565(-128);
        } else if (arg1 == 4) {
            this.field2777 = arg0.method1545(8);
        } else if (arg1 == 5) {
            this.field2754 = arg0.method1545(8);
        } else if (arg1 == 6) {
            this.field2765 = arg0.method1563(-128);
        } else if (arg1 == 7) {
            int var5 = arg0.method1563(-128);
            if ((var5 & 0x1) == 0) {
                this.field2760 = false;
            }
            if ((var5 & 0x2) == 2) {
                this.field2776 = true;
            }
        } else if (arg1 == 8) {
            this.field2775 = arg0.method1563(-128) == 1;
        } else if (arg1 == 9) {
            this.field2782 = arg0.method1587((byte) -102);
            if (this.field2782 == 65535) {
                this.field2782 = -1;
            }
            this.field2743 = arg0.method1587((byte) -102);
            if (this.field2743 == 65535) {
                this.field2743 = -1;
            }
            this.field2779 = arg0.method1576((byte) 126);
            this.field2786 = arg0.method1576((byte) 127);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field2751[arg1 - 10] = arg0.method1565(-49);
        } else if (arg1 == 15) {
            int var6 = arg0.method1563(-128);
            this.field2773 = new int[var6 * 2];
            for (int var7 = 0; var7 < var6 * 2; var7++) {
                this.field2773[var7] = arg0.method1582(false);
            }
            this.field2744 = arg0.method1576((byte) 127);
            this.field2767 = arg0.method1576((byte) 122);
        } else if (arg1 == 16) {
            this.field2771 = false;
        } else if (arg1 == 17) {
            this.field2747 = arg0.method1565(-47);
        } else if (arg1 == 18) {
            this.field2759 = arg0.method1587((byte) -102);
        } else if (arg1 == 19) {
            this.field2784 = arg0.method1587((byte) -102);
        } else if (arg1 == 20) {
            this.field2763 = arg0.method1587((byte) -102);
            if (this.field2763 == 65535) {
                this.field2763 = -1;
            }
            this.field2769 = arg0.method1587((byte) -102);
            if (this.field2769 == 65535) {
                this.field2769 = -1;
            }
            this.field2755 = arg0.method1576((byte) 127);
            this.field2757 = arg0.method1576((byte) 122);
        } else if (arg1 == 21) {
            this.field2780 = arg0.method1576((byte) 123);
        } else if (arg1 == 22) {
            this.field2778 = arg0.method1576((byte) 124);
        }
        field2745++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1350(byte arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field2753++;
        System.exit(1);
        if (arg0 > -24) {
            field2774 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public final void method1351(byte arg0) {
        field2766++;
        int var2 = 114 / ((arg0 + 55) / 43);
        if (this.field2773 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2773.length; var3 += 2) {
            if (this.field2773[var3] < this.field2761) {
                this.field2761 = this.field2773[var3];
            } else if (this.field2773[var3] > this.field2764) {
                this.field2764 = this.field2773[var3];
            }
            if (this.field2773[var3 + 1] < this.field2781) {
                this.field2781 = this.field2773[var3 + 1];
            } else if (this.field2773[var3 + 1] > this.field2762) {
                this.field2762 = this.field2773[var3 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public static final void method1352(int arg0, int arg1) {
        int var2 = -18 / ((arg1 - 63) / 41);
        field2756++;
        class12 var3 = class390.method2422(341555040, arg0, 16);
        var3.method65(-128);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZLuo;)Lc;")
    public final class436 method1353(int arg0, boolean arg1, class118 arg2) {
        field2758++;
        int var4 = arg1 ? this.field2749 : this.field2783;
        int var5 = var4 | arg2.field1360 << 29;
        class436 var6 = (class436) class373.field5051.method2295((long) var5, (byte) 74);
        if (var6 != null) {
            return var6;
        } else if (class362.field4916.method1797(arg0, var4)) {
            class132 var7 = class132.method849(class362.field4916, var4, arg0);
            if (var7 != null) {
                var6 = arg2.method697(var7, true);
                class373.field5051.method2294(var6, (byte) 74, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLbg;)V")
    public final void method1354(byte arg0, class242 arg1) {
        while (true) {
            int var3 = arg1.method1563(arg0 - 179);
            if (var3 == 0) {
                field2748++;
                if (arg0 != 51) {
                    this.method1345((byte) 46);
                    return;
                }
                return;
            }
            this.method1349(arg1, var3, (byte) 117);
        }
    }

    static {
        new class72("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field2774 = new int[] { 1, 2, 4, 8 };
    }
}
