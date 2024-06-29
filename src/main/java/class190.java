import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class190 {

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
    public int field2825 = -1;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "Lada;")
    public static class144 field2826 = new class144(44, -1);

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "Z")
    public static boolean field2830 = false;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
    public int field2822;

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1303(int arg0, int arg1, int arg2) {
        int var3 = class104.field1510[arg0][arg1][arg2];
        if (-class213.field3139 == var3) {
            return false;
        } else if (class213.field3139 == var3) {
            return true;
        } else {
            int var4 = arg1 << class115.field1626;
            int var5 = arg2 << class115.field1626;
            if (class94.method740(var4 + 1, class165.field2609[arg0].method1239(arg1, arg2), var5 + 1) && class94.method740(class96.field1409 + var4 - 1, class165.field2609[arg0].method1239(arg1 + 1, arg2), var5 + 1) && class94.method740(class96.field1409 + var4 - 1, class165.field2609[arg0].method1239(arg1 + 1, arg2 + 1), class96.field1409 + var5 - 1) && class94.method740(var4 + 1, class165.field2609[arg0].method1239(arg1, arg2 + 1), class96.field1409 + var5 - 1) && class94.method740(class402.field5500 + var4, class165.field2609[arg0].method1239(arg1, arg2), var5 + 1) && class94.method740(class96.field1409 + var4 - 1, class165.field2609[arg0].method1239(arg1 + 1, arg2), class402.field5500 + var5) && class94.method740(class402.field5500 + var4, class165.field2609[arg0].method1239(arg1, arg2 + 1), class96.field1409 + var5 - 1) && class94.method740(class96.field1409 + var4 - 1, class165.field2609[arg0].method1239(arg1, arg2), class402.field5500 + var5) && class94.method740(class402.field5500 + var4, class165.field2609[arg0].method1239(arg1, arg2), class402.field5500 + var5)) {
                class104.field1510[arg0][arg1][arg2] = class213.field3139;
                return true;
            } else {
                class104.field1510[arg0][arg1][arg2] = -class213.field3139;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 29)
    public static void method1304(int arg0) {
        if (arg0 != 1) {
            field2826 = null;
        }
        field2826 = null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 49)
    public static final boolean method1305(String arg0, byte arg1) {
        field2827++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != -72) {
            field2826 = null;
        }
        for (int var2 = 0; var2 < class33.field402; var2++) {
            if (arg0.equalsIgnoreCase(class380.field5229[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class78.field1058[var2])) {
                return true;
            }
        }
        return false;
    }
}
