import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class438 extends class499 {

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field6010 = 0;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "Ljava/lang/String;")
    public String field6007;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "[C")
    public char[] field5999;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "[C")
    public char[] field6008;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "[I")
    public int[] field6004;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "[I")
    public int[] field6005;

    static {
        new class304("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILmd;)V", line = 7)
    private final void method2513(int arg0, int arg1, class379 arg2) {
        if (arg0 > -43) {
            this.method2517(-48);
        }
        field5998++;
        if (arg1 == 1) {
            this.field6007 = arg2.method2218(-5);
        } else if (arg1 == 2) {
            int var7 = arg2.method2238(255);
            this.field6008 = new char[var7];
            this.field6005 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field6005[var8] = arg2.method2212((byte) 83);
                byte var9 = arg2.method2194(-1);
                this.field6008[var8] = var9 == 0 ? 0 : class237.method1471(5728, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method2238(255);
            this.field5999 = new char[var4];
            this.field6004 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6004[var5] = arg2.method2212((byte) 83);
                byte var6 = arg2.method2194(-1);
                this.field5999[var5] = var6 == 0 ? 0 : class237.method1471(5728, var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(CI)I", line = 74)
    public final int method2514(char arg0, int arg1) {
        if (arg1 != 9826) {
            return -111;
        }
        field6009++;
        if (this.field6005 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field6005.length; var3++) {
            if (this.field6008[var3] == arg0) {
                return this.field6005[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILmd;)V", line = 103)
    public final void method2515(int arg0, class379 arg1) {
        while (true) {
            int var3 = arg1.method2238(255);
            if (var3 == 0) {
                int var4 = 84 % ((-arg0 - 38) / 42);
                field6006++;
                return;
            }
            this.method2513(-50, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(CB)Z", line = 126)
    public static final boolean method2516(char arg0, byte arg1) {
        field6000++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class482.method2773(arg0, arg1 - 29892)) {
            return true;
        } else {
            char[] var2 = class154.field2248;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            if (arg1 != 27) {
                method2516((char) 65474, (byte) 39);
            }
            char[] var4 = class223.field3007;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 172)
    public final void method2517(int arg0) {
        if (arg0 != 32768) {
            this.field6004 = null;
        }
        if (this.field6004 != null) {
            for (int var2 = 0; var2 < this.field6004.length; var2++) {
                this.field6004[var2] = class191.method1230(this.field6004[var2], 32768);
            }
        }
        field6003++;
        if (this.field6005 != null) {
            for (int var3 = 0; var3 < this.field6005.length; var3++) {
                this.field6005[var3] = class191.method1230(this.field6005[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BC)I", line = 217)
    public final int method2518(byte arg0, char arg1) {
        field6002++;
        if (this.field6004 == null) {
            return -1;
        }
        if (arg0 > -95) {
            this.field6007 = null;
        }
        for (int var3 = 0; var3 < this.field6004.length; var3++) {
            if (this.field5999[var3] == arg1) {
                return this.field6004[var3];
            }
        }
        return -1;
    }
}
