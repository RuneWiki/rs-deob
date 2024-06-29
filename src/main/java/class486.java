import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class486 extends class298 {

    @OriginalMember(owner = "client!vs", name = "V", descriptor = "Lec;")
    public static class40 field6895 = new class40("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!vs", name = "W", descriptor = "Ljava/lang/String;")
    public static String field6896 = "";

    @OriginalMember(owner = "client!vs", name = "K", descriptor = "I")
    private int field6885;

    @OriginalMember(owner = "client!vs", name = "M", descriptor = "I")
    private int field6886;

    @OriginalMember(owner = "client!vs", name = "N", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!vs", name = "O", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!vs", name = "P", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!vs", name = "Q", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!vs", name = "R", descriptor = "I")
    private int field6891;

    @OriginalMember(owner = "client!vs", name = "S", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!vs", name = "T", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!vs", name = "U", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!vs", name = "X", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!vs", name = "Y", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2871(boolean arg0, String arg1) {
        if (class36.field447 == null) {
            class329.method1999(arg0);
        }
        ++field6892;
        String[] var2 = class217.method1214((byte) 58, arg1, '\n');
        for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
            for (int var4 = class71.field865; var4 > 0; --var4) {
                class36.field447[var4] = class36.field447[var4 - 1];
            }
            class36.field447[0] = var2[var3];
            if (~(class36.field447.length + -1) < ~class71.field865) {
                ++class71.field865;
                if (class215.field2961 > 0) {
                    ++class215.field2961;
                }
            }
        }
        if (!arg0) {
            method2871(true, (String) null);
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(I)V")
    private class486(int arg0) {
        super(0, false);
        this.method2875(0, arg0);
    }

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "(B)V")
    public static void method2872(byte arg0) {
        if (arg0 == 13) {
            field6895 = null;
            field6896 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field6897;
        if (~arg1 == -1) {
            this.method2875(0, arg2.method899((byte) -47));
        }
        if (arg0 > -44) {
            this.method2875(-9, 106);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[[I")
    public final int[][] method157(int arg0, int arg1) {
        ++field6894;
        if (arg0 != -24032) {
            return null;
        } else {
            int[][] var3 = super.field4454.method1638((byte) -18, arg1);
            if (super.field4454.field3886) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class158.field1877; ++var7) {
                    var4[var7] = this.field6886;
                    var5[var7] = this.field6885;
                    var6[var7] = this.field6891;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IC)Z")
    public static final boolean method2873(int arg0, char arg1) {
        int var2 = 0 % ((arg0 - -69) / 56);
        ++field6888;
        return ~arg1 <= -49 && arg1 <= '9';
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
    public class486() {
        this(0);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILvt;)Lcq;")
    public static final class73 method2874(int arg0, class179 arg1) {
        ++field6889;
        if (arg0 != 2) {
            method2872((byte) 47);
        }
        return new class73(arg1.method906(-31), arg1.method906(-96), arg1.method906(-26), arg1.method906(-93), arg1.method899((byte) 117), arg1.method899((byte) -47), arg1.method895((byte) -125));
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)V")
    private final void method2875(int arg0, int arg1) {
        this.field6886 = (arg1 & 16711680) >> 12;
        ++field6890;
        this.field6885 = (65280 & arg1) >> 4;
        if (arg0 != 0) {
            method2873(3, (char) 65503);
        }
        this.field6891 = (arg1 & 255) << 4;
    }
}
