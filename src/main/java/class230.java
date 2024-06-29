import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class230 implements class547 {

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Lrc;")
    public class29 field2873;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public int field2867;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Ljava/lang/String;")
    public String field2870;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public int field2875;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "Lct;")
    public class414 field2881;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "Lpu;")
    public static class236 field2869 = new class236(0, 0);

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "Lwp;")
    public static class453 field2882 = new class453(101, 16);

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V", line = 14)
    public static final void method1388(int arg0) {
        field2874++;
        if (arg0 != -1) {
            method1388(50);
        }
        int var1 = class596.field8384;
        int[] var2 = class354.field4521;
        for (int var3 = 0; var3 < var1; var3++) {
            class514 var9 = class351.field4490[var2[var3]];
            if (var9 != null && var9.field9655 > 0) {
                var9.field9655--;
                if (var9.field9655 == 0) {
                    var9.field9667 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class470.field5974; var4++) {
            long var5 = (long) class153.field1958[var4];
            class206 var7 = (class206) class180.field2318.method399(-32748, var5);
            if (var7 != null) {
                class307 var8 = var7.field2618;
                if (var8.field9655 > 0) {
                    var8.field9655--;
                    if (var8.field9655 == 0) {
                        var8.field9667 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V", line = 74)
    public static void method1389(int arg0) {
        field2869 = null;
        field2882 = null;
        if (arg0 != -1) {
            method1388(27);
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Ljava/lang/String;Lct;Lrc;IIIIIIIIII)V", line = 93)
    public class230(String arg0, class414 arg1, class29 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field2871 = arg5;
        this.field2873 = arg2;
        this.field2876 = arg12;
        this.field2872 = arg8;
        this.field2880 = arg3;
        this.field2867 = arg10;
        this.field2879 = arg9;
        this.field2870 = arg0;
        this.field2875 = arg4;
        this.field2881 = arg1;
        this.field2868 = arg11;
        this.field2877 = arg6;
        this.field2866 = arg7;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)Lwea;", line = 113)
    public final class259 method235(int arg0) {
        if (arg0 < 38) {
            this.field2867 = -123;
        }
        field2878++;
        return class162.field2133;
    }
}
