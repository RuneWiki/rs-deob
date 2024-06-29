import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class126 {

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lta;")
    public static class197 field1991 = new class197(64);

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Lsg;")
    public static class37 field1994 = new class37();

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "[I")
    public static int[] field1995 = new int[32768];

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Lta;")
    public static class197 field1996 = new class197(50);

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lta;")
    public static class197 field1997 = new class197(64);

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "[I")
    public static int[] field2000 = new int[8];

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Lsd;")
    public static class27 field1999;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
    public static int[] field1989;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "[Lsd;")
    public static class27[] field1998;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 8)
    public static void method953(byte arg0) {
        field1991 = null;
        if (arg0 != 33) {
            method956((byte) 127, (String) null);
        }
        field1989 = null;
        field1999 = null;
        field1997 = null;
        field1996 = null;
        field2000 = null;
        field1998 = null;
        field1994 = null;
        field1995 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lhb;I)V", line = 26)
    public final void method954(class35 arg0, int arg1) {
        field1992++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method273(65280);
            if (var3 == 0) {
                return;
            }
            this.method957(var3, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 49)
    public static final void method955(int arg0) {
        class314.field4875 = false;
        class242.field3637 = 1;
        class99.field1463 = 0;
        class311.field4847 = -3;
        field1988++;
        if (arg0 > -71) {
            method955(-31);
        }
        class136.field2124 = -1;
        class137.field2128 = 0;
        class179.field2677 = 0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLjava/lang/String;)I", line = 67)
    public static final int method956(byte arg0, String arg1) {
        field1990++;
        if (arg0 != 2) {
            field2000 = (int[]) null;
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class39.method356(1, arg1.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILhb;I)V", line = 90)
    private final void method957(int arg0, class35 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field1986 = arg1.method300(-1394191632);
            this.field1985 = arg1.method273(65280);
            this.field1987 = arg1.method273(65280);
        }
        field1993++;
    }
}
