import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class104 extends class69 implements class659 {

    @OriginalMember(owner = "client!db", name = "k", descriptor = "C")
    public char field1194;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "J")
    public long field1196;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lok;")
    public static class255 field1197;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Lkd;")
    public static class787 field1201;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)I", line = 7)
    public final int method727(int arg0) {
        field1200++;
        return arg0 == 17788 ? this.field1203 : -74;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lha;ILv;BI)V", line = 19)
    public static final void method728(class473 arg0, int arg1, class165 arg2, byte arg3, int arg4) {
        class94.field1093.method1046((byte) -50);
        field1193++;
        if (class702.field9782 || arg3 > -98) {
            return;
        }
        for (class226 var5 = (class226) arg2.method1041(1048832); var5 != null; var5 = (class226) arg2.method1033(-1)) {
            class547 var6 = class46.field485.method514(var5.field3433, (byte) -128);
            if (class676.method3851(33985, var6)) {
                boolean var7 = class358.method2243(arg0, arg1, 1, var6, var5, arg4);
                if (var7) {
                    class699.method3947(var6, arg0, -1, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I", line = 52)
    public final int method729(int arg0) {
        if (arg0 != 3766) {
            field1197 = null;
        }
        field1202++;
        return this.field1195;
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V", line = 63)
    public static void method730(int arg0) {
        field1197 = null;
        if (arg0 == 18885) {
            field1201 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I", line = 76)
    public final int method731(int arg0) {
        if (arg0 != -16904) {
            field1201 = null;
        }
        field1205++;
        return this.field1204;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)J", line = 91)
    public final long method732(byte arg0) {
        field1199++;
        if (arg0 <= 7) {
            this.field1203 = -12;
        }
        return this.field1196;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)C", line = 103)
    public final char method733(byte arg0) {
        field1198++;
        return arg0 > -37 ? '[' : this.field1194;
    }
}
