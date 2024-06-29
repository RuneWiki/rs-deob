import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class273 extends class15 {

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "Lce;")
    public static class126 field4594 = class206.method1445(-7923, " ");

    @OriginalMember(owner = "client!jk", name = "ab", descriptor = "Lce;")
    public static class126 field4605 = class206.method1445(-7923, "(U2");

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public int field4597;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
    public int field4600;

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "Lcc;")
    public static class313 field4589;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "Lcc;")
    public static class313 field4591;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "Lcc;")
    public static class313 field4598;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "[[[B")
    public static byte[][][] field4599;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(II)Z", line = 13)
    public static final boolean method1827(int arg0, int arg1) {
        field4592++;
        if (arg1 != -9275) {
            method1832(44L, 92);
        }
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)Z", line = 28)
    public static final boolean method1828(int arg0, int arg1, byte arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg2 != -104) {
            field4589 = (class313) null;
        }
        field4588++;
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class265 var3 = class185.method1338(arg0, arg2 - 7049);
        return var3.method1783(arg1, -126);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V", line = 52)
    public static void method1829(int arg0) {
        field4591 = null;
        if (arg0 != 11) {
            field4605 = (class126) null;
        }
        field4598 = null;
        field4605 = null;
        field4599 = (byte[][][]) null;
        field4589 = null;
        field4594 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V", line = 76)
    public final void method1830(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field4600 << 3;
        int var7 = this.field4597 << 3;
        int var8 = (arg2 << 4) + (var7 & 0xF);
        int var9 = (arg4 << 4) + (var6 & 0xF);
        field4596++;
        this.method1321(var6, var7, var9, var8, arg3, arg0);
        if (arg1 != 875013576) {
            field4591 = (class313) null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V", line = 96)
    public static final void method1831(int arg0) {
        if (arg0 < 1) {
            field4591 = (class313) null;
        }
        field4604++;
        class76.field1223.method1185(1);
        class81.field1305.method1185(1);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(JI)Lce;", line = 125)
    public static final class126 method1832(long arg0, int arg1) {
        class298.field4958.setTime(new Date(arg0));
        field4603++;
        int var3 = class298.field4958.get(7);
        if (arg1 != 10) {
            field4602 = -103;
        }
        int var4 = class298.field4958.get(5);
        int var5 = class298.field4958.get(2);
        int var6 = class298.field4958.get(1);
        int var7 = class298.field4958.get(11);
        int var8 = class298.field4958.get(12);
        int var9 = class298.field4958.get(13);
        return class12.method69(new class126[] { class90.field1414[var3 - 1], class29.field400, class195.method1386((byte) 20, var4 / 10), class195.method1386((byte) 20, var4 % 10), class227.field3838, class127.field2193[var5], class227.field3838, class195.method1386((byte) 20, var6), class266.field4515, class195.method1386((byte) 20, var7 / 10), class195.method1386((byte) 20, var7 % 10), class229.field3863, class195.method1386((byte) 20, var8 / 10), class195.method1386((byte) 20, var8 % 10), class229.field3863, class195.method1386((byte) 20, var9 / 10), class195.method1386((byte) 20, var9 % 10), class264.field4406 }, (byte) 118);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(II)V")
    public abstract void method1333(int arg0, int arg1);

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(II)V")
    public abstract void method1313(int arg0, int arg1);

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(IIIII)V")
    public abstract void method1316(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)V")
    public abstract void method1331(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(III)V")
    public abstract void method1318(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(II)V")
    public abstract void method1332(int arg0, int arg1);
}
