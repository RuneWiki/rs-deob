import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class65 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lwm;")
    private static class152 field974 = class157.method1048("Loading interfaces )2 ", 101);

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Lwm;")
    public static class152 field978 = field974;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Lwm;")
    public static class152 field981 = class157.method1048("Impossible de trouver ", 118);

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Lwm;")
    public static class152 field982 = class157.method1048("Update)2Liste geladen)3", 96);

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field980 = 0;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Lwm;")
    public static class152 field979 = class157.method1048("mapdots", 108);

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lwm;")
    public static class152 field985 = class157.method1048("::tele ", 95);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Lah;")
    public static class205 field986;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "[[Laj;")
    public static class1[][] field983;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "[[[I")
    public static int[][][] field984;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 50)
    public static void method414(int arg0) {
        field985 = null;
        int var1 = 51 / ((-arg0 - 55) / 59);
        field986 = null;
        field984 = (int[][][]) null;
        field983 = (class1[][]) null;
        field982 = null;
        field974 = null;
        field981 = null;
        field978 = null;
        field979 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V", line = 84)
    public static final void method415(boolean arg0, int arg1) {
        field977++;
        if (class113.field1607 == null || class113.field1607.length < arg1) {
            class113.field1607 = new int[arg1];
        }
        if (!arg0) {
            method416((class291) null, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lhi;B)Lpk;", line = 162)
    public static final class112 method416(class291 arg0, byte arg1) {
        arg0.method2011(-22);
        if (arg1 <= 7) {
            return (class112) null;
        }
        field976++;
        int var2 = arg0.method2011(-66);
        class112 var3 = class139.method877(true, var2);
        var3.field1581 = arg0.method2011(-49);
        int var4 = arg0.method2011(-83);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2011(-78);
            var3.method52(31164, var6, arg0);
        }
        var3.method673(8);
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIIII)V", line = 239)
    public static final void method417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field975++;
        int var9 = arg7 - arg8;
        int var10 = (arg2 - arg5 << 16) / var9;
        int var11 = arg4 - arg0;
        int var12 = (arg1 - arg6 << 16) / var11;
        class234.method1608(arg5, arg8, arg3, arg7, var10, 0, var12, (byte) 118, arg4, arg6, arg0);
    }
}
