import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class147 {

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "B")
    public byte field1908;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Lwt;")
    public static class194 field1911 = new class194(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Lje;")
    public class264 field1914;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Lnu;")
    public class401 field1910;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Lar;")
    public class462 field1907;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lps;")
    public static class59 field1916;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Ljt;")
    public static class64 field1913;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lhh;")
    public class80 field1906;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIB)Z")
    public static final boolean method912(int arg0, int arg1, byte arg2) {
        field1909++;
        if (arg2 <= 62) {
            field1913 = null;
        }
        return class235.method1427(-26, arg1, arg0) & class235.method1429(arg0, (byte) 120, arg1);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method913(int arg0) {
        int var1 = 84 % ((arg0 - 51) / 55);
        field1916 = null;
        field1911 = null;
        field1913 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(BIIIII)V")
    public class147(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1912 = arg1;
        this.field1903 = arg2;
        this.field1905 = arg5;
        this.field1915 = arg3;
        this.field1904 = arg4;
        this.field1908 = arg0;
    }
}
