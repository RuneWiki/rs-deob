import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class259 extends class393 {

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public int field3776;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Ljava/lang/String;")
    public String field3780;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "J")
    public long field3772;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public int field3779;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Ljava/lang/String;")
    public String field3775;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIILhl;)V")
    public static final void method1627(int arg0, int arg1, int arg2, int arg3, class60 arg4) {
        arg4.field870 = (arg1 << 7) + 64;
        arg4.field869 = arg3;
        arg4.field871 = (arg2 << 7) + 64;
        class10 var5 = class343.field5032[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class39 var7 = var5.field109; var7 != null; var7 = var7.field627) {
                if (var7.field621.field5300) {
                    int var8 = var7.field621.method194(-82);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field869 += var6;
                arg4.field873 = true;
            }
        }
        if (class343.field5032[arg0][arg1][arg2] == null) {
            class433.method2749(arg0, arg1, arg2);
        }
        class343.field5032[arg0][arg1][arg2].field121 = arg4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1628(int arg0, String arg1) {
        field3774++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 68 / ((arg0 + 64) / 61);
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = ((var3 << 5) + arg1.charAt(var5)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
    public static final void method1629(byte arg0) {
        field3773++;
        class42.method318();
        if (arg0 != -56) {
            method1628(-57, (String) null);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class119.field1605[var1].method932((byte) -107);
        }
        class122.method842((byte) 50);
        class215.method1350(8110);
        System.gc();
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
    public class259(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field3776 = arg6;
        this.field3777 = arg3;
        this.field3780 = arg1;
        this.field3772 = arg4;
        this.field3771 = arg2;
        this.field3779 = arg5;
        this.field3775 = arg0;
    }
}
