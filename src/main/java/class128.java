import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class128 extends class180 {

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field1813 = 0;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Lms;")
    public static class363 field1819 = null;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lcs;")
    public static class351 field1817 = new class351(80, 3);

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[Laq;")
    public static class385[] field1818;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIB)V", line = 3)
    public static final void method780(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1814++;
        if (arg4 <= 98) {
            method781(23, (class187) null, -32, (Canvas) null);
        }
        for (int var5 = 0; var5 < class417.field5736; var5++) {
            Rectangle var6 = class180.field2611[var5];
            if ((var6.x + var6.width) > arg1 && arg0 + arg1 > var6.x && arg2 < (var6.y + var6.height) && (arg2 + arg3) > var6.y) {
                class258.field3607[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILbc;ILjava/awt/Canvas;)Lkm;", line = 34)
    public static final class487 method781(int arg0, class187 arg1, int arg2, Canvas arg3) {
        if (arg2 < 103) {
            field1817 = null;
        }
        field1820++;
        return new class171(arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILfc;B)Lss;", line = 46)
    public static final class76 method782(int arg0, class343 arg1, byte arg2) {
        if (arg2 != -121) {
            method783((byte) 71);
        }
        field1816++;
        byte[] var3 = arg1.method2038((byte) -58, arg0);
        return var3 == null ? null : new class76(var3);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 63)
    public static void method783(byte arg0) {
        field1819 = null;
        if (arg0 >= 6) {
            field1817 = null;
            field1818 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 80)
    public class128() {
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V", line = 86)
    public class128(int arg0) {
        this.field1815 = arg0;
    }
}
