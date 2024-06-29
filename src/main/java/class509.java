import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class509 extends class117 {

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "Z")
    public boolean field7438 = true;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "Lvp;")
    public static class123 field7448;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "Ltm;")
    public class264 field7443;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "[I")
    private int[] field7431;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "[I")
    public int[] field7434;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field7437;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "[[I")
    private int[][] field7444;

    static {
        new class180("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field7439 = 0;
        field7448 = new class123(22, 2);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)Lsv;", line = 6)
    public final class467 method3003(int arg0, boolean arg1) {
        field7441++;
        if (!arg1) {
            this.field7443 = null;
        }
        return this.field7431 == null || arg0 < 0 || this.field7431.length < arg0 ? null : class489.method2928(0, this.field7431[arg0]);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lti;[IB)V", line = 24)
    public final void method3004(class303 arg0, int[] arg1, byte arg2) {
        field7445++;
        if (this.field7431 == null) {
            return;
        }
        if (arg2 != -125) {
            method3005(-98);
        }
        for (int var4 = 0; var4 < this.field7431.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method3003(var4, true).field6860;
            if (var5 > 0) {
                arg0.method1900((byte) -124, (long) arg1[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V", line = 59)
    public static void method3005(int arg0) {
        if (arg0 > 76) {
            field7448 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLti;)V", line = 69)
    public final void method3006(byte arg0, class303 arg1) {
        int var3 = 19 / ((arg0 + 57) / 40);
        while (true) {
            int var4 = arg1.method1918((byte) 88);
            if (var4 == 0) {
                field7446++;
                return;
            }
            this.method3008(arg1, false, var4);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V", line = 89)
    public final void method3007(boolean arg0) {
        if (!arg0) {
            this.field7438 = true;
        }
        if (this.field7434 != null) {
            for (int var2 = 0; var2 < this.field7434.length; var2++) {
                this.field7434[var2] = class29.method239(this.field7434[var2], 32768);
            }
        }
        field7442++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lti;ZI)V", line = 111)
    private final void method3008(class303 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field7437 = class82.method650(false, '<', arg0.method1879(30669));
        } else if (arg2 == 2) {
            int var4 = arg0.method1918((byte) -128);
            this.field7434 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7434[var5] = arg0.method1868(0);
            }
        } else if (arg2 == 3) {
            int var6 = arg0.method1918((byte) -100);
            this.field7444 = new int[var6][];
            this.field7431 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1868(0);
                class467 var9 = class489.method2928(0, var8);
                if (var9 != null) {
                    this.field7431[var7] = var8;
                    this.field7444[var7] = new int[var9.field6862];
                    for (int var10 = 0; var10 < var9.field6862; var10++) {
                        this.field7444[var7][var10] = arg0.method1868(0);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field7438 = false;
        }
        field7435++;
        if (arg1) {
            this.field7443 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)Ljava/lang/String;", line = 190)
    public final String method3009(int arg0) {
        field7432++;
        StringBuffer var2 = new StringBuffer(arg0);
        if (this.field7437 == null) {
            return "";
        }
        var2.append(this.field7437[0]);
        for (int var3 = 1; var3 < this.field7437.length; var3++) {
            var2.append("...");
            var2.append(this.field7437[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lti;Z)Ljava/lang/String;", line = 216)
    public final String method3010(class303 arg0, boolean arg1) {
        field7436++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg1) {
            return null;
        }
        if (this.field7431 != null) {
            for (int var4 = 0; var4 < this.field7431.length; var4++) {
                var3.append(this.field7437[var4]);
                var3.append(this.field7443.method1690(arg0.method1867(84, class489.method2928(0, this.field7431[var4]).field6861), this.field7444[var4], this.method3003(var4, true), (byte) 51));
            }
        }
        var3.append(this.field7437[this.field7437.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "(I)I", line = 255)
    public final int method3011(int arg0) {
        field7440++;
        if (arg0 >= -32) {
            return -77;
        } else if (this.field7431 == null) {
            return 0;
        } else {
            return this.field7431.length;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BII)I", line = 270)
    public final int method3012(byte arg0, int arg1, int arg2) {
        field7447++;
        if (arg0 > -45) {
            this.field7444 = null;
        }
        if (this.field7431 == null || arg2 < 0 || this.field7431.length < arg2) {
            return -1;
        } else if (this.field7444[arg2] == null || arg1 < 0 || this.field7444[arg2].length < arg1) {
            return -1;
        } else {
            return this.field7444[arg2][arg1];
        }
    }
}
