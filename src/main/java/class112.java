import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class112 extends class284 {

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "[I")
    private final int[] field1957 = new int[this.field4926];

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "[B")
    public static byte[] field1961 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Lke;")
    public static class256 field1952 = class316.method2202("Hierhin gehen", 27626);

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "[I")
    public static int[] field1958 = new int[2048];

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Lke;")
    public static class256 field1956 = class316.method2202("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3", 27626);

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lke;")
    public static class256 field1965 = class316.method2202(" ", 27626);

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "Lke;")
    public static class256 field1967 = class316.method2202("RuneScape wird geladen )2 bitte warten)3)3)3", 27626);

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    private int field1954;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    private int field1970;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "[B")
    private byte[] field1953;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V", line = 10)
    public static void method770(int arg0) {
        field1952 = null;
        field1965 = null;
        field1967 = null;
        if (arg0 > 108) {
            field1958 = null;
            field1956 = null;
            field1961 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIF)V", line = 24)
    public class112(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field4926; var7++) {
            this.field1957[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 43)
    public final void method244(boolean arg0) {
        if (arg0) {
            field1966++;
            this.field1970 = 0;
            this.field1954 = 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 55)
    public static final void method771(byte arg0) {
        class241.field4102 = 0;
        class9.field141 = -1;
        class231.field3966 = -1;
        class15.field194 = 0;
        class308.field5322.field738 = 0;
        class260.field4496 = -1;
        field1960++;
        class290.field5027 = 0;
        class17.field244 = 0;
        class23.field302.field738 = 0;
        class321.field5495 = 0;
        class64.field1135 = 0;
        class73.field1341 = false;
        class167.field2954 = -1;
        int var1 = 0;
        if (arg0 != 93) {
            method770(33);
        }
        while (class300.field5172.length > var1) {
            if (class300.field5172[var1] != null) {
                class300.field5172[var1].field1233 = -1;
            }
            var1++;
        }
        for (int var2 = 0; var2 < class187.field3281.length; var2++) {
            if (class187.field3281[var2] != null) {
                class187.field3281[var2].field1233 = -1;
            }
        }
        class25.method156((byte) -114);
        class192.field3510 = 1;
        class11.method67((byte) 74, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class53.field974[var3] = true;
        }
        class99.method710((byte) -56);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V", line = 118)
    public void method74(int arg0, byte arg1) {
        this.field1953[this.field1954++] = (byte) ((class150.method1123(255, arg1) >> 1) + 127);
        field1968++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILng;Lng;Lng;)V", line = 148)
    public static final void method772(int arg0, class138 arg1, class138 arg2, class138 arg3) {
        class317.field5463 = arg3;
        if (arg0 != -26199) {
            method772(-28, (class138) null, (class138) null, (class138) null);
        }
        class167.field2963 = arg1;
        field1964++;
        class86.field1549 = arg2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 171)
    public final void method246(int arg0, int arg1, int arg2) {
        field1959++;
        this.field1970 += this.field1957[arg0] * arg1 >> 12;
        if (arg2 < 92) {
            method772(-51, (class138) null, (class138) null, (class138) null);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 187)
    public final void method245(int arg0) {
        this.field1970 = Math.abs(this.field1970);
        if (this.field1970 >= 4096) {
            this.field1970 = 4095;
        }
        field1962++;
        this.method74(this.field1954++, (byte) (this.field1970 >> 4));
        if (arg0 != -1994931796) {
            field1956 = (class256) null;
        }
        this.field1970 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILng;B)Lab;", line = 214)
    public static final class290 method773(int arg0, class138 arg1, byte arg2) {
        if (arg2 == -76) {
            field1971++;
            return class278.method1954(arg0, arg1, 38) ? class146.method1067(0) : null;
        } else {
            return (class290) null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)V", line = 243)
    public static final void method774(int arg0) {
        field1963++;
        if (arg0 != -26251) {
            method774(-22);
        }
        class297.field5156.method2076(120);
        class114.field2008.method2076(arg0 + 26361);
    }
}
