import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public abstract class class142 extends class261 {

    @OriginalMember(owner = "client!su", name = "p", descriptor = "Lda;")
    public class44 field2349;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "Lmo;")
    public static class531 field2352 = new class531(3, 14);

    @OriginalMember(owner = "client!su", name = "t", descriptor = "Los;")
    public static class309 field2353 = new class309("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!su", name = "v", descriptor = "Lcd;")
    public static class208 field2355 = new class208("", 13);

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!su", name = "u", descriptor = "Lvi;")
    public static class380 field2354;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "Z")
    public boolean field2344;

    @OriginalMember(owner = "client!su", name = "w", descriptor = "Z")
    public static boolean field2356;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Z")
    public abstract boolean method1053(int arg0);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IZIZ)I")
    public static final int method1054(int arg0, boolean arg1, int arg2, boolean arg3) {
        field2347++;
        class11 var4 = class271.method1714(arg0, 0, arg1);
        if (var4 == null) {
            return 0;
        }
        if (!arg3) {
            field2352 = null;
        }
        if (arg2 == -1) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field149.length; var6++) {
            if (var4.field151[var6] == arg2) {
                var5 += var4.field149[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lsq;Lsq;IB)V")
    public abstract void method1055(class120 arg0, class120 arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(I)I")
    public int method1056(int arg0) {
        field2345++;
        return arg0 == 0 ? 0 : 78;
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(I)Z")
    public abstract boolean method1057(int arg0);

    @OriginalMember(owner = "client!su", name = "e", descriptor = "(I)I")
    public final int method1058(int arg0) {
        field2350++;
        if (arg0 != -13197) {
            this.method1055(null, null, -51, (byte) -10);
        }
        return 1;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Z")
    public final boolean method1059(byte arg0) {
        if (arg0 < 23) {
            field2352 = null;
        }
        field2346++;
        return false;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IZ)V")
    public abstract void method1060(int arg0, boolean arg1);

    @OriginalMember(owner = "client!su", name = "f", descriptor = "(I)V")
    public abstract void method1061(int arg0);

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lda;)V")
    public class142(class44 arg0) {
        this.field2349 = arg0;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)I")
    public static final int method1062(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 22373) {
            method1063(-19);
        }
        field2351++;
        int var5 = arg1 & 0xF;
        int var6 = var5 < 8 ? arg3 : arg2;
        int var7 = var5 < 4 ? arg2 : (var5 == 12 || var5 == 14 ? arg3 : arg4);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!su", name = "g", descriptor = "(I)V")
    public static void method1063(int arg0) {
        if (arg0 < -80) {
            field2353 = null;
            field2354 = null;
            field2352 = null;
            field2355 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IBI)V")
    public abstract void method1064(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!su", name = "h", descriptor = "(I)Z")
    public final boolean method1065(int arg0) {
        if (arg0 != 3) {
            this.method1058(16);
        }
        field2348++;
        return this.field2344;
    }
}
