import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class26 extends class13 {

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public int field470 = 1000;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field469 = 0;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "Lec;")
    public static class32 field472 = class73.method594("da dieser Computer gegen unsere ", true);

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Z")
    public static boolean field476 = false;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Lec;")
    public static class32 field475 = class73.method594("m-Ochte sich mit Ihnen duellieren)3", true);

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lec;")
    public static class32 field479 = class73.method594("null", true);

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method183(byte arg0) {
        field479 = null;
        field472 = null;
        if (arg0 < -98) {
            field475 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIII)V")
    public void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field474++;
        class101 var10 = this.method132((byte) 109);
        if (var10 != null) {
            this.field470 = var10.field470;
            var10.method184(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lea;I)V")
    public static final void method185(class30 arg0, int arg1) {
        if (arg1 != 0) {
            field475 = null;
        }
        class73.field1716 = arg0;
        field478++;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lod;")
    public class101 method132(byte arg0) {
        if (arg0 != 109) {
            field476 = false;
        }
        field480++;
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BBII)Lec;")
    public static final class32 method186(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > -20) {
            method183((byte) -123);
        }
        field477++;
        class32 var4 = new class32();
        var4.field674 = 0;
        var4.field618 = new byte[arg3];
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field618[var4.field674++] = arg0[var5];
            }
        }
        return var4;
    }
}
