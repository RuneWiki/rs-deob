import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 extends class113 {

    @OriginalMember(owner = "client!fb", name = "hb", descriptor = "I")
    public int field864 = 0;

    @OriginalMember(owner = "client!fb", name = "vb", descriptor = "Lu;")
    public class135 field878 = class4.field98;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "Lu;")
    public static class135 field862 = class87.method676((byte) -96, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "J")
    public static long field858 = 0L;

    @OriginalMember(owner = "client!fb", name = "jb", descriptor = "Z")
    public static boolean field866 = false;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "Lu;")
    public static class135 field861 = class87.method676((byte) -44, "::fpsoff");

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "Lu;")
    private static class135 field857 = class87.method676((byte) -126, " from your ignore list first");

    @OriginalMember(owner = "client!fb", name = "nb", descriptor = "Lu;")
    public static class135 field870 = field857;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "Lu;")
    private static class135 field860 = class87.method676((byte) -103, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "Lu;")
    public static class135 field856 = field860;

    @OriginalMember(owner = "client!fb", name = "qb", descriptor = "Lu;")
    public static class135 field873 = class87.method676((byte) -116, "@gr2@");

    @OriginalMember(owner = "client!fb", name = "pb", descriptor = "I")
    public static int field872 = 2;

    @OriginalMember(owner = "client!fb", name = "xb", descriptor = "[I")
    public static int[] field880 = new int[50];

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!fb", name = "kb", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "client!fb", name = "mb", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!fb", name = "rb", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!fb", name = "sb", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!fb", name = "tb", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!fb", name = "ub", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!fb", name = "ib", descriptor = "[I")
    public int[] field865;

    @OriginalMember(owner = "client!fb", name = "ob", descriptor = "[I")
    public int[] field871;

    @OriginalMember(owner = "client!fb", name = "wb", descriptor = "[I")
    public static int[] field879;

    @OriginalMember(owner = "client!fb", name = "lb", descriptor = "[Lu;")
    public class135[] field868;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
    public static final void method286(int arg0) {
        field863++;
        for (class63 var1 = (class63) class132.field3178.method182((byte) 50); var1 != null; var1 = (class63) class132.field3178.method181((byte) 21)) {
            if (class136.field3301 != var1.field1561 || var1.field1574) {
                var1.method302(4071);
            } else if (var1.field1572 <= class126.field2998) {
                var1.method522(class20.field452, (byte) 125);
                if (var1.field1574) {
                    var1.method302(4071);
                } else {
                    class100.field2418.method1018(var1.field1561, var1.field1567, var1.field1563, var1.field1583, 60, var1, 0, -1, false);
                }
            }
        }
        if (arg0 != 11412) {
            method286(119);
        }
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
    public static final void method287(int arg0) {
        class126.field3009 = 0;
        field876++;
        client.field526 = 0;
        class86.method669(4917);
        class145.method1186(17738);
        class19.method143(-103);
        class123.method969((byte) 123);
        for (int var1 = 0; var1 < client.field526; var1++) {
            int var4 = class101.field2443[var1];
            if (class126.field2998 != class131.field3166[var4].field184) {
                class131.field3166[var4] = null;
            }
        }
        if (class21.field499 != class23.field581.field1485) {
            throw new RuntimeException("gpp1 pos:" + class23.field581.field1485 + " psize:" + class21.field499);
        }
        for (int var2 = 0; var2 < class14.field329; var2++) {
            if (class131.field3166[class108.field2600[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class14.field329);
            }
        }
        int var3 = 98 % ((-arg0 - 73) / 51);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method288(boolean arg0) {
        field880 = null;
        field857 = null;
        if (arg0) {
            method288(false);
        }
        field870 = null;
        field860 = null;
        field856 = null;
        field862 = null;
        field879 = null;
        field873 = null;
        field861 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lic;Z)V")
    public final void method289(class59 arg0, boolean arg1) {
        if (arg1) {
            this.field874 = -116;
        }
        field875++;
        while (true) {
            int var3 = arg0.method480(0);
            if (var3 == 0) {
                return;
            }
            this.method290(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZILic;)V")
    private final void method290(boolean arg0, int arg1, class59 arg2) {
        field855++;
        if (arg0) {
            method286(-109);
        }
        if (arg1 == 1) {
            this.field867 = arg2.method480(0);
        } else if (arg1 == 2) {
            this.field859 = arg2.method480(0);
        } else if (arg1 == 3) {
            this.field878 = arg2.method496(-127);
            return;
        } else if (arg1 == 4) {
            this.field874 = arg2.method498((byte) 127);
            return;
        } else if (arg1 == 5) {
            this.field864 = arg2.method483((byte) 24);
            this.field865 = new int[this.field864];
            this.field868 = new class135[this.field864];
            for (int var4 = 0; var4 < this.field864; var4++) {
                this.field865[var4] = arg2.method498((byte) -91);
                this.field868[var4] = arg2.method496(-122);
            }
            return;
        } else if (arg1 == 6) {
            this.field864 = arg2.method483((byte) 24);
            this.field865 = new int[this.field864];
            this.field871 = new int[this.field864];
            for (int var5 = 0; var5 < this.field864; var5++) {
                this.field865[var5] = arg2.method498((byte) -106);
                this.field871[var5] = arg2.method498((byte) 122);
            }
            return;
        }
    }
}
