import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class27 {

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "Ls;")
    public static class34 field375 = class9.method35("Short)2cut", 220);

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "I")
    public static int field376 = 0;

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "Ls;")
    public static class34 field378 = class9.method35("Key", 220);

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "Ls;")
    public static class34 field379 = class9.method35("world", 220);

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "[I")
    public static int[] field377;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)Lca;", line = 13)
    public static final class6 method182(int arg0) {
        if (arg0 != -101) {
            return (class6) null;
        }
        try {
            return (class6) Class.forName("qa").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class36();
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)V", line = 27)
    public static final void method183(byte arg0) {
        class16 var1 = class31.field414;
        synchronized (class31.field414) {
            field376 = class9.field85;
            class22.field219 = class12.field115;
            class12.field120 = class6.field43;
            class31.field422 = class19.field174;
            class19.field169 = class37.field506;
            class30.field404 = class28.field381;
            class19.field174 = 0;
            if (arg0 != 7) {
                method183((byte) 88);
            }
        }
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(I)V", line = 52)
    public static void method184(int arg0) {
        field379 = null;
        field377 = null;
        if (arg0 != 10667) {
            method182(-88);
        }
        field378 = null;
        field375 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(B)V", line = 81)
    public static final void method185(byte arg0) {
        if (arg0 == -66 && class6.field39 != null) {
            class35 var1 = class6.field39;
            synchronized (class6.field39) {
                class6.field39 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(II)[B", line = 102)
    public static final synchronized byte[] method186(int arg0, int arg1) {
        if (arg0 != 7589) {
            return (byte[]) null;
        } else if (arg1 == 100 && class40.field535 > 0) {
            byte[] var2 = class6.field38[--class40.field535];
            class6.field38[class40.field535] = null;
            return var2;
        } else if (arg1 == 5000 && class1.field10 > 0) {
            byte[] var3 = class38.field511[--class1.field10];
            class38.field511[class1.field10] = null;
            return var3;
        } else if (arg1 == 30000 && class24.field252 > 0) {
            byte[] var4 = class18.field154[--class24.field252];
            class18.field154[class24.field252] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
