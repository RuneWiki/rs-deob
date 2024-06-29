import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KHDRIUSF")
public class class24 {

    @OriginalMember(owner = "client!KHDRIUSF", name = "i", descriptor = "Z")
    public boolean field904 = false;

    @OriginalMember(owner = "client!KHDRIUSF", name = "j", descriptor = "Z")
    public boolean field905 = true;

    @OriginalMember(owner = "client!KHDRIUSF", name = "l", descriptor = "Z")
    public boolean field907 = false;

    @OriginalMember(owner = "client!KHDRIUSF", name = "o", descriptor = "Z")
    public boolean field910 = false;

    @OriginalMember(owner = "client!KHDRIUSF", name = "p", descriptor = "I")
    public int field911 = -1;

    @OriginalMember(owner = "client!KHDRIUSF", name = "q", descriptor = "Z")
    public boolean field912 = true;

    @OriginalMember(owner = "client!KHDRIUSF", name = "a", descriptor = "Z")
    private static boolean field896 = true;

    @OriginalMember(owner = "client!KHDRIUSF", name = "b", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!KHDRIUSF", name = "d", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!KHDRIUSF", name = "g", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!KHDRIUSF", name = "h", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!KHDRIUSF", name = "k", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!KHDRIUSF", name = "m", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!KHDRIUSF", name = "n", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!KHDRIUSF", name = "f", descriptor = "Ljava/lang/String;")
    public String field901;

    @OriginalMember(owner = "client!KHDRIUSF", name = "e", descriptor = "[I")
    public static int[] field900;

    @OriginalMember(owner = "client!KHDRIUSF", name = "c", descriptor = "[LKHDRIUSF;")
    public static class24[] field898;

    @OriginalMember(owner = "client!KHDRIUSF", name = "a", descriptor = "(LWEMOPWVJ;I)V")
    public static void method314(class62 arg0, int arg1) {
        class52 var2 = new class52(arg0.method559("varp.dat", null), true);
        field899 = 0;
        field897 = var2.method463();
        if (arg1 != 24414) {
            field896 = !field896;
        }
        if (field898 == null) {
            field898 = new class24[field897];
        }
        if (field900 == null) {
            field900 = new int[field897];
        }
        for (int var3 = 0; var3 < field897; var3++) {
            if (field898[var3] == null) {
                field898[var3] = new class24();
            }
            field898[var3].method315(var3, false, var2);
        }
        if (var2.field1433.length != var2.field1434) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!KHDRIUSF", name = "a", descriptor = "(IZLSVWJKJVI;)V")
    public void method315(int arg0, boolean arg1, class52 arg2) {
        if (arg1) {
            return;
        }
        while (true) {
            int var4 = arg2.method461();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field902 = arg2.method461();
            } else if (var4 == 2) {
                this.field903 = arg2.method461();
            } else if (var4 == 3) {
                this.field904 = true;
                field900[field899++] = arg0;
            } else if (var4 == 4) {
                this.field905 = false;
            } else if (var4 == 5) {
                this.field906 = arg2.method463();
            } else if (var4 == 6) {
                this.field907 = true;
            } else if (var4 == 7) {
                this.field908 = arg2.method466();
            } else if (var4 == 8) {
                this.field909 = 1;
                this.field910 = true;
            } else if (var4 == 10) {
                this.field901 = arg2.method468();
            } else if (var4 == 11) {
                this.field910 = true;
            } else if (var4 == 12) {
                this.field911 = arg2.method466();
            } else if (var4 == 13) {
                this.field909 = 2;
                this.field910 = true;
            } else if (var4 == 14) {
                this.field912 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
