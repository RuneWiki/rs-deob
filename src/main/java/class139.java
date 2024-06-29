import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class139 extends class200 {

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "Lbg;")
    public static class237 field2454 = new class237(512);

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
    public static int field2466 = 0;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "Loa;")
    public static class99 field2463 = class221.method1463(2844, "<col=00ffff>");

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "Loa;")
    public static class99 field2468 = class221.method1463(2844, "Monde de jeu cr-B-B");

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "Loa;")
    public static class99 field2472 = class221.method1463(2844, "Connexion perdue)3");

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "Loa;")
    private static class99 field2462 = class221.method1463(2844, "glow3:");

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "Loa;")
    public static class99 field2469 = field2462;

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "Loa;")
    public static class99 field2470 = field2462;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "Lwe;")
    public static class15 field2464;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "Ltg;")
    public static class182 field2465;

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "[I")
    public static int[] field2471;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)V")
    public final void method947(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field2459 << 3;
        int var7 = this.field2456 << 3;
        int var8 = (arg2 << 4) + (var7 & 0xF);
        int var9 = (arg4 << 4) + (arg1 & var6);
        field2452++;
        this.method32(var7, var6, var8, var9, arg0, arg3);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
    public abstract void method38(int arg0, int arg1);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIII)V")
    public abstract void method26(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
    public static void method948(int arg0) {
        field2472 = null;
        field2471 = null;
        if (arg0 != 16) {
            method948(106);
        }
        field2463 = null;
        field2465 = null;
        field2464 = null;
        field2469 = null;
        field2454 = null;
        field2462 = null;
        field2468 = null;
        field2470 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
    public abstract void method37(int arg0, int arg1);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBLik;)Loa;")
    public static final class99 method949(int arg0, byte arg1, class261 arg2) {
        field2460++;
        try {
            class99 var3 = new class99();
            var3.field1682 = arg2.method1742(-957401312);
            if (arg1 != 7) {
                return null;
            }
            if (var3.field1682 > arg0) {
                var3.field1682 = arg0;
            }
            var3.field1697 = new byte[var3.field1682];
            arg2.field4587 += class252.field4360.method1470(arg2.field4587, var3.field1697, 0, arg2.field4619, 19578, var3.field1682);
            return var3;
        } catch (Exception var4) {
            return class220.field3828;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
    public abstract void method29(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)V")
    public abstract void method30(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)V")
    public static final void method950(boolean arg0) {
        if (class226.field3917 != null) {
            class226.field3917.method1363((byte) -120);
        }
        if (class125.field2204 != null) {
            class125.field2204.method1363((byte) -123);
        }
        class187.method1282(2, class107.field1819, (byte) -58, 22050);
        field2457++;
        if (arg0) {
            field2472 = null;
        }
        class226.field3917 = class201.method1354(-72, class24.field368, class166.field2951, 0, 22050);
        class226.field3917.method1366(class81.field1431, 31115);
        class125.field2204 = class201.method1354(-93, class24.field368, class166.field2951, 1, 2048);
        class125.field2204.method1366(class165.field2899, 31115);
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)Z")
    public static final boolean method951(int arg0) {
        if (arg0 == 436421925) {
            field2453++;
            return class152.field2671;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIII)V")
    public abstract void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
