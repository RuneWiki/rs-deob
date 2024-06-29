import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class482 {

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "Luh;")
    private class168 field6719;

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "I")
    public static int field6726 = 2;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "Lmu;")
    public static class303 field6721 = new class303(27, 3);

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "I")
    public static int field6727 = 0;

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "I")
    public static int field6728 = 1403;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "Leh;")
    private class362 field6718;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Leh;")
    public final class362 method2824(byte arg0) {
        field6725++;
        class362 var2 = this.field6719.field2642.field5207;
        if (arg0 != -53) {
            this.method2826(-21);
        }
        if (this.field6719.field2642 == var2) {
            this.field6718 = null;
            return null;
        } else {
            this.field6718 = var2.field5207;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Luh;I)V")
    public final void method2825(class168 arg0, int arg1) {
        field6723++;
        if (arg1 <= 73) {
            this.method2824((byte) -67);
        }
        this.field6719 = arg0;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)Leh;")
    public final class362 method2826(int arg0) {
        field6724++;
        if (arg0 != 10) {
            method2827((byte) -25);
        }
        class362 var2 = this.field6718;
        if (this.field6719.field2642 == var2) {
            this.field6718 = null;
            return null;
        } else {
            this.field6718 = var2.field5207;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)V")
    public static final void method2827(byte arg0) {
        class480.method2814(0);
        field6720++;
        if (arg0 != 86) {
            return;
        }
        class57.field1142 = 0;
        class517.field7204 = null;
        class149.field2477.field3109 = 0;
        class433.field6189 = null;
        class212.field3013 = null;
        class568.field7816 = 0;
        class480.field6701 = null;
        class591.field8069 = 0;
        class4.method16(0);
        class527.method3052((byte) 27);
        for (int var1 = 0; var1 < 2048; var1++) {
            class49.field1040[var1] = null;
        }
        class58.field1147 = null;
        for (int var2 = 0; var2 < class77.field1375; var2++) {
            class9 var4 = class728.field9860[var2].field10510;
            if (var4 != null) {
                var4.field5701 = -1;
            }
        }
        class257.method1744(arg0 + 36);
        class705.field9558 = -1;
        class44.field978 = -1;
        class438.field6252 = 1;
        class215.method1527(2, 10);
        for (int var3 = 0; var3 < 100; var3++) {
            class286.field3995[var3] = true;
        }
        class128.method1065(-24498);
        class107.field1880 = null;
        class81.field1485 = 0L;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)V")
    public static void method2828(boolean arg0) {
        field6721 = null;
        if (!arg0) {
            field6726 = -53;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2829(int arg0, byte arg1, int arg2) {
        if (arg1 <= 120) {
            field6726 = 6;
        }
        field6722++;
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V")
    public class482() {
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Luh;)V")
    public class482(class168 arg0) {
        this.field6719 = arg0;
    }
}
