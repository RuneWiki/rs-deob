import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class119 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lci;")
    private class30 field2188 = new class30();

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
    public static int[] field2187 = new int[50];

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2185 = 0;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lrd;")
    public static class173 field2190 = class133.method843("Keine Antwort vom Anmelde)2Server)3", 51);

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lrd;")
    public static class173 field2191 = class133.method843(")3", 111);

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lrd;")
    public static class173 field2192 = class133.method843("welle2:", -114);

    @OriginalMember(owner = "client!m", name = "j", descriptor = "[B")
    public static byte[] field2194 = new byte[520];

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Z")
    public static boolean field2198 = true;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Z")
    public static boolean field2189 = false;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Lrd;")
    public static class173 field2201 = class133.method843("scape main", 61);

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lrd;")
    public static class173 field2202 = class133.method843("Ihr Spielkonto wird bereits benutzt)3", -110);

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lrd;")
    public static class173 field2200 = class133.method843("Sprites geladen)3", -76);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lci;")
    public final class30 method720(int arg0) {
        field2195++;
        class30 var2 = this.field2188.field608;
        if (arg0 != 0) {
            this.method722(-38);
        }
        return this.field2188 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Lff;")
    public static final class57 method721(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        if (class121.field2251 == null) {
            class121.field2251 = new class57();
        }
        field2203++;
        return class121.field2251;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Lci;")
    public final class30 method722(int arg0) {
        field2199++;
        if (arg0 < 37) {
            return null;
        }
        class30 var2 = this.field2188.field608;
        if (this.field2188 == var2) {
            return null;
        } else {
            var2.method236((byte) 120);
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lci;Z)V")
    public final void method723(class30 arg0, boolean arg1) {
        if (!arg1) {
            field2189 = false;
        }
        field2196++;
        if (arg0.field609 != null) {
            arg0.method236((byte) 120);
        }
        arg0.field609 = this.field2188.field609;
        arg0.field608 = this.field2188;
        arg0.field609.field608 = arg0;
        arg0.field608.field609 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public static void method724(int arg0) {
        field2190 = null;
        field2201 = null;
        field2187 = null;
        field2191 = null;
        field2192 = null;
        field2202 = null;
        if (arg0 != 127) {
            field2194 = null;
        }
        field2200 = null;
        field2194 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)I")
    public static final int method725(int arg0, int arg1) {
        if (arg1 == 127) {
            field2186++;
            return arg0 & 0x7F;
        } else {
            return 78;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILci;)V")
    public final void method726(int arg0, class30 arg1) {
        if (arg1.field609 != null) {
            arg1.method236((byte) 120);
        }
        if (arg0 >= -28) {
            method721(-95);
        }
        field2197++;
        arg1.field609 = this.field2188;
        arg1.field608 = this.field2188.field608;
        arg1.field609.field608 = arg1;
        arg1.field608.field609 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class119() {
        this.field2188.field608 = this.field2188;
        this.field2188.field609 = this.field2188;
    }
}
