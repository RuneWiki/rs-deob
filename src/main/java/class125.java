import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public abstract class class125 extends class577 {

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "Lqfa;")
    public class106 field1937;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "Lbu;")
    public static class21 field1931 = new class21(74, -1);

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "[B")
    public static byte[] field1940 = new byte[2048];

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "Lol;")
    public static class299 field1941 = new class299(0, 0);

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "I")
    public static int field1939;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qca", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field1942;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "Z")
    public boolean field1930;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)V")
    public abstract void method145(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZILkm;Lkm;)V")
    public abstract void method147(boolean arg0, int arg1, class373 arg2, class373 arg3);

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
    public static void method942(int arg0) {
        field1940 = null;
        field1931 = null;
        if (arg0 != -1) {
            field1932 = 3;
        }
        field1941 = null;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)Z")
    public abstract boolean method141(boolean arg0);

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)I")
    public int method142(int arg0) {
        field1936++;
        if (arg0 < 73) {
            this.method945(-91);
        }
        return 0;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(II)V")
    public abstract void method138(int arg0, int arg1);

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)V")
    public abstract void method143(int arg0);

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "(I)Z")
    public final boolean method943(int arg0) {
        field1939++;
        if (arg0 != -24106) {
            this.field1937 = null;
        }
        return this.field1930;
    }

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "(I)I")
    public final int method944(int arg0) {
        field1935++;
        return arg0 == 5 ? 1 : -115;
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(B)Z")
    public abstract boolean method144(byte arg0);

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "(I)Z")
    public final boolean method945(int arg0) {
        if (arg0 != 5) {
            field1932 = -33;
        }
        field1934++;
        return false;
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lqfa;)V")
    public class125(class106 arg0) {
        this.field1937 = arg0;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BIII)Z")
    public static final boolean method946(byte arg0, int arg1, int arg2, int arg3) {
        field1933++;
        class484 var4 = (class484) class335.method2132(arg2, arg3, arg1);
        boolean var5 = true;
        int var6 = 108 % ((arg0 - 49) / 36);
        if (var4 != null) {
            var5 &= class304.method1972((byte) -86, var4);
        }
        class484 var7 = (class484) class537.method3227(arg2, arg3, arg1, field1942 == null ? (field1942 = method947("nq")) : field1942);
        if (var7 != null) {
            var5 &= class304.method1972((byte) 31, var7);
        }
        class484 var8 = (class484) class266.method1725(arg2, arg3, arg1);
        if (var8 != null) {
            var5 &= class304.method1972((byte) -88, var8);
        }
        return var5;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method947(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
