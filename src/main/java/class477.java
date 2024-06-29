import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class477 extends class132 {

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public int field6718 = -1;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public int field6713 = -1;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public int field6717 = 0;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public int field6720 = 0;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public int field6719 = 12800;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public int field6727 = 12800;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "Z")
    public boolean field6729 = true;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public int field6715;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public int field6730;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "Ljava/lang/String;")
    public String field6716;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "Ljava/lang/String;")
    public String field6723;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "Ldm;")
    public class46 field6728;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "[Ldba;")
    public static class78[] field6722 = new class78[14];

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(III)Z")
    public static final boolean method2777(int arg0, int arg1, int arg2) {
        if (arg0 >= -109) {
            return false;
        } else {
            field6726++;
            return (arg2 & 0x60000) != 0 | class16.method181(arg1, arg2, 16) || class191.method1190((byte) -25, arg2, arg1) || class58.method524(arg2, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(III)Z")
    public final boolean method2778(int arg0, int arg1, int arg2) {
        field6725++;
        for (class355 var4 = (class355) this.field6728.method456((byte) -84); var4 != null; var4 = (class355) this.field6728.method460((byte) -111)) {
            if (var4.method2131(arg0, arg2, (byte) -78)) {
                return true;
            }
        }
        if (arg1 > -18) {
            this.method2781(56, -96, 57, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([IIII)Z")
    public final boolean method2779(int[] arg0, int arg1, int arg2, int arg3) {
        field6714++;
        for (class355 var5 = (class355) this.field6728.method456((byte) -77); var5 != null; var5 = (class355) this.field6728.method460((byte) 120)) {
            if (var5.method2131(arg2, arg3, (byte) -78)) {
                var5.method2129(arg3, false, arg2, arg0);
                return true;
            }
        }
        return arg1 != 12800;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[III)Z")
    public final boolean method2780(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field6721++;
        int var6 = 21 % ((arg4 - 16) / 35);
        for (class355 var7 = (class355) this.field6728.method456((byte) -72); var7 != null; var7 = (class355) this.field6728.method460((byte) -114)) {
            if (var7.method2126((byte) 16, arg1, arg0, arg3)) {
                var7.method2129(arg1, false, arg3, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III[I)Z")
    public final boolean method2781(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg1 != 383) {
            this.method2783(-90);
        }
        field6712++;
        for (class355 var5 = (class355) this.field6728.method456((byte) -123); var5 != null; var5 = (class355) this.field6728.method460((byte) -117)) {
            if (var5.method2128(arg2, arg0, 91)) {
                var5.method2127(arg0, arg3, arg2, 361);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
    public static void method2782(boolean arg0) {
        field6722 = null;
        if (arg0) {
            field6722 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public final void method2783(int arg0) {
        this.field6717 = 0;
        this.field6727 = 12800;
        field6724++;
        this.field6720 = 0;
        this.field6719 = 12800;
        for (class355 var2 = (class355) this.field6728.method456((byte) -105); var2 != null; var2 = (class355) this.field6728.method460((byte) 46)) {
            if (this.field6727 > var2.field4790) {
                this.field6727 = var2.field4790;
            }
            if (this.field6717 < var2.field4788) {
                this.field6717 = var2.field4788;
            }
            if (var2.field4784 > this.field6720) {
                this.field6720 = var2.field4784;
            }
            if (this.field6719 > var2.field4797) {
                this.field6719 = var2.field4797;
            }
        }
        int var3 = -124 / ((22 - arg0) / 41);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class477(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field6715 = arg0;
        this.field6718 = arg4;
        this.field6730 = arg3;
        this.field6729 = arg5;
        this.field6716 = arg2;
        this.field6723 = arg1;
        this.field6713 = arg6;
        if (this.field6713 == 255) {
            this.field6713 = 0;
        }
        this.field6728 = new class46();
    }
}
