import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class116 extends class59 {

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "Z")
    public static boolean field2249 = false;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field2246 = 0;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "Lb;")
    public static class11 field2247 = new class11(64);

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "Lsd;")
    public static class166 field2252 = class135.method935("Ihr Charakter)2Profil wird in:", 0);

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lsd;")
    public static class166 field2250 = class135.method935(" )2>", 0);

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "Lsd;")
    public static class166 field2253 = class135.method935("T", 0);

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "Lsd;")
    public static class166 field2254 = class135.method935("::clientdrop", 0);

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "[Lre;")
    public static class158[] field2244;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class116() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        int[] var3 = super.field1219.method721(arg0, -127);
        if (arg1 >= -124) {
            method837(62);
        }
        ++field2248;
        if (super.field1219.field1816) {
            class71.method568(var3, 0, class98.field1879, class136.field2657[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
    public static void method837(int arg0) {
        field2244 = null;
        int var1 = -2 % ((arg0 - 29) / 39);
        field2250 = null;
        field2252 = null;
        field2247 = null;
        field2253 = null;
        field2254 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZLsd;)V")
    public static final void method838(int arg0, boolean arg1, class166 arg2) {
        ++field2243;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = 6 - -var3;
        int var6 = class92.field1805.method186(arg2, arg0);
        int var7 = 13 * class92.field1805.method161(arg2, 250);
        class17.method91(-var3 + var4, -var3 + var5, var6 - (-var3 - var3), var3 + var7 + var3, 0);
        class17.method97(var4 - var3, var5 - var3, var3 + var6 - -var3, var3 + var7 + var3, 16777215);
        class92.field1805.method179(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class27.method201((byte) -125, var7 - (-var3 - var3), -var3 + var4, -var3 + var5, var6 - -var3 - -var3);
        if (!arg1) {
            class161.method1092(var7, var5, (byte) 117, var4, var6);
        } else {
            try {
                Graphics var8 = class114.field2219.getGraphics();
                class99.field1885.method547(0, 116, 0, var8);
            } catch (Exception var9) {
                class114.field2219.repaint();
            }
        }
    }
}
