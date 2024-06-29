import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class110 {

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Lhn;")
    private class509 field1468 = new class509(64);

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lfo;")
    private class361 field1476;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "Ljc;")
    public static class305 field1473 = new class305("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "[I")
    public static int[] field1477 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
    public final void method675(int arg0, int arg1) {
        class509 var3 = this.field1468;
        synchronized (this.field1468) {
            this.field1468.method3045(48);
            this.field1468 = new class509(arg1);
        }
        field1471++;
        if (arg0 != 0) {
            field1477 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public final void method676(int arg0) {
        field1472++;
        if (arg0 > 117) {
            class509 var2 = this.field1468;
            synchronized (this.field1468) {
                this.field1468.method3045(48);
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    public static final void method677(byte arg0) {
        field1470++;
        class119.method710((byte) 112);
        class140.method866(22050, 2, true, class319.field4256.field4670);
        class235.field3146 = class99.method605((byte) -85, 0, 22050, class60.field701, class381.field5518);
        class235.field3146.method1039((byte) -115, class522.field7673);
        class153.field2005 = class99.method605((byte) -85, 1, 2048, class60.field701, class381.field5518);
        class153.field2005.method1039((byte) -126, class465.field6928);
        if (arg0 <= 68) {
            method677((byte) 31);
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
    public final void method678(byte arg0) {
        field1474++;
        class509 var2 = this.field1468;
        synchronized (this.field1468) {
            this.field1468.method3034((byte) 69);
        }
        if (arg0 != 82) {
            this.field1468 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
    public static void method679(boolean arg0) {
        field1473 = null;
        if (!arg0) {
            method679(false);
        }
        field1477 = null;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)Lcu;")
    public final class148 method680(int arg0, int arg1) {
        field1475++;
        class509 var3 = this.field1468;
        class148 var4;
        synchronized (this.field1468) {
            var4 = (class148) this.field1468.method3032(arg1 - 19351, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field1476;
        byte[] var6;
        synchronized (this.field1476) {
            var6 = this.field1476.method2130(class468.method2858(arg0, arg1 - 22830), class340.method1977(arg0, (byte) -8), -120);
        }
        if (arg1 != 22940) {
            field1473 = null;
        }
        class148 var7 = new class148();
        if (var6 != null) {
            var7.method892((byte) 100, new class396(var6));
        }
        class509 var8 = this.field1468;
        synchronized (this.field1468) {
            this.field1468.method3046((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(II)V")
    public final void method681(int arg0, int arg1) {
        field1469++;
        if (arg0 != 32011) {
            field1477 = null;
        }
        class509 var3 = this.field1468;
        synchronized (this.field1468) {
            this.field1468.method3036(arg1, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ld;ILfo;)V")
    public class110(class104 arg0, int arg1, class361 arg2) {
        this.field1476 = arg2;
        if (this.field1476 != null) {
            int var4 = this.field1476.method2138(-1) - 1;
            this.field1476.method2136(-102, var4);
        }
    }
}
