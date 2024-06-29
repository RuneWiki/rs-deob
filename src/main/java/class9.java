import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class513 {

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Z")
    public boolean field87 = false;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public int field90 = -1;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lsq;")
    public static class161 field91 = new class161(0, 1);

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)[Liv;")
    public static final class82[] method52(byte arg0) {
        field89++;
        return arg0 == -110 ? new class82[] { class246.field3380, class468.field6538, class28.field614, class6.field58, class506.field7215, class634.field9099, class350.field4677, class529.field7729, class215.field2733, class139.field1756, class262.field3605, class173.field2130, class267.field3668, class389.field5192, class620.field8886 } : null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIII)V")
    public static final void method53(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg2 > arg3) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class678.field9722[var5][arg0] = arg4;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class678.field9722[var6][arg0] = arg4;
            }
        }
        field97++;
        int var7 = 109 / ((arg1 + 82) / 37);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)Lke;")
    public static final class553 method54(byte arg0) {
        if (arg0 > -58) {
            method53(47, (byte) 13, 4, -59, -93);
        }
        field92++;
        class553 var1 = (class553) class703.field9927.method2074(-124);
        if (var1 == null) {
            return new class553();
        } else {
            class530.field7744--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method55(int arg0) {
        field91 = null;
        if (arg0 > -69) {
            method54((byte) -125);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
    public class9(int arg0) {
        this.field90 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
    public static final void method56(int arg0, boolean arg1) {
        field86++;
        if (!arg1) {
            method53(-69, (byte) -32, -95, -15, -21);
        }
        class233 var2 = class7.method44(arg0, 7, -1);
        var2.method1423(0);
    }
}
