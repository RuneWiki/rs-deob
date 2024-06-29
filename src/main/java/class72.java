import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class72 {

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Z")
    public boolean field979;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field978 = -1;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "Lbt;")
    public static class437 field980 = new class437(13, 4);

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field983 = 0;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "Ljj;")
    public class688 field975;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "Ljj;")
    public class688 field977;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "Z")
    public boolean field971;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Z")
    public static boolean field982;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 4)
    public static void method428(int arg0) {
        if (arg0 != 1) {
            field984 = 1;
        }
        field980 = null;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 15)
    public final void method429(int arg0) {
        if (arg0 != 0) {
            this.method431(-49);
        }
        if (this.field977 != null) {
            this.field977.method284((byte) 110);
        }
        field974++;
        this.field971 = false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 33)
    public static final void method430(boolean arg0) {
        field973++;
        if (!arg0) {
            method430(false);
        }
        class299.field3785.method2919(0);
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)Z", line = 44)
    public final boolean method431(int arg0) {
        field972++;
        if (arg0 > -89) {
            method428(-119);
        }
        return this.field971 && !this.field979;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLjava/lang/String;)V", line = 55)
    public static final void method432(byte arg0, String arg1) {
        field976++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class463.method2604(arg1, (byte) -25);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class738.field9988; var3++) {
            String var4 = class202.field2803[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class463.method2604(var4, (byte) -128);
            if (var5 != null && var5.equals(var2)) {
                class738.field9988--;
                for (int var6 = var3; var6 < class738.field9988; var6++) {
                    class202.field2803[var6] = class202.field2803[var6 + 1];
                    class278.field3616[var6] = class278.field3616[var6 + 1];
                    class281.field3634[var6] = class281.field3634[var6 + 1];
                    class294.field3739[var6] = class294.field3739[var6 + 1];
                    class285.field3667[var6] = class285.field3667[var6 + 1];
                }
                class392.field5172++;
                class351.field4289 = class518.field6597;
                class13 var7 = class659.method3587(class68.field909, 98, class408.field5422);
                var7.field130.method1491(-129, class32.method168(arg1, 20));
                var7.field130.method1547(arg1, -6457);
                class116.method679(var7, 0);
                break;
            }
        }
        int var8 = 105 / ((arg0 + 16) / 55);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Z)V", line = 121)
    public class72(boolean arg0) {
        this.field979 = arg0;
    }
}
