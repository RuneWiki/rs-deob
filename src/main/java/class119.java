import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class119 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lcc;")
    public static class209 field2377 = class95.method669(109, "Texturen geladen)3");

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Z")
    public static final boolean method841(int arg0, int arg1) {
        field2372++;
        if (arg1 != 19347) {
            method848(-7);
        }
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Ljk;")
    public static final class253 method842(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class253 var4 = var3.field2201;
            var3.field2201 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method843(byte arg0) {
        field2377 = null;
        if (arg0 != -61) {
            method843((byte) 72);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)Z")
    public final boolean method844(byte arg0) {
        int var2 = -39 / ((arg0 - 10) / 59);
        field2376++;
        return (this.field2379 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Z")
    public final boolean method845(int arg0) {
        field2381++;
        if (arg0 != -1) {
            method841(101, 4);
        }
        return (this.field2379 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)Z")
    public final boolean method846(boolean arg0) {
        field2383++;
        if (!arg0) {
            this.field2373 = 104;
        }
        return (this.field2379 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)Z")
    public final boolean method847(byte arg0) {
        if (arg0 != -98) {
            field2377 = null;
        }
        field2374++;
        return (this.field2379 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static final void method848(int arg0) {
        field2378++;
        if (arg0 != 25763) {
            field2377 = null;
        }
        class102.field1965 = new class162();
    }
}
