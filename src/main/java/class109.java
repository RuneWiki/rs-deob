import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class109 {

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    private int field1946 = 0;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    private int field1949 = 128;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    private int field1955 = 0;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    private int field1950 = 128;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public int field1951 = -1;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    private int field1948 = 0;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Z")
    public boolean field1943 = false;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Lpe;")
    public static class100 field1945 = new class100(50);

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field1960 = 0;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Lij;")
    private static class50 field1964 = class78.method578(126, "Examine");

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Lij;")
    public static class50 field1965 = class78.method578(122, "Schlie-8en");

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Lij;")
    public static class50 field1959 = field1964;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Lij;")
    public static class50 field1966 = class78.method578(122, "hitmarks");

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Lij;")
    public static class50 field1962 = class78.method578(123, "");

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field1961 = -1;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    private int field1953;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "[I")
    public static int[] field1968;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "[Lek;")
    public static class169[] field1967;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[S")
    private short[] field1947;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "[S")
    private short[] field1954;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "[S")
    private short[] field1956;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "[S")
    private short[] field1958;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lwd;I)V")
    public final void method806(class217 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1487(255);
            if (var3 == 0) {
                if (arg1 != 1281) {
                    method807((byte) -23);
                }
                field1957++;
                return;
            }
            this.method808(var3, arg1 ^ 0xFFFFFACD, arg0);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static void method807(byte arg0) {
        field1967 = null;
        field1968 = null;
        field1962 = null;
        field1945 = null;
        field1964 = null;
        field1965 = null;
        field1966 = null;
        field1959 = null;
        if (arg0 > -39) {
            field1967 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILwd;)V")
    private final void method808(int arg0, int arg1, class217 arg2) {
        if (arg0 == 1) {
            this.field1953 = arg2.method1441(94);
        } else if (arg0 == 2) {
            this.field1951 = arg2.method1441(74);
        } else if (arg0 == 4) {
            this.field1950 = arg2.method1441(66);
        } else if (arg0 == 5) {
            this.field1949 = arg2.method1441(-81);
        } else if (arg0 == 6) {
            this.field1955 = arg2.method1441(-13);
        } else if (arg0 == 7) {
            this.field1948 = arg2.method1487(255);
        } else if (arg0 == 8) {
            this.field1946 = arg2.method1487(255);
        } else if (arg0 == 9) {
            this.field1943 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method1487(255);
            this.field1954 = new short[var6];
            this.field1947 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1954[var7] = (short) arg2.method1441(-22);
                this.field1947[var7] = (short) arg2.method1441(-44);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method1487(255);
            this.field1956 = new short[var4];
            this.field1958 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1956[var5] = (short) arg2.method1441(80);
                this.field1958[var5] = (short) arg2.method1441(116);
            }
        }
        if (arg1 >= -45) {
            this.method806((class217) null, 32);
        }
        field1942++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Lwg;")
    public final class98 method809(int arg0, int arg1) {
        if (arg1 != -1) {
            field1965 = null;
        }
        field1944++;
        class98 var3 = (class98) class123.field2164.method764((byte) 70, (long) this.field1952);
        if (var3 == null) {
            class202 var4 = class202.method1367(class159.field2742, this.field1953, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1954 != null) {
                for (int var5 = 0; var5 < this.field1954.length; var5++) {
                    var4.method1358(this.field1954[var5], this.field1947[var5]);
                }
            }
            if (this.field1956 != null) {
                for (int var6 = 0; var6 < this.field1956.length; var6++) {
                    var4.method1350(this.field1956[var6], this.field1958[var6]);
                }
            }
            var3 = var4.method1362(this.field1948 + 64, this.field1946 + 850, -30, -50, -30);
            class123.field2164.method765((byte) -122, var3, (long) this.field1952);
        }
        class98 var7;
        if (this.field1951 == -1 || arg0 == -1) {
            var7 = var3.method737(true, true);
        } else {
            var7 = class123.method891(-5664, this.field1951).method1250(var3, arg0, 24);
        }
        if (this.field1950 != 128 || this.field1949 != 128) {
            var7.method746(this.field1950, this.field1949, this.field1950);
        }
        if (this.field1955 != 0) {
            if (this.field1955 == 90) {
                var7.method740();
            }
            if (this.field1955 == 180) {
                var7.method749();
            }
            if (this.field1955 == 270) {
                var7.method742();
            }
        }
        return var7;
    }
}
