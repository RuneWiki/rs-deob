import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class111 extends class200 {

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "[B")
    public byte[] field2008;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Ldj;")
    public static class44 field2005 = class89.method650(255, ")2");

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "Ldj;")
    public static class44 field2011 = class89.method650(255, "welle2:");

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field2009 = 1;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field2006 = 0;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field2010 = 0;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "Lsg;")
    public static class197 field2007;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BILve;)Lle;")
    public static final class125 method787(byte arg0, int arg1, class225 arg2) {
        if (arg0 == 45) {
            field2004++;
            return class156.method1026(255, arg1, arg2) ? class67.method539(102) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V")
    public static void method788(boolean arg0) {
        if (!arg0) {
            method787((byte) -120, 25, null);
        }
        field2005 = null;
        field2007 = null;
        field2011 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILvc;)Lvc;")
    public static final class223 method789(int arg0, class223 arg1) {
        field2012++;
        if (arg0 < 39) {
            return null;
        }
        class223 var2 = class59.method447((byte) 75, arg1);
        if (var2 == null) {
            var2 = arg1.field4148;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
    public class111(byte[] arg0) {
        this.field2008 = arg0;
    }
}
