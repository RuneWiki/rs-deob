import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class143 {

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Llk;")
    private class84 field1984 = new class84();

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Loh;")
    private class281 field1992 = new class281();

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    private int field1990;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    private int field1991;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Lvd;")
    private class4 field1993;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1985 = "flash1:";

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Z")
    public static boolean field1980 = false;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1986 = -1;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1987 = -1;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "F")
    public static float field1979;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lvj;")
    public static class117 field1981;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Ljg;")
    public final class171 method955(boolean arg0) {
        field1982++;
        if (arg0) {
            field1979 = 1.0676581F;
        }
        return this.field1993.method21((byte) 67);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method956(int arg0) {
        if (arg0 != -1) {
            return;
        }
        if (client.field2181 < 0) {
            class67.field906 = -1;
            client.field2181 = 0;
            class75.field1054 = -1;
        }
        field1978++;
        if (class138.field1929 < client.field2181) {
            class75.field1054 = -1;
            client.field2181 = class138.field1929;
            class67.field906 = -1;
        }
        if (class234.field3529 < 0) {
            class67.field906 = -1;
            class75.field1054 = -1;
            class234.field3529 = 0;
        }
        if (class234.field3529 > class41.field605) {
            class67.field906 = -1;
            class234.field3529 = class41.field605;
            class75.field1054 = -1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJLlk;)V")
    public final void method957(int arg0, long arg1, class84 arg2) {
        if (this.field1990 == 0) {
            class84 var5 = this.field1992.method1880(0);
            var5.method1115(-128);
            var5.method527(false);
            if (this.field1984 == var5) {
                class84 var6 = this.field1992.method1880(arg0 ^ 0x559B);
                var6.method1115(25);
                var6.method527(false);
            }
        } else {
            this.field1990--;
        }
        this.field1993.method20(arg2, arg1, 0);
        field1977++;
        this.field1992.method1890(arg2, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public final void method958(byte arg0) {
        field1989++;
        this.field1992.method1888(0);
        this.field1993.method19((byte) 11);
        this.field1984 = new class84();
        this.field1990 = this.field1991;
        if (arg0 != 70) {
            this.field1990 = -96;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static void method959(byte arg0) {
        field1981 = null;
        field1985 = null;
        if (arg0 <= 99) {
            method959((byte) 57);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)Ljg;")
    public final class171 method960(byte arg0) {
        field1988++;
        int var2 = 122 / ((36 - arg0) / 35);
        return this.field1993.method22(true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)Llk;")
    public final class84 method961(long arg0, int arg1) {
        field1983++;
        if (arg1 != 9156) {
            method959((byte) 44);
        }
        class84 var4 = (class84) this.field1993.method23(216, arg0);
        if (var4 != null) {
            this.field1992.method1890(var4, 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
    public class143(int arg0) {
        this.field1990 = arg0;
        this.field1991 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1993 = new class4(var2);
    }
}
