import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class class238 {

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "S")
    public static short field3976 = 32767;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field3977 = 0;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Ltl;")
    public static class59 field3972 = class85.method639("leuchten1:", 9588);

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Leh;")
    public static class94 field3969 = new class94(32);

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field3978 = 0;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1666(int arg0) {
        field3970++;
        class141.method1026();
        if (arg0 != -3547) {
            method1667(-125, -58);
        }
        class141.method1030();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V", line = 23)
    public static final void method1667(int arg0, int arg1) {
        field3973++;
        if (arg0 != 32) {
            method1668((byte) 23);
        }
        for (class174 var2 = (class174) class14.field190.method692(64); var2 != null; var2 = (class174) class14.field190.method693((byte) 106)) {
            if ((var2.field4932 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method2000(arg0 ^ 0x58);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 57)
    public static void method1668(byte arg0) {
        if (arg0 != -12) {
            field3972 = (class59) null;
        }
        field3969 = null;
        field3972 = null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 86)
    public static final void method1669(int arg0) {
        class157.field2565.method1484(false);
        field3971++;
        if (arg0 <= 99) {
            field3972 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[B)V")
    public abstract void method672(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)[B")
    public abstract byte[] method671(byte arg0);
}
