import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class413 extends class559 {

    @OriginalMember(owner = "client!ifa", name = "A", descriptor = "I")
    private int field5858 = -1;

    @OriginalMember(owner = "client!ifa", name = "C", descriptor = "I")
    private int field5859 = -1;

    @OriginalMember(owner = "client!ifa", name = "y", descriptor = "I")
    public int field5856;

    @OriginalMember(owner = "client!ifa", name = "F", descriptor = "I")
    public static int field5862 = 0;

    @OriginalMember(owner = "client!ifa", name = "x", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ifa", name = "G", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!ifa", name = "E", descriptor = "Luu;")
    public static class237 field5861;

    @OriginalMember(owner = "client!ifa", name = "D", descriptor = "[Loia;")
    public static class52[] field5860;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BIILuv;)V")
    public static final void method2576(byte arg0, int arg1, int arg2, class755 arg3) {
        if (class160.field2235) {
            class648 var4 = ~class41.field505 == 0 ? null : class360.field5161.method2279(-92, class41.field505);
            if (client.method2738(arg3).method1836((byte) 127) && (32 & class623.field8403) != 0 && (var4 == null || arg3.method4185(var4.field8689, class41.field505, true) != var4.field8689)) {
                ++class235.field3481;
                class300.method1979(true, class721.field10028, false, arg3.field10441, class468.field6500 + " -> " + arg3.field10448, (long) (arg3.field10469 << 0 | arg3.field10445), (byte) 115, false, arg3.field10445, 0L, arg3.field10469, 5, class488.field6817);
            }
        }
        ++field5855;
        for (int var5 = 9; ~var5 <= -6; --var5) {
            String var10 = class674.method3807(42, arg3, var5);
            if (var10 != null) {
                class300.method1979(true, class529.method3146((byte) -101, var5, arg3), false, arg3.field10441, arg3.field10448, (long) (arg3.field10445 | arg3.field10469 << 0), (byte) 115, false, arg3.field10445, (long) (var5 - -1), arg3.field10469, 1002, var10);
                ++class175.field2404;
            }
        }
        String var6 = class758.method4207(arg3, false);
        if (var6 != null) {
            ++class162.field2240;
            class300.method1979(true, arg3.field10438, false, arg3.field10441, arg3.field10448, (long) (arg3.field10469 << 0 | arg3.field10445), (byte) 115, false, arg3.field10445, 0L, arg3.field10469, 21, var6);
        }
        int var7 = 91 % ((arg0 - -20) / 41);
        for (int var8 = 4; var8 >= 0; --var8) {
            String var9 = class674.method3807(42, arg3, var8);
            if (var9 != null) {
                ++class175.field2404;
                class300.method1979(true, class529.method3146((byte) -51, var8, arg3), false, arg3.field10441, arg3.field10448, (long) (arg3.field10445 | arg3.field10469 << 0), (byte) 115, false, arg3.field10445, (long) (var8 + 1), arg3.field10469, 44, var9);
            }
        }
        if (client.method2738(arg3).method1844(1000)) {
            ++class589.field8024;
            if (arg3.field10398 != null) {
                class300.method1979(true, -1, false, arg3.field10441, "", (long) (arg3.field10469 << 0 | arg3.field10445), (byte) 115, false, arg3.field10445, 0L, arg3.field10469, 2, arg3.field10398);
            } else {
                class300.method1979(true, -1, false, arg3.field10441, "", (long) (arg3.field10469 << 0 | arg3.field10445), (byte) 115, false, arg3.field10445, 0L, arg3.field10469, 2, class155.field2128.method978(class120.field1576, (byte) -121));
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
    public final void method2235(int arg0) {
        ++field5863;
        OpenGL.glFramebufferTexture2DEXT(this.field5859, this.field5858, 3553, 0, arg0);
        this.field5858 = -1;
        this.field5859 = -1;
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Ldw;II)V")
    public class413(class664 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field5856 = arg2;
        super.field7765.method3681(this, 0);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field7777, arg2, arg2, 0, class434.method2679(true, super.field7777), 5121, (byte[]) null, 0);
        }
        this.method3292(3, true);
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Ldw;IIZ[[BI)V")
    public class413(class664 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5856 = arg2;
        super.field7765.method3681(this, 0);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field7777, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3292(3, true);
    }

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "(I)V")
    public static void method2577(int arg0) {
        field5861 = null;
        field5860 = null;
        if (arg0 != 9) {
            field5860 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IBIII)V")
    public final void method2578(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg4, arg2, arg3, super.field7785, arg0);
        ++field5857;
        this.field5858 = arg2;
        int var6 = -70 % ((arg1 - -10) / 42);
        this.field5859 = arg4;
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Ldw;IIZ[[I)V")
    public class413(class664 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5856 = arg2;
        super.field7765.method3681(this, 0);
        if (arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                class251.method1715(98, 32993, super.field7765.field9086, 34069 - -var6, arg2, super.field7777, arg2, arg4[var6]);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field7777, arg2, arg2, 0, 32993, super.field7765.field9086, arg4[var7], 0);
            }
        }
        this.method3292(3, true);
    }
}
