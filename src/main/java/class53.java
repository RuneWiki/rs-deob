import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 extends class235 {

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Z")
    public boolean field791 = true;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field793 = 16777215;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "[I")
    public static int[] field794 = new int[32];

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "[I")
    public int[] field784;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "[I")
    private int[] field798;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "[Ljava/lang/String;")
    private String[] field797;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "[[I")
    private int[][] field792;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLil;)V")
    public final void method362(byte arg0, class265 arg1) {
        field788++;
        while (true) {
            int var3 = arg1.method1697(arg0 + 32);
            if (var3 == 0) {
                if (arg0 == 72) {
                    return;
                } else {
                    this.method365((byte) 70, 119, 90);
                    return;
                }
            }
            this.method368(arg1, var3, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)V")
    public static void method363(boolean arg0) {
        if (!arg0) {
            field794 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(Z)I")
    public final int method364(boolean arg0) {
        if (arg0) {
            field786++;
            return this.field798 == null ? 0 : this.field798.length;
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BII)I")
    public final int method365(byte arg0, int arg1, int arg2) {
        if (arg0 != -86) {
            return 97;
        }
        field783++;
        if (this.field798 == null || arg2 < 0 || arg2 > this.field798.length) {
            return -1;
        } else if (this.field792[arg2] == null || arg1 < 0 || this.field792[arg2].length < arg1) {
            return -1;
        } else {
            return this.field792[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)I")
    public final int method366(int arg0, int arg1) {
        if (arg0 != 0) {
            method367(-90);
        }
        field785++;
        return this.field798 == null || arg1 < 0 || this.field798.length < arg1 ? -1 : this.field798[arg1];
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public static final void method367(int arg0) {
        field790++;
        if (class239.field3379 == 0) {
            return;
        }
        try {
            if ((++class212.field3008) > 2000) {
                if (class159.field2079 != null) {
                    class159.field2079.method243(-1);
                    class159.field2079 = null;
                }
                if (class69.field959 >= 1) {
                    class293.field4244 = -5;
                    class239.field3379 = 0;
                    return;
                }
                class239.field3379 = 1;
                class69.field959++;
                if (class87.field1219 == class167.field2197) {
                    class167.field2197 = class228.field3222;
                } else {
                    class167.field2197 = class87.field1219;
                }
                class212.field3008 = 0;
            }
            if (class239.field3379 == 1) {
                class327.field4701 = class361.field5285.method14(class162.field2111, (byte) 120, class167.field2197);
                class239.field3379 = 2;
            }
            if (class239.field3379 == 2) {
                if (class327.field4701.field4259 == 2) {
                    throw new IOException();
                }
                if (class327.field4701.field4259 != 1) {
                    return;
                }
                class159.field2079 = new class26((Socket) class327.field4701.field4262, class361.field5285);
                class327.field4701 = null;
                class159.field2079.method245(arg0 + 31634, class232.field3279.field3915, 0, class232.field3279.field3879);
                if (class188.field2556 != null) {
                    class188.field2556.method1344(0);
                }
                if (client.field3672 != null) {
                    client.field3672.method1344(0);
                }
                int var1 = class159.field2079.method235(-1707);
                if (class188.field2556 != null) {
                    class188.field2556.method1344(0);
                }
                if (client.field3672 != null) {
                    client.field3672.method1344(arg0 ^ 0xFFFF84A3);
                }
                if (var1 != 21) {
                    class293.field4244 = var1;
                    class239.field3379 = 0;
                    class159.field2079.method243(-1);
                    class159.field2079 = null;
                    return;
                }
                class239.field3379 = 3;
            }
            if (class239.field3379 == 3) {
                if (class159.field2079.method241((byte) 17) < 1) {
                    return;
                }
                class190.field2650 = new String[class159.field2079.method235(-1707)];
                class239.field3379 = 4;
            }
            if (arg0 == -31581 && class239.field3379 == 4 && class159.field2079.method241((byte) 17) >= class190.field2650.length * 8) {
                class114.field1556.field3915 = 0;
                class159.field2079.method242(72, 0, class114.field1556.field3879, class190.field2650.length * 8);
                for (int var2 = 0; var2 < class190.field2650.length; var2++) {
                    class190.field2650[var2] = class302.method1912(31013, class114.field1556.method1720(arg0 + 31491));
                }
                class239.field3379 = 0;
                class293.field4244 = 21;
                class159.field2079.method243(-1);
                class159.field2079 = null;
            }
        } catch (IOException var3) {
            if (class159.field2079 != null) {
                class159.field2079.method243(-1);
                class159.field2079 = null;
            }
            if (class69.field959 < 1) {
                class239.field3379 = 1;
                class212.field3008 = 0;
                class69.field959++;
                if (class87.field1219 == class167.field2197) {
                    class167.field2197 = class228.field3222;
                } else {
                    class167.field2197 = class87.field1219;
                }
            } else {
                class293.field4244 = -4;
                class239.field3379 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lil;IB)V")
    private final void method368(class265 arg0, int arg1, byte arg2) {
        if (arg2 != -127) {
            this.method364(false);
        }
        field789++;
        if (arg1 == 1) {
            this.field797 = class369.method2436((byte) 103, arg0.method1712(false), '<');
        } else if (arg1 == 2) {
            int var8 = arg0.method1697(-122);
            this.field784 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field784[var9] = arg0.method1685(8104);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1697(arg2 ^ 0x55);
            this.field792 = new int[var4][];
            this.field798 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1685(arg2 + 8231);
                this.field798[var5] = var6;
                this.field792[var5] = new int[class1.field6[var6]];
                for (int var7 = 0; var7 < class1.field6[var6]; var7++) {
                    this.field792[var5][var7] = arg0.method1685(class347.method2311(arg2, -8151));
                }
            }
            return;
        } else if (arg1 == 4) {
            this.field791 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(Z)V")
    public final void method369(boolean arg0) {
        field795++;
        if (!arg0 && this.field784 != null) {
            for (int var2 = 0; var2 < this.field784.length; var2++) {
                this.field784[var2] = class128.method871(this.field784[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([IILil;)V")
    public final void method370(int[] arg0, int arg1, class265 arg2) {
        field787++;
        if (this.field798 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field798.length && arg0.length > var4; var4++) {
            int var5 = class101.field1367[this.method366(0, var4)];
            if (var5 > 0) {
                arg2.method1667((long) arg0[var4], var5, -8);
            }
        }
        if (arg1 < 126) {
            this.field798 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lil;I)Ljava/lang/String;")
    public final String method371(class265 arg0, int arg1) {
        field799++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field798 != null) {
            for (int var4 = 0; var4 < this.field798.length; var4++) {
                var3.append(this.field797[var4]);
                var3.append(class179.method1096(true, arg0.method1659(class86.field1209[this.field798[var4]], 0), this.field792[var4], this.field798[var4]));
            }
        }
        if (arg1 == -8507) {
            var3.append(this.field797[this.field797.length - 1]);
            return var3.toString();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method372(int arg0) {
        field796++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field797 == null) {
            return "";
        }
        var2.append(this.field797[0]);
        for (int var3 = arg0; var3 < this.field797.length; var3++) {
            var2.append("...");
            var2.append(this.field797[var3]);
        }
        return var2.toString();
    }
}
