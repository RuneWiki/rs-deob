import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class401 {

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    private int field6028 = 0;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    private int field6024 = -1;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Lvp;")
    private class123 field6020 = new class123();

    @OriginalMember(owner = "client!im", name = "q", descriptor = "Z")
    public boolean field6033 = false;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    private int field6023;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    private int field6032;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "[[[I")
    private int[][][] field6021;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "[Lpk;")
    private class132[] field6025;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field6017 = 0;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "[Lnm;")
    public static class329[] field6027 = new class329[14];

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "[[I")
    public static int[][] field6031;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V")
    public static final void method2418(int arg0, String arg1, int arg2, String arg3, String arg4, boolean arg5) {
        if (arg5) {
            field6030 = 7;
        }
        field6018++;
        class159.method1013(arg4, arg0, null, 17, arg1, arg3, -1, arg2);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public static void method2419(int arg0) {
        field6031 = null;
        field6027 = null;
        if (arg0 != 1) {
            method2419(19);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z")
    public static final boolean method2420(int arg0, int arg1, int arg2) {
        field6029++;
        if (arg0 == 393216) {
            return (arg1 & 0x60000) != 0 | class385.method2354(arg2, arg1, (byte) -123) || class52.method319(arg1, true, arg2) || class413.method2482((byte) 62, arg1, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method2421(int arg0) {
        field6026++;
        if (arg0 >= -96) {
            this.field6020 = null;
        }
        if (this.field6032 != this.field6023) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field6032; var2++) {
            this.field6025[var2] = class56.field869;
        }
        return this.field6021;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[[I")
    public final int[][] method2422(int arg0, int arg1) {
        if (arg0 != -2) {
            field6030 = 16;
        }
        field6019++;
        if (this.field6032 == this.field6023) {
            this.field6033 = this.field6025[arg1] == null;
            this.field6025[arg1] = class56.field869;
            return this.field6021[arg1];
        } else if (this.field6032 == 1) {
            this.field6033 = this.field6024 != arg1;
            this.field6024 = arg1;
            return this.field6021[0];
        } else {
            class132 var3 = this.field6025[arg1];
            if (var3 == null) {
                this.field6033 = true;
                if (this.field6028 >= this.field6032) {
                    class132 var4 = (class132) this.field6020.method818(false);
                    var3 = new class132(arg1, var4.field2034);
                    this.field6025[var4.field2036] = null;
                    var4.method2049(-108);
                } else {
                    var3 = new class132(arg1, this.field6028);
                    this.field6028++;
                }
                this.field6025[arg1] = var3;
            } else {
                this.field6033 = false;
            }
            this.field6020.method819((byte) -128, var3);
            return this.field6021[var3.field2034];
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public final void method2423(byte arg0) {
        for (int var2 = 0; var2 < this.field6032; var2++) {
            this.field6021[var2][0] = null;
            this.field6021[var2][1] = null;
            this.field6021[var2][2] = null;
            this.field6021[var2] = null;
        }
        if (arg0 != -105) {
            this.method2423((byte) 99);
        }
        field6022++;
        this.field6025 = null;
        this.field6021 = null;
        this.field6020.method817(-4);
        this.field6020 = null;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(III)V")
    public class401(int arg0, int arg1, int arg2) {
        this.field6023 = arg1;
        this.field6032 = arg0;
        this.field6021 = new int[this.field6032][3][arg2];
        this.field6025 = new class132[this.field6023];
    }

    static {
        new class475("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field6030 = -1;
        field6031 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
    }
}
