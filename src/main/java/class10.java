import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 extends class51 {

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field217 = 0;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "[I")
    public static int[] field218 = new int[5];

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "[I")
    public static int[] field214 = new int[100];

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "Lud;")
    public static class143 field213 = new class143(5000);

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "Lic;")
    public static class59 field228 = class59.method433(0, "Konfig geladen)3");

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
    public static int field225 = 0;

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lic;")
    public static class59 field226 = class59.method433(0, "scrollbar");

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "Z")
    public static boolean field227 = false;

    @OriginalMember(owner = "client!bb", name = "ob", descriptor = "Lic;")
    public static class59 field230 = class59.method433(0, "rot:");

    @OriginalMember(owner = "client!bb", name = "nb", descriptor = "Lic;")
    private static class59 field229 = class59.method433(0, "Loaded config");

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lic;")
    public static class59 field224 = field229;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "Lic;")
    public class59 field220;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "[I")
    public int[] field211;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "[I")
    public int[] field222;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "[Lic;")
    public class59[] field209;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static void method46(boolean arg0) {
        field228 = null;
        field224 = null;
        field213 = null;
        field218 = null;
        field214 = null;
        if (!arg0) {
            field226 = null;
            field229 = null;
            field230 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILdd;I)[Lt;")
    public static final class132[] method47(byte arg0, int arg1, class26 arg2, int arg3) {
        field212++;
        if (arg0 < 96) {
            field226 = null;
        }
        return class159.method1234(arg3, -65536, arg1, arg2) ? class18.method94((byte) 119) : null;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
    public static final void method48(byte arg0) {
        int var1 = 33 / ((-arg0 - 5) / 44);
        field223++;
        if (class102.field2491 != null) {
            class102.field2491.method308(19401);
            class102.field2491 = null;
        }
        class41.method312(200);
        class3.field58.method890();
        for (int var2 = 0; var2 < 4; var2++) {
            class108.field2616[var2].method617(90);
        }
        System.gc();
        class56.method415(2, 1);
        class81.field2004 = -1;
        class63.field1625 = false;
        class18.method95((byte) -56);
        class89.method737(10, 128);
    }
}
