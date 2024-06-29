import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class149 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lui;")
    private class426 field2053 = new class426();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Llq;")
    private class5 field2054 = new class5();

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    private int field2061;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    private int field2059;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lcm;")
    private class382 field2060;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lnn;")
    public static class151 field2062;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Lwl;")
    public static class452 field2063;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lpf;")
    public static class425 field2068;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[I")
    public static int[] field2065;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method925(boolean arg0) {
        this.field2054.method45(12);
        field2052++;
        if (arg0) {
            this.field2060.method2307(5142);
            this.field2053 = new class426();
            this.field2061 = this.field2059;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public static final void method926(int arg0, int arg1) {
        field2056++;
        class241 var2 = class306.field4617;
        synchronized (class306.field4617) {
            class306.field4617.method1481(arg0 ^ 0x188B, arg1);
        }
        if (arg0 != 6280) {
            method928(-34, 27, -2, 22, -73, 20, -86);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(JI)Lui;")
    public final class426 method927(long arg0, int arg1) {
        field2057++;
        class426 var4 = (class426) this.field2060.method2302(arg0, 23576);
        if (var4 != null) {
            this.field2054.method40(var4, 17478);
        }
        int var5 = -80 % ((arg1 + 73) / 36);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 29) {
            field2066 = 112;
        }
        field2058++;
        class170 var7 = class455.method2827(arg3, false, arg2);
        if (var7 == null) {
            return;
        }
        if (var7.field2542 != null) {
            class327 var8 = new class327();
            var8.field4909 = var7;
            var8.field4908 = var7.field2542;
            class384.method2316(var8);
        }
        class108.field1435 = arg1;
        class244.field3662 = arg4;
        class186.field2795 = arg2;
        class54.field729 = arg3;
        class132.field1692 = true;
        class1.field5 = arg6;
        class105.field1411 = arg5;
        class390.field5763 = var7.field2592;
        class405.method2543(var7, 125);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(JLui;Z)V")
    public final void method929(long arg0, class426 arg1, boolean arg2) {
        field2064++;
        if (this.field2061 == 0) {
            class426 var5 = this.field2054.method47(17795);
            var5.method625((byte) -50);
            var5.method2627(0);
            if (this.field2053 == var5) {
                class426 var6 = this.field2054.method47(17795);
                var6.method625((byte) -50);
                var6.method2627(0);
            }
        } else {
            this.field2061--;
        }
        if (arg2) {
            field2063 = null;
        }
        this.field2060.method2301(58, arg1, arg0);
        this.field2054.method40(arg1, 17478);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static final void method930(byte arg0) {
        class261.field3963 = true;
        field2055++;
        if (arg0 >= -69) {
            field2062 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method931(int arg0) {
        field2068 = null;
        if (arg0 == -1) {
            field2065 = null;
            field2062 = null;
            field2063 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method932(String arg0, int arg1) {
        field2051++;
        if (arg1 != 2688) {
            method926(38, -1);
        }
        class261.method1618(0, "", (byte) 108, 0, arg0, "");
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V")
    public class149(int arg0) {
        this.field2061 = arg0;
        this.field2059 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2060 = new class382(var2);
    }

    static {
        new class151("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field2062 = new class151("Drop", "Fallen lassen", "Poser", "Largar");
        field2067 = 0;
        field2063 = new class452(29, 6);
        field2068 = new class425(72, -1);
    }
}
