import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class128 extends class154 {

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static volatile int field1785 = 0;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1784 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "[Lil;")
    public static class28[] field1791 = new class28[50];

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "J")
    public long field1793;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lhd;")
    public class128 field1786;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lhd;")
    public class128 field1789;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lnh;")
    public static class305 field1787;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lsk;III)V")
    public static final void method818(class202 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class207.field3086) {
            class91 var4 = class246.field3856[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1323 != null && var4.field1323.field4953.method1013()) {
                arg0.method1029(var4.field1323.field4953, 128, 0, 0, true);
            }
        }
        if (arg3 < class207.field3086) {
            class91 var5 = class246.field3856[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1323 != null && var5.field1323.field4953.method1013()) {
                arg0.method1029(var5.field1323.field4953, 0, 0, 128, true);
            }
        }
        if (arg2 < class207.field3086 && arg3 < class265.field4271) {
            class91 var6 = class246.field3856[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1323 != null && var6.field1323.field4953.method1013()) {
                arg0.method1029(var6.field1323.field4953, 128, 0, 128, true);
            }
        }
        if (arg2 < class207.field3086 && arg3 > 0) {
            class91 var7 = class246.field3856[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1323 != null && var7.field1323.field4953.method1013()) {
                arg0.method1029(var7.field1323.field4953, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public final void method819(byte arg0) {
        field1790++;
        if (this.field1786 == null) {
            return;
        }
        this.field1786.field1789 = this.field1789;
        this.field1789.field1786 = this.field1786;
        this.field1786 = null;
        this.field1789 = null;
        if (arg0 != -12) {
            this.field1789 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Z")
    public final boolean method820(int arg0) {
        if (arg0 > -125) {
            this.field1786 = null;
        }
        field1788++;
        return this.field1786 != null;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
    public static void method821(int arg0) {
        field1784 = null;
        field1791 = null;
        if (arg0 == 18652) {
            field1787 = null;
        }
    }
}
