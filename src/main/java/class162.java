import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class162 {

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "Lhp;")
    private class277 field1989 = new class277(64);

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "Lkea;")
    private class203 field1988;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1983 = new String[8];

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Lkp;")
    public static class421 field1982 = new class421(2);

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "Lig;")
    public static class206 field1990 = new class206(41, 6);

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "Z")
    public static boolean field1991 = false;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "Lkca;")
    public static class73 field1992 = new class73(75, 4);

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "[[B")
    public static byte[][] field1979;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Ljava/lang/String;", line = 8)
    public static final String method938(int arg0) {
        if (arg0 == 10) {
            field1981++;
            return class600.field8764 || class454.field6790 == null ? "" : class454.field6790.field9101;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V", line = 22)
    public static void method939(int arg0) {
        if (arg0 != 0) {
            field1991 = false;
        }
        field1990 = null;
        field1982 = null;
        field1992 = null;
        field1983 = null;
        field1979 = null;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V", line = 37)
    public final void method940(int arg0) {
        if (arg0 != 0) {
            method938(-47);
        }
        class277 var2 = this.field1989;
        synchronized (this.field1989) {
            this.field1989.method1805(arg0 - 93);
        }
        field1986++;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZ)V", line = 62)
    public final void method941(int arg0, boolean arg1) {
        class277 var3 = this.field1989;
        synchronized (this.field1989) {
            this.field1989.method1811((byte) 125, arg0);
            if (!arg1) {
                this.field1987 = -101;
            }
        }
        field1977++;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 75)
    public static final boolean method942(int arg0, String arg1) {
        if (arg0 != 23050) {
            field1990 = null;
        }
        field1980++;
        return class488.method2933(10, arg1, -98, true);
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V", line = 90)
    public final void method943(int arg0) {
        class277 var2 = this.field1989;
        synchronized (this.field1989) {
            if (arg0 != 8) {
                return;
            }
            this.field1989.method1810(false);
        }
        field1978++;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)Lbu;", line = 108)
    public final class18 method944(boolean arg0, int arg1) {
        field1985++;
        class277 var3 = this.field1989;
        class18 var4;
        synchronized (this.field1989) {
            var4 = (class18) this.field1989.method1801(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field1988;
        byte[] var6;
        synchronized (this.field1988) {
            var6 = this.field1988.method1286(arg1, 16, (byte) -49);
        }
        class18 var7 = new class18();
        if (var6 != null) {
            var7.method119((byte) -95, new class194(var6));
        }
        class277 var8 = this.field1989;
        synchronized (this.field1989) {
            this.field1989.method1808((long) arg1, var7, (byte) -44);
            if (!arg0) {
                this.method944(true, 102);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lcda;ILkea;)V", line = 152)
    public class162(class149 arg0, int arg1, class203 arg2) {
        this.field1988 = arg2;
        if (this.field1988 == null) {
            this.field1987 = 0;
        } else {
            this.field1987 = this.field1988.method1309(1675886592, 16);
        }
    }
}
