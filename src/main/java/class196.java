import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class196 {

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "B")
    public byte field2899;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "B")
    public byte field2897;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "S")
    public short field2903;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public int field2895;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "S")
    public short field2902;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
    public boolean field2894;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "S")
    public short field2898;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lgf;")
    public static class180 field2890 = new class180("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lmg;")
    public static class100 field2896;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lhu;")
    public static class85 field2904;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1359(int arg0) {
        if (class138.field2091 != null) {
            class138.field2091.method694(false);
            class138.field2091 = null;
        }
        field2891++;
        class24.method204((byte) -102);
        class231.method1508();
        for (int var1 = 0; var1 < 4; var1++) {
            class255.field3679[var1].method982(arg0 ^ 0x70);
        }
        class438.method2660(116, false);
        System.gc();
        class151.method1092(2, 1221);
        class124.field1918 = false;
        class277.field3994 = -1;
        class459.method2753(true, false);
        class445.field6534 = arg0;
        class251.field3624 = 0;
        class483.field7082 = 0;
        class465.field6840 = 0;
        class351.field5335 = 0;
        for (int var2 = 0; var2 < class187.field2777.length; var2++) {
            class187.field2777[var2] = null;
        }
        class408.method2532(2);
        for (int var3 = 0; var3 < 2048; var3++) {
            class390.field5783[var3] = null;
        }
        class322.field4943 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class132.field2030[var4] = null;
        }
        class73.field1218.method2476(0);
        class8.method60(arg0 - 17);
        class473.field6978 = 0;
        class526.field7733.method2830(true);
        class18.method165(-80);
        class403.method2509(arg0 - 17275);
        class410.method2536(true, -17143);
        try {
            class426.method2606("loggedout", class112.field1785.field4458, 21615);
        } catch (Throwable var5) {
        }
        class177.field2685 = null;
        class469.field6901 = 0L;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 81)
    public static void method1360(byte arg0) {
        if (arg0 <= -21) {
            field2904 = null;
            field2896 = null;
            field2890 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 107)
    public class196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2899 = (byte) arg7;
        this.field2897 = (byte) arg8;
        this.field2892 = arg0;
        this.field2903 = (short) arg6;
        this.field2895 = arg3;
        this.field2902 = (short) arg4;
        this.field2900 = arg11;
        this.field2893 = arg1;
        this.field2894 = arg10;
        this.field2901 = arg2;
        this.field2898 = (short) arg5;
    }
}
