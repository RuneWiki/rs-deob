import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class213 extends class115 {

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "[Z")
    public static boolean[] field3595 = new boolean[112];

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "Lrb;")
    public static class254 field3591 = new class254(32);

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "Lub;")
    private static class227 field3598 = class257.method1749("World", 17263);

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "Lub;")
    public static class227 field3599 = field3598;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "Lub;")
    public static class227 field3601 = class257.method1749("::clientdrop", 17263);

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "Lub;")
    private static class227 field3597 = class257.method1749("http:)4)4advert)3runescape)3com)4banner)3ws?size=729", 17263);

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "Lub;")
    public static class227 field3603 = field3597;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "Lub;")
    public static class227 field3606 = class257.method1749("scrollen:", 17263);

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "Luh;")
    public static class198 field3602 = new class198();

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "[Lub;")
    public static class227[] field3607 = new class227[500];

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public int field3600;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method790(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIII)V")
    public abstract void method786(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V")
    public abstract void method1012(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIIII)V")
    public final void method1353(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3589++;
        int var6 = this.field3592 << 3;
        int var7 = 120 / ((arg1 + 21) / 48);
        int var8 = this.field3594 << 3;
        int var9 = (arg3 << 4) + (var6 & 0xF);
        int var10 = (arg2 << 4) + (var8 & 0xF);
        this.method790(var6, var8, var9, var10, arg0, arg4);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIII)V")
    public abstract void method1004(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static final void method1354(int arg0) {
        class147.field2572 = 0;
        class236.field4094 = 0;
        class2.method5((byte) -71);
        if (arg0 != -1411020925) {
            field3595 = null;
        }
        class200.method1291((byte) -80);
        class85.method512(-12166);
        field3605++;
        class153.method960((byte) -110);
        for (int var1 = 0; var1 < class236.field4094; var1++) {
            int var3 = class8.field164[var1];
            if (class253.field4393 != class27.field446[var3].field73) {
                if (class27.field446[var3].field3831 > 0) {
                    class120.method751(-90, class27.field446[var3]);
                }
                class27.field446[var3] = null;
            }
        }
        if (class179.field3073 != class32.field512.field3879) {
            throw new RuntimeException("gpp1 pos:" + class32.field512.field3879 + " psize:" + class179.field3073);
        }
        for (int var2 = 0; var2 < class146.field2512; var2++) {
            if (class27.field446[class15.field278[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class146.field2512);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
    public abstract void method784(int arg0, int arg1);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)Lli;")
    public static final class78 method1355(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2037;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V")
    public abstract void method791(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)V")
    public abstract void method787(int arg0, int arg1);

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(II)Z")
    public static final boolean method1356(int arg0, int arg1) {
        field3596++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == arg1) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static void method1357(int arg0) {
        field3595 = null;
        field3597 = null;
        if (arg0 > -121) {
            return;
        }
        field3603 = null;
        field3606 = null;
        field3601 = null;
        field3591 = null;
        field3598 = null;
        field3599 = null;
        field3602 = null;
        field3607 = null;
    }
}
