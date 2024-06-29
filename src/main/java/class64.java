import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class class64 {

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field881 = new String[200];

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Lsl;")
    public static class266 field882 = new class266();

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "Ldj;")
    public static class191 field885 = new class191(32);

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field886 = 0;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIB)V", line = 3)
    public static final void method408(boolean arg0, int arg1, byte arg2) {
        field877++;
        if (arg2 > -28) {
            method410(false, (String) null);
        }
        class101 var3 = class438.method2729(arg0, arg1, true);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field1277.length; var4++) {
                var3.field1277[var4] = -1;
                var3.field1280[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ltj;Z)V", line = 33)
    public static final void method409(class108 arg0, boolean arg1) {
        if (!arg1) {
            method411(127);
        }
        field880++;
        class409.field5873 = arg0.method662(5899, "titlebg");
        class186.field2659 = arg0.method662(5899, "logo");
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 49)
    public static final String method410(boolean arg0, String arg1) {
        field884++;
        int var2 = arg1.length();
        if (arg0) {
            method409((class108) null, false);
        }
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class209.method1482(var6, 402);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 103)
    public static void method411(int arg0) {
        field885 = null;
        field882 = null;
        if (arg0 != 25503) {
            field881 = null;
        }
        field881 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V", line = 120)
    public static final void method412(int arg0, int arg1) {
        field879++;
        class196.field2817 = arg0;
        class15 var2 = class293.field4241;
        synchronized (class293.field4241) {
            class293.field4241.method102((byte) -122);
        }
        if (arg1 != -9571) {
            field885 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(III)V", line = 135)
    public class64(int arg0, int arg1, int arg2) {
        this.field883 = arg1;
        this.field878 = arg2;
        this.field876 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
    public abstract void method168(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(III)V")
    public abstract void method173(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(III)V")
    public abstract void method169(int arg0, int arg1, int arg2);
}
