import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class131 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    private int field1946;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[Lbm;")
    private class209[] field1948;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1945 = "Loaded interfaces";

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "J")
    private long field1951;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lbm;")
    private class209 field1944;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lcc;")
    public static class222 field1949;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method969(int arg0) {
        if (arg0 != 0) {
            field1945 = null;
        }
        field1949 = null;
        field1945 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V")
    public static final void method970(boolean arg0, int arg1) {
        if (!arg0) {
            field1949 = null;
        }
        class69 var2 = class255.method1723((byte) 32, arg1, 9);
        field1952++;
        var2.method554(2009563296);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Llg;")
    public static final class13 method971(byte arg0) {
        if (arg0 >= -8) {
            return null;
        } else {
            field1954++;
            class13 var1 = new class13(class214.field3278, class234.field3705, class196.field3069[0], class125.field1877[0], class104.field1621[0], class170.field2583[0], class301.field4847[0], class102.field1585);
            class30.method254(2);
            return var1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(JZ)Lbm;")
    public final class209 method972(long arg0, boolean arg1) {
        field1953++;
        this.field1951 = arg0;
        class209 var4 = this.field1948[(int) ((long) (this.field1946 - 1) & arg0)];
        for (this.field1944 = var4.field3228; this.field1944 != var4; this.field1944 = this.field1944.field3228) {
            if (this.field1944.field3237 == arg0) {
                class209 var5 = this.field1944;
                this.field1944 = this.field1944.field3228;
                return var5;
            }
        }
        this.field1944 = null;
        if (!arg1) {
            field1945 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lbm;")
    public final class209 method973(boolean arg0) {
        if (arg0) {
            this.method972(-39L, false);
        }
        field1950++;
        if (this.field1944 == null) {
            return null;
        }
        class209 var2 = this.field1948[(int) (this.field1951 & (long) (this.field1946 - 1))];
        while (this.field1944 != var2) {
            if (this.field1944.field3237 == this.field1951) {
                class209 var3 = this.field1944;
                this.field1944 = this.field1944.field3228;
                return var3;
            }
            this.field1944 = this.field1944.field3228;
        }
        this.field1944 = null;
        return null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IJLbm;)V")
    public final void method974(int arg0, long arg1, class209 arg2) {
        if (arg2.field3229 != null) {
            arg2.method1463((byte) -108);
        }
        class209 var5 = this.field1948[(int) ((long) (this.field1946 - 1) & arg1)];
        if (arg0 != -1) {
            method970(false, 114);
        }
        arg2.field3229 = var5.field3229;
        arg2.field3228 = var5;
        field1947++;
        arg2.field3237 = arg1;
        arg2.field3229.field3228 = arg2;
        arg2.field3228.field3229 = arg2;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
    public class131(int arg0) {
        this.field1946 = arg0;
        this.field1948 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field1948[var2] = new class209();
            var3.field3228 = var3;
            var3.field3229 = var3;
        }
    }
}
