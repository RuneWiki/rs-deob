import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class81 extends class29 {

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "[B")
    public byte[] field1935;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "[I")
    public static int[] field1933 = new int[1000];

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "Lwb;")
    public static class130 field1940 = class26.method212("null", -32376);

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "Lwb;")
    private static class130 field1931 = class26.method212("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", -32376);

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "Lwb;")
    public static class130 field1942 = class26.method212("Angreifen", -32376);

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "[Z")
    public static boolean[] field1939 = new boolean[112];

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "Lwb;")
    public static class130 field1943 = class26.method212("@whi@", -32376);

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "Lwb;")
    public static class130 field1932 = field1931;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public static volatile int field1937 = 0;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "[I")
    public static int[] field1936 = new int[4000];

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "Lsc;")
    public static class111 field1934;

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "[[I")
    public static int[][] field1941;

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V", line = 18)
    public class81(byte[] arg0) {
        this.field1935 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lwb;", line = 44)
    public static final class130 method616(int arg0, int arg1) {
        class130 var2 = new class130();
        var2.field3079 = arg1;
        field1938++;
        var2.field3081 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V", line = 64)
    public static void method617(int arg0) {
        field1943 = null;
        field1932 = null;
        field1933 = null;
        field1941 = null;
        field1931 = null;
        field1936 = null;
        field1934 = null;
        field1939 = null;
        field1940 = null;
        if (arg0 < 111) {
            field1936 = null;
        }
        field1942 = null;
    }
}
