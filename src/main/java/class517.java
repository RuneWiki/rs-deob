import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class517 implements class233 {

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public int field7250;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public int field7242;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public int field7247;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "Leha;")
    public class91 field7249;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Loea;")
    public class599 field7239;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "[Ltia;")
    public static class270[] field7241 = null;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "[[I")
    public static int[][] field7245 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field7244 = 0;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "Z")
    public static boolean field7246 = false;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "Z")
    public static boolean field7240 = false;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method3004(int arg0, int arg1, int arg2) {
        field7243++;
        if (arg2 != 9) {
            method3004(-65, -105, 60);
        }
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V", line = 15)
    public static void method3005(int arg0) {
        field7245 = null;
        if (arg0 != 10) {
            method3005(19);
        }
        field7241 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Lhm;", line = 28)
    public class223 method29(int arg0) {
        if (arg0 != -200) {
            method3004(41, -52, 100);
        }
        field7248++;
        return class99.field1381;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(ILeha;Loea;II)V", line = 68)
    public class517(int arg0, class91 arg1, class599 arg2, int arg3, int arg4) {
        this.field7250 = arg3;
        this.field7242 = arg0;
        this.field7247 = arg4;
        this.field7249 = arg1;
        this.field7239 = arg2;
    }
}
