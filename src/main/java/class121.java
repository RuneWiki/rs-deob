import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class121 extends class73 {

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lli;")
    public static class185 field2194 = class245.method1649(")2", 122);

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2202 = 0;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "Lui;")
    public static class225 field2209 = new class225(0, 0);

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "[Lne;")
    public static class199[] field2210 = new class199[0];

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "Lli;")
    public static class185 field2212 = class245.method1649("Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3", -100);

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "Lli;")
    public class185 field2206;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lp;")
    public class82 field2196;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Lp;")
    public class82 field2207;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Z")
    public boolean field2203;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "[Lcg;")
    public static class34[] field2211;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field2198;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method891(int arg0) {
        field2209 = null;
        field2212 = null;
        field2210 = null;
        field2194 = null;
        if (arg0 != 0) {
            field2212 = null;
        }
        field2211 = null;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public static final void method892(int arg0) {
        if (class27.field460 != null) {
            class173 var1 = class27.field460;
            synchronized (class27.field460) {
                class27.field460 = null;
            }
        }
        field2195++;
        if (arg0 > -25) {
            field2194 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILhi;)V")
    public static final void method893(int arg0, class250 arg1) {
        field2208++;
        class205.field3768 = arg1.method1694(class242.field4336, arg0 - 2);
        if (arg0 != 0) {
            method891(-111);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
    public static final void method894(int arg0, int arg1) {
        class276.field4901 = new int[arg0];
        int var2 = 118 / ((arg1 - 1) / 55);
        class282.field4977 = new int[arg0];
        class132.field2371 = new int[arg0];
        class48.field790 = new int[arg0];
        class216.field3963 = new int[arg0];
        field2205++;
    }
}
