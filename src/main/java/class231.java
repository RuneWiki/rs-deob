import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class231 {

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "B")
    public byte field3111;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "J")
    public static long field3108 = -1L;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Lwq;")
    public class113 field3105;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Luo;")
    public class404 field3102;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Lil;")
    public class7 field3101;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Ldi;")
    public class82 field3103;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V", line = 12)
    public static final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3099++;
        int var7 = class99.method710(arg6, (byte) -29, class300.field3971, class353.field4777);
        int var8 = class99.method710(arg4, (byte) -29, class300.field3971, class353.field4777);
        int var9 = class99.method710(arg2, (byte) -29, class71.field1077, class308.field4055);
        int var10 = class99.method710(arg5, (byte) -29, class71.field1077, class308.field4055);
        int var11 = class99.method710(arg3 + arg6, (byte) -29, class300.field3971, class353.field4777);
        int var12 = class99.method710(arg4 - arg3, (byte) -29, class300.field3971, class353.field4777);
        for (int var13 = var7; var13 < var11; var13++) {
            class427.method2465(class457.field6299[var13], var10, var9, arg0 - 7, arg1);
        }
        if (arg0 != 0) {
            method1442(31, -45, 115, 10, -79, 28, -69);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class427.method2465(class457.field6299[var14], var10, var9, -7, arg1);
        }
        int var15 = class99.method710(arg2 + arg3, (byte) -29, class71.field1077, class308.field4055);
        int var16 = class99.method710(arg5 - arg3, (byte) -29, class71.field1077, class308.field4055);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class457.field6299[var17];
            class427.method2465(var18, var15, var9, -7, arg1);
            class427.method2465(var18, var10, var16, arg0 ^ 0xFFFFFFF9, arg1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(BIIIII)V", line = 76)
    public class231(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3107 = arg2;
        this.field3098 = arg1;
        this.field3110 = arg4;
        this.field3104 = arg3;
        this.field3106 = arg5;
        this.field3111 = arg0;
    }
}
