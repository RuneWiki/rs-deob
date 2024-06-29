import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class142 implements Runnable {

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Z")
    public boolean field2186 = true;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Ljava/lang/Object;")
    public Object field2190 = new Object();

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public int field2196 = 0;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "[I")
    public int[] field2195 = new int[500];

    @OriginalMember(owner = "client!d", name = "s", descriptor = "[I")
    public int[] field2197 = new int[500];

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field2187 = 0;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lwm;")
    public static class152 field2192 = class157.method1048("tremblement:", 113);

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lwm;")
    public static class152 field2193 = class157.method1048("<br>(X100(U(Y", 106);

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lwm;")
    public static class152 field2189 = class157.method1048("compass", 105);

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field2194 = -2;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lah;")
    public static class205 field2179;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[[Z")
    public static boolean[][] field2188;

    @OriginalMember(owner = "client!d", name = "run", descriptor = "()V", line = 35)
    public final void run() {
        field2198++;
        while (this.field2186) {
            Object var1 = this.field2190;
            synchronized (this.field2190) {
                if (this.field2196 < 500) {
                    this.field2195[this.field2196] = class278.field4763;
                    this.field2197[this.field2196] = class254.field4397;
                    this.field2196++;
                }
            }
            class4.method19(0, 50L);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Lak;", line = 56)
    public static final class311 method896(int arg0) {
        if (arg0 != -28093) {
            field2191 = 71;
        }
        field2185++;
        return class23.field399;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V", line = 69)
    public static final void method897(int arg0, byte arg1) {
        field2181++;
        class123 var2 = (class123) class225.field3655.method1586((long) arg0, -58);
        if (var2 == null) {
            return;
        }
        if (arg1 >= -37) {
            method896(30);
        }
        for (int var3 = 0; var3 < var2.field1730.length; var3++) {
            var2.field1730[var3] = -1;
            var2.field1729[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Loh;", line = 105)
    public static final class16 method898(int arg0, int arg1) {
        field2182++;
        class16 var2 = (class16) class123.field1727.method1620(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class37.field626.method1381(1, arg0, arg1);
        class16 var4 = new class16();
        if (var3 != null) {
            var4.method101(new class291(var3), -1, arg0);
        }
        class123.field1727.method1614(var4, (long) arg0, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 149)
    public static void method899(int arg0) {
        field2192 = null;
        field2179 = null;
        if (arg0 > -42) {
            field2189 = (class152) null;
        }
        field2193 = null;
        field2189 = null;
        field2188 = (boolean[][]) null;
    }
}
