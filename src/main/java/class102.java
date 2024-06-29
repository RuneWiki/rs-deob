import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 extends class12 {

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "[B")
    public byte[] field2146;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field2147 = 0;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lpe;")
    public static class109 field2139 = class141.method1120("::fpson", 0);

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2142 = -1;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "[I")
    public static int[] field2148 = new int[500];

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "Lpe;")
    public static class109 field2150 = class141.method1120("Schrifts-=tze geladen)3", 0);

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "Lpe;")
    public static class109 field2151 = class141.method1120("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 0);

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "[Le;")
    public static class29[] field2143;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public static final void method820(byte arg0) {
        class138.field3006 = -1;
        class63.field1302 = 0;
        class109.field2286 = 0;
        field2144++;
        class3.field64 = false;
        class92.field1974 = 0;
        class157.field3608 = -1;
        class55.field1111 = -1;
        class149.field3306 = 0;
        class63.field1299.field309 = 0;
        class88.field1865 = 0;
        class17.field423 = -1;
        class82.field1733.field309 = 0;
        class112.field2407 = 0;
        for (int var1 = 0; var1 < class104.field2194.length; var1++) {
            if (class104.field2194[var1] != null) {
                class104.field2194[var1].field3123 = -1;
            }
        }
        if (arg0 >= -11) {
            field2142 = -69;
        }
        for (int var2 = 0; var2 < class52.field1067.length; var2++) {
            if (class52.field1067[var2] != null) {
                class52.field1067[var2].field3123 = -1;
            }
        }
        class93.method775((byte) 8);
        class118.method958(false, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class120.field2663[var3] = true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)Lwa;")
    public static final class154 method821(int arg0, boolean arg1, int arg2) {
        class154 var3 = class44.method403(arg0, arg1);
        field2141++;
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3520 == null || arg2 >= var3.field3520.length) {
            return null;
        } else {
            return var3.field3520[arg2];
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static void method822(int arg0) {
        field2143 = null;
        if (arg0 < 93) {
            field2143 = null;
        }
        field2151 = null;
        field2150 = null;
        field2139 = null;
        field2148 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lpe;Lna;Lpe;I)Le;")
    public static final class29 method823(class109 arg0, class91 arg1, class109 arg2, int arg3) {
        field2138++;
        int var4 = arg1.method766(-119, arg0);
        if (arg3 < 58) {
            method822(-97);
        }
        int var5 = arg1.method743((byte) 127, arg2, var4);
        return class91.method755(-12, var4, arg1, var5);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
    public class102(byte[] arg0) {
        this.field2146 = arg0;
    }
}
