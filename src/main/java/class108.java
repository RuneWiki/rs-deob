import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class108 {

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lud;")
    public static class279 field2003 = class130.method1024("M", 255);

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field2002 = 100;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lud;")
    public static class279 field2005 = class130.method1024("Okay", 255);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lok;ILok;)V", line = 4)
    public static final void method892(class149 arg0, int arg1, class149 arg2) {
        field2001++;
        class109.field2015 = class122.method963(0, (byte) 105, class191.field3432, arg2, arg0);
        if (class97.field1824) {
            class257.field4574 = class224.method1644(arg0, 0, class191.field3432, 36, arg2);
        } else {
            class257.field4574 = (class6) class109.field2015;
        }
        class133.field2428 = class122.method963(arg1, (byte) 105, class177.field3182, arg2, arg0);
        class292.field5210 = class122.method963(0, (byte) 105, class278.field4917, arg2, arg0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Lsf;", line = 20)
    public class108 method893(int arg0, int arg1, int arg2) {
        field2004++;
        return this;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;IIIZ)V", line = 29)
    public void method894(class108 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1997++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()Z", line = 51)
    public boolean method895() {
        field1999++;
        return false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V", line = 73)
    public static final void method896(int arg0, boolean arg1) {
        class182.field3351 = new int[arg0];
        class142.field2582 = new int[arg0];
        if (!arg1) {
            method897(-90, (byte) 109);
        }
        class75.field1474 = new int[arg0];
        class323.field5648 = new int[arg0];
        class73.field1441 = new int[arg0];
        field1998++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V", line = 97)
    public static final void method897(int arg0, byte arg1) {
        class73.field1437.method1339(arg0, 19326);
        field2000++;
        if (arg1 != -102) {
            field2005 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 108)
    public static void method898(boolean arg0) {
        field2003 = null;
        if (!arg0) {
            field2002 = -28;
        }
        field2005 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIIJILlb;)V")
    public abstract void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class208 arg10);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
    public abstract void method179(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()I")
    public abstract int method184();
}
