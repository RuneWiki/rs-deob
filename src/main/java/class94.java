import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class94 extends class155 {

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1581 = "Select";

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public int field1577;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V")
    public abstract void method719(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(Z)V")
    public static final void method720(boolean arg0) {
        class169.field2559.method1420((byte) 126);
        field1582++;
        if (arg0) {
            class159.field2480.method1420((byte) -109);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)V")
    public abstract void method721(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public abstract void method722(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(III)V")
    public static final void method724(int arg0, int arg1, int arg2) {
        if (arg0 > -32) {
            method725(-101);
        }
        int var3 = class99.field1688 * arg2 >> 8;
        if (arg1 == -1 && !class101.field1710) {
            class152.method1124((byte) 127);
        } else if (arg1 != -1 && (class48.field667 != arg1 || !class86.method638(true)) && var3 != 0 && !class101.field1710) {
            class141.method1056(var3, arg1, false, -32768, class300.field4850, 0, 2);
        }
        class48.field667 = arg1;
        field1578++;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public static final void method725(int arg0) {
        field1584++;
        if (class255.field3851) {
            return;
        }
        class180.field2709 = true;
        if (arg0 != 21988) {
            field1581 = null;
        }
        class255.field3851 = true;
        if (class299.field4829) {
            class180.field2705 = (float) ((int) class180.field2705 - 17 & 0xFFFFFFF0);
        } else {
            class270.field4376 += (-12.0F - class270.field4376) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public abstract void method726(int arg0, int arg1);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method727(boolean arg0, int arg1) {
        if (arg0) {
            method720(false);
        }
        field1583++;
        return arg1 < 999999999 ? Integer.toString(arg1) : "*";
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static void method728(byte arg0) {
        if (arg0 >= -15) {
            method725(-2);
        }
        field1581 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
    public abstract void method729(int arg0, int arg1);

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIII)V")
    public final void method730(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field1580 << 3;
        int var7 = 21 / ((64 - arg0) / 60);
        int var8 = this.field1587 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        int var10 = (arg4 << 4) + (var6 & 0xF);
        this.method723(var6, var8, var10, var9, arg2, arg3);
        field1575++;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)V")
    public abstract void method731(int arg0, int arg1);
}
