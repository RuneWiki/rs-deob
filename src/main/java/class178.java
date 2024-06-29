import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class178 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[I")
    public static int[] field3133 = new int[4096];

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lpj;")
    public static class237 field3136;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lpj;")
    public static class237 field3140;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lpj;")
    public static class237 field3138;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method1229(byte arg0) {
        if (arg0 < 53) {
            field3133 = null;
        }
        field3136 = null;
        field3138 = null;
        field3133 = null;
        field3140 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1230(Component arg0, int arg1) {
        arg0.removeKeyListener(class87.field1600);
        arg0.removeFocusListener(class87.field1600);
        field3135++;
        class159.field2865 = -1;
        if (arg1 != 9591) {
            method1229((byte) -7);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Z")
    public final boolean method1231(int arg0) {
        field3137++;
        if (arg0 != 14416) {
            field3127 = -78;
        }
        return (this.field3134 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
    public static final void method1232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -28820) {
            return;
        }
        if (class34.field727 >= arg2 && class13.field215 <= arg4) {
            boolean var6;
            if (arg5 < class89.field1637) {
                arg5 = class89.field1637;
                var6 = false;
            } else if (class94.field1676 < arg5) {
                var6 = false;
                arg5 = class94.field1676;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class89.field1637 > arg3) {
                var7 = false;
                arg3 = class89.field1637;
            } else if (arg3 > class94.field1676) {
                var7 = false;
                arg3 = class94.field1676;
            } else {
                var7 = true;
            }
            if (class13.field215 > arg2) {
                arg2 = class13.field215;
            } else {
                class199.method1361(arg1, arg3, class62.field1241[arg2++], arg5, 81);
            }
            if (arg4 <= class34.field727) {
                class199.method1361(arg1, arg3, class62.field1241[arg4--], arg5, 54);
            } else {
                arg4 = class34.field727;
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg4; var8++) {
                    int[] var9 = class62.field1241[var8];
                    var9[arg5] = var9[arg3] = arg1;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg4; var11++) {
                    class62.field1241[var11][arg5] = arg1;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg4; var10++) {
                    class62.field1241[var10][arg3] = arg1;
                }
            }
        }
        field3130++;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static final void method1233(byte arg0) {
        field3128++;
        for (int var1 = 0; var1 < 100; var1++) {
            class166.field2941[var1] = true;
        }
        if (arg0 != 122) {
            method1230((Component) null, -109);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
    public final boolean method1234(int arg0) {
        int var2 = -91 % ((arg0 - 6) / 59);
        field3132++;
        return (this.field3134 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)Z")
    public final boolean method1235(int arg0) {
        int var2 = -121 % ((12 - arg0) / 45);
        field3125++;
        return (this.field3134 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)Z")
    public final boolean method1236(int arg0) {
        field3126++;
        if (arg0 != -1) {
            this.method1234(18);
        }
        return (this.field3134 & 0x8) != 0;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3133[var0] = class155.method1064(var0, (byte) -108);
        }
        field3136 = class33.method353("mem=", 118);
        field3140 = class33.method353("um", 21);
        field3138 = class33.method353(" <col=00ff80>", 17);
        field3139 = 0;
    }
}
