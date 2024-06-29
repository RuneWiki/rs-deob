import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class227 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
    public static int[] field3550 = new int[2000];

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field3554 = 0;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3559 = 0;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3555 = -1;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method1508(byte arg0) {
        if (arg0 == -50) {
            field3550 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method1509(int arg0) {
        field3552++;
        if (class155.field2373 > 0) {
            class118.method850((byte) 55);
        } else {
            class77.field1308 = class118.field1829;
            class118.field1829 = null;
            class77.method609(10, arg0);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static final void method1510(byte arg0) {
        class130.field2023.method1783(0);
        field3551++;
        if (arg0 > -123) {
            method1510((byte) 72);
        }
    }
}
