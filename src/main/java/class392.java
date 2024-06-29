import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class392 {

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field5548 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lem;")
    public static class206 field5546 = new class206(58, 1);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[I")
    public static int[] field5547;

    @OriginalMember(owner = "client!q", name = "wa", descriptor = "(III[I)V")
    public abstract void method690(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "na", descriptor = "(IIIIII)V")
    public abstract void method680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "(I)V")
    public abstract void method674(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method2294(int arg0) {
        if (arg0 != 58) {
            field5548 = 6;
        }
        field5547 = null;
        field5546 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class392 method681();

    @OriginalMember(owner = "client!q", name = "w", descriptor = "(I)V")
    public abstract void method684(int arg0);

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "([I)V")
    public abstract void method677(int[] arg0);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "(Lq;)V")
    public abstract void method675(class392 arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method682(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(III)V")
    public abstract void method689(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(I)V")
    public abstract void method686(int arg0);

    @OriginalMember(owner = "client!q", name = "U", descriptor = "(III)V")
    public abstract void method687(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(I)V")
    public abstract void method678(int arg0);

    @OriginalMember(owner = "client!q", name = "o", descriptor = "(I)V")
    public abstract void method685(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static final int method2295(int arg0, int arg1) {
        field5545++;
        if (arg0 != -1785779800) {
            field5547 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!q", name = "B", descriptor = "(III[I)V")
    public abstract void method676(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "AA", descriptor = "(I)V")
    public abstract void method673(int arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method679();
}
