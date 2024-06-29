import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class335 {

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
    private int field4731;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    private int field4728;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "Z")
    private boolean field4727;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "Z")
    private boolean field4723;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public static int field4729 = 0;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)Z")
    public final boolean method2148(int arg0) {
        if (arg0 != 11745) {
            this.method2149((byte) 105);
        }
        field4722++;
        return this.field4723;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)I")
    public final int method2149(byte arg0) {
        if (arg0 >= -124) {
            method2150(true, null);
        }
        field4724++;
        return this.field4728;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZLjava/awt/Component;)Lhw;")
    public static final class141 method2150(boolean arg0, Component arg1) {
        field4730++;
        return arg0 ? new class525(arg1) : null;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)Z")
    public final boolean method2151(byte arg0) {
        field4721++;
        if (arg0 != -6) {
            this.field4728 = -58;
        }
        return this.field4727;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)J")
    public static final long method2152(int arg0, int arg1) {
        field4725++;
        if (arg0 != 0) {
            field4729 = -11;
        }
        return (long) (arg1 + 11745) * 86400000L;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)I")
    public final int method2153(boolean arg0) {
        if (!arg0) {
            this.method2148(-93);
        }
        field4726++;
        return this.field4731;
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(ZIIZ)V")
    public class335(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field4731 = arg1;
        this.field4728 = arg2;
        this.field4727 = arg0;
        this.field4723 = arg3;
    }
}
