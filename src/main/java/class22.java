import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class22 {

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Z")
    public boolean field325 = true;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Ldv;")
    public static class566 field319 = new class566(35, 3);

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "C")
    private char field328;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "F")
    public static float field327;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Lha;")
    public static class52 field324;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Ljava/lang/String;")
    public String field322;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ldaa;Z)V")
    public final void method253(class11 arg0, boolean arg1) {
        field318++;
        while (true) {
            int var3 = arg0.method110((byte) 36);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    field327 = 1.0361056F;
                    return;
                }
            }
            this.method257((byte) 61, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lmc;I)V")
    public static final void method254(class114 arg0, int arg1) {
        field326++;
        if (class457.field6445 == arg0.field1901) {
            if (class645.field9372.field2630 == null) {
                arg0.field1820 = 0;
                arg0.field1859 = 0;
            } else {
                arg0.field1823 = 150;
                arg0.field1797 = (int) (Math.sin((double) class405.field5763 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1780 = 5;
                arg0.field1820 = class97.field1472;
                arg0.field1859 = class168.method1074(class645.field9372.field2630, 0);
                arg0.field1838 = 0;
                arg0.field1754 = class645.field9372.field554;
                arg0.field1891 = class645.field9372.field521;
                arg0.field1804 = class645.field9372.field594;
            }
        } else if (arg1 != 35) {
            field324 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method255(byte arg0) {
        field319 = null;
        field324 = null;
        if (arg0 != -34) {
            method255((byte) -92);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)Z")
    public final boolean method256(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field320++;
            return this.field328 == 's';
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLdaa;I)V")
    private final void method257(byte arg0, class11 arg1, int arg2) {
        if (arg0 != 61) {
            return;
        }
        field321++;
        if (arg2 == 1) {
            this.field328 = class363.method2173(arg1.method67(65280), true);
        } else if (arg2 == 2) {
            this.field323 = arg1.method119(arg0 - 126);
        } else if (arg2 == 4) {
            this.field325 = false;
        } else if (arg2 == 5) {
            this.field322 = arg1.method100((byte) 80);
            return;
        }
    }
}
