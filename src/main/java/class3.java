import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class3 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field76 = "Loading textures - ";

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lhk;")
    public static class53 field79 = new class53(0, -1);

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lbd;")
    public static class37 field81 = new class37();

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLne;)Z", line = 4)
    public static final boolean method64(byte arg0, class172 arg1) {
        field75++;
        if (arg1.field2807 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2807.length; var2++) {
            int var3 = class285.method1936(arg1, var2, false);
            int var4 = arg1.field2722[var2];
            if (arg1.field2807[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field2807[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field2807[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 <= 85) {
            method65(106);
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Z", line = 63)
    public static final boolean method65(int arg0) {
        field80++;
        if (arg0 != 0) {
            field81 = null;
        }
        if (class115.field1599) {
            try {
                if ((Boolean) class169.method1180(class63.field822.field4464, "showingVideoAd", false)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V", line = 83)
    public static final void method66(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class125.field1929; var5++) {
            Rectangle var7 = class119.field1631[var5];
            if ((var7.x + var7.width) > arg0 && arg0 + arg4 > var7.x && arg3 < var7.y + var7.height && var7.y < arg2 + arg3) {
                class239.field3976[var5] = true;
            }
        }
        int var6 = -19 % ((arg1 - 45) / 40);
        field78++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 110)
    public static void method67(byte arg0) {
        if (arg0 == 9) {
            field79 = null;
            field81 = null;
            field76 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 126)
    public static final void method68(int arg0) {
        if (class262.field4219 == 10) {
            class128.method953(16205, 28);
        }
        field77++;
        if (arg0 == 25 && class262.field4219 == 30) {
            class128.method953(16205, 25);
        }
    }
}
