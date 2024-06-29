import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class39 extends class296 {

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field475 = 0;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Lvl;")
    public static class73 field474;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "[I")
    public static int[] field471;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method222(int arg0) {
        if (arg0 != 100) {
            field474 = null;
        }
        field474 = null;
        field471 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method223(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field476++;
        if (arg0 == arg7) {
            class134.method854(arg5, arg7, arg3, arg1, 26, arg2, arg6);
            return;
        }
        if (class56.field816 <= (arg6 - arg7) && class187.field2938 >= arg6 + arg7 && (arg2 - arg0) >= class115.field1678 && arg0 + arg2 <= class60.field882) {
            class249.method1771(arg1, arg0, arg2, arg5, (byte) -65, arg3, arg7, arg6);
        } else {
            class176.method1255(-10325, arg7, arg2, arg0, arg1, arg3, arg5, arg6);
        }
        if (arg4 != -119) {
            method222(-48);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(JBZ)V")
    public static final void method224(long arg0, byte arg1, boolean arg2) {
        field478++;
        if (arg0 == 0L) {
            return;
        }
        if (class84.field1302 >= 100) {
            class236.method1655(0, "", 125, class186.field2928);
            return;
        }
        String var4 = class178.method1264(arg0, (byte) 103);
        for (int var5 = 0; var5 < class84.field1302; var5++) {
            if (class58.field863[var5] == arg0) {
                class236.method1655(0, "", 119, var4 + class272.field4431);
                return;
            }
        }
        for (int var6 = 0; var6 < class76.field1142; var6++) {
            if (class218.field3419[var6] == arg0) {
                class236.method1655(0, "", 113, class251.field4109 + var4 + class19.field265);
                return;
            }
        }
        if (var4.equals(class214.field3347.field31)) {
            class236.method1655(0, "", 118, class245.field4001);
            return;
        }
        class206.field3228++;
        class58.field863[class84.field1302] = arg0;
        class309.field4975[class84.field1302] = class15.method92(arg0, (byte) -123);
        if (arg1 < -31) {
            class82.field1249[class84.field1302++] = arg2;
            class250.field4088 = client.field3871;
            class150.field2218.method445(65, 7);
            class150.field2218.method1160(-25643, arg0);
        }
    }
}
