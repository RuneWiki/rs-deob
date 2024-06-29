import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class162 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lud;")
    public static class279 field2918 = class130.method1024("p12_full", 255);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field2923 = 0;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lcd;")
    public static class69 field2920 = new class69(16);

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2924 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Lud;")
    private static class279 field2927 = class130.method1024("Loading wordpack )2 ", 255);

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field2928 = -1;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[I")
    public static int[] field2925 = new int[8];

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Lud;")
    public static class279 field2926 = field2927;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Z")
    public static boolean field2929 = true;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lud;")
    public static class279 field2930 = class130.method1024("0", 255);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1277(boolean arg0) {
        if (arg0) {
            method1277(false);
        }
        field2926 = null;
        field2925 = null;
        field2920 = null;
        field2924 = null;
        field2918 = null;
        field2930 = null;
        field2927 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V", line = 40)
    public static final void method1278(boolean arg0) {
        field2922++;
        class44.field915 = null;
        class115.field2097 = null;
        class113.field2080 = (byte[][]) null;
        class216.field3811 = null;
        if (!arg0) {
            class217.field3839 = null;
            class1.field92 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V", line = 64)
    public static final void method1279(int arg0, int arg1, int arg2) {
        if (arg2 == 4 && !field2929) {
            arg1 = 2;
            arg2 = 2;
        }
        if (arg0 != 0) {
            field2930 = (class279) null;
        }
        field2921++;
        if (class180.field3259 != arg2) {
            if (class289.field5155) {
                return;
            }
            if (class180.field3259 != 0) {
                class134.field2444[class180.field3259].method73();
            }
            if (arg2 != 0) {
                class147 var3 = class134.field2444[arg2];
                var3.method76();
                var3.method75(arg1);
            }
            class202.field3597 = arg1;
            class180.field3259 = arg2;
        } else if (arg2 != 0 && class202.field3597 != arg1) {
            class134.field2444[arg2].method75(arg1);
            class202.field3597 = arg1;
        }
    }
}
