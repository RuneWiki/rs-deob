import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class271 extends class103 {

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lda;")
    public class275 field4706;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field4710 = -1;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lma;")
    public static class105 field4707;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class271() {
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public static void method1783(int arg0) {
        field4707 = null;
        if (arg0 != 12683) {
            field4707 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lda;)V")
    public class271(class275 arg0) {
        this.field4706 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lda;B)V")
    public static final void method1784(class275 arg0, byte arg1) {
        field4708++;
        int var2 = class249.method1629(arg0, 0);
        if (var2 == -1) {
            return;
        }
        class163.field2840 = class215.field3655.field1068[var2] - class18.field255;
        class51.field842 = class106.field1841 + class5.field67 - class215.field3655.field1069[var2] - 1;
        int var3 = 69 % ((arg1 + 61) / 62);
        int var4 = class163.field2840 - (int) ((float) class191.field3279.field3885 / class153.field2683);
        int var5 = (int) ((float) class191.field3279.field3885 / class153.field2683) + class163.field2840;
        int var6 = class51.field842 - ((int) ((float) class191.field3279.field3980 / class153.field2683));
        int var7 = (int) ((float) class191.field3279.field3980 / class153.field2683) + class51.field842;
        if (var6 < 0) {
            class51.field842 = (int) ((float) class191.field3279.field3980 / class153.field2683);
        }
        if (var7 > class5.field67) {
            class51.field842 = class5.field67 - ((int) ((float) class191.field3279.field3980 / class153.field2683));
        }
        if (var4 < 0) {
            class163.field2840 = (int) ((float) class191.field3279.field3885 / class153.field2683);
        }
        if (var5 > class255.field4497) {
            class163.field2840 = class255.field4497 - ((int) ((float) class191.field3279.field3885 / class153.field2683));
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lda;B)[Lda;")
    public static final class275[] method1785(class275[] arg0, byte arg1) {
        field4711++;
        class275[] var2 = new class275[5];
        if (arg1 != 110) {
            method1784((class275) null, (byte) 96);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class197.method1291(new class275[] { class250.method1644(var3, (byte) -115), class203.field3458 }, -30025);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class197.method1291(new class275[] { var2[var3], arg0[var3] }, class261.method1705(arg1, -29991));
            }
        }
        return var2;
    }
}
