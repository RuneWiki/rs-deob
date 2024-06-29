import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class160 extends class468 {

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Liv;")
    public static class64 field2477 = new class64(72, 3);

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "[[I")
    public static int[][] field2481;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Lnv;")
    public static class285 field2479;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Z")
    public static boolean field2478;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "[Ldq;")
    public static class490[] field2480;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lmq;I)V")
    public static final void method1183(class350 arg0, int arg1) {
        int var2 = -13 / ((-arg1 - 32) / 57);
        field2476++;
        class350 var3 = class302.method1905(0, arg0);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class466.field6952;
            var5 = class77.field1297;
        } else {
            var4 = var3.field5329;
            var5 = var3.field5269;
        }
        class23.method197(var5, false, var4, arg0, (byte) 69);
        class221.method1470(arg0, var4, (byte) 119, var5);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V")
    public static void method1184(boolean arg0) {
        field2480 = null;
        field2481 = null;
        field2479 = null;
        if (arg0) {
            field2477 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Lmt;")
    public static final class271 method1185(int arg0) {
        field2475++;
        class271 var1 = (class271) class341.field5146.method1634(77);
        if (arg0 != 0) {
            field2480 = null;
        }
        if (var1 == null) {
            return new class271();
        } else {
            class354.field5411--;
            return var1;
        }
    }

    static {
        new class342("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field2481 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
    }
}
