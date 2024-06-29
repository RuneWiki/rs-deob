import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class413 extends class42 {

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public int field5841;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public int field5843;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field5844 = 0;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "Lqv;")
    public static class316 field5845;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "Lwp;")
    public static class122 field5847;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "[I")
    public static int[] field5849;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "Lwn;")
    public static class519 field5846;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public static void method2468(byte arg0) {
        field5845 = null;
        if (arg0 >= 57) {
            field5849 = null;
            field5846 = null;
            field5847 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static final void method2469(int arg0) {
        field5840++;
        if (arg0 != 8) {
            field5844 = -11;
        }
        try {
            if (class92.field1478 == 1) {
                int var1 = class336.field4972.method1443((byte) 122);
                if (var1 > 0 && class336.field4972.method1442(20845)) {
                    int var2 = var1 - class19.field211;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class336.field4972.method1472(104, var2);
                } else {
                    class336.field4972.method1447(true);
                    class336.field4972.method1451(arg0 ^ 0xFFFFFFF7);
                    if (class479.field6987 == null) {
                        class92.field1478 = 0;
                    } else {
                        class92.field1478 = 2;
                    }
                    class338.field5011 = null;
                    class284.field4223 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class336.field4972.method1447(true);
            class479.field6987 = null;
            class338.field5011 = null;
            class284.field4223 = null;
            class92.field1478 = 0;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIILjava/lang/Class;)Lsv;")
    public static final class478 method2470(int arg0, int arg1, int arg2, Class arg3) {
        class188 var4 = class461.field6675[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class317 var5 = var4.field2773; var5 != null; var5 = var5.field4709) {
            class478 var6 = var5.field4711;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6971 == arg1 && var6.field6962 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(II)V")
    public class413(int arg0, int arg1) {
        this.field5841 = arg1;
        this.field5843 = arg0;
    }

    static {
        new class44("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field5845 = new class316(85, 8);
        field5847 = new class122();
        field5849 = new int[2];
    }
}
