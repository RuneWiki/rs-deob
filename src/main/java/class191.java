import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class191 extends class337 {

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    public int field2246 = -1;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public int field2247 = -1;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "Lcq;")
    public static class72 field2236 = new class72(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "Lcq;")
    public static class72 field2248 = new class72("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field2252 = 0;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "J")
    public static long field2250 = 0L;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "[[I")
    public static int[][] field2251 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public int field2241;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field2248 = null;
        if (arg0 >= -13) {
            method1182((byte) 23);
        }
        field2251 = null;
        field2236 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLuo;)V")
    public final void method138(byte arg0, class118 arg1) {
        ++field2237;
        if (arg0 < 78) {
            field2252 = 21;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)I")
    public static int method1183(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Luo;IIZ)Z")
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        ++field2244;
        class450 var5 = arg0.method742();
        if (!arg3) {
            return true;
        } else {
            var5.method929(super.field4596, super.field4586, super.field4594);
            class386 var6 = class131.method843((byte) 5, this.field2239).method339(0, (class156) null, (class434) null, this.field2240, 0, 65536, 96, -1, arg0);
            if (var6 != null && var6.method1474(arg1, arg2, var5, true)) {
                return true;
            } else {
                if (this.field2246 != -1) {
                    class386 var7 = class131.method843((byte) 5, this.field2246).method339(0, (class156) null, (class434) null, this.field2242, 0, 65536, 91, -1, arg0);
                    if (var7 != null && var7.method1474(arg1, arg2, var5, true)) {
                        return true;
                    }
                }
                if (~this.field2247 != 0) {
                    class386 var8 = class131.method843((byte) 5, this.field2247).method339(0, (class156) null, (class434) null, this.field2241, 0, 65536, 54, -1, arg0);
                    if (var8 != null && var8.method1474(arg1, arg2, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(Luo;B)Lkj;")
    public final class175 method130(class118 arg0, byte arg1) {
        int var3 = 11 / ((arg1 - 11) / 37);
        ++field2245;
        class450 var4 = arg0.method742();
        var4.method929(super.field4596, super.field4586, super.field4594);
        class175 var5 = class68.method392((byte) -36, 3);
        if (this.field2247 != -1) {
            class386 var6 = class131.method843((byte) 5, this.field2247).method339(0, (class156) null, (class434) null, this.field2241, 0, 1024, 90, -1, arg0);
            if (var6 != null) {
                var6.method1441(var4, var5.field2030[2], 0);
            }
        }
        if (~this.field2246 != 0) {
            class386 var7 = class131.method843((byte) 5, this.field2246).method339(0, (class156) null, (class434) null, this.field2242, 0, 1024, 121, -1, arg0);
            if (var7 != null) {
                var7.method1441(var4, var5.field2030[1], 0);
            }
        }
        class386 var8 = class131.method843((byte) 5, this.field2239).method339(0, (class156) null, (class434) null, this.field2240, 0, 1024, 121, -1, arg0);
        if (var8 != null) {
            var8.method1441(var4, var5.field2030[0], 0);
        }
        return var5;
    }
}
