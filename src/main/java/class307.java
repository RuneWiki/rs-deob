import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class307 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lgj;")
    public static class257 field4774 = new class257();

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Z")
    public static boolean field4775 = false;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Ljava/lang/String;", line = 9)
    public static final String method2163(int arg0, int arg1) {
        field4776++;
        int var2 = -77 / ((-arg0 - 27) / 52);
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class236.field3638 + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class308.field4788 + "</col>";
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 26)
    public static void method2164(int arg0) {
        if (arg0 != 0) {
            method2165(53, -105, -94);
        }
        field4774 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)I", line = 40)
    public static final int method2165(int arg0, int arg1, int arg2) {
        class64 var3 = (class64) class6.field67.method770((long) arg0, -112);
        field4777++;
        if (var3 == null) {
            return 0;
        }
        int var4 = 46 / ((arg2 + 73) / 43);
        if (arg1 == -1) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var3.field768.length; var6++) {
            if (var3.field773[var6] == arg1) {
                var5 += var3.field768[var6];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Llf;I)V", line = 75)
    public static final void method2166(class143 arg0, int arg1) {
        if (arg1 != 65535) {
            return;
        }
        for (int var2 = 0; var2 < class234.field3568; var2++) {
            int var3 = arg0.method1027(false);
            int var4 = arg0.method1051(1);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class201.field3038[var3] != null) {
                class201.field3038[var3].field1505 = var4;
            }
        }
        field4773++;
    }
}
