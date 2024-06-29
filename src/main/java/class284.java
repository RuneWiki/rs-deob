import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class284 extends class259 {

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public int field4983 = 0;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public int field4987 = 12800;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public int field4981 = 0;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public int field4995 = -1;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "Z")
    public boolean field5007 = true;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
    public int field5006 = 12800;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "Lcc;")
    public class209 field5005;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "Lcc;")
    public class209 field4994;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public int field4991;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "Lsg;")
    public class162 field4980;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "[I")
    public static int[] field4997 = new int[2500];

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "[Lue;")
    public static class87[] field4984 = new class87[6];

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "J")
    public static long field4992 = 0L;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field4982 = 0;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    public static int field5002 = 0;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "Lcc;")
    private static class209 field5004 = class95.method669(123, " is already on your friend list)3");

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "Lcc;")
    public static class209 field4986 = field5004;

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    public static int field5008 = 0;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lsg;")
    public static class162 field4993 = new class162();

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "Lsj;")
    public static class49 field5003;

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "[[[B")
    public static byte[][][] field5009;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "[[[I")
    public static int[][][] field4996;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V")
    public static final void method1908(int arg0, byte arg1) {
        field4989++;
        if (arg1 != -106) {
            field4992 = 60L;
        }
        class115.field2291.method662(32768, arg0);
        class231.field4194.method662(32768, arg0);
        class114.field2282.method662(32768, arg0);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(III)Z")
    public final boolean method1909(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method1913(true, (byte) -74);
        }
        field4999++;
        if (arg1 < this.field4987 || arg1 > this.field4981 || arg2 < this.field5006 || this.field4983 < arg2) {
            return false;
        }
        for (class167 var4 = (class167) this.field4980.method1119(arg0 + 20896); var4 != null; var4 = (class167) this.field4980.method1120(arg0 + 80)) {
            if (var4.method1151(arg1, 0, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "(I)V")
    public static void method1910(int arg0) {
        field4984 = null;
        field4993 = null;
        if (arg0 != 0) {
            field4996 = null;
        }
        field4996 = null;
        field4997 = null;
        field5009 = null;
        field5004 = null;
        field4986 = null;
        field5003 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
    public static final void method1911(byte arg0) {
        if (class95.field1876 != null) {
            class95.field1876.method56(86);
        }
        if (class227.field4148 != null) {
            class227.field4148.method56(-112);
        }
        class5.method44(class71.field1343, false, 22050, 2);
        field4988++;
        class95.field1876 = class183.method1252(class122.field2411, arg0 ^ 0xFFFFFFBC, class230.field4187, 0, 22050);
        if (arg0 != -81) {
            field4996 = null;
        }
        class95.field1876.method46((byte) -57, class277.field4875);
        class227.field4148 = class183.method1252(class122.field2411, -15, class230.field4187, 1, 2048);
        class227.field4148.method46((byte) -108, class47.field906);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public final void method1912(boolean arg0) {
        this.field4981 = 0;
        this.field4987 = 12800;
        this.field4983 = 0;
        this.field5006 = 12800;
        field5000++;
        if (!arg0) {
            field5009 = null;
        }
        for (class167 var2 = (class167) this.field4980.method1119(20896); var2 != null; var2 = (class167) this.field4980.method1120(77)) {
            if (this.field5006 > var2.field3009) {
                this.field5006 = var2.field3009;
            }
            if (this.field4981 < var2.field3003) {
                this.field4981 = var2.field3003;
            }
            if (this.field4987 > var2.field3017) {
                this.field4987 = var2.field3017;
            }
            if (var2.field3010 > this.field4983) {
                this.field4983 = var2.field3010;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZB)V")
    public static final void method1913(boolean arg0, byte arg1) {
        class12.field233 = null;
        class249.field4496 = null;
        class181.field3264 = null;
        class147.field2702 = null;
        class156.field2855 = null;
        class1.field23 = null;
        field4990++;
        int var2 = 123 % ((45 - arg1) / 53);
        class234.field4213 = null;
        class191.field3461 = null;
        class187.field3383 = null;
        if (arg0 && class111.field2244 != null) {
            class273.field4849 = class111.field2244.field4994;
        } else {
            class273.field4849 = null;
        }
        class87.field1737 = null;
        class255.field4597 = 0;
        class111.field2244 = null;
        class158.field2885.method1117((byte) 74);
        class237.field4281 = null;
        class172.field3143 = null;
        class197.field3538 = null;
        class134.field2548 = null;
        class115.field2320 = null;
        class106.field2071 = null;
        class155.field2842 = null;
        class108.field2173 = null;
        class145.field2672 = null;
        class69.field1314 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLsj;Lcc;)Laa;")
    public static final class168 method1914(byte arg0, class49 arg1, class209 arg2) {
        int var3 = arg1.method364(-1, arg2);
        field4998++;
        if (arg0 != -49) {
            return null;
        } else if (var3 == -1) {
            return new class168(0);
        } else {
            int[] var4 = arg1.method357((byte) -56, var3);
            class168 var5 = new class168(var4.length);
            for (int var6 = 0; var6 < var5.field3036; var6++) {
                class106 var7 = new class106(arg1.method353(var4[var6], arg0 + 166, var3));
                var5.field3032[var6] = var7.method755(1);
                var5.field3022[var6] = var7.method777(arg0 + 110);
                var5.field3031[var6] = (short) var7.method736(126);
                var5.field3035[var6] = (short) var7.method736(121);
                var5.field3029[var6] = var7.method746((byte) -100);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lcc;Lcc;IIIZ)V")
    public class284(class209 arg0, class209 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4985 = arg3;
        this.field5005 = arg1;
        this.field4994 = arg0;
        this.field4995 = arg4;
        this.field4991 = arg2;
        this.field5007 = arg5;
        this.field4980 = new class162();
    }
}
