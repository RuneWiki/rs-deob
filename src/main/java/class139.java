import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class139 {

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Lak;")
    private class498 field1898;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "J")
    public static long field1904 = 0L;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "[Lah;")
    public static class374[] field1905 = new class374[2048];

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Llc;")
    public static class435 field1901 = new class435(82, 2);

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "[F")
    public static float[] field1907 = new float[4];

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "Lwfa;")
    private class388 field1902;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Lua;")
    public static class3 field1897;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "[Ltd;")
    public static class515[] field1899;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public static void method981(int arg0) {
        field1905 = null;
        field1901 = null;
        field1899 = null;
        field1897 = null;
        field1907 = null;
        if (arg0 != 2048) {
            field1905 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Lwfa;")
    public final class388 method982(int arg0) {
        if (arg0 != 82) {
            field1899 = null;
        }
        field1903++;
        class388 var2 = this.field1902;
        if (this.field1898.field7165 == var2) {
            this.field1902 = null;
            return null;
        } else {
            this.field1902 = var2.field5596;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)Lwfa;")
    public final class388 method983(int arg0) {
        if (arg0 < 55) {
            this.method983(91);
        }
        field1906++;
        class388 var2 = this.field1898.field7165.field5596;
        if (this.field1898.field7165 == var2) {
            this.field1902 = null;
            return null;
        } else {
            this.field1902 = var2.field5596;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V")
    public static final void method984(int arg0) {
        class435.field6229.method2220(false);
        field1900++;
        int var1 = -92 % ((arg0 - 56) / 37);
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
    public class139() {
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lak;)V")
    public class139(class498 arg0) {
        this.field1898 = arg0;
    }
}
