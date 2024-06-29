import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class181 extends class154 {

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "Loh;")
    public static class258 field3237 = class153.method1046("floorshadows", 124);

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "Loh;")
    public static class258 field3245 = class153.method1046("Angreifen", 90);

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "Loh;")
    private static class258 field3243 = class153.method1046("Loaded wordpack", 90);

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "Loh;")
    public static class258 field3244 = field3243;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "Loh;")
    public static class258 field3253 = class153.method1046("scrollbar", 95);

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public int field3234;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public int field3240;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public int field3241;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public int field3242;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "Lbd;")
    public class198 field3227;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "Lmm;")
    public class22 field3239;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "Lja;")
    public class265 field3249;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "Lwl;")
    public class63 field3233;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 24)
    public static void method1237(int arg0) {
        if (arg0 != 6) {
            method1238(-43);
        }
        field3253 = null;
        field3245 = null;
        field3243 = null;
        field3237 = null;
        field3244 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Z", line = 45)
    public static final boolean method1238(int arg0) {
        field3256++;
        if (class50.field768) {
            try {
                return !(Boolean) class69.field1187.method1779((byte) 4, class297.field5086.field5061);
            } catch (Throwable var2) {
            }
        }
        if (arg0 != -2948) {
            method1238(97);
        }
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V", line = 87)
    public static final void method1239(int arg0, int arg1, byte arg2) {
        int var3 = -117 / ((arg2 + 23) / 61);
        field3231++;
        class286 var4 = class48.method389(arg1, 6, 10738);
        var4.method2017(-26);
        var4.field4932 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 112)
    public final void method1240(int arg0) {
        this.field3227 = null;
        this.field3239 = null;
        this.field3233 = null;
        this.field3249 = null;
        field3252++;
        if (arg0 != 6) {
            this.field3239 = (class22) null;
        }
    }
}
