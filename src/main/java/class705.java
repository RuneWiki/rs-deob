import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class705 {

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "Lav;")
    private class325 field9911 = null;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    private int field9908 = 0;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    private int field9914 = 0;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
    private int field9916 = 0;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "Lvj;")
    private class422 field9909;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "Lud;")
    private class123 field9915;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "[Leb;")
    private class83[] field9917;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "Lhj;")
    public class270 field9910;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "Ljava/lang/String;")
    public static String field9907 = "";

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field9904 = 0;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9913 = new Rectangle[100];

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "Lmv;")
    public static class688 field9906;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIZZII)V")
    public final void method3937(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        field9905++;
        boolean var7 = arg2 & this.field9909.method1042();
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg1 = arg0;
            }
            arg5 = 2;
        }
        if (arg5 != 0 && arg3) {
            arg5 |= Integer.MIN_VALUE;
        }
        int var8 = 108 / ((7 - arg4) / 56);
        if (this.field9916 != arg5) {
            if (this.field9916 != 0) {
                this.field9917[Integer.MAX_VALUE & this.field9916].method438(18610);
            }
            if (arg5 != 0) {
                this.field9917[Integer.MAX_VALUE & arg5].method433((byte) -48, arg3);
                this.field9917[Integer.MAX_VALUE & arg5].method439(arg3, -124);
                this.field9917[arg5 & Integer.MAX_VALUE].method435(arg1, arg0, 92);
            }
            this.field9908 = arg1;
            this.field9911 = null;
            this.field9914 = arg0;
            this.field9916 = arg5;
        } else if (this.field9916 != 0) {
            this.field9917[this.field9916 & Integer.MAX_VALUE].method439(arg3, -125);
            if (this.field9914 != arg0 || this.field9908 != arg1) {
                this.field9917[Integer.MAX_VALUE & this.field9916].method435(arg1, arg0, 12);
                this.field9914 = arg0;
                this.field9908 = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)Z")
    public final boolean method3938(int arg0, int arg1) {
        field9918++;
        if (arg1 != 1) {
            this.method3938(-61, 38);
        }
        return this.field9917[arg0].method440((byte) -120);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILav;I)Z")
    public final boolean method3939(int arg0, class325 arg1, int arg2) {
        field9912++;
        if (this.field9916 == 0) {
            return false;
        }
        if (arg0 != 23491) {
            this.field9917 = null;
        }
        if (this.field9911 != arg1) {
            this.field9917[this.field9916 & Integer.MAX_VALUE].method441(arg0 ^ 0xFFFFD59F, arg2, arg1);
            this.field9911 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lvj;)V")
    public class705(class422 arg0) {
        this.field9909 = arg0;
        this.field9915 = new class123(arg0);
        this.field9917 = new class83[10];
        this.field9917[1] = new class244(arg0);
        this.field9917[2] = new class430(arg0, this.field9915);
        this.field9917[4] = new class492(arg0, this.field9915);
        this.field9917[5] = new class556(arg0, this.field9915);
        this.field9917[6] = new class306(arg0);
        this.field9917[7] = new class583(arg0);
        this.field9917[3] = this.field9910 = new class270(arg0);
        this.field9917[8] = new class149(arg0, this.field9915);
        this.field9917[9] = new class392(arg0, this.field9915);
        if (!this.field9917[8].method440((byte) -115)) {
            this.field9917[8] = this.field9917[4];
        }
        if (!this.field9917[9].method440((byte) -119)) {
            this.field9917[9] = this.field9917[8];
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)V")
    public static void method3940(boolean arg0) {
        if (!arg0) {
            field9906 = null;
            field9913 = null;
            field9907 = null;
        }
    }
}
