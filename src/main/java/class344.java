import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class344 {

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    private int field4902 = -1;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    private int field4903 = 0;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lmba;")
    private class646 field4891 = new class646();

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Z")
    public boolean field4906 = false;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    private int field4894;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    private int field4896;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "[Lcda;")
    private class115[] field4900;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "[[[I")
    private int[][][] field4901;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "[I")
    public static int[] field4897 = new int[13];

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field4893 = -1;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "[I")
    public static int[] field4898 = new int[2048];

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Luv;")
    public static class755 field4904 = null;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4905 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method2198(int arg0) {
        field4897 = null;
        field4898 = null;
        if (arg0 != 2) {
            field4905 = null;
        }
        field4905 = null;
        field4904 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public final void method2199(boolean arg0) {
        field4892++;
        for (int var2 = 0; var2 < this.field4896; var2++) {
            this.field4901[var2][0] = null;
            this.field4901[var2][1] = null;
            this.field4901[var2][2] = null;
            this.field4901[var2] = null;
        }
        this.field4901 = null;
        if (!arg0) {
            this.method2201(41);
        }
        this.field4900 = null;
        this.field4891.method3615((byte) 103);
        this.field4891 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[[I")
    public final int[][] method2200(int arg0, int arg1) {
        field4895++;
        if (arg0 != 0) {
            method2198(23);
        }
        if (this.field4896 == this.field4894) {
            this.field4906 = this.field4900[arg1] == null;
            this.field4900[arg1] = class712.field9956;
            return this.field4901[arg1];
        } else if (this.field4896 == 1) {
            this.field4906 = this.field4902 != arg1;
            this.field4902 = arg1;
            return this.field4901[0];
        } else {
            class115 var3 = this.field4900[arg1];
            if (var3 == null) {
                this.field4906 = true;
                if (this.field4896 <= this.field4903) {
                    class115 var4 = (class115) this.field4891.method3617((byte) 19);
                    var3 = new class115(arg1, var4.field1536);
                    this.field4900[var4.field1534] = null;
                    var4.method549(arg0 + 6410);
                } else {
                    var3 = new class115(arg1, this.field4903);
                    this.field4903++;
                }
                this.field4900[arg1] = var3;
            } else {
                this.field4906 = false;
            }
            this.field4891.method3614(var3, 1045);
            return this.field4901[var3.field1536];
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method2201(int arg0) {
        field4899++;
        if (this.field4896 != this.field4894) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field4896; var2++) {
            this.field4900[var2] = class712.field9956;
        }
        return this.field4901;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(III)V")
    public class344(int arg0, int arg1, int arg2) {
        this.field4894 = arg1;
        this.field4896 = arg0;
        this.field4900 = new class115[this.field4894];
        this.field4901 = new int[this.field4896][3][arg2];
    }
}
