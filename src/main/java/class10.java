import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class10 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    private int field96 = 0;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    private int field101 = 0;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    private int field106 = 0;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lkk;")
    private class179 field102 = null;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lih;")
    private class214 field105;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Ljq;")
    private class264 field104;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[Lvo;")
    private class261[] field97;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lwo;")
    public class228 field99;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lkk;IB)Z")
    public final boolean method56(class179 arg0, int arg1, byte arg2) {
        int var4 = -99 / ((-arg2 - 32) / 34);
        field107++;
        if (this.field106 == 0) {
            return false;
        }
        if (this.field102 != arg0) {
            this.field97[Integer.MAX_VALUE & this.field106].method1024(arg1, 83, arg0);
            this.field102 = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Z")
    public final boolean method57(int arg0, int arg1) {
        field103++;
        return arg0 < 31 ? false : this.field97[arg1].method1026(78);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZIIIZ)V")
    public final void method58(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = -106 % ((arg4 - 69) / 34);
        boolean var8 = arg5 & this.field105.method881();
        field110++;
        if (!var8 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
            if (arg0 == 4) {
                arg3 = arg2;
            }
            arg0 = 2;
        }
        if (arg0 != 0 && arg1) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (this.field106 != arg0) {
            if (this.field106 != 0) {
                this.field97[Integer.MAX_VALUE & this.field106].method1023(5000);
            }
            if (arg0 != 0) {
                this.field97[Integer.MAX_VALUE & arg0].method1020(arg1, (byte) 34);
                this.field97[arg0 & Integer.MAX_VALUE].method1022(127, arg1);
                this.field97[arg0 & Integer.MAX_VALUE].method1021(arg3, 124, arg2);
            }
            this.field101 = arg3;
            this.field106 = arg0;
            this.field96 = arg2;
            this.field102 = null;
        } else if (this.field106 != 0) {
            this.field97[Integer.MAX_VALUE & this.field106].method1022(124, arg1);
            if (this.field96 != arg2 || this.field101 != arg3) {
                this.field97[Integer.MAX_VALUE & this.field106].method1021(arg3, 125, arg2);
                this.field101 = arg3;
                this.field96 = arg2;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLec;)Lec;")
    public static final class68 method59(byte arg0, class68 arg1) {
        if (arg0 != -14) {
            return null;
        }
        field108++;
        class68 var2 = client.method480(arg1);
        if (var2 == null) {
            var2 = arg1.field1102;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lih;)V")
    public class10(class214 arg0) {
        this.field105 = arg0;
        this.field104 = new class264(arg0);
        this.field97 = new class261[10];
        this.field97[1] = new class382(arg0);
        this.field97[2] = new class442(arg0, this.field104);
        this.field97[4] = new class373(arg0, this.field104);
        this.field97[5] = new class244(arg0, this.field104);
        this.field97[6] = new class259(arg0);
        this.field97[7] = new class136(arg0);
        this.field97[3] = this.field99 = new class228(arg0);
        this.field97[8] = new class534(arg0, this.field104);
        this.field97[9] = new class200(arg0, this.field104);
        if (!this.field97[8].method1026(86)) {
            this.field97[8] = this.field97[4];
        }
        if (!this.field97[9].method1026(127)) {
            this.field97[9] = this.field97[8];
        }
    }

    static {
        new class306("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field109 = 10;
    }
}
