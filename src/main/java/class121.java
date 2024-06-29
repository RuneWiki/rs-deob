import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class121 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field1936 = -1;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    private int field1948 = 0;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lam;")
    private class180 field1937 = new class180();

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Z")
    public boolean field1950 = false;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    private int field1942;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "[Lkk;")
    private class239[] field1941;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    private int field1947;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "[[[I")
    private int[][][] field1946;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1938 = 0;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "[I")
    public static int[] field1944 = new int[50];

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field1949 = 10;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZIZB)V")
    public static final void method837(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4) {
        field1940++;
        if (arg4 > 67) {
            class184.method1245(arg1, false, class185.field2865.length - 1, arg3, arg0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method838(int arg0) {
        if (arg0 < -117) {
            field1944 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method839(boolean arg0, int arg1) {
        field1945++;
        if (arg0) {
            this.method840((byte) -43);
        }
        if (this.field1947 == this.field1942) {
            this.field1950 = this.field1941[arg1] == null;
            this.field1941[arg1] = class15.field231;
            return this.field1946[arg1];
        } else if (this.field1947 == 1) {
            this.field1950 = this.field1936 != arg1;
            this.field1936 = arg1;
            return this.field1946[0];
        } else {
            class239 var3 = this.field1941[arg1];
            if (var3 == null) {
                this.field1950 = true;
                if (this.field1947 <= this.field1948) {
                    class239 var4 = (class239) this.field1937.method1224((byte) 74);
                    var3 = new class239(arg1, var4.field3879);
                    this.field1941[var4.field3884] = null;
                    var4.method1123(0);
                } else {
                    var3 = new class239(arg1, this.field1948);
                    this.field1948++;
                }
                this.field1941[arg1] = var3;
            } else {
                this.field1950 = false;
            }
            this.field1937.method1222(50, var3);
            return this.field1946[var3.field3879];
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public final void method840(byte arg0) {
        field1939++;
        for (int var2 = 0; var2 < this.field1947; var2++) {
            this.field1946[var2][0] = null;
            this.field1946[var2][1] = null;
            this.field1946[var2][2] = null;
            this.field1946[var2] = null;
        }
        this.field1946 = null;
        if (arg0 != 40) {
            this.method839(false, -112);
        }
        this.field1941 = null;
        this.field1937.method1226(1);
        this.field1937 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)[[[I")
    public final int[][][] method841(boolean arg0) {
        if (arg0) {
            return null;
        }
        field1943++;
        if (this.field1947 != this.field1942) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1947; var2++) {
            this.field1941[var2] = class15.field231;
        }
        return this.field1946;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(III)V")
    public class121(int arg0, int arg1, int arg2) {
        this.field1942 = arg1;
        this.field1941 = new class239[this.field1942];
        this.field1947 = arg0;
        this.field1946 = new int[this.field1947][3][arg2];
    }
}
