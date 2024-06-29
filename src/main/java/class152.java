import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class152 extends class113 {

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "I")
    public static volatile int field3739 = 0;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
    public static int field3743 = 0;

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "I")
    public static int field3747 = 0;

    @OriginalMember(owner = "client!we", name = "nb", descriptor = "Lu;")
    public static class135 field3752 = class87.method676((byte) -102, "scrollen:");

    @OriginalMember(owner = "client!we", name = "mb", descriptor = "Lr;")
    public static class117 field3751 = new class117(5000);

    @OriginalMember(owner = "client!we", name = "ob", descriptor = "Lu;")
    private static class135 field3753 = class87.method676((byte) -86, "Accept trade");

    @OriginalMember(owner = "client!we", name = "sb", descriptor = "Lu;")
    private static class135 field3757 = class87.method676((byte) -39, "Sorry invited players only)3");

    @OriginalMember(owner = "client!we", name = "qb", descriptor = "Lu;")
    public static class135 field3755 = class87.method676((byte) -104, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!we", name = "tb", descriptor = "Lu;")
    public static class135 field3758 = field3753;

    @OriginalMember(owner = "client!we", name = "rb", descriptor = "Lu;")
    public static class135 field3756 = field3757;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    public int field3737;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
    public int field3745;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!we", name = "kb", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "Lre;")
    public static class122 field3740;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "[I")
    public int[] field3738;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "[I")
    public static int[] field3742;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "[I")
    public int[] field3744;

    @OriginalMember(owner = "client!we", name = "pb", descriptor = "[I")
    public static int[] field3754;

    @OriginalMember(owner = "client!we", name = "lb", descriptor = "[Lu;")
    public class135[] field3750;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lwc;I)V")
    public static final void method1222(class150 arg0, int arg1) {
        field3746++;
        arg0.field3716 = false;
        if (arg1 != 0) {
            field3747 = 5;
        }
        if (arg0.field3715 != null) {
            arg0.field3715.field2821 = 0;
        }
        for (class150 var2 = arg0.method732(); var2 != null; var2 = arg0.method720()) {
            method1222(var2, 0);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILpe;Lud;I)V")
    public static final void method1223(int arg0, class109 arg1, class139 arg2, int arg3) {
        if (arg0 != -10149) {
            method1222(null, 94);
        }
        field3748++;
        byte[] var4 = null;
        class23 var5 = class23.field551;
        synchronized (class23.field551) {
            for (class129 var6 = (class129) class23.field551.method182((byte) 50); var6 != null; var6 = (class129) class23.field551.method181((byte) 112)) {
                if ((long) arg3 == var6.field951 && var6.field3109 == arg2 && var6.field3104 == 0) {
                    var4 = var6.field3108;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg2.method1123(arg3, 124);
            arg1.method878(arg3, arg2, true, var7, (byte) 2);
        } else {
            arg1.method878(arg3, arg2, true, var4, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
    public static void method1224(int arg0) {
        field3740 = null;
        if (arg0 != 0) {
            field3757 = null;
        }
        field3757 = null;
        field3758 = null;
        field3751 = null;
        field3752 = null;
        field3755 = null;
        field3754 = null;
        field3756 = null;
        field3742 = null;
        field3753 = null;
    }
}
