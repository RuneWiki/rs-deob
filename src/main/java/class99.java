import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class99 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lfg;")
    public static class83 field1365 = new class83("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Z")
    public static boolean field1368 = false;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Z")
    public static boolean field1366 = false;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lfg;")
    public static class83 field1367 = new class83("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[[[B")
    public static byte[][][] field1369;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lpp;IIII)V")
    public static final void method661(class267 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class205.method1244(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class469.field6860) {
            class205.method1244(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class205.method1244(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class472.field6900) {
            class205.method1244(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class472.field6900) {
            class205.method1244(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class469.field6860 && arg4 <= class472.field6900) {
            class205.method1244(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class205.method1244(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class469.field6860 && arg4 > 0) {
            class205.method1244(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method662(byte arg0, String arg1) {
        field1364++;
        class478.method2806("", 0, 0, 4339, arg1, "");
        if (arg0 != 41) {
            method662((byte) -127, null);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method663(byte arg0) {
        field1367 = null;
        if (arg0 != -40) {
            method662((byte) -76, null);
        }
        field1365 = null;
        field1369 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    public static final void method664(byte arg0) {
        if (arg0 != -69) {
            method661(null, 97, 117, 80, -65);
        }
        if (class65.field888 == null || class441.field6422 == null) {
            class441.field6422 = new int[256];
            class65.field888 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class65.field888[var1] = (int) (Math.sin(var2) * 4096.0D);
                class441.field6422[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1363++;
    }
}
