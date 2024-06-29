import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class746 extends class107 {

    @OriginalMember(owner = "client!jga", name = "F", descriptor = "Z")
    public boolean field10335;

    @OriginalMember(owner = "client!jga", name = "O", descriptor = "I")
    public int field10343;

    @OriginalMember(owner = "client!jga", name = "K", descriptor = "Ljava/lang/String;")
    public String field10339;

    @OriginalMember(owner = "client!jga", name = "y", descriptor = "Ljava/lang/String;")
    public String field10329;

    @OriginalMember(owner = "client!jga", name = "J", descriptor = "Z")
    public boolean field10338;

    @OriginalMember(owner = "client!jga", name = "E", descriptor = "I")
    public int field10334;

    @OriginalMember(owner = "client!jga", name = "P", descriptor = "J")
    public long field10344;

    @OriginalMember(owner = "client!jga", name = "C", descriptor = "J")
    public long field10333;

    @OriginalMember(owner = "client!jga", name = "G", descriptor = "Z")
    public boolean field10336;

    @OriginalMember(owner = "client!jga", name = "A", descriptor = "I")
    public int field10331;

    @OriginalMember(owner = "client!jga", name = "L", descriptor = "I")
    public int field10340;

    @OriginalMember(owner = "client!jga", name = "N", descriptor = "I")
    public int field10342;

    @OriginalMember(owner = "client!jga", name = "B", descriptor = "[I")
    public static int[] field10332 = new int[1];

    @OriginalMember(owner = "client!jga", name = "R", descriptor = "I")
    public static int field10346 = 0;

    @OriginalMember(owner = "client!jga", name = "M", descriptor = "I")
    public static int field10341;

    @OriginalMember(owner = "client!jga", name = "Q", descriptor = "I")
    public static int field10345;

    @OriginalMember(owner = "client!jga", name = "I", descriptor = "Ljava/lang/String;")
    public String field10337;

    @OriginalMember(owner = "client!jga", name = "z", descriptor = "[[I")
    public static int[][] field10330;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V", line = 4)
    public static void method4157(int arg0) {
        if (arg0 != 1) {
            method4159((byte) 67, null);
        }
        field10330 = null;
        field10332 = null;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(II)I", line = 20)
    public static int method4158(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLso;)Lno;", line = 34)
    public static final class730 method4159(byte arg0, class494 arg1) {
        field10345++;
        class706 var2 = class259.method1689((byte) 4, arg1);
        int var3 = arg1.method2976(-124);
        int var4 = arg1.method2976(-124);
        int var5 = arg1.method2998(true);
        return arg0 == 93 ? new class730(var2.field9843, var2.field9845, var2.field9838, var2.field9832, var2.field9833, var2.field9837, var2.field9834, var2.field9840, var2.field9835, var3, var4, var5) : null;
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 55)
    public class746(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field10335 = arg11;
        this.field10343 = arg4;
        this.field10339 = arg1;
        this.field10329 = arg0;
        this.field10338 = arg9;
        this.field10334 = arg2;
        this.field10344 = arg10;
        this.field10333 = arg5;
        this.field10336 = arg8;
        this.field10331 = arg7;
        this.field10340 = arg3;
        this.field10342 = arg6;
    }
}
