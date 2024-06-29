import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public abstract class class10 {

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "B")
    public static byte field60;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BC)Z")
    public static final boolean method22(byte arg0, char arg1) {
        field59++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class488.field6684;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return arg0 <= 47;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public abstract void method23(int arg0);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "()V")
    public abstract void method24();

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lhba;)V")
    public abstract void method25(class10 arg0);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIII)V")
    public abstract void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method27(String arg0, int arg1) {
        if (arg1 >= -95) {
            field60 = -46;
        }
        field61++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class233.field3026; var2++) {
            if (arg0.equalsIgnoreCase(class512.field6935[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIB)Z")
    public static final boolean method28(int arg0, int arg1, byte arg2) {
        if (arg2 > -84) {
            method28(67, 68, (byte) 112);
        }
        field58++;
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(III[I)V")
    public abstract void method29(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
    public abstract void method30(int arg0);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lgg;)V")
    public static final void method31(class176 arg0) {
        class22.field158.method451(arg0.field2170, arg0.field2178 + (arg0.method132(0) >> 1), arg0.field2165, class474.field6556);
        arg0.field2172 = class474.field6556[0];
        arg0.field2166 = class474.field6556[1];
        arg0.field2169 = class474.field6556[2];
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(III[I)V")
    public abstract void method32(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)V")
    public abstract void method33(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
    public abstract void method34(int arg0);

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "()Lhba;")
    public abstract class10 method35();

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(III[I)V")
    public abstract void method36(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "(I)V")
    public abstract void method37(int arg0);

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "(I)V")
    public abstract void method38(int arg0);

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(III)V")
    public abstract void method39(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "(I)V")
    public abstract void method40(int arg0);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "([I)V")
    public abstract void method41(int[] arg0);
}
