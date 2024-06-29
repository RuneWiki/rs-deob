import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class343 {

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public int field4916;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "Lvt;")
    public static class343 field4919 = new class343(1);

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Lvt;")
    public static class343 field4920 = new class343(2);

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Lvt;")
    public static class343 field4921 = new class343(4);

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Lvt;")
    public static class343 field4922 = new class343(1);

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "Lvt;")
    public static class343 field4923 = new class343(2);

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "Lvt;")
    public static class343 field4924 = new class343(4);

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Lvt;")
    public static class343 field4925 = new class343(2);

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "Lvt;")
    public static class343 field4926 = new class343(4);

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "[I")
    public static int[] field4927 = new int[2048];

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "Z")
    public static boolean field4928 = false;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field4929 = -1;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    public static int field4931 = -50;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "[F")
    public static float[] field4930 = new float[4];

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!vt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4917++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)Z")
    public static final boolean method2091(int arg0, int arg1, int arg2) {
        int var3 = class310.field4552[arg0][arg1][arg2];
        if (-class115.field1893 == var3) {
            return false;
        } else if (class115.field1893 == var3) {
            return true;
        } else {
            int var4 = arg1 << class162.field2401;
            int var5 = arg2 << class162.field2401;
            if (class599.method3409(var4 + 1, class88.field1594[arg0].method694(arg1, arg2), var5 + 1) && class599.method3409(class390.field5828 + var4 - 1, class88.field1594[arg0].method694(arg1 + 1, arg2), var5 + 1) && class599.method3409(class390.field5828 + var4 - 1, class88.field1594[arg0].method694(arg1 + 1, arg2 + 1), class390.field5828 + var5 - 1) && class599.method3409(var4 + 1, class88.field1594[arg0].method694(arg1, arg2 + 1), class390.field5828 + var5 - 1) && class599.method3409(class468.field6745 + var4, class88.field1594[arg0].method694(arg1, arg2), var5 + 1) && class599.method3409(class390.field5828 + var4 - 1, class88.field1594[arg0].method694(arg1 + 1, arg2), class468.field6745 + var5) && class599.method3409(class468.field6745 + var4, class88.field1594[arg0].method694(arg1, arg2 + 1), class390.field5828 + var5 - 1) && class599.method3409(class390.field5828 + var4 - 1, class88.field1594[arg0].method694(arg1, arg2), class468.field6745 + var5) && class599.method3409(class468.field6745 + var4, class88.field1594[arg0].method694(arg1, arg2), class468.field6745 + var5)) {
                class310.field4552[arg0][arg1][arg2] = class115.field1893;
                return true;
            } else {
                class310.field4552[arg0][arg1][arg2] = -class115.field1893;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public static void method2092(byte arg0) {
        field4926 = null;
        field4930 = null;
        field4922 = null;
        field4920 = null;
        if (arg0 > -44) {
            method2095(1.9300894F, -0.33382815F, -0.049990878F, 7);
        }
        field4921 = null;
        field4925 = null;
        field4923 = null;
        field4919 = null;
        field4924 = null;
        field4927 = null;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(I)V")
    private class343(int arg0) {
        this.field4916 = arg0;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(III)Lnba;")
    public static final class363 method2093(int arg0, int arg1, int arg2) {
        class184 var3 = class277.field4051[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2653;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2094(int arg0, int arg1, byte arg2) {
        if (arg2 <= 17) {
            method2094(104, 84, (byte) -44);
        }
        field4915++;
        return (class525.method2958(15123, arg1, arg0) | class265.method1683(arg0, arg1, false) | class563.method3211(arg0, 52, arg1)) & class82.method752(arg0, arg1, (byte) 87);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(FFFI)I")
    public static final int method2095(float arg0, float arg1, float arg2, int arg3) {
        field4918++;
        if (arg3 != 1) {
            return 86;
        }
        float var4 = arg0 < 0.0F ? -arg0 : arg0;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 < var5 && var6 < var5) {
            return (arg1 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if ((arg0 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }
}
