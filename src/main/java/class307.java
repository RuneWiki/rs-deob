import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class307 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field5224 = 0;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Z")
    public static boolean field5230 = false;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lhi;")
    private static class82 field5229 = class95.method664((byte) -92, "Prepared sound engine");

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lhi;")
    public static class82 field5227 = class95.method664((byte) -89, "::fpsoff");

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lhi;")
    public static class82 field5231 = field5229;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lqc;")
    public static class329 field5234 = new class329(128);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lhi;")
    private static class82 field5237 = class95.method664((byte) -67, " has logged in)3");

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lhi;")
    public static class82 field5235 = field5237;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[Lti;")
    public static class186[] field5226;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 12)
    public static void method2119(int arg0) {
        field5231 = null;
        field5237 = null;
        field5227 = null;
        field5235 = null;
        field5234 = null;
        field5229 = null;
        if (arg0 == -4) {
            field5226 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lwa;", line = 56)
    public static final class269 method2120(int arg0, int arg1) {
        field5225++;
        class269 var2 = (class269) class62.field964.method2175((long) arg1, 3008);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class29.field390.method1577(arg0, arg1, -29569);
        class269 var4 = new class269();
        var4.field4554 = arg1;
        if (var3 != null) {
            var4.method1895(-124, new class153(var3));
        }
        var4.method1894((byte) 105);
        class62.field964.method2169(var4, (long) arg1, (byte) 94);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILum;)V", line = 96)
    public static final void method2121(int arg0, class222 arg1) {
        if (arg0 != 21870) {
            field5232 = 19;
        }
        class91.field1637 = arg1;
        field5233++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lme;ZI)Lhi;", line = 126)
    public static final class82 method2122(class75 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field5231 = (class82) null;
        }
        field5228++;
        if (!class23.method153(client.method871(arg0), -1, arg2) && arg0.field1163 == null) {
            return null;
        } else if (arg0.field1291 == null || arg2 >= arg0.field1291.length || arg0.field1291[arg2] == null || arg0.field1291[arg2].method550(-1).method535(true) == 0) {
            return class182.field3114 ? class29.method182(-6039, new class82[] { class189.field3160, class327.method2240((byte) -74, arg2) }) : null;
        } else {
            return arg0.field1291[arg2];
        }
    }
}
